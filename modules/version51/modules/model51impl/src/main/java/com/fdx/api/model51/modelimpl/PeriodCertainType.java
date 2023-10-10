package com.fdx.api.model51.modelimpl;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fdx.common.exception.FDXException;

/**
 * The type of certain period
 */

public enum PeriodCertainType {

  NONE("NONE"),

  _5_YEAR("5_YEAR"),

  _10_YEAR("10_YEAR"),

  _20_YEAR("20_YEAR"),

  _30_YEAR("30_YEAR");

  private String value;

  PeriodCertainType(String value) {
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
  public static PeriodCertainType fromValue(String value) {
    for (PeriodCertainType b : PeriodCertainType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'", 401));
  }
}
