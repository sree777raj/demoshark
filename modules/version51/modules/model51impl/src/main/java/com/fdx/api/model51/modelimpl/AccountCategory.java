package com.fdx.api.model51.modelimpl;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fdx.common.exception.FDXException;

/**
 * The category of account
 */

public enum AccountCategory {
  
  ANNUITY_ACCOUNT("ANNUITY_ACCOUNT"),
  
  DEPOSIT_ACCOUNT("DEPOSIT_ACCOUNT"),
  
  LOAN_ACCOUNT("LOAN_ACCOUNT"),
  
  LOC_ACCOUNT("LOC_ACCOUNT"),
  
  INSURANCE_ACCOUNT("INSURANCE_ACCOUNT"),
  
  INVESTMENT_ACCOUNT("INVESTMENT_ACCOUNT");

  private String value;

  AccountCategory(String value) {
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
  public static AccountCategory fromValue(String value) {
    for (AccountCategory b : AccountCategory.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'",401));
  }
}

