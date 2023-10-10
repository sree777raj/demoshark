package com.fdx.api.model46.modelimpl;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fdx.api.model46.config.ConnectionConfigApi46;
import com.fdx.api.model46.mapper.Tax1099OidRowMapper;

import io.swagger.annotations.ApiModel;

/**
 * Original Issue Discount
 */
@ApiModel(description = "Original Issue Discount")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1099Oid {

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

	@JsonProperty("foreignAccountTaxCompliance")
	@JsonInclude(Include.NON_NULL)
	private Boolean foreignAccountTaxCompliance;

	@JsonProperty("accountNumber")
	private String accountNumber;

	@JsonProperty("originalIssueDiscount")
	private Double originalIssueDiscount;

	@JsonProperty("otherPeriodicInterest")
	private Double otherPeriodicInterest;

	@JsonProperty("earlyWithdrawalPenalty")
	private Double earlyWithdrawalPenalty;

	@JsonProperty("federalTaxWithheld")
	private Double federalTaxWithheld;

	@JsonProperty("marketDiscount")
	private Double marketDiscount;

	@JsonProperty("acquisitionPremium")
	private Double acquisitionPremium;

	@JsonProperty("oidDescription")
	private String oidDescription;

	@JsonProperty("discountOnTreasuryObligations")
	private Double discountOnTreasuryObligations;

	@JsonProperty("investmentExpenses")
	private Double investmentExpenses;

	@JsonProperty("bondPremium")
	private Double bondPremium;

	@JsonProperty("taxExemptOid")
	private Double taxExemptOid;

	@JsonProperty("stateTaxWithholding")
	@Valid
	private List<StateTaxWithholding> stateTaxWithholding = null;

	@JsonProperty("stateExemptOid")
	@Valid
	private List<DescriptionAmount> stateExemptOid = null;

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

	public Boolean getForeignAccountTaxCompliance() {
		return foreignAccountTaxCompliance;
	}

	public void setForeignAccountTaxCompliance(Boolean foreignAccountTaxCompliance) {
		this.foreignAccountTaxCompliance = foreignAccountTaxCompliance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Double getOriginalIssueDiscount() {
		return originalIssueDiscount;
	}

	public void setOriginalIssueDiscount(Double originalIssueDiscount) {
		this.originalIssueDiscount = originalIssueDiscount;
	}

	public Double getOtherPeriodicInterest() {
		return otherPeriodicInterest;
	}

	public void setOtherPeriodicInterest(Double otherPeriodicInterest) {
		this.otherPeriodicInterest = otherPeriodicInterest;
	}

	public Double getEarlyWithdrawalPenalty() {
		return earlyWithdrawalPenalty;
	}

	public void setEarlyWithdrawalPenalty(Double earlyWithdrawalPenalty) {
		this.earlyWithdrawalPenalty = earlyWithdrawalPenalty;
	}

	public Double getFederalTaxWithheld() {
		return federalTaxWithheld;
	}

	public void setFederalTaxWithheld(Double federalTaxWithheld) {
		this.federalTaxWithheld = federalTaxWithheld;
	}

	public Double getMarketDiscount() {
		return marketDiscount;
	}

	public void setMarketDiscount(Double marketDiscount) {
		this.marketDiscount = marketDiscount;
	}

	public Double getAcquisitionPremium() {
		return acquisitionPremium;
	}

	public void setAcquisitionPremium(Double acquisitionPremium) {
		this.acquisitionPremium = acquisitionPremium;
	}

	public String getOidDescription() {
		return oidDescription;
	}

	public void setOidDescription(String oidDescription) {
		this.oidDescription = oidDescription;
	}

	public Double getDiscountOnTreasuryObligations() {
		return discountOnTreasuryObligations;
	}

	public void setDiscountOnTreasuryObligations(Double discountOnTreasuryObligations) {
		this.discountOnTreasuryObligations = discountOnTreasuryObligations;
	}

	public Double getInvestmentExpenses() {
		return investmentExpenses;
	}

	public void setInvestmentExpenses(Double investmentExpenses) {
		this.investmentExpenses = investmentExpenses;
	}

	public Double getBondPremium() {
		return bondPremium;
	}

	public void setBondPremium(Double bondPremium) {
		this.bondPremium = bondPremium;
	}

	public Double getTaxExemptOid() {
		return taxExemptOid;
	}

	public void setTaxExemptOid(Double taxExemptOid) {
		this.taxExemptOid = taxExemptOid;
	}

	public List<StateTaxWithholding> getStateTaxWithholding() {
		return stateTaxWithholding;
	}

	public void setStateTaxWithholding(List<StateTaxWithholding> stateTaxWithholding) {
		this.stateTaxWithholding = stateTaxWithholding;
	}

	public List<DescriptionAmount> getStateExemptOid() {
		return stateExemptOid;
	}

	public void setStateExemptOid(List<DescriptionAmount> stateExemptOid) {
		this.stateExemptOid = stateExemptOid;
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
		result = prime * result + ((acquisitionPremium == null) ? 0 : acquisitionPremium.hashCode());
		result = prime * result + ((bondPremium == null) ? 0 : bondPremium.hashCode());
		result = prime * result
				+ ((discountOnTreasuryObligations == null) ? 0 : discountOnTreasuryObligations.hashCode());
		result = prime * result + ((earlyWithdrawalPenalty == null) ? 0 : earlyWithdrawalPenalty.hashCode());
		result = prime * result + ((federalTaxWithheld == null) ? 0 : federalTaxWithheld.hashCode());
		result = prime * result + ((foreignAccountTaxCompliance == null) ? 0 : foreignAccountTaxCompliance.hashCode());
		result = prime * result + ((investmentExpenses == null) ? 0 : investmentExpenses.hashCode());
		result = prime * result + ((marketDiscount == null) ? 0 : marketDiscount.hashCode());
		result = prime * result + ((oidDescription == null) ? 0 : oidDescription.hashCode());
		result = prime * result + ((originalIssueDiscount == null) ? 0 : originalIssueDiscount.hashCode());
		result = prime * result + ((otherPeriodicInterest == null) ? 0 : otherPeriodicInterest.hashCode());
		result = prime * result + ((payerNameAddress == null) ? 0 : payerNameAddress.hashCode());
		result = prime * result + ((payerTin == null) ? 0 : payerTin.hashCode());
		result = prime * result + ((recipientNameAddress == null) ? 0 : recipientNameAddress.hashCode());
		result = prime * result + ((recipientTin == null) ? 0 : recipientTin.hashCode());
		result = prime * result + ((secondTinNotice == null) ? 0 : secondTinNotice.hashCode());
		result = prime * result + ((stateExemptOid == null) ? 0 : stateExemptOid.hashCode());
		result = prime * result + ((stateTaxWithholding == null) ? 0 : stateTaxWithholding.hashCode());
		result = prime * result + ((tax == null) ? 0 : tax.hashCode());
		result = prime * result + ((taxExemptOid == null) ? 0 : taxExemptOid.hashCode());
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
		Tax1099Oid other = (Tax1099Oid) obj;
		if (accountNumber == null) {
			if (other.accountNumber != null)
				return false;
		} else if (!accountNumber.equals(other.accountNumber))
			return false;
		if (acquisitionPremium == null) {
			if (other.acquisitionPremium != null)
				return false;
		} else if (!acquisitionPremium.equals(other.acquisitionPremium))
			return false;
		if (bondPremium == null) {
			if (other.bondPremium != null)
				return false;
		} else if (!bondPremium.equals(other.bondPremium))
			return false;
		if (discountOnTreasuryObligations == null) {
			if (other.discountOnTreasuryObligations != null)
				return false;
		} else if (!discountOnTreasuryObligations.equals(other.discountOnTreasuryObligations))
			return false;
		if (earlyWithdrawalPenalty == null) {
			if (other.earlyWithdrawalPenalty != null)
				return false;
		} else if (!earlyWithdrawalPenalty.equals(other.earlyWithdrawalPenalty))
			return false;
		if (federalTaxWithheld == null) {
			if (other.federalTaxWithheld != null)
				return false;
		} else if (!federalTaxWithheld.equals(other.federalTaxWithheld))
			return false;
		if (foreignAccountTaxCompliance == null) {
			if (other.foreignAccountTaxCompliance != null)
				return false;
		} else if (!foreignAccountTaxCompliance.equals(other.foreignAccountTaxCompliance))
			return false;
		if (investmentExpenses == null) {
			if (other.investmentExpenses != null)
				return false;
		} else if (!investmentExpenses.equals(other.investmentExpenses))
			return false;
		if (marketDiscount == null) {
			if (other.marketDiscount != null)
				return false;
		} else if (!marketDiscount.equals(other.marketDiscount))
			return false;
		if (oidDescription == null) {
			if (other.oidDescription != null)
				return false;
		} else if (!oidDescription.equals(other.oidDescription))
			return false;
		if (originalIssueDiscount == null) {
			if (other.originalIssueDiscount != null)
				return false;
		} else if (!originalIssueDiscount.equals(other.originalIssueDiscount))
			return false;
		if (otherPeriodicInterest == null) {
			if (other.otherPeriodicInterest != null)
				return false;
		} else if (!otherPeriodicInterest.equals(other.otherPeriodicInterest))
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
		if (secondTinNotice == null) {
			if (other.secondTinNotice != null)
				return false;
		} else if (!secondTinNotice.equals(other.secondTinNotice))
			return false;
		if (stateExemptOid == null) {
			if (other.stateExemptOid != null)
				return false;
		} else if (!stateExemptOid.equals(other.stateExemptOid))
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
		if (taxExemptOid == null) {
			if (other.taxExemptOid != null)
				return false;
		} else if (!taxExemptOid.equals(other.taxExemptOid))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tax1099Oid [tax=" + tax + ", payerNameAddress=" + payerNameAddress + ", payerTin=" + payerTin
				+ ", recipientTin=" + recipientTin + ", recipientNameAddress=" + recipientNameAddress
				+ ", foreignAccountTaxCompliance=" + foreignAccountTaxCompliance + ", accountNumber=" + accountNumber
				+ ", originalIssueDiscount=" + originalIssueDiscount + ", otherPeriodicInterest="
				+ otherPeriodicInterest + ", earlyWithdrawalPenalty=" + earlyWithdrawalPenalty + ", federalTaxWithheld="
				+ federalTaxWithheld + ", marketDiscount=" + marketDiscount + ", acquisitionPremium="
				+ acquisitionPremium + ", oidDescription=" + oidDescription + ", discountOnTreasuryObligations="
				+ discountOnTreasuryObligations + ", investmentExpenses=" + investmentExpenses + ", bondPremium="
				+ bondPremium + ", taxExemptOid=" + taxExemptOid + ", stateTaxWithholding=" + stateTaxWithholding
				+ ", stateExemptOid=" + stateExemptOid + ", secondTinNotice=" + secondTinNotice + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(Tax1099Oid.class);

	public Tax1099Oid getTax1099Oid(int internalId) throws FDXException {
		try {
			
			template = ConnectionConfigApi46.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("internalId", internalId);

			Tax1099Oid tax1099Oid = template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".Tax1099Oid where internalId in (:internalId)", parameters,
					new Tax1099OidRowMapper());

//			payerNameAddress Start
			NameAddressPhone payerNameAddress = new NameAddressPhone();
			if (tax1099Oid.getPayerNameAddress() != null) {
				payerNameAddress = payerNameAddress
						.getNameAddressPhoneDetails(tax1099Oid.getPayerNameAddress().getNameAddressId());
				tax1099Oid.setPayerNameAddress(payerNameAddress);
			}
//			payerNameAddress End

//			recipientNameAddress Start
			NameAddress recipientNameAddress = new NameAddress();
			if (tax1099Oid.getRecipientNameAddress() != null) {
				recipientNameAddress = recipientNameAddress
						.getNameAddressDetails(tax1099Oid.getRecipientNameAddress().getNameAddressId());
				tax1099Oid.setRecipientNameAddress(recipientNameAddress);
			}
//			recipientNameAddress End

//				StateTaxWithholding Start
			List<StateTaxWithholding> stateTaxWithholdingList = tax1099Oid.getStateTaxWithholding();
			List<StateTaxWithholding> stateTaxWithholdingListNew = new ArrayList<>();
			if (tax1099Oid.getStateTaxWithholding() != null) {
				for (StateTaxWithholding stateTaxWithholdingIterator : stateTaxWithholdingList) {
					StateTaxWithholding stateTaxWithholding = stateTaxWithholdingIterator
							.getStateTaxWIthHolding(stateTaxWithholdingIterator.getStwithheldid());
					stateTaxWithholdingListNew.add(stateTaxWithholding);
				}
				tax1099Oid.setStateTaxWithholding(stateTaxWithholdingListNew);
			}

//				StateTaxWithholding End

//				stateTaxExemptIncomes Start
			List<DescriptionAmount> stateTaxExemptIncomesList = tax1099Oid.getStateExemptOid();
			List<DescriptionAmount> stateTaxExemptIncomesListNew = new ArrayList<>();
			if (tax1099Oid.getStateExemptOid() != null) {
				for (DescriptionAmount descriptionAmountIterator : stateTaxExemptIncomesList) {
					DescriptionAmount descriptionAmount = descriptionAmountIterator
							.getDescriptionAmount(descriptionAmountIterator.getDescAmountId());
					stateTaxExemptIncomesListNew.add(descriptionAmount);
				}
				tax1099Oid.setStateExemptOid(stateTaxExemptIncomesListNew);
			}
//				stateTaxExemptIncomes End

			return tax1099Oid;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Tax1099Oid : ", e);
			throw new FDXException(e,500);
		}
	}

}
