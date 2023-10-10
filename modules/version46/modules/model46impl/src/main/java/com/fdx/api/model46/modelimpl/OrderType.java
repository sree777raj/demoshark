package com.fdx.api.model46.modelimpl;

import com.fdx.common.exception.FDXException;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The type of the order
 */
public enum OrderType {
  
  BUY("BUY"),
  
  SELL("SELL"),
  
  BUYTOCOVER("BUYTOCOVER"),
  
  BUYTOOPEN("BUYTOOPEN"),
  
  SELLTOCOVER("SELLTOCOVER"),
  
  SELLTOOPEN("SELLTOOPEN"),
  
  SELLSHORT("SELLSHORT"),
  
  SELLCLOSE("SELLCLOSE");

  private String value;

  OrderType(String value) {
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
  public static OrderType fromValue(String value) {
    for (OrderType b : OrderType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'",401));
  }
}

