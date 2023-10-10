package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.LocAccount;
import com.fdx.api.model46.modelimpl.LocTransaction;

public class LocAccountsRowMapper implements RowMapper<LocAccount> {

	@Override
	public LocAccount mapRow(ResultSet rs, int arg1) throws SQLException {
		LocAccount locAccount = new LocAccount();
		locAccount.setAccountId(rs.getString("accountid"));
		locAccount.setBalanceAsOf(rs.getTimestamp("balanceAsOf"));
		locAccount.setCreditLine(rs.getBigDecimal("creditLine"));
		locAccount.setAvailableCredit(rs.getBigDecimal("availableCredit"));
		locAccount.setNextPaymentAmount(rs.getBigDecimal("nextPaymentAmount"));
		locAccount.setNextPaymentDate(rs.getTimestamp("nextPaymentDate"));
		locAccount.setPrincipalBalance(rs.getBigDecimal("principalBalance"));
		locAccount.setCurrentBalance(rs.getBigDecimal("currentBalance"));
		locAccount.setMinimumPaymentAmount(rs.getBigDecimal("minimumPaymentAmount"));
		locAccount.setLastPaymentAmount(rs.getBigDecimal("lastPaymentAmount"));
		locAccount.setLastPaymentDate(rs.getTimestamp("lastPaymentDate"));
		locAccount.setPastDueAmount(rs.getBigDecimal("pastDueAmount"));
		locAccount.setLastStmtBalance(rs.getBigDecimal("lastStmtBalance"));
		locAccount.setLastStmtDate(rs.getTimestamp("lastStmtDate"));
		locAccount.setPointsAccrued(rs.getBigDecimal("pointsAccrued"));
		locAccount.setCurrentRewardsBalance(rs.getBigDecimal("currentRewardsBalance"));
		locAccount.setPointsRedeemed(rs.getBigDecimal("pointsRedeemed"));
		locAccount.setPurchasesApr(rs.getBigDecimal("purchasesApr"));
		locAccount.setAdvancesApr(rs.getBigDecimal("advancesApr"));
		locAccount.setCashAdvanceLimit(rs.getBigDecimal("cashAdvanceLimit"));
		locAccount.setAvailableCash(rs.getBigDecimal("availableCash"));
		locAccount.setFinanceCharges(rs.getBigDecimal("financeCharges"));
		
//		Transactions starts
		if (rs.getArray("loctransactionid") != null) {
		List<Integer> transactionsList = new ArrayList<>(Arrays.asList((Integer[]) rs.getArray("loctransactionid").getArray()));
		locAccount.setLocTransactionId(transactionsList);
		List<LocTransaction> transactionsListNew = new ArrayList<>();
		for (Integer transactionId : transactionsList) {
			LocTransaction locTransaction = new LocTransaction();
			locTransaction.setLocTransactionId(transactionId);
			transactionsListNew.add(locTransaction);
		}
		locAccount.setTransactions(transactionsListNew);
		}
//		Transactions ends
		
		
		return locAccount;
	}
}
