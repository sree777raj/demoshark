package com.fdx.api.model51.modelimpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.OptBoolean;
import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fdx.api.model51.config.ConnectionConfigApi51;
import com.fdx.api.model51.mapper.Tax1095BRowMapper;

import io.swagger.annotations.ApiModel;

/**
 * Health Coverage
 */
@ApiModel(description = "Health Coverage")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1095B {

	NamedParameterJdbcTemplate template;

	@JsonUnwrapped
	private Tax tax;

	@JsonProperty("responsibleName")
	private IndividualName responsibleName;

	@JsonProperty("responsibleTin")
	private String responsibleTin;

	@JsonProperty("responsibleDateOfBirth")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private Date responsibleDateOfBirth;

	@JsonProperty("responsibleAddress")
	private Address responsibleAddress;

	@JsonProperty("originOfHealthCoverageCode")
	private String originOfHealthCoverageCode;

	@JsonProperty("employerNameAddress")
	private NameAddress employerNameAddress;

	@JsonProperty("employerId")
	private String employerId;

	@JsonProperty("employerTin")
	private String employerTin;

	@JsonProperty("issuerNameAddressPhone")
	private NameAddressPhone issuerNameAddressPhone;

	@JsonProperty("issuerNameAddress")
	private NameAddressPhone issuerNameAddress;

	@JsonProperty("issuerId")
	private String issuerId;

	@JsonProperty("issuerTin")
	private String issuerTin;

	@JsonProperty("coveredIndividuals")
	@Valid
	private List<HealthInsuranceCoveredIndividual> coveredIndividuals = null;

	public Tax getTax() {
		return tax;
	}

	public void setTax(Tax tax) {
		this.tax = tax;
	}

	public IndividualName getResponsibleName() {
		return responsibleName;
	}

	public void setResponsibleName(IndividualName responsibleName) {
		this.responsibleName = responsibleName;
	}

	public String getResponsibleTin() {
		return responsibleTin;
	}

	public void setResponsibleTin(String responsibleTin) {
		this.responsibleTin = responsibleTin;
	}

	public Date getResponsibleDateOfBirth() {
		return responsibleDateOfBirth;
	}

	public void setResponsibleDateOfBirth(Date responsibleDateOfBirth) {
		this.responsibleDateOfBirth = responsibleDateOfBirth;
	}

	public Address getResponsibleAddress() {
		return responsibleAddress;
	}

	public void setResponsibleAddress(Address responsibleAddress) {
		this.responsibleAddress = responsibleAddress;
	}

	public String getOriginOfHealthCoverageCode() {
		return originOfHealthCoverageCode;
	}

	public void setOriginOfHealthCoverageCode(String originOfHealthCoverageCode) {
		this.originOfHealthCoverageCode = originOfHealthCoverageCode;
	}

	public NameAddress getEmployerNameAddress() {
		return employerNameAddress;
	}

	public void setEmployerNameAddress(NameAddress employerNameAddress) {
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

	public NameAddressPhone getIssuerNameAddressPhone() {
		return issuerNameAddressPhone;
	}

	public void setIssuerNameAddressPhone(NameAddressPhone issuerNameAddressPhone) {
		this.issuerNameAddressPhone = issuerNameAddressPhone;
	}

	public NameAddressPhone getIssuerNameAddress() {
		return issuerNameAddress;
	}

	public void setIssuerNameAddress(NameAddressPhone issuerNameAddress) {
		this.issuerNameAddress = issuerNameAddress;
	}

	public String getIssuerId() {
		return issuerId;
	}

	public void setIssuerId(String issuerId) {
		this.issuerId = issuerId;
	}

	public String getIssuerTin() {
		return issuerTin;
	}

	public void setIssuerTin(String issuerTin) {
		this.issuerTin = issuerTin;
	}

	public List<HealthInsuranceCoveredIndividual> getCoveredIndividuals() {
		return coveredIndividuals;
	}

	public void setCoveredIndividuals(List<HealthInsuranceCoveredIndividual> coveredIndividuals) {
		this.coveredIndividuals = coveredIndividuals;
	}

	@Override
	public String toString() {
		return "Tax1095B [tax=" + tax + ", responsibleName=" + responsibleName + ", responsibleTin=" + responsibleTin
				+ ", responsibleDateOfBirth=" + responsibleDateOfBirth + ", responsibleAddress=" + responsibleAddress
				+ ", originOfHealthCoverageCode=" + originOfHealthCoverageCode + ", employerNameAddress="
				+ employerNameAddress + ", employerId=" + employerId + ", employerTin=" + employerTin
				+ ", issuerNameAddressPhone=" + issuerNameAddressPhone + ", issuerNameAddress=" + issuerNameAddress
				+ ", issuerId=" + issuerId + ", issuerTin=" + issuerTin + ", coveredIndividuals=" + coveredIndividuals
				+ "]";
	}

	private static final Logger log = LoggerFactory.getLogger(Tax1095B.class);

	public Tax1095B getTax1095B(int internalId) throws FDXException {
		try {
			
			template = ConnectionConfigApi51.getTemplate();
			SqlParameterSource parameters = new MapSqlParameterSource("internalId", internalId);
			Tax1095B tax1095B;
			try {
				tax1095B = template.queryForObject(
						"select * from "+ DeveloperContext.getDeveloperSchema() +".tax1095B where internalId in (:internalId)", parameters,
						new Tax1095BRowMapper());
			} catch (EmptyResultDataAccessException e) {
				throw new FDXException("Tax1095B not found", 0);
			}
//			CoveredIndividuals Start
			List<HealthInsuranceCoveredIndividual> healthInsuranceCoveredIndividualListResponse = new ArrayList<>();
			if (tax1095B.getCoveredIndividuals() != null) {
				List<HealthInsuranceCoveredIndividual> coveredList = tax1095B.getCoveredIndividuals();
				for (HealthInsuranceCoveredIndividual coveredIterator : coveredList) {
					HealthInsuranceCoveredIndividual healthInsuranceMarketplaceCoveredIndividual = coveredIterator
							.getHiCidDetails(coveredIterator.getHiciid());
					healthInsuranceCoveredIndividualListResponse.add(healthInsuranceMarketplaceCoveredIndividual);
				}
				tax1095B.setCoveredIndividuals(healthInsuranceCoveredIndividualListResponse);
			}
//			CoveredIndividuals End 

//			Employernameaddress Start
			NameAddress employerNameAddress = new NameAddress();
			if (tax1095B.getEmployerNameAddress() != null) {
				employerNameAddress = employerNameAddress
						.getNameAddressDetails(tax1095B.getEmployerNameAddress().getNameAddressId());
				tax1095B.setEmployerNameAddress(employerNameAddress);
			}
//			Employernameaddress End

//			issuernameaddress Start
			NameAddressPhone issuerNameAddress = new NameAddressPhone();
			if (tax1095B.getIssuerNameAddress() != null) {
				issuerNameAddress = issuerNameAddress
						.getNameAddressPhoneDetails(tax1095B.getIssuerNameAddress().getNameAddressId());
				tax1095B.setIssuerNameAddress(issuerNameAddress);
			}
//			issuernameaddress End

//			issuernameaddressphone Start
			NameAddressPhone issuerNameAddressPhone = new NameAddressPhone();
			if (tax1095B.getIssuerNameAddressPhone() != null) {
				issuerNameAddressPhone = issuerNameAddressPhone
						.getNameAddressPhoneDetails(tax1095B.getIssuerNameAddressPhone().getNameAddressId());
				tax1095B.setIssuerNameAddressPhone(issuerNameAddressPhone);
			}
//			issuernameaddressphone End

//			ResponsibleAddress Start
			Address responsibleAddress = new Address();
			if (tax1095B.getResponsibleAddress() != null) {
				responsibleAddress = responsibleAddress.getAddress(tax1095B.getResponsibleAddress().getAddressId());
				tax1095B.setResponsibleAddress(responsibleAddress);
			}
//			ResponsibleAddress End

//			ResponsibleName Start
			IndividualName responsibleName = new IndividualName();
			if (tax1095B.getResponsibleName() != null) {
				responsibleName = responsibleName.getIndividualName(tax1095B.getResponsibleName().getNameid());
				tax1095B.setResponsibleName(responsibleName);
			}
//			ResponsibleName End

			return tax1095B;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Tax1095B : ", e);
			throw new FDXException(e,500);
		}
	}

}
