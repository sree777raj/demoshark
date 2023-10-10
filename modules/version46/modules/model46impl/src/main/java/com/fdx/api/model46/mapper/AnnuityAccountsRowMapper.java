package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.AnnualIncreaseType;
import com.fdx.api.model46.modelimpl.AnnuityAccount;
import com.fdx.api.model46.modelimpl.AnnuityProductType;
import com.fdx.api.model46.modelimpl.AnnuityValueBasis;
import com.fdx.api.model46.modelimpl.PaymentFrequency;
import com.fdx.api.model46.modelimpl.PeriodCertainGuarantee;

public class AnnuityAccountsRowMapper implements RowMapper<AnnuityAccount> {

	@Override
	public AnnuityAccount mapRow(ResultSet rs, int arg1) throws SQLException {

		AnnuityAccount annuityAccount = new AnnuityAccount();
		annuityAccount.setAccountId(rs.getString("accountid"));
		if (rs.getString("annuityProductType") != null)
			annuityAccount
					.setAnnuityProductType(AnnuityProductType.valueOf(rs.getString("annuityProductType").toString()));
		if (rs.getString("annuityValueBasis") != null)
			annuityAccount
					.setAnnuityValueBasis(AnnuityValueBasis.valueOf(rs.getString("annuityValueBasis").toString()));
		annuityAccount.setPaymentAmount(rs.getBigDecimal("paymentAmount"));
		if (rs.getString("paymentFrequency") != null)
			annuityAccount.setPaymentFrequency(PaymentFrequency.valueOf(rs.getString("paymentFrequency").toString()));
		annuityAccount.setPaymentStartDate(rs.getTimestamp("paymentStartDate"));
		annuityAccount.setPaymentEndDate(rs.getTimestamp("paymentEndDate"));
		annuityAccount.setTotalPaymentCount(rs.getBigDecimal("totalPaymentCount"));
		annuityAccount.setNetPresentValue(rs.getBigDecimal("netPresentValue"));
		annuityAccount.setAnnualIncrease(rs.getBigDecimal("annualIncrease"));
		if (rs.getString("AnnualIncreaseType") != null)
			annuityAccount
					.setAnnualIncreaseType(AnnualIncreaseType.valueOf(rs.getString("AnnualIncreaseType").toString()));
		if (rs.getString("periodCertainGuarantee") != null)
			annuityAccount.setPeriodCertainGuarantee(
					PeriodCertainGuarantee.fromValue(rs.getString("periodCertainGuarantee").toString()));

		return annuityAccount;
	}
}
