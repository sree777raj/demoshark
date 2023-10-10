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
 * Tax1099DivAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1099DivAllOf {
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

	@JsonProperty("ordinaryDividends")
	private Double ordinaryDividends;

	@JsonProperty("qualifiedDividends")
	private Double qualifiedDividends;

	@JsonProperty("totalCapitalGain")
	private Double totalCapitalGain;

	@JsonProperty("unrecaptured1250Gain")
	private Double unrecaptured1250Gain;

	@JsonProperty("section1202Gain")
	private Double section1202Gain;

	@JsonProperty("collectiblesGain")
	private Double collectiblesGain;

	@JsonProperty("nonTaxableDistribution")
	private Double nonTaxableDistribution;

	@JsonProperty("federalTaxWithheld")
	private Double federalTaxWithheld;

	@JsonProperty("section199ADividends")
	private Double section199ADividends;

	@JsonProperty("investmentExpenses")
	private Double investmentExpenses;

	@JsonProperty("foreignTaxPaid")
	private Double foreignTaxPaid;

	@JsonProperty("foreignCountry")
	private String foreignCountry;

	@JsonProperty("cashLiquidation")
	private Double cashLiquidation;

	@JsonProperty("nonCashLiquidation")
	private Double nonCashLiquidation;

	@JsonProperty("taxExemptInterestDividend")
	private Double taxExemptInterestDividend;

	@JsonProperty("specifiedPabInterestDividend")
	private Double specifiedPabInterestDividend;

	@JsonProperty("stateTaxWithholding")
	@Valid
	private List<StateTaxWithholding> stateTaxWithholding = null;

	@JsonProperty("foreignIncomes")
	@Valid
	private List<DescriptionAmount> foreignIncomes = null;

	@JsonProperty("stateTaxExemptIncomes")
	@Valid
	private List<DescriptionAmount> stateTaxExemptIncomes = null;

	@JsonProperty("secondTinNotice")
	@JsonInclude(Include.NON_NULL)
	private Boolean secondTinNotice;

	public Tax1099DivAllOf payerNameAddress(NameAddressPhone payerNameAddress) {
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

	public Tax1099DivAllOf payerTin(String payerTin) {
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

	public Tax1099DivAllOf recipientTin(String recipientTin) {
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

	public Tax1099DivAllOf recipientNameAddress(NameAddress recipientNameAddress) {
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

	public Tax1099DivAllOf foreignAccountTaxCompliance(Boolean foreignAccountTaxCompliance) {
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

	public Tax1099DivAllOf accountNumber(String accountNumber) {
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

	public Tax1099DivAllOf ordinaryDividends(Double ordinaryDividends) {
		this.ordinaryDividends = ordinaryDividends;
		return this;
	}

	/**
	 * Box 1a, Total ordinary dividends
	 * 
	 * @return ordinaryDividends
	 */
	@ApiModelProperty(value = "Box 1a, Total ordinary dividends")

	public Double getOrdinaryDividends() {
		return ordinaryDividends;
	}

	public void setOrdinaryDividends(Double ordinaryDividends) {
		this.ordinaryDividends = ordinaryDividends;
	}

	public Tax1099DivAllOf qualifiedDividends(Double qualifiedDividends) {
		this.qualifiedDividends = qualifiedDividends;
		return this;
	}

	/**
	 * Box 1b, Qualified dividends
	 * 
	 * @return qualifiedDividends
	 */
	@ApiModelProperty(value = "Box 1b, Qualified dividends")

	public Double getQualifiedDividends() {
		return qualifiedDividends;
	}

	public void setQualifiedDividends(Double qualifiedDividends) {
		this.qualifiedDividends = qualifiedDividends;
	}

	public Tax1099DivAllOf totalCapitalGain(Double totalCapitalGain) {
		this.totalCapitalGain = totalCapitalGain;
		return this;
	}

	/**
	 * Box 2a, Total capital gain distributions
	 * 
	 * @return totalCapitalGain
	 */
	@ApiModelProperty(value = "Box 2a, Total capital gain distributions")

	public Double getTotalCapitalGain() {
		return totalCapitalGain;
	}

	public void setTotalCapitalGain(Double totalCapitalGain) {
		this.totalCapitalGain = totalCapitalGain;
	}

	public Tax1099DivAllOf unrecaptured1250Gain(Double unrecaptured1250Gain) {
		this.unrecaptured1250Gain = unrecaptured1250Gain;
		return this;
	}

	/**
	 * Box 2b, Unrecaptured Section 1250 gain
	 * 
	 * @return unrecaptured1250Gain
	 */
	@ApiModelProperty(value = "Box 2b, Unrecaptured Section 1250 gain")

	public Double getUnrecaptured1250Gain() {
		return unrecaptured1250Gain;
	}

	public void setUnrecaptured1250Gain(Double unrecaptured1250Gain) {
		this.unrecaptured1250Gain = unrecaptured1250Gain;
	}

	public Tax1099DivAllOf section1202Gain(Double section1202Gain) {
		this.section1202Gain = section1202Gain;
		return this;
	}

	/**
	 * Box 2c, Section 1202 gain
	 * 
	 * @return section1202Gain
	 */
	@ApiModelProperty(value = "Box 2c, Section 1202 gain")

	public Double getSection1202Gain() {
		return section1202Gain;
	}

	public void setSection1202Gain(Double section1202Gain) {
		this.section1202Gain = section1202Gain;
	}

	public Tax1099DivAllOf collectiblesGain(Double collectiblesGain) {
		this.collectiblesGain = collectiblesGain;
		return this;
	}

	/**
	 * Box 2d, Collectibles (28%) gain
	 * 
	 * @return collectiblesGain
	 */
	@ApiModelProperty(value = "Box 2d, Collectibles (28%) gain")

	public Double getCollectiblesGain() {
		return collectiblesGain;
	}

	public void setCollectiblesGain(Double collectiblesGain) {
		this.collectiblesGain = collectiblesGain;
	}

	public Tax1099DivAllOf nonTaxableDistribution(Double nonTaxableDistribution) {
		this.nonTaxableDistribution = nonTaxableDistribution;
		return this;
	}

	/**
	 * Box 3, Nondividend distributions
	 * 
	 * @return nonTaxableDistribution
	 */
	@ApiModelProperty(value = "Box 3, Nondividend distributions")

	public Double getNonTaxableDistribution() {
		return nonTaxableDistribution;
	}

	public void setNonTaxableDistribution(Double nonTaxableDistribution) {
		this.nonTaxableDistribution = nonTaxableDistribution;
	}

	public Tax1099DivAllOf federalTaxWithheld(Double federalTaxWithheld) {
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

	public Tax1099DivAllOf section199ADividends(Double section199ADividends) {
		this.section199ADividends = section199ADividends;
		return this;
	}

	/**
	 * Box 5, Section 199A dividends
	 * 
	 * @return section199ADividends
	 */
	@ApiModelProperty(value = "Box 5, Section 199A dividends")

	public Double getSection199ADividends() {
		return section199ADividends;
	}

	public void setSection199ADividends(Double section199ADividends) {
		this.section199ADividends = section199ADividends;
	}

	public Tax1099DivAllOf investmentExpenses(Double investmentExpenses) {
		this.investmentExpenses = investmentExpenses;
		return this;
	}

	/**
	 * Box 6, Investment expenses
	 * 
	 * @return investmentExpenses
	 */
	@ApiModelProperty(value = "Box 6, Investment expenses")

	public Double getInvestmentExpenses() {
		return investmentExpenses;
	}

	public void setInvestmentExpenses(Double investmentExpenses) {
		this.investmentExpenses = investmentExpenses;
	}

	public Tax1099DivAllOf foreignTaxPaid(Double foreignTaxPaid) {
		this.foreignTaxPaid = foreignTaxPaid;
		return this;
	}

	/**
	 * Box 7, Foreign tax paid
	 * 
	 * @return foreignTaxPaid
	 */
	@ApiModelProperty(value = "Box 7, Foreign tax paid")

	public Double getForeignTaxPaid() {
		return foreignTaxPaid;
	}

	public void setForeignTaxPaid(Double foreignTaxPaid) {
		this.foreignTaxPaid = foreignTaxPaid;
	}

	public Tax1099DivAllOf foreignCountry(String foreignCountry) {
		this.foreignCountry = foreignCountry;
		return this;
	}

	/**
	 * Box 8, Foreign country or U.S. possession
	 * 
	 * @return foreignCountry
	 */
	@ApiModelProperty(value = "Box 8, Foreign country or U.S. possession")

	public String getForeignCountry() {
		return foreignCountry;
	}

	public void setForeignCountry(String foreignCountry) {
		this.foreignCountry = foreignCountry;
	}

	public Tax1099DivAllOf cashLiquidation(Double cashLiquidation) {
		this.cashLiquidation = cashLiquidation;
		return this;
	}

	/**
	 * Box 9, Cash liquidation distributions
	 * 
	 * @return cashLiquidation
	 */
	@ApiModelProperty(value = "Box 9, Cash liquidation distributions")

	public Double getCashLiquidation() {
		return cashLiquidation;
	}

	public void setCashLiquidation(Double cashLiquidation) {
		this.cashLiquidation = cashLiquidation;
	}

	public Tax1099DivAllOf nonCashLiquidation(Double nonCashLiquidation) {
		this.nonCashLiquidation = nonCashLiquidation;
		return this;
	}

	/**
	 * Box 10, Noncash liquidation distributions
	 * 
	 * @return nonCashLiquidation
	 */
	@ApiModelProperty(value = "Box 10, Noncash liquidation distributions")

	public Double getNonCashLiquidation() {
		return nonCashLiquidation;
	}

	public void setNonCashLiquidation(Double nonCashLiquidation) {
		this.nonCashLiquidation = nonCashLiquidation;
	}

	public Tax1099DivAllOf taxExemptInterestDividend(Double taxExemptInterestDividend) {
		this.taxExemptInterestDividend = taxExemptInterestDividend;
		return this;
	}

	/**
	 * Box 11, Exempt-interest dividends
	 * 
	 * @return taxExemptInterestDividend
	 */
	@ApiModelProperty(value = "Box 11, Exempt-interest dividends")

	public Double getTaxExemptInterestDividend() {
		return taxExemptInterestDividend;
	}

	public void setTaxExemptInterestDividend(Double taxExemptInterestDividend) {
		this.taxExemptInterestDividend = taxExemptInterestDividend;
	}

	public Tax1099DivAllOf specifiedPabInterestDividend(Double specifiedPabInterestDividend) {
		this.specifiedPabInterestDividend = specifiedPabInterestDividend;
		return this;
	}

	/**
	 * Box 12, Specified private activity bond interest dividends
	 * 
	 * @return specifiedPabInterestDividend
	 */
	@ApiModelProperty(value = "Box 12, Specified private activity bond interest dividends")

	public Double getSpecifiedPabInterestDividend() {
		return specifiedPabInterestDividend;
	}

	public void setSpecifiedPabInterestDividend(Double specifiedPabInterestDividend) {
		this.specifiedPabInterestDividend = specifiedPabInterestDividend;
	}

	public Tax1099DivAllOf stateTaxWithholding(List<StateTaxWithholding> stateTaxWithholding) {
		this.stateTaxWithholding = stateTaxWithholding;
		return this;
	}

	public Tax1099DivAllOf addStateTaxWithholdingItem(StateTaxWithholding stateTaxWithholdingItem) {
		if (this.stateTaxWithholding == null) {
			this.stateTaxWithholding = new ArrayList<>();
		}
		this.stateTaxWithholding.add(stateTaxWithholdingItem);
		return this;
	}

	/**
	 * Boxes 13-15, State tax withholding
	 * 
	 * @return stateTaxWithholding
	 */
	@ApiModelProperty(value = "Boxes 13-15, State tax withholding")

	@Valid

	public List<StateTaxWithholding> getStateTaxWithholding() {
		return stateTaxWithholding;
	}

	public void setStateTaxWithholding(List<StateTaxWithholding> stateTaxWithholding) {
		this.stateTaxWithholding = stateTaxWithholding;
	}

	public Tax1099DivAllOf foreignIncomes(List<DescriptionAmount> foreignIncomes) {
		this.foreignIncomes = foreignIncomes;
		return this;
	}

	public Tax1099DivAllOf addForeignIncomesItem(DescriptionAmount foreignIncomesItem) {
		if (this.foreignIncomes == null) {
			this.foreignIncomes = new ArrayList<>();
		}
		this.foreignIncomes.add(foreignIncomesItem);
		return this;
	}

	/**
	 * Foreign income information
	 * 
	 * @return foreignIncomes
	 */
	@ApiModelProperty(value = "Foreign income information")

	@Valid

	public List<DescriptionAmount> getForeignIncomes() {
		return foreignIncomes;
	}

	public void setForeignIncomes(List<DescriptionAmount> foreignIncomes) {
		this.foreignIncomes = foreignIncomes;
	}

	public Tax1099DivAllOf stateTaxExemptIncomes(List<DescriptionAmount> stateTaxExemptIncomes) {
		this.stateTaxExemptIncomes = stateTaxExemptIncomes;
		return this;
	}

	public Tax1099DivAllOf addStateTaxExemptIncomesItem(DescriptionAmount stateTaxExemptIncomesItem) {
		if (this.stateTaxExemptIncomes == null) {
			this.stateTaxExemptIncomes = new ArrayList<>();
		}
		this.stateTaxExemptIncomes.add(stateTaxExemptIncomesItem);
		return this;
	}

	/**
	 * Tax exempt income state information
	 * 
	 * @return stateTaxExemptIncomes
	 */
	@ApiModelProperty(value = "Tax exempt income state information")

	@Valid

	public List<DescriptionAmount> getStateTaxExemptIncomes() {
		return stateTaxExemptIncomes;
	}

	public void setStateTaxExemptIncomes(List<DescriptionAmount> stateTaxExemptIncomes) {
		this.stateTaxExemptIncomes = stateTaxExemptIncomes;
	}

	public Tax1099DivAllOf secondTinNotice(Boolean secondTinNotice) {
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
		Tax1099DivAllOf tax1099DivAllOf = (Tax1099DivAllOf) o;
		return Objects.equals(this.payerNameAddress, tax1099DivAllOf.payerNameAddress)
				&& Objects.equals(this.payerTin, tax1099DivAllOf.payerTin)
				&& Objects.equals(this.recipientTin, tax1099DivAllOf.recipientTin)
				&& Objects.equals(this.recipientNameAddress, tax1099DivAllOf.recipientNameAddress)
				&& Objects.equals(this.foreignAccountTaxCompliance, tax1099DivAllOf.foreignAccountTaxCompliance)
				&& Objects.equals(this.accountNumber, tax1099DivAllOf.accountNumber)
				&& Objects.equals(this.ordinaryDividends, tax1099DivAllOf.ordinaryDividends)
				&& Objects.equals(this.qualifiedDividends, tax1099DivAllOf.qualifiedDividends)
				&& Objects.equals(this.totalCapitalGain, tax1099DivAllOf.totalCapitalGain)
				&& Objects.equals(this.unrecaptured1250Gain, tax1099DivAllOf.unrecaptured1250Gain)
				&& Objects.equals(this.section1202Gain, tax1099DivAllOf.section1202Gain)
				&& Objects.equals(this.collectiblesGain, tax1099DivAllOf.collectiblesGain)
				&& Objects.equals(this.nonTaxableDistribution, tax1099DivAllOf.nonTaxableDistribution)
				&& Objects.equals(this.federalTaxWithheld, tax1099DivAllOf.federalTaxWithheld)
				&& Objects.equals(this.section199ADividends, tax1099DivAllOf.section199ADividends)
				&& Objects.equals(this.investmentExpenses, tax1099DivAllOf.investmentExpenses)
				&& Objects.equals(this.foreignTaxPaid, tax1099DivAllOf.foreignTaxPaid)
				&& Objects.equals(this.foreignCountry, tax1099DivAllOf.foreignCountry)
				&& Objects.equals(this.cashLiquidation, tax1099DivAllOf.cashLiquidation)
				&& Objects.equals(this.nonCashLiquidation, tax1099DivAllOf.nonCashLiquidation)
				&& Objects.equals(this.taxExemptInterestDividend, tax1099DivAllOf.taxExemptInterestDividend)
				&& Objects.equals(this.specifiedPabInterestDividend, tax1099DivAllOf.specifiedPabInterestDividend)
				&& Objects.equals(this.stateTaxWithholding, tax1099DivAllOf.stateTaxWithholding)
				&& Objects.equals(this.foreignIncomes, tax1099DivAllOf.foreignIncomes)
				&& Objects.equals(this.stateTaxExemptIncomes, tax1099DivAllOf.stateTaxExemptIncomes)
				&& Objects.equals(this.secondTinNotice, tax1099DivAllOf.secondTinNotice);
	}

	@Override
	public int hashCode() {
		return Objects.hash(payerNameAddress, payerTin, recipientTin, recipientNameAddress, foreignAccountTaxCompliance,
				accountNumber, ordinaryDividends, qualifiedDividends, totalCapitalGain, unrecaptured1250Gain,
				section1202Gain, collectiblesGain, nonTaxableDistribution, federalTaxWithheld, section199ADividends,
				investmentExpenses, foreignTaxPaid, foreignCountry, cashLiquidation, nonCashLiquidation,
				taxExemptInterestDividend, specifiedPabInterestDividend, stateTaxWithholding, foreignIncomes,
				stateTaxExemptIncomes, secondTinNotice);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Tax1099DivAllOf {\n");

		sb.append("    payerNameAddress: ").append(toIndentedString(payerNameAddress)).append("\n");
		sb.append("    payerTin: ").append(toIndentedString(payerTin)).append("\n");
		sb.append("    recipientTin: ").append(toIndentedString(recipientTin)).append("\n");
		sb.append("    recipientNameAddress: ").append(toIndentedString(recipientNameAddress)).append("\n");
		sb.append("    foreignAccountTaxCompliance: ").append(toIndentedString(foreignAccountTaxCompliance))
				.append("\n");
		sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
		sb.append("    ordinaryDividends: ").append(toIndentedString(ordinaryDividends)).append("\n");
		sb.append("    qualifiedDividends: ").append(toIndentedString(qualifiedDividends)).append("\n");
		sb.append("    totalCapitalGain: ").append(toIndentedString(totalCapitalGain)).append("\n");
		sb.append("    unrecaptured1250Gain: ").append(toIndentedString(unrecaptured1250Gain)).append("\n");
		sb.append("    section1202Gain: ").append(toIndentedString(section1202Gain)).append("\n");
		sb.append("    collectiblesGain: ").append(toIndentedString(collectiblesGain)).append("\n");
		sb.append("    nonTaxableDistribution: ").append(toIndentedString(nonTaxableDistribution)).append("\n");
		sb.append("    federalTaxWithheld: ").append(toIndentedString(federalTaxWithheld)).append("\n");
		sb.append("    section199ADividends: ").append(toIndentedString(section199ADividends)).append("\n");
		sb.append("    investmentExpenses: ").append(toIndentedString(investmentExpenses)).append("\n");
		sb.append("    foreignTaxPaid: ").append(toIndentedString(foreignTaxPaid)).append("\n");
		sb.append("    foreignCountry: ").append(toIndentedString(foreignCountry)).append("\n");
		sb.append("    cashLiquidation: ").append(toIndentedString(cashLiquidation)).append("\n");
		sb.append("    nonCashLiquidation: ").append(toIndentedString(nonCashLiquidation)).append("\n");
		sb.append("    taxExemptInterestDividend: ").append(toIndentedString(taxExemptInterestDividend)).append("\n");
		sb.append("    specifiedPabInterestDividend: ").append(toIndentedString(specifiedPabInterestDividend))
				.append("\n");
		sb.append("    stateTaxWithholding: ").append(toIndentedString(stateTaxWithholding)).append("\n");
		sb.append("    foreignIncomes: ").append(toIndentedString(foreignIncomes)).append("\n");
		sb.append("    stateTaxExemptIncomes: ").append(toIndentedString(stateTaxExemptIncomes)).append("\n");
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
