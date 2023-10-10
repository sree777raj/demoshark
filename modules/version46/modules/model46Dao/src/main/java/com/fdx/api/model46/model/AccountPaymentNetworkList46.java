package com.fdx.api.model46.model;

import com.fdx.common.exception.FDXException;
import org.springframework.stereotype.Repository;


@Repository
public interface AccountPaymentNetworkList46<T> {

	T getAccountPaymentNetwork(String accountId, Integer limit, String offset, String uriPath, String queryInput) throws FDXException;

}
