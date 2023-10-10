package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.Account;
import com.fdx.api.model46.modelimpl.AccountBillPayStatus;
import com.fdx.api.model46.modelimpl.BalanceType;
import com.fdx.api.model46.modelimpl.InterestRateType;

public class AccountRowMapper implements RowMapper<Account> {

	@Override
	public Account mapRow(ResultSet rs, int arg1) throws SQLException {
		Account account = new Account();
		account.setAccountId(rs.getString("accountid"));
		account.setParentAccountId(rs.getString("parentAccountId"));
		account.setLineOfBusiness(rs.getString("lineOfBusiness"));
		account.setRoutingTransitNumber(rs.getString("routingTransitNumber"));
		if (rs.getString("balanceType") != null)
			account.setBalanceType(BalanceType.valueOf(rs.getString("balanceType").toString()));
		account.setContactId(rs.getInt("contactId"));
		account.setInterestRate(rs.getBigDecimal("interestRate"));

		if (rs.getString("interestRateType") != null)
			account.setInterestRateType(InterestRateType.valueOf(rs.getString("interestRateType").toString()));
		account.setInterestRateAsOf(rs.getTimestamp("interestrateasof"));
		account.setPriorInterestRate(rs.getBigDecimal("priorinterestrate"));
		if (!(rs.getString("transferin") == null))
			account.setTransferIn(rs.getBoolean("transferin"));
		if (!(rs.getString("transferOut") == null))
			account.setTransferOut(rs.getBoolean("transferout"));

		if (rs.getString("billpaystatus") != null)
			account.setBillPayStatus(AccountBillPayStatus.valueOf(rs.getString("billpaystatus").toString()));
		account.setMicrNumber(rs.getString("micrnumber"));
		account.setLastActivityDate(rs.getTimestamp("lastactivitydate"));
		account.setRewardProgramId(rs.getString("rewardprogramid"));
		if (!(rs.getString("transactionsincluded") == null))
			account.setTransactionsIncluded(rs.getBoolean("transactionsincluded"));
		return account;
	}
}
