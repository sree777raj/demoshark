package com.fdx.api.entities.common;

import com.vladmihalcea.hibernate.type.array.EnumArrayType;
import com.vladmihalcea.hibernate.type.basic.PostgreSQLEnumType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "hateoas_link")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TypeDefs({
    @TypeDef(name = "pgsql_enum", typeClass = PostgreSQLEnumType.class),
    @TypeDef(
        typeClass = EnumArrayType.class,
        defaultForType = ContentTypes[].class,
        parameters = {
            @Parameter(
                name = EnumArrayType.SQL_ARRAY_TYPE,
                value = "content_types"
            )
        }
    )
})
public class HateoasLink implements Serializable {

  private static final long serialVersionUID = -5102843480316739757L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "href")
  private String href;

  @Enumerated(EnumType.STRING)
  @Column(columnDefinition = "action")
  @Type(type = "pgsql_enum")
  private Action action;

  @Column(name = "rel")
  private String rel;

  @Column(
      name = "types",
      columnDefinition = "content_types[]"
  )
  private ContentTypes[] types = null;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    HateoasLink that = (HateoasLink) o;
    return Objects.equals(id, that.id) && Objects.equals(href, that.href) && action == that.action && Objects.equals(rel, that.rel) && Arrays.equals(types, that.types);
  }

  @Override
  public int hashCode() {
    int result = Objects.hash(id, href, action, rel);
    result = 31 * result + Arrays.hashCode(types);
    return result;
  }
}
