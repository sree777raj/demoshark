package com.fdx.api.entities.moneymovement;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fdx.common.exception.FDXException;

/**
 * Defines the payment lifecycle<br/> * `CANCELLED`: Payment was cancelled by the user<br/> * `FAILED`: Payment failed for reasons other then “No Funds”. For example: fraud, invalid payee, source account was closed etc.<br/> * `NOFUNDS`: Payment failed because of the lack of funds<br/> * `PROCESSED`: The payment has been executed by the payment service provider.<br/> * `PROCESSING`: Payment is in the process of being executed by the payment service provider<br/> * `SCHEDULED`: Payment has been scheduled
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

