package com.fdx.api.entities.recipient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fdx.api.entities.common.ConsentDurationType;
import com.vladmihalcea.hibernate.type.array.EnumArrayType;
import com.vladmihalcea.hibernate.type.array.ListArrayType;
import io.swagger.v3.oas.annotations.media.Schema;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.net.URI;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/**
 * Record of Recipient at the Provider in snake case to match IETF RFC 7591
 * naming formats
 */

@Schema(name = "Recipient", description = "Record of Recipient at the " +
    "Provider in snake case to match IETF RFC 7591 naming formats")
@Entity
@Table(name = "recipient")
@TypeDefs({
    @TypeDef(name = "list-array", typeClass = ListArrayType.class),
    @TypeDef(
        typeClass = EnumArrayType.class,
        defaultForType = ConsentDurationType[].class,
        parameters = {
            @Parameter(
                name = EnumArrayType.SQL_ARRAY_TYPE,
                value = "consent_duration_type"
            )
        }
    )
})
public class Recipient {

  @JsonProperty("client_id")
  @Column(name = "client_id")
  @Id
  private String clientId;

  @JsonProperty("client_secret")
  @Column(name = "client_secret")
  private String clientSecret;

  @JsonIgnore
  @OneToOne(targetEntity = RegistryReferenceMapping.class, cascade =
      CascadeType.ALL)
  private RegistryReferenceMapping registryReferenceMapping;

  @JsonProperty("client_name")
  @Column(name = "client_name")
  private String clientName;

  @JsonProperty("description")
  private String description;

  @JsonProperty("redirect_uris")
  @Valid
  @Type(type = "list-array")
  @Column(
      name = "redirect_uris",
      columnDefinition = "text[]"
  )
  private List<String> redirectUris = new ArrayList<>();

  @JsonProperty("logo_uri")
  @Column(name = "logo_uri")
  private String logoUri;

  @JsonProperty("client_uri")
  @Column(name = "client_uri")
  private String clientUri;

  @JsonProperty("contacts")
  @Valid
  @Type(type = "list-array")
  @Column(
      name = "contacts",
      columnDefinition = "text[]"
  )
  private List<String> contacts = null;

  @JsonProperty("scope")
  private String scope;

  @JsonProperty("duration_type")
  @Column(
      name = "duration_types",
      columnDefinition = "consent_duration_type[]"
  )
  private ConsentDurationType[] durationTypes = null;

  @JsonProperty("duration_period")
  @Column(name = "duration_period")
  private Integer durationPeriod;

  @JsonProperty("lookback_period")
  @Column(name = "lookback_period")
  private Integer lookbackPeriod;

  @JsonProperty("registry_references")
  @Transient
  private Set<RegistryReference> registryReferences = null;

  @OneToMany(mappedBy = "recipient", cascade = CascadeType.ALL
      , orphanRemoval = true, fetch = FetchType.EAGER)
  @Valid
  @JsonProperty("intermediaries")
  private Set<Intermediary> intermediaries = new HashSet<>();

  @JsonProperty("grant_types")
  @Valid
  @Type(type = "list-array")
  @Column(
      name = "grant_types",
      columnDefinition = "text[]"
  )
  private List<String> grantTypes = new ArrayList<>();

  @JsonProperty("token_endpoint_auth_method")
  @Column(name = "token_endpoint_auth_method")
  private String tokenEndpointAuthMethod;

  @JsonProperty("registration_client_uri")
  @Column(name = "registration_client_uri")
  private URI registrationClientUri;

  @JsonProperty("status")
  @Column(name = "status")
  private String status;

  @JsonProperty("registration_access_token")
  @Column(name = "registration_access_token")
  private String registrationAccessToken;

  @JsonIgnore
  @CreationTimestamp
  private LocalDateTime createDateTime;

  @JsonIgnore
  @UpdateTimestamp
  private LocalDateTime updateDateTime;

  @JsonIgnore
  @Column(name = "audit_info")
  private String auditInfo;

  public Recipient clientName(String clientName) {
    this.clientName = clientName;
    return this;
  }

  /**
   * Value for a unique identifier
   *
   * @return clientName
   */
  @NotNull
  @Size(max = 256)
  @Schema(name = "client_name", description = "Value for a unique identifier"
      , required = true)
  public String getClientName() {
    return clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }

  public RegistryReferenceMapping getRegistryReferenceMapping() {
    return registryReferenceMapping;
  }

