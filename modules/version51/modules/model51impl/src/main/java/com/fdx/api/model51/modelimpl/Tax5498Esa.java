package com.fdx.api.model51.modelimpl;

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
import com.fdx.api.model51.mapper.Tax5498EsaStatementRowMapper;

import io.swagger.annotations.ApiModel;

/**
 * Coverdell ESA Contribution Information
 */
@ApiModel(description = "Coverdell ESA Contribution Information")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax5498Esa {

	NamedParameterJdbcTemplate template;

	@JsonUnwrapped
	private Tax tax;

	@JsonProperty("issuerNameAddress")
	private NameAddressPhone issuerNameAddress;

	@JsonProperty("issuerTin")
	private String issuerTin;

	@JsonProperty("participantTin")
	private String participantTin;

	@JsonProperty("beneficiaryTin")
	private String beneficiaryTin;

	@JsonProperty("beneficiaryNameAddress")
	private NameAddress beneficiaryNameAddress;

	@JsonProperty("accountNumber")
	private String accountNumber;

	@JsonProperty("coverdellEsaContributions")
	private Double coverdellEsaContributions;

	@JsonProperty("rolloverContributions")
	private Double rolloverContributions;

	public Tax getTax() {
		return tax;
	}

	public void setTax(Tax tax) {
		this.tax = tax;
	}

	public NameAddressPhone getIssuerNameAddress() {
		return issuerNameAddress;
	}

	public void setIssuerNameAddress(NameAddressPhone issuerNameAddress) {
		this.issuerNameAddress = issuerNameAddress;
	}

	public String getIssuerTin() {
		return issuerTin;
	}

	public void setIssuerTin(String issuerTin) {
		this.issuerTin = issuerTin;
	}

	public String getParticipantTin() {
		return participantTin;
	}

	public void setParticipantTin(String participantTin) {
		this.participantTin = participantTin;
	}

	public String getBeneficiaryTin() {
		return beneficiaryTin;
	}

	public void setBeneficiaryTin(String beneficiaryTin) {
		this.beneficiaryTin = beneficiaryTin;
	}

	public NameAddress getBeneficiaryNameAddress() {
		return beneficiaryNameAddress;
	}

	public void setBeneficiaryNameAddress(NameAddress beneficiaryNameAddress) {
		this.beneficiaryNameAddress = beneficiaryNameAddress;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Double getCoverdellEsaContributions() {
		return coverdellEsaContributions;
	}

	public void setCoverdellEsaContributions(Double coverdellEsaContributions) {
		this.coverdellEsaContributions = coverdellEsaContributions;
	}

	public Double getRolloverContributions() {
		return rolloverContributions;
	}

	public void setRolloverContributions(Double rolloverContributions) {
		this.rolloverContributions = rolloverContributions;
	}

	@Override
	public String toString() {
		return "Tax5498Esa [tax=" + tax + ", issuerNameAddress=" + issuerNameAddress + ", issuerTin=" + issuerTin
				+ ", participantTin=" + participantTin + ", beneficiaryTin=" + beneficiaryTin
				+ ", beneficiaryNameAddress=" + beneficiaryNameAddress + ", accountNumber=" + accountNumber
				+ ", coverdellEsaContributions=" + coverdellEsaContributions + ", rolloverContributions="
				+ rolloverContributions + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountNumber == null) ? 0 : accountNumber.hashCode());
		result = prime * result + ((beneficiaryNameAddress == null) ? 0 : beneficiaryNameAddress.hashCode());
		result = prime * result + ((beneficiaryTin == null) ? 0 : beneficiaryTin.hashCode());
		result = prime * result + ((coverdellEsaContributions == null) ? 0 : coverdellEsaContributions.hashCode());
		result = prime * result + ((issuerNameAddress == null) ? 0 : issuerNameAddress.hashCode());
		result = prime * result + ((issuerTin == null) ? 0 : issuerTin.hashCode());
		result = prime * result + ((participantTin == null) ? 0 : participantTin.hashCode());
		result = prime * result + ((rolloverContributions == null) ? 0 : rolloverContributions.hashCode());
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
		Tax5498Esa other = (Tax5498Esa) obj;
		if (accountNumber == null) {
			if (other.accountNumber != null)
				return false;
		} else if (!accountNumber.equals(other.accountNumber))
			return false;
		if (beneficiaryNameAddress == null) {
			if (other.beneficiaryNameAddress != null)
				return false;
		} else if (!beneficiaryNameAddress.equals(other.beneficiaryNameAddress))
			return false;
		if (beneficiaryTin == null) {
			if (other.beneficiaryTin != null)
				return false;
		} else if (!beneficiaryTin.equals(other.beneficiaryTin))
			return false;
		if (coverdellEsaContributions == null) {
			if (other.coverdellEsaContributions != null)
				return false;
		} else if (!coverdellEsaContributions.equals(other.coverdellEsaContributions))
			return false;
		if (issuerNameAddress == null) {
			if (other.issuerNameAddress != null)
				return false;
		} else if (!issuerNameAddress.equals(other.issuerNameAddress))
			return false;
		if (issuerTin == null) {
			if (other.issuerTin != null)
				return false;
		} else if (!issuerTin.equals(other.issuerTin))
			return false;
		if (participantTin == null) {
			if (other.participantTin != null)
				return false;
		} else if (!participantTin.equals(other.participantTin))
			return false;
		if (rolloverContributions == null) {
			if (other.rolloverContributions != null)
				return false;
		} else if (!rolloverContributions.equals(other.rolloverContributions))
			return false;
		if (tax == null) {
			if (other.tax != null)
				return false;
		} else if (!tax.equals(other.tax))
			return false;
		return true;
	}

	private static final Logger log = LoggerFactory.getLogger(Tax5498Esa.class);

	public Tax5498Esa getTax5498Esa(int internalId) throws FDXException {
		try {
			template = ConnectionConfigApi51.getTemplate();
			SqlParameterSource parameters = new MapSqlParameterSource("internalId", internalId);
			Tax5498Esa tax5498Esa;
			try {
				tax5498Esa = template.queryForObject(
						"select * from "+ DeveloperContext.getDeveloperSchema() +".tax5498Esa where internalId in (:internalId)", parameters,
						new Tax5498EsaStatementRowMapper());
			} catch (EmptyResultDataAccessException e) {
				throw new FDXException("Tax5498Esa not found", 0);
			}
//			BeneficiaryNameAddress Start
			NameAddress nameAddress = new NameAddress();
			if (tax5498Esa.getBeneficiaryNameAddress() != null) {
				nameAddress = nameAddress
						.getNameAddressDetails(tax5498Esa.getBeneficiaryNameAddress().getNameAddressId());
				tax5498Esa.setBeneficiaryNameAddress(nameAddress);
			}
//			BeneficiaryNameAddress End

//			IssuerNameAddress Start
			NameAddressPhone nameAddressIssuer = new NameAddressPhone();
			if (tax5498Esa.getIssuerNameAddress() != null) {
				nameAddressIssuer = nameAddressIssuer
						.getNameAddressPhoneDetails(tax5498Esa.getIssuerNameAddress().getNameAddressId());
				tax5498Esa.setIssuerNameAddress(nameAddressIssuer);
			}
//			IssuerNameAddress End

			return tax5498Esa;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Tax5498Esa : ", e);
			throw new FDXException(e,500);
		}
	}

}
