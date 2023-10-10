package com.fdx.api.model46.modelimpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

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
import com.fdx.api.model46.mapper.Tax1098QRowMapper;

import io.swagger.annotations.ApiModel;

/**
 * Qualifying Longevity Annuity Contract Information
 */
@ApiModel(description = "Qualifying Longevity Annuity Contract Information")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1098Q {

	NamedParameterJdbcTemplate template;

	@JsonUnwrapped
	private Tax tax;

	@JsonProperty("issuerNameAddress")
	private NameAddressPhone issuerNameAddress;

	@JsonProperty("issuerTin")
	private String issuerTin;

	@JsonProperty("participantTin")
	private String participantTin;

	@JsonProperty("participantNameAddress")
	private NameAddress participantNameAddress;

	@JsonProperty("accountNumber")
	private String accountNumber;

	@JsonProperty("planNumber")
	private String planNumber;

	@JsonProperty("planName")
	private String planName;

	@JsonProperty("planSponsorId")
	private String planSponsorId;

	@JsonProperty("annuityAmount")
	private Double annuityAmount;

	@JsonProperty("startDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private Date startDate;

	@JsonProperty("canBeAccelerated")
	@JsonInclude(Include.NON_NULL)
	private Boolean canBeAccelerated;

	@JsonProperty("totalPremiums")
	private Double totalPremiums;

	@JsonProperty("fairMarketValue")
	private Double fairMarketValue;

	@JsonProperty("premiums")
	@Valid
	private List<DateAmount> premiums = null;

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

	public String getParticipantTin() {
		return participantTin;
	}

	public void setParticipantTin(String participantTin) {
		this.participantTin = participantTin;
	}

	public NameAddress getParticipantNameAddress() {
		return participantNameAddress;
	}

	public void setParticipantNameAddress(NameAddress participantNameAddress) {
		this.participantNameAddress = participantNameAddress;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getPlanNumber() {
		return planNumber;
	}

	public void setPlanNumber(String planNumber) {
		this.planNumber = planNumber;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getPlanSponsorId() {
		return planSponsorId;
	}

	public void setPlanSponsorId(String planSponsorId) {
		this.planSponsorId = planSponsorId;
	}

	public Double getAnnuityAmount() {
		return annuityAmount;
	}

	public void setAnnuityAmount(Double annuityAmount) {
		this.annuityAmount = annuityAmount;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Boolean getCanBeAccelerated() {
		return canBeAccelerated;
	}

	public void setCanBeAccelerated(Boolean canBeAccelerated) {
		this.canBeAccelerated = canBeAccelerated;
	}

	public Double getTotalPremiums() {
		return totalPremiums;
	}

	public void setTotalPremiums(Double totalPremiums) {
		this.totalPremiums = totalPremiums;
	}

	public Double getFairMarketValue() {
		return fairMarketValue;
	}

	public void setFairMarketValue(Double fairMarketValue) {
		this.fairMarketValue = fairMarketValue;
	}

	public List<DateAmount> getPremiums() {
		return premiums;
	}

	public void setPremiums(List<DateAmount> premiums) {
		this.premiums = premiums;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountNumber == null) ? 0 : accountNumber.hashCode());
		result = prime * result + ((annuityAmount == null) ? 0 : annuityAmount.hashCode());
		result = prime * result + ((canBeAccelerated == null) ? 0 : canBeAccelerated.hashCode());
		result = prime * result + ((fairMarketValue == null) ? 0 : fairMarketValue.hashCode());
		result = prime * result + ((issuerNameAddress == null) ? 0 : issuerNameAddress.hashCode());
		result = prime * result + ((issuerTin == null) ? 0 : issuerTin.hashCode());
		result = prime * result + ((participantNameAddress == null) ? 0 : participantNameAddress.hashCode());
		result = prime * result + ((participantTin == null) ? 0 : participantTin.hashCode());
		result = prime * result + ((planName == null) ? 0 : planName.hashCode());
		result = prime * result + ((planNumber == null) ? 0 : planNumber.hashCode());
		result = prime * result + ((planSponsorId == null) ? 0 : planSponsorId.hashCode());
		result = prime * result + ((premiums == null) ? 0 : premiums.hashCode());
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		result = prime * result + ((tax == null) ? 0 : tax.hashCode());
		result = prime * result + ((totalPremiums == null) ? 0 : totalPremiums.hashCode());
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
		Tax1098Q other = (Tax1098Q) obj;
		if (accountNumber == null) {
			if (other.accountNumber != null)
				return false;
		} else if (!accountNumber.equals(other.accountNumber))
			return false;
		if (annuityAmount == null) {
			if (other.annuityAmount != null)
				return false;
		} else if (!annuityAmount.equals(other.annuityAmount))
			return false;
		if (canBeAccelerated == null) {
			if (other.canBeAccelerated != null)
				return false;
		} else if (!canBeAccelerated.equals(other.canBeAccelerated))
			return false;
		if (fairMarketValue == null) {
			if (other.fairMarketValue != null)
				return false;
		} else if (!fairMarketValue.equals(other.fairMarketValue))
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
		if (participantNameAddress == null) {
			if (other.participantNameAddress != null)
				return false;
		} else if (!participantNameAddress.equals(other.participantNameAddress))
			return false;
		if (participantTin == null) {
			if (other.participantTin != null)
				return false;
		} else if (!participantTin.equals(other.participantTin))
			return false;
		if (planName == null) {
			if (other.planName != null)
				return false;
		} else if (!planName.equals(other.planName))
			return false;
		if (planNumber == null) {
			if (other.planNumber != null)
				return false;
		} else if (!planNumber.equals(other.planNumber))
			return false;
		if (planSponsorId == null) {
			if (other.planSponsorId != null)
				return false;
		} else if (!planSponsorId.equals(other.planSponsorId))
			return false;
		if (premiums == null) {
			if (other.premiums != null)
				return false;
		} else if (!premiums.equals(other.premiums))
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		if (tax == null) {
			if (other.tax != null)
				return false;
		} else if (!tax.equals(other.tax))
			return false;
		if (totalPremiums == null) {
			if (other.totalPremiums != null)
				return false;
		} else if (!totalPremiums.equals(other.totalPremiums))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tax1098Q [tax=" + tax + ", issuerNameAddress=" + issuerNameAddress + ", issuerTin=" + issuerTin
				+ ", participantTin=" + participantTin + ", participantNameAddress=" + participantNameAddress
				+ ", accountNumber=" + accountNumber + ", planNumber=" + planNumber + ", planName=" + planName
				+ ", planSponsorId=" + planSponsorId + ", annuityAmount=" + annuityAmount + ", startDate=" + startDate
				+ ", canBeAccelerated=" + canBeAccelerated + ", totalPremiums=" + totalPremiums + ", fairMarketValue="
				+ fairMarketValue + ", premiums=" + premiums + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(Tax1098Q.class);

	public Tax1098Q getTax1098Q(int internalId) throws FDXException {
		try {
			
			template = ConnectionConfigApi46.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("internalId", internalId);

			Tax1098Q tax1098Q = template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".tax1098Q where internalId in (:internalId)", parameters,
					new Tax1098QRowMapper());

//		issuerNameAddress Start
			NameAddressPhone issuerNameAddress = new NameAddressPhone();
			if (tax1098Q.getIssuerNameAddress() != null) {
				issuerNameAddress = issuerNameAddress
						.getNameAddressPhoneDetails(tax1098Q.getIssuerNameAddress().getNameAddressId());
				tax1098Q.setIssuerNameAddress(issuerNameAddress);
			}
//		issuerNameAddress End

//		participantNameAddress Start
			NameAddress participantNameAddress = new NameAddress();
			if (tax1098Q.getParticipantNameAddress() != null) {
				participantNameAddress = participantNameAddress
						.getNameAddressDetails(tax1098Q.getParticipantNameAddress().getNameAddressId());
				tax1098Q.setParticipantNameAddress(participantNameAddress);
			}
//		participantNameAddress End

//		Premiums Start
			List<DateAmount> dateAmountList = tax1098Q.getPremiums();
			List<DateAmount> dateAmountListNew = new ArrayList<>();
			if (tax1098Q.getPremiums() != null) {
				for (DateAmount dateAmountIterator : dateAmountList) {
					DateAmount DateAmount = dateAmountIterator
							.getDateAmountDetails(dateAmountIterator.getDateamountid());
					dateAmountListNew.add(DateAmount);
				}
				tax1098Q.setPremiums(dateAmountListNew);
			}

//		Premiums End

			return tax1098Q;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Tax1098Q : ", e);
			throw new FDXException(e,500);
		}
	}

}
