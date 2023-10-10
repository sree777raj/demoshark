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
 * Tax1095AAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1095AAllOf   {
  @JsonProperty("marketplaceId")
  private String marketplaceId;

  @JsonProperty("marketplacePolicyNumber")
  private String marketplacePolicyNumber;

  @JsonProperty("policyIssuerName")
  private String policyIssuerName;

  @JsonProperty("recipientName")
  private String recipientName;

  @JsonProperty("recipientTin")
  private String recipientTin;

  @JsonProperty("recipientDateOfBirth")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
  private LocalDate recipientDateOfBirth;

  @JsonProperty("spouseName")
  private String spouseName;

  @JsonProperty("spouseTin")
  private String spouseTin;

  @JsonProperty("spouseDateOfBirth")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
  private LocalDate spouseDateOfBirth;

  @JsonProperty("policyStartDate")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
  private LocalDate policyStartDate;

  @JsonProperty("policyTerminationDate")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
  private LocalDate policyTerminationDate;

  @JsonProperty("recipientAddress")
  private Address recipientAddress;

  @JsonProperty("coveredIndividuals")
  @Valid
  private List<HealthInsuranceMarketplaceCoveredIndividual> coveredIndividuals = null;

  @JsonProperty("coverages")
  @Valid
  private List<HealthInsuranceCoverage> coverages = null;

  public Tax1095AAllOf marketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
    return this;
  }

  /**
   * Box 1, Marketplace identifier
   * @return marketplaceId
  */
  @ApiModelProperty(value = "Box 1, Marketplace identifier")


  public String getMarketplaceId() {
    return marketplaceId;
  }

  public void setMarketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
  }

  public Tax1095AAllOf marketplacePolicyNumber(String marketplacePolicyNumber) {
    this.marketplacePolicyNumber = marketplacePolicyNumber;
    return this;
  }

  /**
   * Box 2, Marketplace-assigned policy number
   * @return marketplacePolicyNumber
  */
  @ApiModelProperty(value = "Box 2, Marketplace-assigned policy number")


  public String getMarketplacePolicyNumber() {
    return marketplacePolicyNumber;
  }

  public void setMarketplacePolicyNumber(String marketplacePolicyNumber) {
    this.marketplacePolicyNumber = marketplacePolicyNumber;
  }

  public Tax1095AAllOf policyIssuerName(String policyIssuerName) {
    this.policyIssuerName = policyIssuerName;
    return this;
  }

  /**
   * Box 3, Policy issuer's name
   * @return policyIssuerName
  */
  @ApiModelProperty(value = "Box 3, Policy issuer's name")


  public String getPolicyIssuerName() {
    return policyIssuerName;
  }

  public void setPolicyIssuerName(String policyIssuerName) {
    this.policyIssuerName = policyIssuerName;
  }

  public Tax1095AAllOf recipientName(String recipientName) {
    this.recipientName = recipientName;
    return this;
  }

  /**
   * Box 4, Recipient's name
   * @return recipientName
  */
  @ApiModelProperty(value = "Box 4, Recipient's name")


  public String getRecipientName() {
    return recipientName;
  }

  public void setRecipientName(String recipientName) {
    this.recipientName = recipientName;
  }

  public Tax1095AAllOf recipientTin(String recipientTin) {
    this.recipientTin = recipientTin;
    return this;
  }

  /**
   * Box 5, Recipient's SSN
   * @return recipientTin
  */
  @ApiModelProperty(value = "Box 5, Recipient's SSN")


  public String getRecipientTin() {
    return recipientTin;
  }

  public void setRecipientTin(String recipientTin) {
    this.recipientTin = recipientTin;
  }

  public Tax1095AAllOf recipientDateOfBirth(LocalDate recipientDateOfBirth) {
    this.recipientDateOfBirth = recipientDateOfBirth;
    return this;
  }

  /**
   * ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included according to [IETF RFC3339] (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)
   * @return recipientDateOfBirth
  */
  @ApiModelProperty(value = "ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included according to [IETF RFC3339] (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)")

  @Valid
