package com.fdx.api.model46.modelimpl;

import com.fdx.common.exception.FDXException;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Tax form entity name e.g. \"TaxW2\"
 */
public enum TaxFormType {
  
  BUSINESSINCOMESTATEMENT("BusinessIncomeStatement"),
  
  FARMINCOMESTATEMENT("FarmIncomeStatement"),
  
  FARMRENTALINCOMESTATEMENT("FarmRentalIncomeStatement"),
  
  RENTALINCOMESTATEMENT("RentalIncomeStatement"),
  
  ROYALTYINCOMESTATEMENT("RoyaltyIncomeStatement"),
  
  TAX1041K1("Tax1041K1"),
  
  TAX1042S("Tax1042S"),
  
  TAX1065K1("Tax1065K1"),
  
  TAX1095A("Tax1095A"),
  
  TAX1095B("Tax1095B"),
  
  TAX1095C("Tax1095C"),
  
  TAX1097BTC("Tax1097Btc"),
  
  TAX1098("Tax1098"),
  
  TAX1098C("Tax1098C"),
  
  TAX1098E("Tax1098E"),
  
  TAX1098MA("Tax1098Ma"),
  
  TAX1098Q("Tax1098Q"),
  
  TAX1098T("Tax1098T"),
  
  TAX1099A("Tax1099A"),
  
  TAX1099B("Tax1099B"),
  
  TAX1099C("Tax1099C"),
  
  TAX1099CAP("Tax1099Cap"),
  
  TAX1099DIV("Tax1099Div"),
  
  TAX1099G("Tax1099G"),
  
  TAX1099H("Tax1099H"),
  
  TAX1099INT("Tax1099Int"),
  
  TAX1099K("Tax1099K"),
  
  TAX1099LS("Tax1099Ls"),
  
  TAX1099LTC("Tax1099Ltc"),
  
  TAX1099MISC("Tax1099Misc"),
  
  TAX1099NEC("Tax1099Nec"),
  
  TAX1099OID("Tax1099Oid"),
  
  TAX1099PATR("Tax1099Patr"),
  
  TAX1099Q("Tax1099Q"),
  
  TAX1099QA("Tax1099Qa"),
  
  TAX1099R("Tax1099R"),
  
  TAX1099S("Tax1099S"),
  
  TAX1099SA("Tax1099Sa"),
  
  TAX1099SB("Tax1099Sb"),
  
  TAX1120SK1("Tax1120SK1"),
  
  TAX2439("Tax2439"),
  
  TAX3921("Tax3921"),
  
  TAX3922("Tax3922"),
  
  TAX5227K1("Tax5227K1"),
  
  TAX5498("Tax5498"),
  
  TAX5498ESA("Tax5498Esa"),
  
  TAX5498QA("Tax5498Qa"),
  
  TAX5498SA("Tax5498Sa"),
  
  TAXW2("TaxW2"),
  
  TAXW2C("TaxW2C"),
  
  TAXW2G("TaxW2G");

  private String value;

  TaxFormType(String value) {
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
  public static TaxFormType fromValue(String value) {
    for (TaxFormType b : TaxFormType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'",401));
  }
}

