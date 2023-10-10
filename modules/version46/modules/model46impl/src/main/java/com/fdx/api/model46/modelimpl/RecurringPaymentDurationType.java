package com.fdx.api.model46.modelimpl;

import com.fdx.common.exception.FDXException;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Describes if the recurring payment has an end or will occur a fixed number of times
 */
public enum RecurringPaymentDurationType {
  
  NOEND("NOEND"),
  
  NUMBEROFTIMES("NUMBEROFTIMES");

  private String value;

  RecurringPaymentDurationType(String value) {
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
  public static RecurringPaymentDurationType fromValue(String value) {
    for (RecurringPaymentDurationType b : RecurringPaymentDurationType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'",401));
  }
}

