package com.fdx.api.model46.modelimpl;

import com.fdx.common.exception.FDXException;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Used by MonthAmount
 */
public enum MonthAbbreviation {
  
  JAN("JAN"),
  
  FEB("FEB"),
  
  MAR("MAR"),
  
  APR("APR"),
  
  MAY("MAY"),
  
  JUN("JUN"),
  
  JUL("JUL"),
  
  AUG("AUG"),
  
  SEP("SEP"),
  
  OCT("OCT"),
  
  NOV("NOV"),
  
  DEC("DEC");

  private String value;

  MonthAbbreviation(String value) {
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
  public static MonthAbbreviation fromValue(String value) {
    for (MonthAbbreviation b : MonthAbbreviation.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'",401));
  }
}

