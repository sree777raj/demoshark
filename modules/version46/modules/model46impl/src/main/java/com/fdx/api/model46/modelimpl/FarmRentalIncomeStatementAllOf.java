package com.fdx.api.model46.modelimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * FarmRentalIncomeStatementAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class FarmRentalIncomeStatementAllOf   {
  @JsonProperty("incomeFromProduction")
  private Double incomeFromProduction;

  @JsonProperty("coopDistributions")
  private Double coopDistributions;

  @JsonProperty("agProgramPayments")
  private Double agProgramPayments;

  @JsonProperty("cccLoans")
  private Double cccLoans;

  @JsonProperty("cropInsuranceProceeds")
  private Double cropInsuranceProceeds;

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

  public FarmRentalIncomeStatementAllOf incomeFromProduction(Double incomeFromProduction) {
    this.incomeFromProduction = incomeFromProduction;
    return this;
  }

  /**
   * Box 1, Income from production of livestock, produce, grains, and other crops
   * @return incomeFromProduction
  */
  @ApiModelProperty(value = "Box 1, Income from production of livestock, produce, grains, and other crops")


  public Double getIncomeFromProduction() {
    return incomeFromProduction;
  }

  public void setIncomeFromProduction(Double incomeFromProduction) {
    this.incomeFromProduction = incomeFromProduction;
  }

  public FarmRentalIncomeStatementAllOf coopDistributions(Double coopDistributions) {
    this.coopDistributions = coopDistributions;
    return this;
  }

  /**
   * Box 2a, Cooperative distributions
   * @return coopDistributions
  */
  @ApiModelProperty(value = "Box 2a, Cooperative distributions")


  public Double getCoopDistributions() {
    return coopDistributions;
  }

  public void setCoopDistributions(Double coopDistributions) {
    this.coopDistributions = coopDistributions;
  }

  public FarmRentalIncomeStatementAllOf agProgramPayments(Double agProgramPayments) {
    this.agProgramPayments = agProgramPayments;
    return this;
  }

  /**
   * Box 3a, Agricultural program payments
   * @return agProgramPayments
  */
  @ApiModelProperty(value = "Box 3a, Agricultural program payments")


  public Double getAgProgramPayments() {
    return agProgramPayments;
  }

  public void setAgProgramPayments(Double agProgramPayments) {
    this.agProgramPayments = agProgramPayments;
  }

  public FarmRentalIncomeStatementAllOf cccLoans(Double cccLoans) {
    this.cccLoans = cccLoans;
    return this;
  }

  /**
   * Box 4a, Commodity Credit Corporation (CCC) loans reported under election
   * @return cccLoans
  */
  @ApiModelProperty(value = "Box 4a, Commodity Credit Corporation (CCC) loans reported under election")


  public Double getCccLoans() {
    return cccLoans;
  }

  public void setCccLoans(Double cccLoans) {
    this.cccLoans = cccLoans;
  }

  public FarmRentalIncomeStatementAllOf cropInsuranceProceeds(Double cropInsuranceProceeds) {
    this.cropInsuranceProceeds = cropInsuranceProceeds;
    return this;
  }

  /**
   * Box 5a, Crop insurance proceeds and federal crop disaster payments
   * @return cropInsuranceProceeds
  */
  @ApiModelProperty(value = "Box 5a, Crop insurance proceeds and federal crop disaster payments")


  public Double getCropInsuranceProceeds() {
    return cropInsuranceProceeds;
  }

  public void setCropInsuranceProceeds(Double cropInsuranceProceeds) {
    this.cropInsuranceProceeds = cropInsuranceProceeds;
  }

  public FarmRentalIncomeStatementAllOf otherIncome(List<DescriptionAmount> otherIncome) {
    this.otherIncome = otherIncome;
    return this;
  }

  public FarmRentalIncomeStatementAllOf addOtherIncomeItem(DescriptionAmount otherIncomeItem) {
    if (this.otherIncome == null) {
      this.otherIncome = new ArrayList<>();
    }
    this.otherIncome.add(otherIncomeItem);
    return this;
  }

  /**
   * Box 6, Other income
   * @return otherIncome
  */
  @ApiModelProperty(value = "Box 6, Other income")

  @Valid

  public List<DescriptionAmount> getOtherIncome() {
    return otherIncome;
  }

  public void setOtherIncome(List<DescriptionAmount> otherIncome) {
    this.otherIncome = otherIncome;
  }

  public FarmRentalIncomeStatementAllOf carAndTruck(Double carAndTruck) {
    this.carAndTruck = carAndTruck;
    return this;
  }

  /**
   * Box 8, Car and truck expenses
   * @return carAndTruck
  */
  @ApiModelProperty(value = "Box 8, Car and truck expenses")


  public Double getCarAndTruck() {
    return carAndTruck;
  }

  public void setCarAndTruck(Double carAndTruck) {
    this.carAndTruck = carAndTruck;
  }

  public FarmRentalIncomeStatementAllOf chemicals(Double chemicals) {
    this.chemicals = chemicals;
    return this;
  }

  /**
   * Box 9, Chemicals
   * @return chemicals
  */
  @ApiModelProperty(value = "Box 9, Chemicals")


  public Double getChemicals() {
    return chemicals;
  }

  public void setChemicals(Double chemicals) {
    this.chemicals = chemicals;
  }

  public FarmRentalIncomeStatementAllOf conservation(Double conservation) {
    this.conservation = conservation;
    return this;
  }

  /**
   * Box 10, Conservation expenses
   * @return conservation
  */
  @ApiModelProperty(value = "Box 10, Conservation expenses")


  public Double getConservation() {
    return conservation;
  }

  public void setConservation(Double conservation) {
    this.conservation = conservation;
  }

  public FarmRentalIncomeStatementAllOf customHireExpenses(Double customHireExpenses) {
    this.customHireExpenses = customHireExpenses;
    return this;
  }

  /**
   * Box 11, Custom hire (machine work) 
   * @return customHireExpenses
  */
  @ApiModelProperty(value = "Box 11, Custom hire (machine work) ")


  public Double getCustomHireExpenses() {
    return customHireExpenses;
  }

  public void setCustomHireExpenses(Double customHireExpenses) {
    this.customHireExpenses = customHireExpenses;
  }

  public FarmRentalIncomeStatementAllOf depreciation(Double depreciation) {
    this.depreciation = depreciation;
    return this;
  }

  /**
   * Box 12, Depreciation
   * @return depreciation
  */
  @ApiModelProperty(value = "Box 12, Depreciation")


  public Double getDepreciation() {
    return depreciation;
  }

  public void setDepreciation(Double depreciation) {
    this.depreciation = depreciation;
  }

  public FarmRentalIncomeStatementAllOf employeeBenefitPrograms(Double employeeBenefitPrograms) {
    this.employeeBenefitPrograms = employeeBenefitPrograms;
    return this;
  }

  /**
   * Box 13, Employee benefit programs
   * @return employeeBenefitPrograms
  */
  @ApiModelProperty(value = "Box 13, Employee benefit programs")


  public Double getEmployeeBenefitPrograms() {
    return employeeBenefitPrograms;
  }

  public void setEmployeeBenefitPrograms(Double employeeBenefitPrograms) {
    this.employeeBenefitPrograms = employeeBenefitPrograms;
  }

  public FarmRentalIncomeStatementAllOf feed(Double feed) {
    this.feed = feed;
    return this;
  }

  /**
   * Box 14, Feed
   * @return feed
  */
  @ApiModelProperty(value = "Box 14, Feed")


  public Double getFeed() {
    return feed;
  }

  public void setFeed(Double feed) {
    this.feed = feed;
  }

  public FarmRentalIncomeStatementAllOf fertilizers(Double fertilizers) {
    this.fertilizers = fertilizers;
    return this;
  }

  /**
   * Box 15, Fertilizers and lime
   * @return fertilizers
  */
  @ApiModelProperty(value = "Box 15, Fertilizers and lime")


  public Double getFertilizers() {
    return fertilizers;
  }

  public void setFertilizers(Double fertilizers) {
    this.fertilizers = fertilizers;
  }

  public FarmRentalIncomeStatementAllOf freight(Double freight) {
    this.freight = freight;
    return this;
  }

  /**
   * Box 16, Freight and trucking
   * @return freight
  */
  @ApiModelProperty(value = "Box 16, Freight and trucking")


  public Double getFreight() {
    return freight;
  }

  public void setFreight(Double freight) {
    this.freight = freight;
  }

  public FarmRentalIncomeStatementAllOf fuel(Double fuel) {
    this.fuel = fuel;
    return this;
  }

  /**
   * Box 17, Gasoline, fuel, and oil
   * @return fuel
  */
  @ApiModelProperty(value = "Box 17, Gasoline, fuel, and oil")


  public Double getFuel() {
    return fuel;
  }

  public void setFuel(Double fuel) {
    this.fuel = fuel;
  }

  public FarmRentalIncomeStatementAllOf insurance(Double insurance) {
    this.insurance = insurance;
    return this;
  }

  /**
   * Box 18, Insurance (other than health)
   * @return insurance
  */
  @ApiModelProperty(value = "Box 18, Insurance (other than health)")


  public Double getInsurance() {
    return insurance;
  }

  public void setInsurance(Double insurance) {
    this.insurance = insurance;
  }

  public FarmRentalIncomeStatementAllOf mortgageInterest(Double mortgageInterest) {
    this.mortgageInterest = mortgageInterest;
    return this;
  }

  /**
   * Box 19a, Mortgage Interest
   * @return mortgageInterest
  */
  @ApiModelProperty(value = "Box 19a, Mortgage Interest")


  public Double getMortgageInterest() {
    return mortgageInterest;
  }

  public void setMortgageInterest(Double mortgageInterest) {
    this.mortgageInterest = mortgageInterest;
  }

  public FarmRentalIncomeStatementAllOf otherInterest(Double otherInterest) {
    this.otherInterest = otherInterest;
    return this;
  }

  /**
   * Box 19b, Other interest
   * @return otherInterest
  */
  @ApiModelProperty(value = "Box 19b, Other interest")


  public Double getOtherInterest() {
    return otherInterest;
  }

  public void setOtherInterest(Double otherInterest) {
    this.otherInterest = otherInterest;
  }

  public FarmRentalIncomeStatementAllOf laborHired(Double laborHired) {
    this.laborHired = laborHired;
    return this;
  }

  /**
   * Box 20, Labor hired
   * @return laborHired
  */
  @ApiModelProperty(value = "Box 20, Labor hired")


  public Double getLaborHired() {
    return laborHired;
  }

  public void setLaborHired(Double laborHired) {
    this.laborHired = laborHired;
  }

  public FarmRentalIncomeStatementAllOf pension(Double pension) {
    this.pension = pension;
    return this;
  }

  /**
   * Box 21, Pension and profit-sharing plans
   * @return pension
  */
  @ApiModelProperty(value = "Box 21, Pension and profit-sharing plans")


  public Double getPension() {
    return pension;
  }

  public void setPension(Double pension) {
    this.pension = pension;
  }

  public FarmRentalIncomeStatementAllOf equipmentRent(Double equipmentRent) {
    this.equipmentRent = equipmentRent;
    return this;
  }

  /**
   * Box 22a, Rent or lease: Vehicles, machinery, equipment
   * @return equipmentRent
  */
  @ApiModelProperty(value = "Box 22a, Rent or lease: Vehicles, machinery, equipment")


  public Double getEquipmentRent() {
    return equipmentRent;
  }

  public void setEquipmentRent(Double equipmentRent) {
    this.equipmentRent = equipmentRent;
  }

  public FarmRentalIncomeStatementAllOf otherRent(Double otherRent) {
    this.otherRent = otherRent;
    return this;
  }

  /**
   * Box 22b, Rent or lease: Other
   * @return otherRent
  */
  @ApiModelProperty(value = "Box 22b, Rent or lease: Other")


  public Double getOtherRent() {
    return otherRent;
  }

  public void setOtherRent(Double otherRent) {
    this.otherRent = otherRent;
  }

  public FarmRentalIncomeStatementAllOf repairs(Double repairs) {
    this.repairs = repairs;
    return this;
  }

  /**
   * Box 23, Repairs and maintenance
   * @return repairs
  */
  @ApiModelProperty(value = "Box 23, Repairs and maintenance")


  public Double getRepairs() {
    return repairs;
  }

  public void setRepairs(Double repairs) {
    this.repairs = repairs;
  }

  public FarmRentalIncomeStatementAllOf seeds(Double seeds) {
    this.seeds = seeds;
    return this;
  }

  /**
   * Box 24, Seeds and plants
   * @return seeds
  */
  @ApiModelProperty(value = "Box 24, Seeds and plants")


  public Double getSeeds() {
    return seeds;
  }

  public void setSeeds(Double seeds) {
    this.seeds = seeds;
  }

  public FarmRentalIncomeStatementAllOf storage(Double storage) {
    this.storage = storage;
    return this;
  }

  /**
   * Box 25, Storage and warehousing
   * @return storage
  */
  @ApiModelProperty(value = "Box 25, Storage and warehousing")


  public Double getStorage() {
    return storage;
  }

  public void setStorage(Double storage) {
    this.storage = storage;
  }

  public FarmRentalIncomeStatementAllOf supplies(Double supplies) {
    this.supplies = supplies;
    return this;
  }

  /**
   * Box 26, Supplies
   * @return supplies
  */
  @ApiModelProperty(value = "Box 26, Supplies")


  public Double getSupplies() {
    return supplies;
  }

  public void setSupplies(Double supplies) {
    this.supplies = supplies;
  }

  public FarmRentalIncomeStatementAllOf taxes(Double taxes) {
    this.taxes = taxes;
    return this;
  }

  /**
   * Box 27, Taxes
   * @return taxes
  */
  @ApiModelProperty(value = "Box 27, Taxes")


  public Double getTaxes() {
    return taxes;
  }

  public void setTaxes(Double taxes) {
    this.taxes = taxes;
  }

  public FarmRentalIncomeStatementAllOf utilities(Double utilities) {
    this.utilities = utilities;
    return this;
  }

  /**
   * Box 28, Utilities
   * @return utilities
  */
  @ApiModelProperty(value = "Box 28, Utilities")


  public Double getUtilities() {
    return utilities;
  }

  public void setUtilities(Double utilities) {
    this.utilities = utilities;
  }

  public FarmRentalIncomeStatementAllOf veterinary(Double veterinary) {
    this.veterinary = veterinary;
    return this;
  }

  /**
   * Box 29, Veterinary, breeding, and medicine
   * @return veterinary
  */
  @ApiModelProperty(value = "Box 29, Veterinary, breeding, and medicine")


  public Double getVeterinary() {
    return veterinary;
  }

  public void setVeterinary(Double veterinary) {
    this.veterinary = veterinary;
  }

  public FarmRentalIncomeStatementAllOf otherExpenses(List<DescriptionAmount> otherExpenses) {
    this.otherExpenses = otherExpenses;
    return this;
  }

  public FarmRentalIncomeStatementAllOf addOtherExpensesItem(DescriptionAmount otherExpensesItem) {
    if (this.otherExpenses == null) {
      this.otherExpenses = new ArrayList<>();
    }
    this.otherExpenses.add(otherExpensesItem);
    return this;
  }

  /**
   * Box 30, Other expenses
   * @return otherExpenses
  */
  @ApiModelProperty(value = "Box 30, Other expenses")

  @Valid

  public List<DescriptionAmount> getOtherExpenses() {
    return otherExpenses;
  }

  public void setOtherExpenses(List<DescriptionAmount> otherExpenses) {
    this.otherExpenses = otherExpenses;
  }

  public FarmRentalIncomeStatementAllOf capitalExpenditures(List<DateAmount> capitalExpenditures) {
    this.capitalExpenditures = capitalExpenditures;
    return this;
  }

  public FarmRentalIncomeStatementAllOf addCapitalExpendituresItem(DateAmount capitalExpendituresItem) {
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
    FarmRentalIncomeStatementAllOf farmRentalIncomeStatementAllOf = (FarmRentalIncomeStatementAllOf) o;
    return Objects.equals(this.incomeFromProduction, farmRentalIncomeStatementAllOf.incomeFromProduction) &&
        Objects.equals(this.coopDistributions, farmRentalIncomeStatementAllOf.coopDistributions) &&
        Objects.equals(this.agProgramPayments, farmRentalIncomeStatementAllOf.agProgramPayments) &&
        Objects.equals(this.cccLoans, farmRentalIncomeStatementAllOf.cccLoans) &&
        Objects.equals(this.cropInsuranceProceeds, farmRentalIncomeStatementAllOf.cropInsuranceProceeds) &&
        Objects.equals(this.otherIncome, farmRentalIncomeStatementAllOf.otherIncome) &&
        Objects.equals(this.carAndTruck, farmRentalIncomeStatementAllOf.carAndTruck) &&
        Objects.equals(this.chemicals, farmRentalIncomeStatementAllOf.chemicals) &&
        Objects.equals(this.conservation, farmRentalIncomeStatementAllOf.conservation) &&
        Objects.equals(this.customHireExpenses, farmRentalIncomeStatementAllOf.customHireExpenses) &&
        Objects.equals(this.depreciation, farmRentalIncomeStatementAllOf.depreciation) &&
        Objects.equals(this.employeeBenefitPrograms, farmRentalIncomeStatementAllOf.employeeBenefitPrograms) &&
        Objects.equals(this.feed, farmRentalIncomeStatementAllOf.feed) &&
        Objects.equals(this.fertilizers, farmRentalIncomeStatementAllOf.fertilizers) &&
        Objects.equals(this.freight, farmRentalIncomeStatementAllOf.freight) &&
        Objects.equals(this.fuel, farmRentalIncomeStatementAllOf.fuel) &&
        Objects.equals(this.insurance, farmRentalIncomeStatementAllOf.insurance) &&
        Objects.equals(this.mortgageInterest, farmRentalIncomeStatementAllOf.mortgageInterest) &&
        Objects.equals(this.otherInterest, farmRentalIncomeStatementAllOf.otherInterest) &&
        Objects.equals(this.laborHired, farmRentalIncomeStatementAllOf.laborHired) &&
        Objects.equals(this.pension, farmRentalIncomeStatementAllOf.pension) &&
        Objects.equals(this.equipmentRent, farmRentalIncomeStatementAllOf.equipmentRent) &&
        Objects.equals(this.otherRent, farmRentalIncomeStatementAllOf.otherRent) &&
        Objects.equals(this.repairs, farmRentalIncomeStatementAllOf.repairs) &&
        Objects.equals(this.seeds, farmRentalIncomeStatementAllOf.seeds) &&
        Objects.equals(this.storage, farmRentalIncomeStatementAllOf.storage) &&
        Objects.equals(this.supplies, farmRentalIncomeStatementAllOf.supplies) &&
        Objects.equals(this.taxes, farmRentalIncomeStatementAllOf.taxes) &&
        Objects.equals(this.utilities, farmRentalIncomeStatementAllOf.utilities) &&
        Objects.equals(this.veterinary, farmRentalIncomeStatementAllOf.veterinary) &&
        Objects.equals(this.otherExpenses, farmRentalIncomeStatementAllOf.otherExpenses) &&
        Objects.equals(this.capitalExpenditures, farmRentalIncomeStatementAllOf.capitalExpenditures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(incomeFromProduction, coopDistributions, agProgramPayments, cccLoans, cropInsuranceProceeds, otherIncome, carAndTruck, chemicals, conservation, customHireExpenses, depreciation, employeeBenefitPrograms, feed, fertilizers, freight, fuel, insurance, mortgageInterest, otherInterest, laborHired, pension, equipmentRent, otherRent, repairs, seeds, storage, supplies, taxes, utilities, veterinary, otherExpenses, capitalExpenditures);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FarmRentalIncomeStatementAllOf {\n");
    
    sb.append("    incomeFromProduction: ").append(toIndentedString(incomeFromProduction)).append("\n");
    sb.append("    coopDistributions: ").append(toIndentedString(coopDistributions)).append("\n");
    sb.append("    agProgramPayments: ").append(toIndentedString(agProgramPayments)).append("\n");
    sb.append("    cccLoans: ").append(toIndentedString(cccLoans)).append("\n");
    sb.append("    cropInsuranceProceeds: ").append(toIndentedString(cropInsuranceProceeds)).append("\n");
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

