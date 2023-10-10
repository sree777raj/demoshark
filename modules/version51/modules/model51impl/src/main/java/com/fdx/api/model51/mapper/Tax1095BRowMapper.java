package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.Address;
import com.fdx.api.model51.modelimpl.HealthInsuranceCoveredIndividual;
import com.fdx.api.model51.modelimpl.IndividualName;
import com.fdx.api.model51.modelimpl.NameAddress;
import com.fdx.api.model51.modelimpl.NameAddressPhone;
import com.fdx.api.model51.modelimpl.Tax1095B;

public class Tax1095BRowMapper implements RowMapper<Tax1095B> {

	@Override
	public Tax1095B mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tax1095B tax1095B = new Tax1095B();
		tax1095B.setEmployerId(rs.getString("employerId"));
		tax1095B.setEmployerTin(rs.getString("employerTin"));
		tax1095B.setIssuerId(rs.getString("issuerId"));
		tax1095B.setIssuerTin(rs.getString("issuerTin"));
		tax1095B.setOriginOfHealthCoverageCode(rs.getString("originOfHealthCoverageCode"));
		tax1095B.setResponsibleDateOfBirth(rs.getDate("responsibleDateOfBirth"));
		tax1095B.setResponsibleTin(rs.getString("responsibleTin"));

//		Employernameaddress Start
		NameAddress empNameAddress = new NameAddress();
		if (rs.getInt("employernameaddress") != 0) {
			empNameAddress.setNameAddressId(rs.getInt("employernameaddress"));
			tax1095B.setEmployerNameAddress(empNameAddress);
		}
//		Employernameaddress End

//		issuernameaddress Start
		NameAddressPhone nameAddressPhone = new NameAddressPhone();
		if (rs.getInt("issuernameaddress") != 0) {
			nameAddressPhone.setNameAddressId(rs.getInt("issuernameaddress"));
			tax1095B.setIssuerNameAddress(nameAddressPhone);
		}
//		issuernameaddress End

//		issuernameaddressphone Start
		NameAddressPhone nameAddress = new NameAddressPhone();
		if (rs.getInt("issuernameaddressphone") != 0) {
			nameAddress.setNameAddressId(rs.getInt("issuernameaddressphone"));
			tax1095B.setIssuerNameAddressPhone(nameAddress);
		}
//		issuernameaddressphone End

//		ResponsibleAddress Start
		Address address = new Address();
		if (rs.getInt("responsibleaddress") != 0) {
			address.setAddressId(rs.getInt("responsibleaddress"));
			tax1095B.setResponsibleAddress(address);
		}
//		ResponsibleAddress End

//		ResponsibleName Start
		IndividualName individualName = new IndividualName();
		if (rs.getInt("responsiblename") != 0) {
			individualName.setNameid(rs.getInt("responsiblename"));
			tax1095B.setResponsibleName(individualName);
		}
//		ResponsibleName End

//		CoveredIndividuals Start
		List<HealthInsuranceCoveredIndividual> healthInsuranceCoveredIndividualList = new ArrayList<>();
		if (rs.getArray("coveredindividuals") != null) {
			List<Integer> coveredindividualsList = Arrays
					.asList((Integer[]) rs.getArray("coveredindividuals").getArray());
			for (int coveredindividualsId : coveredindividualsList) {
				HealthInsuranceCoveredIndividual healthInsuranceCoveredIndividual = new HealthInsuranceCoveredIndividual();
				healthInsuranceCoveredIndividual.setHiciid(coveredindividualsId);
				healthInsuranceCoveredIndividualList.add(healthInsuranceCoveredIndividual);
			}
			tax1095B.setCoveredIndividuals(healthInsuranceCoveredIndividualList);
		}
//		CoveredIndividuals End 
		return tax1095B;
	}

}
