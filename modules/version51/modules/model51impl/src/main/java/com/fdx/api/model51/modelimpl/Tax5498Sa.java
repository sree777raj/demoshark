package com.fdx.api.model51.modelimpl;

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
import com.fdx.api.model51.config.ConnectionConfigApi51;
import com.fdx.api.model51.mapper.Tax5498SaStatementRowMapper;

import io.swagger.annotations.ApiModel;

/**
 * HSA, Archer MSA, or Medicare Advantage (MA) MSA Information
 */
@ApiModel(description = "HSA, Archer MSA, or Medicare Advantage (MA) MSA Information")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax5498Sa {

	NamedParameterJdbcTemplate template;

	@JsonUnwrapped
	private Tax tax;

	@JsonProperty("trusteeNameAddress")
	private NameAddressPhone trusteeNameAddress;

	@JsonProperty("trusteeTin")
	private String trusteeTin;

	@JsonProperty("participantTin")
	private String participantTin;

	@JsonProperty("participantNameAddress")
	private NameAddress participantNameAddress;

	@JsonProperty("accountNumber")
	private String accountNumber;

	@JsonProperty("msaContributions")
	private Double msaContributions;

	@JsonProperty("totalContributions")
	private Double totalContributions;

	@JsonProperty("totalPostYearEnd")
	private Double totalPostYearEnd;

	@JsonProperty("rolloverContributions")
	private Double rolloverContributions;

	@JsonProperty("fairMarketValue")
	private Double fairMarketValue;

	@JsonProperty("hsa")
	@JsonInclude(Include.NON_NULL)
	private Boolean hsa;

	@JsonProperty("archer")
	@JsonInclude(Include.NON_NULL)
	private Boolean archer;

	@JsonProperty("maMsa")
	@JsonInclude(Include.NON_NULL)
	private Boolean maMsa;

	public Tax getTax() {
		return tax;
	}

	public void setTax(Tax tax) {
		this.tax = tax;
	}

	public NameAddressPhone getTrusteeNameAddress() {
		return trusteeNameAddress;
	}

	public void setTrusteeNameAddress(NameAddressPhone trusteeNameAddress) {
		this.trusteeNameAddress = trusteeNameAddress;
	}

	public String getTrusteeTin() {
		return trusteeTin;
	}

	public void setTrusteeTin(String trusteeTin) {
		this.trusteeTin = trusteeTin;
	}

	public String getParticipantTin() {
		return participantTin;
	}

	public void setParticipantTin(String participantTin) {
		this.participantTin = participantTin;
	}

	public NameAddress getParticipantNameAddress() {
		return participantNameAddress;
	}

	public void setParticipantNameAddress(NameAddress participantNameAddress) {
		this.participantNameAddress = participantNameAddress;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Double getMsaContributions() {
		return msaContributions;
	}

	public void setMsaContributions(Double msaContributions) {
		this.msaContributions = msaContributions;
	}

	public Double getTotalContributions() {
		return totalContributions;
	}

	public void setTotalContributions(Double totalContributions) {
		this.totalContributions = totalContributions;
	}

	public Double getTotalPostYearEnd() {
		return totalPostYearEnd;
	}

	public void setTotalPostYearEnd(Double totalPostYearEnd) {
		this.totalPostYearEnd = totalPostYearEnd;
	}

	public Double getRolloverContributions() {
		return rolloverContributions;
	}

	public void setRolloverContributions(Double rolloverContributions) {
		this.rolloverContributions = rolloverContributions;
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

	public Boolean getArcher() {
		return archer;
	}

	public void setArcher(Boolean archer) {
		this.archer = archer;
	}

	public Boolean getMaMsa() {
		return maMsa;
	}

	public void setMaMsa(Boolean maMsa) {
		this.maMsa = maMsa;
	}

	@Override
	public String toString() {
		return "Tax5498Sa [tax=" + tax + ", trusteeNameAddress=" + trusteeNameAddress + ", trusteeTin=" + trusteeTin
				+ ", participantTin=" + participantTin + ", participantNameAddress=" + participantNameAddress
				+ ", accountNumber=" + accountNumber + ", msaContributions=" + msaContributions
				+ ", totalContributions=" + totalContributions + ", totalPostYearEnd=" + totalPostYearEnd
				+ ", rolloverContributions=" + rolloverContributions + ", fairMarketValue=" + fairMarketValue + ", hsa="
				+ hsa + ", archer=" + archer + ", maMsa=" + maMsa + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountNumber == null) ? 0 : accountNumber.hashCode());
		result = prime * result + ((archer == null) ? 0 : archer.hashCode());
		result = prime * result + ((fairMarketValue == null) ? 0 : fairMarketValue.hashCode());
		result = prime * result + ((hsa == null) ? 0 : hsa.hashCode());
		result = prime * result + ((maMsa == null) ? 0 : maMsa.hashCode());
		result = prime * result + ((msaContributions == null) ? 0 : msaContributions.hashCode());
		result = prime * result + ((participantNameAddress == null) ? 0 : participantNameAddress.hashCode());
		result = prime * result + ((participantTin == null) ? 0 : participantTin.hashCode());
		result = prime * result + ((rolloverContributions == null) ? 0 : rolloverContributions.hashCode());
		result = prime * result + ((tax == null) ? 0 : tax.hashCode());
		result = prime * result + ((totalContributions == null) ? 0 : totalContributions.hashCode());
		result = prime * result + ((totalPostYearEnd == null) ? 0 : totalPostYearEnd.hashCode());
		result = prime * result + ((trusteeNameAddress == null) ? 0 : trusteeNameAddress.hashCode());
		result = prime * result + ((trusteeTin == null) ? 0 : trusteeTin.hashCode());
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
		Tax5498Sa other = (Tax5498Sa) obj;
		if (accountNumber == null) {
			if (other.accountNumber != null)
				return false;
		} else if (!accountNumber.equals(other.accountNumber))
			return false;
		if (archer == null) {
			if (other.archer != null)
				return false;
		} else if (!archer.equals(other.archer))
			return false;
		if (fairMarketValue == null) {
			if (other.fairMarketValue != null)
				return false;
		} else if (!fairMarketValue.equals(other.fairMarketValue))
			return false;
		if (hsa == null) {
			if (other.hsa != null)
				return false;
		} else if (!hsa.equals(other.hsa))
			return false;
		if (maMsa == null) {
			if (other.maMsa != null)
				return false;
		} else if (!maMsa.equals(other.maMsa))
			return false;
		if (msaContributions == null) {
			if (other.msaContributions != null)
				return false;
		} else if (!msaContributions.equals(other.msaContributions))
			return false;
		if (participantNameAddress == null) {
			if (other.participantNameAddress != null)
				return false;
		} else if (!participantNameAddress.equals(other.participantNameAddress))
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
		if (totalContributions == null) {
			if (other.totalContributions != null)
				return false;
		} else if (!totalContributions.equals(other.totalContributions))
			return false;
		if (totalPostYearEnd == null) {
			if (other.totalPostYearEnd != null)
				return false;
		} else if (!totalPostYearEnd.equals(other.totalPostYearEnd))
			return false;
		if (trusteeNameAddress == null) {
			if (other.trusteeNameAddress != null)
				return false;
		} else if (!trusteeNameAddress.equals(other.trusteeNameAddress))
			return false;
		if (trusteeTin == null) {
			if (other.trusteeTin != null)
				return false;
		} else if (!trusteeTin.equals(other.trusteeTin))
			return false;
		return true;
	}

	private static final Logger log = LoggerFactory.getLogger(Tax5498Sa.class);

	public Tax5498Sa getTax5498Sa(int internalId) throws FDXException {
		try {
			
			template = ConnectionConfigApi51.getTemplate();
			SqlParameterSource parameters = new MapSqlParameterSource("internalId", internalId);

			Tax5498Sa tax5498Sa = template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".tax5498Sa where internalId in (:internalId)", parameters,
					new Tax5498SaStatementRowMapper());

//			trusteeNameAddress Start
			NameAddressPhone nameAddressTrustee = new NameAddressPhone();
			if (tax5498Sa.getTrusteeNameAddress() != null) {
				nameAddressTrustee = nameAddressTrustee
						.getNameAddressPhoneDetails(tax5498Sa.getTrusteeNameAddress().getNameAddressId());
				tax5498Sa.setTrusteeNameAddress(nameAddressTrustee);
			}
//			trusteeNameAddress End

//			ParticipantNameAddress Start
			NameAddress nameAddressParticipant = new NameAddress();
			if (tax5498Sa.getParticipantNameAddress() != null) {
				nameAddressParticipant = nameAddressParticipant
						.getNameAddressDetails(tax5498Sa.getParticipantNameAddress().getNameAddressId());
				tax5498Sa.setParticipantNameAddress(nameAddressParticipant);
			}
//			ParticipantNameAddress End

			return tax5498Sa;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Tax5498Sa : ", e);
			throw new FDXException(e,500);
		}
	}

}
