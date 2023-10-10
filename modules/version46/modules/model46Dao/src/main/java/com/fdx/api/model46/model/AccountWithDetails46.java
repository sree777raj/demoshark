package com.fdx.api.model46.model;

import com.fdx.common.exception.FDXException;

import java.time.LocalDate;


public interface AccountWithDetails46<T> {

	T getAccount(String accountId, String resultType, LocalDate startTime , LocalDate endTime) throws FDXException;

	T getAccount(String accountId) throws FDXException;
}
