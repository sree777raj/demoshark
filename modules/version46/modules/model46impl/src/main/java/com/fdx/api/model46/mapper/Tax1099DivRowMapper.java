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
import com.fdx.api.model46.modelimpl.Tax1099Div;

public class Tax1099DivRowMapper implements RowMapper<Tax1099Div> {

	@Override
	public Tax1099Div mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tax1099Div tax1099Div = new Tax1099Div();
		tax1099Div.setAccountNumber(rs.getString("accountNumber"));
		tax1099Div.setCashLiquidation(rs.getDouble("cashLiquidation"));
		tax1099Div.setCollectiblesGain(rs.getDouble("collectiblesGain"));
		tax1099Div.setFederalTaxWithheld(rs.getDouble("federalTaxWithheld"));
		if (!(rs.getString("foreignAccountTaxCompliance") == null))
			tax1099Div.setForeignAccountTaxCompliance(rs.getBoolean("foreignAccountTaxCompliance"));
		tax1099Div.setForeignCountry(rs.getString("foreignCountry"));
		tax1099Div.setForeignTaxPaid(rs.getDouble("foreignTaxPaid"));
		tax1099Div.setInvestmentExpenses(rs.getDouble("investmentExpenses"));
		tax1099Div.setNonCashLiquidation(rs.getDouble("nonCashLiquidation"));
		tax1099Div.setNonTaxableDistribution(rs.getDouble("nonTaxableDistribution"));
		tax1099Div.setOrdinaryDividends(rs.getDouble("ordinaryDividends"));
		tax1099Div.setPayerTin(rs.getString("payerTin"));
		tax1099Div.setQualifiedDividends(rs.getDouble("qualifiedDividends"));
		tax1099Div.setRecipientTin(rs.getString("recipientTin"));
		if (!(rs.getString("secondTinNotice") == null))
			tax1099Div.setSecondTinNotice(rs.getBoolean("secondTinNotice"));
		tax1099Div.setSection1202Gain(rs.getDouble("section1202Gain"));
		tax1099Div.setSection199ADividends(rs.getDouble("section199aDividends"));
		tax1099Div.setSpecifiedPabInterestDividend(rs.getDouble("specifiedPabInterestDividend"));
		tax1099Div.setTaxExemptInterestDividend(rs.getDouble("taxExemptInterestDividend"));
		tax1099Div.setTotalCapitalGain(rs.getDouble("totalCapitalGain"));
		tax1099Div.setUnrecaptured1250Gain(rs.getDouble("unrecaptured1250Gain"));

//		foreignIncomes Start
		List<DescriptionAmount> foreignIncomessResponseList = new ArrayList<>();
		if (rs.getArray("foreignIncomes") != null) {
			List<Integer> foreignIncomesList = Arrays.asList((Integer[]) rs.getArray("foreignIncomes").getArray());
			for (int foreignIncomes : foreignIncomesList) {
				DescriptionAmount descriptionAmount = new DescriptionAmount();
				descriptionAmount.setDescAmountId(foreignIncomes);
				foreignIncomessResponseList.add(descriptionAmount);
			}
			tax1099Div.setForeignIncomes(foreignIncomessResponseList);
		}
//		foreignIncomes End

//		DonorNameAddress Start
		NameAddress recipientNameAddress = new NameAddress();
		if (rs.getInt("recipientNameAddress") != 0) {
			recipientNameAddress.setNameAddressId(rs.getInt("recipientNameAddress"));
			tax1099Div.setRecipientNameAddress(recipientNameAddress);
		}
//		DonorNameAddress End

//		DoneeNameAddress Start
		NameAddressPhone payerNameAddress = new NameAddressPhone();
		if (rs.getInt("payerNameAddress") != 0) {
			payerNameAddress.setNameAddressId(rs.getInt("payerNameAddress"));
			tax1099Div.setPayerNameAddress(payerNameAddress);
		}
//		DoneeNameAddress End

//		stateTaxExemptIncomes Start
		List<DescriptionAmount> stateTaxExemptIncomesResponseList = new ArrayList<>();
		if (rs.getArray("stateTaxExemptIncomes") != null) {
			List<Integer> stateTaxExemptIncomesList = Arrays
					.asList((Integer[]) rs.getArray("stateTaxExemptIncomes").getArray());
			for (int stateTaxExemptIncomesId : stateTaxExemptIncomesList) {
				DescriptionAmount descriptionAmount = new DescriptionAmount();
				descriptionAmount.setDescAmountId(stateTaxExemptIncomesId);
				stateTaxExemptIncomesResponseList.add(descriptionAmount);
			}
			tax1099Div.setStateTaxExemptIncomes(foreignIncomessResponseList);
		}
//		stateTaxExemptIncomes End

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
			tax1099Div.setStateTaxWithholding(statetaxwithholdingResponseList);
		}
//		StateTaxWithholding End 

		return tax1099Div;
	}

}
