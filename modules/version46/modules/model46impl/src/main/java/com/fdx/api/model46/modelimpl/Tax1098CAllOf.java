package com.fdx.api.model46.modelimpl;

import java.time.LocalDate;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.fasterxml.jackson.annotation.OptBoolean;
import io.swagger.annotations.ApiModelProperty;

/**
 * Tax1098CAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1098CAllOf   {
  @JsonProperty("doneeNameAddress")
  private NameAddressPhone doneeNameAddress;

  @JsonProperty("doneeTin")
  private String doneeTin;

  @JsonProperty("donorTin")
  private String donorTin;

  @JsonProperty("donorNameAddress")
  private NameAddress donorNameAddress;

  @JsonProperty("dateOfContribution")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
  private LocalDate dateOfContribution;

  @JsonProperty("odometerMileage")
  private Integer odometerMileage;

  @JsonProperty("carYear")
  private Integer carYear;

  @JsonProperty("make")
  private String make;

  @JsonProperty("model")
  private String model;

  @JsonProperty("vin")
  private String vin;

  @JsonProperty("armsLengthTransaction")
  @JsonInclude(Include.NON_NULL)
private Boolean armsLengthTransaction;

  @JsonProperty("dateOfSale")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
  private LocalDate dateOfSale;

  @JsonProperty("grossProceeds")
  private Double grossProceeds;

  @JsonProperty("notTransferredBefore")
  @JsonInclude(Include.NON_NULL)
private Boolean notTransferredBefore;

  @JsonProperty("needyIndividual")
  @JsonInclude(Include.NON_NULL)
private Boolean needyIndividual;

  @JsonProperty("descriptionOfImprovements")
  private String descriptionOfImprovements;

  @JsonProperty("goodsInExchange")
  @JsonInclude(Include.NON_NULL)
private Boolean goodsInExchange;

  @JsonProperty("valueOfExchange")
  private Double valueOfExchange;

  @JsonProperty("intangibleReligious")
  @JsonInclude(Include.NON_NULL)
private Boolean intangibleReligious;

  @JsonProperty("descriptionOfGoods")
  private String descriptionOfGoods;

  @JsonProperty("maxDeductionApplies")
  @JsonInclude(Include.NON_NULL)
private Boolean maxDeductionApplies;

  public Tax1098CAllOf doneeNameAddress(NameAddressPhone doneeNameAddress) {
    this.doneeNameAddress = doneeNameAddress;
    return this;
  }

  /**
   * Get doneeNameAddress
   * @return doneeNameAddress
  */
  @ApiModelProperty(value = "")

  @Valid

  public NameAddressPhone getDoneeNameAddress() {
    return doneeNameAddress;
  }

  public void setDoneeNameAddress(NameAddressPhone doneeNameAddress) {
    this.doneeNameAddress = doneeNameAddress;
  }

  public Tax1098CAllOf doneeTin(String doneeTin) {
    this.doneeTin = doneeTin;
    return this;
  }

  /**
   * DONEE'S TIN
   * @return doneeTin
  */
  @ApiModelProperty(value = "DONEE'S TIN")


  public String getDoneeTin() {
    return doneeTin;
  }

  public void setDoneeTin(String doneeTin) {
    this.doneeTin = doneeTin;
  }

  public Tax1098CAllOf donorTin(String donorTin) {
    this.donorTin = donorTin;
    return this;
  }

  /**
   * DONOR'S TIN
   * @return donorTin
  */
  @ApiModelProperty(value = "DONOR'S TIN")


  public String getDonorTin() {
    return donorTin;
  }

  public void setDonorTin(String donorTin) {
    this.donorTin = donorTin;
  }

  public Tax1098CAllOf donorNameAddress(NameAddress donorNameAddress) {
    this.donorNameAddress = donorNameAddress;
    return this;
  }

  /**
   * Get donorNameAddress
   * @return donorNameAddress
  */
  @ApiModelProperty(value = "")

  @Valid

  public NameAddress getDonorNameAddress() {
    return donorNameAddress;
  }

  public void setDonorNameAddress(NameAddress donorNameAddress) {
    this.donorNameAddress = donorNameAddress;
  }

  public Tax1098CAllOf dateOfContribution(LocalDate dateOfContribution) {
    this.dateOfContribution = dateOfContribution;
    return this;
  }

  /**
   * ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included according to [IETF RFC3339] (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)
   * @return dateOfContribution
  */
  @ApiModelProperty(value = "ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included according to [IETF RFC3339] (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)")

  @Valid
