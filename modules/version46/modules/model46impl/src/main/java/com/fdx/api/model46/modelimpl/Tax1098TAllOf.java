package com.fdx.api.model46.modelimpl;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Tax1098TAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1098TAllOf {
	@JsonProperty("filerNameAddress")
	private NameAddressPhone filerNameAddress;

	@JsonProperty("filerTin")
	private String filerTin;

	@JsonProperty("studentTin")
	private String studentTin;

	@JsonProperty("studentTinCertification")
	@JsonInclude(Include.NON_NULL)
	private Boolean studentTinCertification;

	@JsonProperty("studentNameAddress")
	private NameAddress studentNameAddress;

	@JsonProperty("accountNumber")
	private String accountNumber;

	@JsonProperty("halfTime")
	@JsonInclude(Include.NON_NULL)
	private Boolean halfTime;

	@JsonProperty("qualifiedTuitionFees")
	private Double qualifiedTuitionFees;

	@JsonProperty("adjustmentPriorYear")
	private Double adjustmentPriorYear;

	@JsonProperty("scholarship")
	private Double scholarship;

	@JsonProperty("adjustScholarship")
	private Double adjustScholarship;

	@JsonProperty("includeJanMar")
	@JsonInclude(Include.NON_NULL)
	private Boolean includeJanMar;

	@JsonProperty("graduate")
	@JsonInclude(Include.NON_NULL)
	private Boolean graduate;

	@JsonProperty("insuranceRefund")
	private Double insuranceRefund;

	public Tax1098TAllOf filerNameAddress(NameAddressPhone filerNameAddress) {
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

	public Tax1098TAllOf filerTin(String filerTin) {
		this.filerTin = filerTin;
		return this;
	}

	/**
	 * Filer's federal identification number
	 * 
	 * @return filerTin
	 */
	@ApiModelProperty(value = "Filer's federal identification number")

	public String getFilerTin() {
		return filerTin;
	}

	public void setFilerTin(String filerTin) {
		this.filerTin = filerTin;
	}

	public Tax1098TAllOf studentTin(String studentTin) {
		this.studentTin = studentTin;
		return this;
	}

	/**
	 * Student's social security number
	 * 
	 * @return studentTin
	 */
	@ApiModelProperty(value = "Student's social security number")

	public String getStudentTin() {
		return studentTin;
	}

	public void setStudentTin(String studentTin) {
		this.studentTin = studentTin;
	}

	public Tax1098TAllOf studentTinCertification(Boolean studentTinCertification) {
		this.studentTinCertification = studentTinCertification;
		return this;
	}

	/**
	 * By checking the box in STUDENT'S TIN, filer is making a true and accurate
	 * certification under penalty of perjury that they have complied with standards
	 * promulgated by the Secretary for obtaining such individual's TIN
	 * 
	 * @return studentTinCertification
	 */
	@ApiModelProperty(value = "By checking the box in STUDENT'S TIN, filer is making a true and accurate certification under penalty of perjury that they have complied with standards promulgated by the Secretary for obtaining such individual's TIN")

	public Boolean getStudentTinCertification() {
		return studentTinCertification;
	}

	public void setStudentTinCertification(Boolean studentTinCertification) {
		this.studentTinCertification = studentTinCertification;
	}

	public Tax1098TAllOf studentNameAddress(NameAddress studentNameAddress) {
		this.studentNameAddress = studentNameAddress;
		return this;
	}

	/**
	 * Get studentNameAddress
	 * 
	 * @return studentNameAddress
	 */
	@ApiModelProperty(value = "")

	@Valid

	public NameAddress getStudentNameAddress() {
		return studentNameAddress;
	}

	public void setStudentNameAddress(NameAddress studentNameAddress) {
		this.studentNameAddress = studentNameAddress;
	}

	public Tax1098TAllOf accountNumber(String accountNumber) {
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

	public Tax1098TAllOf halfTime(Boolean halfTime) {
		this.halfTime = halfTime;
		return this;
	}

	/**
	 * Box 8, Check if at least half-time student
	 * 
	 * @return halfTime
	 */
	@ApiModelProperty(value = "Box 8, Check if at least half-time student")

	public Boolean getHalfTime() {
		return halfTime;
	}

	public void setHalfTime(Boolean halfTime) {
		this.halfTime = halfTime;
	}

	public Tax1098TAllOf qualifiedTuitionFees(Double qualifiedTuitionFees) {
		this.qualifiedTuitionFees = qualifiedTuitionFees;
		return this;
	}

	/**
	 * Box 1, Payments received for qualified tuition and related expenses
	 * 
	 * @return qualifiedTuitionFees
	 */
	@ApiModelProperty(value = "Box 1, Payments received for qualified tuition and related expenses")

	public Double getQualifiedTuitionFees() {
		return qualifiedTuitionFees;
	}

	public void setQualifiedTuitionFees(Double qualifiedTuitionFees) {
		this.qualifiedTuitionFees = qualifiedTuitionFees;
	}

	public Tax1098TAllOf adjustmentPriorYear(Double adjustmentPriorYear) {
		this.adjustmentPriorYear = adjustmentPriorYear;
		return this;
	}

	/**
	 * Box 4, Adjustments made for a prior year
	 * 
	 * @return adjustmentPriorYear
	 */
	@ApiModelProperty(value = "Box 4, Adjustments made for a prior year")

	public Double getAdjustmentPriorYear() {
		return adjustmentPriorYear;
	}

	public void setAdjustmentPriorYear(Double adjustmentPriorYear) {
		this.adjustmentPriorYear = adjustmentPriorYear;
	}

	public Tax1098TAllOf scholarship(Double scholarship) {
		this.scholarship = scholarship;
		return this;
	}

	/**
	 * Box 5, Scholarships or grants
	 * 
	 * @return scholarship
	 */
	@ApiModelProperty(value = "Box 5, Scholarships or grants")

	public Double getScholarship() {
		return scholarship;
	}

	public void setScholarship(Double scholarship) {
		this.scholarship = scholarship;
	}

	public Tax1098TAllOf adjustScholarship(Double adjustScholarship) {
		this.adjustScholarship = adjustScholarship;
		return this;
	}

	/**
	 * Box 6, Adjustments to scholarships or grants for a prior year
	 * 
	 * @return adjustScholarship
	 */
	@ApiModelProperty(value = "Box 6, Adjustments to scholarships or grants for a prior year")

	public Double getAdjustScholarship() {
		return adjustScholarship;
	}

	public void setAdjustScholarship(Double adjustScholarship) {
		this.adjustScholarship = adjustScholarship;
	}

	public Tax1098TAllOf includeJanMar(Boolean includeJanMar) {
		this.includeJanMar = includeJanMar;
		return this;
	}

	/**
	 * Box 7, Check if the amount in box 1 or box 2 includes amounts for an academic
	 * period beginning January - March of next year
	 * 
	 * @return includeJanMar
	 */
	@ApiModelProperty(value = "Box 7, Check if the amount in box 1 or box 2 includes amounts for an academic period beginning January - March of next year")

	public Boolean getIncludeJanMar() {
		return includeJanMar;
	}

	public void setIncludeJanMar(Boolean includeJanMar) {
		this.includeJanMar = includeJanMar;
	}

	public Tax1098TAllOf graduate(Boolean graduate) {
		this.graduate = graduate;
		return this;
	}

	/**
	 * Box 9, Check if graduate student
	 * 
	 * @return graduate
	 */
	@ApiModelProperty(value = "Box 9, Check if graduate student")

	public Boolean getGraduate() {
		return graduate;
	}

	public void setGraduate(Boolean graduate) {
		this.graduate = graduate;
	}

	public Tax1098TAllOf insuranceRefund(Double insuranceRefund) {
		this.insuranceRefund = insuranceRefund;
		return this;
	}

	/**
	 * Box 10, Insurance contract reimbursement / refund
	 * 
	 * @return insuranceRefund
	 */
	@ApiModelProperty(value = "Box 10, Insurance contract reimbursement / refund")

	public Double getInsuranceRefund() {
		return insuranceRefund;
	}

	public void setInsuranceRefund(Double insuranceRefund) {
		this.insuranceRefund = insuranceRefund;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Tax1098TAllOf tax1098TAllOf = (Tax1098TAllOf) o;
		return Objects.equals(this.filerNameAddress, tax1098TAllOf.filerNameAddress)
				&& Objects.equals(this.filerTin, tax1098TAllOf.filerTin)
				&& Objects.equals(this.studentTin, tax1098TAllOf.studentTin)
				&& Objects.equals(this.studentTinCertification, tax1098TAllOf.studentTinCertification)
				&& Objects.equals(this.studentNameAddress, tax1098TAllOf.studentNameAddress)
				&& Objects.equals(this.accountNumber, tax1098TAllOf.accountNumber)
				&& Objects.equals(this.halfTime, tax1098TAllOf.halfTime)
				&& Objects.equals(this.qualifiedTuitionFees, tax1098TAllOf.qualifiedTuitionFees)
				&& Objects.equals(this.adjustmentPriorYear, tax1098TAllOf.adjustmentPriorYear)
				&& Objects.equals(this.scholarship, tax1098TAllOf.scholarship)
				&& Objects.equals(this.adjustScholarship, tax1098TAllOf.adjustScholarship)
				&& Objects.equals(this.includeJanMar, tax1098TAllOf.includeJanMar)
				&& Objects.equals(this.graduate, tax1098TAllOf.graduate)
				&& Objects.equals(this.insuranceRefund, tax1098TAllOf.insuranceRefund);
	}

	@Override
	public int hashCode() {
		return Objects.hash(filerNameAddress, filerTin, studentTin, studentTinCertification, studentNameAddress,
				accountNumber, halfTime, qualifiedTuitionFees, adjustmentPriorYear, scholarship, adjustScholarship,
				includeJanMar, graduate, insuranceRefund);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Tax1098TAllOf {\n");

		sb.append("    filerNameAddress: ").append(toIndentedString(filerNameAddress)).append("\n");
		sb.append("    filerTin: ").append(toIndentedString(filerTin)).append("\n");
		sb.append("    studentTin: ").append(toIndentedString(studentTin)).append("\n");
		sb.append("    studentTinCertification: ").append(toIndentedString(studentTinCertification)).append("\n");
		sb.append("    studentNameAddress: ").append(toIndentedString(studentNameAddress)).append("\n");
		sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
		sb.append("    halfTime: ").append(toIndentedString(halfTime)).append("\n");
		sb.append("    qualifiedTuitionFees: ").append(toIndentedString(qualifiedTuitionFees)).append("\n");
		sb.append("    adjustmentPriorYear: ").append(toIndentedString(adjustmentPriorYear)).append("\n");
		sb.append("    scholarship: ").append(toIndentedString(scholarship)).append("\n");
		sb.append("    adjustScholarship: ").append(toIndentedString(adjustScholarship)).append("\n");
		sb.append("    includeJanMar: ").append(toIndentedString(includeJanMar)).append("\n");
		sb.append("    graduate: ").append(toIndentedString(graduate)).append("\n");
		sb.append("    insuranceRefund: ").append(toIndentedString(insuranceRefund)).append("\n");
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
