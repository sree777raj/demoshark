package com.fdx.api.model51.modelimpl;

import com.fdx.common.exception.FDXException;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The type of a mutual fund
 */
public enum MutualFundType {
  
  OPENEND("OPENEND"),
  
  CLOSEEND("CLOSEEND"),
  
  OTHER("OTHER");

  private String value;

  MutualFundType(String value) {
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
  public static MutualFundType fromValue(String value) {
    for (MutualFundType b : MutualFundType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'",401));
  }
}

