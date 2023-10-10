package com.fdx.api.model51.modelimpl;

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
import com.fdx.api.model51.mapper.Tax1099PatrRowMapper;

import io.swagger.annotations.ApiModel;

/**
 * Taxable Distributions Received From Cooperatives
 */
@ApiModel(description = "Taxable Distributions Received From Cooperatives")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1099Patr {

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

	@JsonProperty("patronageDividends")
	private Double patronageDividends;

	@JsonProperty("nonpatronageDistributions")
	private Double nonpatronageDistributions;

	@JsonProperty("perUnitRetainAllocations")
	private Double perUnitRetainAllocations;

	@JsonProperty("federalTaxWithheld")
	private Double federalTaxWithheld;

	@JsonProperty("redemption")
	private Double redemption;

	@JsonProperty("dpaDeduction")
	private Double dpaDeduction;

	@JsonProperty("section199Deduction")
	private Double section199Deduction;

	@JsonProperty("qualifiedPayments")
	private Double qualifiedPayments;

	@JsonProperty("section199QualifiedItems")
	private Double section199QualifiedItems;

	@JsonProperty("section199SstbItems")
	private Double section199SstbItems;

	@JsonProperty("investmentCredit")
	private Double investmentCredit;

	@JsonProperty("workOpportunityCredit")
	private Double workOpportunityCredit;

	@JsonProperty("patronsAmtAdjustment")
	private Double patronsAmtAdjustment;

	@JsonProperty("otherCreditsAndDeductions")
	private Double otherCreditsAndDeductions;

	@JsonProperty("specifiedCoop")
	@JsonInclude(Include.NON_NULL)
	private Boolean specifiedCoop;

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

	public Double getPatronageDividends() {
		return patronageDividends;
	}

	public void setPatronageDividends(Double patronageDividends) {
		this.patronageDividends = patronageDividends;
	}

	public Double getNonpatronageDistributions() {
		return nonpatronageDistributions;
	}

	public void setNonpatronageDistributions(Double nonpatronageDistributions) {
		this.nonpatronageDistributions = nonpatronageDistributions;
	}

	public Double getPerUnitRetainAllocations() {
		return perUnitRetainAllocations;
	}

	public void setPerUnitRetainAllocations(Double perUnitRetainAllocations) {
		this.perUnitRetainAllocations = perUnitRetainAllocations;
	}

	public Double getFederalTaxWithheld() {
		return federalTaxWithheld;
	}

	public void setFederalTaxWithheld(Double federalTaxWithheld) {
		this.federalTaxWithheld = federalTaxWithheld;
	}

	public Double getRedemption() {
		return redemption;
	}

	public void setRedemption(Double redemption) {
		this.redemption = redemption;
	}

	public Double getDpaDeduction() {
		return dpaDeduction;
	}

	public void setDpaDeduction(Double dpaDeduction) {
		this.dpaDeduction = dpaDeduction;
	}

	public Double getSection199Deduction() {
		return section199Deduction;
	}

	public void setSection199Deduction(Double section199Deduction) {
		this.section199Deduction = section199Deduction;
	}

	public Double getQualifiedPayments() {
		return qualifiedPayments;
	}

	public void setQualifiedPayments(Double qualifiedPayments) {
		this.qualifiedPayments = qualifiedPayments;
	}

	public Double getSection199QualifiedItems() {
		return section199QualifiedItems;
	}

	public void setSection199QualifiedItems(Double section199QualifiedItems) {
		this.section199QualifiedItems = section199QualifiedItems;
	}

	public Double getSection199SstbItems() {
		return section199SstbItems;
	}

	public void setSection199SstbItems(Double section199SstbItems) {
		this.section199SstbItems = section199SstbItems;
	}

	public Double getInvestmentCredit() {
		return investmentCredit;
	}

	public void setInvestmentCredit(Double investmentCredit) {
		this.investmentCredit = investmentCredit;
	}

	public Double getWorkOpportunityCredit() {
		return workOpportunityCredit;
	}

	public void setWorkOpportunityCredit(Double workOpportunityCredit) {
		this.workOpportunityCredit = workOpportunityCredit;
	}

	public Double getPatronsAmtAdjustment() {
		return patronsAmtAdjustment;
	}

	public void setPatronsAmtAdjustment(Double patronsAmtAdjustment) {
		this.patronsAmtAdjustment = patronsAmtAdjustment;
	}

	public Double getOtherCreditsAndDeductions() {
		return otherCreditsAndDeductions;
	}

	public void setOtherCreditsAndDeductions(Double otherCreditsAndDeductions) {
		this.otherCreditsAndDeductions = otherCreditsAndDeductions;
	}

	public Boolean getSpecifiedCoop() {
		return specifiedCoop;
	}

	public void setSpecifiedCoop(Boolean specifiedCoop) {
		this.specifiedCoop = specifiedCoop;
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
		result = prime * result + ((dpaDeduction == null) ? 0 : dpaDeduction.hashCode());
		result = prime * result + ((federalTaxWithheld == null) ? 0 : federalTaxWithheld.hashCode());
		result = prime * result + ((investmentCredit == null) ? 0 : investmentCredit.hashCode());
		result = prime * result + ((nonpatronageDistributions == null) ? 0 : nonpatronageDistributions.hashCode());
		result = prime * result + ((otherCreditsAndDeductions == null) ? 0 : otherCreditsAndDeductions.hashCode());
		result = prime * result + ((patronageDividends == null) ? 0 : patronageDividends.hashCode());
		result = prime * result + ((patronsAmtAdjustment == null) ? 0 : patronsAmtAdjustment.hashCode());
		result = prime * result + ((payerNameAddress == null) ? 0 : payerNameAddress.hashCode());
		result = prime * result + ((payerTin == null) ? 0 : payerTin.hashCode());
		result = prime * result + ((perUnitRetainAllocations == null) ? 0 : perUnitRetainAllocations.hashCode());
		result = prime * result + ((qualifiedPayments == null) ? 0 : qualifiedPayments.hashCode());
		result = prime * result + ((recipientNameAddress == null) ? 0 : recipientNameAddress.hashCode());
		result = prime * result + ((recipientTin == null) ? 0 : recipientTin.hashCode());
		result = prime * result + ((redemption == null) ? 0 : redemption.hashCode());
		result = prime * result + ((secondTinNotice == null) ? 0 : secondTinNotice.hashCode());
		result = prime * result + ((section199Deduction == null) ? 0 : section199Deduction.hashCode());
		result = prime * result + ((section199QualifiedItems == null) ? 0 : section199QualifiedItems.hashCode());
		result = prime * result + ((section199SstbItems == null) ? 0 : section199SstbItems.hashCode());
		result = prime * result + ((specifiedCoop == null) ? 0 : specifiedCoop.hashCode());
		result = prime * result + ((tax == null) ? 0 : tax.hashCode());
		result = prime * result + ((workOpportunityCredit == null) ? 0 : workOpportunityCredit.hashCode());
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
		Tax1099Patr other = (Tax1099Patr) obj;
		if (accountNumber == null) {
			if (other.accountNumber != null)
				return false;
		} else if (!accountNumber.equals(other.accountNumber))
			return false;
		if (dpaDeduction == null) {
			if (other.dpaDeduction != null)
				return false;
		} else if (!dpaDeduction.equals(other.dpaDeduction))
			return false;
		if (federalTaxWithheld == null) {
			if (other.federalTaxWithheld != null)
				return false;
		} else if (!federalTaxWithheld.equals(other.federalTaxWithheld))
			return false;
		if (investmentCredit == null) {
			if (other.investmentCredit != null)
				return false;
		} else if (!investmentCredit.equals(other.investmentCredit))
			return false;
		if (nonpatronageDistributions == null) {
			if (other.nonpatronageDistributions != null)
				return false;
		} else if (!nonpatronageDistributions.equals(other.nonpatronageDistributions))
			return false;
		if (otherCreditsAndDeductions == null) {
			if (other.otherCreditsAndDeductions != null)
				return false;
		} else if (!otherCreditsAndDeductions.equals(other.otherCreditsAndDeductions))
			return false;
		if (patronageDividends == null) {
			if (other.patronageDividends != null)
				return false;
		} else if (!patronageDividends.equals(other.patronageDividends))
			return false;
		if (patronsAmtAdjustment == null) {
			if (other.patronsAmtAdjustment != null)
				return false;
		} else if (!patronsAmtAdjustment.equals(other.patronsAmtAdjustment))
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
		if (perUnitRetainAllocations == null) {
			if (other.perUnitRetainAllocations != null)
				return false;
		} else if (!perUnitRetainAllocations.equals(other.perUnitRetainAllocations))
			return false;
		if (qualifiedPayments == null) {
			if (other.qualifiedPayments != null)
				return false;
		} else if (!qualifiedPayments.equals(other.qualifiedPayments))
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
		if (redemption == null) {
			if (other.redemption != null)
				return false;
		} else if (!redemption.equals(other.redemption))
			return false;
		if (secondTinNotice == null) {
			if (other.secondTinNotice != null)
				return false;
		} else if (!secondTinNotice.equals(other.secondTinNotice))
			return false;
		if (section199Deduction == null) {
			if (other.section199Deduction != null)
				return false;
		} else if (!section199Deduction.equals(other.section199Deduction))
			return false;
		if (section199QualifiedItems == null) {
			if (other.section199QualifiedItems != null)
				return false;
		} else if (!section199QualifiedItems.equals(other.section199QualifiedItems))
			return false;
		if (section199SstbItems == null) {
			if (other.section199SstbItems != null)
				return false;
		} else if (!section199SstbItems.equals(other.section199SstbItems))
			return false;
		if (specifiedCoop == null) {
			if (other.specifiedCoop != null)
				return false;
		} else if (!specifiedCoop.equals(other.specifiedCoop))
			return false;
		if (tax == null) {
			if (other.tax != null)
				return false;
		} else if (!tax.equals(other.tax))
			return false;
		if (workOpportunityCredit == null) {
			if (other.workOpportunityCredit != null)
				return false;
		} else if (!workOpportunityCredit.equals(other.workOpportunityCredit))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tax1099Patr [tax=" + tax + ", payerNameAddress=" + payerNameAddress + ", payerTin=" + payerTin
				+ ", recipientTin=" + recipientTin + ", recipientNameAddress=" + recipientNameAddress
				+ ", accountNumber=" + accountNumber + ", patronageDividends=" + patronageDividends
				+ ", nonpatronageDistributions=" + nonpatronageDistributions + ", perUnitRetainAllocations="
				+ perUnitRetainAllocations + ", federalTaxWithheld=" + federalTaxWithheld + ", redemption=" + redemption
				+ ", dpaDeduction=" + dpaDeduction + ", section199Deduction=" + section199Deduction
				+ ", qualifiedPayments=" + qualifiedPayments + ", section199QualifiedItems=" + section199QualifiedItems
				+ ", section199SstbItems=" + section199SstbItems + ", investmentCredit=" + investmentCredit
				+ ", workOpportunityCredit=" + workOpportunityCredit + ", patronsAmtAdjustment=" + patronsAmtAdjustment
				+ ", otherCreditsAndDeductions=" + otherCreditsAndDeductions + ", specifiedCoop=" + specifiedCoop
				+ ", secondTinNotice=" + secondTinNotice + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(Tax1099Patr.class);

	public Tax1099Patr getTax1099Patr(int internalId) throws FDXException {
		try {
			template = ConnectionConfigApi51.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("internalId", internalId);
			Tax1099Patr tax1099Patr;
			try {
				tax1099Patr = template.queryForObject(
						"select * from "+ DeveloperContext.getDeveloperSchema() +".Tax1099Patr where internalId in (:internalId)", parameters,
						new Tax1099PatrRowMapper());
			} catch (EmptyResultDataAccessException e) {
				throw new FDXException("Tax1099Patr not found", 0);
			}
//			payerNameAddress Start
			NameAddressPhone payerNameAddress = new NameAddressPhone();
			if (tax1099Patr.getPayerNameAddress() != null) {
				payerNameAddress = payerNameAddress
						.getNameAddressPhoneDetails(tax1099Patr.getPayerNameAddress().getNameAddressId());
				tax1099Patr.setPayerNameAddress(payerNameAddress);
			}
//			payerNameAddress End

//			recipientNameAddress Start
			NameAddress recipientNameAddress = new NameAddress();
			if (tax1099Patr.getRecipientNameAddress() != null) {
				recipientNameAddress = recipientNameAddress
						.getNameAddressDetails(tax1099Patr.getRecipientNameAddress().getNameAddressId());
				tax1099Patr.setRecipientNameAddress(recipientNameAddress);
			}
//			recipientNameAddress End

			return tax1099Patr;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Tax1099Patr : ", e);
			throw new FDXException(e,500);
		}
	}

}
