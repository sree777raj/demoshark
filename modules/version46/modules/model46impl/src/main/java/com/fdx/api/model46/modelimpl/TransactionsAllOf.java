package com.fdx.api.model46.modelimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * TransactionsAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class TransactionsAllOf   {
  @JsonProperty("transactions")
  @Valid
  private List<Object> transactions = null;

  public TransactionsAllOf transactions(List<Object> transactions) {
    this.transactions = transactions;
    return this;
  }

  public TransactionsAllOf addTransactionsItem(Object transactionsItem) {
    if (this.transactions == null) {
      this.transactions = new ArrayList<>();
    }
    this.transactions.add(transactionsItem);
    return this;
  }

  /**
   * An array of transactions with entity type dependent on the account type (deposit, loan, line of credit, investment or insurance)
   * @return transactions
  */
  @ApiModelProperty(value = "An array of transactions with entity type dependent on the account type (deposit, loan, line of credit, investment or insurance)")


  public List<Object> getTransactions() {
    return transactions;
  }

  public void setTransactions(List<Object> transactions) {
    this.transactions = transactions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionsAllOf transactionsAllOf = (TransactionsAllOf) o;
    return Objects.equals(this.transactions, transactionsAllOf.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionsAllOf {\n");
    
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
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

