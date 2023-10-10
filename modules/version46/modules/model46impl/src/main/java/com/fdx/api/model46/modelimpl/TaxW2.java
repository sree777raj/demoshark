package com.fdx.api.model46.modelimpl;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fdx.api.model46.config.ConnectionConfigApi46;
import com.fdx.api.model46.mapper.TaxW2StatementRowMapper;

import io.swagger.annotations.ApiModel;

/**
 * Wage and Tax Statement
 */
@ApiModel(description = "Wage and Tax Statement")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class TaxW2 {

	NamedParameterJdbcTemplate template;

	@JsonIgnore
	private String taxFormId;

	@JsonIgnore
	private int internalId;

	@JsonUnwrapped
	private Tax tax;

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

	public int getInternalId() {
		return internalId;
	}

	public void setInternalId(int internalId) {
		this.internalId = internalId;
	}

	public String getTaxFormId() {
		return taxFormId;
	}

	public void setTaxFormId(String taxFormId) {
		this.taxFormId = taxFormId;
	}

	public Tax getTax() {
		return tax;
	}

	public void setTax(Tax tax) {
		this.tax = tax;
	}

	public String getEmployeeTin() {
		return employeeTin;
	}

	public void setEmployeeTin(String employeeTin) {
		this.employeeTin = employeeTin;
	}

	public String getEmployerTin() {
		return employerTin;
	}

	public void setEmployerTin(String employerTin) {
		this.employerTin = employerTin;
	}

	public NameAddress getEmployerNameAddress() {
		return employerNameAddress;
	}

	public void setEmployerNameAddress(NameAddress employerNameAddress) {
		this.employerNameAddress = employerNameAddress;
	}

	public String getControlNumber() {
		return controlNumber;
	}

	public void setControlNumber(String controlNumber) {
		this.controlNumber = controlNumber;
	}

	public IndividualName getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(IndividualName employeeName) {
		this.employeeName = employeeName;
	}

	public Address getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(Address employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public Double getWages() {
		return wages;
	}

	public void setWages(Double wages) {
		this.wages = wages;
	}

	public Double getFederalTaxWithheld() {
		return federalTaxWithheld;
	}

	public void setFederalTaxWithheld(Double federalTaxWithheld) {
		this.federalTaxWithheld = federalTaxWithheld;
	}

	public Double getSocialSecurityWages() {
		return socialSecurityWages;
	}

	public void setSocialSecurityWages(Double socialSecurityWages) {
		this.socialSecurityWages = socialSecurityWages;
	}

	public Double getSocialSecurityTaxWithheld() {
		return socialSecurityTaxWithheld;
	}

	public void setSocialSecurityTaxWithheld(Double socialSecurityTaxWithheld) {
		this.socialSecurityTaxWithheld = socialSecurityTaxWithheld;
	}

	public Double getMedicareWages() {
		return medicareWages;
	}

	public void setMedicareWages(Double medicareWages) {
		this.medicareWages = medicareWages;
	}

	public Double getMedicareTaxWithheld() {
		return medicareTaxWithheld;
	}

	public void setMedicareTaxWithheld(Double medicareTaxWithheld) {
		this.medicareTaxWithheld = medicareTaxWithheld;
	}

	public Double getSocialSecurityTips() {
		return socialSecurityTips;
	}

	public void setSocialSecurityTips(Double socialSecurityTips) {
		this.socialSecurityTips = socialSecurityTips;
	}

	public Double getAllocatedTips() {
		return allocatedTips;
	}

	public void setAllocatedTips(Double allocatedTips) {
		this.allocatedTips = allocatedTips;
	}

	public Double getDependentCareBenefit() {
		return dependentCareBenefit;
	}

	public void setDependentCareBenefit(Double dependentCareBenefit) {
		this.dependentCareBenefit = dependentCareBenefit;
	}

	public Double getNonQualifiedPlan() {
		return nonQualifiedPlan;
	}

	public void setNonQualifiedPlan(Double nonQualifiedPlan) {
		this.nonQualifiedPlan = nonQualifiedPlan;
	}

	public List<CodeAmount> getCodes() {
		return codes;
	}

	public void setCodes(List<CodeAmount> codes) {
		this.codes = codes;
	}

	public Boolean getStatutory() {
		return statutory;
	}

	public void setStatutory(Boolean statutory) {
		this.statutory = statutory;
	}

	public Boolean getRetirementPlan() {
		return retirementPlan;
	}

	public void setRetirementPlan(Boolean retirementPlan) {
		this.retirementPlan = retirementPlan;
	}

	public Boolean getThirdPartySickPay() {
		return thirdPartySickPay;
	}

	public void setThirdPartySickPay(Boolean thirdPartySickPay) {
		this.thirdPartySickPay = thirdPartySickPay;
	}

	public Double getEsppQualified() {
		return esppQualified;
	}

	public void setEsppQualified(Double esppQualified) {
		this.esppQualified = esppQualified;
	}

	public Double getEsppNonQualified() {
		return esppNonQualified;
	}

	public void setEsppNonQualified(Double esppNonQualified) {
		this.esppNonQualified = esppNonQualified;
	}

	public List<DescriptionAmount> getOther() {
		return other;
	}

	public void setOther(List<DescriptionAmount> other) {
		this.other = other;
	}

	public List<StateTaxWithholding> getStateTaxWithholding() {
		return stateTaxWithholding;
	}

	public void setStateTaxWithholding(List<StateTaxWithholding> stateTaxWithholding) {
		this.stateTaxWithholding = stateTaxWithholding;
	}

	public List<LocalTaxWithholding> getLocalTaxWithholding() {
		return localTaxWithholding;
	}

	public void setLocalTaxWithholding(List<LocalTaxWithholding> localTaxWithholding) {
		this.localTaxWithholding = localTaxWithholding;
	}

	@Override
	public String toString() {
		return "TaxW2 [tax=" + tax + ", employeeTin=" + employeeTin + ", employerTin=" + employerTin
				+ ", employerNameAddress=" + employerNameAddress + ", controlNumber=" + controlNumber
				+ ", employeeName=" + employeeName + ", employeeAddress=" + employeeAddress + ", wages=" + wages
				+ ", federalTaxWithheld=" + federalTaxWithheld + ", socialSecurityWages=" + socialSecurityWages
				+ ", socialSecurityTaxWithheld=" + socialSecurityTaxWithheld + ", medicareWages=" + medicareWages
				+ ", medicareTaxWithheld=" + medicareTaxWithheld + ", socialSecurityTips=" + socialSecurityTips
				+ ", allocatedTips=" + allocatedTips + ", dependentCareBenefit=" + dependentCareBenefit
				+ ", nonQualifiedPlan=" + nonQualifiedPlan + ", codes=" + codes + ", statutory=" + statutory
				+ ", retirementPlan=" + retirementPlan + ", thirdPartySickPay=" + thirdPartySickPay + ", esppQualified="
				+ esppQualified + ", esppNonQualified=" + esppNonQualified + ", other=" + other
				+ ", stateTaxWithholding=" + stateTaxWithholding + ", localTaxWithholding=" + localTaxWithholding + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((allocatedTips == null) ? 0 : allocatedTips.hashCode());
		result = prime * result + ((codes == null) ? 0 : codes.hashCode());
		result = prime * result + ((controlNumber == null) ? 0 : controlNumber.hashCode());
		result = prime * result + ((dependentCareBenefit == null) ? 0 : dependentCareBenefit.hashCode());
		result = prime * result + ((employeeAddress == null) ? 0 : employeeAddress.hashCode());
		result = prime * result + ((employeeName == null) ? 0 : employeeName.hashCode());
		result = prime * result + ((employeeTin == null) ? 0 : employeeTin.hashCode());
		result = prime * result + ((employerNameAddress == null) ? 0 : employerNameAddress.hashCode());
		result = prime * result + ((employerTin == null) ? 0 : employerTin.hashCode());
		result = prime * result + ((esppNonQualified == null) ? 0 : esppNonQualified.hashCode());
		result = prime * result + ((esppQualified == null) ? 0 : esppQualified.hashCode());
		result = prime * result + ((federalTaxWithheld == null) ? 0 : federalTaxWithheld.hashCode());
		result = prime * result + ((localTaxWithholding == null) ? 0 : localTaxWithholding.hashCode());
		result = prime * result + ((medicareTaxWithheld == null) ? 0 : medicareTaxWithheld.hashCode());
		result = prime * result + ((medicareWages == null) ? 0 : medicareWages.hashCode());
		result = prime * result + ((nonQualifiedPlan == null) ? 0 : nonQualifiedPlan.hashCode());
		result = prime * result + ((other == null) ? 0 : other.hashCode());
		result = prime * result + ((retirementPlan == null) ? 0 : retirementPlan.hashCode());
		result = prime * result + ((socialSecurityTaxWithheld == null) ? 0 : socialSecurityTaxWithheld.hashCode());
		result = prime * result + ((socialSecurityTips == null) ? 0 : socialSecurityTips.hashCode());
		result = prime * result + ((socialSecurityWages == null) ? 0 : socialSecurityWages.hashCode());
		result = prime * result + ((stateTaxWithholding == null) ? 0 : stateTaxWithholding.hashCode());
		result = prime * result + ((statutory == null) ? 0 : statutory.hashCode());
		result = prime * result + ((tax == null) ? 0 : tax.hashCode());
		result = prime * result + ((thirdPartySickPay == null) ? 0 : thirdPartySickPay.hashCode());
		result = prime * result + ((wages == null) ? 0 : wages.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TaxW2 other = (TaxW2) obj;
		if (allocatedTips == null) {
			if (other.allocatedTips != null)
				return false;
		} else if (!allocatedTips.equals(other.allocatedTips))
			return false;
		if (codes == null) {
			if (other.codes != null)
				return false;
		} else if (!codes.equals(other.codes))
			return false;
		if (controlNumber == null) {
			if (other.controlNumber != null)
				return false;
		} else if (!controlNumber.equals(other.controlNumber))
			return false;
		if (dependentCareBenefit == null) {
			if (other.dependentCareBenefit != null)
				return false;
		} else if (!dependentCareBenefit.equals(other.dependentCareBenefit))
			return false;
		if (employeeAddress == null) {
			if (other.employeeAddress != null)
				return false;
		} else if (!employeeAddress.equals(other.employeeAddress))
			return false;
		if (employeeName == null) {
			if (other.employeeName != null)
				return false;
		} else if (!employeeName.equals(other.employeeName))
			return false;
		if (employeeTin == null) {
			if (other.employeeTin != null)
				return false;
		} else if (!employeeTin.equals(other.employeeTin))
			return false;
		if (employerNameAddress == null) {
			if (other.employerNameAddress != null)
				return false;
		} else if (!employerNameAddress.equals(other.employerNameAddress))
			return false;
		if (employerTin == null) {
			if (other.employerTin != null)
				return false;
		} else if (!employerTin.equals(other.employerTin))
			return false;
		if (esppNonQualified == null) {
			if (other.esppNonQualified != null)
				return false;
		} else if (!esppNonQualified.equals(other.esppNonQualified))
			return false;
		if (esppQualified == null) {
			if (other.esppQualified != null)
				return false;
		} else if (!esppQualified.equals(other.esppQualified))
			return false;
		if (federalTaxWithheld == null) {
			if (other.federalTaxWithheld != null)
				return false;
		} else if (!federalTaxWithheld.equals(other.federalTaxWithheld))
			return false;
		if (localTaxWithholding == null) {
			if (other.localTaxWithholding != null)
				return false;
		} else if (!localTaxWithholding.equals(other.localTaxWithholding))
			return false;
		if (medicareTaxWithheld == null) {
			if (other.medicareTaxWithheld != null)
				return false;
		} else if (!medicareTaxWithheld.equals(other.medicareTaxWithheld))
			return false;
		if (medicareWages == null) {
			if (other.medicareWages != null)
				return false;
		} else if (!medicareWages.equals(other.medicareWages))
			return false;
		if (nonQualifiedPlan == null) {
			if (other.nonQualifiedPlan != null)
				return false;
		} else if (!nonQualifiedPlan.equals(other.nonQualifiedPlan))
			return false;
		if (this.other == null) {
			if (other.other != null)
				return false;
		} else if (!this.other.equals(other.other))
			return false;
		if (retirementPlan == null) {
			if (other.retirementPlan != null)
				return false;
		} else if (!retirementPlan.equals(other.retirementPlan))
			return false;
		if (socialSecurityTaxWithheld == null) {
			if (other.socialSecurityTaxWithheld != null)
				return false;
		} else if (!socialSecurityTaxWithheld.equals(other.socialSecurityTaxWithheld))
			return false;
		if (socialSecurityTips == null) {
			if (other.socialSecurityTips != null)
				return false;
		} else if (!socialSecurityTips.equals(other.socialSecurityTips))
			return false;
		if (socialSecurityWages == null) {
			if (other.socialSecurityWages != null)
				return false;
		} else if (!socialSecurityWages.equals(other.socialSecurityWages))
			return false;
		if (stateTaxWithholding == null) {
			if (other.stateTaxWithholding != null)
				return false;
		} else if (!stateTaxWithholding.equals(other.stateTaxWithholding))
			return false;
		if (statutory == null) {
			if (other.statutory != null)
				return false;
		} else if (!statutory.equals(other.statutory))
			return false;
		if (tax == null) {
			if (other.tax != null)
				return false;
		} else if (!tax.equals(other.tax))
			return false;
		if (thirdPartySickPay == null) {
			if (other.thirdPartySickPay != null)
				return false;
		} else if (!thirdPartySickPay.equals(other.thirdPartySickPay))
			return false;
		if (wages == null) {
			if (other.wages != null)
				return false;
		} else if (!wages.equals(other.wages))
			return false;
		return true;
	}

	private static final Logger log = LoggerFactory.getLogger(TaxW2.class);

	public TaxW2 getTaxW2(int internalId) throws FDXException {
		try {
			
			template = ConnectionConfigApi46.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("internalId", internalId);

			TaxW2 taxW2 = template.queryForObject("select * from "+ DeveloperContext.getDeveloperSchema() +".taxW2 where internalId in (:internalId)",
					parameters, new TaxW2StatementRowMapper());

//			EmployerNameAddress Start
			NameAddress nameAddress = new NameAddress();
			if (taxW2.getEmployerNameAddress() != null) {
				nameAddress = nameAddress.getNameAddressDetails(taxW2.getEmployerNameAddress().getNameAddressId());
				taxW2.setEmployerNameAddress(nameAddress);
			}
//			EmployerNameAddress End

//			EmployeeName Start
			IndividualName employeeName = new IndividualName();
			if (taxW2.getEmployeeName() != null) {
				employeeName = employeeName.getIndividualName(taxW2.getEmployeeName().getNameid());
				taxW2.setEmployeeName(employeeName);
			}
//			EmployeeName End

//			EmployeeAddress Start
			Address address = new Address();
			if (taxW2.getEmployeeAddress() != null) {
				address = address.getAddress(taxW2.getEmployeeAddress().getAddressId());
				taxW2.setEmployeeAddress(address);
			}
//			EmployeeAddress End

//			Codes Start
			List<CodeAmount> codesListResponse = new ArrayList<>();
			if (taxW2.getCodes() != null) {
				List<CodeAmount> codesList = taxW2.getCodes();
				for (CodeAmount codesIterator : codesList) {
					CodeAmount codeAmount = codesIterator.getCodeAmount(codesIterator.getCodeAmountId());
					codesListResponse.add(codeAmount);
				}
				taxW2.setCodes(codesListResponse);
			}
//			Codes End

//			Other Start
			List<DescriptionAmount> otherList = taxW2.getOther();
			List<DescriptionAmount> otherListNew = new ArrayList<>();
			if (taxW2.getOther() != null) {
				for (DescriptionAmount descriptionAmountIterator : otherList) {
					DescriptionAmount descriptionAmount = descriptionAmountIterator
							.getDescriptionAmount(descriptionAmountIterator.getDescAmountId());
					otherListNew.add(descriptionAmount);
				}
				taxW2.setOther(otherListNew);
			}
//			Other End

//			StateTaxWithholding Start
			List<StateTaxWithholding> stateTaxWithholdingList = taxW2.getStateTaxWithholding();
			List<StateTaxWithholding> stateTaxWithholdingListNew = new ArrayList<>();
			if (taxW2.getStateTaxWithholding() != null) {
				for (StateTaxWithholding stateTaxWithholdingIterator : stateTaxWithholdingList) {
					StateTaxWithholding stateTaxWithholding = stateTaxWithholdingIterator
							.getStateTaxWIthHolding(stateTaxWithholdingIterator.getStwithheldid());
					stateTaxWithholdingListNew.add(stateTaxWithholding);
				}
				taxW2.setStateTaxWithholding(stateTaxWithholdingListNew);
			}
//			StateTaxWithholding End

//			LocalTaxWithholding Start
			List<LocalTaxWithholding> localTaxWithholdingList = taxW2.getLocalTaxWithholding();
			List<LocalTaxWithholding> localTaxWithholdingListNew = new ArrayList<>();
			if (taxW2.getLocalTaxWithholding() != null) {
				for (LocalTaxWithholding LocalTaxWithholdingIterator : localTaxWithholdingList) {
					LocalTaxWithholding LocalTaxWithholding = LocalTaxWithholdingIterator
							.getLocalTaxWIthHolding(LocalTaxWithholdingIterator.getLtwithheldid());
					localTaxWithholdingListNew.add(LocalTaxWithholding);
				}
				taxW2.setLocalTaxWithholding(localTaxWithholdingListNew);
			}
//			LocalTaxWithholding End
			return taxW2;

		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("TaxW2 : ", e);
			throw new FDXException(e,500);
		}
	}

}
