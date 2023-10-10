package com.fdx.api.model51.model;

//import com.fdx.api.model51.model.PaymentDetails51;
import java.math.BigDecimal;
import com.fdx.common.exception.FDXException;
import org.springframework.stereotype.Repository;


@Repository
public interface Transfer51<T> {

	T postTransfer(Transfer51 transfer) throws FDXException;

	//T transferId(String transferId);
	String getTransferId();
	void setTransferId(String transferId);
	//T fromAccountId(String fromAccountId);
	String getFromAccountId();
	void setFromAccountId(String fromAccountId);
	//T toAccountId(String toAccountId);
	String getToAccountId();
	void setToAccountId(String toAccountId);
	//T amount(BigDecimal amount);
	BigDecimal getAmount();
	void setAmount(BigDecimal amount);
	//T memo(String memo);
	String getMemo();
	void setMemo(String memo);
//	T paymentDetails(PaymentDetails51 paymentDetails);
//	PaymentDetails51 getPaymentDetails();
//	void setPaymentDetails(PaymentDetails51 paymentDetails);
	boolean equals(Object o);
	int hashCode();
	String toString();
	Boolean checkTransferIdIfExists(String transferId);


}
