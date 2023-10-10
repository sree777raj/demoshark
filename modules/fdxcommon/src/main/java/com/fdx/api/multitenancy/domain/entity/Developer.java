package com.fdx.api.multitenancy.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

/**
 * Developer entity.
 */
@Entity
@Table(name = "developer", schema = "fdxcommon")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Developer {

    @Id
    @Column(name = "developer_id")
    private String developerId;

    @Column(name = "team_id")
    private String teamId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o))
            return false;
        Developer developer = (Developer) o;
        return developerId != null && Objects.equals(developerId, developer.developerId);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}