package com.fdx.api.entities.registry.recipient;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fdx.api.entities.common.ConsentDurationType;
import com.fdx.api.entities.recipient.Intermediary;
import com.fdx.api.entities.recipient.RegistryReference;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Record of Registry Recipient at the Ecosystem Registry in snake case to match IETF RFC 7591 naming formats
 */
@Schema(name = "Recipient", description = "Record of Recipient at the Ecosystem Registry in snake case to match IETF RFC 7591 naming formats")
public class RegistryRecipientDTO {

  @JsonProperty("recipient_id")
  private String recipientId;

  @JsonProperty("client_name")
  private String clientName;

  @JsonProperty("description")
  private String description;

  @JsonProperty("redirect_uris")
  @Valid
  private List<String> redirectUris = new ArrayList<>();

  @JsonProperty("logo_uri")
  private URI logoUri;

  @JsonProperty("client_uri")
  private URI clientUri;

  @JsonProperty("contacts")
  @Valid
  private List<String> contacts = null;

  @JsonProperty("scope")
  private String scope;

  @JsonProperty("duration_type")
  @Valid
  private List<ConsentDurationType> durationType = null;

  @JsonProperty("duration_period")
  private BigDecimal durationPeriod;

  @JsonProperty("lookback_period")
  private BigDecimal lookbackPeriod;

  @JsonProperty("registry_references")
  @Valid
  private List<RegistryReference> registryReferences = null;

  @JsonProperty("intermediaries")
  @Valid
  private List<Intermediary> intermediaries = null;

  public RegistryRecipientDTO() {
  }

  public RegistryRecipientDTO(String clientName, String description, List<String> redirectUris,
                              URI logoUri, URI clientUri, List<String> contacts, String scope,
                              List<ConsentDurationType> durationType, BigDecimal durationPeriod,
                              BigDecimal lookbackPeriod, List<RegistryReference> registryReferences,
                              List<Intermediary> intermediaries, String recipientId) {
    this.clientName = clientName;
    this.description = description;
    this.redirectUris = redirectUris;
    this.logoUri = logoUri;
    this.clientUri = clientUri;
    this.contacts = contacts;
    this.scope = scope;
    this.durationType = durationType;
    this.durationPeriod = durationPeriod;
    this.lookbackPeriod = lookbackPeriod;
    this.registryReferences = registryReferences;
    this.intermediaries = intermediaries;
    this.recipientId = recipientId;
  }

