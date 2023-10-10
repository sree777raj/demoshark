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
 * Tax1099RAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1099RAllOf {
	@JsonProperty("payerNameAddress")
	private NameAddressPhone payerNameAddress;

	@JsonProperty("payerTin")
	private String payerTin;

	@JsonProperty("recipientTin")
	private String recipientTin;

	@JsonProperty("recipientNameAddress")
	private NameAddress recipientNameAddress;

	@JsonProperty("allocableToIRR")
	private Double allocableToIRR;

	@JsonProperty("firstYearOfRoth")
	private Integer firstYearOfRoth;

	@JsonProperty("foreignAccountTaxCompliance")
	@JsonInclude(Include.NON_NULL)
	private Boolean foreignAccountTaxCompliance;

	@JsonProperty("recipientAccountNumber")
	private String recipientAccountNumber;

	@JsonProperty("dateOfPayment")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private LocalDate dateOfPayment;

	@JsonProperty("grossDistribution")
	private Double grossDistribution;

	@JsonProperty("taxableAmount")
	private Double taxableAmount;

	@JsonProperty("taxableAmountNotDetermined")
	@JsonInclude(Include.NON_NULL)
	private Boolean taxableAmountNotDetermined;

	@JsonProperty("totalDistribution")
	@JsonInclude(Include.NON_NULL)
	private Boolean totalDistribution;

	@JsonProperty("capitalGain")
	private Double capitalGain;

	@JsonProperty("federalTaxWithheld")
	private Double federalTaxWithheld;

	@JsonProperty("employeeContributions")
	private Double employeeContributions;

	@JsonProperty("netUnrealizedAppreciation")
	private Double netUnrealizedAppreciation;

	@JsonProperty("distributionCodes")
	@Valid
	private List<String> distributionCodes = null;

	@JsonProperty("iraSepSimple")
	@JsonInclude(Include.NON_NULL)
	private Boolean iraSepSimple;

	@JsonProperty("otherAmount")
	private Double otherAmount;

	@JsonProperty("otherPercent")
	private Double otherPercent;

	@JsonProperty("yourPercentOfTotal")
	private Double yourPercentOfTotal;

	@JsonProperty("totalEmployeeContributions")
	private Double totalEmployeeContributions;

	@JsonProperty("stateTaxWithholding")
	@Valid
	private List<StateTaxWithholding> stateTaxWithholding = null;

	@JsonProperty("localTaxWithholding")
	@Valid
	private List<LocalTaxWithholding> localTaxWithholding = null;

	public Tax1099RAllOf payerNameAddress(NameAddressPhone payerNameAddress) {
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

	public Tax1099RAllOf payerTin(String payerTin) {
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

	public Tax1099RAllOf recipientTin(String recipientTin) {
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

	public Tax1099RAllOf recipientNameAddress(NameAddress recipientNameAddress) {
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

	public Tax1099RAllOf allocableToIRR(Double allocableToIRR) {
		this.allocableToIRR = allocableToIRR;
		return this;
	}

	/**
	 * Box 10, Amount allocable to IRR within 5 years
	 * 
	 * @return allocableToIRR
	 */
	@ApiModelProperty(value = "Box 10, Amount allocable to IRR within 5 years")

	public Double getAllocableToIRR() {
		return allocableToIRR;
	}

	public void setAllocableToIRR(Double allocableToIRR) {
		this.allocableToIRR = allocableToIRR;
	}

	public Tax1099RAllOf firstYearOfRoth(Integer firstYearOfRoth) {
		this.firstYearOfRoth = firstYearOfRoth;
		return this;
	}

	/**
	 * Box 11, First year of designated Roth
	 * 
	 * @return firstYearOfRoth
	 */
	@ApiModelProperty(value = "Box 11, First year of designated Roth")

	public Integer getFirstYearOfRoth() {
		return firstYearOfRoth;
	}

	public void setFirstYearOfRoth(Integer firstYearOfRoth) {
		this.firstYearOfRoth = firstYearOfRoth;
	}

	public Tax1099RAllOf foreignAccountTaxCompliance(Boolean foreignAccountTaxCompliance) {
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

	public Tax1099RAllOf recipientAccountNumber(String recipientAccountNumber) {
		this.recipientAccountNumber = recipientAccountNumber;
		return this;
	}

	/**
	 * Account number
	 * 
	 * @return recipientAccountNumber
	 */
	@ApiModelProperty(value = "Account number")

	public String getRecipientAccountNumber() {
		return recipientAccountNumber;
	}

	public void setRecipientAccountNumber(String recipientAccountNumber) {
		this.recipientAccountNumber = recipientAccountNumber;
	}

	public Tax1099RAllOf dateOfPayment(LocalDate dateOfPayment) {
		this.dateOfPayment = dateOfPayment;
		return this;
	}

	/**
	 * ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included
	 * according to [IETF RFC3339]
	 * (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)
	 * 
	 * @return dateOfPayment
	 */
	@ApiModelProperty(value = "ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included according to [IETF RFC3339] (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)")

	@Valid
	@Size(max = 10)
	public LocalDate getDateOfPayment() {
		return dateOfPayment;
	}

	public void setDateOfPayment(LocalDate dateOfPayment) {
		this.dateOfPayment = dateOfPayment;
	}

	public Tax1099RAllOf grossDistribution(Double grossDistribution) {
		this.grossDistribution = grossDistribution;
		return this;
	}

	/**
	 * Box 1, Gross distribution
	 * 
	 * @return grossDistribution
	 */
	@ApiModelProperty(value = "Box 1, Gross distribution")

	public Double getGrossDistribution() {
		return grossDistribution;
	}

	public void setGrossDistribution(Double grossDistribution) {
		this.grossDistribution = grossDistribution;
	}

	public Tax1099RAllOf taxableAmount(Double taxableAmount) {
		this.taxableAmount = taxableAmount;
		return this;
	}

	/**
	 * Box 2a, Taxable amount
	 * 
	 * @return taxableAmount
	 */
	@ApiModelProperty(value = "Box 2a, Taxable amount")

	public Double getTaxableAmount() {
		return taxableAmount;
	}

	public void setTaxableAmount(Double taxableAmount) {
		this.taxableAmount = taxableAmount;
	}

	public Tax1099RAllOf taxableAmountNotDetermined(Boolean taxableAmountNotDetermined) {
		this.taxableAmountNotDetermined = taxableAmountNotDetermined;
		return this;
	}

	/**
	 * Box 2b, Taxable amount not determined
	 * 
	 * @return taxableAmountNotDetermined
	 */
	@ApiModelProperty(value = "Box 2b, Taxable amount not determined")

	public Boolean getTaxableAmountNotDetermined() {
		return taxableAmountNotDetermined;
	}

	public void setTaxableAmountNotDetermined(Boolean taxableAmountNotDetermined) {
		this.taxableAmountNotDetermined = taxableAmountNotDetermined;
	}

	public Tax1099RAllOf totalDistribution(Boolean totalDistribution) {
		this.totalDistribution = totalDistribution;
		return this;
	}

	/**
	 * Box 2c, Total distribution
	 * 
	 * @return totalDistribution
	 */
	@ApiModelProperty(value = "Box 2c, Total distribution")

	public Boolean getTotalDistribution() {
		return totalDistribution;
	}

	public void setTotalDistribution(Boolean totalDistribution) {
		this.totalDistribution = totalDistribution;
	}

	public Tax1099RAllOf capitalGain(Double capitalGain) {
		this.capitalGain = capitalGain;
		return this;
	}

	/**
	 * Box 3, Capital gain
	 * 
	 * @return capitalGain
	 */
	@ApiModelProperty(value = "Box 3, Capital gain")

	public Double getCapitalGain() {
		return capitalGain;
	}

	public void setCapitalGain(Double capitalGain) {
		this.capitalGain = capitalGain;
	}

	public Tax1099RAllOf federalTaxWithheld(Double federalTaxWithheld) {
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

	public Tax1099RAllOf employeeContributions(Double employeeContributions) {
		this.employeeContributions = employeeContributions;
		return this;
	}

	/**
	 * Box 5, Employee contributions
	 * 
	 * @return employeeContributions
	 */
	@ApiModelProperty(value = "Box 5, Employee contributions")

	public Double getEmployeeContributions() {
		return employeeContributions;
	}

	public void setEmployeeContributions(Double employeeContributions) {
		this.employeeContributions = employeeContributions;
	}

	public Tax1099RAllOf netUnrealizedAppreciation(Double netUnrealizedAppreciation) {
		this.netUnrealizedAppreciation = netUnrealizedAppreciation;
		return this;
	}

	/**
	 * Box 6, Net unrealized appreciation
	 * 
	 * @return netUnrealizedAppreciation
	 */
	@ApiModelProperty(value = "Box 6, Net unrealized appreciation")

	public Double getNetUnrealizedAppreciation() {
		return netUnrealizedAppreciation;
	}

	public void setNetUnrealizedAppreciation(Double netUnrealizedAppreciation) {
		this.netUnrealizedAppreciation = netUnrealizedAppreciation;
	}

	public Tax1099RAllOf distributionCodes(List<String> distributionCodes) {
		this.distributionCodes = distributionCodes;
		return this;
	}

	public Tax1099RAllOf addDistributionCodesItem(String distributionCodesItem) {
		if (this.distributionCodes == null) {
			this.distributionCodes = new ArrayList<>();
		}
		this.distributionCodes.add(distributionCodesItem);
		return this;
	}

	/**
	 * Box 7, Distribution codes
	 * 
	 * @return distributionCodes
	 */
	@ApiModelProperty(value = "Box 7, Distribution codes")

	public List<String> getDistributionCodes() {
		return distributionCodes;
	}

	public void setDistributionCodes(List<String> distributionCodes) {
		this.distributionCodes = distributionCodes;
	}

	public Tax1099RAllOf iraSepSimple(Boolean iraSepSimple) {
		this.iraSepSimple = iraSepSimple;
		return this;
	}

	/**
	 * Box 7b, IRA/SEP/SIMPLE
	 * 
	 * @return iraSepSimple
	 */
	@ApiModelProperty(value = "Box 7b, IRA/SEP/SIMPLE")

	public Boolean getIraSepSimple() {
		return iraSepSimple;
	}

	public void setIraSepSimple(Boolean iraSepSimple) {
		this.iraSepSimple = iraSepSimple;
	}

	public Tax1099RAllOf otherAmount(Double otherAmount) {
		this.otherAmount = otherAmount;
		return this;
	}

	/**
	 * Box 8, Other
	 * 
	 * @return otherAmount
	 */
	@ApiModelProperty(value = "Box 8, Other")

	public Double getOtherAmount() {
		return otherAmount;
	}

	public void setOtherAmount(Double otherAmount) {
		this.otherAmount = otherAmount;
	}

	public Tax1099RAllOf otherPercent(Double otherPercent) {
		this.otherPercent = otherPercent;
		return this;
	}

	/**
	 * Box 8, Other percent
	 * 
	 * @return otherPercent
	 */
	@ApiModelProperty(value = "Box 8, Other percent")

	public Double getOtherPercent() {
		return otherPercent;
	}

	public void setOtherPercent(Double otherPercent) {
		this.otherPercent = otherPercent;
	}

	public Tax1099RAllOf yourPercentOfTotal(Double yourPercentOfTotal) {
		this.yourPercentOfTotal = yourPercentOfTotal;
		return this;
	}

	/**
	 * Box 9a, Your percent of total distribution
	 * 
	 * @return yourPercentOfTotal
	 */
	@ApiModelProperty(value = "Box 9a, Your percent of total distribution")

	public Double getYourPercentOfTotal() {
		return yourPercentOfTotal;
	}

	public void setYourPercentOfTotal(Double yourPercentOfTotal) {
		this.yourPercentOfTotal = yourPercentOfTotal;
	}

	public Tax1099RAllOf totalEmployeeContributions(Double totalEmployeeContributions) {
		this.totalEmployeeContributions = totalEmployeeContributions;
		return this;
	}

	/**
	 * Box 9b, Total employee contributions
	 * 
	 * @return totalEmployeeContributions
	 */
	@ApiModelProperty(value = "Box 9b, Total employee contributions")

	public Double getTotalEmployeeContributions() {
		return totalEmployeeContributions;
	}

	public void setTotalEmployeeContributions(Double totalEmployeeContributions) {
		this.totalEmployeeContributions = totalEmployeeContributions;
	}

	public Tax1099RAllOf stateTaxWithholding(List<StateTaxWithholding> stateTaxWithholding) {
		this.stateTaxWithholding = stateTaxWithholding;
		return this;
	}

	public Tax1099RAllOf addStateTaxWithholdingItem(StateTaxWithholding stateTaxWithholdingItem) {
		if (this.stateTaxWithholding == null) {
			this.stateTaxWithholding = new ArrayList<>();
		}
		this.stateTaxWithholding.add(stateTaxWithholdingItem);
		return this;
	}

	/**
	 * Boxes 12-14, State tax withholding
	 * 
	 * @return stateTaxWithholding
	 */
	@ApiModelProperty(value = "Boxes 12-14, State tax withholding")

	@Valid

	public List<StateTaxWithholding> getStateTaxWithholding() {
		return stateTaxWithholding;
	}

	public void setStateTaxWithholding(List<StateTaxWithholding> stateTaxWithholding) {
		this.stateTaxWithholding = stateTaxWithholding;
	}

	public Tax1099RAllOf localTaxWithholding(List<LocalTaxWithholding> localTaxWithholding) {
		this.localTaxWithholding = localTaxWithholding;
		return this;
	}

	public Tax1099RAllOf addLocalTaxWithholdingItem(LocalTaxWithholding localTaxWithholdingItem) {
		if (this.localTaxWithholding == null) {
			this.localTaxWithholding = new ArrayList<>();
		}
		this.localTaxWithholding.add(localTaxWithholdingItem);
		return this;
	}

	/**
	 * Boxes 15-17, Local tax withholding
	 * 
	 * @return localTaxWithholding
	 */
	@ApiModelProperty(value = "Boxes 15-17, Local tax withholding")

	@Valid

	public List<LocalTaxWithholding> getLocalTaxWithholding() {
		return localTaxWithholding;
	}

	public void setLocalTaxWithholding(List<LocalTaxWithholding> localTaxWithholding) {
		this.localTaxWithholding = localTaxWithholding;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Tax1099RAllOf tax1099RAllOf = (Tax1099RAllOf) o;
		return Objects.equals(this.payerNameAddress, tax1099RAllOf.payerNameAddress)
				&& Objects.equals(this.payerTin, tax1099RAllOf.payerTin)
				&& Objects.equals(this.recipientTin, tax1099RAllOf.recipientTin)
				&& Objects.equals(this.recipientNameAddress, tax1099RAllOf.recipientNameAddress)
				&& Objects.equals(this.allocableToIRR, tax1099RAllOf.allocableToIRR)
				&& Objects.equals(this.firstYearOfRoth, tax1099RAllOf.firstYearOfRoth)
				&& Objects.equals(this.foreignAccountTaxCompliance, tax1099RAllOf.foreignAccountTaxCompliance)
				&& Objects.equals(this.recipientAccountNumber, tax1099RAllOf.recipientAccountNumber)
				&& Objects.equals(this.dateOfPayment, tax1099RAllOf.dateOfPayment)
				&& Objects.equals(this.grossDistribution, tax1099RAllOf.grossDistribution)
				&& Objects.equals(this.taxableAmount, tax1099RAllOf.taxableAmount)
				&& Objects.equals(this.taxableAmountNotDetermined, tax1099RAllOf.taxableAmountNotDetermined)
				&& Objects.equals(this.totalDistribution, tax1099RAllOf.totalDistribution)
				&& Objects.equals(this.capitalGain, tax1099RAllOf.capitalGain)
				&& Objects.equals(this.federalTaxWithheld, tax1099RAllOf.federalTaxWithheld)
				&& Objects.equals(this.employeeContributions, tax1099RAllOf.employeeContributions)
				&& Objects.equals(this.netUnrealizedAppreciation, tax1099RAllOf.netUnrealizedAppreciation)
				&& Objects.equals(this.distributionCodes, tax1099RAllOf.distributionCodes)
				&& Objects.equals(this.iraSepSimple, tax1099RAllOf.iraSepSimple)
				&& Objects.equals(this.otherAmount, tax1099RAllOf.otherAmount)
				&& Objects.equals(this.otherPercent, tax1099RAllOf.otherPercent)
				&& Objects.equals(this.yourPercentOfTotal, tax1099RAllOf.yourPercentOfTotal)
				&& Objects.equals(this.totalEmployeeContributions, tax1099RAllOf.totalEmployeeContributions)
				&& Objects.equals(this.stateTaxWithholding, tax1099RAllOf.stateTaxWithholding)
				&& Objects.equals(this.localTaxWithholding, tax1099RAllOf.localTaxWithholding);
	}

	@Override
	public int hashCode() {
		return Objects.hash(payerNameAddress, payerTin, recipientTin, recipientNameAddress, allocableToIRR,
				firstYearOfRoth, foreignAccountTaxCompliance, recipientAccountNumber, dateOfPayment, grossDistribution,
				taxableAmount, taxableAmountNotDetermined, totalDistribution, capitalGain, federalTaxWithheld,
				employeeContributions, netUnrealizedAppreciation, distributionCodes, iraSepSimple, otherAmount,
				otherPercent, yourPercentOfTotal, totalEmployeeContributions, stateTaxWithholding, localTaxWithholding);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Tax1099RAllOf {\n");

		sb.append("    payerNameAddress: ").append(toIndentedString(payerNameAddress)).append("\n");
		sb.append("    payerTin: ").append(toIndentedString(payerTin)).append("\n");
		sb.append("    recipientTin: ").append(toIndentedString(recipientTin)).append("\n");
		sb.append("    recipientNameAddress: ").append(toIndentedString(recipientNameAddress)).append("\n");
		sb.append("    allocableToIRR: ").append(toIndentedString(allocableToIRR)).append("\n");
		sb.append("    firstYearOfRoth: ").append(toIndentedString(firstYearOfRoth)).append("\n");
		sb.append("    foreignAccountTaxCompliance: ").append(toIndentedString(foreignAccountTaxCompliance))
				.append("\n");
		sb.append("    recipientAccountNumber: ").append(toIndentedString(recipientAccountNumber)).append("\n");
		sb.append("    dateOfPayment: ").append(toIndentedString(dateOfPayment)).append("\n");
		sb.append("    grossDistribution: ").append(toIndentedString(grossDistribution)).append("\n");
		sb.append("    taxableAmount: ").append(toIndentedString(taxableAmount)).append("\n");
		sb.append("    taxableAmountNotDetermined: ").append(toIndentedString(taxableAmountNotDetermined)).append("\n");
		sb.append("    totalDistribution: ").append(toIndentedString(totalDistribution)).append("\n");
		sb.append("    capitalGain: ").append(toIndentedString(capitalGain)).append("\n");
		sb.append("    federalTaxWithheld: ").append(toIndentedString(federalTaxWithheld)).append("\n");
		sb.append("    employeeContributions: ").append(toIndentedString(employeeContributions)).append("\n");
		sb.append("    netUnrealizedAppreciation: ").append(toIndentedString(netUnrealizedAppreciation)).append("\n");
		sb.append("    distributionCodes: ").append(toIndentedString(distributionCodes)).append("\n");
		sb.append("    iraSepSimple: ").append(toIndentedString(iraSepSimple)).append("\n");
		sb.append("    otherAmount: ").append(toIndentedString(otherAmount)).append("\n");
		sb.append("    otherPercent: ").append(toIndentedString(otherPercent)).append("\n");
		sb.append("    yourPercentOfTotal: ").append(toIndentedString(yourPercentOfTotal)).append("\n");
		sb.append("    totalEmployeeContributions: ").append(toIndentedString(totalEmployeeContributions)).append("\n");
		sb.append("    stateTaxWithholding: ").append(toIndentedString(stateTaxWithholding)).append("\n");
		sb.append("    localTaxWithholding: ").append(toIndentedString(localTaxWithholding)).append("\n");
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
