package com.fdx.api.entities.notification;

import com.fdx.api.entities.common.HateoasLink;
import com.fdx.api.entities.common.Party;
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
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "notification")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TypeDef(
    name = "pgsql_enum",
    typeClass = PostgreSQLEnumType.class
)
public class Notification implements Serializable {

  private static final long serialVersionUID = -5102843480316739957L;

  @Id
  @Column(name = "notification_id", nullable = false)
  private String notificationId;

  @Enumerated(EnumType.STRING)
  @Column(columnDefinition = "type")
  @Type(type = "pgsql_enum")
  private NotificationType type;

  @Column(name = "sent_on")
  private Timestamp sentOn;

  @Enumerated(EnumType.STRING)
  @Column(columnDefinition = "category")
  @Type(type = "pgsql_enum")
  private NotificationCategory category;

  @Enumerated(EnumType.STRING)
  @Column(columnDefinition = "severity")
  @Type(type = "pgsql_enum")
  private NotificationSeverity severity;

  @Enumerated(EnumType.STRING)
  @Column(columnDefinition = "priority")
  @Type(type = "pgsql_enum")
  private NotificationPriority priority;

  @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
  @JoinColumn(name = "publisher_id")
  private Party publisher;

  @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
  @JoinColumn(name = "subscriber_id")
  private Party subscriber;

  @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
  @JoinColumn(name = "notification_payload_id")
  private NotificationPayload notificationPayload;

  @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
  @JoinColumn(name = "url_id")
  private HateoasLink url;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Notification that = (Notification) o;
    return Objects.equals(notificationId, that.notificationId) && type == that.type && Objects.equals(sentOn, that.sentOn) && category == that.category && severity == that.severity && priority == that.priority && Objects.equals(publisher, that.publisher) && Objects.equals(subscriber, that.subscriber) && Objects.equals(notificationPayload, that.notificationPayload) && Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notificationId, type, sentOn, category, severity, priority, publisher, subscriber, notificationPayload, url);
  }
}
