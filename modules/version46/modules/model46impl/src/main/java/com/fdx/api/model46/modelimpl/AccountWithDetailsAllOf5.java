package com.fdx.api.model46.modelimpl;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * AccountWithDetailsAllOf5
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class AccountWithDetailsAllOf5   {
  @JsonProperty("annuityAccount")
  private AnnuityAccount annuityAccount;

  public AccountWithDetailsAllOf5 annuityAccount(AnnuityAccount annuityAccount) {
    this.annuityAccount = annuityAccount;
    return this;
  }

  /**
   * Get annuityAccount
   * @return annuityAccount
  */
  @ApiModelProperty(value = "")

  @Valid

  public AnnuityAccount getAnnuityAccount() {
    return annuityAccount;
  }

  public void setAnnuityAccount(AnnuityAccount annuityAccount) {
    this.annuityAccount = annuityAccount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountWithDetailsAllOf5 accountWithDetailsAllOf5 = (AccountWithDetailsAllOf5) o;
    return Objects.equals(this.annuityAccount, accountWithDetailsAllOf5.annuityAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annuityAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountWithDetailsAllOf5 {\n");
    
    sb.append("    annuityAccount: ").append(toIndentedString(annuityAccount)).append("\n");
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

