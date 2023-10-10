package com.fdx.api.model51.modelimpl;

import java.util.Date;

import com.fasterxml.jackson.annotation.*;
import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fdx.api.model51.config.ConnectionConfigApi51;
import com.fdx.api.model51.mapper.Tax1099SRowMapper;

import io.swagger.annotations.ApiModel;

/**
 * Proceeds From Real Estate Transactions
 */
@ApiModel(description = "Proceeds From Real Estate Transactions")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1099S {

	NamedParameterJdbcTemplate template;

	@JsonUnwrapped
	private Tax tax;

	@JsonProperty("filerNameAddress")
	private NameAddressPhone filerNameAddress;

	@JsonProperty("filerTin")
	private String filerTin;

	@JsonProperty("transferorTin")
	private String transferorTin;

	@JsonProperty("transferorNameAddress")
	private NameAddress transferorNameAddress;

	@JsonProperty("accountNumber")
	private String accountNumber;

	@JsonProperty("dateOfClosing")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private Date dateOfClosing;

	@JsonProperty("grossProceeds")
	private Double grossProceeds;

	@JsonProperty("addressOrLegalDescription")
	private String addressOrLegalDescription;

	@JsonProperty("receivedOtherConsideration")
	@JsonInclude(Include.NON_NULL)
	private Boolean receivedOtherConsideration;

	@JsonProperty("foreignPerson")
	@JsonInclude(Include.NON_NULL)
	private Boolean foreignPerson;

	@JsonProperty("realEstateTax")
	private Double realEstateTax;

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

	public String getTransferorTin() {
		return transferorTin;
	}

	public void setTransferorTin(String transferorTin) {
		this.transferorTin = transferorTin;
	}

	public NameAddress getTransferorNameAddress() {
		return transferorNameAddress;
	}

	public void setTransferorNameAddress(NameAddress transferorNameAddress) {
		this.transferorNameAddress = transferorNameAddress;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Date getDateOfClosing() {
		return dateOfClosing;
	}

	public void setDateOfClosing(Date dateOfClosing) {
		this.dateOfClosing = dateOfClosing;
	}

	public Double getGrossProceeds() {
		return grossProceeds;
	}

	public void setGrossProceeds(Double grossProceeds) {
		this.grossProceeds = grossProceeds;
	}

	public String getAddressOrLegalDescription() {
		return addressOrLegalDescription;
	}

	public void setAddressOrLegalDescription(String addressOrLegalDescription) {
		this.addressOrLegalDescription = addressOrLegalDescription;
	}

	public Boolean getReceivedOtherConsideration() {
		return receivedOtherConsideration;
	}

	public void setReceivedOtherConsideration(Boolean receivedOtherConsideration) {
		this.receivedOtherConsideration = receivedOtherConsideration;
	}

	public Boolean getForeignPerson() {
		return foreignPerson;
	}

	public void setForeignPerson(Boolean foreignPerson) {
		this.foreignPerson = foreignPerson;
	}

	public Double getRealEstateTax() {
		return realEstateTax;
	}

	public void setRealEstateTax(Double realEstateTax) {
		this.realEstateTax = realEstateTax;
	}

	@Override
	public String toString() {
		return "Tax1099S [tax=" + tax + ", filerNameAddress=" + filerNameAddress + ", filerTin=" + filerTin
				+ ", transferorTin=" + transferorTin + ", transferorNameAddress=" + transferorNameAddress
				+ ", accountNumber=" + accountNumber + ", dateOfClosing=" + dateOfClosing + ", grossProceeds="
				+ grossProceeds + ", addressOrLegalDescription=" + addressOrLegalDescription
				+ ", receivedOtherConsideration=" + receivedOtherConsideration + ", foreignPerson=" + foreignPerson
				+ ", realEstateTax=" + realEstateTax + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountNumber == null) ? 0 : accountNumber.hashCode());
		result = prime * result + ((addressOrLegalDescription == null) ? 0 : addressOrLegalDescription.hashCode());
		result = prime * result + ((dateOfClosing == null) ? 0 : dateOfClosing.hashCode());
		result = prime * result + ((filerNameAddress == null) ? 0 : filerNameAddress.hashCode());
		result = prime * result + ((filerTin == null) ? 0 : filerTin.hashCode());
		result = prime * result + ((foreignPerson == null) ? 0 : foreignPerson.hashCode());
		result = prime * result + ((grossProceeds == null) ? 0 : grossProceeds.hashCode());
		result = prime * result + ((realEstateTax == null) ? 0 : realEstateTax.hashCode());
		result = prime * result + ((receivedOtherConsideration == null) ? 0 : receivedOtherConsideration.hashCode());
		result = prime * result + ((tax == null) ? 0 : tax.hashCode());
		result = prime * result + ((transferorNameAddress == null) ? 0 : transferorNameAddress.hashCode());
		result = prime * result + ((transferorTin == null) ? 0 : transferorTin.hashCode());
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
		Tax1099S other = (Tax1099S) obj;
		if (accountNumber == null) {
			if (other.accountNumber != null)
				return false;
		} else if (!accountNumber.equals(other.accountNumber))
			return false;
		if (addressOrLegalDescription == null) {
			if (other.addressOrLegalDescription != null)
				return false;
		} else if (!addressOrLegalDescription.equals(other.addressOrLegalDescription))
			return false;
		if (dateOfClosing == null) {
			if (other.dateOfClosing != null)
				return false;
		} else if (!dateOfClosing.equals(other.dateOfClosing))
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
		if (foreignPerson == null) {
			if (other.foreignPerson != null)
				return false;
		} else if (!foreignPerson.equals(other.foreignPerson))
			return false;
		if (grossProceeds == null) {
			if (other.grossProceeds != null)
				return false;
		} else if (!grossProceeds.equals(other.grossProceeds))
			return false;
		if (realEstateTax == null) {
			if (other.realEstateTax != null)
				return false;
		} else if (!realEstateTax.equals(other.realEstateTax))
			return false;
		if (receivedOtherConsideration == null) {
			if (other.receivedOtherConsideration != null)
				return false;
		} else if (!receivedOtherConsideration.equals(other.receivedOtherConsideration))
			return false;
		if (tax == null) {
			if (other.tax != null)
				return false;
		} else if (!tax.equals(other.tax))
			return false;
		if (transferorNameAddress == null) {
			if (other.transferorNameAddress != null)
				return false;
		} else if (!transferorNameAddress.equals(other.transferorNameAddress))
			return false;
		if (transferorTin == null) {
			if (other.transferorTin != null)
				return false;
		} else if (!transferorTin.equals(other.transferorTin))
			return false;
		return true;
	}

	private static final Logger log = LoggerFactory.getLogger(Tax1099S.class);

	public Tax1099S getTax1099S(int internalId) throws FDXException {
		try {
			template = ConnectionConfigApi51.getTemplate();
			SqlParameterSource parameters = new MapSqlParameterSource("internalId", internalId);
			Tax1099S tax1099S;
			try {
				tax1099S = template.queryForObject(
						"select * from "+ DeveloperContext.getDeveloperSchema() +".Tax1099S where internalId in (:internalId)", parameters,
						new Tax1099SRowMapper());
			} catch (EmptyResultDataAccessException e) {
				throw new FDXException("Tax1099S not found", 0);
			}
//			FilerNameAddress Start
			NameAddressPhone filerNameAddress = new NameAddressPhone();
			if (tax1099S.getFilerNameAddress() != null) {
				filerNameAddress = filerNameAddress
						.getNameAddressPhoneDetails(tax1099S.getFilerNameAddress().getNameAddressId());
				tax1099S.setFilerNameAddress(filerNameAddress);
			}
//			FilerNameAddress End

//			TransferorNameAddress Start
			NameAddress transferorNameAddress = new NameAddress();
			if (tax1099S.getTransferorNameAddress() != null) {
				transferorNameAddress = transferorNameAddress
						.getNameAddressDetails(tax1099S.getTransferorNameAddress().getNameAddressId());
				tax1099S.setTransferorNameAddress(transferorNameAddress);
			}
//			TransferorNameAddress End

			return tax1099S;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Tax1099S : ", e);
			throw new FDXException(e,500);
		}
	}

}
