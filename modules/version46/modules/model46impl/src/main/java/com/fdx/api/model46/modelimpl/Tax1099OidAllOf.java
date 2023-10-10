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
 * Tax1099OidAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1099OidAllOf {
	@JsonProperty("payerNameAddress")
	private NameAddressPhone payerNameAddress;

	@JsonProperty("payerTin")
	private String payerTin;

	@JsonProperty("recipientTin")
	private String recipientTin;

	@JsonProperty("recipientNameAddress")
	private NameAddress recipientNameAddress;

	@JsonProperty("foreignAccountTaxCompliance")
	@JsonInclude(Include.NON_NULL)
	private Boolean foreignAccountTaxCompliance;

	@JsonProperty("accountNumber")
	private String accountNumber;

	@JsonProperty("originalIssueDiscount")
	private Double originalIssueDiscount;

	@JsonProperty("otherPeriodicInterest")
	private Double otherPeriodicInterest;

	@JsonProperty("earlyWithdrawalPenalty")
	private Double earlyWithdrawalPenalty;

	@JsonProperty("federalTaxWithheld")
	private Double federalTaxWithheld;

	@JsonProperty("marketDiscount")
	private Double marketDiscount;

	@JsonProperty("acquisitionPremium")
	private Double acquisitionPremium;

	@JsonProperty("oidDescription")
	private String oidDescription;

	@JsonProperty("discountOnTreasuryObligations")
	private Double discountOnTreasuryObligations;

	@JsonProperty("investmentExpenses")
	private Double investmentExpenses;

	@JsonProperty("bondPremium")
	private Double bondPremium;

	@JsonProperty("taxExemptOid")
	private Double taxExemptOid;

	@JsonProperty("stateTaxWithholding")
	@Valid
	private List<StateTaxWithholding> stateTaxWithholding = null;

	@JsonProperty("stateExemptOid")
	@Valid
	private List<DescriptionAmount> stateExemptOid = null;

	@JsonProperty("secondTinNotice")
	@JsonInclude(Include.NON_NULL)
	private Boolean secondTinNotice;

	public Tax1099OidAllOf payerNameAddress(NameAddressPhone payerNameAddress) {
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

	public Tax1099OidAllOf payerTin(String payerTin) {
		this.payerTin = payerTin;
		return this;
	}

	/**
	 * Payer's TIN
	 * 
	 * @return payerTin
	 */
	@ApiModelProperty(value = "Payer's TIN")

	public String getPayerTin() {
		return payerTin;
	}

	public void setPayerTin(String payerTin) {
		this.payerTin = payerTin;
	}

	public Tax1099OidAllOf recipientTin(String recipientTin) {
		this.recipientTin = recipientTin;
		return this;
	}

	/**
	 * Recipient's TIN
	 * 
	 * @return recipientTin
	 */
	@ApiModelProperty(value = "Recipient's TIN")

	public String getRecipientTin() {
		return recipientTin;
	}

	public void setRecipientTin(String recipientTin) {
		this.recipientTin = recipientTin;
	}

	public Tax1099OidAllOf recipientNameAddress(NameAddress recipientNameAddress) {
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

	public Tax1099OidAllOf foreignAccountTaxCompliance(Boolean foreignAccountTaxCompliance) {
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

	public Tax1099OidAllOf accountNumber(String accountNumber) {
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

	public Tax1099OidAllOf originalIssueDiscount(Double originalIssueDiscount) {
		this.originalIssueDiscount = originalIssueDiscount;
		return this;
	}

	/**
	 * Box 1, Original issue discount
	 * 
	 * @return originalIssueDiscount
	 */
	@ApiModelProperty(value = "Box 1, Original issue discount")

	public Double getOriginalIssueDiscount() {
		return originalIssueDiscount;
	}

	public void setOriginalIssueDiscount(Double originalIssueDiscount) {
		this.originalIssueDiscount = originalIssueDiscount;
	}

	public Tax1099OidAllOf otherPeriodicInterest(Double otherPeriodicInterest) {
		this.otherPeriodicInterest = otherPeriodicInterest;
		return this;
	}

	/**
	 * Box 2, Other periodic interest
	 * 
	 * @return otherPeriodicInterest
	 */
	@ApiModelProperty(value = "Box 2, Other periodic interest")

	public Double getOtherPeriodicInterest() {
		return otherPeriodicInterest;
	}

	public void setOtherPeriodicInterest(Double otherPeriodicInterest) {
		this.otherPeriodicInterest = otherPeriodicInterest;
	}

	public Tax1099OidAllOf earlyWithdrawalPenalty(Double earlyWithdrawalPenalty) {
		this.earlyWithdrawalPenalty = earlyWithdrawalPenalty;
		return this;
	}

	/**
	 * Box 3, Early withdrawal penalty
	 * 
	 * @return earlyWithdrawalPenalty
	 */
	@ApiModelProperty(value = "Box 3, Early withdrawal penalty")

	public Double getEarlyWithdrawalPenalty() {
		return earlyWithdrawalPenalty;
	}

	public void setEarlyWithdrawalPenalty(Double earlyWithdrawalPenalty) {
		this.earlyWithdrawalPenalty = earlyWithdrawalPenalty;
	}

	public Tax1099OidAllOf federalTaxWithheld(Double federalTaxWithheld) {
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

	public Tax1099OidAllOf marketDiscount(Double marketDiscount) {
		this.marketDiscount = marketDiscount;
		return this;
	}

	/**
	 * Box 5, Market discount
	 * 
	 * @return marketDiscount
	 */
	@ApiModelProperty(value = "Box 5, Market discount")

	public Double getMarketDiscount() {
		return marketDiscount;
	}

	public void setMarketDiscount(Double marketDiscount) {
		this.marketDiscount = marketDiscount;
	}

	public Tax1099OidAllOf acquisitionPremium(Double acquisitionPremium) {
		this.acquisitionPremium = acquisitionPremium;
		return this;
	}

	/**
	 * Box 6, Acquisition premium
	 * 
	 * @return acquisitionPremium
	 */
	@ApiModelProperty(value = "Box 6, Acquisition premium")

	public Double getAcquisitionPremium() {
		return acquisitionPremium;
	}

	public void setAcquisitionPremium(Double acquisitionPremium) {
		this.acquisitionPremium = acquisitionPremium;
	}

	public Tax1099OidAllOf oidDescription(String oidDescription) {
		this.oidDescription = oidDescription;
		return this;
	}

	/**
	 * Box 7, Description
	 * 
	 * @return oidDescription
	 */
	@ApiModelProperty(value = "Box 7, Description")

	public String getOidDescription() {
		return oidDescription;
	}

	public void setOidDescription(String oidDescription) {
		this.oidDescription = oidDescription;
	}

	public Tax1099OidAllOf discountOnTreasuryObligations(Double discountOnTreasuryObligations) {
		this.discountOnTreasuryObligations = discountOnTreasuryObligations;
		return this;
	}

	/**
	 * Box 8, Original issue discount on U.S. Treasury obligations
	 * 
	 * @return discountOnTreasuryObligations
	 */
	@ApiModelProperty(value = "Box 8, Original issue discount on U.S. Treasury obligations")

	public Double getDiscountOnTreasuryObligations() {
		return discountOnTreasuryObligations;
	}

	public void setDiscountOnTreasuryObligations(Double discountOnTreasuryObligations) {
		this.discountOnTreasuryObligations = discountOnTreasuryObligations;
	}

	public Tax1099OidAllOf investmentExpenses(Double investmentExpenses) {
		this.investmentExpenses = investmentExpenses;
		return this;
	}

	/**
	 * Box 9, Investment expenses
	 * 
	 * @return investmentExpenses
	 */
	@ApiModelProperty(value = "Box 9, Investment expenses")

	public Double getInvestmentExpenses() {
		return investmentExpenses;
	}

	public void setInvestmentExpenses(Double investmentExpenses) {
		this.investmentExpenses = investmentExpenses;
	}

	public Tax1099OidAllOf bondPremium(Double bondPremium) {
		this.bondPremium = bondPremium;
		return this;
	}

	/**
	 * Box 10, Bond premium
	 * 
	 * @return bondPremium
	 */
	@ApiModelProperty(value = "Box 10, Bond premium")

	public Double getBondPremium() {
		return bondPremium;
	}

	public void setBondPremium(Double bondPremium) {
		this.bondPremium = bondPremium;
	}

	public Tax1099OidAllOf taxExemptOid(Double taxExemptOid) {
		this.taxExemptOid = taxExemptOid;
		return this;
	}

	/**
	 * Box 11, Tax-exempt OID
	 * 
	 * @return taxExemptOid
	 */
	@ApiModelProperty(value = "Box 11, Tax-exempt OID")

	public Double getTaxExemptOid() {
		return taxExemptOid;
	}

	public void setTaxExemptOid(Double taxExemptOid) {
		this.taxExemptOid = taxExemptOid;
	}

	public Tax1099OidAllOf stateTaxWithholding(List<StateTaxWithholding> stateTaxWithholding) {
		this.stateTaxWithholding = stateTaxWithholding;
		return this;
	}

	public Tax1099OidAllOf addStateTaxWithholdingItem(StateTaxWithholding stateTaxWithholdingItem) {
		if (this.stateTaxWithholding == null) {
			this.stateTaxWithholding = new ArrayList<>();
		}
		this.stateTaxWithholding.add(stateTaxWithholdingItem);
		return this;
	}

	/**
	 * Boxes 12-14, State tax withheld
	 * 
	 * @return stateTaxWithholding
	 */
	@ApiModelProperty(value = "Boxes 12-14, State tax withheld")

	@Valid

	public List<StateTaxWithholding> getStateTaxWithholding() {
		return stateTaxWithholding;
	}

	public void setStateTaxWithholding(List<StateTaxWithholding> stateTaxWithholding) {
		this.stateTaxWithholding = stateTaxWithholding;
	}

	public Tax1099OidAllOf stateExemptOid(List<DescriptionAmount> stateExemptOid) {
		this.stateExemptOid = stateExemptOid;
		return this;
	}

	public Tax1099OidAllOf addStateExemptOidItem(DescriptionAmount stateExemptOidItem) {
		if (this.stateExemptOid == null) {
			this.stateExemptOid = new ArrayList<>();
		}
		this.stateExemptOid.add(stateExemptOidItem);
		return this;
	}

	/**
	 * Supplemental: State name and tax-exempt OID by state
	 * 
	 * @return stateExemptOid
	 */
	@ApiModelProperty(value = "Supplemental: State name and tax-exempt OID by state")

	@Valid

	public List<DescriptionAmount> getStateExemptOid() {
		return stateExemptOid;
	}

	public void setStateExemptOid(List<DescriptionAmount> stateExemptOid) {
		this.stateExemptOid = stateExemptOid;
	}

	public Tax1099OidAllOf secondTinNotice(Boolean secondTinNotice) {
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
		Tax1099OidAllOf tax1099OidAllOf = (Tax1099OidAllOf) o;
		return Objects.equals(this.payerNameAddress, tax1099OidAllOf.payerNameAddress)
				&& Objects.equals(this.payerTin, tax1099OidAllOf.payerTin)
				&& Objects.equals(this.recipientTin, tax1099OidAllOf.recipientTin)
				&& Objects.equals(this.recipientNameAddress, tax1099OidAllOf.recipientNameAddress)
				&& Objects.equals(this.foreignAccountTaxCompliance, tax1099OidAllOf.foreignAccountTaxCompliance)
				&& Objects.equals(this.accountNumber, tax1099OidAllOf.accountNumber)
				&& Objects.equals(this.originalIssueDiscount, tax1099OidAllOf.originalIssueDiscount)
				&& Objects.equals(this.otherPeriodicInterest, tax1099OidAllOf.otherPeriodicInterest)
				&& Objects.equals(this.earlyWithdrawalPenalty, tax1099OidAllOf.earlyWithdrawalPenalty)
				&& Objects.equals(this.federalTaxWithheld, tax1099OidAllOf.federalTaxWithheld)
				&& Objects.equals(this.marketDiscount, tax1099OidAllOf.marketDiscount)
				&& Objects.equals(this.acquisitionPremium, tax1099OidAllOf.acquisitionPremium)
				&& Objects.equals(this.oidDescription, tax1099OidAllOf.oidDescription)
				&& Objects.equals(this.discountOnTreasuryObligations, tax1099OidAllOf.discountOnTreasuryObligations)
				&& Objects.equals(this.investmentExpenses, tax1099OidAllOf.investmentExpenses)
				&& Objects.equals(this.bondPremium, tax1099OidAllOf.bondPremium)
				&& Objects.equals(this.taxExemptOid, tax1099OidAllOf.taxExemptOid)
				&& Objects.equals(this.stateTaxWithholding, tax1099OidAllOf.stateTaxWithholding)
				&& Objects.equals(this.stateExemptOid, tax1099OidAllOf.stateExemptOid)
				&& Objects.equals(this.secondTinNotice, tax1099OidAllOf.secondTinNotice);
	}

	@Override
	public int hashCode() {
		return Objects.hash(payerNameAddress, payerTin, recipientTin, recipientNameAddress, foreignAccountTaxCompliance,
				accountNumber, originalIssueDiscount, otherPeriodicInterest, earlyWithdrawalPenalty, federalTaxWithheld,
				marketDiscount, acquisitionPremium, oidDescription, discountOnTreasuryObligations, investmentExpenses,
				bondPremium, taxExemptOid, stateTaxWithholding, stateExemptOid, secondTinNotice);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Tax1099OidAllOf {\n");

		sb.append("    payerNameAddress: ").append(toIndentedString(payerNameAddress)).append("\n");
		sb.append("    payerTin: ").append(toIndentedString(payerTin)).append("\n");
		sb.append("    recipientTin: ").append(toIndentedString(recipientTin)).append("\n");
		sb.append("    recipientNameAddress: ").append(toIndentedString(recipientNameAddress)).append("\n");
		sb.append("    foreignAccountTaxCompliance: ").append(toIndentedString(foreignAccountTaxCompliance))
				.append("\n");
		sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
		sb.append("    originalIssueDiscount: ").append(toIndentedString(originalIssueDiscount)).append("\n");
		sb.append("    otherPeriodicInterest: ").append(toIndentedString(otherPeriodicInterest)).append("\n");
		sb.append("    earlyWithdrawalPenalty: ").append(toIndentedString(earlyWithdrawalPenalty)).append("\n");
		sb.append("    federalTaxWithheld: ").append(toIndentedString(federalTaxWithheld)).append("\n");
		sb.append("    marketDiscount: ").append(toIndentedString(marketDiscount)).append("\n");
		sb.append("    acquisitionPremium: ").append(toIndentedString(acquisitionPremium)).append("\n");
		sb.append("    oidDescription: ").append(toIndentedString(oidDescription)).append("\n");
		sb.append("    discountOnTreasuryObligations: ").append(toIndentedString(discountOnTreasuryObligations))
				.append("\n");
		sb.append("    investmentExpenses: ").append(toIndentedString(investmentExpenses)).append("\n");
		sb.append("    bondPremium: ").append(toIndentedString(bondPremium)).append("\n");
		sb.append("    taxExemptOid: ").append(toIndentedString(taxExemptOid)).append("\n");
		sb.append("    stateTaxWithholding: ").append(toIndentedString(stateTaxWithholding)).append("\n");
		sb.append("    stateExemptOid: ").append(toIndentedString(stateExemptOid)).append("\n");
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
