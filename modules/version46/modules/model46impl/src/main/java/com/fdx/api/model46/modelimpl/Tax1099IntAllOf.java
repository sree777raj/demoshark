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
 * Tax1099IntAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1099IntAllOf {
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

	@JsonProperty("payerRtn")
	private String payerRtn;

	@JsonProperty("interestIncome")
	private Double interestIncome;

	@JsonProperty("earlyWithdrawalPenalty")
	private Double earlyWithdrawalPenalty;

	@JsonProperty("usBondInterest")
	private Double usBondInterest;

	@JsonProperty("federalTaxWithheld")
	private Double federalTaxWithheld;

	@JsonProperty("investmentExpenses")
	private Double investmentExpenses;

	@JsonProperty("foreignTaxPaid")
	private Double foreignTaxPaid;

	@JsonProperty("foreignCountry")
	private String foreignCountry;

	@JsonProperty("taxExemptInterest")
	private Double taxExemptInterest;

	@JsonProperty("specifiedPabInterest")
	private Double specifiedPabInterest;

	@JsonProperty("marketDiscount")
	private Double marketDiscount;

	@JsonProperty("bondPremium")
	private Double bondPremium;

	@JsonProperty("usBondPremium")
	private Double usBondPremium;

	@JsonProperty("taxExemptBondPremium")
	private Double taxExemptBondPremium;

	@JsonProperty("cusipNumber")
	private String cusipNumber;

	@JsonProperty("stateTaxWithholding")
	@Valid
	private List<StateTaxWithholding> stateTaxWithholding = null;

	@JsonProperty("foreignIncomes")
	@Valid
	private List<DescriptionAmount> foreignIncomes = null;

	@JsonProperty("stateTaxExemptIncome")
	@Valid
	private List<DescriptionAmount> stateTaxExemptIncome = null;

	@JsonProperty("secondTinNotice")
	@JsonInclude(Include.NON_NULL)
	private Boolean secondTinNotice;

	public Tax1099IntAllOf payerNameAddress(NameAddressPhone payerNameAddress) {
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

	public Tax1099IntAllOf payerTin(String payerTin) {
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

	public Tax1099IntAllOf recipientTin(String recipientTin) {
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

	public Tax1099IntAllOf recipientNameAddress(NameAddress recipientNameAddress) {
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

	public Tax1099IntAllOf foreignAccountTaxCompliance(Boolean foreignAccountTaxCompliance) {
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

	public Tax1099IntAllOf accountNumber(String accountNumber) {
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

	public Tax1099IntAllOf payerRtn(String payerRtn) {
		this.payerRtn = payerRtn;
		return this;
	}

	/**
	 * Payer's RTN
	 * 
	 * @return payerRtn
	 */
	@ApiModelProperty(value = "Payer's RTN")

	public String getPayerRtn() {
		return payerRtn;
	}

	public void setPayerRtn(String payerRtn) {
		this.payerRtn = payerRtn;
	}

	public Tax1099IntAllOf interestIncome(Double interestIncome) {
		this.interestIncome = interestIncome;
		return this;
	}

	/**
	 * Box 1, Interest income
	 * 
	 * @return interestIncome
	 */
	@ApiModelProperty(value = "Box 1, Interest income")

	public Double getInterestIncome() {
		return interestIncome;
	}

	public void setInterestIncome(Double interestIncome) {
		this.interestIncome = interestIncome;
	}

	public Tax1099IntAllOf earlyWithdrawalPenalty(Double earlyWithdrawalPenalty) {
		this.earlyWithdrawalPenalty = earlyWithdrawalPenalty;
		return this;
	}

	/**
	 * Box 2, Early withdrawal penalty
	 * 
	 * @return earlyWithdrawalPenalty
	 */
	@ApiModelProperty(value = "Box 2, Early withdrawal penalty")

	public Double getEarlyWithdrawalPenalty() {
		return earlyWithdrawalPenalty;
	}

	public void setEarlyWithdrawalPenalty(Double earlyWithdrawalPenalty) {
		this.earlyWithdrawalPenalty = earlyWithdrawalPenalty;
	}

	public Tax1099IntAllOf usBondInterest(Double usBondInterest) {
		this.usBondInterest = usBondInterest;
		return this;
	}

	/**
	 * Box 3, Interest on U.S. Savings Bonds and Treasury obligations
	 * 
	 * @return usBondInterest
	 */
	@ApiModelProperty(value = "Box 3, Interest on U.S. Savings Bonds and Treasury obligations")

	public Double getUsBondInterest() {
		return usBondInterest;
	}

	public void setUsBondInterest(Double usBondInterest) {
		this.usBondInterest = usBondInterest;
	}

	public Tax1099IntAllOf federalTaxWithheld(Double federalTaxWithheld) {
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

	public Tax1099IntAllOf investmentExpenses(Double investmentExpenses) {
		this.investmentExpenses = investmentExpenses;
		return this;
	}

	/**
	 * Box 5, Investment expenses
	 * 
	 * @return investmentExpenses
	 */
	@ApiModelProperty(value = "Box 5, Investment expenses")

	public Double getInvestmentExpenses() {
		return investmentExpenses;
	}

	public void setInvestmentExpenses(Double investmentExpenses) {
		this.investmentExpenses = investmentExpenses;
	}

	public Tax1099IntAllOf foreignTaxPaid(Double foreignTaxPaid) {
		this.foreignTaxPaid = foreignTaxPaid;
		return this;
	}

	/**
	 * Box 6, Foreign tax paid
	 * 
	 * @return foreignTaxPaid
	 */
	@ApiModelProperty(value = "Box 6, Foreign tax paid")

	public Double getForeignTaxPaid() {
		return foreignTaxPaid;
	}

	public void setForeignTaxPaid(Double foreignTaxPaid) {
		this.foreignTaxPaid = foreignTaxPaid;
	}

	public Tax1099IntAllOf foreignCountry(String foreignCountry) {
		this.foreignCountry = foreignCountry;
		return this;
	}

	/**
	 * Box 7, Foreign country or U.S. possession
	 * 
	 * @return foreignCountry
	 */
	@ApiModelProperty(value = "Box 7, Foreign country or U.S. possession")

	public String getForeignCountry() {
		return foreignCountry;
	}

	public void setForeignCountry(String foreignCountry) {
		this.foreignCountry = foreignCountry;
	}

	public Tax1099IntAllOf taxExemptInterest(Double taxExemptInterest) {
		this.taxExemptInterest = taxExemptInterest;
		return this;
	}

	/**
	 * Box 8, Tax-exempt interest
	 * 
	 * @return taxExemptInterest
	 */
	@ApiModelProperty(value = "Box 8, Tax-exempt interest")

	public Double getTaxExemptInterest() {
		return taxExemptInterest;
	}

	public void setTaxExemptInterest(Double taxExemptInterest) {
		this.taxExemptInterest = taxExemptInterest;
	}

	public Tax1099IntAllOf specifiedPabInterest(Double specifiedPabInterest) {
		this.specifiedPabInterest = specifiedPabInterest;
		return this;
	}

	/**
	 * Box 9, Specified private activity bond interest
	 * 
	 * @return specifiedPabInterest
	 */
	@ApiModelProperty(value = "Box 9, Specified private activity bond interest")

	public Double getSpecifiedPabInterest() {
		return specifiedPabInterest;
	}

	public void setSpecifiedPabInterest(Double specifiedPabInterest) {
		this.specifiedPabInterest = specifiedPabInterest;
	}

	public Tax1099IntAllOf marketDiscount(Double marketDiscount) {
		this.marketDiscount = marketDiscount;
		return this;
	}

	/**
	 * Box 10, Market discount
	 * 
	 * @return marketDiscount
	 */
	@ApiModelProperty(value = "Box 10, Market discount")

	public Double getMarketDiscount() {
		return marketDiscount;
	}

	public void setMarketDiscount(Double marketDiscount) {
		this.marketDiscount = marketDiscount;
	}

	public Tax1099IntAllOf bondPremium(Double bondPremium) {
		this.bondPremium = bondPremium;
		return this;
	}

	/**
	 * Box 11, Bond premium
	 * 
	 * @return bondPremium
	 */
	@ApiModelProperty(value = "Box 11, Bond premium")

	public Double getBondPremium() {
		return bondPremium;
	}

	public void setBondPremium(Double bondPremium) {
		this.bondPremium = bondPremium;
	}

	public Tax1099IntAllOf usBondPremium(Double usBondPremium) {
		this.usBondPremium = usBondPremium;
		return this;
	}

	/**
	 * Box 12, Bond premium on Treasury obligations
	 * 
	 * @return usBondPremium
	 */
	@ApiModelProperty(value = "Box 12, Bond premium on Treasury obligations")

	public Double getUsBondPremium() {
		return usBondPremium;
	}

	public void setUsBondPremium(Double usBondPremium) {
		this.usBondPremium = usBondPremium;
	}

	public Tax1099IntAllOf taxExemptBondPremium(Double taxExemptBondPremium) {
		this.taxExemptBondPremium = taxExemptBondPremium;
		return this;
	}

	/**
	 * Box 13, Bond premium on tax-exempt bond
	 * 
	 * @return taxExemptBondPremium
	 */
	@ApiModelProperty(value = "Box 13, Bond premium on tax-exempt bond")

	public Double getTaxExemptBondPremium() {
		return taxExemptBondPremium;
	}

	public void setTaxExemptBondPremium(Double taxExemptBondPremium) {
		this.taxExemptBondPremium = taxExemptBondPremium;
	}

	public Tax1099IntAllOf cusipNumber(String cusipNumber) {
		this.cusipNumber = cusipNumber;
		return this;
	}

	/**
	 * Box 14, Tax-exempt bond CUSIP no.
	 * 
	 * @return cusipNumber
	 */
	@ApiModelProperty(value = "Box 14, Tax-exempt bond CUSIP no.")

	public String getCusipNumber() {
		return cusipNumber;
	}

	public void setCusipNumber(String cusipNumber) {
		this.cusipNumber = cusipNumber;
	}

	public Tax1099IntAllOf stateTaxWithholding(List<StateTaxWithholding> stateTaxWithholding) {
		this.stateTaxWithholding = stateTaxWithholding;
		return this;
	}

	public Tax1099IntAllOf addStateTaxWithholdingItem(StateTaxWithholding stateTaxWithholdingItem) {
		if (this.stateTaxWithholding == null) {
			this.stateTaxWithholding = new ArrayList<>();
		}
		this.stateTaxWithholding.add(stateTaxWithholdingItem);
		return this;
	}

	/**
	 * Boxes 15-17, State tax withholding
	 * 
	 * @return stateTaxWithholding
	 */
	@ApiModelProperty(value = "Boxes 15-17, State tax withholding")

	@Valid

	public List<StateTaxWithholding> getStateTaxWithholding() {
		return stateTaxWithholding;
	}

	public void setStateTaxWithholding(List<StateTaxWithholding> stateTaxWithholding) {
		this.stateTaxWithholding = stateTaxWithholding;
	}

	public Tax1099IntAllOf foreignIncomes(List<DescriptionAmount> foreignIncomes) {
		this.foreignIncomes = foreignIncomes;
		return this;
	}

	public Tax1099IntAllOf addForeignIncomesItem(DescriptionAmount foreignIncomesItem) {
		if (this.foreignIncomes == null) {
			this.foreignIncomes = new ArrayList<>();
		}
		this.foreignIncomes.add(foreignIncomesItem);
		return this;
	}

	/**
	 * Supplemental foreign income amount information (description is country)
	 * 
	 * @return foreignIncomes
	 */
	@ApiModelProperty(value = "Supplemental foreign income amount information (description is country)")

	@Valid

	public List<DescriptionAmount> getForeignIncomes() {
		return foreignIncomes;
	}

	public void setForeignIncomes(List<DescriptionAmount> foreignIncomes) {
		this.foreignIncomes = foreignIncomes;
	}

	public Tax1099IntAllOf stateTaxExemptIncome(List<DescriptionAmount> stateTaxExemptIncome) {
		this.stateTaxExemptIncome = stateTaxExemptIncome;
		return this;
	}

	public Tax1099IntAllOf addStateTaxExemptIncomeItem(DescriptionAmount stateTaxExemptIncomeItem) {
		if (this.stateTaxExemptIncome == null) {
			this.stateTaxExemptIncome = new ArrayList<>();
		}
		this.stateTaxExemptIncome.add(stateTaxExemptIncomeItem);
		return this;
	}

	/**
	 * Supplemental tax-exempt income by state (description is state)
	 * 
	 * @return stateTaxExemptIncome
	 */
	@ApiModelProperty(value = "Supplemental tax-exempt income by state (description is state)")

	@Valid

	public List<DescriptionAmount> getStateTaxExemptIncome() {
		return stateTaxExemptIncome;
	}

	public void setStateTaxExemptIncome(List<DescriptionAmount> stateTaxExemptIncome) {
		this.stateTaxExemptIncome = stateTaxExemptIncome;
	}

	public Tax1099IntAllOf secondTinNotice(Boolean secondTinNotice) {
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
		Tax1099IntAllOf tax1099IntAllOf = (Tax1099IntAllOf) o;
		return Objects.equals(this.payerNameAddress, tax1099IntAllOf.payerNameAddress)
				&& Objects.equals(this.payerTin, tax1099IntAllOf.payerTin)
				&& Objects.equals(this.recipientTin, tax1099IntAllOf.recipientTin)
				&& Objects.equals(this.recipientNameAddress, tax1099IntAllOf.recipientNameAddress)
				&& Objects.equals(this.foreignAccountTaxCompliance, tax1099IntAllOf.foreignAccountTaxCompliance)
				&& Objects.equals(this.accountNumber, tax1099IntAllOf.accountNumber)
				&& Objects.equals(this.payerRtn, tax1099IntAllOf.payerRtn)
				&& Objects.equals(this.interestIncome, tax1099IntAllOf.interestIncome)
				&& Objects.equals(this.earlyWithdrawalPenalty, tax1099IntAllOf.earlyWithdrawalPenalty)
				&& Objects.equals(this.usBondInterest, tax1099IntAllOf.usBondInterest)
				&& Objects.equals(this.federalTaxWithheld, tax1099IntAllOf.federalTaxWithheld)
				&& Objects.equals(this.investmentExpenses, tax1099IntAllOf.investmentExpenses)
				&& Objects.equals(this.foreignTaxPaid, tax1099IntAllOf.foreignTaxPaid)
				&& Objects.equals(this.foreignCountry, tax1099IntAllOf.foreignCountry)
				&& Objects.equals(this.taxExemptInterest, tax1099IntAllOf.taxExemptInterest)
				&& Objects.equals(this.specifiedPabInterest, tax1099IntAllOf.specifiedPabInterest)
				&& Objects.equals(this.marketDiscount, tax1099IntAllOf.marketDiscount)
				&& Objects.equals(this.bondPremium, tax1099IntAllOf.bondPremium)
				&& Objects.equals(this.usBondPremium, tax1099IntAllOf.usBondPremium)
				&& Objects.equals(this.taxExemptBondPremium, tax1099IntAllOf.taxExemptBondPremium)
				&& Objects.equals(this.cusipNumber, tax1099IntAllOf.cusipNumber)
				&& Objects.equals(this.stateTaxWithholding, tax1099IntAllOf.stateTaxWithholding)
				&& Objects.equals(this.foreignIncomes, tax1099IntAllOf.foreignIncomes)
				&& Objects.equals(this.stateTaxExemptIncome, tax1099IntAllOf.stateTaxExemptIncome)
				&& Objects.equals(this.secondTinNotice, tax1099IntAllOf.secondTinNotice);
	}

	@Override
	public int hashCode() {
		return Objects.hash(payerNameAddress, payerTin, recipientTin, recipientNameAddress, foreignAccountTaxCompliance,
				accountNumber, payerRtn, interestIncome, earlyWithdrawalPenalty, usBondInterest, federalTaxWithheld,
				investmentExpenses, foreignTaxPaid, foreignCountry, taxExemptInterest, specifiedPabInterest,
				marketDiscount, bondPremium, usBondPremium, taxExemptBondPremium, cusipNumber, stateTaxWithholding,
				foreignIncomes, stateTaxExemptIncome, secondTinNotice);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Tax1099IntAllOf {\n");

		sb.append("    payerNameAddress: ").append(toIndentedString(payerNameAddress)).append("\n");
		sb.append("    payerTin: ").append(toIndentedString(payerTin)).append("\n");
		sb.append("    recipientTin: ").append(toIndentedString(recipientTin)).append("\n");
		sb.append("    recipientNameAddress: ").append(toIndentedString(recipientNameAddress)).append("\n");
		sb.append("    foreignAccountTaxCompliance: ").append(toIndentedString(foreignAccountTaxCompliance))
				.append("\n");
		sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
		sb.append("    payerRtn: ").append(toIndentedString(payerRtn)).append("\n");
		sb.append("    interestIncome: ").append(toIndentedString(interestIncome)).append("\n");
		sb.append("    earlyWithdrawalPenalty: ").append(toIndentedString(earlyWithdrawalPenalty)).append("\n");
		sb.append("    usBondInterest: ").append(toIndentedString(usBondInterest)).append("\n");
		sb.append("    federalTaxWithheld: ").append(toIndentedString(federalTaxWithheld)).append("\n");
		sb.append("    investmentExpenses: ").append(toIndentedString(investmentExpenses)).append("\n");
		sb.append("    foreignTaxPaid: ").append(toIndentedString(foreignTaxPaid)).append("\n");
		sb.append("    foreignCountry: ").append(toIndentedString(foreignCountry)).append("\n");
		sb.append("    taxExemptInterest: ").append(toIndentedString(taxExemptInterest)).append("\n");
		sb.append("    specifiedPabInterest: ").append(toIndentedString(specifiedPabInterest)).append("\n");
		sb.append("    marketDiscount: ").append(toIndentedString(marketDiscount)).append("\n");
		sb.append("    bondPremium: ").append(toIndentedString(bondPremium)).append("\n");
		sb.append("    usBondPremium: ").append(toIndentedString(usBondPremium)).append("\n");
		sb.append("    taxExemptBondPremium: ").append(toIndentedString(taxExemptBondPremium)).append("\n");
		sb.append("    cusipNumber: ").append(toIndentedString(cusipNumber)).append("\n");
		sb.append("    stateTaxWithholding: ").append(toIndentedString(stateTaxWithholding)).append("\n");
		sb.append("    foreignIncomes: ").append(toIndentedString(foreignIncomes)).append("\n");
		sb.append("    stateTaxExemptIncome: ").append(toIndentedString(stateTaxExemptIncome)).append("\n");
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
