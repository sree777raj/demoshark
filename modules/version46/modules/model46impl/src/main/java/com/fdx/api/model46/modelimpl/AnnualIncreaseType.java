package com.fdx.api.model46.modelimpl;

import com.fdx.common.exception.FDXException;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The type of annual increase of an annuity account
 */
public enum AnnualIncreaseType {
  
  FIXED("FIXED"),
  
  PERCENT("PERCENT"),
  
  DOLLAR("DOLLAR");

  private String value;

  AnnualIncreaseType(String value) {
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
  public static AnnualIncreaseType fromValue(String value) {
    for (AnnualIncreaseType b : AnnualIncreaseType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'",401));
  }
}

