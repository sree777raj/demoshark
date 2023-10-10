package com.fdx.api.repositories.moneymovement;

import com.fdx.api.entities.moneymovement.TransferStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransferStatusRepository extends JpaRepository<TransferStatus, String> {
}