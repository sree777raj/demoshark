package com.fdx.api.entities.notification;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fdx.api.entities.common.FiAttributeRequest;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.Valid;
import java.util.Objects;

/**
 * Custom key-value pairs payload for a notification
 */

@Schema(name = "NotificationPayloadRequest", description = "Custom key-value pairs payload for a notification")
public class NotificationPayloadRequest {

  @JsonProperty("id")
  private String id;

  @JsonProperty("idType")
  private NotificationPayloadIdType idType;

  @JsonProperty("customFields")
  private FiAttributeRequest customFields;

  public NotificationPayloadRequest id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID for the origination entity related to the notification
   *
   * @return id
   */

  @Schema(name = "id", description = "ID for the origination entity related to the notification", required = false)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public NotificationPayloadRequest idType(NotificationPayloadIdType idType) {
    this.idType = idType;
    return this;
  }

  /**
   * Get idType
   *
   * @return idType
   */
  @Valid
  @Schema(name = "idType", required = false)
  public NotificationPayloadIdType getIdType() {
    return idType;
  }

  public void setIdType(NotificationPayloadIdType idType) {
    this.idType = idType;
  }

  public NotificationPayloadRequest customFields(FiAttributeRequest customFields) {
    this.customFields = customFields;
    return this;
  }

  /**
   * Get customFields
   *
   * @return customFields
   */
  @Valid
  @Schema(name = "customFields", required = false)
  public FiAttributeRequest getCustomFields() {
    return customFields;
  }

  public void setCustomFields(FiAttributeRequest customFields) {
    this.customFields = customFields;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationPayloadRequest notificationPayloadRequest = (NotificationPayloadRequest) o;
    return Objects.equals(this.id, notificationPayloadRequest.id) &&
        Objects.equals(this.idType, notificationPayloadRequest.idType) &&
        Objects.equals(this.customFields, notificationPayloadRequest.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idType, customFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationPayloadRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idType: ").append(toIndentedString(idType)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
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

