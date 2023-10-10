package com.fdx.api.model51.modelimpl;

import com.fdx.common.exception.FDXException;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The classification of a debt instrument
 */
public enum DebtClass {
  
  CORPORATE("CORPORATE"),
  
  MUNICIPAL("MUNICIPAL"),
  
  OTHER("OTHER"),
  
  TREASURY("TREASURY");

  private String value;

  DebtClass(String value) {
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
  public static DebtClass fromValue(String value) {
    for (DebtClass b : DebtClass.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'",401));
  }
}

