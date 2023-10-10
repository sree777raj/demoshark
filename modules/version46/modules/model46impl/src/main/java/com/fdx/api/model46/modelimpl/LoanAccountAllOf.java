package com.fdx.api.model46.modelimpl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * LoanAccountAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class LoanAccountAllOf   {
  @JsonProperty("balanceAsOf")
  private java.sql.Timestamp balanceAsOf;

  @JsonProperty("principalBalance")
  private BigDecimal principalBalance;

  @JsonProperty("escrowBalance")
  private BigDecimal escrowBalance;

  @JsonProperty("originalPrincipal")
  private BigDecimal originalPrincipal;

  @JsonProperty("originatingDate")
  private java.sql.Timestamp originatingDate;

  @JsonProperty("loanTerm")
  private Integer loanTerm;

  @JsonProperty("totalNumberOfPayments")
  private Integer totalNumberOfPayments;

  @JsonProperty("nextPaymentAmount")
  private BigDecimal nextPaymentAmount;

  @JsonProperty("nextPaymentDate")
  private java.sql.Timestamp nextPaymentDate;

  @JsonProperty("paymentFrequency")
  private PaymentFrequency paymentFrequency;

  @JsonProperty("compoundingPeriod")
  private CompoundingPeriod compoundingPeriod;

  @JsonProperty("payOffAmount")
  private BigDecimal payOffAmount;

  @JsonProperty("lastPaymentAmount")
  private BigDecimal lastPaymentAmount;

  @JsonProperty("lastPaymentDate")
  private java.sql.Timestamp lastPaymentDate;

  @JsonProperty("maturityDate")
  private java.sql.Timestamp maturityDate;

  @JsonProperty("interestPaidYearToDate")
  private BigDecimal interestPaidYearToDate;

  @JsonProperty("transactions")
  @Valid
  private List<LoanTransaction> transactions = null;

  public LoanAccountAllOf balanceAsOf(java.sql.Timestamp balanceAsOf) {
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

  public LoanAccountAllOf principalBalance(BigDecimal principalBalance) {
    this.principalBalance = principalBalance;
    return this;
  }

  /**
   * Principal balance of loan
   * @return principalBalance
  */
  @ApiModelProperty(value = "Principal balance of loan")

  @Valid

  public BigDecimal getPrincipalBalance() {
    return principalBalance;
  }

  public void setPrincipalBalance(BigDecimal principalBalance) {
    this.principalBalance = principalBalance;
  }

  public LoanAccountAllOf escrowBalance(BigDecimal escrowBalance) {
    this.escrowBalance = escrowBalance;
    return this;
  }

  /**
   * Escrow balance of loan
   * @return escrowBalance
  */
  @ApiModelProperty(value = "Escrow balance of loan")

  @Valid

  public BigDecimal getEscrowBalance() {
    return escrowBalance;
  }

  public void setEscrowBalance(BigDecimal escrowBalance) {
    this.escrowBalance = escrowBalance;
  }

  public LoanAccountAllOf originalPrincipal(BigDecimal originalPrincipal) {
    this.originalPrincipal = originalPrincipal;
    return this;
  }

  /**
   * Original principal of loan
   * @return originalPrincipal
  */
  @ApiModelProperty(value = "Original principal of loan")

  @Valid

  public BigDecimal getOriginalPrincipal() {
    return originalPrincipal;
  }

  public void setOriginalPrincipal(BigDecimal originalPrincipal) {
    this.originalPrincipal = originalPrincipal;
  }

  public LoanAccountAllOf originatingDate(java.sql.Timestamp originatingDate) {
    this.originatingDate = originatingDate;
    return this;
  }

  /**
   * Get originatingDate
   * @return originatingDate
  */
  @ApiModelProperty(value = "")

  @Valid

  public java.sql.Timestamp getOriginatingDate() {
    return originatingDate;
  }

  public void setOriginatingDate(java.sql.Timestamp originatingDate) {
    this.originatingDate = originatingDate;
  }

  public LoanAccountAllOf loanTerm(Integer loanTerm) {
    this.loanTerm = loanTerm;
    return this;
  }

  /**
   * Term of loan in months
   * @return loanTerm
  */
  @ApiModelProperty(value = "Term of loan in months")


  public Integer getLoanTerm() {
    return loanTerm;
  }

  public void setLoanTerm(Integer loanTerm) {
    this.loanTerm = loanTerm;
  }

  public LoanAccountAllOf totalNumberOfPayments(Integer totalNumberOfPayments) {
    this.totalNumberOfPayments = totalNumberOfPayments;
    return this;
  }

  /**
   * Total number of payments
   * @return totalNumberOfPayments
  */
  @ApiModelProperty(value = "Total number of payments")


  public Integer getTotalNumberOfPayments() {
    return totalNumberOfPayments;
  }

  public void setTotalNumberOfPayments(Integer totalNumberOfPayments) {
    this.totalNumberOfPayments = totalNumberOfPayments;
  }

  public LoanAccountAllOf nextPaymentAmount(BigDecimal nextPaymentAmount) {
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

  public LoanAccountAllOf nextPaymentDate(java.sql.Timestamp nextPaymentDate) {
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

  public LoanAccountAllOf paymentFrequency(PaymentFrequency paymentFrequency) {
    this.paymentFrequency = paymentFrequency;
    return this;
  }

  /**
   * Get paymentFrequency
   * @return paymentFrequency
  */
  @ApiModelProperty(value = "")

  @Valid

  public PaymentFrequency getPaymentFrequency() {
    return paymentFrequency;
  }

  public void setPaymentFrequency(PaymentFrequency paymentFrequency) {
    this.paymentFrequency = paymentFrequency;
  }

  public LoanAccountAllOf compoundingPeriod(CompoundingPeriod compoundingPeriod) {
    this.compoundingPeriod = compoundingPeriod;
    return this;
  }

  /**
   * Get compoundingPeriod
   * @return compoundingPeriod
  */
  @ApiModelProperty(value = "")

  @Valid

  public CompoundingPeriod getCompoundingPeriod() {
    return compoundingPeriod;
  }

  public void setCompoundingPeriod(CompoundingPeriod compoundingPeriod) {
    this.compoundingPeriod = compoundingPeriod;
  }

  public LoanAccountAllOf payOffAmount(BigDecimal payOffAmount) {
    this.payOffAmount = payOffAmount;
    return this;
  }

  /**
   * Payoff amount
   * @return payOffAmount
  */
  @ApiModelProperty(value = "Payoff amount")

  @Valid

  public BigDecimal getPayOffAmount() {
    return payOffAmount;
  }

  public void setPayOffAmount(BigDecimal payOffAmount) {
    this.payOffAmount = payOffAmount;
  }

  public LoanAccountAllOf lastPaymentAmount(BigDecimal lastPaymentAmount) {
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

  public LoanAccountAllOf lastPaymentDate(java.sql.Timestamp lastPaymentDate) {
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

  public LoanAccountAllOf maturityDate(java.sql.Timestamp maturityDate) {
    this.maturityDate = maturityDate;
    return this;
  }

  /**
   * Get maturityDate
   * @return maturityDate
  */
  @ApiModelProperty(value = "")

  @Valid

  public java.sql.Timestamp getMaturityDate() {
    return maturityDate;
  }

  public void setMaturityDate(java.sql.Timestamp maturityDate) {
    this.maturityDate = maturityDate;
  }

  public LoanAccountAllOf interestPaidYearToDate(BigDecimal interestPaidYearToDate) {
    this.interestPaidYearToDate = interestPaidYearToDate;
    return this;
  }

  /**
   * Interest paid year to date
   * @return interestPaidYearToDate
  */
  @ApiModelProperty(value = "Interest paid year to date")

  @Valid

  public BigDecimal getInterestPaidYearToDate() {
    return interestPaidYearToDate;
  }

  public void setInterestPaidYearToDate(BigDecimal interestPaidYearToDate) {
    this.interestPaidYearToDate = interestPaidYearToDate;
  }

  public LoanAccountAllOf transactions(List<LoanTransaction> transactions) {
    this.transactions = transactions;
    return this;
  }

  public LoanAccountAllOf addTransactionsItem(LoanTransaction transactionsItem) {
    if (this.transactions == null) {
      this.transactions = new ArrayList<>();
    }
    this.transactions.add(transactionsItem);
    return this;
  }

  /**
   * Transactions on the loan account
   * @return transactions
  */
  @ApiModelProperty(value = "Transactions on the loan account")

  @Valid

  public List<LoanTransaction> getTransactions() {
    return transactions;
  }

  public void setTransactions(List<LoanTransaction> transactions) {
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
    LoanAccountAllOf loanAccountAllOf = (LoanAccountAllOf) o;
    return Objects.equals(this.balanceAsOf, loanAccountAllOf.balanceAsOf) &&
        Objects.equals(this.principalBalance, loanAccountAllOf.principalBalance) &&
        Objects.equals(this.escrowBalance, loanAccountAllOf.escrowBalance) &&
        Objects.equals(this.originalPrincipal, loanAccountAllOf.originalPrincipal) &&
        Objects.equals(this.originatingDate, loanAccountAllOf.originatingDate) &&
        Objects.equals(this.loanTerm, loanAccountAllOf.loanTerm) &&
        Objects.equals(this.totalNumberOfPayments, loanAccountAllOf.totalNumberOfPayments) &&
        Objects.equals(this.nextPaymentAmount, loanAccountAllOf.nextPaymentAmount) &&
        Objects.equals(this.nextPaymentDate, loanAccountAllOf.nextPaymentDate) &&
        Objects.equals(this.paymentFrequency, loanAccountAllOf.paymentFrequency) &&
        Objects.equals(this.compoundingPeriod, loanAccountAllOf.compoundingPeriod) &&
        Objects.equals(this.payOffAmount, loanAccountAllOf.payOffAmount) &&
        Objects.equals(this.lastPaymentAmount, loanAccountAllOf.lastPaymentAmount) &&
        Objects.equals(this.lastPaymentDate, loanAccountAllOf.lastPaymentDate) &&
        Objects.equals(this.maturityDate, loanAccountAllOf.maturityDate) &&
        Objects.equals(this.interestPaidYearToDate, loanAccountAllOf.interestPaidYearToDate) &&
        Objects.equals(this.transactions, loanAccountAllOf.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balanceAsOf, principalBalance, escrowBalance, originalPrincipal, originatingDate, loanTerm, totalNumberOfPayments, nextPaymentAmount, nextPaymentDate, paymentFrequency, compoundingPeriod, payOffAmount, lastPaymentAmount, lastPaymentDate, maturityDate, interestPaidYearToDate, transactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoanAccountAllOf {\n");
    
    sb.append("    balanceAsOf: ").append(toIndentedString(balanceAsOf)).append("\n");
    sb.append("    principalBalance: ").append(toIndentedString(principalBalance)).append("\n");
    sb.append("    escrowBalance: ").append(toIndentedString(escrowBalance)).append("\n");
    sb.append("    originalPrincipal: ").append(toIndentedString(originalPrincipal)).append("\n");
    sb.append("    originatingDate: ").append(toIndentedString(originatingDate)).append("\n");
    sb.append("    loanTerm: ").append(toIndentedString(loanTerm)).append("\n");
    sb.append("    totalNumberOfPayments: ").append(toIndentedString(totalNumberOfPayments)).append("\n");
    sb.append("    nextPaymentAmount: ").append(toIndentedString(nextPaymentAmount)).append("\n");
    sb.append("    nextPaymentDate: ").append(toIndentedString(nextPaymentDate)).append("\n");
    sb.append("    paymentFrequency: ").append(toIndentedString(paymentFrequency)).append("\n");
    sb.append("    compoundingPeriod: ").append(toIndentedString(compoundingPeriod)).append("\n");
    sb.append("    payOffAmount: ").append(toIndentedString(payOffAmount)).append("\n");
    sb.append("    lastPaymentAmount: ").append(toIndentedString(lastPaymentAmount)).append("\n");
    sb.append("    lastPaymentDate: ").append(toIndentedString(lastPaymentDate)).append("\n");
    sb.append("    maturityDate: ").append(toIndentedString(maturityDate)).append("\n");
    sb.append("    interestPaidYearToDate: ").append(toIndentedString(interestPaidYearToDate)).append("\n");
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

