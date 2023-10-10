package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.PlannedAvailability;

public class PlannedAvailabilityRowMapper implements RowMapper<PlannedAvailability> {

	@Override
	public PlannedAvailability mapRow(ResultSet rs, int rowNum) throws SQLException {
		PlannedAvailability plannedAvailability = new PlannedAvailability();
		plannedAvailability.setStatus(rs.getString("status"));
		if (rs.getTimestamp("statusenddate") != null)
			plannedAvailability.setStatusEndDate(rs.getTimestamp("statusenddate"));
		if (rs.getTimestamp("statusstartdate") != null)
			plannedAvailability.setStatusStartDate(rs.getTimestamp("statusstartdate"));
		plannedAvailability.setStatusShortDesc(rs.getString("statusshortdesc"));
		return plannedAvailability;
	}

}
