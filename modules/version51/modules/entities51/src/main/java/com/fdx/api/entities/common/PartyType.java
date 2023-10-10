package com.fdx.api.entities.common;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fdx.common.exception.FDXException;

import javax.annotation.Generated;

/**
 * Identifies the type of a party
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-18T17:46:09.510212100+05:30[Asia/Calcutta]")
public enum PartyType {
  
  DATA_ACCESS_PLATFORM("DATA_ACCESS_PLATFORM"),
  
  DATA_PROVIDER("DATA_PROVIDER"),
  
  DATA_RECIPIENT("DATA_RECIPIENT"),
  
  INDIVIDUAL("INDIVIDUAL"),
  
  MERCHANT("MERCHANT"),
  
  VENDOR("VENDOR");

  private String value;

  PartyType(String value) {
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
  public static PartyType fromValue(String value) {
    for (PartyType b : PartyType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'",401));
  }

}