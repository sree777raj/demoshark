package com.fdx.api.model51.model;

import java.time.LocalDate;

import com.fdx.common.exception.FDXException;
import org.springframework.stereotype.Repository;

@Repository
public interface Transactions51<T> {
	Object getTransactions(String accountId, LocalDate startTime, LocalDate endTime, Integer limit, String offset, String uriPath,String query) throws FDXException;

}
