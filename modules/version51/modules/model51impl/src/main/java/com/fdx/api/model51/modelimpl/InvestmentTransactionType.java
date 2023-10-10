package com.fdx.api.model51.modelimpl;

import com.fdx.common.exception.FDXException;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The type of an investment transaction
 */
public enum InvestmentTransactionType {
  
  ADJUSTMENT("ADJUSTMENT"),
  
  ATM("ATM"),
  
  CASH("CASH"),
  
  CHECK("CHECK"),
  
  CLOSURE("CLOSURE"),
  
  CLOSUREOPT("CLOSUREOPT"),
  
  CONTRIBUTION("CONTRIBUTION"),
  
  DEP("DEP"),
  
  DEPOSIT("DEPOSIT"),
  
  DIRECTDEBIT("DIRECTDEBIT"),
  
  DIRECTDEP("DIRECTDEP"),
  
  DIV("DIV"),
  
  DIVIDEND("DIVIDEND"),
  
  DIVIDENDREINVEST("DIVIDENDREINVEST"),
  
  EXPENSE("EXPENSE"),
  
  FEE("FEE"),
  
  INCOME("INCOME"),
  
  INTEREST("INTEREST"),
  
  INVEXPENSE("INVEXPENSE"),
  
  JRNLFUND("JRNLFUND"),
  
  JRNLSEC("JRNLSEC"),
  
  MARGININTEREST("MARGININTEREST"),
  
  OPTIONEXERCISE("OPTIONEXERCISE"),
  
  OPTIONEXPIRATION("OPTIONEXPIRATION"),
  
  OTHER("OTHER"),
  
  PAYMENT("PAYMENT"),
  
  POS("POS"),
  
  PURCHASED("PURCHASED"),
  
  PURCHASEDTOCOVER("PURCHASEDTOCOVER"),
  
  PURCHASETOCLOSE("PURCHASETOCLOSE"),
  
  PURCHASETOOPEN("PURCHASETOOPEN"),
  
  REINVESTOFINCOME("REINVESTOFINCOME"),
  
  REPEATPMT("REPEATPMT"),
  
  RETURNOFCAPITAL("RETURNOFCAPITAL"),
  
  SOLD("SOLD"),
  
  SOLDTOCLOSE("SOLDTOCLOSE"),
  
  SOLDTOOPEN("SOLDTOOPEN"),
  
  SPLIT("SPLIT"),
  
  SRVCHG("SRVCHG"),
  
  TRANSFER("TRANSFER"),
  
  XFER("XFER");

  private String value;

  InvestmentTransactionType(String value) {
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
  public static InvestmentTransactionType fromValue(String value) {
    for (InvestmentTransactionType b : InvestmentTransactionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'",401));
  }
}

