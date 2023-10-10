package com.fdx.api.model51.model;

import com.fdx.common.exception.FDXException;
import org.springframework.stereotype.Repository;

@Repository
public interface Availability51<T> {

	T getAvailability() throws FDXException;

}
