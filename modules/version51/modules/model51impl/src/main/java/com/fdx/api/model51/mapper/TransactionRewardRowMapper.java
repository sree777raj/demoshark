package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.TransactionReward;

public class TransactionRewardRowMapper implements RowMapper<TransactionReward> {

	@Override
	public TransactionReward mapRow(ResultSet rs, int rowNum) throws SQLException {
		TransactionReward transactionReward = new TransactionReward();
		transactionReward.setAccrued(rs.getBigDecimal("accrued"));
		transactionReward.setAdjusted(rs.getBigDecimal("adjusted"));
		transactionReward.setCategoryId(rs.getString("categoryId"));

		return transactionReward;
	}

}
