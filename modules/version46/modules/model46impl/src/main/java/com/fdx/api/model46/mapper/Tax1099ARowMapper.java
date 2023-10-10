package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.NameAddress;
import com.fdx.api.model46.modelimpl.NameAddressPhone;
import com.fdx.api.model46.modelimpl.Tax1099A;

public class Tax1099ARowMapper implements RowMapper<Tax1099A> {

	@Override
	public Tax1099A mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tax1099A tax1099a = new Tax1099A();
		tax1099a.setAccountNumber(rs.getString("accountNumber"));
		tax1099a.setBorrowerTin(rs.getString("borrowerTin"));
		tax1099a.setDateOfAcquisition(rs.getDate("dateOfAcquisition"));
		tax1099a.setFairMarketValue(rs.getDouble("fairMarketValue"));
		tax1099a.setLenderTin(rs.getString("lenderTin"));
		if (!(rs.getString("personallyLiable") == null))
			tax1099a.setPersonallyLiable(rs.getBoolean("personallyLiable"));
		tax1099a.setPrincipalBalance(rs.getDouble("principalBalance"));
		tax1099a.setPropertyDescription(rs.getString("propertyDescription"));

//		borrowerNameAddress Start
		NameAddress borrowerNameAddress = new NameAddress();
		if (rs.getInt("borrowerNameAddress") != 0) {
			borrowerNameAddress.setNameAddressId(rs.getInt("borrowerNameAddress"));
			tax1099a.setBorrowerNameAddress(borrowerNameAddress);
		}
//		borrowerNameAddress End

//		issuerNameAddress Start
		NameAddressPhone lenderNameAddress = new NameAddressPhone();
		if (rs.getInt("lenderNameAddress") != 0) {
			lenderNameAddress.setNameAddressId(rs.getInt("lenderNameAddress"));
			tax1099a.setLenderNameAddress(lenderNameAddress);
		}
//		issuerNameAddress End

		return tax1099a;
	}

}
