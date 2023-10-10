package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.CompoundingPeriod;
import com.fdx.api.model51.modelimpl.LoanAccount;
import com.fdx.api.model51.modelimpl.LoanTransaction;
import com.fdx.api.model51.modelimpl.PaymentFrequency;

public class LoanAccountsRowMapper implements RowMapper<LoanAccount> {

	@Override
	public LoanAccount mapRow(ResultSet rs, int arg1) throws SQLException {
		LoanAccount loanAccount = new LoanAccount();
		loanAccount.setAccountId(rs.getString("accountid"));
		loanAccount.setBalanceAsOf(rs.getTimestamp("balanceAsOf"));
		loanAccount.setPrincipalBalance(rs.getBigDecimal("principalBalance"));
		loanAccount.setEscrowBalance(rs.getBigDecimal("escrowBalance"));
		loanAccount.setOriginalPrincipal(rs.getBigDecimal("originalPrincipal"));
		loanAccount.setOriginatingDate(rs.getTimestamp("originatingDate"));
		loanAccount.setLoanTerm(rs.getInt("loanTerm"));
		loanAccount.setTotalNumberOfPayments(rs.getInt("totalNumberOfPayments"));
		loanAccount.setNextPaymentAmount(rs.getBigDecimal("nextPaymentAmount"));
		loanAccount.setNextPaymentDate(rs.getTimestamp("nextPaymentDate"));
		if (rs.getString("paymentFrequency") != null)
			loanAccount.setPaymentFrequency(PaymentFrequency.valueOf(rs.getString("paymentFrequency")));
		if (rs.getString("compoundingPeriod") != null)
			loanAccount.setCompoundingPeriod(CompoundingPeriod.valueOf(rs.getString("compoundingPeriod")));
		loanAccount.setPayOffAmount(rs.getBigDecimal("payOffAmount"));
		loanAccount.setLastPaymentAmount(rs.getBigDecimal("lastPaymentAmount"));
		loanAccount.setLastPaymentDate(rs.getTimestamp("lastPaymentDate"));
		loanAccount.setMaturityDate(rs.getTimestamp("maturityDate"));
		loanAccount.setInterestPaidYearToDate(rs.getBigDecimal("interestPaidYearToDate"));

//		Transactions starts
		if (rs.getArray("loantransactionid") != null) {
			List<Integer> transactionsList = Arrays.asList((Integer[]) rs.getArray("loantransactionid").getArray());

			List<LoanTransaction> transactionsListNew = new ArrayList<>();
			for (Integer transactionId : transactionsList) {
				LoanTransaction loanTransaction = new LoanTransaction();
				loanTransaction.setLoantransactionid(transactionId);
				transactionsListNew.add(loanTransaction);
			}
			loanAccount.setTransactions(transactionsListNew);
		}
//		Transactions ends

		return loanAccount;
	}
}
