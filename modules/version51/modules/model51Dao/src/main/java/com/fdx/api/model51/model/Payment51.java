package com.fdx.api.model51.model;

import org.springframework.stereotype.Repository;
import java.util.List;
import com.fdx.common.exception.FDXException;
//import com.fdx.api.model51.model.PaymentStatus51;

@Repository
public interface Payment51<T> {

	T getPaymentById(String paymentId) throws FDXException;

	T deletePayment(String paymentId) throws FDXException;

	T insertpayment(String paymentId, String recurringPaymentId) throws FDXException;

	T okToUpdatePayment(String paymentId) throws FDXException;
	
	PaymentForUpdate51 getPaymentForUpdate();
	//void setPaymentForUpdate(PaymentForUpdate51 paymentForUpdate);
	String getPaymentId();
	void setPaymentId(String paymentId);
	String getRecurringPaymentId();
	void setRecurringPaymentId(String recurringPaymentId);
	java.sql.Timestamp getProcessedTimestamp();
	void setProcessedTimestamp(java.sql.Timestamp processedTimestamp);
	java.sql.Timestamp getFailedTimestamp();
	void setFailedTimestamp(java.sql.Timestamp failedTimestamp);
	java.sql.Timestamp getCancelledTimestamp();
	void setCancelledTimestamp(java.sql.Timestamp cancelledTimestamp);
	java.sql.Timestamp getStartedProcessingTimestamp();
	void setStartedProcessingTimestamp(java.sql.Timestamp startedProcessingTimestamp);
//	PaymentStatus51 getStatus();
//	void setStatus(PaymentStatus51 status);
	int hashCode();
	boolean equals(Object obj);
	String toString();
	List<T> getPayment(String updatedSince, Integer limit, String offset) throws FDXException;
	int getCount(String updatedSince, String recurringPaymentId) throws FDXException;
	List<T> getPaymentByRecurringPaymentId(String recurringPaymentId, String updatedSince, Integer limit, 	String offset) throws FDXException;
	String getActivePaymentForRecurringPayment(String recurringPaymentId);
	void updatePaymentStatusProcessed(String paymentId) throws FDXException;
	void updatePaymentStatusProcessing(String paymentId) throws FDXException;
	void updatePaymentStatusFailed(String paymentId) throws FDXException;
}
