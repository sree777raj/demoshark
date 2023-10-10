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
import com.fdx.api.model51.mapper.Tax1098MaRowMapper;

import io.swagger.annotations.ApiModel;

/**
 * Mortgage Assistance Payments
 */
@ApiModel(description = "Mortgage Assistance Payments")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1098Ma {

	NamedParameterJdbcTemplate template;

	@JsonUnwrapped
	private Tax tax;

	@JsonProperty("filerNameAddress")
	private NameAddressPhone filerNameAddress;

	@JsonProperty("filerTin")
	private String filerTin;

	@JsonProperty("homeownerTin")
	private String homeownerTin;

	@JsonProperty("homeownerNameAddress")
	private NameAddress homeownerNameAddress;

	@JsonProperty("accountNumber")
	private String accountNumber;

	@JsonProperty("totalMortgagePayments")
	private Double totalMortgagePayments;

	@JsonProperty("mortgageAssistancePayments")
	private Double mortgageAssistancePayments;

	@JsonProperty("homeownerMortgagePayments")
	private Double homeownerMortgagePayments;

	public Tax getTax() {
		return tax;
	}

	public void setTax(Tax tax) {
		this.tax = tax;
	}

	public NameAddressPhone getFilerNameAddress() {
		return filerNameAddress;
	}

	public void setFilerNameAddress(NameAddressPhone filerNameAddress) {
		this.filerNameAddress = filerNameAddress;
	}

	public String getFilerTin() {
		return filerTin;
	}

	public void setFilerTin(String filerTin) {
		this.filerTin = filerTin;
	}

	public String getHomeownerTin() {
		return homeownerTin;
	}

	public void setHomeownerTin(String homeownerTin) {
		this.homeownerTin = homeownerTin;
	}

	public NameAddress getHomeownerNameAddress() {
		return homeownerNameAddress;
	}

	public void setHomeownerNameAddress(NameAddress homeownerNameAddress) {
		this.homeownerNameAddress = homeownerNameAddress;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Double getTotalMortgagePayments() {
		return totalMortgagePayments;
	}

	public void setTotalMortgagePayments(Double totalMortgagePayments) {
		this.totalMortgagePayments = totalMortgagePayments;
	}

	public Double getMortgageAssistancePayments() {
		return mortgageAssistancePayments;
	}

	public void setMortgageAssistancePayments(Double mortgageAssistancePayments) {
		this.mortgageAssistancePayments = mortgageAssistancePayments;
	}

	public Double getHomeownerMortgagePayments() {
		return homeownerMortgagePayments;
	}

	public void setHomeownerMortgagePayments(Double homeownerMortgagePayments) {
		this.homeownerMortgagePayments = homeownerMortgagePayments;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountNumber == null) ? 0 : accountNumber.hashCode());
		result = prime * result + ((filerNameAddress == null) ? 0 : filerNameAddress.hashCode());
		result = prime * result + ((filerTin == null) ? 0 : filerTin.hashCode());
		result = prime * result + ((homeownerMortgagePayments == null) ? 0 : homeownerMortgagePayments.hashCode());
		result = prime * result + ((homeownerNameAddress == null) ? 0 : homeownerNameAddress.hashCode());
		result = prime * result + ((homeownerTin == null) ? 0 : homeownerTin.hashCode());
		result = prime * result + ((mortgageAssistancePayments == null) ? 0 : mortgageAssistancePayments.hashCode());
		result = prime * result + ((tax == null) ? 0 : tax.hashCode());
		result = prime * result + ((totalMortgagePayments == null) ? 0 : totalMortgagePayments.hashCode());
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
		Tax1098Ma other = (Tax1098Ma) obj;
		if (accountNumber == null) {
			if (other.accountNumber != null)
				return false;
		} else if (!accountNumber.equals(other.accountNumber))
			return false;
		if (filerNameAddress == null) {
			if (other.filerNameAddress != null)
				return false;
		} else if (!filerNameAddress.equals(other.filerNameAddress))
			return false;
		if (filerTin == null) {
			if (other.filerTin != null)
				return false;
		} else if (!filerTin.equals(other.filerTin))
			return false;
		if (homeownerMortgagePayments == null) {
			if (other.homeownerMortgagePayments != null)
				return false;
		} else if (!homeownerMortgagePayments.equals(other.homeownerMortgagePayments))
			return false;
		if (homeownerNameAddress == null) {
			if (other.homeownerNameAddress != null)
				return false;
		} else if (!homeownerNameAddress.equals(other.homeownerNameAddress))
			return false;
		if (homeownerTin == null) {
			if (other.homeownerTin != null)
				return false;
		} else if (!homeownerTin.equals(other.homeownerTin))
			return false;
		if (mortgageAssistancePayments == null) {
			if (other.mortgageAssistancePayments != null)
				return false;
		} else if (!mortgageAssistancePayments.equals(other.mortgageAssistancePayments))
			return false;
		if (tax == null) {
			if (other.tax != null)
				return false;
		} else if (!tax.equals(other.tax))
			return false;
		if (totalMortgagePayments == null) {
			if (other.totalMortgagePayments != null)
				return false;
		} else if (!totalMortgagePayments.equals(other.totalMortgagePayments))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tax1098Ma [tax=" + tax + ", filerNameAddress=" + filerNameAddress + ", filerTin=" + filerTin
				+ ", homeownerTin=" + homeownerTin + ", homeownerNameAddress=" + homeownerNameAddress
				+ ", accountNumber=" + accountNumber + ", totalMortgagePayments=" + totalMortgagePayments
				+ ", mortgageAssistancePayments=" + mortgageAssistancePayments + ", homeownerMortgagePayments="
				+ homeownerMortgagePayments + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(Tax1098Ma.class);

	public Tax1098Ma getTax1098Ma(int internalId) throws FDXException {
		try {
			
			template = ConnectionConfigApi51.getTemplate();
			SqlParameterSource parameters = new MapSqlParameterSource("internalId", internalId);
			Tax1098Ma tax1098Ma;
			try {
				tax1098Ma = template.queryForObject(
						"select * from "+ DeveloperContext.getDeveloperSchema() +".tax1098Ma where internalId in (:internalId)", parameters,
						new Tax1098MaRowMapper());
			} catch (EmptyResultDataAccessException e) {
				throw new FDXException("Tax1098Ma not found", 0);
			}
//		filerNameAddress Start
			NameAddressPhone filerNameAddress = new NameAddressPhone();
			if (tax1098Ma.getFilerNameAddress() != null) {
				filerNameAddress = filerNameAddress
						.getNameAddressPhoneDetails(tax1098Ma.getFilerNameAddress().getNameAddressId());
				tax1098Ma.setFilerNameAddress(filerNameAddress);
			}
//		filerNameAddress End

//		homeownerNameAddress Start
			NameAddress homeownerNameAddress = new NameAddress();
			if (tax1098Ma.getHomeownerNameAddress() != null) {
				homeownerNameAddress = homeownerNameAddress
						.getNameAddressDetails(tax1098Ma.getHomeownerNameAddress().getNameAddressId());
				tax1098Ma.setHomeownerNameAddress(homeownerNameAddress);
			}
//		homeownerNameAddress End

			return tax1098Ma;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Tax1098Ma : ", e);
			throw new FDXException(e,500);
		}
	}

}
