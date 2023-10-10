package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.Address;
import com.fdx.api.model46.modelimpl.HealthInsuranceCoverage;
import com.fdx.api.model46.modelimpl.HealthInsuranceMarketplaceCoveredIndividual;
import com.fdx.api.model46.modelimpl.Tax1095A;

public class Tax1095ARowMapper implements RowMapper<Tax1095A> {

	@Override
	public Tax1095A mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tax1095A tax1095A = new Tax1095A();
		tax1095A.setMarketplaceId(rs.getString("marketplaceId"));
		tax1095A.setMarketplacePolicyNumber(rs.getString("marketplacePolicyNumber"));
		tax1095A.setPolicyIssuerName(rs.getString("policyIssuerName"));
		tax1095A.setPolicyStartDate(rs.getDate("policyStartDate"));
		tax1095A.setPolicyTerminationDate(rs.getDate("policyTerminationDate"));
		tax1095A.setRecipientDateOfBirth(rs.getDate("recipientDateOfBirth"));
		tax1095A.setRecipientName(rs.getString("recipientName"));
		tax1095A.setRecipientTin(rs.getString("recipientTin"));
		tax1095A.setSpouseDateOfBirth(rs.getDate("spouseDateOfBirth"));
		tax1095A.setSpouseName(rs.getString("spouseName"));
		tax1095A.setSpouseTin(rs.getString("spouseTin"));

//		Coverage Start
		List<HealthInsuranceCoverage> coveragesResponseList = new ArrayList<>();
		if (rs.getArray("coverages") != null) {
			List<Integer> coveragesList = Arrays.asList((Integer[]) rs.getArray("coverages").getArray());
			for (int coveragesId : coveragesList) {
				HealthInsuranceCoverage healthInsuranceCoverage = new HealthInsuranceCoverage();
				healthInsuranceCoverage.setHicid(coveragesId);
				coveragesResponseList.add(healthInsuranceCoverage);
			}
			tax1095A.setCoverages(coveragesResponseList);
		}
//		Coverage End 

//		CoveredIndividuals Start
		List<HealthInsuranceMarketplaceCoveredIndividual> healthInsMPCoveredIndResponseList = new ArrayList<>();
		if (rs.getArray("coveredindividuals") != null) {
			List<Integer> coveredindividualsList = Arrays
					.asList((Integer[]) rs.getArray("coveredindividuals").getArray());
			for (int coveredindividualsId : coveredindividualsList) {
				HealthInsuranceMarketplaceCoveredIndividual healthInsuranceMarketplaceCoveredIndividual = new HealthInsuranceMarketplaceCoveredIndividual();
				healthInsuranceMarketplaceCoveredIndividual.setHimciid(coveredindividualsId);
				healthInsMPCoveredIndResponseList.add(healthInsuranceMarketplaceCoveredIndividual);
			}
			tax1095A.setCoveredIndividuals(healthInsMPCoveredIndResponseList);
		}
//		CoveredIndividuals End 

//		RecipientAddress Start
		Address recipientAddress = new Address();
		if (rs.getInt("recipientAddress") != 0) {
			recipientAddress.setAddressId(rs.getInt("recipientAddress"));
			tax1095A.setRecipientAddress(recipientAddress);
		}
//		RecipientNameAddress End

		return tax1095A;
	}

}
