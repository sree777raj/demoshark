package com.fdx.api.model51.modelimpl;

import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fdx.api.model51.config.ConnectionConfigApi51;
import com.fdx.api.model51.mapper.Tax1099SaRowMapper;

import io.swagger.annotations.ApiModel;

/**
 * Distributions From an HSA, Archer MSA, or Medicare Advantage MSA
 */
@ApiModel(description = "Distributions From an HSA, Archer MSA, or Medicare Advantage MSA")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1099Sa {

	NamedParameterJdbcTemplate template;

	@JsonUnwrapped
	private Tax tax;

	@JsonProperty("payerNameAddress")
	private NameAddressPhone payerNameAddress;

	@JsonProperty("payerTin")
	private String payerTin;

	@JsonProperty("recipientTin")
	private String recipientTin;

	@JsonProperty("recipientNameAddress")
	private NameAddress recipientNameAddress;

	@JsonProperty("accountNumber")
	private String accountNumber;

	@JsonProperty("grossDistribution")
	private Double grossDistribution;

	@JsonProperty("earnings")
	private Double earnings;

	@JsonProperty("distributionCode")
	private String distributionCode;

	@JsonProperty("fairMarketValue")
	private Double fairMarketValue;

	@JsonProperty("hsa")
	@JsonInclude(Include.NON_NULL)
	private Boolean hsa;

	@JsonProperty("archerAccount")
	@JsonInclude(Include.NON_NULL)
	private Boolean archerAccount;

	@JsonProperty("medicalSavingsAccount")
	@JsonInclude(Include.NON_NULL)
	private Boolean medicalSavingsAccount;

	public Tax getTax() {
		return tax;
	}

	public void setTax(Tax tax) {
		this.tax = tax;
	}

	public NameAddressPhone getPayerNameAddress() {
		return payerNameAddress;
	}

	public void setPayerNameAddress(NameAddressPhone payerNameAddress) {
		this.payerNameAddress = payerNameAddress;
	}

	public String getPayerTin() {
		return payerTin;
	}

	public void setPayerTin(String payerTin) {
		this.payerTin = payerTin;
	}

	public String getRecipientTin() {
		return recipientTin;
	}

	public void setRecipientTin(String recipientTin) {
		this.recipientTin = recipientTin;
	}

	public NameAddress getRecipientNameAddress() {
		return recipientNameAddress;
	}

	public void setRecipientNameAddress(NameAddress recipientNameAddress) {
		this.recipientNameAddress = recipientNameAddress;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Double getGrossDistribution() {
		return grossDistribution;
	}

	public void setGrossDistribution(Double grossDistribution) {
		this.grossDistribution = grossDistribution;
	}

	public Double getEarnings() {
		return earnings;
	}

	public void setEarnings(Double earnings) {
		this.earnings = earnings;
	}

	public String getDistributionCode() {
		return distributionCode;
	}

	public void setDistributionCode(String distributionCode) {
		this.distributionCode = distributionCode;
	}

	public Double getFairMarketValue() {
		return fairMarketValue;
	}

	public void setFairMarketValue(Double fairMarketValue) {
		this.fairMarketValue = fairMarketValue;
	}

	public Boolean getHsa() {
		return hsa;
	}

	public void setHsa(Boolean hsa) {
		this.hsa = hsa;
	}

	public Boolean getArcherAccount() {
		return archerAccount;
	}

	public void setArcherAccount(Boolean archerAccount) {
		this.archerAccount = archerAccount;
	}

	public Boolean getMedicalSavingsAccount() {
		return medicalSavingsAccount;
	}

	public void setMedicalSavingsAccount(Boolean medicalSavingsAccount) {
		this.medicalSavingsAccount = medicalSavingsAccount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountNumber == null) ? 0 : accountNumber.hashCode());
		result = prime * result + ((archerAccount == null) ? 0 : archerAccount.hashCode());
		result = prime * result + ((distributionCode == null) ? 0 : distributionCode.hashCode());
		result = prime * result + ((earnings == null) ? 0 : earnings.hashCode());
		result = prime * result + ((fairMarketValue == null) ? 0 : fairMarketValue.hashCode());
		result = prime * result + ((grossDistribution == null) ? 0 : grossDistribution.hashCode());
		result = prime * result + ((hsa == null) ? 0 : hsa.hashCode());
		result = prime * result + ((medicalSavingsAccount == null) ? 0 : medicalSavingsAccount.hashCode());
		result = prime * result + ((payerNameAddress == null) ? 0 : payerNameAddress.hashCode());
		result = prime * result + ((payerTin == null) ? 0 : payerTin.hashCode());
		result = prime * result + ((recipientNameAddress == null) ? 0 : recipientNameAddress.hashCode());
		result = prime * result + ((recipientTin == null) ? 0 : recipientTin.hashCode());
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
		Tax1099Sa other = (Tax1099Sa) obj;
		if (accountNumber == null) {
			if (other.accountNumber != null)
				return false;
		} else if (!accountNumber.equals(other.accountNumber))
			return false;
		if (archerAccount == null) {
			if (other.archerAccount != null)
				return false;
		} else if (!archerAccount.equals(other.archerAccount))
			return false;
		if (distributionCode == null) {
			if (other.distributionCode != null)
				return false;
		} else if (!distributionCode.equals(other.distributionCode))
			return false;
		if (earnings == null) {
			if (other.earnings != null)
				return false;
		} else if (!earnings.equals(other.earnings))
			return false;
		if (fairMarketValue == null) {
			if (other.fairMarketValue != null)
				return false;
		} else if (!fairMarketValue.equals(other.fairMarketValue))
			return false;
		if (grossDistribution == null) {
			if (other.grossDistribution != null)
				return false;
		} else if (!grossDistribution.equals(other.grossDistribution))
			return false;
		if (hsa == null) {
			if (other.hsa != null)
				return false;
		} else if (!hsa.equals(other.hsa))
			return false;
		if (medicalSavingsAccount == null) {
			if (other.medicalSavingsAccount != null)
				return false;
		} else if (!medicalSavingsAccount.equals(other.medicalSavingsAccount))
			return false;
		if (payerNameAddress == null) {
			if (other.payerNameAddress != null)
				return false;
		} else if (!payerNameAddress.equals(other.payerNameAddress))
			return false;
		if (payerTin == null) {
			if (other.payerTin != null)
				return false;
		} else if (!payerTin.equals(other.payerTin))
			return false;
		if (recipientNameAddress == null) {
			if (other.recipientNameAddress != null)
				return false;
		} else if (!recipientNameAddress.equals(other.recipientNameAddress))
			return false;
		if (recipientTin == null) {
			if (other.recipientTin != null)
				return false;
		} else if (!recipientTin.equals(other.recipientTin))
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
		return "Tax1099Sa [tax=" + tax + ", payerNameAddress=" + payerNameAddress + ", payerTin=" + payerTin
				+ ", recipientTin=" + recipientTin + ", recipientNameAddress=" + recipientNameAddress
				+ ", accountNumber=" + accountNumber + ", grossDistribution=" + grossDistribution + ", earnings="
				+ earnings + ", distributionCode=" + distributionCode + ", fairMarketValue=" + fairMarketValue
				+ ", hsa=" + hsa + ", archerAccount=" + archerAccount + ", medicalSavingsAccount="
				+ medicalSavingsAccount + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(Tax1099Sa.class);

	public Tax1099Sa getTax1099Sa(int internalId) throws FDXException {
		try {
			template = ConnectionConfigApi51.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("internalId", internalId);
			Tax1099Sa tax1099Sa;
			try {
				tax1099Sa = template.queryForObject(
						"select * from "+ DeveloperContext.getDeveloperSchema() +".Tax1099Sa where internalId in (:internalId)", parameters,
						new Tax1099SaRowMapper());
			} catch (EmptyResultDataAccessException e) {
				throw new FDXException("Tax1099Sa not found", 0);
			}
//			payerNameAddress Start
			NameAddressPhone payerNameAddress = new NameAddressPhone();
			if (tax1099Sa.getPayerNameAddress() != null) {
				payerNameAddress = payerNameAddress
						.getNameAddressPhoneDetails(tax1099Sa.getPayerNameAddress().getNameAddressId());
				tax1099Sa.setPayerNameAddress(payerNameAddress);
			}
//			payerNameAddress End

//			recipientNameAddress Start
			NameAddress recipientNameAddress = new NameAddress();
			if (tax1099Sa.getRecipientNameAddress() != null) {
				recipientNameAddress = recipientNameAddress
						.getNameAddressDetails(tax1099Sa.getRecipientNameAddress().getNameAddressId());
				tax1099Sa.setRecipientNameAddress(recipientNameAddress);
			}
//			recipientNameAddress End

			return tax1099Sa;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Tax1099Sa : ", e);
			throw new FDXException(e,500);
		}
	}

}
