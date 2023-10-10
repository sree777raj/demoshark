package com.fdx.api.model46.modelimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * FarmIncomeStatementAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class FarmIncomeStatementAllOf   {
  @JsonProperty("cropOrActivity")
  private String cropOrActivity;

  @JsonProperty("sales")
  private Double sales;

  @JsonProperty("costOfItemsSold")
  private Double costOfItemsSold;

  @JsonProperty("salesOfRaised")
  private Double salesOfRaised;

  @JsonProperty("coopDistributions")
  private Double coopDistributions;

  @JsonProperty("agProgramPayments")
  private Double agProgramPayments;

  @JsonProperty("cccLoans")
  private Double cccLoans;

  @JsonProperty("cropInsuranceProceeds")
  private Double cropInsuranceProceeds;

  @JsonProperty("customHireIncome")
  private Double customHireIncome;

  @JsonProperty("otherIncome")
  @Valid
  private List<DescriptionAmount> otherIncome = null;

  @JsonProperty("carAndTruck")
  private Double carAndTruck;

  @JsonProperty("chemicals")
  private Double chemicals;

  @JsonProperty("conservation")
  private Double conservation;

  @JsonProperty("customHireExpenses")
  private Double customHireExpenses;

  @JsonProperty("depreciation")
  private Double depreciation;

  @JsonProperty("employeeBenefitPrograms")
  private Double employeeBenefitPrograms;

  @JsonProperty("feed")
  private Double feed;

  @JsonProperty("fertilizers")
  private Double fertilizers;

  @JsonProperty("freight")
  private Double freight;

  @JsonProperty("fuel")
  private Double fuel;

  @JsonProperty("insurance")
  private Double insurance;

  @JsonProperty("mortgageInterest")
  private Double mortgageInterest;

  @JsonProperty("otherInterest")
  private Double otherInterest;

  @JsonProperty("laborHired")
  private Double laborHired;

  @JsonProperty("pension")
  private Double pension;

  @JsonProperty("equipmentRent")
  private Double equipmentRent;

  @JsonProperty("otherRent")
  private Double otherRent;

  @JsonProperty("repairs")
  private Double repairs;

  @JsonProperty("seeds")
  private Double seeds;

  @JsonProperty("storage")
  private Double storage;

  @JsonProperty("supplies")
  private Double supplies;

  @JsonProperty("taxes")
  private Double taxes;

  @JsonProperty("utilities")
  private Double utilities;

  @JsonProperty("veterinary")
  private Double veterinary;

  @JsonProperty("otherExpenses")
  @Valid
  private List<DescriptionAmount> otherExpenses = null;

  @JsonProperty("capitalExpenditures")
  @Valid
  private List<DateAmount> capitalExpenditures = null;

  public FarmIncomeStatementAllOf cropOrActivity(String cropOrActivity) {
    this.cropOrActivity = cropOrActivity;
    return this;
  }

  /**
   * Box A, Principal crop or activity
   * @return cropOrActivity
  */
  @ApiModelProperty(value = "Box A, Principal crop or activity")


  public String getCropOrActivity() {
    return cropOrActivity;
  }

  public void setCropOrActivity(String cropOrActivity) {
    this.cropOrActivity = cropOrActivity;
  }

  public FarmIncomeStatementAllOf sales(Double sales) {
    this.sales = sales;
    return this;
  }

  /**
   * Box 1a, Sales of livestock and other resale items
   * @return sales
  */
  @ApiModelProperty(value = "Box 1a, Sales of livestock and other resale items")


  public Double getSales() {
    return sales;
  }

  public void setSales(Double sales) {
    this.sales = sales;
  }

  public FarmIncomeStatementAllOf costOfItemsSold(Double costOfItemsSold) {
    this.costOfItemsSold = costOfItemsSold;
    return this;
  }

  /**
   * Box 1b, Cost or other basis of livestock or other items
   * @return costOfItemsSold
  */
  @ApiModelProperty(value = "Box 1b, Cost or other basis of livestock or other items")


  public Double getCostOfItemsSold() {
    return costOfItemsSold;
  }

  public void setCostOfItemsSold(Double costOfItemsSold) {
    this.costOfItemsSold = costOfItemsSold;
  }

  public FarmIncomeStatementAllOf salesOfRaised(Double salesOfRaised) {
    this.salesOfRaised = salesOfRaised;
    return this;
  }

  /**
   * Box 2, Sales of livestock, produce, grains, and other products you raised
   * @return salesOfRaised
  */
  @ApiModelProperty(value = "Box 2, Sales of livestock, produce, grains, and other products you raised")


  public Double getSalesOfRaised() {
    return salesOfRaised;
  }

  public void setSalesOfRaised(Double salesOfRaised) {
    this.salesOfRaised = salesOfRaised;
  }

  public FarmIncomeStatementAllOf coopDistributions(Double coopDistributions) {
    this.coopDistributions = coopDistributions;
    return this;
  }

  /**
   * Box 3a, Cooperative distributions
   * @return coopDistributions
  */
  @ApiModelProperty(value = "Box 3a, Cooperative distributions")


  public Double getCoopDistributions() {
    return coopDistributions;
  }

  public void setCoopDistributions(Double coopDistributions) {
    this.coopDistributions = coopDistributions;
  }

  public FarmIncomeStatementAllOf agProgramPayments(Double agProgramPayments) {
    this.agProgramPayments = agProgramPayments;
    return this;
  }

  /**
   * Box 4a, Agricultural program payments
   * @return agProgramPayments
  */
  @ApiModelProperty(value = "Box 4a, Agricultural program payments")


  public Double getAgProgramPayments() {
    return agProgramPayments;
  }

  public void setAgProgramPayments(Double agProgramPayments) {
    this.agProgramPayments = agProgramPayments;
  }

  public FarmIncomeStatementAllOf cccLoans(Double cccLoans) {
    this.cccLoans = cccLoans;
    return this;
  }

  /**
   * Box 5a, Commodity Credit Corporation (CCC) loans reported under election
   * @return cccLoans
  */
  @ApiModelProperty(value = "Box 5a, Commodity Credit Corporation (CCC) loans reported under election")


  public Double getCccLoans() {
    return cccLoans;
  }

  public void setCccLoans(Double cccLoans) {
    this.cccLoans = cccLoans;
  }

  public FarmIncomeStatementAllOf cropInsuranceProceeds(Double cropInsuranceProceeds) {
    this.cropInsuranceProceeds = cropInsuranceProceeds;
    return this;
  }

  /**
   * Box 6a, Crop insurance proceeds and federal crop disaster payments
   * @return cropInsuranceProceeds
  */
  @ApiModelProperty(value = "Box 6a, Crop insurance proceeds and federal crop disaster payments")


  public Double getCropInsuranceProceeds() {
    return cropInsuranceProceeds;
  }

  public void setCropInsuranceProceeds(Double cropInsuranceProceeds) {
    this.cropInsuranceProceeds = cropInsuranceProceeds;
  }

  public FarmIncomeStatementAllOf customHireIncome(Double customHireIncome) {
    this.customHireIncome = customHireIncome;
    return this;
  }

  /**
   * Box 7, Custom hire (machine work) income
   * @return customHireIncome
  */
  @ApiModelProperty(value = "Box 7, Custom hire (machine work) income")


  public Double getCustomHireIncome() {
    return customHireIncome;
  }

  public void setCustomHireIncome(Double customHireIncome) {
    this.customHireIncome = customHireIncome;
  }

  public FarmIncomeStatementAllOf otherIncome(List<DescriptionAmount> otherIncome) {
    this.otherIncome = otherIncome;
    return this;
  }

  public FarmIncomeStatementAllOf addOtherIncomeItem(DescriptionAmount otherIncomeItem) {
    if (this.otherIncome == null) {
      this.otherIncome = new ArrayList<>();
    }
    this.otherIncome.add(otherIncomeItem);
    return this;
  }

  /**
   * Box 8, Other income
   * @return otherIncome
  */
  @ApiModelProperty(value = "Box 8, Other income")

  @Valid

  public List<DescriptionAmount> getOtherIncome() {
    return otherIncome;
  }

  public void setOtherIncome(List<DescriptionAmount> otherIncome) {
    this.otherIncome = otherIncome;
  }

  public FarmIncomeStatementAllOf carAndTruck(Double carAndTruck) {
    this.carAndTruck = carAndTruck;
    return this;
  }

  /**
   * Box 10, Car and truck expenses
   * @return carAndTruck
  */
  @ApiModelProperty(value = "Box 10, Car and truck expenses")


  public Double getCarAndTruck() {
    return carAndTruck;
  }

  public void setCarAndTruck(Double carAndTruck) {
    this.carAndTruck = carAndTruck;
  }

  public FarmIncomeStatementAllOf chemicals(Double chemicals) {
    this.chemicals = chemicals;
    return this;
  }

  /**
   * Box 11, Chemicals
   * @return chemicals
  */
  @ApiModelProperty(value = "Box 11, Chemicals")


  public Double getChemicals() {
    return chemicals;
  }

  public void setChemicals(Double chemicals) {
    this.chemicals = chemicals;
  }

  public FarmIncomeStatementAllOf conservation(Double conservation) {
    this.conservation = conservation;
    return this;
  }

  /**
   * Box 12, Conservation expenses
   * @return conservation
  */
  @ApiModelProperty(value = "Box 12, Conservation expenses")


  public Double getConservation() {
    return conservation;
  }

  public void setConservation(Double conservation) {
    this.conservation = conservation;
  }

  public FarmIncomeStatementAllOf customHireExpenses(Double customHireExpenses) {
    this.customHireExpenses = customHireExpenses;
    return this;
  }

  /**
   * Box 13, Custom hire (machine work) 
   * @return customHireExpenses
  */
  @ApiModelProperty(value = "Box 13, Custom hire (machine work) ")


  public Double getCustomHireExpenses() {
    return customHireExpenses;
  }

  public void setCustomHireExpenses(Double customHireExpenses) {
    this.customHireExpenses = customHireExpenses;
  }

  public FarmIncomeStatementAllOf depreciation(Double depreciation) {
    this.depreciation = depreciation;
    return this;
  }

  /**
   * Box 14, Depreciation
   * @return depreciation
  */
  @ApiModelProperty(value = "Box 14, Depreciation")


  public Double getDepreciation() {
    return depreciation;
  }

  public void setDepreciation(Double depreciation) {
    this.depreciation = depreciation;
  }

  public FarmIncomeStatementAllOf employeeBenefitPrograms(Double employeeBenefitPrograms) {
    this.employeeBenefitPrograms = employeeBenefitPrograms;
    return this;
  }

  /**
   * Box 15, Employee benefit programs
   * @return employeeBenefitPrograms
  */
  @ApiModelProperty(value = "Box 15, Employee benefit programs")


  public Double getEmployeeBenefitPrograms() {
    return employeeBenefitPrograms;
  }

  public void setEmployeeBenefitPrograms(Double employeeBenefitPrograms) {
    this.employeeBenefitPrograms = employeeBenefitPrograms;
  }

  public FarmIncomeStatementAllOf feed(Double feed) {
    this.feed = feed;
    return this;
  }

  /**
   * Box 16, Feed
   * @return feed
  */
  @ApiModelProperty(value = "Box 16, Feed")


  public Double getFeed() {
    return feed;
  }

  public void setFeed(Double feed) {
    this.feed = feed;
  }

  public FarmIncomeStatementAllOf fertilizers(Double fertilizers) {
    this.fertilizers = fertilizers;
    return this;
  }

  /**
   * Box 17, Fertilizers and lime
   * @return fertilizers
  */
  @ApiModelProperty(value = "Box 17, Fertilizers and lime")


  public Double getFertilizers() {
    return fertilizers;
  }

  public void setFertilizers(Double fertilizers) {
    this.fertilizers = fertilizers;
  }

  public FarmIncomeStatementAllOf freight(Double freight) {
    this.freight = freight;
    return this;
  }

  /**
   * Box 18, Freight and trucking
   * @return freight
  */
  @ApiModelProperty(value = "Box 18, Freight and trucking")


  public Double getFreight() {
    return freight;
  }

  public void setFreight(Double freight) {
    this.freight = freight;
  }

  public FarmIncomeStatementAllOf fuel(Double fuel) {
    this.fuel = fuel;
    return this;
  }

  /**
   * Box 19, Gasoline, fuel, and oil
   * @return fuel
  */
  @ApiModelProperty(value = "Box 19, Gasoline, fuel, and oil")


  public Double getFuel() {
    return fuel;
  }

  public void setFuel(Double fuel) {
    this.fuel = fuel;
  }

  public FarmIncomeStatementAllOf insurance(Double insurance) {
    this.insurance = insurance;
    return this;
  }

  /**
   * Box 20, Insurance (other than health)
   * @return insurance
  */
  @ApiModelProperty(value = "Box 20, Insurance (other than health)")


  public Double getInsurance() {
    return insurance;
  }

  public void setInsurance(Double insurance) {
    this.insurance = insurance;
  }

  public FarmIncomeStatementAllOf mortgageInterest(Double mortgageInterest) {
    this.mortgageInterest = mortgageInterest;
    return this;
  }

  /**
   * Box 21a, Mortgage Interest
   * @return mortgageInterest
  */
  @ApiModelProperty(value = "Box 21a, Mortgage Interest")


  public Double getMortgageInterest() {
    return mortgageInterest;
  }

  public void setMortgageInterest(Double mortgageInterest) {
    this.mortgageInterest = mortgageInterest;
  }

  public FarmIncomeStatementAllOf otherInterest(Double otherInterest) {
    this.otherInterest = otherInterest;
    return this;
  }

  /**
   * Box 21b, Other interest
   * @return otherInterest
  */
  @ApiModelProperty(value = "Box 21b, Other interest")


  public Double getOtherInterest() {
    return otherInterest;
  }

  public void setOtherInterest(Double otherInterest) {
    this.otherInterest = otherInterest;
  }

  public FarmIncomeStatementAllOf laborHired(Double laborHired) {
    this.laborHired = laborHired;
    return this;
  }

  /**
   * Box 22, Labor hired
   * @return laborHired
  */
  @ApiModelProperty(value = "Box 22, Labor hired")


  public Double getLaborHired() {
    return laborHired;
  }

  public void setLaborHired(Double laborHired) {
    this.laborHired = laborHired;
  }

  public FarmIncomeStatementAllOf pension(Double pension) {
    this.pension = pension;
    return this;
  }

  /**
   * Box 23, Pension and profit-sharing plans
   * @return pension
  */
  @ApiModelProperty(value = "Box 23, Pension and profit-sharing plans")


  public Double getPension() {
    return pension;
  }

  public void setPension(Double pension) {
    this.pension = pension;
  }

  public FarmIncomeStatementAllOf equipmentRent(Double equipmentRent) {
    this.equipmentRent = equipmentRent;
    return this;
  }

  /**
   * Box 24a, Rent or lease: Vehicles, machinery, equipment
   * @return equipmentRent
  */
  @ApiModelProperty(value = "Box 24a, Rent or lease: Vehicles, machinery, equipment")


  public Double getEquipmentRent() {
    return equipmentRent;
  }

  public void setEquipmentRent(Double equipmentRent) {
    this.equipmentRent = equipmentRent;
  }

  public FarmIncomeStatementAllOf otherRent(Double otherRent) {
    this.otherRent = otherRent;
    return this;
  }

  /**
   * Box 24b, Rent or lease: Other
   * @return otherRent
  */
  @ApiModelProperty(value = "Box 24b, Rent or lease: Other")


  public Double getOtherRent() {
    return otherRent;
  }

  public void setOtherRent(Double otherRent) {
    this.otherRent = otherRent;
  }

  public FarmIncomeStatementAllOf repairs(Double repairs) {
    this.repairs = repairs;
    return this;
  }

  /**
   * Box 25, Repairs and maintenance
   * @return repairs
  */
  @ApiModelProperty(value = "Box 25, Repairs and maintenance")


  public Double getRepairs() {
    return repairs;
  }

  public void setRepairs(Double repairs) {
    this.repairs = repairs;
  }

  public FarmIncomeStatementAllOf seeds(Double seeds) {
    this.seeds = seeds;
    return this;
  }

  /**
   * Box 26, Seeds and plants
   * @return seeds
  */
  @ApiModelProperty(value = "Box 26, Seeds and plants")


  public Double getSeeds() {
    return seeds;
  }

  public void setSeeds(Double seeds) {
    this.seeds = seeds;
  }

  public FarmIncomeStatementAllOf storage(Double storage) {
    this.storage = storage;
    return this;
  }

  /**
   * Box 27, Storage and warehousing
   * @return storage
  */
  @ApiModelProperty(value = "Box 27, Storage and warehousing")


  public Double getStorage() {
    return storage;
  }

  public void setStorage(Double storage) {
    this.storage = storage;
  }

  public FarmIncomeStatementAllOf supplies(Double supplies) {
    this.supplies = supplies;
    return this;
  }

  /**
   * Box 28, Supplies
   * @return supplies
  */
  @ApiModelProperty(value = "Box 28, Supplies")


  public Double getSupplies() {
    return supplies;
  }

  public void setSupplies(Double supplies) {
    this.supplies = supplies;
  }

  public FarmIncomeStatementAllOf taxes(Double taxes) {
    this.taxes = taxes;
    return this;
  }

  /**
   * Box 29, Taxes
   * @return taxes
  */
  @ApiModelProperty(value = "Box 29, Taxes")


  public Double getTaxes() {
    return taxes;
  }

  public void setTaxes(Double taxes) {
    this.taxes = taxes;
  }

  public FarmIncomeStatementAllOf utilities(Double utilities) {
    this.utilities = utilities;
    return this;
  }

  /**
   * Box 30, Utilities
   * @return utilities
  */
  @ApiModelProperty(value = "Box 30, Utilities")


  public Double getUtilities() {
    return utilities;
  }

  public void setUtilities(Double utilities) {
    this.utilities = utilities;
  }

  public FarmIncomeStatementAllOf veterinary(Double veterinary) {
    this.veterinary = veterinary;
    return this;
  }

  /**
   * Box 31, Veterinary, breeding, and medicine
   * @return veterinary
  */
  @ApiModelProperty(value = "Box 31, Veterinary, breeding, and medicine")


  public Double getVeterinary() {
    return veterinary;
  }

  public void setVeterinary(Double veterinary) {
    this.veterinary = veterinary;
  }

  public FarmIncomeStatementAllOf otherExpenses(List<DescriptionAmount> otherExpenses) {
    this.otherExpenses = otherExpenses;
    return this;
  }

  public FarmIncomeStatementAllOf addOtherExpensesItem(DescriptionAmount otherExpensesItem) {
    if (this.otherExpenses == null) {
      this.otherExpenses = new ArrayList<>();
    }
    this.otherExpenses.add(otherExpensesItem);
    return this;
  }

  /**
   * Box 32, Other expenses
   * @return otherExpenses
  */
  @ApiModelProperty(value = "Box 32, Other expenses")

  @Valid

  public List<DescriptionAmount> getOtherExpenses() {
    return otherExpenses;
  }

  public void setOtherExpenses(List<DescriptionAmount> otherExpenses) {
    this.otherExpenses = otherExpenses;
  }

  public FarmIncomeStatementAllOf capitalExpenditures(List<DateAmount> capitalExpenditures) {
    this.capitalExpenditures = capitalExpenditures;
    return this;
  }

  public FarmIncomeStatementAllOf addCapitalExpendituresItem(DateAmount capitalExpendituresItem) {
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
    FarmIncomeStatementAllOf farmIncomeStatementAllOf = (FarmIncomeStatementAllOf) o;
    return Objects.equals(this.cropOrActivity, farmIncomeStatementAllOf.cropOrActivity) &&
        Objects.equals(this.sales, farmIncomeStatementAllOf.sales) &&
        Objects.equals(this.costOfItemsSold, farmIncomeStatementAllOf.costOfItemsSold) &&
        Objects.equals(this.salesOfRaised, farmIncomeStatementAllOf.salesOfRaised) &&
        Objects.equals(this.coopDistributions, farmIncomeStatementAllOf.coopDistributions) &&
        Objects.equals(this.agProgramPayments, farmIncomeStatementAllOf.agProgramPayments) &&
        Objects.equals(this.cccLoans, farmIncomeStatementAllOf.cccLoans) &&
        Objects.equals(this.cropInsuranceProceeds, farmIncomeStatementAllOf.cropInsuranceProceeds) &&
        Objects.equals(this.customHireIncome, farmIncomeStatementAllOf.customHireIncome) &&
        Objects.equals(this.otherIncome, farmIncomeStatementAllOf.otherIncome) &&
        Objects.equals(this.carAndTruck, farmIncomeStatementAllOf.carAndTruck) &&
        Objects.equals(this.chemicals, farmIncomeStatementAllOf.chemicals) &&
        Objects.equals(this.conservation, farmIncomeStatementAllOf.conservation) &&
        Objects.equals(this.customHireExpenses, farmIncomeStatementAllOf.customHireExpenses) &&
        Objects.equals(this.depreciation, farmIncomeStatementAllOf.depreciation) &&
        Objects.equals(this.employeeBenefitPrograms, farmIncomeStatementAllOf.employeeBenefitPrograms) &&
        Objects.equals(this.feed, farmIncomeStatementAllOf.feed) &&
        Objects.equals(this.fertilizers, farmIncomeStatementAllOf.fertilizers) &&
        Objects.equals(this.freight, farmIncomeStatementAllOf.freight) &&
        Objects.equals(this.fuel, farmIncomeStatementAllOf.fuel) &&
        Objects.equals(this.insurance, farmIncomeStatementAllOf.insurance) &&
        Objects.equals(this.mortgageInterest, farmIncomeStatementAllOf.mortgageInterest) &&
        Objects.equals(this.otherInterest, farmIncomeStatementAllOf.otherInterest) &&
        Objects.equals(this.laborHired, farmIncomeStatementAllOf.laborHired) &&
        Objects.equals(this.pension, farmIncomeStatementAllOf.pension) &&
        Objects.equals(this.equipmentRent, farmIncomeStatementAllOf.equipmentRent) &&
        Objects.equals(this.otherRent, farmIncomeStatementAllOf.otherRent) &&
        Objects.equals(this.repairs, farmIncomeStatementAllOf.repairs) &&
        Objects.equals(this.seeds, farmIncomeStatementAllOf.seeds) &&
        Objects.equals(this.storage, farmIncomeStatementAllOf.storage) &&
        Objects.equals(this.supplies, farmIncomeStatementAllOf.supplies) &&
        Objects.equals(this.taxes, farmIncomeStatementAllOf.taxes) &&
        Objects.equals(this.utilities, farmIncomeStatementAllOf.utilities) &&
        Objects.equals(this.veterinary, farmIncomeStatementAllOf.veterinary) &&
        Objects.equals(this.otherExpenses, farmIncomeStatementAllOf.otherExpenses) &&
        Objects.equals(this.capitalExpenditures, farmIncomeStatementAllOf.capitalExpenditures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cropOrActivity, sales, costOfItemsSold, salesOfRaised, coopDistributions, agProgramPayments, cccLoans, cropInsuranceProceeds, customHireIncome, otherIncome, carAndTruck, chemicals, conservation, customHireExpenses, depreciation, employeeBenefitPrograms, feed, fertilizers, freight, fuel, insurance, mortgageInterest, otherInterest, laborHired, pension, equipmentRent, otherRent, repairs, seeds, storage, supplies, taxes, utilities, veterinary, otherExpenses, capitalExpenditures);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FarmIncomeStatementAllOf {\n");
    
    sb.append("    cropOrActivity: ").append(toIndentedString(cropOrActivity)).append("\n");
    sb.append("    sales: ").append(toIndentedString(sales)).append("\n");
    sb.append("    costOfItemsSold: ").append(toIndentedString(costOfItemsSold)).append("\n");
    sb.append("    salesOfRaised: ").append(toIndentedString(salesOfRaised)).append("\n");
    sb.append("    coopDistributions: ").append(toIndentedString(coopDistributions)).append("\n");
    sb.append("    agProgramPayments: ").append(toIndentedString(agProgramPayments)).append("\n");
    sb.append("    cccLoans: ").append(toIndentedString(cccLoans)).append("\n");
    sb.append("    cropInsuranceProceeds: ").append(toIndentedString(cropInsuranceProceeds)).append("\n");
    sb.append("    customHireIncome: ").append(toIndentedString(customHireIncome)).append("\n");
    sb.append("    otherIncome: ").append(toIndentedString(otherIncome)).append("\n");
    sb.append("    carAndTruck: ").append(toIndentedString(carAndTruck)).append("\n");
    sb.append("    chemicals: ").append(toIndentedString(chemicals)).append("\n");
    sb.append("    conservation: ").append(toIndentedString(conservation)).append("\n");
    sb.append("    customHireExpenses: ").append(toIndentedString(customHireExpenses)).append("\n");
    sb.append("    depreciation: ").append(toIndentedString(depreciation)).append("\n");
    sb.append("    employeeBenefitPrograms: ").append(toIndentedString(employeeBenefitPrograms)).append("\n");
    sb.append("    feed: ").append(toIndentedString(feed)).append("\n");
    sb.append("    fertilizers: ").append(toIndentedString(fertilizers)).append("\n");
    sb.append("    freight: ").append(toIndentedString(freight)).append("\n");
    sb.append("    fuel: ").append(toIndentedString(fuel)).append("\n");
    sb.append("    insurance: ").append(toIndentedString(insurance)).append("\n");
    sb.append("    mortgageInterest: ").append(toIndentedString(mortgageInterest)).append("\n");
    sb.append("    otherInterest: ").append(toIndentedString(otherInterest)).append("\n");
    sb.append("    laborHired: ").append(toIndentedString(laborHired)).append("\n");
    sb.append("    pension: ").append(toIndentedString(pension)).append("\n");
    sb.append("    equipmentRent: ").append(toIndentedString(equipmentRent)).append("\n");
    sb.append("    otherRent: ").append(toIndentedString(otherRent)).append("\n");
    sb.append("    repairs: ").append(toIndentedString(repairs)).append("\n");
    sb.append("    seeds: ").append(toIndentedString(seeds)).append("\n");
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
    sb.append("    supplies: ").append(toIndentedString(supplies)).append("\n");
    sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
    sb.append("    utilities: ").append(toIndentedString(utilities)).append("\n");
    sb.append("    veterinary: ").append(toIndentedString(veterinary)).append("\n");
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

