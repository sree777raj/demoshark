package com.fdx.api.model46.modelimpl;

import com.fdx.common.exception.FDXException;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModelProperty;

/**
 * InsuranceTransactionAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class InsuranceTransactionAllOf   {
  /**
   * Type of insurance transaction
   */
  public enum TransactionTypeEnum {
    PAYMENT("PAYMENT"),
    
    FEE("FEE"),
    
    ADJUSTMENT("ADJUSTMENT"),
    
    INTEREST("INTEREST");

    private String value;

    TransactionTypeEnum(String value) {
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
    public static TransactionTypeEnum fromValue(String value) {
      for (TransactionTypeEnum b : TransactionTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'",401));
    }
  }

  @JsonProperty("transactionType")
  private TransactionTypeEnum transactionType;

  public InsuranceTransactionAllOf transactionType(TransactionTypeEnum transactionType) {
    this.transactionType = transactionType;
    return this;
  }

  /**
   * Type of insurance transaction
   * @return transactionType
  */
  @ApiModelProperty(value = "Type of insurance transaction")


  public TransactionTypeEnum getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(TransactionTypeEnum transactionType) {
    this.transactionType = transactionType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InsuranceTransactionAllOf insuranceTransactionAllOf = (InsuranceTransactionAllOf) o;
    return Objects.equals(this.transactionType, insuranceTransactionAllOf.transactionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsuranceTransactionAllOf {\n");
    
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
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

