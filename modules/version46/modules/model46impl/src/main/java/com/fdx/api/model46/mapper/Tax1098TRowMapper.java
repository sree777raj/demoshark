package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.NameAddress;
import com.fdx.api.model46.modelimpl.NameAddressPhone;
import com.fdx.api.model46.modelimpl.Tax1098T;

public class Tax1098TRowMapper implements RowMapper<Tax1098T> {

	@Override
	public Tax1098T mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tax1098T tax1098T = new Tax1098T();
		tax1098T.setAccountNumber(rs.getString("accountNumber"));
		tax1098T.setAdjustmentPriorYear(rs.getDouble("adjustmentPriorYear"));
		tax1098T.setAdjustScholarship(rs.getDouble("adjustScholarship"));
		tax1098T.setFilerTin(rs.getString("filerTin"));
		if (!(rs.getString("graduate") == null))
			tax1098T.setGraduate(rs.getBoolean("graduate"));
		if (!(rs.getString("halfTime") == null))
			tax1098T.setHalfTime(rs.getBoolean("halfTime"));
		if (!(rs.getString("includeJanMar") == null))
			tax1098T.setIncludeJanMar(rs.getBoolean("includeJanMar"));
		tax1098T.setInsuranceRefund(rs.getDouble("insuranceRefund"));
		tax1098T.setQualifiedTuitionFees(rs.getDouble("qualifiedTuitionFees"));
		tax1098T.setScholarship(rs.getDouble("scholarship"));
		tax1098T.setStudentTin(rs.getString("studentTin"));
		if (!(rs.getString("studentTinCertification") == null))
			tax1098T.setStudentTinCertification(rs.getBoolean("studentTinCertification"));

//		studentNameAddress Start
		NameAddress studentNameAddress = new NameAddress();
		if (rs.getInt("studentNameAddress") != 0) {
			studentNameAddress.setNameAddressId(rs.getInt("studentNameAddress"));
			tax1098T.setStudentNameAddress(studentNameAddress);
		}
//		studentNameAddress End

//		issuerNameAddress Start
		NameAddressPhone filerNameAddress = new NameAddressPhone();
		if (rs.getInt("filerNameAddress") != 0) {
			filerNameAddress.setNameAddressId(rs.getInt("filerNameAddress"));
			tax1098T.setFilerNameAddress(filerNameAddress);
		}
//		issuerNameAddress End

		return tax1098T;
	}

}
