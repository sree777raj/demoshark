package com.fdx.api.model51.model;

import com.fdx.common.exception.FDXException;
import org.springframework.stereotype.Repository;

@Repository
public interface Capability51<T> {

	T getCapability() throws FDXException;

}
