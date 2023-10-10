package com.fdx.api.model51.modelimpl;

import com.fdx.common.exception.FDXException;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The duration of the order
 */
public enum OrderDuration {
  
  DAY("DAY"),
  
  GOODTILLCANCEL("GOODTILLCANCEL"),
  
  IMMEDIATE("IMMEDIATE");

  private String value;

  OrderDuration(String value) {
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
  public static OrderDuration fromValue(String value) {
    for (OrderDuration b : OrderDuration.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'",401));
  }
}

