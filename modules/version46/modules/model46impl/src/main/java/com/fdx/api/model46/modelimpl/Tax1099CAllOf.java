package com.fdx.api.model46.modelimpl;

import java.time.LocalDate;
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
 * Tax1099CAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1099CAllOf {
	@JsonProperty("creditorNameAddress")
	private NameAddressPhone creditorNameAddress;

	@JsonProperty("creditorTin")
	private String creditorTin;

	@JsonProperty("debtorTin")
	private String debtorTin;

	@JsonProperty("debtorNameAddress")
	private NameAddress debtorNameAddress;

	@JsonProperty("accountNumber")
	private String accountNumber;

	@JsonProperty("dateOfEvent")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private LocalDate dateOfEvent;

	@JsonProperty("amountDischarged")
	private Double amountDischarged;

	@JsonProperty("interestIncluded")
	private Double interestIncluded;

	@JsonProperty("debtDescription")
	private String debtDescription;

	@JsonProperty("personallyLiable")
	@JsonInclude(Include.NON_NULL)
	private Boolean personallyLiable;

	@JsonProperty("debtCode")
	private String debtCode;

	@JsonProperty("fairMarketValue")
	private Double fairMarketValue;

	public Tax1099CAllOf creditorNameAddress(NameAddressPhone creditorNameAddress) {
		this.creditorNameAddress = creditorNameAddress;
		return this;
	}

	/**
	 * Get creditorNameAddress
	 * 
	 * @return creditorNameAddress
	 */
	@ApiModelProperty(value = "")

	@Valid

	public NameAddressPhone getCreditorNameAddress() {
		return creditorNameAddress;
	}

	public void setCreditorNameAddress(NameAddressPhone creditorNameAddress) {
		this.creditorNameAddress = creditorNameAddress;
	}

	public Tax1099CAllOf creditorTin(String creditorTin) {
		this.creditorTin = creditorTin;
		return this;
	}

	/**
	 * CREDITOR'S TIN
	 * 
	 * @return creditorTin
	 */
	@ApiModelProperty(value = "CREDITOR'S TIN")

	public String getCreditorTin() {
		return creditorTin;
	}

	public void setCreditorTin(String creditorTin) {
		this.creditorTin = creditorTin;
	}

	public Tax1099CAllOf debtorTin(String debtorTin) {
		this.debtorTin = debtorTin;
		return this;
	}

	/**
	 * DEBTOR'S TIN
	 * 
	 * @return debtorTin
	 */
	@ApiModelProperty(value = "DEBTOR'S TIN")

	public String getDebtorTin() {
		return debtorTin;
	}

	public void setDebtorTin(String debtorTin) {
		this.debtorTin = debtorTin;
	}

	public Tax1099CAllOf debtorNameAddress(NameAddress debtorNameAddress) {
		this.debtorNameAddress = debtorNameAddress;
		return this;
	}

	/**
	 * Get debtorNameAddress
	 * 
	 * @return debtorNameAddress
	 */
	@ApiModelProperty(value = "")

	@Valid

	public NameAddress getDebtorNameAddress() {
		return debtorNameAddress;
	}

	public void setDebtorNameAddress(NameAddress debtorNameAddress) {
		this.debtorNameAddress = debtorNameAddress;
	}

	public Tax1099CAllOf accountNumber(String accountNumber) {
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

	public Tax1099CAllOf dateOfEvent(LocalDate dateOfEvent) {
		this.dateOfEvent = dateOfEvent;
		return this;
	}

	/**
	 * ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included
	 * according to [IETF RFC3339]
	 * (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)
	 * 
	 * @return dateOfEvent
	 */
	@ApiModelProperty(value = "ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included according to [IETF RFC3339] (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)")

	@Valid
	@Size(max = 10)
	public LocalDate getDateOfEvent() {
		return dateOfEvent;
	}

	public void setDateOfEvent(LocalDate dateOfEvent) {
		this.dateOfEvent = dateOfEvent;
	}

	public Tax1099CAllOf amountDischarged(Double amountDischarged) {
		this.amountDischarged = amountDischarged;
		return this;
	}

	/**
	 * Box 2, Amount of debt discharged
	 * 
	 * @return amountDischarged
	 */
	@ApiModelProperty(value = "Box 2, Amount of debt discharged")

	public Double getAmountDischarged() {
		return amountDischarged;
	}

	public void setAmountDischarged(Double amountDischarged) {
		this.amountDischarged = amountDischarged;
	}

	public Tax1099CAllOf interestIncluded(Double interestIncluded) {
		this.interestIncluded = interestIncluded;
		return this;
	}

	/**
	 * Box 3, Interest if included in box 2
	 * 
	 * @return interestIncluded
	 */
	@ApiModelProperty(value = "Box 3, Interest if included in box 2")

	public Double getInterestIncluded() {
		return interestIncluded;
	}

	public void setInterestIncluded(Double interestIncluded) {
		this.interestIncluded = interestIncluded;
	}

	public Tax1099CAllOf debtDescription(String debtDescription) {
		this.debtDescription = debtDescription;
		return this;
	}

	/**
	 * Box 4, Debt description
	 * 
	 * @return debtDescription
	 */
	@ApiModelProperty(value = "Box 4, Debt description")

	public String getDebtDescription() {
		return debtDescription;
	}

	public void setDebtDescription(String debtDescription) {
		this.debtDescription = debtDescription;
	}

	public Tax1099CAllOf personallyLiable(Boolean personallyLiable) {
		this.personallyLiable = personallyLiable;
		return this;
	}

	/**
	 * Box 5, If checked, the debtor was personally liable for repayment of the debt
	 * 
	 * @return personallyLiable
	 */
	@ApiModelProperty(value = "Box 5, If checked, the debtor was personally liable for repayment of the debt")

	public Boolean getPersonallyLiable() {
		return personallyLiable;
	}

	public void setPersonallyLiable(Boolean personallyLiable) {
		this.personallyLiable = personallyLiable;
	}

	public Tax1099CAllOf debtCode(String debtCode) {
		this.debtCode = debtCode;
		return this;
	}

	/**
	 * Box 6, Identifiable debt code
	 * 
	 * @return debtCode
	 */
	@ApiModelProperty(value = "Box 6, Identifiable debt code")

	public String getDebtCode() {
		return debtCode;
	}

	public void setDebtCode(String debtCode) {
		this.debtCode = debtCode;
	}

	public Tax1099CAllOf fairMarketValue(Double fairMarketValue) {
		this.fairMarketValue = fairMarketValue;
		return this;
	}

	/**
	 * Box 7, Fair market value of property
	 * 
	 * @return fairMarketValue
	 */
	@ApiModelProperty(value = "Box 7, Fair market value of property")

	public Double getFairMarketValue() {
		return fairMarketValue;
	}

	public void setFairMarketValue(Double fairMarketValue) {
		this.fairMarketValue = fairMarketValue;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Tax1099CAllOf tax1099CAllOf = (Tax1099CAllOf) o;
		return Objects.equals(this.creditorNameAddress, tax1099CAllOf.creditorNameAddress)
				&& Objects.equals(this.creditorTin, tax1099CAllOf.creditorTin)
				&& Objects.equals(this.debtorTin, tax1099CAllOf.debtorTin)
				&& Objects.equals(this.debtorNameAddress, tax1099CAllOf.debtorNameAddress)
				&& Objects.equals(this.accountNumber, tax1099CAllOf.accountNumber)
				&& Objects.equals(this.dateOfEvent, tax1099CAllOf.dateOfEvent)
				&& Objects.equals(this.amountDischarged, tax1099CAllOf.amountDischarged)
				&& Objects.equals(this.interestIncluded, tax1099CAllOf.interestIncluded)
				&& Objects.equals(this.debtDescription, tax1099CAllOf.debtDescription)
				&& Objects.equals(this.personallyLiable, tax1099CAllOf.personallyLiable)
				&& Objects.equals(this.debtCode, tax1099CAllOf.debtCode)
				&& Objects.equals(this.fairMarketValue, tax1099CAllOf.fairMarketValue);
	}

	@Override
	public int hashCode() {
		return Objects.hash(creditorNameAddress, creditorTin, debtorTin, debtorNameAddress, accountNumber, dateOfEvent,
				amountDischarged, interestIncluded, debtDescription, personallyLiable, debtCode, fairMarketValue);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Tax1099CAllOf {\n");

		sb.append("    creditorNameAddress: ").append(toIndentedString(creditorNameAddress)).append("\n");
		sb.append("    creditorTin: ").append(toIndentedString(creditorTin)).append("\n");
		sb.append("    debtorTin: ").append(toIndentedString(debtorTin)).append("\n");
		sb.append("    debtorNameAddress: ").append(toIndentedString(debtorNameAddress)).append("\n");
		sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
		sb.append("    dateOfEvent: ").append(toIndentedString(dateOfEvent)).append("\n");
		sb.append("    amountDischarged: ").append(toIndentedString(amountDischarged)).append("\n");
		sb.append("    interestIncluded: ").append(toIndentedString(interestIncluded)).append("\n");
		sb.append("    debtDescription: ").append(toIndentedString(debtDescription)).append("\n");
		sb.append("    personallyLiable: ").append(toIndentedString(personallyLiable)).append("\n");
		sb.append("    debtCode: ").append(toIndentedString(debtCode)).append("\n");
		sb.append("    fairMarketValue: ").append(toIndentedString(fairMarketValue)).append("\n");
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
