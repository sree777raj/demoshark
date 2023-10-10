package com.fdx.api.model51.modelimpl;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.*;
import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import com.fdx.common.util.FdxConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fdx.api.model51.config.ConnectionConfigApi51;
import com.fdx.api.model51.mapper.InvestmentAccountsRowMapper;

import io.swagger.annotations.ApiModel;

/**
 * An investment account type and information such as balances, transactions,
 * holdings and privileges
 */
@ApiModel(description = "An investment account type and information such as balances, transactions, holdings and privileges")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvestmentAccount {

	NamedParameterJdbcTemplate template;

	@JsonUnwrapped
	private Account account;

	@JsonIgnore
	private String accountId;

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@JsonIgnore
	private List<Integer> investmentTransactionId;

	public List<Integer> getInvestmentTransactionId() {
		return investmentTransactionId;
	}

	public void setInvestmentTransactionId(List<Integer> investmentTransactionId) {
		this.investmentTransactionId = investmentTransactionId;
	}

	@JsonProperty("balanceAsOf")
	@JsonFormat(shape = JsonFormat.Shape.STRING, lenient = OptBoolean.FALSE)
	private java.sql.Timestamp balanceAsOf;

	@JsonProperty("allowedCheckWriting")
	@JsonInclude(Include.NON_NULL)
	private Boolean allowedCheckWriting;

	@JsonProperty("allowedOptionTrade")
	@JsonInclude(Include.NON_NULL)
	private Boolean allowedOptionTrade;

	@JsonProperty("currentValue")
	private BigDecimal currentValue;

	@JsonProperty("holdings")
	@Valid
	private List<Holding> holdings = null;

	@JsonProperty("openOrders")
	@Valid
	private List<OpenOrder> openOrders = null;

	@JsonProperty("contribution")
	@Valid
	private List<Contribution> contribution = null;

	@JsonProperty("vesting")
	@Valid
	private List<Vesting> vesting = null;

	@JsonProperty("investmentLoans")
	@Valid
	private List<InvestmentLoan> investmentLoans = null;

	@JsonProperty("availableCashBalance")
	private BigDecimal availableCashBalance;

	@JsonProperty("margin")
	@JsonInclude(Include.NON_NULL)
	private Boolean margin;

	@JsonProperty("marginBalance")
	private BigDecimal marginBalance;

	@JsonProperty("shortBalance")
	private BigDecimal shortBalance;

	@JsonProperty("rolloverAmount")
	private BigDecimal rolloverAmount;

	@JsonProperty("employerName")
	private String employerName;

	@JsonProperty("brokerId")
	private String brokerId;

	@JsonProperty("planId")
	private String planId;

	@JsonProperty("calendaryearFor401K")
	@JsonFormat(shape = JsonFormat.Shape.STRING, lenient = OptBoolean.FALSE)
	private java.sql.Timestamp calendaryearFor401K;

	@JsonProperty("balanceList")
	@Valid
	private List<InvestmentBalance> balanceList = null;

	@JsonProperty("dailyChange")
	private BigDecimal dailyChange;

	@JsonProperty("percentageChange")
	private BigDecimal percentageChange;

	@JsonProperty("transactions")
	@Valid
	private List<InvestmentTransaction> transactions = null;

	@JsonProperty("pensionSource")
	@Valid
	private List<PensionSource> pensionSource = null;

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public java.sql.Timestamp getBalanceAsOf() {
		return balanceAsOf;
	}

	public void setBalanceAsOf(java.sql.Timestamp balanceAsOf) {
		this.balanceAsOf = balanceAsOf;
	}

	public Boolean getAllowedCheckWriting() {
		return allowedCheckWriting;
	}

	public void setAllowedCheckWriting(Boolean allowedCheckWriting) {
		this.allowedCheckWriting = allowedCheckWriting;
	}

	public Boolean getAllowedOptionTrade() {
		return allowedOptionTrade;
	}

	public void setAllowedOptionTrade(Boolean allowedOptionTrade) {
		this.allowedOptionTrade = allowedOptionTrade;
	}

	public BigDecimal getCurrentValue() {
		return currentValue;
	}

	public void setCurrentValue(BigDecimal currentValue) {
		this.currentValue = currentValue;
	}

	public List<Holding> getHoldings() {
		return holdings;
	}

	public void setHoldings(List<Holding> holdings) {
		this.holdings = holdings;
	}

	public List<OpenOrder> getOpenOrders() {
		return openOrders;
	}

	public void setOpenOrders(List<OpenOrder> openOrders) {
		this.openOrders = openOrders;
	}

	public List<Contribution> getContribution() {
		return contribution;
	}

	public void setContribution(List<Contribution> contribution) {
		this.contribution = contribution;
	}

	public List<Vesting> getVesting() {
		return vesting;
	}

	public void setVesting(List<Vesting> vesting) {
		this.vesting = vesting;
	}

	public List<InvestmentLoan> getInvestmentLoans() {
		return investmentLoans;
	}

	public void setInvestmentLoans(List<InvestmentLoan> investmentLoans) {
		this.investmentLoans = investmentLoans;
	}

	public BigDecimal getAvailableCashBalance() {
		return availableCashBalance;
	}

	public void setAvailableCashBalance(BigDecimal availableCashBalance) {
		this.availableCashBalance = availableCashBalance;
	}

	public Boolean getMargin() {
		return margin;
	}

	public void setMargin(Boolean margin) {
		this.margin = margin;
	}

	public BigDecimal getMarginBalance() {
		return marginBalance;
	}

	public void setMarginBalance(BigDecimal marginBalance) {
		this.marginBalance = marginBalance;
	}

	public BigDecimal getShortBalance() {
		return shortBalance;
	}

	public void setShortBalance(BigDecimal shortBalance) {
		this.shortBalance = shortBalance;
	}

	public BigDecimal getRolloverAmount() {
		return rolloverAmount;
	}

	public void setRolloverAmount(BigDecimal rolloverAmount) {
		this.rolloverAmount = rolloverAmount;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public String getBrokerId() {
		return brokerId;
	}

	public void setBrokerId(String brokerId) {
		this.brokerId = brokerId;
	}

	public String getPlanId() {
		return planId;
	}

	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public java.sql.Timestamp getCalendaryearFor401K() {
		return calendaryearFor401K;
	}

	public void setCalendaryearFor401K(java.sql.Timestamp calendaryearFor401K) {
		this.calendaryearFor401K = calendaryearFor401K;
	}

	public List<InvestmentBalance> getBalanceList() {
		return balanceList;
	}

	public void setBalanceList(List<InvestmentBalance> balanceList) {
		this.balanceList = balanceList;
	}

	public BigDecimal getDailyChange() {
		return dailyChange;
	}

	public void setDailyChange(BigDecimal dailyChange) {
		this.dailyChange = dailyChange;
	}

	public BigDecimal getPercentageChange() {
		return percentageChange;
	}

	public void setPercentageChange(BigDecimal percentageChange) {
		this.percentageChange = percentageChange;
	}

	public List<InvestmentTransaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<InvestmentTransaction> transactions) {
		this.transactions = transactions;
	}

	public List<PensionSource> getPensionSource() {
		return pensionSource;
	}

	public void setPensionSource(List<PensionSource> pensionSource) {
		this.pensionSource = pensionSource;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((account == null) ? 0 : account.hashCode());
		//result = prime * result + ((accountId == null) ? 0 : accountId.hashCode());
		result = prime * result + ((allowedCheckWriting == null) ? 0 : allowedCheckWriting.hashCode());
		result = prime * result + ((allowedOptionTrade == null) ? 0 : allowedOptionTrade.hashCode());
		result = prime * result + ((availableCashBalance == null) ? 0 : availableCashBalance.hashCode());
		result = prime * result + ((balanceAsOf == null) ? 0 : balanceAsOf.hashCode());
		result = prime * result + ((balanceList == null) ? 0 : balanceList.hashCode());
		result = prime * result + ((brokerId == null) ? 0 : brokerId.hashCode());
		result = prime * result + ((calendaryearFor401K == null) ? 0 : calendaryearFor401K.hashCode());
		result = prime * result + ((contribution == null) ? 0 : contribution.hashCode());
		result = prime * result + ((currentValue == null) ? 0 : currentValue.hashCode());
		result = prime * result + ((dailyChange == null) ? 0 : dailyChange.hashCode());
		result = prime * result + ((employerName == null) ? 0 : employerName.hashCode());
		result = prime * result + ((holdings == null) ? 0 : holdings.hashCode());
		result = prime * result + ((investmentLoans == null) ? 0 : investmentLoans.hashCode());
		result = prime * result + ((margin == null) ? 0 : margin.hashCode());
		result = prime * result + ((marginBalance == null) ? 0 : marginBalance.hashCode());
		result = prime * result + ((openOrders == null) ? 0 : openOrders.hashCode());
		result = prime * result + ((pensionSource == null) ? 0 : pensionSource.hashCode());
		result = prime * result + ((percentageChange == null) ? 0 : percentageChange.hashCode());
		result = prime * result + ((planId == null) ? 0 : planId.hashCode());
		result = prime * result + ((rolloverAmount == null) ? 0 : rolloverAmount.hashCode());
		result = prime * result + ((shortBalance == null) ? 0 : shortBalance.hashCode());
		result = prime * result + ((transactions == null) ? 0 : transactions.hashCode());
		result = prime * result + ((vesting == null) ? 0 : vesting.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InvestmentAccount other = (InvestmentAccount) obj;
		if (account == null) {
			if (other.account != null)
				return false;
		} else if (!account.equals(other.account))
			return false;
/*		if (accountId == null) {
			if (other.accountId != null)
				return false;
		} else if (!accountId.equals(other.accountId))
			return false;*/
		if (allowedCheckWriting == null) {
			if (other.allowedCheckWriting != null)
				return false;
		} else if (!allowedCheckWriting.equals(other.allowedCheckWriting))
			return false;
		if (allowedOptionTrade == null) {
			if (other.allowedOptionTrade != null)
				return false;
		} else if (!allowedOptionTrade.equals(other.allowedOptionTrade))
			return false;
		if (availableCashBalance == null) {
			if (other.availableCashBalance != null)
				return false;
		} else if (!availableCashBalance.equals(other.availableCashBalance))
			return false;
		if (balanceAsOf == null) {
			if (other.balanceAsOf != null)
				return false;
		} else if (!balanceAsOf.equals(other.balanceAsOf))
			return false;
		if (balanceList == null) {
			if (other.balanceList != null)
				return false;
		} else if (!balanceList.equals(other.balanceList))
			return false;
		if (brokerId == null) {
			if (other.brokerId != null)
				return false;
		} else if (!brokerId.equals(other.brokerId))
			return false;
		if (calendaryearFor401K == null) {
			if (other.calendaryearFor401K != null)
				return false;
		} else if (!calendaryearFor401K.equals(other.calendaryearFor401K))
			return false;
		if (contribution == null) {
			if (other.contribution != null)
				return false;
		} else if (!contribution.equals(other.contribution))
			return false;
		if (currentValue == null) {
			if (other.currentValue != null)
				return false;
		} else if (!currentValue.equals(other.currentValue))
			return false;
		if (dailyChange == null) {
			if (other.dailyChange != null)
				return false;
		} else if (!dailyChange.equals(other.dailyChange))
			return false;
		if (employerName == null) {
			if (other.employerName != null)
				return false;
		} else if (!employerName.equals(other.employerName))
			return false;
		if (holdings == null) {
			if (other.holdings != null)
				return false;
		} else if (!holdings.equals(other.holdings))
			return false;
		if (investmentLoans == null) {
			if (other.investmentLoans != null)
				return false;
		} else if (!investmentLoans.equals(other.investmentLoans))
			return false;
		if (margin == null) {
			if (other.margin != null)
				return false;
		} else if (!margin.equals(other.margin))
			return false;
		if (marginBalance == null) {
			if (other.marginBalance != null)
				return false;
		} else if (!marginBalance.equals(other.marginBalance))
			return false;
		if (openOrders == null) {
			if (other.openOrders != null)
				return false;
		} else if (!openOrders.equals(other.openOrders))
			return false;
		if (pensionSource == null) {
			if (other.pensionSource != null)
				return false;
		} else if (!pensionSource.equals(other.pensionSource))
			return false;
		if (percentageChange == null) {
			if (other.percentageChange != null)
				return false;
		} else if (!percentageChange.equals(other.percentageChange))
			return false;
		if (planId == null) {
			if (other.planId != null)
				return false;
		} else if (!planId.equals(other.planId))
			return false;
		if (rolloverAmount == null) {
			if (other.rolloverAmount != null)
				return false;
		} else if (!rolloverAmount.equals(other.rolloverAmount))
			return false;
		if (shortBalance == null) {
			if (other.shortBalance != null)
				return false;
		} else if (!shortBalance.equals(other.shortBalance))
			return false;
		if (transactions == null) {
			if (other.transactions != null)
				return false;
		} else if (!transactions.equals(other.transactions))
			return false;
		if (vesting == null) {
			if (other.vesting != null)
				return false;
		} else if (!vesting.equals(other.vesting))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "InvestmentAccount [account=" + account + ", balanceAsOf=" + balanceAsOf
				+ ", allowedCheckWriting=" + allowedCheckWriting + ", allowedOptionTrade=" + allowedOptionTrade
				+ ", currentValue=" + currentValue + ", holdings=" + holdings + ", openOrders=" + openOrders
				+ ", contribution=" + contribution + ", vesting=" + vesting + ", investmentLoans=" + investmentLoans
				+ ", availableCashBalance=" + availableCashBalance + ", margin=" + margin + ", marginBalance="
				+ marginBalance + ", shortBalance=" + shortBalance + ", rolloverAmount=" + rolloverAmount
				+ ", employerName=" + employerName + ", brokerId=" + brokerId + ", planId=" + planId
				+ ", calendaryearFor401K=" + calendaryearFor401K + ", balanceList=" + balanceList + ", dailyChange="
				+ dailyChange + ", percentageChange=" + percentageChange + ", transactions=" + transactions
				+ ", pensionSource=" + pensionSource + ", getAccount()=" + getAccount()
				+ ", getBalanceAsOf()=" + getBalanceAsOf() + ", getAllowedCheckWriting()="
				+ getAllowedCheckWriting() + ", getAllowedOptionTrade()=" + getAllowedOptionTrade()
				+ ", getCurrentValue()=" + getCurrentValue() + ", getHoldings()=" + getHoldings() + ", getOpenOrders()="
				+ getOpenOrders() + ", getContribution()=" + getContribution() + ", getVesting()=" + getVesting()
				+ ", getInvestmentLoans()=" + getInvestmentLoans() + ", getAvailableCashBalance()="
				+ getAvailableCashBalance() + ", getMargin()=" + getMargin() + ", getMarginBalance()="
				+ getMarginBalance() + ", getShortBalance()=" + getShortBalance() + ", getRolloverAmount()="
				+ getRolloverAmount() + ", getEmployerName()=" + getEmployerName() + ", getBrokerId()=" + getBrokerId()
				+ ", getPlanId()=" + getPlanId() + ", getCalendaryearFor401K()=" + getCalendaryearFor401K()
				+ ", getBalanceList()=" + getBalanceList() + ", getDailyChange()=" + getDailyChange()
				+ ", getPercentageChange()=" + getPercentageChange() + ", getTransactions()=" + getTransactions()
				+ ", getPensionSource()=" + getPensionSource() + ", hashCode()=" + hashCode() + ", getClass()="
				+ getClass() + ", toString()=" + super.toString() + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(InvestmentAccount.class);

	public InvestmentAccount getInvestmentAccount(String accountId) throws Exception {
		try {
			SqlParameterSource parameters = new MapSqlParameterSource("accountIds", accountId);
			template = ConnectionConfigApi51.getTemplate();
			Account account = new Account();
			InvestmentAccount investmentAccount = template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".investmentAccount where accountid in (:accountIds)", parameters,
					new InvestmentAccountsRowMapper());
			return investmentAccount;
		} catch (Exception e) {
			if (!(e instanceof FDXException))
				log.error("InvestmentAccount : ", e);
			throw new FDXException(e,"InvestmentAccount :: " + e.getMessage());
		}
	}

	public InvestmentAccount getInvestmentAccount(String accountIds, LocalDate startTime, LocalDate endTime)
			throws FDXException {
		try {
			SqlParameterSource parameters = new MapSqlParameterSource("accountIds", accountIds);
			template = ConnectionConfigApi51.getTemplate();
			Account account = new Account();
			InvestmentAccount investmentAccount;
			try {
				investmentAccount = template.queryForObject(
						"select * from "+ DeveloperContext.getDeveloperSchema() +".investmentAccount where accountid in (:accountIds)", parameters,
						new InvestmentAccountsRowMapper());
			} catch (EmptyResultDataAccessException e) {
				throw new FDXException("Investment Account not found", 0);
			}
			InvestmentTransaction investmentTransaction = new InvestmentTransaction();
			List<InvestmentTransaction> investmentTransactionListNew = investmentAccount.getTransactions();
			List<InvestmentTransaction> investmentTransactionList = new ArrayList<>();
			account = (Account) account.getAccount(accountIds, "details");
//		TransactionList Starts
			if (investmentTransactionListNew != null) {
				try {
					for (InvestmentTransaction investmentTransactionIterator : investmentTransactionListNew) {
						investmentTransaction = investmentTransaction.getInvestmentTransactions(
								account.getAccountId(),
								investmentTransactionIterator.getInvestmentTransactionId(), startTime, endTime);
						investmentTransactionList.add(investmentTransaction);
					}
				} catch (EmptyResultDataAccessException | FDXException e) {
					// Ignore if no investment transactions found
					log.warn("Investment Transaction details not found for accountid: " + account.getAccountId(), e.getMessage());
				}
			}
			investmentAccount.setTransactions(investmentTransactionList);
//		TransactionList Ends
//		BalanceList starts	
			if (investmentAccount.getBalanceList() != null) {
				List<InvestmentBalance> investmentBalanceListNew = new ArrayList<>();
				;
				List<InvestmentBalance> investmentBalanceList = investmentAccount.getBalanceList();
				for (InvestmentBalance investmentBalanceIterator : investmentBalanceList) {
					InvestmentBalance investmentBalance = new InvestmentBalance();
					investmentBalance = investmentBalance
							.getInvestmentBalance(investmentBalanceIterator.getBalanceName());
					investmentBalanceListNew.add(investmentBalance);
				}
				investmentAccount.setBalanceList(investmentBalanceListNew);
			}
//		BalanceList ends

//		ContributionList starts
			if (investmentAccount.getContribution() != null) {
				List<Contribution> contributionListNew = new ArrayList<>();
				List<Contribution> contributionList = investmentAccount.getContribution();
				for (Contribution contributionIterator : contributionList) {
					Contribution contribution = new Contribution();
					contribution = contribution.getContribution(contributionIterator.getContributionId());
					contributionListNew.add(contribution);
				}
				investmentAccount.setContribution(contributionListNew);
			}
//		ContributionList ends

//		HoldingList starts	
			if (investmentAccount.getHoldings() != null) {
				List<Holding> holdingListNew = new ArrayList<>();
				List<Holding> holdingList = investmentAccount.getHoldings();
				for (Holding holdingIterator : holdingList) {
					Holding holding = new Holding();
					holding = holding.getHoldings(holdingIterator.getHoldingId());
					holdingListNew.add(holding);
				}
				investmentAccount.setHoldings(holdingListNew);
			}
//		HoldingList ends

//		InvestmentLoanList starts	
			if (investmentAccount.getInvestmentLoans() != null) {
				List<InvestmentLoan> investmentLoanListNew = new ArrayList<>();
				List<InvestmentLoan> investmentLoanList = investmentAccount.getInvestmentLoans();
				for (InvestmentLoan investmentLoanIterator : investmentLoanList) {
					InvestmentLoan investmentLoan = new InvestmentLoan();
					investmentLoan = investmentLoan.getInvestmentLoan(investmentLoanIterator.getLoanId());
					investmentLoanListNew.add(investmentLoan);
				}
				investmentAccount.setInvestmentLoans(investmentLoanListNew);
//		InvestmentLoanList ends

//		OpenOrderList starts	
				if (investmentAccount.getOpenOrders() != null) {
					List<OpenOrder> openOrderListNew = new ArrayList<>();
					List<OpenOrder> openOrderList = investmentAccount.getOpenOrders();
					for (OpenOrder OpenOrderIterator : openOrderList) {
						OpenOrder OpenOrderNew = new OpenOrder();
						OpenOrderNew = OpenOrderIterator.getOpenOrders(OpenOrderIterator.getOrderId());
						openOrderListNew.add(OpenOrderNew);
					}
					investmentAccount.setOpenOrders(openOrderListNew);
				}
//		OpenOrderList ends

//		VestingList starts	
				if (investmentAccount.getVesting() != null) {
					List<Vesting> vestingListNew = new ArrayList<>();
					List<Vesting> vestingList = investmentAccount.getVesting();
					for (Vesting vestingIterator : vestingList) {
						Vesting vestingNew = new Vesting();
						vestingNew = vestingIterator.getVesting(vestingIterator.getVestingId());
						vestingListNew.add(vestingNew);
					}
					investmentAccount.setVesting(vestingListNew);
				}
//		VestingList ends

//		PensionSourceList starts	
				if (investmentAccount.getPensionSource() != null) {
					List<PensionSource> pensionSourceListNew = new ArrayList<>();
					List<PensionSource> pensionSourceList = investmentAccount.getPensionSource();
					for (PensionSource pensionSourceIterator : pensionSourceList) {
						PensionSource pensionSource = new PensionSource();
						pensionSource = pensionSource.getPensionSource(pensionSourceIterator.getDisplayName());
						pensionSourceListNew.add(pensionSource);
					}
					investmentAccount.setPensionSource(pensionSourceListNew);
				}
//		PensionSourceList ends
			}
			investmentAccount.setAccount(account);
			return investmentAccount;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("InvestmentAccount : ", e);
			throw new FDXException(e, FdxConstants.HTTP_ERROR_CODE_500);
		}
	}

	public Map<String, Object> updateInvestmentAccount(String accountId) throws FDXException {
		KeyHolder keyHolder = new GeneratedKeyHolder();
		try {
			template = ConnectionConfigApi51.getTemplate();
			List<Integer> investmentTransactionArray = null;
			Integer[] investmentTransactionArrayKeyList = new Integer[investmentTransactionId.size()];
			int i = 0;
			for (Integer investmentTransactionIterator : investmentTransactionId) {
				investmentTransactionArrayKeyList[i++] = investmentTransactionIterator;
			}
			investmentTransactionArray = Arrays.asList(investmentTransactionArrayKeyList);
			SqlParameterSource parameters = new MapSqlParameterSource("paymentId", null);
			int count = template.update(
					"update "+ DeveloperContext.getDeveloperSchema() +".InvestmentAccount set balanceAsOf='" + balanceAsOf + "',availableCashBalance="
							+ availableCashBalance + ",investmenttransactionid=array" + investmentTransactionArray
							+ ",currentvalue=" + currentValue + " where accountId ='" + accountId + "'",
					parameters, keyHolder);
		} catch (Exception e) {
			log.error("InvestmentAccount : ", e);
			throw new FDXException(e,FdxConstants.HTTP_ERROR_CODE_500);
		}
		return keyHolder.getKeys();
	}

	public InvestmentAccount getInvestmentAccount(String accountId, LocalDate startTime, LocalDate endTime,
			String resultType) throws FDXException {
		Account account = new Account();
		if (resultType.equals("details")) {
			return getInvestmentAccount(accountId, startTime, endTime);
		} else {
			//TODO the singleton mapping adding objects for each call so aviod this usage for now
			InvestmentAccount investmentAccount = new InvestmentAccount();
			investmentAccount.account = (Account) account.getAccount(accountId, resultType);
			return investmentAccount;
		}
	}
}