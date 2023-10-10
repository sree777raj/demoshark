package com.fdx.api.model46.modelimpl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * InvestmentAccountAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class InvestmentAccountAllOf {
	@JsonProperty("balanceAsOf")
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

	public InvestmentAccountAllOf balanceAsOf(java.sql.Timestamp balanceAsOf) {
		this.balanceAsOf = balanceAsOf;
		return this;
	}

	/**
	 * Get balanceAsOf
	 * 
	 * @return balanceAsOf
	 */
	@ApiModelProperty(value = "")

	@Valid

	public java.sql.Timestamp getBalanceAsOf() {
		return balanceAsOf;
	}

	public void setBalanceAsOf(java.sql.Timestamp balanceAsOf) {
		this.balanceAsOf = balanceAsOf;
	}

	public InvestmentAccountAllOf allowedCheckWriting(Boolean allowedCheckWriting) {
		this.allowedCheckWriting = allowedCheckWriting;
		return this;
	}

	/**
	 * Check writing privileges
	 * 
	 * @return allowedCheckWriting
	 */
	@ApiModelProperty(value = "Check writing privileges")

	public Boolean getAllowedCheckWriting() {
		return allowedCheckWriting;
	}

	public void setAllowedCheckWriting(Boolean allowedCheckWriting) {
		this.allowedCheckWriting = allowedCheckWriting;
	}

	public InvestmentAccountAllOf allowedOptionTrade(Boolean allowedOptionTrade) {
		this.allowedOptionTrade = allowedOptionTrade;
		return this;
	}

	/**
	 * Allowed to trade options
	 * 
	 * @return allowedOptionTrade
	 */
	@ApiModelProperty(value = "Allowed to trade options")

	public Boolean getAllowedOptionTrade() {
		return allowedOptionTrade;
	}

	public void setAllowedOptionTrade(Boolean allowedOptionTrade) {
		this.allowedOptionTrade = allowedOptionTrade;
	}

	public InvestmentAccountAllOf currentValue(BigDecimal currentValue) {
		this.currentValue = currentValue;
		return this;
	}

	/**
	 * Total current value of all investments
	 * 
	 * @return currentValue
	 */
	@ApiModelProperty(value = "Total current value of all investments")

	@Valid

	public BigDecimal getCurrentValue() {
		return currentValue;
	}

	public void setCurrentValue(BigDecimal currentValue) {
		this.currentValue = currentValue;
	}

	public InvestmentAccountAllOf holdings(List<Holding> holdings) {
		this.holdings = holdings;
		return this;
	}

	public InvestmentAccountAllOf addHoldingsItem(Holding holdingsItem) {
		if (this.holdings == null) {
			this.holdings = new ArrayList<>();
		}
		this.holdings.add(holdingsItem);
		return this;
	}

	/**
	 * Holdings in the investment account
	 * 
	 * @return holdings
	 */
	@ApiModelProperty(value = "Holdings in the investment account")

	@Valid

	public List<Holding> getHoldings() {
		return holdings;
	}

	public void setHoldings(List<Holding> holdings) {
		this.holdings = holdings;
	}

	public InvestmentAccountAllOf openOrders(List<OpenOrder> openOrders) {
		this.openOrders = openOrders;
		return this;
	}

	public InvestmentAccountAllOf addOpenOrdersItem(OpenOrder openOrdersItem) {
		if (this.openOrders == null) {
			this.openOrders = new ArrayList<>();
		}
		this.openOrders.add(openOrdersItem);
		return this;
	}

	/**
	 * Open orders in the investment account
	 * 
	 * @return openOrders
	 */
	@ApiModelProperty(value = "Open orders in the investment account")

	@Valid

	public List<OpenOrder> getOpenOrders() {
		return openOrders;
	}

	public void setOpenOrders(List<OpenOrder> openOrders) {
		this.openOrders = openOrders;
	}

	public InvestmentAccountAllOf contribution(List<Contribution> contribution) {
		this.contribution = contribution;
		return this;
	}

	public InvestmentAccountAllOf addContributionItem(Contribution contributionItem) {
		if (this.contribution == null) {
			this.contribution = new ArrayList<>();
		}
		this.contribution.add(contributionItem);
		return this;
	}

	/**
	 * Describes how new contributions are distributed among the available
	 * securities
	 * 
	 * @return contribution
	 */
	@ApiModelProperty(value = "Describes how new contributions are distributed among the available securities")

	@Valid

	public List<Contribution> getContribution() {
		return contribution;
	}

	public void setContribution(List<Contribution> contribution) {
		this.contribution = contribution;
	}

	public InvestmentAccountAllOf vesting(List<Vesting> vesting) {
		this.vesting = vesting;
		return this;
	}

	public InvestmentAccountAllOf addVestingItem(Vesting vestingItem) {
		if (this.vesting == null) {
			this.vesting = new ArrayList<>();
		}
		this.vesting.add(vestingItem);
		return this;
	}

	/**
	 * Provides the past, present, and future vesting schedule and percentages
	 * 
	 * @return vesting
	 */
	@ApiModelProperty(value = "Provides the past, present, and future vesting schedule and percentages")

	@Valid

	public List<Vesting> getVesting() {
		return vesting;
	}

	public void setVesting(List<Vesting> vesting) {
		this.vesting = vesting;
	}

	public InvestmentAccountAllOf investmentLoans(List<InvestmentLoan> investmentLoans) {
		this.investmentLoans = investmentLoans;
		return this;
	}

	public InvestmentAccountAllOf addInvestmentLoansItem(InvestmentLoan investmentLoansItem) {
		if (this.investmentLoans == null) {
			this.investmentLoans = new ArrayList<>();
		}
		this.investmentLoans.add(investmentLoansItem);
		return this;
	}

	/**
	 * Investment loans in the account
	 * 
	 * @return investmentLoans
	 */
	@ApiModelProperty(value = "Investment loans in the account")

	@Valid

	public List<InvestmentLoan> getInvestmentLoans() {
		return investmentLoans;
	}

	public void setInvestmentLoans(List<InvestmentLoan> investmentLoans) {
		this.investmentLoans = investmentLoans;
	}

	public InvestmentAccountAllOf availableCashBalance(BigDecimal availableCashBalance) {
		this.availableCashBalance = availableCashBalance;
		return this;
	}

	/**
	 * Cash balance across all sub-accounts. Should include sweep funds
	 * 
	 * @return availableCashBalance
	 */
	@ApiModelProperty(value = "Cash balance across all sub-accounts. Should include sweep funds")

	@Valid

	public BigDecimal getAvailableCashBalance() {
		return availableCashBalance;
	}

	public void setAvailableCashBalance(BigDecimal availableCashBalance) {
		this.availableCashBalance = availableCashBalance;
	}

	public InvestmentAccountAllOf margin(Boolean margin) {
		this.margin = margin;
		return this;
	}

	/**
	 * Margin trading is allowed
	 * 
	 * @return margin
	 */
	@ApiModelProperty(value = "Margin trading is allowed")

	public Boolean getMargin() {
		return margin;
	}

	public void setMargin(Boolean margin) {
		this.margin = margin;
	}

	public InvestmentAccountAllOf marginBalance(BigDecimal marginBalance) {
		this.marginBalance = marginBalance;
		return this;
	}

	/**
	 * Margin balance
	 * 
	 * @return marginBalance
	 */
	@ApiModelProperty(value = "Margin balance")

	@Valid

	public BigDecimal getMarginBalance() {
		return marginBalance;
	}

	public void setMarginBalance(BigDecimal marginBalance) {
		this.marginBalance = marginBalance;
	}

	public InvestmentAccountAllOf shortBalance(BigDecimal shortBalance) {
		this.shortBalance = shortBalance;
		return this;
	}

	/**
	 * Short balance
	 * 
	 * @return shortBalance
	 */
	@ApiModelProperty(value = "Short balance")

	@Valid

	public BigDecimal getShortBalance() {
		return shortBalance;
	}

	public void setShortBalance(BigDecimal shortBalance) {
		this.shortBalance = shortBalance;
	}

	public InvestmentAccountAllOf rolloverAmount(BigDecimal rolloverAmount) {
		this.rolloverAmount = rolloverAmount;
		return this;
	}

	/**
	 * Rollover amount
	 * 
	 * @return rolloverAmount
	 */
	@ApiModelProperty(value = "Rollover amount")

	@Valid

	public BigDecimal getRolloverAmount() {
		return rolloverAmount;
	}

	public void setRolloverAmount(BigDecimal rolloverAmount) {
		this.rolloverAmount = rolloverAmount;
	}

	public InvestmentAccountAllOf employerName(String employerName) {
		this.employerName = employerName;
		return this;
	}

	/**
	 * Name of the employer in investment 401k Plan
	 * 
	 * @return employerName
	 */
	@ApiModelProperty(value = "Name of the employer in investment 401k Plan")

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public InvestmentAccountAllOf brokerId(String brokerId) {
		this.brokerId = brokerId;
		return this;
	}

	/**
	 * Unique identifier FI
	 * 
	 * @return brokerId
	 */
	@ApiModelProperty(value = "Unique identifier FI")

	public String getBrokerId() {
		return brokerId;
	}

	public void setBrokerId(String brokerId) {
		this.brokerId = brokerId;
	}

	public InvestmentAccountAllOf planId(String planId) {
		this.planId = planId;
		return this;
	}

	/**
	 * Plan number for Investment 401k plan
	 * 
	 * @return planId
	 */
	@ApiModelProperty(value = "Plan number for Investment 401k plan")

	public String getPlanId() {
		return planId;
	}

	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public InvestmentAccountAllOf calendaryearFor401K(java.sql.Timestamp calendaryearFor401K) {
		this.calendaryearFor401K = calendaryearFor401K;
		return this;
	}

	/**
	 * Get calendaryearFor401K
	 * 
	 * @return calendaryearFor401K
	 */
	@ApiModelProperty(value = "")

	@Valid

	public java.sql.Timestamp getCalendaryearFor401K() {
		return calendaryearFor401K;
	}

	public void setCalendaryearFor401K(java.sql.Timestamp calendaryearFor401K) {
		this.calendaryearFor401K = calendaryearFor401K;
	}

	public InvestmentAccountAllOf balanceList(List<InvestmentBalance> balanceList) {
		this.balanceList = balanceList;
		return this;
	}

	public InvestmentAccountAllOf addBalanceListItem(InvestmentBalance balanceListItem) {
		if (this.balanceList == null) {
			this.balanceList = new ArrayList<>();
		}
		this.balanceList.add(balanceListItem);
		return this;
	}

	/**
	 * List of balances. Aggregate of name value pairs
	 * 
	 * @return balanceList
	 */
	@ApiModelProperty(value = "List of balances. Aggregate of name value pairs")

	@Valid

	public List<InvestmentBalance> getBalanceList() {
		return balanceList;
	}

	public void setBalanceList(List<InvestmentBalance> balanceList) {
		this.balanceList = balanceList;
	}

	public InvestmentAccountAllOf dailyChange(BigDecimal dailyChange) {
		this.dailyChange = dailyChange;
		return this;
	}

	/**
	 * Daily change
	 * 
	 * @return dailyChange
	 */
	@ApiModelProperty(value = "Daily change")

	@Valid

	public BigDecimal getDailyChange() {
		return dailyChange;
	}

	public void setDailyChange(BigDecimal dailyChange) {
		this.dailyChange = dailyChange;
	}

	public InvestmentAccountAllOf percentageChange(BigDecimal percentageChange) {
		this.percentageChange = percentageChange;
		return this;
	}

	/**
	 * Percentage change
	 * 
	 * @return percentageChange
	 */
	@ApiModelProperty(value = "Percentage change")

	@Valid

	public BigDecimal getPercentageChange() {
		return percentageChange;
	}

	public void setPercentageChange(BigDecimal percentageChange) {
		this.percentageChange = percentageChange;
	}

	public InvestmentAccountAllOf transactions(List<InvestmentTransaction> transactions) {
		this.transactions = transactions;
		return this;
	}

	public InvestmentAccountAllOf addTransactionsItem(InvestmentTransaction transactionsItem) {
		if (this.transactions == null) {
			this.transactions = new ArrayList<>();
		}
		this.transactions.add(transactionsItem);
		return this;
	}

	/**
	 * Transactions on the investment account
	 * 
	 * @return transactions
	 */
	@ApiModelProperty(value = "Transactions on the investment account")

	@Valid

	public List<InvestmentTransaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<InvestmentTransaction> transactions) {
		this.transactions = transactions;
	}

	public InvestmentAccountAllOf pensionSource(List<PensionSource> pensionSource) {
		this.pensionSource = pensionSource;
		return this;
	}

	public InvestmentAccountAllOf addPensionSourceItem(PensionSource pensionSourceItem) {
		if (this.pensionSource == null) {
			this.pensionSource = new ArrayList<>();
		}
		this.pensionSource.add(pensionSourceItem);
		return this;
	}

	/**
	 * Pension sources in the investment account
	 * 
	 * @return pensionSource
	 */
	@ApiModelProperty(value = "Pension sources in the investment account")

	@Valid

	public List<PensionSource> getPensionSource() {
		return pensionSource;
	}

	public void setPensionSource(List<PensionSource> pensionSource) {
		this.pensionSource = pensionSource;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		InvestmentAccountAllOf investmentAccountAllOf = (InvestmentAccountAllOf) o;
		return Objects.equals(this.balanceAsOf, investmentAccountAllOf.balanceAsOf)
				&& Objects.equals(this.allowedCheckWriting, investmentAccountAllOf.allowedCheckWriting)
				&& Objects.equals(this.allowedOptionTrade, investmentAccountAllOf.allowedOptionTrade)
				&& Objects.equals(this.currentValue, investmentAccountAllOf.currentValue)
				&& Objects.equals(this.holdings, investmentAccountAllOf.holdings)
				&& Objects.equals(this.openOrders, investmentAccountAllOf.openOrders)
				&& Objects.equals(this.contribution, investmentAccountAllOf.contribution)
				&& Objects.equals(this.vesting, investmentAccountAllOf.vesting)
				&& Objects.equals(this.investmentLoans, investmentAccountAllOf.investmentLoans)
				&& Objects.equals(this.availableCashBalance, investmentAccountAllOf.availableCashBalance)
				&& Objects.equals(this.margin, investmentAccountAllOf.margin)
				&& Objects.equals(this.marginBalance, investmentAccountAllOf.marginBalance)
				&& Objects.equals(this.shortBalance, investmentAccountAllOf.shortBalance)
				&& Objects.equals(this.rolloverAmount, investmentAccountAllOf.rolloverAmount)
				&& Objects.equals(this.employerName, investmentAccountAllOf.employerName)
				&& Objects.equals(this.brokerId, investmentAccountAllOf.brokerId)
				&& Objects.equals(this.planId, investmentAccountAllOf.planId)
				&& Objects.equals(this.calendaryearFor401K, investmentAccountAllOf.calendaryearFor401K)
				&& Objects.equals(this.balanceList, investmentAccountAllOf.balanceList)
				&& Objects.equals(this.dailyChange, investmentAccountAllOf.dailyChange)
				&& Objects.equals(this.percentageChange, investmentAccountAllOf.percentageChange)
				&& Objects.equals(this.transactions, investmentAccountAllOf.transactions)
				&& Objects.equals(this.pensionSource, investmentAccountAllOf.pensionSource);
	}

	@Override
	public int hashCode() {
		return Objects.hash(balanceAsOf, allowedCheckWriting, allowedOptionTrade, currentValue, holdings, openOrders,
				contribution, vesting, investmentLoans, availableCashBalance, margin, marginBalance, shortBalance,
				rolloverAmount, employerName, brokerId, planId, calendaryearFor401K, balanceList, dailyChange,
				percentageChange, transactions, pensionSource);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class InvestmentAccountAllOf {\n");

		sb.append("    balanceAsOf: ").append(toIndentedString(balanceAsOf)).append("\n");
		sb.append("    allowedCheckWriting: ").append(toIndentedString(allowedCheckWriting)).append("\n");
		sb.append("    allowedOptionTrade: ").append(toIndentedString(allowedOptionTrade)).append("\n");
		sb.append("    currentValue: ").append(toIndentedString(currentValue)).append("\n");
		sb.append("    holdings: ").append(toIndentedString(holdings)).append("\n");
		sb.append("    openOrders: ").append(toIndentedString(openOrders)).append("\n");
		sb.append("    contribution: ").append(toIndentedString(contribution)).append("\n");
		sb.append("    vesting: ").append(toIndentedString(vesting)).append("\n");
		sb.append("    investmentLoans: ").append(toIndentedString(investmentLoans)).append("\n");
		sb.append("    availableCashBalance: ").append(toIndentedString(availableCashBalance)).append("\n");
		sb.append("    margin: ").append(toIndentedString(margin)).append("\n");
		sb.append("    marginBalance: ").append(toIndentedString(marginBalance)).append("\n");
		sb.append("    shortBalance: ").append(toIndentedString(shortBalance)).append("\n");
		sb.append("    rolloverAmount: ").append(toIndentedString(rolloverAmount)).append("\n");
		sb.append("    employerName: ").append(toIndentedString(employerName)).append("\n");
		sb.append("    brokerId: ").append(toIndentedString(brokerId)).append("\n");
		sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
		sb.append("    calendaryearFor401K: ").append(toIndentedString(calendaryearFor401K)).append("\n");
		sb.append("    balanceList: ").append(toIndentedString(balanceList)).append("\n");
		sb.append("    dailyChange: ").append(toIndentedString(dailyChange)).append("\n");
		sb.append("    percentageChange: ").append(toIndentedString(percentageChange)).append("\n");
		sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
		sb.append("    pensionSource: ").append(toIndentedString(pensionSource)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
