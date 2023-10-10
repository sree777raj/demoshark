package com.fdx.api.model46.modelimpl;

import com.fdx.common.exception.FDXException;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The frequency of a bond's coupon maturity
 */
public enum CouponMatureFrequency {
  
  ANNUAL("ANNUAL"),
  
  MONTHLY("MONTHLY"),
  
  OTHER("OTHER"),
  
  QUARTERLY("QUARTERLY"),
  
  SEMIANNUAL("SEMIANNUAL");

  private String value;

  CouponMatureFrequency(String value) {
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
  public static CouponMatureFrequency fromValue(String value) {
    for (CouponMatureFrequency b : CouponMatureFrequency.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'",401));
  }
}

