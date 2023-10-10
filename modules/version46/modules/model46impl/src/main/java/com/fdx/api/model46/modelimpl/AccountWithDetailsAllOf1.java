package com.fdx.api.model46.modelimpl;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * AccountWithDetailsAllOf1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class AccountWithDetailsAllOf1   {
  @JsonProperty("loanAccount")
  private LoanAccount loanAccount;

  public AccountWithDetailsAllOf1 loanAccount(LoanAccount loanAccount) {
    this.loanAccount = loanAccount;
    return this;
  }

  /**
   * Get loanAccount
   * @return loanAccount
  */
  @ApiModelProperty(value = "")

  @Valid

  public LoanAccount getLoanAccount() {
    return loanAccount;
  }

  public void setLoanAccount(LoanAccount loanAccount) {
    this.loanAccount = loanAccount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountWithDetailsAllOf1 accountWithDetailsAllOf1 = (AccountWithDetailsAllOf1) o;
    return Objects.equals(this.loanAccount, accountWithDetailsAllOf1.loanAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loanAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountWithDetailsAllOf1 {\n");
    
    sb.append("    loanAccount: ").append(toIndentedString(loanAccount)).append("\n");
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

