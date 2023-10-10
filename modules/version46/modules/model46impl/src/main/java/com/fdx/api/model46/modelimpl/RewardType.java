package com.fdx.api.model46.modelimpl;

import com.fdx.common.exception.FDXException;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The type of the reward balance.  Example: a reward program awarding \"Stars\" for purchases would use the `POINTS` reward type.<br/> * `CASHBACK` - Rewards balances enumerated using a monetary amount<br/> * `MILES` - Rewards balances enumerated using distance<br/> * `POINTS` - Default when a reward balance is not of type CASHBACK or MILES 
 */
public enum RewardType {
  
  CASHBACK("CASHBACK"),
  
  MILES("MILES"),
  
  POINTS("POINTS");

  private String value;

  RewardType(String value) {
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
  public static RewardType fromValue(String value) {
    for (RewardType b : RewardType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'",401));
  }
}

