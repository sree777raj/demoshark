package com.fdx.api.model46.modelimpl;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * AccountWithDetailsAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class AccountWithDetailsAllOf   {
  @JsonProperty("depositAccount")
  private DepositAccount depositAccount;

  public AccountWithDetailsAllOf depositAccount(DepositAccount depositAccount) {
    this.depositAccount = depositAccount;
    return this;
  }

  /**
   * Get depositAccount
   * @return depositAccount
  */
  @ApiModelProperty(value = "")

  @Valid

  public DepositAccount getDepositAccount() {
    return depositAccount;
  }

  public void setDepositAccount(DepositAccount depositAccount) {
    this.depositAccount = depositAccount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountWithDetailsAllOf accountWithDetailsAllOf = (AccountWithDetailsAllOf) o;
    return Objects.equals(this.depositAccount, accountWithDetailsAllOf.depositAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depositAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountWithDetailsAllOf {\n");
    
    sb.append("    depositAccount: ").append(toIndentedString(depositAccount)).append("\n");
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

