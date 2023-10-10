package com.fdx.api.entities.notification;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fdx.common.exception.FDXException;

/**
 * Severity level of notification
 */

public enum NotificationSeverity {
  
  EMERGENCY("EMERGENCY"),
  
  ALERT("ALERT"),
  
  WARNING("WARNING"),
  
  NOTICE("NOTICE"),
  
  INFO("INFO");

  private String value;

  NotificationSeverity(String value) {
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
  public static NotificationSeverity fromValue(String value) {
    for (NotificationSeverity b : NotificationSeverity.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'",401));
  }
}

