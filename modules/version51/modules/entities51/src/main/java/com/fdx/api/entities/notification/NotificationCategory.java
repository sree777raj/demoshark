package com.fdx.api.entities.notification;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fdx.common.exception.FDXException;

/**
 * Category of Notification
 */

public enum NotificationCategory {
  
  SECURITY("SECURITY"),
  
  MAINTENANCE("MAINTENANCE"),
  
  FRAUD("FRAUD"),
  
  CONSENT("CONSENT"),
  
  NEW_DATA("NEW_DATA");

  private String value;

  NotificationCategory(String value) {
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
  public static NotificationCategory fromValue(String value) {
    for (NotificationCategory b : NotificationCategory.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'",401));
  }
}

