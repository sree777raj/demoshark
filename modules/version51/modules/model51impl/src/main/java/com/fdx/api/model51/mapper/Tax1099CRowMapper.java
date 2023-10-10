package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.NameAddress;
import com.fdx.api.model51.modelimpl.NameAddressPhone;
import com.fdx.api.model51.modelimpl.Tax1099C;

public class Tax1099CRowMapper implements RowMapper<Tax1099C> {

	@Override
	public Tax1099C mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tax1099C tax1099C = new Tax1099C();
		tax1099C.setAccountNumber(rs.getString("accountNumber"));
		tax1099C.setAmountDischarged(rs.getDouble("amountDischarged"));
		tax1099C.setCreditorTin(rs.getString("creditorTin"));
		tax1099C.setDateOfEvent(rs.getDate("dateOfEvent"));
		tax1099C.setDebtCode(rs.getString("debtCode"));
		tax1099C.setDebtDescription(rs.getString("debtDescription"));
		tax1099C.setDebtorTin(rs.getString("debtorTin"));
		tax1099C.setFairMarketValue(rs.getDouble("fairMarketValue"));
		tax1099C.setInterestIncluded(rs.getDouble("interestIncluded"));
		if (!(rs.getString("personallyLiable") == null))
			tax1099C.setPersonallyLiable(rs.getBoolean("personallyLiable"));

//		DonorNameAddress Start
		NameAddress debtorNameAddress = new NameAddress();
		if (rs.getInt("debtorNameAddress") != 0) {
			debtorNameAddress.setNameAddressId(rs.getInt("debtorNameAddress"));
			tax1099C.setDebtorNameAddress(debtorNameAddress);
		}
//		DonorNameAddress End

//		creditorNameAddress Start
		NameAddressPhone creditorNameAddress = new NameAddressPhone();
		if (rs.getInt("creditorNameAddress") != 0) {
			creditorNameAddress.setNameAddressId(rs.getInt("creditorNameAddress"));
			tax1099C.setCreditorNameAddress(creditorNameAddress);
		}
//		creditorNameAddress End

		return tax1099C;
	}

}
