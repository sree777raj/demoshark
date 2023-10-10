package com.fdx.api.model46.modelimpl;

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
import com.fdx.api.model46.mapper.Tax5498QaStatementRowMapper;

import io.swagger.annotations.ApiModel;

/**
 * ABLE Account Contribution Information
 */
@ApiModel(description = "ABLE Account Contribution Information")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax5498Qa {

	NamedParameterJdbcTemplate template;

	@JsonUnwrapped
	private Tax tax;

	@JsonProperty("issuerNameAddress")
	private NameAddress issuerNameAddress;

	@JsonProperty("issuerTin")
	private String issuerTin;

	@JsonProperty("beneficiaryTin")
	private String beneficiaryTin;

	@JsonProperty("beneficiaryNameAddress")
	private NameAddress beneficiaryNameAddress;

	@JsonProperty("accountNumber")
	private String accountNumber;

	@JsonProperty("ableContributions")
	private Double ableContributions;

	@JsonProperty("rollovers")
	private Double rollovers;

	@JsonProperty("cumulativeContributions")
	private Double cumulativeContributions;

	@JsonProperty("fairMarketValue")
	private Double fairMarketValue;

//	@JsonIgnore
	@JsonProperty("openedInTaxYear")
	@JsonInclude(Include.NON_NULL)
	private Boolean openedInTaxYear;

	@JsonProperty("basisOfDisabilityCode")
	private String basisOfDisabilityCode;

	@JsonProperty("typeOfDisabilityCode")
	private String typeOfDisabilityCode;

	public Tax getTax() {
		return tax;
	}

	public void setTax(Tax tax) {
		this.tax = tax;
	}

	public NameAddress getIssuerNameAddress() {
		return issuerNameAddress;
	}

	public void setIssuerNameAddress(NameAddress issuerNameAddress) {
		this.issuerNameAddress = issuerNameAddress;
	}

	public String getIssuerTin() {
		return issuerTin;
	}

	public void setIssuerTin(String issuerTin) {
		this.issuerTin = issuerTin;
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

	public Double getAbleContributions() {
		return ableContributions;
	}

	public void setAbleContributions(Double ableContributions) {
		this.ableContributions = ableContributions;
	}

	public Double getRollovers() {
		return rollovers;
	}

	public void setRollovers(Double rollovers) {
		this.rollovers = rollovers;
	}

	public Double getCumulativeContributions() {
		return cumulativeContributions;
	}

	public void setCumulativeContributions(Double cumulativeContributions) {
		this.cumulativeContributions = cumulativeContributions;
	}

	public Double getFairMarketValue() {
		return fairMarketValue;
	}

	public void setFairMarketValue(Double fairMarketValue) {
		this.fairMarketValue = fairMarketValue;
	}

	public Boolean getOpenedInTaxYear() {
		return openedInTaxYear;
	}

	public void setOpenedInTaxYear(Boolean openedInTaxYear) {
		this.openedInTaxYear = openedInTaxYear;
	}

	public String getBasisOfDisabilityCode() {
		return basisOfDisabilityCode;
	}

	public void setBasisOfDisabilityCode(String basisOfDisabilityCode) {
		this.basisOfDisabilityCode = basisOfDisabilityCode;
	}

	public String getTypeOfDisabilityCode() {
		return typeOfDisabilityCode;
	}

	public void setTypeOfDisabilityCode(String typeOfDisabilityCode) {
		this.typeOfDisabilityCode = typeOfDisabilityCode;
	}

	@Override
	public String toString() {
		return "Tax5498Qa [tax=" + tax + ", issuerNameAddress=" + issuerNameAddress + ", issuerTin=" + issuerTin
				+ ", beneficiaryTin=" + beneficiaryTin + ", beneficiaryNameAddress=" + beneficiaryNameAddress
				+ ", accountNumber=" + accountNumber + ", ableContributions=" + ableContributions + ", rollovers="
				+ rollovers + ", cumulativeContributions=" + cumulativeContributions + ", fairMarketValue="
				+ fairMarketValue + ", openedInTaxYear=" + openedInTaxYear + ", basisOfDisabilityCode="
				+ basisOfDisabilityCode + ", typeOfDisabilityCode=" + typeOfDisabilityCode + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ableContributions == null) ? 0 : ableContributions.hashCode());
		result = prime * result + ((accountNumber == null) ? 0 : accountNumber.hashCode());
		result = prime * result + ((basisOfDisabilityCode == null) ? 0 : basisOfDisabilityCode.hashCode());
		result = prime * result + ((beneficiaryNameAddress == null) ? 0 : beneficiaryNameAddress.hashCode());
		result = prime * result + ((beneficiaryTin == null) ? 0 : beneficiaryTin.hashCode());
		result = prime * result + ((cumulativeContributions == null) ? 0 : cumulativeContributions.hashCode());
		result = prime * result + ((fairMarketValue == null) ? 0 : fairMarketValue.hashCode());
		result = prime * result + ((issuerNameAddress == null) ? 0 : issuerNameAddress.hashCode());
		result = prime * result + ((issuerTin == null) ? 0 : issuerTin.hashCode());
		result = prime * result + ((openedInTaxYear == null) ? 0 : openedInTaxYear.hashCode());
		result = prime * result + ((rollovers == null) ? 0 : rollovers.hashCode());
		result = prime * result + ((tax == null) ? 0 : tax.hashCode());
		result = prime * result + ((typeOfDisabilityCode == null) ? 0 : typeOfDisabilityCode.hashCode());
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
		Tax5498Qa other = (Tax5498Qa) obj;
		if (ableContributions == null) {
			if (other.ableContributions != null)
				return false;
		} else if (!ableContributions.equals(other.ableContributions))
			return false;
		if (accountNumber == null) {
			if (other.accountNumber != null)
				return false;
		} else if (!accountNumber.equals(other.accountNumber))
			return false;
		if (basisOfDisabilityCode == null) {
			if (other.basisOfDisabilityCode != null)
				return false;
		} else if (!basisOfDisabilityCode.equals(other.basisOfDisabilityCode))
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
		if (cumulativeContributions == null) {
			if (other.cumulativeContributions != null)
				return false;
		} else if (!cumulativeContributions.equals(other.cumulativeContributions))
			return false;
		if (fairMarketValue == null) {
			if (other.fairMarketValue != null)
				return false;
		} else if (!fairMarketValue.equals(other.fairMarketValue))
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
		if (openedInTaxYear == null) {
			if (other.openedInTaxYear != null)
				return false;
		} else if (!openedInTaxYear.equals(other.openedInTaxYear))
			return false;
		if (rollovers == null) {
			if (other.rollovers != null)
				return false;
		} else if (!rollovers.equals(other.rollovers))
			return false;
		if (tax == null) {
			if (other.tax != null)
				return false;
		} else if (!tax.equals(other.tax))
			return false;
		if (typeOfDisabilityCode == null) {
			if (other.typeOfDisabilityCode != null)
				return false;
		} else if (!typeOfDisabilityCode.equals(other.typeOfDisabilityCode))
			return false;
		return true;
	}

	private static final Logger log = LoggerFactory.getLogger(Tax5498Qa.class);

	public Tax5498Qa getTax5498Qa(int internalId) throws FDXException {
		try {
			
			template = ConnectionConfigApi46.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("internalId", internalId);

			Tax5498Qa tax5498Qa = template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".tax5498Qa where internalId in (:internalId)", parameters,
					new Tax5498QaStatementRowMapper());

//			IssuerNameAddress Start
			NameAddress nameAddress = new NameAddress();
			if (tax5498Qa.getIssuerNameAddress() != null) {
				nameAddress = nameAddress.getNameAddressDetails(tax5498Qa.getIssuerNameAddress().getNameAddressId());
				tax5498Qa.setIssuerNameAddress(nameAddress);
			}
//			IssuerNameAddress End

//			BeneficiaryNameAddress Start
			NameAddress nameAddressBenificiary = new NameAddress();
			if (tax5498Qa.getBeneficiaryNameAddress() != null) {
				nameAddressBenificiary = nameAddressBenificiary
						.getNameAddressDetails(tax5498Qa.getBeneficiaryNameAddress().getNameAddressId());
				tax5498Qa.setBeneficiaryNameAddress(nameAddressBenificiary);
			}
//			BeneficiaryNameAddress End

			return tax5498Qa;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Tax5498Qa : ", e);
			throw new FDXException(e,500);
		}
	}

}
