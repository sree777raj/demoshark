package com.fdx.api.entities.fraud;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fdx.api.entities.common.FiAttributeRequest;
import com.fdx.api.entities.common.PartyRequest;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Notification of suspected fraud
 */

@Schema(name = "SuspectedFraudIncidentRequest", description = "Notification of suspected fraud")
public class SuspectedFraudIncidentRequest {

  @JsonProperty("type")
  private String type;

  @JsonProperty("incidentId")
  private String incidentId;

  @JsonProperty("reason")
  private String reason;

  @JsonProperty("fiAttributes")
  private Set<FiAttributeRequest> fiAttributes = new HashSet<>();

  @JsonProperty("reporter")
  private PartyRequest reporter;

  public SuspectedFraudIncidentRequest type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Extensible string enum identifying the type of suspected fraud. Initially this will always be set to \"ACCOUNT_TAKEOVER\". Additional values may be defined in the future.
   * @return type
   */
  @Size(min = 1, max = 256)
  @Schema(name = "type", example = "ACCOUNT_TAKEOVER", description = "Extensible string enum identifying the type of suspected fraud. Initially this will always be set to \"ACCOUNT_TAKEOVER\". Additional values may be defined in the future.", required = false)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public SuspectedFraudIncidentRequest incidentId(String incidentId) {
    this.incidentId = incidentId;
    return this;
  }

  /**
   * Unique identifier for the fraud incident.
   * @return incidentId
   */
  @Size(min = 1, max = 256)
  @Schema(name = "incidentId", example = "0a318518-ca16-4e66-be76-865a632ea771", description = "Unique identifier for the fraud incident.", required = false)
  public String getIncidentId() {
    return incidentId;
  }

  public void setIncidentId(String incidentId) {
    this.incidentId = incidentId;
  }

  public SuspectedFraudIncidentRequest reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Free text justification for suspected fraud
   * @return reason
   */
  @Size(min = 1, max = 256)
  @Schema(name = "reason", example = "User submitted identity data did not match account", description = "Free text justification for suspected fraud", required = false)
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public SuspectedFraudIncidentRequest fiAttributes(Set<FiAttributeRequest> fiAttributes) {
    this.fiAttributes = fiAttributes;
    return this;
  }

  public SuspectedFraudIncidentRequest addFiAttributesItem(FiAttributeRequest fiAttributesItem) {
    if (this.fiAttributes == null) {
      this.fiAttributes = new HashSet<>();
    }
    this.fiAttributes.add(fiAttributesItem);
    return this;
  }

  /**
   * Array of financial institution-specific attributes. Can be used to provide additional structured context on the suspected fraud for the FI to use in determining a resolution.
   * @return fiAttributes
   */
  @Schema(name = "fiAttributes", description = "Array of financial institution-specific attributes. Can be used to provide additional structured context on the suspected fraud for the FI to use in determining a resolution.", required = false)
  public Set<FiAttributeRequest> getFiAttributes() {
    return fiAttributes;
  }

  public void setFiAttributes(Set<FiAttributeRequest> fiAttributes) {
    this.fiAttributes = fiAttributes;
  }

  public SuspectedFraudIncidentRequest reporter(PartyRequest reporter) {
    this.reporter = reporter;
    return this;
  }

  /**
   * Get reporter
   * @return reporter
   */
  @Schema(name = "reporter", required = false)
  public PartyRequest getReporter() {
    return reporter;
  }

  public void setReporter(PartyRequest reporter) {
    this.reporter = reporter;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuspectedFraudIncidentRequest suspectedFraudIncidentRequest = (SuspectedFraudIncidentRequest) o;
    return Objects.equals(this.type, suspectedFraudIncidentRequest.type) &&
        Objects.equals(this.incidentId, suspectedFraudIncidentRequest.incidentId) &&
        Objects.equals(this.reason, suspectedFraudIncidentRequest.reason) &&
        Objects.equals(this.fiAttributes, suspectedFraudIncidentRequest.fiAttributes) &&
        Objects.equals(this.reporter, suspectedFraudIncidentRequest.reporter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, incidentId, reason, fiAttributes, reporter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuspectedFraudIncidentRequest {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    incidentId: ").append(toIndentedString(incidentId)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    fiAttributes: ").append(toIndentedString(fiAttributes)).append("\n");
    sb.append("    reporter: ").append(toIndentedString(reporter)).append("\n");
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
