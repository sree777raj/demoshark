package com.fdx.api.model51.modelimpl;

import com.fdx.common.exception.FDXException;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The type of a loan transaction
 */
public enum LoanTransactionType {
  
  ADJUSTMENT("ADJUSTMENT"),
  
  FEE("FEE"),
  
  INTEREST("INTEREST"),
  
  PAYMENT("PAYMENT");

  private String value;

  LoanTransactionType(String value) {
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
  public static LoanTransactionType fromValue(String value) {
    for (LoanTransactionType b : LoanTransactionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'",401));
  }
}

