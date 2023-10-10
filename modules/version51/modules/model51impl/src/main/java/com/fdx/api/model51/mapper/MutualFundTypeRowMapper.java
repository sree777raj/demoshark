package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.MutualFundSecurity;
import com.fdx.api.model51.modelimpl.MutualFundType;

public class MutualFundTypeRowMapper implements RowMapper<MutualFundSecurity> {

	@Override
	public MutualFundSecurity mapRow(ResultSet rs, int rowNum) throws SQLException {
		MutualFundSecurity mutualFundSecurity = new MutualFundSecurity();

		if (rs.getString("mutualFundType") != null)
			mutualFundSecurity.setMutualFundType(MutualFundType.valueOf(rs.getString("mutualFundType")));
		if (!(rs.getString("reinvestCapitalGains") == null))
			mutualFundSecurity.setReinvestCapitalGains(rs.getBoolean("reinvestCapitalGains"));
		if (!(rs.getString("reinvestDividends") == null))
			mutualFundSecurity.setReinvestDividends(rs.getBoolean("reinvestDividends"));
		mutualFundSecurity.setUnitsStreet(rs.getBigDecimal("unitsStreet"));
		mutualFundSecurity.setUnitsUser(rs.getBigDecimal("unitsUser"));
		mutualFundSecurity.setYield(rs.getBigDecimal("yield"));
		mutualFundSecurity.setYieldAsOfDate(rs.getTimestamp("yieldAsOfDate"));
		return mutualFundSecurity;
	}

}
