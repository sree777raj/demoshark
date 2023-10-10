package com.fdx.api.model46.model;

import com.fdx.common.exception.FDXException;
import java.util.Date;
import org.springframework.stereotype.Repository;
//import com.fdx.api.model46.model.RecurringPaymentFrequency46;
//import com.fdx.api.model46.model.RecurringPaymentDuration46;
import java.math.BigDecimal;

import java.util.InputMismatchException;

@Repository
public interface RecurringPaymentForUpdate46<T> {

	T postRecurringPayment(RecurringPaymentForUpdate46 recurringPaymentForUpdate) throws InputMismatchException, FDXException;

	String getRecurringPaymentId();
	void setRecurringPaymentId(String recurringPaymentId);
	int getDurationId();
	void setDurationId(int durationId);
//	T frequency(RecurringPaymentFrequency46 frequency);
//	RecurringPaymentFrequency46 getFrequency();
//	void setFrequency(RecurringPaymentFrequency46 frequency);
	//T duration(RecurringPaymentDuration46 duration);
//	RecurringPaymentDuration46 getDuration();
//	void setDuration(RecurringPaymentDuration46 duration);
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
	//T getRecurringPaymentForUpdateDetails(String recurringPaymentId) throws FDXException;
	T updateRecurringPayment(String recurringPaymentId, RecurringPaymentForUpdate46 recurringPaymentForUpdate) throws FDXException;
	Object getFrequency();
	Object getDuration();
}
