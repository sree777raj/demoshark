package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.NameAddress;
import com.fdx.api.model51.modelimpl.NameAddressPhone;
import com.fdx.api.model51.modelimpl.Tax1099Ls;

public class Tax1099LsRowMapper implements RowMapper<Tax1099Ls> {

	@Override
	public Tax1099Ls mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tax1099Ls tax1099Ls = new Tax1099Ls();
		tax1099Ls.setAcquirerTin(rs.getString("acquirerTin"));
		tax1099Ls.setIssuerName(rs.getString("issuerName"));
		tax1099Ls.setPayment(rs.getDouble("payment"));
		tax1099Ls.setPolicyNumber(rs.getString("policyNumber"));
		tax1099Ls.setRecipientTin(rs.getString("recipientTin"));
		tax1099Ls.setSaleDate(rs.getDate("saleDate"));

//		recipientNameAddress Start
		NameAddress recipientNameAddress = new NameAddress();
		if (rs.getInt("recipientNameAddress") != 0) {
			recipientNameAddress.setNameAddressId(rs.getInt("recipientNameAddress"));
			tax1099Ls.setRecipientNameAddress(recipientNameAddress);
		}
//		recipientNameAddress End

//		acquirerNameAddress Start
		NameAddressPhone acquirerNameAddress = new NameAddressPhone();
		if (rs.getInt("acquirerNameAddress") != 0) {
			acquirerNameAddress.setNameAddressId(rs.getInt("acquirerNameAddress"));
			tax1099Ls.setAcquirerNameAddress(acquirerNameAddress);
		}
//		acquirerNameAddress End

//		contactNameAddress Start
		NameAddressPhone contactNameAddress = new NameAddressPhone();
		if (rs.getInt("contactNameAddress") != 0) {
			contactNameAddress.setNameAddressId(rs.getInt("contactNameAddress"));
			tax1099Ls.setContactNameAddress(contactNameAddress);
		}
//		contactNameAddress End

		return tax1099Ls;
	}

}
