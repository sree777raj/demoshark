package com.fdx.api.model46.modelimpl;

import com.fdx.common.exception.FDXException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModelProperty;

/**
 * InsuranceAccountAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class InsuranceAccountAllOf   {
  /**
   * Category of account
   */
  public enum AccountCategoryEnum {
    DEPOSIT_ACCOUNT("DEPOSIT_ACCOUNT"),
    
    INVESTMENT_ACCOUNT("INVESTMENT_ACCOUNT"),
    
    LOAN_ACCOUNT("LOAN_ACCOUNT"),
    
    LOC_ACCOUNT("LOC_ACCOUNT"),
    
    INSURANCE_ACCOUNT("INSURANCE_ACCOUNT");

    private String value;

    AccountCategoryEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AccountCategoryEnum fromValue(String value) {
      for (AccountCategoryEnum b : AccountCategoryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'",401));
    }
  }

  @JsonProperty("accountCategory")
  private AccountCategoryEnum accountCategory;

  @JsonProperty("policyPremium")
  private BigDecimal policyPremium;

  /**
   * The payment term for the premium
   */
  public enum PolicyPremiumTermEnum {
    MONTHLY("MONTHLY"),
    
    ANNUAL("ANNUAL");

    private String value;

    PolicyPremiumTermEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PolicyPremiumTermEnum fromValue(String value) {
      for (PolicyPremiumTermEnum b : PolicyPremiumTermEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'",401));
    }
  }

  @JsonProperty("policyPremiumTerm")
  private PolicyPremiumTermEnum policyPremiumTerm;

  @JsonProperty("policyStartDate")
  private java.sql.Timestamp policyStartDate;

  @JsonProperty("policyEndDate")
  private java.sql.Timestamp policyEndDate;

  @JsonProperty("policyCoverageAmount")
  private BigDecimal policyCoverageAmount;

  @JsonProperty("transactions")
  @Valid
  private List<InsuranceTransaction> transactions = null;

  @JsonProperty("bills")
  @Valid
  private List<Bills> bills = null;

  public InsuranceAccountAllOf accountCategory(AccountCategoryEnum accountCategory) {
    this.accountCategory = accountCategory;
    return this;
  }

  /**
   * Category of account
   * @return accountCategory
  */
  @ApiModelProperty(value = "Category of account")


  public AccountCategoryEnum getAccountCategory() {
    return accountCategory;
  }

  public void setAccountCategory(AccountCategoryEnum accountCategory) {
    this.accountCategory = accountCategory;
  }

  public InsuranceAccountAllOf policyPremium(BigDecimal policyPremium) {
    this.policyPremium = policyPremium;
    return this;
  }

  /**
   * The amount of the user's premium
   * @return policyPremium
  */
  @ApiModelProperty(value = "The amount of the user's premium")

  @Valid

  public BigDecimal getPolicyPremium() {
    return policyPremium;
  }

  public void setPolicyPremium(BigDecimal policyPremium) {
    this.policyPremium = policyPremium;
  }

  public InsuranceAccountAllOf policyPremiumTerm(PolicyPremiumTermEnum policyPremiumTerm) {
    this.policyPremiumTerm = policyPremiumTerm;
    return this;
  }

  /**
   * The payment term for the premium
   * @return policyPremiumTerm
  */
  @ApiModelProperty(value = "The payment term for the premium")


  public PolicyPremiumTermEnum getPolicyPremiumTerm() {
    return policyPremiumTerm;
  }

  public void setPolicyPremiumTerm(PolicyPremiumTermEnum policyPremiumTerm) {
    this.policyPremiumTerm = policyPremiumTerm;
  }

  public InsuranceAccountAllOf policyStartDate(java.sql.Timestamp policyStartDate) {
    this.policyStartDate = policyStartDate;
    return this;
  }

  /**
   * Get policyStartDate
   * @return policyStartDate
  */
  @ApiModelProperty(value = "")

  @Valid

  public java.sql.Timestamp getPolicyStartDate() {
    return policyStartDate;
  }

  public void setPolicyStartDate(java.sql.Timestamp policyStartDate) {
    this.policyStartDate = policyStartDate;
  }

  public InsuranceAccountAllOf policyEndDate(java.sql.Timestamp policyEndDate) {
    this.policyEndDate = policyEndDate;
    return this;
  }

  /**
   * Get policyEndDate
   * @return policyEndDate
  */
  @ApiModelProperty(value = "")

  @Valid

  public java.sql.Timestamp getPolicyEndDate() {
    return policyEndDate;
  }

  public void setPolicyEndDate(java.sql.Timestamp policyEndDate) {
    this.policyEndDate = policyEndDate;
  }

  public InsuranceAccountAllOf policyCoverageAmount(BigDecimal policyCoverageAmount) {
    this.policyCoverageAmount = policyCoverageAmount;
    return this;
  }

  /**
   * Total amount of money the user is insured for
   * @return policyCoverageAmount
  */
  @ApiModelProperty(value = "Total amount of money the user is insured for")

  @Valid

  public BigDecimal getPolicyCoverageAmount() {
    return policyCoverageAmount;
  }

  public void setPolicyCoverageAmount(BigDecimal policyCoverageAmount) {
    this.policyCoverageAmount = policyCoverageAmount;
  }

  public InsuranceAccountAllOf transactions(List<InsuranceTransaction> transactions) {
    this.transactions = transactions;
    return this;
  }

  public InsuranceAccountAllOf addTransactionsItem(InsuranceTransaction transactionsItem) {
    if (this.transactions == null) {
      this.transactions = new ArrayList<>();
    }
    this.transactions.add(transactionsItem);
    return this;
  }

  /**
   * Transactions on the insurance account
   * @return transactions
  */
  @ApiModelProperty(value = "Transactions on the insurance account")

  @Valid

  public List<InsuranceTransaction> getTransactions() {
    return transactions;
  }

  public void setTransactions(List<InsuranceTransaction> transactions) {
    this.transactions = transactions;
  }

  public InsuranceAccountAllOf bills(List<Bills> bills) {
    this.bills = bills;
    return this;
  }

  public InsuranceAccountAllOf addBillsItem(Bills billsItem) {
    if (this.bills == null) {
      this.bills = new ArrayList<>();
    }
    this.bills.add(billsItem);
    return this;
  }

  /**
   * Payments due on the insurance account
   * @return bills
  */
  @ApiModelProperty(value = "Payments due on the insurance account")

  @Valid

  public List<Bills> getBills() {
    return bills;
  }

  public void setBills(List<Bills> bills) {
    this.bills = bills;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InsuranceAccountAllOf insuranceAccountAllOf = (InsuranceAccountAllOf) o;
    return Objects.equals(this.accountCategory, insuranceAccountAllOf.accountCategory) &&
        Objects.equals(this.policyPremium, insuranceAccountAllOf.policyPremium) &&
        Objects.equals(this.policyPremiumTerm, insuranceAccountAllOf.policyPremiumTerm) &&
        Objects.equals(this.policyStartDate, insuranceAccountAllOf.policyStartDate) &&
        Objects.equals(this.policyEndDate, insuranceAccountAllOf.policyEndDate) &&
        Objects.equals(this.policyCoverageAmount, insuranceAccountAllOf.policyCoverageAmount) &&
        Objects.equals(this.transactions, insuranceAccountAllOf.transactions) &&
        Objects.equals(this.bills, insuranceAccountAllOf.bills);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountCategory, policyPremium, policyPremiumTerm, policyStartDate, policyEndDate, policyCoverageAmount, transactions, bills);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsuranceAccountAllOf {\n");
    
    sb.append("    accountCategory: ").append(toIndentedString(accountCategory)).append("\n");
    sb.append("    policyPremium: ").append(toIndentedString(policyPremium)).append("\n");
    sb.append("    policyPremiumTerm: ").append(toIndentedString(policyPremiumTerm)).append("\n");
    sb.append("    policyStartDate: ").append(toIndentedString(policyStartDate)).append("\n");
    sb.append("    policyEndDate: ").append(toIndentedString(policyEndDate)).append("\n");
    sb.append("    policyCoverageAmount: ").append(toIndentedString(policyCoverageAmount)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
    sb.append("    bills: ").append(toIndentedString(bills)).append("\n");
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

