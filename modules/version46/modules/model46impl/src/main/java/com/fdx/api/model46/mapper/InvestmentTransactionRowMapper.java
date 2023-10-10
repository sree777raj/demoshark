package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.IncomeType;
import com.fdx.api.model46.modelimpl.Inv401kSourceType;
import com.fdx.api.model46.modelimpl.InvestmentTransaction;
import com.fdx.api.model46.modelimpl.InvestmentTransaction.TransferActionEnum;
import com.fdx.api.model46.modelimpl.InvestmentTransactionType;
import com.fdx.api.model46.modelimpl.PositionType;
import com.fdx.api.model46.modelimpl.SecurityIdType;
import com.fdx.api.model46.modelimpl.SecurityType;
import com.fdx.api.model46.modelimpl.SubAccountType;
import com.fdx.api.model46.modelimpl.TransactionReason;
import com.fdx.api.model46.modelimpl.UnitType;

public class InvestmentTransactionRowMapper implements RowMapper<InvestmentTransaction> {

	@Override
	public InvestmentTransaction mapRow(ResultSet rs, int arg1) throws SQLException {
		InvestmentTransaction investmentTransaction = new InvestmentTransaction();
		investmentTransaction.setAccountId(rs.getString("accountId"));
		investmentTransaction.setTransactionId(rs.getString("transactionId"));
		if (rs.getString("transactionType") != null)
			investmentTransaction
					.setTransactionType(InvestmentTransactionType.valueOf(rs.getString("transactionType")));
		investmentTransaction.setShares(rs.getBigDecimal("shares"));
		investmentTransaction.setFaceValue(rs.getBigDecimal("faceValue"));
		investmentTransaction.setPrice(rs.getBigDecimal("price"));
		investmentTransaction.setSecurityId(rs.getString("securityId"));
		if (rs.getString("securityIdType") != null)
			investmentTransaction.setSecurityIdType(SecurityIdType.valueOf(rs.getString("securityIdType")));
		if (rs.getString("securityType") != null)
			investmentTransaction.setSecurityType(SecurityType.valueOf(rs.getString("securityType")));
		investmentTransaction.setSymbol(rs.getString("symbol"));
		investmentTransaction.setMarkup(rs.getBigDecimal("markup"));
		investmentTransaction.setCommission(rs.getBigDecimal("commission"));
		investmentTransaction.setTaxes(rs.getBigDecimal("taxes"));
		investmentTransaction.setFees(rs.getBigDecimal("fees"));
		investmentTransaction.setLoad(rs.getBigDecimal("load"));
		if (rs.getString("inv401kSource") != null)
			investmentTransaction.setInv401kSource(Inv401kSourceType.valueOf(rs.getString("inv401kSource")));
		investmentTransaction.setConfirmationNumber(rs.getString("confirmationNumber"));
		investmentTransaction.setFractionalCash(rs.getBigDecimal("fractionalCash"));
		if (rs.getString("incomeType") != null)
			investmentTransaction.setIncomeType(IncomeType.valueOf(rs.getString("incomeType")));
		investmentTransaction.setOldUnits(rs.getBigDecimal("oldUnits"));
		investmentTransaction.setSplitRatioNumerator(rs.getBigDecimal("splitRatioNumerator"));
		investmentTransaction.setSplitRatioDenominator(rs.getBigDecimal("splitRatioDenominator"));
		investmentTransaction.setNewUnits(rs.getBigDecimal("newUnits"));
		if (rs.getString("subAccountSec") != null)
			investmentTransaction.setSubAccountSec(SubAccountType.valueOf(rs.getString("subAccountSec")));
		if (rs.getString("subAccountFund") != null)
			investmentTransaction.setSubAccountFund(SubAccountType.valueOf(rs.getString("subAccountFund")));
		investmentTransaction.setLoanId(rs.getString("loanId"));
		investmentTransaction.setLoanPrincipal(rs.getBigDecimal("loanPrincipal"));
		investmentTransaction.setLoanInterest(rs.getBigDecimal("loanInterest"));
		investmentTransaction.setPayrollDate(rs.getTimestamp("payrollDate"));
		if (!(rs.getString("priorYearContrib") == null))
			investmentTransaction.setPriorYearContrib(rs.getBoolean("priorYearContrib"));
		investmentTransaction.setWithholding(rs.getBigDecimal("withholding"));
		if (!(rs.getString("taxExempt") == null))
			investmentTransaction.setTaxExempt(rs.getBoolean("taxExempt"));
		investmentTransaction.setGain(rs.getBigDecimal("gain"));
		investmentTransaction.setStateWithholding(rs.getBigDecimal("stateWithholding"));
		investmentTransaction.setPenalty(rs.getBigDecimal("penalty"));
		investmentTransaction.setRunningBalance(rs.getBigDecimal("runningBalance"));
		investmentTransaction.setUnitPrice(rs.getBigDecimal("unitPrice"));
		investmentTransaction.setUnits(rs.getBigDecimal("units"));
		if (rs.getString("unitType") != null)
			investmentTransaction.setUnitType(UnitType.valueOf(rs.getString("unitType")));
		if (rs.getString("transactionReason") != null)
			investmentTransaction.setTransactionReason(TransactionReason.valueOf(rs.getString("transactionReason")));
		investmentTransaction.setAccruedInterest(rs.getBigDecimal("accruedInterest"));
		if (rs.getString("transferAction") != null)
			investmentTransaction.setTransferAction(TransferActionEnum.valueOf(rs.getString("transferAction")));
		if (rs.getString("positionType") != null)
			investmentTransaction.setPositionType(PositionType.valueOf(rs.getString("positionType")));
		return investmentTransaction;
	}
}
