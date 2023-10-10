package com.fdx.api.model46.modelimpl;

import java.time.LocalDate;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.fasterxml.jackson.annotation.OptBoolean;
import io.swagger.annotations.ApiModelProperty;

/**
 * Tax2439AllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax2439AllOf   {
  @JsonProperty("fiscalYearBegin")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
  private LocalDate fiscalYearBegin;

  @JsonProperty("fiscalYearEnd")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
  private LocalDate fiscalYearEnd;

  @JsonProperty("ricOrReitNameAddress")
  private NameAddressPhone ricOrReitNameAddress;

  @JsonProperty("ricOrReitTin")
  private String ricOrReitTin;

  @JsonProperty("shareholderNameAddress")
  private NameAddress shareholderNameAddress;

  @JsonProperty("shareholderTin")
  private String shareholderTin;

  @JsonProperty("undistributedLongTermCapitalGains")
  private Double undistributedLongTermCapitalGains;

  @JsonProperty("unrecaptured1250Gain")
  private Double unrecaptured1250Gain;

  @JsonProperty("section1202Gain")
  private Double section1202Gain;

  @JsonProperty("collectiblesGain")
  private Double collectiblesGain;

  @JsonProperty("taxPaid")
  private Double taxPaid;

  public Tax2439AllOf fiscalYearBegin(LocalDate fiscalYearBegin) {
    this.fiscalYearBegin = fiscalYearBegin;
    return this;
  }

  /**
   * ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included according to [IETF RFC3339] (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)
   * @return fiscalYearBegin
  */
  @ApiModelProperty(value = "ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included according to [IETF RFC3339] (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)")

  @Valid
@Size(max=10) 
  public LocalDate getFiscalYearBegin() {
    return fiscalYearBegin;
  }

  public void setFiscalYearBegin(LocalDate fiscalYearBegin) {
    this.fiscalYearBegin = fiscalYearBegin;
  }

  public Tax2439AllOf fiscalYearEnd(LocalDate fiscalYearEnd) {
    this.fiscalYearEnd = fiscalYearEnd;
    return this;
  }

  /**
   * ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included according to [IETF RFC3339] (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)
   * @return fiscalYearEnd
  */
  @ApiModelProperty(value = "ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included according to [IETF RFC3339] (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)")

  @Valid
