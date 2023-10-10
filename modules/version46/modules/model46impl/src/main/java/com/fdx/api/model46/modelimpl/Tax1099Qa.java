package com.fdx.api.model46.modelimpl;

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
import com.fdx.api.model46.config.ConnectionConfigApi46;
import com.fdx.api.model46.mapper.Tax1099QaRowMapper;

import io.swagger.annotations.ApiModel;

/**
 * Distributions From ABLE Accounts
 */
@ApiModel(description = "Distributions From ABLE Accounts")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1099Qa {

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

	@JsonProperty("basis")
	private Double basis;

	@JsonProperty("programTransfer")
	@JsonInclude(Include.NON_NULL)
	private Boolean programTransfer;

	@JsonProperty("terminated")
	@JsonInclude(Include.NON_NULL)
	private Boolean terminated;

	@JsonProperty("notBeneficiary")
	@JsonInclude(Include.NON_NULL)
	private Boolean notBeneficiary;

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

	public Double getBasis() {
		return basis;
	}

	public void setBasis(Double basis) {
		this.basis = basis;
	}

	public Boolean getProgramTransfer() {
		return programTransfer;
	}

	public void setProgramTransfer(Boolean programTransfer) {
		this.programTransfer = programTransfer;
	}

	public Boolean getTerminated() {
		return terminated;
	}

	public void setTerminated(Boolean terminated) {
		this.terminated = terminated;
	}

	public Boolean getNotBeneficiary() {
		return notBeneficiary;
	}

	public void setNotBeneficiary(Boolean notBeneficiary) {
		this.notBeneficiary = notBeneficiary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountNumber == null) ? 0 : accountNumber.hashCode());
		result = prime * result + ((basis == null) ? 0 : basis.hashCode());
		result = prime * result + ((earnings == null) ? 0 : earnings.hashCode());
		result = prime * result + ((grossDistribution == null) ? 0 : grossDistribution.hashCode());
		result = prime * result + ((notBeneficiary == null) ? 0 : notBeneficiary.hashCode());
		result = prime * result + ((payerNameAddress == null) ? 0 : payerNameAddress.hashCode());
		result = prime * result + ((payerTin == null) ? 0 : payerTin.hashCode());
		result = prime * result + ((programTransfer == null) ? 0 : programTransfer.hashCode());
		result = prime * result + ((recipientNameAddress == null) ? 0 : recipientNameAddress.hashCode());
		result = prime * result + ((recipientTin == null) ? 0 : recipientTin.hashCode());
		result = prime * result + ((tax == null) ? 0 : tax.hashCode());
		result = prime * result + ((terminated == null) ? 0 : terminated.hashCode());
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
		Tax1099Qa other = (Tax1099Qa) obj;
		if (accountNumber == null) {
			if (other.accountNumber != null)
				return false;
		} else if (!accountNumber.equals(other.accountNumber))
			return false;
		if (basis == null) {
			if (other.basis != null)
				return false;
		} else if (!basis.equals(other.basis))
			return false;
		if (earnings == null) {
			if (other.earnings != null)
				return false;
		} else if (!earnings.equals(other.earnings))
			return false;
		if (grossDistribution == null) {
			if (other.grossDistribution != null)
				return false;
		} else if (!grossDistribution.equals(other.grossDistribution))
			return false;
		if (notBeneficiary == null) {
			if (other.notBeneficiary != null)
				return false;
		} else if (!notBeneficiary.equals(other.notBeneficiary))
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
		if (programTransfer == null) {
			if (other.programTransfer != null)
				return false;
		} else if (!programTransfer.equals(other.programTransfer))
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
		if (terminated == null) {
			if (other.terminated != null)
				return false;
		} else if (!terminated.equals(other.terminated))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tax1099Qa [tax=" + tax + ", payerNameAddress=" + payerNameAddress + ", payerTin=" + payerTin
				+ ", recipientTin=" + recipientTin + ", recipientNameAddress=" + recipientNameAddress
				+ ", accountNumber=" + accountNumber + ", grossDistribution=" + grossDistribution + ", earnings="
				+ earnings + ", basis=" + basis + ", programTransfer=" + programTransfer + ", terminated=" + terminated
				+ ", notBeneficiary=" + notBeneficiary + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(Tax1099Qa.class);

	public Tax1099Qa getTax1099Qa(int internalId) throws FDXException {
		try {
			template = ConnectionConfigApi46.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("internalId", internalId);
			Tax1099Qa tax1099Qa;
			try {
				tax1099Qa = template.queryForObject(
						"select * from "+ DeveloperContext.getDeveloperSchema() +".Tax1099Qa where internalId in (:internalId)", parameters,
						new Tax1099QaRowMapper());
			} catch (EmptyResultDataAccessException e) {
				throw new FDXException("Tax1099Qa not found", 0);
			}
//			payerNameAddress Start
			NameAddressPhone payerNameAddress = new NameAddressPhone();
			if (tax1099Qa.getPayerNameAddress() != null) {
				payerNameAddress = payerNameAddress
						.getNameAddressPhoneDetails(tax1099Qa.getPayerNameAddress().getNameAddressId());
				tax1099Qa.setPayerNameAddress(payerNameAddress);
			}
//			payerNameAddress End

//			recipientNameAddress Start
			NameAddress recipientNameAddress = new NameAddress();
			if (tax1099Qa.getRecipientNameAddress() != null) {
				recipientNameAddress = recipientNameAddress
						.getNameAddressDetails(tax1099Qa.getRecipientNameAddress().getNameAddressId());
				tax1099Qa.setRecipientNameAddress(recipientNameAddress);
			}
//			recipientNameAddress End

			return tax1099Qa;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Tax1099Qa : ", e);
			throw new FDXException(e,500);
		}
	}

}
