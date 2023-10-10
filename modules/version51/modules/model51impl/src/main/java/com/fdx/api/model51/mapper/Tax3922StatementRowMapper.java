package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.NameAddress;
import com.fdx.api.model51.modelimpl.Tax3922;

public class Tax3922StatementRowMapper implements RowMapper<Tax3922> {

	@Override
	public Tax3922 mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tax3922 tax3922 = new Tax3922();
		tax3922.setAccountNumber(rs.getString("accountNumber"));
		tax3922.setCorporationTin(rs.getString("corporationTin"));
		tax3922.setEmployeeTin(rs.getString("employeeTin"));
		tax3922.setExerciseMarketValue(rs.getDouble("exerciseMarketValue"));
		tax3922.setExercisePrice(rs.getDouble("exercisePrice"));
		tax3922.setGrantDateExercisePrice(rs.getDouble("grantDateExercisePrice"));
		tax3922.setGrantMarketValue(rs.getDouble("grantMarketValue"));
		tax3922.setNumberOfShares(rs.getDouble("numberOfShares"));
		tax3922.setOptionExerciseDate(rs.getDate("optionExerciseDate"));
		tax3922.setOptionGrantDate(rs.getDate("optionGrantDate"));
		tax3922.setTitleTransferDate(rs.getDate("titleTransferDate"));

//		CorporationNameAddress Start
		NameAddress nameAddress = new NameAddress();
		if (rs.getInt("corporationNameAddress") != 0) {
			nameAddress.setNameAddressId(rs.getInt("corporationNameAddress"));
			tax3922.setCorporationNameAddress(nameAddress);
		}
//		CorporationNameAddress End

//		EmployeeNameAddress Start
		NameAddress nameAddressEmployee = new NameAddress();
		if (rs.getInt("employeeNameAddress") != 0) {
			nameAddressEmployee.setNameAddressId(rs.getInt("employeeNameAddress"));
			tax3922.setEmployeeNameAddress(nameAddressEmployee);
		}
//		EmployeeNameAddress End
		return tax3922;
	}

}
