package com.fdx.api.model46.modelimpl;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * AccountWithDetailsAllOf3
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class AccountWithDetailsAllOf3   {
  @JsonProperty("investmentAccount")
  private InvestmentAccount investmentAccount;

  public AccountWithDetailsAllOf3 investmentAccount(InvestmentAccount investmentAccount) {
    this.investmentAccount = investmentAccount;
    return this;
  }

  /**
   * Get investmentAccount
   * @return investmentAccount
  */
  @ApiModelProperty(value = "")

  @Valid

  public InvestmentAccount getInvestmentAccount() {
    return investmentAccount;
  }

  public void setInvestmentAccount(InvestmentAccount investmentAccount) {
    this.investmentAccount = investmentAccount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountWithDetailsAllOf3 accountWithDetailsAllOf3 = (AccountWithDetailsAllOf3) o;
    return Objects.equals(this.investmentAccount, accountWithDetailsAllOf3.investmentAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(investmentAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountWithDetailsAllOf3 {\n");
    
    sb.append("    investmentAccount: ").append(toIndentedString(investmentAccount)).append("\n");
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

