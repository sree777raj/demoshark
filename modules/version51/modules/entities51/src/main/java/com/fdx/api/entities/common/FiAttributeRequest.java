package com.fdx.api.entities.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Financial Institution provider-specific attribute
 */

@Schema(name = "FiAttributeRequest", description = "Financial Institution provider-specific attribute")
public class FiAttributeRequest {

  @JsonProperty("name")
  private String name;

  @JsonProperty("value")
  private String value;

  public FiAttributeRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of attribute
   * @return name
  */
  
  @Schema(name = "name", description = "Name of attribute", required = false)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FiAttributeRequest value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Value of attribute
   * @return value
  */
  
  @Schema(name = "value", description = "Value of attribute", required = false)
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FiAttributeRequest fiAttributeRequest = (FiAttributeRequest) o;
    return Objects.equals(this.name, fiAttributeRequest.name) &&
        Objects.equals(this.value, fiAttributeRequest.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FiAttributeRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

