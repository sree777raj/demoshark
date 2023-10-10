package com.fdx.api.entities.consent;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fdx.common.exception.FDXException;

import javax.annotation.Generated;

/**
 * Name of [cluster of data elements](https://fdx.atlassian.net/wiki/spaces/FDX/pages/872906996/v1.1+Data+Clusters) permissioned
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-18T17:46:09.510212100+05:30[Asia/Calcutta]")
public enum DataCluster {
  
  ACCOUNT_BASIC("ACCOUNT_BASIC"),
  
  ACCOUNT_DETAILED("ACCOUNT_DETAILED"),
  
  ACCOUNT_PAYMENTS("ACCOUNT_PAYMENTS"),
  
  CUSTOMER_CONTACT("CUSTOMER_CONTACT"),
  
  CUSTOMER_PERSONAL("CUSTOMER_PERSONAL"),
  
  INVESTMENTS("INVESTMENTS"),
  
  STATEMENTS("STATEMENTS"),
  
  TRANSACTIONS("TRANSACTIONS"),

  ALL("ALL");

  private String value;

  DataCluster(String value) {
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
  public static DataCluster fromValue(String value) {
    for (DataCluster b : DataCluster.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'",401));
  }

}