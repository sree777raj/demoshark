package com.fdx.api.model51.modelimpl;

import com.fdx.common.exception.FDXException;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines how often a payment is made relative to the starting day<br/> * `BIWEEKLY`: Every 14 days<br/> * `TWICEMONTHLY`: Every 15 days<br/> * `WEEKLY`: Every 7 days
 */
public enum RecurringPaymentFrequency {
  
  WEEKLY("WEEKLY"),
  
  BIWEEKLY("BIWEEKLY"),
  
  TWICEMONTHLY("TWICEMONTHLY"),
  
  MONTHLY("MONTHLY"),
  
  FOURWEEKS("FOURWEEKS"),
  
  BIMONTHLY("BIMONTHLY"),
  
  QUARTERLY("QUARTERLY"),
  
  SEMIANNUALLY("SEMIANNUALLY"),
  
  ANNUALLY("ANNUALLY");

  private String value;

  RecurringPaymentFrequency(String value) {
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
  public static RecurringPaymentFrequency fromValue(String value) {
    for (RecurringPaymentFrequency b : RecurringPaymentFrequency.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'",401));
  }
}

