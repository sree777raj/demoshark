package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.PaymentForUpdate;

public class PaymentForUpdateRowMapper implements RowMapper<PaymentForUpdate> {

	@Override
	public PaymentForUpdate mapRow(ResultSet rs, int rowNum) throws SQLException {
		PaymentForUpdate paymentForUpdate = new PaymentForUpdate(rs.getString("toPayeeId"),
				rs.getString("fromAccountId"), rs.getBigDecimal("amount"),
				rs.getString("merchantAccountId"), rs.getDate("dueDate"));
		paymentForUpdate.setPaymentId(rs.getString("paymentId"));
		return paymentForUpdate;
	}

}
