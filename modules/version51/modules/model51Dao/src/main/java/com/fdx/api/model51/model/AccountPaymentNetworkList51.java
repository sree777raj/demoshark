package com.fdx.api.model51.model;

import com.fdx.common.exception.FDXException;
import org.springframework.stereotype.Repository;


@Repository
public interface AccountPaymentNetworkList51<T> {

	T getAccountPaymentNetwork(String accountId, Integer limit, String offset, String uriPath, String queryInput) throws FDXException;

}
