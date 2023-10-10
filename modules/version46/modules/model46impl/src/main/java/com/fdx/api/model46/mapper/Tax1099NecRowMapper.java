package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.NameAddress;
import com.fdx.api.model46.modelimpl.NameAddressPhone;
import com.fdx.api.model46.modelimpl.StateTaxWithholding;
import com.fdx.api.model46.modelimpl.Tax1099Nec;

public class Tax1099NecRowMapper implements RowMapper<Tax1099Nec> {

	@Override
	public Tax1099Nec mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tax1099Nec tax1099Nec = new Tax1099Nec();
		tax1099Nec.setAccountNumber(rs.getString("accountNumber"));
		tax1099Nec.setFederalTaxWithheld(rs.getDouble("federalTaxWithheld"));
		if (!(rs.getString("foreignAccountTaxCompliance") == null))
			tax1099Nec.setForeignAccountTaxCompliance(rs.getBoolean("foreignAccountTaxCompliance"));
		tax1099Nec.setNonEmployeeCompensation(rs.getDouble("nonEmployeeCompensation"));
		tax1099Nec.setPayerTin(rs.getString("payerTin"));
		tax1099Nec.setRecipientTin(rs.getString("recipientTin"));
		if (!(rs.getString("secondTinNotice") == null))
			tax1099Nec.setSecondTinNotice(rs.getBoolean("secondTinNotice"));

//		setPayerNameAddress Start
		NameAddressPhone payerNameAddress = new NameAddressPhone();
		if (rs.getInt("payerNameAddress") != 0) {
			payerNameAddress.setNameAddressId(rs.getInt("payerNameAddress"));
			tax1099Nec.setPayerNameAddress(payerNameAddress);
		}
//		setPayerNameAddress End

//		recipientNameAddress Start
		NameAddress recipientNameAddress = new NameAddress();
		if (rs.getInt("recipientNameAddress") != 0) {
			recipientNameAddress.setNameAddressId(rs.getInt("recipientNameAddress"));
			tax1099Nec.setRecipientNameAddress(recipientNameAddress);
		}
//		filerNameAddress End

//		StateTaxWithholding Start
		List<StateTaxWithholding> statetaxwithholdingResponseList = new ArrayList<>();
		if (rs.getArray("statetaxwithholding") != null) {
			List<Integer> statetaxwithholdingList = Arrays
					.asList((Integer[]) rs.getArray("statetaxwithholding").getArray());
			for (int statetaxwithholdingId : statetaxwithholdingList) {
				StateTaxWithholding stateTaxWithholding = new StateTaxWithholding();
				stateTaxWithholding.setStwithheldid(statetaxwithholdingId);
				statetaxwithholdingResponseList.add(stateTaxWithholding);
			}
			tax1099Nec.setStateTaxWithholding(statetaxwithholdingResponseList);
		}
//		StateTaxWithholding End
		return tax1099Nec;
	}

}
