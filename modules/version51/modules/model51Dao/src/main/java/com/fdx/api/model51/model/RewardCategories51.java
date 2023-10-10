package com.fdx.api.model51.model;

import com.fdx.common.exception.FDXException;
import org.springframework.stereotype.Repository;

@Repository
public interface RewardCategories51<T> {

	T getRewardProgramCategories(String rewardProgramId, int limit, String offset, String uriPath) throws FDXException;

}
