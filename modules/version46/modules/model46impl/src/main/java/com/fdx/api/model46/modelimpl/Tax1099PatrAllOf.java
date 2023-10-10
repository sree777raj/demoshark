package com.fdx.api.model46.modelimpl;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Tax1099PatrAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1099PatrAllOf {
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

	@JsonProperty("patronageDividends")
	private Double patronageDividends;

	@JsonProperty("nonpatronageDistributions")
	private Double nonpatronageDistributions;

	@JsonProperty("perUnitRetainAllocations")
	private Double perUnitRetainAllocations;

	@JsonProperty("federalTaxWithheld")
	private Double federalTaxWithheld;

	@JsonProperty("redemption")
	private Double redemption;

	@JsonProperty("dpaDeduction")
	private Double dpaDeduction;

	@JsonProperty("section199Deduction")
	private Double section199Deduction;

	@JsonProperty("qualifiedPayments")
	private Double qualifiedPayments;

	@JsonProperty("section199QualifiedItems")
	private Double section199QualifiedItems;

	@JsonProperty("section199SstbItems")
	private Double section199SstbItems;

	@JsonProperty("investmentCredit")
	private Double investmentCredit;

	@JsonProperty("workOpportunityCredit")
	private Double workOpportunityCredit;

	@JsonProperty("patronsAmtAdjustment")
	private Double patronsAmtAdjustment;

	@JsonProperty("otherCreditsAndDeductions")
	private Double otherCreditsAndDeductions;

	@JsonProperty("specifiedCoop")
	@JsonInclude(Include.NON_NULL)
	private Boolean specifiedCoop;

	@JsonProperty("secondTinNotice")
	@JsonInclude(Include.NON_NULL)
	private Boolean secondTinNotice;

	public Tax1099PatrAllOf payerNameAddress(NameAddressPhone payerNameAddress) {
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

	public Tax1099PatrAllOf payerTin(String payerTin) {
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

	public Tax1099PatrAllOf recipientTin(String recipientTin) {
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

	public Tax1099PatrAllOf recipientNameAddress(NameAddress recipientNameAddress) {
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

	public Tax1099PatrAllOf accountNumber(String accountNumber) {
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

	public Tax1099PatrAllOf patronageDividends(Double patronageDividends) {
		this.patronageDividends = patronageDividends;
		return this;
	}

	/**
	 * Box 1, Patronage dividends
	 * 
	 * @return patronageDividends
	 */
	@ApiModelProperty(value = "Box 1, Patronage dividends")

	public Double getPatronageDividends() {
		return patronageDividends;
	}

	public void setPatronageDividends(Double patronageDividends) {
		this.patronageDividends = patronageDividends;
	}

	public Tax1099PatrAllOf nonpatronageDistributions(Double nonpatronageDistributions) {
		this.nonpatronageDistributions = nonpatronageDistributions;
		return this;
	}

	/**
	 * Box 2, Nonpatronage distributions
	 * 
	 * @return nonpatronageDistributions
	 */
	@ApiModelProperty(value = "Box 2, Nonpatronage distributions")

	public Double getNonpatronageDistributions() {
		return nonpatronageDistributions;
	}

	public void setNonpatronageDistributions(Double nonpatronageDistributions) {
		this.nonpatronageDistributions = nonpatronageDistributions;
	}

	public Tax1099PatrAllOf perUnitRetainAllocations(Double perUnitRetainAllocations) {
		this.perUnitRetainAllocations = perUnitRetainAllocations;
		return this;
	}

	/**
	 * Box 3, Per-unit retain allocations
	 * 
	 * @return perUnitRetainAllocations
	 */
	@ApiModelProperty(value = "Box 3, Per-unit retain allocations")

	public Double getPerUnitRetainAllocations() {
		return perUnitRetainAllocations;
	}

	public void setPerUnitRetainAllocations(Double perUnitRetainAllocations) {
		this.perUnitRetainAllocations = perUnitRetainAllocations;
	}

	public Tax1099PatrAllOf federalTaxWithheld(Double federalTaxWithheld) {
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

	public Tax1099PatrAllOf redemption(Double redemption) {
		this.redemption = redemption;
		return this;
	}

	/**
	 * Box 5, Redemption of nonqualified notices and retain allocations
	 * 
	 * @return redemption
	 */
	@ApiModelProperty(value = "Box 5, Redemption of nonqualified notices and retain allocations")

	public Double getRedemption() {
		return redemption;
	}

	public void setRedemption(Double redemption) {
		this.redemption = redemption;
	}

	public Tax1099PatrAllOf dpaDeduction(Double dpaDeduction) {
		this.dpaDeduction = dpaDeduction;
		return this;
	}

	/**
	 * 2019 Box 6, Domestic production activities deduction (IRS removed 2020)
	 * 
	 * @return dpaDeduction
	 */
	@ApiModelProperty(value = "2019 Box 6, Domestic production activities deduction (IRS removed 2020)")

	public Double getDpaDeduction() {
		return dpaDeduction;
	}

	public void setDpaDeduction(Double dpaDeduction) {
		this.dpaDeduction = dpaDeduction;
	}

	public Tax1099PatrAllOf section199Deduction(Double section199Deduction) {
		this.section199Deduction = section199Deduction;
		return this;
	}

	/**
	 * Box 6, Section 199A(g) deduction
	 * 
	 * @return section199Deduction
	 */
	@ApiModelProperty(value = "Box 6, Section 199A(g) deduction")

	public Double getSection199Deduction() {
		return section199Deduction;
	}

	public void setSection199Deduction(Double section199Deduction) {
		this.section199Deduction = section199Deduction;
	}

	public Tax1099PatrAllOf qualifiedPayments(Double qualifiedPayments) {
		this.qualifiedPayments = qualifiedPayments;
		return this;
	}

	/**
	 * Box 7, Qualified payments
	 * 
	 * @return qualifiedPayments
	 */
	@ApiModelProperty(value = "Box 7, Qualified payments")

	public Double getQualifiedPayments() {
		return qualifiedPayments;
	}

	public void setQualifiedPayments(Double qualifiedPayments) {
		this.qualifiedPayments = qualifiedPayments;
	}

	public Tax1099PatrAllOf section199QualifiedItems(Double section199QualifiedItems) {
		this.section199QualifiedItems = section199QualifiedItems;
		return this;
	}

	/**
	 * Box 8, Section 199A(a) qualified items
	 * 
	 * @return section199QualifiedItems
	 */
	@ApiModelProperty(value = "Box 8, Section 199A(a) qualified items")

	public Double getSection199QualifiedItems() {
		return section199QualifiedItems;
	}

	public void setSection199QualifiedItems(Double section199QualifiedItems) {
		this.section199QualifiedItems = section199QualifiedItems;
	}

	public Tax1099PatrAllOf section199SstbItems(Double section199SstbItems) {
		this.section199SstbItems = section199SstbItems;
		return this;
	}

	/**
	 * Box 9, Section 199A(a) SSTB (Specified Service Trade or Business) items
	 * 
	 * @return section199SstbItems
	 */
	@ApiModelProperty(value = "Box 9, Section 199A(a) SSTB (Specified Service Trade or Business) items")

	public Double getSection199SstbItems() {
		return section199SstbItems;
	}

	public void setSection199SstbItems(Double section199SstbItems) {
		this.section199SstbItems = section199SstbItems;
	}

	public Tax1099PatrAllOf investmentCredit(Double investmentCredit) {
		this.investmentCredit = investmentCredit;
		return this;
	}

	/**
	 * Box 10, Investment credit
	 * 
	 * @return investmentCredit
	 */
	@ApiModelProperty(value = "Box 10, Investment credit")

	public Double getInvestmentCredit() {
		return investmentCredit;
	}

	public void setInvestmentCredit(Double investmentCredit) {
		this.investmentCredit = investmentCredit;
	}

	public Tax1099PatrAllOf workOpportunityCredit(Double workOpportunityCredit) {
		this.workOpportunityCredit = workOpportunityCredit;
		return this;
	}

	/**
	 * Box 11, Work opportunity credit
	 * 
	 * @return workOpportunityCredit
	 */
	@ApiModelProperty(value = "Box 11, Work opportunity credit")

	public Double getWorkOpportunityCredit() {
		return workOpportunityCredit;
	}

	public void setWorkOpportunityCredit(Double workOpportunityCredit) {
		this.workOpportunityCredit = workOpportunityCredit;
	}

	public Tax1099PatrAllOf patronsAmtAdjustment(Double patronsAmtAdjustment) {
		this.patronsAmtAdjustment = patronsAmtAdjustment;
		return this;
	}

	/**
	 * 2019 Box 10, Patron's AMT adjustment (IRS removed 2020)
	 * 
	 * @return patronsAmtAdjustment
	 */
	@ApiModelProperty(value = "2019 Box 10, Patron's AMT adjustment (IRS removed 2020)")

	public Double getPatronsAmtAdjustment() {
		return patronsAmtAdjustment;
	}

	public void setPatronsAmtAdjustment(Double patronsAmtAdjustment) {
		this.patronsAmtAdjustment = patronsAmtAdjustment;
	}

	public Tax1099PatrAllOf otherCreditsAndDeductions(Double otherCreditsAndDeductions) {
		this.otherCreditsAndDeductions = otherCreditsAndDeductions;
		return this;
	}

	/**
	 * Box 12, Other credits and deductions
	 * 
	 * @return otherCreditsAndDeductions
	 */
	@ApiModelProperty(value = "Box 12, Other credits and deductions")

	public Double getOtherCreditsAndDeductions() {
		return otherCreditsAndDeductions;
	}

	public void setOtherCreditsAndDeductions(Double otherCreditsAndDeductions) {
		this.otherCreditsAndDeductions = otherCreditsAndDeductions;
	}

	public Tax1099PatrAllOf specifiedCoop(Boolean specifiedCoop) {
		this.specifiedCoop = specifiedCoop;
		return this;
	}

	/**
	 * Box 13, Specified Cooperative
	 * 
	 * @return specifiedCoop
	 */
	@ApiModelProperty(value = "Box 13, Specified Cooperative")

	public Boolean getSpecifiedCoop() {
		return specifiedCoop;
	}

	public void setSpecifiedCoop(Boolean specifiedCoop) {
		this.specifiedCoop = specifiedCoop;
	}

	public Tax1099PatrAllOf secondTinNotice(Boolean secondTinNotice) {
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
		Tax1099PatrAllOf tax1099PatrAllOf = (Tax1099PatrAllOf) o;
		return Objects.equals(this.payerNameAddress, tax1099PatrAllOf.payerNameAddress)
				&& Objects.equals(this.payerTin, tax1099PatrAllOf.payerTin)
				&& Objects.equals(this.recipientTin, tax1099PatrAllOf.recipientTin)
				&& Objects.equals(this.recipientNameAddress, tax1099PatrAllOf.recipientNameAddress)
				&& Objects.equals(this.accountNumber, tax1099PatrAllOf.accountNumber)
				&& Objects.equals(this.patronageDividends, tax1099PatrAllOf.patronageDividends)
				&& Objects.equals(this.nonpatronageDistributions, tax1099PatrAllOf.nonpatronageDistributions)
				&& Objects.equals(this.perUnitRetainAllocations, tax1099PatrAllOf.perUnitRetainAllocations)
				&& Objects.equals(this.federalTaxWithheld, tax1099PatrAllOf.federalTaxWithheld)
				&& Objects.equals(this.redemption, tax1099PatrAllOf.redemption)
				&& Objects.equals(this.dpaDeduction, tax1099PatrAllOf.dpaDeduction)
				&& Objects.equals(this.section199Deduction, tax1099PatrAllOf.section199Deduction)
				&& Objects.equals(this.qualifiedPayments, tax1099PatrAllOf.qualifiedPayments)
				&& Objects.equals(this.section199QualifiedItems, tax1099PatrAllOf.section199QualifiedItems)
				&& Objects.equals(this.section199SstbItems, tax1099PatrAllOf.section199SstbItems)
				&& Objects.equals(this.investmentCredit, tax1099PatrAllOf.investmentCredit)
				&& Objects.equals(this.workOpportunityCredit, tax1099PatrAllOf.workOpportunityCredit)
				&& Objects.equals(this.patronsAmtAdjustment, tax1099PatrAllOf.patronsAmtAdjustment)
				&& Objects.equals(this.otherCreditsAndDeductions, tax1099PatrAllOf.otherCreditsAndDeductions)
				&& Objects.equals(this.specifiedCoop, tax1099PatrAllOf.specifiedCoop)
				&& Objects.equals(this.secondTinNotice, tax1099PatrAllOf.secondTinNotice);
	}

	@Override
	public int hashCode() {
		return Objects.hash(payerNameAddress, payerTin, recipientTin, recipientNameAddress, accountNumber,
				patronageDividends, nonpatronageDistributions, perUnitRetainAllocations, federalTaxWithheld, redemption,
				dpaDeduction, section199Deduction, qualifiedPayments, section199QualifiedItems, section199SstbItems,
				investmentCredit, workOpportunityCredit, patronsAmtAdjustment, otherCreditsAndDeductions, specifiedCoop,
				secondTinNotice);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Tax1099PatrAllOf {\n");

		sb.append("    payerNameAddress: ").append(toIndentedString(payerNameAddress)).append("\n");
		sb.append("    payerTin: ").append(toIndentedString(payerTin)).append("\n");
		sb.append("    recipientTin: ").append(toIndentedString(recipientTin)).append("\n");
		sb.append("    recipientNameAddress: ").append(toIndentedString(recipientNameAddress)).append("\n");
		sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
		sb.append("    patronageDividends: ").append(toIndentedString(patronageDividends)).append("\n");
		sb.append("    nonpatronageDistributions: ").append(toIndentedString(nonpatronageDistributions)).append("\n");
		sb.append("    perUnitRetainAllocations: ").append(toIndentedString(perUnitRetainAllocations)).append("\n");
		sb.append("    federalTaxWithheld: ").append(toIndentedString(federalTaxWithheld)).append("\n");
		sb.append("    redemption: ").append(toIndentedString(redemption)).append("\n");
		sb.append("    dpaDeduction: ").append(toIndentedString(dpaDeduction)).append("\n");
		sb.append("    section199Deduction: ").append(toIndentedString(section199Deduction)).append("\n");
		sb.append("    qualifiedPayments: ").append(toIndentedString(qualifiedPayments)).append("\n");
		sb.append("    section199QualifiedItems: ").append(toIndentedString(section199QualifiedItems)).append("\n");
		sb.append("    section199SstbItems: ").append(toIndentedString(section199SstbItems)).append("\n");
		sb.append("    investmentCredit: ").append(toIndentedString(investmentCredit)).append("\n");
		sb.append("    workOpportunityCredit: ").append(toIndentedString(workOpportunityCredit)).append("\n");
		sb.append("    patronsAmtAdjustment: ").append(toIndentedString(patronsAmtAdjustment)).append("\n");
		sb.append("    otherCreditsAndDeductions: ").append(toIndentedString(otherCreditsAndDeductions)).append("\n");
		sb.append("    specifiedCoop: ").append(toIndentedString(specifiedCoop)).append("\n");
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
