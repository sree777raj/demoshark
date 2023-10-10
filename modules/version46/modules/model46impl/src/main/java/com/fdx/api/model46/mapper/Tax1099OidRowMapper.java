package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.DescriptionAmount;
import com.fdx.api.model46.modelimpl.NameAddress;
import com.fdx.api.model46.modelimpl.NameAddressPhone;
import com.fdx.api.model46.modelimpl.StateTaxWithholding;
import com.fdx.api.model46.modelimpl.Tax1099Oid;

public class Tax1099OidRowMapper implements RowMapper<Tax1099Oid> {

	@Override
	public Tax1099Oid mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tax1099Oid tax1099Oid = new Tax1099Oid();
		tax1099Oid.setAccountNumber(rs.getString("accountNumber"));
		tax1099Oid.setAcquisitionPremium(rs.getDouble("acquisitionPremium"));
		tax1099Oid.setBondPremium(rs.getDouble("bondPremium"));
		tax1099Oid.setDiscountOnTreasuryObligations(rs.getDouble("discountOnTreasuryObligations"));
		tax1099Oid.setEarlyWithdrawalPenalty(rs.getDouble("earlyWithdrawalPenalty"));
		tax1099Oid.setFederalTaxWithheld(rs.getDouble("federalTaxWithheld"));
		if (!(rs.getString("foreignAccountTaxCompliance") == null))
			tax1099Oid.setForeignAccountTaxCompliance(rs.getBoolean("foreignAccountTaxCompliance"));
		tax1099Oid.setInvestmentExpenses(rs.getDouble("investmentExpenses"));
		tax1099Oid.setMarketDiscount(rs.getDouble("marketDiscount"));
		tax1099Oid.setOidDescription(rs.getString("oidDescription"));
		tax1099Oid.setOriginalIssueDiscount(rs.getDouble("originalIssueDiscount"));
		tax1099Oid.setOtherPeriodicInterest(rs.getDouble("otherPeriodicInterest"));
		tax1099Oid.setPayerTin(rs.getString("payerTin"));
		tax1099Oid.setRecipientTin(rs.getString("recipientTin"));
		if (!(rs.getString("secondTinNotice") == null))
			tax1099Oid.setSecondTinNotice(rs.getBoolean("secondTinNotice"));
		tax1099Oid.setTaxExemptOid(rs.getDouble("taxExemptOid"));

//		payeeNameAddress Start
		NameAddressPhone payerNameAddress = new NameAddressPhone();
		if (rs.getInt("payerNameAddress") != 0) {
			payerNameAddress.setNameAddressId(rs.getInt("payerNameAddress"));
			tax1099Oid.setPayerNameAddress(payerNameAddress);
		}
//		DonorNameAddress End

//		recipientNameAddress Start
		NameAddress recipientNameAddress = new NameAddress();
		if (rs.getInt("recipientNameAddress") != 0) {
			recipientNameAddress.setNameAddressId(rs.getInt("recipientNameAddress"));
			tax1099Oid.setRecipientNameAddress(recipientNameAddress);
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
			tax1099Oid.setStateTaxWithholding(statetaxwithholdingResponseList);
		}
//		StateTaxWithholding End

//		stateTaxExemptIncomes Start
		List<DescriptionAmount> stateTaxExemptIncomesResponseList = new ArrayList<>();
		if (rs.getArray("stateexemptoid") != null) {
			List<Integer> stateTaxExemptIncomesList = Arrays
					.asList((Integer[]) rs.getArray("stateexemptoid").getArray());
			for (int stateTaxExemptIncomesId : stateTaxExemptIncomesList) {
				DescriptionAmount descriptionAmount = new DescriptionAmount();
				descriptionAmount.setDescAmountId(stateTaxExemptIncomesId);
				stateTaxExemptIncomesResponseList.add(descriptionAmount);
			}
			tax1099Oid.setStateExemptOid(stateTaxExemptIncomesResponseList);
		}
//		stateTaxExemptIncomes End

		return tax1099Oid;
	}

}
