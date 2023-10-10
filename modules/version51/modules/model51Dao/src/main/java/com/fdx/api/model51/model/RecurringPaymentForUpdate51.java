package com.fdx.api.model51.model;

import com.fdx.common.exception.FDXException;
import java.util.Date;
import org.springframework.stereotype.Repository;
//import com.fdx.api.model51.model.RecurringPaymentFrequency51;
//import com.fdx.api.model51.model.RecurringPaymentDuration51;
import java.math.BigDecimal;

import java.util.InputMismatchException;

@Repository
public interface RecurringPaymentForUpdate51<T> {

	T postRecurringPayment(RecurringPaymentForUpdate51 recurringPaymentForUpdate) throws InputMismatchException, FDXException;

	String getRecurringPaymentId();
	void setRecurringPaymentId(String recurringPaymentId);
	int getDurationId();
	void setDurationId(int durationId);
//	T frequency(RecurringPaymentFrequency51 frequency);
//	RecurringPaymentFrequency51 getFrequency();
//	void setFrequency(RecurringPaymentFrequency51 frequency);
	//T duration(RecurringPaymentDuration51 duration);
//	RecurringPaymentDuration51 getDuration();
//	void setDuration(RecurringPaymentDuration51 duration);
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
	T updateRecurringPayment(String recurringPaymentId, RecurringPaymentForUpdate51 recurringPaymentForUpdate) throws FDXException;
	Object getFrequency();
	Object getDuration();
}
