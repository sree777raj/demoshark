package com.fdx.service.transfer;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fdx.api.entities.moneymovement.PaymentStatus;
import com.fdx.api.entities.moneymovement.Transfer;
import com.fdx.api.entities.moneymovement.TransferStatus;
import com.fdx.api.model51.modelimpl.Accounts;
import com.fdx.api.model51.modelimpl.DepositAccount;
import com.fdx.api.model51.modelimpl.InvestmentAccount;
import com.fdx.api.model51.modelimpl.LocAccount;
import com.fdx.api.repositories.moneymovement.PaymentDetailsRepository;
import com.fdx.api.repositories.moneymovement.TransferRepository;
import com.fdx.api.repositories.moneymovement.TransferStatusRepository;
import com.fdx.common.exception.FDXException;
import com.fdx.common.util.FdxConstants;
import com.fdx.common.util.FdxUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class TransferService {

  private static final Logger LOGGER = LoggerFactory.getLogger(TransferService.class);

  private final TransferRepository transferRepository;

  private final PaymentDetailsRepository paymentDetailsRepository;

  private final TransferStatusRepository transferStatusRepository;

  public TransferService(TransferRepository transferRepository, PaymentDetailsRepository paymentDetailsRepository, TransferStatusRepository transferStatusRepository) {
    this.transferRepository = transferRepository;
    this.paymentDetailsRepository = paymentDetailsRepository;
    this.transferStatusRepository = transferStatusRepository;
  }

  /**
   * POST /transfers : Request account transfer Create a transfer between accounts
   *
   * @param transferRequest Data of the transfer request (optional)
   * @return Initial status of the requested transfer
   */
  public String postTransfer(Object transferRequest) throws FDXException {
    ObjectMapper mapper = FdxUtil.getObjectMapper();
    Transfer transfer = mapper.convertValue(transferRequest, new TypeReference<>() {
    });
    validateTransfer(transfer);
    paymentDetailsRepository.save(transfer.getPaymentDetails());
    transfer.setReferenceId("reference_" + transfer.getTransferId());
    transfer.setStatus(PaymentStatus.PROCESSED);
    transfer.setTransferTime(LocalDate.now());
    transfer = transferRepository.save(transfer);
    TransferStatus transferStatus = new TransferStatus();
    transferStatus.setTransferId(transfer.getTransferId());
    transferStatus.setReferenceId(transfer.getReferenceId());
    transferStatus.setStatus(transfer.getStatus());
    transferStatus.setTransferDate(transfer.getTransferTime());
    transferStatusRepository.save(transferStatus);
    return getTransfer(transfer.getTransferId());
  }

  private void validateTransfer(Transfer transfer) throws FDXException {
    if (transferRepository.existsById(transfer.getTransferId())) {
      throw new FDXException("Transfer Id already exist", 908);
    }
    Accounts accounts = new Accounts(); //TODO convert to jpa
    String accountsType;
    try {
      accountsType = accounts.getAccountsType(transfer.getToAccountId());
    } catch (FDXException e) {
      throw new FDXException("Destination account not found", 904);
    }
    if (!(accountsType.equalsIgnoreCase(FdxConstants.LOC_ACCOUNT) || accountsType.equalsIgnoreCase("DepositAccount")
        || accountsType.equalsIgnoreCase(FdxConstants.INVESTMENT_ACCOUNT))) {
      throw new FDXException(906);
    }
    try {
      accountsType = accounts.getAccountsType(transfer.getFromAccountId());
    } catch (FDXException e) {
      throw new FDXException("Source account not found", 901);
    }
    if (!(accountsType.equalsIgnoreCase(FdxConstants.LOC_ACCOUNT) || accountsType.equalsIgnoreCase("DepositAccount")
        || accountsType.equalsIgnoreCase(FdxConstants.INVESTMENT_ACCOUNT))) {
      throw new FDXException(903);
    }
    // Amount Validation
    if (transfer.getAmount().intValue() < 0)
      throw new FDXException("Invalid amount", 907);
    // Validate FromAccount Funds
    checkAccountBalance(transfer.getAmount(), accountsType, transfer.getFromAccountId());
  }

  private void checkAccountBalance(BigDecimal amount, String accountType, String accountId) throws FDXException {
    try {
      if (accountType.equalsIgnoreCase("depositAccount")) {
        DepositAccount depositAccount = new DepositAccount();
        depositAccount = depositAccount.getDepositAccount(accountId, null, null);
        if (depositAccount.getCurrentBalance() == null || amount.compareTo(depositAccount.getCurrentBalance()) == 1)
          throw new FDXException(FdxConstants.INSUFFICIENT_FUND, 910);
      }
      if (accountType.equalsIgnoreCase(FdxConstants.LOC_ACCOUNT)) {
        LocAccount locAccount = new LocAccount();
        locAccount = locAccount.getLocAmount(accountId, null, null);
        if (locAccount.getCurrentBalance() == null || amount.compareTo(locAccount.getCurrentBalance()) == 1)
          throw new FDXException(FdxConstants.INSUFFICIENT_FUND, 910);
      }
      if (accountType.equalsIgnoreCase(FdxConstants.INVESTMENT_ACCOUNT)) {
        InvestmentAccount investmentAccount = new InvestmentAccount();
        investmentAccount = investmentAccount.getInvestmentAccount(accountId, null, null);
        if (investmentAccount.getAvailableCashBalance() == null || amount.compareTo(investmentAccount.getAvailableCashBalance()) == 1)
          throw new FDXException(FdxConstants.INSUFFICIENT_FUND, 910);
      }
    } catch (FDXException fdxException) {
      throw fdxException;
    } catch (Exception e) {
      LOGGER.error("ProcessPayment : ", e);
      throw new FDXException(e, FdxConstants.HTTP_ERROR_CODE_500);
    }
  }

  /**
   * GET /transfers/{transferId}/status : Get transfer status Get status of
   * transfer between accounts
   *
   * @param transferId Transfer identifier (required)
   * @return Current status of the requested transfer
   */
  public String getTransferStatusDetails(String transferId) throws FDXException {
    return FdxUtil.getSerializedObject(transferStatusRepository.findById(transferId));
  }

  /**
   * GET /transfers/{transferId} : Get a transfer
   * Get a transfer been accounts
   *
   * @param transferId Transfer identifier (required)
   * @return Transfer
   */
  public String getTransfer(String transferId) throws FDXException {
    return FdxUtil.getSerializedObject(transferRepository.findById(transferId));
  }

  /**
   * DELETE /transfers/{transferId} : Cancel transfer
   * Cancel a transfer between accounts
   *
   * @param transferId Transfer identifier (required)
   * @return Transfer
   */
  public String cancelTransfer(String transferId) throws FDXException {
    Optional<TransferStatus> transferStatus = transferStatusRepository.findById(transferId);
    if (transferStatus.isPresent()) {
      transferStatus.get().setStatus(PaymentStatus.CANCELLED);
      transferStatusRepository.save(transferStatus.get());
    }
    Optional<Transfer> transfer = transferRepository.findById(transferId);
    if (transfer.isPresent()) {
      transfer.get().setStatus(PaymentStatus.CANCELLED);
      return FdxUtil.getSerializedObject(transferRepository.save(transfer.get()));
    } else {
      throw new FDXException(950);
    }
  }

  /**
   * GET /transfers : Search for transfers between accounts
   * Search for transfers
   *
   * @param updatedSince            Return items that have been created or updated since the update id (optional)
   * @param searchStartTransferDate Start time for use in retrieval of transfers by transfer date (optional)
   * @param searchEndTransferDate   End time for use in retrieval of transfers by transfer date (optional)
   * @param searchFromAccountIds    Search for transfers by source account (optional)
   * @param searchToAccountIds      Search for transfers by source account (optional)
   * @param searchStatuses          Search for transfers by source account (optional)
   * @param searchTransferIds       Search for transfers by id (optional)
   * @return Success (status code 200)
   * or Start or end date value is not in the ISO 8601 format (status code 400)
   * or Data not found for request parameters (status code 404)
   * or Catch all exception where request was not processed due to an internal outage/issue. Consider other more specific errors before using this error (status code 500)
   * or Error when FdxVersion in Header is not one of those implemented at backend (status code 501)
   * or System is down for maintenance (status code 503)
   */
  public String searchForTransfers(String updatedSince, LocalDate searchStartTransferDate,
                                   LocalDate searchEndTransferDate, List<String> searchFromAccountIds,
                                   List<String> searchToAccountIds, List<PaymentStatus> searchStatuses,
                                   List<String> searchTransferIds) throws FDXException {
    List<Transfer> transfers = transferRepository.findTransfersBy(updatedSince, searchStartTransferDate,
        searchEndTransferDate, searchFromAccountIds, searchToAccountIds, searchStatuses, searchTransferIds);
    if (transfers.isEmpty()) {
      throw new FDXException(1107);
    }
    return FdxUtil.getSerializedObject(transfers);
  }
}
