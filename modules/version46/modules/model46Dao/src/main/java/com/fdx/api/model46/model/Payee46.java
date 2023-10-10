package com.fdx.api.model46.model;

import com.fdx.common.exception.FDXException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
@Component
public interface Payee46<T> {

	T getPayeeById(String payeeId) throws FDXException;
	T deletePayee(String payeeId) throws FDXException;
	boolean equals(Object o);
	int hashCode();
	String toString();
	//T merchant(Object merchant);
	//Object getMerchant();
	//void setMerchant(Object merchant);
	//List<Object> getPayees(String updatedSince, int limit, String offset) throws FDXException;
	int getCount(String updatedSince) throws FDXException;


}
