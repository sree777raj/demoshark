package com.fdx.api.entities.consent;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fdx.api.entities.common.ConsentDurationType;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Details of request to create new consent grant. This schema is to be used in POST request to Data Provider’s &#39;POST /par&#39; endpoint using the Pushed Authorization Request (PAR) method
 */

@Schema(name = "ConsentRequest", description = "Details of request to create new consent grant. This schema is to be used in POST request to Data Provider’s 'POST /par' endpoint using the Pushed Authorization Request (PAR) method")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-18T17:46:09.510212100+05:30[Asia/Calcutta]")
public class ConsentRequest {

  @JsonProperty("durationType")
  private ConsentDurationType durationType;

  @JsonProperty("durationPeriod")
  private Integer durationPeriod;

  @JsonProperty("lookbackPeriod")
  private Integer lookbackPeriod;

  @JsonProperty("resources")
  @Valid
  private List<ConsentRequestedResource> resources = null;

  public ConsentRequest durationType(ConsentDurationType durationType) {
    this.durationType = durationType;
    return this;
  }

  /**
   * Get durationType
   * @return durationType
  */
  @Valid 
  @Schema(name = "durationType", required = false)
  public ConsentDurationType getDurationType() {
    return durationType;
  }

  public void setDurationType(ConsentDurationType durationType) {
    this.durationType = durationType;
  }

  public ConsentRequest durationPeriod(Integer durationPeriod) {
    this.durationPeriod = durationPeriod;
    return this;
  }

  /**
   * Consent duration, in days, from day of original grant
   * @return durationPeriod
  */
  
  @Schema(name = "durationPeriod", description = "Consent duration, in days, from day of original grant", required = false)
  public Integer getDurationPeriod() {
    return durationPeriod;
  }

  public void setDurationPeriod(Integer durationPeriod) {
    this.durationPeriod = durationPeriod;
  }

  public ConsentRequest lookbackPeriod(Integer lookbackPeriod) {
    this.lookbackPeriod = lookbackPeriod;
    return this;
  }

  /**
   * Period, in days, for which historical data may be requested; period is measured from request time, not grant time
   * @return lookbackPeriod
  */
  
  @Schema(name = "lookbackPeriod", description = "Period, in days, for which historical data may be requested; period is measured from request time, not grant time", required = false)
  public Integer getLookbackPeriod() {
    return lookbackPeriod;
  }

  public void setLookbackPeriod(Integer lookbackPeriod) {
    this.lookbackPeriod = lookbackPeriod;
  }

  public ConsentRequest resources(List<ConsentRequestedResource> resources) {
    this.resources = resources;
    return this;
  }

  public ConsentRequest addResourcesItem(ConsentRequestedResource resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

  /**
   * The requested resource entities
   * @return resources
  */
  @Valid 
  @Schema(name = "resources", description = "The requested resource entities", required = false)
  public List<ConsentRequestedResource> getResources() {
    return resources;
  }

  public void setResources(List<ConsentRequestedResource> resources) {
    this.resources = resources;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsentRequest consentRequest = (ConsentRequest) o;
    return Objects.equals(this.durationType, consentRequest.durationType) &&
        Objects.equals(this.durationPeriod, consentRequest.durationPeriod) &&
        Objects.equals(this.lookbackPeriod, consentRequest.lookbackPeriod) &&
        Objects.equals(this.resources, consentRequest.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(durationType, durationPeriod, lookbackPeriod, resources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsentRequest {\n");
    sb.append("    durationType: ").append(toIndentedString(durationType)).append("\n");
    sb.append("    durationPeriod: ").append(toIndentedString(durationPeriod)).append("\n");
    sb.append("    lookbackPeriod: ").append(toIndentedString(lookbackPeriod)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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