package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.NameAddress;
import com.fdx.api.model46.modelimpl.NameAddressPhone;
import com.fdx.api.model46.modelimpl.Tax1098Ma;

public class Tax1098MaRowMapper implements RowMapper<Tax1098Ma> {

	@Override
	public Tax1098Ma mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tax1098Ma tax1098Ma = new Tax1098Ma();
		tax1098Ma.setAccountNumber(rs.getString("accountNumber"));
		tax1098Ma.setFilerTin(rs.getString("filerTin"));
		tax1098Ma.setHomeownerMortgagePayments(rs.getDouble("homeownerMortgagePayments"));
		tax1098Ma.setHomeownerTin(rs.getString("homeownerTin"));
		tax1098Ma.setTotalMortgagePayments(rs.getDouble("totalMortgagePayments"));

//		HomeownerNameAddress Start
		NameAddress homeownerNameAddress = new NameAddress();
		if (rs.getInt("homeownerNameAddress") != 0) {
			homeownerNameAddress.setNameAddressId(rs.getInt("homeownerNameAddress"));
			tax1098Ma.setHomeownerNameAddress(homeownerNameAddress);
		}
//		HomeownerNameAddress End

//		FilerNameAddress Start
		NameAddressPhone filerNameAddress = new NameAddressPhone();
		if (rs.getInt("filerNameAddress") != 0) {
			filerNameAddress.setNameAddressId(rs.getInt("filerNameAddress"));
			tax1098Ma.setFilerNameAddress(filerNameAddress);
		}
//		FilerNameAddress End	

		return tax1098Ma;
	}

}
