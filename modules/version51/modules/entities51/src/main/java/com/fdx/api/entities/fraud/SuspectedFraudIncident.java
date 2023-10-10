package com.fdx.api.entities.fraud;

import com.fdx.api.entities.common.FiAttribute;
import com.fdx.api.entities.common.Party;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.Valid;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "suspected_fraud_incident")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SuspectedFraudIncident implements Serializable {

  private static final long serialVersionUID = -2102843480316739957L;

  @Id
  @Column(name = "incident_id", nullable = false)
  private String incidentId;

  @Column(name = "type")
  private String type;

  @Column(name = "reason")
  private String reason;

  @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
  @JoinColumn(name = "reporter_id")
  private Party reporter;

  @OneToMany(mappedBy = "suspectedFraudIncident", cascade = CascadeType.ALL
      , orphanRemoval = true, fetch = FetchType.EAGER)
  @Valid
  private Set<FiAttribute> fiAttributes = new HashSet<>();

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SuspectedFraudIncident that = (SuspectedFraudIncident) o;
    return Objects.equals(incidentId, that.incidentId) && Objects.equals(type, that.type)
        && Objects.equals(reason, that.reason) && Objects.equals(reporter, that.reporter)
        && Objects.equals(fiAttributes, that.fiAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(incidentId, type, reason, reporter, fiAttributes);
  }
}
