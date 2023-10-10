package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.DepositTransaction;
import com.fdx.api.model51.modelimpl.DepositTransactionType;
import com.fdx.api.model51.modelimpl.Transaction;

public class DepositTransactionRowMapper implements RowMapper<DepositTransaction> {

	@Override
	public DepositTransaction mapRow(ResultSet rs, int arg1) throws SQLException {

		DepositTransaction depositTransaction = new DepositTransaction();
		Transaction transaction = new Transaction();

		depositTransaction.setAccountId(rs.getString("accountid"));
		depositTransaction.setTransactionId(rs.getString("transactionId"));
		depositTransaction.setCheckNumber(rs.getInt("checkNumber"));
		depositTransaction.setPayee(rs.getString("payee"));
		if (rs.getString("transactionType") != null)
			depositTransaction.setTransactionType(DepositTransactionType.fromValue(rs.getString("transactionType")));
		transaction.setTransactionId(rs.getString("transactionid"));

		depositTransaction.setTransaction(transaction);
		return depositTransaction;

	}
}