@Size(max=10) 
  public LocalDate getFiscalYearEnd() {
    return fiscalYearEnd;
  }

  public void setFiscalYearEnd(LocalDate fiscalYearEnd) {
    this.fiscalYearEnd = fiscalYearEnd;
  }

  public Tax2439AllOf ricOrReitNameAddress(NameAddressPhone ricOrReitNameAddress) {
    this.ricOrReitNameAddress = ricOrReitNameAddress;
    return this;
  }

  /**
   * Get ricOrReitNameAddress
   * @return ricOrReitNameAddress
  */
  @ApiModelProperty(value = "")

  @Valid

  public NameAddressPhone getRicOrReitNameAddress() {
    return ricOrReitNameAddress;
  }

  public void setRicOrReitNameAddress(NameAddressPhone ricOrReitNameAddress) {
    this.ricOrReitNameAddress = ricOrReitNameAddress;
  }

  public Tax2439AllOf ricOrReitTin(String ricOrReitTin) {
    this.ricOrReitTin = ricOrReitTin;
    return this;
  }

  /**
   * Identification number of RIC or REIT
   * @return ricOrReitTin
  */
  @ApiModelProperty(value = "Identification number of RIC or REIT")


  public String getRicOrReitTin() {
    return ricOrReitTin;
  }

  public void setRicOrReitTin(String ricOrReitTin) {
    this.ricOrReitTin = ricOrReitTin;
  }

  public Tax2439AllOf shareholderNameAddress(NameAddress shareholderNameAddress) {
    this.shareholderNameAddress = shareholderNameAddress;
    return this;
  }

  /**
   * Get shareholderNameAddress
   * @return shareholderNameAddress
  */
  @ApiModelProperty(value = "")

  @Valid

  public NameAddress getShareholderNameAddress() {
    return shareholderNameAddress;
  }

  public void setShareholderNameAddress(NameAddress shareholderNameAddress) {
    this.shareholderNameAddress = shareholderNameAddress;
  }

  public Tax2439AllOf shareholderTin(String shareholderTin) {
    this.shareholderTin = shareholderTin;
    return this;
  }

  /**
   * Shareholder's identifying number
   * @return shareholderTin
  */
  @ApiModelProperty(value = "Shareholder's identifying number")


  public String getShareholderTin() {
    return shareholderTin;
  }

  public void setShareholderTin(String shareholderTin) {
    this.shareholderTin = shareholderTin;
  }

  public Tax2439AllOf undistributedLongTermCapitalGains(Double undistributedLongTermCapitalGains) {
    this.undistributedLongTermCapitalGains = undistributedLongTermCapitalGains;
    return this;
  }

  /**
   * Box 1a, Total undistributed long-term capital gains
   * @return undistributedLongTermCapitalGains
  */
  @ApiModelProperty(value = "Box 1a, Total undistributed long-term capital gains")


  public Double getUndistributedLongTermCapitalGains() {
    return undistributedLongTermCapitalGains;
  }

  public void setUndistributedLongTermCapitalGains(Double undistributedLongTermCapitalGains) {
    this.undistributedLongTermCapitalGains = undistributedLongTermCapitalGains;
  }

  public Tax2439AllOf unrecaptured1250Gain(Double unrecaptured1250Gain) {
    this.unrecaptured1250Gain = unrecaptured1250Gain;
    return this;
  }

  /**
   * Box 1b, Unrecaptured section 1250 gain
   * @return unrecaptured1250Gain
  */
  @ApiModelProperty(value = "Box 1b, Unrecaptured section 1250 gain")


  public Double getUnrecaptured1250Gain() {
    return unrecaptured1250Gain;
  }

  public void setUnrecaptured1250Gain(Double unrecaptured1250Gain) {
    this.unrecaptured1250Gain = unrecaptured1250Gain;
  }

  public Tax2439AllOf section1202Gain(Double section1202Gain) {
    this.section1202Gain = section1202Gain;
    return this;
  }

  /**
   * Box 1c, Section 1202 gain
   * @return section1202Gain
  */
  @ApiModelProperty(value = "Box 1c, Section 1202 gain")


  public Double getSection1202Gain() {
    return section1202Gain;
  }

  public void setSection1202Gain(Double section1202Gain) {
    this.section1202Gain = section1202Gain;
  }

  public Tax2439AllOf collectiblesGain(Double collectiblesGain) {
    this.collectiblesGain = collectiblesGain;
    return this;
  }

  /**
   * Box 1d, Collectibles (28%) gain
   * @return collectiblesGain
  */
  @ApiModelProperty(value = "Box 1d, Collectibles (28%) gain")


  public Double getCollectiblesGain() {
    return collectiblesGain;
  }

  public void setCollectiblesGain(Double collectiblesGain) {
    this.collectiblesGain = collectiblesGain;
  }

  public Tax2439AllOf taxPaid(Double taxPaid) {
    this.taxPaid = taxPaid;
    return this;
  }

  /**
   * Box 2, Tax paid by the RIC or REIT on the box 1a gains
   * @return taxPaid
  */
  @ApiModelProperty(value = "Box 2, Tax paid by the RIC or REIT on the box 1a gains")


  public Double getTaxPaid() {
    return taxPaid;
  }

  public void setTaxPaid(Double taxPaid) {
    this.taxPaid = taxPaid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tax2439AllOf tax2439AllOf = (Tax2439AllOf) o;
    return Objects.equals(this.fiscalYearBegin, tax2439AllOf.fiscalYearBegin) &&
        Objects.equals(this.fiscalYearEnd, tax2439AllOf.fiscalYearEnd) &&
        Objects.equals(this.ricOrReitNameAddress, tax2439AllOf.ricOrReitNameAddress) &&
        Objects.equals(this.ricOrReitTin, tax2439AllOf.ricOrReitTin) &&
        Objects.equals(this.shareholderNameAddress, tax2439AllOf.shareholderNameAddress) &&
        Objects.equals(this.shareholderTin, tax2439AllOf.shareholderTin) &&
        Objects.equals(this.undistributedLongTermCapitalGains, tax2439AllOf.undistributedLongTermCapitalGains) &&
        Objects.equals(this.unrecaptured1250Gain, tax2439AllOf.unrecaptured1250Gain) &&
        Objects.equals(this.section1202Gain, tax2439AllOf.section1202Gain) &&
        Objects.equals(this.collectiblesGain, tax2439AllOf.collectiblesGain) &&
        Objects.equals(this.taxPaid, tax2439AllOf.taxPaid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fiscalYearBegin, fiscalYearEnd, ricOrReitNameAddress, ricOrReitTin, shareholderNameAddress, shareholderTin, undistributedLongTermCapitalGains, unrecaptured1250Gain, section1202Gain, collectiblesGain, taxPaid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tax2439AllOf {\n");
    
    sb.append("    fiscalYearBegin: ").append(toIndentedString(fiscalYearBegin)).append("\n");
    sb.append("    fiscalYearEnd: ").append(toIndentedString(fiscalYearEnd)).append("\n");
    sb.append("    ricOrReitNameAddress: ").append(toIndentedString(ricOrReitNameAddress)).append("\n");
    sb.append("    ricOrReitTin: ").append(toIndentedString(ricOrReitTin)).append("\n");
    sb.append("    shareholderNameAddress: ").append(toIndentedString(shareholderNameAddress)).append("\n");
    sb.append("    shareholderTin: ").append(toIndentedString(shareholderTin)).append("\n");
    sb.append("    undistributedLongTermCapitalGains: ").append(toIndentedString(undistributedLongTermCapitalGains)).append("\n");
    sb.append("    unrecaptured1250Gain: ").append(toIndentedString(unrecaptured1250Gain)).append("\n");
    sb.append("    section1202Gain: ").append(toIndentedString(section1202Gain)).append("\n");
    sb.append("    collectiblesGain: ").append(toIndentedString(collectiblesGain)).append("\n");
    sb.append("    taxPaid: ").append(toIndentedString(taxPaid)).append("\n");
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

