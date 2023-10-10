package com.fdx.api.entities.recipient;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fdx.api.entities.common.ConsentDurationType;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Used to request a recipient registration. In snake case to match IETF RFC
 * 7591 naming formats
 */

@Schema(name = "RecipientRequest", description = "Used to request a recipient" +
    " registration. In snake case to match IETF RFC 7591 naming formats")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date =
    "2022-05-30T11:51:41.837189100+05:30[Asia/Calcutta]")
public class RecipientRequest {

  @JsonProperty("client_name")
  private String clientName;

  @JsonProperty("description")
  private String description;

  @JsonProperty("redirect_uris")
  @Valid
  private List<String> redirectUris = new ArrayList<>();

  @JsonProperty("logo_uri")
  private String logoUri;

  @JsonProperty("client_uri")
  private String clientUri;

  @JsonProperty("contacts")
  @Valid
  private List<String> contacts = new ArrayList<>();

  @JsonProperty("scope")
  private String scope;

  @JsonProperty("duration_type")
  private ConsentDurationType[] durationTypes = null;

  @JsonProperty("duration_period")
  private Integer durationPeriod;

  @JsonProperty("lookback_period")
  private Integer lookbackPeriod;

  @JsonProperty("registry_references")
  @Valid
  private List<RegistryReference> registryReferences = null;

  @JsonProperty("intermediaries")
  @Valid
  private List<Intermediary> intermediaries = null;

  @JsonProperty("client_id")
  private String clientId;

  @JsonProperty("client_secret")
  private String clientSecret;

  @JsonProperty("grant_types")
  @Valid
  private List<String> grantTypes = new ArrayList<>();

  @JsonProperty("token_endpoint_auth_method")
  private String tokenEndpointAuthMethod;

  @JsonProperty("registration_client_uri")
  private URI registrationClientUri;

  @JsonProperty("status")
  private String status;

  @JsonProperty("registration_access_token")
  private String registrationAccessToken;

  public RecipientRequest clientName(String clientName) {
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

  public RecipientRequest description(String description) {
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

  public RecipientRequest redirectUris(List<String> redirectUris) {
    this.redirectUris = redirectUris;
    return this;
  }

  public RecipientRequest addRedirectUrisItem(String redirectUrisItem) {
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

  public RecipientRequest logoUri(String logoUri) {
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

  public RecipientRequest clientUri(String clientUri) {
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

  public RecipientRequest contacts(List<String> contacts) {
    this.contacts = new ArrayList<>(contacts);
    return this;
  }

  public RecipientRequest addContactsItem(String contactsItem) {
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
    return new ArrayList<>(contacts);
  }

  public void setContacts(List<String> contacts) {
    this.contacts = new ArrayList<>(contacts);
  }

  public RecipientRequest scope(String scope) {
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

  public RecipientRequest durationTypes(ConsentDurationType[] durationTypes) {
    this.durationTypes = durationTypes;
    return this;
  }

  /**
   * The duration of consent for the Data Recipient consumers
   *
   * @return durationType
   */
  @Valid
  @Schema(name = "duration_types", description = "The duration of consent for" +
      " " +
      "the Data Recipient consumers", required = false)
  public ConsentDurationType[] getDurationTypes() {
    return durationTypes;
  }

  public void setDurationTypes(ConsentDurationType[] durationTypes) {
    this.durationTypes = durationTypes;
  }

  public RecipientRequest durationPeriod(Integer durationPeriod) {
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

  public RecipientRequest lookbackPeriod(Integer lookbackPeriod) {
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

  public RecipientRequest registryReferences(List<RegistryReference> registryReferences) {
    this.registryReferences = registryReferences;
    return this;
  }

  public RecipientRequest addRegistryReferencesItem(RegistryReference registryReferencesItem) {
    if (this.registryReferences == null) {
      this.registryReferences = new ArrayList<>();
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
  @Valid
  @Schema(name = "registry_references", description = "An array of external " +
      "registries containing registered entity name, registered entity id and" +
      " registry fields for the registries where the data recipient is " +
      "registered", required = false)
  public List<RegistryReference> getRegistryReferences() {
    return registryReferences;
  }

  public void setRegistryReferences(List<RegistryReference> registryReferences) {
    this.registryReferences = registryReferences;
  }

  public RecipientRequest intermediaries(List<Intermediary> intermediaries) {
    this.intermediaries = intermediaries;
    return this;
  }

  public RecipientRequest addIntermediariesItem(Intermediary intermediariesItem) {
    if (this.intermediaries == null) {
      this.intermediaries = new ArrayList<>();
    }
    this.intermediaries.add(intermediariesItem);
    return this;
  }

  /**
   * An array of the intermediaries for this data recipient
   *
   * @return intermediaries
   */
  @Valid
  @Schema(name = "intermediaries", description = "An array of the " +
      "intermediaries for this data recipient", required = false)
  public List<Intermediary> getIntermediaries() {
    return intermediaries;
  }

  public void setIntermediaries(List<Intermediary> intermediaries) {
    this.intermediaries = intermediaries;
  }

  public RecipientRequest clientId(String clientId) {
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

  public RecipientRequest clientSecret(String clientSecret) {
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

  public RecipientRequest grantTypes(List<String> grantTypes) {
    this.grantTypes = grantTypes;
    return this;
  }

  public RecipientRequest addGrantTypesItem(String grantTypesItem) {
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

  public RecipientRequest tokenEndpointAuthMethod(String tokenEndpointAuthMethod) {
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

  public RecipientRequest registrationClientUri(URI registrationClientUri) {
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

  public RecipientRequest status(String status) {
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

  public RecipientRequest registrationAccessToken(String registrationAccessToken) {
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
    RecipientRequest recipientRequest = (RecipientRequest) o;
    return Objects.equals(this.clientName, recipientRequest.clientName) &&
        Objects.equals(this.description, recipientRequest.description) &&
        Objects.equals(this.redirectUris, recipientRequest.redirectUris) &&
        Objects.equals(this.logoUri, recipientRequest.logoUri) &&
        Objects.equals(this.clientUri, recipientRequest.clientUri) &&
        Objects.equals(this.contacts, recipientRequest.contacts) &&
        Objects.equals(this.scope, recipientRequest.scope) &&
        Objects.equals(this.durationTypes, recipientRequest.durationTypes) &&
        Objects.equals(this.durationPeriod, recipientRequest.durationPeriod) &&
        Objects.equals(this.lookbackPeriod, recipientRequest.lookbackPeriod) &&
        Objects.equals(this.registryReferences,
            recipientRequest.registryReferences) &&
        Objects.equals(this.intermediaries, recipientRequest.intermediaries) &&
        Objects.equals(this.clientId, recipientRequest.clientId) &&
        Objects.equals(this.clientSecret, recipientRequest.clientSecret) &&
        Objects.equals(this.grantTypes, recipientRequest.grantTypes) &&
        Objects.equals(this.tokenEndpointAuthMethod,
            recipientRequest.tokenEndpointAuthMethod) &&
        Objects.equals(this.registrationClientUri,
            recipientRequest.registrationClientUri) &&
        Objects.equals(this.status, recipientRequest.status) &&
        Objects.equals(this.registrationAccessToken,
            recipientRequest.registrationAccessToken);
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
    sb.append("class RecipientRequest {\n");
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    redirectUris: ").append(toIndentedString(redirectUris)).append("\n");
    sb.append("    logoUri: ").append(toIndentedString(logoUri)).append("\n");
    sb.append("    clientUri: ").append(toIndentedString(clientUri)).append(
        "\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    durationType: ").append(toIndentedString(durationTypes)).append("\n");
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
}

