package com.fdx.api.model46.model;

import com.fdx.common.exception.FDXException;
import org.springframework.stereotype.Repository;

@Repository
public interface RewardCategories46<T> {

	T getRewardProgramCategories(String rewardProgramId, int limit, String offset, String uriPath) throws FDXException;

}
