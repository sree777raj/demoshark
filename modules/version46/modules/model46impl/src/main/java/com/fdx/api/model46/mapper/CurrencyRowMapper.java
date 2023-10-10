package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.Currency;
import com.fdx.api.model46.modelimpl.Iso4217Code;

public class CurrencyRowMapper implements RowMapper<Currency> {

	@Override
	public Currency mapRow(ResultSet rs, int arg1) throws SQLException {
		Currency currency = new Currency();
		if (rs.getString("currencyCode") != null)
			currency.setCurrencyCode(Iso4217Code.valueOf(rs.getString("currencyCode")));
		if (rs.getString("originalCurrencyCode") != null)
			currency.setOriginalCurrencyCode(Iso4217Code.valueOf(rs.getString("originalCurrencyCode")));
		else
			currency.setOriginalCurrencyCode(null);
		currency.setCurrencyRate(rs.getBigDecimal("currencyrate"));

		return currency;
	}

}
