package com.fdx.api.model51.model;

import com.fdx.common.exception.FDXException;
import org.springframework.stereotype.Repository;

@Repository
public interface RewardPrograms51<T> {

	T getRewardPrograms(String uriPath) throws FDXException;


}
