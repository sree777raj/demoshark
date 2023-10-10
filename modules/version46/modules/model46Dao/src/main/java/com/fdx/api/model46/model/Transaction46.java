package com.fdx.api.model46.model;

import com.fdx.common.exception.FDXException;
import org.springframework.stereotype.Repository;

@Repository
public interface Transaction46<T> {

	T getTransactionImage(String accountId, String imageId) throws FDXException;
}
