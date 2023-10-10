package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.CodeAmount;
import com.fdx.api.model46.modelimpl.NameAddress;
import com.fdx.api.model46.modelimpl.Tax1065K1;

public class Tax1065K1RowMapper implements RowMapper<Tax1065K1> {

	@Override
	public Tax1065K1 mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tax1065K1 tax1065K1 = new Tax1065K1();
		if (!(rs.getString("amendedK1") == null))
			tax1065K1.setAmendedK1(rs.getBoolean("amendedK1"));
		if (!(rs.getString("book704b") == null))
			tax1065K1.setBook704b(rs.getBoolean("book704b"));
		if (!(rs.getString("bookGaap") == null))
			tax1065K1.setBookGaap(rs.getBoolean("bookGaap"));
		if (!(rs.getString("bookOther") == null))
			tax1065K1.setBookOther(rs.getBoolean("bookOther"));
		tax1065K1.setBookOtherExplain(rs.getString("bookOtherExplain"));
		if (!(rs.getString("bookTax") == null))
			tax1065K1.setBookTax(rs.getBoolean("bookTax"));
		if (!(rs.getString("builtInGain") == null))
			tax1065K1.setBuiltInGain(rs.getBoolean("builtInGain"));
		tax1065K1.setCapitalAccountBegin(rs.getDouble("capitalAccountBegin"));
		tax1065K1.setCapitalAccountContributions(rs.getDouble("capitalAccountContributions"));
		tax1065K1.setCapitalAccountEnd(rs.getDouble("capitalAccountEnd"));
		tax1065K1.setCapitalAccountIncrease(rs.getDouble("capitalAccountIncrease"));
		tax1065K1.setCapitalAccountOther(rs.getDouble("capitalAccountOther"));
		tax1065K1.setCapitalAccountWithdrawals(rs.getDouble("capitalAccountWithdrawals"));
		tax1065K1.setCapitalShareBegin(rs.getDouble("capitalShareBegin"));
		tax1065K1.setCapitalShareEnd(rs.getDouble("capitalShareEnd"));
		tax1065K1.setCollectiblesGain(rs.getDouble("collectiblesGain"));
		if (!(rs.getString("decreaseDueToSaleOrExchange") == null))
			tax1065K1.setDecreaseDueToSaleOrExchange(rs.getBoolean("decreaseDueToSaleOrExchange"));
		if (!(rs.getString("disregardedEntity") == null))
			tax1065K1.setDisregardedEntity(rs.getBoolean("disregardedEntity"));
		tax1065K1.setDisregardedEntityName(rs.getString("disregardedEntityName"));
		tax1065K1.setDisregardedEntityTin(rs.getString("disregardedEntityTin"));
		tax1065K1.setDividendEquivalents(rs.getDouble("dividendEquivalents"));
		if (!(rs.getString("domestic") == null))
			tax1065K1.setDomestic(rs.getBoolean("domestic"));
		tax1065K1.setEntityType(rs.getString("entityType"));
		if (!(rs.getString("finalK1") == null))
			tax1065K1.setFinalK1(rs.getBoolean("finalK1"));
		tax1065K1.setFiscalYearBegin(rs.getDate("fiscalYearBegin"));
		tax1065K1.setFiscalYearEnd(rs.getDate("fiscalYearEnd"));
		tax1065K1.setForeignCountry(rs.getString("foreignCountry"));
		if (!(rs.getString("foreignpartner") == null))
			tax1065K1.setForeignPartner(rs.getBoolean("foreignpartner"));
		if (!(rs.getString("generalPartner") == null))
			tax1065K1.setGeneralPartner(rs.getBoolean("generalPartner"));
		tax1065K1.setGuaranteedPayment(rs.getDouble("guaranteedPayment"));
		tax1065K1.setGuaranteedPaymentCapital(rs.getDouble("guaranteedPaymentCapital"));
		tax1065K1.setGuaranteedPaymentCapital(rs.getDouble("guaranteedPaymentCapital"));
		tax1065K1.setGuaranteedPaymentServices(rs.getDouble("guaranteedPaymentServices"));
		if (!(rs.getString("includesLowerTierLiability") == null))
			tax1065K1.setIncludesLowerTierLiability(rs.getBoolean("includesLowerTierLiability"));
		tax1065K1.setInterestIncome(rs.getDouble("interestIncome"));
		tax1065K1.setIrsCenter(rs.getString("irsCenter"));
		if (!(rs.getString("limitedPartner") == null))
			tax1065K1.setLimitedPartner(rs.getBoolean("limitedPartner"));
		tax1065K1.setLossShareBegin(rs.getDouble("lossShareBegin"));
		tax1065K1.setLossShareEnd(rs.getDouble("lossShareEnd"));
		if (!(rs.getString("multipleAtRiskActivities") == null))
			tax1065K1.setMultipleAtRiskActivities(rs.getBoolean("multipleAtRiskActivities"));
		if (!(rs.getString("multiplePassiveActivities") == null))
			tax1065K1.setMultiplePassiveActivities(rs.getBoolean("multiplePassiveActivities"));
		tax1065K1.setNet1231Gain(rs.getDouble("net1231Gain"));
		tax1065K1.setNetLongTermGain(rs.getDouble("netLongTermGain"));
		tax1065K1.setNetRentalRealEstateIncome(rs.getDouble("netRentalRealEstateIncome"));
		tax1065K1.setNetShortTermGain(rs.getDouble("netShortTermGain"));
		tax1065K1.setNonrecourseLiabilityShareBegin(rs.getDouble("nonrecourseLiabilityShareBegin"));
		tax1065K1.setNonrecourseLiabilityShareEnd(rs.getDouble("nonrecourseLiabilityShareEnd"));
		tax1065K1.setOrdinaryDividends(rs.getDouble("ordinaryDividends"));
		tax1065K1.setOrdinaryIncome(rs.getDouble("ordinaryIncome"));
		tax1065K1.setOtherRentalIncome(rs.getDouble("otherRentalIncome"));
		tax1065K1.setPartnershipTin(rs.getString("partnershipTin"));
		tax1065K1.setPartnerTin(rs.getString("partnerTin"));
		tax1065K1.setProfitShareBegin(rs.getDouble("profitShareBegin"));
		tax1065K1.setProfitShareEnd(rs.getDouble("profitShareEnd"));
		if (!(rs.getString("publiclyTraded") == null))
			tax1065K1.setPubliclyTraded(rs.getBoolean("publiclyTraded"));
		tax1065K1.setQualifiedDividends(rs.getDouble("qualifiedDividends"));
		tax1065K1.setQualifiedLiabilityShareBegin(rs.getDouble("qualifiedLiabilityShareBegin"));
		tax1065K1.setQualifiedLiabilityShareEnd(rs.getDouble("qualifiedLiabilityShareEnd"));
		tax1065K1.setRecourseLiabilityShareBegin(rs.getDouble("recourseLiabilityShareBegin"));
		tax1065K1.setRecourseLiabilityShareEnd(rs.getDouble("recourseLiabilityShareEnd"));
		if (!(rs.getString("retirementPlan") == null))
			tax1065K1.setRetirementPlan(rs.getBoolean("retirementPlan"));
		tax1065K1.setRoyalties(rs.getDouble("royalties"));
		tax1065K1.setSection179Deduction(rs.getDouble("section179Deduction"));
		tax1065K1.setUnrecaptured1250Gain(rs.getDouble("unrecaptured1250Gain"));
		tax1065K1.setUnrecognizedSection704Begin(rs.getDouble("unrecognizedSection704Begin"));
		tax1065K1.setUnrecognizedSection704End(rs.getDouble("unrecognizedSection704End"));

//		Credits Start
		List<CodeAmount> creditsResponseList = new ArrayList<>();
		if (rs.getArray("credits") != null) {
			List<Integer> creditsList = Arrays.asList((Integer[]) rs.getArray("credits").getArray());
			for (int creditsId : creditsList) {
				CodeAmount codeAmount = new CodeAmount();
				codeAmount.setCodeAmountId(creditsId);
				creditsResponseList.add(codeAmount);
			}
			tax1065K1.setCredits(creditsResponseList);
		}
//		Credits End 

//		Distributions Start
		List<CodeAmount> distributionsResponseList = new ArrayList<>();
		if (rs.getArray("distributions") != null) {
			List<Integer> distributionsList = Arrays.asList((Integer[]) rs.getArray("distributions").getArray());
			for (int distributionsId : distributionsList) {
				CodeAmount codeAmount = new CodeAmount();
				codeAmount.setCodeAmountId(distributionsId);
				distributionsResponseList.add(codeAmount);
			}
			tax1065K1.setDistributions(distributionsResponseList);
		}
//		Distributions End	

//		ForeignTransactions Start
		List<CodeAmount> foreignTransactionsResponseList = new ArrayList<>();
		if (rs.getArray("foreignTransactions") != null) {
			List<Integer> foreignTransactionsList = Arrays
					.asList((Integer[]) rs.getArray("foreignTransactions").getArray());
			for (int foreignTransactionsId : foreignTransactionsList) {
				CodeAmount codeAmount = new CodeAmount();
				codeAmount.setCodeAmountId(foreignTransactionsId);
				foreignTransactionsResponseList.add(codeAmount);
			}
			tax1065K1.setForeignTransactions(foreignTransactionsResponseList);
		}
//		ForeignTransactions End	

//		PartnerNameAddress Start
		NameAddress partnernameaddress = new NameAddress();
		if (rs.getInt("partnernameaddress") != 0) {
			partnernameaddress.setNameAddressId(rs.getInt("partnernameaddress"));
			tax1065K1.setPartnerNameAddress(partnernameaddress);
		}
//		PartnerNameAddress End

//		PartnerShipNameAddress Start
		NameAddress partnerShipNameaddress = new NameAddress();
		if (rs.getInt("partnershipnameaddress") != 0) {
			partnerShipNameaddress.setNameAddressId(rs.getInt("partnershipnameaddress"));
			tax1065K1.setPartnershipNameAddress(partnerShipNameaddress);
		}
//		PartnerShipNameAddress End

//		OtherDeductions Start
		List<CodeAmount> otherDeductionsResponseList = new ArrayList<>();
		if (rs.getArray("otherdeductions") != null) {
			List<Integer> otherdeductionsList = Arrays.asList((Integer[]) rs.getArray("otherdeductions").getArray());
			for (int otherdeductionsId : otherdeductionsList) {
				CodeAmount codeAmount = new CodeAmount();
				codeAmount.setCodeAmountId(otherdeductionsId);
				otherDeductionsResponseList.add(codeAmount);
			}
			tax1065K1.setOtherDeductions(otherDeductionsResponseList);
		}
//		OtherDeductions End

//		OtherIncome Start
		List<CodeAmount> otherIncomeResponseList = new ArrayList<>();
		if (rs.getArray("otherIncome") != null) {
			List<Integer> otherIncomeList = Arrays.asList((Integer[]) rs.getArray("otherIncome").getArray());
			for (int otherIncomeId : otherIncomeList) {
				CodeAmount codeAmount = new CodeAmount();
				codeAmount.setCodeAmountId(otherIncomeId);
				otherIncomeResponseList.add(codeAmount);
			}
			tax1065K1.setOtherIncome(otherIncomeResponseList);
		}
//		OtherIncome End

//		OtherInfo Start
		List<CodeAmount> otherInfoResponseList = new ArrayList<>();
		if (rs.getArray("otherInfo") != null) {
			List<Integer> otherInfoList = Arrays.asList((Integer[]) rs.getArray("otherInfo").getArray());
			for (int otherInfoId : otherInfoList) {
				CodeAmount codeAmount = new CodeAmount();
				codeAmount.setCodeAmountId(otherInfoId);
				otherInfoResponseList.add(codeAmount);
			}
			tax1065K1.setOtherInfo(otherInfoResponseList);
		}
//		OtherInfo End

//		SelfEmployment Start
		List<CodeAmount> selfEmploymentResponseList = new ArrayList<>();
		if (rs.getArray("selfEmployment") != null) {
			List<Integer> selfEmploymentList = Arrays.asList((Integer[]) rs.getArray("selfEmployment").getArray());
			for (int selfEmploymentId : selfEmploymentList) {
				CodeAmount codeAmount = new CodeAmount();
				codeAmount.setCodeAmountId(selfEmploymentId);
				selfEmploymentResponseList.add(codeAmount);
			}
			tax1065K1.setSelfEmployment(selfEmploymentResponseList);
		}
//		SelfEmployment End

//		TaxExemptIncome Start
		List<CodeAmount> taxExemptIncomeResponseList = new ArrayList<>();
		if (rs.getArray("taxExemptIncome") != null) {
			List<Integer> taxExemptIncomeList = Arrays.asList((Integer[]) rs.getArray("taxExemptIncome").getArray());
			for (int taxExemptIncomeId : taxExemptIncomeList) {
				CodeAmount codeAmount = new CodeAmount();
				codeAmount.setCodeAmountId(taxExemptIncomeId);
				taxExemptIncomeResponseList.add(codeAmount);
			}
			tax1065K1.setTaxExemptIncome(taxExemptIncomeResponseList);
		}
//		TaxExemptIncome End

//		AmtItems Start
		List<CodeAmount> amtItemsResponseList = new ArrayList<>();
		if (rs.getArray("amtItems") != null) {
			List<Integer> amtItemsList = Arrays.asList((Integer[]) rs.getArray("amtItems").getArray());
			for (int amtItemsId : amtItemsList) {
				CodeAmount codeAmount = new CodeAmount();
				codeAmount.setCodeAmountId(amtItemsId);
				amtItemsResponseList.add(codeAmount);
			}
			tax1065K1.setAmtItems(amtItemsResponseList);
		}
//		AmtItems End

		return tax1065K1;
	}

}
