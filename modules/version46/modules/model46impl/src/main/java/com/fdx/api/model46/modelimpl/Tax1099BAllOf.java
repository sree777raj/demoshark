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
 * Tax1099BAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1099BAllOf {
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

	@JsonProperty("stateTaxWithholding")
	@Valid
	private List<StateTaxWithholding> stateTaxWithholding = null;

	@JsonProperty("federalTaxWithheld")
	private Double federalTaxWithheld;

	@JsonProperty("profitOnClosedContracts")
	private Double profitOnClosedContracts;

	@JsonProperty("unrealizedProfitOpenContractsBegin")
	private Double unrealizedProfitOpenContractsBegin;

	@JsonProperty("unrealizedProfitOpenContractsEnd")
	private Double unrealizedProfitOpenContractsEnd;

	@JsonProperty("aggregateProfitOnContracts")
	private Double aggregateProfitOnContracts;

	@JsonProperty("bartering")
	private Double bartering;

	@JsonProperty("securityDetails")
	@Valid
	private List<SecurityDetail> securityDetails = null;

	@JsonProperty("secondTinNotice")
	@JsonInclude(Include.NON_NULL)
	private Boolean secondTinNotice;

	public Tax1099BAllOf payerNameAddress(NameAddressPhone payerNameAddress) {
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

	public Tax1099BAllOf payerTin(String payerTin) {
		this.payerTin = payerTin;
		return this;
	}

	/**
	 * Payer's federal identification number
	 * 
	 * @return payerTin
	 */
	@ApiModelProperty(value = "Payer's federal identification number")

	public String getPayerTin() {
		return payerTin;
	}

	public void setPayerTin(String payerTin) {
		this.payerTin = payerTin;
	}

	public Tax1099BAllOf recipientTin(String recipientTin) {
		this.recipientTin = recipientTin;
		return this;
	}

	/**
	 * Recipient's identification number
	 * 
	 * @return recipientTin
	 */
	@ApiModelProperty(value = "Recipient's identification number")

	public String getRecipientTin() {
		return recipientTin;
	}

	public void setRecipientTin(String recipientTin) {
		this.recipientTin = recipientTin;
	}

	public Tax1099BAllOf recipientNameAddress(NameAddress recipientNameAddress) {
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

	public Tax1099BAllOf accountNumber(String accountNumber) {
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

	public Tax1099BAllOf stateTaxWithholding(List<StateTaxWithholding> stateTaxWithholding) {
		this.stateTaxWithholding = stateTaxWithholding;
		return this;
	}

	public Tax1099BAllOf addStateTaxWithholdingItem(StateTaxWithholding stateTaxWithholdingItem) {
		if (this.stateTaxWithholding == null) {
			this.stateTaxWithholding = new ArrayList<>();
		}
		this.stateTaxWithholding.add(stateTaxWithholdingItem);
		return this;
	}

	/**
	 * Boxes 14-16, State tax withholding
	 * 
	 * @return stateTaxWithholding
	 */
	@ApiModelProperty(value = "Boxes 14-16, State tax withholding")

	@Valid

	public List<StateTaxWithholding> getStateTaxWithholding() {
		return stateTaxWithholding;
	}

	public void setStateTaxWithholding(List<StateTaxWithholding> stateTaxWithholding) {
		this.stateTaxWithholding = stateTaxWithholding;
	}

	public Tax1099BAllOf federalTaxWithheld(Double federalTaxWithheld) {
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

	public Tax1099BAllOf profitOnClosedContracts(Double profitOnClosedContracts) {
		this.profitOnClosedContracts = profitOnClosedContracts;
		return this;
	}

	/**
	 * Box 8, Profit or (loss) realized in current year on closed contracts
	 * 
	 * @return profitOnClosedContracts
	 */
	@ApiModelProperty(value = "Box 8, Profit or (loss) realized in current year on closed contracts")

	public Double getProfitOnClosedContracts() {
		return profitOnClosedContracts;
	}

	public void setProfitOnClosedContracts(Double profitOnClosedContracts) {
		this.profitOnClosedContracts = profitOnClosedContracts;
	}

	public Tax1099BAllOf unrealizedProfitOpenContractsBegin(Double unrealizedProfitOpenContractsBegin) {
		this.unrealizedProfitOpenContractsBegin = unrealizedProfitOpenContractsBegin;
		return this;
	}

	/**
	 * Box 9, Unrealized profit or loss on open contracts at end of last year
	 * 
	 * @return unrealizedProfitOpenContractsBegin
	 */
	@ApiModelProperty(value = "Box 9, Unrealized profit or loss on open contracts at end of last year")

	public Double getUnrealizedProfitOpenContractsBegin() {
		return unrealizedProfitOpenContractsBegin;
	}

	public void setUnrealizedProfitOpenContractsBegin(Double unrealizedProfitOpenContractsBegin) {
		this.unrealizedProfitOpenContractsBegin = unrealizedProfitOpenContractsBegin;
	}

	public Tax1099BAllOf unrealizedProfitOpenContractsEnd(Double unrealizedProfitOpenContractsEnd) {
		this.unrealizedProfitOpenContractsEnd = unrealizedProfitOpenContractsEnd;
		return this;
	}

	/**
	 * Box 10, Unrealized profit or loss on open contracts at end of current year
	 * 
	 * @return unrealizedProfitOpenContractsEnd
	 */
	@ApiModelProperty(value = "Box 10, Unrealized profit or loss on open contracts at end of current year")

	public Double getUnrealizedProfitOpenContractsEnd() {
		return unrealizedProfitOpenContractsEnd;
	}

	public void setUnrealizedProfitOpenContractsEnd(Double unrealizedProfitOpenContractsEnd) {
		this.unrealizedProfitOpenContractsEnd = unrealizedProfitOpenContractsEnd;
	}

	public Tax1099BAllOf aggregateProfitOnContracts(Double aggregateProfitOnContracts) {
		this.aggregateProfitOnContracts = aggregateProfitOnContracts;
		return this;
	}

	/**
	 * Box 11, Aggregate profit or (loss) on contracts
	 * 
	 * @return aggregateProfitOnContracts
	 */
	@ApiModelProperty(value = "Box 11, Aggregate profit or (loss) on contracts")

	public Double getAggregateProfitOnContracts() {
		return aggregateProfitOnContracts;
	}

	public void setAggregateProfitOnContracts(Double aggregateProfitOnContracts) {
		this.aggregateProfitOnContracts = aggregateProfitOnContracts;
	}

	public Tax1099BAllOf bartering(Double bartering) {
		this.bartering = bartering;
		return this;
	}

	/**
	 * Box 13, Bartering
	 * 
	 * @return bartering
	 */
	@ApiModelProperty(value = "Box 13, Bartering")

	public Double getBartering() {
		return bartering;
	}

	public void setBartering(Double bartering) {
		this.bartering = bartering;
	}

	public Tax1099BAllOf securityDetails(List<SecurityDetail> securityDetails) {
		this.securityDetails = securityDetails;
		return this;
	}

	public Tax1099BAllOf addSecurityDetailsItem(SecurityDetail securityDetailsItem) {
		if (this.securityDetails == null) {
			this.securityDetails = new ArrayList<>();
		}
		this.securityDetails.add(securityDetailsItem);
		return this;
	}

	/**
	 * Boxes 1-3, 5-7, 12, Security details
	 * 
	 * @return securityDetails
	 */
	@ApiModelProperty(value = "Boxes 1-3, 5-7, 12, Security details")

	@Valid

	public List<SecurityDetail> getSecurityDetails() {
		return securityDetails;
	}

	public void setSecurityDetails(List<SecurityDetail> securityDetails) {
		this.securityDetails = securityDetails;
	}

	public Tax1099BAllOf secondTinNotice(Boolean secondTinNotice) {
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

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Tax1099BAllOf tax1099BAllOf = (Tax1099BAllOf) o;
		return Objects.equals(this.payerNameAddress, tax1099BAllOf.payerNameAddress)
				&& Objects.equals(this.payerTin, tax1099BAllOf.payerTin)
				&& Objects.equals(this.recipientTin, tax1099BAllOf.recipientTin)
				&& Objects.equals(this.recipientNameAddress, tax1099BAllOf.recipientNameAddress)
				&& Objects.equals(this.accountNumber, tax1099BAllOf.accountNumber)
				&& Objects.equals(this.stateTaxWithholding, tax1099BAllOf.stateTaxWithholding)
				&& Objects.equals(this.federalTaxWithheld, tax1099BAllOf.federalTaxWithheld)
				&& Objects.equals(this.profitOnClosedContracts, tax1099BAllOf.profitOnClosedContracts)
				&& Objects.equals(this.unrealizedProfitOpenContractsBegin,
						tax1099BAllOf.unrealizedProfitOpenContractsBegin)
				&& Objects.equals(this.unrealizedProfitOpenContractsEnd, tax1099BAllOf.unrealizedProfitOpenContractsEnd)
				&& Objects.equals(this.aggregateProfitOnContracts, tax1099BAllOf.aggregateProfitOnContracts)
				&& Objects.equals(this.bartering, tax1099BAllOf.bartering)
				&& Objects.equals(this.securityDetails, tax1099BAllOf.securityDetails)
				&& Objects.equals(this.secondTinNotice, tax1099BAllOf.secondTinNotice);
	}

	@Override
	public int hashCode() {
		return Objects.hash(payerNameAddress, payerTin, recipientTin, recipientNameAddress, accountNumber,
				stateTaxWithholding, federalTaxWithheld, profitOnClosedContracts, unrealizedProfitOpenContractsBegin,
				unrealizedProfitOpenContractsEnd, aggregateProfitOnContracts, bartering, securityDetails,
				secondTinNotice);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Tax1099BAllOf {\n");

		sb.append("    payerNameAddress: ").append(toIndentedString(payerNameAddress)).append("\n");
		sb.append("    payerTin: ").append(toIndentedString(payerTin)).append("\n");
		sb.append("    recipientTin: ").append(toIndentedString(recipientTin)).append("\n");
		sb.append("    recipientNameAddress: ").append(toIndentedString(recipientNameAddress)).append("\n");
		sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
		sb.append("    stateTaxWithholding: ").append(toIndentedString(stateTaxWithholding)).append("\n");
		sb.append("    federalTaxWithheld: ").append(toIndentedString(federalTaxWithheld)).append("\n");
		sb.append("    profitOnClosedContracts: ").append(toIndentedString(profitOnClosedContracts)).append("\n");
		sb.append("    unrealizedProfitOpenContractsBegin: ")
				.append(toIndentedString(unrealizedProfitOpenContractsBegin)).append("\n");
		sb.append("    unrealizedProfitOpenContractsEnd: ").append(toIndentedString(unrealizedProfitOpenContractsEnd))
				.append("\n");
		sb.append("    aggregateProfitOnContracts: ").append(toIndentedString(aggregateProfitOnContracts)).append("\n");
		sb.append("    bartering: ").append(toIndentedString(bartering)).append("\n");
		sb.append("    securityDetails: ").append(toIndentedString(securityDetails)).append("\n");
		sb.append("    secondTinNotice: ").append(toIndentedString(secondTinNotice)).append("\n");
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
