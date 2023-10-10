package com.fdx.api.model46.model;

import com.fdx.common.exception.FDXException;
import org.springframework.stereotype.Repository;


@Repository
public interface Payees46<T> {

	T getPayeesList(String updatedSince, String offset, int limit, String uriPath, String queryResult) throws FDXException;

}
