package com.fdx.api.model46.model;

import com.fdx.common.exception.FDXException;
import org.springframework.stereotype.Repository;

@Repository
public interface RewardProgram46<T> {

	T getRewardProgram(String rewardProgramId) throws FDXException;

}
