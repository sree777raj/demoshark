package com.fdx.api.model46.modelimpl;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * CustomerNameAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class CustomerNameAllOf   {
  @JsonProperty("prefix")
  private String prefix;

  @JsonProperty("company")
  private String company;

  public CustomerNameAllOf prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

  /**
   * Name prefix, e.g. Mr.
   * @return prefix
  */
  @ApiModelProperty(value = "Name prefix, e.g. Mr.")


  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public CustomerNameAllOf company(String company) {
    this.company = company;
    return this;
  }

  /**
   * Company name
   * @return company
  */
  @ApiModelProperty(value = "Company name")


  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerNameAllOf customerNameAllOf = (CustomerNameAllOf) o;
    return Objects.equals(this.prefix, customerNameAllOf.prefix) &&
        Objects.equals(this.company, customerNameAllOf.company);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prefix, company);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerNameAllOf {\n");
    
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
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

