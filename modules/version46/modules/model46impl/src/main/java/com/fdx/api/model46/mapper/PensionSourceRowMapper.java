package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.PaymentFrequency;
import com.fdx.api.model46.modelimpl.PensionSource;

public class PensionSourceRowMapper implements RowMapper<PensionSource> {

	@Override
	public PensionSource mapRow(ResultSet rs, int rowNum) throws SQLException {
		PensionSource pensionSource = new PensionSource();

		pensionSource.setAmount(rs.getBigDecimal("amount"));
		pensionSource.setAsOfDate(rs.getTimestamp("asOfDate"));
		pensionSource.setDisplayName(rs.getString("displayname"));
		if (rs.getString("frequency") != null)
			pensionSource.setFrequency(PaymentFrequency.valueOf(rs.getString("frequency")));
		pensionSource.setPaymentOption(rs.getString("paymentOption"));
		pensionSource.setStartDate(rs.getTimestamp("startDate"));

		return pensionSource;
	}

}
