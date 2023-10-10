package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.DateAmount;

public class DateAmountRowMapper implements RowMapper<DateAmount> {

	@Override
	public DateAmount mapRow(ResultSet rs, int rowNum) throws SQLException {
		DateAmount dateAmount= new DateAmount();
		dateAmount.setAmount(rs.getDouble("amount"));
		dateAmount.setDate(rs.getDate("date"));
		dateAmount.setDescription(rs.getString("description"));
		return dateAmount;
	}

}
