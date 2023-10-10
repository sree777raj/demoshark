package com.fdx.api.model46.modelimpl;

import java.util.Date;

import com.fasterxml.jackson.annotation.*;
import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fdx.api.model46.config.ConnectionConfigApi46;
import com.fdx.api.model46.mapper.Tax1099CRowMapper;

import io.swagger.annotations.ApiModel;

/**
 * Cancellation of Debt
 */
@ApiModel(description = "Cancellation of Debt")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1099C {

	NamedParameterJdbcTemplate template;

	@JsonUnwrapped
	private Tax tax;

	@JsonProperty("creditorNameAddress")
	private NameAddressPhone creditorNameAddress;

	@JsonProperty("creditorTin")
	private String creditorTin;

	@JsonProperty("debtorTin")
	private String debtorTin;

	@JsonProperty("debtorNameAddress")
	private NameAddress debtorNameAddress;

	@JsonProperty("accountNumber")
	private String accountNumber;

	@JsonProperty("dateOfEvent")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private Date dateOfEvent;

	@JsonProperty("amountDischarged")
	private Double amountDischarged;

	@JsonProperty("interestIncluded")
	private Double interestIncluded;

	@JsonProperty("debtDescription")
	private String debtDescription;

	@JsonProperty("personallyLiable")
	@JsonInclude(Include.NON_NULL)
	private Boolean personallyLiable;

	@JsonProperty("debtCode")
	private String debtCode;

	@JsonProperty("fairMarketValue")
	private Double fairMarketValue;

	public Tax getTax() {
		return tax;
	}

	public void setTax(Tax tax) {
		this.tax = tax;
	}

	public NameAddressPhone getCreditorNameAddress() {
		return creditorNameAddress;
	}

	public void setCreditorNameAddress(NameAddressPhone creditorNameAddress) {
		this.creditorNameAddress = creditorNameAddress;
	}

	public String getCreditorTin() {
		return creditorTin;
	}

	public void setCreditorTin(String creditorTin) {
		this.creditorTin = creditorTin;
	}

	public String getDebtorTin() {
		return debtorTin;
	}

	public void setDebtorTin(String debtorTin) {
		this.debtorTin = debtorTin;
	}

	public NameAddress getDebtorNameAddress() {
		return debtorNameAddress;
	}

	public void setDebtorNameAddress(NameAddress debtorNameAddress) {
		this.debtorNameAddress = debtorNameAddress;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Date getDateOfEvent() {
		return dateOfEvent;
	}

	public void setDateOfEvent(Date dateOfEvent) {
		this.dateOfEvent = dateOfEvent;
	}

	public Double getAmountDischarged() {
		return amountDischarged;
	}

	public void setAmountDischarged(Double amountDischarged) {
		this.amountDischarged = amountDischarged;
	}

	public Double getInterestIncluded() {
		return interestIncluded;
	}

	public void setInterestIncluded(Double interestIncluded) {
		this.interestIncluded = interestIncluded;
	}

	public String getDebtDescription() {
		return debtDescription;
	}

	public void setDebtDescription(String debtDescription) {
		this.debtDescription = debtDescription;
	}

	public Boolean getPersonallyLiable() {
		return personallyLiable;
	}

	public void setPersonallyLiable(Boolean personallyLiable) {
		this.personallyLiable = personallyLiable;
	}

	public String getDebtCode() {
		return debtCode;
	}

	public void setDebtCode(String debtCode) {
		this.debtCode = debtCode;
	}

	public Double getFairMarketValue() {
		return fairMarketValue;
	}

	public void setFairMarketValue(Double fairMarketValue) {
		this.fairMarketValue = fairMarketValue;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountNumber == null) ? 0 : accountNumber.hashCode());
		result = prime * result + ((amountDischarged == null) ? 0 : amountDischarged.hashCode());
		result = prime * result + ((creditorNameAddress == null) ? 0 : creditorNameAddress.hashCode());
		result = prime * result + ((creditorTin == null) ? 0 : creditorTin.hashCode());
		result = prime * result + ((dateOfEvent == null) ? 0 : dateOfEvent.hashCode());
		result = prime * result + ((debtCode == null) ? 0 : debtCode.hashCode());
		result = prime * result + ((debtDescription == null) ? 0 : debtDescription.hashCode());
		result = prime * result + ((debtorNameAddress == null) ? 0 : debtorNameAddress.hashCode());
		result = prime * result + ((debtorTin == null) ? 0 : debtorTin.hashCode());
		result = prime * result + ((fairMarketValue == null) ? 0 : fairMarketValue.hashCode());
		result = prime * result + ((interestIncluded == null) ? 0 : interestIncluded.hashCode());
		result = prime * result + ((personallyLiable == null) ? 0 : personallyLiable.hashCode());
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
		Tax1099C other = (Tax1099C) obj;
		if (accountNumber == null) {
			if (other.accountNumber != null)
				return false;
		} else if (!accountNumber.equals(other.accountNumber))
			return false;
		if (amountDischarged == null) {
			if (other.amountDischarged != null)
				return false;
		} else if (!amountDischarged.equals(other.amountDischarged))
			return false;
		if (creditorNameAddress == null) {
			if (other.creditorNameAddress != null)
				return false;
		} else if (!creditorNameAddress.equals(other.creditorNameAddress))
			return false;
		if (creditorTin == null) {
			if (other.creditorTin != null)
				return false;
		} else if (!creditorTin.equals(other.creditorTin))
			return false;
		if (dateOfEvent == null) {
			if (other.dateOfEvent != null)
				return false;
		} else if (!dateOfEvent.equals(other.dateOfEvent))
			return false;
		if (debtCode == null) {
			if (other.debtCode != null)
				return false;
		} else if (!debtCode.equals(other.debtCode))
			return false;
		if (debtDescription == null) {
			if (other.debtDescription != null)
				return false;
		} else if (!debtDescription.equals(other.debtDescription))
			return false;
		if (debtorNameAddress == null) {
			if (other.debtorNameAddress != null)
				return false;
		} else if (!debtorNameAddress.equals(other.debtorNameAddress))
			return false;
		if (debtorTin == null) {
			if (other.debtorTin != null)
				return false;
		} else if (!debtorTin.equals(other.debtorTin))
			return false;
		if (fairMarketValue == null) {
			if (other.fairMarketValue != null)
				return false;
		} else if (!fairMarketValue.equals(other.fairMarketValue))
			return false;
		if (interestIncluded == null) {
			if (other.interestIncluded != null)
				return false;
		} else if (!interestIncluded.equals(other.interestIncluded))
			return false;
		if (personallyLiable == null) {
			if (other.personallyLiable != null)
				return false;
		} else if (!personallyLiable.equals(other.personallyLiable))
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
		return "Tax1099C [tax=" + tax + ", creditorNameAddress=" + creditorNameAddress + ", creditorTin=" + creditorTin
				+ ", debtorTin=" + debtorTin + ", debtorNameAddress=" + debtorNameAddress + ", accountNumber="
				+ accountNumber + ", dateOfEvent=" + dateOfEvent + ", amountDischarged=" + amountDischarged
				+ ", interestIncluded=" + interestIncluded + ", debtDescription=" + debtDescription
				+ ", personallyLiable=" + personallyLiable + ", debtCode=" + debtCode + ", fairMarketValue="
				+ fairMarketValue + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(Tax1099C.class);

	public Tax1099C getTax1099C(int internalId) throws FDXException {
		try {
			
			template = ConnectionConfigApi46.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("internalId", internalId);

			Tax1099C tax1099C = template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".tax1099C where internalId in (:internalId)", parameters,
					new Tax1099CRowMapper());

//		creditorNameAddress Start
			NameAddressPhone creditorNameAddress = new NameAddressPhone();
			if (tax1099C.getCreditorNameAddress() != null) {
				creditorNameAddress = creditorNameAddress
						.getNameAddressPhoneDetails(tax1099C.getCreditorNameAddress().getNameAddressId());
				tax1099C.setCreditorNameAddress(creditorNameAddress);
			}
//		creditorNameAddress End

//		debtorNameAddress Start
			NameAddress debtorNameAddress = new NameAddress();
			if (tax1099C.getDebtorNameAddress() != null) {
				debtorNameAddress = debtorNameAddress
						.getNameAddressDetails(tax1099C.getDebtorNameAddress().getNameAddressId());
				tax1099C.setDebtorNameAddress(debtorNameAddress);
			}
//		borrowerNameAddress End

			return tax1099C;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Tax1099C : ", e);
			throw new FDXException(e,500);
		}
	}
}
