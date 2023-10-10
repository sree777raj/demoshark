package com.fdx.process46;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fdx.api.model46.model.Payment46;
import com.fdx.api.model46.model.PaymentForUpdate46;
import com.fdx.api.model46.model.RecurringPaymentForUpdate46;
import com.fdx.api.model46.model.TransferStatus46;
import com.fdx.api.model46.modelimpl.Accounts;
import com.fdx.api.model46.modelimpl.DebitCreditMemo;
import com.fdx.api.model46.modelimpl.DepositAccount;
import com.fdx.api.model46.modelimpl.DepositTransaction;
import com.fdx.api.model46.modelimpl.DepositTransactionType;
import com.fdx.api.model46.modelimpl.InvestmentAccount;
import com.fdx.api.model46.modelimpl.InvestmentTransaction;
import com.fdx.api.model46.modelimpl.InvestmentTransactionType;
import com.fdx.api.model46.modelimpl.LocAccount;
import com.fdx.api.model46.modelimpl.LocTransaction;
import com.fdx.api.model46.modelimpl.LocTransactionType;
import com.fdx.api.model46.modelimpl.Payee;
import com.fdx.api.model46.modelimpl.Payment;
import com.fdx.api.model46.modelimpl.PaymentForUpdate;
import com.fdx.api.model46.modelimpl.RecurringPayment;
import com.fdx.api.model46.modelimpl.RecurringPaymentDuration;
import com.fdx.api.model46.modelimpl.Transaction;
import com.fdx.api.model46.modelimpl.TransactionReason;
import com.fdx.api.model46.modelimpl.TransactionStatus;
import com.fdx.api.model46.modelimpl.Transactions;
import com.fdx.api.model46.modelimpl.Transfer;
import com.fdx.api.model46.modelimpl.TransferStatus;
import com.fdx.common.exception.FDXException;
import com.fdx.common.util.FdxUtil;
import org.apache.commons.lang.time.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class MoneyMovementProcess {

	private static final Logger log = LoggerFactory.getLogger(MoneyMovementProcess.class);

	public Payment46 processPayments(Payment46 payment) throws FDXException {
		Date currentDate = new java.util.Date();
		Payment paymentRepository = new Payment();
		try {
			Date dueDate = payment.getPaymentForUpdate().getDueDate();
			boolean sameDay = DateUtils.isSameDay(dueDate, currentDate);
			if (sameDay) {
				paymentRepository.updatePaymentStatusProcessing(payment.getPaymentId());
				// TODO get from accounts repository
				Accounts accounts = new Accounts();
				String accountType = accounts.getAccountsType(payment.getPaymentForUpdate().getFromAccountId());
					checkAccountBalance(payment.getPaymentForUpdate().getAmount(), accountType, payment.getPaymentForUpdate().getFromAccountId());
					createTransaction(payment.getPaymentForUpdate().getFromAccountId(),
							payment.getPaymentForUpdate().getAmount(), accountType, DebitCreditMemo.DEBIT,
							payment.getPaymentId(), null, "Payment");
				paymentRepository.updatePaymentStatusProcessed(payment.getPaymentId());
			}
			return (Payment46) payment.getPaymentById(payment.getPaymentId());
		} catch (FDXException fdxException) {
			paymentRepository.updatePaymentStatusFailed(payment.getPaymentId());
			throw fdxException;
		} catch (Exception e) {
			log.error("ProcessPayment : ", e);
			paymentRepository.updatePaymentStatusFailed(payment.getPaymentId());
			throw new FDXException(e, 500);
		}
	}

	// TODO move to proper class :)
	public void validateInputData(Transfer transfer) throws FDXException {
		try {
			if (transfer.checkTransferIdIfExists(transfer.getTransferId())) {
				throw new FDXException("Transfer Id already exist", 908);
			}
			Accounts accounts = new Accounts(); //TODO repository?
			String accountsType;
			try {
				accountsType = accounts.getAccountsType(transfer.getToAccountId());
			} catch (FDXException e) {
				throw new FDXException("Destination account not found", 904);
			}
			if (!(accountsType.equalsIgnoreCase("LocAccount") || accountsType.equalsIgnoreCase("DepositAccount")
					|| accountsType.equalsIgnoreCase("InvestmentAccount"))) {
				throw new FDXException(906);
			}
			try {
				accountsType = accounts.getAccountsType(transfer.getFromAccountId());
			} catch (FDXException e) {
				throw new FDXException("Source account not found", 901);
			}
			if (!(accountsType.equalsIgnoreCase("LocAccount") || accountsType.equalsIgnoreCase("DepositAccount")
					|| accountsType.equalsIgnoreCase("InvestmentAccount"))) {
				throw new FDXException(903);
			}
			// Amount Validation
			if (transfer.getAmount().intValue() < 0)
				throw new FDXException("Invalid amount", 907);

			// Validate FromAccount Funds
			checkAccountBalance(transfer.getAmount(), accountsType, transfer.getFromAccountId());
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Transfer : ", e);
			throw new FDXException(e, 500);
		}
	}

	//TODO move to proper class :)
	public void checkAccountBalance(BigDecimal amount, String accountType, String accountId) throws FDXException {
		try {
			if (accountType.equalsIgnoreCase("depositAccount")) {
				DepositAccount depositAccount = new DepositAccount();
				depositAccount = depositAccount.getDepositAccount(accountId, null, null);
				if (depositAccount.getCurrentBalance() == null || amount.compareTo(depositAccount.getCurrentBalance()) == 1)
					throw new FDXException("Insufficient funds", 910);
			}
			if (accountType.equalsIgnoreCase("LocAccount")) {
				LocAccount locAccount = new LocAccount();
				locAccount = locAccount.getLocAmount(accountId, null, null);
				if (locAccount.getCurrentBalance() == null || amount.compareTo(locAccount.getCurrentBalance()) == 1)
					throw new FDXException("Insufficient funds", 910);
			}
			if (accountType.equalsIgnoreCase("InvestmentAccount")) {
				InvestmentAccount investmentAccount = new InvestmentAccount();
				investmentAccount = investmentAccount.getInvestmentAccount(accountId, null, null);
				if (investmentAccount.getAvailableCashBalance() == null || amount.compareTo(investmentAccount.getAvailableCashBalance()) == 1)
					throw new FDXException("Insufficient funds", 910);
			}
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("ProcessPayment : ", e);
			throw new FDXException(e, 500);
		}
	}

	private LocTransactionType getLocTransactionType(DebitCreditMemo debitCreditMemo, String processType) {
		if (processType.equalsIgnoreCase("transfer")) {
			if (DebitCreditMemo.DEBIT == debitCreditMemo)
				return LocTransactionType.WITHDRAWAL;
			else
				return LocTransactionType.PAYMENT;
		} else {
			return LocTransactionType.WITHDRAWAL;
		}
	}

	private InvestmentTransactionType getInvestmentTransactionType(String processType) {
		if (processType.equalsIgnoreCase("transfer")) {
			return InvestmentTransactionType.TRANSFER;
		} else {
			return InvestmentTransactionType.PAYMENT;
		}
	}

	private DepositTransactionType getDepositTransactionType(DebitCreditMemo debitCreditMemo, String processType) {
		if (processType.equalsIgnoreCase("transfer")) {
			if (DebitCreditMemo.DEBIT == debitCreditMemo)
				return DepositTransactionType.WITHDRAWAL;
			else
				return DepositTransactionType.TRANSFER;
		} else {
			return DepositTransactionType.BILLPAYMENT;
		}
	}

	private void createTransaction(String accountId, BigDecimal amount, String accountType, DebitCreditMemo debitCreditMemo,
																 String paymentId, String memo, String processType) throws FDXException {
		try {
			java.sql.Timestamp currentDate = new java.sql.Timestamp(System.currentTimeMillis());
			Transaction transaction = new Transaction();
			Transactions transactions = new Transactions();
			transaction.setAccountId(accountId);
			transaction.setTransactionId(paymentId+"-"+System.currentTimeMillis()); // combination will be unique always
			transaction.setAmount(amount);
			transaction.setDebitCreditMemo(debitCreditMemo);
			transaction.setDescription("Transaction created by Money Movement Process, " + paymentId);
			transaction.setTransactionTimestamp(currentDate);
			transaction.setPostedTimestamp(currentDate);
			transaction.setStatus(TransactionStatus.POSTED);
			if (memo != null) {
				transaction.setMemo(memo);
			}
			Map<String, Object> keys = null;
			transaction.postTransaction();
			if (accountType.equalsIgnoreCase("depositAccount")) {
				DepositTransaction depositTransaction = new DepositTransaction();
				depositTransaction.setTransactionType(getDepositTransactionType(debitCreditMemo, processType));
				//depositTransaction.setPayee(accountId); // TODO pass the payee id from paymentforupdate, getmarchantforupdate and get payee name
				keys = depositTransaction.postDepositTransaction(accountId, transaction.getTransactionId());
				String deposittransactionsid = keys.get("deposittransactionsid").toString();
				// TODO need to clean up transactionsequenceid from transactions table
				transactions.addTransactions(accountId, transaction.getTransactionId(), deposittransactionsid, "deposittransaction");
				DepositAccount depositAccount = new DepositAccount(); //TODO in all new add repository
				depositAccount = depositAccount.getDepositAccount(accountId);
				depositAccount.setBalanceAsOf(currentDate);
				if (debitCreditMemo == DebitCreditMemo.DEBIT) {
					depositAccount.setCurrentBalance(depositAccount.getCurrentBalance().subtract(amount));
					depositAccount.setAvailableBalance(depositAccount.getAvailableBalance().subtract(amount));
				} else if (debitCreditMemo == DebitCreditMemo.CREDIT) {
					depositAccount.setCurrentBalance(depositAccount.getCurrentBalance().add(amount));
					depositAccount.setAvailableBalance(depositAccount.getAvailableBalance().add(amount));
				}
				List<Integer> transactionIdList = depositAccount.getDepositTransactionId();
				transactionIdList.add(Integer.parseInt(deposittransactionsid));
				depositAccount.setDepositTransactionId(transactionIdList);
				depositAccount.updateDepositAccount(accountId);
			}
			if (accountType.equalsIgnoreCase("locAccount")) {
				LocTransaction locTransaction = new LocTransaction();
				locTransaction.setTransactionType(getLocTransactionType(debitCreditMemo, processType));
				locTransaction.setTransaction(transaction);
				keys = locTransaction.postLocTransaction(accountId, transaction.getTransactionId());
				String loctransactionId = keys.get("loctransactionId").toString();
				transactions.addTransactions(accountId, transaction.getTransactionId(), loctransactionId,"loctransaction");
				LocAccount locAccount = new LocAccount();
				locAccount = locAccount.getLocAccount(accountId);
				locAccount.setBalanceAsOf(currentDate);
				List<Integer> transactionIdList = locAccount.getLocTransactionId();
				transactionIdList.add(Integer.parseInt(loctransactionId));
				locAccount.setLocTransactionId(transactionIdList);
				if (debitCreditMemo == DebitCreditMemo.DEBIT) {
					locAccount.setCurrentBalance(locAccount.getCurrentBalance().subtract(amount));
					locAccount.setAvailableCash(locAccount.getAvailableCash().subtract(amount));
				} else if (debitCreditMemo == DebitCreditMemo.CREDIT) {
					locAccount.setCurrentBalance(locAccount.getCurrentBalance().add(amount));
					locAccount.setAvailableCash(locAccount.getAvailableCash().add(amount));
				}
				locAccount.postLocAccount(accountId);
			}
			if (accountType.equalsIgnoreCase("InvestmentAccount")) {
				InvestmentTransaction investmentTransaction = new InvestmentTransaction();
				investmentTransaction.setTransactionType(getInvestmentTransactionType(processType));
				investmentTransaction.setTransactionReason(TransactionReason.MATURITY);
				investmentTransaction.setTransferAction(InvestmentTransaction.TransferActionEnum.OUT);
				keys = investmentTransaction.postInvestmentTransaction(accountId, transaction.getTransactionId());
				String investmenttransactionid = keys.get("investmenttransactionid").toString();
				transactions.addTransactions(accountId, transaction.getTransactionId(), investmenttransactionid,"investmenttransaction");
				InvestmentAccount investmentAccount = new InvestmentAccount();
				investmentAccount = investmentAccount.getInvestmentAccount(accountId);
				investmentAccount.setBalanceAsOf(currentDate);
				List<Integer> transactionIdList = investmentAccount.getInvestmentTransactionId();
				transactionIdList.add(Integer.parseInt(investmenttransactionid));
				investmentAccount.setInvestmentTransactionId(transactionIdList);
				if (debitCreditMemo == DebitCreditMemo.DEBIT) {
					investmentAccount.setAvailableCashBalance(investmentAccount.getAvailableCashBalance().subtract(amount));
					investmentAccount.setCurrentValue(investmentAccount.getCurrentValue().subtract(amount));
				} else if (debitCreditMemo == DebitCreditMemo.CREDIT) {
					investmentAccount.setAvailableCashBalance(investmentAccount.getAvailableCashBalance().add(amount));
					investmentAccount.setCurrentValue(investmentAccount.getCurrentValue().add(amount));
				}
				investmentAccount.updateInvestmentAccount(accountId);
			}
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("ProcessPayment : ", e);
			throw new FDXException(e, 500);
		}
	}

	public void validatetRecurringPaymentInput(RecurringPaymentForUpdate46 recurringPaymentForUpdate, Boolean isPost) throws FDXException {
		if (isPost) {
			if (recurringPaymentForUpdate.getFromAccountId() == null || recurringPaymentForUpdate.getToPayeeId() == null
					|| recurringPaymentForUpdate.getAmount() == null || recurringPaymentForUpdate.getDueDate() == null
					|| recurringPaymentForUpdate.getFrequency() == null)
				throw new FDXException("Invalid Input", 401);
		} else {
			if (recurringPaymentForUpdate.getFromAccountId() == null && recurringPaymentForUpdate.getToPayeeId() == null
					&& recurringPaymentForUpdate.getAmount() == null && recurringPaymentForUpdate.getDueDate() == null
					&& recurringPaymentForUpdate.getMerchantAccountId() == null && recurringPaymentForUpdate.getFrequency() == null
					&& recurringPaymentForUpdate.getDuration() == null)
				throw new FDXException("Invalid Input", 401);
		}

		if (recurringPaymentForUpdate.getDuration() != null) {
			if (((RecurringPaymentDuration) recurringPaymentForUpdate.getDuration()).getType() == null)
				throw new FDXException("Invalid Input", 401);

			if (((RecurringPaymentDuration) recurringPaymentForUpdate.getDuration()).getType().equals("NUMBEROFTIMES")
					&& ((RecurringPaymentDuration) recurringPaymentForUpdate.getDuration()).getNumberOfTimes() == null)
				throw new FDXException("Invalid Input", 401);
		}

		validateInput(recurringPaymentForUpdate.getFromAccountId(), recurringPaymentForUpdate.getToPayeeId(),
				recurringPaymentForUpdate.getAmount(), recurringPaymentForUpdate.getDueDate());
	}

	public void validatetPaymentInput(PaymentForUpdate46 paymentForUpdate, Boolean isPost) throws FDXException {
		if (isPost) {
			if (paymentForUpdate.getFromAccountId() == null || paymentForUpdate.getToPayeeId() == null || paymentForUpdate.getAmount() == null
					|| paymentForUpdate.getDueDate() == null)
				throw new FDXException("Invalid Input", 401);
		} else {
			if (paymentForUpdate.getFromAccountId() == null && paymentForUpdate.getToPayeeId() == null && paymentForUpdate.getAmount() == null
					&& paymentForUpdate.getDueDate() == null && paymentForUpdate.getMerchantAccountId() == null)
				throw new FDXException("Invalid Input", 401);
		}
		validateInput(paymentForUpdate.getFromAccountId(), paymentForUpdate.getToPayeeId(),
				paymentForUpdate.getAmount(), paymentForUpdate.getDueDate());
	}

	public void validateInput(String fromAccountId, String toPayeeId, BigDecimal amount, Date dueDateInput) throws FDXException {
		try {
			// FromAccount Validation
			Accounts accounts = new Accounts(); //TODO repository?
			String accountType;
			if (fromAccountId != null) {
				try {
					accountType = accounts.getAccountsType(fromAccountId);
				} catch (FDXException e) {
					throw new FDXException("Source account not found", 901);
				}
				if (!(accountType.equalsIgnoreCase("LocAccount") || accountType.equalsIgnoreCase("DepositAccount")
						|| accountType.equalsIgnoreCase("InvestmentAccount"))) {
					throw new FDXException("Account type not supported", 704);
				}
			}

			// To Payee id validation
			if (toPayeeId != null) {
				Payee payee = new Payee();
				payee = payee.getPayeeById(toPayeeId);
				if (!(payee.getMerchant().getStatus().getValue()).equals("ACTIVE"))
					throw new FDXException(1);
			}

			// Amount Validation
			if (amount != null && amount.intValue() < 0)
					throw new FDXException(907);

			// Due Date validation
			if (dueDateInput != null) {
				Date dueDate = dueDateInput;
				Date currentDate = new Date();

				Calendar calendar = Calendar.getInstance();
				calendar.setTime(dueDate);
				calendar.set(Calendar.HOUR_OF_DAY, 0);
				calendar.set(Calendar.MINUTE, 0);
				calendar.set(Calendar.SECOND, 0);
				calendar.set(Calendar.MILLISECOND, 0);
				dueDate = calendar.getTime();

				calendar.setTime(currentDate);
				calendar.set(Calendar.HOUR_OF_DAY, 0);
				calendar.set(Calendar.MINUTE, 0);
				calendar.set(Calendar.SECOND, 0);
				calendar.set(Calendar.MILLISECOND, 0);
				currentDate = calendar.getTime();

				if (dueDate.compareTo(currentDate) < 0)
					throw new FDXException(803);
			}
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("ProcessPayment : ", e);
			throw new FDXException(e,500);
		}
	}

	public TransferStatus46 processTransfer(Transfer transfer) throws FDXException {
		TransferStatus transferStatus = new TransferStatus(); //TODO repository
		try {
			Accounts accounts = new Accounts();
			TransferStatus transferStatusRepository = new TransferStatus();
			// Create debit transaction
			String accountType = accounts.getAccountsType(transfer.getFromAccountId());
			createTransaction(transfer.getFromAccountId(), transfer.getAmount(), accountType,
					DebitCreditMemo.DEBIT, transfer.getTransferId(), transfer.getMemo(), "Transfer");

			// Create credit transaction
			accountType = accounts.getAccountsType(transfer.getToAccountId());
			createTransaction(transfer.getToAccountId(), transfer.getAmount(), accountType,
					DebitCreditMemo.CREDIT, transfer.getTransferId(), transfer.getMemo(), "Transfer");
			transferStatus.updateTransferStatus(transfer.getTransferId(), "SUCCESS");
			return (TransferStatus46) transferStatusRepository.getTransferStatusDetails(transfer.getTransferId());
		} catch (FDXException fdxException) {
			transferStatus.updateTransferStatus(transfer.getTransferId(), "FAILURE");
			throw fdxException;
		} catch (Exception e) {
			transferStatus.updateTransferStatus(transfer.getTransferId(), "FAILURE");
			log.error("Transfer : ", e);
			throw new FDXException(e, 500);
		}
	}

	public RecurringPayment processRecurringPayment(RecurringPayment recurringPayment) throws FDXException {
		RecurringPayment recurringPaymentRepository = new RecurringPayment();
		try {
			PaymentProcess paymentProcess = new PaymentProcess();
			Date dueDate = recurringPayment.getRecurringPaymentForUpdate().getDueDate();
			Date currentDate = new java.util.Date();
			boolean sameDay = DateUtils.isSameDay(dueDate, currentDate);
			PaymentForUpdate paymentForUpdate =
					new PaymentForUpdate(recurringPayment.getRecurringPaymentForUpdate().getToPayeeId(),
							recurringPayment.getRecurringPaymentForUpdate().getFromAccountId(),
							recurringPayment.getRecurringPaymentForUpdate().getAmount(),
							recurringPayment.getRecurringPaymentForUpdate().getMerchantAccountId(),
							recurringPayment.getRecurringPaymentForUpdate().getDueDate());
			// post and process
			paymentProcess.postPayment(paymentForUpdate, recurringPayment.getRecurringPaymentId());
			// schedule next payment as per the duration and frequency if same day
			if (sameDay) {
				// get durationType if it is NUMBEROFTIMES and one then process
				if (recurringPayment.getRecurringPaymentForUpdate().getDuration() != null
						&& recurringPayment.getRecurringPaymentForUpdate().getDuration().getType().toString().equals("NUMBEROFTIMES")
						&& recurringPayment.getRecurringPaymentForUpdate().getDuration().getNumberOfTimes().intValue() == 1) {
					recurringPaymentRepository.updatePaymentProcessed(recurringPayment.getRecurringPaymentId());
					return recurringPayment.getRecurringPaymentById(recurringPayment.getRecurringPaymentId());
				}
				// all other cases
				dueDate = getDateAsPerFrequency(recurringPayment);
				paymentForUpdate.setDueDate(dueDate);
				paymentProcess.postPayment(paymentForUpdate, recurringPayment.getRecurringPaymentId());
			}
			return recurringPayment;
		} catch (FDXException fdxException) {
			recurringPaymentRepository.setRecurringPaymentStatus(recurringPayment.getRecurringPaymentId(), "FAILED");
			throw fdxException;
		} catch (Exception e) {
			recurringPaymentRepository.setRecurringPaymentStatus(recurringPayment.getRecurringPaymentId(), "FAILED");
			log.error("ProcessPayment : ", e);
			throw new FDXException(e,500);
		}
	}

	// TODO belongs here so it should be private, restructure accordingly
	public Date getDateAsPerFrequency(RecurringPayment recurringPayment) {
		Date dueDate = recurringPayment.getRecurringPaymentForUpdate().getDueDate();
		String frequency = recurringPayment.getRecurringPaymentForUpdate().getFrequency().toString();
		Date dueDateUpdated = null;
		if (frequency.equals("WEEKLY"))
			dueDateUpdated = DateUtils.addDays(dueDate, 7);
		if (frequency.equals("BIWEEKLY"))
			dueDateUpdated = DateUtils.addDays(dueDate, 14);
		if (frequency.equals("TWICEMONTHLY"))
			dueDateUpdated = DateUtils.addDays(dueDate, 15);
		if (frequency.equals("MONTHLY"))
			dueDateUpdated = DateUtils.addMonths(dueDate, 1);
		if (frequency.equals("FOURWEEKS"))
			dueDateUpdated = DateUtils.addDays(dueDate, 28);
		if (frequency.equals("BIMONTHLY"))
			dueDateUpdated = DateUtils.addMonths(dueDate, 2);
		if (frequency.equals("QUARTERLY"))
			dueDateUpdated = DateUtils.addMonths(dueDate, 3);
		if (frequency.equals("SEMIANNUALLY"))
			dueDateUpdated = DateUtils.addMonths(dueDate, 6);
		if (frequency.equals("ANNUALLY"))
			dueDateUpdated = DateUtils.addMonths(dueDate, 12);
		return dueDateUpdated;
	}

	public TransferStatus46 postTransfer(Object transferInput) throws FDXException {
		Transfer transferRepository = new Transfer();
		ObjectMapper mapper = FdxUtil.getObjectMapper();
		Transfer transfer = mapper.convertValue(transferInput, new TypeReference<Transfer>() {
		});
		validateInputData(transfer);
		transferRepository.postTransfer(transfer);
		return processTransfer(transfer);
	}
}