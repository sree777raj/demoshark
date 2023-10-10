package com.fdx.api.entities.moneymovement;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * Used to request a transfer
 */
@Schema(name = "TransferForCreate", description = "Used to request a transfer")
public class TransferForCreate {

  @JsonProperty("transferId")
  private String transferId;

  @JsonProperty("fromAccountId")
  private String fromAccountId;

  @JsonProperty("toAccountId")
  private String toAccountId;

  @JsonProperty("amount")
  private BigDecimal amount;

  @JsonProperty("memo")
  private String memo;

  @JsonProperty("paymentDetailsDTO")
  private PaymentDetailsDTO paymentDetailsDTO;

  @JsonProperty("referenceId")
  private String referenceId;

  @JsonProperty("status")
  private PaymentStatus status;

  @JsonProperty("transferTime")
  private Timestamp transferTime;

  public TransferForCreate transferId(String transferId) {
    this.transferId = transferId;
    return this;
  }

  /**
   * Value for a unique identifier
   *
   * @return transferId
   */
  @Size(max = 256)
  @Schema(name = "transferId", description = "Value for a unique identifier", required = false)
  public String getTransferId() {
    return transferId;
  }

  public void setTransferId(String transferId) {
    this.transferId = transferId;
  }

  public TransferForCreate fromAccountId(String fromAccountId) {
    this.fromAccountId = fromAccountId;
    return this;
  }

  /**
   * Value for a unique identifier
   *
   * @return fromAccountId
   */
  @Size(max = 256)
  @Schema(name = "fromAccountId", description = "Value for a unique identifier", required = false)
  public String getFromAccountId() {
    return fromAccountId;
  }

  public void setFromAccountId(String fromAccountId) {
    this.fromAccountId = fromAccountId;
  }

  public TransferForCreate toAccountId(String toAccountId) {
    this.toAccountId = toAccountId;
    return this;
  }

  /**
   * Value for a unique identifier
   *
   * @return toAccountId
   */
  @Size(max = 256)
  @Schema(name = "toAccountId", description = "Value for a unique identifier", required = false)
  public String getToAccountId() {
    return toAccountId;
  }

  public void setToAccountId(String toAccountId) {
    this.toAccountId = toAccountId;
  }

  public TransferForCreate amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Positive amount of money to be transferred
   *
   * @return amount
   */
  @Valid
  @Schema(name = "amount", description = "Positive amount of money to be transferred", required = false)
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public TransferForCreate memo(String memo) {
    this.memo = memo;
    return this;
  }

  /**
   * String of maximum length 255
   *
   * @return memo
   */
  @Size(max = 255)
  @Schema(name = "memo", description = "String of maximum length 255", required = false)
  public String getMemo() {
    return memo;
  }

  public void setMemo(String memo) {
    this.memo = memo;
  }

  public TransferForCreate paymentDetails(PaymentDetailsDTO paymentDetailsDTO) {
    this.paymentDetailsDTO = paymentDetailsDTO;
    return this;
  }

  /**
   * Get paymentDetailsDTO
   *
   * @return paymentDetailsDTO
   */
  @Valid
  @Schema(name = "paymentDetailsDTO", required = false)
  public PaymentDetailsDTO getPaymentDetails() {
    return paymentDetailsDTO;
  }

  public void setPaymentDetails(PaymentDetailsDTO paymentDetailsDTO) {
    this.paymentDetailsDTO = paymentDetailsDTO;
  }

  public TransferForCreate referenceId(String referenceId) {
    this.referenceId = referenceId;
    return this;
  }

  /**
   * Value for a unique identifier
   *
   * @return referenceId
   */
  @Size(max = 256)
  @Schema(name = "referenceId", description = "Value for a unique identifier", required = false)
  public String getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }

  public TransferForCreate status(PaymentStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   *
   * @return status
   */
  @Valid
  @Schema(name = "status", required = false)
  public PaymentStatus getStatus() {
    return status;
  }

  public void setStatus(PaymentStatus status) {
    this.status = status;
  }

  public TransferForCreate transferTime(Timestamp transferTime) {
    this.transferTime = transferTime;
    return this;
  }

  /**
   * Get transferTime
   *
   * @return transferTime
   */
  @Valid
  @Schema(name = "transferTime", required = false)
  public Timestamp getTransferTime() {
    return transferTime;
  }

  public void setTransferTime(Timestamp transferTime) {
    this.transferTime = transferTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferForCreate transferForCreate = (TransferForCreate) o;
    return Objects.equals(this.transferId, transferForCreate.transferId) &&
        Objects.equals(this.fromAccountId, transferForCreate.fromAccountId) &&
        Objects.equals(this.toAccountId, transferForCreate.toAccountId) &&
        Objects.equals(this.amount, transferForCreate.amount) &&
        Objects.equals(this.memo, transferForCreate.memo) &&
        Objects.equals(this.paymentDetailsDTO, transferForCreate.paymentDetailsDTO) &&
        Objects.equals(this.referenceId, transferForCreate.referenceId) &&
        Objects.equals(this.status, transferForCreate.status) &&
        Objects.equals(this.transferTime, transferForCreate.transferTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transferId, fromAccountId, toAccountId, amount, memo, paymentDetailsDTO, referenceId, status, transferTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transfer {\n");
    sb.append("    transferId: ").append(toIndentedString(transferId)).append("\n");
    sb.append("    fromAccountId: ").append(toIndentedString(fromAccountId)).append("\n");
    sb.append("    toAccountId: ").append(toIndentedString(toAccountId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    paymentDetailsDTO: ").append(toIndentedString(paymentDetailsDTO)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    transferTime: ").append(toIndentedString(transferTime)).append("\n");
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
