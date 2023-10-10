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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fdx.api.model46.config.ConnectionConfigApi46;
import com.fdx.api.model46.mapper.Tax1099GRowMapper;

import io.swagger.annotations.ApiModel;

/**
 * Certain Government Payments
 */
@ApiModel(description = "Certain Government Payments")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1099G {

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

	@JsonProperty("unemploymentCompensation")
	private Double unemploymentCompensation;

	@JsonProperty("taxRefund")
	private Double taxRefund;

	@JsonProperty("refundYear")
	private Integer refundYear;

	@JsonProperty("federalTaxWithheld")
	private Double federalTaxWithheld;

	@JsonProperty("rtaaPayments")
	private Double rtaaPayments;

	@JsonProperty("grants")
	private Double grants;

	@JsonProperty("agriculturePayments")
	private Double agriculturePayments;

	@JsonProperty("businessIncome")
	@JsonInclude(Include.NON_NULL)
	private Boolean businessIncome;

	@JsonProperty("marketGain")
	private Double marketGain;

	@JsonProperty("stateTaxWithholding")
	@Valid
	private List<StateTaxWithholding> stateTaxWithholding = null;

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

	public Double getUnemploymentCompensation() {
		return unemploymentCompensation;
	}

	public void setUnemploymentCompensation(Double unemploymentCompensation) {
		this.unemploymentCompensation = unemploymentCompensation;
	}

	public Double getTaxRefund() {
		return taxRefund;
	}

	public void setTaxRefund(Double taxRefund) {
		this.taxRefund = taxRefund;
	}

	public Integer getRefundYear() {
		return refundYear;
	}

	public void setRefundYear(Integer refundYear) {
		this.refundYear = refundYear;
	}

	public Double getFederalTaxWithheld() {
		return federalTaxWithheld;
	}

	public void setFederalTaxWithheld(Double federalTaxWithheld) {
		this.federalTaxWithheld = federalTaxWithheld;
	}

	public Double getRtaaPayments() {
		return rtaaPayments;
	}

	public void setRtaaPayments(Double rtaaPayments) {
		this.rtaaPayments = rtaaPayments;
	}

	public Double getGrants() {
		return grants;
	}

	public void setGrants(Double grants) {
		this.grants = grants;
	}

	public Double getAgriculturePayments() {
		return agriculturePayments;
	}

	public void setAgriculturePayments(Double agriculturePayments) {
		this.agriculturePayments = agriculturePayments;
	}

	public Boolean getBusinessIncome() {
		return businessIncome;
	}

	public void setBusinessIncome(Boolean businessIncome) {
		this.businessIncome = businessIncome;
	}

	public Double getMarketGain() {
		return marketGain;
	}

	public void setMarketGain(Double marketGain) {
		this.marketGain = marketGain;
	}

	public List<StateTaxWithholding> getStateTaxWithholding() {
		return stateTaxWithholding;
	}

	public void setStateTaxWithholding(List<StateTaxWithholding> stateTaxWithholding) {
		this.stateTaxWithholding = stateTaxWithholding;
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
		result = prime * result + ((agriculturePayments == null) ? 0 : agriculturePayments.hashCode());
		result = prime * result + ((businessIncome == null) ? 0 : businessIncome.hashCode());
		result = prime * result + ((federalTaxWithheld == null) ? 0 : federalTaxWithheld.hashCode());
		result = prime * result + ((grants == null) ? 0 : grants.hashCode());
		result = prime * result + ((marketGain == null) ? 0 : marketGain.hashCode());
		result = prime * result + ((payerNameAddress == null) ? 0 : payerNameAddress.hashCode());
		result = prime * result + ((payerTin == null) ? 0 : payerTin.hashCode());
		result = prime * result + ((recipientNameAddress == null) ? 0 : recipientNameAddress.hashCode());
		result = prime * result + ((recipientTin == null) ? 0 : recipientTin.hashCode());
		result = prime * result + ((refundYear == null) ? 0 : refundYear.hashCode());
		result = prime * result + ((rtaaPayments == null) ? 0 : rtaaPayments.hashCode());
		result = prime * result + ((secondTinNotice == null) ? 0 : secondTinNotice.hashCode());
		result = prime * result + ((stateTaxWithholding == null) ? 0 : stateTaxWithholding.hashCode());
		result = prime * result + ((tax == null) ? 0 : tax.hashCode());
		result = prime * result + ((taxRefund == null) ? 0 : taxRefund.hashCode());
		result = prime * result + ((unemploymentCompensation == null) ? 0 : unemploymentCompensation.hashCode());
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
		Tax1099G other = (Tax1099G) obj;
		if (accountNumber == null) {
			if (other.accountNumber != null)
				return false;
		} else if (!accountNumber.equals(other.accountNumber))
			return false;
		if (agriculturePayments == null) {
			if (other.agriculturePayments != null)
				return false;
		} else if (!agriculturePayments.equals(other.agriculturePayments))
			return false;
		if (businessIncome == null) {
			if (other.businessIncome != null)
				return false;
		} else if (!businessIncome.equals(other.businessIncome))
			return false;
		if (federalTaxWithheld == null) {
			if (other.federalTaxWithheld != null)
				return false;
		} else if (!federalTaxWithheld.equals(other.federalTaxWithheld))
			return false;
		if (grants == null) {
			if (other.grants != null)
				return false;
		} else if (!grants.equals(other.grants))
			return false;
		if (marketGain == null) {
			if (other.marketGain != null)
				return false;
		} else if (!marketGain.equals(other.marketGain))
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
		if (refundYear == null) {
			if (other.refundYear != null)
				return false;
		} else if (!refundYear.equals(other.refundYear))
			return false;
		if (rtaaPayments == null) {
			if (other.rtaaPayments != null)
				return false;
		} else if (!rtaaPayments.equals(other.rtaaPayments))
			return false;
		if (secondTinNotice == null) {
			if (other.secondTinNotice != null)
				return false;
		} else if (!secondTinNotice.equals(other.secondTinNotice))
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
		if (taxRefund == null) {
			if (other.taxRefund != null)
				return false;
		} else if (!taxRefund.equals(other.taxRefund))
			return false;
		if (unemploymentCompensation == null) {
			if (other.unemploymentCompensation != null)
				return false;
		} else if (!unemploymentCompensation.equals(other.unemploymentCompensation))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tax1099G [tax=" + tax + ", payerNameAddress=" + payerNameAddress + ", payerTin=" + payerTin
				+ ", recipientTin=" + recipientTin + ", recipientNameAddress=" + recipientNameAddress
				+ ", accountNumber=" + accountNumber + ", unemploymentCompensation=" + unemploymentCompensation
				+ ", taxRefund=" + taxRefund + ", refundYear=" + refundYear + ", federalTaxWithheld="
				+ federalTaxWithheld + ", rtaaPayments=" + rtaaPayments + ", grants=" + grants
				+ ", agriculturePayments=" + agriculturePayments + ", businessIncome=" + businessIncome
				+ ", marketGain=" + marketGain + ", stateTaxWithholding=" + stateTaxWithholding + ", secondTinNotice="
				+ secondTinNotice + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(Tax1099G.class);

	public Tax1099G getTax1099G(int internalId) throws FDXException {
		try {
			
			template = ConnectionConfigApi46.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("internalId", internalId);
			Tax1099G tax1099G;
			try {
				tax1099G = template.queryForObject(
						"select * from "+ DeveloperContext.getDeveloperSchema() +".tax1099G where internalId in (:internalId)", parameters,
						new Tax1099GRowMapper());
			} catch (EmptyResultDataAccessException e) {
				throw new FDXException("Tax1099G not found", 0);
			}
//		payerNameAddress Start
			NameAddressPhone payerNameAddress = new NameAddressPhone();
			if (tax1099G.getPayerNameAddress() != null) {
				payerNameAddress = payerNameAddress
						.getNameAddressPhoneDetails(tax1099G.getPayerNameAddress().getNameAddressId());
				tax1099G.setPayerNameAddress(payerNameAddress);
			}
//		payerNameAddress End

//		recipientNameAddress Start
			NameAddress recipientNameAddress = new NameAddress();
			if (tax1099G.getRecipientNameAddress() != null) {
				recipientNameAddress = recipientNameAddress
						.getNameAddressDetails(tax1099G.getRecipientNameAddress().getNameAddressId());
				tax1099G.setRecipientNameAddress(recipientNameAddress);
			}
//		recipientNameAddress End

//		StateTaxWithholding Start
			List<StateTaxWithholding> stateTaxWithholdingList = tax1099G.getStateTaxWithholding();
			List<StateTaxWithholding> stateTaxWithholdingListNew = new ArrayList<>();
			if (tax1099G.getStateTaxWithholding() != null) {
				for (StateTaxWithholding stateTaxWithholdingIterator : stateTaxWithholdingList) {
					StateTaxWithholding stateTaxWithholding = stateTaxWithholdingIterator
							.getStateTaxWIthHolding(stateTaxWithholdingIterator.getStwithheldid());
					stateTaxWithholdingListNew.add(stateTaxWithholding);
				}
				tax1099G.setStateTaxWithholding(stateTaxWithholdingListNew);
			}
//		StateTaxWithholding End

			return tax1099G;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Tax1099G : ", e);
			throw new FDXException(e,500);
		}
	}
}
