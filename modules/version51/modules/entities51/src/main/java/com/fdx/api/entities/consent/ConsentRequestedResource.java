package com.fdx.api.entities.consent;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Details of requested resource and data clusters
 */

@Schema(name = "ConsentRequestedResource", description = "Details of requested resource and data clusters")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-18T17:46:09.510212100+05:30[Asia/Calcutta]")
public class ConsentRequestedResource {

  @JsonProperty("resourceType")
  private ConsentResourceType resourceType;

  @JsonProperty("dataClusters")
  @Valid
  private List<DataCluster> dataClusters = new ArrayList<>();

  public ConsentRequestedResource resourceType(ConsentResourceType resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * Get resourceType
   * @return resourceType
  */
  @NotNull @Valid 
  @Schema(name = "resourceType", required = true)
  public ConsentResourceType getResourceType() {
    return resourceType;
  }

  public void setResourceType(ConsentResourceType resourceType) {
    this.resourceType = resourceType;
  }

  public ConsentRequestedResource dataClusters(List<DataCluster> dataClusters) {
    this.dataClusters = dataClusters;
    return this;
  }

  public ConsentRequestedResource addDataClustersItem(DataCluster dataClustersItem) {
    this.dataClusters.add(dataClustersItem);
    return this;
  }

  /**
   * Names of clusters of data elements requested
   * @return dataClusters
  */
  @NotNull @Valid @Size(min = 1) 
  @Schema(name = "dataClusters", description = "Names of clusters of data elements requested", required = true)
  public List<DataCluster> getDataClusters() {
    return dataClusters;
  }

  public void setDataClusters(List<DataCluster> dataClusters) {
    this.dataClusters = dataClusters;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsentRequestedResource consentRequestedResource = (ConsentRequestedResource) o;
    return Objects.equals(this.resourceType, consentRequestedResource.resourceType) &&
        Objects.equals(this.dataClusters, consentRequestedResource.dataClusters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceType, dataClusters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsentRequestedResource {\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    dataClusters: ").append(toIndentedString(dataClusters)).append("\n");
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