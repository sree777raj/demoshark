package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.FiPortion;

public class FiPortionRowMapper implements RowMapper<FiPortion> {

	@Override
	public FiPortion mapRow(ResultSet rs, int rowNum) throws SQLException {
		FiPortion fiPortion = new FiPortion();
		fiPortion.setPortionId(rs.getInt("portionId"));
		fiPortion.setAssetClass(rs.getString("assetClass"));
		fiPortion.setPercent(rs.getBigDecimal("percent"));
		return fiPortion;
	}

}
