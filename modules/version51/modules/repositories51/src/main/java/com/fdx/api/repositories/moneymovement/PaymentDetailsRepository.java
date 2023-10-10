package com.fdx.api.repositories.moneymovement;

import com.fdx.api.entities.moneymovement.PaymentDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentDetailsRepository extends JpaRepository<PaymentDetails, String> {
}
