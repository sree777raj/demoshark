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
 * Tax1098AllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1098AllOf {
	@JsonProperty("lenderNameAddress")
	private NameAddressPhone lenderNameAddress;

	@JsonProperty("lenderTin")
	private String lenderTin;

	@JsonProperty("borrowerTin")
	private String borrowerTin;

	@JsonProperty("borrowerNameAddress")
	private NameAddress borrowerNameAddress;

	@JsonProperty("mortgagedProperties")
	private Integer mortgagedProperties;

	@JsonProperty("otherInformation")
	private String otherInformation;

	@JsonProperty("accountNumber")
	private String accountNumber;

	@JsonProperty("mortgageInterest")
	private Double mortgageInterest;

	@JsonProperty("outstandingPrincipal")
	private Double outstandingPrincipal;

	@JsonProperty("originationDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private LocalDate originationDate;

	@JsonProperty("overpaidRefund")
	private Double overpaidRefund;

	@JsonProperty("mortgageInsurance")
	private Double mortgageInsurance;

	@JsonProperty("pointsPaid")
	private Double pointsPaid;

	@JsonProperty("isPropertyAddressSameAsBorrowerAddress")
	@JsonInclude(Include.NON_NULL)
	private Boolean isPropertyAddressSameAsBorrowerAddress;

	@JsonProperty("acquisitionDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private LocalDate acquisitionDate;

	@JsonProperty("propertyAddress")
	private Address propertyAddress;

	@JsonProperty("propertyTax")
	private Double propertyTax;

	@JsonProperty("propertyDescription")
	private String propertyDescription;

	public Tax1098AllOf lenderNameAddress(NameAddressPhone lenderNameAddress) {
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

	public Tax1098AllOf lenderTin(String lenderTin) {
		this.lenderTin = lenderTin;
		return this;
	}

	/**
	 * RECIPIENT'S/LENDER'S TIN
	 * 
	 * @return lenderTin
	 */
	@ApiModelProperty(value = "RECIPIENT'S/LENDER'S TIN")

	public String getLenderTin() {
		return lenderTin;
	}

	public void setLenderTin(String lenderTin) {
		this.lenderTin = lenderTin;
	}

	public Tax1098AllOf borrowerTin(String borrowerTin) {
		this.borrowerTin = borrowerTin;
		return this;
	}

	/**
	 * PAYER'S/BORROWER'S TIN
	 * 
	 * @return borrowerTin
	 */
	@ApiModelProperty(value = "PAYER'S/BORROWER'S TIN")

	public String getBorrowerTin() {
		return borrowerTin;
	}

	public void setBorrowerTin(String borrowerTin) {
		this.borrowerTin = borrowerTin;
	}

	public Tax1098AllOf borrowerNameAddress(NameAddress borrowerNameAddress) {
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

	public Tax1098AllOf mortgagedProperties(Integer mortgagedProperties) {
		this.mortgagedProperties = mortgagedProperties;
		return this;
	}

	/**
	 * Box 9, Number of properties securing the mortgage
	 * 
	 * @return mortgagedProperties
	 */
	@ApiModelProperty(value = "Box 9, Number of properties securing the mortgage")

	public Integer getMortgagedProperties() {
		return mortgagedProperties;
	}

	public void setMortgagedProperties(Integer mortgagedProperties) {
		this.mortgagedProperties = mortgagedProperties;
	}

	public Tax1098AllOf otherInformation(String otherInformation) {
		this.otherInformation = otherInformation;
		return this;
	}

	/**
	 * Box 10, Other (property tax)
	 * 
	 * @return otherInformation
	 */
	@ApiModelProperty(value = "Box 10, Other (property tax)")

	public String getOtherInformation() {
		return otherInformation;
	}

	public void setOtherInformation(String otherInformation) {
		this.otherInformation = otherInformation;
	}

	public Tax1098AllOf accountNumber(String accountNumber) {
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

	public Tax1098AllOf mortgageInterest(Double mortgageInterest) {
		this.mortgageInterest = mortgageInterest;
		return this;
	}

	/**
	 * Box 1, Mortgage interest received from borrower
	 * 
	 * @return mortgageInterest
	 */
	@ApiModelProperty(value = "Box 1, Mortgage interest received from borrower")

	public Double getMortgageInterest() {
		return mortgageInterest;
	}

	public void setMortgageInterest(Double mortgageInterest) {
		this.mortgageInterest = mortgageInterest;
	}

	public Tax1098AllOf outstandingPrincipal(Double outstandingPrincipal) {
		this.outstandingPrincipal = outstandingPrincipal;
		return this;
	}

	/**
	 * Box 2, Outstanding mortgage principal
	 * 
	 * @return outstandingPrincipal
	 */
	@ApiModelProperty(value = "Box 2, Outstanding mortgage principal")

	public Double getOutstandingPrincipal() {
		return outstandingPrincipal;
	}

	public void setOutstandingPrincipal(Double outstandingPrincipal) {
		this.outstandingPrincipal = outstandingPrincipal;
	}

	public Tax1098AllOf originationDate(LocalDate originationDate) {
		this.originationDate = originationDate;
		return this;
	}

	/**
	 * ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included
	 * according to [IETF RFC3339]
	 * (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)
	 * 
	 * @return originationDate
	 */
	@ApiModelProperty(value = "ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included according to [IETF RFC3339] (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)")

	@Valid
	@Size(max = 10)
	public LocalDate getOriginationDate() {
		return originationDate;
	}

	public void setOriginationDate(LocalDate originationDate) {
		this.originationDate = originationDate;
	}

	public Tax1098AllOf overpaidRefund(Double overpaidRefund) {
		this.overpaidRefund = overpaidRefund;
		return this;
	}

	/**
	 * Box 4, Refund of overpaid interest
	 * 
	 * @return overpaidRefund
	 */
	@ApiModelProperty(value = "Box 4, Refund of overpaid interest")

	public Double getOverpaidRefund() {
		return overpaidRefund;
	}

	public void setOverpaidRefund(Double overpaidRefund) {
		this.overpaidRefund = overpaidRefund;
	}

	public Tax1098AllOf mortgageInsurance(Double mortgageInsurance) {
		this.mortgageInsurance = mortgageInsurance;
		return this;
	}

	/**
	 * Box 5, Mortgage insurance premiums
	 * 
	 * @return mortgageInsurance
	 */
	@ApiModelProperty(value = "Box 5, Mortgage insurance premiums")

	public Double getMortgageInsurance() {
		return mortgageInsurance;
	}

	public void setMortgageInsurance(Double mortgageInsurance) {
		this.mortgageInsurance = mortgageInsurance;
	}

	public Tax1098AllOf pointsPaid(Double pointsPaid) {
		this.pointsPaid = pointsPaid;
		return this;
	}

	/**
	 * Box 6, Points paid on purchase of principal residence
	 * 
	 * @return pointsPaid
	 */
	@ApiModelProperty(value = "Box 6, Points paid on purchase of principal residence")

	public Double getPointsPaid() {
		return pointsPaid;
	}

	public void setPointsPaid(Double pointsPaid) {
		this.pointsPaid = pointsPaid;
	}

	public Tax1098AllOf isPropertyAddressSameAsBorrowerAddress(Boolean isPropertyAddressSameAsBorrowerAddress) {
		this.isPropertyAddressSameAsBorrowerAddress = isPropertyAddressSameAsBorrowerAddress;
		return this;
	}

	/**
	 * Box 7, Is address of property securing mortgage same as PAYER'S/BORROWER'S
	 * address
	 * 
	 * @return isPropertyAddressSameAsBorrowerAddress
	 */
	@ApiModelProperty(value = "Box 7, Is address of property securing mortgage same as PAYER'S/BORROWER'S address")

	public Boolean getIsPropertyAddressSameAsBorrowerAddress() {
		return isPropertyAddressSameAsBorrowerAddress;
	}

	public void setIsPropertyAddressSameAsBorrowerAddress(Boolean isPropertyAddressSameAsBorrowerAddress) {
		this.isPropertyAddressSameAsBorrowerAddress = isPropertyAddressSameAsBorrowerAddress;
	}

	public Tax1098AllOf acquisitionDate(LocalDate acquisitionDate) {
		this.acquisitionDate = acquisitionDate;
		return this;
	}

	/**
	 * ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included
	 * according to [IETF RFC3339]
	 * (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)
	 * 
	 * @return acquisitionDate
	 */
	@ApiModelProperty(value = "ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included according to [IETF RFC3339] (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)")

	@Valid
	@Size(max = 10)
	public LocalDate getAcquisitionDate() {
		return acquisitionDate;
	}

	public void setAcquisitionDate(LocalDate acquisitionDate) {
		this.acquisitionDate = acquisitionDate;
	}

	public Tax1098AllOf propertyAddress(Address propertyAddress) {
		this.propertyAddress = propertyAddress;
		return this;
	}

	/**
	 * Get propertyAddress
	 * 
	 * @return propertyAddress
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Address getPropertyAddress() {
		return propertyAddress;
	}

	public void setPropertyAddress(Address propertyAddress) {
		this.propertyAddress = propertyAddress;
	}

	public Tax1098AllOf propertyTax(Double propertyTax) {
		this.propertyTax = propertyTax;
		return this;
	}

	/**
	 * Box 10, Property tax
	 * 
	 * @return propertyTax
	 */
	@ApiModelProperty(value = "Box 10, Property tax")

	public Double getPropertyTax() {
		return propertyTax;
	}

	public void setPropertyTax(Double propertyTax) {
		this.propertyTax = propertyTax;
	}

	public Tax1098AllOf propertyDescription(String propertyDescription) {
		this.propertyDescription = propertyDescription;
		return this;
	}

	/**
	 * Box 8, Description of property securing mortgage, if property securing
	 * mortgage has no address
	 * 
	 * @return propertyDescription
	 */
	@ApiModelProperty(value = "Box 8, Description of property securing mortgage, if property securing mortgage has no address")

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
		Tax1098AllOf tax1098AllOf = (Tax1098AllOf) o;
		return Objects.equals(this.lenderNameAddress, tax1098AllOf.lenderNameAddress)
				&& Objects.equals(this.lenderTin, tax1098AllOf.lenderTin)
				&& Objects.equals(this.borrowerTin, tax1098AllOf.borrowerTin)
				&& Objects.equals(this.borrowerNameAddress, tax1098AllOf.borrowerNameAddress)
				&& Objects.equals(this.mortgagedProperties, tax1098AllOf.mortgagedProperties)
				&& Objects.equals(this.otherInformation, tax1098AllOf.otherInformation)
				&& Objects.equals(this.accountNumber, tax1098AllOf.accountNumber)
				&& Objects.equals(this.mortgageInterest, tax1098AllOf.mortgageInterest)
				&& Objects.equals(this.outstandingPrincipal, tax1098AllOf.outstandingPrincipal)
				&& Objects.equals(this.originationDate, tax1098AllOf.originationDate)
				&& Objects.equals(this.overpaidRefund, tax1098AllOf.overpaidRefund)
				&& Objects.equals(this.mortgageInsurance, tax1098AllOf.mortgageInsurance)
				&& Objects.equals(this.pointsPaid, tax1098AllOf.pointsPaid)
				&& Objects.equals(this.isPropertyAddressSameAsBorrowerAddress,
						tax1098AllOf.isPropertyAddressSameAsBorrowerAddress)
				&& Objects.equals(this.acquisitionDate, tax1098AllOf.acquisitionDate)
				&& Objects.equals(this.propertyAddress, tax1098AllOf.propertyAddress)
				&& Objects.equals(this.propertyTax, tax1098AllOf.propertyTax)
				&& Objects.equals(this.propertyDescription, tax1098AllOf.propertyDescription);
	}

	@Override
	public int hashCode() {
		return Objects.hash(lenderNameAddress, lenderTin, borrowerTin, borrowerNameAddress, mortgagedProperties,
				otherInformation, accountNumber, mortgageInterest, outstandingPrincipal, originationDate,
				overpaidRefund, mortgageInsurance, pointsPaid, isPropertyAddressSameAsBorrowerAddress, acquisitionDate,
				propertyAddress, propertyTax, propertyDescription);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Tax1098AllOf {\n");

		sb.append("    lenderNameAddress: ").append(toIndentedString(lenderNameAddress)).append("\n");
		sb.append("    lenderTin: ").append(toIndentedString(lenderTin)).append("\n");
		sb.append("    borrowerTin: ").append(toIndentedString(borrowerTin)).append("\n");
		sb.append("    borrowerNameAddress: ").append(toIndentedString(borrowerNameAddress)).append("\n");
		sb.append("    mortgagedProperties: ").append(toIndentedString(mortgagedProperties)).append("\n");
		sb.append("    otherInformation: ").append(toIndentedString(otherInformation)).append("\n");
		sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
		sb.append("    mortgageInterest: ").append(toIndentedString(mortgageInterest)).append("\n");
		sb.append("    outstandingPrincipal: ").append(toIndentedString(outstandingPrincipal)).append("\n");
		sb.append("    originationDate: ").append(toIndentedString(originationDate)).append("\n");
		sb.append("    overpaidRefund: ").append(toIndentedString(overpaidRefund)).append("\n");
		sb.append("    mortgageInsurance: ").append(toIndentedString(mortgageInsurance)).append("\n");
		sb.append("    pointsPaid: ").append(toIndentedString(pointsPaid)).append("\n");
		sb.append("    isPropertyAddressSameAsBorrowerAddress: ")
				.append(toIndentedString(isPropertyAddressSameAsBorrowerAddress)).append("\n");
		sb.append("    acquisitionDate: ").append(toIndentedString(acquisitionDate)).append("\n");
		sb.append("    propertyAddress: ").append(toIndentedString(propertyAddress)).append("\n");
		sb.append("    propertyTax: ").append(toIndentedString(propertyTax)).append("\n");
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
