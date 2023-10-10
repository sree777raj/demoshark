package com.fdx.api.model46.modelimpl;

import com.fdx.common.exception.FDXException;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Month enumeration used on forms 1095-A and 1095-C
 */
public enum CoverageMonth {
  
  ANNUAL("ANNUAL"),
  
  JANUARY("JANUARY"),
  
  FEBRUARY("FEBRUARY"),
  
  MARCH("MARCH"),
  
  APRIL("APRIL"),
  
  MAY("MAY"),
  
  JUNE("JUNE"),
  
  JULY("JULY"),
  
  AUGUST("AUGUST"),
  
  SEPTEMBER("SEPTEMBER"),
  
  OCTOBER("OCTOBER"),
  
  NOVEMBER("NOVEMBER"),
  
  DECEMBER("DECEMBER");

  private String value;

  CoverageMonth(String value) {
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
  public static CoverageMonth fromValue(String value) {
    for (CoverageMonth b : CoverageMonth.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'",401));
  }
}

