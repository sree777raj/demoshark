package com.fdx.api.model51.model;

import com.fdx.common.exception.FDXException;
import org.springframework.stereotype.Repository;

@Repository
public interface Statement51<T> {
	Object getStatementById(String accountId, String statementId) throws FDXException;
}
