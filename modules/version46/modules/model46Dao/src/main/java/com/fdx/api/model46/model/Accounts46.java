package com.fdx.api.model46.model;

import java.time.LocalDate;
import java.util.List;

import com.fdx.common.exception.FDXException;
import org.springframework.stereotype.Repository;

@Repository
public interface Accounts46<T> {
	T getAccounts(List<String> accountIds, int limit, String offset, String resultType, String uriPath, LocalDate startTime, LocalDate endTime, String query, boolean isDateParamPassed) throws FDXException;
}
