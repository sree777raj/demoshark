package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.Address;
import com.fdx.api.model51.modelimpl.DateAmount;
import com.fdx.api.model51.modelimpl.DescriptionAmount;
import com.fdx.api.model51.modelimpl.RentalIncomeStatement;

public class RentalIncomeStatementRowMapper implements RowMapper<RentalIncomeStatement> {

	@Override
	public RentalIncomeStatement mapRow(ResultSet rs, int rowNum) throws SQLException {
		RentalIncomeStatement rentalIncomeStatement = new RentalIncomeStatement();
		rentalIncomeStatement.setAdvertising(rs.getDouble("advertising"));
		rentalIncomeStatement.setAuto(rs.getDouble("auto"));
		rentalIncomeStatement.setCleaning(rs.getDouble("cleaning"));
		rentalIncomeStatement.setCommissions(rs.getDouble("commissions"));
		rentalIncomeStatement.setDepreciationExpense(rs.getDouble("depreciationExpense"));
		rentalIncomeStatement.setInsurance(rs.getDouble("insurance"));
		rentalIncomeStatement.setLegal(rs.getDouble("legal"));
		rentalIncomeStatement.setManagementFees(rs.getDouble("managementFees"));
		rentalIncomeStatement.setMortgageInterest(rs.getDouble("mortgageInterest"));
		rentalIncomeStatement.setOtherInterest(rs.getDouble("otherInterest"));
		rentalIncomeStatement.setRents(rs.getDouble("rents"));
		rentalIncomeStatement.setRepairs(rs.getDouble("repairs"));
		rentalIncomeStatement.setSupplies(rs.getDouble("supplies"));
		rentalIncomeStatement.setUtilities(rs.getDouble("utilities"));
		rentalIncomeStatement.setTaxes(rs.getDouble("taxes"));

		List<DescriptionAmount> otherExpensesResponseList = new ArrayList<>();
		if (rs.getArray("otherExpenses") != null) {
			List<Integer> otherExpensesList = Arrays.asList((Integer[]) rs.getArray("otherExpenses").getArray());
			for (int otherExpenses : otherExpensesList) {
				DescriptionAmount descriptionAmount = new DescriptionAmount();
				descriptionAmount.setDescAmountId(otherExpenses);
				otherExpensesResponseList.add(descriptionAmount);
			}
			rentalIncomeStatement.setOtherExpenses(otherExpensesResponseList);
		}

		Address address = new Address();
		if (rs.getInt("propertyaddress") != 0) {
			address.setAddressId(rs.getInt("propertyaddress"));
			rentalIncomeStatement.setPropertyAddress(address);
		}

		List<DateAmount> dateAmountList = new ArrayList<>();
		if (rs.getArray("capitalexpenditures") != null) {
			List<Integer> dateAmountResponseList = Arrays
					.asList((Integer[]) rs.getArray("capitalexpenditures").getArray());
			for (Integer dateAmountIterator : dateAmountResponseList) {
				DateAmount dateAmount = new DateAmount();
				dateAmount.setDateamountid(dateAmountIterator);
				dateAmountList.add(dateAmount);
			}
			rentalIncomeStatement.setCapitalExpenditures(dateAmountList);
		}
		return rentalIncomeStatement;
	}

}
