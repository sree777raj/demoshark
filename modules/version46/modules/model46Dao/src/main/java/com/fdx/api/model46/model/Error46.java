package com.fdx.api.model46.model;

import org.springframework.stereotype.Repository;

@Repository
public interface Error46<T> {
	Object getErrorObject(String accountId, String statementId);
}
