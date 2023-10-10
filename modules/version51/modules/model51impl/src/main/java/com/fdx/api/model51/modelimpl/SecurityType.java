package com.fdx.api.model51.modelimpl;

import com.fdx.common.exception.FDXException;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The type of a security
 */
public enum SecurityType {
  
  BOND("BOND"),
  
  DEBT("DEBT"),
  
  MUTUALFUND("MUTUALFUND"),
  
  OPTION("OPTION"),
  
  OTHER("OTHER"),
  
  STOCK("STOCK"),
  
  SWEEP("SWEEP");

  private String value;

  SecurityType(String value) {
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
  public static SecurityType fromValue(String value) {
    for (SecurityType b : SecurityType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'",401));
  }
}

