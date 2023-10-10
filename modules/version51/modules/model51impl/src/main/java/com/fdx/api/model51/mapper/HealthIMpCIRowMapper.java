package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.HealthInsuranceMarketplaceCoveredIndividual;

public class HealthIMpCIRowMapper implements RowMapper<HealthInsuranceMarketplaceCoveredIndividual> {

	@Override
	public HealthInsuranceMarketplaceCoveredIndividual mapRow(ResultSet rs, int rowNum) throws SQLException {
		HealthInsuranceMarketplaceCoveredIndividual healthIMCIndividual = new HealthInsuranceMarketplaceCoveredIndividual();
		healthIMCIndividual.setDateOfBirth(rs.getDate("dateOfBirth"));
		healthIMCIndividual.setName(rs.getString("name"));
		healthIMCIndividual.setPolicyStartDate(rs.getDate("policyStartDate"));
		healthIMCIndividual.setPolicyTerminationDate(rs.getDate("policyTerminationDate"));
		healthIMCIndividual.setTin(rs.getString("tin"));
		return healthIMCIndividual;
	}

}
