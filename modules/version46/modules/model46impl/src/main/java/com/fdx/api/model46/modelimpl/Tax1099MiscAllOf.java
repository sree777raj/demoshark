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
 * Tax1099MiscAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1099MiscAllOf {
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

	@JsonProperty("rents")
	private Double rents;

	@JsonProperty("royalties")
	private Double royalties;

	@JsonProperty("otherIncome")
	private Double otherIncome;

	@JsonProperty("federalTaxWithheld")
	private Double federalTaxWithheld;

	@JsonProperty("fishingBoatProceeds")
	private Double fishingBoatProceeds;

	@JsonProperty("medicalHealthPayment")
	private Double medicalHealthPayment;

	@JsonProperty("nonEmployeeCompensation")
	private Double nonEmployeeCompensation;

	@JsonProperty("payerDirectSales")
	@JsonInclude(Include.NON_NULL)
	private Boolean payerDirectSales;

	@JsonProperty("substitutePayments")
	private Double substitutePayments;

	@JsonProperty("cropInsurance")
	private Double cropInsurance;

	@JsonProperty("grossAttorney")
	private Double grossAttorney;

	@JsonProperty("section409ADeferrals")
	private Double section409ADeferrals;

	@JsonProperty("section409AIncome")
	private Double section409AIncome;

	@JsonProperty("excessGolden")
	private Double excessGolden;

	@JsonProperty("nonQualifiedDeferredCompensation")
	private Double nonQualifiedDeferredCompensation;

	@JsonProperty("stateTaxWithholding")
	@Valid
	private List<StateTaxWithholding> stateTaxWithholding = null;

	public Tax1099MiscAllOf payerNameAddress(NameAddressPhone payerNameAddress) {
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

	public Tax1099MiscAllOf payerTin(String payerTin) {
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

	public Tax1099MiscAllOf recipientTin(String recipientTin) {
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

	public Tax1099MiscAllOf recipientNameAddress(NameAddress recipientNameAddress) {
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

	public Tax1099MiscAllOf accountNumber(String accountNumber) {
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

	public Tax1099MiscAllOf foreignAccountTaxCompliance(Boolean foreignAccountTaxCompliance) {
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

	public Tax1099MiscAllOf rents(Double rents) {
		this.rents = rents;
		return this;
	}

	/**
	 * Box 1, Rents
	 * 
	 * @return rents
	 */
	@ApiModelProperty(value = "Box 1, Rents")

	public Double getRents() {
		return rents;
	}

	public void setRents(Double rents) {
		this.rents = rents;
	}

	public Tax1099MiscAllOf royalties(Double royalties) {
		this.royalties = royalties;
		return this;
	}

	/**
	 * Box 2, Royalties
	 * 
	 * @return royalties
	 */
	@ApiModelProperty(value = "Box 2, Royalties")

	public Double getRoyalties() {
		return royalties;
	}

	public void setRoyalties(Double royalties) {
		this.royalties = royalties;
	}

	public Tax1099MiscAllOf otherIncome(Double otherIncome) {
		this.otherIncome = otherIncome;
		return this;
	}

	/**
	 * Box 3, Other income
	 * 
	 * @return otherIncome
	 */
	@ApiModelProperty(value = "Box 3, Other income")

	public Double getOtherIncome() {
		return otherIncome;
	}

	public void setOtherIncome(Double otherIncome) {
		this.otherIncome = otherIncome;
	}

	public Tax1099MiscAllOf federalTaxWithheld(Double federalTaxWithheld) {
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

	public Tax1099MiscAllOf fishingBoatProceeds(Double fishingBoatProceeds) {
		this.fishingBoatProceeds = fishingBoatProceeds;
		return this;
	}

	/**
	 * Box 5, Fishing boat proceeds
	 * 
	 * @return fishingBoatProceeds
	 */
	@ApiModelProperty(value = "Box 5, Fishing boat proceeds")

	public Double getFishingBoatProceeds() {
		return fishingBoatProceeds;
	}

	public void setFishingBoatProceeds(Double fishingBoatProceeds) {
		this.fishingBoatProceeds = fishingBoatProceeds;
	}

	public Tax1099MiscAllOf medicalHealthPayment(Double medicalHealthPayment) {
		this.medicalHealthPayment = medicalHealthPayment;
		return this;
	}

	/**
	 * Box 6, Medical and health care payments
	 * 
	 * @return medicalHealthPayment
	 */
	@ApiModelProperty(value = "Box 6, Medical and health care payments")

	public Double getMedicalHealthPayment() {
		return medicalHealthPayment;
	}

	public void setMedicalHealthPayment(Double medicalHealthPayment) {
		this.medicalHealthPayment = medicalHealthPayment;
	}

	public Tax1099MiscAllOf nonEmployeeCompensation(Double nonEmployeeCompensation) {
		this.nonEmployeeCompensation = nonEmployeeCompensation;
		return this;
	}

	/**
	 * 2019 Box 7, Nonemployee compensation (IRS removed 2020)
	 * 
	 * @return nonEmployeeCompensation
	 */
	@ApiModelProperty(value = "2019 Box 7, Nonemployee compensation (IRS removed 2020)")

	public Double getNonEmployeeCompensation() {
		return nonEmployeeCompensation;
	}

	public void setNonEmployeeCompensation(Double nonEmployeeCompensation) {
		this.nonEmployeeCompensation = nonEmployeeCompensation;
	}

	public Tax1099MiscAllOf payerDirectSales(Boolean payerDirectSales) {
		this.payerDirectSales = payerDirectSales;
		return this;
	}

	/**
	 * Box 7, Payer made direct sales of $5,000 or more of consumer products to a
	 * buyer (recipient) for resale
	 * 
	 * @return payerDirectSales
	 */
	@ApiModelProperty(value = "Box 7, Payer made direct sales of $5,000 or more of consumer products to a buyer (recipient) for resale")

	public Boolean getPayerDirectSales() {
		return payerDirectSales;
	}

	public void setPayerDirectSales(Boolean payerDirectSales) {
		this.payerDirectSales = payerDirectSales;
	}

	public Tax1099MiscAllOf substitutePayments(Double substitutePayments) {
		this.substitutePayments = substitutePayments;
		return this;
	}

	/**
	 * Box 8, Substitute payments in lieu of dividends or interest
	 * 
	 * @return substitutePayments
	 */
	@ApiModelProperty(value = "Box 8, Substitute payments in lieu of dividends or interest")

	public Double getSubstitutePayments() {
		return substitutePayments;
	}

	public void setSubstitutePayments(Double substitutePayments) {
		this.substitutePayments = substitutePayments;
	}

	public Tax1099MiscAllOf cropInsurance(Double cropInsurance) {
		this.cropInsurance = cropInsurance;
		return this;
	}

	/**
	 * Box 9, Crop insurance proceeds
	 * 
	 * @return cropInsurance
	 */
	@ApiModelProperty(value = "Box 9, Crop insurance proceeds")

	public Double getCropInsurance() {
		return cropInsurance;
	}

	public void setCropInsurance(Double cropInsurance) {
		this.cropInsurance = cropInsurance;
	}

	public Tax1099MiscAllOf grossAttorney(Double grossAttorney) {
		this.grossAttorney = grossAttorney;
		return this;
	}

	/**
	 * Box 10, Gross proceeds paid to an attorney
	 * 
	 * @return grossAttorney
	 */
	@ApiModelProperty(value = "Box 10, Gross proceeds paid to an attorney")

	public Double getGrossAttorney() {
		return grossAttorney;
	}

	public void setGrossAttorney(Double grossAttorney) {
		this.grossAttorney = grossAttorney;
	}

	public Tax1099MiscAllOf section409ADeferrals(Double section409ADeferrals) {
		this.section409ADeferrals = section409ADeferrals;
		return this;
	}

	/**
	 * Box 12, Section 409A deferrals
	 * 
	 * @return section409ADeferrals
	 */
	@ApiModelProperty(value = "Box 12, Section 409A deferrals")

	public Double getSection409ADeferrals() {
		return section409ADeferrals;
	}

	public void setSection409ADeferrals(Double section409ADeferrals) {
		this.section409ADeferrals = section409ADeferrals;
	}

	public Tax1099MiscAllOf section409AIncome(Double section409AIncome) {
		this.section409AIncome = section409AIncome;
		return this;
	}

	/**
	 * 2019 Box 15b, Section 409A income (IRS removed 2020)
	 * 
	 * @return section409AIncome
	 */
	@ApiModelProperty(value = "2019 Box 15b, Section 409A income (IRS removed 2020)")

	public Double getSection409AIncome() {
		return section409AIncome;
	}

	public void setSection409AIncome(Double section409AIncome) {
		this.section409AIncome = section409AIncome;
	}

	public Tax1099MiscAllOf excessGolden(Double excessGolden) {
		this.excessGolden = excessGolden;
		return this;
	}

	/**
	 * Box 13, Excess golden parachute payments
	 * 
	 * @return excessGolden
	 */
	@ApiModelProperty(value = "Box 13, Excess golden parachute payments")

	public Double getExcessGolden() {
		return excessGolden;
	}

	public void setExcessGolden(Double excessGolden) {
		this.excessGolden = excessGolden;
	}

	public Tax1099MiscAllOf nonQualifiedDeferredCompensation(Double nonQualifiedDeferredCompensation) {
		this.nonQualifiedDeferredCompensation = nonQualifiedDeferredCompensation;
		return this;
	}

	/**
	 * Box 14, Nonqualified Deferred Compensation
	 * 
	 * @return nonQualifiedDeferredCompensation
	 */
	@ApiModelProperty(value = "Box 14, Nonqualified Deferred Compensation")

	public Double getNonQualifiedDeferredCompensation() {
		return nonQualifiedDeferredCompensation;
	}

	public void setNonQualifiedDeferredCompensation(Double nonQualifiedDeferredCompensation) {
		this.nonQualifiedDeferredCompensation = nonQualifiedDeferredCompensation;
	}

	public Tax1099MiscAllOf stateTaxWithholding(List<StateTaxWithholding> stateTaxWithholding) {
		this.stateTaxWithholding = stateTaxWithholding;
		return this;
	}

	public Tax1099MiscAllOf addStateTaxWithholdingItem(StateTaxWithholding stateTaxWithholdingItem) {
		if (this.stateTaxWithholding == null) {
			this.stateTaxWithholding = new ArrayList<>();
		}
		this.stateTaxWithholding.add(stateTaxWithholdingItem);
		return this;
	}

	/**
	 * Boxes 16-18, State tax withholding
	 * 
	 * @return stateTaxWithholding
	 */
	@ApiModelProperty(value = "Boxes 16-18, State tax withholding")

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
		Tax1099MiscAllOf tax1099MiscAllOf = (Tax1099MiscAllOf) o;
		return Objects.equals(this.payerNameAddress, tax1099MiscAllOf.payerNameAddress)
				&& Objects.equals(this.payerTin, tax1099MiscAllOf.payerTin)
				&& Objects.equals(this.recipientTin, tax1099MiscAllOf.recipientTin)
				&& Objects.equals(this.recipientNameAddress, tax1099MiscAllOf.recipientNameAddress)
				&& Objects.equals(this.accountNumber, tax1099MiscAllOf.accountNumber)
				&& Objects.equals(this.foreignAccountTaxCompliance, tax1099MiscAllOf.foreignAccountTaxCompliance)
				&& Objects.equals(this.rents, tax1099MiscAllOf.rents)
				&& Objects.equals(this.royalties, tax1099MiscAllOf.royalties)
				&& Objects.equals(this.otherIncome, tax1099MiscAllOf.otherIncome)
				&& Objects.equals(this.federalTaxWithheld, tax1099MiscAllOf.federalTaxWithheld)
				&& Objects.equals(this.fishingBoatProceeds, tax1099MiscAllOf.fishingBoatProceeds)
				&& Objects.equals(this.medicalHealthPayment, tax1099MiscAllOf.medicalHealthPayment)
				&& Objects.equals(this.nonEmployeeCompensation, tax1099MiscAllOf.nonEmployeeCompensation)
				&& Objects.equals(this.payerDirectSales, tax1099MiscAllOf.payerDirectSales)
				&& Objects.equals(this.substitutePayments, tax1099MiscAllOf.substitutePayments)
				&& Objects.equals(this.cropInsurance, tax1099MiscAllOf.cropInsurance)
				&& Objects.equals(this.grossAttorney, tax1099MiscAllOf.grossAttorney)
				&& Objects.equals(this.section409ADeferrals, tax1099MiscAllOf.section409ADeferrals)
				&& Objects.equals(this.section409AIncome, tax1099MiscAllOf.section409AIncome)
				&& Objects.equals(this.excessGolden, tax1099MiscAllOf.excessGolden)
				&& Objects.equals(this.nonQualifiedDeferredCompensation,
						tax1099MiscAllOf.nonQualifiedDeferredCompensation)
				&& Objects.equals(this.stateTaxWithholding, tax1099MiscAllOf.stateTaxWithholding);
	}

	@Override
	public int hashCode() {
		return Objects.hash(payerNameAddress, payerTin, recipientTin, recipientNameAddress, accountNumber,
				foreignAccountTaxCompliance, rents, royalties, otherIncome, federalTaxWithheld, fishingBoatProceeds,
				medicalHealthPayment, nonEmployeeCompensation, payerDirectSales, substitutePayments, cropInsurance,
				grossAttorney, section409ADeferrals, section409AIncome, excessGolden, nonQualifiedDeferredCompensation,
				stateTaxWithholding);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Tax1099MiscAllOf {\n");

		sb.append("    payerNameAddress: ").append(toIndentedString(payerNameAddress)).append("\n");
		sb.append("    payerTin: ").append(toIndentedString(payerTin)).append("\n");
		sb.append("    recipientTin: ").append(toIndentedString(recipientTin)).append("\n");
		sb.append("    recipientNameAddress: ").append(toIndentedString(recipientNameAddress)).append("\n");
		sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
		sb.append("    foreignAccountTaxCompliance: ").append(toIndentedString(foreignAccountTaxCompliance))
				.append("\n");
		sb.append("    rents: ").append(toIndentedString(rents)).append("\n");
		sb.append("    royalties: ").append(toIndentedString(royalties)).append("\n");
		sb.append("    otherIncome: ").append(toIndentedString(otherIncome)).append("\n");
		sb.append("    federalTaxWithheld: ").append(toIndentedString(federalTaxWithheld)).append("\n");
		sb.append("    fishingBoatProceeds: ").append(toIndentedString(fishingBoatProceeds)).append("\n");
		sb.append("    medicalHealthPayment: ").append(toIndentedString(medicalHealthPayment)).append("\n");
		sb.append("    nonEmployeeCompensation: ").append(toIndentedString(nonEmployeeCompensation)).append("\n");
		sb.append("    payerDirectSales: ").append(toIndentedString(payerDirectSales)).append("\n");
		sb.append("    substitutePayments: ").append(toIndentedString(substitutePayments)).append("\n");
		sb.append("    cropInsurance: ").append(toIndentedString(cropInsurance)).append("\n");
		sb.append("    grossAttorney: ").append(toIndentedString(grossAttorney)).append("\n");
		sb.append("    section409ADeferrals: ").append(toIndentedString(section409ADeferrals)).append("\n");
		sb.append("    section409AIncome: ").append(toIndentedString(section409AIncome)).append("\n");
		sb.append("    excessGolden: ").append(toIndentedString(excessGolden)).append("\n");
		sb.append("    nonQualifiedDeferredCompensation: ").append(toIndentedString(nonQualifiedDeferredCompensation))
				.append("\n");
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
