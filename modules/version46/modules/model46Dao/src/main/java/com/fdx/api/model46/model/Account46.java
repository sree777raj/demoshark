package com.fdx.api.model46.model;

import com.fdx.common.exception.FDXException;
import org.springframework.stereotype.Repository;

@Repository
public interface Account46<T> {

	T getAccountContact(String accountid) throws FDXException;

}
