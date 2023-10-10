package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.InvestmentLoan;
import com.fdx.api.model51.modelimpl.LoanPaymentFrequency;

public class InvestmentLoanRowMapper implements RowMapper<InvestmentLoan> {

	@Override
	public InvestmentLoan mapRow(ResultSet rs, int rowNum) throws SQLException {
		InvestmentLoan investmentLoan = new InvestmentLoan();
		investmentLoan.setLoanId(rs.getString("loanid"));
		investmentLoan.setCurrentLoanBalance(rs.getBigDecimal("currentLoanBalance"));
		investmentLoan.setDateAsOf(rs.getTimestamp("dateAsOf"));
		investmentLoan.setInitialLoanBalance(rs.getBigDecimal("initialLoanBalance"));
		investmentLoan.setLoanDescription(rs.getString("loanDescription"));
		investmentLoan.setLoanId(rs.getString("loanId"));
		investmentLoan.setLoanInterestToDate(rs.getBigDecimal("loanInterestToDate"));
		investmentLoan.setLoanMaturityDate(rs.getTimestamp("loanMaturityDate"));
		investmentLoan.setLoanNextPaymentDate(rs.getTimestamp("loanNextPaymentDate"));
		investmentLoan.setLoanPaymentAmount(rs.getBigDecimal("loanPaymentAmount"));
		investmentLoan.setLoanPaymentFrequency(LoanPaymentFrequency.valueOf(rs.getString("LoanPaymentFrequency").toString()));
		investmentLoan.setLoanPaymentInitial(rs.getBigDecimal("loanPaymentInitial"));
		investmentLoan.setLoanPaymentsRemaining(rs.getInt("loanPaymentsRemaining"));
		investmentLoan.setLoanRate(rs.getBigDecimal("loanRate"));
		investmentLoan.setLoanStartDate(rs.getTimestamp("loanStartDate"));
		investmentLoan.setLoanTotalProjectedInterest(rs.getBigDecimal("loanTotalProjectedInterest"));

		return investmentLoan;
	}

}
