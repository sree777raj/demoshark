package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.Address;
import com.fdx.api.model46.modelimpl.DateAmount;
import com.fdx.api.model46.modelimpl.DescriptionAmount;
import com.fdx.api.model46.modelimpl.RoyaltyIncomeStatement;

public class RoyaltyIncomeStatementRowMapper implements RowMapper<RoyaltyIncomeStatement> {

	@Override
	public RoyaltyIncomeStatement mapRow(ResultSet rs, int rowNum) throws SQLException {
		RoyaltyIncomeStatement royaltyIncomeStatement = new RoyaltyIncomeStatement();
		royaltyIncomeStatement.setAdvertising(rs.getDouble("advertising"));
		royaltyIncomeStatement.setAuto(rs.getDouble("auto"));

		List<DateAmount> dateAmountList = new ArrayList<>();
		if (rs.getArray("capitalexpenditures") != null) {
			List<Integer> dateAmountResponseList = Arrays
					.asList((Integer[]) rs.getArray("capitalexpenditures").getArray());
			for (Integer dateAmountIterator : dateAmountResponseList) {
				DateAmount dateAmount = new DateAmount();
				dateAmount.setDateamountid(dateAmountIterator);
				dateAmountList.add(dateAmount);
			}
			royaltyIncomeStatement.setCapitalExpenditures(dateAmountList);
		}

		royaltyIncomeStatement.setCleaning(rs.getDouble("cleaning"));
		royaltyIncomeStatement.setCommissions(rs.getDouble("commissions"));
		royaltyIncomeStatement.setDepletionExpense(rs.getDouble("depletionExpense"));
		royaltyIncomeStatement.setInsurance(rs.getDouble("insurance"));
		royaltyIncomeStatement.setLegal(rs.getDouble("legal"));
		royaltyIncomeStatement.setManagementFees(rs.getDouble("managementFees"));
		royaltyIncomeStatement.setMortgageInterest(rs.getDouble("mortgageInterest"));

		List<DescriptionAmount> otherExpensesResponseList = new ArrayList<>();
		if (rs.getArray("otherExpenses") != null) {
			List<Integer> otherExpensesList = Arrays.asList((Integer[]) rs.getArray("otherExpenses").getArray());
			for (int otherExpenses : otherExpensesList) {
				DescriptionAmount descriptionAmount = new DescriptionAmount();
				descriptionAmount.setDescAmountId(otherExpenses);
				otherExpensesResponseList.add(descriptionAmount);
			}
			royaltyIncomeStatement.setOtherExpenses(otherExpensesResponseList);
		}

		Address address = new Address();
		if (rs.getInt("propertyaddress") != 0) {
			address.setAddressId(rs.getInt("propertyaddress"));
			royaltyIncomeStatement.setPropertyAddress(address);
		}

		royaltyIncomeStatement.setOtherInterest(rs.getDouble("otherInterest"));
		royaltyIncomeStatement.setRepairs(rs.getDouble("repairs"));
		royaltyIncomeStatement.setRoyalties(rs.getDouble("royalties"));
		royaltyIncomeStatement.setSupplies(rs.getDouble("supplies"));
		royaltyIncomeStatement.setTaxes(rs.getDouble("taxes"));
		royaltyIncomeStatement.setUtilities(rs.getDouble("utilities"));

		return royaltyIncomeStatement;
	}

}
