package com.fdx.api.model51.model;

import com.fdx.common.exception.FDXException;
import org.springframework.stereotype.Repository;

@Repository
public interface RewardProgram51<T> {

	T getRewardProgram(String rewardProgramId) throws FDXException;

}
