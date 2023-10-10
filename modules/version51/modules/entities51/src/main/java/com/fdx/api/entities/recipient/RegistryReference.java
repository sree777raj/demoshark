package com.fdx.api.entities.recipient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fdx.api.entities.common.Registry;
import com.vladmihalcea.hibernate.type.basic.PostgreSQLEnumType;
import io.swagger.v3.oas.annotations.media.Schema;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.Valid;
import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

/**
 * Used for registry references. In snake case to match IETF RFC 7591 naming
 * formats
 */

@Schema(name = "RegistryReference", description = "Used for registry " +
    "references. In snake case to match IETF RFC 7591 naming formats")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date =
    "2022-05-30T11:51:41.837189100+05:30[Asia/Calcutta]")
@Entity
@Table(name = "registry_reference")
@TypeDef(
    name = "pgsql_enum",
    typeClass = PostgreSQLEnumType.class
)
public class RegistryReference implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue
  @JsonIgnore
  @Type(type="org.hibernate.type.UUIDCharType")
  private UUID id;

  @JsonProperty("registered_entity_name")
  private String registeredEntityName;

  @JsonProperty("registered_entity_id")
  @Column(name = "registered_entity_id")
  private String registeredEntityId;

  @JsonProperty("registry")
  @Enumerated(EnumType.STRING)
  @Column(columnDefinition = "registry")
  @Type(type = "pgsql_enum")
  private Registry registry;

  @ManyToOne
  @JoinColumn(name = "registry_reference_mapping_id")
  @JsonIgnore
  private RegistryReferenceMapping registryReferenceMapping;

  public RegistryReference() {
  }

  public RegistryReference(String registeredEntityName,
                           String registeredEntityId, Registry registry,
                           RegistryReferenceMapping registryReferenceMapping) {
    this.registeredEntityName = registeredEntityName;
    this.registeredEntityId = registeredEntityId;
    this.registry = registry;
    this.registryReferenceMapping = registryReferenceMapping;
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public RegistryReferenceMapping getRegistryReferenceMapping() {
    return registryReferenceMapping;
  }

  public void setRegistryReferenceMapping(RegistryReferenceMapping registryReferenceMapping) {
    this.registryReferenceMapping = registryReferenceMapping;
  }

  public RegistryReference registeredEntityName(String registeredEntityName) {
    this.registeredEntityName = registeredEntityName;
    return this;
  }

  /**
   * The legal company name for the intermediary
   *
   * @return registeredEntityName
   */

  @Schema(name = "registered_entity_name", description = "The legal company " +
      "name for the intermediary", required = false)
  public String getRegisteredEntityName() {
    return registeredEntityName;
  }

  public void setRegisteredEntityName(String registeredEntityName) {
    this.registeredEntityName = registeredEntityName;
  }

  public RegistryReference registeredEntityId(String registeredEntityId) {
    this.registeredEntityId = registeredEntityId;
    return this;
  }

  /**
   * An ID representing the intermediary that can be looked up from a legal
   * identity registry source
   *
   * @return registeredEntityId
   */

  @Schema(name = "registered_entity_id", description = "An ID representing " +
      "the intermediary that can be looked up from a legal identity registry " +
      "source", required = false)
  public String getRegisteredEntityId() {
    return registeredEntityId;
  }

  public void setRegisteredEntityId(String registeredEntityId) {
    this.registeredEntityId = registeredEntityId;
  }

  public RegistryReference registry(Registry registry) {
    this.registry = registry;
    return this;
  }

  /**
   * Get registry
   *
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegistryReference registryReference = (RegistryReference) o;
    return Objects.equals(this.registeredEntityName,
        registryReference.registeredEntityName) &&
        Objects.equals(this.registeredEntityId,
            registryReference.registeredEntityId) &&
        Objects.equals(this.registry, registryReference.registry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(registeredEntityName, registeredEntityId, registry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegistryReference {\n");
    sb.append("    registeredEntityName: ").append(toIndentedString(registeredEntityName)).append("\n");
    sb.append("    registeredEntityId: ").append(toIndentedString(registeredEntityId)).append("\n");
    sb.append("    registry: ").append(toIndentedString(registry)).append("\n");
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