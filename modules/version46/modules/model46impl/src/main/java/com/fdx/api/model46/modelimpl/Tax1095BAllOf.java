package com.fdx.api.model46.modelimpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.fasterxml.jackson.annotation.OptBoolean;
import io.swagger.annotations.ApiModelProperty;

/**
 * Tax1095BAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1095BAllOf   {
  @JsonProperty("responsibleName")
  private IndividualName responsibleName;

  @JsonProperty("responsibleTin")
  private String responsibleTin;

  @JsonProperty("responsibleDateOfBirth")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
  private LocalDate responsibleDateOfBirth;

  @JsonProperty("responsibleAddress")
  private Address responsibleAddress;

  @JsonProperty("originOfHealthCoverageCode")
  private String originOfHealthCoverageCode;

  @JsonProperty("employerNameAddress")
  private NameAddress employerNameAddress;

  @JsonProperty("employerId")
  private String employerId;

  @JsonProperty("employerTin")
  private String employerTin;

  @JsonProperty("issuerNameAddressPhone")
  private NameAddressPhone issuerNameAddressPhone;

  @JsonProperty("issuerNameAddress")
  private NameAddressPhone issuerNameAddress;

  @JsonProperty("issuerId")
  private String issuerId;

  @JsonProperty("issuerTin")
  private String issuerTin;

  @JsonProperty("coveredIndividuals")
  @Valid
  private List<HealthInsuranceCoveredIndividual> coveredIndividuals = null;

  public Tax1095BAllOf responsibleName(IndividualName responsibleName) {
    this.responsibleName = responsibleName;
    return this;
  }

  /**
   * Get responsibleName
   * @return responsibleName
  */
  @ApiModelProperty(value = "")

  @Valid

  public IndividualName getResponsibleName() {
    return responsibleName;
  }

  public void setResponsibleName(IndividualName responsibleName) {
    this.responsibleName = responsibleName;
  }

  public Tax1095BAllOf responsibleTin(String responsibleTin) {
    this.responsibleTin = responsibleTin;
    return this;
  }

  /**
   * Box 2, Social security number (SSN or other TIN)
   * @return responsibleTin
  */
  @ApiModelProperty(value = "Box 2, Social security number (SSN or other TIN)")


  public String getResponsibleTin() {
    return responsibleTin;
  }

  public void setResponsibleTin(String responsibleTin) {
    this.responsibleTin = responsibleTin;
  }

  public Tax1095BAllOf responsibleDateOfBirth(LocalDate responsibleDateOfBirth) {
    this.responsibleDateOfBirth = responsibleDateOfBirth;
    return this;
  }

  /**
   * ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included according to [IETF RFC3339] (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)
   * @return responsibleDateOfBirth
  */
  @ApiModelProperty(value = "ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included according to [IETF RFC3339] (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)")

  @Valid
