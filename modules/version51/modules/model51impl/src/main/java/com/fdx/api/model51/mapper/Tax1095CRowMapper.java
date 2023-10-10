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
import com.fdx.api.model51.modelimpl.NameAddressPhone;
import com.fdx.api.model51.modelimpl.OfferOfHealthInsuranceCoverage;
import com.fdx.api.model51.modelimpl.Tax1095C;

public class Tax1095CRowMapper implements RowMapper<Tax1095C> {

	@Override
	public Tax1095C mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tax1095C tax1095C = new Tax1095C();
		tax1095C.setEmployeeAge(rs.getInt("employeeAge"));
		tax1095C.setEmployerId(rs.getString("employerId"));
		tax1095C.setEmployerTin(rs.getString("employerTin"));
		tax1095C.setPlanStartMonth(rs.getInt("planStartMonth"));
		if (!(rs.getString("selfInsuredCoverage") == null))
			tax1095C.setSelfInsuredCoverage(rs.getBoolean("selfInsuredCoverage"));
		tax1095C.setTin(rs.getString("tin"));

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
			tax1095C.setCoveredIndividuals(healthInsuranceCoveredIndividualList);
		}
//		CoveredIndividuals End

//		employeeAddress Start
		Address address = new Address();
		if (rs.getInt("employeeaddress") != 0) {
			address.setAddressId(rs.getInt("employeeaddress"));
			tax1095C.setEmployeeAddress(address);
		}
//		employeeAddress End

//		EmployeeName Start
		IndividualName individualName = new IndividualName();
		if (rs.getInt("employeename") != 0) {
			individualName.setNameid(rs.getInt("employeename"));
			tax1095C.setEmployeeName(individualName);
		}
//		EmployeeName End

//		Emloyernameaddress Start
		NameAddressPhone nameAddress = new NameAddressPhone();
		if (rs.getInt("employernameaddress") != 0) {
			nameAddress.setNameAddressId(rs.getInt("employernameaddress"));
			tax1095C.setEmployerNameAddress(nameAddress);
		}
//		EMployernameaddress End	

//		Employernameaddressphone Start
		NameAddressPhone nameAddressPhone = new NameAddressPhone();
		if (rs.getInt("employernameaddressphone") != 0) {
			nameAddressPhone.setNameAddressId(rs.getInt("employernameaddressphone"));
			tax1095C.setEmployerNameAddressPhone(nameAddressPhone);
		}
//		Employernameaddressphone End

//		OfferOfHealthInsuranceCoverage Start
		List<OfferOfHealthInsuranceCoverage> offerOfHealthInsuranceCoverageList = new ArrayList<>();
		if (rs.getArray("offersofcoverage") != null) {
			List<Integer> offersofcoverageList = Arrays.asList((Integer[]) rs.getArray("offersofcoverage").getArray());
			for (int offersofcoverageId : offersofcoverageList) {
				OfferOfHealthInsuranceCoverage offerOfHealthInsuranceCoverage = new OfferOfHealthInsuranceCoverage();
				offerOfHealthInsuranceCoverage.setOohicid(offersofcoverageId);
				offerOfHealthInsuranceCoverageList.add(offerOfHealthInsuranceCoverage);
			}
			tax1095C.setOffersOfCoverage(offerOfHealthInsuranceCoverageList);
		}
//		OfferOfHealthInsuranceCoverage End

		return tax1095C;
	}

}
