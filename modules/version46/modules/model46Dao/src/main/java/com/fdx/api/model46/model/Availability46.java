package com.fdx.api.model46.model;

import com.fdx.common.exception.FDXException;
import org.springframework.stereotype.Repository;

@Repository
public interface Availability46<T> {

	T getAvailability() throws FDXException;

}