@Size(max=10) 
  public LocalDate getResponsibleDateOfBirth() {
    return responsibleDateOfBirth;
  }

  public void setResponsibleDateOfBirth(LocalDate responsibleDateOfBirth) {
    this.responsibleDateOfBirth = responsibleDateOfBirth;
  }

  public Tax1095BAllOf responsibleAddress(Address responsibleAddress) {
    this.responsibleAddress = responsibleAddress;
    return this;
  }

  /**
   * Get responsibleAddress
   * @return responsibleAddress
  */
  @ApiModelProperty(value = "")

  @Valid

  public Address getResponsibleAddress() {
    return responsibleAddress;
  }

  public void setResponsibleAddress(Address responsibleAddress) {
    this.responsibleAddress = responsibleAddress;
  }

  public Tax1095BAllOf originOfHealthCoverageCode(String originOfHealthCoverageCode) {
    this.originOfHealthCoverageCode = originOfHealthCoverageCode;
    return this;
  }

  /**
   * Box 8, Enter letter identifying Origin of the Health Coverage
   * @return originOfHealthCoverageCode
  */
  @ApiModelProperty(value = "Box 8, Enter letter identifying Origin of the Health Coverage")


  public String getOriginOfHealthCoverageCode() {
    return originOfHealthCoverageCode;
  }

  public void setOriginOfHealthCoverageCode(String originOfHealthCoverageCode) {
    this.originOfHealthCoverageCode = originOfHealthCoverageCode;
  }

  public Tax1095BAllOf employerNameAddress(NameAddress employerNameAddress) {
    this.employerNameAddress = employerNameAddress;
    return this;
  }

  /**
   * Get employerNameAddress
   * @return employerNameAddress
  */
  @ApiModelProperty(value = "")

  @Valid

  public NameAddress getEmployerNameAddress() {
    return employerNameAddress;
  }

  public void setEmployerNameAddress(NameAddress employerNameAddress) {
    this.employerNameAddress = employerNameAddress;
  }

  public Tax1095BAllOf employerId(String employerId) {
    this.employerId = employerId;
    return this;
  }

  /**
   * Box 11, Employer identification number (EIN) (deprecated for rename to employerTin, removing in FDX v5.0)
   * @return employerId
  */
  @ApiModelProperty(value = "Box 11, Employer identification number (EIN) (deprecated for rename to employerTin, removing in FDX v5.0)")


  public String getEmployerId() {
    return employerId;
  }

  public void setEmployerId(String employerId) {
    this.employerId = employerId;
  }

  public Tax1095BAllOf employerTin(String employerTin) {
    this.employerTin = employerTin;
    return this;
  }

  /**
   * Box 11, Employer identification number (EIN)
   * @return employerTin
  */
  @ApiModelProperty(value = "Box 11, Employer identification number (EIN)")


  public String getEmployerTin() {
    return employerTin;
  }

  public void setEmployerTin(String employerTin) {
    this.employerTin = employerTin;
  }

  public Tax1095BAllOf issuerNameAddressPhone(NameAddressPhone issuerNameAddressPhone) {
    this.issuerNameAddressPhone = issuerNameAddressPhone;
    return this;
  }

  /**
   * Get issuerNameAddressPhone
   * @return issuerNameAddressPhone
  */
  @ApiModelProperty(value = "")

  @Valid

  public NameAddressPhone getIssuerNameAddressPhone() {
    return issuerNameAddressPhone;
  }

  public void setIssuerNameAddressPhone(NameAddressPhone issuerNameAddressPhone) {
    this.issuerNameAddressPhone = issuerNameAddressPhone;
  }

  public Tax1095BAllOf issuerNameAddress(NameAddressPhone issuerNameAddress) {
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

  public Tax1095BAllOf issuerId(String issuerId) {
    this.issuerId = issuerId;
    return this;
  }

  /**
   * Box 17, Employer identification number (EIN) (deprecated for rename to issuerTin, removing in FDX v5.0)
   * @return issuerId
  */
  @ApiModelProperty(value = "Box 17, Employer identification number (EIN) (deprecated for rename to issuerTin, removing in FDX v5.0)")


  public String getIssuerId() {
    return issuerId;
  }

  public void setIssuerId(String issuerId) {
    this.issuerId = issuerId;
  }

  public Tax1095BAllOf issuerTin(String issuerTin) {
    this.issuerTin = issuerTin;
    return this;
  }

  /**
   * Box 17, Employer identification number (EIN)
   * @return issuerTin
  */
  @ApiModelProperty(value = "Box 17, Employer identification number (EIN)")


  public String getIssuerTin() {
    return issuerTin;
  }

  public void setIssuerTin(String issuerTin) {
    this.issuerTin = issuerTin;
  }

  public Tax1095BAllOf coveredIndividuals(List<HealthInsuranceCoveredIndividual> coveredIndividuals) {
    this.coveredIndividuals = coveredIndividuals;
    return this;
  }

  public Tax1095BAllOf addCoveredIndividualsItem(HealthInsuranceCoveredIndividual coveredIndividualsItem) {
    if (this.coveredIndividuals == null) {
      this.coveredIndividuals = new ArrayList<>();
    }
    this.coveredIndividuals.add(coveredIndividualsItem);
    return this;
  }

  /**
   * Boxes 23+, Covered Individuals
   * @return coveredIndividuals
  */
  @ApiModelProperty(value = "Boxes 23+, Covered Individuals")

  @Valid

  public List<HealthInsuranceCoveredIndividual> getCoveredIndividuals() {
    return coveredIndividuals;
  }

  public void setCoveredIndividuals(List<HealthInsuranceCoveredIndividual> coveredIndividuals) {
    this.coveredIndividuals = coveredIndividuals;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tax1095BAllOf tax1095BAllOf = (Tax1095BAllOf) o;
    return Objects.equals(this.responsibleName, tax1095BAllOf.responsibleName) &&
        Objects.equals(this.responsibleTin, tax1095BAllOf.responsibleTin) &&
        Objects.equals(this.responsibleDateOfBirth, tax1095BAllOf.responsibleDateOfBirth) &&
        Objects.equals(this.responsibleAddress, tax1095BAllOf.responsibleAddress) &&
        Objects.equals(this.originOfHealthCoverageCode, tax1095BAllOf.originOfHealthCoverageCode) &&
        Objects.equals(this.employerNameAddress, tax1095BAllOf.employerNameAddress) &&
        Objects.equals(this.employerId, tax1095BAllOf.employerId) &&
        Objects.equals(this.employerTin, tax1095BAllOf.employerTin) &&
        Objects.equals(this.issuerNameAddressPhone, tax1095BAllOf.issuerNameAddressPhone) &&
        Objects.equals(this.issuerNameAddress, tax1095BAllOf.issuerNameAddress) &&
        Objects.equals(this.issuerId, tax1095BAllOf.issuerId) &&
        Objects.equals(this.issuerTin, tax1095BAllOf.issuerTin) &&
        Objects.equals(this.coveredIndividuals, tax1095BAllOf.coveredIndividuals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responsibleName, responsibleTin, responsibleDateOfBirth, responsibleAddress, originOfHealthCoverageCode, employerNameAddress, employerId, employerTin, issuerNameAddressPhone, issuerNameAddress, issuerId, issuerTin, coveredIndividuals);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tax1095BAllOf {\n");
    
    sb.append("    responsibleName: ").append(toIndentedString(responsibleName)).append("\n");
    sb.append("    responsibleTin: ").append(toIndentedString(responsibleTin)).append("\n");
    sb.append("    responsibleDateOfBirth: ").append(toIndentedString(responsibleDateOfBirth)).append("\n");
    sb.append("    responsibleAddress: ").append(toIndentedString(responsibleAddress)).append("\n");
    sb.append("    originOfHealthCoverageCode: ").append(toIndentedString(originOfHealthCoverageCode)).append("\n");
    sb.append("    employerNameAddress: ").append(toIndentedString(employerNameAddress)).append("\n");
    sb.append("    employerId: ").append(toIndentedString(employerId)).append("\n");
    sb.append("    employerTin: ").append(toIndentedString(employerTin)).append("\n");
    sb.append("    issuerNameAddressPhone: ").append(toIndentedString(issuerNameAddressPhone)).append("\n");
    sb.append("    issuerNameAddress: ").append(toIndentedString(issuerNameAddress)).append("\n");
    sb.append("    issuerId: ").append(toIndentedString(issuerId)).append("\n");
    sb.append("    issuerTin: ").append(toIndentedString(issuerTin)).append("\n");
    sb.append("    coveredIndividuals: ").append(toIndentedString(coveredIndividuals)).append("\n");
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

