package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.NameAddress;
import com.fdx.api.model46.modelimpl.NameAddressPhone;
import com.fdx.api.model46.modelimpl.Tax1099Sb;

public class Tax1099SbRowMapper implements RowMapper<Tax1099Sb> {

	@Override
	public Tax1099Sb mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tax1099Sb tax1099Sb = new Tax1099Sb();
		tax1099Sb.setIssuerTin(rs.getString("issuerTin"));
		tax1099Sb.setContractInvestment(rs.getDouble("contractInvestment"));
		tax1099Sb.setPolicyNumber(rs.getString("policyNumber"));
		tax1099Sb.setSellerTin(rs.getString("sellerTin"));
		tax1099Sb.setSurrenderAmount(rs.getDouble("surrenderAmount"));

//		issuerNameAddress Start
		NameAddressPhone issuerNameAddress = new NameAddressPhone();
		if (rs.getInt("issuerNameAddress") != 0) {
			issuerNameAddress.setNameAddressId(rs.getInt("issuerNameAddress"));
			tax1099Sb.setIssuerNameAddress(issuerNameAddress);
		}
//		issuerNameAddress End

//		sellerNameAddress Start
		NameAddress sellerNameAddress = new NameAddress();
		if (rs.getInt("sellerNameAddress") != 0) {
			sellerNameAddress.setNameAddressId(rs.getInt("sellerNameAddress"));
			tax1099Sb.setSellerNameAddress(sellerNameAddress);
		}
//		sellerNameAddress End

//		contactNameAddress Start
		NameAddressPhone contactNameAddress = new NameAddressPhone();
		if (rs.getInt("contactNameAddress") != 0) {
			contactNameAddress.setNameAddressId(rs.getInt("contactNameAddress"));
			tax1099Sb.setContactNameAddress(contactNameAddress);
		}
//		contactNameAddress End

		return tax1099Sb;
	}

}
