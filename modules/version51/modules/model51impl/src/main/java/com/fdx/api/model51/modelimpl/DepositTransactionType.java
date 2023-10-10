package com.fdx.api.model51.modelimpl;

import com.fdx.common.exception.FDXException;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The type of a deposit transaction. \"FEE\" and \"INTEREST\" values are replacing \"FEE INTEREST\" value which is now deprecated and will be removed in v5.0
 */
public enum DepositTransactionType {
  
  ADJUSTMENT("ADJUSTMENT"),
  
  ATMDEPOSIT("ATMDEPOSIT"),
  
  ATMWITHDRAWAL("ATMWITHDRAWAL"),
  
  BILLPAYMENT("BILLPAYMENT"),
  
  CHECK("CHECK"),
  
  DEPOSIT("DEPOSIT"),
  
  DIRECTDEPOSIT("DIRECTDEPOSIT"),
  
  DIVIDEND("DIVIDEND"),
  
  FEE_INTEREST("FEE INTEREST"),
  
  FEE("FEE"),
  
  INTEREST("INTEREST"),
  
  POSCREDIT("POSCREDIT"),
  
  POSDEBIT("POSDEBIT"),
  
  TRANSFER("TRANSFER"),
  
  WITHDRAWAL("WITHDRAWAL");

  private String value;

  DepositTransactionType(String value) {
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
  public static DepositTransactionType fromValue(String value) {
    for (DepositTransactionType b : DepositTransactionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'",401));
  }
}

