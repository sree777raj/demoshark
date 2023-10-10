package com.fdx.api.model46.modelimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * BusinessIncomeStatementAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class BusinessIncomeStatementAllOf   {
  @JsonProperty("businessName")
  private String businessName;

  @JsonProperty("sales")
  private Double sales;

  @JsonProperty("returns")
  private Double returns;

  @JsonProperty("otherIncome")
  @Valid
  private List<DescriptionAmount> otherIncome = null;

  @JsonProperty("advertising")
  private Double advertising;

  @JsonProperty("carAndTruck")
  private Double carAndTruck;

  @JsonProperty("commissions")
  private Double commissions;

  @JsonProperty("contractLabor")
  private Double contractLabor;

  @JsonProperty("depletion")
  private Double depletion;

  @JsonProperty("depreciation")
  private Double depreciation;

  @JsonProperty("employeeBenefits")
  private Double employeeBenefits;

  @JsonProperty("insurance")
  private Double insurance;

  @JsonProperty("mortgageInterest")
  private Double mortgageInterest;

  @JsonProperty("otherInterest")
  private Double otherInterest;

  @JsonProperty("legal")
  private Double legal;

  @JsonProperty("office")
  private Double office;

  @JsonProperty("pension")
  private Double pension;

  @JsonProperty("equipmentRent")
  private Double equipmentRent;

  @JsonProperty("otherRent")
  private Double otherRent;

  @JsonProperty("repairs")
  private Double repairs;

  @JsonProperty("supplies")
  private Double supplies;

  @JsonProperty("taxes")
  private Double taxes;

  @JsonProperty("travel")
  private Double travel;

  @JsonProperty("meals")
  private Double meals;

  @JsonProperty("utilities")
  private Double utilities;

  @JsonProperty("wages")
  private Double wages;

  @JsonProperty("otherExpenses")
  @Valid
  private List<DescriptionAmount> otherExpenses = null;

  @JsonProperty("beginningInventory")
  private Double beginningInventory;

  @JsonProperty("purchases")
  private Double purchases;

  @JsonProperty("costOfLabor")
  private Double costOfLabor;

  @JsonProperty("materials")
  private Double materials;

  @JsonProperty("otherCosts")
  @Valid
  private List<DescriptionAmount> otherCosts = null;

  @JsonProperty("endingInventory")
  private Double endingInventory;

  @JsonProperty("capitalExpenditures")
  @Valid
  private List<DateAmount> capitalExpenditures = null;

  public BusinessIncomeStatementAllOf businessName(String businessName) {
    this.businessName = businessName;
    return this;
  }

  /**
   * Box C, Business name
   * @return businessName
  */
  @ApiModelProperty(value = "Box C, Business name")


  public String getBusinessName() {
    return businessName;
  }

  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }

  public BusinessIncomeStatementAllOf sales(Double sales) {
    this.sales = sales;
    return this;
  }

  /**
   * Box 1, Gross receipts or sales
   * @return sales
  */
  @ApiModelProperty(value = "Box 1, Gross receipts or sales")


  public Double getSales() {
    return sales;
  }

  public void setSales(Double sales) {
    this.sales = sales;
  }

  public BusinessIncomeStatementAllOf returns(Double returns) {
    this.returns = returns;
    return this;
  }

  /**
   * Box 2, Returns and allowances
   * @return returns
  */
  @ApiModelProperty(value = "Box 2, Returns and allowances")


  public Double getReturns() {
    return returns;
  }

  public void setReturns(Double returns) {
    this.returns = returns;
  }

  public BusinessIncomeStatementAllOf otherIncome(List<DescriptionAmount> otherIncome) {
    this.otherIncome = otherIncome;
    return this;
  }

  public BusinessIncomeStatementAllOf addOtherIncomeItem(DescriptionAmount otherIncomeItem) {
    if (this.otherIncome == null) {
      this.otherIncome = new ArrayList<>();
    }
    this.otherIncome.add(otherIncomeItem);
    return this;
  }

  /**
   * Box 6, Other income, including federal and state gasoline or fuel tax credit or refund
   * @return otherIncome
  */
  @ApiModelProperty(value = "Box 6, Other income, including federal and state gasoline or fuel tax credit or refund")

  @Valid

  public List<DescriptionAmount> getOtherIncome() {
    return otherIncome;
  }

  public void setOtherIncome(List<DescriptionAmount> otherIncome) {
    this.otherIncome = otherIncome;
  }

  public BusinessIncomeStatementAllOf advertising(Double advertising) {
    this.advertising = advertising;
    return this;
  }

  /**
   * Box 8, Advertising
   * @return advertising
  */
  @ApiModelProperty(value = "Box 8, Advertising")


  public Double getAdvertising() {
    return advertising;
  }

  public void setAdvertising(Double advertising) {
    this.advertising = advertising;
  }

  public BusinessIncomeStatementAllOf carAndTruck(Double carAndTruck) {
    this.carAndTruck = carAndTruck;
    return this;
  }

  /**
   * Box 9, Car and truck expenses
   * @return carAndTruck
  */
  @ApiModelProperty(value = "Box 9, Car and truck expenses")


  public Double getCarAndTruck() {
    return carAndTruck;
  }

  public void setCarAndTruck(Double carAndTruck) {
    this.carAndTruck = carAndTruck;
  }

  public BusinessIncomeStatementAllOf commissions(Double commissions) {
    this.commissions = commissions;
    return this;
  }

  /**
   * Box 10, Commissions and fees
   * @return commissions
  */
  @ApiModelProperty(value = "Box 10, Commissions and fees")


  public Double getCommissions() {
    return commissions;
  }

  public void setCommissions(Double commissions) {
    this.commissions = commissions;
  }

  public BusinessIncomeStatementAllOf contractLabor(Double contractLabor) {
    this.contractLabor = contractLabor;
    return this;
  }

  /**
   * Box 11, Contract labor
   * @return contractLabor
  */
  @ApiModelProperty(value = "Box 11, Contract labor")


  public Double getContractLabor() {
    return contractLabor;
  }

  public void setContractLabor(Double contractLabor) {
    this.contractLabor = contractLabor;
  }

  public BusinessIncomeStatementAllOf depletion(Double depletion) {
    this.depletion = depletion;
    return this;
  }

  /**
   * Box 12, Depletion
   * @return depletion
  */
  @ApiModelProperty(value = "Box 12, Depletion")


  public Double getDepletion() {
    return depletion;
  }

  public void setDepletion(Double depletion) {
    this.depletion = depletion;
  }

  public BusinessIncomeStatementAllOf depreciation(Double depreciation) {
    this.depreciation = depreciation;
    return this;
  }

  /**
   * Box 13, Depreciation
   * @return depreciation
  */
  @ApiModelProperty(value = "Box 13, Depreciation")


  public Double getDepreciation() {
    return depreciation;
  }

  public void setDepreciation(Double depreciation) {
    this.depreciation = depreciation;
  }

  public BusinessIncomeStatementAllOf employeeBenefits(Double employeeBenefits) {
    this.employeeBenefits = employeeBenefits;
    return this;
  }

  /**
   * Box 14, Employee benefit programs
   * @return employeeBenefits
  */
  @ApiModelProperty(value = "Box 14, Employee benefit programs")


  public Double getEmployeeBenefits() {
    return employeeBenefits;
  }

  public void setEmployeeBenefits(Double employeeBenefits) {
    this.employeeBenefits = employeeBenefits;
  }

  public BusinessIncomeStatementAllOf insurance(Double insurance) {
    this.insurance = insurance;
    return this;
  }

  /**
   * Box 15, Insurance
   * @return insurance
  */
  @ApiModelProperty(value = "Box 15, Insurance")


  public Double getInsurance() {
    return insurance;
  }

  public void setInsurance(Double insurance) {
    this.insurance = insurance;
  }

  public BusinessIncomeStatementAllOf mortgageInterest(Double mortgageInterest) {
    this.mortgageInterest = mortgageInterest;
    return this;
  }

  /**
   * Box 16a, Mortgage interest
   * @return mortgageInterest
  */
  @ApiModelProperty(value = "Box 16a, Mortgage interest")


  public Double getMortgageInterest() {
    return mortgageInterest;
  }

  public void setMortgageInterest(Double mortgageInterest) {
    this.mortgageInterest = mortgageInterest;
  }

  public BusinessIncomeStatementAllOf otherInterest(Double otherInterest) {
    this.otherInterest = otherInterest;
    return this;
  }

  /**
   * Box 16b, Other interest
   * @return otherInterest
  */
  @ApiModelProperty(value = "Box 16b, Other interest")


  public Double getOtherInterest() {
    return otherInterest;
  }

  public void setOtherInterest(Double otherInterest) {
    this.otherInterest = otherInterest;
  }

  public BusinessIncomeStatementAllOf legal(Double legal) {
    this.legal = legal;
    return this;
  }

  /**
   * Box 17, Legal and professional services
   * @return legal
  */
  @ApiModelProperty(value = "Box 17, Legal and professional services")


  public Double getLegal() {
    return legal;
  }

  public void setLegal(Double legal) {
    this.legal = legal;
  }

  public BusinessIncomeStatementAllOf office(Double office) {
    this.office = office;
    return this;
  }

  /**
   * Box 18, Office expense
   * @return office
  */
  @ApiModelProperty(value = "Box 18, Office expense")


  public Double getOffice() {
    return office;
  }

  public void setOffice(Double office) {
    this.office = office;
  }

  public BusinessIncomeStatementAllOf pension(Double pension) {
    this.pension = pension;
    return this;
  }

  /**
   * Box 19, Pension and profit-sharing plans
   * @return pension
  */
  @ApiModelProperty(value = "Box 19, Pension and profit-sharing plans")


  public Double getPension() {
    return pension;
  }

  public void setPension(Double pension) {
    this.pension = pension;
  }

  public BusinessIncomeStatementAllOf equipmentRent(Double equipmentRent) {
    this.equipmentRent = equipmentRent;
    return this;
  }

  /**
   * Box 20a, Equipment rent
   * @return equipmentRent
  */
  @ApiModelProperty(value = "Box 20a, Equipment rent")


  public Double getEquipmentRent() {
    return equipmentRent;
  }

  public void setEquipmentRent(Double equipmentRent) {
    this.equipmentRent = equipmentRent;
  }

  public BusinessIncomeStatementAllOf otherRent(Double otherRent) {
    this.otherRent = otherRent;
    return this;
  }

  /**
   * Box 20b, Other rent
   * @return otherRent
  */
  @ApiModelProperty(value = "Box 20b, Other rent")


  public Double getOtherRent() {
    return otherRent;
  }

  public void setOtherRent(Double otherRent) {
    this.otherRent = otherRent;
  }

  public BusinessIncomeStatementAllOf repairs(Double repairs) {
    this.repairs = repairs;
    return this;
  }

  /**
   * Box 21, Repairs and maintenance
   * @return repairs
  */
  @ApiModelProperty(value = "Box 21, Repairs and maintenance")


  public Double getRepairs() {
    return repairs;
  }

  public void setRepairs(Double repairs) {
    this.repairs = repairs;
  }

  public BusinessIncomeStatementAllOf supplies(Double supplies) {
    this.supplies = supplies;
    return this;
  }

  /**
   * Box 22, Supplies
   * @return supplies
  */
  @ApiModelProperty(value = "Box 22, Supplies")


  public Double getSupplies() {
    return supplies;
  }

  public void setSupplies(Double supplies) {
    this.supplies = supplies;
  }

  public BusinessIncomeStatementAllOf taxes(Double taxes) {
    this.taxes = taxes;
    return this;
  }

  /**
   * Box 23, Taxes and licenses
   * @return taxes
  */
  @ApiModelProperty(value = "Box 23, Taxes and licenses")


  public Double getTaxes() {
    return taxes;
  }

  public void setTaxes(Double taxes) {
    this.taxes = taxes;
  }

  public BusinessIncomeStatementAllOf travel(Double travel) {
    this.travel = travel;
    return this;
  }

  /**
   * Box 24a, Travel
   * @return travel
  */
  @ApiModelProperty(value = "Box 24a, Travel")


  public Double getTravel() {
    return travel;
  }

  public void setTravel(Double travel) {
    this.travel = travel;
  }

  public BusinessIncomeStatementAllOf meals(Double meals) {
    this.meals = meals;
    return this;
  }

  /**
   * Box 24b, Deductible meals
   * @return meals
  */
  @ApiModelProperty(value = "Box 24b, Deductible meals")


  public Double getMeals() {
    return meals;
  }

  public void setMeals(Double meals) {
    this.meals = meals;
  }

  public BusinessIncomeStatementAllOf utilities(Double utilities) {
    this.utilities = utilities;
    return this;
  }

  /**
   * Box 25, Utilities
   * @return utilities
  */
  @ApiModelProperty(value = "Box 25, Utilities")


  public Double getUtilities() {
    return utilities;
  }

  public void setUtilities(Double utilities) {
    this.utilities = utilities;
  }

  public BusinessIncomeStatementAllOf wages(Double wages) {
    this.wages = wages;
    return this;
  }

  /**
   * Box 26, Wages
   * @return wages
  */
  @ApiModelProperty(value = "Box 26, Wages")


  public Double getWages() {
    return wages;
  }

  public void setWages(Double wages) {
    this.wages = wages;
  }

  public BusinessIncomeStatementAllOf otherExpenses(List<DescriptionAmount> otherExpenses) {
    this.otherExpenses = otherExpenses;
    return this;
  }

  public BusinessIncomeStatementAllOf addOtherExpensesItem(DescriptionAmount otherExpensesItem) {
    if (this.otherExpenses == null) {
      this.otherExpenses = new ArrayList<>();
    }
    this.otherExpenses.add(otherExpensesItem);
    return this;
  }

  /**
   * Box 27, Other expenses
   * @return otherExpenses
  */
  @ApiModelProperty(value = "Box 27, Other expenses")

  @Valid

  public List<DescriptionAmount> getOtherExpenses() {
    return otherExpenses;
  }

  public void setOtherExpenses(List<DescriptionAmount> otherExpenses) {
    this.otherExpenses = otherExpenses;
  }

  public BusinessIncomeStatementAllOf beginningInventory(Double beginningInventory) {
    this.beginningInventory = beginningInventory;
    return this;
  }

  /**
   * Box 35, Inventory at beginning of year
   * @return beginningInventory
  */
  @ApiModelProperty(value = "Box 35, Inventory at beginning of year")


  public Double getBeginningInventory() {
    return beginningInventory;
  }

  public void setBeginningInventory(Double beginningInventory) {
    this.beginningInventory = beginningInventory;
  }

  public BusinessIncomeStatementAllOf purchases(Double purchases) {
    this.purchases = purchases;
    return this;
  }

  /**
   * Box 36, Purchases
   * @return purchases
  */
  @ApiModelProperty(value = "Box 36, Purchases")


  public Double getPurchases() {
    return purchases;
  }

  public void setPurchases(Double purchases) {
    this.purchases = purchases;
  }

  public BusinessIncomeStatementAllOf costOfLabor(Double costOfLabor) {
    this.costOfLabor = costOfLabor;
    return this;
  }

  /**
   * Box 37, Cost of labor
   * @return costOfLabor
  */
  @ApiModelProperty(value = "Box 37, Cost of labor")


  public Double getCostOfLabor() {
    return costOfLabor;
  }

  public void setCostOfLabor(Double costOfLabor) {
    this.costOfLabor = costOfLabor;
  }

  public BusinessIncomeStatementAllOf materials(Double materials) {
    this.materials = materials;
    return this;
  }

  /**
   * Box 38, Materials and supplies
   * @return materials
  */
  @ApiModelProperty(value = "Box 38, Materials and supplies")


  public Double getMaterials() {
    return materials;
  }

  public void setMaterials(Double materials) {
    this.materials = materials;
  }

  public BusinessIncomeStatementAllOf otherCosts(List<DescriptionAmount> otherCosts) {
    this.otherCosts = otherCosts;
    return this;
  }

  public BusinessIncomeStatementAllOf addOtherCostsItem(DescriptionAmount otherCostsItem) {
    if (this.otherCosts == null) {
      this.otherCosts = new ArrayList<>();
    }
    this.otherCosts.add(otherCostsItem);
    return this;
  }

  /**
   * Box 39, Other costs
   * @return otherCosts
  */
  @ApiModelProperty(value = "Box 39, Other costs")

  @Valid

  public List<DescriptionAmount> getOtherCosts() {
    return otherCosts;
  }

  public void setOtherCosts(List<DescriptionAmount> otherCosts) {
    this.otherCosts = otherCosts;
  }

  public BusinessIncomeStatementAllOf endingInventory(Double endingInventory) {
    this.endingInventory = endingInventory;
    return this;
  }

  /**
   * Box 41, Inventory at end of year
   * @return endingInventory
  */
  @ApiModelProperty(value = "Box 41, Inventory at end of year")


  public Double getEndingInventory() {
    return endingInventory;
  }

  public void setEndingInventory(Double endingInventory) {
    this.endingInventory = endingInventory;
  }

  public BusinessIncomeStatementAllOf capitalExpenditures(List<DateAmount> capitalExpenditures) {
    this.capitalExpenditures = capitalExpenditures;
    return this;
  }

  public BusinessIncomeStatementAllOf addCapitalExpendituresItem(DateAmount capitalExpendituresItem) {
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
    BusinessIncomeStatementAllOf businessIncomeStatementAllOf = (BusinessIncomeStatementAllOf) o;
    return Objects.equals(this.businessName, businessIncomeStatementAllOf.businessName) &&
        Objects.equals(this.sales, businessIncomeStatementAllOf.sales) &&
        Objects.equals(this.returns, businessIncomeStatementAllOf.returns) &&
        Objects.equals(this.otherIncome, businessIncomeStatementAllOf.otherIncome) &&
        Objects.equals(this.advertising, businessIncomeStatementAllOf.advertising) &&
        Objects.equals(this.carAndTruck, businessIncomeStatementAllOf.carAndTruck) &&
        Objects.equals(this.commissions, businessIncomeStatementAllOf.commissions) &&
        Objects.equals(this.contractLabor, businessIncomeStatementAllOf.contractLabor) &&
        Objects.equals(this.depletion, businessIncomeStatementAllOf.depletion) &&
        Objects.equals(this.depreciation, businessIncomeStatementAllOf.depreciation) &&
        Objects.equals(this.employeeBenefits, businessIncomeStatementAllOf.employeeBenefits) &&
        Objects.equals(this.insurance, businessIncomeStatementAllOf.insurance) &&
        Objects.equals(this.mortgageInterest, businessIncomeStatementAllOf.mortgageInterest) &&
        Objects.equals(this.otherInterest, businessIncomeStatementAllOf.otherInterest) &&
        Objects.equals(this.legal, businessIncomeStatementAllOf.legal) &&
        Objects.equals(this.office, businessIncomeStatementAllOf.office) &&
        Objects.equals(this.pension, businessIncomeStatementAllOf.pension) &&
        Objects.equals(this.equipmentRent, businessIncomeStatementAllOf.equipmentRent) &&
        Objects.equals(this.otherRent, businessIncomeStatementAllOf.otherRent) &&
        Objects.equals(this.repairs, businessIncomeStatementAllOf.repairs) &&
        Objects.equals(this.supplies, businessIncomeStatementAllOf.supplies) &&
        Objects.equals(this.taxes, businessIncomeStatementAllOf.taxes) &&
        Objects.equals(this.travel, businessIncomeStatementAllOf.travel) &&
        Objects.equals(this.meals, businessIncomeStatementAllOf.meals) &&
        Objects.equals(this.utilities, businessIncomeStatementAllOf.utilities) &&
        Objects.equals(this.wages, businessIncomeStatementAllOf.wages) &&
        Objects.equals(this.otherExpenses, businessIncomeStatementAllOf.otherExpenses) &&
        Objects.equals(this.beginningInventory, businessIncomeStatementAllOf.beginningInventory) &&
        Objects.equals(this.purchases, businessIncomeStatementAllOf.purchases) &&
        Objects.equals(this.costOfLabor, businessIncomeStatementAllOf.costOfLabor) &&
        Objects.equals(this.materials, businessIncomeStatementAllOf.materials) &&
        Objects.equals(this.otherCosts, businessIncomeStatementAllOf.otherCosts) &&
        Objects.equals(this.endingInventory, businessIncomeStatementAllOf.endingInventory) &&
        Objects.equals(this.capitalExpenditures, businessIncomeStatementAllOf.capitalExpenditures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessName, sales, returns, otherIncome, advertising, carAndTruck, commissions, contractLabor, depletion, depreciation, employeeBenefits, insurance, mortgageInterest, otherInterest, legal, office, pension, equipmentRent, otherRent, repairs, supplies, taxes, travel, meals, utilities, wages, otherExpenses, beginningInventory, purchases, costOfLabor, materials, otherCosts, endingInventory, capitalExpenditures);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessIncomeStatementAllOf {\n");
    
    sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
    sb.append("    sales: ").append(toIndentedString(sales)).append("\n");
    sb.append("    returns: ").append(toIndentedString(returns)).append("\n");
    sb.append("    otherIncome: ").append(toIndentedString(otherIncome)).append("\n");
    sb.append("    advertising: ").append(toIndentedString(advertising)).append("\n");
    sb.append("    carAndTruck: ").append(toIndentedString(carAndTruck)).append("\n");
    sb.append("    commissions: ").append(toIndentedString(commissions)).append("\n");
    sb.append("    contractLabor: ").append(toIndentedString(contractLabor)).append("\n");
    sb.append("    depletion: ").append(toIndentedString(depletion)).append("\n");
    sb.append("    depreciation: ").append(toIndentedString(depreciation)).append("\n");
    sb.append("    employeeBenefits: ").append(toIndentedString(employeeBenefits)).append("\n");
    sb.append("    insurance: ").append(toIndentedString(insurance)).append("\n");
    sb.append("    mortgageInterest: ").append(toIndentedString(mortgageInterest)).append("\n");
    sb.append("    otherInterest: ").append(toIndentedString(otherInterest)).append("\n");
    sb.append("    legal: ").append(toIndentedString(legal)).append("\n");
    sb.append("    office: ").append(toIndentedString(office)).append("\n");
    sb.append("    pension: ").append(toIndentedString(pension)).append("\n");
    sb.append("    equipmentRent: ").append(toIndentedString(equipmentRent)).append("\n");
    sb.append("    otherRent: ").append(toIndentedString(otherRent)).append("\n");
    sb.append("    repairs: ").append(toIndentedString(repairs)).append("\n");
    sb.append("    supplies: ").append(toIndentedString(supplies)).append("\n");
    sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
    sb.append("    travel: ").append(toIndentedString(travel)).append("\n");
    sb.append("    meals: ").append(toIndentedString(meals)).append("\n");
    sb.append("    utilities: ").append(toIndentedString(utilities)).append("\n");
    sb.append("    wages: ").append(toIndentedString(wages)).append("\n");
    sb.append("    otherExpenses: ").append(toIndentedString(otherExpenses)).append("\n");
    sb.append("    beginningInventory: ").append(toIndentedString(beginningInventory)).append("\n");
    sb.append("    purchases: ").append(toIndentedString(purchases)).append("\n");
    sb.append("    costOfLabor: ").append(toIndentedString(costOfLabor)).append("\n");
    sb.append("    materials: ").append(toIndentedString(materials)).append("\n");
    sb.append("    otherCosts: ").append(toIndentedString(otherCosts)).append("\n");
    sb.append("    endingInventory: ").append(toIndentedString(endingInventory)).append("\n");
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

