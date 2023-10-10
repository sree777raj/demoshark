package com.fdx.api.model46.modelimpl;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Tax1099SaAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1099SaAllOf {
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

	@JsonProperty("distributionCode")
	private String distributionCode;

	@JsonProperty("fairMarketValue")
	private Double fairMarketValue;

	@JsonProperty("hsa")
	@JsonInclude(Include.NON_NULL)
	private Boolean hsa;

	@JsonProperty("archerAccount")
	@JsonInclude(Include.NON_NULL)
	private Boolean archerAccount;

	@JsonProperty("medicalSavingsAccount")
	@JsonInclude(Include.NON_NULL)
	private Boolean medicalSavingsAccount;

	public Tax1099SaAllOf payerNameAddress(NameAddressPhone payerNameAddress) {
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

	public Tax1099SaAllOf payerTin(String payerTin) {
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

	public Tax1099SaAllOf recipientTin(String recipientTin) {
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

	public Tax1099SaAllOf recipientNameAddress(NameAddress recipientNameAddress) {
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

	public Tax1099SaAllOf accountNumber(String accountNumber) {
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

	public Tax1099SaAllOf grossDistribution(Double grossDistribution) {
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

	public Tax1099SaAllOf earnings(Double earnings) {
		this.earnings = earnings;
		return this;
	}

	/**
	 * Box 2, Earnings on excess contributions
	 * 
	 * @return earnings
	 */
	@ApiModelProperty(value = "Box 2, Earnings on excess contributions")

	public Double getEarnings() {
		return earnings;
	}

	public void setEarnings(Double earnings) {
		this.earnings = earnings;
	}

	public Tax1099SaAllOf distributionCode(String distributionCode) {
		this.distributionCode = distributionCode;
		return this;
	}

	/**
	 * Box 3, Distribution code
	 * 
	 * @return distributionCode
	 */
	@ApiModelProperty(value = "Box 3, Distribution code")

	public String getDistributionCode() {
		return distributionCode;
	}

	public void setDistributionCode(String distributionCode) {
		this.distributionCode = distributionCode;
	}

	public Tax1099SaAllOf fairMarketValue(Double fairMarketValue) {
		this.fairMarketValue = fairMarketValue;
		return this;
	}

	/**
	 * Box 4, FMV on date of death
	 * 
	 * @return fairMarketValue
	 */
	@ApiModelProperty(value = "Box 4, FMV on date of death")

	public Double getFairMarketValue() {
		return fairMarketValue;
	}

	public void setFairMarketValue(Double fairMarketValue) {
		this.fairMarketValue = fairMarketValue;
	}

	public Tax1099SaAllOf hsa(Boolean hsa) {
		this.hsa = hsa;
		return this;
	}

	/**
	 * Box 5a, HSA
	 * 
	 * @return hsa
	 */
	@ApiModelProperty(value = "Box 5a, HSA")

	public Boolean getHsa() {
		return hsa;
	}

	public void setHsa(Boolean hsa) {
		this.hsa = hsa;
	}

	public Tax1099SaAllOf archerAccount(Boolean archerAccount) {
		this.archerAccount = archerAccount;
		return this;
	}

	/**
	 * Box 5b, Archer MSA
	 * 
	 * @return archerAccount
	 */
	@ApiModelProperty(value = "Box 5b, Archer MSA")

	public Boolean getArcherAccount() {
		return archerAccount;
	}

	public void setArcherAccount(Boolean archerAccount) {
		this.archerAccount = archerAccount;
	}

	public Tax1099SaAllOf medicalSavingsAccount(Boolean medicalSavingsAccount) {
		this.medicalSavingsAccount = medicalSavingsAccount;
		return this;
	}

	/**
	 * Box 5c, Medicare Advantage (MA) MSA
	 * 
	 * @return medicalSavingsAccount
	 */
	@ApiModelProperty(value = "Box 5c, Medicare Advantage (MA) MSA")

	public Boolean getMedicalSavingsAccount() {
		return medicalSavingsAccount;
	}

	public void setMedicalSavingsAccount(Boolean medicalSavingsAccount) {
		this.medicalSavingsAccount = medicalSavingsAccount;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Tax1099SaAllOf tax1099SaAllOf = (Tax1099SaAllOf) o;
		return Objects.equals(this.payerNameAddress, tax1099SaAllOf.payerNameAddress)
				&& Objects.equals(this.payerTin, tax1099SaAllOf.payerTin)
				&& Objects.equals(this.recipientTin, tax1099SaAllOf.recipientTin)
				&& Objects.equals(this.recipientNameAddress, tax1099SaAllOf.recipientNameAddress)
				&& Objects.equals(this.accountNumber, tax1099SaAllOf.accountNumber)
				&& Objects.equals(this.grossDistribution, tax1099SaAllOf.grossDistribution)
				&& Objects.equals(this.earnings, tax1099SaAllOf.earnings)
				&& Objects.equals(this.distributionCode, tax1099SaAllOf.distributionCode)
				&& Objects.equals(this.fairMarketValue, tax1099SaAllOf.fairMarketValue)
				&& Objects.equals(this.hsa, tax1099SaAllOf.hsa)
				&& Objects.equals(this.archerAccount, tax1099SaAllOf.archerAccount)
				&& Objects.equals(this.medicalSavingsAccount, tax1099SaAllOf.medicalSavingsAccount);
	}

	@Override
	public int hashCode() {
		return Objects.hash(payerNameAddress, payerTin, recipientTin, recipientNameAddress, accountNumber,
				grossDistribution, earnings, distributionCode, fairMarketValue, hsa, archerAccount,
				medicalSavingsAccount);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Tax1099SaAllOf {\n");

		sb.append("    payerNameAddress: ").append(toIndentedString(payerNameAddress)).append("\n");
		sb.append("    payerTin: ").append(toIndentedString(payerTin)).append("\n");
		sb.append("    recipientTin: ").append(toIndentedString(recipientTin)).append("\n");
		sb.append("    recipientNameAddress: ").append(toIndentedString(recipientNameAddress)).append("\n");
		sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
		sb.append("    grossDistribution: ").append(toIndentedString(grossDistribution)).append("\n");
		sb.append("    earnings: ").append(toIndentedString(earnings)).append("\n");
		sb.append("    distributionCode: ").append(toIndentedString(distributionCode)).append("\n");
		sb.append("    fairMarketValue: ").append(toIndentedString(fairMarketValue)).append("\n");
		sb.append("    hsa: ").append(toIndentedString(hsa)).append("\n");
		sb.append("    archerAccount: ").append(toIndentedString(archerAccount)).append("\n");
		sb.append("    medicalSavingsAccount: ").append(toIndentedString(medicalSavingsAccount)).append("\n");
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
