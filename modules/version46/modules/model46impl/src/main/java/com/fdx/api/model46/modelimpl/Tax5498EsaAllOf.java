package com.fdx.api.model46.modelimpl;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Tax5498EsaAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax5498EsaAllOf   {
  @JsonProperty("issuerNameAddress")
  private NameAddressPhone issuerNameAddress;

  @JsonProperty("issuerTin")
  private String issuerTin;

  @JsonProperty("participantTin")
  private String participantTin;

  @JsonProperty("beneficiaryTin")
  private String beneficiaryTin;

  @JsonProperty("beneficiaryNameAddress")
  private NameAddress beneficiaryNameAddress;

  @JsonProperty("accountNumber")
  private String accountNumber;

  @JsonProperty("coverdellEsaContributions")
  private Double coverdellEsaContributions;

  @JsonProperty("rolloverContributions")
  private Double rolloverContributions;

  public Tax5498EsaAllOf issuerNameAddress(NameAddressPhone issuerNameAddress) {
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

  public Tax5498EsaAllOf issuerTin(String issuerTin) {
    this.issuerTin = issuerTin;
    return this;
  }

  /**
   * TRUSTEE'S/ISSUER'S TIN
   * @return issuerTin
  */
  @ApiModelProperty(value = "TRUSTEE'S/ISSUER'S TIN")


  public String getIssuerTin() {
    return issuerTin;
  }

  public void setIssuerTin(String issuerTin) {
    this.issuerTin = issuerTin;
  }

  public Tax5498EsaAllOf participantTin(String participantTin) {
    this.participantTin = participantTin;
    return this;
  }

  /**
   * BENEFICIARY'S TIN (deprecated for rename to beneficiaryTin, removing in FDX v5.0)
   * @return participantTin
  */
  @ApiModelProperty(value = "BENEFICIARY'S TIN (deprecated for rename to beneficiaryTin, removing in FDX v5.0)")


  public String getParticipantTin() {
    return participantTin;
  }

  public void setParticipantTin(String participantTin) {
    this.participantTin = participantTin;
  }

  public Tax5498EsaAllOf beneficiaryTin(String beneficiaryTin) {
    this.beneficiaryTin = beneficiaryTin;
    return this;
  }

  /**
   * BENEFICIARY'S TIN
   * @return beneficiaryTin
  */
  @ApiModelProperty(value = "BENEFICIARY'S TIN")


  public String getBeneficiaryTin() {
    return beneficiaryTin;
  }

  public void setBeneficiaryTin(String beneficiaryTin) {
    this.beneficiaryTin = beneficiaryTin;
  }

  public Tax5498EsaAllOf beneficiaryNameAddress(NameAddress beneficiaryNameAddress) {
    this.beneficiaryNameAddress = beneficiaryNameAddress;
    return this;
  }

  /**
   * Get beneficiaryNameAddress
   * @return beneficiaryNameAddress
  */
  @ApiModelProperty(value = "")

  @Valid

  public NameAddress getBeneficiaryNameAddress() {
    return beneficiaryNameAddress;
  }

  public void setBeneficiaryNameAddress(NameAddress beneficiaryNameAddress) {
    this.beneficiaryNameAddress = beneficiaryNameAddress;
  }

  public Tax5498EsaAllOf accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * Account number
   * @return accountNumber
  */
  @ApiModelProperty(value = "Account number")


  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public Tax5498EsaAllOf coverdellEsaContributions(Double coverdellEsaContributions) {
    this.coverdellEsaContributions = coverdellEsaContributions;
    return this;
  }

  /**
   * Box 1, Coverdell ESA contributions
   * @return coverdellEsaContributions
  */
  @ApiModelProperty(value = "Box 1, Coverdell ESA contributions")


  public Double getCoverdellEsaContributions() {
    return coverdellEsaContributions;
  }

  public void setCoverdellEsaContributions(Double coverdellEsaContributions) {
    this.coverdellEsaContributions = coverdellEsaContributions;
  }

  public Tax5498EsaAllOf rolloverContributions(Double rolloverContributions) {
    this.rolloverContributions = rolloverContributions;
    return this;
  }

  /**
   * Box 2, Rollover contributions
   * @return rolloverContributions
  */
  @ApiModelProperty(value = "Box 2, Rollover contributions")


  public Double getRolloverContributions() {
    return rolloverContributions;
  }

  public void setRolloverContributions(Double rolloverContributions) {
    this.rolloverContributions = rolloverContributions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tax5498EsaAllOf tax5498EsaAllOf = (Tax5498EsaAllOf) o;
    return Objects.equals(this.issuerNameAddress, tax5498EsaAllOf.issuerNameAddress) &&
        Objects.equals(this.issuerTin, tax5498EsaAllOf.issuerTin) &&
        Objects.equals(this.participantTin, tax5498EsaAllOf.participantTin) &&
        Objects.equals(this.beneficiaryTin, tax5498EsaAllOf.beneficiaryTin) &&
        Objects.equals(this.beneficiaryNameAddress, tax5498EsaAllOf.beneficiaryNameAddress) &&
        Objects.equals(this.accountNumber, tax5498EsaAllOf.accountNumber) &&
        Objects.equals(this.coverdellEsaContributions, tax5498EsaAllOf.coverdellEsaContributions) &&
        Objects.equals(this.rolloverContributions, tax5498EsaAllOf.rolloverContributions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuerNameAddress, issuerTin, participantTin, beneficiaryTin, beneficiaryNameAddress, accountNumber, coverdellEsaContributions, rolloverContributions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tax5498EsaAllOf {\n");
    
    sb.append("    issuerNameAddress: ").append(toIndentedString(issuerNameAddress)).append("\n");
    sb.append("    issuerTin: ").append(toIndentedString(issuerTin)).append("\n");
    sb.append("    participantTin: ").append(toIndentedString(participantTin)).append("\n");
    sb.append("    beneficiaryTin: ").append(toIndentedString(beneficiaryTin)).append("\n");
    sb.append("    beneficiaryNameAddress: ").append(toIndentedString(beneficiaryNameAddress)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    coverdellEsaContributions: ").append(toIndentedString(coverdellEsaContributions)).append("\n");
    sb.append("    rolloverContributions: ").append(toIndentedString(rolloverContributions)).append("\n");
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

