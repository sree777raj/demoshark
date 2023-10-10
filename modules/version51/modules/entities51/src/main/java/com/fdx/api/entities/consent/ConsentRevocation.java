package com.fdx.api.entities.consent;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fdx.api.entities.common.PartyType;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * Details of request to revoke consent grant
 */

@Schema(name = "ConsentRevocation", description = "Details of request to revoke consent grant")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-18T17:46:09.510212100+05:30[Asia/Calcutta]")
public class ConsentRevocation {

  @JsonProperty("status")
  private ConsentGrantStatus status;

  @JsonProperty("reason")
  private ConsentUpdateReason reason;

  @JsonProperty("initiator")
  private PartyType initiator;

  @JsonProperty("updatedTime")
  private Timestamp updatedTime;

  public ConsentRevocation status(ConsentGrantStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @Valid 
  @Schema(name = "status", required = false)
  public ConsentGrantStatus getStatus() {
    return status;
  }

  public void setStatus(ConsentGrantStatus status) {
    this.status = status;
  }

  public ConsentRevocation reason(ConsentUpdateReason reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Get reason
   * @return reason
  */
  @Valid 
  @Schema(name = "reason", required = false)
  public ConsentUpdateReason getReason() {
    return reason;
  }

  public void setReason(ConsentUpdateReason reason) {
    this.reason = reason;
  }

  public ConsentRevocation initiator(PartyType initiator) {
    this.initiator = initiator;
    return this;
  }

  /**
   * Get initiator
   * @return initiator
  */
  @Valid 
  @Schema(name = "initiator", required = false)
  public PartyType getInitiator() {
    return initiator;
  }

  public void setInitiator(PartyType initiator) {
    this.initiator = initiator;
  }

  public ConsentRevocation updatedTime(Timestamp updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

  /**
   * Get updatedTime
   * @return updatedTime
  */
  @Valid 
  @Schema(name = "updatedTime", required = false)
  public Timestamp getUpdatedTime() {
    return updatedTime;
  }

  public void setUpdatedTime(Timestamp updatedTime) {
    this.updatedTime = updatedTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsentRevocation consentRevocation = (ConsentRevocation) o;
    return Objects.equals(this.status, consentRevocation.status) &&
        Objects.equals(this.reason, consentRevocation.reason) &&
        Objects.equals(this.initiator, consentRevocation.initiator) &&
        Objects.equals(this.updatedTime, consentRevocation.updatedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, reason, initiator, updatedTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsentRevocation {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    initiator: ").append(toIndentedString(initiator)).append("\n");
    sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
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