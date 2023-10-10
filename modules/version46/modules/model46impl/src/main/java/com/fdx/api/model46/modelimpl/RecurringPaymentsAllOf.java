package com.fdx.api.model46.modelimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * RecurringPaymentsAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class RecurringPaymentsAllOf   {
  @JsonProperty("recurringPayments")
  @Valid
  private List<RecurringPayment> recurringPayments = new ArrayList<>();

  public RecurringPaymentsAllOf recurringPayments(List<RecurringPayment> recurringPayments) {
    this.recurringPayments = recurringPayments;
    return this;
  }

  public RecurringPaymentsAllOf addRecurringPaymentsItem(RecurringPayment recurringPaymentsItem) {
    this.recurringPayments.add(recurringPaymentsItem);
    return this;
  }

  /**
   * Recurring payments retrieved by the operation
   * @return recurringPayments
  */
  @ApiModelProperty(required = true, value = "Recurring payments retrieved by the operation")
  @NotNull

  @Valid

  public List<RecurringPayment> getRecurringPayments() {
    return recurringPayments;
  }

  public void setRecurringPayments(List<RecurringPayment> recurringPayments) {
    this.recurringPayments = recurringPayments;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecurringPaymentsAllOf recurringPaymentsAllOf = (RecurringPaymentsAllOf) o;
    return Objects.equals(this.recurringPayments, recurringPaymentsAllOf.recurringPayments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recurringPayments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecurringPaymentsAllOf {\n");
    
    sb.append("    recurringPayments: ").append(toIndentedString(recurringPayments)).append("\n");
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

