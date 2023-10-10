package com.fdx.api.model46.modelimpl;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * AccountWithDetailsAllOf2
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class AccountWithDetailsAllOf2   {
  @JsonProperty("locAccount")
  private LocAccount locAccount;

  public AccountWithDetailsAllOf2 locAccount(LocAccount locAccount) {
    this.locAccount = locAccount;
    return this;
  }

  /**
   * Get locAccount
   * @return locAccount
  */
  @ApiModelProperty(value = "")

  @Valid

  public LocAccount getLocAccount() {
    return locAccount;
  }

  public void setLocAccount(LocAccount locAccount) {
    this.locAccount = locAccount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountWithDetailsAllOf2 accountWithDetailsAllOf2 = (AccountWithDetailsAllOf2) o;
    return Objects.equals(this.locAccount, accountWithDetailsAllOf2.locAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountWithDetailsAllOf2 {\n");
    
    sb.append("    locAccount: ").append(toIndentedString(locAccount)).append("\n");
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

