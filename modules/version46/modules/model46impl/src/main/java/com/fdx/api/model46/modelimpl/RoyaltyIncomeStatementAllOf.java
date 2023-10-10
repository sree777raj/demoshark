package com.fdx.api.model46.modelimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * RoyaltyIncomeStatementAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class RoyaltyIncomeStatementAllOf   {
  @JsonProperty("propertyAddress")
  private Address propertyAddress;

  @JsonProperty("royalties")
  private Double royalties;

  @JsonProperty("advertising")
  private Double advertising;

  @JsonProperty("auto")
  private Double auto;

  @JsonProperty("cleaning")
  private Double cleaning;

  @JsonProperty("commissions")
  private Double commissions;

  @JsonProperty("insurance")
  private Double insurance;

  @JsonProperty("legal")
  private Double legal;

  @JsonProperty("managementFees")
  private Double managementFees;

  @JsonProperty("mortgageInterest")
  private Double mortgageInterest;

  @JsonProperty("otherInterest")
  private Double otherInterest;

  @JsonProperty("repairs")
  private Double repairs;

  @JsonProperty("supplies")
  private Double supplies;

  @JsonProperty("taxes")
  private Double taxes;

  @JsonProperty("utilities")
  private Double utilities;

  @JsonProperty("depletionExpense")
  private Double depletionExpense;

  @JsonProperty("otherExpenses")
  @Valid
  private List<DescriptionAmount> otherExpenses = null;

  @JsonProperty("capitalExpenditures")
  @Valid
  private List<DateAmount> capitalExpenditures = null;

  public RoyaltyIncomeStatementAllOf propertyAddress(Address propertyAddress) {
    this.propertyAddress = propertyAddress;
    return this;
  }

  /**
   * Get propertyAddress
   * @return propertyAddress
  */
  @ApiModelProperty(value = "")

  @Valid

  public Address getPropertyAddress() {
    return propertyAddress;
  }

  public void setPropertyAddress(Address propertyAddress) {
    this.propertyAddress = propertyAddress;
  }

  public RoyaltyIncomeStatementAllOf royalties(Double royalties) {
    this.royalties = royalties;
    return this;
  }

  /**
   * Box 3, Royalties received
   * @return royalties
  */
  @ApiModelProperty(value = "Box 3, Royalties received")


  public Double getRoyalties() {
    return royalties;
  }

  public void setRoyalties(Double royalties) {
    this.royalties = royalties;
  }

  public RoyaltyIncomeStatementAllOf advertising(Double advertising) {
    this.advertising = advertising;
    return this;
  }

  /**
   * Box 5, Advertising
   * @return advertising
  */
  @ApiModelProperty(value = "Box 5, Advertising")


  public Double getAdvertising() {
    return advertising;
  }

  public void setAdvertising(Double advertising) {
    this.advertising = advertising;
  }

  public RoyaltyIncomeStatementAllOf auto(Double auto) {
    this.auto = auto;
    return this;
  }

  /**
   * Box 6, Auto and travel
   * @return auto
  */
  @ApiModelProperty(value = "Box 6, Auto and travel")


  public Double getAuto() {
    return auto;
  }

  public void setAuto(Double auto) {
    this.auto = auto;
  }

  public RoyaltyIncomeStatementAllOf cleaning(Double cleaning) {
    this.cleaning = cleaning;
    return this;
  }

  /**
   * Box 7, Cleaning and maintenance
   * @return cleaning
  */
  @ApiModelProperty(value = "Box 7, Cleaning and maintenance")


  public Double getCleaning() {
    return cleaning;
  }

  public void setCleaning(Double cleaning) {
    this.cleaning = cleaning;
  }

  public RoyaltyIncomeStatementAllOf commissions(Double commissions) {
    this.commissions = commissions;
    return this;
  }

  /**
   * Box 8, Commissions
   * @return commissions
  */
  @ApiModelProperty(value = "Box 8, Commissions")


  public Double getCommissions() {
    return commissions;
  }

  public void setCommissions(Double commissions) {
    this.commissions = commissions;
  }

  public RoyaltyIncomeStatementAllOf insurance(Double insurance) {
    this.insurance = insurance;
    return this;
  }

  /**
   * Box 9, Insurance
   * @return insurance
  */
  @ApiModelProperty(value = "Box 9, Insurance")


  public Double getInsurance() {
    return insurance;
  }

  public void setInsurance(Double insurance) {
    this.insurance = insurance;
  }

  public RoyaltyIncomeStatementAllOf legal(Double legal) {
    this.legal = legal;
    return this;
  }

  /**
   * Box 10, Legal and other professional fees
   * @return legal
  */
  @ApiModelProperty(value = "Box 10, Legal and other professional fees")


  public Double getLegal() {
    return legal;
  }

  public void setLegal(Double legal) {
    this.legal = legal;
  }

  public RoyaltyIncomeStatementAllOf managementFees(Double managementFees) {
    this.managementFees = managementFees;
    return this;
  }

  /**
   * Box 11, Management fees
   * @return managementFees
  */
  @ApiModelProperty(value = "Box 11, Management fees")


  public Double getManagementFees() {
    return managementFees;
  }

  public void setManagementFees(Double managementFees) {
    this.managementFees = managementFees;
  }

  public RoyaltyIncomeStatementAllOf mortgageInterest(Double mortgageInterest) {
    this.mortgageInterest = mortgageInterest;
    return this;
  }

  /**
   * Box 12, Mortgage interest paid to banks, etc.
   * @return mortgageInterest
  */
  @ApiModelProperty(value = "Box 12, Mortgage interest paid to banks, etc.")


  public Double getMortgageInterest() {
    return mortgageInterest;
  }

  public void setMortgageInterest(Double mortgageInterest) {
    this.mortgageInterest = mortgageInterest;
  }

  public RoyaltyIncomeStatementAllOf otherInterest(Double otherInterest) {
    this.otherInterest = otherInterest;
    return this;
  }

  /**
   * Box 13, Other interest
   * @return otherInterest
  */
  @ApiModelProperty(value = "Box 13, Other interest")


  public Double getOtherInterest() {
    return otherInterest;
  }

  public void setOtherInterest(Double otherInterest) {
    this.otherInterest = otherInterest;
  }

  public RoyaltyIncomeStatementAllOf repairs(Double repairs) {
    this.repairs = repairs;
    return this;
  }

  /**
   * Box 14, Repairs
   * @return repairs
  */
  @ApiModelProperty(value = "Box 14, Repairs")


  public Double getRepairs() {
    return repairs;
  }

  public void setRepairs(Double repairs) {
    this.repairs = repairs;
  }

  public RoyaltyIncomeStatementAllOf supplies(Double supplies) {
    this.supplies = supplies;
    return this;
  }

  /**
   * Box 15, Supplies
   * @return supplies
  */
  @ApiModelProperty(value = "Box 15, Supplies")


  public Double getSupplies() {
    return supplies;
  }

  public void setSupplies(Double supplies) {
    this.supplies = supplies;
  }

  public RoyaltyIncomeStatementAllOf taxes(Double taxes) {
    this.taxes = taxes;
    return this;
  }

  /**
   * Box 16, Taxes
   * @return taxes
  */
  @ApiModelProperty(value = "Box 16, Taxes")


  public Double getTaxes() {
    return taxes;
  }

  public void setTaxes(Double taxes) {
    this.taxes = taxes;
  }

  public RoyaltyIncomeStatementAllOf utilities(Double utilities) {
    this.utilities = utilities;
    return this;
  }

  /**
   * Box 17, Utilities
   * @return utilities
  */
  @ApiModelProperty(value = "Box 17, Utilities")


  public Double getUtilities() {
    return utilities;
  }

  public void setUtilities(Double utilities) {
    this.utilities = utilities;
  }

  public RoyaltyIncomeStatementAllOf depletionExpense(Double depletionExpense) {
    this.depletionExpense = depletionExpense;
    return this;
  }

  /**
   * Box 18, Depletion
   * @return depletionExpense
  */
  @ApiModelProperty(value = "Box 18, Depletion")


  public Double getDepletionExpense() {
    return depletionExpense;
  }

  public void setDepletionExpense(Double depletionExpense) {
    this.depletionExpense = depletionExpense;
  }

  public RoyaltyIncomeStatementAllOf otherExpenses(List<DescriptionAmount> otherExpenses) {
    this.otherExpenses = otherExpenses;
    return this;
  }

  public RoyaltyIncomeStatementAllOf addOtherExpensesItem(DescriptionAmount otherExpensesItem) {
    if (this.otherExpenses == null) {
      this.otherExpenses = new ArrayList<>();
    }
    this.otherExpenses.add(otherExpensesItem);
    return this;
  }

  /**
   * Box 19, Other expenses
   * @return otherExpenses
  */
  @ApiModelProperty(value = "Box 19, Other expenses")

  @Valid

  public List<DescriptionAmount> getOtherExpenses() {
    return otherExpenses;
  }

  public void setOtherExpenses(List<DescriptionAmount> otherExpenses) {
    this.otherExpenses = otherExpenses;
  }

  public RoyaltyIncomeStatementAllOf capitalExpenditures(List<DateAmount> capitalExpenditures) {
    this.capitalExpenditures = capitalExpenditures;
    return this;
  }

  public RoyaltyIncomeStatementAllOf addCapitalExpendituresItem(DateAmount capitalExpendituresItem) {
    if (this.capitalExpenditures == null) {
      this.capitalExpenditures = new ArrayList<>();
    }
    this.capitalExpenditures.add(capitalExpendituresItem);
    return this;
  }

  /**
   * Capital expenditures, for use in calculating Depreciation
   * @return capitalExpenditures
  */
  @ApiModelProperty(value = "Capital expenditures, for use in calculating Depreciation")

  @Valid

  public List<DateAmount> getCapitalExpenditures() {
    return capitalExpenditures;
  }

  public void setCapitalExpenditures(List<DateAmount> capitalExpenditures) {
    this.capitalExpenditures = capitalExpenditures;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoyaltyIncomeStatementAllOf royaltyIncomeStatementAllOf = (RoyaltyIncomeStatementAllOf) o;
    return Objects.equals(this.propertyAddress, royaltyIncomeStatementAllOf.propertyAddress) &&
        Objects.equals(this.royalties, royaltyIncomeStatementAllOf.royalties) &&
        Objects.equals(this.advertising, royaltyIncomeStatementAllOf.advertising) &&
        Objects.equals(this.auto, royaltyIncomeStatementAllOf.auto) &&
        Objects.equals(this.cleaning, royaltyIncomeStatementAllOf.cleaning) &&
        Objects.equals(this.commissions, royaltyIncomeStatementAllOf.commissions) &&
        Objects.equals(this.insurance, royaltyIncomeStatementAllOf.insurance) &&
        Objects.equals(this.legal, royaltyIncomeStatementAllOf.legal) &&
        Objects.equals(this.managementFees, royaltyIncomeStatementAllOf.managementFees) &&
        Objects.equals(this.mortgageInterest, royaltyIncomeStatementAllOf.mortgageInterest) &&
        Objects.equals(this.otherInterest, royaltyIncomeStatementAllOf.otherInterest) &&
        Objects.equals(this.repairs, royaltyIncomeStatementAllOf.repairs) &&
        Objects.equals(this.supplies, royaltyIncomeStatementAllOf.supplies) &&
        Objects.equals(this.taxes, royaltyIncomeStatementAllOf.taxes) &&
        Objects.equals(this.utilities, royaltyIncomeStatementAllOf.utilities) &&
        Objects.equals(this.depletionExpense, royaltyIncomeStatementAllOf.depletionExpense) &&
        Objects.equals(this.otherExpenses, royaltyIncomeStatementAllOf.otherExpenses) &&
        Objects.equals(this.capitalExpenditures, royaltyIncomeStatementAllOf.capitalExpenditures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(propertyAddress, royalties, advertising, auto, cleaning, commissions, insurance, legal, managementFees, mortgageInterest, otherInterest, repairs, supplies, taxes, utilities, depletionExpense, otherExpenses, capitalExpenditures);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoyaltyIncomeStatementAllOf {\n");
    
    sb.append("    propertyAddress: ").append(toIndentedString(propertyAddress)).append("\n");
    sb.append("    royalties: ").append(toIndentedString(royalties)).append("\n");
    sb.append("    advertising: ").append(toIndentedString(advertising)).append("\n");
    sb.append("    auto: ").append(toIndentedString(auto)).append("\n");
    sb.append("    cleaning: ").append(toIndentedString(cleaning)).append("\n");
    sb.append("    commissions: ").append(toIndentedString(commissions)).append("\n");
    sb.append("    insurance: ").append(toIndentedString(insurance)).append("\n");
    sb.append("    legal: ").append(toIndentedString(legal)).append("\n");
    sb.append("    managementFees: ").append(toIndentedString(managementFees)).append("\n");
    sb.append("    mortgageInterest: ").append(toIndentedString(mortgageInterest)).append("\n");
    sb.append("    otherInterest: ").append(toIndentedString(otherInterest)).append("\n");
    sb.append("    repairs: ").append(toIndentedString(repairs)).append("\n");
    sb.append("    supplies: ").append(toIndentedString(supplies)).append("\n");
    sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
    sb.append("    utilities: ").append(toIndentedString(utilities)).append("\n");
    sb.append("    depletionExpense: ").append(toIndentedString(depletionExpense)).append("\n");
    sb.append("    otherExpenses: ").append(toIndentedString(otherExpenses)).append("\n");
    sb.append("    capitalExpenditures: ").append(toIndentedString(capitalExpenditures)).append("\n");
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

