package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.MonthAbbreviation;
import com.fdx.api.model46.modelimpl.MonthAmount;

public class MonthAmountRowMapper implements RowMapper<MonthAmount> {

	@Override
	public MonthAmount mapRow(ResultSet rs, int rowNum) throws SQLException {
		MonthAmount monthAmount = new MonthAmount();
		monthAmount.setAmount(rs.getDouble("amount"));
		if (rs.getString("month") != null)
			monthAmount.setMonth(MonthAbbreviation.valueOf(rs.getString("month")));
		return monthAmount;
	}

}
