package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.HateoasLink;
import com.fdx.api.model46.modelimpl.PaymentLinks;

public class PaymentLinksRowMapper implements RowMapper<PaymentLinks> {

	@Override
	public PaymentLinks mapRow(ResultSet rs, int rowNum) throws SQLException {
		PaymentLinks paymentLinks = new PaymentLinks();

		HateoasLink hateoasLink = new HateoasLink();
		hateoasLink.setHateoasLinkId(rs.getInt("recurringpayment"));
		paymentLinks.setRecurringPayment(hateoasLink);
		return paymentLinks;
	}

}
