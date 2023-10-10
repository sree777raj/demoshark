package com.fdx.api.model46.modelimpl;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.OptBoolean;
import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fdx.api.model46.config.ConnectionConfigApi46;
import com.fdx.api.model46.mapper.Tax1099CapRowMapper;

import io.swagger.annotations.ApiModel;

/**
 * Changes in Corporate Control and Capital Structure
 */
@ApiModel(description = "Changes in Corporate Control and Capital Structure")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1099Cap {

	NamedParameterJdbcTemplate template;

	@JsonUnwrapped
	private Tax tax;

	@JsonProperty("corporationNameAddress")
	private NameAddressPhone corporationNameAddress;

	@JsonProperty("corporationTin")
	private String corporationTin;

	@JsonProperty("shareholderTin")
	private String shareholderTin;

	@JsonProperty("shareholderNameAddress")
	private NameAddress shareholderNameAddress;

	@JsonProperty("accountNumber")
	private String accountNumber;

	@JsonProperty("dateOfSale")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private Date dateOfSale;

	@JsonProperty("aggregateAmount")
	private Double aggregateAmount;

	@JsonProperty("numberOfShares")
	private Double numberOfShares;

	@JsonProperty("stockClasses")
	private String stockClasses;

	public Tax getTax() {
		return tax;
	}

	public void setTax(Tax tax) {
		this.tax = tax;
	}

	public NameAddressPhone getCorporationNameAddress() {
		return corporationNameAddress;
	}

	public void setCorporationNameAddress(NameAddressPhone corporationNameAddress) {
		this.corporationNameAddress = corporationNameAddress;
	}

	public String getCorporationTin() {
		return corporationTin;
	}

	public void setCorporationTin(String corporationTin) {
		this.corporationTin = corporationTin;
	}

	public String getShareholderTin() {
		return shareholderTin;
	}

	public void setShareholderTin(String shareholderTin) {
		this.shareholderTin = shareholderTin;
	}

	public NameAddress getShareholderNameAddress() {
		return shareholderNameAddress;
	}

	public void setShareholderNameAddress(NameAddress shareholderNameAddress) {
		this.shareholderNameAddress = shareholderNameAddress;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Date getDateOfSale() {
		return dateOfSale;
	}

	public void setDateOfSale(Date dateOfSale) {
		this.dateOfSale = dateOfSale;
	}

	public Double getAggregateAmount() {
		return aggregateAmount;
	}

	public void setAggregateAmount(Double aggregateAmount) {
		this.aggregateAmount = aggregateAmount;
	}

	public Double getNumberOfShares() {
		return numberOfShares;
	}

	public void setNumberOfShares(Double numberOfShares) {
		this.numberOfShares = numberOfShares;
	}

	public String getStockClasses() {
		return stockClasses;
	}

	public void setStockClasses(String stockClasses) {
		this.stockClasses = stockClasses;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountNumber == null) ? 0 : accountNumber.hashCode());
		result = prime * result + ((aggregateAmount == null) ? 0 : aggregateAmount.hashCode());
		result = prime * result + ((corporationNameAddress == null) ? 0 : corporationNameAddress.hashCode());
		result = prime * result + ((corporationTin == null) ? 0 : corporationTin.hashCode());
		result = prime * result + ((dateOfSale == null) ? 0 : dateOfSale.hashCode());
		result = prime * result + ((numberOfShares == null) ? 0 : numberOfShares.hashCode());
		result = prime * result + ((shareholderNameAddress == null) ? 0 : shareholderNameAddress.hashCode());
		result = prime * result + ((shareholderTin == null) ? 0 : shareholderTin.hashCode());
		result = prime * result + ((stockClasses == null) ? 0 : stockClasses.hashCode());
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
		Tax1099Cap other = (Tax1099Cap) obj;
		if (accountNumber == null) {
			if (other.accountNumber != null)
				return false;
		} else if (!accountNumber.equals(other.accountNumber))
			return false;
		if (aggregateAmount == null) {
			if (other.aggregateAmount != null)
				return false;
		} else if (!aggregateAmount.equals(other.aggregateAmount))
			return false;
		if (corporationNameAddress == null) {
			if (other.corporationNameAddress != null)
				return false;
		} else if (!corporationNameAddress.equals(other.corporationNameAddress))
			return false;
		if (corporationTin == null) {
			if (other.corporationTin != null)
				return false;
		} else if (!corporationTin.equals(other.corporationTin))
			return false;
		if (dateOfSale == null) {
			if (other.dateOfSale != null)
				return false;
		} else if (!dateOfSale.equals(other.dateOfSale))
			return false;
		if (numberOfShares == null) {
			if (other.numberOfShares != null)
				return false;
		} else if (!numberOfShares.equals(other.numberOfShares))
			return false;
		if (shareholderNameAddress == null) {
			if (other.shareholderNameAddress != null)
				return false;
		} else if (!shareholderNameAddress.equals(other.shareholderNameAddress))
			return false;
		if (shareholderTin == null) {
			if (other.shareholderTin != null)
				return false;
		} else if (!shareholderTin.equals(other.shareholderTin))
			return false;
		if (stockClasses == null) {
			if (other.stockClasses != null)
				return false;
		} else if (!stockClasses.equals(other.stockClasses))
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
		return "Tax1099Cap [tax=" + tax + ", corporationNameAddress=" + corporationNameAddress + ", corporationTin="
				+ corporationTin + ", shareholderTin=" + shareholderTin + ", shareholderNameAddress="
				+ shareholderNameAddress + ", accountNumber=" + accountNumber + ", dateOfSale=" + dateOfSale
				+ ", aggregateAmount=" + aggregateAmount + ", numberOfShares=" + numberOfShares + ", stockClasses="
				+ stockClasses + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(Tax1099Cap.class);

	public Tax1099Cap getTax1099Cap(int internalId) throws FDXException {
		try {
			
			template = ConnectionConfigApi46.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("internalId", internalId);

			Tax1099Cap tax1099Cap = template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".tax1099Cap where internalId in (:internalId)", parameters,
					new Tax1099CapRowMapper());

//		corporationNameAddress Start
			NameAddressPhone corporationNameAddress = new NameAddressPhone();
			if (tax1099Cap.getCorporationNameAddress() != null) {
				corporationNameAddress = corporationNameAddress
						.getNameAddressPhoneDetails(tax1099Cap.getCorporationNameAddress().getNameAddressId());
				tax1099Cap.setCorporationNameAddress(corporationNameAddress);
			}
//		corporationNameAddress End

//		debtorNameAddress Start
			NameAddress shareholderNameAddress = new NameAddress();
			if (tax1099Cap.getShareholderNameAddress() != null) {
				shareholderNameAddress = shareholderNameAddress
						.getNameAddressDetails(tax1099Cap.getShareholderNameAddress().getNameAddressId());
				tax1099Cap.setShareholderNameAddress(shareholderNameAddress);
			}
//		borrowerNameAddress End

			return tax1099Cap;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Tax1099Cap : ", e);
			throw new FDXException(e,500);
		}
	}
}
