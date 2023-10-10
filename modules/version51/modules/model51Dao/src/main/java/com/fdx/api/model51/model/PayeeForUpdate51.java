package com.fdx.api.model51.model;

import com.fdx.common.exception.FDXException;
import org.springframework.stereotype.Repository;

@Repository
public interface PayeeForUpdate51<T> {
	T updatePayee(String payeeId, Object payeeForUpdate) throws FDXException;
	T postPayee(Object payeeForUpdate) throws FDXException;
	boolean equals(Object o);
	int hashCode();
	String toString();
}
