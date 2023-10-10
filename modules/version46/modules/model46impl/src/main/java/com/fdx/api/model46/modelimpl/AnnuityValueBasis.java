package com.fdx.api.model46.modelimpl;

import com.fdx.common.exception.FDXException;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The type of basis for an annuity account
 */
public enum AnnuityValueBasis {
  
  FIXED("FIXED"),
  
  VARIABLE("VARIABLE");

  private String value;

  AnnuityValueBasis(String value) {
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
  public static AnnuityValueBasis fromValue(String value) {
    for (AnnuityValueBasis b : AnnuityValueBasis.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'",401));
  }
}

