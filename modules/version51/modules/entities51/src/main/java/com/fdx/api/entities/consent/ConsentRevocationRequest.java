package com.fdx.api.entities.consent;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fdx.api.entities.common.PartyType;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.util.Objects;

/**
 * Details of request to revoke consent grant
 */

@Schema(name = "ConsentRevocationRequest", description = "Details of request to revoke consent grant")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-18T17:46:09.510212100+05:30[Asia/Calcutta]")
public class ConsentRevocationRequest {

  @JsonProperty("reason")
  private ConsentUpdateReason reason;

  @JsonProperty("initiator")
  private PartyType initiator;

  public ConsentRevocationRequest reason(ConsentUpdateReason reason) {
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

  public ConsentRevocationRequest initiator(PartyType initiator) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsentRevocationRequest consentRevocationRequest = (ConsentRevocationRequest) o;
    return Objects.equals(this.reason, consentRevocationRequest.reason) &&
        Objects.equals(this.initiator, consentRevocationRequest.initiator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason, initiator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsentRevocationRequest {\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    initiator: ").append(toIndentedString(initiator)).append("\n");
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