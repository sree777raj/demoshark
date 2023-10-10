package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.RecurringPaymentDuration;
import com.fdx.api.model46.modelimpl.RecurringPaymentDurationType;

public class RecurringPaymentDurationRowMapper implements RowMapper<RecurringPaymentDuration> {

	@Override
	public RecurringPaymentDuration mapRow(ResultSet rs, int rowNum) throws SQLException {
		RecurringPaymentDuration recurringPaymentDuration = new RecurringPaymentDuration();
		recurringPaymentDuration.setDurationId(rs.getInt("durationId"));
		recurringPaymentDuration.setNumberOfTimes(rs.getBigDecimal("numberOfTimes"));
		if (rs.getString("type") != null)
			recurringPaymentDuration.setType(RecurringPaymentDurationType.valueOf(rs.getString("type")));
		return recurringPaymentDuration;
	}

}
