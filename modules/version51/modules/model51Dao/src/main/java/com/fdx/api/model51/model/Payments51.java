package com.fdx.api.model51.model;

import com.fdx.common.exception.FDXException;
import org.springframework.stereotype.Repository;

@Repository
public interface Payments51<T> {

	T getPaymentsList(String updatedSince, String offset, Integer limit, String uriPath, String queryResult)
			throws FDXException;

	T getPaymentsByRecurringPaymentId(String recurringPaymentId, String updatedSince, String offset, Integer limit,
			String uriPath, String queryResult) throws FDXException;

}
