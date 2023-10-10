package com.fdx.api.model51.modelimpl;

import com.fdx.common.exception.FDXException;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines the payee lifecycle<br/> * `CANCELLED`: Payment or Recurring Payment was cancelled by the user<br/> * `FAILED`: Payment or Recurring Payment failed for reasons other then “No Funds”. For example: fraud, invalid payee, source account was closed etc.<br/> * `NOFUNDS`: Payment failed because of the lack of funds<br/> * `PROCESSED`: For a payment, the payment has been executed by the payment service provider. For a recurring payment, the scheduled duration of the recurrence has completed.<br/> * `PROCESSING`: Payment is in the process of being executed by the payment service provider<br/> * `SCHEDULED`: Payment or Recurring Payment has been scheduled
 */
public enum PaymentStatus {
  
  CANCELLED("CANCELLED"),
  
  FAILED("FAILED"),
  
  NOFUNDS("NOFUNDS"),
  
  PROCESSED("PROCESSED"),
  
  PROCESSING("PROCESSING"),
  
  SCHEDULED("SCHEDULED");

  private String value;

  PaymentStatus(String value) {
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
  public static PaymentStatus fromValue(String value) {
    for (PaymentStatus b : PaymentStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'",401));
  }
}

