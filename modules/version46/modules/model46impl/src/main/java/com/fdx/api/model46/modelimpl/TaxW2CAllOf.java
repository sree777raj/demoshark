package com.fdx.api.model46.modelimpl;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * TaxW2CAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class TaxW2CAllOf {
	@JsonProperty("employerNameAddress")
	private NameAddress employerNameAddress;

	@JsonProperty("employerTin")
	private String employerTin;

	@JsonProperty("employeeTin")
	private String employeeTin;

	@JsonProperty("correctedTinOrName")
	@JsonInclude(Include.NON_NULL)
	private Boolean correctedTinOrName;

	@JsonProperty("previousEmployeeTin")
	private String previousEmployeeTin;

	@JsonProperty("previousEmployeeName")
	private IndividualName previousEmployeeName;

	@JsonProperty("employeeName")
	private IndividualName employeeName;

	@JsonProperty("employeeAddress")
	private Address employeeAddress;

	@JsonProperty("originalW2")
	private TaxW2 originalW2;

	@JsonProperty("correctedW2")
	private TaxW2 correctedW2;

	public TaxW2CAllOf employerNameAddress(NameAddress employerNameAddress) {
		this.employerNameAddress = employerNameAddress;
		return this;
	}

	/**
	 * Get employerNameAddress
	 * 
	 * @return employerNameAddress
	 */
	@ApiModelProperty(value = "")

	@Valid

	public NameAddress getEmployerNameAddress() {
		return employerNameAddress;
	}

	public void setEmployerNameAddress(NameAddress employerNameAddress) {
		this.employerNameAddress = employerNameAddress;
	}

	public TaxW2CAllOf employerTin(String employerTin) {
		this.employerTin = employerTin;
		return this;
	}

	/**
	 * Box b, Employer's Federal EIN
	 * 
	 * @return employerTin
	 */
	@ApiModelProperty(value = "Box b, Employer's Federal EIN")

	public String getEmployerTin() {
		return employerTin;
	}

	public void setEmployerTin(String employerTin) {
		this.employerTin = employerTin;
	}

	public TaxW2CAllOf employeeTin(String employeeTin) {
		this.employeeTin = employeeTin;
		return this;
	}

	/**
	 * Box d, Employee's correct SSN
	 * 
	 * @return employeeTin
	 */
	@ApiModelProperty(value = "Box d, Employee's correct SSN")

	public String getEmployeeTin() {
		return employeeTin;
	}

	public void setEmployeeTin(String employeeTin) {
		this.employeeTin = employeeTin;
	}

	public TaxW2CAllOf correctedTinOrName(Boolean correctedTinOrName) {
		this.correctedTinOrName = correctedTinOrName;
		return this;
	}

	/**
	 * Box e, Corrected SSN and/or name
	 * 
	 * @return correctedTinOrName
	 */
	@ApiModelProperty(value = "Box e, Corrected SSN and/or name")

	public Boolean getCorrectedTinOrName() {
		return correctedTinOrName;
	}

	public void setCorrectedTinOrName(Boolean correctedTinOrName) {
		this.correctedTinOrName = correctedTinOrName;
	}

	public TaxW2CAllOf previousEmployeeTin(String previousEmployeeTin) {
		this.previousEmployeeTin = previousEmployeeTin;
		return this;
	}

	/**
	 * Box f, Employee's previously reported SSN
	 * 
	 * @return previousEmployeeTin
	 */
	@ApiModelProperty(value = "Box f, Employee's previously reported SSN")

	public String getPreviousEmployeeTin() {
		return previousEmployeeTin;
	}

	public void setPreviousEmployeeTin(String previousEmployeeTin) {
		this.previousEmployeeTin = previousEmployeeTin;
	}

	public TaxW2CAllOf previousEmployeeName(IndividualName previousEmployeeName) {
		this.previousEmployeeName = previousEmployeeName;
		return this;
	}

	/**
	 * Get previousEmployeeName
	 * 
	 * @return previousEmployeeName
	 */
	@ApiModelProperty(value = "")

	@Valid

	public IndividualName getPreviousEmployeeName() {
		return previousEmployeeName;
	}

	public void setPreviousEmployeeName(IndividualName previousEmployeeName) {
		this.previousEmployeeName = previousEmployeeName;
	}

	public TaxW2CAllOf employeeName(IndividualName employeeName) {
		this.employeeName = employeeName;
		return this;
	}

	/**
	 * Get employeeName
	 * 
	 * @return employeeName
	 */
	@ApiModelProperty(value = "")

	@Valid

	public IndividualName getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(IndividualName employeeName) {
		this.employeeName = employeeName;
	}

	public TaxW2CAllOf employeeAddress(Address employeeAddress) {
		this.employeeAddress = employeeAddress;
		return this;
	}

	/**
	 * Get employeeAddress
	 * 
	 * @return employeeAddress
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Address getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(Address employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public TaxW2CAllOf originalW2(TaxW2 originalW2) {
		this.originalW2 = originalW2;
		return this;
	}

	/**
	 * Get originalW2
	 * 
	 * @return originalW2
	 */
	@ApiModelProperty(value = "")

	@Valid

	public TaxW2 getOriginalW2() {
		return originalW2;
	}

	public void setOriginalW2(TaxW2 originalW2) {
		this.originalW2 = originalW2;
	}

	public TaxW2CAllOf correctedW2(TaxW2 correctedW2) {
		this.correctedW2 = correctedW2;
		return this;
	}

	/**
	 * Get correctedW2
	 * 
	 * @return correctedW2
	 */
	@ApiModelProperty(value = "")

	@Valid

	public TaxW2 getCorrectedW2() {
		return correctedW2;
	}

	public void setCorrectedW2(TaxW2 correctedW2) {
		this.correctedW2 = correctedW2;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		TaxW2CAllOf taxW2CAllOf = (TaxW2CAllOf) o;
		return Objects.equals(this.employerNameAddress, taxW2CAllOf.employerNameAddress)
				&& Objects.equals(this.employerTin, taxW2CAllOf.employerTin)
				&& Objects.equals(this.employeeTin, taxW2CAllOf.employeeTin)
				&& Objects.equals(this.correctedTinOrName, taxW2CAllOf.correctedTinOrName)
				&& Objects.equals(this.previousEmployeeTin, taxW2CAllOf.previousEmployeeTin)
				&& Objects.equals(this.previousEmployeeName, taxW2CAllOf.previousEmployeeName)
				&& Objects.equals(this.employeeName, taxW2CAllOf.employeeName)
				&& Objects.equals(this.employeeAddress, taxW2CAllOf.employeeAddress)
				&& Objects.equals(this.originalW2, taxW2CAllOf.originalW2)
				&& Objects.equals(this.correctedW2, taxW2CAllOf.correctedW2);
	}

	@Override
	public int hashCode() {
		return Objects.hash(employerNameAddress, employerTin, employeeTin, correctedTinOrName, previousEmployeeTin,
				previousEmployeeName, employeeName, employeeAddress, originalW2, correctedW2);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TaxW2CAllOf {\n");

		sb.append("    employerNameAddress: ").append(toIndentedString(employerNameAddress)).append("\n");
		sb.append("    employerTin: ").append(toIndentedString(employerTin)).append("\n");
		sb.append("    employeeTin: ").append(toIndentedString(employeeTin)).append("\n");
		sb.append("    correctedTinOrName: ").append(toIndentedString(correctedTinOrName)).append("\n");
		sb.append("    previousEmployeeTin: ").append(toIndentedString(previousEmployeeTin)).append("\n");
		sb.append("    previousEmployeeName: ").append(toIndentedString(previousEmployeeName)).append("\n");
		sb.append("    employeeName: ").append(toIndentedString(employeeName)).append("\n");
		sb.append("    employeeAddress: ").append(toIndentedString(employeeAddress)).append("\n");
		sb.append("    originalW2: ").append(toIndentedString(originalW2)).append("\n");
		sb.append("    correctedW2: ").append(toIndentedString(correctedW2)).append("\n");
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
