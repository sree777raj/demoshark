package com.fdx.api.entities.notification;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fdx.common.exception.FDXException;

import javax.annotation.Generated;

/**
 * Type of entity causing origination of a notification
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-12T15:25:42.789975800+05:30[Asia/Calcutta]")
public enum NotificationPayloadIdType {
  
  ACCOUNT("ACCOUNT"),
  
  CUSTOMER("CUSTOMER"),
  
  PARTY("PARTY"),
  
  MAINTENANCE("MAINTENANCE"),
  
  CONSENT("CONSENT");

  private String value;

  NotificationPayloadIdType(String value) {
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
  public static NotificationPayloadIdType fromValue(String value) {
    for (NotificationPayloadIdType b : NotificationPayloadIdType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'",401));
  }
}

