package com.fdx.api.model51.model;

import com.fdx.common.exception.FDXException;
import org.springframework.stereotype.Repository;

@Repository
public interface Transaction51<T> {

	T getTransactionImage(String accountId, String imageId) throws FDXException;
}