  public RegistryRecipientDTO clientName(String clientName) {
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
  @Schema(name = "client_name", description = "Value for a unique identifier", required = true)
  public String getClientName() {
    return clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }

  public RegistryRecipientDTO description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A short description of the Data Recipient application
   *
   * @return description
   */

  @Schema(name = "description", description = "A short description of the Data Recipient application", required = false)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public RegistryRecipientDTO redirectUris(List<String> redirectUris) {
    this.redirectUris = redirectUris;
    return this;
  }

  public RegistryRecipientDTO addRedirectUrisItem(String redirectUrisItem) {
    this.redirectUris.add(redirectUrisItem);
    return this;
  }

  /**
   * An array of eligible Redirect URI targets
   *
   * @return redirectUris
   */
  @NotNull
  @Schema(name = "redirect_uris", description = "An array of eligible Redirect URI targets", required = true)
  public List<String> getRedirectUris() {
    return redirectUris;
  }

  public void setRedirectUris(List<String> redirectUris) {
    this.redirectUris = redirectUris;
  }

  public RegistryRecipientDTO logoUri(URI logoUri) {
    this.logoUri = logoUri;
    return this;
  }

  /**
   * Data Recipient Logo URL location
   *
   * @return logoUri
   */
  @Valid
  @Schema(name = "logo_uri", description = "Data Recipient Logo URL location", required = false)
  public URI getLogoUri() {
    return logoUri;
  }

  public void setLogoUri(URI logoUri) {
    this.logoUri = logoUri;
  }

  public RegistryRecipientDTO clientUri(URI clientUri) {
    this.clientUri = clientUri;
    return this;
  }

  /**
   * The URI which provides additional information about the Data Recipient
   *
   * @return clientUri
   */
  @Valid
  @Schema(name = "client_uri", description = "The URI which provides additional information about the Data Recipient", required = false)
  public URI getClientUri() {
    return clientUri;
  }

  public void setClientUri(URI clientUri) {
    this.clientUri = clientUri;
  }

  public RegistryRecipientDTO contacts(List<String> contacts) {
    this.contacts = contacts;
    return this;
  }

  public RegistryRecipientDTO addContactsItem(String contactsItem) {
    if (this.contacts == null) {
      this.contacts = new ArrayList<>();
    }
    this.contacts.add(contactsItem);
    return this;
  }

  /**
   * Array of strings representing ways to contact individuals responsible for the Data Recipient application
   *
   * @return contacts
   */

  @Schema(name = "contacts", description = "Array of strings representing ways to contact individuals responsible for the Data Recipient application", required = false)
  public List<String> getContacts() {
    return contacts;
  }

  public void setContacts(List<String> contacts) {
    this.contacts = contacts;
  }

  public RegistryRecipientDTO scope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * String form field with a list of data clusters
   *
   * @return scope
   */

  @Schema(name = "scope", description = "String form field with a list of data clusters", required = false)
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public RegistryRecipientDTO durationType(List<ConsentDurationType> durationType) {
    this.durationType = durationType;
    return this;
  }

  public RegistryRecipientDTO addDurationTypeItem(ConsentDurationType durationTypeItem) {
    if (this.durationType == null) {
      this.durationType = new ArrayList<>();
    }
    this.durationType.add(durationTypeItem);
    return this;
  }

  /**
   * The duration of consent for the Data Recipient consumers
   *
   * @return durationType
   */
  @Valid
  @Schema(name = "duration_type", description = "The duration of consent for the Data Recipient consumers", required = false)
  public List<ConsentDurationType> getDurationType() {
    return durationType;
  }

  public void setDurationType(List<ConsentDurationType> durationType) {
    this.durationType = durationType;
  }

  public RegistryRecipientDTO durationPeriod(BigDecimal durationPeriod) {
    this.durationPeriod = durationPeriod;
    return this;
  }

  /**
   * The duration period is the maximum consent duration that would be requested for a Recipient consumer
   *
   * @return durationPeriod
   */
  @Valid
  @Schema(name = "duration_period", description = "The duration period is the maximum consent duration that would be requested for a Recipient consumer", required = false)
  public BigDecimal getDurationPeriod() {
    return durationPeriod;
  }

  public void setDurationPeriod(BigDecimal durationPeriod) {
    this.durationPeriod = durationPeriod;
  }

  public RegistryRecipientDTO lookbackPeriod(BigDecimal lookbackPeriod) {
    this.lookbackPeriod = lookbackPeriod;
    return this;
  }

  /**
   * The maximum number of days allowed for Data Recipient consumers to obtain in transaction history, effective from the current date
   *
   * @return lookbackPeriod
   */
  @Valid
  @Schema(name = "lookback_period", description = "The maximum number of days allowed for Data Recipient consumers to obtain in transaction history, effective from the current date", required = false)
  public BigDecimal getLookbackPeriod() {
    return lookbackPeriod;
  }

  public void setLookbackPeriod(BigDecimal lookbackPeriod) {
    this.lookbackPeriod = lookbackPeriod;
  }

  public RegistryRecipientDTO registryReferences(List<RegistryReference> registryReferences) {
    this.registryReferences = registryReferences;
    return this;
  }

  public RegistryRecipientDTO addRegistryReferencesItem(RegistryReference registryReferencesItem) {
    if (this.registryReferences == null) {
      this.registryReferences = new ArrayList<>();
    }
    this.registryReferences.add(registryReferencesItem);
    return this;
  }

  /**
   * An array of external registries containing registered entity name, registered entity id and registry fields for the registries where the data recipient is registered
   *
   * @return registryReferences
   */
  @Valid
  @Schema(name = "registry_references", description = "An array of external registries containing registered entity name, registered entity id and registry fields for the registries where the data recipient is registered", required = false)
  public List<RegistryReference> getRegistryReferences() {
    return registryReferences;
  }

  public void setRegistryReferences(List<RegistryReference> registryReferences) {
    this.registryReferences = registryReferences;
  }

  public RegistryRecipientDTO intermediaries(List<Intermediary> intermediaries) {
    this.intermediaries = intermediaries;
    return this;
  }

  public RegistryRecipientDTO addIntermediariesItem(Intermediary intermediariesItem) {
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
  @Schema(name = "intermediaries", description = "An array of the intermediaries for this data recipient", required = false)
  public List<Intermediary> getIntermediaries() {
    return intermediaries;
  }

  public void setIntermediaries(List<Intermediary> intermediaries) {
    this.intermediaries = intermediaries;
  }

  public RegistryRecipientDTO recipientId(String recipientId) {
    this.recipientId = recipientId;
    return this;
  }

  /**
   * Recipient Id at ecosystem registry
   *
   * @return recipientId
   */
  @NotNull
  @Schema(name = "recipient_id", description = "Recipient Id at ecosystem registry", required = true)
  public String getRecipientId() {
    return recipientId;
  }

  public void setRecipientId(String recipientId) {
    this.recipientId = recipientId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegistryRecipientDTO recipient = (RegistryRecipientDTO) o;
    return Objects.equals(this.clientName, recipient.clientName) &&
        Objects.equals(this.description, recipient.description) &&
        Objects.equals(this.redirectUris, recipient.redirectUris) &&
        Objects.equals(this.logoUri, recipient.logoUri) &&
        Objects.equals(this.clientUri, recipient.clientUri) &&
        Objects.equals(this.contacts, recipient.contacts) &&
        Objects.equals(this.scope, recipient.scope) &&
        Objects.equals(this.durationType, recipient.durationType) &&
        Objects.equals(this.durationPeriod, recipient.durationPeriod) &&
        Objects.equals(this.lookbackPeriod, recipient.lookbackPeriod) &&
        Objects.equals(this.registryReferences, recipient.registryReferences) &&
        Objects.equals(this.intermediaries, recipient.intermediaries) &&
        Objects.equals(this.recipientId, recipient.recipientId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientName, description, redirectUris, logoUri, clientUri, contacts, scope, durationType, durationPeriod, lookbackPeriod, registryReferences, intermediaries, recipientId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Recipient {\n");
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    redirectUris: ").append(toIndentedString(redirectUris)).append("\n");
    sb.append("    logoUri: ").append(toIndentedString(logoUri)).append("\n");
    sb.append("    clientUri: ").append(toIndentedString(clientUri)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    durationType: ").append(toIndentedString(durationType)).append("\n");
    sb.append("    durationPeriod: ").append(toIndentedString(durationPeriod)).append("\n");
    sb.append("    lookbackPeriod: ").append(toIndentedString(lookbackPeriod)).append("\n");
    sb.append("    registryReferences: ").append(toIndentedString(registryReferences)).append("\n");
    sb.append("    intermediaries: ").append(toIndentedString(intermediaries)).append("\n");
    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
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
