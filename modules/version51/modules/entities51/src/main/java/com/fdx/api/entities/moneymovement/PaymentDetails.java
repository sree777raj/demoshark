package com.fdx.api.entities.moneymovement;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Details of this payment
 */
@Entity
@Table(name = "payment_details")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Schema(name = "PaymentDetails", description = "Details of this payment")
public class PaymentDetails implements Serializable {

  private static final long serialVersionUID = -3102843480316739957L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "payment_details_id", nullable = false)
  private Long paymentDetailsId;

  @Column(name = "principal_amount")
  private BigDecimal principalAmount;

  @Column(name = "interest_amount")
  private BigDecimal interestAmount;

  @Column(name = "insurance_amount")
  private BigDecimal insuranceAmount;

  @Column(name = "escrow_amount")
  private BigDecimal escrowAmount;

  @Column(name = "pmi_amount")
  private BigDecimal pmiAmount;

  @Column(name = "fees_amount")
  private BigDecimal feesAmount;

}
