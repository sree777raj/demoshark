package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.CodeAmount;
import com.fdx.api.model46.modelimpl.NameAddress;
import com.fdx.api.model46.modelimpl.Tax1120SK1;

public class Tax1120SK1RowMapper implements RowMapper<Tax1120SK1> {

	@Override
	public Tax1120SK1 mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tax1120SK1 tax1120SK1 = new Tax1120SK1();
		if (!(rs.getString("amendedK1") == null))
			tax1120SK1.setAmendedK1(rs.getBoolean("amendedK1"));
		tax1120SK1.setBeginningLoans(rs.getDouble("beginningLoans"));
		tax1120SK1.setBeginningShares(rs.getDouble("beginningShares"));
		tax1120SK1.setCollectiblesGain(rs.getDouble("collectiblesGain"));
		tax1120SK1.setCorporationTin(rs.getString("corporationTin"));
		tax1120SK1.setEndingLoans(rs.getDouble("endingLoans"));
		tax1120SK1.setEndingShares(rs.getDouble("endingShares"));
		if (!(rs.getString("finalK1") == null))
			tax1120SK1.setFinalK1(rs.getBoolean("finalK1"));
		tax1120SK1.setFiscalYearBegin(rs.getDate("fiscalYearBegin"));
		tax1120SK1.setFiscalYearEnd(rs.getDate("fiscalYearEnd"));
		tax1120SK1.setForeignCountry(rs.getString("foreignCountry"));
		tax1120SK1.setInterestIncome(rs.getDouble("interestIncome"));
		tax1120SK1.setIrsCenter(rs.getString("irsCenter"));
		if (!(rs.getString("multipleAtRiskActivities") == null))
			tax1120SK1.setMultipleAtRiskActivities(rs.getBoolean("multipleAtRiskActivities"));
		if (!(rs.getString("multiplePassiveActivities") == null))
			tax1120SK1.setMultiplePassiveActivities(rs.getBoolean("multiplePassiveActivities"));
		tax1120SK1.setNet1231Gain(rs.getDouble("net1231Gain"));
		tax1120SK1.setNetLongTermGain(rs.getDouble("netLongTermGain"));
		tax1120SK1.setNetRentalRealEstateIncome(rs.getDouble("netRentalRealEstateIncome"));
		tax1120SK1.setNetShortTermGain(rs.getDouble("netShortTermGain"));
		tax1120SK1.setOrdinaryDividends(rs.getDouble("ordinaryDividends"));
		tax1120SK1.setOrdinaryIncome(rs.getDouble("ordinaryIncome"));
		tax1120SK1.setOtherRentalIncome(rs.getDouble("otherRentalIncome"));
		tax1120SK1.setPercentOwnership(rs.getDouble("percentOwnership"));
		tax1120SK1.setQualifiedDividends(rs.getDouble("qualifiedDividends"));
		tax1120SK1.setRoyalties(rs.getDouble("royalties"));
		tax1120SK1.setSection179Deduction(rs.getDouble("section179Deduction"));
		tax1120SK1.setShareholderTin(rs.getString("shareholderTin"));
		tax1120SK1.setUnrecaptured1250Gain(rs.getDouble("unrecaptured1250Gain"));

//		shareholderNameAddress Start
		NameAddress shareholderNameAddress = new NameAddress();
		if (rs.getInt("shareholderNameAddress") != 0) {
			shareholderNameAddress.setNameAddressId(rs.getInt("shareholderNameAddress"));
			tax1120SK1.setShareholderNameAddress(shareholderNameAddress);
		}
//		shareholderNameAddress End

//		corporationNameAddress Start
		NameAddress corporationNameAddress = new NameAddress();
		if (rs.getInt("corporationNameAddress") != 0) {
			corporationNameAddress.setNameAddressId(rs.getInt("corporationNameAddress"));
			tax1120SK1.setCorporationNameAddress(corporationNameAddress);
		}
//		corporationNameAddress End

//		AmtItems Start
		List<CodeAmount> amtItemsResponseList = new ArrayList<>();
		if (rs.getArray("amtItems") != null) {
			List<Integer> amtItemsList = Arrays.asList((Integer[]) rs.getArray("amtItems").getArray());
			for (int amtItems : amtItemsList) {
				CodeAmount codeAmount = new CodeAmount();
				codeAmount.setCodeAmountId(amtItems);
				amtItemsResponseList.add(codeAmount);
			}
			tax1120SK1.setAmtItems(amtItemsResponseList);
		}
//		AmtItems End 

//		BasisItems Start
		List<CodeAmount> basisItemsResponseList = new ArrayList<>();
		if (rs.getArray("basisItems") != null) {
			List<Integer> basisItemsList = Arrays.asList((Integer[]) rs.getArray("basisItems").getArray());
			for (int basisItemsId : basisItemsList) {
				CodeAmount codeAmount = new CodeAmount();
				codeAmount.setCodeAmountId(basisItemsId);
				basisItemsResponseList.add(codeAmount);
			}
			tax1120SK1.setBasisItems(basisItemsResponseList);
		}
//		BasisItems End 

//		credits Start
		List<CodeAmount> creditsResponseList = new ArrayList<>();
		if (rs.getArray("credits") != null) {
			List<Integer> creditsList = Arrays.asList((Integer[]) rs.getArray("credits").getArray());
			for (int creditsId : creditsList) {
				CodeAmount codeAmount = new CodeAmount();
				codeAmount.setCodeAmountId(creditsId);
				creditsResponseList.add(codeAmount);
			}
			tax1120SK1.setCredits(creditsResponseList);
		}
//		credits End 

//		foreignTransactions Start
		List<CodeAmount> foreignTransactionsResponseList = new ArrayList<>();
		if (rs.getArray("foreignTransactions") != null) {
			List<Integer> foreignTransactionsList = Arrays
					.asList((Integer[]) rs.getArray("foreignTransactions").getArray());
			for (int foreignTransactionsId : foreignTransactionsList) {
				CodeAmount codeAmount = new CodeAmount();
				codeAmount.setCodeAmountId(foreignTransactionsId);
				foreignTransactionsResponseList.add(codeAmount);
			}
			tax1120SK1.setForeignTransactions(foreignTransactionsResponseList);
		}
//		foreignTransactions End 

//		otherDeductions Start
		List<CodeAmount> otherDeductionsResponseList = new ArrayList<>();
		if (rs.getArray("otherDeductions") != null) {
			List<Integer> otherDeductionsList = Arrays.asList((Integer[]) rs.getArray("otherDeductions").getArray());
			for (int otherDeductionsId : otherDeductionsList) {
				CodeAmount codeAmount = new CodeAmount();
				codeAmount.setCodeAmountId(otherDeductionsId);
				otherDeductionsResponseList.add(codeAmount);
			}
			tax1120SK1.setOtherDeductions(otherDeductionsResponseList);
		}
//		otherDeductions End 

//		otherIncome Start
		List<CodeAmount> otherIncomeResponseList = new ArrayList<>();
		if (rs.getArray("otherIncome") != null) {
			List<Integer> otherIncomeList = Arrays.asList((Integer[]) rs.getArray("otherIncome").getArray());
			for (int otherIncomeId : otherIncomeList) {
				CodeAmount codeAmount = new CodeAmount();
				codeAmount.setCodeAmountId(otherIncomeId);
				otherIncomeResponseList.add(codeAmount);
			}
			tax1120SK1.setOtherIncome(otherIncomeResponseList);
		}
//		otherIncome End 

//		Other Info Start
		List<CodeAmount> otherInfoResponseList = new ArrayList<>();
		if (rs.getArray("otherInfo") != null) {
			List<Integer> otherInfoList = Arrays.asList((Integer[]) rs.getArray("otherInfo").getArray());
			for (int otherInfoId : otherInfoList) {
				CodeAmount codeAmount = new CodeAmount();
				codeAmount.setCodeAmountId(otherInfoId);
				otherInfoResponseList.add(codeAmount);
			}
			tax1120SK1.setOtherInfo(otherInfoResponseList);
		}
//		Other Info End 

		return tax1120SK1;
	}

}
