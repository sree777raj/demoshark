package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.NameAddress;
import com.fdx.api.model46.modelimpl.NameAddressPhone;
import com.fdx.api.model46.modelimpl.Tax1099S;

public class Tax1099SRowMapper implements RowMapper<Tax1099S> {

	@Override
	public Tax1099S mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tax1099S tax1099S = new Tax1099S();
		tax1099S.setAccountNumber(rs.getString("accountNumber"));
		tax1099S.setAddressOrLegalDescription(rs.getString("addressOrLegalDescription"));
		tax1099S.setDateOfClosing(rs.getDate("dateOfClosing"));
		tax1099S.setFilerTin(rs.getString("filerTin"));
		if (!(rs.getString("foreignPerson") == null))
			tax1099S.setForeignPerson(rs.getBoolean("foreignPerson"));
		tax1099S.setGrossProceeds(rs.getDouble("grossProceeds"));
		tax1099S.setRealEstateTax(rs.getDouble("realEstateTax"));
		if (!(rs.getString("receivedOtherConsideration") == null))
			tax1099S.setReceivedOtherConsideration(rs.getBoolean("receivedOtherConsideration"));
		tax1099S.setTransferorTin(rs.getString("transferorTin"));

//		filerNameAddress Start
		NameAddressPhone filerNameAddress = new NameAddressPhone();
		if (rs.getInt("filerNameAddress") != 0) {
			filerNameAddress.setNameAddressId(rs.getInt("filerNameAddress"));
			tax1099S.setFilerNameAddress(filerNameAddress);
		}
//		filerNameAddress End

//		transferorNameAddress Start
		NameAddress transferorNameAddress = new NameAddress();
		if (rs.getInt("transferorNameAddress") != 0) {
			transferorNameAddress.setNameAddressId(rs.getInt("transferorNameAddress"));
			tax1099S.setTransferorNameAddress(transferorNameAddress);
		}
//		transferorNameAddress End

		return tax1099S;
	}

}
