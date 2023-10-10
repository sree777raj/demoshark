package com.fdx.api.entities.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fdx.api.entities.consent.ConsentGrant;
import com.vladmihalcea.hibernate.type.basic.PostgreSQLEnumType;
import io.swagger.v3.oas.annotations.media.Schema;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

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
import java.util.Objects;

/**
 * Details on the non-end user parties in the Consent Grant. Includes the legal entity operating branded products or services in the data sharing chain. Descriptive information is collected during Data Recipient registration at Data Provider, and populated during issuance by Data Provider from its registry
 */

@Schema(name = "Party", description = "Details on the non-end user parties in the Consent Grant. Includes the legal entity operating branded products or services in the data sharing chain. Descriptive information is collected during Data Recipient registration at Data Provider, and populated during issuance by Data Provider from its registry")
@Entity
@Table(name = "party")
@TypeDef(
    name = "pgsql_enum",
    typeClass = PostgreSQLEnumType.class
)
public class Party {

  @JsonProperty("registeredEntityId")
  @Column(name = "registered_entity_id", nullable = false)
  @Id
  private String registeredEntityId;

  @JsonProperty("name")
  @Column(name = "name")
  private String name;

  @JsonProperty("type")
  @Enumerated(EnumType.STRING)
  @Column(columnDefinition = "party_type")
  @Type(type = "pgsql_enum")
  private PartyType type;

  @JsonProperty("homeUri")
  @Column(name = "home_uri")
  private String homeUri;

  @JsonProperty("logoUri")
  @Column(name = "logo_uri")
  private String logoUri;

  @JsonProperty("registry")
  @Enumerated(EnumType.STRING)
  @Column(columnDefinition = "registry")
  @Type(type = "pgsql_enum")
  private Registry registry;

  @JsonProperty("registeredEntityName")
  @Column(name = "registered_entity_name")
  private String registeredEntityName;

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

  public Party name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Human recognizable common name
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Human recognizable common name", required = true)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Party type(PartyType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @NotNull @Valid 
  @Schema(name = "type", required = true)
  public PartyType getType() {
    return type;
  }

  public void setType(PartyType type) {
    this.type = type;
  }

  public Party homeUri(String homeUri) {
    this.homeUri = homeUri;
    return this;
  }

  /**
   * URI for party, where an end user could learn more about the company or application involved in the data sharing chain
   * @return homeUri
  */
  @NotNull @Valid 
  @Schema(name = "homeUri", description = "URI for party, where an end user could learn more about the company or application involved in the data sharing chain", required = true)
  public String getHomeUri() {
    return homeUri;
  }

  public void setHomeUri(String homeUri) {
    this.homeUri = homeUri;
  }

  public Party logoUri(String logoUri) {
    this.logoUri = logoUri;
    return this;
  }

  /**
   * URI for a logo asset to be displayed to the end user
   * @return logoUri
  */
  @Valid 
  @Schema(name = "logoUri", description = "URI for a logo asset to be displayed to the end user", required = false)
  public String getLogoUri() {
    return logoUri;
  }

  public void setLogoUri(String logoUri) {
    this.logoUri = logoUri;
  }

  public Party registry(Registry registry) {
    this.registry = registry;
    return this;
  }

  /**
   * Get registry
   * @return registry
  */
  @NotNull @Valid 
  @Schema(name = "registry", required = true)
  public Registry getRegistry() {
    return registry;
  }

  public void setRegistry(Registry registry) {
    this.registry = registry;
  }

  public Party registeredEntityName(String registeredEntityName) {
    this.registeredEntityName = registeredEntityName;
    return this;
  }

  /**
   * Registered name of party
   * @return registeredEntityName
  */
  @NotNull 
  @Schema(name = "registeredEntityName", description = "Registered name of party", required = true)
  public String getRegisteredEntityName() {
    return registeredEntityName;
  }

  public void setRegisteredEntityName(String registeredEntityName) {
    this.registeredEntityName = registeredEntityName;
  }

  public Party registeredEntityId(String registeredEntityId) {
    this.registeredEntityId = registeredEntityId;
    return this;
  }

  /**
   * Registered id of party
   * @return registeredEntityId
  */
  @NotNull 
  @Schema(name = "registeredEntityId", description = "Registered id of party", required = true)
  public String getRegisteredEntityId() {
    return registeredEntityId;
  }

  public void setRegisteredEntityId(String registeredEntityId) {
    this.registeredEntityId = registeredEntityId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Party party = (Party) o;
    return Objects.equals(this.name, party.name) &&
        Objects.equals(this.type, party.type) &&
        Objects.equals(this.homeUri, party.homeUri) &&
        Objects.equals(this.logoUri, party.logoUri) &&
        Objects.equals(this.registry, party.registry) &&
        Objects.equals(this.registeredEntityName, party.registeredEntityName) &&
        Objects.equals(this.registeredEntityId, party.registeredEntityId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, homeUri, logoUri, registry, registeredEntityName, registeredEntityId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Party {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    homeUri: ").append(toIndentedString(homeUri)).append("\n");
    sb.append("    logoUri: ").append(toIndentedString(logoUri)).append("\n");
    sb.append("    registry: ").append(toIndentedString(registry)).append("\n");
    sb.append("    registeredEntityName: ").append(toIndentedString(registeredEntityName)).append("\n");
    sb.append("    registeredEntityId: ").append(toIndentedString(registeredEntityId)).append("\n");
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