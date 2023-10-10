package com.fdx.api.model46.model;

import com.fdx.common.exception.FDXException;
import org.springframework.stereotype.Repository;

@Repository
public interface Statement46<T> {
	Object getStatementById(String accountId, String statementId) throws FDXException;
}
