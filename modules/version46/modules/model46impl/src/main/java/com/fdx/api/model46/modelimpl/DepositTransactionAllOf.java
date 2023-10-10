package com.fdx.api.model46.modelimpl;

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * DepositTransactionAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class DepositTransactionAllOf   {
  @JsonProperty("transactionType")
  private DepositTransactionType transactionType;

  @JsonProperty("payee")
  private String payee;

  @JsonProperty("checkNumber")
  private Integer checkNumber;

  public DepositTransactionAllOf transactionType(DepositTransactionType transactionType) {
    this.transactionType = transactionType;
    return this;
  }

  /**
   * Get transactionType
   * @return transactionType
  */
  @ApiModelProperty(value = "")

  @Valid

  public DepositTransactionType getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(DepositTransactionType transactionType) {
    this.transactionType = transactionType;
  }

  public DepositTransactionAllOf payee(String payee) {
    this.payee = payee;
    return this;
  }

  /**
   * String of maximum length 255
   * @return payee
  */
  @ApiModelProperty(value = "String of maximum length 255")

@Size(max=255) 
  public String getPayee() {
    return payee;
  }

  public void setPayee(String payee) {
    this.payee = payee;
  }

  public DepositTransactionAllOf checkNumber(Integer checkNumber) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositTransactionAllOf depositTransactionAllOf = (DepositTransactionAllOf) o;
    return Objects.equals(this.transactionType, depositTransactionAllOf.transactionType) &&
        Objects.equals(this.payee, depositTransactionAllOf.payee) &&
        Objects.equals(this.checkNumber, depositTransactionAllOf.checkNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionType, payee, checkNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositTransactionAllOf {\n");
    
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    payee: ").append(toIndentedString(payee)).append("\n");
    sb.append("    checkNumber: ").append(toIndentedString(checkNumber)).append("\n");
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

