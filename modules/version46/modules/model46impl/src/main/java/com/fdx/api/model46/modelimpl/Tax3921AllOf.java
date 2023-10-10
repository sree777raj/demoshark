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
 * Tax3921AllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax3921AllOf   {
  @JsonProperty("transferorNameAddress")
  private NameAddress transferorNameAddress;

  @JsonProperty("transferorTin")
  private String transferorTin;

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

  @JsonProperty("exercisePrice")
  private Double exercisePrice;

  @JsonProperty("exerciseMarketValue")
  private Double exerciseMarketValue;

  @JsonProperty("numberOfShares")
  private Double numberOfShares;

  @JsonProperty("corporateNameAddress")
  private NameAddress corporateNameAddress;

  @JsonProperty("corporateTin")
  private String corporateTin;

  public Tax3921AllOf transferorNameAddress(NameAddress transferorNameAddress) {
    this.transferorNameAddress = transferorNameAddress;
    return this;
  }

  /**
   * Get transferorNameAddress
   * @return transferorNameAddress
  */
  @ApiModelProperty(value = "")

  @Valid

  public NameAddress getTransferorNameAddress() {
    return transferorNameAddress;
  }

  public void setTransferorNameAddress(NameAddress transferorNameAddress) {
    this.transferorNameAddress = transferorNameAddress;
  }

  public Tax3921AllOf transferorTin(String transferorTin) {
    this.transferorTin = transferorTin;
    return this;
  }

  /**
   * TRANSFEROR'S TIN
   * @return transferorTin
  */
  @ApiModelProperty(value = "TRANSFEROR'S TIN")


  public String getTransferorTin() {
    return transferorTin;
  }

  public void setTransferorTin(String transferorTin) {
    this.transferorTin = transferorTin;
  }

  public Tax3921AllOf employeeTin(String employeeTin) {
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

  public Tax3921AllOf employeeNameAddress(NameAddress employeeNameAddress) {
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

  public Tax3921AllOf accountNumber(String accountNumber) {
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

  public Tax3921AllOf optionGrantDate(LocalDate optionGrantDate) {
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

  public Tax3921AllOf optionExerciseDate(LocalDate optionExerciseDate) {
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

  public Tax3921AllOf exercisePrice(Double exercisePrice) {
    this.exercisePrice = exercisePrice;
    return this;
  }

  /**
   * Box 3, Exercise price per share
   * @return exercisePrice
  */
  @ApiModelProperty(value = "Box 3, Exercise price per share")


  public Double getExercisePrice() {
    return exercisePrice;
  }

  public void setExercisePrice(Double exercisePrice) {
    this.exercisePrice = exercisePrice;
  }

  public Tax3921AllOf exerciseMarketValue(Double exerciseMarketValue) {
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

  public Tax3921AllOf numberOfShares(Double numberOfShares) {
    this.numberOfShares = numberOfShares;
    return this;
  }

  /**
   * Box 5, Number of shares transferred
   * @return numberOfShares
  */
  @ApiModelProperty(value = "Box 5, Number of shares transferred")


  public Double getNumberOfShares() {
    return numberOfShares;
  }

  public void setNumberOfShares(Double numberOfShares) {
    this.numberOfShares = numberOfShares;
  }

  public Tax3921AllOf corporateNameAddress(NameAddress corporateNameAddress) {
    this.corporateNameAddress = corporateNameAddress;
    return this;
  }

  /**
   * Get corporateNameAddress
   * @return corporateNameAddress
  */
  @ApiModelProperty(value = "")

  @Valid

  public NameAddress getCorporateNameAddress() {
    return corporateNameAddress;
  }

  public void setCorporateNameAddress(NameAddress corporateNameAddress) {
    this.corporateNameAddress = corporateNameAddress;
  }

  public Tax3921AllOf corporateTin(String corporateTin) {
    this.corporateTin = corporateTin;
    return this;
  }

  /**
   * Box 6, If other than TRANSFEROR, TIN of corporation whose stock is begin transferred
   * @return corporateTin
  */
  @ApiModelProperty(value = "Box 6, If other than TRANSFEROR, TIN of corporation whose stock is begin transferred")


  public String getCorporateTin() {
    return corporateTin;
  }

  public void setCorporateTin(String corporateTin) {
    this.corporateTin = corporateTin;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tax3921AllOf tax3921AllOf = (Tax3921AllOf) o;
    return Objects.equals(this.transferorNameAddress, tax3921AllOf.transferorNameAddress) &&
        Objects.equals(this.transferorTin, tax3921AllOf.transferorTin) &&
        Objects.equals(this.employeeTin, tax3921AllOf.employeeTin) &&
        Objects.equals(this.employeeNameAddress, tax3921AllOf.employeeNameAddress) &&
        Objects.equals(this.accountNumber, tax3921AllOf.accountNumber) &&
        Objects.equals(this.optionGrantDate, tax3921AllOf.optionGrantDate) &&
        Objects.equals(this.optionExerciseDate, tax3921AllOf.optionExerciseDate) &&
        Objects.equals(this.exercisePrice, tax3921AllOf.exercisePrice) &&
        Objects.equals(this.exerciseMarketValue, tax3921AllOf.exerciseMarketValue) &&
        Objects.equals(this.numberOfShares, tax3921AllOf.numberOfShares) &&
        Objects.equals(this.corporateNameAddress, tax3921AllOf.corporateNameAddress) &&
        Objects.equals(this.corporateTin, tax3921AllOf.corporateTin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transferorNameAddress, transferorTin, employeeTin, employeeNameAddress, accountNumber, optionGrantDate, optionExerciseDate, exercisePrice, exerciseMarketValue, numberOfShares, corporateNameAddress, corporateTin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tax3921AllOf {\n");
    
    sb.append("    transferorNameAddress: ").append(toIndentedString(transferorNameAddress)).append("\n");
    sb.append("    transferorTin: ").append(toIndentedString(transferorTin)).append("\n");
    sb.append("    employeeTin: ").append(toIndentedString(employeeTin)).append("\n");
    sb.append("    employeeNameAddress: ").append(toIndentedString(employeeNameAddress)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    optionGrantDate: ").append(toIndentedString(optionGrantDate)).append("\n");
    sb.append("    optionExerciseDate: ").append(toIndentedString(optionExerciseDate)).append("\n");
    sb.append("    exercisePrice: ").append(toIndentedString(exercisePrice)).append("\n");
    sb.append("    exerciseMarketValue: ").append(toIndentedString(exerciseMarketValue)).append("\n");
    sb.append("    numberOfShares: ").append(toIndentedString(numberOfShares)).append("\n");
    sb.append("    corporateNameAddress: ").append(toIndentedString(corporateNameAddress)).append("\n");
    sb.append("    corporateTin: ").append(toIndentedString(corporateTin)).append("\n");
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

