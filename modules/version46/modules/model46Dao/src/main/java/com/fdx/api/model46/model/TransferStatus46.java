package com.fdx.api.model46.model;

import com.fdx.common.exception.FDXException;
import org.springframework.stereotype.Repository;
//import com.fdx.api.model46.model.TransferStatusStatus46;


@Repository
public interface TransferStatus46<T> {

	T getTransferStatusDetails(String transfer) throws FDXException;

	T transferId(String transferId);
	String getTransferId();
	void setTransferId(String transferId);
	T referenceId(String referenceId);
	String getReferenceId();
	void setReferenceId(String referenceId);
	//T status(TransferStatusStatus46 status);
//	TransferStatusStatus46 getStatus();
//	void setStatus(TransferStatusStatus46 status);
	T transferDate(java.sql.Timestamp transferDate);
	java.sql.Timestamp getTransferDate();
	void setTransferDate(java.sql.Timestamp transferDate);
	boolean equals(Object o);
	int hashCode();
	String toString();
	T postTransferStatus(String transferId) throws FDXException;
	void updateTransferStatus(String transferId, String status) throws FDXException;
}
