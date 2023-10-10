package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.NameAddress;
import com.fdx.api.model51.modelimpl.NameAddressPhone;
import com.fdx.api.model51.modelimpl.Tax5498Esa;

public class Tax5498EsaStatementRowMapper implements RowMapper<Tax5498Esa> {

	@Override
	public Tax5498Esa mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tax5498Esa tax5498Esa = new Tax5498Esa();
		tax5498Esa.setAccountNumber(rs.getString("accountNumber"));
		tax5498Esa.setBeneficiaryTin(rs.getString("beneficiaryTin"));
		tax5498Esa.setCoverdellEsaContributions(rs.getDouble("coverdellEsaContributions"));
		tax5498Esa.setIssuerTin(rs.getString("issuerTin"));
		tax5498Esa.setParticipantTin(rs.getString("participantTin"));
		tax5498Esa.setRolloverContributions(rs.getDouble("rolloverContributions"));

//		IssuerNameAddress Start
		NameAddressPhone nameAddressPhone = new NameAddressPhone();
		if (rs.getInt("issuerNameAddress") != 0) {
			nameAddressPhone.setNameAddressId(rs.getInt("issuerNameAddress"));
			tax5498Esa.setIssuerNameAddress(nameAddressPhone);
		}
//		IssuerNameAddress End

//		BeneficiaryNameAddress Start
		NameAddress nameAddress = new NameAddress();
		if (rs.getInt("beneficiaryNameAddress") != 0) {
			nameAddress.setNameAddressId(rs.getInt("beneficiaryNameAddress"));
			tax5498Esa.setBeneficiaryNameAddress(nameAddress);
		}
//		BeneficiaryNameAddress End

		return tax5498Esa;
	}

}
