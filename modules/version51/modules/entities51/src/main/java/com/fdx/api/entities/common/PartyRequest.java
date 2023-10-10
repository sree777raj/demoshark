package com.fdx.api.entities.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.net.URI;
import java.util.Objects;

/**
 * FDX Participant - an entity or person that is a part of a FDX API transaction
 */

@Schema(name = "PartyRequest", description = "FDX Participant - an entity or person that is a part of a FDX API transaction")
public class PartyRequest {

  @JsonProperty("name")
  private String name;

  @JsonProperty("type")
  private PartyType type;

  @JsonProperty("homeUri")
  private URI homeUri;

  @JsonProperty("logoUri")
  private URI logoUri;

  @JsonProperty("registry")
  private Registry registry;

  @JsonProperty("registeredEntityName")
  private String registeredEntityName;

  @JsonProperty("registeredEntityId")
  private String registeredEntityId;

  public PartyRequest name(String name) {
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

  public PartyRequest type(PartyType type) {
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

  public PartyRequest homeUri(URI homeUri) {
    this.homeUri = homeUri;
    return this;
  }

  /**
   * URI for party, where an end user could learn more about the company or application involved in the data sharing chain
   * @return homeUri
  */
  @Valid 
  @Schema(name = "homeUri", description = "URI for party, where an end user could learn more about the company or application involved in the data sharing chain", required = false)
  public URI getHomeUri() {
    return homeUri;
  }

  public void setHomeUri(URI homeUri) {
    this.homeUri = homeUri;
  }

  public PartyRequest logoUri(URI logoUri) {
    this.logoUri = logoUri;
    return this;
  }

  /**
   * URI for a logo asset to be displayed to the end user
   * @return logoUri
  */
  @Valid 
  @Schema(name = "logoUri", description = "URI for a logo asset to be displayed to the end user", required = false)
  public URI getLogoUri() {
    return logoUri;
  }

  public void setLogoUri(URI logoUri) {
    this.logoUri = logoUri;
  }

  public PartyRequest registry(Registry registry) {
    this.registry = registry;
    return this;
  }

  /**
   * Get registry
   * @return registry
  */
  @Valid 
  @Schema(name = "registry", required = false)
  public Registry getRegistry() {
    return registry;
  }

  public void setRegistry(Registry registry) {
    this.registry = registry;
  }

  public PartyRequest registeredEntityName(String registeredEntityName) {
    this.registeredEntityName = registeredEntityName;
    return this;
  }

  /**
   * Registered name of party
   * @return registeredEntityName
  */
  
  @Schema(name = "registeredEntityName", description = "Registered name of party", required = false)
  public String getRegisteredEntityName() {
    return registeredEntityName;
  }

  public void setRegisteredEntityName(String registeredEntityName) {
    this.registeredEntityName = registeredEntityName;
  }

  public PartyRequest registeredEntityId(String registeredEntityId) {
    this.registeredEntityId = registeredEntityId;
    return this;
  }

  /**
   * Registered id of party
   * @return registeredEntityId
  */
  
  @Schema(name = "registeredEntityId", description = "Registered id of party", required = false)
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
    PartyRequest party = (PartyRequest) o;
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
    sb.append("class PartyRequest {\n");
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