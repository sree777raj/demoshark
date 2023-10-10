package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.Transactions;

public class TransactionsRowMapper implements RowMapper<Transactions> {

	@Override
	public Transactions mapRow(ResultSet rs, int rowNum) throws SQLException {
		Transactions transactions = new Transactions();
		transactions.setAccountId(rs.getString("accountId"));
		transactions.setTransactionId(rs.getString("transactionId"));
		transactions.setTransactionSeqId(rs.getInt("transactionsequenceid"));
		transactions.setTransactionType(rs.getString("transactionsentitytype"));

		return transactions;
	}

}
