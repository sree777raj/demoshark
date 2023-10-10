package com.fdx.api.model51.modelimpl;

import com.fdx.common.exception.FDXException;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Interest compounding Period
 */
public enum CompoundingPeriod {
  
  ANNUALLY("ANNUALLY"),
  
  BIWEEKLY("BIWEEKLY"),
  
  DAILY("DAILY"),
  
  MONTHLY("MONTHLY"),
  
  SEMIANNUALLY("SEMIANNUALLY"),
  
  SEMIMONTHLY("SEMIMONTHLY"),
  
  WEEKLY("WEEKLY");

  private String value;

  CompoundingPeriod(String value) {
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
  public static CompoundingPeriod fromValue(String value) {
    for (CompoundingPeriod b : CompoundingPeriod.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'",401));
  }
}

