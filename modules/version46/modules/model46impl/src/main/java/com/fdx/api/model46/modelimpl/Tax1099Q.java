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
import com.fdx.api.model46.mapper.Tax1099QRowMapper;

import io.swagger.annotations.ApiModel;

/**
 * Payments From Qualified Education Programs
 */
@ApiModel(description = "Payments From Qualified Education Programs")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1099Q {

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

	@JsonProperty("trusteeToTrustee")
	@JsonInclude(Include.NON_NULL)
	private Boolean trusteeToTrustee;

	@JsonProperty("tuitionPlanPrivate")
	@JsonInclude(Include.NON_NULL)
	private Boolean tuitionPlanPrivate;

	@JsonProperty("tuitionPlanPublic")
	@JsonInclude(Include.NON_NULL)
	private Boolean tuitionPlanPublic;

	@JsonProperty("coverdellEsa")
	@JsonInclude(Include.NON_NULL)
	private Boolean coverdellEsa;

	@JsonProperty("recipientIsNotBeneficiary")
	@JsonInclude(Include.NON_NULL)
	private Boolean recipientIsNotBeneficiary;

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

	public Boolean getTrusteeToTrustee() {
		return trusteeToTrustee;
	}

	public void setTrusteeToTrustee(Boolean trusteeToTrustee) {
		this.trusteeToTrustee = trusteeToTrustee;
	}

	public Boolean getTuitionPlanPrivate() {
		return tuitionPlanPrivate;
	}

	public void setTuitionPlanPrivate(Boolean tuitionPlanPrivate) {
		this.tuitionPlanPrivate = tuitionPlanPrivate;
	}

	public Boolean getTuitionPlanPublic() {
		return tuitionPlanPublic;
	}

	public void setTuitionPlanPublic(Boolean tuitionPlanPublic) {
		this.tuitionPlanPublic = tuitionPlanPublic;
	}

	public Boolean getCoverdellEsa() {
		return coverdellEsa;
	}

	public void setCoverdellEsa(Boolean coverdellEsa) {
		this.coverdellEsa = coverdellEsa;
	}

	public Boolean getRecipientIsNotBeneficiary() {
		return recipientIsNotBeneficiary;
	}

	public void setRecipientIsNotBeneficiary(Boolean recipientIsNotBeneficiary) {
		this.recipientIsNotBeneficiary = recipientIsNotBeneficiary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountNumber == null) ? 0 : accountNumber.hashCode());
		result = prime * result + ((basis == null) ? 0 : basis.hashCode());
		result = prime * result + ((coverdellEsa == null) ? 0 : coverdellEsa.hashCode());
		result = prime * result + ((earnings == null) ? 0 : earnings.hashCode());
		result = prime * result + ((grossDistribution == null) ? 0 : grossDistribution.hashCode());
		result = prime * result + ((payerNameAddress == null) ? 0 : payerNameAddress.hashCode());
		result = prime * result + ((payerTin == null) ? 0 : payerTin.hashCode());
		result = prime * result + ((recipientIsNotBeneficiary == null) ? 0 : recipientIsNotBeneficiary.hashCode());
		result = prime * result + ((recipientNameAddress == null) ? 0 : recipientNameAddress.hashCode());
		result = prime * result + ((recipientTin == null) ? 0 : recipientTin.hashCode());
		result = prime * result + ((tax == null) ? 0 : tax.hashCode());
		result = prime * result + ((trusteeToTrustee == null) ? 0 : trusteeToTrustee.hashCode());
		result = prime * result + ((tuitionPlanPrivate == null) ? 0 : tuitionPlanPrivate.hashCode());
		result = prime * result + ((tuitionPlanPublic == null) ? 0 : tuitionPlanPublic.hashCode());
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
		Tax1099Q other = (Tax1099Q) obj;
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
		if (coverdellEsa == null) {
			if (other.coverdellEsa != null)
				return false;
		} else if (!coverdellEsa.equals(other.coverdellEsa))
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
		if (recipientIsNotBeneficiary == null) {
			if (other.recipientIsNotBeneficiary != null)
				return false;
		} else if (!recipientIsNotBeneficiary.equals(other.recipientIsNotBeneficiary))
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
		if (trusteeToTrustee == null) {
			if (other.trusteeToTrustee != null)
				return false;
		} else if (!trusteeToTrustee.equals(other.trusteeToTrustee))
			return false;
		if (tuitionPlanPrivate == null) {
			if (other.tuitionPlanPrivate != null)
				return false;
		} else if (!tuitionPlanPrivate.equals(other.tuitionPlanPrivate))
			return false;
		if (tuitionPlanPublic == null) {
			if (other.tuitionPlanPublic != null)
				return false;
		} else if (!tuitionPlanPublic.equals(other.tuitionPlanPublic))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tax1099Q [tax=" + tax + ", payerNameAddress=" + payerNameAddress + ", payerTin=" + payerTin
				+ ", recipientTin=" + recipientTin + ", recipientNameAddress=" + recipientNameAddress
				+ ", accountNumber=" + accountNumber + ", grossDistribution=" + grossDistribution + ", earnings="
				+ earnings + ", basis=" + basis + ", trusteeToTrustee=" + trusteeToTrustee + ", tuitionPlanPrivate="
				+ tuitionPlanPrivate + ", tuitionPlanPublic=" + tuitionPlanPublic + ", coverdellEsa=" + coverdellEsa
				+ ", recipientIsNotBeneficiary=" + recipientIsNotBeneficiary + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(Tax1099Q.class);

	public Tax1099Q getTax1099Q(int internalId) throws FDXException {
		try {
			
			template = ConnectionConfigApi46.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("internalId", internalId);

			Tax1099Q tax1099Q = template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".Tax1099Q where internalId in (:internalId)", parameters,
					new Tax1099QRowMapper());

//			payerNameAddress Start
			NameAddressPhone payerNameAddress = new NameAddressPhone();
			if (tax1099Q.getPayerNameAddress() != null) {
				payerNameAddress = payerNameAddress
						.getNameAddressPhoneDetails(tax1099Q.getPayerNameAddress().getNameAddressId());
				tax1099Q.setPayerNameAddress(payerNameAddress);
			}
//			payerNameAddress End

//			recipientNameAddress Start
			NameAddress recipientNameAddress = new NameAddress();
			if (tax1099Q.getRecipientNameAddress() != null) {
				recipientNameAddress = recipientNameAddress
						.getNameAddressDetails(tax1099Q.getRecipientNameAddress().getNameAddressId());
				tax1099Q.setRecipientNameAddress(recipientNameAddress);
			}
//			recipientNameAddress End

			return tax1099Q;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Tax1099Q : ", e);
			throw new FDXException(e,500);
		}
	}

}
