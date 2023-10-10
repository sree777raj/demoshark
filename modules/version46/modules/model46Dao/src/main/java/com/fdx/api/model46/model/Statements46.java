package com.fdx.api.model46.model;

import java.time.LocalDate;

import com.fdx.common.exception.FDXException;
import org.springframework.stereotype.Repository;



@Repository
public interface Statements46<T> {

	T getStatementsList(String accountId, LocalDate startTime, LocalDate endTime, Integer limit, String offset,
			String uriPath, String query) throws FDXException;

}
