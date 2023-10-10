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

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * A single transfer of money. Refer to Transfers for a list of multiple transfers.
 */
@Entity
@Table(name = "transfer")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TypeDef(
    name = "pgsql_enum",
    typeClass = PostgreSQLEnumType.class
)
@Schema(name = "Transfer", description = "A single transfer of money. Refer to Transfers for a list of multiple transfers.")
public class Transfer implements Serializable {

  private static final long serialVersionUID = -4102843480316739957L;

  @Id
  @Column(name = "transfer_id", nullable = false)
  private String transferId;

  @Column(name = "from_account_id")
  private String fromAccountId;

  @Column(name = "to_account_id")
  private String toAccountId;

  @Column(name = "amount")
  private BigDecimal amount;

  @Column(name = "memo")
  private String memo;

  @OneToOne
  @JoinColumn(name = "payment_details_id")
  private PaymentDetails paymentDetails;

  @Column(name = "reference_id")
  private String referenceId;

  @Enumerated(EnumType.STRING)
  @Column(columnDefinition = "status")
  @Type(type = "pgsql_enum")
  private PaymentStatus status;

  @Column(name = "transfer_time")
  private LocalDate transferTime;
}
