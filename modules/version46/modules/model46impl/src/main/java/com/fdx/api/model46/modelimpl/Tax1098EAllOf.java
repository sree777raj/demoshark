package com.fdx.api.model46.modelimpl;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Tax1098EAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1098EAllOf {
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

	@JsonProperty("studentLoanInterest")
	private Double studentLoanInterest;

	@JsonProperty("box1ExcludesFees")
	@JsonInclude(Include.NON_NULL)
	private Boolean box1ExcludesFees;

	public Tax1098EAllOf lenderNameAddress(NameAddressPhone lenderNameAddress) {
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

	public Tax1098EAllOf lenderTin(String lenderTin) {
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

	public Tax1098EAllOf borrowerTin(String borrowerTin) {
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

	public Tax1098EAllOf borrowerNameAddress(NameAddress borrowerNameAddress) {
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

	public Tax1098EAllOf accountNumber(String accountNumber) {
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

	public Tax1098EAllOf studentLoanInterest(Double studentLoanInterest) {
		this.studentLoanInterest = studentLoanInterest;
		return this;
	}

	/**
	 * Box 1, Student loan interest received by lender
	 * 
	 * @return studentLoanInterest
	 */
	@ApiModelProperty(value = "Box 1, Student loan interest received by lender")

	public Double getStudentLoanInterest() {
		return studentLoanInterest;
	}

	public void setStudentLoanInterest(Double studentLoanInterest) {
		this.studentLoanInterest = studentLoanInterest;
	}

	public Tax1098EAllOf box1ExcludesFees(Boolean box1ExcludesFees) {
		this.box1ExcludesFees = box1ExcludesFees;
		return this;
	}

	/**
	 * Box 2, If checked, box 1 does not include loan origination fee made before
	 * September 1, 2004
	 * 
	 * @return box1ExcludesFees
	 */
	@ApiModelProperty(value = "Box 2, If checked, box 1 does not include loan origination fee made before September 1, 2004")

	public Boolean getBox1ExcludesFees() {
		return box1ExcludesFees;
	}

	public void setBox1ExcludesFees(Boolean box1ExcludesFees) {
		this.box1ExcludesFees = box1ExcludesFees;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Tax1098EAllOf tax1098EAllOf = (Tax1098EAllOf) o;
		return Objects.equals(this.lenderNameAddress, tax1098EAllOf.lenderNameAddress)
				&& Objects.equals(this.lenderTin, tax1098EAllOf.lenderTin)
				&& Objects.equals(this.borrowerTin, tax1098EAllOf.borrowerTin)
				&& Objects.equals(this.borrowerNameAddress, tax1098EAllOf.borrowerNameAddress)
				&& Objects.equals(this.accountNumber, tax1098EAllOf.accountNumber)
				&& Objects.equals(this.studentLoanInterest, tax1098EAllOf.studentLoanInterest)
				&& Objects.equals(this.box1ExcludesFees, tax1098EAllOf.box1ExcludesFees);
	}

	@Override
	public int hashCode() {
		return Objects.hash(lenderNameAddress, lenderTin, borrowerTin, borrowerNameAddress, accountNumber,
				studentLoanInterest, box1ExcludesFees);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Tax1098EAllOf {\n");

		sb.append("    lenderNameAddress: ").append(toIndentedString(lenderNameAddress)).append("\n");
		sb.append("    lenderTin: ").append(toIndentedString(lenderTin)).append("\n");
		sb.append("    borrowerTin: ").append(toIndentedString(borrowerTin)).append("\n");
		sb.append("    borrowerNameAddress: ").append(toIndentedString(borrowerNameAddress)).append("\n");
		sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
		sb.append("    studentLoanInterest: ").append(toIndentedString(studentLoanInterest)).append("\n");
		sb.append("    box1ExcludesFees: ").append(toIndentedString(box1ExcludesFees)).append("\n");
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
