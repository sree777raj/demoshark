package com.fdx.api.model51.modelimpl;

import com.fdx.common.exception.FDXException;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The status of an account
 */
public enum AccountStatus {
  
  CLOSED("CLOSED"),
  
  DELINQUENT("DELINQUENT"),
  
  NEGATIVECURRENTBALANCE("NEGATIVECURRENTBALANCE"),
  
  OPEN("OPEN"),
  
  PAID("PAID"),
  
  PENDINGCLOSE("PENDINGCLOSE"),
  
  PENDINGOPEN("PENDINGOPEN");

  private String value;

  AccountStatus(String value) {
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
  public static AccountStatus fromValue(String value) {
    for (AccountStatus b : AccountStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'",401));
  }
}

