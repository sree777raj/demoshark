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
import com.fdx.api.model51.mapper.Tax1099ARowMapper;

import io.swagger.annotations.ApiModel;

/**
 * Acquisition or Abandonment of Secured Property
 */
@ApiModel(description = "Acquisition or Abandonment of Secured Property")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1099A {

	NamedParameterJdbcTemplate template;

	@JsonUnwrapped
	private Tax tax;

	@JsonProperty("lenderNameAddress")
	private NameAddressPhone lenderNameAddress;

	@JsonProperty("lenderTin")
	private String lenderTin;

	@JsonProperty("borrowerTin")
	private String borrowerTin;

	@JsonProperty("borrowerNameAddress")
	private NameAddress borrowerNameAddress;

	@JsonProperty("accountNumber")
	private String accountNumber;

	@JsonProperty("dateOfAcquisition")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private Date dateOfAcquisition;

	@JsonProperty("principalBalance")
	private Double principalBalance;

	@JsonProperty("fairMarketValue")
	private Double fairMarketValue;

	@JsonProperty("personallyLiable")
	@JsonInclude(Include.NON_NULL)
	private Boolean personallyLiable;

	@JsonProperty("propertyDescription")
	private String propertyDescription;

	public Tax getTax() {
		return tax;
	}

	public void setTax(Tax tax) {
		this.tax = tax;
	}

	public NameAddressPhone getLenderNameAddress() {
		return lenderNameAddress;
	}

	public void setLenderNameAddress(NameAddressPhone lenderNameAddress) {
		this.lenderNameAddress = lenderNameAddress;
	}

	public String getLenderTin() {
		return lenderTin;
	}

	public void setLenderTin(String lenderTin) {
		this.lenderTin = lenderTin;
	}

	public String getBorrowerTin() {
		return borrowerTin;
	}

	public void setBorrowerTin(String borrowerTin) {
		this.borrowerTin = borrowerTin;
	}

	public NameAddress getBorrowerNameAddress() {
		return borrowerNameAddress;
	}

	public void setBorrowerNameAddress(NameAddress borrowerNameAddress) {
		this.borrowerNameAddress = borrowerNameAddress;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Date getDateOfAcquisition() {
		return dateOfAcquisition;
	}

	public void setDateOfAcquisition(Date dateOfAcquisition) {
		this.dateOfAcquisition = dateOfAcquisition;
	}

	public Double getPrincipalBalance() {
		return principalBalance;
	}

	public void setPrincipalBalance(Double principalBalance) {
		this.principalBalance = principalBalance;
	}

	public Double getFairMarketValue() {
		return fairMarketValue;
	}

	public void setFairMarketValue(Double fairMarketValue) {
		this.fairMarketValue = fairMarketValue;
	}

	public Boolean getPersonallyLiable() {
		return personallyLiable;
	}

	public void setPersonallyLiable(Boolean personallyLiable) {
		this.personallyLiable = personallyLiable;
	}

	public String getPropertyDescription() {
		return propertyDescription;
	}

	public void setPropertyDescription(String propertyDescription) {
		this.propertyDescription = propertyDescription;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountNumber == null) ? 0 : accountNumber.hashCode());
		result = prime * result + ((borrowerNameAddress == null) ? 0 : borrowerNameAddress.hashCode());
		result = prime * result + ((borrowerTin == null) ? 0 : borrowerTin.hashCode());
		result = prime * result + ((dateOfAcquisition == null) ? 0 : dateOfAcquisition.hashCode());
		result = prime * result + ((fairMarketValue == null) ? 0 : fairMarketValue.hashCode());
		result = prime * result + ((lenderNameAddress == null) ? 0 : lenderNameAddress.hashCode());
		result = prime * result + ((lenderTin == null) ? 0 : lenderTin.hashCode());
		result = prime * result + ((personallyLiable == null) ? 0 : personallyLiable.hashCode());
		result = prime * result + ((principalBalance == null) ? 0 : principalBalance.hashCode());
		result = prime * result + ((propertyDescription == null) ? 0 : propertyDescription.hashCode());
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
		Tax1099A other = (Tax1099A) obj;
		if (accountNumber == null) {
			if (other.accountNumber != null)
				return false;
		} else if (!accountNumber.equals(other.accountNumber))
			return false;
		if (borrowerNameAddress == null) {
			if (other.borrowerNameAddress != null)
				return false;
		} else if (!borrowerNameAddress.equals(other.borrowerNameAddress))
			return false;
		if (borrowerTin == null) {
			if (other.borrowerTin != null)
				return false;
		} else if (!borrowerTin.equals(other.borrowerTin))
			return false;
		if (dateOfAcquisition == null) {
			if (other.dateOfAcquisition != null)
				return false;
		} else if (!dateOfAcquisition.equals(other.dateOfAcquisition))
			return false;
		if (fairMarketValue == null) {
			if (other.fairMarketValue != null)
				return false;
		} else if (!fairMarketValue.equals(other.fairMarketValue))
			return false;
		if (lenderNameAddress == null) {
			if (other.lenderNameAddress != null)
				return false;
		} else if (!lenderNameAddress.equals(other.lenderNameAddress))
			return false;
		if (lenderTin == null) {
			if (other.lenderTin != null)
				return false;
		} else if (!lenderTin.equals(other.lenderTin))
			return false;
		if (personallyLiable == null) {
			if (other.personallyLiable != null)
				return false;
		} else if (!personallyLiable.equals(other.personallyLiable))
			return false;
		if (principalBalance == null) {
			if (other.principalBalance != null)
				return false;
		} else if (!principalBalance.equals(other.principalBalance))
			return false;
		if (propertyDescription == null) {
			if (other.propertyDescription != null)
				return false;
		} else if (!propertyDescription.equals(other.propertyDescription))
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
		return "Tax1099A [tax=" + tax + ", lenderNameAddress=" + lenderNameAddress + ", lenderTin=" + lenderTin
				+ ", borrowerTin=" + borrowerTin + ", borrowerNameAddress=" + borrowerNameAddress + ", accountNumber="
				+ accountNumber + ", dateOfAcquisition=" + dateOfAcquisition + ", principalBalance=" + principalBalance
				+ ", fairMarketValue=" + fairMarketValue + ", personallyLiable=" + personallyLiable
				+ ", propertyDescription=" + propertyDescription + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(Tax1099A.class);

	public Tax1099A getTax1099A(int internalId) throws FDXException {
		try {
			
			template = ConnectionConfigApi51.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("internalId", internalId);
			Tax1099A tax1099A;
			try {
				tax1099A = template.queryForObject(
						"select * from "+ DeveloperContext.getDeveloperSchema() +".tax1099A where internalId in (:internalId)", parameters,
						new Tax1099ARowMapper());
			} catch (EmptyResultDataAccessException e) {
				throw new FDXException("Tax1099A not found", 0);
			}
//		lenderNameAddress Start
			NameAddressPhone lenderNameAddress = new NameAddressPhone();
			if (tax1099A.getLenderNameAddress() != null) {
				lenderNameAddress = lenderNameAddress
						.getNameAddressPhoneDetails(tax1099A.getLenderNameAddress().getNameAddressId());
				tax1099A.setLenderNameAddress(lenderNameAddress);
			}
//		lenderNameAddress End

//		borrowerNameAddress Start
			NameAddress borrowerNameAddress = new NameAddress();
			if (tax1099A.getBorrowerNameAddress() != null) {
				borrowerNameAddress = borrowerNameAddress
						.getNameAddressDetails(tax1099A.getBorrowerNameAddress().getNameAddressId());
				tax1099A.setBorrowerNameAddress(borrowerNameAddress);
			}
//		borrowerNameAddress End

			return tax1099A;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Tax1099A : ", e);
			throw new FDXException(e,500);
		}
	}
}
