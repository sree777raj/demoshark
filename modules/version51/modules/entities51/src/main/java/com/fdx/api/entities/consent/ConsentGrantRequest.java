package com.fdx.api.entities.consent;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Objects;

/**
 * Details of request to create new consent grant.
 */
public class ConsentGrantRequest {

  @JsonProperty("registeredClientId")
  private String registeredClientId;

  @JsonProperty("registeredEntityName")
  private String registeredEntityName;

  @JsonProperty("scopes")
  private List<String> scopes = null;

  /**
   * Default constructor, for deserialize from Object value
   */
  public ConsentGrantRequest() {
  }

  /**
   * Constructor.
   *
   * @param registeredClientId   value
   * @param registeredEntityName value
   */
  public ConsentGrantRequest(String registeredClientId, String registeredEntityName) {
    this.registeredClientId = registeredClientId;
    this.registeredEntityName = registeredEntityName;
  }

  /**
   * get registered client id.
   *
   * @return registeredClientId
   */
  public String getRegisteredClientId() {
    return registeredClientId;
  }

  /**
   * set registered client id.
   *
   * @param registeredClientId value
   */
  public void setRegisteredClientId(String registeredClientId) {
    this.registeredClientId = registeredClientId;
  }

  /**
   * Get registered entity name.
   *
   * @return registeredEntityName
   */
  public String getRegisteredEntityName() {
    return registeredEntityName;
  }

  /**
   * Set registered entity name.
   *
   * @param registeredEntityName value
   */
  public void setRegisteredEntityName(String registeredEntityName) {
    this.registeredEntityName = registeredEntityName;
  }

  /**
   * get scopes.
   *
   * @return scopes
   */
  public List<String> getScopes() {
    return scopes;
  }

  /**
   * set scopes.
   *
   * @param scopes values
   */
  public void setScopes(List<String> scopes) {
    this.scopes = scopes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsentGrantRequest consentGrantRequest = (ConsentGrantRequest) o;
    return Objects.equals(this.registeredClientId, consentGrantRequest.registeredClientId) &&
        Objects.equals(this.scopes, consentGrantRequest.scopes) &&
        Objects.equals(this.registeredEntityName, consentGrantRequest.registeredEntityName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(registeredClientId, scopes, registeredEntityName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsentGrantRequest {\n");
    sb.append("    registeredClientId: ").append(toIndentedString(registeredClientId)).append("\n");
    sb.append("    registeredEntityName: ").append(toIndentedString(registeredEntityName)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
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