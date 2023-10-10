package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.DateAmount;
import com.fdx.api.model46.modelimpl.DescriptionAmount;
import com.fdx.api.model46.modelimpl.FarmIncomeStatement;

public class FarmIncomeStatementRowMapper implements RowMapper<FarmIncomeStatement> {

	@Override
	public FarmIncomeStatement mapRow(ResultSet rs, int rowNum) throws SQLException {
		FarmIncomeStatement farmIncomeStatement = new FarmIncomeStatement();
		farmIncomeStatement.setAgProgramPayments(rs.getDouble("agProgramPayments"));
		
		List<DateAmount> dateAmountList = new ArrayList<>();
		if (rs.getArray("capitalexpenditures") != null) {
			List<Integer> dateAmountResponseList = Arrays
					.asList((Integer[]) rs.getArray("capitalexpenditures").getArray());
			for (Integer dateAmountIterator : dateAmountResponseList) {
				DateAmount dateAmount = new DateAmount();
				dateAmount.setDateamountid(dateAmountIterator);
				dateAmountList.add(dateAmount);
			}
			farmIncomeStatement.setCapitalExpenditures(dateAmountList);
		}		
		
		farmIncomeStatement.setCarAndTruck(rs.getDouble("carAndTruck"));
		farmIncomeStatement.setCccLoans(rs.getDouble("cccLoans"));
		farmIncomeStatement.setChemicals(rs.getDouble("chemicals"));
		farmIncomeStatement.setConservation(rs.getDouble("conservation"));
		farmIncomeStatement.setCoopDistributions(rs.getDouble("coopDistributions"));
		farmIncomeStatement.setCostOfItemsSold(rs.getDouble("costOfItemsSold"));
		farmIncomeStatement.setCropInsuranceProceeds(rs.getDouble("cropInsuranceProceeds"));
		farmIncomeStatement.setCropOrActivity(rs.getString("cropOrActivity"));
		farmIncomeStatement.setCustomHireExpenses(rs.getDouble("customHireExpenses"));
		farmIncomeStatement.setCustomHireIncome(rs.getDouble("customHireIncome"));
		farmIncomeStatement.setDepreciation(rs.getDouble("depreciation"));
		farmIncomeStatement.setEmployeeBenefitPrograms(rs.getDouble("employeeBenefitPrograms"));
		farmIncomeStatement.setEquipmentRent(rs.getDouble("equipmentRent"));
		farmIncomeStatement.setFeed(rs.getDouble("feed"));
		farmIncomeStatement.setFertilizers(rs.getDouble("fertilizers"));
		farmIncomeStatement.setFuel(rs.getDouble("fuel"));
		farmIncomeStatement.setFreight(rs.getDouble("freight"));
		farmIncomeStatement.setInsurance(rs.getDouble("insurance"));
		farmIncomeStatement.setLaborHired(rs.getDouble("laborHired"));
		farmIncomeStatement.setMortgageInterest(rs.getDouble("mortgageInterest"));
		farmIncomeStatement.setOtherInterest(rs.getDouble("otherInterest"));
		farmIncomeStatement.setOtherRent(rs.getDouble("otherRent"));
		farmIncomeStatement.setPension(rs.getDouble("pension"));
		farmIncomeStatement.setRepairs(rs.getDouble("repairs"));
		farmIncomeStatement.setSales(rs.getDouble("sales"));
		farmIncomeStatement.setSalesOfRaised(rs.getDouble("salesOfRaised"));
		farmIncomeStatement.setSeeds(rs.getDouble("seeds"));
		farmIncomeStatement.setStorage(rs.getDouble("storage"));
		farmIncomeStatement.setSupplies(rs.getDouble("supplies"));
		farmIncomeStatement.setTaxes(rs.getDouble("taxes"));
		farmIncomeStatement.setUtilities(rs.getDouble("utilities"));
		farmIncomeStatement.setVeterinary(rs.getDouble("veterinary"));
		
		List<DescriptionAmount> otherExpensesResponseList = new ArrayList<>();
		if (rs.getArray("otherExpenses") != null) {
			List<Integer> otherExpensesList = Arrays.asList((Integer[]) rs.getArray("otherExpenses").getArray());
			for (int otherExpenses : otherExpensesList) {
				DescriptionAmount descriptionAmount = new DescriptionAmount();
				descriptionAmount.setDescAmountId(otherExpenses);
				otherExpensesResponseList.add(descriptionAmount);
			}
			farmIncomeStatement.setOtherExpenses(otherExpensesResponseList);
		}

		List<DescriptionAmount> otherIncomeResponseList = new ArrayList<>();
		if (rs.getArray("otherincome") != null) {
			List<Integer> otherIncomeList = Arrays.asList((Integer[]) rs.getArray("otherincome").getArray());
			for (int otherIncome : otherIncomeList) {
				DescriptionAmount descriptionAmount = new DescriptionAmount();
				descriptionAmount.setDescAmountId(otherIncome);
				otherIncomeResponseList.add(descriptionAmount);
			}
			farmIncomeStatement.setOtherIncome(otherIncomeResponseList);
		}
		return farmIncomeStatement;
	}

}























