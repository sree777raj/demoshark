package com.fdx.api.model51.model;

import com.fdx.common.exception.FDXException;
import org.springframework.stereotype.Repository;

@Repository
public interface Customers51<T> {

	Object getCustomers(int limit, String offset, String uriPath) throws FDXException;

}
