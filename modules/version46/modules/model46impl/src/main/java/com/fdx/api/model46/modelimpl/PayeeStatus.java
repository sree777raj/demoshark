package com.fdx.api.model46.modelimpl;

import com.fdx.common.exception.FDXException;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines the payee lifecycle<br/> * `ACTIVE`: Payee is ready to receive payments<br/> * `DELETED`: Payee has been deleted and will not move into any other state<br/> * `PENDING`: Payee is not ready to receive payments<br/> * `REJECTED`: Payee was found to be invalid and cannot to receive payments
 */
public enum PayeeStatus {
  
  ACTIVE("ACTIVE"),
  
  DELETED("DELETED"),
  
  PENDING("PENDING"),
  
  REJECTED("REJECTED");

  private String value;

  PayeeStatus(String value) {
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
  public static PayeeStatus fromValue(String value) {
    for (PayeeStatus b : PayeeStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'",401));
  }
}

