package com.fdx.api.model46.modelimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * PaymentsAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class PaymentsAllOf   {
  @JsonProperty("payments")
  @Valid
  private List<Payment> payments = new ArrayList<>();

  public PaymentsAllOf payments(List<Payment> payments) {
    this.payments = payments;
    return this;
  }

  public PaymentsAllOf addPaymentsItem(Payment paymentsItem) {
    this.payments.add(paymentsItem);
    return this;
  }

  /**
   * Payments retrieved by the operation
   * @return payments
  */
  @ApiModelProperty(required = true, value = "Payments retrieved by the operation")
  @NotNull

  @Valid

  public List<Payment> getPayments() {
    return payments;
  }

  public void setPayments(List<Payment> payments) {
    this.payments = payments;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentsAllOf paymentsAllOf = (PaymentsAllOf) o;
    return Objects.equals(this.payments, paymentsAllOf.payments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentsAllOf {\n");
    
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
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

