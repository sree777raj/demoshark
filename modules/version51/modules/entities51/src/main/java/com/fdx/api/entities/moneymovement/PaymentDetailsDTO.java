package com.fdx.api.entities.moneymovement;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * Details of this payment
 */
@Schema(name = "PaymentDetailsDTO", description = "Details of this payment")
public class PaymentDetailsDTO {

  @JsonProperty("principalAmount")
  private BigDecimal principalAmount;

  @JsonProperty("interestAmount")
  private BigDecimal interestAmount;

  @JsonProperty("insuranceAmount")
  private BigDecimal insuranceAmount;

  @JsonProperty("escrowAmount")
  private BigDecimal escrowAmount;

  @JsonProperty("pmiAmount")
  private BigDecimal pmiAmount;

  @JsonProperty("feesAmount")
  private BigDecimal feesAmount;

  public PaymentDetailsDTO principalAmount(BigDecimal principalAmount) {
    this.principalAmount = principalAmount;
    return this;
  }

  /**
   * The amount of payment applied to principal
   * @return principalAmount
  */
  @Valid 
  @Schema(name = "principalAmount", description = "The amount of payment applied to principal", required = false)
  public BigDecimal getPrincipalAmount() {
    return principalAmount;
  }

  public void setPrincipalAmount(BigDecimal principalAmount) {
    this.principalAmount = principalAmount;
  }

  public PaymentDetailsDTO interestAmount(BigDecimal interestAmount) {
    this.interestAmount = interestAmount;
    return this;
  }

  /**
   * The amount of payment applied to interest
   * @return interestAmount
  */
  @Valid 
  @Schema(name = "interestAmount", description = "The amount of payment applied to interest", required = false)
  public BigDecimal getInterestAmount() {
    return interestAmount;
  }

  public void setInterestAmount(BigDecimal interestAmount) {
    this.interestAmount = interestAmount;
  }

  public PaymentDetailsDTO insuranceAmount(BigDecimal insuranceAmount) {
    this.insuranceAmount = insuranceAmount;
    return this;
  }

  /**
   * The amount of payment applied to life/health/accident insurance on the loan
   * @return insuranceAmount
  */
  @Valid 
  @Schema(name = "insuranceAmount", description = "The amount of payment applied to life/health/accident insurance on the loan", required = false)
  public BigDecimal getInsuranceAmount() {
    return insuranceAmount;
  }

  public void setInsuranceAmount(BigDecimal insuranceAmount) {
    this.insuranceAmount = insuranceAmount;
  }

  public PaymentDetailsDTO escrowAmount(BigDecimal escrowAmount) {
    this.escrowAmount = escrowAmount;
    return this;
  }

  /**
   * The amount of payment applied to escrow
   * @return escrowAmount
  */
  @Valid 
  @Schema(name = "escrowAmount", description = "The amount of payment applied to escrow", required = false)
  public BigDecimal getEscrowAmount() {
    return escrowAmount;
  }

  public void setEscrowAmount(BigDecimal escrowAmount) {
    this.escrowAmount = escrowAmount;
  }

  public PaymentDetailsDTO pmiAmount(BigDecimal pmiAmount) {
    this.pmiAmount = pmiAmount;
    return this;
  }

  /**
   * The amount of payment applied to PMI
   * @return pmiAmount
  */
  @Valid 
  @Schema(name = "pmiAmount", description = "The amount of payment applied to PMI", required = false)
  public BigDecimal getPmiAmount() {
    return pmiAmount;
  }

  public void setPmiAmount(BigDecimal pmiAmount) {
    this.pmiAmount = pmiAmount;
  }

  public PaymentDetailsDTO feesAmount(BigDecimal feesAmount) {
    this.feesAmount = feesAmount;
    return this;
  }

  /**
   * The amount of payment applied to fees
   * @return feesAmount
  */
  @Valid 
  @Schema(name = "feesAmount", description = "The amount of payment applied to fees", required = false)
  public BigDecimal getFeesAmount() {
    return feesAmount;
  }

  public void setFeesAmount(BigDecimal feesAmount) {
    this.feesAmount = feesAmount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentDetailsDTO paymentDetailsDTO = (PaymentDetailsDTO) o;
    return Objects.equals(this.principalAmount, paymentDetailsDTO.principalAmount) &&
        Objects.equals(this.interestAmount, paymentDetailsDTO.interestAmount) &&
        Objects.equals(this.insuranceAmount, paymentDetailsDTO.insuranceAmount) &&
        Objects.equals(this.escrowAmount, paymentDetailsDTO.escrowAmount) &&
        Objects.equals(this.pmiAmount, paymentDetailsDTO.pmiAmount) &&
        Objects.equals(this.feesAmount, paymentDetailsDTO.feesAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(principalAmount, interestAmount, insuranceAmount, escrowAmount, pmiAmount, feesAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentDetailsDTO {\n");
    sb.append("    principalAmount: ").append(toIndentedString(principalAmount)).append("\n");
    sb.append("    interestAmount: ").append(toIndentedString(interestAmount)).append("\n");
    sb.append("    insuranceAmount: ").append(toIndentedString(insuranceAmount)).append("\n");
    sb.append("    escrowAmount: ").append(toIndentedString(escrowAmount)).append("\n");
    sb.append("    pmiAmount: ").append(toIndentedString(pmiAmount)).append("\n");
    sb.append("    feesAmount: ").append(toIndentedString(feesAmount)).append("\n");
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

