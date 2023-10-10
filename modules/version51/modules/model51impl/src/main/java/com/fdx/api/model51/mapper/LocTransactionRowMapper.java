package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.LocTransaction;
import com.fdx.api.model51.modelimpl.LocTransactionType;
import com.fdx.api.model51.modelimpl.PaymentDetails;

public class LocTransactionRowMapper implements RowMapper<LocTransaction> {

	@Override
	public LocTransaction mapRow(ResultSet rs, int arg1) throws SQLException {
		LocTransaction locTransaction = new LocTransaction();

		locTransaction.setCheckNumber(rs.getInt("checkNumber"));
		locTransaction.setTransactionId(rs.getString("transactionId"));
		if (rs.getString("transactionType") != null)
			locTransaction.setTransactionType(LocTransactionType.valueOf(rs.getString("transactionType")));

		if (rs.getInt("paymentdetailsid") != 0) {
			PaymentDetails paymentDetails = new PaymentDetails();
			paymentDetails.setPaymentdetailsid(rs.getInt("paymentdetailsid"));
			locTransaction.setPaymentDetails(paymentDetails);
		}

		return locTransaction;
	}
}
