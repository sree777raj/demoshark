package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.Payment;
import com.fdx.api.model51.modelimpl.PaymentForUpdate;
import com.fdx.api.model51.modelimpl.PaymentLinks;
import com.fdx.api.model51.modelimpl.PaymentStatus;

public class PaymentRowMapper implements RowMapper<Payment> {

	@Override
	public Payment mapRow(ResultSet rs, int rowNum) throws SQLException {
		Payment payment = new Payment();
		payment.setCancelledTimestamp(rs.getTimestamp("cancelledTimestamp"));
		payment.setFailedTimestamp(rs.getTimestamp("failedTimestamp"));
		payment.setPaymentId(rs.getString("paymentId"));
		payment.setProcessedTimestamp(rs.getTimestamp("processedTimestamp"));
		payment.setRecurringPaymentId(rs.getString("recurringPaymentId"));
		payment.setStartedProcessingTimestamp(rs.getTimestamp("startedProcessingTimestamp"));
		if (rs.getString("status") != null)
			payment.setStatus(PaymentStatus.valueOf(rs.getString("status").toString()));

		if (rs.getInt("links") != 0) {
			int links = rs.getInt("links");
			PaymentLinks paymentsLinks = new PaymentLinks();
			paymentsLinks.setPaymentLinkId(links);
			payment.setLinks(paymentsLinks);
		}

		if (rs.getString("paymentId") != null) {
			PaymentForUpdate paymentForUpdate = new PaymentForUpdate();
			paymentForUpdate.setPaymentId(rs.getString("paymentId"));
			payment.setPaymentForUpdate(paymentForUpdate);
		}

		return payment;
	}

}