  public void setRegistryReferenceMapping(RegistryReferenceMapping registryReferenceMapping) {
    this.registryReferenceMapping = registryReferenceMapping;
  }

  public Recipient description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A short description of the Data Recipient application
   *
   * @return description
   */

  @Schema(name = "description", description = "A short description of the " +
      "Data Recipient application", required = false)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Recipient redirectUris(List<String> redirectUris) {
    this.redirectUris = redirectUris;
    return this;
  }

  public Recipient addRedirectUrisItem(String redirectUrisItem) {
    this.redirectUris.add(redirectUrisItem);
    return this;
  }

  /**
   * An array of eligible Redirect URI targets
   *
   * @return redirectUris
   */
  @NotNull
  @Schema(name = "redirect_uris", description = "An array of eligible " +
      "Redirect URI targets", required = true)
  public List<String> getRedirectUris() {
    return redirectUris;
  }

  public void setRedirectUris(List<String> redirectUris) {
    this.redirectUris = redirectUris;
  }

  public Recipient logoUri(String logoUri) {
    this.logoUri = logoUri;
    return this;
  }

  /**
   * Data Recipient Logo URL location
   *
   * @return logoUri
   */
  @Valid
  @Schema(name = "logo_uri", description = "Data Recipient Logo URL location"
      , required = false)
  public String getLogoUri() {
    return logoUri;
  }

  public void setLogoUri(String logoUri) {
    this.logoUri = logoUri;
  }

  public Recipient clientUri(String clientUri) {
    this.clientUri = clientUri;
    return this;
  }

  /**
   * The URI which provides additional information about the Data Recipient
   *
   * @return clientUri
   */
  @Valid
  @Schema(name = "client_uri", description = "The URI which provides " +
      "additional information about the Data Recipient", required = false)
  public String getClientUri() {
    return clientUri;
  }

  public void setClientUri(String clientUri) {
    this.clientUri = clientUri;
  }

  public Recipient contacts(List<String> contacts) {
    this.contacts = contacts;
    return this;
  }

  public Recipient addContactsItem(String contactsItem) {
    if (this.contacts == null) {
      this.contacts = new ArrayList<>();
    }
    this.contacts.add(contactsItem);
    return this;
  }

  /**
   * Array of strings representing ways to contact individuals responsible
   * for the Data Recipient application
   *
   * @return contacts
   */

  @Schema(name = "contacts", description = "Array of strings representing " +
      "ways to contact individuals responsible for the Data Recipient " +
      "application", required = false)
  public List<String> getContacts() {
    return contacts;
  }

  public void setContacts(List<String> contacts) {
    this.contacts = contacts;
  }

  public Recipient scope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * String form field with a list of data clusters
   *
   * @return scope
   */

  @Schema(name = "scope", description = "String form field with a list of " +
      "data clusters", required = false)
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public Recipient durationTypes(ConsentDurationType[] durationTypes) {
    this.durationTypes = durationTypes;
    return this;
  }

  /**
   * The duration of consent for the Data Recipient consumers
   *
   * @return durationType
   */
  @Valid
  @Schema(name = "duration_types", description = "The duration of consent for " +
      "the Data Recipient consumers", required = false)
  public ConsentDurationType[] getDurationTypes() {
    return durationTypes;
  }

  public void setDurationTypes(ConsentDurationType[] durationTypes) {
    this.durationTypes = durationTypes;
  }

  public Recipient durationPeriod(Integer durationPeriod) {
    this.durationPeriod = durationPeriod;
    return this;
  }

  /**
   * The duration period is the maximum consent duration that would be
   * requested for a Recipient consumer
   *
   * @return durationPeriod
   */
  @Valid
  @Schema(name = "duration_period", description = "The duration period is the" +
      " maximum consent duration that would be requested for a Recipient " +
      "consumer", required = false)
  public Integer getDurationPeriod() {
    return durationPeriod;
  }

  public void setDurationPeriod(Integer durationPeriod) {
    this.durationPeriod = durationPeriod;
  }

  public Recipient lookbackPeriod(Integer lookbackPeriod) {
    this.lookbackPeriod = lookbackPeriod;
    return this;
  }

  /**
   * The maximum number of days allowed for Data Recipient consumers to
   * obtain in transaction history, effective from the current date
   *
   * @return lookbackPeriod
   */
  @Valid
  @Schema(name = "lookback_period", description = "The maximum number of days" +
      " allowed for Data Recipient consumers to obtain in transaction " +
      "history, effective from the current date", required = false)
  public Integer getLookbackPeriod() {
    return lookbackPeriod;
  }

