package com.fdx.api.model51.model;

import com.fdx.common.exception.FDXException;
import org.springframework.stereotype.Repository;

@Repository
public interface Customer51<T> {

	Object getCustomerDetails(String customerId) throws FDXException;

	T getCurrentCustomerInfo() throws FDXException;


}
