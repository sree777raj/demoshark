package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.Availability;
import com.fdx.api.model46.modelimpl.PlannedAvailability;

public class AvailabilityRowMapper implements RowMapper<Availability> {

	@Override
	public Availability mapRow(ResultSet rs, int rowNum) throws SQLException {
		Availability availability = new Availability();
		availability.setCurrentStatus(rs.getString("currentStatus"));
		availability.setCurrentStatusDesc(rs.getString("currentStatusDesc"));

		if (rs.getArray("plannedStatusid") != null) {
			List<PlannedAvailability> plannedAvailabilityList = new ArrayList<>();
			List<Integer> plannedAvailabilityResponseList = Arrays
					.asList((Integer[]) rs.getArray("plannedStatusid").getArray());

			for (int listele : plannedAvailabilityResponseList) {
				PlannedAvailability plannedAvailability = new PlannedAvailability();
				plannedAvailability.setPlannedStatusId(listele);
				plannedAvailabilityList.add(plannedAvailability);
			}
			availability.setPlannedAvailability(plannedAvailabilityList);
		}

		return availability;
	}

}
