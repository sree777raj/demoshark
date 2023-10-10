package com.fdx.api.entities.common;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fdx.common.exception.FDXException;

import javax.annotation.Generated;

/**
 * Duration of the Consent Grant, per FDX UX Guidelines v1.0 (pp 18 - 20)
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-30T11:51:41.837189100+05:30[Asia/Calcutta]")
public enum ConsentDurationType {
  
  ONE_TIME("ONE_TIME"),
  
  PERSISTENT("PERSISTENT"),
  
  TIME_BOUND("TIME_BOUND");

  private String value;

  ConsentDurationType(String value) {
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
  public static ConsentDurationType fromValue(String value) {
    for (ConsentDurationType b : ConsentDurationType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'",401));
  }
}

