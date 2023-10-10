package com.fdx.api.model51.modelimpl;

import com.fdx.common.exception.FDXException;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The type of an investment balance
 */
public enum InvestmentBalanceType {
  
  AMOUNT("AMOUNT"),
  
  PERCENTAGE("PERCENTAGE");

  private String value;

  InvestmentBalanceType(String value) {
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
  public static InvestmentBalanceType fromValue(String value) {
    for (InvestmentBalanceType b : InvestmentBalanceType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'",401));
  }
}

