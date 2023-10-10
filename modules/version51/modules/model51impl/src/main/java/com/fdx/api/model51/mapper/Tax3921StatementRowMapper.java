package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.NameAddress;
import com.fdx.api.model51.modelimpl.Tax3921;

public class Tax3921StatementRowMapper implements RowMapper<Tax3921> {

	@Override
	public Tax3921 mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tax3921 tax3921 = new Tax3921();
		tax3921.setAccountNumber(rs.getString("accountNumber"));
		tax3921.setCorporateTin(rs.getString("corporateTin"));
		tax3921.setEmployeeTin(rs.getString("employeeTin"));
		tax3921.setExerciseMarketValue(rs.getDouble("exerciseMarketValue"));
		tax3921.setExercisePrice(rs.getDouble("exercisePrice"));
		tax3921.setNumberOfShares(rs.getDouble("numberOfShares"));
		tax3921.setOptionExerciseDate(rs.getDate("optionExerciseDate"));
		tax3921.setOptionGrantDate(rs.getDate("optionGrantDate"));
		tax3921.setTransferorTin(rs.getString("transferorTin"));

//		CorporateNameAddress Start
		NameAddress nameAddress = new NameAddress();
		if (rs.getInt("corporateNameAddress") != 0) {
			nameAddress.setNameAddressId(rs.getInt("corporateNameAddress"));
			tax3921.setCorporateNameAddress(nameAddress);
		}
//		CorporateNameAddress End

//		EmployeeNameAddress Start
		NameAddress nameAddressEmployee = new NameAddress();
		if (rs.getInt("employeeNameAddress") != 0) {
			nameAddressEmployee.setNameAddressId(rs.getInt("employeeNameAddress"));
			tax3921.setEmployeeNameAddress(nameAddressEmployee);
		}
//		EmployeeNameAddress End

//		transferorNameAddress Start
		NameAddress nameAddressTransferor = new NameAddress();
		if (rs.getInt("transferorNameAddress") != 0) {
			nameAddressTransferor.setNameAddressId(rs.getInt("transferorNameAddress"));
			tax3921.setTransferorNameAddress(nameAddressTransferor);
		}
//		transferorNameAddress End

		return tax3921;
	}

}
