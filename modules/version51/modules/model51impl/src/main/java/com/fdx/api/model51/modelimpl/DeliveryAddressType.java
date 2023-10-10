package com.fdx.api.model51.modelimpl;

import com.fdx.common.exception.FDXException;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The location type of an address
 */
public enum DeliveryAddressType {
  
  BUSINESS("BUSINESS"),
  
  HOME("HOME"),
  
  MAILING("MAILING");

  private String value;

  DeliveryAddressType(String value) {
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
  public static DeliveryAddressType fromValue(String value) {
    for (DeliveryAddressType b : DeliveryAddressType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'",401));
  }
}

