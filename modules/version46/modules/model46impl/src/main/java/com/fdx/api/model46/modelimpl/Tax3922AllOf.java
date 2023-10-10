package com.fdx.api.model46.modelimpl;

import java.time.LocalDate;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.fasterxml.jackson.annotation.OptBoolean;
import io.swagger.annotations.ApiModelProperty;

/**
 * Tax3922AllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax3922AllOf   {
  @JsonProperty("corporationNameAddress")
  private NameAddress corporationNameAddress;

  @JsonProperty("corporationTin")
  private String corporationTin;

  @JsonProperty("employeeTin")
  private String employeeTin;

  @JsonProperty("employeeNameAddress")
  private NameAddress employeeNameAddress;

  @JsonProperty("accountNumber")
  private String accountNumber;

  @JsonProperty("optionGrantDate")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
  private LocalDate optionGrantDate;

  @JsonProperty("optionExerciseDate")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
  private LocalDate optionExerciseDate;

  @JsonProperty("grantMarketValue")
  private Double grantMarketValue;

  @JsonProperty("exerciseMarketValue")
  private Double exerciseMarketValue;

  @JsonProperty("exercisePrice")
  private Double exercisePrice;

  @JsonProperty("numberOfShares")
  private Double numberOfShares;

  @JsonProperty("titleTransferDate")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
  private LocalDate titleTransferDate;

  @JsonProperty("grantDateExercisePrice")
  private Double grantDateExercisePrice;

  public Tax3922AllOf corporationNameAddress(NameAddress corporationNameAddress) {
    this.corporationNameAddress = corporationNameAddress;
    return this;
  }

  /**
   * Get corporationNameAddress
   * @return corporationNameAddress
  */
  @ApiModelProperty(value = "")

  @Valid

  public NameAddress getCorporationNameAddress() {
    return corporationNameAddress;
  }

  public void setCorporationNameAddress(NameAddress corporationNameAddress) {
    this.corporationNameAddress = corporationNameAddress;
  }

  public Tax3922AllOf corporationTin(String corporationTin) {
    this.corporationTin = corporationTin;
    return this;
  }

  /**
   * CORPORATION'S TIN
   * @return corporationTin
  */
  @ApiModelProperty(value = "CORPORATION'S TIN")


  public String getCorporationTin() {
    return corporationTin;
  }

  public void setCorporationTin(String corporationTin) {
    this.corporationTin = corporationTin;
  }

  public Tax3922AllOf employeeTin(String employeeTin) {
    this.employeeTin = employeeTin;
    return this;
  }

  /**
   * EMPLOYEE'S TIN
   * @return employeeTin
  */
  @ApiModelProperty(value = "EMPLOYEE'S TIN")


  public String getEmployeeTin() {
    return employeeTin;
  }

  public void setEmployeeTin(String employeeTin) {
    this.employeeTin = employeeTin;
  }

  public Tax3922AllOf employeeNameAddress(NameAddress employeeNameAddress) {
    this.employeeNameAddress = employeeNameAddress;
    return this;
  }

  /**
   * Get employeeNameAddress
   * @return employeeNameAddress
  */
  @ApiModelProperty(value = "")

  @Valid

  public NameAddress getEmployeeNameAddress() {
    return employeeNameAddress;
  }

  public void setEmployeeNameAddress(NameAddress employeeNameAddress) {
    this.employeeNameAddress = employeeNameAddress;
  }

  public Tax3922AllOf accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * Account number
   * @return accountNumber
  */
  @ApiModelProperty(value = "Account number")


  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public Tax3922AllOf optionGrantDate(LocalDate optionGrantDate) {
    this.optionGrantDate = optionGrantDate;
    return this;
  }

  /**
   * ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included according to [IETF RFC3339] (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)
   * @return optionGrantDate
  */
  @ApiModelProperty(value = "ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included according to [IETF RFC3339] (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)")

  @Valid
@Size(max=10) 
  public LocalDate getOptionGrantDate() {
    return optionGrantDate;
  }

  public void setOptionGrantDate(LocalDate optionGrantDate) {
    this.optionGrantDate = optionGrantDate;
  }

  public Tax3922AllOf optionExerciseDate(LocalDate optionExerciseDate) {
    this.optionExerciseDate = optionExerciseDate;
    return this;
  }

  /**
   * ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included according to [IETF RFC3339] (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)
   * @return optionExerciseDate
  */
  @ApiModelProperty(value = "ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included according to [IETF RFC3339] (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)")

  @Valid
