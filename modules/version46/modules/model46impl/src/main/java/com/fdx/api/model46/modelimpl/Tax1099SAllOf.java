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
 * Tax1099SAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1099SAllOf {
	@JsonProperty("filerNameAddress")
	private NameAddressPhone filerNameAddress;

	@JsonProperty("filerTin")
	private String filerTin;

	@JsonProperty("transferorTin")
	private String transferorTin;

	@JsonProperty("transferorNameAddress")
	private NameAddress transferorNameAddress;

	@JsonProperty("accountNumber")
	private String accountNumber;

	@JsonProperty("dateOfClosing")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private LocalDate dateOfClosing;

	@JsonProperty("grossProceeds")
	private Double grossProceeds;

	@JsonProperty("addressOrLegalDescription")
	private String addressOrLegalDescription;

	@JsonProperty("receivedOtherConsideration")
	@JsonInclude(Include.NON_NULL)
	private Boolean receivedOtherConsideration;

	@JsonProperty("foreignPerson")
	@JsonInclude(Include.NON_NULL)
	private Boolean foreignPerson;

	@JsonProperty("realEstateTax")
	private Double realEstateTax;

	public Tax1099SAllOf filerNameAddress(NameAddressPhone filerNameAddress) {
		this.filerNameAddress = filerNameAddress;
		return this;
	}

	/**
	 * Get filerNameAddress
	 * 
	 * @return filerNameAddress
	 */
	@ApiModelProperty(value = "")

	@Valid

	public NameAddressPhone getFilerNameAddress() {
		return filerNameAddress;
	}

	public void setFilerNameAddress(NameAddressPhone filerNameAddress) {
		this.filerNameAddress = filerNameAddress;
	}

	public Tax1099SAllOf filerTin(String filerTin) {
		this.filerTin = filerTin;
		return this;
	}

	/**
	 * FILER'S TIN
	 * 
	 * @return filerTin
	 */
	@ApiModelProperty(value = "FILER'S TIN")

	public String getFilerTin() {
		return filerTin;
	}

	public void setFilerTin(String filerTin) {
		this.filerTin = filerTin;
	}

	public Tax1099SAllOf transferorTin(String transferorTin) {
		this.transferorTin = transferorTin;
		return this;
	}

	/**
	 * TRANSFEROR'S TIN
	 * 
	 * @return transferorTin
	 */
	@ApiModelProperty(value = "TRANSFEROR'S TIN")

	public String getTransferorTin() {
		return transferorTin;
	}

	public void setTransferorTin(String transferorTin) {
		this.transferorTin = transferorTin;
	}

	public Tax1099SAllOf transferorNameAddress(NameAddress transferorNameAddress) {
		this.transferorNameAddress = transferorNameAddress;
		return this;
	}

	/**
	 * Get transferorNameAddress
	 * 
	 * @return transferorNameAddress
	 */
	@ApiModelProperty(value = "")

	@Valid

	public NameAddress getTransferorNameAddress() {
		return transferorNameAddress;
	}

	public void setTransferorNameAddress(NameAddress transferorNameAddress) {
		this.transferorNameAddress = transferorNameAddress;
	}

	public Tax1099SAllOf accountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
		return this;
	}

	/**
	 * Account or escrow number
	 * 
	 * @return accountNumber
	 */
	@ApiModelProperty(value = "Account or escrow number")

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Tax1099SAllOf dateOfClosing(LocalDate dateOfClosing) {
		this.dateOfClosing = dateOfClosing;
		return this;
	}

	/**
	 * ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included
	 * according to [IETF RFC3339]
	 * (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)
	 * 
	 * @return dateOfClosing
	 */
	@ApiModelProperty(value = "ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included according to [IETF RFC3339] (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)")

	@Valid
	@Size(max = 10)
	public LocalDate getDateOfClosing() {
		return dateOfClosing;
	}

	public void setDateOfClosing(LocalDate dateOfClosing) {
		this.dateOfClosing = dateOfClosing;
	}

	public Tax1099SAllOf grossProceeds(Double grossProceeds) {
		this.grossProceeds = grossProceeds;
		return this;
	}

	/**
	 * Box 2, Gross proceeds
	 * 
	 * @return grossProceeds
	 */
	@ApiModelProperty(value = "Box 2, Gross proceeds")

	public Double getGrossProceeds() {
		return grossProceeds;
	}

	public void setGrossProceeds(Double grossProceeds) {
		this.grossProceeds = grossProceeds;
	}

	public Tax1099SAllOf addressOrLegalDescription(String addressOrLegalDescription) {
		this.addressOrLegalDescription = addressOrLegalDescription;
		return this;
	}

	/**
	 * Box 3, Address or legal description
	 * 
	 * @return addressOrLegalDescription
	 */
	@ApiModelProperty(value = "Box 3, Address or legal description")

	public String getAddressOrLegalDescription() {
		return addressOrLegalDescription;
	}

	public void setAddressOrLegalDescription(String addressOrLegalDescription) {
		this.addressOrLegalDescription = addressOrLegalDescription;
	}

	public Tax1099SAllOf receivedOtherConsideration(Boolean receivedOtherConsideration) {
		this.receivedOtherConsideration = receivedOtherConsideration;
		return this;
	}

	/**
	 * Box 4, Transferor received or will receive property or services as part of
	 * the consideration (if checked)
	 * 
	 * @return receivedOtherConsideration
	 */
	@ApiModelProperty(value = "Box 4, Transferor received or will receive property or services as part of the consideration (if checked)")

	public Boolean getReceivedOtherConsideration() {
		return receivedOtherConsideration;
	}

	public void setReceivedOtherConsideration(Boolean receivedOtherConsideration) {
		this.receivedOtherConsideration = receivedOtherConsideration;
	}

	public Tax1099SAllOf foreignPerson(Boolean foreignPerson) {
		this.foreignPerson = foreignPerson;
		return this;
	}

	/**
	 * Box 5, If checked, transferor is a foreign person (nonresident alien, foreign
	 * partnership, foreign estate, or foreign trust)
	 * 
	 * @return foreignPerson
	 */
	@ApiModelProperty(value = "Box 5, If checked, transferor is a foreign person (nonresident alien, foreign partnership, foreign estate, or foreign trust)")

	public Boolean getForeignPerson() {
		return foreignPerson;
	}

	public void setForeignPerson(Boolean foreignPerson) {
		this.foreignPerson = foreignPerson;
	}

	public Tax1099SAllOf realEstateTax(Double realEstateTax) {
		this.realEstateTax = realEstateTax;
		return this;
	}

	/**
	 * Box 6, Buyer's part of real estate tax
	 * 
	 * @return realEstateTax
	 */
	@ApiModelProperty(value = "Box 6, Buyer's part of real estate tax")

	public Double getRealEstateTax() {
		return realEstateTax;
	}

	public void setRealEstateTax(Double realEstateTax) {
		this.realEstateTax = realEstateTax;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Tax1099SAllOf tax1099SAllOf = (Tax1099SAllOf) o;
		return Objects.equals(this.filerNameAddress, tax1099SAllOf.filerNameAddress)
				&& Objects.equals(this.filerTin, tax1099SAllOf.filerTin)
				&& Objects.equals(this.transferorTin, tax1099SAllOf.transferorTin)
				&& Objects.equals(this.transferorNameAddress, tax1099SAllOf.transferorNameAddress)
				&& Objects.equals(this.accountNumber, tax1099SAllOf.accountNumber)
				&& Objects.equals(this.dateOfClosing, tax1099SAllOf.dateOfClosing)
				&& Objects.equals(this.grossProceeds, tax1099SAllOf.grossProceeds)
				&& Objects.equals(this.addressOrLegalDescription, tax1099SAllOf.addressOrLegalDescription)
				&& Objects.equals(this.receivedOtherConsideration, tax1099SAllOf.receivedOtherConsideration)
				&& Objects.equals(this.foreignPerson, tax1099SAllOf.foreignPerson)
				&& Objects.equals(this.realEstateTax, tax1099SAllOf.realEstateTax);
	}

	@Override
	public int hashCode() {
		return Objects.hash(filerNameAddress, filerTin, transferorTin, transferorNameAddress, accountNumber,
				dateOfClosing, grossProceeds, addressOrLegalDescription, receivedOtherConsideration, foreignPerson,
				realEstateTax);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Tax1099SAllOf {\n");

		sb.append("    filerNameAddress: ").append(toIndentedString(filerNameAddress)).append("\n");
		sb.append("    filerTin: ").append(toIndentedString(filerTin)).append("\n");
		sb.append("    transferorTin: ").append(toIndentedString(transferorTin)).append("\n");
		sb.append("    transferorNameAddress: ").append(toIndentedString(transferorNameAddress)).append("\n");
		sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
		sb.append("    dateOfClosing: ").append(toIndentedString(dateOfClosing)).append("\n");
		sb.append("    grossProceeds: ").append(toIndentedString(grossProceeds)).append("\n");
		sb.append("    addressOrLegalDescription: ").append(toIndentedString(addressOrLegalDescription)).append("\n");
		sb.append("    receivedOtherConsideration: ").append(toIndentedString(receivedOtherConsideration)).append("\n");
		sb.append("    foreignPerson: ").append(toIndentedString(foreignPerson)).append("\n");
		sb.append("    realEstateTax: ").append(toIndentedString(realEstateTax)).append("\n");
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
