package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.DescriptionAmount;

public class DescriptionAmountRowMapper implements RowMapper<DescriptionAmount> {

	@Override
	public DescriptionAmount mapRow(ResultSet rs, int rowNum) throws SQLException {
		DescriptionAmount descriptionAmount = new DescriptionAmount();
		descriptionAmount.setAmount(rs.getDouble("amount"));
		descriptionAmount.setDescription(rs.getString("description"));
		return descriptionAmount;
	}

}
