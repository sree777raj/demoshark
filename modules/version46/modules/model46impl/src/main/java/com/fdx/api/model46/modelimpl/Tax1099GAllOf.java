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
 * Tax1099GAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1099GAllOf {
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

	@JsonProperty("unemploymentCompensation")
	private Double unemploymentCompensation;

	@JsonProperty("taxRefund")
	private Double taxRefund;

	@JsonProperty("refundYear")
	private Integer refundYear;

	@JsonProperty("federalTaxWithheld")
	private Double federalTaxWithheld;

	@JsonProperty("rtaaPayments")
	private Double rtaaPayments;

	@JsonProperty("grants")
	private Double grants;

	@JsonProperty("agriculturePayments")
	private Double agriculturePayments;

	@JsonProperty("businessIncome")
	@JsonInclude(Include.NON_NULL)
	private Boolean businessIncome;

	@JsonProperty("marketGain")
	private Double marketGain;

	@JsonProperty("stateTaxWithholding")
	@Valid
	private List<StateTaxWithholding> stateTaxWithholding = null;

	@JsonProperty("secondTinNotice")
	@JsonInclude(Include.NON_NULL)
	private Boolean secondTinNotice;

	public Tax1099GAllOf payerNameAddress(NameAddressPhone payerNameAddress) {
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

	public Tax1099GAllOf payerTin(String payerTin) {
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

	public Tax1099GAllOf recipientTin(String recipientTin) {
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

	public Tax1099GAllOf recipientNameAddress(NameAddress recipientNameAddress) {
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

	public Tax1099GAllOf accountNumber(String accountNumber) {
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

	public Tax1099GAllOf unemploymentCompensation(Double unemploymentCompensation) {
		this.unemploymentCompensation = unemploymentCompensation;
		return this;
	}

	/**
	 * Box 1, Unemployment compensation
	 * 
	 * @return unemploymentCompensation
	 */
	@ApiModelProperty(value = "Box 1, Unemployment compensation")

	public Double getUnemploymentCompensation() {
		return unemploymentCompensation;
	}

	public void setUnemploymentCompensation(Double unemploymentCompensation) {
		this.unemploymentCompensation = unemploymentCompensation;
	}

	public Tax1099GAllOf taxRefund(Double taxRefund) {
		this.taxRefund = taxRefund;
		return this;
	}

	/**
	 * Box 2, State or local income tax refunds, credits, or offsets
	 * 
	 * @return taxRefund
	 */
	@ApiModelProperty(value = "Box 2, State or local income tax refunds, credits, or offsets")

	public Double getTaxRefund() {
		return taxRefund;
	}

	public void setTaxRefund(Double taxRefund) {
		this.taxRefund = taxRefund;
	}

	public Tax1099GAllOf refundYear(Integer refundYear) {
		this.refundYear = refundYear;
		return this;
	}

	/**
	 * Box 3, Box 2 amount is for tax year
	 * 
	 * @return refundYear
	 */
	@ApiModelProperty(value = "Box 3, Box 2 amount is for tax year")

	public Integer getRefundYear() {
		return refundYear;
	}

	public void setRefundYear(Integer refundYear) {
		this.refundYear = refundYear;
	}

	public Tax1099GAllOf federalTaxWithheld(Double federalTaxWithheld) {
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

	public Tax1099GAllOf rtaaPayments(Double rtaaPayments) {
		this.rtaaPayments = rtaaPayments;
		return this;
	}

	/**
	 * Box 5, RTAA payments
	 * 
	 * @return rtaaPayments
	 */
	@ApiModelProperty(value = "Box 5, RTAA payments")

	public Double getRtaaPayments() {
		return rtaaPayments;
	}

	public void setRtaaPayments(Double rtaaPayments) {
		this.rtaaPayments = rtaaPayments;
	}

	public Tax1099GAllOf grants(Double grants) {
		this.grants = grants;
		return this;
	}

	/**
	 * Box 6, Taxable grants
	 * 
	 * @return grants
	 */
	@ApiModelProperty(value = "Box 6, Taxable grants")

	public Double getGrants() {
		return grants;
	}

	public void setGrants(Double grants) {
		this.grants = grants;
	}

	public Tax1099GAllOf agriculturePayments(Double agriculturePayments) {
		this.agriculturePayments = agriculturePayments;
		return this;
	}

	/**
	 * Box 7, Agriculture payments
	 * 
	 * @return agriculturePayments
	 */
	@ApiModelProperty(value = "Box 7, Agriculture payments")

	public Double getAgriculturePayments() {
		return agriculturePayments;
	}

	public void setAgriculturePayments(Double agriculturePayments) {
		this.agriculturePayments = agriculturePayments;
	}

	public Tax1099GAllOf businessIncome(Boolean businessIncome) {
		this.businessIncome = businessIncome;
		return this;
	}

	/**
	 * Box 8, If checked, box 2 is trade or business income
	 * 
	 * @return businessIncome
	 */
	@ApiModelProperty(value = "Box 8, If checked, box 2 is trade or business income")

	public Boolean getBusinessIncome() {
		return businessIncome;
	}

	public void setBusinessIncome(Boolean businessIncome) {
		this.businessIncome = businessIncome;
	}

	public Tax1099GAllOf marketGain(Double marketGain) {
		this.marketGain = marketGain;
		return this;
	}

	/**
	 * Box 9, Market gain
	 * 
	 * @return marketGain
	 */
	@ApiModelProperty(value = "Box 9, Market gain")

	public Double getMarketGain() {
		return marketGain;
	}

	public void setMarketGain(Double marketGain) {
		this.marketGain = marketGain;
	}

	public Tax1099GAllOf stateTaxWithholding(List<StateTaxWithholding> stateTaxWithholding) {
		this.stateTaxWithholding = stateTaxWithholding;
		return this;
	}

	public Tax1099GAllOf addStateTaxWithholdingItem(StateTaxWithholding stateTaxWithholdingItem) {
		if (this.stateTaxWithholding == null) {
			this.stateTaxWithholding = new ArrayList<>();
		}
		this.stateTaxWithholding.add(stateTaxWithholdingItem);
		return this;
	}

	/**
	 * Boxes 10-11, State tax withholding
	 * 
	 * @return stateTaxWithholding
	 */
	@ApiModelProperty(value = "Boxes 10-11, State tax withholding")

	@Valid

	public List<StateTaxWithholding> getStateTaxWithholding() {
		return stateTaxWithholding;
	}

	public void setStateTaxWithholding(List<StateTaxWithholding> stateTaxWithholding) {
		this.stateTaxWithholding = stateTaxWithholding;
	}

	public Tax1099GAllOf secondTinNotice(Boolean secondTinNotice) {
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
		Tax1099GAllOf tax1099GAllOf = (Tax1099GAllOf) o;
		return Objects.equals(this.payerNameAddress, tax1099GAllOf.payerNameAddress)
				&& Objects.equals(this.payerTin, tax1099GAllOf.payerTin)
				&& Objects.equals(this.recipientTin, tax1099GAllOf.recipientTin)
				&& Objects.equals(this.recipientNameAddress, tax1099GAllOf.recipientNameAddress)
				&& Objects.equals(this.accountNumber, tax1099GAllOf.accountNumber)
				&& Objects.equals(this.unemploymentCompensation, tax1099GAllOf.unemploymentCompensation)
				&& Objects.equals(this.taxRefund, tax1099GAllOf.taxRefund)
				&& Objects.equals(this.refundYear, tax1099GAllOf.refundYear)
				&& Objects.equals(this.federalTaxWithheld, tax1099GAllOf.federalTaxWithheld)
				&& Objects.equals(this.rtaaPayments, tax1099GAllOf.rtaaPayments)
				&& Objects.equals(this.grants, tax1099GAllOf.grants)
				&& Objects.equals(this.agriculturePayments, tax1099GAllOf.agriculturePayments)
				&& Objects.equals(this.businessIncome, tax1099GAllOf.businessIncome)
				&& Objects.equals(this.marketGain, tax1099GAllOf.marketGain)
				&& Objects.equals(this.stateTaxWithholding, tax1099GAllOf.stateTaxWithholding)
				&& Objects.equals(this.secondTinNotice, tax1099GAllOf.secondTinNotice);
	}

	@Override
	public int hashCode() {
		return Objects.hash(payerNameAddress, payerTin, recipientTin, recipientNameAddress, accountNumber,
				unemploymentCompensation, taxRefund, refundYear, federalTaxWithheld, rtaaPayments, grants,
				agriculturePayments, businessIncome, marketGain, stateTaxWithholding, secondTinNotice);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Tax1099GAllOf {\n");

		sb.append("    payerNameAddress: ").append(toIndentedString(payerNameAddress)).append("\n");
		sb.append("    payerTin: ").append(toIndentedString(payerTin)).append("\n");
		sb.append("    recipientTin: ").append(toIndentedString(recipientTin)).append("\n");
		sb.append("    recipientNameAddress: ").append(toIndentedString(recipientNameAddress)).append("\n");
		sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
		sb.append("    unemploymentCompensation: ").append(toIndentedString(unemploymentCompensation)).append("\n");
		sb.append("    taxRefund: ").append(toIndentedString(taxRefund)).append("\n");
		sb.append("    refundYear: ").append(toIndentedString(refundYear)).append("\n");
		sb.append("    federalTaxWithheld: ").append(toIndentedString(federalTaxWithheld)).append("\n");
		sb.append("    rtaaPayments: ").append(toIndentedString(rtaaPayments)).append("\n");
		sb.append("    grants: ").append(toIndentedString(grants)).append("\n");
		sb.append("    agriculturePayments: ").append(toIndentedString(agriculturePayments)).append("\n");
		sb.append("    businessIncome: ").append(toIndentedString(businessIncome)).append("\n");
		sb.append("    marketGain: ").append(toIndentedString(marketGain)).append("\n");
		sb.append("    stateTaxWithholding: ").append(toIndentedString(stateTaxWithholding)).append("\n");
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
