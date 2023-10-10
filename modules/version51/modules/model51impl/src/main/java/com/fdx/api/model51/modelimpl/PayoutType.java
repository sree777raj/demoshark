package com.fdx.api.model51.modelimpl;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fdx.common.exception.FDXException;

/**
 * The Type of Payout
 */
public enum PayoutType {
  DEFERRED("DEFERRED"),

  IMMEDIATE("IMMEDIATE");

  private String value;

  PayoutType(String value) {
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
  public static PayoutType fromValue(String value) {
    for (PayoutType b : PayoutType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'",401));
  }
}
