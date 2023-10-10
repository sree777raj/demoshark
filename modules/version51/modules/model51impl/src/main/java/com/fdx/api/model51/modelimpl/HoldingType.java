package com.fdx.api.model51.modelimpl;

import com.fdx.common.exception.FDXException;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The type of an investment holding
 */
public enum HoldingType {
  
  ANNUITY("ANNUITY"),
  
  BOND("BOND"),
  
  CD("CD"),
  
  MUTUALFUND("MUTUALFUND"),
  
  OPTION("OPTION"),
  
  OTHER("OTHER"),
  
  STOCK("STOCK");

  private String value;

  HoldingType(String value) {
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
  public static HoldingType fromValue(String value) {
    for (HoldingType b : HoldingType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'",401));
  }
}

