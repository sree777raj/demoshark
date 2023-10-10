package com.fdx.api.model46.modelimpl;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * TaxFormAttributeAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class TaxFormAttributeAllOf   {
  @JsonProperty("boxNumber")
  private String boxNumber;

  @JsonProperty("code")
  private String code;

  public TaxFormAttributeAllOf boxNumber(String boxNumber) {
    this.boxNumber = boxNumber;
    return this;
  }

  /**
   * Box number on a tax form, if any
   * @return boxNumber
  */
  @ApiModelProperty(value = "Box number on a tax form, if any")


  public String getBoxNumber() {
    return boxNumber;
  }

  public void setBoxNumber(String boxNumber) {
    this.boxNumber = boxNumber;
  }

  public TaxFormAttributeAllOf code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Tax form code for the given box number, if any
   * @return code
  */
  @ApiModelProperty(value = "Tax form code for the given box number, if any")


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxFormAttributeAllOf taxFormAttributeAllOf = (TaxFormAttributeAllOf) o;
    return Objects.equals(this.boxNumber, taxFormAttributeAllOf.boxNumber) &&
        Objects.equals(this.code, taxFormAttributeAllOf.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boxNumber, code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxFormAttributeAllOf {\n");
    
    sb.append("    boxNumber: ").append(toIndentedString(boxNumber)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

