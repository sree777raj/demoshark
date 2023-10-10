package com.fdx.api.model46.modelimpl;

import java.math.BigDecimal;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * AnnuityAccountAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class AnnuityAccountAllOf   {
  @JsonProperty("annuityProductType")
  private AnnuityProductType annuityProductType;

  @JsonProperty("annuityValueBasis")
  private AnnuityValueBasis annuityValueBasis;

  @JsonProperty("paymentAmount")
  private BigDecimal paymentAmount;

  @JsonProperty("paymentFrequency")
  private PaymentFrequency paymentFrequency;

  @JsonProperty("paymentStartDate")
  private java.sql.Timestamp paymentStartDate;

  @JsonProperty("paymentEndDate")
  private java.sql.Timestamp paymentEndDate;

  @JsonProperty("totalPaymentCount")
  private BigDecimal totalPaymentCount;

  @JsonProperty("netPresentValue")
  private BigDecimal netPresentValue;

  @JsonProperty("annualIncrease")
  private BigDecimal annualIncrease;

  @JsonProperty("annualIncreaseType")
  private AnnualIncreaseType annualIncreaseType;

  @JsonProperty("periodCertainGuarantee")
  private PeriodCertainGuarantee periodCertainGuarantee;

  public AnnuityAccountAllOf annuityProductType(AnnuityProductType annuityProductType) {
    this.annuityProductType = annuityProductType;
    return this;
  }

  /**
   * Get annuityProductType
   * @return annuityProductType
  */
  @ApiModelProperty(value = "")

  @Valid

  public AnnuityProductType getAnnuityProductType() {
    return annuityProductType;
  }

  public void setAnnuityProductType(AnnuityProductType annuityProductType) {
    this.annuityProductType = annuityProductType;
  }

  public AnnuityAccountAllOf annuityValueBasis(AnnuityValueBasis annuityValueBasis) {
    this.annuityValueBasis = annuityValueBasis;
    return this;
  }

  /**
   * Get annuityValueBasis
   * @return annuityValueBasis
  */
  @ApiModelProperty(value = "")

  @Valid

  public AnnuityValueBasis getAnnuityValueBasis() {
    return annuityValueBasis;
  }

  public void setAnnuityValueBasis(AnnuityValueBasis annuityValueBasis) {
    this.annuityValueBasis = annuityValueBasis;
  }

  public AnnuityAccountAllOf paymentAmount(BigDecimal paymentAmount) {
    this.paymentAmount = paymentAmount;
    return this;
  }

  /**
   * Amount of the recurring payment
   * @return paymentAmount
  */
  @ApiModelProperty(value = "Amount of the recurring payment")

  @Valid

  public BigDecimal getPaymentAmount() {
    return paymentAmount;
  }

  public void setPaymentAmount(BigDecimal paymentAmount) {
    this.paymentAmount = paymentAmount;
  }

  public AnnuityAccountAllOf paymentFrequency(PaymentFrequency paymentFrequency) {
    this.paymentFrequency = paymentFrequency;
    return this;
  }

  /**
   * Get paymentFrequency
   * @return paymentFrequency
  */
  @ApiModelProperty(value = "")

  @Valid

  public PaymentFrequency getPaymentFrequency() {
    return paymentFrequency;
  }

  public void setPaymentFrequency(PaymentFrequency paymentFrequency) {
    this.paymentFrequency = paymentFrequency;
  }

  public AnnuityAccountAllOf paymentStartDate(java.sql.Timestamp paymentStartDate) {
    this.paymentStartDate = paymentStartDate;
    return this;
  }

  /**
   * Get paymentStartDate
   * @return paymentStartDate
  */
  @ApiModelProperty(value = "")

  @Valid

  public java.sql.Timestamp getPaymentStartDate() {
    return paymentStartDate;
  }

  public void setPaymentStartDate(java.sql.Timestamp paymentStartDate) {
    this.paymentStartDate = paymentStartDate;
  }

  public AnnuityAccountAllOf paymentEndDate(java.sql.Timestamp paymentEndDate) {
    this.paymentEndDate = paymentEndDate;
    return this;
  }

  /**
   * Get paymentEndDate
   * @return paymentEndDate
  */
  @ApiModelProperty(value = "")

  @Valid

  public java.sql.Timestamp getPaymentEndDate() {
    return paymentEndDate;
  }

  public void setPaymentEndDate(java.sql.Timestamp paymentEndDate) {
    this.paymentEndDate = paymentEndDate;
  }

  public AnnuityAccountAllOf totalPaymentCount(BigDecimal totalPaymentCount) {
    this.totalPaymentCount = totalPaymentCount;
    return this;
  }

  /**
   * Total number of payments that will be produced by the annuity
   * @return totalPaymentCount
  */
  @ApiModelProperty(value = "Total number of payments that will be produced by the annuity")

  @Valid

  public BigDecimal getTotalPaymentCount() {
    return totalPaymentCount;
  }

  public void setTotalPaymentCount(BigDecimal totalPaymentCount) {
    this.totalPaymentCount = totalPaymentCount;
  }

  public AnnuityAccountAllOf netPresentValue(BigDecimal netPresentValue) {
    this.netPresentValue = netPresentValue;
    return this;
  }

  /**
   * Surrender or cash balance value
   * @return netPresentValue
  */
  @ApiModelProperty(value = "Surrender or cash balance value")

  @Valid

  public BigDecimal getNetPresentValue() {
    return netPresentValue;
  }

  public void setNetPresentValue(BigDecimal netPresentValue) {
    this.netPresentValue = netPresentValue;
  }

  public AnnuityAccountAllOf annualIncrease(BigDecimal annualIncrease) {
    this.annualIncrease = annualIncrease;
    return this;
  }

  /**
   * Percent or dollar amount of annual payment increase
   * @return annualIncrease
  */
  @ApiModelProperty(value = "Percent or dollar amount of annual payment increase")

  @Valid

  public BigDecimal getAnnualIncrease() {
    return annualIncrease;
  }

  public void setAnnualIncrease(BigDecimal annualIncrease) {
    this.annualIncrease = annualIncrease;
  }

  public AnnuityAccountAllOf annualIncreaseType(AnnualIncreaseType annualIncreaseType) {
    this.annualIncreaseType = annualIncreaseType;
    return this;
  }

  /**
   * Get annualIncreaseType
   * @return annualIncreaseType
  */
  @ApiModelProperty(value = "")

  @Valid

  public AnnualIncreaseType getAnnualIncreaseType() {
    return annualIncreaseType;
  }

  public void setAnnualIncreaseType(AnnualIncreaseType annualIncreaseType) {
    this.annualIncreaseType = annualIncreaseType;
  }

  public AnnuityAccountAllOf periodCertainGuarantee(PeriodCertainGuarantee periodCertainGuarantee) {
    this.periodCertainGuarantee = periodCertainGuarantee;
    return this;
  }

  /**
   * Get periodCertainGuarantee
   * @return periodCertainGuarantee
  */
  @ApiModelProperty(value = "")

  @Valid

  public PeriodCertainGuarantee getPeriodCertainGuarantee() {
    return periodCertainGuarantee;
  }

  public void setPeriodCertainGuarantee(PeriodCertainGuarantee periodCertainGuarantee) {
    this.periodCertainGuarantee = periodCertainGuarantee;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnnuityAccountAllOf annuityAccountAllOf = (AnnuityAccountAllOf) o;
    return Objects.equals(this.annuityProductType, annuityAccountAllOf.annuityProductType) &&
        Objects.equals(this.annuityValueBasis, annuityAccountAllOf.annuityValueBasis) &&
        Objects.equals(this.paymentAmount, annuityAccountAllOf.paymentAmount) &&
        Objects.equals(this.paymentFrequency, annuityAccountAllOf.paymentFrequency) &&
        Objects.equals(this.paymentStartDate, annuityAccountAllOf.paymentStartDate) &&
        Objects.equals(this.paymentEndDate, annuityAccountAllOf.paymentEndDate) &&
        Objects.equals(this.totalPaymentCount, annuityAccountAllOf.totalPaymentCount) &&
        Objects.equals(this.netPresentValue, annuityAccountAllOf.netPresentValue) &&
        Objects.equals(this.annualIncrease, annuityAccountAllOf.annualIncrease) &&
        Objects.equals(this.annualIncreaseType, annuityAccountAllOf.annualIncreaseType) &&
        Objects.equals(this.periodCertainGuarantee, annuityAccountAllOf.periodCertainGuarantee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annuityProductType, annuityValueBasis, paymentAmount, paymentFrequency, paymentStartDate, paymentEndDate, totalPaymentCount, netPresentValue, annualIncrease, annualIncreaseType, periodCertainGuarantee);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnnuityAccountAllOf {\n");
    
    sb.append("    annuityProductType: ").append(toIndentedString(annuityProductType)).append("\n");
    sb.append("    annuityValueBasis: ").append(toIndentedString(annuityValueBasis)).append("\n");
    sb.append("    paymentAmount: ").append(toIndentedString(paymentAmount)).append("\n");
    sb.append("    paymentFrequency: ").append(toIndentedString(paymentFrequency)).append("\n");
    sb.append("    paymentStartDate: ").append(toIndentedString(paymentStartDate)).append("\n");
    sb.append("    paymentEndDate: ").append(toIndentedString(paymentEndDate)).append("\n");
    sb.append("    totalPaymentCount: ").append(toIndentedString(totalPaymentCount)).append("\n");
    sb.append("    netPresentValue: ").append(toIndentedString(netPresentValue)).append("\n");
    sb.append("    annualIncrease: ").append(toIndentedString(annualIncrease)).append("\n");
    sb.append("    annualIncreaseType: ").append(toIndentedString(annualIncreaseType)).append("\n");
    sb.append("    periodCertainGuarantee: ").append(toIndentedString(periodCertainGuarantee)).append("\n");
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

