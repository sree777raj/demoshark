package com.fdx.api.model46.modelimpl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * LocAccountAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class LocAccountAllOf   {
  @JsonProperty("balanceAsOf")
  private java.sql.Timestamp balanceAsOf;

  @JsonProperty("creditLine")
  private BigDecimal creditLine;

  @JsonProperty("availableCredit")
  private BigDecimal availableCredit;

  @JsonProperty("nextPaymentAmount")
  private BigDecimal nextPaymentAmount;

  @JsonProperty("nextPaymentDate")
  private java.sql.Timestamp nextPaymentDate;

  @JsonProperty("principalBalance")
  private BigDecimal principalBalance;

  @JsonProperty("currentBalance")
  private BigDecimal currentBalance;

  @JsonProperty("minimumPaymentAmount")
  private BigDecimal minimumPaymentAmount;

  @JsonProperty("lastPaymentAmount")
  private BigDecimal lastPaymentAmount;

  @JsonProperty("lastPaymentDate")
  private java.sql.Timestamp lastPaymentDate;

  @JsonProperty("pastDueAmount")
  private BigDecimal pastDueAmount;

  @JsonProperty("lastStmtBalance")
  private BigDecimal lastStmtBalance;

  @JsonProperty("lastStmtDate")
  private java.sql.Timestamp lastStmtDate;

  @JsonProperty("pointsAccrued")
  private BigDecimal pointsAccrued;

  @JsonProperty("currentRewardsBalance")
  private BigDecimal currentRewardsBalance;

  @JsonProperty("pointsRedeemed")
  private BigDecimal pointsRedeemed;

  @JsonProperty("purchasesApr")
  private BigDecimal purchasesApr;

  @JsonProperty("advancesApr")
  private BigDecimal advancesApr;

  @JsonProperty("cashAdvanceLimit")
  private BigDecimal cashAdvanceLimit;

  @JsonProperty("availableCash")
  private BigDecimal availableCash;

  @JsonProperty("financeCharges")
  private BigDecimal financeCharges;

  @JsonProperty("transactions")
  @Valid
  private List<LocTransaction> transactions = null;

  public LocAccountAllOf balanceAsOf(java.sql.Timestamp balanceAsOf) {
    this.balanceAsOf = balanceAsOf;
    return this;
  }

  /**
   * Get balanceAsOf
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

  public LocAccountAllOf creditLine(BigDecimal creditLine) {
    this.creditLine = creditLine;
    return this;
  }

  /**
   * Credit limit
   * @return creditLine
  */
  @ApiModelProperty(value = "Credit limit")

  @Valid

  public BigDecimal getCreditLine() {
    return creditLine;
  }

  public void setCreditLine(BigDecimal creditLine) {
    this.creditLine = creditLine;
  }

  public LocAccountAllOf availableCredit(BigDecimal availableCredit) {
    this.availableCredit = availableCredit;
    return this;
  }

  /**
   * Available credit
   * @return availableCredit
  */
  @ApiModelProperty(value = "Available credit")

  @Valid

  public BigDecimal getAvailableCredit() {
    return availableCredit;
  }

  public void setAvailableCredit(BigDecimal availableCredit) {
    this.availableCredit = availableCredit;
  }

  public LocAccountAllOf nextPaymentAmount(BigDecimal nextPaymentAmount) {
    this.nextPaymentAmount = nextPaymentAmount;
    return this;
  }

  /**
   * Amount of next payment
   * @return nextPaymentAmount
  */
  @ApiModelProperty(value = "Amount of next payment")

  @Valid

  public BigDecimal getNextPaymentAmount() {
    return nextPaymentAmount;
  }

  public void setNextPaymentAmount(BigDecimal nextPaymentAmount) {
    this.nextPaymentAmount = nextPaymentAmount;
  }

  public LocAccountAllOf nextPaymentDate(java.sql.Timestamp nextPaymentDate) {
    this.nextPaymentDate = nextPaymentDate;
    return this;
  }

  /**
   * Get nextPaymentDate
   * @return nextPaymentDate
  */
  @ApiModelProperty(value = "")

  @Valid

  public java.sql.Timestamp getNextPaymentDate() {
    return nextPaymentDate;
  }

  public void setNextPaymentDate(java.sql.Timestamp nextPaymentDate) {
    this.nextPaymentDate = nextPaymentDate;
  }

  public LocAccountAllOf principalBalance(BigDecimal principalBalance) {
    this.principalBalance = principalBalance;
    return this;
  }

  /**
   * Principal balance
   * @return principalBalance
  */
  @ApiModelProperty(value = "Principal balance")

  @Valid

  public BigDecimal getPrincipalBalance() {
    return principalBalance;
  }

  public void setPrincipalBalance(BigDecimal principalBalance) {
    this.principalBalance = principalBalance;
  }

  public LocAccountAllOf currentBalance(BigDecimal currentBalance) {
    this.currentBalance = currentBalance;
    return this;
  }

  /**
   * Current balance of the line of credit
   * @return currentBalance
  */
  @ApiModelProperty(value = "Current balance of the line of credit")

  @Valid

  public BigDecimal getCurrentBalance() {
    return currentBalance;
  }

  public void setCurrentBalance(BigDecimal currentBalance) {
    this.currentBalance = currentBalance;
  }

  public LocAccountAllOf minimumPaymentAmount(BigDecimal minimumPaymentAmount) {
    this.minimumPaymentAmount = minimumPaymentAmount;
    return this;
  }

  /**
   * Minimum payment amount
   * @return minimumPaymentAmount
  */
  @ApiModelProperty(value = "Minimum payment amount")

  @Valid

  public BigDecimal getMinimumPaymentAmount() {
    return minimumPaymentAmount;
  }

  public void setMinimumPaymentAmount(BigDecimal minimumPaymentAmount) {
    this.minimumPaymentAmount = minimumPaymentAmount;
  }

  public LocAccountAllOf lastPaymentAmount(BigDecimal lastPaymentAmount) {
    this.lastPaymentAmount = lastPaymentAmount;
    return this;
  }

  /**
   * Last payment amount
   * @return lastPaymentAmount
  */
  @ApiModelProperty(value = "Last payment amount")

  @Valid

  public BigDecimal getLastPaymentAmount() {
    return lastPaymentAmount;
  }

  public void setLastPaymentAmount(BigDecimal lastPaymentAmount) {
    this.lastPaymentAmount = lastPaymentAmount;
  }

  public LocAccountAllOf lastPaymentDate(java.sql.Timestamp lastPaymentDate) {
    this.lastPaymentDate = lastPaymentDate;
    return this;
  }

  /**
   * Get lastPaymentDate
   * @return lastPaymentDate
  */
  @ApiModelProperty(value = "")

  @Valid

  public java.sql.Timestamp getLastPaymentDate() {
    return lastPaymentDate;
  }

  public void setLastPaymentDate(java.sql.Timestamp lastPaymentDate) {
    this.lastPaymentDate = lastPaymentDate;
  }

  public LocAccountAllOf pastDueAmount(BigDecimal pastDueAmount) {
    this.pastDueAmount = pastDueAmount;
    return this;
  }

  /**
   * Past Due Amount
   * @return pastDueAmount
  */
  @ApiModelProperty(value = "Past Due Amount")

  @Valid

  public BigDecimal getPastDueAmount() {
    return pastDueAmount;
  }

  public void setPastDueAmount(BigDecimal pastDueAmount) {
    this.pastDueAmount = pastDueAmount;
  }

  public LocAccountAllOf lastStmtBalance(BigDecimal lastStmtBalance) {
    this.lastStmtBalance = lastStmtBalance;
    return this;
  }

  /**
   * Last Statement Balance
   * @return lastStmtBalance
  */
  @ApiModelProperty(value = "Last Statement Balance")

  @Valid

  public BigDecimal getLastStmtBalance() {
    return lastStmtBalance;
  }

  public void setLastStmtBalance(BigDecimal lastStmtBalance) {
    this.lastStmtBalance = lastStmtBalance;
  }

  public LocAccountAllOf lastStmtDate(java.sql.Timestamp lastStmtDate) {
    this.lastStmtDate = lastStmtDate;
    return this;
  }

  /**
   * Get lastStmtDate
   * @return lastStmtDate
  */
  @ApiModelProperty(value = "")

  @Valid

  public java.sql.Timestamp getLastStmtDate() {
    return lastStmtDate;
  }

  public void setLastStmtDate(java.sql.Timestamp lastStmtDate) {
    this.lastStmtDate = lastStmtDate;
  }

  public LocAccountAllOf pointsAccrued(BigDecimal pointsAccrued) {
    this.pointsAccrued = pointsAccrued;
    return this;
  }

  /**
   * Points accrued (deprecated in favor of getRewards operation, removing in FDX v5.0)
   * @return pointsAccrued
  */
  @ApiModelProperty(value = "Points accrued (deprecated in favor of getRewards operation, removing in FDX v5.0)")

  @Valid

  public BigDecimal getPointsAccrued() {
    return pointsAccrued;
  }

  public void setPointsAccrued(BigDecimal pointsAccrued) {
    this.pointsAccrued = pointsAccrued;
  }

  public LocAccountAllOf currentRewardsBalance(BigDecimal currentRewardsBalance) {
    this.currentRewardsBalance = currentRewardsBalance;
    return this;
  }

  /**
   * Current rewards balance (deprecated in favor of getRewards operation, removing in FDX v5.0)
   * @return currentRewardsBalance
  */
  @ApiModelProperty(value = "Current rewards balance (deprecated in favor of getRewards operation, removing in FDX v5.0)")

  @Valid

  public BigDecimal getCurrentRewardsBalance() {
    return currentRewardsBalance;
  }

  public void setCurrentRewardsBalance(BigDecimal currentRewardsBalance) {
    this.currentRewardsBalance = currentRewardsBalance;
  }

  public LocAccountAllOf pointsRedeemed(BigDecimal pointsRedeemed) {
    this.pointsRedeemed = pointsRedeemed;
    return this;
  }

  /**
   * Points redeemed (deprecated in favor of getRewards operation, removing in FDX v5.0)
   * @return pointsRedeemed
  */
  @ApiModelProperty(value = "Points redeemed (deprecated in favor of getRewards operation, removing in FDX v5.0)")

  @Valid

  public BigDecimal getPointsRedeemed() {
    return pointsRedeemed;
  }

  public void setPointsRedeemed(BigDecimal pointsRedeemed) {
    this.pointsRedeemed = pointsRedeemed;
  }

  public LocAccountAllOf purchasesApr(BigDecimal purchasesApr) {
    this.purchasesApr = purchasesApr;
    return this;
  }

  /**
   * Purchases APR
   * @return purchasesApr
  */
  @ApiModelProperty(value = "Purchases APR")

  @Valid

  public BigDecimal getPurchasesApr() {
    return purchasesApr;
  }

  public void setPurchasesApr(BigDecimal purchasesApr) {
    this.purchasesApr = purchasesApr;
  }

  public LocAccountAllOf advancesApr(BigDecimal advancesApr) {
    this.advancesApr = advancesApr;
    return this;
  }

  /**
   * Advances APR
   * @return advancesApr
  */
  @ApiModelProperty(value = "Advances APR")

  @Valid

  public BigDecimal getAdvancesApr() {
    return advancesApr;
  }

  public void setAdvancesApr(BigDecimal advancesApr) {
    this.advancesApr = advancesApr;
  }

  public LocAccountAllOf cashAdvanceLimit(BigDecimal cashAdvanceLimit) {
    this.cashAdvanceLimit = cashAdvanceLimit;
    return this;
  }

  /**
   * Cash advance limit
   * @return cashAdvanceLimit
  */
  @ApiModelProperty(value = "Cash advance limit")

  @Valid

  public BigDecimal getCashAdvanceLimit() {
    return cashAdvanceLimit;
  }

  public void setCashAdvanceLimit(BigDecimal cashAdvanceLimit) {
    this.cashAdvanceLimit = cashAdvanceLimit;
  }

  public LocAccountAllOf availableCash(BigDecimal availableCash) {
    this.availableCash = availableCash;
    return this;
  }

  /**
   * Available cash
   * @return availableCash
  */
  @ApiModelProperty(value = "Available cash")

  @Valid

  public BigDecimal getAvailableCash() {
    return availableCash;
  }

  public void setAvailableCash(BigDecimal availableCash) {
    this.availableCash = availableCash;
  }

  public LocAccountAllOf financeCharges(BigDecimal financeCharges) {
    this.financeCharges = financeCharges;
    return this;
  }

  /**
   * Finance charges
   * @return financeCharges
  */
  @ApiModelProperty(value = "Finance charges")

  @Valid

  public BigDecimal getFinanceCharges() {
    return financeCharges;
  }

  public void setFinanceCharges(BigDecimal financeCharges) {
    this.financeCharges = financeCharges;
  }

  public LocAccountAllOf transactions(List<LocTransaction> transactions) {
    this.transactions = transactions;
    return this;
  }

  public LocAccountAllOf addTransactionsItem(LocTransaction transactionsItem) {
    if (this.transactions == null) {
      this.transactions = new ArrayList<>();
    }
    this.transactions.add(transactionsItem);
    return this;
  }

  /**
   * Transactions on the line-of-credit account
   * @return transactions
  */
  @ApiModelProperty(value = "Transactions on the line-of-credit account")

  @Valid

  public List<LocTransaction> getTransactions() {
    return transactions;
  }

  public void setTransactions(List<LocTransaction> transactions) {
    this.transactions = transactions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocAccountAllOf locAccountAllOf = (LocAccountAllOf) o;
    return Objects.equals(this.balanceAsOf, locAccountAllOf.balanceAsOf) &&
        Objects.equals(this.creditLine, locAccountAllOf.creditLine) &&
        Objects.equals(this.availableCredit, locAccountAllOf.availableCredit) &&
        Objects.equals(this.nextPaymentAmount, locAccountAllOf.nextPaymentAmount) &&
        Objects.equals(this.nextPaymentDate, locAccountAllOf.nextPaymentDate) &&
        Objects.equals(this.principalBalance, locAccountAllOf.principalBalance) &&
        Objects.equals(this.currentBalance, locAccountAllOf.currentBalance) &&
        Objects.equals(this.minimumPaymentAmount, locAccountAllOf.minimumPaymentAmount) &&
        Objects.equals(this.lastPaymentAmount, locAccountAllOf.lastPaymentAmount) &&
        Objects.equals(this.lastPaymentDate, locAccountAllOf.lastPaymentDate) &&
        Objects.equals(this.pastDueAmount, locAccountAllOf.pastDueAmount) &&
        Objects.equals(this.lastStmtBalance, locAccountAllOf.lastStmtBalance) &&
        Objects.equals(this.lastStmtDate, locAccountAllOf.lastStmtDate) &&
        Objects.equals(this.pointsAccrued, locAccountAllOf.pointsAccrued) &&
        Objects.equals(this.currentRewardsBalance, locAccountAllOf.currentRewardsBalance) &&
        Objects.equals(this.pointsRedeemed, locAccountAllOf.pointsRedeemed) &&
        Objects.equals(this.purchasesApr, locAccountAllOf.purchasesApr) &&
        Objects.equals(this.advancesApr, locAccountAllOf.advancesApr) &&
        Objects.equals(this.cashAdvanceLimit, locAccountAllOf.cashAdvanceLimit) &&
        Objects.equals(this.availableCash, locAccountAllOf.availableCash) &&
        Objects.equals(this.financeCharges, locAccountAllOf.financeCharges) &&
        Objects.equals(this.transactions, locAccountAllOf.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balanceAsOf, creditLine, availableCredit, nextPaymentAmount, nextPaymentDate, principalBalance, currentBalance, minimumPaymentAmount, lastPaymentAmount, lastPaymentDate, pastDueAmount, lastStmtBalance, lastStmtDate, pointsAccrued, currentRewardsBalance, pointsRedeemed, purchasesApr, advancesApr, cashAdvanceLimit, availableCash, financeCharges, transactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocAccountAllOf {\n");
    
    sb.append("    balanceAsOf: ").append(toIndentedString(balanceAsOf)).append("\n");
    sb.append("    creditLine: ").append(toIndentedString(creditLine)).append("\n");
    sb.append("    availableCredit: ").append(toIndentedString(availableCredit)).append("\n");
    sb.append("    nextPaymentAmount: ").append(toIndentedString(nextPaymentAmount)).append("\n");
    sb.append("    nextPaymentDate: ").append(toIndentedString(nextPaymentDate)).append("\n");
    sb.append("    principalBalance: ").append(toIndentedString(principalBalance)).append("\n");
    sb.append("    currentBalance: ").append(toIndentedString(currentBalance)).append("\n");
    sb.append("    minimumPaymentAmount: ").append(toIndentedString(minimumPaymentAmount)).append("\n");
    sb.append("    lastPaymentAmount: ").append(toIndentedString(lastPaymentAmount)).append("\n");
    sb.append("    lastPaymentDate: ").append(toIndentedString(lastPaymentDate)).append("\n");
    sb.append("    pastDueAmount: ").append(toIndentedString(pastDueAmount)).append("\n");
    sb.append("    lastStmtBalance: ").append(toIndentedString(lastStmtBalance)).append("\n");
    sb.append("    lastStmtDate: ").append(toIndentedString(lastStmtDate)).append("\n");
    sb.append("    pointsAccrued: ").append(toIndentedString(pointsAccrued)).append("\n");
    sb.append("    currentRewardsBalance: ").append(toIndentedString(currentRewardsBalance)).append("\n");
    sb.append("    pointsRedeemed: ").append(toIndentedString(pointsRedeemed)).append("\n");
    sb.append("    purchasesApr: ").append(toIndentedString(purchasesApr)).append("\n");
    sb.append("    advancesApr: ").append(toIndentedString(advancesApr)).append("\n");
    sb.append("    cashAdvanceLimit: ").append(toIndentedString(cashAdvanceLimit)).append("\n");
    sb.append("    availableCash: ").append(toIndentedString(availableCash)).append("\n");
    sb.append("    financeCharges: ").append(toIndentedString(financeCharges)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
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

