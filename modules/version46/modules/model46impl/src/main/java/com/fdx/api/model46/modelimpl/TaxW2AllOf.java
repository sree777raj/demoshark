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
 * TaxW2AllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class TaxW2AllOf {
	@JsonProperty("employeeTin")
	private String employeeTin;

	@JsonProperty("employerTin")
	private String employerTin;

	@JsonProperty("employerNameAddress")
	private NameAddress employerNameAddress;

	@JsonProperty("controlNumber")
	private String controlNumber;

	@JsonProperty("employeeName")
	private IndividualName employeeName;

	@JsonProperty("employeeAddress")
	private Address employeeAddress;

	@JsonProperty("wages")
	private Double wages;

	@JsonProperty("federalTaxWithheld")
	private Double federalTaxWithheld;

	@JsonProperty("socialSecurityWages")
	private Double socialSecurityWages;

	@JsonProperty("socialSecurityTaxWithheld")
	private Double socialSecurityTaxWithheld;

	@JsonProperty("medicareWages")
	private Double medicareWages;

	@JsonProperty("medicareTaxWithheld")
	private Double medicareTaxWithheld;

	@JsonProperty("socialSecurityTips")
	private Double socialSecurityTips;

	@JsonProperty("allocatedTips")
	private Double allocatedTips;

	@JsonProperty("dependentCareBenefit")
	private Double dependentCareBenefit;

	@JsonProperty("nonQualifiedPlan")
	private Double nonQualifiedPlan;

	@JsonProperty("codes")
	@Valid
	private List<CodeAmount> codes = null;

	@JsonProperty("statutory")
	@JsonInclude(Include.NON_NULL)
	private Boolean statutory;

	@JsonProperty("retirementPlan")
	@JsonInclude(Include.NON_NULL)
	private Boolean retirementPlan;

	@JsonProperty("thirdPartySickPay")
	@JsonInclude(Include.NON_NULL)
	private Boolean thirdPartySickPay;

	@JsonProperty("esppQualified")
	private Double esppQualified;

	@JsonProperty("esppNonQualified")
	private Double esppNonQualified;

	@JsonProperty("other")
	@Valid
	private List<DescriptionAmount> other = null;

	@JsonProperty("stateTaxWithholding")
	@Valid
	private List<StateTaxWithholding> stateTaxWithholding = null;

	@JsonProperty("localTaxWithholding")
	@Valid
	private List<LocalTaxWithholding> localTaxWithholding = null;

	public TaxW2AllOf employeeTin(String employeeTin) {
		this.employeeTin = employeeTin;
		return this;
	}

	/**
	 * Employee's social security number
	 * 
	 * @return employeeTin
	 */
	@ApiModelProperty(value = "Employee's social security number")

	public String getEmployeeTin() {
		return employeeTin;
	}

	public void setEmployeeTin(String employeeTin) {
		this.employeeTin = employeeTin;
	}

	public TaxW2AllOf employerTin(String employerTin) {
		this.employerTin = employerTin;
		return this;
	}

	/**
	 * Employer identification number (EIN)
	 * 
	 * @return employerTin
	 */
	@ApiModelProperty(value = "Employer identification number (EIN)")

	public String getEmployerTin() {
		return employerTin;
	}

	public void setEmployerTin(String employerTin) {
		this.employerTin = employerTin;
	}

	public TaxW2AllOf employerNameAddress(NameAddress employerNameAddress) {
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

	public TaxW2AllOf controlNumber(String controlNumber) {
		this.controlNumber = controlNumber;
		return this;
	}

	/**
	 * Control number
	 * 
	 * @return controlNumber
	 */
	@ApiModelProperty(value = "Control number")

	public String getControlNumber() {
		return controlNumber;
	}

	public void setControlNumber(String controlNumber) {
		this.controlNumber = controlNumber;
	}

	public TaxW2AllOf employeeName(IndividualName employeeName) {
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

	public TaxW2AllOf employeeAddress(Address employeeAddress) {
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

	public TaxW2AllOf wages(Double wages) {
		this.wages = wages;
		return this;
	}

	/**
	 * Box 1, Wages, tips, other compensation
	 * 
	 * @return wages
	 */
	@ApiModelProperty(value = "Box 1, Wages, tips, other compensation")

	public Double getWages() {
		return wages;
	}

	public void setWages(Double wages) {
		this.wages = wages;
	}

	public TaxW2AllOf federalTaxWithheld(Double federalTaxWithheld) {
		this.federalTaxWithheld = federalTaxWithheld;
		return this;
	}

	/**
	 * Box 2, Federal income tax withheld
	 * 
	 * @return federalTaxWithheld
	 */
	@ApiModelProperty(value = "Box 2, Federal income tax withheld")

	public Double getFederalTaxWithheld() {
		return federalTaxWithheld;
	}

	public void setFederalTaxWithheld(Double federalTaxWithheld) {
		this.federalTaxWithheld = federalTaxWithheld;
	}

	public TaxW2AllOf socialSecurityWages(Double socialSecurityWages) {
		this.socialSecurityWages = socialSecurityWages;
		return this;
	}

	/**
	 * Box 3, Social security wages
	 * 
	 * @return socialSecurityWages
	 */
	@ApiModelProperty(value = "Box 3, Social security wages")

	public Double getSocialSecurityWages() {
		return socialSecurityWages;
	}

	public void setSocialSecurityWages(Double socialSecurityWages) {
		this.socialSecurityWages = socialSecurityWages;
	}

	public TaxW2AllOf socialSecurityTaxWithheld(Double socialSecurityTaxWithheld) {
		this.socialSecurityTaxWithheld = socialSecurityTaxWithheld;
		return this;
	}

	/**
	 * Box 4, Social security tax withheld
	 * 
	 * @return socialSecurityTaxWithheld
	 */
	@ApiModelProperty(value = "Box 4, Social security tax withheld")

	public Double getSocialSecurityTaxWithheld() {
		return socialSecurityTaxWithheld;
	}

	public void setSocialSecurityTaxWithheld(Double socialSecurityTaxWithheld) {
		this.socialSecurityTaxWithheld = socialSecurityTaxWithheld;
	}

	public TaxW2AllOf medicareWages(Double medicareWages) {
		this.medicareWages = medicareWages;
		return this;
	}

	/**
	 * Box 5, Medicare wages and tips
	 * 
	 * @return medicareWages
	 */
	@ApiModelProperty(value = "Box 5, Medicare wages and tips")

	public Double getMedicareWages() {
		return medicareWages;
	}

	public void setMedicareWages(Double medicareWages) {
		this.medicareWages = medicareWages;
	}

	public TaxW2AllOf medicareTaxWithheld(Double medicareTaxWithheld) {
		this.medicareTaxWithheld = medicareTaxWithheld;
		return this;
	}

	/**
	 * Box 6, Medicare tax withheld
	 * 
	 * @return medicareTaxWithheld
	 */
	@ApiModelProperty(value = "Box 6, Medicare tax withheld")

	public Double getMedicareTaxWithheld() {
		return medicareTaxWithheld;
	}

	public void setMedicareTaxWithheld(Double medicareTaxWithheld) {
		this.medicareTaxWithheld = medicareTaxWithheld;
	}

	public TaxW2AllOf socialSecurityTips(Double socialSecurityTips) {
		this.socialSecurityTips = socialSecurityTips;
		return this;
	}

	/**
	 * Box 7, Social security tips
	 * 
	 * @return socialSecurityTips
	 */
	@ApiModelProperty(value = "Box 7, Social security tips")

	public Double getSocialSecurityTips() {
		return socialSecurityTips;
	}

	public void setSocialSecurityTips(Double socialSecurityTips) {
		this.socialSecurityTips = socialSecurityTips;
	}

	public TaxW2AllOf allocatedTips(Double allocatedTips) {
		this.allocatedTips = allocatedTips;
		return this;
	}

	/**
	 * Box 8, Allocated tips
	 * 
	 * @return allocatedTips
	 */
	@ApiModelProperty(value = "Box 8, Allocated tips")

	public Double getAllocatedTips() {
		return allocatedTips;
	}

	public void setAllocatedTips(Double allocatedTips) {
		this.allocatedTips = allocatedTips;
	}

	public TaxW2AllOf dependentCareBenefit(Double dependentCareBenefit) {
		this.dependentCareBenefit = dependentCareBenefit;
		return this;
	}

	/**
	 * Box 10, Dependent care benefits
	 * 
	 * @return dependentCareBenefit
	 */
	@ApiModelProperty(value = "Box 10, Dependent care benefits")

	public Double getDependentCareBenefit() {
		return dependentCareBenefit;
	}

	public void setDependentCareBenefit(Double dependentCareBenefit) {
		this.dependentCareBenefit = dependentCareBenefit;
	}

	public TaxW2AllOf nonQualifiedPlan(Double nonQualifiedPlan) {
		this.nonQualifiedPlan = nonQualifiedPlan;
		return this;
	}

	/**
	 * Box 11, Nonqualified plans
	 * 
	 * @return nonQualifiedPlan
	 */
	@ApiModelProperty(value = "Box 11, Nonqualified plans")

	public Double getNonQualifiedPlan() {
		return nonQualifiedPlan;
	}

	public void setNonQualifiedPlan(Double nonQualifiedPlan) {
		this.nonQualifiedPlan = nonQualifiedPlan;
	}

	public TaxW2AllOf codes(List<CodeAmount> codes) {
		this.codes = codes;
		return this;
	}

	public TaxW2AllOf addCodesItem(CodeAmount codesItem) {
		if (this.codes == null) {
			this.codes = new ArrayList<>();
		}
		this.codes.add(codesItem);
		return this;
	}

	/**
	 * Box 12, Codes and amounts
	 * 
	 * @return codes
	 */
	@ApiModelProperty(value = "Box 12, Codes and amounts")

	@Valid

	public List<CodeAmount> getCodes() {
		return codes;
	}

	public void setCodes(List<CodeAmount> codes) {
		this.codes = codes;
	}

	public TaxW2AllOf statutory(Boolean statutory) {
		this.statutory = statutory;
		return this;
	}

	/**
	 * Box 13, Statutory employee
	 * 
	 * @return statutory
	 */
	@ApiModelProperty(value = "Box 13, Statutory employee")

	public Boolean getStatutory() {
		return statutory;
	}

	public void setStatutory(Boolean statutory) {
		this.statutory = statutory;
	}

	public TaxW2AllOf retirementPlan(Boolean retirementPlan) {
		this.retirementPlan = retirementPlan;
		return this;
	}

	/**
	 * Box 13, Retirement plan
	 * 
	 * @return retirementPlan
	 */
	@ApiModelProperty(value = "Box 13, Retirement plan")

	public Boolean getRetirementPlan() {
		return retirementPlan;
	}

	public void setRetirementPlan(Boolean retirementPlan) {
		this.retirementPlan = retirementPlan;
	}

	public TaxW2AllOf thirdPartySickPay(Boolean thirdPartySickPay) {
		this.thirdPartySickPay = thirdPartySickPay;
		return this;
	}

	/**
	 * Box 13, Third-party sick pay
	 * 
	 * @return thirdPartySickPay
	 */
	@ApiModelProperty(value = "Box 13, Third-party sick pay")

	public Boolean getThirdPartySickPay() {
		return thirdPartySickPay;
	}

	public void setThirdPartySickPay(Boolean thirdPartySickPay) {
		this.thirdPartySickPay = thirdPartySickPay;
	}

	public TaxW2AllOf esppQualified(Double esppQualified) {
		this.esppQualified = esppQualified;
		return this;
	}

	/**
	 * Employee Stock Purchase Plan Qualified Disposition amount
	 * 
	 * @return esppQualified
	 */
	@ApiModelProperty(value = "Employee Stock Purchase Plan Qualified Disposition amount")

	public Double getEsppQualified() {
		return esppQualified;
	}

	public void setEsppQualified(Double esppQualified) {
		this.esppQualified = esppQualified;
	}

	public TaxW2AllOf esppNonQualified(Double esppNonQualified) {
		this.esppNonQualified = esppNonQualified;
		return this;
	}

	/**
	 * Employee Stock Purchase Plan Nonqualified Disposition amount
	 * 
	 * @return esppNonQualified
	 */
	@ApiModelProperty(value = "Employee Stock Purchase Plan Nonqualified Disposition amount")

	public Double getEsppNonQualified() {
		return esppNonQualified;
	}

	public void setEsppNonQualified(Double esppNonQualified) {
		this.esppNonQualified = esppNonQualified;
	}

	public TaxW2AllOf other(List<DescriptionAmount> other) {
		this.other = other;
		return this;
	}

	public TaxW2AllOf addOtherItem(DescriptionAmount otherItem) {
		if (this.other == null) {
			this.other = new ArrayList<>();
		}
		this.other.add(otherItem);
		return this;
	}

	/**
	 * Box 14, Other descriptions and amounts
	 * 
	 * @return other
	 */
	@ApiModelProperty(value = "Box 14, Other descriptions and amounts")

	@Valid

	public List<DescriptionAmount> getOther() {
		return other;
	}

	public void setOther(List<DescriptionAmount> other) {
		this.other = other;
	}

	public TaxW2AllOf stateTaxWithholding(List<StateTaxWithholding> stateTaxWithholding) {
		this.stateTaxWithholding = stateTaxWithholding;
		return this;
	}

	public TaxW2AllOf addStateTaxWithholdingItem(StateTaxWithholding stateTaxWithholdingItem) {
		if (this.stateTaxWithholding == null) {
			this.stateTaxWithholding = new ArrayList<>();
		}
		this.stateTaxWithholding.add(stateTaxWithholdingItem);
		return this;
	}

	/**
	 * Boxes 15-17, State tax withholding
	 * 
	 * @return stateTaxWithholding
	 */
	@ApiModelProperty(value = "Boxes 15-17, State tax withholding")

	@Valid

	public List<StateTaxWithholding> getStateTaxWithholding() {
		return stateTaxWithholding;
	}

	public void setStateTaxWithholding(List<StateTaxWithholding> stateTaxWithholding) {
		this.stateTaxWithholding = stateTaxWithholding;
	}

	public TaxW2AllOf localTaxWithholding(List<LocalTaxWithholding> localTaxWithholding) {
		this.localTaxWithholding = localTaxWithholding;
		return this;
	}

	public TaxW2AllOf addLocalTaxWithholdingItem(LocalTaxWithholding localTaxWithholdingItem) {
		if (this.localTaxWithholding == null) {
			this.localTaxWithholding = new ArrayList<>();
		}
		this.localTaxWithholding.add(localTaxWithholdingItem);
		return this;
	}

	/**
	 * Boxes 18-20, Local tax withholding
	 * 
	 * @return localTaxWithholding
	 */
	@ApiModelProperty(value = "Boxes 18-20, Local tax withholding")

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
		TaxW2AllOf taxW2AllOf = (TaxW2AllOf) o;
		return Objects.equals(this.employeeTin, taxW2AllOf.employeeTin)
				&& Objects.equals(this.employerTin, taxW2AllOf.employerTin)
				&& Objects.equals(this.employerNameAddress, taxW2AllOf.employerNameAddress)
				&& Objects.equals(this.controlNumber, taxW2AllOf.controlNumber)
				&& Objects.equals(this.employeeName, taxW2AllOf.employeeName)
				&& Objects.equals(this.employeeAddress, taxW2AllOf.employeeAddress)
				&& Objects.equals(this.wages, taxW2AllOf.wages)
				&& Objects.equals(this.federalTaxWithheld, taxW2AllOf.federalTaxWithheld)
				&& Objects.equals(this.socialSecurityWages, taxW2AllOf.socialSecurityWages)
				&& Objects.equals(this.socialSecurityTaxWithheld, taxW2AllOf.socialSecurityTaxWithheld)
				&& Objects.equals(this.medicareWages, taxW2AllOf.medicareWages)
				&& Objects.equals(this.medicareTaxWithheld, taxW2AllOf.medicareTaxWithheld)
				&& Objects.equals(this.socialSecurityTips, taxW2AllOf.socialSecurityTips)
				&& Objects.equals(this.allocatedTips, taxW2AllOf.allocatedTips)
				&& Objects.equals(this.dependentCareBenefit, taxW2AllOf.dependentCareBenefit)
				&& Objects.equals(this.nonQualifiedPlan, taxW2AllOf.nonQualifiedPlan)
				&& Objects.equals(this.codes, taxW2AllOf.codes) && Objects.equals(this.statutory, taxW2AllOf.statutory)
				&& Objects.equals(this.retirementPlan, taxW2AllOf.retirementPlan)
				&& Objects.equals(this.thirdPartySickPay, taxW2AllOf.thirdPartySickPay)
				&& Objects.equals(this.esppQualified, taxW2AllOf.esppQualified)
				&& Objects.equals(this.esppNonQualified, taxW2AllOf.esppNonQualified)
				&& Objects.equals(this.other, taxW2AllOf.other)
				&& Objects.equals(this.stateTaxWithholding, taxW2AllOf.stateTaxWithholding)
				&& Objects.equals(this.localTaxWithholding, taxW2AllOf.localTaxWithholding);
	}

	@Override
	public int hashCode() {
		return Objects.hash(employeeTin, employerTin, employerNameAddress, controlNumber, employeeName, employeeAddress,
				wages, federalTaxWithheld, socialSecurityWages, socialSecurityTaxWithheld, medicareWages,
				medicareTaxWithheld, socialSecurityTips, allocatedTips, dependentCareBenefit, nonQualifiedPlan, codes,
				statutory, retirementPlan, thirdPartySickPay, esppQualified, esppNonQualified, other,
				stateTaxWithholding, localTaxWithholding);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TaxW2AllOf {\n");

		sb.append("    employeeTin: ").append(toIndentedString(employeeTin)).append("\n");
		sb.append("    employerTin: ").append(toIndentedString(employerTin)).append("\n");
		sb.append("    employerNameAddress: ").append(toIndentedString(employerNameAddress)).append("\n");
		sb.append("    controlNumber: ").append(toIndentedString(controlNumber)).append("\n");
		sb.append("    employeeName: ").append(toIndentedString(employeeName)).append("\n");
		sb.append("    employeeAddress: ").append(toIndentedString(employeeAddress)).append("\n");
		sb.append("    wages: ").append(toIndentedString(wages)).append("\n");
		sb.append("    federalTaxWithheld: ").append(toIndentedString(federalTaxWithheld)).append("\n");
		sb.append("    socialSecurityWages: ").append(toIndentedString(socialSecurityWages)).append("\n");
		sb.append("    socialSecurityTaxWithheld: ").append(toIndentedString(socialSecurityTaxWithheld)).append("\n");
		sb.append("    medicareWages: ").append(toIndentedString(medicareWages)).append("\n");
		sb.append("    medicareTaxWithheld: ").append(toIndentedString(medicareTaxWithheld)).append("\n");
		sb.append("    socialSecurityTips: ").append(toIndentedString(socialSecurityTips)).append("\n");
		sb.append("    allocatedTips: ").append(toIndentedString(allocatedTips)).append("\n");
		sb.append("    dependentCareBenefit: ").append(toIndentedString(dependentCareBenefit)).append("\n");
		sb.append("    nonQualifiedPlan: ").append(toIndentedString(nonQualifiedPlan)).append("\n");
		sb.append("    codes: ").append(toIndentedString(codes)).append("\n");
		sb.append("    statutory: ").append(toIndentedString(statutory)).append("\n");
		sb.append("    retirementPlan: ").append(toIndentedString(retirementPlan)).append("\n");
		sb.append("    thirdPartySickPay: ").append(toIndentedString(thirdPartySickPay)).append("\n");
		sb.append("    esppQualified: ").append(toIndentedString(esppQualified)).append("\n");
		sb.append("    esppNonQualified: ").append(toIndentedString(esppNonQualified)).append("\n");
		sb.append("    other: ").append(toIndentedString(other)).append("\n");
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
