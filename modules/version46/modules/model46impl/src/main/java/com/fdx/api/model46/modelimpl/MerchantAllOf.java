package com.fdx.api.model46.modelimpl;

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * MerchantAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class MerchantAllOf   {
  @JsonProperty("payeeId")
  private String payeeId;

  @JsonProperty("status")
  private PayeeStatus status;

  @JsonProperty("expiresTimestamp")
  private java.sql.Timestamp expiresTimestamp;

  public MerchantAllOf payeeId(String payeeId) {
    this.payeeId = payeeId;
    return this;
  }

  /**
   * Value for a unique identifier
   * @return payeeId
  */
  @ApiModelProperty(value = "Value for a unique identifier")

@Size(max=256) 
  public String getPayeeId() {
    return payeeId;
  }

  public void setPayeeId(String payeeId) {
    this.payeeId = payeeId;
  }

  public MerchantAllOf status(PayeeStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public PayeeStatus getStatus() {
    return status;
  }

  public void setStatus(PayeeStatus status) {
    this.status = status;
  }

  public MerchantAllOf expiresTimestamp(java.sql.Timestamp expiresTimestamp) {
    this.expiresTimestamp = expiresTimestamp;
    return this;
  }

  /**
   * Get expiresTimestamp
   * @return expiresTimestamp
  */
  @ApiModelProperty(value = "")

  @Valid

  public java.sql.Timestamp getExpiresTimestamp() {
    return expiresTimestamp;
  }

  public void setExpiresTimestamp(java.sql.Timestamp expiresTimestamp) {
    this.expiresTimestamp = expiresTimestamp;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantAllOf merchantAllOf = (MerchantAllOf) o;
    return Objects.equals(this.payeeId, merchantAllOf.payeeId) &&
        Objects.equals(this.status, merchantAllOf.status) &&
        Objects.equals(this.expiresTimestamp, merchantAllOf.expiresTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payeeId, status, expiresTimestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantAllOf {\n");
    
    sb.append("    payeeId: ").append(toIndentedString(payeeId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    expiresTimestamp: ").append(toIndentedString(expiresTimestamp)).append("\n");
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

