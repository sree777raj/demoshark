package com.fdx.api.entities.common;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fdx.common.exception.FDXException;

/**
 * Identifies the type of a Registry
 */

public enum Registry {
  
  PRIVATE("PRIVATE"),
  
  FDX("FDX"),
  
  GLEIF("GLEIF"),
  
  ICANN("ICANN");

  private String value;

  Registry(String value) {
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
  public static Registry fromValue(String value) {
    for (Registry b : Registry.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'",401));
  }
}

