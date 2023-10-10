package com.fdx.api.model46.modelimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A lightweight array of accounts
 */
@ApiModel(description = "A lightweight array of accounts")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class AccountDescriptorList   {
  @JsonProperty("accountDescriptor")
  @Valid
  private List<AccountDescriptor> accountDescriptor = null;

  public AccountDescriptorList accountDescriptor(List<AccountDescriptor> accountDescriptor) {
    this.accountDescriptor = accountDescriptor;
    return this;
  }

  public AccountDescriptorList addAccountDescriptorItem(AccountDescriptor accountDescriptorItem) {
    if (this.accountDescriptor == null) {
      this.accountDescriptor = new ArrayList<>();
    }
    this.accountDescriptor.add(accountDescriptorItem);
    return this;
  }

  /**
   * A lightweight description of an account
   * @return accountDescriptor
  */
  @ApiModelProperty(value = "A lightweight description of an account")

  @Valid

  public List<AccountDescriptor> getAccountDescriptor() {
    return accountDescriptor;
  }

  public void setAccountDescriptor(List<AccountDescriptor> accountDescriptor) {
    this.accountDescriptor = accountDescriptor;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountDescriptorList accountDescriptorList = (AccountDescriptorList) o;
    return Objects.equals(this.accountDescriptor, accountDescriptorList.accountDescriptor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountDescriptor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountDescriptorList {\n");
    
    sb.append("    accountDescriptor: ").append(toIndentedString(accountDescriptor)).append("\n");
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

