package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.NameAddress;
import com.fdx.api.model46.modelimpl.NameAddressPhone;
import com.fdx.api.model46.modelimpl.Tax1098E;

public class Tax1098ERowMapper implements RowMapper<Tax1098E> {

	@Override
	public Tax1098E mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tax1098E tax1098E = new Tax1098E();
		tax1098E.setAccountNumber(rs.getString("accountNumber"));
		tax1098E.setBorrowerTin(rs.getString("borrowerTin"));
		if (!(rs.getString("box1ExcludesFees") == null))
			tax1098E.setBox1ExcludesFees(rs.getBoolean("box1ExcludesFees"));
		tax1098E.setLenderTin(rs.getString("lenderTin"));
		tax1098E.setStudentLoanInterest(rs.getDouble("studentLoanInterest"));

//		borrowerNameAddress Start
		NameAddress borrowerNameAddress = new NameAddress();
		if (rs.getInt("borrowerNameAddress") != 0) {
			borrowerNameAddress.setNameAddressId(rs.getInt("borrowerNameAddress"));
			tax1098E.setBorrowerNameAddress(borrowerNameAddress);
		}
//		borrowerNameAddress End

//		DoneeNameAddress Start
		NameAddressPhone lenderNameAddress = new NameAddressPhone();
		if (rs.getInt("lenderNameAddress") != 0) {
			lenderNameAddress.setNameAddressId(rs.getInt("lenderNameAddress"));
			tax1098E.setLenderNameAddress(lenderNameAddress);
		}
//		DoneeNameAddress End

		return tax1098E;
	}

}
