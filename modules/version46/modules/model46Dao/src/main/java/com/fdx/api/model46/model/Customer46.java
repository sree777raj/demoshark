package com.fdx.api.model46.model;

import com.fdx.common.exception.FDXException;
import org.springframework.stereotype.Repository;

@Repository
public interface Customer46<T> {

	Object getCustomerDetails(String customerId) throws FDXException;

	T getCurrentCustomerInfo() throws FDXException;


}
