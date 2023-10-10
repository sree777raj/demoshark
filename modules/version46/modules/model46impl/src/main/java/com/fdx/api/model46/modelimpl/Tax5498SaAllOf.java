package com.fdx.api.model46.modelimpl;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Tax5498SaAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax5498SaAllOf {
	@JsonProperty("trusteeNameAddress")
	private NameAddressPhone trusteeNameAddress;

	@JsonProperty("trusteeTin")
	private String trusteeTin;

	@JsonProperty("participantTin")
	private String participantTin;

	@JsonProperty("participantNameAddress")
	private NameAddress participantNameAddress;

	@JsonProperty("accountNumber")
	private String accountNumber;

	@JsonProperty("msaContributions")
	private Double msaContributions;

	@JsonProperty("totalContributions")
	private Double totalContributions;

	@JsonProperty("totalPostYearEnd")
	private Double totalPostYearEnd;

	@JsonProperty("rolloverContributions")
	private Double rolloverContributions;

	@JsonProperty("fairMarketValue")
	private Double fairMarketValue;

	@JsonProperty("hsa")
	@JsonInclude(Include.NON_NULL)
	private Boolean hsa;

	@JsonProperty("archer")
	@JsonInclude(Include.NON_NULL)
	private Boolean archer;

	@JsonProperty("maMsa")
	@JsonInclude(Include.NON_NULL)
	private Boolean maMsa;

	public Tax5498SaAllOf trusteeNameAddress(NameAddressPhone trusteeNameAddress) {
		this.trusteeNameAddress = trusteeNameAddress;
		return this;
	}

	/**
	 * Get trusteeNameAddress
	 * 
	 * @return trusteeNameAddress
	 */
	@ApiModelProperty(value = "")

	@Valid

	public NameAddressPhone getTrusteeNameAddress() {
		return trusteeNameAddress;
	}

	public void setTrusteeNameAddress(NameAddressPhone trusteeNameAddress) {
		this.trusteeNameAddress = trusteeNameAddress;
	}

	public Tax5498SaAllOf trusteeTin(String trusteeTin) {
		this.trusteeTin = trusteeTin;
		return this;
	}

	/**
	 * TRUSTEE'S TIN
	 * 
	 * @return trusteeTin
	 */
	@ApiModelProperty(value = "TRUSTEE'S TIN")

	public String getTrusteeTin() {
		return trusteeTin;
	}

	public void setTrusteeTin(String trusteeTin) {
		this.trusteeTin = trusteeTin;
	}

	public Tax5498SaAllOf participantTin(String participantTin) {
		this.participantTin = participantTin;
		return this;
	}

	/**
	 * PARTICIPANT'S TIN
	 * 
	 * @return participantTin
	 */
	@ApiModelProperty(value = "PARTICIPANT'S TIN")

	public String getParticipantTin() {
		return participantTin;
	}

	public void setParticipantTin(String participantTin) {
		this.participantTin = participantTin;
	}

	public Tax5498SaAllOf participantNameAddress(NameAddress participantNameAddress) {
		this.participantNameAddress = participantNameAddress;
		return this;
	}

	/**
	 * Get participantNameAddress
	 * 
	 * @return participantNameAddress
	 */
	@ApiModelProperty(value = "")

	@Valid

	public NameAddress getParticipantNameAddress() {
		return participantNameAddress;
	}

	public void setParticipantNameAddress(NameAddress participantNameAddress) {
		this.participantNameAddress = participantNameAddress;
	}

	public Tax5498SaAllOf accountNumber(String accountNumber) {
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

	public Tax5498SaAllOf msaContributions(Double msaContributions) {
		this.msaContributions = msaContributions;
		return this;
	}

	/**
	 * Box 1, Employee or self-employed person's Archer MSA contributions made in
	 * current and following years for current year
	 * 
	 * @return msaContributions
	 */
	@ApiModelProperty(value = "Box 1, Employee or self-employed person's Archer MSA contributions made in current and following years for current year")

	public Double getMsaContributions() {
		return msaContributions;
	}

	public void setMsaContributions(Double msaContributions) {
		this.msaContributions = msaContributions;
	}

	public Tax5498SaAllOf totalContributions(Double totalContributions) {
		this.totalContributions = totalContributions;
		return this;
	}

	/**
	 * Box 2, Total contributions made in current year
	 * 
	 * @return totalContributions
	 */
	@ApiModelProperty(value = "Box 2, Total contributions made in current year")

	public Double getTotalContributions() {
		return totalContributions;
	}

	public void setTotalContributions(Double totalContributions) {
		this.totalContributions = totalContributions;
	}

	public Tax5498SaAllOf totalPostYearEnd(Double totalPostYearEnd) {
		this.totalPostYearEnd = totalPostYearEnd;
		return this;
	}

	/**
	 * Box 3, Total HSA or Archer MSA contributions made in following year for
	 * current year
	 * 
	 * @return totalPostYearEnd
	 */
	@ApiModelProperty(value = "Box 3, Total HSA or Archer MSA contributions made in following year for current year")

	public Double getTotalPostYearEnd() {
		return totalPostYearEnd;
	}

	public void setTotalPostYearEnd(Double totalPostYearEnd) {
		this.totalPostYearEnd = totalPostYearEnd;
	}

	public Tax5498SaAllOf rolloverContributions(Double rolloverContributions) {
		this.rolloverContributions = rolloverContributions;
		return this;
	}

	/**
	 * Box 4, Rollover contributions
	 * 
	 * @return rolloverContributions
	 */
	@ApiModelProperty(value = "Box 4, Rollover contributions")

	public Double getRolloverContributions() {
		return rolloverContributions;
	}

	public void setRolloverContributions(Double rolloverContributions) {
		this.rolloverContributions = rolloverContributions;
	}

	public Tax5498SaAllOf fairMarketValue(Double fairMarketValue) {
		this.fairMarketValue = fairMarketValue;
		return this;
	}

	/**
	 * Box 5, Fair market value of HSA, Archer MSA, or Medicare Advantage (MA) MSA
	 * 
	 * @return fairMarketValue
	 */
	@ApiModelProperty(value = "Box 5, Fair market value of HSA, Archer MSA, or Medicare Advantage (MA) MSA")

	public Double getFairMarketValue() {
		return fairMarketValue;
	}

	public void setFairMarketValue(Double fairMarketValue) {
		this.fairMarketValue = fairMarketValue;
	}

	public Tax5498SaAllOf hsa(Boolean hsa) {
		this.hsa = hsa;
		return this;
	}

	/**
	 * Box 6a, HSA
	 * 
	 * @return hsa
	 */
	@ApiModelProperty(value = "Box 6a, HSA")

	public Boolean getHsa() {
		return hsa;
	}

	public void setHsa(Boolean hsa) {
		this.hsa = hsa;
	}

	public Tax5498SaAllOf archer(Boolean archer) {
		this.archer = archer;
		return this;
	}

	/**
	 * Box 6b, Archer MSA
	 * 
	 * @return archer
	 */
	@ApiModelProperty(value = "Box 6b, Archer MSA")

	public Boolean getArcher() {
		return archer;
	}

	public void setArcher(Boolean archer) {
		this.archer = archer;
	}

	public Tax5498SaAllOf maMsa(Boolean maMsa) {
		this.maMsa = maMsa;
		return this;
	}

	/**
	 * Box 6c, Medicare Advantage (MA) MSA
	 * 
	 * @return maMsa
	 */
	@ApiModelProperty(value = "Box 6c, Medicare Advantage (MA) MSA")

	public Boolean getMaMsa() {
		return maMsa;
	}

	public void setMaMsa(Boolean maMsa) {
		this.maMsa = maMsa;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Tax5498SaAllOf tax5498SaAllOf = (Tax5498SaAllOf) o;
		return Objects.equals(this.trusteeNameAddress, tax5498SaAllOf.trusteeNameAddress)
				&& Objects.equals(this.trusteeTin, tax5498SaAllOf.trusteeTin)
				&& Objects.equals(this.participantTin, tax5498SaAllOf.participantTin)
				&& Objects.equals(this.participantNameAddress, tax5498SaAllOf.participantNameAddress)
				&& Objects.equals(this.accountNumber, tax5498SaAllOf.accountNumber)
				&& Objects.equals(this.msaContributions, tax5498SaAllOf.msaContributions)
				&& Objects.equals(this.totalContributions, tax5498SaAllOf.totalContributions)
				&& Objects.equals(this.totalPostYearEnd, tax5498SaAllOf.totalPostYearEnd)
				&& Objects.equals(this.rolloverContributions, tax5498SaAllOf.rolloverContributions)
				&& Objects.equals(this.fairMarketValue, tax5498SaAllOf.fairMarketValue)
				&& Objects.equals(this.hsa, tax5498SaAllOf.hsa) && Objects.equals(this.archer, tax5498SaAllOf.archer)
				&& Objects.equals(this.maMsa, tax5498SaAllOf.maMsa);
	}

	@Override
	public int hashCode() {
		return Objects.hash(trusteeNameAddress, trusteeTin, participantTin, participantNameAddress, accountNumber,
				msaContributions, totalContributions, totalPostYearEnd, rolloverContributions, fairMarketValue, hsa,
				archer, maMsa);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Tax5498SaAllOf {\n");

		sb.append("    trusteeNameAddress: ").append(toIndentedString(trusteeNameAddress)).append("\n");
		sb.append("    trusteeTin: ").append(toIndentedString(trusteeTin)).append("\n");
		sb.append("    participantTin: ").append(toIndentedString(participantTin)).append("\n");
		sb.append("    participantNameAddress: ").append(toIndentedString(participantNameAddress)).append("\n");
		sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
		sb.append("    msaContributions: ").append(toIndentedString(msaContributions)).append("\n");
		sb.append("    totalContributions: ").append(toIndentedString(totalContributions)).append("\n");
		sb.append("    totalPostYearEnd: ").append(toIndentedString(totalPostYearEnd)).append("\n");
		sb.append("    rolloverContributions: ").append(toIndentedString(rolloverContributions)).append("\n");
		sb.append("    fairMarketValue: ").append(toIndentedString(fairMarketValue)).append("\n");
		sb.append("    hsa: ").append(toIndentedString(hsa)).append("\n");
		sb.append("    archer: ").append(toIndentedString(archer)).append("\n");
		sb.append("    maMsa: ").append(toIndentedString(maMsa)).append("\n");
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
