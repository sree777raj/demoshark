package com.fdx.api.model51.model;

import com.fdx.common.exception.FDXException;
import org.springframework.stereotype.Repository;

@Repository
public interface RecurringPayments51<T> {

	T getRecurringPaymentsList(String updatedSince, String offset, Integer limit, String uriPath, String queryResult) throws FDXException;

}
