package com.fdx.api.entities.consent;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fdx.common.exception.FDXException;

import javax.annotation.Generated;

/**
 * Resource for which data may be permissioned; can be extended to support additional types of resources
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-18T17:46:09.510212100+05:30[Asia/Calcutta]")
public enum ConsentResourceType {
  
  ACCOUNT("ACCOUNT"),
  
  CUSTOMER("CUSTOMER"),
  
  DOCUMENT("DOCUMENT");

  private String value;

  ConsentResourceType(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ConsentResourceType fromValue(String value) {
    for (ConsentResourceType b : ConsentResourceType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'",401));
  }

}