package com.fdx.api.entities.consent;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.vladmihalcea.hibernate.type.array.EnumArrayType;
import com.vladmihalcea.hibernate.type.basic.PostgreSQLEnumType;
import io.swagger.v3.oas.annotations.media.Schema;
import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Entity of permissioned resources
 */

@Schema(name = "ConsentGrantResource", description = "Entity of permissioned resources")
@Entity
@Table(name = "consent_grant_resource")
@TypeDefs({
    @TypeDef(name = "pgsql_enum", typeClass = PostgreSQLEnumType.class),
    @TypeDef(
        typeClass = EnumArrayType.class,
        defaultForType = DataCluster[].class,
        parameters = {
            @Parameter(
                name = EnumArrayType.SQL_ARRAY_TYPE,
                value = "data_cluster"
            )
        }
    )
})
public class ConsentGrantResource {

  @JsonProperty("resourceType")
  @Enumerated(EnumType.STRING)
  @Column(columnDefinition = "consent_resource_type")
  @Type(type = "pgsql_enum")
  private ConsentResourceType resourceType;

  @Id
  @JsonProperty("resourceId")
  @Column(name = "resource_id")
  private String resourceId;

  @JsonProperty("dataClusters")
  @Column(
      name = "data_clusters",
      columnDefinition = "data_cluster[]"
  )
  private DataCluster[] dataClusters = null;

  @ManyToOne
  @JoinColumn(name = "consent_grant_id")
  @JsonIgnore
  private ConsentGrant consentGrant;

  public ConsentGrant getConsentGrant() {
    return consentGrant;
  }

  public void setConsentGrant(ConsentGrant consentGrant) {
    this.consentGrant = consentGrant;
  }

  public ConsentGrantResource resourceType(ConsentResourceType resourceType) {
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

  public ConsentGrantResource resourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  /**
   * Value for a unique identifier
   * @return resourceId
  */
  @NotNull @Size(max = 256) 
  @Schema(name = "resourceId", description = "Value for a unique identifier", required = true)
  public String getResourceId() {
    return resourceId;
  }

  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }

  public ConsentGrantResource dataClusters(DataCluster[] dataClusters) {
    this.dataClusters = dataClusters;
    return this;
  }

  /**
   * Names of clusters of data elements permissioned
   * @return dataClusters
  */
  @NotNull @Valid @Size(min = 1) 
  @Schema(name = "dataClusters", description = "Names of clusters of data elements permissioned", required = true)
  public DataCluster[] getDataClusters() {
    return dataClusters;
  }

  public void setDataClusters(DataCluster[] dataClusters) {
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
    ConsentGrantResource consentGrantResource = (ConsentGrantResource) o;
    return Objects.equals(this.resourceType, consentGrantResource.resourceType) &&
        Objects.equals(this.resourceId, consentGrantResource.resourceId) &&
        Objects.equals(this.dataClusters, consentGrantResource.dataClusters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceType, resourceId, dataClusters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsentGrantResource {\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
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