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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fdx.api.model46.config.ConnectionConfigApi46;
import com.fdx.api.model46.mapper.Tax1095CRowMapper;

import io.swagger.annotations.ApiModel;

/**
 * Employer-Provided Health Insurance Offer and Coverage
 */
@ApiModel(description = "Employer-Provided Health Insurance Offer and Coverage")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1095C {

	NamedParameterJdbcTemplate template;

	@JsonUnwrapped
	private Tax tax;

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

	public Tax getTax() {
		return tax;
	}

	public void setTax(Tax tax) {
		this.tax = tax;
	}

	public IndividualName getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(IndividualName employeeName) {
		this.employeeName = employeeName;
	}

	public String getTin() {
		return tin;
	}

	public void setTin(String tin) {
		this.tin = tin;
	}

	public Address getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(Address employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public NameAddressPhone getEmployerNameAddressPhone() {
		return employerNameAddressPhone;
	}

	public void setEmployerNameAddressPhone(NameAddressPhone employerNameAddressPhone) {
		this.employerNameAddressPhone = employerNameAddressPhone;
	}

	public NameAddressPhone getEmployerNameAddress() {
		return employerNameAddress;
	}

	public void setEmployerNameAddress(NameAddressPhone employerNameAddress) {
		this.employerNameAddress = employerNameAddress;
	}

	public String getEmployerId() {
		return employerId;
	}

	public void setEmployerId(String employerId) {
		this.employerId = employerId;
	}

	public String getEmployerTin() {
		return employerTin;
	}

	public void setEmployerTin(String employerTin) {
		this.employerTin = employerTin;
	}

	public Boolean getSelfInsuredCoverage() {
		return selfInsuredCoverage;
	}

	public void setSelfInsuredCoverage(Boolean selfInsuredCoverage) {
		this.selfInsuredCoverage = selfInsuredCoverage;
	}

	public List<OfferOfHealthInsuranceCoverage> getOffersOfCoverage() {
		return offersOfCoverage;
	}

	public void setOffersOfCoverage(List<OfferOfHealthInsuranceCoverage> offersOfCoverage) {
		this.offersOfCoverage = offersOfCoverage;
	}

	public Integer getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(Integer employeeAge) {
		this.employeeAge = employeeAge;
	}

	public Integer getPlanStartMonth() {
		return planStartMonth;
	}

	public void setPlanStartMonth(Integer planStartMonth) {
		this.planStartMonth = planStartMonth;
	}

	public List<HealthInsuranceCoveredIndividual> getCoveredIndividuals() {
		return coveredIndividuals;
	}

	public void setCoveredIndividuals(List<HealthInsuranceCoveredIndividual> coveredIndividuals) {
		this.coveredIndividuals = coveredIndividuals;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((coveredIndividuals == null) ? 0 : coveredIndividuals.hashCode());
		result = prime * result + ((employeeAddress == null) ? 0 : employeeAddress.hashCode());
		result = prime * result + ((employeeAge == null) ? 0 : employeeAge.hashCode());
		result = prime * result + ((employeeName == null) ? 0 : employeeName.hashCode());
		result = prime * result + ((employerId == null) ? 0 : employerId.hashCode());
		result = prime * result + ((employerNameAddress == null) ? 0 : employerNameAddress.hashCode());
		result = prime * result + ((employerNameAddressPhone == null) ? 0 : employerNameAddressPhone.hashCode());
		result = prime * result + ((employerTin == null) ? 0 : employerTin.hashCode());
		result = prime * result + ((offersOfCoverage == null) ? 0 : offersOfCoverage.hashCode());
		result = prime * result + ((planStartMonth == null) ? 0 : planStartMonth.hashCode());
		result = prime * result + ((selfInsuredCoverage == null) ? 0 : selfInsuredCoverage.hashCode());
		result = prime * result + ((tax == null) ? 0 : tax.hashCode());
		result = prime * result + ((tin == null) ? 0 : tin.hashCode());
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
		Tax1095C other = (Tax1095C) obj;
		if (coveredIndividuals == null) {
			if (other.coveredIndividuals != null)
				return false;
		} else if (!coveredIndividuals.equals(other.coveredIndividuals))
			return false;
		if (employeeAddress == null) {
			if (other.employeeAddress != null)
				return false;
		} else if (!employeeAddress.equals(other.employeeAddress))
			return false;
		if (employeeAge == null) {
			if (other.employeeAge != null)
				return false;
		} else if (!employeeAge.equals(other.employeeAge))
			return false;
		if (employeeName == null) {
			if (other.employeeName != null)
				return false;
		} else if (!employeeName.equals(other.employeeName))
			return false;
		if (employerId == null) {
			if (other.employerId != null)
				return false;
		} else if (!employerId.equals(other.employerId))
			return false;
		if (employerNameAddress == null) {
			if (other.employerNameAddress != null)
				return false;
		} else if (!employerNameAddress.equals(other.employerNameAddress))
			return false;
		if (employerNameAddressPhone == null) {
			if (other.employerNameAddressPhone != null)
				return false;
		} else if (!employerNameAddressPhone.equals(other.employerNameAddressPhone))
			return false;
		if (employerTin == null) {
			if (other.employerTin != null)
				return false;
		} else if (!employerTin.equals(other.employerTin))
			return false;
		if (offersOfCoverage == null) {
			if (other.offersOfCoverage != null)
				return false;
		} else if (!offersOfCoverage.equals(other.offersOfCoverage))
			return false;
		if (planStartMonth == null) {
			if (other.planStartMonth != null)
				return false;
		} else if (!planStartMonth.equals(other.planStartMonth))
			return false;
		if (selfInsuredCoverage == null) {
			if (other.selfInsuredCoverage != null)
				return false;
		} else if (!selfInsuredCoverage.equals(other.selfInsuredCoverage))
			return false;
		if (tax == null) {
			if (other.tax != null)
				return false;
		} else if (!tax.equals(other.tax))
			return false;
		if (tin == null) {
			if (other.tin != null)
				return false;
		} else if (!tin.equals(other.tin))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tax1095C [tax=" + tax + ", employeeName=" + employeeName + ", tin=" + tin + ", employeeAddress="
				+ employeeAddress + ", employerNameAddressPhone=" + employerNameAddressPhone + ", employerNameAddress="
				+ employerNameAddress + ", employerId=" + employerId + ", employerTin=" + employerTin
				+ ", selfInsuredCoverage=" + selfInsuredCoverage + ", offersOfCoverage=" + offersOfCoverage
				+ ", employeeAge=" + employeeAge + ", planStartMonth=" + planStartMonth + ", coveredIndividuals="
				+ coveredIndividuals + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(Tax1095C.class);

	public Tax1095C getTax1095C(int internalId) throws FDXException {
		try {
			
			template = ConnectionConfigApi46.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("internalId", internalId);

			Tax1095C tax1095C = template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".tax1095C where internalId in (:internalId)", parameters,
					new Tax1095CRowMapper());

//			CoveredIndividuals Start
			List<HealthInsuranceCoveredIndividual> healthInsuranceCoveredIndividualListResponse = new ArrayList<>();
			if (tax1095C.getCoveredIndividuals() != null) {
				List<HealthInsuranceCoveredIndividual> coveredList = tax1095C.getCoveredIndividuals();
				for (HealthInsuranceCoveredIndividual coveredIterator : coveredList) {
					HealthInsuranceCoveredIndividual healthInsuranceMarketplaceCoveredIndividual = coveredIterator
							.getHiCidDetails(coveredIterator.getHiciid());
					healthInsuranceCoveredIndividualListResponse.add(healthInsuranceMarketplaceCoveredIndividual);
				}
				tax1095C.setCoveredIndividuals(healthInsuranceCoveredIndividualListResponse);
			}
//			CoveredIndividuals End 

//			OfferOfHealthInsuranceCoverage Start
			List<OfferOfHealthInsuranceCoverage> offerOfHealthInsuranceCoverageListResponse = new ArrayList<>();
			if (tax1095C.getOffersOfCoverage() != null) {
				List<OfferOfHealthInsuranceCoverage> offersOfCoverageList = tax1095C.getOffersOfCoverage();
				for (OfferOfHealthInsuranceCoverage offersOfCoverage : offersOfCoverageList) {
					OfferOfHealthInsuranceCoverage offerOfHealthInsuranceCoverage = offersOfCoverage
							.getOohicidDetails(offersOfCoverage.getOohicid());
					offerOfHealthInsuranceCoverageListResponse.add(offerOfHealthInsuranceCoverage);
				}
				tax1095C.setOffersOfCoverage(offerOfHealthInsuranceCoverageListResponse);
			}
//			OfferOfHealthInsuranceCoverage End 

//			employeeAddress Start
			Address employeeAddress = new Address();
			if (tax1095C.getEmployeeAddress() != null) {
				employeeAddress = employeeAddress.getAddress(tax1095C.getEmployeeAddress().getAddressId());
				tax1095C.setEmployeeAddress(employeeAddress);
			}
//			employeeAddress End

//			Emloyernameaddress Start
			NameAddressPhone emloyernameaddress = new NameAddressPhone();
			if (tax1095C.getEmployerNameAddress() != null) {
				emloyernameaddress = emloyernameaddress
						.getNameAddressPhoneDetails(tax1095C.getEmployerNameAddress().getNameAddressId());
				tax1095C.setEmployerNameAddress(emloyernameaddress);
			}
//			Emloyernameaddress End

//			Employernameaddressphone Start
			NameAddressPhone employernameaddressphone = new NameAddressPhone();
			if (tax1095C.getEmployerNameAddressPhone() != null) {
				employernameaddressphone = employernameaddressphone
						.getNameAddressPhoneDetails(tax1095C.getEmployerNameAddressPhone().getNameAddressId());
				tax1095C.setEmployerNameAddressPhone(employernameaddressphone);
			}
//			Employernameaddressphone End

//			EmployeeName Start
			IndividualName EmployeeName = new IndividualName();
			if (tax1095C.getEmployeeName() != null) {
				EmployeeName = EmployeeName.getIndividualName(tax1095C.getEmployeeName().getNameid());
				tax1095C.setEmployeeName(EmployeeName);
			}
//			EmployeeName End

			return tax1095C;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Tax1095C : ", e);
			throw new FDXException(e,500);
		}
	}

}
