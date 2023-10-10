package com.fdx.api.model46.modelimpl;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * AccountHolderAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class AccountHolderAllOf   {
  @JsonProperty("relationship")
  private AccountHolderRelationship relationship;

  public AccountHolderAllOf relationship(AccountHolderRelationship relationship) {
    this.relationship = relationship;
    return this;
  }

  /**
   * Get relationship
   * @return relationship
  */
  @ApiModelProperty(value = "")

  @Valid

  public AccountHolderRelationship getRelationship() {
    return relationship;
  }

  public void setRelationship(AccountHolderRelationship relationship) {
    this.relationship = relationship;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountHolderAllOf accountHolderAllOf = (AccountHolderAllOf) o;
    return Objects.equals(this.relationship, accountHolderAllOf.relationship);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relationship);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountHolderAllOf {\n");
    
    sb.append("    relationship: ").append(toIndentedString(relationship)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

