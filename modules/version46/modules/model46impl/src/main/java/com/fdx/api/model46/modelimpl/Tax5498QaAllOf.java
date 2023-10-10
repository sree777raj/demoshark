package com.fdx.api.model46.modelimpl;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Tax5498QaAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax5498QaAllOf {
	@JsonProperty("issuerNameAddress")
	private NameAddress issuerNameAddress;

	@JsonProperty("issuerTin")
	private String issuerTin;

	@JsonProperty("beneficiaryTin")
	private String beneficiaryTin;

	@JsonProperty("beneficiaryNameAddress")
	private NameAddress beneficiaryNameAddress;

	@JsonProperty("accountNumber")
	private String accountNumber;

	@JsonProperty("ableContributions")
	private Double ableContributions;

	@JsonProperty("rollovers")
	private Double rollovers;

	@JsonProperty("cumulativeContributions")
	private Double cumulativeContributions;

	@JsonProperty("fairMarketValue")
	private Double fairMarketValue;

	@JsonProperty("openedInTaxYear")
	@JsonInclude(Include.NON_NULL)
	private Boolean openedInTaxYear;

	@JsonProperty("basisOfDisabilityCode")
	private String basisOfDisabilityCode;

	@JsonProperty("typeOfDisabilityCode")
	private String typeOfDisabilityCode;

	public Tax5498QaAllOf issuerNameAddress(NameAddress issuerNameAddress) {
		this.issuerNameAddress = issuerNameAddress;
		return this;
	}

	/**
	 * Get issuerNameAddress
	 * 
	 * @return issuerNameAddress
	 */
	@ApiModelProperty(value = "")

	@Valid

	public NameAddress getIssuerNameAddress() {
		return issuerNameAddress;
	}

	public void setIssuerNameAddress(NameAddress issuerNameAddress) {
		this.issuerNameAddress = issuerNameAddress;
	}

	public Tax5498QaAllOf issuerTin(String issuerTin) {
		this.issuerTin = issuerTin;
		return this;
	}

	/**
	 * ISSUER'S TIN
	 * 
	 * @return issuerTin
	 */
	@ApiModelProperty(value = "ISSUER'S TIN")

	public String getIssuerTin() {
		return issuerTin;
	}

	public void setIssuerTin(String issuerTin) {
		this.issuerTin = issuerTin;
	}

	public Tax5498QaAllOf beneficiaryTin(String beneficiaryTin) {
		this.beneficiaryTin = beneficiaryTin;
		return this;
	}

	/**
	 * BENEFICIARY'S TIN
	 * 
	 * @return beneficiaryTin
	 */
	@ApiModelProperty(value = "BENEFICIARY'S TIN")

	public String getBeneficiaryTin() {
		return beneficiaryTin;
	}

	public void setBeneficiaryTin(String beneficiaryTin) {
		this.beneficiaryTin = beneficiaryTin;
	}

	public Tax5498QaAllOf beneficiaryNameAddress(NameAddress beneficiaryNameAddress) {
		this.beneficiaryNameAddress = beneficiaryNameAddress;
		return this;
	}

	/**
	 * Get beneficiaryNameAddress
	 * 
	 * @return beneficiaryNameAddress
	 */
	@ApiModelProperty(value = "")

	@Valid

	public NameAddress getBeneficiaryNameAddress() {
		return beneficiaryNameAddress;
	}

	public void setBeneficiaryNameAddress(NameAddress beneficiaryNameAddress) {
		this.beneficiaryNameAddress = beneficiaryNameAddress;
	}

	public Tax5498QaAllOf accountNumber(String accountNumber) {
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

	public Tax5498QaAllOf ableContributions(Double ableContributions) {
		this.ableContributions = ableContributions;
		return this;
	}

	/**
	 * Box 1, ABLE contributions
	 * 
	 * @return ableContributions
	 */
	@ApiModelProperty(value = "Box 1, ABLE contributions")

	public Double getAbleContributions() {
		return ableContributions;
	}

	public void setAbleContributions(Double ableContributions) {
		this.ableContributions = ableContributions;
	}

	public Tax5498QaAllOf rollovers(Double rollovers) {
		this.rollovers = rollovers;
		return this;
	}

	/**
	 * Box 2, ABLE to ABLE Rollovers
	 * 
	 * @return rollovers
	 */
	@ApiModelProperty(value = "Box 2, ABLE to ABLE Rollovers")

	public Double getRollovers() {
		return rollovers;
	}

	public void setRollovers(Double rollovers) {
		this.rollovers = rollovers;
	}

	public Tax5498QaAllOf cumulativeContributions(Double cumulativeContributions) {
		this.cumulativeContributions = cumulativeContributions;
		return this;
	}

	/**
	 * Box 3, Cumulative contributions
	 * 
	 * @return cumulativeContributions
	 */
	@ApiModelProperty(value = "Box 3, Cumulative contributions")

	public Double getCumulativeContributions() {
		return cumulativeContributions;
	}

	public void setCumulativeContributions(Double cumulativeContributions) {
		this.cumulativeContributions = cumulativeContributions;
	}

	public Tax5498QaAllOf fairMarketValue(Double fairMarketValue) {
		this.fairMarketValue = fairMarketValue;
		return this;
	}

	/**
	 * Box 4, Fair market value
	 * 
	 * @return fairMarketValue
	 */
	@ApiModelProperty(value = "Box 4, Fair market value")

	public Double getFairMarketValue() {
		return fairMarketValue;
	}

	public void setFairMarketValue(Double fairMarketValue) {
		this.fairMarketValue = fairMarketValue;
	}

	public Tax5498QaAllOf openedInTaxYear(Boolean openedInTaxYear) {
		this.openedInTaxYear = openedInTaxYear;
		return this;
	}

	/**
	 * Box 5, Check if account opened in current tax year
	 * 
	 * @return openedInTaxYear
	 */
	@ApiModelProperty(value = "Box 5, Check if account opened in current tax year")

	public Boolean getOpenedInTaxYear() {
		return openedInTaxYear;
	}

	public void setOpenedInTaxYear(Boolean openedInTaxYear) {
		this.openedInTaxYear = openedInTaxYear;
	}

	public Tax5498QaAllOf basisOfDisabilityCode(String basisOfDisabilityCode) {
		this.basisOfDisabilityCode = basisOfDisabilityCode;
		return this;
	}

	/**
	 * Box 6, Basis of eligibility
	 * 
	 * @return basisOfDisabilityCode
	 */
	@ApiModelProperty(value = "Box 6, Basis of eligibility")

	public String getBasisOfDisabilityCode() {
		return basisOfDisabilityCode;
	}

	public void setBasisOfDisabilityCode(String basisOfDisabilityCode) {
		this.basisOfDisabilityCode = basisOfDisabilityCode;
	}

	public Tax5498QaAllOf typeOfDisabilityCode(String typeOfDisabilityCode) {
		this.typeOfDisabilityCode = typeOfDisabilityCode;
		return this;
	}

	/**
	 * Box 7, Code
	 * 
	 * @return typeOfDisabilityCode
	 */
	@ApiModelProperty(value = "Box 7, Code")

	public String getTypeOfDisabilityCode() {
		return typeOfDisabilityCode;
	}

	public void setTypeOfDisabilityCode(String typeOfDisabilityCode) {
		this.typeOfDisabilityCode = typeOfDisabilityCode;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Tax5498QaAllOf tax5498QaAllOf = (Tax5498QaAllOf) o;
		return Objects.equals(this.issuerNameAddress, tax5498QaAllOf.issuerNameAddress)
				&& Objects.equals(this.issuerTin, tax5498QaAllOf.issuerTin)
				&& Objects.equals(this.beneficiaryTin, tax5498QaAllOf.beneficiaryTin)
				&& Objects.equals(this.beneficiaryNameAddress, tax5498QaAllOf.beneficiaryNameAddress)
				&& Objects.equals(this.accountNumber, tax5498QaAllOf.accountNumber)
				&& Objects.equals(this.ableContributions, tax5498QaAllOf.ableContributions)
				&& Objects.equals(this.rollovers, tax5498QaAllOf.rollovers)
				&& Objects.equals(this.cumulativeContributions, tax5498QaAllOf.cumulativeContributions)
				&& Objects.equals(this.fairMarketValue, tax5498QaAllOf.fairMarketValue)
				&& Objects.equals(this.openedInTaxYear, tax5498QaAllOf.openedInTaxYear)
				&& Objects.equals(this.basisOfDisabilityCode, tax5498QaAllOf.basisOfDisabilityCode)
				&& Objects.equals(this.typeOfDisabilityCode, tax5498QaAllOf.typeOfDisabilityCode);
	}

	@Override
	public int hashCode() {
		return Objects.hash(issuerNameAddress, issuerTin, beneficiaryTin, beneficiaryNameAddress, accountNumber,
				ableContributions, rollovers, cumulativeContributions, fairMarketValue, openedInTaxYear,
				basisOfDisabilityCode, typeOfDisabilityCode);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Tax5498QaAllOf {\n");

		sb.append("    issuerNameAddress: ").append(toIndentedString(issuerNameAddress)).append("\n");
		sb.append("    issuerTin: ").append(toIndentedString(issuerTin)).append("\n");
		sb.append("    beneficiaryTin: ").append(toIndentedString(beneficiaryTin)).append("\n");
		sb.append("    beneficiaryNameAddress: ").append(toIndentedString(beneficiaryNameAddress)).append("\n");
		sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
		sb.append("    ableContributions: ").append(toIndentedString(ableContributions)).append("\n");
		sb.append("    rollovers: ").append(toIndentedString(rollovers)).append("\n");
		sb.append("    cumulativeContributions: ").append(toIndentedString(cumulativeContributions)).append("\n");
		sb.append("    fairMarketValue: ").append(toIndentedString(fairMarketValue)).append("\n");
		sb.append("    openedInTaxYear: ").append(toIndentedString(openedInTaxYear)).append("\n");
		sb.append("    basisOfDisabilityCode: ").append(toIndentedString(basisOfDisabilityCode)).append("\n");
		sb.append("    typeOfDisabilityCode: ").append(toIndentedString(typeOfDisabilityCode)).append("\n");
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
