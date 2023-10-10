package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.fdx.api.model51.modelimpl.PayoutMode;
import com.fdx.api.model51.modelimpl.PayoutType;
import com.fdx.api.model51.modelimpl.PeriodCertainType;
import com.fdx.api.model51.modelimpl.PolicyProductType;
import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.AnnualIncreaseType;
import com.fdx.api.model51.modelimpl.AnnuityAccount;
import com.fdx.api.model51.modelimpl.AnnuityProductType;
import com.fdx.api.model51.modelimpl.AnnuityValueBasis;
import com.fdx.api.model51.modelimpl.PaymentFrequency;
import com.fdx.api.model51.modelimpl.PeriodCertainGuarantee;

public class AnnuityAccountsRowMapper implements RowMapper<AnnuityAccount> {

	@Override
	public AnnuityAccount mapRow(ResultSet rs, int arg1) throws SQLException {

		AnnuityAccount annuityAccount = new AnnuityAccount();
		annuityAccount.setAccountId(rs.getString("accountid"));
		if (rs.getString("annuityProductType") != null)
			annuityAccount
					.setAnnuityProductType(AnnuityProductType.valueOf(rs.getString("annuityProductType")));
		if (rs.getString("annuityValueBasis") != null)
			annuityAccount
					.setAnnuityValueBasis(AnnuityValueBasis.valueOf(rs.getString("annuityValueBasis")));
		annuityAccount.setPaymentAmount(rs.getBigDecimal("paymentAmount"));
		if (rs.getString("paymentFrequency") != null)
			annuityAccount.setPaymentFrequency(PaymentFrequency.valueOf(rs.getString("paymentFrequency")));
		annuityAccount.setPaymentStartDate(rs.getTimestamp("paymentStartDate"));
		annuityAccount.setPaymentEndDate(rs.getTimestamp("paymentEndDate"));
		annuityAccount.setPayoutStartDate(rs.getTimestamp("payoutStartDate"));
		annuityAccount.setPayoutEndDate(rs.getTimestamp("payoutEndDate"));
		annuityAccount.setTotalPaymentCount(rs.getBigDecimal("totalPaymentCount"));
		annuityAccount.setNetPresentValue(rs.getBigDecimal("netPresentValue"));
		annuityAccount.setAnnualIncrease(rs.getBigDecimal("annualIncrease"));
		if (rs.getString("AnnualIncreaseType") != null)
			annuityAccount
					.setAnnualIncreaseType(AnnualIncreaseType.valueOf(rs.getString("AnnualIncreaseType")));
		if (rs.getString("periodCertainGuarantee") != null)
			annuityAccount.setPeriodCertainGuarantee(
					PeriodCertainGuarantee.fromValue(rs.getString("periodCertainGuarantee")));
		annuityAccount.setNumberModalPayouts(rs.getInt("numberModalPayouts"));
		annuityAccount.setPayoutAmount(rs.getBigDecimal("payoutAmount"));
		annuityAccount.setPayoutChangeAmount(rs.getBigDecimal("payoutChangeAmount"));
		annuityAccount.setPayoutChangePercentage(rs.getBigDecimal("payoutChangePercentage"));
		if (rs.getString("payoutMode") != null)
			annuityAccount.setPayoutMode(PayoutMode.valueOf(rs.getString("payoutMode")));
		if (rs.getString("payoutType") != null)
			annuityAccount.setPayoutType(PayoutType.valueOf(rs.getString("payoutType")));
		if (rs.getString("periodCertainType") != null)
			annuityAccount.setPeriodCertainType(PeriodCertainType.fromValue(rs.getString("periodCertainType")));
		if (rs.getString("policyProductType") != null)
			annuityAccount.setPolicyProductType(PolicyProductType.valueOf(rs.getString("policyProductType")));
		annuityAccount.setSurrenderValue(rs.getBigDecimal("surrenderValue"));

		return annuityAccount;
	}
}
