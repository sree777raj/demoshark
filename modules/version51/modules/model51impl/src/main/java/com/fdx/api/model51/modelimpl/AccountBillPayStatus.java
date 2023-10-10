package com.fdx.api.model51.modelimpl;

import com.fdx.common.exception.FDXException;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Indicates bill pay capabilities for an account.<br/> * `ACTIVE`: Can be used for bill payment<br/> * `AVAILABLE`: Account can be requested for bill payment<br/> * `NOT_AVAILABLE`: Account cannot participate in bill payment<br/> * `PENDING`: Account requested for bill payment, but not available yet
 */
public enum AccountBillPayStatus {
  
  ACTIVE("ACTIVE"),
  
  AVAILABLE("AVAILABLE"),
  
  NOT_AVAILABLE("NOT_AVAILABLE"),
  
  PENDING("PENDING");

  private String value;

  AccountBillPayStatus(String value) {
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
  public static AccountBillPayStatus fromValue(String value) {
    for (AccountBillPayStatus b : AccountBillPayStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'",401));
  }
}

