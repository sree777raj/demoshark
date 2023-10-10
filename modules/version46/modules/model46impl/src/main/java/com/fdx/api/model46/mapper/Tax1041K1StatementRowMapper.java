package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.CodeAmount;
import com.fdx.api.model46.modelimpl.NameAddress;
import com.fdx.api.model46.modelimpl.Tax1041K1;

public class Tax1041K1StatementRowMapper implements RowMapper<Tax1041K1> {

	@Override
	public Tax1041K1 mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tax1041K1 tax1041k1 = new Tax1041K1();
		if (!(rs.getString("amendedK1") == null))
			tax1041k1.setAmendedK1(rs.getBoolean("amendedK1"));
		tax1041k1.setBeneficiaryTin(rs.getString("beneficiaryTin"));
		tax1041k1.setDate1041T(rs.getDate("date1041t"));
		if (!(rs.getString("domestic") == null))
			tax1041k1.setDomestic(rs.getBoolean("domestic"));
		tax1041k1.setEstateTaxDeduction(rs.getDouble("estateTaxDeduction"));
		if (!(rs.getString("final1041") == null))
			tax1041k1.setFinal1041(rs.getBoolean("final1041"));
		if (!(rs.getString("finalK1") == null))
			tax1041k1.setFinalK1(rs.getBoolean("finalK1"));
		tax1041k1.setFiscalYearBegin(rs.getDate("fiscalYearBegin"));
		tax1041k1.setFiscalYearEnd(rs.getDate("fiscalYearEnd"));
		if (!(rs.getString("foreignbeneficiary") == null))
			tax1041k1.setForeignbeneficiary(rs.getBoolean("foreignbeneficiary"));
		if (!(rs.getString("form1041t") == null))
			tax1041k1.setForm1041T(rs.getBoolean("form1041t"));
		tax1041k1.setGain28Rate(rs.getDouble("gain28Rate"));
		tax1041k1.setInterestIncome(rs.getDouble("interestIncome"));
		tax1041k1.setNetLongTermGain(rs.getDouble("netLongTermGain"));
		tax1041k1.setNetRentalRealEstateIncome(rs.getDouble("netRentalRealEstateIncome"));
		tax1041k1.setNetShortTermGain(rs.getDouble("netShortTermGain"));
		tax1041k1.setOrdinaryBusinessIncome(rs.getDouble("ordinaryBusinessIncome"));
		tax1041k1.setOrdinaryDividends(rs.getDouble("ordinaryDividends"));
		tax1041k1.setOtherPortfolioIncome(rs.getDouble("otherPortfolioIncome"));
		tax1041k1.setOtherRentalIncome(rs.getDouble("otherRentalIncome"));
		tax1041k1.setQualifiedDividends(rs.getDouble("qualifiedDividends"));
		tax1041k1.setTrustName(rs.getString("trustName"));
		tax1041k1.setTrustTin(rs.getString("trustTin"));
		tax1041k1.setUnrecaptured1250Gain(rs.getDouble("unrecaptured1250Gain"));

//		Other Info Start
		List<CodeAmount> otherInfoResponseList = new ArrayList<>();
		if (rs.getArray("otherInfo") != null) {
			List<Integer> otherInfoList = Arrays.asList((Integer[]) rs.getArray("otherInfo").getArray());
			for (int otherInfoId : otherInfoList) {
				CodeAmount codeAmount = new CodeAmount();
				codeAmount.setCodeAmountId(otherInfoId);
				otherInfoResponseList.add(codeAmount);
			}
			tax1041k1.setOtherInfo(otherInfoResponseList);
		}
//		Other Info End 

//		finalYearDeductions Start
		List<CodeAmount> finalYearDeductionsResponseList = new ArrayList<>();
		if (rs.getArray("finalYearDeductions") != null) {
			List<Integer> finalYearDeductionsList = Arrays
					.asList((Integer[]) rs.getArray("finalYearDeductions").getArray());
			for (int finalYearDeductionsId : finalYearDeductionsList) {
				CodeAmount codeAmount = new CodeAmount();
				codeAmount.setCodeAmountId(finalYearDeductionsId);
				finalYearDeductionsResponseList.add(codeAmount);
			}
			tax1041k1.setFinalYearDeductions(finalYearDeductionsResponseList);
		}
//		finalYearDeductions End

//		FiduciaryNameAddress Start
		NameAddress nameAddress = new NameAddress();
		if (rs.getInt("fiduciaryNameAddress") != 0) {
			nameAddress.setNameAddressId(rs.getInt("fiduciaryNameAddress"));
			tax1041k1.setFiduciaryNameAddress(nameAddress);
		}
//		FiduciaryNameAddress End

//		DirectlyApportionedDeductions Start
		List<CodeAmount> directlyApportionedDeductionsResponseList = new ArrayList<>();
		if (rs.getArray("directlyApportionedDeductions") != null) {
			List<Integer> directlyApportionedDeductionsList = Arrays
					.asList((Integer[]) rs.getArray("directlyApportionedDeductions").getArray());
			for (int directlyApportionedDeductionsId : directlyApportionedDeductionsList) {
				CodeAmount codeAmount = new CodeAmount();
				codeAmount.setCodeAmountId(directlyApportionedDeductionsId);
				directlyApportionedDeductionsResponseList.add(codeAmount);
			}
			tax1041k1.setDirectlyApportionedDeductions(directlyApportionedDeductionsResponseList);
		}
//		DirectlyApportionedDeductions End

//		Credits Start
		List<CodeAmount> creditsResponseList = new ArrayList<>();
		if (rs.getArray("credits") != null) {
			List<Integer> creditsList = Arrays.asList((Integer[]) rs.getArray("credits").getArray());
			for (int creditsId : creditsList) {
				CodeAmount codeAmount = new CodeAmount();
				codeAmount.setCodeAmountId(creditsId);
				creditsResponseList.add(codeAmount);
			}
			tax1041k1.setCredits(creditsResponseList);
		}
//		Credits End

//		BenificiaryNameAddress Start
		NameAddress benificiaryNameAddress = new NameAddress();
		if (rs.getInt("beneficiaryNameAddress") != 0) {
			benificiaryNameAddress.setNameAddressId(rs.getInt("beneficiaryNameAddress"));
			tax1041k1.setBeneficiaryNameAddress(benificiaryNameAddress);
		}
//		BenificiaryNameAddress End

//		AmtAdjustments Start
		List<CodeAmount> amtAdjustmentsResponseList = new ArrayList<>();
		if (rs.getArray("amtAdjustments") != null) {
			List<Integer> amtAdjustmentsList = Arrays.asList((Integer[]) rs.getArray("amtAdjustments").getArray());
			for (int amtAdjustmentsId : amtAdjustmentsList) {
				CodeAmount codeAmount = new CodeAmount();
				codeAmount.setCodeAmountId(amtAdjustmentsId);
				amtAdjustmentsResponseList.add(codeAmount);
			}
			tax1041k1.setAmtAdjustments(amtAdjustmentsResponseList);
		}
//		AmtAdjustments End

		return tax1041k1;
	}

}