@Size(max=10) 
  public LocalDate getRecipientDateOfBirth() {
    return recipientDateOfBirth;
  }

  public void setRecipientDateOfBirth(LocalDate recipientDateOfBirth) {
    this.recipientDateOfBirth = recipientDateOfBirth;
  }

  public Tax1095AAllOf spouseName(String spouseName) {
    this.spouseName = spouseName;
    return this;
  }

  /**
   * Box 7, Recipient's spouse's name
   * @return spouseName
  */
  @ApiModelProperty(value = "Box 7, Recipient's spouse's name")


  public String getSpouseName() {
    return spouseName;
  }

  public void setSpouseName(String spouseName) {
    this.spouseName = spouseName;
  }

  public Tax1095AAllOf spouseTin(String spouseTin) {
    this.spouseTin = spouseTin;
    return this;
  }

  /**
   * Box 8, Recipient's spouse's SSN
   * @return spouseTin
  */
  @ApiModelProperty(value = "Box 8, Recipient's spouse's SSN")


  public String getSpouseTin() {
    return spouseTin;
  }

  public void setSpouseTin(String spouseTin) {
    this.spouseTin = spouseTin;
  }

  public Tax1095AAllOf spouseDateOfBirth(LocalDate spouseDateOfBirth) {
    this.spouseDateOfBirth = spouseDateOfBirth;
    return this;
  }

  /**
   * ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included according to [IETF RFC3339] (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)
   * @return spouseDateOfBirth
  */
  @ApiModelProperty(value = "ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included according to [IETF RFC3339] (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)")

  @Valid
@Size(max=10) 
  public LocalDate getSpouseDateOfBirth() {
    return spouseDateOfBirth;
  }

  public void setSpouseDateOfBirth(LocalDate spouseDateOfBirth) {
    this.spouseDateOfBirth = spouseDateOfBirth;
  }

  public Tax1095AAllOf policyStartDate(LocalDate policyStartDate) {
    this.policyStartDate = policyStartDate;
    return this;
  }

  /**
   * ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included according to [IETF RFC3339] (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)
   * @return policyStartDate
  */
  @ApiModelProperty(value = "ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included according to [IETF RFC3339] (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)")

  @Valid
@Size(max=10) 
  public LocalDate getPolicyStartDate() {
    return policyStartDate;
  }

  public void setPolicyStartDate(LocalDate policyStartDate) {
    this.policyStartDate = policyStartDate;
  }

  public Tax1095AAllOf policyTerminationDate(LocalDate policyTerminationDate) {
    this.policyTerminationDate = policyTerminationDate;
    return this;
  }

  /**
   * ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included according to [IETF RFC3339] (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)
   * @return policyTerminationDate
  */
  @ApiModelProperty(value = "ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included according to [IETF RFC3339] (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)")

  @Valid
