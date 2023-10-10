package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.Contribution;
import com.fdx.api.model51.modelimpl.Holding;
import com.fdx.api.model51.modelimpl.InvestmentAccount;
import com.fdx.api.model51.modelimpl.InvestmentBalance;
import com.fdx.api.model51.modelimpl.InvestmentLoan;
import com.fdx.api.model51.modelimpl.InvestmentTransaction;
import com.fdx.api.model51.modelimpl.OpenOrder;
import com.fdx.api.model51.modelimpl.PensionSource;
import com.fdx.api.model51.modelimpl.Vesting;

public class InvestmentAccountsRowMapper implements RowMapper<InvestmentAccount> {

	@Override
	public InvestmentAccount mapRow(ResultSet rs, int arg1) throws SQLException {
		InvestmentAccount investmentAccount = new InvestmentAccount();
		investmentAccount.setAccountId(rs.getString("accountid"));
		if (!(rs.getString("allowedCheckWriting") == null))
			investmentAccount.setAllowedCheckWriting(rs.getBoolean("allowedCheckWriting"));
		if (!(rs.getString("allowedOptionTrade") == null))
			investmentAccount.setAllowedOptionTrade(rs.getBoolean("allowedOptionTrade"));
		investmentAccount.setAvailableCashBalance(rs.getBigDecimal("availableCashBalance"));
		investmentAccount.setBalanceAsOf(rs.getTimestamp("balanceAsOf"));

//		Investment Balance starts
		List<InvestmentBalance> investmentBalanceList = new ArrayList<>();

		if (rs.getArray("balanceList") != null) {
			List<String> balanceResponseList = new ArrayList<>(Arrays.asList((String[]) rs.getArray("balanceList").getArray()));
			for (String listele : balanceResponseList) {
				InvestmentBalance investmentBalance = new InvestmentBalance();
				investmentBalance.setBalanceName(listele);
				investmentBalanceList.add(investmentBalance);
			}
			investmentAccount.setBalanceList(investmentBalanceList);
		}
//		Investment Balance ends

		investmentAccount.setBrokerId(rs.getString("brokerId"));
		investmentAccount.setCalendaryearFor401K(rs.getTimestamp("calendaryearFor401K"));

//		Contribution starts
		if (rs.getArray("contributionId") != null) {
			List<Integer> contributionList = new ArrayList<>(Arrays.asList((Integer[]) rs.getArray("contributionId").getArray()));

			List<Contribution> contributionListNew = new ArrayList<>();
			for (Integer contributionId : contributionList) {
				Contribution contribution = new Contribution();
				contribution.setContributionId(contributionId);
				contributionListNew.add(contribution);
			}
			investmentAccount.setContribution(contributionListNew);
//		Contribution ends
		}

		investmentAccount.setCurrentValue(rs.getBigDecimal("currentValue"));
		investmentAccount.setDailyChange(rs.getBigDecimal("dailyChange"));
		investmentAccount.setEmployerName(rs.getString("employerName"));

//		Holdings starts
		if (rs.getArray("holdingId") != null) {
			List<String> holdingList = new ArrayList<>(Arrays.asList((String[]) rs.getArray("holdingid").getArray()));

			List<Holding> holdingListNew = new ArrayList<>();
			for (String holdingId : holdingList) {
				Holding holding = new Holding();
				holding.setHoldingId(holdingId);
				holdingListNew.add(holding);
			}
			investmentAccount.setHoldings(holdingListNew);
		}
//		Holdings ends

//		Investment Loans starts
		if (rs.getArray("loanid") != null) {
			List<String> investmentLoanList = new ArrayList<>(Arrays.asList((String[]) rs.getArray("loanid").getArray()));

			List<InvestmentLoan> investmentLoanListNew = new ArrayList<>();
			for (String loanId : investmentLoanList) {
				InvestmentLoan investmentLoan = new InvestmentLoan();
				investmentLoan.setLoanId(loanId);
				investmentLoanListNew.add(investmentLoan);
			}
			investmentAccount.setInvestmentLoans(investmentLoanListNew);
		}
//		Investment Loan ends
		if (!(rs.getString("allowedOptionTrade") == null))
			investmentAccount.setMargin(rs.getBoolean("allowedOptionTrade"));
		investmentAccount.setMarginBalance(rs.getBigDecimal("marginbalance"));

//		Open Orders starts
		if (rs.getArray("orderid") != null) {
			List<String> openOrdersList = new ArrayList<>(Arrays.asList((String[]) rs.getArray("orderid").getArray()));

			List<OpenOrder> openOrderListNew = new ArrayList<>();
			for (String orderId : openOrdersList) {
				OpenOrder openOrder = new OpenOrder();
				openOrder.setOrderId(orderId);
				openOrderListNew.add(openOrder);
			}
			investmentAccount.setOpenOrders(openOrderListNew);
		}
//		Open Orders ends

//		Pension Sources starts
		if (rs.getArray("pensionsources") != null) {
			List<String> pensionSourceList = new ArrayList<>(Arrays.asList((String[]) rs.getArray("pensionsources").getArray()));

			List<PensionSource> pensionSourceListNew = new ArrayList<>();
			for (String displayName : pensionSourceList) {
				PensionSource pensionSource = new PensionSource();
				pensionSource.setDisplayName(displayName);
				pensionSourceListNew.add(pensionSource);
			}
			investmentAccount.setPensionSource(pensionSourceListNew);
		}
//		Pension Sources ends

		investmentAccount.setPercentageChange(rs.getBigDecimal("percentageChange"));
		investmentAccount.setPlanId(rs.getString("planid"));
		investmentAccount.setRolloverAmount(rs.getBigDecimal("rolloveramount"));
		investmentAccount.setShortBalance(rs.getBigDecimal("shortBalance"));

//		Transactions starts
		if (rs.getArray("investmenttransactionid") != null) {
			List<Integer> transactionsList = new ArrayList<>(Arrays
					.asList((Integer[]) rs.getArray("investmenttransactionid").getArray()));

			investmentAccount.setInvestmentTransactionId(transactionsList);
			List<InvestmentTransaction> transactionsListNew = new ArrayList<>();
			for (Integer transactionId : transactionsList) {
				InvestmentTransaction investmentTransaction = new InvestmentTransaction();
				investmentTransaction.setInvestmentTransactionId(transactionId);
				transactionsListNew.add(investmentTransaction);
			}
			investmentAccount.setTransactions(transactionsListNew);
		}
//		Transactions ends

//		Vesting starts
		if (rs.getArray("vestingId") != null) {
			List<Integer> vestingList = new ArrayList<>(Arrays.asList((Integer[]) rs.getArray("vestingid").getArray()));

			List<Vesting> vestingListNew = new ArrayList<>();
			for (Integer vestingId : vestingList) {
				Vesting vesting = new Vesting();
				vesting.setVestingId(vestingId);
				vestingListNew.add(vesting);
			}
			investmentAccount.setVesting(vestingListNew);
		}
//		Vesting ends

		return investmentAccount;
	}
}
