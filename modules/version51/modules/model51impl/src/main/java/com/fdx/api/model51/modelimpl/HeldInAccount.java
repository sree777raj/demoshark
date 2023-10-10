package com.fdx.api.model51.modelimpl;

import com.fdx.common.exception.FDXException;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The type of holdings of an investment account
 */
public enum HeldInAccount {
  
  CASH("CASH"),
  
  MARGIN("MARGIN"),
  
  OTHER("OTHER"),
  
  SHORT("SHORT");

  private String value;

  HeldInAccount(String value) {
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
  public static HeldInAccount fromValue(String value) {
    for (HeldInAccount b : HeldInAccount.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'",401));
  }
}

