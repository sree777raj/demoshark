package com.fdx.api.model51.model;

import com.fdx.common.exception.FDXException;

import java.time.LocalDate;


public interface AccountWithDetails51<T> {

	T getAccount(String accountId, String resultType, LocalDate startTime , LocalDate endTime) throws FDXException;

	T getAccount(String accountId) throws FDXException;
}
