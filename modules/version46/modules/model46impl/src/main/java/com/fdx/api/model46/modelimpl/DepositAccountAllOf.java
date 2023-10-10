package com.fdx.api.model46.modelimpl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * DepositAccountAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class DepositAccountAllOf   {
  @JsonProperty("balanceAsOf")
  private java.sql.Timestamp balanceAsOf;

  @JsonProperty("currentBalance")
  private BigDecimal currentBalance;

  @JsonProperty("openingDayBalance")
  private BigDecimal openingDayBalance;

  @JsonProperty("availableBalance")
  private BigDecimal availableBalance;

  @JsonProperty("annualPercentageYield")
  private BigDecimal annualPercentageYield;

  @JsonProperty("interestYtd")
  private BigDecimal interestYtd;

  @JsonProperty("term")
  private Integer term;

  @JsonProperty("maturityDate")
  private java.sql.Timestamp maturityDate;

  @JsonProperty("transactions")
  @Valid
  private List<DepositTransaction> transactions = null;

  public DepositAccountAllOf balanceAsOf(java.sql.Timestamp balanceAsOf) {
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

  public DepositAccountAllOf currentBalance(BigDecimal currentBalance) {
    this.currentBalance = currentBalance;
    return this;
  }

  /**
   * Balance of funds in account
   * @return currentBalance
  */
  @ApiModelProperty(value = "Balance of funds in account")

  @Valid

  public BigDecimal getCurrentBalance() {
    return currentBalance;
  }

  public void setCurrentBalance(BigDecimal currentBalance) {
    this.currentBalance = currentBalance;
  }

  public DepositAccountAllOf openingDayBalance(BigDecimal openingDayBalance) {
    this.openingDayBalance = openingDayBalance;
    return this;
  }

  /**
   * Day's opening fund balance
   * @return openingDayBalance
  */
  @ApiModelProperty(value = "Day's opening fund balance")

  @Valid

  public BigDecimal getOpeningDayBalance() {
    return openingDayBalance;
  }

  public void setOpeningDayBalance(BigDecimal openingDayBalance) {
    this.openingDayBalance = openingDayBalance;
  }

  public DepositAccountAllOf availableBalance(BigDecimal availableBalance) {
    this.availableBalance = availableBalance;
    return this;
  }

  /**
   * Balance of funds available for use
   * @return availableBalance
  */
  @ApiModelProperty(value = "Balance of funds available for use")

  @Valid

  public BigDecimal getAvailableBalance() {
    return availableBalance;
  }

  public void setAvailableBalance(BigDecimal availableBalance) {
    this.availableBalance = availableBalance;
  }

  public DepositAccountAllOf annualPercentageYield(BigDecimal annualPercentageYield) {
    this.annualPercentageYield = annualPercentageYield;
    return this;
  }

  /**
   * Annual Percentage Yield
   * @return annualPercentageYield
  */
  @ApiModelProperty(value = "Annual Percentage Yield")

  @Valid

  public BigDecimal getAnnualPercentageYield() {
    return annualPercentageYield;
  }

  public void setAnnualPercentageYield(BigDecimal annualPercentageYield) {
    this.annualPercentageYield = annualPercentageYield;
  }

  public DepositAccountAllOf interestYtd(BigDecimal interestYtd) {
    this.interestYtd = interestYtd;
    return this;
  }

  /**
   * YTD Interest
   * @return interestYtd
  */
  @ApiModelProperty(value = "YTD Interest")

  @Valid

  public BigDecimal getInterestYtd() {
    return interestYtd;
  }

  public void setInterestYtd(BigDecimal interestYtd) {
    this.interestYtd = interestYtd;
  }

  public DepositAccountAllOf term(Integer term) {
    this.term = term;
    return this;
  }

  /**
   * Term of CD in months
   * @return term
  */
  @ApiModelProperty(value = "Term of CD in months")


  public Integer getTerm() {
    return term;
  }

  public void setTerm(Integer term) {
    this.term = term;
  }

  public DepositAccountAllOf maturityDate(java.sql.Timestamp maturityDate) {
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

  public DepositAccountAllOf transactions(List<DepositTransaction> transactions) {
    this.transactions = transactions;
    return this;
  }

  public DepositAccountAllOf addTransactionsItem(DepositTransaction transactionsItem) {
    if (this.transactions == null) {
      this.transactions = new ArrayList<>();
    }
    this.transactions.add(transactionsItem);
    return this;
  }

  /**
   * Transactions on the deposit account
   * @return transactions
  */
  @ApiModelProperty(value = "Transactions on the deposit account")

  @Valid

  public List<DepositTransaction> getTransactions() {
    return transactions;
  }

  public void setTransactions(List<DepositTransaction> transactions) {
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
    DepositAccountAllOf depositAccountAllOf = (DepositAccountAllOf) o;
    return Objects.equals(this.balanceAsOf, depositAccountAllOf.balanceAsOf) &&
        Objects.equals(this.currentBalance, depositAccountAllOf.currentBalance) &&
        Objects.equals(this.openingDayBalance, depositAccountAllOf.openingDayBalance) &&
        Objects.equals(this.availableBalance, depositAccountAllOf.availableBalance) &&
        Objects.equals(this.annualPercentageYield, depositAccountAllOf.annualPercentageYield) &&
        Objects.equals(this.interestYtd, depositAccountAllOf.interestYtd) &&
        Objects.equals(this.term, depositAccountAllOf.term) &&
        Objects.equals(this.maturityDate, depositAccountAllOf.maturityDate) &&
        Objects.equals(this.transactions, depositAccountAllOf.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balanceAsOf, currentBalance, openingDayBalance, availableBalance, annualPercentageYield, interestYtd, term, maturityDate, transactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositAccountAllOf {\n");
    
    sb.append("    balanceAsOf: ").append(toIndentedString(balanceAsOf)).append("\n");
    sb.append("    currentBalance: ").append(toIndentedString(currentBalance)).append("\n");
    sb.append("    openingDayBalance: ").append(toIndentedString(openingDayBalance)).append("\n");
    sb.append("    availableBalance: ").append(toIndentedString(availableBalance)).append("\n");
    sb.append("    annualPercentageYield: ").append(toIndentedString(annualPercentageYield)).append("\n");
    sb.append("    interestYtd: ").append(toIndentedString(interestYtd)).append("\n");
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
    sb.append("    maturityDate: ").append(toIndentedString(maturityDate)).append("\n");
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

