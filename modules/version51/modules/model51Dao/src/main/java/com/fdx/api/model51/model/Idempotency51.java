package com.fdx.api.model51.model;

import com.fdx.common.exception.FDXException;
import org.springframework.stereotype.Repository;

@Repository
public interface Idempotency51<T> {
	Boolean ifExists(String idempotencyKey, String apiName) throws FDXException;

	String getApiResponse(String idempotencyKey, String string) throws FDXException;

	void insertIdempotency(String recurringPaymentResponse, String idempotencyKey, String apiName, int httpStatusCode) throws FDXException;

}
