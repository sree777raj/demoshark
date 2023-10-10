package com.fdx.api.model51.model;

import com.fdx.common.exception.FDXException;
import org.springframework.stereotype.Repository;

@Repository
public interface Account51<T> {

	T getAccountContact(String accountid) throws FDXException;

}
