package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.NameAddress;
import com.fdx.api.model46.modelimpl.NameAddressPhone;
import com.fdx.api.model46.modelimpl.Tax1099Cap;

public class Tax1099CapRowMapper implements RowMapper<Tax1099Cap> {

	@Override
	public Tax1099Cap mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tax1099Cap tax1099Cap = new Tax1099Cap();
		tax1099Cap.setAccountNumber(rs.getString("accountNumber"));
		tax1099Cap.setAggregateAmount(rs.getDouble("aggregateAmount"));
		tax1099Cap.setCorporationTin(rs.getString("corporationTin"));
		tax1099Cap.setDateOfSale(rs.getDate("dateOfSale"));
		tax1099Cap.setNumberOfShares(rs.getDouble("numberOfShares"));
		tax1099Cap.setShareholderTin(rs.getString("shareholderTin"));
		tax1099Cap.setStockClasses(rs.getString("stockClasses"));

//		corporationNameAddress Start
		NameAddressPhone corporationNameAddress = new NameAddressPhone();
		if (rs.getInt("corporationNameAddress") != 0) {
			corporationNameAddress.setNameAddressId(rs.getInt("corporationNameAddress"));
			tax1099Cap.setCorporationNameAddress(corporationNameAddress);
		}
//		corporationNameAddress End

//		DoneeNameAddress Start
		NameAddress shareholderNameAddress = new NameAddress();
		if (rs.getInt("shareholderNameAddress") != 0) {
			shareholderNameAddress.setNameAddressId(rs.getInt("shareholderNameAddress"));
			tax1099Cap.setShareholderNameAddress(shareholderNameAddress);
		}
//		DoneeNameAddress End

		return tax1099Cap;
	}

}
