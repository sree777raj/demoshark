package com.fdx.api.model46.modelimpl;

import com.fdx.common.exception.FDXException;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The guaranteed payment period on an annuity. \"NONE\" value is replacing \"NO PERIOD CERTAIN\" value which is now deprecated and will be removed in v5.0
 */
public enum PeriodCertainGuarantee {
  
  NO_PERIOD_CERTAIN("NO PERIOD CERTAIN"),
  
  NONE("NONE"),
  
  _5_YEAR("5-YEAR"),
  
  _10_YEAR("10-YEAR"),
  
  _20_YEAR("20-YEAR"),
  
  _30_YEAR("30-YEAR");

  private String value;

  PeriodCertainGuarantee(String value) {
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
  public static PeriodCertainGuarantee fromValue(String value) {
    for (PeriodCertainGuarantee b : PeriodCertainGuarantee.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'",401));
  }
}