  public void setLookbackPeriod(Integer lookbackPeriod) {
    this.lookbackPeriod = lookbackPeriod;
  }

  @Valid
  public Recipient registryReferences(Set<RegistryReference> registryReferences) {
    this.registryReferences = registryReferences;
    return this;
  }

  public Recipient addRegistryReferencesItem(RegistryReference registryReferencesItem) {
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

  @Valid
  public Recipient intermediaries(Set<Intermediary> intermediaries) {
    this.intermediaries = intermediaries;
    return this;
  }

  public Recipient addIntermediariesItem(Intermediary intermediariesItem) {
    if (this.intermediaries == null) {
      this.intermediaries = new HashSet<>();
    }
    this.intermediaries.add(intermediariesItem);
    return this;
  }

  /**
   * An array of the intermediaries for this data recipient
   *
   * @return intermediaries
   */
  @Schema(name = "intermediaries", description = "An array of the " +
      "intermediaries for this data recipient", required = false)
  public @Valid Set<Intermediary> getIntermediaries() {
    return intermediaries;
  }

  @Valid
  public void setIntermediaries(Set<Intermediary> intermediaries) {
    this.intermediaries = intermediaries;
  }

  public Recipient clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * OAuth 2.0 client identifier.  Unique ID representing Data Recipient and
   * Identity Chain combination
   *
   * @return clientId
   */
  @NotNull
  @Schema(name = "client_id", description = "OAuth 2.0 client identifier.  " +
      "Unique ID representing Data Recipient and Identity Chain combination",
      required = true)
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public Recipient clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

  /**
   * OAuth 2.0 client secret string
   *
   * @return clientSecret
   */

  @Schema(name = "client_secret", description = "OAuth 2.0 client secret " +
      "string", required = false)
  public String getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }

  public Recipient grantTypes(List<String> grantTypes) {
    this.grantTypes = grantTypes;
    return this;
  }

  public Recipient addGrantTypesItem(String grantTypesItem) {
    this.grantTypes.add(grantTypesItem);
    return this;
  }

  /**
   * Array of OAuth 2.0 grants made available to the Data Recipient
   *
   * @return grantTypes
   */
  @NotNull
  @Schema(name = "grant_types", description = "Array of OAuth 2.0 grants made" +
      " available to the Data Recipient", required = true)
  public List<String> getGrantTypes() {
    return grantTypes;
  }

  public void setGrantTypes(List<String> grantTypes) {
    this.grantTypes = grantTypes;
  }

  public Recipient tokenEndpointAuthMethod(String tokenEndpointAuthMethod) {
    this.tokenEndpointAuthMethod = tokenEndpointAuthMethod;
    return this;
  }

  /**
   * Requested Authentication method for Authorization Server
   *
   * @return tokenEndpointAuthMethod
   */
  @NotNull
  @Schema(name = "token_endpoint_auth_method", description = "Requested " +
      "Authentication method for Authorization Server", required = true)
  public String getTokenEndpointAuthMethod() {
    return tokenEndpointAuthMethod;
  }

  public void setTokenEndpointAuthMethod(String tokenEndpointAuthMethod) {
    this.tokenEndpointAuthMethod = tokenEndpointAuthMethod;
  }

  public Recipient registrationClientUri(URI registrationClientUri) {
    this.registrationClientUri = registrationClientUri;
    return this;
  }

  /**
   * Fully qualified URI for subsequent DCR calls (GET, PUT, DELETE) for
   * managing the Data Recipient registration
   *
   * @return registrationClientUri
   */
  @Valid
  @Schema(name = "registration_client_uri", description = "Fully qualified " +
      "URI for subsequent DCR calls (GET, PUT, DELETE) for managing the Data " +
      "Recipient registration", required = false)
  public URI getRegistrationClientUri() {
    return registrationClientUri;
  }

  public void setRegistrationClientUri(URI registrationClientUri) {
    this.registrationClientUri = registrationClientUri;
  }

  public Recipient status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Status of FDX OAuth 2.0 extension
   *
   * @return status
   */
  @NotNull
  @Schema(name = "status", description = "Status of FDX OAuth 2.0 extension",
      required = true)
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Recipient registrationAccessToken(String registrationAccessToken) {
    this.registrationAccessToken = registrationAccessToken;
    return this;
  }

