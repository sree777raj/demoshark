package com.fdx.api.model46.modelimpl;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * LocTransactionAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class LocTransactionAllOf   {
  @JsonProperty("transactionType")
  private LocTransactionType transactionType;

  @JsonProperty("checkNumber")
  private Integer checkNumber;

  @JsonProperty("paymentDetails")
  private PaymentDetails paymentDetails;

  public LocTransactionAllOf transactionType(LocTransactionType transactionType) {
    this.transactionType = transactionType;
    return this;
  }

  /**
   * Get transactionType
   * @return transactionType
  */
  @ApiModelProperty(value = "")

  @Valid

  public LocTransactionType getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(LocTransactionType transactionType) {
    this.transactionType = transactionType;
  }

  public LocTransactionAllOf checkNumber(Integer checkNumber) {
    this.checkNumber = checkNumber;
    return this;
  }

  /**
   * Check number
   * @return checkNumber
  */
  @ApiModelProperty(value = "Check number")


  public Integer getCheckNumber() {
    return checkNumber;
  }

  public void setCheckNumber(Integer checkNumber) {
    this.checkNumber = checkNumber;
  }

  public LocTransactionAllOf paymentDetails(PaymentDetails paymentDetails) {
    this.paymentDetails = paymentDetails;
    return this;
  }

  /**
   * Get paymentDetails
   * @return paymentDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public PaymentDetails getPaymentDetails() {
    return paymentDetails;
  }

  public void setPaymentDetails(PaymentDetails paymentDetails) {
    this.paymentDetails = paymentDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocTransactionAllOf locTransactionAllOf = (LocTransactionAllOf) o;
    return Objects.equals(this.transactionType, locTransactionAllOf.transactionType) &&
        Objects.equals(this.checkNumber, locTransactionAllOf.checkNumber) &&
        Objects.equals(this.paymentDetails, locTransactionAllOf.paymentDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionType, checkNumber, paymentDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocTransactionAllOf {\n");
    
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    checkNumber: ").append(toIndentedString(checkNumber)).append("\n");
    sb.append("    paymentDetails: ").append(toIndentedString(paymentDetails)).append("\n");
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

