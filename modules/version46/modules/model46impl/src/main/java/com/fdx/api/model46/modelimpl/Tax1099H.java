package com.fdx.api.model46.modelimpl;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

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
import com.fdx.api.model46.config.ConnectionConfigApi46;
import com.fdx.api.model46.mapper.Tax1099HRowMapper;

import io.swagger.annotations.ApiModel;

/**
 * 2019 Health Coverage Tax Credit (HCTC) Advance Payments (IRS discontinued in
 * 2020)
 */
@ApiModel(description = "2019 Health Coverage Tax Credit (HCTC) Advance Payments (IRS discontinued in 2020)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1099H {

	NamedParameterJdbcTemplate template;

	@JsonUnwrapped
	private Tax tax;

	@JsonProperty("issuerNameAddress")
	private NameAddressPhone issuerNameAddress;

	@JsonProperty("issuerTin")
	private String issuerTin;

	@JsonProperty("recipientTin")
	private String recipientTin;

	@JsonProperty("recipientNameAddress")
	private NameAddress recipientNameAddress;

	@JsonProperty("advancePayments")
	private Double advancePayments;

	@JsonProperty("numberOfMonths")
	private Integer numberOfMonths;

	@JsonProperty("payments")
	@Valid
	private List<MonthAmount> payments = null;

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

	public Double getAdvancePayments() {
		return advancePayments;
	}

	public void setAdvancePayments(Double advancePayments) {
		this.advancePayments = advancePayments;
	}

	public Integer getNumberOfMonths() {
		return numberOfMonths;
	}

	public void setNumberOfMonths(Integer numberOfMonths) {
		this.numberOfMonths = numberOfMonths;
	}

	public List<MonthAmount> getPayments() {
		return payments;
	}

	public void setPayments(List<MonthAmount> payments) {
		this.payments = payments;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((advancePayments == null) ? 0 : advancePayments.hashCode());
		result = prime * result + ((issuerNameAddress == null) ? 0 : issuerNameAddress.hashCode());
		result = prime * result + ((issuerTin == null) ? 0 : issuerTin.hashCode());
		result = prime * result + ((numberOfMonths == null) ? 0 : numberOfMonths.hashCode());
		result = prime * result + ((payments == null) ? 0 : payments.hashCode());
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
		Tax1099H other = (Tax1099H) obj;
		if (advancePayments == null) {
			if (other.advancePayments != null)
				return false;
		} else if (!advancePayments.equals(other.advancePayments))
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
		if (numberOfMonths == null) {
			if (other.numberOfMonths != null)
				return false;
		} else if (!numberOfMonths.equals(other.numberOfMonths))
			return false;
		if (payments == null) {
			if (other.payments != null)
				return false;
		} else if (!payments.equals(other.payments))
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
		return "Tax1099H [tax=" + tax + ", issuerNameAddress=" + issuerNameAddress + ", issuerTin=" + issuerTin
				+ ", recipientTin=" + recipientTin + ", recipientNameAddress=" + recipientNameAddress
				+ ", advancePayments=" + advancePayments + ", numberOfMonths=" + numberOfMonths + ", payments="
				+ payments + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(Tax1099H.class);

	public Tax1099H getTax1099H(int internalId) throws FDXException {
		try {
			
			template = ConnectionConfigApi46.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("internalId", internalId);
			Tax1099H tax1099H;
			try {
				tax1099H = template.queryForObject(
						"select * from "+ DeveloperContext.getDeveloperSchema() +".tax1099H where internalId in (:internalId)", parameters,
						new Tax1099HRowMapper());
			} catch (EmptyResultDataAccessException e) {
				throw new FDXException("Tax1099H not found", 0);
			}
//		issuerNameAddress Start
			NameAddressPhone issuerNameAddress = new NameAddressPhone();
			if (tax1099H.getIssuerNameAddress() != null) {
				issuerNameAddress = issuerNameAddress
						.getNameAddressPhoneDetails(tax1099H.getIssuerNameAddress().getNameAddressId());
				tax1099H.setIssuerNameAddress(issuerNameAddress);
			}
//		issuerNameAddress End

//		recipientNameAddress Start
			NameAddress recipientNameAddress = new NameAddress();
			if (tax1099H.getRecipientNameAddress() != null) {
				recipientNameAddress = recipientNameAddress
						.getNameAddressDetails(tax1099H.getRecipientNameAddress().getNameAddressId());
				tax1099H.setRecipientNameAddress(recipientNameAddress);
			}
//		recipientNameAddress End

//		StateTaxWithholding Start
			List<MonthAmount> monthAmountList = tax1099H.getPayments();
			List<MonthAmount> monthAmountListNew = new ArrayList<>();
			if (tax1099H.getPayments() != null) {
				for (MonthAmount monthAmountIterator : monthAmountList) {
					MonthAmount monthAmount = monthAmountIterator
							.getMonthAmountDetails(monthAmountIterator.getMonthamountid());
					monthAmountListNew.add(monthAmount);
				}
				tax1099H.setPayments(monthAmountListNew);
			}
//		StateTaxWithholding End

			return tax1099H;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Tax1099H : ", e);
			throw new FDXException(e,500);
		}
	}
}
