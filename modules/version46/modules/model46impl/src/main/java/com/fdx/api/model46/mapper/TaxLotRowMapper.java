package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.PositionType;
import com.fdx.api.model46.modelimpl.TaxLot;

public class TaxLotRowMapper implements RowMapper<TaxLot> {

	@Override
	public TaxLot mapRow(ResultSet rs, int rowNum) throws SQLException {
		TaxLot taxLot = new TaxLot();

		taxLot.setCostBasis(rs.getBigDecimal("costBasis"));
		taxLot.setCurrentValue(rs.getBigDecimal("currentValue"));
		taxLot.setOriginalPurchaseDate(rs.getTimestamp("originalPurchaseDate"));
		if (rs.getString("positionType") != null)
			taxLot.setPositionType(PositionType.valueOf(rs.getString("positionType")));
		taxLot.setPurchasedPrice(rs.getBigDecimal("purchasedPrice"));
		taxLot.setQuantity(rs.getBigDecimal("quantity"));

		return taxLot;
	}

}
