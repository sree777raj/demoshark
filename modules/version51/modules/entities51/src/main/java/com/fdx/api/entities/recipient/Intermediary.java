package com.fdx.api.entities.recipient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.vladmihalcea.hibernate.type.array.ListArrayType;
import io.swagger.v3.oas.annotations.media.Schema;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

/**
 * Data Access Platform, Service Provider, or any other entity in the data
 * sharing chain between a Data Provider to a Data Recipient. In snake case
 * to match IETF RFC 7591 naming formats
 */

@Schema(name = "Intermediary", description = "Data Access Platform, Service " +
    "Provider, or any other entity in the data sharing chain between a Data " +
    "Provider to a Data Recipient. In snake case to match IETF RFC 7591 " +
    "naming formats")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date =
    "2022-05-30T11:51:41.837189100+05:30[Asia/Calcutta]")
@Entity
@Table(name = "intermediary", uniqueConstraints =
@UniqueConstraint(columnNames = "name"))
@TypeDefs({
    @TypeDef(name = "list-array", typeClass = ListArrayType.class)
})
public class Intermediary {

  @Id
  @GeneratedValue
  @JsonIgnore
  @Type(type="org.hibernate.type.UUIDCharType")
  private UUID id;

  @JsonIgnore
  @OneToOne(targetEntity = RegistryReferenceMapping.class, cascade =
      CascadeType.ALL)
  private RegistryReferenceMapping registryReferenceMapping;

  @ManyToOne
  @JoinColumn(name = "client_id")
  @JsonIgnore
  private Recipient recipient;

  @JsonProperty("registry_references")
  @Transient
  private Set<RegistryReference> registryReferences = null;

  @JsonProperty("name")
  private String name;

  @JsonProperty("description")
  private String description;

  @JsonProperty("uri")
  private String uri;

  @JsonProperty("logo_uri")
  @Column(name = "logo_uri")
  private String logoUri;

  @JsonProperty("contacts")
  @Valid
  @Type(type = "list-array")
  @Column(
      name = "contacts",
      columnDefinition = "text[]"
  )
  private List<String> contacts = new ArrayList<>();

  public Intermediary() {
  }

  public Intermediary(String name, String description, String uri,
                      String logoUri,
                      List<String> contacts, Recipient recipient) {
    this.name = name;
    this.description = description;
    this.uri = uri;
    this.logoUri = logoUri;
    this.contacts = contacts;
    this.recipient = recipient;
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Recipient getRecipient() {
    return recipient;
  }

  public void setRecipient(Recipient recipient) {
    this.recipient = recipient;
  }

  public RegistryReferenceMapping getRegistryReferenceMapping() {
    return registryReferenceMapping;
  }

  public void setRegistryReferenceMapping(RegistryReferenceMapping registryReferenceMapping) {
    this.registryReferenceMapping = registryReferenceMapping;
  }

  public Intermediary name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of intermediary party
   *
   * @return name
   */

  @Schema(name = "name", description = "Name of intermediary party",
      required = false)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Intermediary description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A short description of the intermediary
   *
   * @return description
   */

  @Schema(name = "description", description = "A short description of the " +
      "intermediary", required = false)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Intermediary uri(String uri) {
    this.uri = uri;
    return this;
  }

  /**
   * A URL string of a web page providing information about the intermediary
   *
   * @return uri
   */
  @Valid
  @Schema(name = "uri", description = "A URL string of a web page providing " +
      "information about the intermediary", required = false)
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public Intermediary logoUri(String logoUri) {
    this.logoUri = logoUri;
    return this;
  }

  /**
   * A URL string that references a logo for this intermediary
   *
   * @return logoUri
   */
  @Valid
  @Schema(name = "logo_uri", description = "A URL string that references a " +
      "logo for this intermediary", required = false)
  public String getLogoUri() {
    return logoUri;
  }

  public void setLogoUri(String logoUri) {
    this.logoUri = logoUri;
  }

  public Intermediary contacts(List<String> contacts) {
    this.contacts = new ArrayList<>(contacts);
    return this;
  }

  public Intermediary addContactsItem(String contactsItem) {
    if (this.contacts == null) {
      this.contacts = new ArrayList<>();
    }
    this.contacts.add(contactsItem);
    return this;
  }

  /**
   * Array of strings representing ways to contact people responsible for
   * this intermediary
   *
   * @return contacts
   */

  @Schema(name = "contacts", description = "Array of strings representing " +
      "ways to contact people responsible for this intermediary", required =
      false)
  public List<String> getContacts() {
    return new ArrayList<>(contacts);
  }

  public void setContacts(List<String> contacts) {
    this.contacts = new ArrayList<>(contacts);
  }

  @Valid
  public Intermediary registryReferences(Set<RegistryReference> registryReferences) {
    this.registryReferences = registryReferences;
    return this;
  }

  public Intermediary addRegistryReferencesItem(RegistryReference registryReferencesItem) {
    if (this.registryReferences == null) {
      this.registryReferences = new HashSet<>();
    }
    this.registryReferences.add(registryReferencesItem);
    return this;
  }

  /**
   * An array of external registries containing registered entity name,
   * registered entity id and registry fields for the registries where the
   * data recipient is registered
   *
   * @return registryReferences
   */
  @Schema(name = "registry_references", description = "An array of external " +
      "registries containing registered entity name, registered entity id and" +
      " registry fields for the registries where the data recipient is " +
      "registered", required = false)
  @Valid
  public Set<RegistryReference> getRegistryReferences() {
    return registryReferences;
  }

  @Valid
  public void setRegistryReferences(Set<RegistryReference> registryReferences) {
    this.registryReferences = registryReferences;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Intermediary intermediary = (Intermediary) o;
    return Objects.equals(this.name, intermediary.name) &&
        Objects.equals(this.description, intermediary.description) &&
        Objects.equals(this.uri, intermediary.uri) &&
        Objects.equals(this.logoUri, intermediary.logoUri) &&
        Objects.equals(this.contacts, intermediary.contacts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, uri, logoUri, contacts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Intermediary {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    logoUri: ").append(toIndentedString(logoUri)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
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