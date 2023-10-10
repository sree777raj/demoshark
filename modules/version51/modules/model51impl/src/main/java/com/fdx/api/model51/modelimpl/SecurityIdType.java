package com.fdx.api.model51.modelimpl;

import com.fdx.common.exception.FDXException;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The type of identifier for a security
 */
public enum SecurityIdType {
  
  CUSIP("CUSIP"),
  
  ISIN("ISIN"),
  
  SEDOL("SEDOL"),
  
  SICC("SICC"),
  
  VALOR("VALOR"),
  
  WKN("WKN");

  private String value;

  SecurityIdType(String value) {
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
  public static SecurityIdType fromValue(String value) {
    for (SecurityIdType b : SecurityIdType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'",401));
  }
}

