package com.fdx.api.model46.modelimpl;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Form1042AgentAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Form1042AgentAllOf   {
  @JsonProperty("agentTin")
  private String agentTin;

  @JsonProperty("ch3StatusCode")
  private String ch3StatusCode;

  @JsonProperty("ch4StatusCode")
  private String ch4StatusCode;

  @JsonProperty("giin")
  private String giin;

  @JsonProperty("countryCode")
  private String countryCode;

  @JsonProperty("foreignTin")
  private String foreignTin;

  public Form1042AgentAllOf agentTin(String agentTin) {
    this.agentTin = agentTin;
    return this;
  }

  /**
   * Agent's EIN
   * @return agentTin
  */
  @ApiModelProperty(value = "Agent's EIN")


  public String getAgentTin() {
    return agentTin;
  }

  public void setAgentTin(String agentTin) {
    this.agentTin = agentTin;
  }

  public Form1042AgentAllOf ch3StatusCode(String ch3StatusCode) {
    this.ch3StatusCode = ch3StatusCode;
    return this;
  }

  /**
   * Ch. 3 status code
   * @return ch3StatusCode
  */
  @ApiModelProperty(value = "Ch. 3 status code")


  public String getCh3StatusCode() {
    return ch3StatusCode;
  }

  public void setCh3StatusCode(String ch3StatusCode) {
    this.ch3StatusCode = ch3StatusCode;
  }

  public Form1042AgentAllOf ch4StatusCode(String ch4StatusCode) {
    this.ch4StatusCode = ch4StatusCode;
    return this;
  }

  /**
   * Ch. 4 status code
   * @return ch4StatusCode
  */
  @ApiModelProperty(value = "Ch. 4 status code")


  public String getCh4StatusCode() {
    return ch4StatusCode;
  }

  public void setCh4StatusCode(String ch4StatusCode) {
    this.ch4StatusCode = ch4StatusCode;
  }

  public Form1042AgentAllOf giin(String giin) {
    this.giin = giin;
    return this;
  }

  /**
   * Agent's Global Intermediary Identification Number (GIIN)
   * @return giin
  */
  @ApiModelProperty(value = "Agent's Global Intermediary Identification Number (GIIN)")


  public String getGiin() {
    return giin;
  }

  public void setGiin(String giin) {
    this.giin = giin;
  }

  public Form1042AgentAllOf countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * Country code
   * @return countryCode
  */
  @ApiModelProperty(value = "Country code")


  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public Form1042AgentAllOf foreignTin(String foreignTin) {
    this.foreignTin = foreignTin;
    return this;
  }

  /**
   * Foreign tax identification number, if any
   * @return foreignTin
  */
  @ApiModelProperty(value = "Foreign tax identification number, if any")


  public String getForeignTin() {
    return foreignTin;
  }

  public void setForeignTin(String foreignTin) {
    this.foreignTin = foreignTin;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Form1042AgentAllOf form1042AgentAllOf = (Form1042AgentAllOf) o;
    return Objects.equals(this.agentTin, form1042AgentAllOf.agentTin) &&
        Objects.equals(this.ch3StatusCode, form1042AgentAllOf.ch3StatusCode) &&
        Objects.equals(this.ch4StatusCode, form1042AgentAllOf.ch4StatusCode) &&
        Objects.equals(this.giin, form1042AgentAllOf.giin) &&
        Objects.equals(this.countryCode, form1042AgentAllOf.countryCode) &&
        Objects.equals(this.foreignTin, form1042AgentAllOf.foreignTin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentTin, ch3StatusCode, ch4StatusCode, giin, countryCode, foreignTin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Form1042AgentAllOf {\n");
    
    sb.append("    agentTin: ").append(toIndentedString(agentTin)).append("\n");
    sb.append("    ch3StatusCode: ").append(toIndentedString(ch3StatusCode)).append("\n");
    sb.append("    ch4StatusCode: ").append(toIndentedString(ch4StatusCode)).append("\n");
    sb.append("    giin: ").append(toIndentedString(giin)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    foreignTin: ").append(toIndentedString(foreignTin)).append("\n");
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

