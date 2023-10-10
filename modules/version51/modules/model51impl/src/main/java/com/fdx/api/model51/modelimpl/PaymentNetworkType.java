package com.fdx.api.model51.modelimpl;

import com.fdx.common.exception.FDXException;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Suggested values for Payment Network Type<br/> <br/> | Value | Description |<br/> |-----|-----|<br/> | US_ACH | Automated Clearing House |<br/> | US_FEDWIRE | Fedwire Funds Service |<br/> | US_CHIPS | Clearinghouse Interbank Payments System |<br/> | CA_ACSS | Automated Clearing House Settlement System |<br/> | CA_LVTS | Large-Value Transfer System |
 */
public enum PaymentNetworkType {
  
  US_ACH("US_ACH"),
  
  US_FEDWIRE("US_FEDWIRE"),
  
  US_CHIPS("US_CHIPS"),
  
  CA_ACSS("CA_ACSS"),
  
  CA_LVTS("CA_LVTS");

  private String value;

  PaymentNetworkType(String value) {
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
  public static PaymentNetworkType fromValue(String value) {
    for (PaymentNetworkType b : PaymentNetworkType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'",401));
  }
}

