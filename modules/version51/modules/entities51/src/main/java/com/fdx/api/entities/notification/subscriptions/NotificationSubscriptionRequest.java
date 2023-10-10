package com.fdx.api.entities.notification.subscriptions;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fdx.api.entities.common.PartyRequest;
import com.fdx.api.entities.notification.NotificationCategory;
import com.fdx.api.entities.notification.NotificationType;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.Objects;

/**
 * Provides the fields of a notification subscription
 */

@Schema(name = "NotificationSubscription", description = "Provides the fields of a notification subscription")
public class NotificationSubscriptionRequest {
  @JsonProperty("type")
  private NotificationType type;

  @JsonProperty("category")
  private NotificationCategory category;

  @JsonProperty("callbackUrl")
  private String callbackUrl;

  @JsonProperty("subscriber")
  private PartyRequest subscriber;

  @JsonProperty("effectiveDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate effectiveDate;

  @JsonProperty("subscriptionId")
  private String subscriptionId;

  public NotificationSubscriptionRequest type(NotificationType type) {
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

  public NotificationSubscriptionRequest category(NotificationCategory category) {
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

  public NotificationSubscriptionRequest callbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
    return this;
  }

  /**
   * Callback URL. Previous callback URL will be updated with latest.
   *
   * @return callbackUrl
   */
  @NotNull
  @Schema(name = "callbackUrl", description = "Callback URL. Previous callback URL will be updated with latest.", required = true)
  public String getCallbackUrl() {
    return callbackUrl;
  }

  public void setCallbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
  }

  public NotificationSubscriptionRequest subscriber(PartyRequest subscriber) {
    this.subscriber = subscriber;
    return this;
  }

  /**
   * Get subscriber
   *
   * @return subscriber
   */
  @NotNull
  @Valid
  @Schema(name = "subscriber", required = true)
  public PartyRequest getSubscriber() {
    return subscriber;
  }

  public void setSubscriber(PartyRequest subscriber) {
    this.subscriber = subscriber;
  }

  public NotificationSubscriptionRequest effectiveDate(LocalDate effectiveDate) {
    this.effectiveDate = effectiveDate;
    return this;
  }

  /**
   * ISO 8601 full-date in format 'YYYY-MM-DD' according to [IETF RFC3339](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)
   *
   * @return effectiveDate
   */
  @Valid
  @Size(max = 10)
  @Schema(name = "effectiveDate", example = "Thu Jul 15 05:30:00 IST 2021", description = "ISO 8601 full-date in format 'YYYY-MM-DD' according to [IETF RFC3339](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)", required = false)
  public LocalDate getEffectiveDate() {
    return effectiveDate;
  }

  public void setEffectiveDate(LocalDate effectiveDate) {
    this.effectiveDate = effectiveDate;
  }

  public NotificationSubscriptionRequest subscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

  /**
   * Subscription id of notification
   *
   * @return subscriptionId
   */

  @Schema(name = "subscriptionId", description = "Subscription id of notification", required = false)
  public String getSubscriptionId() {
    return subscriptionId;
  }

  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationSubscriptionRequest notificationSubscription = (NotificationSubscriptionRequest) o;
    return Objects.equals(this.type, notificationSubscription.type) &&
        Objects.equals(this.category, notificationSubscription.category) &&
        Objects.equals(this.callbackUrl, notificationSubscription.callbackUrl) &&
        Objects.equals(this.subscriber, notificationSubscription.subscriber) &&
        Objects.equals(this.effectiveDate, notificationSubscription.effectiveDate) &&
        Objects.equals(this.subscriptionId, notificationSubscription.subscriptionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, category, callbackUrl, subscriber, effectiveDate, subscriptionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationSubscription {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
    sb.append("    subscriber: ").append(toIndentedString(subscriber)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
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
