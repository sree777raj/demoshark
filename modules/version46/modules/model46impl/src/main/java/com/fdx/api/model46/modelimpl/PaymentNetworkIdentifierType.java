package com.fdx.api.model46.modelimpl;

import com.fdx.common.exception.FDXException;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Suggested values for Payment Initiation Identifier Type
 */
public enum PaymentNetworkIdentifierType {
  
  ACCOUNT_NUMBER("ACCOUNT_NUMBER"),
  
  TOKENIZED_ACCOUNT_NUMBER("TOKENIZED_ACCOUNT_NUMBER");

  private String value;

  PaymentNetworkIdentifierType(String value) {
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
  public static PaymentNetworkIdentifierType fromValue(String value) {
    for (PaymentNetworkIdentifierType b : PaymentNetworkIdentifierType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'",401));
  }
}

