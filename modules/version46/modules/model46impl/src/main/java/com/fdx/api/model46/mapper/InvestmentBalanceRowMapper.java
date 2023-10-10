package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.Currency;
import com.fdx.api.model46.modelimpl.InvestmentBalance;
import com.fdx.api.model46.modelimpl.InvestmentBalanceType;
import com.fdx.api.model46.modelimpl.Iso4217Code;

public class InvestmentBalanceRowMapper implements RowMapper<InvestmentBalance> {

	@Override
	public InvestmentBalance mapRow(ResultSet rs, int arg1) throws SQLException {
		InvestmentBalance investmentBalance = new InvestmentBalance();
		investmentBalance.setBalanceDate(rs.getTimestamp("balanceDate"));
		investmentBalance.setBalanceDescription(rs.getString("balanceDescription"));
		investmentBalance.setBalanceName(rs.getString("balanceName"));
		if (rs.getString("balanceType") != null)
			investmentBalance.setBalanceType(InvestmentBalanceType.valueOf(rs.getString("balanceType")));
		investmentBalance.setBalanceValue(rs.getBigDecimal("balanceValue"));

		if (rs.getString("currencycode") != null) {
			Currency currency = new Currency();
			currency.setCurrencyCode(Iso4217Code.valueOf(rs.getString("currencycode").toString()));
			investmentBalance.setCurrency(currency);
		}

		return investmentBalance;
	}

}
