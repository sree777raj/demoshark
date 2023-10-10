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
 * Tax1099CapAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1099CapAllOf   {
  @JsonProperty("corporationNameAddress")
  private NameAddressPhone corporationNameAddress;

  @JsonProperty("corporationTin")
  private String corporationTin;

  @JsonProperty("shareholderTin")
  private String shareholderTin;

  @JsonProperty("shareholderNameAddress")
  private NameAddress shareholderNameAddress;

  @JsonProperty("accountNumber")
  private String accountNumber;

  @JsonProperty("dateOfSale")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
  private LocalDate dateOfSale;

  @JsonProperty("aggregateAmount")
  private Double aggregateAmount;

  @JsonProperty("numberOfShares")
  private Double numberOfShares;

  @JsonProperty("stockClasses")
  private String stockClasses;

  public Tax1099CapAllOf corporationNameAddress(NameAddressPhone corporationNameAddress) {
    this.corporationNameAddress = corporationNameAddress;
    return this;
  }

  /**
   * Get corporationNameAddress
   * @return corporationNameAddress
  */
  @ApiModelProperty(value = "")

  @Valid

  public NameAddressPhone getCorporationNameAddress() {
    return corporationNameAddress;
  }

  public void setCorporationNameAddress(NameAddressPhone corporationNameAddress) {
    this.corporationNameAddress = corporationNameAddress;
  }

  public Tax1099CapAllOf corporationTin(String corporationTin) {
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

  public Tax1099CapAllOf shareholderTin(String shareholderTin) {
    this.shareholderTin = shareholderTin;
    return this;
  }

  /**
   * SHAREHOLDER'S TIN
   * @return shareholderTin
  */
  @ApiModelProperty(value = "SHAREHOLDER'S TIN")


  public String getShareholderTin() {
    return shareholderTin;
  }

  public void setShareholderTin(String shareholderTin) {
    this.shareholderTin = shareholderTin;
  }

  public Tax1099CapAllOf shareholderNameAddress(NameAddress shareholderNameAddress) {
    this.shareholderNameAddress = shareholderNameAddress;
    return this;
  }

  /**
   * Get shareholderNameAddress
   * @return shareholderNameAddress
  */
  @ApiModelProperty(value = "")

  @Valid

  public NameAddress getShareholderNameAddress() {
    return shareholderNameAddress;
  }

  public void setShareholderNameAddress(NameAddress shareholderNameAddress) {
    this.shareholderNameAddress = shareholderNameAddress;
  }

  public Tax1099CapAllOf accountNumber(String accountNumber) {
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

  public Tax1099CapAllOf dateOfSale(LocalDate dateOfSale) {
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

  public Tax1099CapAllOf aggregateAmount(Double aggregateAmount) {
    this.aggregateAmount = aggregateAmount;
    return this;
  }

  /**
   * Box 2, Aggregate amount received
   * @return aggregateAmount
  */
  @ApiModelProperty(value = "Box 2, Aggregate amount received")


  public Double getAggregateAmount() {
    return aggregateAmount;
  }

  public void setAggregateAmount(Double aggregateAmount) {
    this.aggregateAmount = aggregateAmount;
  }

  public Tax1099CapAllOf numberOfShares(Double numberOfShares) {
    this.numberOfShares = numberOfShares;
    return this;
  }

  /**
   * Box 3, Number of shares exchanged
   * @return numberOfShares
  */
  @ApiModelProperty(value = "Box 3, Number of shares exchanged")


  public Double getNumberOfShares() {
    return numberOfShares;
  }

  public void setNumberOfShares(Double numberOfShares) {
    this.numberOfShares = numberOfShares;
  }

  public Tax1099CapAllOf stockClasses(String stockClasses) {
    this.stockClasses = stockClasses;
    return this;
  }

  /**
   * Box 4, Classes of stock exchanged
   * @return stockClasses
  */
  @ApiModelProperty(value = "Box 4, Classes of stock exchanged")


  public String getStockClasses() {
    return stockClasses;
  }

  public void setStockClasses(String stockClasses) {
    this.stockClasses = stockClasses;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tax1099CapAllOf tax1099CapAllOf = (Tax1099CapAllOf) o;
    return Objects.equals(this.corporationNameAddress, tax1099CapAllOf.corporationNameAddress) &&
        Objects.equals(this.corporationTin, tax1099CapAllOf.corporationTin) &&
        Objects.equals(this.shareholderTin, tax1099CapAllOf.shareholderTin) &&
        Objects.equals(this.shareholderNameAddress, tax1099CapAllOf.shareholderNameAddress) &&
        Objects.equals(this.accountNumber, tax1099CapAllOf.accountNumber) &&
        Objects.equals(this.dateOfSale, tax1099CapAllOf.dateOfSale) &&
        Objects.equals(this.aggregateAmount, tax1099CapAllOf.aggregateAmount) &&
        Objects.equals(this.numberOfShares, tax1099CapAllOf.numberOfShares) &&
        Objects.equals(this.stockClasses, tax1099CapAllOf.stockClasses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(corporationNameAddress, corporationTin, shareholderTin, shareholderNameAddress, accountNumber, dateOfSale, aggregateAmount, numberOfShares, stockClasses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tax1099CapAllOf {\n");
    
    sb.append("    corporationNameAddress: ").append(toIndentedString(corporationNameAddress)).append("\n");
    sb.append("    corporationTin: ").append(toIndentedString(corporationTin)).append("\n");
    sb.append("    shareholderTin: ").append(toIndentedString(shareholderTin)).append("\n");
    sb.append("    shareholderNameAddress: ").append(toIndentedString(shareholderNameAddress)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    dateOfSale: ").append(toIndentedString(dateOfSale)).append("\n");
    sb.append("    aggregateAmount: ").append(toIndentedString(aggregateAmount)).append("\n");
    sb.append("    numberOfShares: ").append(toIndentedString(numberOfShares)).append("\n");
    sb.append("    stockClasses: ").append(toIndentedString(stockClasses)).append("\n");
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

