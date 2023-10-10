package com.fdx.api.model46.modelimpl;

import com.fdx.common.exception.FDXException;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The frequency of payments
 */
public enum PaymentFrequency {
  
  ANNUALLY("ANNUALLY"),
  
  BIWEEKLY("BIWEEKLY"),
  
  DAILY("DAILY"),
  
  MONTHLY("MONTHLY"),
  
  SEMIANNUALLY("SEMIANNUALLY"),
  
  SEMIMONTHLY("SEMIMONTHLY"),
  
  WEEKLY("WEEKLY");

  private String value;

  PaymentFrequency(String value) {
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
  public static PaymentFrequency fromValue(String value) {
    for (PaymentFrequency b : PaymentFrequency.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'",401));
  }
}

