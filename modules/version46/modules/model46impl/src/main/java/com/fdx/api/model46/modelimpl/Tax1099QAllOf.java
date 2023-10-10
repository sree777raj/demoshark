package com.fdx.api.model46.modelimpl;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Tax1099QAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1099QAllOf {
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

	@JsonProperty("trusteeToTrustee")
	@JsonInclude(Include.NON_NULL)
	private Boolean trusteeToTrustee;

	@JsonProperty("tuitionPlanPrivate")
	@JsonInclude(Include.NON_NULL)
	private Boolean tuitionPlanPrivate;

	@JsonProperty("tuitionPlanPublic")
	@JsonInclude(Include.NON_NULL)
	private Boolean tuitionPlanPublic;

	@JsonProperty("coverdellEsa")
	@JsonInclude(Include.NON_NULL)
	private Boolean coverdellEsa;

	@JsonProperty("recipientIsNotBeneficiary")
	@JsonInclude(Include.NON_NULL)
	private Boolean recipientIsNotBeneficiary;

	public Tax1099QAllOf payerNameAddress(NameAddressPhone payerNameAddress) {
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

	public Tax1099QAllOf payerTin(String payerTin) {
		this.payerTin = payerTin;
		return this;
	}

	/**
	 * PAYER'S/TRUSTEE'S TIN
	 * 
	 * @return payerTin
	 */
	@ApiModelProperty(value = "PAYER'S/TRUSTEE'S TIN")

	public String getPayerTin() {
		return payerTin;
	}

	public void setPayerTin(String payerTin) {
		this.payerTin = payerTin;
	}

	public Tax1099QAllOf recipientTin(String recipientTin) {
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

	public Tax1099QAllOf recipientNameAddress(NameAddress recipientNameAddress) {
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

	public Tax1099QAllOf accountNumber(String accountNumber) {
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

	public Tax1099QAllOf grossDistribution(Double grossDistribution) {
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

	public Tax1099QAllOf earnings(Double earnings) {
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

	public Tax1099QAllOf basis(Double basis) {
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

	public Tax1099QAllOf trusteeToTrustee(Boolean trusteeToTrustee) {
		this.trusteeToTrustee = trusteeToTrustee;
		return this;
	}

	/**
	 * Box 4, Trustee-to-trustee transfer
	 * 
	 * @return trusteeToTrustee
	 */
	@ApiModelProperty(value = "Box 4, Trustee-to-trustee transfer")

	public Boolean getTrusteeToTrustee() {
		return trusteeToTrustee;
	}

	public void setTrusteeToTrustee(Boolean trusteeToTrustee) {
		this.trusteeToTrustee = trusteeToTrustee;
	}

	public Tax1099QAllOf tuitionPlanPrivate(Boolean tuitionPlanPrivate) {
		this.tuitionPlanPrivate = tuitionPlanPrivate;
		return this;
	}

	/**
	 * Box 5a, Qualified tuition plan - Private
	 * 
	 * @return tuitionPlanPrivate
	 */
	@ApiModelProperty(value = "Box 5a, Qualified tuition plan - Private")

	public Boolean getTuitionPlanPrivate() {
		return tuitionPlanPrivate;
	}

	public void setTuitionPlanPrivate(Boolean tuitionPlanPrivate) {
		this.tuitionPlanPrivate = tuitionPlanPrivate;
	}

	public Tax1099QAllOf tuitionPlanPublic(Boolean tuitionPlanPublic) {
		this.tuitionPlanPublic = tuitionPlanPublic;
		return this;
	}

	/**
	 * Box 5b, Qualified tuition plan - Public
	 * 
	 * @return tuitionPlanPublic
	 */
	@ApiModelProperty(value = "Box 5b, Qualified tuition plan - Public")

	public Boolean getTuitionPlanPublic() {
		return tuitionPlanPublic;
	}

	public void setTuitionPlanPublic(Boolean tuitionPlanPublic) {
		this.tuitionPlanPublic = tuitionPlanPublic;
	}

	public Tax1099QAllOf coverdellEsa(Boolean coverdellEsa) {
		this.coverdellEsa = coverdellEsa;
		return this;
	}

	/**
	 * Box 5c, Coverdell ESA
	 * 
	 * @return coverdellEsa
	 */
	@ApiModelProperty(value = "Box 5c, Coverdell ESA")

	public Boolean getCoverdellEsa() {
		return coverdellEsa;
	}

	public void setCoverdellEsa(Boolean coverdellEsa) {
		this.coverdellEsa = coverdellEsa;
	}

	public Tax1099QAllOf recipientIsNotBeneficiary(Boolean recipientIsNotBeneficiary) {
		this.recipientIsNotBeneficiary = recipientIsNotBeneficiary;
		return this;
	}

	/**
	 * Box 6, If this box is checked, the recipient is not the designated
	 * beneficiary
	 * 
	 * @return recipientIsNotBeneficiary
	 */
	@ApiModelProperty(value = "Box 6, If this box is checked, the recipient is not the designated beneficiary")

	public Boolean getRecipientIsNotBeneficiary() {
		return recipientIsNotBeneficiary;
	}

	public void setRecipientIsNotBeneficiary(Boolean recipientIsNotBeneficiary) {
		this.recipientIsNotBeneficiary = recipientIsNotBeneficiary;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Tax1099QAllOf tax1099QAllOf = (Tax1099QAllOf) o;
		return Objects.equals(this.payerNameAddress, tax1099QAllOf.payerNameAddress)
				&& Objects.equals(this.payerTin, tax1099QAllOf.payerTin)
				&& Objects.equals(this.recipientTin, tax1099QAllOf.recipientTin)
				&& Objects.equals(this.recipientNameAddress, tax1099QAllOf.recipientNameAddress)
				&& Objects.equals(this.accountNumber, tax1099QAllOf.accountNumber)
				&& Objects.equals(this.grossDistribution, tax1099QAllOf.grossDistribution)
				&& Objects.equals(this.earnings, tax1099QAllOf.earnings)
				&& Objects.equals(this.basis, tax1099QAllOf.basis)
				&& Objects.equals(this.trusteeToTrustee, tax1099QAllOf.trusteeToTrustee)
				&& Objects.equals(this.tuitionPlanPrivate, tax1099QAllOf.tuitionPlanPrivate)
				&& Objects.equals(this.tuitionPlanPublic, tax1099QAllOf.tuitionPlanPublic)
				&& Objects.equals(this.coverdellEsa, tax1099QAllOf.coverdellEsa)
				&& Objects.equals(this.recipientIsNotBeneficiary, tax1099QAllOf.recipientIsNotBeneficiary);
	}

	@Override
	public int hashCode() {
		return Objects.hash(payerNameAddress, payerTin, recipientTin, recipientNameAddress, accountNumber,
				grossDistribution, earnings, basis, trusteeToTrustee, tuitionPlanPrivate, tuitionPlanPublic,
				coverdellEsa, recipientIsNotBeneficiary);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Tax1099QAllOf {\n");

		sb.append("    payerNameAddress: ").append(toIndentedString(payerNameAddress)).append("\n");
		sb.append("    payerTin: ").append(toIndentedString(payerTin)).append("\n");
		sb.append("    recipientTin: ").append(toIndentedString(recipientTin)).append("\n");
		sb.append("    recipientNameAddress: ").append(toIndentedString(recipientNameAddress)).append("\n");
		sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
		sb.append("    grossDistribution: ").append(toIndentedString(grossDistribution)).append("\n");
		sb.append("    earnings: ").append(toIndentedString(earnings)).append("\n");
		sb.append("    basis: ").append(toIndentedString(basis)).append("\n");
		sb.append("    trusteeToTrustee: ").append(toIndentedString(trusteeToTrustee)).append("\n");
		sb.append("    tuitionPlanPrivate: ").append(toIndentedString(tuitionPlanPrivate)).append("\n");
		sb.append("    tuitionPlanPublic: ").append(toIndentedString(tuitionPlanPublic)).append("\n");
		sb.append("    coverdellEsa: ").append(toIndentedString(coverdellEsa)).append("\n");
		sb.append("    recipientIsNotBeneficiary: ").append(toIndentedString(recipientIsNotBeneficiary)).append("\n");
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
