package com.fdx.api.model46.model;

import com.fdx.common.exception.FDXException;
import org.springframework.stereotype.Repository;

@Repository
public interface RewardPrograms46<T> {

	T getRewardPrograms(String uriPath) throws FDXException;


}
