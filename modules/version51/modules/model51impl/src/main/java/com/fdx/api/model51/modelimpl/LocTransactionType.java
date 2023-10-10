package com.fdx.api.model51.modelimpl;

import com.fdx.common.exception.FDXException;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The type of a line-of-credit transaction
 */
public enum LocTransactionType {
  
  ADJUSTMENT("ADJUSTMENT"),
  
  CHECK("CHECK"),
  
  FEE("FEE"),
  
  INTEREST("INTEREST"),
  
  PAYMENT("PAYMENT"),
  
  WITHDRAWAL("WITHDRAWAL");

  private String value;

  LocTransactionType(String value) {
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
  public static LocTransactionType fromValue(String value) {
    for (LocTransactionType b : LocTransactionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'",401));
  }
}

