package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.NameAddress;
import com.fdx.api.model46.modelimpl.Tax5498Qa;

public class Tax5498QaStatementRowMapper implements RowMapper<Tax5498Qa> {

	@Override
	public Tax5498Qa mapRow(ResultSet rs, int rowNum) throws SQLException {

		Tax5498Qa tax5498Qa = new Tax5498Qa();
		tax5498Qa.setAbleContributions(rs.getDouble("ableContributions"));
		tax5498Qa.setAccountNumber(rs.getString("accountNumber"));
		tax5498Qa.setBasisOfDisabilityCode(rs.getString("basisOfDisabilityCode"));
		tax5498Qa.setBeneficiaryTin(rs.getString("beneficiaryTin"));
		tax5498Qa.setCumulativeContributions(rs.getDouble("cumulativeContributions"));
		tax5498Qa.setFairMarketValue(rs.getDouble("fairMarketValue"));
		tax5498Qa.setIssuerTin(rs.getString("issuerTin"));
		if (!(rs.getString("openedInTaxYear") == null))
			tax5498Qa.setOpenedInTaxYear(rs.getBoolean("openedInTaxYear"));
		tax5498Qa.setRollovers(rs.getDouble("rollovers"));
		tax5498Qa.setTypeOfDisabilityCode(rs.getString("typeOfDisabilityCode"));

//		BenificiaryNameAddress Start
		NameAddress benificiaryNameAddress = new NameAddress();
		if (rs.getInt("beneficiaryNameAddress") != 0) {
			benificiaryNameAddress.setNameAddressId(rs.getInt("beneficiaryNameAddress"));
			tax5498Qa.setBeneficiaryNameAddress(benificiaryNameAddress);
		}
//		BenificiaryNameAddress End

//		IssuerNameAddress Start
		NameAddress nameAddressIssuer = new NameAddress();
		if (rs.getInt("issuerNameAddress") != 0) {
			nameAddressIssuer.setNameAddressId(rs.getInt("issuerNameAddress"));
			tax5498Qa.setIssuerNameAddress(nameAddressIssuer);
		}
//		IssuerNameAddress End

		return tax5498Qa;
	}

}
