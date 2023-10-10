package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.SweepSecurity;

public class SweepSecurityRowMapper implements RowMapper<SweepSecurity> {

	@Override
	public SweepSecurity mapRow(ResultSet rs, int rowNum) throws SQLException {
		SweepSecurity sweepSecurity = new SweepSecurity();
		sweepSecurity.setAvailableBalance(rs.getBigDecimal("availableBalance"));
		sweepSecurity.setBalanceAsOf(rs.getTimestamp("balanceAsOf"));
		if (!(rs.getString("checks") == null))
			sweepSecurity.setChecks(rs.getBoolean("checks"));
		sweepSecurity.setCurrentBalance(rs.getBigDecimal("currentBalance"));
		return sweepSecurity;
	}

}
