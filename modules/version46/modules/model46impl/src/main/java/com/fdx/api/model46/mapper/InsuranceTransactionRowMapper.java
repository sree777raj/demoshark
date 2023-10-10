package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.InsuranceTransaction;
import com.fdx.api.model46.modelimpl.InsuranceTransaction.TransactionTypeEnum;

public class InsuranceTransactionRowMapper implements RowMapper<InsuranceTransaction> {

	@Override
	public InsuranceTransaction mapRow(ResultSet rs, int rowNum) throws SQLException {
		InsuranceTransaction insuranceTransaction = new InsuranceTransaction();
		insuranceTransaction.setAccountId(rs.getString("accountId"));
		insuranceTransaction.setTransactionId(rs.getString("transactionId"));
		if (rs.getString("transactionType") != null)
			insuranceTransaction.setTransactionType(TransactionTypeEnum.valueOf(rs.getString("transactionType")));

		return insuranceTransaction;
	}

}
