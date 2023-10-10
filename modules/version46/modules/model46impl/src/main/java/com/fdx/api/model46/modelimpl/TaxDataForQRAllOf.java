package com.fdx.api.model46.modelimpl;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * TaxDataForQRAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class TaxDataForQRAllOf   {
  @JsonProperty("version")
  private String version;

  @JsonProperty("softwareId")
  private String softwareId;

  public TaxDataForQRAllOf version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Financial Data Exchange (FDX) schema version number (e.g. 4.2). See https://financialdataexchange.org/
   * @return version
  */
  @ApiModelProperty(value = "Financial Data Exchange (FDX) schema version number (e.g. 4.2). See https://financialdataexchange.org/")


  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public TaxDataForQRAllOf softwareId(String softwareId) {
    this.softwareId = softwareId;
    return this;
  }

  /**
   * ID of company or software generating this tax data
   * @return softwareId
  */
  @ApiModelProperty(value = "ID of company or software generating this tax data")


  public String getSoftwareId() {
    return softwareId;
  }

  public void setSoftwareId(String softwareId) {
    this.softwareId = softwareId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxDataForQRAllOf taxDataForQRAllOf = (TaxDataForQRAllOf) o;
    return Objects.equals(this.version, taxDataForQRAllOf.version) &&
        Objects.equals(this.softwareId, taxDataForQRAllOf.softwareId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, softwareId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxDataForQRAllOf {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    softwareId: ").append(toIndentedString(softwareId)).append("\n");
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

