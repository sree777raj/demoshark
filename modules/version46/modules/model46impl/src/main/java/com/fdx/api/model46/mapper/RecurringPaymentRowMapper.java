package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.PaymentStatus;
import com.fdx.api.model46.modelimpl.RecurringPayment;
import com.fdx.api.model46.modelimpl.RecurringPaymentForUpdate;

public class RecurringPaymentRowMapper implements RowMapper<RecurringPayment> {

	@Override
	public RecurringPayment mapRow(ResultSet rs, int rowNum) throws SQLException {
		RecurringPayment recurringPayment = new RecurringPayment();
		recurringPayment.setCancelledTimestamp(rs.getTimestamp("cancelledTimestamp"));
		recurringPayment.setFailedTimestamp(rs.getTimestamp("failedTimestamp"));
		recurringPayment.setProcessedTimestamp(rs.getTimestamp("processedTimestamp"));
		recurringPayment.setRecurringPaymentId(rs.getString("recurringPaymentId"));
		if (rs.getString("status") != null)
			recurringPayment.setStatus(PaymentStatus.valueOf(rs.getString("status").toString()));

		RecurringPaymentForUpdate recurringPaymentForUpdate = new RecurringPaymentForUpdate();
		recurringPaymentForUpdate.setRecurringPaymentId(rs.getString("recurringPaymentId"));
		recurringPayment.setRecurringPaymentForUpdate(recurringPaymentForUpdate);

		return recurringPayment;
	}

}