@Size(max=10) 
  public LocalDate getDateOfContribution() {
    return dateOfContribution;
  }

  public void setDateOfContribution(LocalDate dateOfContribution) {
    this.dateOfContribution = dateOfContribution;
  }

  public Tax1098CAllOf odometerMileage(Integer odometerMileage) {
    this.odometerMileage = odometerMileage;
    return this;
  }

  /**
   * Box 2a, Odometer mileage
   * @return odometerMileage
  */
  @ApiModelProperty(value = "Box 2a, Odometer mileage")


  public Integer getOdometerMileage() {
    return odometerMileage;
  }

  public void setOdometerMileage(Integer odometerMileage) {
    this.odometerMileage = odometerMileage;
  }

  public Tax1098CAllOf carYear(Integer carYear) {
    this.carYear = carYear;
    return this;
  }

  /**
   * Box 2b, Year
   * @return carYear
  */
  @ApiModelProperty(value = "Box 2b, Year")


  public Integer getCarYear() {
    return carYear;
  }

  public void setCarYear(Integer carYear) {
    this.carYear = carYear;
  }

  public Tax1098CAllOf make(String make) {
    this.make = make;
    return this;
  }

  /**
   * Box 2c, Make
   * @return make
  */
  @ApiModelProperty(value = "Box 2c, Make")


  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public Tax1098CAllOf model(String model) {
    this.model = model;
    return this;
  }

  /**
   * Box 2d, Model
   * @return model
  */
  @ApiModelProperty(value = "Box 2d, Model")


  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public Tax1098CAllOf vin(String vin) {
    this.vin = vin;
    return this;
  }

  /**
   * Box 3, Vehicle or other identification number
   * @return vin
  */
  @ApiModelProperty(value = "Box 3, Vehicle or other identification number")


  public String getVin() {
    return vin;
  }

  public void setVin(String vin) {
    this.vin = vin;
  }

  public Tax1098CAllOf armsLengthTransaction(Boolean armsLengthTransaction) {
    this.armsLengthTransaction = armsLengthTransaction;
    return this;
  }

  /**
   * Box 4a, Donee certifies that vehicle was sold in arm's length transaction to unrelated party
   * @return armsLengthTransaction
  */
  @ApiModelProperty(value = "Box 4a, Donee certifies that vehicle was sold in arm's length transaction to unrelated party")


  public Boolean getArmsLengthTransaction() {
    return armsLengthTransaction;
  }

  public void setArmsLengthTransaction(Boolean armsLengthTransaction) {
    this.armsLengthTransaction = armsLengthTransaction;
  }

  public Tax1098CAllOf dateOfSale(LocalDate dateOfSale) {
    this.dateOfSale = dateOfSale;
    return this;
  }

  /**
   * ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included according to [IETF RFC3339] (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)
   * @return dateOfSale
  */
  @ApiModelProperty(value = "ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included according to [IETF RFC3339] (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)")

  @Valid
