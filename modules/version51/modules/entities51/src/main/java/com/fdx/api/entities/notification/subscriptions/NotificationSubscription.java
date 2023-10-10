package com.fdx.api.entities.notification.subscriptions;

import com.fdx.api.entities.common.Party;
import com.fdx.api.entities.notification.NotificationCategory;
import com.fdx.api.entities.notification.NotificationType;
import com.vladmihalcea.hibernate.type.basic.PostgreSQLEnumType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "notification_subscription")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TypeDef(
    name = "pgsql_enum",
    typeClass = PostgreSQLEnumType.class
)
public class NotificationSubscription implements Serializable {

  private static final long serialVersionUID = -1102843480316739957L;

  @Id
  @Column(name = "subscription_id", nullable = false)
  private String subscriptionId;

  @Enumerated(EnumType.STRING)
  @Column(columnDefinition = "type")
  @Type(type = "pgsql_enum")
  private NotificationType type;

  @Enumerated(EnumType.STRING)
  @Column(columnDefinition = "category")
  @Type(type = "pgsql_enum")
  private NotificationCategory category;

  @Column(name = "callback_url")
  private String callbackUrl;

  @Column(name = "effective_date")
  private LocalDate effectiveDate;

  @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
  @JoinColumn(name = "subscriber_id")
  private Party subscriber;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    NotificationSubscription that = (NotificationSubscription) o;
    return Objects.equals(subscriptionId, that.subscriptionId) && type == that.type && category == that.category && Objects.equals(callbackUrl, that.callbackUrl) && Objects.equals(effectiveDate, that.effectiveDate) && Objects.equals(subscriber, that.subscriber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionId, type, category, callbackUrl, effectiveDate, subscriber);
  }
}