  /**
   * String containing a unique DCR access token to be used in subsequent
   * operations to manage the Data Recipient
   *
   * @return registrationAccessToken
   */

  @Schema(name = "registration_access_token", description = "String " +
      "containing a unique DCR access token to be used in subsequent " +
      "operations to manage the Data Recipient", required = false)
  public String getRegistrationAccessToken() {
    return registrationAccessToken;
  }

  public void setRegistrationAccessToken(String registrationAccessToken) {
    this.registrationAccessToken = registrationAccessToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Recipient recipient = (Recipient) o;
    return Objects.equals(this.clientName, recipient.clientName) &&
        Objects.equals(this.description, recipient.description) &&
        Objects.equals(this.redirectUris, recipient.redirectUris) &&
        Objects.equals(this.logoUri, recipient.logoUri) &&
        Objects.equals(this.clientUri, recipient.clientUri) &&
        Objects.equals(this.contacts, recipient.contacts) &&
        Objects.equals(this.scope, recipient.scope) &&
        Objects.equals(this.durationTypes, recipient.durationTypes) &&
        Objects.equals(this.durationPeriod, recipient.durationPeriod) &&
        Objects.equals(this.lookbackPeriod, recipient.lookbackPeriod) &&
        Objects.equals(this.registryReferences, recipient.registryReferences) &&
        Objects.equals(this.intermediaries, recipient.intermediaries) &&
        Objects.equals(this.clientId, recipient.clientId) &&
        Objects.equals(this.clientSecret, recipient.clientSecret) &&
        Objects.equals(this.grantTypes, recipient.grantTypes) &&
        Objects.equals(this.tokenEndpointAuthMethod,
            recipient.tokenEndpointAuthMethod) &&
        Objects.equals(this.registrationClientUri,
            recipient.registrationClientUri) &&
        Objects.equals(this.status, recipient.status) &&
        Objects.equals(this.registrationAccessToken,
            recipient.registrationAccessToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientName, description, redirectUris, logoUri,
        clientUri, contacts, scope, durationTypes, durationPeriod,
        lookbackPeriod, registryReferences, intermediaries, clientId,
        clientSecret, grantTypes, tokenEndpointAuthMethod,
        registrationClientUri, status, registrationAccessToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Recipient {\n");
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    redirectUris: ").append(toIndentedString(redirectUris)).append("\n");
    sb.append("    logoUri: ").append(toIndentedString(logoUri)).append("\n");
    sb.append("    clientUri: ").append(toIndentedString(clientUri)).append(
        "\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    durationTypes: ").append(toIndentedString(durationTypes)).append("\n");
    sb.append("    durationPeriod: ").append(toIndentedString(durationPeriod)).append("\n");
    sb.append("    lookbackPeriod: ").append(toIndentedString(lookbackPeriod)).append("\n");
    sb.append("    registryReferences: ").append(toIndentedString(registryReferences)).append("\n");
    sb.append("    intermediaries: ").append(toIndentedString(intermediaries)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    grantTypes: ").append(toIndentedString(grantTypes)).append("\n");
    sb.append("    tokenEndpointAuthMethod: ").append(toIndentedString(tokenEndpointAuthMethod)).append("\n");
    sb.append("    registrationClientUri: ").append(toIndentedString(registrationClientUri)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    registrationAccessToken: ").append(toIndentedString(registrationAccessToken)).append("\n");
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

  /**
   * Get create date time
   *
   * @return create date time
   */
  public LocalDateTime getCreateDateTime() {
    return createDateTime;
  }

  /**
   * Set create date time
   *
   * @param createDateTime create date time
   */
  public void setCreateDateTime(LocalDateTime createDateTime) {
    this.createDateTime = createDateTime;
  }

  /**
   * Get update date time
   *
   * @return update date time
   */
  public LocalDateTime getUpdateDateTime() {
    return updateDateTime;
  }

  /**
   * set update date time
   *
   * @param updateDateTime update date time
   */
  public void setUpdateDateTime(LocalDateTime updateDateTime) {
    this.updateDateTime = updateDateTime;
  }

  /**
   * Get audit info
   *
   * @return audit info
   */
  public String getAuditInfo() {
    return auditInfo;
  }

  /**
   * Set audit info
   *
   * @param auditInfo audit info
   */
  public void setAuditInfo(String auditInfo) {
    this.auditInfo = auditInfo;
  }
}