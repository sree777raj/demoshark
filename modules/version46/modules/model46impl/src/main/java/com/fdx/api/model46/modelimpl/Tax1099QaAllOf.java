package com.fdx.api.model46.modelimpl;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Tax1099QaAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1099QaAllOf {
	@JsonProperty("payerNameAddress")
	private NameAddressPhone payerNameAddress;

	@JsonProperty("payerTin")
	private String payerTin;

	@JsonProperty("recipientTin")
	private String recipientTin;

	@JsonProperty("recipientNameAddress")
	private NameAddress recipientNameAddress;

	@JsonProperty("accountNumber")
	private String accountNumber;

	@JsonProperty("grossDistribution")
	private Double grossDistribution;

	@JsonProperty("earnings")
	private Double earnings;

	@JsonProperty("basis")
	private Double basis;

	@JsonProperty("programTransfer")
	@JsonInclude(Include.NON_NULL)
	private Boolean programTransfer;

	@JsonProperty("terminated")
	@JsonInclude(Include.NON_NULL)
	private Boolean terminated;

	@JsonProperty("notBeneficiary")
	@JsonInclude(Include.NON_NULL)
	private Boolean notBeneficiary;

	public Tax1099QaAllOf payerNameAddress(NameAddressPhone payerNameAddress) {
		this.payerNameAddress = payerNameAddress;
		return this;
	}

	/**
	 * Get payerNameAddress
	 * 
	 * @return payerNameAddress
	 */
	@ApiModelProperty(value = "")

	@Valid

	public NameAddressPhone getPayerNameAddress() {
		return payerNameAddress;
	}

	public void setPayerNameAddress(NameAddressPhone payerNameAddress) {
		this.payerNameAddress = payerNameAddress;
	}

	public Tax1099QaAllOf payerTin(String payerTin) {
		this.payerTin = payerTin;
		return this;
	}

	/**
	 * PAYER'S TIN
	 * 
	 * @return payerTin
	 */
	@ApiModelProperty(value = "PAYER'S TIN")

	public String getPayerTin() {
		return payerTin;
	}

	public void setPayerTin(String payerTin) {
		this.payerTin = payerTin;
	}

	public Tax1099QaAllOf recipientTin(String recipientTin) {
		this.recipientTin = recipientTin;
		return this;
	}

	/**
	 * RECIPIENT'S TIN
	 * 
	 * @return recipientTin
	 */
	@ApiModelProperty(value = "RECIPIENT'S TIN")

	public String getRecipientTin() {
		return recipientTin;
	}

	public void setRecipientTin(String recipientTin) {
		this.recipientTin = recipientTin;
	}

	public Tax1099QaAllOf recipientNameAddress(NameAddress recipientNameAddress) {
		this.recipientNameAddress = recipientNameAddress;
		return this;
	}

	/**
	 * Get recipientNameAddress
	 * 
	 * @return recipientNameAddress
	 */
	@ApiModelProperty(value = "")

	@Valid

	public NameAddress getRecipientNameAddress() {
		return recipientNameAddress;
	}

	public void setRecipientNameAddress(NameAddress recipientNameAddress) {
		this.recipientNameAddress = recipientNameAddress;
	}

	public Tax1099QaAllOf accountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
		return this;
	}

	/**
	 * Account number
	 * 
	 * @return accountNumber
	 */
	@ApiModelProperty(value = "Account number")

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Tax1099QaAllOf grossDistribution(Double grossDistribution) {
		this.grossDistribution = grossDistribution;
		return this;
	}

	/**
	 * Box 1, Gross distribution
	 * 
	 * @return grossDistribution
	 */
	@ApiModelProperty(value = "Box 1, Gross distribution")

	public Double getGrossDistribution() {
		return grossDistribution;
	}

	public void setGrossDistribution(Double grossDistribution) {
		this.grossDistribution = grossDistribution;
	}

	public Tax1099QaAllOf earnings(Double earnings) {
		this.earnings = earnings;
		return this;
	}

	/**
	 * Box 2, Earnings
	 * 
	 * @return earnings
	 */
	@ApiModelProperty(value = "Box 2, Earnings")

	public Double getEarnings() {
		return earnings;
	}

	public void setEarnings(Double earnings) {
		this.earnings = earnings;
	}

	public Tax1099QaAllOf basis(Double basis) {
		this.basis = basis;
		return this;
	}

	/**
	 * Box 3, Basis
	 * 
	 * @return basis
	 */
	@ApiModelProperty(value = "Box 3, Basis")

	public Double getBasis() {
		return basis;
	}

	public void setBasis(Double basis) {
		this.basis = basis;
	}

	public Tax1099QaAllOf programTransfer(Boolean programTransfer) {
		this.programTransfer = programTransfer;
		return this;
	}

	/**
	 * Box 4, Program-to-program transfer
	 * 
	 * @return programTransfer
	 */
	@ApiModelProperty(value = "Box 4, Program-to-program transfer")

	public Boolean getProgramTransfer() {
		return programTransfer;
	}

	public void setProgramTransfer(Boolean programTransfer) {
		this.programTransfer = programTransfer;
	}

	public Tax1099QaAllOf terminated(Boolean terminated) {
		this.terminated = terminated;
		return this;
	}

	/**
	 * Box 5, Check if ABLE account terminated in current year
	 * 
	 * @return terminated
	 */
	@ApiModelProperty(value = "Box 5, Check if ABLE account terminated in current year")

	public Boolean getTerminated() {
		return terminated;
	}

	public void setTerminated(Boolean terminated) {
		this.terminated = terminated;
	}

	public Tax1099QaAllOf notBeneficiary(Boolean notBeneficiary) {
		this.notBeneficiary = notBeneficiary;
		return this;
	}

	/**
	 * Box 6, Check if the recipient is not the designated beneficiary
	 * 
	 * @return notBeneficiary
	 */
	@ApiModelProperty(value = "Box 6, Check if the recipient is not the designated beneficiary")

	public Boolean getNotBeneficiary() {
		return notBeneficiary;
	}

	public void setNotBeneficiary(Boolean notBeneficiary) {
		this.notBeneficiary = notBeneficiary;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Tax1099QaAllOf tax1099QaAllOf = (Tax1099QaAllOf) o;
		return Objects.equals(this.payerNameAddress, tax1099QaAllOf.payerNameAddress)
				&& Objects.equals(this.payerTin, tax1099QaAllOf.payerTin)
				&& Objects.equals(this.recipientTin, tax1099QaAllOf.recipientTin)
				&& Objects.equals(this.recipientNameAddress, tax1099QaAllOf.recipientNameAddress)
				&& Objects.equals(this.accountNumber, tax1099QaAllOf.accountNumber)
				&& Objects.equals(this.grossDistribution, tax1099QaAllOf.grossDistribution)
				&& Objects.equals(this.earnings, tax1099QaAllOf.earnings)
				&& Objects.equals(this.basis, tax1099QaAllOf.basis)
				&& Objects.equals(this.programTransfer, tax1099QaAllOf.programTransfer)
				&& Objects.equals(this.terminated, tax1099QaAllOf.terminated)
				&& Objects.equals(this.notBeneficiary, tax1099QaAllOf.notBeneficiary);
	}

	@Override
	public int hashCode() {
		return Objects.hash(payerNameAddress, payerTin, recipientTin, recipientNameAddress, accountNumber,
				grossDistribution, earnings, basis, programTransfer, terminated, notBeneficiary);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Tax1099QaAllOf {\n");

		sb.append("    payerNameAddress: ").append(toIndentedString(payerNameAddress)).append("\n");
		sb.append("    payerTin: ").append(toIndentedString(payerTin)).append("\n");
		sb.append("    recipientTin: ").append(toIndentedString(recipientTin)).append("\n");
		sb.append("    recipientNameAddress: ").append(toIndentedString(recipientNameAddress)).append("\n");
		sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
		sb.append("    grossDistribution: ").append(toIndentedString(grossDistribution)).append("\n");
		sb.append("    earnings: ").append(toIndentedString(earnings)).append("\n");
		sb.append("    basis: ").append(toIndentedString(basis)).append("\n");
		sb.append("    programTransfer: ").append(toIndentedString(programTransfer)).append("\n");
		sb.append("    terminated: ").append(toIndentedString(terminated)).append("\n");
		sb.append("    notBeneficiary: ").append(toIndentedString(notBeneficiary)).append("\n");
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
