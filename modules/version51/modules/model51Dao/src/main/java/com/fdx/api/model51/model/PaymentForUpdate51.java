package com.fdx.api.model51.model;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fdx.common.exception.FDXException;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentForUpdate51<T> {

	<T> TypeReference getTypeRef();
	T postPaymentForUpdate(PaymentForUpdate51 paymentForUpdateInput, String recurringPaymentId) throws FDXException;
	String getPaymentId();
	void setPaymentId(String paymentId);
	//T fromAccountId(String fromAccountId);
	String getFromAccountId();
	void setFromAccountId(String fromAccountId);
	//T toPayeeId(String toPayeeId);
	String getToPayeeId();
	void setToPayeeId(String toPayeeId);
	//T amount(BigDecimal amount);
	BigDecimal getAmount();
	void setAmount(BigDecimal amount);
	//T merchantAccountId(String merchantAccountId);
	String getMerchantAccountId();
	void setMerchantAccountId(String merchantAccountId);
	//T dueDate(Date dueDate);
	Date getDueDate();
	void setDueDate(Date dueDate);
	boolean equals(Object o);
	int hashCode();
	String toString();
	//T getPaymentForUpdateDetails(String paymentId) throws FDXException;
	void updatePayment(String paymentId, PaymentForUpdate51 paymentForUpdate) throws FDXException;
}
