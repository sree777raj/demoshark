package com.fdx.api.model51.modelimpl;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fdx.common.exception.FDXException;

/**
 * The Mode of Payout
 */
public enum PayoutMode {
  ANNUALLY("ANNUALLY"),

  BIWEEKLY("BIWEEKLY"),

  DAILY("DAILY"),

  MONTHLY("MONTHLY"),

  SEMIANNUALLY("SEMIANNUALLY"),

  SEMIMONTHLY("SEMIMONTHLY"),

  WEEKLY("WEEKLY");

  private String value;

  PayoutMode(String value) {
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
  public static PayoutMode fromValue(String value) {
    for (PayoutMode b : PayoutMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'",401));
  }
}
