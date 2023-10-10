package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.CoverageMonth;
import com.fdx.api.model46.modelimpl.OfferOfHealthInsuranceCoverage;

public class OfferOfHealthInsuranceCoverageRowMapper implements RowMapper<OfferOfHealthInsuranceCoverage> {

	@Override
	public OfferOfHealthInsuranceCoverage mapRow(ResultSet rs, int rowNum) throws SQLException {
		OfferOfHealthInsuranceCoverage offerOfHealthInsuranceCoverage = new OfferOfHealthInsuranceCoverage();
		offerOfHealthInsuranceCoverage.setCoverageCode(rs.getString("coverageCode"));
		offerOfHealthInsuranceCoverage.setPostalCode(rs.getString("postalCode"));
		offerOfHealthInsuranceCoverage.setRequiredContribution(rs.getDouble("requiredContribution"));
		offerOfHealthInsuranceCoverage.setSection4980HCode(rs.getString("section4980HCode"));
		if (rs.getString("month") != null)
			offerOfHealthInsuranceCoverage.setMonth(CoverageMonth.valueOf(rs.getString("month")));
		return offerOfHealthInsuranceCoverage;
	}

}
