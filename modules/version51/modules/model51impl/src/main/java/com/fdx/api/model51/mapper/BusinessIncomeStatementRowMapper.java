package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.BusinessIncomeStatement;
import com.fdx.api.model51.modelimpl.DateAmount;
import com.fdx.api.model51.modelimpl.DescriptionAmount;

public class BusinessIncomeStatementRowMapper implements RowMapper<BusinessIncomeStatement> {

	@Override
	public BusinessIncomeStatement mapRow(ResultSet rs, int rowNum) throws SQLException {
		BusinessIncomeStatement businessIncomeStatement = new BusinessIncomeStatement();
		businessIncomeStatement.setAdvertising(rs.getDouble("advertising"));
		businessIncomeStatement.setBeginningInventory(rs.getDouble("beginningInventory"));
		businessIncomeStatement.setBusinessName(rs.getString("businessName"));
		businessIncomeStatement.setCarAndTruck(rs.getDouble("carandtruck"));
		businessIncomeStatement.setCommissions(rs.getDouble("commissions"));
		businessIncomeStatement.setContractLabor(rs.getDouble("contractlabor"));
		businessIncomeStatement.setCostOfLabor(rs.getDouble("costoflabor"));
		businessIncomeStatement.setDepletion(rs.getDouble("depletion"));
		businessIncomeStatement.setDepreciation(rs.getDouble("depreciation"));
		businessIncomeStatement.setEmployeeBenefits(rs.getDouble("employeeBenefits"));
		businessIncomeStatement.setEndingInventory(rs.getDouble("endingInventory"));
		businessIncomeStatement.setEquipmentRent(rs.getDouble("equipmentRent"));
		businessIncomeStatement.setInsurance(rs.getDouble("insurance"));
		businessIncomeStatement.setLegal(rs.getDouble("legal"));
		businessIncomeStatement.setMaterials(rs.getDouble("materials"));
		businessIncomeStatement.setMeals(rs.getDouble("meals"));
		businessIncomeStatement.setMortgageInterest(rs.getDouble("mortgageInterest"));
		businessIncomeStatement.setOffice(rs.getDouble("office"));

		List<DescriptionAmount> otherCostsResponseList = new ArrayList<>();
		if (rs.getArray("otherCosts") != null) {
			List<Integer> otherCostsList = Arrays.asList((Integer[]) rs.getArray("otherCosts").getArray());
			for (int otherCost : otherCostsList) {
				DescriptionAmount descriptionAmount = new DescriptionAmount();
				descriptionAmount.setDescAmountId(otherCost);
				otherCostsResponseList.add(descriptionAmount);
			}
			businessIncomeStatement.setOtherCosts(otherCostsResponseList);
		}

		List<DescriptionAmount> otherExpensesResponseList = new ArrayList<>();
		if (rs.getArray("otherExpenses") != null) {
			List<Integer> otherExpensesList = Arrays.asList((Integer[]) rs.getArray("otherExpenses").getArray());
			for (int otherExpenses : otherExpensesList) {
				DescriptionAmount descriptionAmount = new DescriptionAmount();
				descriptionAmount.setDescAmountId(otherExpenses);
				otherExpensesResponseList.add(descriptionAmount);
			}
			businessIncomeStatement.setOtherExpenses(otherExpensesResponseList);
		}

		List<DescriptionAmount> otherIncomeResponseList = new ArrayList<>();
		if (rs.getArray("otherincome") != null) {
			List<Integer> otherIncomeList = Arrays.asList((Integer[]) rs.getArray("otherincome").getArray());
			for (int otherIncome : otherIncomeList) {
				DescriptionAmount descriptionAmount = new DescriptionAmount();
				descriptionAmount.setDescAmountId(otherIncome);
				otherIncomeResponseList.add(descriptionAmount);
			}
			businessIncomeStatement.setOtherIncome(otherIncomeResponseList);
		}

		businessIncomeStatement.setOtherInterest(rs.getDouble("otherInterest"));
		businessIncomeStatement.setOtherRent(rs.getDouble("otherrent"));
		businessIncomeStatement.setPension(rs.getDouble("pension"));
		businessIncomeStatement.setPurchases(rs.getDouble("purchases"));
		businessIncomeStatement.setRepairs(rs.getDouble("repairs"));
		businessIncomeStatement.setReturns(rs.getDouble("returns"));
		businessIncomeStatement.setSales(rs.getDouble("sales"));
		businessIncomeStatement.setSupplies(rs.getDouble("supplies"));
		businessIncomeStatement.setTaxes(rs.getDouble("taxes"));
		businessIncomeStatement.setTravel(rs.getDouble("travel"));
		businessIncomeStatement.setUtilities(rs.getDouble("utilities"));
		businessIncomeStatement.setWages(rs.getDouble("wages"));

		List<DateAmount> dateAmountList = new ArrayList<>();
		if (rs.getArray("capitalexpenditures") != null) {
			List<Integer> dateAmountResponseList = Arrays
					.asList((Integer[]) rs.getArray("capitalexpenditures").getArray());
			for (Integer dateAmountIterator : dateAmountResponseList) {
				DateAmount dateAmount = new DateAmount();
				dateAmount.setDateamountid(dateAmountIterator);
				dateAmountList.add(dateAmount);
			}
			businessIncomeStatement.setCapitalExpenditures(dateAmountList);
		}

		return businessIncomeStatement;
	}

}
