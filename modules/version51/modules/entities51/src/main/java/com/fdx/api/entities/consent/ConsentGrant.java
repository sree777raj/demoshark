package com.fdx.api.entities.consent;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fdx.api.entities.common.ConsentDurationType;
import com.fdx.api.entities.common.Party;
import com.fdx.api.entities.common.PartyType;
import com.vladmihalcea.hibernate.type.basic.PostgreSQLEnumType;
import io.swagger.v3.oas.annotations.media.Schema;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Record of user consent
 */

@Schema(name = "ConsentGrant", description = "Record of user consent")
@Entity
@Table(name = "consent_grant")
@TypeDef(
    name = "pgsql_enum",
    typeClass = PostgreSQLEnumType.class
)
public class ConsentGrant {

  @JsonProperty("id")
  @Column(name = "id", nullable = false)
  @Id
  private String id;

  @JsonProperty("status")
  @Enumerated(EnumType.STRING)
  @Column(columnDefinition = "consent_grant_status")
  @Type(type = "pgsql_enum")
  private ConsentGrantStatus status;

  @OneToMany(mappedBy = "consentGrant", cascade = CascadeType.ALL
      , orphanRemoval = true)
  @Valid
  @JsonProperty("parties")
  private Set<Party> parties = new HashSet<>();

  @JsonProperty("createdTime")
  @Column(name = "created_time")
  private Timestamp createdTime;

  @JsonProperty("expirationTime")
  @Column(name = "expiration_time")
  private Timestamp expirationTime;

  @JsonProperty("updatedTime")
  @Column(name = "updated_time")
  private Timestamp updatedTime;

  @JsonProperty("durationType")
  @Enumerated(EnumType.STRING)
  @Column(columnDefinition = "duration_type")
  @Type(type = "pgsql_enum")
  private ConsentDurationType durationType;

  @JsonProperty("durationPeriod")
  @Column(name = "duration_period")
  private Integer durationPeriod;

  @JsonProperty("lookbackPeriod")
  @Column(name = "lookback_period")
  private Integer lookbackPeriod;

  @OneToMany(mappedBy = "consentGrant", cascade = CascadeType.ALL
      , orphanRemoval = true)
  @Valid
  @JsonProperty("resources")
  private Set<ConsentGrantResource> resources = new HashSet<>();

  @JsonIgnore
  @Enumerated(EnumType.STRING)
  @Column(columnDefinition = "consent_update_reason")
  @Type(type = "pgsql_enum")
  private ConsentUpdateReason reason;

  @JsonIgnore
  @Enumerated(EnumType.STRING)
  @Column(columnDefinition = "party_type")
  @Type(type = "pgsql_enum")
  private PartyType initiator;

  @JsonIgnore
  @Column(name = "audit_info")
  private String auditInfo;

  public ConsentGrant id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Value for a unique identifier
   * @return id
  */
  @Size(max = 256) 
  @Schema(name = "id", description = "Value for a unique identifier", required = false)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ConsentGrant status(ConsentGrantStatus status) {
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

  public ConsentGrant parties(Set<Party> parties) {
    this.parties = parties;
    return this;
  }

  /**
   * The non-end user parties participating in the Consent Grant
   * @return parties
  */
  @Valid
  @Schema(name = "parties", description = "The non-end user parties participating in the Consent Grant", required = false)
  public Set<Party> getParties() {
    return parties;
  }

  public void setParties(Set<Party> parties) {
    this.parties = parties;
  }

  public ConsentGrant createdTime(Timestamp createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Get createdTime
   * @return createdTime
  */
  @Valid 
  @Schema(name = "createdTime", required = false)
  public Timestamp getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Timestamp createdTime) {
    this.createdTime = createdTime;
  }

  public ConsentGrant expirationTime(Timestamp expirationTime) {
    this.expirationTime = expirationTime;
    return this;
  }

  /**
   * Get expirationTime
   * @return expirationTime
  */
  @Valid 
  @Schema(name = "expirationTime", required = false)
  public Timestamp getExpirationTime() {
    return expirationTime;
  }

  public void setExpirationTime(Timestamp expirationTime) {
    this.expirationTime = expirationTime;
  }

  public ConsentGrant updatedTime(Timestamp updatedTime) {
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

  public ConsentGrant durationType(ConsentDurationType durationType) {
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

  public ConsentGrant durationPeriod(Integer durationPeriod) {
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

  public ConsentGrant lookbackPeriod(Integer lookbackPeriod) {
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

  public ConsentGrant resources(Set<ConsentGrantResource> resources) {
    this.resources = resources;
    return this;
  }

  public ConsentGrant addResourcesItem(ConsentGrantResource resourcesItem) {
    if (this.resources == null) {
      this.resources = new HashSet<>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

  /**
   * The permissioned resource entities
   * @return resources
  */
  @Valid 
  @Schema(name = "resources", description = "The permissioned resource entities", required = false)
  public Set<ConsentGrantResource> getResources() {
    return resources;
  }

  public void setResources(Set<ConsentGrantResource> resources) {
    this.resources = resources;
  }

  public ConsentGrant reason(ConsentUpdateReason reason) {
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

  public ConsentGrant initiator(PartyType initiator) {
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

  public String getAuditInfo() {
    return auditInfo;
  }

  public void setAuditInfo(String auditInfo) {
    this.auditInfo = auditInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsentGrant consentGrant = (ConsentGrant) o;
    return Objects.equals(this.id, consentGrant.id) &&
        Objects.equals(this.status, consentGrant.status) &&
        Objects.equals(this.parties, consentGrant.parties) &&
        Objects.equals(this.createdTime, consentGrant.createdTime) &&
        Objects.equals(this.expirationTime, consentGrant.expirationTime) &&
        Objects.equals(this.updatedTime, consentGrant.updatedTime) &&
        Objects.equals(this.durationType, consentGrant.durationType) &&
        Objects.equals(this.durationPeriod, consentGrant.durationPeriod) &&
        Objects.equals(this.lookbackPeriod, consentGrant.lookbackPeriod) &&
        Objects.equals(this.resources, consentGrant.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, parties, createdTime, expirationTime, updatedTime, durationType, durationPeriod, lookbackPeriod, resources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsentGrant {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    parties: ").append(toIndentedString(parties)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    expirationTime: ").append(toIndentedString(expirationTime)).append("\n");
    sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
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