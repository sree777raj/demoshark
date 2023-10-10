package com.fdx.api.entities.notification;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fdx.api.entities.common.HateoasLinkRequest;
import com.fdx.api.entities.common.PartyRequest;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * Provides the base fields of a notification. Clients will read the &#x60;type&#x60; property to determine the expected notification payload
 */

@Schema(name = "NotificationRequest", description = "Provides the base fields of a notification. Clients will read the `type` property to determine the expected notification payload")
public class NotificationRequest {

  @JsonProperty("notificationId")
  private String notificationId;

  @JsonProperty("type")
  private NotificationType type;

  @JsonProperty("sentOn")
  private Timestamp sentOn;

  @JsonProperty("category")
  private NotificationCategory category;

  @JsonProperty("severity")
  private NotificationSeverity severity;

  @JsonProperty("priority")
  private NotificationPriority priority;

  @JsonProperty("publisher")
  private PartyRequest publisher;

  @JsonProperty("subscriber")
  private PartyRequest subscriber;

  @JsonProperty("notificationPayload")
  private NotificationPayloadRequest notificationPayload;

  @JsonProperty("url")
  private HateoasLinkRequest url;

  public NotificationRequest notificationId(String notificationId) {
    this.notificationId = notificationId;
    return this;
  }

  /**
   * Id of notification
   *
   * @return notificationId
   */
  @NotNull
  @Schema(name = "notificationId", description = "Id of notification", required = true)
  public String getNotificationId() {
    return notificationId;
  }

  public void setNotificationId(String notificationId) {
    this.notificationId = notificationId;
  }

  public NotificationRequest type(NotificationType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   *
   * @return type
   */
  @NotNull
  @Valid
  @Schema(name = "type", required = true)
  public NotificationType getType() {
    return type;
  }

  public void setType(NotificationType type) {
    this.type = type;
  }

  public NotificationRequest sentOn(Timestamp sentOn) {
    this.sentOn = sentOn;
    return this;
  }

  /**
   * Get sentOn
   *
   * @return sentOn
   */
  @NotNull
  @Valid
  @Schema(name = "sentOn", required = true)
  public Timestamp getSentOn() {
    return sentOn;
  }

  public void setSentOn(Timestamp sentOn) {
    this.sentOn = sentOn;
  }

  public NotificationRequest category(NotificationCategory category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   *
   * @return category
   */
  @NotNull
  @Valid
  @Schema(name = "category", required = true)
  public NotificationCategory getCategory() {
    return category;
  }

  public void setCategory(NotificationCategory category) {
    this.category = category;
  }

  public NotificationRequest severity(NotificationSeverity severity) {
    this.severity = severity;
    return this;
  }

  /**
   * Get severity
   *
   * @return severity
   */
  @Valid
  @Schema(name = "severity", required = false)
  public NotificationSeverity getSeverity() {
    return severity;
  }

  public void setSeverity(NotificationSeverity severity) {
    this.severity = severity;
  }

  public NotificationRequest priority(NotificationPriority priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Get priority
   *
   * @return priority
   */
  @Valid
  @Schema(name = "priority", required = false)
  public NotificationPriority getPriority() {
    return priority;
  }

  public void setPriority(NotificationPriority priority) {
    this.priority = priority;
  }

  public NotificationRequest publisher(PartyRequest publisher) {
    this.publisher = publisher;
    return this;
  }

  /**
   * Get publisher
   *
   * @return publisher
   */
  @NotNull
  @Valid
  @Schema(name = "publisher", required = true)
  public PartyRequest getPublisher() {
    return publisher;
  }

  public void setPublisher(PartyRequest publisher) {
    this.publisher = publisher;
  }

  public NotificationRequest subscriber(PartyRequest subscriber) {
    this.subscriber = subscriber;
    return this;
  }

  /**
   * Get subscriber
   *
   * @return subscriber
   */
  @Valid
  @Schema(name = "subscriber", required = false)
  public PartyRequest getSubscriber() {
    return subscriber;
  }

  public void setSubscriber(PartyRequest subscriber) {
    this.subscriber = subscriber;
  }

  public NotificationRequest notificationPayload(NotificationPayloadRequest notificationPayload) {
    this.notificationPayload = notificationPayload;
    return this;
  }

  /**
   * Get notificationPayloadRequest
   *
   * @return notificationPayloadRequest
   */
  @NotNull
  @Valid
  @Schema(name = "notificationPayloadRequest", required = true)
  public NotificationPayloadRequest getNotificationPayload() {
    return notificationPayload;
  }

  public void setNotificationPayload(NotificationPayloadRequest notificationPayload) {
    this.notificationPayload = notificationPayload;
  }

  public NotificationRequest url(HateoasLinkRequest url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   *
   * @return url
   */
  @Valid
  @Schema(name = "url", required = false)
  public HateoasLinkRequest getUrl() {
    return url;
  }

  public void setUrl(HateoasLinkRequest url) {
    this.url = url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationRequest notificationRequest = (NotificationRequest) o;
    return Objects.equals(this.notificationId, notificationRequest.notificationId) &&
        Objects.equals(this.type, notificationRequest.type) &&
        Objects.equals(this.sentOn, notificationRequest.sentOn) &&
        Objects.equals(this.category, notificationRequest.category) &&
        Objects.equals(this.severity, notificationRequest.severity) &&
        Objects.equals(this.priority, notificationRequest.priority) &&
        Objects.equals(this.publisher, notificationRequest.publisher) &&
        Objects.equals(this.subscriber, notificationRequest.subscriber) &&
        Objects.equals(this.notificationPayload, notificationRequest.notificationPayload) &&
        Objects.equals(this.url, notificationRequest.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notificationId, type, sentOn, category, severity, priority, publisher, subscriber, notificationPayload, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationRequest {\n");
    sb.append("    notificationId: ").append(toIndentedString(notificationId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    sentOn: ").append(toIndentedString(sentOn)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    publisher: ").append(toIndentedString(publisher)).append("\n");
    sb.append("    subscriber: ").append(toIndentedString(subscriber)).append("\n");
    sb.append("    notificationPayloadRequest: ").append(toIndentedString(notificationPayload)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

