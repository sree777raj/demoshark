package com.fdx.api.model51.modelimpl;

import com.fdx.common.exception.FDXException;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The frequency of payments on a loan
 */
public enum LoanPaymentFrequency {
  
  ANNUALLY("ANNUALLY"),
  
  BIMONTHLY("BIMONTHLY"),
  
  BIWEEKLY("BIWEEKLY"),
  
  FOURWEEKS("FOURWEEKS"),
  
  MONTHLY("MONTHLY"),
  
  OTHER("OTHER"),
  
  QUARTERLY("QUARTERLY"),
  
  SEMIANNUALLY("SEMIANNUALLY"),
  
  TWICEMONTHLY("TWICEMONTHLY"),
  
  WEEKLY("WEEKLY");

  private String value;

  LoanPaymentFrequency(String value) {
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
  public static LoanPaymentFrequency fromValue(String value) {
    for (LoanPaymentFrequency b : LoanPaymentFrequency.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'",401));
  }
}

