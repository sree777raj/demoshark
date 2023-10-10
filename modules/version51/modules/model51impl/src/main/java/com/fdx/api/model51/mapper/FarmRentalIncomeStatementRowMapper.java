package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.DateAmount;
import com.fdx.api.model51.modelimpl.DescriptionAmount;
import com.fdx.api.model51.modelimpl.FarmRentalIncomeStatement;

public class FarmRentalIncomeStatementRowMapper implements RowMapper<FarmRentalIncomeStatement> {

	@Override
	public FarmRentalIncomeStatement mapRow(ResultSet rs, int rowNum) throws SQLException {
		FarmRentalIncomeStatement farmRentalIncomeStatement= new FarmRentalIncomeStatement();
		farmRentalIncomeStatement.setAgProgramPayments(rs.getDouble("agProgramPayments"));

		List<DateAmount> dateAmountList = new ArrayList<>();
		if (rs.getArray("capitalexpenditures") != null) {
			List<Integer> dateAmountResponseList = Arrays
					.asList((Integer[]) rs.getArray("capitalexpenditures").getArray());
			for (Integer dateAmountIterator : dateAmountResponseList) {
				DateAmount dateAmount = new DateAmount();
				dateAmount.setDateamountid(dateAmountIterator);
				dateAmountList.add(dateAmount);
			}
			farmRentalIncomeStatement.setCapitalExpenditures(dateAmountList);
		}
		
		farmRentalIncomeStatement.setCarAndTruck(rs.getDouble("carAndTruck"));
		farmRentalIncomeStatement.setCccLoans(rs.getDouble("cccLoans"));
		farmRentalIncomeStatement.setChemicals(rs.getDouble("chemicals"));
		farmRentalIncomeStatement.setConservation(rs.getDouble("conservation"));
		farmRentalIncomeStatement.setCoopDistributions(rs.getDouble("coopDistributions"));
		farmRentalIncomeStatement.setCropInsuranceProceeds(rs.getDouble("cropInsuranceProceeds"));
		farmRentalIncomeStatement.setCustomHireExpenses(rs.getDouble("customHireExpenses"));
		farmRentalIncomeStatement.setDepreciation(rs.getDouble("depreciation"));
		farmRentalIncomeStatement.setEmployeeBenefitPrograms(rs.getDouble("employeeBenefitPrograms"));
		farmRentalIncomeStatement.setEquipmentRent(rs.getDouble("equipmentRent"));
		farmRentalIncomeStatement.setFeed(rs.getDouble("feed"));
		farmRentalIncomeStatement.setFertilizers(rs.getDouble("fertilizers"));
		farmRentalIncomeStatement.setFreight(rs.getDouble("freight"));
		farmRentalIncomeStatement.setFuel(rs.getDouble("fuel"));
		farmRentalIncomeStatement.setIncomeFromProduction(rs.getDouble("incomeFromProduction"));
		farmRentalIncomeStatement.setInsurance(rs.getDouble("insurance"));
		farmRentalIncomeStatement.setLaborHired(rs.getDouble("laborHired"));
		farmRentalIncomeStatement.setMortgageInterest(rs.getDouble("mortgageInterest"));
		farmRentalIncomeStatement.setOtherInterest(rs.getDouble("otherInterest"));
		farmRentalIncomeStatement.setOtherRent(rs.getDouble("otherRent"));
		farmRentalIncomeStatement.setPension(rs.getDouble("pension"));
		farmRentalIncomeStatement.setRepairs(rs.getDouble("repairs"));
		farmRentalIncomeStatement.setSeeds(rs.getDouble("seeds"));
		farmRentalIncomeStatement.setStorage(rs.getDouble("storage"));
		farmRentalIncomeStatement.setSupplies(rs.getDouble("supplies"));
		farmRentalIncomeStatement.setTaxes(rs.getDouble("taxes"));
		farmRentalIncomeStatement.setUtilities(rs.getDouble("utilities"));
		farmRentalIncomeStatement.setVeterinary(rs.getDouble("veterinary"));
		
		List<DescriptionAmount> otherExpensesResponseList = new ArrayList<>();
		if (rs.getArray("otherExpenses") != null) {
			List<Integer> otherExpensesList = Arrays.asList((Integer[]) rs.getArray("otherExpenses").getArray());
			for (int otherExpenses : otherExpensesList) {
				DescriptionAmount descriptionAmount = new DescriptionAmount();
				descriptionAmount.setDescAmountId(otherExpenses);
				otherExpensesResponseList.add(descriptionAmount);
			}
			farmRentalIncomeStatement.setOtherExpenses(otherExpensesResponseList);
		}

		List<DescriptionAmount> otherIncomeResponseList = new ArrayList<>();
		if (rs.getArray("otherincome") != null) {
			List<Integer> otherIncomeList = Arrays.asList((Integer[]) rs.getArray("otherincome").getArray());
			for (int otherIncome : otherIncomeList) {
				DescriptionAmount descriptionAmount = new DescriptionAmount();
				descriptionAmount.setDescAmountId(otherIncome);
				otherIncomeResponseList.add(descriptionAmount);
			}
			farmRentalIncomeStatement.setOtherIncome(otherIncomeResponseList);
		}
		return farmRentalIncomeStatement;
	}

}
