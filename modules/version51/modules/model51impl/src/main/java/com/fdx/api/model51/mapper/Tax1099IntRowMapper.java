package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.DescriptionAmount;
import com.fdx.api.model51.modelimpl.NameAddress;
import com.fdx.api.model51.modelimpl.NameAddressPhone;
import com.fdx.api.model51.modelimpl.StateTaxWithholding;
import com.fdx.api.model51.modelimpl.Tax1099Int;

public class Tax1099IntRowMapper implements RowMapper<Tax1099Int> {

	@Override
	public Tax1099Int mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tax1099Int tax1099Int = new Tax1099Int();
		tax1099Int.setAccountNumber(rs.getString("accountNumber"));
		tax1099Int.setBondPremium(rs.getDouble("bondPremium"));
		tax1099Int.setCusipNumber(rs.getString("cusipNumber"));
		tax1099Int.setEarlyWithdrawalPenalty(rs.getDouble("earlyWithdrawalPenalty"));
		tax1099Int.setFederalTaxWithheld(rs.getDouble("federalTaxWithheld"));
		if (!(rs.getString("foreignAccountTaxCompliance") == null))
			tax1099Int.setForeignAccountTaxCompliance(rs.getBoolean("foreignAccountTaxCompliance"));
		tax1099Int.setForeignCountry(rs.getString("foreignCountry"));
		tax1099Int.setForeignTaxPaid(rs.getDouble("foreignTaxPaid"));
		tax1099Int.setInterestIncome(rs.getDouble("interestIncome"));
		tax1099Int.setInvestmentExpenses(rs.getDouble("investmentExpenses"));
		tax1099Int.setMarketDiscount(rs.getDouble("marketDiscount"));
		tax1099Int.setPayerRtn(rs.getString("payerRtn"));
		tax1099Int.setPayerTin(rs.getString("payerTin"));
		tax1099Int.setRecipientTin(rs.getString("recipientTin"));
		if (!(rs.getString("secondTinNotice") == null))
			tax1099Int.setSecondTinNotice(rs.getBoolean("secondTinNotice"));
		tax1099Int.setSpecifiedPabInterest(rs.getDouble("specifiedPabInterest"));
		tax1099Int.setTaxExemptBondPremium(rs.getDouble("taxExemptBondPremium"));
		tax1099Int.setTaxExemptInterest(rs.getDouble("taxExemptInterest"));
		tax1099Int.setUsBondInterest(rs.getDouble("usBondInterest"));
		tax1099Int.setUsBondPremium(rs.getDouble("usBondPremium"));

//		payerNameAddress Start
		NameAddressPhone payerNameAddress = new NameAddressPhone();
		if (rs.getInt("payerNameAddress") != 0) {
			payerNameAddress.setNameAddressId(rs.getInt("payerNameAddress"));
			tax1099Int.setPayerNameAddress(payerNameAddress);
		}
//		payerNameAddress End

//		recipientNameAddress Start
		NameAddress recipientNameAddress = new NameAddress();
		if (rs.getInt("recipientNameAddress") != 0) {
			recipientNameAddress.setNameAddressId(rs.getInt("recipientNameAddress"));
			tax1099Int.setRecipientNameAddress(recipientNameAddress);
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
			tax1099Int.setStateTaxWithholding(statetaxwithholdingResponseList);
		}
//		StateTaxWithholding End 

//		stateTaxExemptIncomes Start
		List<DescriptionAmount> stateTaxExemptIncomesResponseList = new ArrayList<>();
		if (rs.getArray("stateTaxExemptIncome") != null) {
			List<Integer> stateTaxExemptIncomesList = Arrays
					.asList((Integer[]) rs.getArray("stateTaxExemptIncome").getArray());
			for (int stateTaxExemptIncomesId : stateTaxExemptIncomesList) {
				DescriptionAmount descriptionAmount = new DescriptionAmount();
				descriptionAmount.setDescAmountId(stateTaxExemptIncomesId);
				stateTaxExemptIncomesResponseList.add(descriptionAmount);
			}
			tax1099Int.setStateTaxExemptIncome(stateTaxExemptIncomesResponseList);
		}
//		stateTaxExemptIncomes End

//		foreignIncomes Start
		List<DescriptionAmount> foreignIncomesResponseList = new ArrayList<>();
		if (rs.getArray("foreignIncomes") != null) {
			List<Integer> foreignIncomesList = Arrays.asList((Integer[]) rs.getArray("foreignIncomes").getArray());
			for (int foreignIncomesId : foreignIncomesList) {
				DescriptionAmount descriptionAmount = new DescriptionAmount();
				descriptionAmount.setDescAmountId(foreignIncomesId);
				foreignIncomesResponseList.add(descriptionAmount);
			}
			tax1099Int.setForeignIncomes(foreignIncomesResponseList);
		}
//		foreignIncomes End
		return tax1099Int;
	}

}