@Size(max=10) 
  public LocalDate getOptionExerciseDate() {
    return optionExerciseDate;
  }

  public void setOptionExerciseDate(LocalDate optionExerciseDate) {
    this.optionExerciseDate = optionExerciseDate;
  }

  public Tax3922AllOf grantMarketValue(Double grantMarketValue) {
    this.grantMarketValue = grantMarketValue;
    return this;
  }

  /**
   * Box 3, Fair market value per share on grant date
   * @return grantMarketValue
  */
  @ApiModelProperty(value = "Box 3, Fair market value per share on grant date")


  public Double getGrantMarketValue() {
    return grantMarketValue;
  }

  public void setGrantMarketValue(Double grantMarketValue) {
    this.grantMarketValue = grantMarketValue;
  }

  public Tax3922AllOf exerciseMarketValue(Double exerciseMarketValue) {
    this.exerciseMarketValue = exerciseMarketValue;
    return this;
  }

  /**
   * Box 4, Fair market value per share on exercise date
   * @return exerciseMarketValue
  */
  @ApiModelProperty(value = "Box 4, Fair market value per share on exercise date")


  public Double getExerciseMarketValue() {
    return exerciseMarketValue;
  }

  public void setExerciseMarketValue(Double exerciseMarketValue) {
    this.exerciseMarketValue = exerciseMarketValue;
  }

  public Tax3922AllOf exercisePrice(Double exercisePrice) {
    this.exercisePrice = exercisePrice;
    return this;
  }

  /**
   * Box 5, Exercise price paid per share
   * @return exercisePrice
  */
  @ApiModelProperty(value = "Box 5, Exercise price paid per share")


  public Double getExercisePrice() {
    return exercisePrice;
  }

  public void setExercisePrice(Double exercisePrice) {
    this.exercisePrice = exercisePrice;
  }

  public Tax3922AllOf numberOfShares(Double numberOfShares) {
    this.numberOfShares = numberOfShares;
    return this;
  }

  /**
   * Box 6, Number of shares transferred
   * @return numberOfShares
  */
  @ApiModelProperty(value = "Box 6, Number of shares transferred")


  public Double getNumberOfShares() {
    return numberOfShares;
  }

  public void setNumberOfShares(Double numberOfShares) {
    this.numberOfShares = numberOfShares;
  }

  public Tax3922AllOf titleTransferDate(LocalDate titleTransferDate) {
    this.titleTransferDate = titleTransferDate;
    return this;
  }

  /**
   * ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included according to [IETF RFC3339] (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)
   * @return titleTransferDate
  */
  @ApiModelProperty(value = "ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included according to [IETF RFC3339] (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)")

  @Valid
@Size(max=10) 
  public LocalDate getTitleTransferDate() {
    return titleTransferDate;
  }

  public void setTitleTransferDate(LocalDate titleTransferDate) {
    this.titleTransferDate = titleTransferDate;
  }

  public Tax3922AllOf grantDateExercisePrice(Double grantDateExercisePrice) {
    this.grantDateExercisePrice = grantDateExercisePrice;
    return this;
  }

  /**
   * Box 8, Exercise price per share determined as if the option was exercised on the option granted date
   * @return grantDateExercisePrice
  */
  @ApiModelProperty(value = "Box 8, Exercise price per share determined as if the option was exercised on the option granted date")


  public Double getGrantDateExercisePrice() {
    return grantDateExercisePrice;
  }

  public void setGrantDateExercisePrice(Double grantDateExercisePrice) {
    this.grantDateExercisePrice = grantDateExercisePrice;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tax3922AllOf tax3922AllOf = (Tax3922AllOf) o;
    return Objects.equals(this.corporationNameAddress, tax3922AllOf.corporationNameAddress) &&
        Objects.equals(this.corporationTin, tax3922AllOf.corporationTin) &&
        Objects.equals(this.employeeTin, tax3922AllOf.employeeTin) &&
        Objects.equals(this.employeeNameAddress, tax3922AllOf.employeeNameAddress) &&
        Objects.equals(this.accountNumber, tax3922AllOf.accountNumber) &&
        Objects.equals(this.optionGrantDate, tax3922AllOf.optionGrantDate) &&
        Objects.equals(this.optionExerciseDate, tax3922AllOf.optionExerciseDate) &&
        Objects.equals(this.grantMarketValue, tax3922AllOf.grantMarketValue) &&
        Objects.equals(this.exerciseMarketValue, tax3922AllOf.exerciseMarketValue) &&
        Objects.equals(this.exercisePrice, tax3922AllOf.exercisePrice) &&
        Objects.equals(this.numberOfShares, tax3922AllOf.numberOfShares) &&
        Objects.equals(this.titleTransferDate, tax3922AllOf.titleTransferDate) &&
        Objects.equals(this.grantDateExercisePrice, tax3922AllOf.grantDateExercisePrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(corporationNameAddress, corporationTin, employeeTin, employeeNameAddress, accountNumber, optionGrantDate, optionExerciseDate, grantMarketValue, exerciseMarketValue, exercisePrice, numberOfShares, titleTransferDate, grantDateExercisePrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tax3922AllOf {\n");
    
    sb.append("    corporationNameAddress: ").append(toIndentedString(corporationNameAddress)).append("\n");
    sb.append("    corporationTin: ").append(toIndentedString(corporationTin)).append("\n");
    sb.append("    employeeTin: ").append(toIndentedString(employeeTin)).append("\n");
    sb.append("    employeeNameAddress: ").append(toIndentedString(employeeNameAddress)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    optionGrantDate: ").append(toIndentedString(optionGrantDate)).append("\n");
    sb.append("    optionExerciseDate: ").append(toIndentedString(optionExerciseDate)).append("\n");
    sb.append("    grantMarketValue: ").append(toIndentedString(grantMarketValue)).append("\n");
    sb.append("    exerciseMarketValue: ").append(toIndentedString(exerciseMarketValue)).append("\n");
    sb.append("    exercisePrice: ").append(toIndentedString(exercisePrice)).append("\n");
    sb.append("    numberOfShares: ").append(toIndentedString(numberOfShares)).append("\n");
    sb.append("    titleTransferDate: ").append(toIndentedString(titleTransferDate)).append("\n");
    sb.append("    grantDateExercisePrice: ").append(toIndentedString(grantDateExercisePrice)).append("\n");
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

