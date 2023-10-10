package com.fdx.api.model46.modelimpl;

import java.time.LocalDate;
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
 * Tax1099AAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1099AAllOf {
	@JsonProperty("lenderNameAddress")
	private NameAddressPhone lenderNameAddress;

	@JsonProperty("lenderTin")
	private String lenderTin;

	@JsonProperty("borrowerTin")
	private String borrowerTin;

	@JsonProperty("borrowerNameAddress")
	private NameAddress borrowerNameAddress;

	@JsonProperty("accountNumber")
	private String accountNumber;

	@JsonProperty("dateOfAcquisition")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private LocalDate dateOfAcquisition;

	@JsonProperty("principalBalance")
	private Double principalBalance;

	@JsonProperty("fairMarketValue")
	private Double fairMarketValue;

	@JsonProperty("personallyLiable")
	@JsonInclude(Include.NON_NULL)
	private Boolean personallyLiable;

	@JsonProperty("propertyDescription")
	private String propertyDescription;

	public Tax1099AAllOf lenderNameAddress(NameAddressPhone lenderNameAddress) {
		this.lenderNameAddress = lenderNameAddress;
		return this;
	}

	/**
	 * Get lenderNameAddress
	 * 
	 * @return lenderNameAddress
	 */
	@ApiModelProperty(value = "")

	@Valid

	public NameAddressPhone getLenderNameAddress() {
		return lenderNameAddress;
	}

	public void setLenderNameAddress(NameAddressPhone lenderNameAddress) {
		this.lenderNameAddress = lenderNameAddress;
	}

	public Tax1099AAllOf lenderTin(String lenderTin) {
		this.lenderTin = lenderTin;
		return this;
	}

	/**
	 * LENDER'S TIN
	 * 
	 * @return lenderTin
	 */
	@ApiModelProperty(value = "LENDER'S TIN")

	public String getLenderTin() {
		return lenderTin;
	}

	public void setLenderTin(String lenderTin) {
		this.lenderTin = lenderTin;
	}

	public Tax1099AAllOf borrowerTin(String borrowerTin) {
		this.borrowerTin = borrowerTin;
		return this;
	}

	/**
	 * BORROWER'S TIN
	 * 
	 * @return borrowerTin
	 */
	@ApiModelProperty(value = "BORROWER'S TIN")

	public String getBorrowerTin() {
		return borrowerTin;
	}

	public void setBorrowerTin(String borrowerTin) {
		this.borrowerTin = borrowerTin;
	}

	public Tax1099AAllOf borrowerNameAddress(NameAddress borrowerNameAddress) {
		this.borrowerNameAddress = borrowerNameAddress;
		return this;
	}

	/**
	 * Get borrowerNameAddress
	 * 
	 * @return borrowerNameAddress
	 */
	@ApiModelProperty(value = "")

	@Valid

	public NameAddress getBorrowerNameAddress() {
		return borrowerNameAddress;
	}

	public void setBorrowerNameAddress(NameAddress borrowerNameAddress) {
		this.borrowerNameAddress = borrowerNameAddress;
	}

	public Tax1099AAllOf accountNumber(String accountNumber) {
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

	public Tax1099AAllOf dateOfAcquisition(LocalDate dateOfAcquisition) {
		this.dateOfAcquisition = dateOfAcquisition;
		return this;
	}

	/**
	 * ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included
	 * according to [IETF RFC3339]
	 * (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)
	 * 
	 * @return dateOfAcquisition
	 */
	@ApiModelProperty(value = "ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included according to [IETF RFC3339] (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)")

	@Valid
	@Size(max = 10)
	public LocalDate getDateOfAcquisition() {
		return dateOfAcquisition;
	}

	public void setDateOfAcquisition(LocalDate dateOfAcquisition) {
		this.dateOfAcquisition = dateOfAcquisition;
	}

	public Tax1099AAllOf principalBalance(Double principalBalance) {
		this.principalBalance = principalBalance;
		return this;
	}

	/**
	 * Box 2, Balance of principal outstanding
	 * 
	 * @return principalBalance
	 */
	@ApiModelProperty(value = "Box 2, Balance of principal outstanding")

	public Double getPrincipalBalance() {
		return principalBalance;
	}

	public void setPrincipalBalance(Double principalBalance) {
		this.principalBalance = principalBalance;
	}

	public Tax1099AAllOf fairMarketValue(Double fairMarketValue) {
		this.fairMarketValue = fairMarketValue;
		return this;
	}

	/**
	 * Box 4, Fair market value property
	 * 
	 * @return fairMarketValue
	 */
	@ApiModelProperty(value = "Box 4, Fair market value property")

	public Double getFairMarketValue() {
		return fairMarketValue;
	}

	public void setFairMarketValue(Double fairMarketValue) {
		this.fairMarketValue = fairMarketValue;
	}

	public Tax1099AAllOf personallyLiable(Boolean personallyLiable) {
		this.personallyLiable = personallyLiable;
		return this;
	}

	/**
	 * Box 5, If checked, the borrower was personally liable for repayment of the
	 * debt
	 * 
	 * @return personallyLiable
	 */
	@ApiModelProperty(value = "Box 5, If checked, the borrower was personally liable for repayment of the debt")

	public Boolean getPersonallyLiable() {
		return personallyLiable;
	}

	public void setPersonallyLiable(Boolean personallyLiable) {
		this.personallyLiable = personallyLiable;
	}

	public Tax1099AAllOf propertyDescription(String propertyDescription) {
		this.propertyDescription = propertyDescription;
		return this;
	}

	/**
	 * Box 6, Description of property
	 * 
	 * @return propertyDescription
	 */
	@ApiModelProperty(value = "Box 6, Description of property")

	public String getPropertyDescription() {
		return propertyDescription;
	}

	public void setPropertyDescription(String propertyDescription) {
		this.propertyDescription = propertyDescription;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Tax1099AAllOf tax1099AAllOf = (Tax1099AAllOf) o;
		return Objects.equals(this.lenderNameAddress, tax1099AAllOf.lenderNameAddress)
				&& Objects.equals(this.lenderTin, tax1099AAllOf.lenderTin)
				&& Objects.equals(this.borrowerTin, tax1099AAllOf.borrowerTin)
				&& Objects.equals(this.borrowerNameAddress, tax1099AAllOf.borrowerNameAddress)
				&& Objects.equals(this.accountNumber, tax1099AAllOf.accountNumber)
				&& Objects.equals(this.dateOfAcquisition, tax1099AAllOf.dateOfAcquisition)
				&& Objects.equals(this.principalBalance, tax1099AAllOf.principalBalance)
				&& Objects.equals(this.fairMarketValue, tax1099AAllOf.fairMarketValue)
				&& Objects.equals(this.personallyLiable, tax1099AAllOf.personallyLiable)
				&& Objects.equals(this.propertyDescription, tax1099AAllOf.propertyDescription);
	}

	@Override
	public int hashCode() {
		return Objects.hash(lenderNameAddress, lenderTin, borrowerTin, borrowerNameAddress, accountNumber,
				dateOfAcquisition, principalBalance, fairMarketValue, personallyLiable, propertyDescription);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Tax1099AAllOf {\n");

		sb.append("    lenderNameAddress: ").append(toIndentedString(lenderNameAddress)).append("\n");
		sb.append("    lenderTin: ").append(toIndentedString(lenderTin)).append("\n");
		sb.append("    borrowerTin: ").append(toIndentedString(borrowerTin)).append("\n");
		sb.append("    borrowerNameAddress: ").append(toIndentedString(borrowerNameAddress)).append("\n");
		sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
		sb.append("    dateOfAcquisition: ").append(toIndentedString(dateOfAcquisition)).append("\n");
		sb.append("    principalBalance: ").append(toIndentedString(principalBalance)).append("\n");
		sb.append("    fairMarketValue: ").append(toIndentedString(fairMarketValue)).append("\n");
		sb.append("    personallyLiable: ").append(toIndentedString(personallyLiable)).append("\n");
		sb.append("    propertyDescription: ").append(toIndentedString(propertyDescription)).append("\n");
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
