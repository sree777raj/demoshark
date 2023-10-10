package com.fdx.api.model46.model;

import com.fdx.common.exception.FDXException;
import org.springframework.stereotype.Repository;

@Repository
public interface FdxError46<T> {
	Object getFdxError(int errorCode, String realm) throws FDXException;

	public String getMessage();

	public int getHttpStatusCode();

}
