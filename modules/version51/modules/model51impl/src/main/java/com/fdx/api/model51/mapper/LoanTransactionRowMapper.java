package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.LoanTransaction;
import com.fdx.api.model51.modelimpl.LoanTransactionType;
import com.fdx.api.model51.modelimpl.PaymentDetails;

public class LoanTransactionRowMapper implements RowMapper<LoanTransaction> {

	@Override
	public LoanTransaction mapRow(ResultSet rs, int rowNum) throws SQLException {
		LoanTransaction loanTransaction = new LoanTransaction();
		loanTransaction.setAccountId(rs.getString("accountId"));
		loanTransaction.setTransactionId(rs.getString("transactionid"));
		if (rs.getString("transactionType") != null)
			loanTransaction.setTransactionType(LoanTransactionType.valueOf(rs.getString("transactionType")));

		if (rs.getInt("paymentdetailsid") != 0) {
			PaymentDetails paymentDetails = new PaymentDetails();
			paymentDetails.setPaymentdetailsid(rs.getInt("paymentdetailsid"));
			loanTransaction.setPaymentDetails(paymentDetails);
		}

		return loanTransaction;
	}

}
