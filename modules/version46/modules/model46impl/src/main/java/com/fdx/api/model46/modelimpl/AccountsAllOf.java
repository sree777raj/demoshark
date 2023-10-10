package com.fdx.api.model46.modelimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * AccountsAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class AccountsAllOf   {
  @JsonProperty("accounts")
  @Valid
  private List<AccountWithDetails> accounts = null;

  public AccountsAllOf accounts(List<AccountWithDetails> accounts) {
    this.accounts = accounts;
    return this;
  }

  public AccountsAllOf addAccountsItem(AccountWithDetails accountsItem) {
    if (this.accounts == null) {
      this.accounts = new ArrayList<>();
    }
    this.accounts.add(accountsItem);
    return this;
  }

  /**
   * An array of accounts with entity types dependent on the account type (deposit, investment, loan, line of credit, annuity or insurance)
   * @return accounts
  */
  @ApiModelProperty(value = "An array of accounts with entity types dependent on the account type (deposit, investment, loan, line of credit, annuity or insurance)")

  @Valid

  public List<AccountWithDetails> getAccounts() {
    return accounts;
  }

  public void setAccounts(List<AccountWithDetails> accounts) {
    this.accounts = accounts;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountsAllOf accountsAllOf = (AccountsAllOf) o;
    return Objects.equals(this.accounts, accountsAllOf.accounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountsAllOf {\n");
    
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
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

