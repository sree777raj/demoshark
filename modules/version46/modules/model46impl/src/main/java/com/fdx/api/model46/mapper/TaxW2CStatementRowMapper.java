package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.Address;
import com.fdx.api.model46.modelimpl.IndividualName;
import com.fdx.api.model46.modelimpl.NameAddress;
import com.fdx.api.model46.modelimpl.TaxW2;
import com.fdx.api.model46.modelimpl.TaxW2C;

public class TaxW2CStatementRowMapper implements RowMapper<TaxW2C> {

	@Override
	public TaxW2C mapRow(ResultSet rs, int rowNum) throws SQLException {
		TaxW2C taxW2C = new TaxW2C();

		if (!(rs.getString("correctedTinOrName") == null))
			taxW2C.setCorrectedTinOrName(rs.getBoolean("correctedTinOrName"));
		taxW2C.setEmployeeTin(rs.getString("employeeTin"));
		taxW2C.setEmployerTin(rs.getString("employerTin"));
		taxW2C.setPreviousEmployeeTin(rs.getString("previousEmployeeTin"));

//		PreviousEmployeeName Start
		IndividualName individualName = new IndividualName();
		if (rs.getInt("previousEmployeeName") != 0) {
			individualName.setNameid(rs.getInt("previousEmployeeName"));
			taxW2C.setPreviousEmployeeName(individualName);
		}
//		PreviousEmployeeName End

//		EmployeeAddress Start
		Address address = new Address();
		if (rs.getInt("employeeAddress") != 0) {
			address.setAddressId(rs.getInt("employeeAddress"));
			taxW2C.setEmployeeAddress(address);
		}
//		EmployeeAddress End

//		EmployeeName Start
		IndividualName employeeName = new IndividualName();
		if (rs.getInt("employeeName") != 0) {
			employeeName.setNameid(rs.getInt("employeeName"));
			taxW2C.setEmployeeName(employeeName);
		}
//		EmployeeName End

//		EmployerNameAddress Start
		NameAddress nameAddress = new NameAddress();
		if (rs.getInt("employerNameAddress") != 0) {
			nameAddress.setNameAddressId(rs.getInt("employerNameAddress"));
			taxW2C.setEmployerNameAddress(nameAddress);
		}
//		EmployerNameAddress End

//		OriginalW2 Start
		TaxW2 taxW2Original = new TaxW2();
		if (rs.getInt("originalw2") != 0) {
			taxW2Original.setInternalId(rs.getInt("originalw2"));
			taxW2C.setOriginalW2(taxW2Original);
		}
//		OriginalW2 End

//		CorrectedW2 Start
		TaxW2 taxW2Corrected = new TaxW2();
		if (rs.getInt("correctedw2") != 0) {
			taxW2Corrected.setInternalId(rs.getInt("correctedw2"));
			taxW2C.setCorrectedW2(taxW2Corrected);
		}
//		CorrectedW2 End

		return taxW2C;
	}

}
