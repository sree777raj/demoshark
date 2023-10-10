package com.fdx.api.model46.modelimpl;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Tax1099SbAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1099SbAllOf   {
  @JsonProperty("issuerNameAddress")
  private NameAddressPhone issuerNameAddress;

  @JsonProperty("issuerTin")
  private String issuerTin;

  @JsonProperty("sellerTin")
  private String sellerTin;

  @JsonProperty("sellerNameAddress")
  private NameAddress sellerNameAddress;

  @JsonProperty("policyNumber")
  private String policyNumber;

  @JsonProperty("contractInvestment")
  private Double contractInvestment;

  @JsonProperty("surrenderAmount")
  private Double surrenderAmount;

  @JsonProperty("contactNameAddress")
  private NameAddressPhone contactNameAddress;

  public Tax1099SbAllOf issuerNameAddress(NameAddressPhone issuerNameAddress) {
    this.issuerNameAddress = issuerNameAddress;
    return this;
  }

  /**
   * Get issuerNameAddress
   * @return issuerNameAddress
  */
  @ApiModelProperty(value = "")

  @Valid

  public NameAddressPhone getIssuerNameAddress() {
    return issuerNameAddress;
  }

  public void setIssuerNameAddress(NameAddressPhone issuerNameAddress) {
    this.issuerNameAddress = issuerNameAddress;
  }

  public Tax1099SbAllOf issuerTin(String issuerTin) {
    this.issuerTin = issuerTin;
    return this;
  }

  /**
   * ISSUER's TIN
   * @return issuerTin
  */
  @ApiModelProperty(value = "ISSUER's TIN")


  public String getIssuerTin() {
    return issuerTin;
  }

  public void setIssuerTin(String issuerTin) {
    this.issuerTin = issuerTin;
  }

  public Tax1099SbAllOf sellerTin(String sellerTin) {
    this.sellerTin = sellerTin;
    return this;
  }

  /**
   * SELLER'S TIN
   * @return sellerTin
  */
  @ApiModelProperty(value = "SELLER'S TIN")


  public String getSellerTin() {
    return sellerTin;
  }

  public void setSellerTin(String sellerTin) {
    this.sellerTin = sellerTin;
  }

  public Tax1099SbAllOf sellerNameAddress(NameAddress sellerNameAddress) {
    this.sellerNameAddress = sellerNameAddress;
    return this;
  }

  /**
   * Get sellerNameAddress
   * @return sellerNameAddress
  */
  @ApiModelProperty(value = "")

  @Valid

  public NameAddress getSellerNameAddress() {
    return sellerNameAddress;
  }

  public void setSellerNameAddress(NameAddress sellerNameAddress) {
    this.sellerNameAddress = sellerNameAddress;
  }

  public Tax1099SbAllOf policyNumber(String policyNumber) {
    this.policyNumber = policyNumber;
    return this;
  }

  /**
   * Policy number
   * @return policyNumber
  */
  @ApiModelProperty(value = "Policy number")


  public String getPolicyNumber() {
    return policyNumber;
  }

  public void setPolicyNumber(String policyNumber) {
    this.policyNumber = policyNumber;
  }

  public Tax1099SbAllOf contractInvestment(Double contractInvestment) {
    this.contractInvestment = contractInvestment;
    return this;
  }

  /**
   * Box 1, Investment in contract
   * @return contractInvestment
  */
  @ApiModelProperty(value = "Box 1, Investment in contract")


  public Double getContractInvestment() {
    return contractInvestment;
  }

  public void setContractInvestment(Double contractInvestment) {
    this.contractInvestment = contractInvestment;
  }

  public Tax1099SbAllOf surrenderAmount(Double surrenderAmount) {
    this.surrenderAmount = surrenderAmount;
    return this;
  }

  /**
   * Box 2, Surrender amount
   * @return surrenderAmount
  */
  @ApiModelProperty(value = "Box 2, Surrender amount")


  public Double getSurrenderAmount() {
    return surrenderAmount;
  }

  public void setSurrenderAmount(Double surrenderAmount) {
    this.surrenderAmount = surrenderAmount;
  }

  public Tax1099SbAllOf contactNameAddress(NameAddressPhone contactNameAddress) {
    this.contactNameAddress = contactNameAddress;
    return this;
  }

  /**
   * Get contactNameAddress
   * @return contactNameAddress
  */
  @ApiModelProperty(value = "")

  @Valid

  public NameAddressPhone getContactNameAddress() {
    return contactNameAddress;
  }

  public void setContactNameAddress(NameAddressPhone contactNameAddress) {
    this.contactNameAddress = contactNameAddress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tax1099SbAllOf tax1099SbAllOf = (Tax1099SbAllOf) o;
    return Objects.equals(this.issuerNameAddress, tax1099SbAllOf.issuerNameAddress) &&
        Objects.equals(this.issuerTin, tax1099SbAllOf.issuerTin) &&
        Objects.equals(this.sellerTin, tax1099SbAllOf.sellerTin) &&
        Objects.equals(this.sellerNameAddress, tax1099SbAllOf.sellerNameAddress) &&
        Objects.equals(this.policyNumber, tax1099SbAllOf.policyNumber) &&
        Objects.equals(this.contractInvestment, tax1099SbAllOf.contractInvestment) &&
        Objects.equals(this.surrenderAmount, tax1099SbAllOf.surrenderAmount) &&
        Objects.equals(this.contactNameAddress, tax1099SbAllOf.contactNameAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuerNameAddress, issuerTin, sellerTin, sellerNameAddress, policyNumber, contractInvestment, surrenderAmount, contactNameAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tax1099SbAllOf {\n");
    
    sb.append("    issuerNameAddress: ").append(toIndentedString(issuerNameAddress)).append("\n");
    sb.append("    issuerTin: ").append(toIndentedString(issuerTin)).append("\n");
    sb.append("    sellerTin: ").append(toIndentedString(sellerTin)).append("\n");
    sb.append("    sellerNameAddress: ").append(toIndentedString(sellerNameAddress)).append("\n");
    sb.append("    policyNumber: ").append(toIndentedString(policyNumber)).append("\n");
    sb.append("    contractInvestment: ").append(toIndentedString(contractInvestment)).append("\n");
    sb.append("    surrenderAmount: ").append(toIndentedString(surrenderAmount)).append("\n");
    sb.append("    contactNameAddress: ").append(toIndentedString(contactNameAddress)).append("\n");
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

