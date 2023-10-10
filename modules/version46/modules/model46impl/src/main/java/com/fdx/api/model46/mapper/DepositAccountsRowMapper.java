package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.DepositAccount;
import com.fdx.api.model46.modelimpl.DepositTransaction;

public class DepositAccountsRowMapper implements RowMapper<DepositAccount> {

	@Override
	public DepositAccount mapRow(ResultSet rs, int arg1) throws SQLException {
		DepositAccount depositAcount = new DepositAccount();
		depositAcount.setAccountId(rs.getString("accountid"));
		depositAcount.setBalanceAsOf(rs.getTimestamp("balanceAsOf"));
		depositAcount.setCurrentBalance(rs.getBigDecimal("currentBalance"));
		depositAcount.setOpeningDayBalance(rs.getBigDecimal("openingDayBalance"));
		depositAcount.setAvailableBalance(rs.getBigDecimal("availableBalance"));
		depositAcount.setAnnualPercentageYield(rs.getBigDecimal("annualPercentageYield"));
		depositAcount.setInterestYtd(rs.getBigDecimal("interestYtd"));
		depositAcount.setTerm(rs.getInt("term"));
		depositAcount.setMaturityDate(rs.getTimestamp("maturityDate"));

		List<DepositTransaction> depositTransactionList = new ArrayList<>();
		if (rs.getArray("deposittransactionsid") != null) {
			List<Integer> transactionResponseList = new ArrayList<>(Arrays
					.asList((Integer[]) rs.getArray("deposittransactionsid").getArray()));
			depositAcount.setDepositTransactionId(transactionResponseList);
			for (Integer listele : transactionResponseList) {
				DepositTransaction depositTransaction = new DepositTransaction();
				depositTransaction.setDepositTransactionId(listele);

				depositTransactionList.add(depositTransaction);
			}
			depositAcount.setDepositTransaction(depositTransactionList);
		}
		return depositAcount;
	}
}
