package com.fdx.api.model51.modelimpl;

import com.fdx.common.exception.FDXException;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Types of relationships between accounts and holders. Suggested values
 */
public enum AccountHolderRelationship {
  
  BUSINESS("BUSINESS"),
  
  FOR_BENEFIT_OF("FOR_BENEFIT_OF"),
  
  FOR_BENEFIT_OF_PRIMARY("FOR_BENEFIT_OF_PRIMARY"),
  
  FOR_BENEFIT_OF_PRIMARY_JOINT_RESTRICTED("FOR_BENEFIT_OF_PRIMARY_JOINT_RESTRICTED"),
  
  FOR_BENEFIT_OF_SECONDARY("FOR_BENEFIT_OF_SECONDARY"),
  
  FOR_BENEFIT_OF_SECONDARY_JOINT_RESTRICTED("FOR_BENEFIT_OF_SECONDARY_JOINT_RESTRICTED"),
  
  FOR_BENEFIT_OF_SOLE_OWNER_RESTRICTED("FOR_BENEFIT_OF_SOLE_OWNER_RESTRICTED"),
  
  POWER_OF_ATTORNEY("POWER_OF_ATTORNEY"),
  
  PRIMARY_JOINT_TENANTS("PRIMARY_JOINT_TENANTS"),
  
  PRIMARY("PRIMARY"),
  
  PRIMARY_BORROWER("PRIMARY_BORROWER"),
  
  PRIMARY_JOINT("PRIMARY_JOINT"),
  
  SECONDARY("SECONDARY"),
  
  SECONDARY_JOINT_TENANTS("SECONDARY_JOINT_TENANTS"),
  
  SECONDARY_BORROWER("SECONDARY_BORROWER"),
  
  SECONDARY_JOINT("SECONDARY_JOINT"),
  
  SOLE_OWNER("SOLE_OWNER"),
  
  TRUSTEE("TRUSTEE"),
  
  UNIFORM_TRANSFER_TO_MINOR("UNIFORM_TRANSFER_TO_MINOR");

  private String value;

  AccountHolderRelationship(String value) {
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
  public static AccountHolderRelationship fromValue(String value) {
    for (AccountHolderRelationship b : AccountHolderRelationship.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'",401));
  }
}

