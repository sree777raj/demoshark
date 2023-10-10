package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.Address;
import com.fdx.api.model51.modelimpl.CodeAmount;
import com.fdx.api.model51.modelimpl.DescriptionAmount;
import com.fdx.api.model51.modelimpl.IndividualName;
import com.fdx.api.model51.modelimpl.LocalTaxWithholding;
import com.fdx.api.model51.modelimpl.NameAddress;
import com.fdx.api.model51.modelimpl.StateTaxWithholding;
import com.fdx.api.model51.modelimpl.TaxW2;

public class TaxW2StatementRowMapper implements RowMapper<TaxW2> {

	@Override
	public TaxW2 mapRow(ResultSet rs, int rowNum) throws SQLException {

		TaxW2 taxW2 = new TaxW2();
		taxW2.setAllocatedTips(rs.getDouble("allocatedTips"));
		taxW2.setControlNumber(rs.getString("controlNumber"));
		taxW2.setDependentCareBenefit(rs.getDouble("dependentCareBenefit"));
		taxW2.setEmployeeTin(rs.getString("employeeTin"));
		taxW2.setEmployerTin(rs.getString("employerTin"));
		taxW2.setEsppNonQualified(rs.getDouble("esppNonQualified"));
		taxW2.setEsppQualified(rs.getDouble("esppQualified"));
		taxW2.setFederalTaxWithheld(rs.getDouble("federalTaxWithheld"));
		taxW2.setMedicareTaxWithheld(rs.getDouble("medicareTaxWithheld"));
		taxW2.setMedicareWages(rs.getDouble("medicareWages"));
		taxW2.setNonQualifiedPlan(rs.getDouble("nonQualifiedPlan"));
		if (!(rs.getString("retirementPlan") == null))
			taxW2.setRetirementPlan(rs.getBoolean("retirementPlan"));
		taxW2.setSocialSecurityTaxWithheld(rs.getDouble("socialSecurityTaxWithheld"));
		taxW2.setSocialSecurityTips(rs.getDouble("socialSecurityTips"));
		taxW2.setSocialSecurityWages(rs.getDouble("socialSecurityWages"));
		if (!(rs.getString("statutory") == null))
			taxW2.setStatutory(rs.getBoolean("statutory"));
		if (!(rs.getString("thirdPartySickPay") == null))
			taxW2.setThirdPartySickPay(rs.getBoolean("thirdPartySickPay"));
		taxW2.setWages(rs.getDouble("wages"));

//		Codes Start
		List<CodeAmount> codesResponseList = new ArrayList<>();
		if (rs.getArray("codes") != null) {
			List<Integer> codesList = Arrays.asList((Integer[]) rs.getArray("codes").getArray());
			for (int codesId : codesList) {
				CodeAmount codeAmount = new CodeAmount();
				codeAmount.setCodeAmountId(codesId);
				codesResponseList.add(codeAmount);
			}
			taxW2.setCodes(codesResponseList);
		}
//		Codes End

//		EmployeeName Start
		IndividualName individualName = new IndividualName();
		if (rs.getInt("employeeName") != 0) {
			individualName.setNameid(rs.getInt("employeeName"));
			taxW2.setEmployeeName(individualName);
		}
//		EmployeeName End

//		EmployeeAddress Start
		Address address = new Address();
		if (rs.getInt("employeeAddress") != 0) {
			address.setAddressId(rs.getInt("employeeAddress"));
			taxW2.setEmployeeAddress(address);
		}
//		EmployeeAddress End

//		EmployerNameAddress Start
		NameAddress nameAddress = new NameAddress();
		if (rs.getInt("employerNameAddress") != 0) {
			nameAddress.setNameAddressId(rs.getInt("employerNameAddress"));
			taxW2.setEmployerNameAddress(nameAddress);
		}
//		EmployerNameAddress End

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
			taxW2.setStateTaxWithholding(statetaxwithholdingResponseList);
		}
//		StateTaxWithholding End

//		localTaxWithholding Start
		List<LocalTaxWithholding> localTaxWithholdingResponseList = new ArrayList<>();
		if (rs.getArray("localTaxWithholding") != null) {
			List<Integer> localTaxWithholdingList = Arrays
					.asList((Integer[]) rs.getArray("localTaxWithholding").getArray());
			for (int localTaxWithholdingId : localTaxWithholdingList) {
				LocalTaxWithholding localTaxWithholding = new LocalTaxWithholding();
				localTaxWithholding.setLtwithheldid(localTaxWithholdingId);
				localTaxWithholdingResponseList.add(localTaxWithholding);
			}
			taxW2.setLocalTaxWithholding(localTaxWithholdingResponseList);
		}
//		localTaxWithholding End

//		Others Start
		List<DescriptionAmount> otherResponseList = new ArrayList<>();
		if (rs.getArray("other") != null) {
			List<Integer> otherList = Arrays.asList((Integer[]) rs.getArray("other").getArray());
			for (int otherId : otherList) {
				DescriptionAmount descriptionAmount = new DescriptionAmount();
				descriptionAmount.setDescAmountId(otherId);
				otherResponseList.add(descriptionAmount);
			}
			taxW2.setOther(otherResponseList);
		}
//		Others End
		return taxW2;
	}

}
