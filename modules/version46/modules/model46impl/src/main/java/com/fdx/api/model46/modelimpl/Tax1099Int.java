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
import com.fdx.api.model46.mapper.Tax1099IntRowMapper;

import io.swagger.annotations.ApiModel;

/**
 * Interest Income
 */
@ApiModel(description = "Interest Income")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1099Int {

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

	@JsonProperty("payerRtn")
	private String payerRtn;

	@JsonProperty("interestIncome")
	private Double interestIncome;

	@JsonProperty("earlyWithdrawalPenalty")
	private Double earlyWithdrawalPenalty;

	@JsonProperty("usBondInterest")
	private Double usBondInterest;

	@JsonProperty("federalTaxWithheld")
	private Double federalTaxWithheld;

	@JsonProperty("investmentExpenses")
	private Double investmentExpenses;

	@JsonProperty("foreignTaxPaid")
	private Double foreignTaxPaid;

	@JsonProperty("foreignCountry")
	private String foreignCountry;

	@JsonProperty("taxExemptInterest")
	private Double taxExemptInterest;

	@JsonProperty("specifiedPabInterest")
	private Double specifiedPabInterest;

	@JsonProperty("marketDiscount")
	private Double marketDiscount;

	@JsonProperty("bondPremium")
	private Double bondPremium;

	@JsonProperty("usBondPremium")
	private Double usBondPremium;

	@JsonProperty("taxExemptBondPremium")
	private Double taxExemptBondPremium;

	@JsonProperty("cusipNumber")
	private String cusipNumber;

	@JsonProperty("stateTaxWithholding")
	@Valid
	private List<StateTaxWithholding> stateTaxWithholding = null;

	@JsonProperty("foreignIncomes")
	@Valid
	private List<DescriptionAmount> foreignIncomes = null;

	@JsonProperty("stateTaxExemptIncome")
	@Valid
	private List<DescriptionAmount> stateTaxExemptIncome = null;

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

	public String getPayerRtn() {
		return payerRtn;
	}

	public void setPayerRtn(String payerRtn) {
		this.payerRtn = payerRtn;
	}

	public Double getInterestIncome() {
		return interestIncome;
	}

	public void setInterestIncome(Double interestIncome) {
		this.interestIncome = interestIncome;
	}

	public Double getEarlyWithdrawalPenalty() {
		return earlyWithdrawalPenalty;
	}

	public void setEarlyWithdrawalPenalty(Double earlyWithdrawalPenalty) {
		this.earlyWithdrawalPenalty = earlyWithdrawalPenalty;
	}

	public Double getUsBondInterest() {
		return usBondInterest;
	}

	public void setUsBondInterest(Double usBondInterest) {
		this.usBondInterest = usBondInterest;
	}

	public Double getFederalTaxWithheld() {
		return federalTaxWithheld;
	}

	public void setFederalTaxWithheld(Double federalTaxWithheld) {
		this.federalTaxWithheld = federalTaxWithheld;
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

	public Double getTaxExemptInterest() {
		return taxExemptInterest;
	}

	public void setTaxExemptInterest(Double taxExemptInterest) {
		this.taxExemptInterest = taxExemptInterest;
	}

	public Double getSpecifiedPabInterest() {
		return specifiedPabInterest;
	}

	public void setSpecifiedPabInterest(Double specifiedPabInterest) {
		this.specifiedPabInterest = specifiedPabInterest;
	}

	public Double getMarketDiscount() {
		return marketDiscount;
	}

	public void setMarketDiscount(Double marketDiscount) {
		this.marketDiscount = marketDiscount;
	}

	public Double getBondPremium() {
		return bondPremium;
	}

	public void setBondPremium(Double bondPremium) {
		this.bondPremium = bondPremium;
	}

	public Double getUsBondPremium() {
		return usBondPremium;
	}

	public void setUsBondPremium(Double usBondPremium) {
		this.usBondPremium = usBondPremium;
	}

	public Double getTaxExemptBondPremium() {
		return taxExemptBondPremium;
	}

	public void setTaxExemptBondPremium(Double taxExemptBondPremium) {
		this.taxExemptBondPremium = taxExemptBondPremium;
	}

	public String getCusipNumber() {
		return cusipNumber;
	}

	public void setCusipNumber(String cusipNumber) {
		this.cusipNumber = cusipNumber;
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

	public List<DescriptionAmount> getStateTaxExemptIncome() {
		return stateTaxExemptIncome;
	}

	public void setStateTaxExemptIncome(List<DescriptionAmount> stateTaxExemptIncome) {
		this.stateTaxExemptIncome = stateTaxExemptIncome;
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
		result = prime * result + ((bondPremium == null) ? 0 : bondPremium.hashCode());
		result = prime * result + ((cusipNumber == null) ? 0 : cusipNumber.hashCode());
		result = prime * result + ((earlyWithdrawalPenalty == null) ? 0 : earlyWithdrawalPenalty.hashCode());
		result = prime * result + ((federalTaxWithheld == null) ? 0 : federalTaxWithheld.hashCode());
		result = prime * result + ((foreignAccountTaxCompliance == null) ? 0 : foreignAccountTaxCompliance.hashCode());
		result = prime * result + ((foreignCountry == null) ? 0 : foreignCountry.hashCode());
		result = prime * result + ((foreignIncomes == null) ? 0 : foreignIncomes.hashCode());
		result = prime * result + ((foreignTaxPaid == null) ? 0 : foreignTaxPaid.hashCode());
		result = prime * result + ((interestIncome == null) ? 0 : interestIncome.hashCode());
		result = prime * result + ((investmentExpenses == null) ? 0 : investmentExpenses.hashCode());
		result = prime * result + ((marketDiscount == null) ? 0 : marketDiscount.hashCode());
		result = prime * result + ((payerNameAddress == null) ? 0 : payerNameAddress.hashCode());
		result = prime * result + ((payerRtn == null) ? 0 : payerRtn.hashCode());
		result = prime * result + ((payerTin == null) ? 0 : payerTin.hashCode());
		result = prime * result + ((recipientNameAddress == null) ? 0 : recipientNameAddress.hashCode());
		result = prime * result + ((recipientTin == null) ? 0 : recipientTin.hashCode());
		result = prime * result + ((secondTinNotice == null) ? 0 : secondTinNotice.hashCode());
		result = prime * result + ((specifiedPabInterest == null) ? 0 : specifiedPabInterest.hashCode());
		result = prime * result + ((stateTaxExemptIncome == null) ? 0 : stateTaxExemptIncome.hashCode());
		result = prime * result + ((stateTaxWithholding == null) ? 0 : stateTaxWithholding.hashCode());
		result = prime * result + ((tax == null) ? 0 : tax.hashCode());
		result = prime * result + ((taxExemptBondPremium == null) ? 0 : taxExemptBondPremium.hashCode());
		result = prime * result + ((taxExemptInterest == null) ? 0 : taxExemptInterest.hashCode());
		result = prime * result + ((usBondInterest == null) ? 0 : usBondInterest.hashCode());
		result = prime * result + ((usBondPremium == null) ? 0 : usBondPremium.hashCode());
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
		Tax1099Int other = (Tax1099Int) obj;
		if (accountNumber == null) {
			if (other.accountNumber != null)
				return false;
		} else if (!accountNumber.equals(other.accountNumber))
			return false;
		if (bondPremium == null) {
			if (other.bondPremium != null)
				return false;
		} else if (!bondPremium.equals(other.bondPremium))
			return false;
		if (cusipNumber == null) {
			if (other.cusipNumber != null)
				return false;
		} else if (!cusipNumber.equals(other.cusipNumber))
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
		if (interestIncome == null) {
			if (other.interestIncome != null)
				return false;
		} else if (!interestIncome.equals(other.interestIncome))
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
		if (payerNameAddress == null) {
			if (other.payerNameAddress != null)
				return false;
		} else if (!payerNameAddress.equals(other.payerNameAddress))
			return false;
		if (payerRtn == null) {
			if (other.payerRtn != null)
				return false;
		} else if (!payerRtn.equals(other.payerRtn))
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
		if (specifiedPabInterest == null) {
			if (other.specifiedPabInterest != null)
				return false;
		} else if (!specifiedPabInterest.equals(other.specifiedPabInterest))
			return false;
		if (stateTaxExemptIncome == null) {
			if (other.stateTaxExemptIncome != null)
				return false;
		} else if (!stateTaxExemptIncome.equals(other.stateTaxExemptIncome))
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
		if (taxExemptBondPremium == null) {
			if (other.taxExemptBondPremium != null)
				return false;
		} else if (!taxExemptBondPremium.equals(other.taxExemptBondPremium))
			return false;
		if (taxExemptInterest == null) {
			if (other.taxExemptInterest != null)
				return false;
		} else if (!taxExemptInterest.equals(other.taxExemptInterest))
			return false;
		if (usBondInterest == null) {
			if (other.usBondInterest != null)
				return false;
		} else if (!usBondInterest.equals(other.usBondInterest))
			return false;
		if (usBondPremium == null) {
			if (other.usBondPremium != null)
				return false;
		} else if (!usBondPremium.equals(other.usBondPremium))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tax1099Int [tax=" + tax + ", payerNameAddress=" + payerNameAddress + ", payerTin=" + payerTin
				+ ", recipientTin=" + recipientTin + ", recipientNameAddress=" + recipientNameAddress
				+ ", foreignAccountTaxCompliance=" + foreignAccountTaxCompliance + ", accountNumber=" + accountNumber
				+ ", payerRtn=" + payerRtn + ", interestIncome=" + interestIncome + ", earlyWithdrawalPenalty="
				+ earlyWithdrawalPenalty + ", usBondInterest=" + usBondInterest + ", federalTaxWithheld="
				+ federalTaxWithheld + ", investmentExpenses=" + investmentExpenses + ", foreignTaxPaid="
				+ foreignTaxPaid + ", foreignCountry=" + foreignCountry + ", taxExemptInterest=" + taxExemptInterest
				+ ", specifiedPabInterest=" + specifiedPabInterest + ", marketDiscount=" + marketDiscount
				+ ", bondPremium=" + bondPremium + ", usBondPremium=" + usBondPremium + ", taxExemptBondPremium="
				+ taxExemptBondPremium + ", cusipNumber=" + cusipNumber + ", stateTaxWithholding=" + stateTaxWithholding
				+ ", foreignIncomes=" + foreignIncomes + ", stateTaxExemptIncome=" + stateTaxExemptIncome
				+ ", secondTinNotice=" + secondTinNotice + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(Tax1099Int.class);

	public Tax1099Int getTax1099Int(int internalId) throws FDXException {
		try {
			
			template = ConnectionConfigApi46.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("internalId", internalId);

			Tax1099Int tax1099Int = template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".tax1099Int where internalId in (:internalId)", parameters,
					new Tax1099IntRowMapper());

//		payerNameAddress Start
			NameAddressPhone payerNameAddress = new NameAddressPhone();
			if (tax1099Int.getPayerNameAddress() != null) {
				payerNameAddress = payerNameAddress
						.getNameAddressPhoneDetails(tax1099Int.getPayerNameAddress().getNameAddressId());
				tax1099Int.setPayerNameAddress(payerNameAddress);
			}
//		payerNameAddress End

//		recipientNameAddress Start
			NameAddress recipientNameAddress = new NameAddress();
			if (tax1099Int.getRecipientNameAddress() != null) {
				recipientNameAddress = recipientNameAddress
						.getNameAddressDetails(tax1099Int.getRecipientNameAddress().getNameAddressId());
				tax1099Int.setRecipientNameAddress(recipientNameAddress);
			}
//		recipientNameAddress End

//			StateTaxWithholding Start
			List<StateTaxWithholding> stateTaxWithholdingList = tax1099Int.getStateTaxWithholding();
			List<StateTaxWithholding> stateTaxWithholdingListNew = new ArrayList<>();
			if (tax1099Int.getStateTaxWithholding() != null) {
				for (StateTaxWithholding stateTaxWithholdingIterator : stateTaxWithholdingList) {
					StateTaxWithholding stateTaxWithholding = stateTaxWithholdingIterator
							.getStateTaxWIthHolding(stateTaxWithholdingIterator.getStwithheldid());
					stateTaxWithholdingListNew.add(stateTaxWithholding);
				}
				tax1099Int.setStateTaxWithholding(stateTaxWithholdingListNew);
			}

//			StateTaxWithholding End

//				foreignIncomes Start
			List<DescriptionAmount> foreignIncomesList = tax1099Int.getForeignIncomes();
			List<DescriptionAmount> foreignIncomesListNew = new ArrayList<>();
			if (tax1099Int.getForeignIncomes() != null) {
				for (DescriptionAmount descriptionAmountIterator : foreignIncomesList) {
					DescriptionAmount descriptionAmount = descriptionAmountIterator
							.getDescriptionAmount(descriptionAmountIterator.getDescAmountId());
					foreignIncomesListNew.add(descriptionAmount);
				}
				tax1099Int.setForeignIncomes(foreignIncomesListNew);
			}
//			foreignIncomes End

//			stateTaxExemptIncomes Start
			List<DescriptionAmount> stateTaxExemptIncomesList = tax1099Int.getStateTaxExemptIncome();
			List<DescriptionAmount> stateTaxExemptIncomesListNew = new ArrayList<>();
			if (tax1099Int.getStateTaxExemptIncome() != null) {
				for (DescriptionAmount descriptionAmountIterator : stateTaxExemptIncomesList) {
					DescriptionAmount descriptionAmount = descriptionAmountIterator
							.getDescriptionAmount(descriptionAmountIterator.getDescAmountId());
					stateTaxExemptIncomesListNew.add(descriptionAmount);
				}
				tax1099Int.setStateTaxExemptIncome(stateTaxExemptIncomesListNew);
			}
//			stateTaxExemptIncomes End

			return tax1099Int;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Tax1099Int : ", e);
			throw new FDXException(e,500);
		}
	}
}
