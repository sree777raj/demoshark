package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.Bills;
import com.fdx.api.model46.modelimpl.InsuranceAccount;
import com.fdx.api.model46.modelimpl.InsuranceAccount.AccountCategoryEnum;
import com.fdx.api.model46.modelimpl.InsuranceAccount.PolicyPremiumTermEnum;
import com.fdx.api.model46.modelimpl.InsuranceTransaction;

public class InsuranceAccountsRowMapper implements RowMapper<InsuranceAccount> {

	@Override
	public InsuranceAccount mapRow(ResultSet rs, int arg1) throws SQLException {
		InsuranceAccount insuranceAccount = new InsuranceAccount();

		insuranceAccount.setAccountId(rs.getString("accountid"));
		if (rs.getString("accountCategory") != null)
			insuranceAccount.setAccountCategory(AccountCategoryEnum.valueOf(rs.getString("accountCategory")));
		insuranceAccount.setPolicyPremium(rs.getBigDecimal("policyPremium"));
		if (rs.getString("policyPremiumTerm") != null)
			insuranceAccount.setPolicyPremiumTerm(PolicyPremiumTermEnum.valueOf(rs.getString("policyPremiumTerm")));
		insuranceAccount.setPolicyStartDate(rs.getTimestamp("policyStartDate"));
		insuranceAccount.setPolicyEndDate(rs.getTimestamp("policyEndDate"));
		insuranceAccount.setPolicyCoverageAmount(rs.getBigDecimal("policyCoverageAmount"));
		insuranceAccount.setPolicyPremium(rs.getBigDecimal("policyPremium"));

//		Transactions starts
		if (rs.getArray("insurancetransactionsid") != null) {
			List<Integer> transactionsList = Arrays
					.asList((Integer[]) rs.getArray("insurancetransactionsid").getArray());

			List<InsuranceTransaction> transactionsListNew = new ArrayList<>();
			for (Integer transactionId : transactionsList) {
				InsuranceTransaction insuranceTransaction = new InsuranceTransaction();
				insuranceTransaction.setInsuranceTransactionsId(transactionId);
				transactionsListNew.add(insuranceTransaction);
			}
			insuranceAccount.setTransactions(transactionsListNew);
		}
//		Transactions ends

//		Bills starts
		if (rs.getArray("billid") != null) {
			List<Integer> transactionsList = Arrays.asList((Integer[]) rs.getArray("billid").getArray());

			List<Bills> billsListNew = new ArrayList<>();
			for (Integer billId : transactionsList) {
				Bills bills = new Bills();
				bills.setBillid(billId);
				billsListNew.add(bills);
			}
			insuranceAccount.setBills(billsListNew);
		}
//		Bills ends

		return insuranceAccount;
	}
}
