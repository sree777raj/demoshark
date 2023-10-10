package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.PaymentDetails;

public class PaymentDetailsAccountsRowMapper implements RowMapper<PaymentDetails> {

	@Override
	public PaymentDetails mapRow(ResultSet rs, int rowNum) throws SQLException {

		PaymentDetails paymentDetails= new PaymentDetails();
		paymentDetails.setEscrowAmount(rs.getBigDecimal("escrowAmount"));
		paymentDetails.setInterestAmount(rs.getBigDecimal("interestAmount"));
		paymentDetails.setInsuranceAmount(rs.getBigDecimal("insuranceAmount"));
		paymentDetails.setPmiAmount(rs.getBigDecimal("pmiAmount"));
		paymentDetails.setFeesAmount(rs.getBigDecimal("feesAmount"));
		paymentDetails.setPrincipalAmount(rs.getBigDecimal("principalAmount"));
		
		return paymentDetails;
	}

}
