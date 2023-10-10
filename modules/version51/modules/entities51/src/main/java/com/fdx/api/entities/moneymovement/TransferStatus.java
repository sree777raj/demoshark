package com.fdx.api.entities.moneymovement;

import com.vladmihalcea.hibernate.type.basic.PostgreSQLEnumType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

/**
 * The status of a transfer of money. Used only by the deprecated endpoint &#x60;/transfers/{transferId}/status&#x60;.
 */
@Entity
@Table(name = "transfer_status")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TypeDef(
    name = "pgsql_enum",
    typeClass = PostgreSQLEnumType.class
)
@Schema(name = "TransferStatus", description = "The status of a transfer of money. Used only by the deprecated endpoint `/transfers/{transferId}/status`.")
public class TransferStatus {

  @Id
  @Column(name = "transfer_id", nullable = false)
  private String transferId;

  @Column(name = "reference_id")
  private String referenceId;

  @Enumerated(EnumType.STRING)
  @Column(columnDefinition = "status")
  @Type(type = "pgsql_enum")
  private PaymentStatus status;

  @Column(name = "transfer_date")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate transferDate;
}
