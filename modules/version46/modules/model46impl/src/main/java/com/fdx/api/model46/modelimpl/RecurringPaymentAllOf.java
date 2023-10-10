package com.fdx.api.model46.modelimpl;

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * RecurringPaymentAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class RecurringPaymentAllOf   {
  @JsonProperty("recurringPaymentId")
  private String recurringPaymentId;

  @JsonProperty("cancelledTimestamp")
  private java.sql.Timestamp cancelledTimestamp;

  @JsonProperty("processedTimestamp")
  private java.sql.Timestamp processedTimestamp;

  @JsonProperty("failedTimestamp")
  private java.sql.Timestamp failedTimestamp;

  @JsonProperty("status")
  private PaymentStatus status;

  public RecurringPaymentAllOf recurringPaymentId(String recurringPaymentId) {
    this.recurringPaymentId = recurringPaymentId;
    return this;
  }

  /**
   * Value for a unique identifier
   * @return recurringPaymentId
  */
  @ApiModelProperty(value = "Value for a unique identifier")

@Size(max=256) 
  public String getRecurringPaymentId() {
    return recurringPaymentId;
  }

  public void setRecurringPaymentId(String recurringPaymentId) {
    this.recurringPaymentId = recurringPaymentId;
  }

  public RecurringPaymentAllOf cancelledTimestamp(java.sql.Timestamp cancelledTimestamp) {
    this.cancelledTimestamp = cancelledTimestamp;
    return this;
  }

  /**
   * Get cancelledTimestamp
   * @return cancelledTimestamp
  */
  @ApiModelProperty(value = "")

  @Valid

  public java.sql.Timestamp getCancelledTimestamp() {
    return cancelledTimestamp;
  }

  public void setCancelledTimestamp(java.sql.Timestamp cancelledTimestamp) {
    this.cancelledTimestamp = cancelledTimestamp;
  }

  public RecurringPaymentAllOf processedTimestamp(java.sql.Timestamp processedTimestamp) {
    this.processedTimestamp = processedTimestamp;
    return this;
  }

  /**
   * Get processedTimestamp
   * @return processedTimestamp
  */
  @ApiModelProperty(value = "")

  @Valid

  public java.sql.Timestamp getProcessedTimestamp() {
    return processedTimestamp;
  }

  public void setProcessedTimestamp(java.sql.Timestamp processedTimestamp) {
    this.processedTimestamp = processedTimestamp;
  }

  public RecurringPaymentAllOf failedTimestamp(java.sql.Timestamp failedTimestamp) {
    this.failedTimestamp = failedTimestamp;
    return this;
  }

  /**
   * Get failedTimestamp
   * @return failedTimestamp
  */
  @ApiModelProperty(value = "")

  @Valid

  public java.sql.Timestamp getFailedTimestamp() {
    return failedTimestamp;
  }

  public void setFailedTimestamp(java.sql.Timestamp failedTimestamp) {
    this.failedTimestamp = failedTimestamp;
  }

  public RecurringPaymentAllOf status(PaymentStatus status) {
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

  public PaymentStatus getStatus() {
    return status;
  }

  public void setStatus(PaymentStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecurringPaymentAllOf recurringPaymentAllOf = (RecurringPaymentAllOf) o;
    return Objects.equals(this.recurringPaymentId, recurringPaymentAllOf.recurringPaymentId) &&
        Objects.equals(this.cancelledTimestamp, recurringPaymentAllOf.cancelledTimestamp) &&
        Objects.equals(this.processedTimestamp, recurringPaymentAllOf.processedTimestamp) &&
        Objects.equals(this.failedTimestamp, recurringPaymentAllOf.failedTimestamp) &&
        Objects.equals(this.status, recurringPaymentAllOf.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recurringPaymentId, cancelledTimestamp, processedTimestamp, failedTimestamp, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecurringPaymentAllOf {\n");
    
    sb.append("    recurringPaymentId: ").append(toIndentedString(recurringPaymentId)).append("\n");
    sb.append("    cancelledTimestamp: ").append(toIndentedString(cancelledTimestamp)).append("\n");
    sb.append("    processedTimestamp: ").append(toIndentedString(processedTimestamp)).append("\n");
    sb.append("    failedTimestamp: ").append(toIndentedString(failedTimestamp)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

