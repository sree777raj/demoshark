package com.fdx.api.model46.modelimpl;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * TelephoneNumberPlusExtensionAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class TelephoneNumberPlusExtensionAllOf   {
  @JsonProperty("extension")
  private String extension;

  public TelephoneNumberPlusExtensionAllOf extension(String extension) {
    this.extension = extension;
    return this;
  }

  /**
   * An arbitrary length telephone number extension
   * @return extension
  */
  @ApiModelProperty(value = "An arbitrary length telephone number extension")


  public String getExtension() {
    return extension;
  }

  public void setExtension(String extension) {
    this.extension = extension;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TelephoneNumberPlusExtensionAllOf telephoneNumberPlusExtensionAllOf = (TelephoneNumberPlusExtensionAllOf) o;
    return Objects.equals(this.extension, telephoneNumberPlusExtensionAllOf.extension);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TelephoneNumberPlusExtensionAllOf {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
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

