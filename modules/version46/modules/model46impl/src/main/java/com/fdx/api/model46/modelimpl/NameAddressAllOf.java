package com.fdx.api.model46.modelimpl;

import java.util.Objects;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * NameAddressAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class NameAddressAllOf   {
  @JsonProperty("name1")
  private String name1;

  @JsonProperty("name2")
  private String name2;

  public NameAddressAllOf name1(String name1) {
    this.name1 = name1;
    return this;
  }

  /**
   * String of maximum length 64
   * @return name1
  */
  @ApiModelProperty(value = "String of maximum length 64")

@Size(max=64) 
  public String getName1() {
    return name1;
  }

  public void setName1(String name1) {
    this.name1 = name1;
  }

  public NameAddressAllOf name2(String name2) {
    this.name2 = name2;
    return this;
  }

  /**
   * String of maximum length 64
   * @return name2
  */
  @ApiModelProperty(value = "String of maximum length 64")

@Size(max=64) 
  public String getName2() {
    return name2;
  }

  public void setName2(String name2) {
    this.name2 = name2;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NameAddressAllOf nameAddressAllOf = (NameAddressAllOf) o;
    return Objects.equals(this.name1, nameAddressAllOf.name1) &&
        Objects.equals(this.name2, nameAddressAllOf.name2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name1, name2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NameAddressAllOf {\n");
    
    sb.append("    name1: ").append(toIndentedString(name1)).append("\n");
    sb.append("    name2: ").append(toIndentedString(name2)).append("\n");
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

