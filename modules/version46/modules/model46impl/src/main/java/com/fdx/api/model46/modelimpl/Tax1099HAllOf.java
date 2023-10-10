package com.fdx.api.model46.modelimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Tax1099HAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1099HAllOf   {
  @JsonProperty("issuerNameAddress")
  private NameAddressPhone issuerNameAddress;

  @JsonProperty("issuerTin")
  private String issuerTin;

  @JsonProperty("recipientTin")
  private String recipientTin;

  @JsonProperty("recipientNameAddress")
  private NameAddress recipientNameAddress;

  @JsonProperty("advancePayments")
  private Double advancePayments;

  @JsonProperty("numberOfMonths")
  private Integer numberOfMonths;

  @JsonProperty("payments")
  @Valid
  private List<MonthAmount> payments = null;

  public Tax1099HAllOf issuerNameAddress(NameAddressPhone issuerNameAddress) {
    this.issuerNameAddress = issuerNameAddress;
    return this;
  }

  /**
   * Get issuerNameAddress
   * @return issuerNameAddress
  */
  @ApiModelProperty(value = "")

  @Valid

  public NameAddressPhone getIssuerNameAddress() {
    return issuerNameAddress;
  }

  public void setIssuerNameAddress(NameAddressPhone issuerNameAddress) {
    this.issuerNameAddress = issuerNameAddress;
  }

  public Tax1099HAllOf issuerTin(String issuerTin) {
    this.issuerTin = issuerTin;
    return this;
  }

  /**
   * ISSUER'S/PROVIDER'S federal identification number
   * @return issuerTin
  */
  @ApiModelProperty(value = "ISSUER'S/PROVIDER'S federal identification number")


  public String getIssuerTin() {
    return issuerTin;
  }

  public void setIssuerTin(String issuerTin) {
    this.issuerTin = issuerTin;
  }

  public Tax1099HAllOf recipientTin(String recipientTin) {
    this.recipientTin = recipientTin;
    return this;
  }

  /**
   * RECIPIENT'S identification number
   * @return recipientTin
  */
  @ApiModelProperty(value = "RECIPIENT'S identification number")


  public String getRecipientTin() {
    return recipientTin;
  }

  public void setRecipientTin(String recipientTin) {
    this.recipientTin = recipientTin;
  }

  public Tax1099HAllOf recipientNameAddress(NameAddress recipientNameAddress) {
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

  public Tax1099HAllOf advancePayments(Double advancePayments) {
    this.advancePayments = advancePayments;
    return this;
  }

  /**
   * Box 1, Amount of HCTC advance payments
   * @return advancePayments
  */
  @ApiModelProperty(value = "Box 1, Amount of HCTC advance payments")


  public Double getAdvancePayments() {
    return advancePayments;
  }

  public void setAdvancePayments(Double advancePayments) {
    this.advancePayments = advancePayments;
  }

  public Tax1099HAllOf numberOfMonths(Integer numberOfMonths) {
    this.numberOfMonths = numberOfMonths;
    return this;
  }

  /**
   * Box 2, Number of months HCTC advance payments and reimbursement credits paid to you
   * @return numberOfMonths
  */
  @ApiModelProperty(value = "Box 2, Number of months HCTC advance payments and reimbursement credits paid to you")


  public Integer getNumberOfMonths() {
    return numberOfMonths;
  }

  public void setNumberOfMonths(Integer numberOfMonths) {
    this.numberOfMonths = numberOfMonths;
  }

  public Tax1099HAllOf payments(List<MonthAmount> payments) {
    this.payments = payments;
    return this;
  }

  public Tax1099HAllOf addPaymentsItem(MonthAmount paymentsItem) {
    if (this.payments == null) {
      this.payments = new ArrayList<>();
    }
    this.payments.add(paymentsItem);
    return this;
  }

  /**
   * Boxes 3-14, Payments by month
   * @return payments
  */
  @ApiModelProperty(value = "Boxes 3-14, Payments by month")

  @Valid

  public List<MonthAmount> getPayments() {
    return payments;
  }

  public void setPayments(List<MonthAmount> payments) {
    this.payments = payments;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tax1099HAllOf tax1099HAllOf = (Tax1099HAllOf) o;
    return Objects.equals(this.issuerNameAddress, tax1099HAllOf.issuerNameAddress) &&
        Objects.equals(this.issuerTin, tax1099HAllOf.issuerTin) &&
        Objects.equals(this.recipientTin, tax1099HAllOf.recipientTin) &&
        Objects.equals(this.recipientNameAddress, tax1099HAllOf.recipientNameAddress) &&
        Objects.equals(this.advancePayments, tax1099HAllOf.advancePayments) &&
        Objects.equals(this.numberOfMonths, tax1099HAllOf.numberOfMonths) &&
        Objects.equals(this.payments, tax1099HAllOf.payments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuerNameAddress, issuerTin, recipientTin, recipientNameAddress, advancePayments, numberOfMonths, payments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tax1099HAllOf {\n");
    
    sb.append("    issuerNameAddress: ").append(toIndentedString(issuerNameAddress)).append("\n");
    sb.append("    issuerTin: ").append(toIndentedString(issuerTin)).append("\n");
    sb.append("    recipientTin: ").append(toIndentedString(recipientTin)).append("\n");
    sb.append("    recipientNameAddress: ").append(toIndentedString(recipientNameAddress)).append("\n");
    sb.append("    advancePayments: ").append(toIndentedString(advancePayments)).append("\n");
    sb.append("    numberOfMonths: ").append(toIndentedString(numberOfMonths)).append("\n");
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
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

