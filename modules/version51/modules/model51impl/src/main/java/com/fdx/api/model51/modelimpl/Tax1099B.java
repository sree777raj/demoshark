package com.fdx.api.model51.modelimpl;

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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fdx.api.model51.config.ConnectionConfigApi51;
import com.fdx.api.model51.mapper.Tax1099BRowMapper;

import io.swagger.annotations.ApiModel;

/**
 * Proceeds From Broker and Barter Exchange Transactions
 */
@ApiModel(description = "Proceeds From Broker and Barter Exchange Transactions")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1099B {

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

	@JsonProperty("stateTaxWithholding")
	@Valid
	private List<StateTaxWithholding> stateTaxWithholding = null;

	@JsonProperty("federalTaxWithheld")
	private Double federalTaxWithheld;

	@JsonProperty("profitOnClosedContracts")
	private Double profitOnClosedContracts;

	@JsonProperty("unrealizedProfitOpenContractsBegin")
	private Double unrealizedProfitOpenContractsBegin;

	@JsonProperty("unrealizedProfitOpenContractsEnd")
	private Double unrealizedProfitOpenContractsEnd;

	@JsonProperty("aggregateProfitOnContracts")
	private Double aggregateProfitOnContracts;

	@JsonProperty("bartering")
	private Double bartering;

	@JsonProperty("securityDetails")
	@Valid
	private List<SecurityDetail> securityDetails = null;

	@JsonProperty("secondTinNotice")
	@JsonInclude(Include.NON_NULL)
	private Boolean secondTinNotice;

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

	public List<StateTaxWithholding> getStateTaxWithholding() {
		return stateTaxWithholding;
	}

	public void setStateTaxWithholding(List<StateTaxWithholding> stateTaxWithholding) {
		this.stateTaxWithholding = stateTaxWithholding;
	}

	public Double getFederalTaxWithheld() {
		return federalTaxWithheld;
	}

	public void setFederalTaxWithheld(Double federalTaxWithheld) {
		this.federalTaxWithheld = federalTaxWithheld;
	}

	public Double getProfitOnClosedContracts() {
		return profitOnClosedContracts;
	}

	public void setProfitOnClosedContracts(Double profitOnClosedContracts) {
		this.profitOnClosedContracts = profitOnClosedContracts;
	}

	public Double getUnrealizedProfitOpenContractsBegin() {
		return unrealizedProfitOpenContractsBegin;
	}

	public void setUnrealizedProfitOpenContractsBegin(Double unrealizedProfitOpenContractsBegin) {
		this.unrealizedProfitOpenContractsBegin = unrealizedProfitOpenContractsBegin;
	}

	public Double getUnrealizedProfitOpenContractsEnd() {
		return unrealizedProfitOpenContractsEnd;
	}

	public void setUnrealizedProfitOpenContractsEnd(Double unrealizedProfitOpenContractsEnd) {
		this.unrealizedProfitOpenContractsEnd = unrealizedProfitOpenContractsEnd;
	}

	public Double getAggregateProfitOnContracts() {
		return aggregateProfitOnContracts;
	}

	public void setAggregateProfitOnContracts(Double aggregateProfitOnContracts) {
		this.aggregateProfitOnContracts = aggregateProfitOnContracts;
	}

	public Double getBartering() {
		return bartering;
	}

	public void setBartering(Double bartering) {
		this.bartering = bartering;
	}

	public List<SecurityDetail> getSecurityDetails() {
		return securityDetails;
	}

	public void setSecurityDetails(List<SecurityDetail> securityDetails) {
		this.securityDetails = securityDetails;
	}

	public Boolean getSecondTinNotice() {
		return secondTinNotice;
	}

	public void setSecondTinNotice(Boolean secondTinNotice) {
		this.secondTinNotice = secondTinNotice;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountNumber == null) ? 0 : accountNumber.hashCode());
		result = prime * result + ((aggregateProfitOnContracts == null) ? 0 : aggregateProfitOnContracts.hashCode());
		result = prime * result + ((bartering == null) ? 0 : bartering.hashCode());
		result = prime * result + ((federalTaxWithheld == null) ? 0 : federalTaxWithheld.hashCode());
		result = prime * result + ((payerNameAddress == null) ? 0 : payerNameAddress.hashCode());
		result = prime * result + ((payerTin == null) ? 0 : payerTin.hashCode());
		result = prime * result + ((profitOnClosedContracts == null) ? 0 : profitOnClosedContracts.hashCode());
		result = prime * result + ((recipientNameAddress == null) ? 0 : recipientNameAddress.hashCode());
		result = prime * result + ((recipientTin == null) ? 0 : recipientTin.hashCode());
		result = prime * result + ((secondTinNotice == null) ? 0 : secondTinNotice.hashCode());
		result = prime * result + ((securityDetails == null) ? 0 : securityDetails.hashCode());
		result = prime * result + ((stateTaxWithholding == null) ? 0 : stateTaxWithholding.hashCode());
		result = prime * result + ((tax == null) ? 0 : tax.hashCode());
		result = prime * result
				+ ((unrealizedProfitOpenContractsBegin == null) ? 0 : unrealizedProfitOpenContractsBegin.hashCode());
		result = prime * result
				+ ((unrealizedProfitOpenContractsEnd == null) ? 0 : unrealizedProfitOpenContractsEnd.hashCode());
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
		Tax1099B other = (Tax1099B) obj;
		if (accountNumber == null) {
			if (other.accountNumber != null)
				return false;
		} else if (!accountNumber.equals(other.accountNumber))
			return false;
		if (aggregateProfitOnContracts == null) {
			if (other.aggregateProfitOnContracts != null)
				return false;
		} else if (!aggregateProfitOnContracts.equals(other.aggregateProfitOnContracts))
			return false;
		if (bartering == null) {
			if (other.bartering != null)
				return false;
		} else if (!bartering.equals(other.bartering))
			return false;
		if (federalTaxWithheld == null) {
			if (other.federalTaxWithheld != null)
				return false;
		} else if (!federalTaxWithheld.equals(other.federalTaxWithheld))
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
		if (profitOnClosedContracts == null) {
			if (other.profitOnClosedContracts != null)
				return false;
		} else if (!profitOnClosedContracts.equals(other.profitOnClosedContracts))
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
		if (secondTinNotice == null) {
			if (other.secondTinNotice != null)
				return false;
		} else if (!secondTinNotice.equals(other.secondTinNotice))
			return false;
		if (securityDetails == null) {
			if (other.securityDetails != null)
				return false;
		} else if (!securityDetails.equals(other.securityDetails))
			return false;
		if (stateTaxWithholding == null) {
			if (other.stateTaxWithholding != null)
				return false;
		} else if (!stateTaxWithholding.equals(other.stateTaxWithholding))
			return false;
		if (tax == null) {
			if (other.tax != null)
				return false;
		} else if (!tax.equals(other.tax))
			return false;
		if (unrealizedProfitOpenContractsBegin == null) {
			if (other.unrealizedProfitOpenContractsBegin != null)
				return false;
		} else if (!unrealizedProfitOpenContractsBegin.equals(other.unrealizedProfitOpenContractsBegin))
			return false;
		if (unrealizedProfitOpenContractsEnd == null) {
			if (other.unrealizedProfitOpenContractsEnd != null)
				return false;
		} else if (!unrealizedProfitOpenContractsEnd.equals(other.unrealizedProfitOpenContractsEnd))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tax1099B [tax=" + tax + ", payerNameAddress=" + payerNameAddress + ", payerTin=" + payerTin
				+ ", recipientTin=" + recipientTin + ", recipientNameAddress=" + recipientNameAddress
				+ ", accountNumber=" + accountNumber + ", stateTaxWithholding=" + stateTaxWithholding
				+ ", federalTaxWithheld=" + federalTaxWithheld + ", profitOnClosedContracts=" + profitOnClosedContracts
				+ ", unrealizedProfitOpenContractsBegin=" + unrealizedProfitOpenContractsBegin
				+ ", unrealizedProfitOpenContractsEnd=" + unrealizedProfitOpenContractsEnd
				+ ", aggregateProfitOnContracts=" + aggregateProfitOnContracts + ", bartering=" + bartering
				+ ", securityDetails=" + securityDetails + ", secondTinNotice=" + secondTinNotice + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(Tax1099B.class);

	public Tax1099B getTax1099B(int internalId) throws FDXException {
		try {
			
			template = ConnectionConfigApi51.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("internalId", internalId);
			Tax1099B tax1099B;
			try {
				tax1099B = template.queryForObject(
						"select * from "+ DeveloperContext.getDeveloperSchema() +".tax1099B where internalId in (:internalId)", parameters,
						new Tax1099BRowMapper());
			} catch (EmptyResultDataAccessException e) {
				throw new FDXException("Tax1099B not found", 0);
			}
//		payerNameAddress Start
			NameAddressPhone payerNameAddress = new NameAddressPhone();
			if (tax1099B.getPayerNameAddress() != null) {
				payerNameAddress = payerNameAddress
						.getNameAddressPhoneDetails(tax1099B.getPayerNameAddress().getNameAddressId());
				tax1099B.setPayerNameAddress(payerNameAddress);
			}
//		payerNameAddress End

//		borrowerNameAddress Start
			NameAddress recipientNameAddress = new NameAddress();
			if (tax1099B.getRecipientNameAddress() != null) {
				recipientNameAddress = recipientNameAddress
						.getNameAddressDetails(tax1099B.getRecipientNameAddress().getNameAddressId());
				tax1099B.setRecipientNameAddress(recipientNameAddress);
			}
//		borrowerNameAddress End

//		StateTaxWithholding Start
			List<StateTaxWithholding> stateTaxWithholdingList = tax1099B.getStateTaxWithholding();
			List<StateTaxWithholding> stateTaxWithholdingListNew = new ArrayList<>();
			if (tax1099B.getStateTaxWithholding() != null) {
				for (StateTaxWithholding stateTaxWithholdingIterator : stateTaxWithholdingList) {
					StateTaxWithholding stateTaxWithholding = stateTaxWithholdingIterator
							.getStateTaxWIthHolding(stateTaxWithholdingIterator.getStwithheldid());
					stateTaxWithholdingListNew.add(stateTaxWithholding);
				}
				tax1099B.setStateTaxWithholding(stateTaxWithholdingListNew);
			}

//		StateTaxWithholding End

//		SecurityDetail Start
			List<SecurityDetail> securityDetailsList = tax1099B.getSecurityDetails();
			List<SecurityDetail> securityDetailsListNew = new ArrayList<>();
			if (tax1099B.getSecurityDetails() != null) {
				for (SecurityDetail securityDetailsIterator : securityDetailsList) {
					SecurityDetail securityDetails = securityDetailsIterator
							.getSecurityDetails(securityDetailsIterator.getSecuritydetailid());
					securityDetailsListNew.add(securityDetails);
				}
				tax1099B.setSecurityDetails(securityDetailsListNew);
			}
//		SecurityDetail End

			return tax1099B;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Tax1099B : ", e);
			throw new FDXException(e,500);
		}
	}
}
