package com.fdx.api.entities.notification;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fdx.common.exception.FDXException;

/**
 * Type of Notification
 */

public enum NotificationType {
  
  CONSENT_REVOKED("CONSENT_REVOKED"),
  
  CONSENT_UPDATED("CONSENT_UPDATED"),
  
  CUSTOM("CUSTOM"),
  
  SERVICE("SERVICE"),
  
  BALANCE("BALANCE"),
  
  PLANNED_OUTAGE("PLANNED_OUTAGE");

  private String value;

  NotificationType(String value) {
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
  public static NotificationType fromValue(String value) {
    for (NotificationType b : NotificationType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'",401));
  }
}

