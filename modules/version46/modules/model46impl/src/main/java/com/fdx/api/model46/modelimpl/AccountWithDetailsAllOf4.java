package com.fdx.api.model46.modelimpl;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * AccountWithDetailsAllOf4
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class AccountWithDetailsAllOf4   {
  @JsonProperty("insuranceAccount")
  private InsuranceAccount insuranceAccount;

  public AccountWithDetailsAllOf4 insuranceAccount(InsuranceAccount insuranceAccount) {
    this.insuranceAccount = insuranceAccount;
    return this;
  }

  /**
   * Get insuranceAccount
   * @return insuranceAccount
  */
  @ApiModelProperty(value = "")

  @Valid

  public InsuranceAccount getInsuranceAccount() {
    return insuranceAccount;
  }

  public void setInsuranceAccount(InsuranceAccount insuranceAccount) {
    this.insuranceAccount = insuranceAccount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountWithDetailsAllOf4 accountWithDetailsAllOf4 = (AccountWithDetailsAllOf4) o;
    return Objects.equals(this.insuranceAccount, accountWithDetailsAllOf4.insuranceAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(insuranceAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountWithDetailsAllOf4 {\n");
    
    sb.append("    insuranceAccount: ").append(toIndentedString(insuranceAccount)).append("\n");
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

