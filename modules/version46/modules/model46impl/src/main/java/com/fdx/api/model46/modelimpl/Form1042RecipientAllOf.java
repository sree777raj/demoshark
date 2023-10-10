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
 * Form1042RecipientAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Form1042RecipientAllOf   {
  @JsonProperty("lobCode")
  private String lobCode;

  @JsonProperty("dateOfBirth")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
  private LocalDate dateOfBirth;

  public Form1042RecipientAllOf lobCode(String lobCode) {
    this.lobCode = lobCode;
    return this;
  }

  /**
   * LOB code number, if any
   * @return lobCode
  */
  @ApiModelProperty(value = "LOB code number, if any")


  public String getLobCode() {
    return lobCode;
  }

  public void setLobCode(String lobCode) {
    this.lobCode = lobCode;
  }

  public Form1042RecipientAllOf dateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  /**
   * ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included according to [IETF RFC3339] (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)
   * @return dateOfBirth
  */
  @ApiModelProperty(value = "ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included according to [IETF RFC3339] (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)")

  @Valid
@Size(max=10) 
  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Form1042RecipientAllOf form1042RecipientAllOf = (Form1042RecipientAllOf) o;
    return Objects.equals(this.lobCode, form1042RecipientAllOf.lobCode) &&
        Objects.equals(this.dateOfBirth, form1042RecipientAllOf.dateOfBirth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lobCode, dateOfBirth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Form1042RecipientAllOf {\n");
    
    sb.append("    lobCode: ").append(toIndentedString(lobCode)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
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

