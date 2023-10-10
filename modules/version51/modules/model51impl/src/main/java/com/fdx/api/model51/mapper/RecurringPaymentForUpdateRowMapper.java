package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.RecurringPaymentDuration;
import com.fdx.api.model51.modelimpl.RecurringPaymentForUpdate;
import com.fdx.api.model51.modelimpl.RecurringPaymentFrequency;

public class RecurringPaymentForUpdateRowMapper implements RowMapper<RecurringPaymentForUpdate> {

	@Override
	public RecurringPaymentForUpdate mapRow(ResultSet rs, int rowNum) throws SQLException {
		RecurringPaymentForUpdate recurringPaymentForUpdate = new RecurringPaymentForUpdate();
		recurringPaymentForUpdate.setAmount(rs.getBigDecimal("amount"));
		recurringPaymentForUpdate.setDueDate(rs.getDate("dueDate"));
		if (rs.getString("frequency") != null)
			recurringPaymentForUpdate.setFrequency(RecurringPaymentFrequency.valueOf(rs.getString("frequency")));
		recurringPaymentForUpdate.setFromAccountId(rs.getString("fromAccountId"));
		recurringPaymentForUpdate.setMerchantAccountId(rs.getString("merchantAccountId"));
		recurringPaymentForUpdate.setRecurringPaymentId(rs.getString("recurringpaymentId"));
		recurringPaymentForUpdate.setToPayeeId(rs.getString("toPayeeId"));

		RecurringPaymentDuration duration = new RecurringPaymentDuration();
		duration.setDurationId(rs.getInt("duration"));
		recurringPaymentForUpdate.setDuration(duration);

		return recurringPaymentForUpdate;
	}

}
