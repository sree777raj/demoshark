package com.fdx.api.model51.modelimpl;

import com.fdx.common.exception.FDXException;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The posting type of a transaction
 */
public enum DebitCreditMemo {
  
  CREDIT("CREDIT"),
  
  DEBIT("DEBIT"),
  
  MEMO("MEMO");

  private String value;

  DebitCreditMemo(String value) {
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
  public static DebitCreditMemo fromValue(String value) {
    for (DebitCreditMemo b : DebitCreditMemo.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'",401));
  }
}

