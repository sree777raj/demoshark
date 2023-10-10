package com.fdx.api.model51.modelimpl;

import java.util.Date;

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
import com.fdx.api.model51.mapper.Tax1099LsRowMapper;

import io.swagger.annotations.ApiModel;

/**
 * Reportable Life Insurance Sale
 */
@ApiModel(description = "Reportable Life Insurance Sale")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1099Ls {

	NamedParameterJdbcTemplate template;

	@JsonUnwrapped
	private Tax tax;

	@JsonProperty("acquirerNameAddress")
	private NameAddressPhone acquirerNameAddress;

	@JsonProperty("acquirerTin")
	private String acquirerTin;

	@JsonProperty("recipientTin")
	private String recipientTin;

	@JsonProperty("recipientNameAddress")
	private NameAddress recipientNameAddress;

	@JsonProperty("policyNumber")
	private String policyNumber;

	@JsonProperty("payment")
	private Double payment;

	@JsonProperty("saleDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private Date saleDate;

	@JsonProperty("issuerName")
	private String issuerName;

	@JsonProperty("contactNameAddress")
	private NameAddressPhone contactNameAddress;

	public Tax getTax() {
		return tax;
	}

	public void setTax(Tax tax) {
		this.tax = tax;
	}

	public NameAddressPhone getAcquirerNameAddress() {
		return acquirerNameAddress;
	}

	public void setAcquirerNameAddress(NameAddressPhone acquirerNameAddress) {
		this.acquirerNameAddress = acquirerNameAddress;
	}

	public String getAcquirerTin() {
		return acquirerTin;
	}

	public void setAcquirerTin(String acquirerTin) {
		this.acquirerTin = acquirerTin;
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

	public String getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	public Double getPayment() {
		return payment;
	}

	public void setPayment(Double payment) {
		this.payment = payment;
	}

	public Date getSaleDate() {
		return saleDate;
	}

	public void setSaleDate(Date saleDate) {
		this.saleDate = saleDate;
	}

	public String getIssuerName() {
		return issuerName;
	}

	public void setIssuerName(String issuerName) {
		this.issuerName = issuerName;
	}

	public NameAddressPhone getContactNameAddress() {
		return contactNameAddress;
	}

	public void setContactNameAddress(NameAddressPhone contactNameAddress) {
		this.contactNameAddress = contactNameAddress;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((acquirerNameAddress == null) ? 0 : acquirerNameAddress.hashCode());
		result = prime * result + ((acquirerTin == null) ? 0 : acquirerTin.hashCode());
		result = prime * result + ((contactNameAddress == null) ? 0 : contactNameAddress.hashCode());
		result = prime * result + ((issuerName == null) ? 0 : issuerName.hashCode());
		result = prime * result + ((payment == null) ? 0 : payment.hashCode());
		result = prime * result + ((policyNumber == null) ? 0 : policyNumber.hashCode());
		result = prime * result + ((recipientNameAddress == null) ? 0 : recipientNameAddress.hashCode());
		result = prime * result + ((recipientTin == null) ? 0 : recipientTin.hashCode());
		result = prime * result + ((saleDate == null) ? 0 : saleDate.hashCode());
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
		Tax1099Ls other = (Tax1099Ls) obj;
		if (acquirerNameAddress == null) {
			if (other.acquirerNameAddress != null)
				return false;
		} else if (!acquirerNameAddress.equals(other.acquirerNameAddress))
			return false;
		if (acquirerTin == null) {
			if (other.acquirerTin != null)
				return false;
		} else if (!acquirerTin.equals(other.acquirerTin))
			return false;
		if (contactNameAddress == null) {
			if (other.contactNameAddress != null)
				return false;
		} else if (!contactNameAddress.equals(other.contactNameAddress))
			return false;
		if (issuerName == null) {
			if (other.issuerName != null)
				return false;
		} else if (!issuerName.equals(other.issuerName))
			return false;
		if (payment == null) {
			if (other.payment != null)
				return false;
		} else if (!payment.equals(other.payment))
			return false;
		if (policyNumber == null) {
			if (other.policyNumber != null)
				return false;
		} else if (!policyNumber.equals(other.policyNumber))
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
		if (saleDate == null) {
			if (other.saleDate != null)
				return false;
		} else if (!saleDate.equals(other.saleDate))
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
		return "Tax1099Ls [tax=" + tax + ", acquirerNameAddress=" + acquirerNameAddress + ", acquirerTin=" + acquirerTin
				+ ", recipientTin=" + recipientTin + ", recipientNameAddress=" + recipientNameAddress
				+ ", policyNumber=" + policyNumber + ", payment=" + payment + ", saleDate=" + saleDate + ", issuerName="
				+ issuerName + ", contactNameAddress=" + contactNameAddress + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(Tax1099Ls.class);

	public Tax1099Ls getTax1099Ls(int internalId) throws FDXException {
		try {
			template = ConnectionConfigApi51.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("internalId", internalId);
			Tax1099Ls tax1099Ls;
			try {
				tax1099Ls = template.queryForObject(
						"select * from "+ DeveloperContext.getDeveloperSchema() +".Tax1099Ls where internalId in (:internalId)", parameters,
						new Tax1099LsRowMapper());
			} catch (EmptyResultDataAccessException e) {
				throw new FDXException("Tax1099Ls not found", 0);
			}
//		acquirerNameAddress Start
			NameAddressPhone acquirerNameAddress = new NameAddressPhone();
			if (tax1099Ls.getAcquirerNameAddress() != null) {
				acquirerNameAddress = acquirerNameAddress
						.getNameAddressPhoneDetails(tax1099Ls.getAcquirerNameAddress().getNameAddressId());
				tax1099Ls.setAcquirerNameAddress(acquirerNameAddress);
			}
//		acquirerNameAddress End

//		recipientNameAddress Start
			NameAddress recipientNameAddress = new NameAddress();
			if (tax1099Ls.getRecipientNameAddress() != null) {
				recipientNameAddress = recipientNameAddress
						.getNameAddressDetails(tax1099Ls.getRecipientNameAddress().getNameAddressId());
				tax1099Ls.setRecipientNameAddress(recipientNameAddress);
			}
//		filerNameAddress End

//		contactNameAddress Start
			NameAddressPhone contactNameAddress = new NameAddressPhone();
			if (tax1099Ls.getContactNameAddress() != null) {
				contactNameAddress = contactNameAddress
						.getNameAddressPhoneDetails(tax1099Ls.getContactNameAddress().getNameAddressId());
				tax1099Ls.setContactNameAddress(contactNameAddress);
			}
//		contactNameAddress End

			return tax1099Ls;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Tax1099Ls : ", e);
			throw new FDXException(e,500);
		}
	}
}
