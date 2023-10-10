package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.CoverageMonth;
import com.fdx.api.model46.modelimpl.HealthInsuranceCoverage;

public class HealthInsuranceCoverageRowMapper implements RowMapper<HealthInsuranceCoverage> {

	@Override
	public HealthInsuranceCoverage mapRow(ResultSet rs, int rowNum) throws SQLException {
		HealthInsuranceCoverage healthInsuranceCoverage = new HealthInsuranceCoverage();
		healthInsuranceCoverage.setAdvancePremiumTaxCreditPayment(rs.getDouble("advancePremiumTaxCreditPayment"));
		healthInsuranceCoverage.setEnrollmentPremium(rs.getDouble("enrollmentPremium"));
		if (rs.getString("month") != null)
			healthInsuranceCoverage.setMonth(CoverageMonth.valueOf(rs.getString("month")));
		healthInsuranceCoverage.setSlcspPremium(rs.getDouble("slcspPremium"));

		return healthInsuranceCoverage;
	}

}
