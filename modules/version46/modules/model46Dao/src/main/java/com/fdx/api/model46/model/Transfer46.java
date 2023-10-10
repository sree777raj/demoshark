package com.fdx.api.model46.model;

//import com.fdx.api.model46.model.PaymentDetails46;
import java.math.BigDecimal;
import com.fdx.common.exception.FDXException;
import org.springframework.stereotype.Repository;


@Repository
public interface Transfer46<T> {

	T postTransfer(Transfer46 transfer) throws FDXException;

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
//	T paymentDetails(PaymentDetails46 paymentDetails);
//	PaymentDetails46 getPaymentDetails();
//	void setPaymentDetails(PaymentDetails46 paymentDetails);
	boolean equals(Object o);
	int hashCode();
	String toString();
	Boolean checkTransferIdIfExists(String transferId);


}
