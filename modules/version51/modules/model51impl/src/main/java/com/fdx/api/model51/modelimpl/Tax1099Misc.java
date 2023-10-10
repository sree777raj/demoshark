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
import com.fdx.api.model51.mapper.Tax1099MiscRowMapper;

import io.swagger.annotations.ApiModel;

/**
 * Miscellaneous Income
 */
@ApiModel(description = "Miscellaneous Income")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1099Misc {

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

	@JsonProperty("foreignAccountTaxCompliance")
	@JsonInclude(Include.NON_NULL)
	private Boolean foreignAccountTaxCompliance;

	@JsonProperty("rents")
	private Double rents;

	@JsonProperty("royalties")
	private Double royalties;

	@JsonProperty("otherIncome")
	private Double otherIncome;

	@JsonProperty("federalTaxWithheld")
	private Double federalTaxWithheld;

	@JsonProperty("fishingBoatProceeds")
	private Double fishingBoatProceeds;

	@JsonProperty("medicalHealthPayment")
	private Double medicalHealthPayment;

	@JsonProperty("nonEmployeeCompensation")
	private Double nonEmployeeCompensation;

	@JsonProperty("payerDirectSales")
	@JsonInclude(Include.NON_NULL)
	private Boolean payerDirectSales;

	@JsonProperty("substitutePayments")
	private Double substitutePayments;

	@JsonProperty("cropInsurance")
	private Double cropInsurance;

	@JsonProperty("grossAttorney")
	private Double grossAttorney;

	@JsonProperty("section409ADeferrals")
	private Double section409ADeferrals;

	@JsonProperty("section409AIncome")
	private Double section409AIncome;

	@JsonProperty("excessGolden")
	private Double excessGolden;

	@JsonProperty("nonQualifiedDeferredCompensation")
	private Double nonQualifiedDeferredCompensation;

	@JsonProperty("stateTaxWithholding")
	@Valid
	private List<StateTaxWithholding> stateTaxWithholding = null;

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

	public Boolean getForeignAccountTaxCompliance() {
		return foreignAccountTaxCompliance;
	}

	public void setForeignAccountTaxCompliance(Boolean foreignAccountTaxCompliance) {
		this.foreignAccountTaxCompliance = foreignAccountTaxCompliance;
	}

	public Double getRents() {
		return rents;
	}

	public void setRents(Double rents) {
		this.rents = rents;
	}

	public Double getRoyalties() {
		return royalties;
	}

	public void setRoyalties(Double royalties) {
		this.royalties = royalties;
	}

	public Double getOtherIncome() {
		return otherIncome;
	}

	public void setOtherIncome(Double otherIncome) {
		this.otherIncome = otherIncome;
	}

	public Double getFederalTaxWithheld() {
		return federalTaxWithheld;
	}

	public void setFederalTaxWithheld(Double federalTaxWithheld) {
		this.federalTaxWithheld = federalTaxWithheld;
	}

	public Double getFishingBoatProceeds() {
		return fishingBoatProceeds;
	}

	public void setFishingBoatProceeds(Double fishingBoatProceeds) {
		this.fishingBoatProceeds = fishingBoatProceeds;
	}

	public Double getMedicalHealthPayment() {
		return medicalHealthPayment;
	}

	public void setMedicalHealthPayment(Double medicalHealthPayment) {
		this.medicalHealthPayment = medicalHealthPayment;
	}

	public Double getNonEmployeeCompensation() {
		return nonEmployeeCompensation;
	}

	public void setNonEmployeeCompensation(Double nonEmployeeCompensation) {
		this.nonEmployeeCompensation = nonEmployeeCompensation;
	}

	public Boolean getPayerDirectSales() {
		return payerDirectSales;
	}

	public void setPayerDirectSales(Boolean payerDirectSales) {
		this.payerDirectSales = payerDirectSales;
	}

	public Double getSubstitutePayments() {
		return substitutePayments;
	}

	public void setSubstitutePayments(Double substitutePayments) {
		this.substitutePayments = substitutePayments;
	}

	public Double getCropInsurance() {
		return cropInsurance;
	}

	public void setCropInsurance(Double cropInsurance) {
		this.cropInsurance = cropInsurance;
	}

	public Double getGrossAttorney() {
		return grossAttorney;
	}

	public void setGrossAttorney(Double grossAttorney) {
		this.grossAttorney = grossAttorney;
	}

	public Double getSection409ADeferrals() {
		return section409ADeferrals;
	}

	public void setSection409ADeferrals(Double section409aDeferrals) {
		section409ADeferrals = section409aDeferrals;
	}

	public Double getSection409AIncome() {
		return section409AIncome;
	}

	public void setSection409AIncome(Double section409aIncome) {
		section409AIncome = section409aIncome;
	}

	public Double getExcessGolden() {
		return excessGolden;
	}

	public void setExcessGolden(Double excessGolden) {
		this.excessGolden = excessGolden;
	}

	public Double getNonQualifiedDeferredCompensation() {
		return nonQualifiedDeferredCompensation;
	}

	public void setNonQualifiedDeferredCompensation(Double nonQualifiedDeferredCompensation) {
		this.nonQualifiedDeferredCompensation = nonQualifiedDeferredCompensation;
	}

	public List<StateTaxWithholding> getStateTaxWithholding() {
		return stateTaxWithholding;
	}

	public void setStateTaxWithholding(List<StateTaxWithholding> stateTaxWithholding) {
		this.stateTaxWithholding = stateTaxWithholding;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountNumber == null) ? 0 : accountNumber.hashCode());
		result = prime * result + ((cropInsurance == null) ? 0 : cropInsurance.hashCode());
		result = prime * result + ((excessGolden == null) ? 0 : excessGolden.hashCode());
		result = prime * result + ((federalTaxWithheld == null) ? 0 : federalTaxWithheld.hashCode());
		result = prime * result + ((fishingBoatProceeds == null) ? 0 : fishingBoatProceeds.hashCode());
		result = prime * result + ((foreignAccountTaxCompliance == null) ? 0 : foreignAccountTaxCompliance.hashCode());
		result = prime * result + ((grossAttorney == null) ? 0 : grossAttorney.hashCode());
		result = prime * result + ((medicalHealthPayment == null) ? 0 : medicalHealthPayment.hashCode());
		result = prime * result + ((nonEmployeeCompensation == null) ? 0 : nonEmployeeCompensation.hashCode());
		result = prime * result
				+ ((nonQualifiedDeferredCompensation == null) ? 0 : nonQualifiedDeferredCompensation.hashCode());
		result = prime * result + ((otherIncome == null) ? 0 : otherIncome.hashCode());
		result = prime * result + ((payerDirectSales == null) ? 0 : payerDirectSales.hashCode());
		result = prime * result + ((payerNameAddress == null) ? 0 : payerNameAddress.hashCode());
		result = prime * result + ((payerTin == null) ? 0 : payerTin.hashCode());
		result = prime * result + ((recipientNameAddress == null) ? 0 : recipientNameAddress.hashCode());
		result = prime * result + ((recipientTin == null) ? 0 : recipientTin.hashCode());
		result = prime * result + ((rents == null) ? 0 : rents.hashCode());
		result = prime * result + ((royalties == null) ? 0 : royalties.hashCode());
		result = prime * result + ((section409ADeferrals == null) ? 0 : section409ADeferrals.hashCode());
		result = prime * result + ((section409AIncome == null) ? 0 : section409AIncome.hashCode());
		result = prime * result + ((stateTaxWithholding == null) ? 0 : stateTaxWithholding.hashCode());
		result = prime * result + ((substitutePayments == null) ? 0 : substitutePayments.hashCode());
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
		Tax1099Misc other = (Tax1099Misc) obj;
		if (accountNumber == null) {
			if (other.accountNumber != null)
				return false;
		} else if (!accountNumber.equals(other.accountNumber))
			return false;
		if (cropInsurance == null) {
			if (other.cropInsurance != null)
				return false;
		} else if (!cropInsurance.equals(other.cropInsurance))
			return false;
		if (excessGolden == null) {
			if (other.excessGolden != null)
				return false;
		} else if (!excessGolden.equals(other.excessGolden))
			return false;
		if (federalTaxWithheld == null) {
			if (other.federalTaxWithheld != null)
				return false;
		} else if (!federalTaxWithheld.equals(other.federalTaxWithheld))
			return false;
		if (fishingBoatProceeds == null) {
			if (other.fishingBoatProceeds != null)
				return false;
		} else if (!fishingBoatProceeds.equals(other.fishingBoatProceeds))
			return false;
		if (foreignAccountTaxCompliance == null) {
			if (other.foreignAccountTaxCompliance != null)
				return false;
		} else if (!foreignAccountTaxCompliance.equals(other.foreignAccountTaxCompliance))
			return false;
		if (grossAttorney == null) {
			if (other.grossAttorney != null)
				return false;
		} else if (!grossAttorney.equals(other.grossAttorney))
			return false;
		if (medicalHealthPayment == null) {
			if (other.medicalHealthPayment != null)
				return false;
		} else if (!medicalHealthPayment.equals(other.medicalHealthPayment))
			return false;
		if (nonEmployeeCompensation == null) {
			if (other.nonEmployeeCompensation != null)
				return false;
		} else if (!nonEmployeeCompensation.equals(other.nonEmployeeCompensation))
			return false;
		if (nonQualifiedDeferredCompensation == null) {
			if (other.nonQualifiedDeferredCompensation != null)
				return false;
		} else if (!nonQualifiedDeferredCompensation.equals(other.nonQualifiedDeferredCompensation))
			return false;
		if (otherIncome == null) {
			if (other.otherIncome != null)
				return false;
		} else if (!otherIncome.equals(other.otherIncome))
			return false;
		if (payerDirectSales == null) {
			if (other.payerDirectSales != null)
				return false;
		} else if (!payerDirectSales.equals(other.payerDirectSales))
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
		if (rents == null) {
			if (other.rents != null)
				return false;
		} else if (!rents.equals(other.rents))
			return false;
		if (royalties == null) {
			if (other.royalties != null)
				return false;
		} else if (!royalties.equals(other.royalties))
			return false;
		if (section409ADeferrals == null) {
			if (other.section409ADeferrals != null)
				return false;
		} else if (!section409ADeferrals.equals(other.section409ADeferrals))
			return false;
		if (section409AIncome == null) {
			if (other.section409AIncome != null)
				return false;
		} else if (!section409AIncome.equals(other.section409AIncome))
			return false;
		if (stateTaxWithholding == null) {
			if (other.stateTaxWithholding != null)
				return false;
		} else if (!stateTaxWithholding.equals(other.stateTaxWithholding))
			return false;
		if (substitutePayments == null) {
			if (other.substitutePayments != null)
				return false;
		} else if (!substitutePayments.equals(other.substitutePayments))
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
		return "Tax1099Misc [tax=" + tax + ", payerNameAddress=" + payerNameAddress + ", payerTin=" + payerTin
				+ ", recipientTin=" + recipientTin + ", recipientNameAddress=" + recipientNameAddress
				+ ", accountNumber=" + accountNumber + ", foreignAccountTaxCompliance=" + foreignAccountTaxCompliance
				+ ", rents=" + rents + ", royalties=" + royalties + ", otherIncome=" + otherIncome
				+ ", federalTaxWithheld=" + federalTaxWithheld + ", fishingBoatProceeds=" + fishingBoatProceeds
				+ ", medicalHealthPayment=" + medicalHealthPayment + ", nonEmployeeCompensation="
				+ nonEmployeeCompensation + ", payerDirectSales=" + payerDirectSales + ", substitutePayments="
				+ substitutePayments + ", cropInsurance=" + cropInsurance + ", grossAttorney=" + grossAttorney
				+ ", section409ADeferrals=" + section409ADeferrals + ", section409AIncome=" + section409AIncome
				+ ", excessGolden=" + excessGolden + ", nonQualifiedDeferredCompensation="
				+ nonQualifiedDeferredCompensation + ", stateTaxWithholding=" + stateTaxWithholding + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(Tax1099Misc.class);

	public Tax1099Misc getTax1099Misc(int internalId) throws FDXException {
		try {
			template = ConnectionConfigApi51.getTemplate();
			SqlParameterSource parameters = new MapSqlParameterSource("internalId", internalId);
			Tax1099Misc tax1099Misc;
			try {
				tax1099Misc = template.queryForObject(
						"select * from "+ DeveloperContext.getDeveloperSchema() +".Tax1099Misc where internalId in (:internalId)", parameters,
						new Tax1099MiscRowMapper());
			} catch (EmptyResultDataAccessException e) {
				throw new FDXException("Tax1099Misc not found", 0);
			}
//		payerNameAddress Start
			NameAddressPhone payerNameAddress = new NameAddressPhone();
			if (tax1099Misc.getPayerNameAddress() != null) {
				payerNameAddress = payerNameAddress
						.getNameAddressPhoneDetails(tax1099Misc.getPayerNameAddress().getNameAddressId());
				tax1099Misc.setPayerNameAddress(payerNameAddress);
			}
//		payerNameAddress End

//		recipientNameAddress Start
			NameAddress recipientNameAddress = new NameAddress();
			if (tax1099Misc.getRecipientNameAddress() != null) {
				recipientNameAddress = recipientNameAddress
						.getNameAddressDetails(tax1099Misc.getRecipientNameAddress().getNameAddressId());
				tax1099Misc.setRecipientNameAddress(recipientNameAddress);
			}
//		recipientNameAddress End

//			StateTaxWithholding Start
			List<StateTaxWithholding> stateTaxWithholdingList = tax1099Misc.getStateTaxWithholding();
			List<StateTaxWithholding> stateTaxWithholdingListNew = new ArrayList<>();
			if (tax1099Misc.getStateTaxWithholding() != null) {
				for (StateTaxWithholding stateTaxWithholdingIterator : stateTaxWithholdingList) {
					StateTaxWithholding stateTaxWithholding = stateTaxWithholdingIterator
							.getStateTaxWIthHolding(stateTaxWithholdingIterator.getStwithheldid());
					stateTaxWithholdingListNew.add(stateTaxWithholding);
				}
				tax1099Misc.setStateTaxWithholding(stateTaxWithholdingListNew);
			}

//			StateTaxWithholding End

			return tax1099Misc;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Tax1099Misc : ", e);
			throw new FDXException(e,500);
		}
	}

}