@Size(max=10) 
  public LocalDate getDateOfSale() {
    return dateOfSale;
  }

  public void setDateOfSale(LocalDate dateOfSale) {
    this.dateOfSale = dateOfSale;
  }

  public Tax1098CAllOf grossProceeds(Double grossProceeds) {
    this.grossProceeds = grossProceeds;
    return this;
  }

  /**
   * Box 4c, Gross proceeds from sale (see instructions)
   * @return grossProceeds
  */
  @ApiModelProperty(value = "Box 4c, Gross proceeds from sale (see instructions)")


  public Double getGrossProceeds() {
    return grossProceeds;
  }

  public void setGrossProceeds(Double grossProceeds) {
    this.grossProceeds = grossProceeds;
  }

  public Tax1098CAllOf notTransferredBefore(Boolean notTransferredBefore) {
    this.notTransferredBefore = notTransferredBefore;
    return this;
  }

  /**
   * Box 5a, Donee certifies that vehicle will not be transferred for money, other property, or services before completion of material improvements or significant intervening use
   * @return notTransferredBefore
  */
  @ApiModelProperty(value = "Box 5a, Donee certifies that vehicle will not be transferred for money, other property, or services before completion of material improvements or significant intervening use")


  public Boolean getNotTransferredBefore() {
    return notTransferredBefore;
  }

  public void setNotTransferredBefore(Boolean notTransferredBefore) {
    this.notTransferredBefore = notTransferredBefore;
  }

  public Tax1098CAllOf needyIndividual(Boolean needyIndividual) {
    this.needyIndividual = needyIndividual;
    return this;
  }

  /**
   * Box 5b, Donee certifies that vehicle is to be transferred to a needy individual for significantly below fair market value in furtherance of donee's charitable purpose
   * @return needyIndividual
  */
  @ApiModelProperty(value = "Box 5b, Donee certifies that vehicle is to be transferred to a needy individual for significantly below fair market value in furtherance of donee's charitable purpose")


  public Boolean getNeedyIndividual() {
    return needyIndividual;
  }

  public void setNeedyIndividual(Boolean needyIndividual) {
    this.needyIndividual = needyIndividual;
  }

  public Tax1098CAllOf descriptionOfImprovements(String descriptionOfImprovements) {
    this.descriptionOfImprovements = descriptionOfImprovements;
    return this;
  }

  /**
   * Box 5c, Donee certifies the following detailed description of material improvements or significant intervening use and duration of use
   * @return descriptionOfImprovements
  */
  @ApiModelProperty(value = "Box 5c, Donee certifies the following detailed description of material improvements or significant intervening use and duration of use")


  public String getDescriptionOfImprovements() {
    return descriptionOfImprovements;
  }

  public void setDescriptionOfImprovements(String descriptionOfImprovements) {
    this.descriptionOfImprovements = descriptionOfImprovements;
  }

  public Tax1098CAllOf goodsInExchange(Boolean goodsInExchange) {
    this.goodsInExchange = goodsInExchange;
    return this;
  }

  /**
   * Box 6a, Did you provide goods or services in exchange for the vehicle? Yes
   * @return goodsInExchange
  */
  @ApiModelProperty(value = "Box 6a, Did you provide goods or services in exchange for the vehicle? Yes")


  public Boolean getGoodsInExchange() {
    return goodsInExchange;
  }

  public void setGoodsInExchange(Boolean goodsInExchange) {
    this.goodsInExchange = goodsInExchange;
  }

  public Tax1098CAllOf valueOfExchange(Double valueOfExchange) {
    this.valueOfExchange = valueOfExchange;
    return this;
  }

  /**
   * Box 6b, Value of goods and services provided in exchange for the vehicle
   * @return valueOfExchange
  */
  @ApiModelProperty(value = "Box 6b, Value of goods and services provided in exchange for the vehicle")


  public Double getValueOfExchange() {
    return valueOfExchange;
  }

  public void setValueOfExchange(Double valueOfExchange) {
    this.valueOfExchange = valueOfExchange;
  }

  public Tax1098CAllOf intangibleReligious(Boolean intangibleReligious) {
    this.intangibleReligious = intangibleReligious;
    return this;
  }

  /**
   * Box 6c, If this box is checked, donee certifies that the goods and services consisted solely of intangible religious benefits
   * @return intangibleReligious
  */
  @ApiModelProperty(value = "Box 6c, If this box is checked, donee certifies that the goods and services consisted solely of intangible religious benefits")


  public Boolean getIntangibleReligious() {
    return intangibleReligious;
  }

  public void setIntangibleReligious(Boolean intangibleReligious) {
    this.intangibleReligious = intangibleReligious;
  }

  public Tax1098CAllOf descriptionOfGoods(String descriptionOfGoods) {
    this.descriptionOfGoods = descriptionOfGoods;
    return this;
  }

  /**
   * Box 6c, Describe the goods and services, if any, that were provided
   * @return descriptionOfGoods
  */
  @ApiModelProperty(value = "Box 6c, Describe the goods and services, if any, that were provided")


  public String getDescriptionOfGoods() {
    return descriptionOfGoods;
  }

  public void setDescriptionOfGoods(String descriptionOfGoods) {
    this.descriptionOfGoods = descriptionOfGoods;
  }

  public Tax1098CAllOf maxDeductionApplies(Boolean maxDeductionApplies) {
    this.maxDeductionApplies = maxDeductionApplies;
    return this;
  }

  /**
   * Box 7, Under the law, the donor may not claim a deduction of more than $500 for this vehicle if this box is checked
   * @return maxDeductionApplies
  */
  @ApiModelProperty(value = "Box 7, Under the law, the donor may not claim a deduction of more than $500 for this vehicle if this box is checked")


  public Boolean getMaxDeductionApplies() {
    return maxDeductionApplies;
  }

  public void setMaxDeductionApplies(Boolean maxDeductionApplies) {
    this.maxDeductionApplies = maxDeductionApplies;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tax1098CAllOf tax1098CAllOf = (Tax1098CAllOf) o;
    return Objects.equals(this.doneeNameAddress, tax1098CAllOf.doneeNameAddress) &&
        Objects.equals(this.doneeTin, tax1098CAllOf.doneeTin) &&
        Objects.equals(this.donorTin, tax1098CAllOf.donorTin) &&
        Objects.equals(this.donorNameAddress, tax1098CAllOf.donorNameAddress) &&
        Objects.equals(this.dateOfContribution, tax1098CAllOf.dateOfContribution) &&
        Objects.equals(this.odometerMileage, tax1098CAllOf.odometerMileage) &&
        Objects.equals(this.carYear, tax1098CAllOf.carYear) &&
        Objects.equals(this.make, tax1098CAllOf.make) &&
        Objects.equals(this.model, tax1098CAllOf.model) &&
        Objects.equals(this.vin, tax1098CAllOf.vin) &&
        Objects.equals(this.armsLengthTransaction, tax1098CAllOf.armsLengthTransaction) &&
        Objects.equals(this.dateOfSale, tax1098CAllOf.dateOfSale) &&
        Objects.equals(this.grossProceeds, tax1098CAllOf.grossProceeds) &&
        Objects.equals(this.notTransferredBefore, tax1098CAllOf.notTransferredBefore) &&
        Objects.equals(this.needyIndividual, tax1098CAllOf.needyIndividual) &&
        Objects.equals(this.descriptionOfImprovements, tax1098CAllOf.descriptionOfImprovements) &&
        Objects.equals(this.goodsInExchange, tax1098CAllOf.goodsInExchange) &&
        Objects.equals(this.valueOfExchange, tax1098CAllOf.valueOfExchange) &&
        Objects.equals(this.intangibleReligious, tax1098CAllOf.intangibleReligious) &&
        Objects.equals(this.descriptionOfGoods, tax1098CAllOf.descriptionOfGoods) &&
        Objects.equals(this.maxDeductionApplies, tax1098CAllOf.maxDeductionApplies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(doneeNameAddress, doneeTin, donorTin, donorNameAddress, dateOfContribution, odometerMileage, carYear, make, model, vin, armsLengthTransaction, dateOfSale, grossProceeds, notTransferredBefore, needyIndividual, descriptionOfImprovements, goodsInExchange, valueOfExchange, intangibleReligious, descriptionOfGoods, maxDeductionApplies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tax1098CAllOf {\n");
    
    sb.append("    doneeNameAddress: ").append(toIndentedString(doneeNameAddress)).append("\n");
    sb.append("    doneeTin: ").append(toIndentedString(doneeTin)).append("\n");
    sb.append("    donorTin: ").append(toIndentedString(donorTin)).append("\n");
    sb.append("    donorNameAddress: ").append(toIndentedString(donorNameAddress)).append("\n");
    sb.append("    dateOfContribution: ").append(toIndentedString(dateOfContribution)).append("\n");
    sb.append("    odometerMileage: ").append(toIndentedString(odometerMileage)).append("\n");
    sb.append("    carYear: ").append(toIndentedString(carYear)).append("\n");
    sb.append("    make: ").append(toIndentedString(make)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    vin: ").append(toIndentedString(vin)).append("\n");
    sb.append("    armsLengthTransaction: ").append(toIndentedString(armsLengthTransaction)).append("\n");
    sb.append("    dateOfSale: ").append(toIndentedString(dateOfSale)).append("\n");
    sb.append("    grossProceeds: ").append(toIndentedString(grossProceeds)).append("\n");
    sb.append("    notTransferredBefore: ").append(toIndentedString(notTransferredBefore)).append("\n");
    sb.append("    needyIndividual: ").append(toIndentedString(needyIndividual)).append("\n");
    sb.append("    descriptionOfImprovements: ").append(toIndentedString(descriptionOfImprovements)).append("\n");
    sb.append("    goodsInExchange: ").append(toIndentedString(goodsInExchange)).append("\n");
    sb.append("    valueOfExchange: ").append(toIndentedString(valueOfExchange)).append("\n");
    sb.append("    intangibleReligious: ").append(toIndentedString(intangibleReligious)).append("\n");
    sb.append("    descriptionOfGoods: ").append(toIndentedString(descriptionOfGoods)).append("\n");
    sb.append("    maxDeductionApplies: ").append(toIndentedString(maxDeductionApplies)).append("\n");
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

