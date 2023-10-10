package com.fdx.api.model46.modelimpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.fasterxml.jackson.annotation.OptBoolean;
import io.swagger.annotations.ApiModelProperty;

/**
 * Tax1098QAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1098QAllOf {
	@JsonProperty("issuerNameAddress")
	private NameAddressPhone issuerNameAddress;

	@JsonProperty("issuerTin")
	private String issuerTin;

	@JsonProperty("participantTin")
	private String participantTin;

	@JsonProperty("participantNameAddress")
	private NameAddress participantNameAddress;

	@JsonProperty("accountNumber")
	private String accountNumber;

	@JsonProperty("planNumber")
	private String planNumber;

	@JsonProperty("planName")
	private String planName;

	@JsonProperty("planSponsorId")
	private String planSponsorId;

	@JsonProperty("annuityAmount")
	private Double annuityAmount;

	@JsonProperty("startDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private LocalDate startDate;

	@JsonProperty("canBeAccelerated")
	@JsonInclude(Include.NON_NULL)
	private Boolean canBeAccelerated;

	@JsonProperty("totalPremiums")
	private Double totalPremiums;

	@JsonProperty("fairMarketValue")
	private Double fairMarketValue;

	@JsonProperty("premiums")
	@Valid
	private List<DateAmount> premiums = null;

	public Tax1098QAllOf issuerNameAddress(NameAddressPhone issuerNameAddress) {
		this.issuerNameAddress = issuerNameAddress;
		return this;
	}

	/**
	 * Get issuerNameAddress
	 * 
	 * @return issuerNameAddress
	 */
	@ApiModelProperty(value = "")

	@Valid

	public NameAddressPhone getIssuerNameAddress() {
		return issuerNameAddress;
	}

	public void setIssuerNameAddress(NameAddressPhone issuerNameAddress) {
		this.issuerNameAddress = issuerNameAddress;
	}

	public Tax1098QAllOf issuerTin(String issuerTin) {
		this.issuerTin = issuerTin;
		return this;
	}

	/**
	 * ISSUER's TIN
	 * 
	 * @return issuerTin
	 */
	@ApiModelProperty(value = "ISSUER's TIN")

	public String getIssuerTin() {
		return issuerTin;
	}

	public void setIssuerTin(String issuerTin) {
		this.issuerTin = issuerTin;
	}

	public Tax1098QAllOf participantTin(String participantTin) {
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

	public Tax1098QAllOf participantNameAddress(NameAddress participantNameAddress) {
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

	public Tax1098QAllOf accountNumber(String accountNumber) {
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

	public Tax1098QAllOf planNumber(String planNumber) {
		this.planNumber = planNumber;
		return this;
	}

	/**
	 * Plan number
	 * 
	 * @return planNumber
	 */
	@ApiModelProperty(value = "Plan number")

	public String getPlanNumber() {
		return planNumber;
	}

	public void setPlanNumber(String planNumber) {
		this.planNumber = planNumber;
	}

	public Tax1098QAllOf planName(String planName) {
		this.planName = planName;
		return this;
	}

	/**
	 * Plan name
	 * 
	 * @return planName
	 */
	@ApiModelProperty(value = "Plan name")

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public Tax1098QAllOf planSponsorId(String planSponsorId) {
		this.planSponsorId = planSponsorId;
		return this;
	}

	/**
	 * Plan sponsor's EIN
	 * 
	 * @return planSponsorId
	 */
	@ApiModelProperty(value = "Plan sponsor's EIN")

	public String getPlanSponsorId() {
		return planSponsorId;
	}

	public void setPlanSponsorId(String planSponsorId) {
		this.planSponsorId = planSponsorId;
	}

	public Tax1098QAllOf annuityAmount(Double annuityAmount) {
		this.annuityAmount = annuityAmount;
		return this;
	}

	/**
	 * Box 1a, Annuity amount on start date
	 * 
	 * @return annuityAmount
	 */
	@ApiModelProperty(value = "Box 1a, Annuity amount on start date")

	public Double getAnnuityAmount() {
		return annuityAmount;
	}

	public void setAnnuityAmount(Double annuityAmount) {
		this.annuityAmount = annuityAmount;
	}

	public Tax1098QAllOf startDate(LocalDate startDate) {
		this.startDate = startDate;
		return this;
	}

	/**
	 * ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included
	 * according to [IETF RFC3339]
	 * (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)
	 * 
	 * @return startDate
	 */
	@ApiModelProperty(value = "ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included according to [IETF RFC3339] (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)")

	@Valid
	@Size(max = 10)
	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public Tax1098QAllOf canBeAccelerated(Boolean canBeAccelerated) {
		this.canBeAccelerated = canBeAccelerated;
		return this;
	}

	/**
	 * Box 2, Start date may be accelerated
	 * 
	 * @return canBeAccelerated
	 */
	@ApiModelProperty(value = "Box 2, Start date may be accelerated")

	public Boolean getCanBeAccelerated() {
		return canBeAccelerated;
	}

	public void setCanBeAccelerated(Boolean canBeAccelerated) {
		this.canBeAccelerated = canBeAccelerated;
	}

	public Tax1098QAllOf totalPremiums(Double totalPremiums) {
		this.totalPremiums = totalPremiums;
		return this;
	}

	/**
	 * Box 3, Total premiums
	 * 
	 * @return totalPremiums
	 */
	@ApiModelProperty(value = "Box 3, Total premiums")

	public Double getTotalPremiums() {
		return totalPremiums;
	}

	public void setTotalPremiums(Double totalPremiums) {
		this.totalPremiums = totalPremiums;
	}

	public Tax1098QAllOf fairMarketValue(Double fairMarketValue) {
		this.fairMarketValue = fairMarketValue;
		return this;
	}

	/**
	 * Box 4, Fair market value of qualifying longevity annuity contract (FMV of
	 * QLAC)
	 * 
	 * @return fairMarketValue
	 */
	@ApiModelProperty(value = "Box 4, Fair market value of qualifying longevity annuity contract (FMV of QLAC)")

	public Double getFairMarketValue() {
		return fairMarketValue;
	}

	public void setFairMarketValue(Double fairMarketValue) {
		this.fairMarketValue = fairMarketValue;
	}

	public Tax1098QAllOf premiums(List<DateAmount> premiums) {
		this.premiums = premiums;
		return this;
	}

	public Tax1098QAllOf addPremiumsItem(DateAmount premiumsItem) {
		if (this.premiums == null) {
			this.premiums = new ArrayList<>();
		}
		this.premiums.add(premiumsItem);
		return this;
	}

	/**
	 * Box 5, Total monthly premiums paid for the contract and date of the last
	 * payment in the month
	 * 
	 * @return premiums
	 */
	@ApiModelProperty(value = "Box 5, Total monthly premiums paid for the contract and date of the last payment in the month")

	@Valid

	public List<DateAmount> getPremiums() {
		return premiums;
	}

	public void setPremiums(List<DateAmount> premiums) {
		this.premiums = premiums;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Tax1098QAllOf tax1098QAllOf = (Tax1098QAllOf) o;
		return Objects.equals(this.issuerNameAddress, tax1098QAllOf.issuerNameAddress)
				&& Objects.equals(this.issuerTin, tax1098QAllOf.issuerTin)
				&& Objects.equals(this.participantTin, tax1098QAllOf.participantTin)
				&& Objects.equals(this.participantNameAddress, tax1098QAllOf.participantNameAddress)
				&& Objects.equals(this.accountNumber, tax1098QAllOf.accountNumber)
				&& Objects.equals(this.planNumber, tax1098QAllOf.planNumber)
				&& Objects.equals(this.planName, tax1098QAllOf.planName)
				&& Objects.equals(this.planSponsorId, tax1098QAllOf.planSponsorId)
				&& Objects.equals(this.annuityAmount, tax1098QAllOf.annuityAmount)
				&& Objects.equals(this.startDate, tax1098QAllOf.startDate)
				&& Objects.equals(this.canBeAccelerated, tax1098QAllOf.canBeAccelerated)
				&& Objects.equals(this.totalPremiums, tax1098QAllOf.totalPremiums)
				&& Objects.equals(this.fairMarketValue, tax1098QAllOf.fairMarketValue)
				&& Objects.equals(this.premiums, tax1098QAllOf.premiums);
	}

	@Override
	public int hashCode() {
		return Objects.hash(issuerNameAddress, issuerTin, participantTin, participantNameAddress, accountNumber,
				planNumber, planName, planSponsorId, annuityAmount, startDate, canBeAccelerated, totalPremiums,
				fairMarketValue, premiums);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Tax1098QAllOf {\n");

		sb.append("    issuerNameAddress: ").append(toIndentedString(issuerNameAddress)).append("\n");
		sb.append("    issuerTin: ").append(toIndentedString(issuerTin)).append("\n");
		sb.append("    participantTin: ").append(toIndentedString(participantTin)).append("\n");
		sb.append("    participantNameAddress: ").append(toIndentedString(participantNameAddress)).append("\n");
		sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
		sb.append("    planNumber: ").append(toIndentedString(planNumber)).append("\n");
		sb.append("    planName: ").append(toIndentedString(planName)).append("\n");
		sb.append("    planSponsorId: ").append(toIndentedString(planSponsorId)).append("\n");
		sb.append("    annuityAmount: ").append(toIndentedString(annuityAmount)).append("\n");
		sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
		sb.append("    canBeAccelerated: ").append(toIndentedString(canBeAccelerated)).append("\n");
		sb.append("    totalPremiums: ").append(toIndentedString(totalPremiums)).append("\n");
		sb.append("    fairMarketValue: ").append(toIndentedString(fairMarketValue)).append("\n");
		sb.append("    premiums: ").append(toIndentedString(premiums)).append("\n");
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
