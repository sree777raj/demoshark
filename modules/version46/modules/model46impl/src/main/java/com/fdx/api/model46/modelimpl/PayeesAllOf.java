package com.fdx.api.model46.modelimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * PayeesAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class PayeesAllOf   {
  @JsonProperty("payees")
  @Valid
  private List<Payee> payees = new ArrayList<>();

  public PayeesAllOf payees(List<Payee> payees) {
    this.payees = payees;
    return this;
  }

  public PayeesAllOf addPayeesItem(Payee payeesItem) {
    this.payees.add(payeesItem);
    return this;
  }

  /**
   * Payees retrieved by the operation
   * @return payees
  */
  @ApiModelProperty(required = true, value = "Payees retrieved by the operation")
  @NotNull

  @Valid

  public List<Payee> getPayees() {
    return payees;
  }

  public void setPayees(List<Payee> payees) {
    this.payees = payees;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayeesAllOf payeesAllOf = (PayeesAllOf) o;
    return Objects.equals(this.payees, payeesAllOf.payees);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payees);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayeesAllOf {\n");
    
    sb.append("    payees: ").append(toIndentedString(payees)).append("\n");
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

