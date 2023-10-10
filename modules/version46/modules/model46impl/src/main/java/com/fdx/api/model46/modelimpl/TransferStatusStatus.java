package com.fdx.api.model46.modelimpl;

import com.fdx.common.exception.FDXException;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The status of a transfer of money
 */
public enum TransferStatusStatus {
  
  FAILURE("FAILURE"),
  
  NOFUNDS("NOFUNDS"),
  
  PENDING("PENDING"),
  
  SUCCESS("SUCCESS");

  private String value;

  TransferStatusStatus(String value) {
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
  public static TransferStatusStatus fromValue(String value) {
    for (TransferStatusStatus b : TransferStatusStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'",401));
  }
}

