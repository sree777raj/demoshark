package com.fdx.api.model46.modelimpl;

import java.math.BigDecimal;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * AccountAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class AccountAllOf {
	@JsonProperty("parentAccountId")
	private String parentAccountId;

	@JsonProperty("lineOfBusiness")
	private String lineOfBusiness;

	@JsonProperty("routingTransitNumber")
	private String routingTransitNumber;

	@JsonProperty("balanceType")
	private BalanceType balanceType;

	@JsonProperty("contact")
	private AccountContact contact;

	@JsonProperty("interestRate")
	private BigDecimal interestRate;

	@JsonProperty("interestRateType")
	private InterestRateType interestRateType;

	@JsonProperty("interestRateAsOf")
	private java.sql.Timestamp interestRateAsOf;

	@JsonProperty("priorInterestRate")
	private BigDecimal priorInterestRate;

	@JsonProperty("transferIn")
	@JsonInclude(Include.NON_NULL)
	private Boolean transferIn;

	@JsonProperty("transferOut")
	@JsonInclude(Include.NON_NULL)
	private Boolean transferOut;

	@JsonProperty("billPayStatus")
	private AccountBillPayStatus billPayStatus;

	@JsonProperty("micrNumber")
	private String micrNumber;

	@JsonProperty("lastActivityDate")
	private java.sql.Timestamp lastActivityDate;

	@JsonProperty("rewardProgramId")
	private String rewardProgramId;

	@JsonProperty("transactionsIncluded")
	@JsonInclude(Include.NON_NULL)
	private Boolean transactionsIncluded;

	public AccountAllOf parentAccountId(String parentAccountId) {
		this.parentAccountId = parentAccountId;
		return this;
	}

	/**
	 * Value for a unique identifier
	 * 
	 * @return parentAccountId
	 */
	@ApiModelProperty(value = "Value for a unique identifier")

	@Size(max = 256)
	public String getParentAccountId() {
		return parentAccountId;
	}

	public void setParentAccountId(String parentAccountId) {
		this.parentAccountId = parentAccountId;
	}

	public AccountAllOf lineOfBusiness(String lineOfBusiness) {
		this.lineOfBusiness = lineOfBusiness;
		return this;
	}

	/**
	 * The line of business, such as consumer, consumer joint, small business,
	 * corporate, etc.
	 * 
	 * @return lineOfBusiness
	 */
	@ApiModelProperty(value = "The line of business, such as consumer, consumer joint, small business, corporate, etc.")

	public String getLineOfBusiness() {
		return lineOfBusiness;
	}

	public void setLineOfBusiness(String lineOfBusiness) {
		this.lineOfBusiness = lineOfBusiness;
	}

	public AccountAllOf routingTransitNumber(String routingTransitNumber) {
		this.routingTransitNumber = routingTransitNumber;
		return this;
	}

	/**
	 * Routing transit number (RTN) associated with account number at owning
	 * institution
	 * 
	 * @return routingTransitNumber
	 */
	@ApiModelProperty(value = "Routing transit number (RTN) associated with account number at owning institution")

	public String getRoutingTransitNumber() {
		return routingTransitNumber;
	}

	public void setRoutingTransitNumber(String routingTransitNumber) {
		this.routingTransitNumber = routingTransitNumber;
	}

	public AccountAllOf balanceType(BalanceType balanceType) {
		this.balanceType = balanceType;
		return this;
	}

	/**
	 * Get balanceType
	 * 
	 * @return balanceType
	 */
	@ApiModelProperty(value = "")

	@Valid

	public BalanceType getBalanceType() {
		return balanceType;
	}

	public void setBalanceType(BalanceType balanceType) {
		this.balanceType = balanceType;
	}

	public AccountAllOf contact(AccountContact contact) {
		this.contact = contact;
		return this;
	}

	/**
	 * Get contact
	 * 
	 * @return contact
	 */
	@ApiModelProperty(value = "")

	@Valid

	public AccountContact getContact() {
		return contact;
	}

	public void setContact(AccountContact contact) {
		this.contact = contact;
	}

	public AccountAllOf interestRate(BigDecimal interestRate) {
		this.interestRate = interestRate;
		return this;
	}

	/**
	 * Interest Rate of Account
	 * 
	 * @return interestRate
	 */
	@ApiModelProperty(value = "Interest Rate of Account")

	@Valid

	public BigDecimal getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(BigDecimal interestRate) {
		this.interestRate = interestRate;
	}

	public AccountAllOf interestRateType(InterestRateType interestRateType) {
		this.interestRateType = interestRateType;
		return this;
	}

	/**
	 * Get interestRateType
	 * 
	 * @return interestRateType
	 */
	@ApiModelProperty(value = "")

	@Valid

	public InterestRateType getInterestRateType() {
		return interestRateType;
	}

	public void setInterestRateType(InterestRateType interestRateType) {
		this.interestRateType = interestRateType;
	}

	public AccountAllOf interestRateAsOf(java.sql.Timestamp interestRateAsOf) {
		this.interestRateAsOf = interestRateAsOf;
		return this;
	}

	/**
	 * Get interestRateAsOf
	 * 
	 * @return interestRateAsOf
	 */
	@ApiModelProperty(value = "")

	@Valid

	public java.sql.Timestamp getInterestRateAsOf() {
		return interestRateAsOf;
	}

	public void setInterestRateAsOf(java.sql.Timestamp interestRateAsOf) {
		this.interestRateAsOf = interestRateAsOf;
	}

	public AccountAllOf priorInterestRate(BigDecimal priorInterestRate) {
		this.priorInterestRate = priorInterestRate;
		return this;
	}

	/**
	 * Previous Interest Rate of Account
	 * 
	 * @return priorInterestRate
	 */
	@ApiModelProperty(value = "Previous Interest Rate of Account")

	@Valid

	public BigDecimal getPriorInterestRate() {
		return priorInterestRate;
	}

	public void setPriorInterestRate(BigDecimal priorInterestRate) {
		this.priorInterestRate = priorInterestRate;
	}

	public AccountAllOf transferIn(Boolean transferIn) {
		this.transferIn = transferIn;
		return this;
	}

	/**
	 * Account is eligible for incoming transfers
	 * 
	 * @return transferIn
	 */
	@ApiModelProperty(value = "Account is eligible for incoming transfers")

	public Boolean getTransferIn() {
		return transferIn;
	}

	public void setTransferIn(Boolean transferIn) {
		this.transferIn = transferIn;
	}

	public AccountAllOf transferOut(Boolean transferOut) {
		this.transferOut = transferOut;
		return this;
	}

	/**
	 * Account is eligible for outgoing transfers
	 * 
	 * @return transferOut
	 */
	@ApiModelProperty(value = "Account is eligible for outgoing transfers")

	public Boolean getTransferOut() {
		return transferOut;
	}

	public void setTransferOut(Boolean transferOut) {
		this.transferOut = transferOut;
	}

	public AccountAllOf billPayStatus(AccountBillPayStatus billPayStatus) {
		this.billPayStatus = billPayStatus;
		return this;
	}

	/**
	 * Get billPayStatus
	 * 
	 * @return billPayStatus
	 */
	@ApiModelProperty(value = "")

	@Valid

	public AccountBillPayStatus getBillPayStatus() {
		return billPayStatus;
	}

	public void setBillPayStatus(AccountBillPayStatus billPayStatus) {
		this.billPayStatus = billPayStatus;
	}

	public AccountAllOf micrNumber(String micrNumber) {
		this.micrNumber = micrNumber;
		return this;
	}

	/**
	 * String of maximum length 64
	 * 
	 * @return micrNumber
	 */
	@ApiModelProperty(value = "String of maximum length 64")

	@Size(max = 64)
	public String getMicrNumber() {
		return micrNumber;
	}

	public void setMicrNumber(String micrNumber) {
		this.micrNumber = micrNumber;
	}

	public AccountAllOf lastActivityDate(java.sql.Timestamp lastActivityDate) {
		this.lastActivityDate = lastActivityDate;
		return this;
	}

	/**
	 * Get lastActivityDate
	 * 
	 * @return lastActivityDate
	 */
	@ApiModelProperty(value = "")

	@Valid

	public java.sql.Timestamp getLastActivityDate() {
		return lastActivityDate;
	}

	public void setLastActivityDate(java.sql.Timestamp lastActivityDate) {
		this.lastActivityDate = lastActivityDate;
	}

	public AccountAllOf rewardProgramId(String rewardProgramId) {
		this.rewardProgramId = rewardProgramId;
		return this;
	}

	/**
	 * Value for a unique identifier
	 * 
	 * @return rewardProgramId
	 */
	@ApiModelProperty(value = "Value for a unique identifier")

	@Size(max = 256)
	public String getRewardProgramId() {
		return rewardProgramId;
	}

	public void setRewardProgramId(String rewardProgramId) {
		this.rewardProgramId = rewardProgramId;
	}

	public AccountAllOf transactionsIncluded(Boolean transactionsIncluded) {
		this.transactionsIncluded = transactionsIncluded;
		return this;
	}

	/**
	 * Default is false. If present and true, a call to retrieve transactions will
	 * not return any further details about this account. This is an optimization
	 * that allows an FDX API server to return transactions and account details in a
	 * single call
	 * 
	 * @return transactionsIncluded
	 */
	@ApiModelProperty(value = "Default is false. If present and true, a call to retrieve transactions will not return any further details about this account. This is an optimization that allows an FDX API server to return transactions and account details in a single call")

	public Boolean getTransactionsIncluded() {
		return transactionsIncluded;
	}

	public void setTransactionsIncluded(Boolean transactionsIncluded) {
		this.transactionsIncluded = transactionsIncluded;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AccountAllOf accountAllOf = (AccountAllOf) o;
		return Objects.equals(this.parentAccountId, accountAllOf.parentAccountId)
				&& Objects.equals(this.lineOfBusiness, accountAllOf.lineOfBusiness)
				&& Objects.equals(this.routingTransitNumber, accountAllOf.routingTransitNumber)
				&& Objects.equals(this.balanceType, accountAllOf.balanceType)
				&& Objects.equals(this.contact, accountAllOf.contact)
				&& Objects.equals(this.interestRate, accountAllOf.interestRate)
				&& Objects.equals(this.interestRateType, accountAllOf.interestRateType)
				&& Objects.equals(this.interestRateAsOf, accountAllOf.interestRateAsOf)
				&& Objects.equals(this.priorInterestRate, accountAllOf.priorInterestRate)
				&& Objects.equals(this.transferIn, accountAllOf.transferIn)
				&& Objects.equals(this.transferOut, accountAllOf.transferOut)
				&& Objects.equals(this.billPayStatus, accountAllOf.billPayStatus)
				&& Objects.equals(this.micrNumber, accountAllOf.micrNumber)
				&& Objects.equals(this.lastActivityDate, accountAllOf.lastActivityDate)
				&& Objects.equals(this.rewardProgramId, accountAllOf.rewardProgramId)
				&& Objects.equals(this.transactionsIncluded, accountAllOf.transactionsIncluded);
	}

	@Override
	public int hashCode() {
		return Objects.hash(parentAccountId, lineOfBusiness, routingTransitNumber, balanceType, contact, interestRate,
				interestRateType, interestRateAsOf, priorInterestRate, transferIn, transferOut, billPayStatus,
				micrNumber, lastActivityDate, rewardProgramId, transactionsIncluded);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AccountAllOf {\n");

		sb.append("    parentAccountId: ").append(toIndentedString(parentAccountId)).append("\n");
		sb.append("    lineOfBusiness: ").append(toIndentedString(lineOfBusiness)).append("\n");
		sb.append("    routingTransitNumber: ").append(toIndentedString(routingTransitNumber)).append("\n");
		sb.append("    balanceType: ").append(toIndentedString(balanceType)).append("\n");
		sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
		sb.append("    interestRate: ").append(toIndentedString(interestRate)).append("\n");
		sb.append("    interestRateType: ").append(toIndentedString(interestRateType)).append("\n");
		sb.append("    interestRateAsOf: ").append(toIndentedString(interestRateAsOf)).append("\n");
		sb.append("    priorInterestRate: ").append(toIndentedString(priorInterestRate)).append("\n");
		sb.append("    transferIn: ").append(toIndentedString(transferIn)).append("\n");
		sb.append("    transferOut: ").append(toIndentedString(transferOut)).append("\n");
		sb.append("    billPayStatus: ").append(toIndentedString(billPayStatus)).append("\n");
		sb.append("    micrNumber: ").append(toIndentedString(micrNumber)).append("\n");
		sb.append("    lastActivityDate: ").append(toIndentedString(lastActivityDate)).append("\n");
		sb.append("    rewardProgramId: ").append(toIndentedString(rewardProgramId)).append("\n");
		sb.append("    transactionsIncluded: ").append(toIndentedString(transactionsIncluded)).append("\n");
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