@Size(max=10) 
  public LocalDate getPolicyTerminationDate() {
    return policyTerminationDate;
  }

  public void setPolicyTerminationDate(LocalDate policyTerminationDate) {
    this.policyTerminationDate = policyTerminationDate;
  }

  public Tax1095AAllOf recipientAddress(Address recipientAddress) {
    this.recipientAddress = recipientAddress;
    return this;
  }

  /**
   * Get recipientAddress
   * @return recipientAddress
  */
  @ApiModelProperty(value = "")

  @Valid

  public Address getRecipientAddress() {
    return recipientAddress;
  }

  public void setRecipientAddress(Address recipientAddress) {
    this.recipientAddress = recipientAddress;
  }

  public Tax1095AAllOf coveredIndividuals(List<HealthInsuranceMarketplaceCoveredIndividual> coveredIndividuals) {
    this.coveredIndividuals = coveredIndividuals;
    return this;
  }

  public Tax1095AAllOf addCoveredIndividualsItem(HealthInsuranceMarketplaceCoveredIndividual coveredIndividualsItem) {
    if (this.coveredIndividuals == null) {
      this.coveredIndividuals = new ArrayList<>();
    }
    this.coveredIndividuals.add(coveredIndividualsItem);
    return this;
  }

  /**
   * Boxes 16+, Covered Individuals
   * @return coveredIndividuals
  */
  @ApiModelProperty(value = "Boxes 16+, Covered Individuals")

  @Valid

  public List<HealthInsuranceMarketplaceCoveredIndividual> getCoveredIndividuals() {
    return coveredIndividuals;
  }

  public void setCoveredIndividuals(List<HealthInsuranceMarketplaceCoveredIndividual> coveredIndividuals) {
    this.coveredIndividuals = coveredIndividuals;
  }

  public Tax1095AAllOf coverages(List<HealthInsuranceCoverage> coverages) {
    this.coverages = coverages;
    return this;
  }

  public Tax1095AAllOf addCoveragesItem(HealthInsuranceCoverage coveragesItem) {
    if (this.coverages == null) {
      this.coverages = new ArrayList<>();
    }
    this.coverages.add(coveragesItem);
    return this;
  }

  /**
   * Boxes 21-33, Coverage Information
   * @return coverages
  */
  @ApiModelProperty(value = "Boxes 21-33, Coverage Information")

  @Valid

  public List<HealthInsuranceCoverage> getCoverages() {
    return coverages;
  }

  public void setCoverages(List<HealthInsuranceCoverage> coverages) {
    this.coverages = coverages;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tax1095AAllOf tax1095AAllOf = (Tax1095AAllOf) o;
    return Objects.equals(this.marketplaceId, tax1095AAllOf.marketplaceId) &&
        Objects.equals(this.marketplacePolicyNumber, tax1095AAllOf.marketplacePolicyNumber) &&
        Objects.equals(this.policyIssuerName, tax1095AAllOf.policyIssuerName) &&
        Objects.equals(this.recipientName, tax1095AAllOf.recipientName) &&
        Objects.equals(this.recipientTin, tax1095AAllOf.recipientTin) &&
        Objects.equals(this.recipientDateOfBirth, tax1095AAllOf.recipientDateOfBirth) &&
        Objects.equals(this.spouseName, tax1095AAllOf.spouseName) &&
        Objects.equals(this.spouseTin, tax1095AAllOf.spouseTin) &&
        Objects.equals(this.spouseDateOfBirth, tax1095AAllOf.spouseDateOfBirth) &&
        Objects.equals(this.policyStartDate, tax1095AAllOf.policyStartDate) &&
        Objects.equals(this.policyTerminationDate, tax1095AAllOf.policyTerminationDate) &&
        Objects.equals(this.recipientAddress, tax1095AAllOf.recipientAddress) &&
        Objects.equals(this.coveredIndividuals, tax1095AAllOf.coveredIndividuals) &&
        Objects.equals(this.coverages, tax1095AAllOf.coverages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketplaceId, marketplacePolicyNumber, policyIssuerName, recipientName, recipientTin, recipientDateOfBirth, spouseName, spouseTin, spouseDateOfBirth, policyStartDate, policyTerminationDate, recipientAddress, coveredIndividuals, coverages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tax1095AAllOf {\n");
    
    sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
    sb.append("    marketplacePolicyNumber: ").append(toIndentedString(marketplacePolicyNumber)).append("\n");
    sb.append("    policyIssuerName: ").append(toIndentedString(policyIssuerName)).append("\n");
    sb.append("    recipientName: ").append(toIndentedString(recipientName)).append("\n");
    sb.append("    recipientTin: ").append(toIndentedString(recipientTin)).append("\n");
    sb.append("    recipientDateOfBirth: ").append(toIndentedString(recipientDateOfBirth)).append("\n");
    sb.append("    spouseName: ").append(toIndentedString(spouseName)).append("\n");
    sb.append("    spouseTin: ").append(toIndentedString(spouseTin)).append("\n");
    sb.append("    spouseDateOfBirth: ").append(toIndentedString(spouseDateOfBirth)).append("\n");
    sb.append("    policyStartDate: ").append(toIndentedString(policyStartDate)).append("\n");
    sb.append("    policyTerminationDate: ").append(toIndentedString(policyTerminationDate)).append("\n");
    sb.append("    recipientAddress: ").append(toIndentedString(recipientAddress)).append("\n");
    sb.append("    coveredIndividuals: ").append(toIndentedString(coveredIndividuals)).append("\n");
    sb.append("    coverages: ").append(toIndentedString(coverages)).append("\n");
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

