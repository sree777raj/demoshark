package com.fdx.api.model46.modelimpl;

import com.fdx.common.exception.FDXException;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Types of document formats. (Suggested values)
 */
public enum ContentTypes {
  
  APPLICATION_PDF("application/pdf"),
  
  IMAGE_GIF("image/gif"),
  
  IMAGE_JPEG("image/jpeg"),
  
  IMAGE_TIFF("image/tiff"),
  
  IMAGE_PNG("image/png"),
  
  APPLICATION_JSON("application/json");

  private String value;

  ContentTypes(String value) {
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
  public static ContentTypes fromValue(String value) {
    for (ContentTypes b : ContentTypes.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'",401));
  }
}

