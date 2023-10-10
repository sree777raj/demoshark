package com.fdx.api.model46.modelimpl;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * NameAddressPhoneAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class NameAddressPhoneAllOf   {
  @JsonProperty("phone")
  private TelephoneNumberPlusExtension phone;

  public NameAddressPhoneAllOf phone(TelephoneNumberPlusExtension phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
  */
  @ApiModelProperty(value = "")

  @Valid

  public TelephoneNumberPlusExtension getPhone() {
    return phone;
  }

  public void setPhone(TelephoneNumberPlusExtension phone) {
    this.phone = phone;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NameAddressPhoneAllOf nameAddressPhoneAllOf = (NameAddressPhoneAllOf) o;
    return Objects.equals(this.phone, nameAddressPhoneAllOf.phone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NameAddressPhoneAllOf {\n");
    
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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

