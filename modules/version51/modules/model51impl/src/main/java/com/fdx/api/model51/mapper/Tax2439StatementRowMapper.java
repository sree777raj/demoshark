package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.NameAddress;
import com.fdx.api.model51.modelimpl.NameAddressPhone;
import com.fdx.api.model51.modelimpl.Tax2439;

public class Tax2439StatementRowMapper implements RowMapper<Tax2439> {

	@Override
	public Tax2439 mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tax2439 tax2439 = new Tax2439();
		tax2439.setCollectiblesGain(rs.getDouble("collectiblesGain"));
		tax2439.setFiscalYearBegin(rs.getDate("fiscalYearBegin"));
		tax2439.setFiscalYearEnd(rs.getDate("fiscalYearEnd"));
		tax2439.setRicOrReitTin(rs.getString("ricOrReitTin"));
		tax2439.setSection1202Gain(rs.getDouble("section1202Gain"));
		tax2439.setShareholderTin(rs.getString("shareholderTin"));
		tax2439.setTaxPaid(rs.getDouble("taxPaid"));
		tax2439.setUndistributedLongTermCapitalGains(rs.getDouble("undistributedLongTermCapitalGains"));
		tax2439.setUnrecaptured1250Gain(rs.getDouble("unrecaptured1250Gain"));

//		ricOrReitNameAddress Start
		NameAddressPhone nameAddressPhone = new NameAddressPhone();
		if (rs.getInt("ricOrReitNameAddress") != 0) {
			nameAddressPhone.setNameAddressId(rs.getInt("ricOrReitNameAddress"));
			tax2439.setRicOrReitNameAddress(nameAddressPhone);
		}
//		ricOrReitNameAddress End

//		shareholderNameAddress Start
		NameAddress nameAddress = new NameAddress();
		if (rs.getInt("shareholderNameAddress") != 0) {
			nameAddress.setNameAddressId(rs.getInt("shareholderNameAddress"));
			tax2439.setShareholderNameAddress(nameAddress);
		}
//		shareholderNameAddress End

		return tax2439;
	}

}
