package com.fdx.api.model46.modelimpl;

import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import com.fdx.common.util.FdxConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fdx.api.model46.config.ConnectionConfigApi46;
import com.fdx.api.model46.mapper.Tax1099SbRowMapper;

import io.swagger.annotations.ApiModel;

/**
 * Seller&#39;s Investment in Life Insurance Contract
 */
@ApiModel(description = "Seller's Investment in Life Insurance Contract")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1099Sb {

	NamedParameterJdbcTemplate template;

	@JsonUnwrapped
	private Tax tax;

	@JsonProperty("issuerNameAddress")
	private NameAddressPhone issuerNameAddress;

	@JsonProperty("issuerTin")
	private String issuerTin;

	@JsonProperty("sellerTin")
	private String sellerTin;

	@JsonProperty("sellerNameAddress")
	private NameAddress sellerNameAddress;

	@JsonProperty("policyNumber")
	private String policyNumber;

	@JsonProperty("contractInvestment")
	private Double contractInvestment;

	@JsonProperty("surrenderAmount")
	private Double surrenderAmount;

	@JsonProperty("contactNameAddress")
	private NameAddressPhone contactNameAddress;

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

	public String getSellerTin() {
		return sellerTin;
	}

	public void setSellerTin(String sellerTin) {
		this.sellerTin = sellerTin;
	}

	public NameAddress getSellerNameAddress() {
		return sellerNameAddress;
	}

	public void setSellerNameAddress(NameAddress sellerNameAddress) {
		this.sellerNameAddress = sellerNameAddress;
	}

	public String getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	public Double getContractInvestment() {
		return contractInvestment;
	}

	public void setContractInvestment(Double contractInvestment) {
		this.contractInvestment = contractInvestment;
	}

	public Double getSurrenderAmount() {
		return surrenderAmount;
	}

	public void setSurrenderAmount(Double surrenderAmount) {
		this.surrenderAmount = surrenderAmount;
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
		result = prime * result + ((contactNameAddress == null) ? 0 : contactNameAddress.hashCode());
		result = prime * result + ((contractInvestment == null) ? 0 : contractInvestment.hashCode());
		result = prime * result + ((issuerNameAddress == null) ? 0 : issuerNameAddress.hashCode());
		result = prime * result + ((issuerTin == null) ? 0 : issuerTin.hashCode());
		result = prime * result + ((policyNumber == null) ? 0 : policyNumber.hashCode());
		result = prime * result + ((sellerNameAddress == null) ? 0 : sellerNameAddress.hashCode());
		result = prime * result + ((sellerTin == null) ? 0 : sellerTin.hashCode());
		result = prime * result + ((surrenderAmount == null) ? 0 : surrenderAmount.hashCode());
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
		Tax1099Sb other = (Tax1099Sb) obj;
		if (contactNameAddress == null) {
			if (other.contactNameAddress != null)
				return false;
		} else if (!contactNameAddress.equals(other.contactNameAddress))
			return false;
		if (contractInvestment == null) {
			if (other.contractInvestment != null)
				return false;
		} else if (!contractInvestment.equals(other.contractInvestment))
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
		if (policyNumber == null) {
			if (other.policyNumber != null)
				return false;
		} else if (!policyNumber.equals(other.policyNumber))
			return false;
		if (sellerNameAddress == null) {
			if (other.sellerNameAddress != null)
				return false;
		} else if (!sellerNameAddress.equals(other.sellerNameAddress))
			return false;
		if (sellerTin == null) {
			if (other.sellerTin != null)
				return false;
		} else if (!sellerTin.equals(other.sellerTin))
			return false;
		if (surrenderAmount == null) {
			if (other.surrenderAmount != null)
				return false;
		} else if (!surrenderAmount.equals(other.surrenderAmount))
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
		return "Tax1099Sb [tax=" + tax + ", issuerNameAddress=" + issuerNameAddress + ", issuerTin=" + issuerTin
				+ ", sellerTin=" + sellerTin + ", sellerNameAddress=" + sellerNameAddress + ", policyNumber="
				+ policyNumber + ", contractInvestment=" + contractInvestment + ", surrenderAmount=" + surrenderAmount
				+ ", contactNameAddress=" + contactNameAddress + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(Tax1099Sb.class);

	public Tax1099Sb getTax1099Sb(int internalId) throws FDXException {
		try {
			template = ConnectionConfigApi46.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("internalId", internalId);
			Tax1099Sb tax1099Sb;
			try {
				tax1099Sb = template.queryForObject(
						"select * from "+ DeveloperContext.getDeveloperSchema() +".Tax1099Sb where internalId in (:internalId)", parameters,
						new Tax1099SbRowMapper());
			} catch (EmptyResultDataAccessException e) {
				throw new FDXException("Tax1099Sb not found", 0);
			}
//			issuerNameAddress Start
			NameAddressPhone issuerNameAddress = new NameAddressPhone();
			if (tax1099Sb.getIssuerNameAddress() != null) {
				issuerNameAddress = issuerNameAddress
						.getNameAddressPhoneDetails(tax1099Sb.getIssuerNameAddress().getNameAddressId());
				tax1099Sb.setIssuerNameAddress(issuerNameAddress);
			}
//			issuerNameAddress End

//			sellerNameAddress Start
			NameAddress sellerNameAddress = new NameAddress();
			if (tax1099Sb.getSellerNameAddress() != null) {
				sellerNameAddress = sellerNameAddress
						.getNameAddressDetails(tax1099Sb.getSellerNameAddress().getNameAddressId());
				tax1099Sb.setSellerNameAddress(sellerNameAddress);
			}
//			sellerNameAddress End

//			contactNameAddress Start
			NameAddressPhone contactNameAddress = new NameAddressPhone();
			if (tax1099Sb.getContactNameAddress() != null) {
				contactNameAddress = contactNameAddress
						.getNameAddressPhoneDetails(tax1099Sb.getContactNameAddress().getNameAddressId());
				tax1099Sb.setContactNameAddress(contactNameAddress);
			}
//			contactNameAddress End

			return tax1099Sb;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Tax1099Sb : ", e);
			throw new FDXException(e, FdxConstants.HTTP_ERROR_CODE_500);
		}
	}

}
