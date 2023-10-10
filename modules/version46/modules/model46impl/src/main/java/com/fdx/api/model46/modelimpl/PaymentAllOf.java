package com.fdx.api.model46.modelimpl;

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * PaymentAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class PaymentAllOf   {
  @JsonProperty("paymentId")
  private String paymentId;

  @JsonProperty("recurringPaymentId")
  private String recurringPaymentId;

  @JsonProperty("processedTimestamp")
  private java.sql.Timestamp processedTimestamp;

  @JsonProperty("failedTimestamp")
  private java.sql.Timestamp failedTimestamp;

  @JsonProperty("cancelledTimestamp")
  private java.sql.Timestamp cancelledTimestamp;

  @JsonProperty("startedProcessingTimestamp")
  private java.sql.Timestamp startedProcessingTimestamp;

  @JsonProperty("status")
  private PaymentStatus status;

  @JsonProperty("links")
  private PaymentLinks links;

  public PaymentAllOf paymentId(String paymentId) {
    this.paymentId = paymentId;
    return this;
  }

  /**
   * Value for a unique identifier
   * @return paymentId
  */
  @ApiModelProperty(required = true, value = "Value for a unique identifier")
  @NotNull

@Size(max=256) 
  public String getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }

  public PaymentAllOf recurringPaymentId(String recurringPaymentId) {
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

  public PaymentAllOf processedTimestamp(java.sql.Timestamp processedTimestamp) {
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

  public PaymentAllOf failedTimestamp(java.sql.Timestamp failedTimestamp) {
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

  public PaymentAllOf cancelledTimestamp(java.sql.Timestamp cancelledTimestamp) {
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

  public PaymentAllOf startedProcessingTimestamp(java.sql.Timestamp startedProcessingTimestamp) {
    this.startedProcessingTimestamp = startedProcessingTimestamp;
    return this;
  }

  /**
   * Get startedProcessingTimestamp
   * @return startedProcessingTimestamp
  */
  @ApiModelProperty(value = "")

  @Valid

  public java.sql.Timestamp getStartedProcessingTimestamp() {
    return startedProcessingTimestamp;
  }

  public void setStartedProcessingTimestamp(java.sql.Timestamp startedProcessingTimestamp) {
    this.startedProcessingTimestamp = startedProcessingTimestamp;
  }

  public PaymentAllOf status(PaymentStatus status) {
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

  public PaymentAllOf links(PaymentLinks links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
  */
  @ApiModelProperty(value = "")

  @Valid

  public PaymentLinks getLinks() {
    return links;
  }

  public void setLinks(PaymentLinks links) {
    this.links = links;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentAllOf paymentAllOf = (PaymentAllOf) o;
    return Objects.equals(this.paymentId, paymentAllOf.paymentId) &&
        Objects.equals(this.recurringPaymentId, paymentAllOf.recurringPaymentId) &&
        Objects.equals(this.processedTimestamp, paymentAllOf.processedTimestamp) &&
        Objects.equals(this.failedTimestamp, paymentAllOf.failedTimestamp) &&
        Objects.equals(this.cancelledTimestamp, paymentAllOf.cancelledTimestamp) &&
        Objects.equals(this.startedProcessingTimestamp, paymentAllOf.startedProcessingTimestamp) &&
        Objects.equals(this.status, paymentAllOf.status) &&
        Objects.equals(this.links, paymentAllOf.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentId, recurringPaymentId, processedTimestamp, failedTimestamp, cancelledTimestamp, startedProcessingTimestamp, status, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentAllOf {\n");
    
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    recurringPaymentId: ").append(toIndentedString(recurringPaymentId)).append("\n");
    sb.append("    processedTimestamp: ").append(toIndentedString(processedTimestamp)).append("\n");
    sb.append("    failedTimestamp: ").append(toIndentedString(failedTimestamp)).append("\n");
    sb.append("    cancelledTimestamp: ").append(toIndentedString(cancelledTimestamp)).append("\n");
    sb.append("    startedProcessingTimestamp: ").append(toIndentedString(startedProcessingTimestamp)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

