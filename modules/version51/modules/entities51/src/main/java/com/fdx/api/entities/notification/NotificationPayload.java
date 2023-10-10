package com.fdx.api.entities.notification;

import com.fdx.api.entities.common.FiAttribute;
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
import java.util.Objects;

@Entity
@Table(name = "notification_payload")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TypeDef(
    name = "pgsql_enum",
    typeClass = PostgreSQLEnumType.class
)
public class NotificationPayload implements Serializable {

  private static final long serialVersionUID = -5102843480316739977L;

  @Id
  @Column(name = "id", nullable = false)
  private String id;

  @Enumerated(EnumType.STRING)
  @Column(columnDefinition = "id_type")
  @Type(type = "pgsql_enum")
  private NotificationPayloadIdType idType;

  @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
  @JoinColumn(name = "fi_attribute_id")
  private FiAttribute customFields;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    NotificationPayload that = (NotificationPayload) o;
    return Objects.equals(id, that.id) && idType == that.idType && Objects.equals(customFields, that.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idType, customFields);
  }
}
