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
 * Tax1095CAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1095CAllOf {
	@JsonProperty("employeeName")
	private IndividualName employeeName;

	@JsonProperty("tin")
	private String tin;

	@JsonProperty("employeeAddress")
	private Address employeeAddress;

	@JsonProperty("employerNameAddressPhone")
	private NameAddressPhone employerNameAddressPhone;

	@JsonProperty("employerNameAddress")
	private NameAddressPhone employerNameAddress;

	@JsonProperty("employerId")
	private String employerId;

	@JsonProperty("employerTin")
	private String employerTin;

	@JsonProperty("selfInsuredCoverage")
	@JsonInclude(Include.NON_NULL)
	private Boolean selfInsuredCoverage;

	@JsonProperty("offersOfCoverage")
	@Valid
	private List<OfferOfHealthInsuranceCoverage> offersOfCoverage = null;

	@JsonProperty("employeeAge")
	private Integer employeeAge;

	@JsonProperty("planStartMonth")
	private Integer planStartMonth;

	@JsonProperty("coveredIndividuals")
	@Valid
	private List<HealthInsuranceCoveredIndividual> coveredIndividuals = null;

	public Tax1095CAllOf employeeName(IndividualName employeeName) {
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

	public Tax1095CAllOf tin(String tin) {
		this.tin = tin;
		return this;
	}

	/**
	 * Box 2, Social security number (SSN)
	 * 
	 * @return tin
	 */
	@ApiModelProperty(value = "Box 2, Social security number (SSN)")

	public String getTin() {
		return tin;
	}

	public void setTin(String tin) {
		this.tin = tin;
	}

	public Tax1095CAllOf employeeAddress(Address employeeAddress) {
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

	public Tax1095CAllOf employerNameAddressPhone(NameAddressPhone employerNameAddressPhone) {
		this.employerNameAddressPhone = employerNameAddressPhone;
		return this;
	}

	/**
	 * Get employerNameAddressPhone
	 * 
	 * @return employerNameAddressPhone
	 */
	@ApiModelProperty(value = "")

	@Valid

	public NameAddressPhone getEmployerNameAddressPhone() {
		return employerNameAddressPhone;
	}

	public void setEmployerNameAddressPhone(NameAddressPhone employerNameAddressPhone) {
		this.employerNameAddressPhone = employerNameAddressPhone;
	}

	public Tax1095CAllOf employerNameAddress(NameAddressPhone employerNameAddress) {
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

	public NameAddressPhone getEmployerNameAddress() {
		return employerNameAddress;
	}

	public void setEmployerNameAddress(NameAddressPhone employerNameAddress) {
		this.employerNameAddress = employerNameAddress;
	}

	public Tax1095CAllOf employerId(String employerId) {
		this.employerId = employerId;
		return this;
	}

	/**
	 * Box 8, Employer identification number (EIN) (deprecated for rename to
	 * employerTin, removing in FDX v5.0)
	 * 
	 * @return employerId
	 */
	@ApiModelProperty(value = "Box 8, Employer identification number (EIN) (deprecated for rename to employerTin, removing in FDX v5.0)")

	public String getEmployerId() {
		return employerId;
	}

	public void setEmployerId(String employerId) {
		this.employerId = employerId;
	}

	public Tax1095CAllOf employerTin(String employerTin) {
		this.employerTin = employerTin;
		return this;
	}

	/**
	 * Box 8, Employer identification number (EIN)
	 * 
	 * @return employerTin
	 */
	@ApiModelProperty(value = "Box 8, Employer identification number (EIN)")

	public String getEmployerTin() {
		return employerTin;
	}

	public void setEmployerTin(String employerTin) {
		this.employerTin = employerTin;
	}

	public Tax1095CAllOf selfInsuredCoverage(Boolean selfInsuredCoverage) {
		this.selfInsuredCoverage = selfInsuredCoverage;
		return this;
	}

	/**
	 * Self Insured Coverage
	 * 
	 * @return selfInsuredCoverage
	 */
	@ApiModelProperty(value = "Self Insured Coverage")

	public Boolean getSelfInsuredCoverage() {
		return selfInsuredCoverage;
	}

	public void setSelfInsuredCoverage(Boolean selfInsuredCoverage) {
		this.selfInsuredCoverage = selfInsuredCoverage;
	}

	public Tax1095CAllOf offersOfCoverage(List<OfferOfHealthInsuranceCoverage> offersOfCoverage) {
		this.offersOfCoverage = offersOfCoverage;
		return this;
	}

	public Tax1095CAllOf addOffersOfCoverageItem(OfferOfHealthInsuranceCoverage offersOfCoverageItem) {
		if (this.offersOfCoverage == null) {
			this.offersOfCoverage = new ArrayList<>();
		}
		this.offersOfCoverage.add(offersOfCoverageItem);
		return this;
	}

	/**
	 * Boxes 14-16, Employee Offer of Coverage
	 * 
	 * @return offersOfCoverage
	 */
	@ApiModelProperty(value = "Boxes 14-16, Employee Offer of Coverage")

	@Valid

	public List<OfferOfHealthInsuranceCoverage> getOffersOfCoverage() {
		return offersOfCoverage;
	}

	public void setOffersOfCoverage(List<OfferOfHealthInsuranceCoverage> offersOfCoverage) {
		this.offersOfCoverage = offersOfCoverage;
	}

	public Tax1095CAllOf employeeAge(Integer employeeAge) {
		this.employeeAge = employeeAge;
		return this;
	}

	/**
	 * Employee's Age on January 1
	 * 
	 * @return employeeAge
	 */
	@ApiModelProperty(value = "Employee's Age on January 1")

	public Integer getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(Integer employeeAge) {
		this.employeeAge = employeeAge;
	}

	public Tax1095CAllOf planStartMonth(Integer planStartMonth) {
		this.planStartMonth = planStartMonth;
		return this;
	}

	/**
	 * Plan Start Month
	 * 
	 * @return planStartMonth
	 */
	@ApiModelProperty(value = "Plan Start Month")

	public Integer getPlanStartMonth() {
		return planStartMonth;
	}

	public void setPlanStartMonth(Integer planStartMonth) {
		this.planStartMonth = planStartMonth;
	}

	public Tax1095CAllOf coveredIndividuals(List<HealthInsuranceCoveredIndividual> coveredIndividuals) {
		this.coveredIndividuals = coveredIndividuals;
		return this;
	}

	public Tax1095CAllOf addCoveredIndividualsItem(HealthInsuranceCoveredIndividual coveredIndividualsItem) {
		if (this.coveredIndividuals == null) {
			this.coveredIndividuals = new ArrayList<>();
		}
		this.coveredIndividuals.add(coveredIndividualsItem);
		return this;
	}

	/**
	 * Boxes 17+, Covered Individuals
	 * 
	 * @return coveredIndividuals
	 */
	@ApiModelProperty(value = "Boxes 17+, Covered Individuals")

	@Valid

	public List<HealthInsuranceCoveredIndividual> getCoveredIndividuals() {
		return coveredIndividuals;
	}

	public void setCoveredIndividuals(List<HealthInsuranceCoveredIndividual> coveredIndividuals) {
		this.coveredIndividuals = coveredIndividuals;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Tax1095CAllOf tax1095CAllOf = (Tax1095CAllOf) o;
		return Objects.equals(this.employeeName, tax1095CAllOf.employeeName)
				&& Objects.equals(this.tin, tax1095CAllOf.tin)
				&& Objects.equals(this.employeeAddress, tax1095CAllOf.employeeAddress)
				&& Objects.equals(this.employerNameAddressPhone, tax1095CAllOf.employerNameAddressPhone)
				&& Objects.equals(this.employerNameAddress, tax1095CAllOf.employerNameAddress)
				&& Objects.equals(this.employerId, tax1095CAllOf.employerId)
				&& Objects.equals(this.employerTin, tax1095CAllOf.employerTin)
				&& Objects.equals(this.selfInsuredCoverage, tax1095CAllOf.selfInsuredCoverage)
				&& Objects.equals(this.offersOfCoverage, tax1095CAllOf.offersOfCoverage)
				&& Objects.equals(this.employeeAge, tax1095CAllOf.employeeAge)
				&& Objects.equals(this.planStartMonth, tax1095CAllOf.planStartMonth)
				&& Objects.equals(this.coveredIndividuals, tax1095CAllOf.coveredIndividuals);
	}

	@Override
	public int hashCode() {
		return Objects.hash(employeeName, tin, employeeAddress, employerNameAddressPhone, employerNameAddress,
				employerId, employerTin, selfInsuredCoverage, offersOfCoverage, employeeAge, planStartMonth,
				coveredIndividuals);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Tax1095CAllOf {\n");

		sb.append("    employeeName: ").append(toIndentedString(employeeName)).append("\n");
		sb.append("    tin: ").append(toIndentedString(tin)).append("\n");
		sb.append("    employeeAddress: ").append(toIndentedString(employeeAddress)).append("\n");
		sb.append("    employerNameAddressPhone: ").append(toIndentedString(employerNameAddressPhone)).append("\n");
		sb.append("    employerNameAddress: ").append(toIndentedString(employerNameAddress)).append("\n");
		sb.append("    employerId: ").append(toIndentedString(employerId)).append("\n");
		sb.append("    employerTin: ").append(toIndentedString(employerTin)).append("\n");
		sb.append("    selfInsuredCoverage: ").append(toIndentedString(selfInsuredCoverage)).append("\n");
		sb.append("    offersOfCoverage: ").append(toIndentedString(offersOfCoverage)).append("\n");
		sb.append("    employeeAge: ").append(toIndentedString(employeeAge)).append("\n");
		sb.append("    planStartMonth: ").append(toIndentedString(planStartMonth)).append("\n");
		sb.append("    coveredIndividuals: ").append(toIndentedString(coveredIndividuals)).append("\n");
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
