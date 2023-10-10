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
import com.fdx.api.model51.mapper.Tax1099DivRowMapper;

import io.swagger.annotations.ApiModel;

/**
 * Dividends and Distributions
 */
@ApiModel(description = "Dividends and Distributions")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1099Div {

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

	@JsonProperty("ordinaryDividends")
	private Double ordinaryDividends;

	@JsonProperty("qualifiedDividends")
	private Double qualifiedDividends;

	@JsonProperty("totalCapitalGain")
	private Double totalCapitalGain;

	@JsonProperty("unrecaptured1250Gain")
	private Double unrecaptured1250Gain;

	@JsonProperty("section1202Gain")
	private Double section1202Gain;

	@JsonProperty("collectiblesGain")
	private Double collectiblesGain;

	@JsonProperty("nonTaxableDistribution")
	private Double nonTaxableDistribution;

	@JsonProperty("federalTaxWithheld")
	private Double federalTaxWithheld;

	@JsonProperty("section199ADividends")
	private Double section199ADividends;

	@JsonProperty("investmentExpenses")
	private Double investmentExpenses;

	@JsonProperty("foreignTaxPaid")
	private Double foreignTaxPaid;

	@JsonProperty("foreignCountry")
	private String foreignCountry;

	@JsonProperty("cashLiquidation")
	private Double cashLiquidation;

	@JsonProperty("nonCashLiquidation")
	private Double nonCashLiquidation;

	@JsonProperty("taxExemptInterestDividend")
	private Double taxExemptInterestDividend;

	@JsonProperty("specifiedPabInterestDividend")
	private Double specifiedPabInterestDividend;

	@JsonProperty("stateTaxWithholding")
	@Valid
	private List<StateTaxWithholding> stateTaxWithholding = null;

	@JsonProperty("foreignIncomes")
	@Valid
	private List<DescriptionAmount> foreignIncomes = null;

	@JsonProperty("stateTaxExemptIncomes")
	@Valid
	private List<DescriptionAmount> stateTaxExemptIncomes = null;

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

	public Double getOrdinaryDividends() {
		return ordinaryDividends;
	}

	public void setOrdinaryDividends(Double ordinaryDividends) {
		this.ordinaryDividends = ordinaryDividends;
	}

	public Double getQualifiedDividends() {
		return qualifiedDividends;
	}

	public void setQualifiedDividends(Double qualifiedDividends) {
		this.qualifiedDividends = qualifiedDividends;
	}

	public Double getTotalCapitalGain() {
		return totalCapitalGain;
	}

	public void setTotalCapitalGain(Double totalCapitalGain) {
		this.totalCapitalGain = totalCapitalGain;
	}

	public Double getUnrecaptured1250Gain() {
		return unrecaptured1250Gain;
	}

	public void setUnrecaptured1250Gain(Double unrecaptured1250Gain) {
		this.unrecaptured1250Gain = unrecaptured1250Gain;
	}

	public Double getSection1202Gain() {
		return section1202Gain;
	}

	public void setSection1202Gain(Double section1202Gain) {
		this.section1202Gain = section1202Gain;
	}

	public Double getCollectiblesGain() {
		return collectiblesGain;
	}

	public void setCollectiblesGain(Double collectiblesGain) {
		this.collectiblesGain = collectiblesGain;
	}

	public Double getNonTaxableDistribution() {
		return nonTaxableDistribution;
	}

	public void setNonTaxableDistribution(Double nonTaxableDistribution) {
		this.nonTaxableDistribution = nonTaxableDistribution;
	}

	public Double getFederalTaxWithheld() {
		return federalTaxWithheld;
	}

	public void setFederalTaxWithheld(Double federalTaxWithheld) {
		this.federalTaxWithheld = federalTaxWithheld;
	}

	public Double getSection199ADividends() {
		return section199ADividends;
	}

	public void setSection199ADividends(Double section199aDividends) {
		section199ADividends = section199aDividends;
	}

	public Double getInvestmentExpenses() {
		return investmentExpenses;
	}

	public void setInvestmentExpenses(Double investmentExpenses) {
		this.investmentExpenses = investmentExpenses;
	}

	public Double getForeignTaxPaid() {
		return foreignTaxPaid;
	}

	public void setForeignTaxPaid(Double foreignTaxPaid) {
		this.foreignTaxPaid = foreignTaxPaid;
	}

	public String getForeignCountry() {
		return foreignCountry;
	}

	public void setForeignCountry(String foreignCountry) {
		this.foreignCountry = foreignCountry;
	}

	public Double getCashLiquidation() {
		return cashLiquidation;
	}

	public void setCashLiquidation(Double cashLiquidation) {
		this.cashLiquidation = cashLiquidation;
	}

	public Double getNonCashLiquidation() {
		return nonCashLiquidation;
	}

	public void setNonCashLiquidation(Double nonCashLiquidation) {
		this.nonCashLiquidation = nonCashLiquidation;
	}

	public Double getTaxExemptInterestDividend() {
		return taxExemptInterestDividend;
	}

	public void setTaxExemptInterestDividend(Double taxExemptInterestDividend) {
		this.taxExemptInterestDividend = taxExemptInterestDividend;
	}

	public Double getSpecifiedPabInterestDividend() {
		return specifiedPabInterestDividend;
	}

	public void setSpecifiedPabInterestDividend(Double specifiedPabInterestDividend) {
		this.specifiedPabInterestDividend = specifiedPabInterestDividend;
	}

	public List<StateTaxWithholding> getStateTaxWithholding() {
		return stateTaxWithholding;
	}

	public void setStateTaxWithholding(List<StateTaxWithholding> stateTaxWithholding) {
		this.stateTaxWithholding = stateTaxWithholding;
	}

	public List<DescriptionAmount> getForeignIncomes() {
		return foreignIncomes;
	}

	public void setForeignIncomes(List<DescriptionAmount> foreignIncomes) {
		this.foreignIncomes = foreignIncomes;
	}

	public List<DescriptionAmount> getStateTaxExemptIncomes() {
		return stateTaxExemptIncomes;
	}

	public void setStateTaxExemptIncomes(List<DescriptionAmount> stateTaxExemptIncomes) {
		this.stateTaxExemptIncomes = stateTaxExemptIncomes;
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
		result = prime * result + ((cashLiquidation == null) ? 0 : cashLiquidation.hashCode());
		result = prime * result + ((collectiblesGain == null) ? 0 : collectiblesGain.hashCode());
		result = prime * result + ((federalTaxWithheld == null) ? 0 : federalTaxWithheld.hashCode());
		result = prime * result + ((foreignAccountTaxCompliance == null) ? 0 : foreignAccountTaxCompliance.hashCode());
		result = prime * result + ((foreignCountry == null) ? 0 : foreignCountry.hashCode());
		result = prime * result + ((foreignIncomes == null) ? 0 : foreignIncomes.hashCode());
		result = prime * result + ((foreignTaxPaid == null) ? 0 : foreignTaxPaid.hashCode());
		result = prime * result + ((investmentExpenses == null) ? 0 : investmentExpenses.hashCode());
		result = prime * result + ((nonCashLiquidation == null) ? 0 : nonCashLiquidation.hashCode());
		result = prime * result + ((nonTaxableDistribution == null) ? 0 : nonTaxableDistribution.hashCode());
		result = prime * result + ((ordinaryDividends == null) ? 0 : ordinaryDividends.hashCode());
		result = prime * result + ((payerNameAddress == null) ? 0 : payerNameAddress.hashCode());
		result = prime * result + ((payerTin == null) ? 0 : payerTin.hashCode());
		result = prime * result + ((qualifiedDividends == null) ? 0 : qualifiedDividends.hashCode());
		result = prime * result + ((recipientNameAddress == null) ? 0 : recipientNameAddress.hashCode());
		result = prime * result + ((recipientTin == null) ? 0 : recipientTin.hashCode());
		result = prime * result + ((secondTinNotice == null) ? 0 : secondTinNotice.hashCode());
		result = prime * result + ((section1202Gain == null) ? 0 : section1202Gain.hashCode());
		result = prime * result + ((section199ADividends == null) ? 0 : section199ADividends.hashCode());
		result = prime * result
				+ ((specifiedPabInterestDividend == null) ? 0 : specifiedPabInterestDividend.hashCode());
		result = prime * result + ((stateTaxExemptIncomes == null) ? 0 : stateTaxExemptIncomes.hashCode());
		result = prime * result + ((stateTaxWithholding == null) ? 0 : stateTaxWithholding.hashCode());
		result = prime * result + ((tax == null) ? 0 : tax.hashCode());
		result = prime * result + ((taxExemptInterestDividend == null) ? 0 : taxExemptInterestDividend.hashCode());
		result = prime * result + ((totalCapitalGain == null) ? 0 : totalCapitalGain.hashCode());
		result = prime * result + ((unrecaptured1250Gain == null) ? 0 : unrecaptured1250Gain.hashCode());
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
		Tax1099Div other = (Tax1099Div) obj;
		if (accountNumber == null) {
			if (other.accountNumber != null)
				return false;
		} else if (!accountNumber.equals(other.accountNumber))
			return false;
		if (cashLiquidation == null) {
			if (other.cashLiquidation != null)
				return false;
		} else if (!cashLiquidation.equals(other.cashLiquidation))
			return false;
		if (collectiblesGain == null) {
			if (other.collectiblesGain != null)
				return false;
		} else if (!collectiblesGain.equals(other.collectiblesGain))
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
		if (foreignCountry == null) {
			if (other.foreignCountry != null)
				return false;
		} else if (!foreignCountry.equals(other.foreignCountry))
			return false;
		if (foreignIncomes == null) {
			if (other.foreignIncomes != null)
				return false;
		} else if (!foreignIncomes.equals(other.foreignIncomes))
			return false;
		if (foreignTaxPaid == null) {
			if (other.foreignTaxPaid != null)
				return false;
		} else if (!foreignTaxPaid.equals(other.foreignTaxPaid))
			return false;
		if (investmentExpenses == null) {
			if (other.investmentExpenses != null)
				return false;
		} else if (!investmentExpenses.equals(other.investmentExpenses))
			return false;
		if (nonCashLiquidation == null) {
			if (other.nonCashLiquidation != null)
				return false;
		} else if (!nonCashLiquidation.equals(other.nonCashLiquidation))
			return false;
		if (nonTaxableDistribution == null) {
			if (other.nonTaxableDistribution != null)
				return false;
		} else if (!nonTaxableDistribution.equals(other.nonTaxableDistribution))
			return false;
		if (ordinaryDividends == null) {
			if (other.ordinaryDividends != null)
				return false;
		} else if (!ordinaryDividends.equals(other.ordinaryDividends))
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
		if (qualifiedDividends == null) {
			if (other.qualifiedDividends != null)
				return false;
		} else if (!qualifiedDividends.equals(other.qualifiedDividends))
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
		if (section1202Gain == null) {
			if (other.section1202Gain != null)
				return false;
		} else if (!section1202Gain.equals(other.section1202Gain))
			return false;
		if (section199ADividends == null) {
			if (other.section199ADividends != null)
				return false;
		} else if (!section199ADividends.equals(other.section199ADividends))
			return false;
		if (specifiedPabInterestDividend == null) {
			if (other.specifiedPabInterestDividend != null)
				return false;
		} else if (!specifiedPabInterestDividend.equals(other.specifiedPabInterestDividend))
			return false;
		if (stateTaxExemptIncomes == null) {
			if (other.stateTaxExemptIncomes != null)
				return false;
		} else if (!stateTaxExemptIncomes.equals(other.stateTaxExemptIncomes))
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
		if (taxExemptInterestDividend == null) {
			if (other.taxExemptInterestDividend != null)
				return false;
		} else if (!taxExemptInterestDividend.equals(other.taxExemptInterestDividend))
			return false;
		if (totalCapitalGain == null) {
			if (other.totalCapitalGain != null)
				return false;
		} else if (!totalCapitalGain.equals(other.totalCapitalGain))
			return false;
		if (unrecaptured1250Gain == null) {
			if (other.unrecaptured1250Gain != null)
				return false;
		} else if (!unrecaptured1250Gain.equals(other.unrecaptured1250Gain))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tax1099Div [tax=" + tax + ", payerNameAddress=" + payerNameAddress + ", payerTin=" + payerTin
				+ ", recipientTin=" + recipientTin + ", recipientNameAddress=" + recipientNameAddress
				+ ", foreignAccountTaxCompliance=" + foreignAccountTaxCompliance + ", accountNumber=" + accountNumber
				+ ", ordinaryDividends=" + ordinaryDividends + ", qualifiedDividends=" + qualifiedDividends
				+ ", totalCapitalGain=" + totalCapitalGain + ", unrecaptured1250Gain=" + unrecaptured1250Gain
				+ ", section1202Gain=" + section1202Gain + ", collectiblesGain=" + collectiblesGain
				+ ", nonTaxableDistribution=" + nonTaxableDistribution + ", federalTaxWithheld=" + federalTaxWithheld
				+ ", section199ADividends=" + section199ADividends + ", investmentExpenses=" + investmentExpenses
				+ ", foreignTaxPaid=" + foreignTaxPaid + ", foreignCountry=" + foreignCountry + ", cashLiquidation="
				+ cashLiquidation + ", nonCashLiquidation=" + nonCashLiquidation + ", taxExemptInterestDividend="
				+ taxExemptInterestDividend + ", specifiedPabInterestDividend=" + specifiedPabInterestDividend
				+ ", stateTaxWithholding=" + stateTaxWithholding + ", foreignIncomes=" + foreignIncomes
				+ ", stateTaxExemptIncomes=" + stateTaxExemptIncomes + ", secondTinNotice=" + secondTinNotice + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(Tax1099Div.class);

	public Tax1099Div getTax1099Div(int internalId) throws FDXException {
		try {
			
			template = ConnectionConfigApi51.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("internalId", internalId);
			Tax1099Div tax1099Div;
			try {
				tax1099Div = template.queryForObject(
						"select * from "+ DeveloperContext.getDeveloperSchema() +".tax1099Div where internalId in (:internalId)", parameters,
						new Tax1099DivRowMapper());
			} catch (EmptyResultDataAccessException e) {
				throw new FDXException("Tax1099Div not found", 0);
			}
//		payerNameAddress Start
			NameAddressPhone payerNameAddress = new NameAddressPhone();
			if (tax1099Div.getPayerNameAddress() != null) {
				payerNameAddress = payerNameAddress
						.getNameAddressPhoneDetails(tax1099Div.getPayerNameAddress().getNameAddressId());
				tax1099Div.setPayerNameAddress(payerNameAddress);
			}
//		payerNameAddress End

//		recipientNameAddress Start
			NameAddress recipientNameAddress = new NameAddress();
			if (tax1099Div.getRecipientNameAddress() != null) {
				recipientNameAddress = recipientNameAddress
						.getNameAddressDetails(tax1099Div.getRecipientNameAddress().getNameAddressId());
				tax1099Div.setRecipientNameAddress(recipientNameAddress);
			}
//		recipientNameAddress End

//		StateTaxWithholding Start
			List<StateTaxWithholding> stateTaxWithholdingList = tax1099Div.getStateTaxWithholding();
			List<StateTaxWithholding> stateTaxWithholdingListNew = new ArrayList<>();
			if (tax1099Div.getStateTaxWithholding() != null) {
				for (StateTaxWithholding stateTaxWithholdingIterator : stateTaxWithholdingList) {
					StateTaxWithholding stateTaxWithholding = stateTaxWithholdingIterator
							.getStateTaxWIthHolding(stateTaxWithholdingIterator.getStwithheldid());
					stateTaxWithholdingListNew.add(stateTaxWithholding);
				}
				tax1099Div.setStateTaxWithholding(stateTaxWithholdingListNew);
			}
//		StateTaxWithholding End

//		foreignIncomes Start
			List<DescriptionAmount> foreignIncomesList = tax1099Div.getForeignIncomes();
			List<DescriptionAmount> foreignIncomesListNew = new ArrayList<>();
			if (tax1099Div.getForeignIncomes() != null) {
				for (DescriptionAmount descriptionAmountIterator : foreignIncomesList) {
					DescriptionAmount descriptionAmount = descriptionAmountIterator
							.getDescriptionAmount(descriptionAmountIterator.getDescAmountId());
					foreignIncomesListNew.add(descriptionAmount);
				}
				tax1099Div.setForeignIncomes(foreignIncomesListNew);
			}
//		foreignIncomes End

//		stateTaxExemptIncomes Start
			List<DescriptionAmount> stateTaxExemptIncomesList = tax1099Div.getStateTaxExemptIncomes();
			List<DescriptionAmount> stateTaxExemptIncomesListNew = new ArrayList<>();
			if (tax1099Div.getStateTaxExemptIncomes() != null) {
				for (DescriptionAmount descriptionAmountIterator : stateTaxExemptIncomesList) {
					DescriptionAmount descriptionAmount = descriptionAmountIterator
							.getDescriptionAmount(descriptionAmountIterator.getDescAmountId());
					stateTaxExemptIncomesListNew.add(descriptionAmount);
				}
				tax1099Div.setStateTaxExemptIncomes(stateTaxExemptIncomesListNew);
			}
//		stateTaxExemptIncomes End
			return tax1099Div;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Tax1099Div : ", e);
			throw new FDXException(e,500);
		}
	}
}
