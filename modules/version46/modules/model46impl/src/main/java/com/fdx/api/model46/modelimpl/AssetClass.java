package com.fdx.api.model46.modelimpl;

import com.fdx.common.exception.FDXException;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The class of an investment asset
 */
public enum AssetClass {
  
  DOMESTICBOND("DOMESTICBOND"),
  
  INTLBOND("INTLBOND"),
  
  INTLSTOCK("INTLSTOCK"),
  
  LARGESTOCK("LARGESTOCK"),
  
  MONEYMARKET("MONEYMARKET"),
  
  OTHER("OTHER"),
  
  SMALLSTOCK("SMALLSTOCK");

  private String value;

  AssetClass(String value) {
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
  public static AssetClass fromValue(String value) {
    for (AssetClass b : AssetClass.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'",401));
  }
}

