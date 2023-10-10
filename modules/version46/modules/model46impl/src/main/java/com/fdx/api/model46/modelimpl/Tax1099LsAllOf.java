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
 * Tax1099LsAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1099LsAllOf   {
  @JsonProperty("acquirerNameAddress")
  private NameAddressPhone acquirerNameAddress;

  @JsonProperty("acquirerTin")
  private String acquirerTin;

  @JsonProperty("recipientTin")
  private String recipientTin;

  @JsonProperty("recipientNameAddress")
  private NameAddress recipientNameAddress;

  @JsonProperty("policyNumber")
  private String policyNumber;

  @JsonProperty("payment")
  private Double payment;

  @JsonProperty("saleDate")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
  private LocalDate saleDate;

  @JsonProperty("issuerName")
  private String issuerName;

  @JsonProperty("contactNameAddress")
  private NameAddressPhone contactNameAddress;

  public Tax1099LsAllOf acquirerNameAddress(NameAddressPhone acquirerNameAddress) {
    this.acquirerNameAddress = acquirerNameAddress;
    return this;
  }

  /**
   * Get acquirerNameAddress
   * @return acquirerNameAddress
  */
  @ApiModelProperty(value = "")

  @Valid

  public NameAddressPhone getAcquirerNameAddress() {
    return acquirerNameAddress;
  }

  public void setAcquirerNameAddress(NameAddressPhone acquirerNameAddress) {
    this.acquirerNameAddress = acquirerNameAddress;
  }

  public Tax1099LsAllOf acquirerTin(String acquirerTin) {
    this.acquirerTin = acquirerTin;
    return this;
  }

  /**
   * ACQUIRER's TIN
   * @return acquirerTin
  */
  @ApiModelProperty(value = "ACQUIRER's TIN")


  public String getAcquirerTin() {
    return acquirerTin;
  }

  public void setAcquirerTin(String acquirerTin) {
    this.acquirerTin = acquirerTin;
  }

  public Tax1099LsAllOf recipientTin(String recipientTin) {
    this.recipientTin = recipientTin;
    return this;
  }

  /**
   * PAYMENT RECIPIENT'S TIN
   * @return recipientTin
  */
  @ApiModelProperty(value = "PAYMENT RECIPIENT'S TIN")


  public String getRecipientTin() {
    return recipientTin;
  }

  public void setRecipientTin(String recipientTin) {
    this.recipientTin = recipientTin;
  }

  public Tax1099LsAllOf recipientNameAddress(NameAddress recipientNameAddress) {
    this.recipientNameAddress = recipientNameAddress;
    return this;
  }

  /**
   * Get recipientNameAddress
   * @return recipientNameAddress
  */
  @ApiModelProperty(value = "")

  @Valid

  public NameAddress getRecipientNameAddress() {
    return recipientNameAddress;
  }

  public void setRecipientNameAddress(NameAddress recipientNameAddress) {
    this.recipientNameAddress = recipientNameAddress;
  }

  public Tax1099LsAllOf policyNumber(String policyNumber) {
    this.policyNumber = policyNumber;
    return this;
  }

  /**
   * Policy number
   * @return policyNumber
  */
  @ApiModelProperty(value = "Policy number")


  public String getPolicyNumber() {
    return policyNumber;
  }

  public void setPolicyNumber(String policyNumber) {
    this.policyNumber = policyNumber;
  }

  public Tax1099LsAllOf payment(Double payment) {
    this.payment = payment;
    return this;
  }

  /**
   * Box 1, Amount paid to payment recipient
   * @return payment
  */
  @ApiModelProperty(value = "Box 1, Amount paid to payment recipient")


  public Double getPayment() {
    return payment;
  }

  public void setPayment(Double payment) {
    this.payment = payment;
  }

  public Tax1099LsAllOf saleDate(LocalDate saleDate) {
    this.saleDate = saleDate;
    return this;
  }

  /**
   * ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included according to [IETF RFC3339] (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)
   * @return saleDate
  */
  @ApiModelProperty(value = "ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included according to [IETF RFC3339] (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)")

  @Valid
@Size(max=10) 
  public LocalDate getSaleDate() {
    return saleDate;
  }

  public void setSaleDate(LocalDate saleDate) {
    this.saleDate = saleDate;
  }

  public Tax1099LsAllOf issuerName(String issuerName) {
    this.issuerName = issuerName;
    return this;
  }

  /**
   * Issuer's name
   * @return issuerName
  */
  @ApiModelProperty(value = "Issuer's name")


  public String getIssuerName() {
    return issuerName;
  }

  public void setIssuerName(String issuerName) {
    this.issuerName = issuerName;
  }

  public Tax1099LsAllOf contactNameAddress(NameAddressPhone contactNameAddress) {
    this.contactNameAddress = contactNameAddress;
    return this;
  }

  /**
   * Get contactNameAddress
   * @return contactNameAddress
  */
  @ApiModelProperty(value = "")

  @Valid

  public NameAddressPhone getContactNameAddress() {
    return contactNameAddress;
  }

  public void setContactNameAddress(NameAddressPhone contactNameAddress) {
    this.contactNameAddress = contactNameAddress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tax1099LsAllOf tax1099LsAllOf = (Tax1099LsAllOf) o;
    return Objects.equals(this.acquirerNameAddress, tax1099LsAllOf.acquirerNameAddress) &&
        Objects.equals(this.acquirerTin, tax1099LsAllOf.acquirerTin) &&
        Objects.equals(this.recipientTin, tax1099LsAllOf.recipientTin) &&
        Objects.equals(this.recipientNameAddress, tax1099LsAllOf.recipientNameAddress) &&
        Objects.equals(this.policyNumber, tax1099LsAllOf.policyNumber) &&
        Objects.equals(this.payment, tax1099LsAllOf.payment) &&
        Objects.equals(this.saleDate, tax1099LsAllOf.saleDate) &&
        Objects.equals(this.issuerName, tax1099LsAllOf.issuerName) &&
        Objects.equals(this.contactNameAddress, tax1099LsAllOf.contactNameAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acquirerNameAddress, acquirerTin, recipientTin, recipientNameAddress, policyNumber, payment, saleDate, issuerName, contactNameAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tax1099LsAllOf {\n");
    
    sb.append("    acquirerNameAddress: ").append(toIndentedString(acquirerNameAddress)).append("\n");
    sb.append("    acquirerTin: ").append(toIndentedString(acquirerTin)).append("\n");
    sb.append("    recipientTin: ").append(toIndentedString(recipientTin)).append("\n");
    sb.append("    recipientNameAddress: ").append(toIndentedString(recipientNameAddress)).append("\n");
    sb.append("    policyNumber: ").append(toIndentedString(policyNumber)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("    saleDate: ").append(toIndentedString(saleDate)).append("\n");
    sb.append("    issuerName: ").append(toIndentedString(issuerName)).append("\n");
    sb.append("    contactNameAddress: ").append(toIndentedString(contactNameAddress)).append("\n");
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

