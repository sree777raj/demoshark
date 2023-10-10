package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.CodeAmount;
import com.fdx.api.model46.modelimpl.NameAddress;
import com.fdx.api.model46.modelimpl.Tax5227K1;

public class Tax5227K1StatementRowMapper implements RowMapper<Tax5227K1> {

	@Override
	public Tax5227K1 mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tax5227K1 tax5227K1 = new Tax5227K1();
		if (!(rs.getString("amendedK1") == null))
			tax5227K1.setAmendedK1(rs.getBoolean("amendedK1"));
		tax5227K1.setBeneficiaryTin(rs.getString("beneficiaryTin"));
		tax5227K1.setDate1041T(rs.getDate("date1041t"));
		if (!(rs.getString("domestic") == null))
			tax5227K1.setDomestic(rs.getBoolean("domestic"));
		tax5227K1.setEstateTaxDeduction(rs.getDouble("estateTaxDeduction"));
		if (!(rs.getString("final1041") == null))
			tax5227K1.setFinal1041(rs.getBoolean("final1041"));
		if (!(rs.getString("finalK1") == null))
			tax5227K1.setFinalK1(rs.getBoolean("finalK1"));
		tax5227K1.setFiscalYearBegin(rs.getDate("fiscalYearBegin"));
		tax5227K1.setFiscalYearEnd(rs.getDate("fiscalYearEnd"));
		if (!(rs.getString("foreignbeneficiary") == null))
			tax5227K1.setForeignBeneficiary(rs.getBoolean("foreignbeneficiary"));
		if (!(rs.getString("form1041t") == null))
			tax5227K1.setForm1041T(rs.getBoolean("form1041t"));
		tax5227K1.setGain28Rate(rs.getDouble("gain28Rate"));
		tax5227K1.setInterestIncome(rs.getDouble("interestIncome"));
		tax5227K1.setNetLongTermGain(rs.getDouble("netLongTermGain"));
		tax5227K1.setNetRentalRealEstateIncome(rs.getDouble("netRentalRealEstateIncome"));
		tax5227K1.setNetShortTermGain(rs.getDouble("netShortTermGain"));
		tax5227K1.setOrdinaryBusinessIncome(rs.getDouble("ordinaryBusinessIncome"));
		tax5227K1.setOrdinaryDividends(rs.getDouble("ordinaryDividends"));
		tax5227K1.setOtherPortfolioIncome(rs.getDouble("otherPortfolioIncome"));
		tax5227K1.setOtherRentalIncome(rs.getDouble("otherRentalIncome"));
		tax5227K1.setQualifiedDividends(rs.getDouble("qualifiedDividends"));
		tax5227K1.setTrustName(rs.getString("trustName"));
		tax5227K1.setTrustTin(rs.getString("trustTin"));
		tax5227K1.setUnrecaptured1250Gain(rs.getDouble("unrecaptured1250Gain"));

//		FiduciaryNameAddress Start
		NameAddress nameAddress = new NameAddress();
		if (rs.getInt("fiduciaryNameAddress") != 0) {
			nameAddress.setNameAddressId(rs.getInt("fiduciaryNameAddress"));
			tax5227K1.setFiduciaryNameAddress(nameAddress);
		}
//		FiduciaryNameAddress End

//		BeneficiaryNameAddress Start
		NameAddress nameAddressBeneficiary = new NameAddress();
		if (rs.getInt("beneficiaryNameAddress") != 0) {
			nameAddressBeneficiary.setNameAddressId(rs.getInt("beneficiaryNameAddress"));
			tax5227K1.setBeneficiaryNameAddress(nameAddressBeneficiary);
		}
//		BeneficiaryNameAddress End

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
			tax5227K1.setDirectlyApportionedDeductions(directlyApportionedDeductionsResponseList);
		}
//		DirectlyApportionedDeductions End

//		FinalYearDeductions Start
		List<CodeAmount> finalYearDeductionsResponseList = new ArrayList<>();
		if (rs.getArray("finalYearDeductions") != null) {
			List<Integer> finalYearDeductionsList = Arrays
					.asList((Integer[]) rs.getArray("finalYearDeductions").getArray());
			for (int finalYearDeductionsId : finalYearDeductionsList) {
				CodeAmount codeAmount = new CodeAmount();
				codeAmount.setCodeAmountId(finalYearDeductionsId);
				finalYearDeductionsResponseList.add(codeAmount);
			}
			tax5227K1.setFinalYearDeductions(finalYearDeductionsResponseList);
		}
//		FinalYearDeductions End

//		AmtAdjustments Start
		List<CodeAmount> amtAdjustmentsResponseList = new ArrayList<>();
		if (rs.getArray("amtAdjustments") != null) {
			List<Integer> amtAdjustmentsList = Arrays.asList((Integer[]) rs.getArray("amtAdjustments").getArray());
			for (int amtAdjustmentsId : amtAdjustmentsList) {
				CodeAmount codeAmount = new CodeAmount();
				codeAmount.setCodeAmountId(amtAdjustmentsId);
				amtAdjustmentsResponseList.add(codeAmount);
			}
			tax5227K1.setAmtAdjustments(amtAdjustmentsResponseList);
		}
//		AmtAdjustments End

//		OtherInfo Start
		List<CodeAmount> otherInfoResponseList = new ArrayList<>();
		if (rs.getArray("otherInfo") != null) {
			List<Integer> otherInfoList = Arrays.asList((Integer[]) rs.getArray("otherInfo").getArray());
			for (int otherInfoId : otherInfoList) {
				CodeAmount codeAmount = new CodeAmount();
				codeAmount.setCodeAmountId(otherInfoId);
				otherInfoResponseList.add(codeAmount);
			}
			tax5227K1.setOtherInfo(otherInfoResponseList);
		}
//		OtherInfo End

//		Credits Start
		List<CodeAmount> creditsResponseList = new ArrayList<>();
		if (rs.getArray("credits") != null) {
			List<Integer> creditsList = Arrays.asList((Integer[]) rs.getArray("credits").getArray());
			for (int creditsId : creditsList) {
				CodeAmount codeAmount = new CodeAmount();
				codeAmount.setCodeAmountId(creditsId);
				creditsResponseList.add(codeAmount);
			}
			tax5227K1.setCredits(creditsResponseList);
		}
//		Credits End
		return tax5227K1;
	}

}
