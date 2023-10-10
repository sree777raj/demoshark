package com.fdx.api.model46.modelimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * AccountPaymentNetworkListAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class AccountPaymentNetworkListAllOf   {
  @JsonProperty("paymentNetworks")
  @Valid
  private List<AccountPaymentNetwork> paymentNetworks = null;

  public AccountPaymentNetworkListAllOf paymentNetworks(List<AccountPaymentNetwork> paymentNetworks) {
    this.paymentNetworks = paymentNetworks;
    return this;
  }

  public AccountPaymentNetworkListAllOf addPaymentNetworksItem(AccountPaymentNetwork paymentNetworksItem) {
    if (this.paymentNetworks == null) {
      this.paymentNetworks = new ArrayList<>();
    }
    this.paymentNetworks.add(paymentNetworksItem);
    return this;
  }

  /**
   * Array of payment networks
   * @return paymentNetworks
  */
  @ApiModelProperty(value = "Array of payment networks")

  @Valid

  public List<AccountPaymentNetwork> getPaymentNetworks() {
    return paymentNetworks;
  }

  public void setPaymentNetworks(List<AccountPaymentNetwork> paymentNetworks) {
    this.paymentNetworks = paymentNetworks;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountPaymentNetworkListAllOf accountPaymentNetworkListAllOf = (AccountPaymentNetworkListAllOf) o;
    return Objects.equals(this.paymentNetworks, accountPaymentNetworkListAllOf.paymentNetworks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentNetworks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountPaymentNetworkListAllOf {\n");
    
    sb.append("    paymentNetworks: ").append(toIndentedString(paymentNetworks)).append("\n");
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

