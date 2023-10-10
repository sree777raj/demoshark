package com.fdx.api.model51.modelimpl;

import com.fdx.common.exception.FDXException;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The type of income of an investment transaction
 */
public enum IncomeType {
  
  CGLONG("CGLONG"),
  
  CGSHORT("CGSHORT"),
  
  MISC("MISC");

  private String value;

  IncomeType(String value) {
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
  public static IncomeType fromValue(String value) {
    for (IncomeType b : IncomeType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'",401));
  }
}

