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
import com.fdx.api.model46.modelimpl.Tax1099Misc;

public class Tax1099MiscRowMapper implements RowMapper<Tax1099Misc> {

	@Override
	public Tax1099Misc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tax1099Misc tax1099Misc = new Tax1099Misc();
		tax1099Misc.setAccountNumber(rs.getString("accountNumber"));
		tax1099Misc.setCropInsurance(rs.getDouble("cropInsurance"));
		tax1099Misc.setExcessGolden(rs.getDouble("excessGolden"));
		tax1099Misc.setFederalTaxWithheld(rs.getDouble("federalTaxWithheld"));
		tax1099Misc.setFishingBoatProceeds(rs.getDouble("fishingBoatProceeds"));
		if (!(rs.getString("foreignAccountTaxCompliance") == null))
			tax1099Misc.setForeignAccountTaxCompliance(rs.getBoolean("foreignAccountTaxCompliance"));
		tax1099Misc.setGrossAttorney(rs.getDouble("grossAttorney"));
		tax1099Misc.setMedicalHealthPayment(rs.getDouble("medicalHealthPayment"));
		tax1099Misc.setNonEmployeeCompensation(rs.getDouble("nonEmployeeCompensation"));
		tax1099Misc.setNonQualifiedDeferredCompensation(rs.getDouble("nonQualifiedDeferredCompensation"));
		tax1099Misc.setOtherIncome(rs.getDouble("otherIncome"));
		if (!(rs.getString("payerDirectSales") == null))
			tax1099Misc.setPayerDirectSales(rs.getBoolean("payerDirectSales"));
		tax1099Misc.setPayerTin(rs.getString("payerTin"));
		tax1099Misc.setRecipientTin(rs.getString("recipientTin"));
		tax1099Misc.setRents(rs.getDouble("rents"));
		tax1099Misc.setRoyalties(rs.getDouble("royalties"));
		tax1099Misc.setSection409ADeferrals(rs.getDouble("section409aDeferrals"));
		tax1099Misc.setSection409AIncome(rs.getDouble("section409aIncome"));
		tax1099Misc.setSubstitutePayments(rs.getDouble("substitutePayments"));

//		payeeNameAddress Start
		NameAddressPhone payerNameAddress = new NameAddressPhone();
		if (rs.getInt("payerNameAddress") != 0) {
			payerNameAddress.setNameAddressId(rs.getInt("payerNameAddress"));
			tax1099Misc.setPayerNameAddress(payerNameAddress);
		}
//		DonorNameAddress End

//		recipientNameAddress Start
		NameAddress recipientNameAddress = new NameAddress();
		if (rs.getInt("payerNameAddress") != 0) {
			recipientNameAddress.setNameAddressId(rs.getInt("recipientNameAddress"));
			tax1099Misc.setRecipientNameAddress(recipientNameAddress);
		}
//		recipientNameAddress End

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
			tax1099Misc.setStateTaxWithholding(statetaxwithholdingResponseList);
		}
//		StateTaxWithholding End

		return tax1099Misc;
	}

}
