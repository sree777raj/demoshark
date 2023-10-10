package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.StockSecurity;
import com.fdx.api.model51.modelimpl.StockType;

public class StockSecurityRowMapper implements RowMapper<StockSecurity> {

	@Override
	public StockSecurity mapRow(ResultSet rs, int rowNum) throws SQLException {
		StockSecurity stockSecurity = new StockSecurity();
		if (!(rs.getString("reinvestDividends") == null))
			stockSecurity.setReinvestDividends(rs.getBoolean("reinvestDividends"));
		if (rs.getString("stockType") != null)
			stockSecurity.setStockType(StockType.valueOf(rs.getString("stockType")));
		stockSecurity.setUnitsStreet(rs.getBigDecimal("unitsStreet"));
		stockSecurity.setUnitsUser(rs.getBigDecimal("unitsUser"));
		stockSecurity.setUnitsUser(rs.getBigDecimal("unitsUser"));
		stockSecurity.setYield(rs.getBigDecimal("yield"));
		stockSecurity.setYieldAsOfDate(rs.getTimestamp("yieldAsOfDate"));

		return stockSecurity;
	}

}
