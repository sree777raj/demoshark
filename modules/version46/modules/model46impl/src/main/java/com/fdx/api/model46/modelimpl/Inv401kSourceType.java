package com.fdx.api.model46.modelimpl;

import com.fdx.common.exception.FDXException;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The source of a 401k investment
 */
public enum Inv401kSourceType {
  
  AFTERTAX("AFTERTAX"),
  
  MATCH("MATCH"),
  
  OTHERNONVEST("OTHERNONVEST"),
  
  OTHERVEST("OTHERVEST"),
  
  PRETAX("PRETAX"),
  
  PROFITSHARING("PROFITSHARING"),
  
  ROLLOVER("ROLLOVER");

  private String value;

  Inv401kSourceType(String value) {
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
  public static Inv401kSourceType fromValue(String value) {
    for (Inv401kSourceType b : Inv401kSourceType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'",401));
  }
}

