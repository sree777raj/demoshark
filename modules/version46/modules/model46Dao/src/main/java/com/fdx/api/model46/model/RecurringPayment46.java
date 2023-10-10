package com.fdx.api.model46.model;

import com.fdx.common.exception.FDXException;
import org.springframework.stereotype.Repository;

@Repository
public interface RecurringPayment46<T> {

	T getRecurringPaymentById(String recurringPaymentId) throws FDXException;

	T cancelRecurringPaymentById(String recurringPaymentId) throws FDXException;
	void setRecurringPaymentStatus(String recurringPaymentId, String status) throws FDXException;
	
	//T getRecurringPaymentForUpdate();
	//void setRecurringPaymentForUpdate(T recurringPaymentForUpdate);
	String getRecurringPaymentId();
	void setRecurringPaymentId(String recurringPaymentId);
	java.sql.Timestamp getCancelledTimestamp();
	void setCancelledTimestamp(java.sql.Timestamp cancelledTimestamp);
	java.sql.Timestamp getProcessedTimestamp();
	void setProcessedTimestamp(java.sql.Timestamp processedTimestamp);
	java.sql.Timestamp getFailedTimestamp();
	void setFailedTimestamp(java.sql.Timestamp failedTimestamp);
	int hashCode();
	boolean equals(Object obj);
	String toString();
	//List<RecurringPayment46> getRecurringPayment(String updatedSince, Integer limit, String offset) throws FDXException;
	int getCount(String updatedSince) throws FDXException;
	void updateFailedTimestamp(String recurringPaymentId) throws FDXException;
	void updatePaymentProcessed(String recurringPaymentId) throws FDXException;
}
