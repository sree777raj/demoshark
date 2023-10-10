package com.fdx.api.model51.model;

import org.springframework.stereotype.Repository;

@Repository
public interface Error51<T> {
	Object getErrorObject(String accountId, String statementId);
}
