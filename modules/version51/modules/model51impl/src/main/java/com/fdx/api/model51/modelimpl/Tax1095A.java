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
import com.fdx.api.model51.mapper.Tax1095ARowMapper;

import io.swagger.annotations.ApiModel;

/**
 * Health Insurance Marketplace Statement
 */
@ApiModel(description = "Health Insurance Marketplace Statement")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1095A {

	NamedParameterJdbcTemplate template;

	@JsonUnwrapped
	private Tax tax;

	@JsonProperty("marketplaceId")
	private String marketplaceId;

	@JsonProperty("marketplacePolicyNumber")
	private String marketplacePolicyNumber;

	@JsonProperty("policyIssuerName")
	private String policyIssuerName;

	@JsonProperty("recipientName")
	private String recipientName;

	@JsonProperty("recipientTin")
	private String recipientTin;

	@JsonProperty("recipientDateOfBirth")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private Date recipientDateOfBirth;

	@JsonProperty("spouseName")
	private String spouseName;

	@JsonProperty("spouseTin")
	private String spouseTin;

	@JsonProperty("spouseDateOfBirth")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private Date spouseDateOfBirth;

	@JsonProperty("policyStartDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private Date policyStartDate;

	@JsonProperty("policyTerminationDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private Date policyTerminationDate;

	@JsonProperty("recipientAddress")
	private Address recipientAddress;

	@JsonProperty("coveredIndividuals")
	@Valid
	private List<HealthInsuranceMarketplaceCoveredIndividual> coveredIndividuals = null;

	@JsonProperty("coverages")
	@Valid
	private List<HealthInsuranceCoverage> coverages = null;

	public Tax getTax() {
		return tax;
	}

	public void setTax(Tax tax) {
		this.tax = tax;
	}

	public String getMarketplaceId() {
		return marketplaceId;
	}

	public void setMarketplaceId(String marketplaceId) {
		this.marketplaceId = marketplaceId;
	}

	public String getMarketplacePolicyNumber() {
		return marketplacePolicyNumber;
	}

	public void setMarketplacePolicyNumber(String marketplacePolicyNumber) {
		this.marketplacePolicyNumber = marketplacePolicyNumber;
	}

	public String getPolicyIssuerName() {
		return policyIssuerName;
	}

	public void setPolicyIssuerName(String policyIssuerName) {
		this.policyIssuerName = policyIssuerName;
	}

	public String getRecipientName() {
		return recipientName;
	}

	public void setRecipientName(String recipientName) {
		this.recipientName = recipientName;
	}

	public String getRecipientTin() {
		return recipientTin;
	}

	public void setRecipientTin(String recipientTin) {
		this.recipientTin = recipientTin;
	}

	public Date getRecipientDateOfBirth() {
		return recipientDateOfBirth;
	}

	public void setRecipientDateOfBirth(Date recipientDateOfBirth) {
		this.recipientDateOfBirth = recipientDateOfBirth;
	}

	public String getSpouseName() {
		return spouseName;
	}

	public void setSpouseName(String spouseName) {
		this.spouseName = spouseName;
	}

	public String getSpouseTin() {
		return spouseTin;
	}

	public void setSpouseTin(String spouseTin) {
		this.spouseTin = spouseTin;
	}

	public Date getSpouseDateOfBirth() {
		return spouseDateOfBirth;
	}

	public void setSpouseDateOfBirth(Date spouseDateOfBirth) {
		this.spouseDateOfBirth = spouseDateOfBirth;
	}

	public Date getPolicyStartDate() {
		return policyStartDate;
	}

	public void setPolicyStartDate(Date policyStartDate) {
		this.policyStartDate = policyStartDate;
	}

	public Date getPolicyTerminationDate() {
		return policyTerminationDate;
	}

	public void setPolicyTerminationDate(Date policyTerminationDate) {
		this.policyTerminationDate = policyTerminationDate;
	}

	public Address getRecipientAddress() {
		return recipientAddress;
	}

	public void setRecipientAddress(Address recipientAddress) {
		this.recipientAddress = recipientAddress;
	}

	public List<HealthInsuranceMarketplaceCoveredIndividual> getCoveredIndividuals() {
		return coveredIndividuals;
	}

	public void setCoveredIndividuals(List<HealthInsuranceMarketplaceCoveredIndividual> coveredIndividuals) {
		this.coveredIndividuals = coveredIndividuals;
	}

	public List<HealthInsuranceCoverage> getCoverages() {
		return coverages;
	}

	public void setCoverages(List<HealthInsuranceCoverage> coverages) {
		this.coverages = coverages;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((coverages == null) ? 0 : coverages.hashCode());
		result = prime * result + ((coveredIndividuals == null) ? 0 : coveredIndividuals.hashCode());
		result = prime * result + ((marketplaceId == null) ? 0 : marketplaceId.hashCode());
		result = prime * result + ((marketplacePolicyNumber == null) ? 0 : marketplacePolicyNumber.hashCode());
		result = prime * result + ((policyIssuerName == null) ? 0 : policyIssuerName.hashCode());
		result = prime * result + ((policyStartDate == null) ? 0 : policyStartDate.hashCode());
		result = prime * result + ((policyTerminationDate == null) ? 0 : policyTerminationDate.hashCode());
		result = prime * result + ((recipientAddress == null) ? 0 : recipientAddress.hashCode());
		result = prime * result + ((recipientDateOfBirth == null) ? 0 : recipientDateOfBirth.hashCode());
		result = prime * result + ((recipientName == null) ? 0 : recipientName.hashCode());
		result = prime * result + ((recipientTin == null) ? 0 : recipientTin.hashCode());
		result = prime * result + ((spouseDateOfBirth == null) ? 0 : spouseDateOfBirth.hashCode());
		result = prime * result + ((spouseName == null) ? 0 : spouseName.hashCode());
		result = prime * result + ((spouseTin == null) ? 0 : spouseTin.hashCode());
		result = prime * result + ((tax == null) ? 0 : tax.hashCode());
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
		Tax1095A other = (Tax1095A) obj;
		if (coverages == null) {
			if (other.coverages != null)
				return false;
		} else if (!coverages.equals(other.coverages))
			return false;
		if (coveredIndividuals == null) {
			if (other.coveredIndividuals != null)
				return false;
		} else if (!coveredIndividuals.equals(other.coveredIndividuals))
			return false;
		if (marketplaceId == null) {
			if (other.marketplaceId != null)
				return false;
		} else if (!marketplaceId.equals(other.marketplaceId))
			return false;
		if (marketplacePolicyNumber == null) {
			if (other.marketplacePolicyNumber != null)
				return false;
		} else if (!marketplacePolicyNumber.equals(other.marketplacePolicyNumber))
			return false;
		if (policyIssuerName == null) {
			if (other.policyIssuerName != null)
				return false;
		} else if (!policyIssuerName.equals(other.policyIssuerName))
			return false;
		if (policyStartDate == null) {
			if (other.policyStartDate != null)
				return false;
		} else if (!policyStartDate.equals(other.policyStartDate))
			return false;
		if (policyTerminationDate == null) {
			if (other.policyTerminationDate != null)
				return false;
		} else if (!policyTerminationDate.equals(other.policyTerminationDate))
			return false;
		if (recipientAddress == null) {
			if (other.recipientAddress != null)
				return false;
		} else if (!recipientAddress.equals(other.recipientAddress))
			return false;
		if (recipientDateOfBirth == null) {
			if (other.recipientDateOfBirth != null)
				return false;
		} else if (!recipientDateOfBirth.equals(other.recipientDateOfBirth))
			return false;
		if (recipientName == null) {
			if (other.recipientName != null)
				return false;
		} else if (!recipientName.equals(other.recipientName))
			return false;
		if (recipientTin == null) {
			if (other.recipientTin != null)
				return false;
		} else if (!recipientTin.equals(other.recipientTin))
			return false;
		if (spouseDateOfBirth == null) {
			if (other.spouseDateOfBirth != null)
				return false;
		} else if (!spouseDateOfBirth.equals(other.spouseDateOfBirth))
			return false;
		if (spouseName == null) {
			if (other.spouseName != null)
				return false;
		} else if (!spouseName.equals(other.spouseName))
			return false;
		if (spouseTin == null) {
			if (other.spouseTin != null)
				return false;
		} else if (!spouseTin.equals(other.spouseTin))
			return false;
		if (tax == null) {
			if (other.tax != null)
				return false;
		} else if (!tax.equals(other.tax))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tax1095A [tax=" + tax + ", marketplaceId=" + marketplaceId + ", marketplacePolicyNumber="
				+ marketplacePolicyNumber + ", policyIssuerName=" + policyIssuerName + ", recipientName="
				+ recipientName + ", recipientTin=" + recipientTin + ", recipientDateOfBirth=" + recipientDateOfBirth
				+ ", spouseName=" + spouseName + ", spouseTin=" + spouseTin + ", spouseDateOfBirth=" + spouseDateOfBirth
				+ ", policyStartDate=" + policyStartDate + ", policyTerminationDate=" + policyTerminationDate
				+ ", recipientAddress=" + recipientAddress + ", coveredIndividuals=" + coveredIndividuals
				+ ", coverages=" + coverages + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(Tax1095A.class);

	public Tax1095A getTax1095A(int internalId) throws FDXException {
		try {
			
			template = ConnectionConfigApi51.getTemplate();
			SqlParameterSource parameters = new MapSqlParameterSource("internalId", internalId);
			Tax1095A tax1095A;
			try {
				tax1095A = template.queryForObject(
						"select * from "+ DeveloperContext.getDeveloperSchema() +".tax1095A where internalId in (:internalId)", parameters,
						new Tax1095ARowMapper());
			} catch (EmptyResultDataAccessException e) {
				throw new FDXException("Tax1095A not found", 0);
			}
//			Coverage Start
			List<HealthInsuranceCoverage> coveragesListResponse = new ArrayList<>();
			if (tax1095A.getCoverages() != null) {
				List<HealthInsuranceCoverage> coveragesList = tax1095A.getCoverages();
				for (HealthInsuranceCoverage coveragesIterator : coveragesList) {
					HealthInsuranceCoverage healthInsuranceCoverage = coveragesIterator
							.getHicidDetails(coveragesIterator.getHicid());
					coveragesListResponse.add(healthInsuranceCoverage);
				}
				tax1095A.setCoverages(coveragesListResponse);
			}
//			Coverage End 

//			CoveredIndividuals Start
			List<HealthInsuranceMarketplaceCoveredIndividual> healthInsuranceMarketplaceCoveredIndividualListResponse = new ArrayList<>();
			if (tax1095A.getCoveredIndividuals() != null) {
				List<HealthInsuranceMarketplaceCoveredIndividual> coveredList = tax1095A.getCoveredIndividuals();
				for (HealthInsuranceMarketplaceCoveredIndividual coveredIterator : coveredList) {
					HealthInsuranceMarketplaceCoveredIndividual healthInsuranceMarketplaceCoveredIndividual = coveredIterator
							.getHiMpCidDetails(coveredIterator.getHimciid());
					healthInsuranceMarketplaceCoveredIndividualListResponse
							.add(healthInsuranceMarketplaceCoveredIndividual);
				}
				tax1095A.setCoveredIndividuals(healthInsuranceMarketplaceCoveredIndividualListResponse);
			}
//			CoveredIndividuals End 

//			RecipientAddress Start
			Address recipientAddress = new Address();
			if (tax1095A.getRecipientAddress() != null) {
				recipientAddress = recipientAddress.getAddress(tax1095A.getRecipientAddress().getAddressId());
				tax1095A.setRecipientAddress(recipientAddress);
			}
//			RecipientAddress End 

			return tax1095A;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Tax1095A : ", e);
			throw new FDXException(e,500);
		}
	}

}
