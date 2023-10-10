package com.fdx.api.repositories.moneymovement;

import com.fdx.api.entities.moneymovement.PaymentStatus;
import com.fdx.api.entities.moneymovement.Transfer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface TransferRepository extends JpaRepository<Transfer, String> {

  @Query("SELECT t FROM Transfer t WHERE (coalesce(:searchFromAccountIds) is null or t.fromAccountId in (:searchFromAccountIds))" +
      " and (coalesce(:searchToAccountIds) is null or t.toAccountId in (:searchToAccountIds))" +
      " and (:updatedSince is null or t.transferId >= :updatedSince)" +
      " and (cast(:searchStartTransferDate as date) is null or t.transferTime > :searchStartTransferDate)" +
      " and (cast(:searchEndTransferDate as date) is null or t.transferTime > :searchEndTransferDate)" +
      " and (coalesce(:searchStatuses) is null or t.status in (:searchStatuses))" +
      " and (coalesce(:searchTransferIds) is null or t.transferId in (:searchTransferIds))")
  List<Transfer> findTransfersBy(String updatedSince, LocalDate searchStartTransferDate,
                                 LocalDate searchEndTransferDate, List<String> searchFromAccountIds,
                                 List<String> searchToAccountIds, List<PaymentStatus> searchStatuses,
                                 List<String> searchTransferIds);
}