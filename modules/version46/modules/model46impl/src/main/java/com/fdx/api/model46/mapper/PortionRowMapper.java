package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.AssetClass;
import com.fdx.api.model46.modelimpl.Portion;

public class PortionRowMapper implements RowMapper<Portion> {

	@Override
	public Portion mapRow(ResultSet rs, int rowNum) throws SQLException {
		Portion portion = new Portion();

		portion.setPortionId(rs.getInt("portionid"));
		if (rs.getString("assetClass") != null)
			portion.setAssetClass(AssetClass.valueOf(rs.getString("assetClass")));
		portion.setPercent(rs.getBigDecimal("percent"));
		return portion;
	}

}
