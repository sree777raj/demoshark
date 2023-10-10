package com.fdx.api.model46.modelimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Tax1099NecAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1099NecAllOf {
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

	@JsonProperty("foreignAccountTaxCompliance")
	@JsonInclude(Include.NON_NULL)
	private Boolean foreignAccountTaxCompliance;

	@JsonProperty("secondTinNotice")
	@JsonInclude(Include.NON_NULL)
	private Boolean secondTinNotice;

	@JsonProperty("nonEmployeeCompensation")
	private Double nonEmployeeCompensation;

	@JsonProperty("federalTaxWithheld")
	private Double federalTaxWithheld;

	@JsonProperty("stateTaxWithholding")
	@Valid
	private List<StateTaxWithholding> stateTaxWithholding = null;

	public Tax1099NecAllOf payerNameAddress(NameAddressPhone payerNameAddress) {
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

	public Tax1099NecAllOf payerTin(String payerTin) {
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

	public Tax1099NecAllOf recipientTin(String recipientTin) {
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

	public Tax1099NecAllOf recipientNameAddress(NameAddress recipientNameAddress) {
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

	public Tax1099NecAllOf accountNumber(String accountNumber) {
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

	public Tax1099NecAllOf foreignAccountTaxCompliance(Boolean foreignAccountTaxCompliance) {
		this.foreignAccountTaxCompliance = foreignAccountTaxCompliance;
		return this;
	}

	/**
	 * FATCA filing requirement
	 * 
	 * @return foreignAccountTaxCompliance
	 */
	@ApiModelProperty(value = "FATCA filing requirement")

	public Boolean getForeignAccountTaxCompliance() {
		return foreignAccountTaxCompliance;
	}

	public void setForeignAccountTaxCompliance(Boolean foreignAccountTaxCompliance) {
		this.foreignAccountTaxCompliance = foreignAccountTaxCompliance;
	}

	public Tax1099NecAllOf secondTinNotice(Boolean secondTinNotice) {
		this.secondTinNotice = secondTinNotice;
		return this;
	}

	/**
	 * Second TIN Notice
	 * 
	 * @return secondTinNotice
	 */
	@ApiModelProperty(value = "Second TIN Notice")

	public Boolean getSecondTinNotice() {
		return secondTinNotice;
	}

	public void setSecondTinNotice(Boolean secondTinNotice) {
		this.secondTinNotice = secondTinNotice;
	}

	public Tax1099NecAllOf nonEmployeeCompensation(Double nonEmployeeCompensation) {
		this.nonEmployeeCompensation = nonEmployeeCompensation;
		return this;
	}

	/**
	 * Box 1, Nonemployee compensation
	 * 
	 * @return nonEmployeeCompensation
	 */
	@ApiModelProperty(value = "Box 1, Nonemployee compensation")

	public Double getNonEmployeeCompensation() {
		return nonEmployeeCompensation;
	}

	public void setNonEmployeeCompensation(Double nonEmployeeCompensation) {
		this.nonEmployeeCompensation = nonEmployeeCompensation;
	}

	public Tax1099NecAllOf federalTaxWithheld(Double federalTaxWithheld) {
		this.federalTaxWithheld = federalTaxWithheld;
		return this;
	}

	/**
	 * Box 4, Federal income tax withheld
	 * 
	 * @return federalTaxWithheld
	 */
	@ApiModelProperty(value = "Box 4, Federal income tax withheld")

	public Double getFederalTaxWithheld() {
		return federalTaxWithheld;
	}

	public void setFederalTaxWithheld(Double federalTaxWithheld) {
		this.federalTaxWithheld = federalTaxWithheld;
	}

	public Tax1099NecAllOf stateTaxWithholding(List<StateTaxWithholding> stateTaxWithholding) {
		this.stateTaxWithholding = stateTaxWithholding;
		return this;
	}

	public Tax1099NecAllOf addStateTaxWithholdingItem(StateTaxWithholding stateTaxWithholdingItem) {
		if (this.stateTaxWithholding == null) {
			this.stateTaxWithholding = new ArrayList<>();
		}
		this.stateTaxWithholding.add(stateTaxWithholdingItem);
		return this;
	}

	/**
	 * Boxes 5-7, State tax withholding
	 * 
	 * @return stateTaxWithholding
	 */
	@ApiModelProperty(value = "Boxes 5-7, State tax withholding")

	@Valid

	public List<StateTaxWithholding> getStateTaxWithholding() {
		return stateTaxWithholding;
	}

	public void setStateTaxWithholding(List<StateTaxWithholding> stateTaxWithholding) {
		this.stateTaxWithholding = stateTaxWithholding;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Tax1099NecAllOf tax1099NecAllOf = (Tax1099NecAllOf) o;
		return Objects.equals(this.payerNameAddress, tax1099NecAllOf.payerNameAddress)
				&& Objects.equals(this.payerTin, tax1099NecAllOf.payerTin)
				&& Objects.equals(this.recipientTin, tax1099NecAllOf.recipientTin)
				&& Objects.equals(this.recipientNameAddress, tax1099NecAllOf.recipientNameAddress)
				&& Objects.equals(this.accountNumber, tax1099NecAllOf.accountNumber)
				&& Objects.equals(this.foreignAccountTaxCompliance, tax1099NecAllOf.foreignAccountTaxCompliance)
				&& Objects.equals(this.secondTinNotice, tax1099NecAllOf.secondTinNotice)
				&& Objects.equals(this.nonEmployeeCompensation, tax1099NecAllOf.nonEmployeeCompensation)
				&& Objects.equals(this.federalTaxWithheld, tax1099NecAllOf.federalTaxWithheld)
				&& Objects.equals(this.stateTaxWithholding, tax1099NecAllOf.stateTaxWithholding);
	}

	@Override
	public int hashCode() {
		return Objects.hash(payerNameAddress, payerTin, recipientTin, recipientNameAddress, accountNumber,
				foreignAccountTaxCompliance, secondTinNotice, nonEmployeeCompensation, federalTaxWithheld,
				stateTaxWithholding);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Tax1099NecAllOf {\n");

		sb.append("    payerNameAddress: ").append(toIndentedString(payerNameAddress)).append("\n");
		sb.append("    payerTin: ").append(toIndentedString(payerTin)).append("\n");
		sb.append("    recipientTin: ").append(toIndentedString(recipientTin)).append("\n");
		sb.append("    recipientNameAddress: ").append(toIndentedString(recipientNameAddress)).append("\n");
		sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
		sb.append("    foreignAccountTaxCompliance: ").append(toIndentedString(foreignAccountTaxCompliance))
				.append("\n");
		sb.append("    secondTinNotice: ").append(toIndentedString(secondTinNotice)).append("\n");
		sb.append("    nonEmployeeCompensation: ").append(toIndentedString(nonEmployeeCompensation)).append("\n");
		sb.append("    federalTaxWithheld: ").append(toIndentedString(federalTaxWithheld)).append("\n");
		sb.append("    stateTaxWithholding: ").append(toIndentedString(stateTaxWithholding)).append("\n");
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
