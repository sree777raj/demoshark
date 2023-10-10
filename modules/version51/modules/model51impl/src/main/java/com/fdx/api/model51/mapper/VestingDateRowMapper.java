package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.Vesting;

public class VestingDateRowMapper implements RowMapper<Vesting> {

	@Override
	public Vesting mapRow(ResultSet rs, int rowNum) throws SQLException {
		Vesting vesting = new Vesting();

		vesting.setOtherVestAmount(rs.getBigDecimal("otherVestAmount"));
		vesting.setOtherVestPercentage(rs.getBigDecimal("otherVestPercentage"));
		vesting.setStrikePrice(rs.getBigDecimal("strikePrice"));
		vesting.setSymbol(rs.getString("symbol"));
		vesting.setUnVestedBalance(rs.getBigDecimal("unVestedBalance"));
		vesting.setUnVestedQuantity(rs.getBigDecimal("unVestedQuantity"));
		vesting.setVestedBalance(rs.getBigDecimal("vestedBalance"));
		vesting.setVestedQuantity(rs.getBigDecimal("vestedQuantity"));
		vesting.setVestingDate(rs.getTimestamp("vestingDate"));
		vesting.setVestingPercentage(rs.getBigDecimal("vestingPercentage"));
		
		return vesting;
	}

}
