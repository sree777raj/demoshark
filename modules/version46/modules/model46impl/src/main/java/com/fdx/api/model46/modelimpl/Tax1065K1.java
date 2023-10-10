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
import com.fdx.api.model46.mapper.Tax1065K1RowMapper;

import io.swagger.annotations.ApiModel;

/**
 * Partner&#39;s Share of Income, Deductions, Credits, etc.
 */
@ApiModel(description = "Partner's Share of Income, Deductions, Credits, etc.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1065K1 {

	NamedParameterJdbcTemplate template;

	@JsonUnwrapped
	private Tax tax;

	@JsonProperty("fiscalYearBegin")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private Date fiscalYearBegin;

	@JsonProperty("fiscalYearEnd")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private Date fiscalYearEnd;

	@JsonProperty("finalK1")
	@JsonInclude(Include.NON_NULL)
	private Boolean finalK1;

	@JsonProperty("amendedK1")
	@JsonInclude(Include.NON_NULL)
	private Boolean amendedK1;

	@JsonProperty("partnershipTin")
	private String partnershipTin;

	@JsonProperty("partnershipNameAddress")
	private NameAddress partnershipNameAddress;

	@JsonProperty("irsCenter")
	private String irsCenter;

	@JsonProperty("publiclyTraded")
	@JsonInclude(Include.NON_NULL)
	private Boolean publiclyTraded;

	@JsonProperty("partnerTin")
	private String partnerTin;

	@JsonProperty("partnerNameAddress")
	private NameAddress partnerNameAddress;

	@JsonProperty("generalPartner")
	@JsonInclude(Include.NON_NULL)
	private Boolean generalPartner;

	@JsonProperty("limitedPartner")
	@JsonInclude(Include.NON_NULL)
	private Boolean limitedPartner;

	@JsonProperty("domestic")
	@JsonInclude(Include.NON_NULL)
	private Boolean domestic;

	@JsonProperty("foreingpartner")
	@JsonInclude(Include.NON_NULL)
	private Boolean foreingpartner;

	@JsonProperty("disregardedEntity")
	@JsonInclude(Include.NON_NULL)
	private Boolean disregardedEntity;

	@JsonProperty("disregardedEntityTin")
	private String disregardedEntityTin;

	@JsonProperty("disregardedEntityName")
	private String disregardedEntityName;

	@JsonProperty("entityType")
	private String entityType;

	@JsonProperty("retirementPlan")
	@JsonInclude(Include.NON_NULL)
	private Boolean retirementPlan;

	@JsonProperty("profitShareBegin")
	private Double profitShareBegin;

	@JsonProperty("profitShareEnd")
	private Double profitShareEnd;

	@JsonProperty("lossShareBegin")
	private Double lossShareBegin;

	@JsonProperty("lossShareEnd")
	private Double lossShareEnd;

	@JsonProperty("capitalShareBegin")
	private Double capitalShareBegin;

	@JsonProperty("capitalShareEnd")
	private Double capitalShareEnd;

	@JsonProperty("decreaseDueToSaleOrExchange")
	@JsonInclude(Include.NON_NULL)
	private Boolean decreaseDueToSaleOrExchange;

	@JsonProperty("nonrecourseLiabilityShareBegin")
	private Double nonrecourseLiabilityShareBegin;

	@JsonProperty("nonrecourseLiabilityShareEnd")
	private Double nonrecourseLiabilityShareEnd;

	@JsonProperty("qualifiedLiabilityShareBegin")
	private Double qualifiedLiabilityShareBegin;

	@JsonProperty("qualifiedLiabilityShareEnd")
	private Double qualifiedLiabilityShareEnd;

	@JsonProperty("recourseLiabilityShareBegin")
	private Double recourseLiabilityShareBegin;

	@JsonProperty("recourseLiabilityShareEnd")
	private Double recourseLiabilityShareEnd;

	@JsonProperty("includesLowerTierLiability")
	@JsonInclude(Include.NON_NULL)
	private Boolean includesLowerTierLiability;

	@JsonProperty("capitalAccountBegin")
	private Double capitalAccountBegin;

	@JsonProperty("capitalAccountContributions")
	private Double capitalAccountContributions;

	@JsonProperty("capitalAccountIncrease")
	private Double capitalAccountIncrease;

	@JsonProperty("capitalAccountOther")
	private Double capitalAccountOther;

	@JsonProperty("capitalAccountWithdrawals")
	private Double capitalAccountWithdrawals;

	@JsonProperty("capitalAccountEnd")
	private Double capitalAccountEnd;

	@JsonProperty("bookTax")
	@JsonInclude(Include.NON_NULL)
	private Boolean bookTax;

	@JsonProperty("bookGaap")
	@JsonInclude(Include.NON_NULL)
	private Boolean bookGaap;

	@JsonProperty("book704b")
	@JsonInclude(Include.NON_NULL)
	private Boolean book704b;

	@JsonProperty("bookOther")
	@JsonInclude(Include.NON_NULL)
	private Boolean bookOther;

	@JsonProperty("bookOtherExplain")
	private String bookOtherExplain;

	@JsonProperty("builtInGain")
	@JsonInclude(Include.NON_NULL)
	private Boolean builtInGain;

	@JsonProperty("unrecognizedSection704Begin")
	private Double unrecognizedSection704Begin;

	@JsonProperty("unrecognizedSection704End")
	private Double unrecognizedSection704End;

	@JsonProperty("ordinaryIncome")
	private Double ordinaryIncome;

	@JsonProperty("netRentalRealEstateIncome")
	private Double netRentalRealEstateIncome;

	@JsonProperty("otherRentalIncome")
	private Double otherRentalIncome;

	@JsonProperty("guaranteedPaymentServices")
	private Double guaranteedPaymentServices;

	@JsonProperty("guaranteedPaymentCapital")
	private Double guaranteedPaymentCapital;

	@JsonProperty("guaranteedPayment")
	private Double guaranteedPayment;

	@JsonProperty("interestIncome")
	private Double interestIncome;

	@JsonProperty("ordinaryDividends")
	private Double ordinaryDividends;

	@JsonProperty("qualifiedDividends")
	private Double qualifiedDividends;

	@JsonProperty("dividendEquivalents")
	private Double dividendEquivalents;

	@JsonProperty("royalties")
	private Double royalties;

	@JsonProperty("netShortTermGain")
	private Double netShortTermGain;

	@JsonProperty("netLongTermGain")
	private Double netLongTermGain;

	@JsonProperty("collectiblesGain")
	private Double collectiblesGain;

	@JsonProperty("unrecaptured1250Gain")
	private Double unrecaptured1250Gain;

	@JsonProperty("net1231Gain")
	private Double net1231Gain;

	@JsonProperty("otherIncome")
	@Valid
	private List<CodeAmount> otherIncome = null;

	@JsonProperty("section179Deduction")
	private Double section179Deduction;

	@JsonProperty("otherDeductions")
	@Valid
	private List<CodeAmount> otherDeductions = null;

	@JsonProperty("selfEmployment")
	@Valid
	private List<CodeAmount> selfEmployment = null;

	@JsonProperty("credits")
	@Valid
	private List<CodeAmount> credits = null;

	@JsonProperty("foreignCountry")
	private String foreignCountry;

	@JsonProperty("foreignTransactions")
	@Valid
	private List<CodeAmount> foreignTransactions = null;

	@JsonProperty("amtItems")
	@Valid
	private List<CodeAmount> amtItems = null;

	@JsonProperty("taxExemptIncome")
	@Valid
	private List<CodeAmount> taxExemptIncome = null;

	@JsonProperty("distributions")
	@Valid
	private List<CodeAmount> distributions = null;

	@JsonProperty("otherInfo")
	@Valid
	private List<CodeAmount> otherInfo = null;

	@JsonProperty("multipleAtRiskActivities")
	@JsonInclude(Include.NON_NULL)
	private Boolean multipleAtRiskActivities;

	@JsonProperty("multiplePassiveActivities")
	@JsonInclude(Include.NON_NULL)
	private Boolean multiplePassiveActivities;

	public Tax getTax() {
		return tax;
	}

	public void setTax(Tax tax) {
		this.tax = tax;
	}

	public Date getFiscalYearBegin() {
		return fiscalYearBegin;
	}

	public void setFiscalYearBegin(Date fiscalYearBegin) {
		this.fiscalYearBegin = fiscalYearBegin;
	}

	public Date getFiscalYearEnd() {
		return fiscalYearEnd;
	}

	public void setFiscalYearEnd(Date fiscalYearEnd) {
		this.fiscalYearEnd = fiscalYearEnd;
	}

	public Boolean getFinalK1() {
		return finalK1;
	}

	public void setFinalK1(Boolean finalK1) {
		this.finalK1 = finalK1;
	}

	public Boolean getAmendedK1() {
		return amendedK1;
	}

	public void setAmendedK1(Boolean amendedK1) {
		this.amendedK1 = amendedK1;
	}

	public String getPartnershipTin() {
		return partnershipTin;
	}

	public void setPartnershipTin(String partnershipTin) {
		this.partnershipTin = partnershipTin;
	}

	public NameAddress getPartnershipNameAddress() {
		return partnershipNameAddress;
	}

	public void setPartnershipNameAddress(NameAddress partnershipNameAddress) {
		this.partnershipNameAddress = partnershipNameAddress;
	}

	public String getIrsCenter() {
		return irsCenter;
	}

	public void setIrsCenter(String irsCenter) {
		this.irsCenter = irsCenter;
	}

	public Boolean getPubliclyTraded() {
		return publiclyTraded;
	}

	public void setPubliclyTraded(Boolean publiclyTraded) {
		this.publiclyTraded = publiclyTraded;
	}

	public String getPartnerTin() {
		return partnerTin;
	}

	public void setPartnerTin(String partnerTin) {
		this.partnerTin = partnerTin;
	}

	public NameAddress getPartnerNameAddress() {
		return partnerNameAddress;
	}

	public void setPartnerNameAddress(NameAddress partnerNameAddress) {
		this.partnerNameAddress = partnerNameAddress;
	}

	public Boolean getGeneralPartner() {
		return generalPartner;
	}

	public void setGeneralPartner(Boolean generalPartner) {
		this.generalPartner = generalPartner;
	}

	public Boolean getLimitedPartner() {
		return limitedPartner;
	}

	public void setLimitedPartner(Boolean limitedPartner) {
		this.limitedPartner = limitedPartner;
	}

	public Boolean getDomestic() {
		return domestic;
	}

	public void setDomestic(Boolean domestic) {
		this.domestic = domestic;
	}

	public Boolean getForeignPartner() {
		return foreingpartner;
	}

	public void setForeignPartner(Boolean foreingpartner) {
		this.foreingpartner = foreingpartner;
	}

	public Boolean getDisregardedEntity() {
		return disregardedEntity;
	}

	public void setDisregardedEntity(Boolean disregardedEntity) {
		this.disregardedEntity = disregardedEntity;
	}

	public String getDisregardedEntityTin() {
		return disregardedEntityTin;
	}

	public void setDisregardedEntityTin(String disregardedEntityTin) {
		this.disregardedEntityTin = disregardedEntityTin;
	}

	public String getDisregardedEntityName() {
		return disregardedEntityName;
	}

	public void setDisregardedEntityName(String disregardedEntityName) {
		this.disregardedEntityName = disregardedEntityName;
	}

	public String getEntityType() {
		return entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public Boolean getRetirementPlan() {
		return retirementPlan;
	}

	public void setRetirementPlan(Boolean retirementPlan) {
		this.retirementPlan = retirementPlan;
	}

	public Double getProfitShareBegin() {
		return profitShareBegin;
	}

	public void setProfitShareBegin(Double profitShareBegin) {
		this.profitShareBegin = profitShareBegin;
	}

	public Double getProfitShareEnd() {
		return profitShareEnd;
	}

	public void setProfitShareEnd(Double profitShareEnd) {
		this.profitShareEnd = profitShareEnd;
	}

	public Double getLossShareBegin() {
		return lossShareBegin;
	}

	public void setLossShareBegin(Double lossShareBegin) {
		this.lossShareBegin = lossShareBegin;
	}

	public Double getLossShareEnd() {
		return lossShareEnd;
	}

	public void setLossShareEnd(Double lossShareEnd) {
		this.lossShareEnd = lossShareEnd;
	}

	public Double getCapitalShareBegin() {
		return capitalShareBegin;
	}

	public void setCapitalShareBegin(Double capitalShareBegin) {
		this.capitalShareBegin = capitalShareBegin;
	}

	public Double getCapitalShareEnd() {
		return capitalShareEnd;
	}

	public void setCapitalShareEnd(Double capitalShareEnd) {
		this.capitalShareEnd = capitalShareEnd;
	}

	public Boolean getDecreaseDueToSaleOrExchange() {
		return decreaseDueToSaleOrExchange;
	}

	public void setDecreaseDueToSaleOrExchange(Boolean decreaseDueToSaleOrExchange) {
		this.decreaseDueToSaleOrExchange = decreaseDueToSaleOrExchange;
	}

	public Double getNonrecourseLiabilityShareBegin() {
		return nonrecourseLiabilityShareBegin;
	}

	public void setNonrecourseLiabilityShareBegin(Double nonrecourseLiabilityShareBegin) {
		this.nonrecourseLiabilityShareBegin = nonrecourseLiabilityShareBegin;
	}

	public Double getNonrecourseLiabilityShareEnd() {
		return nonrecourseLiabilityShareEnd;
	}

	public void setNonrecourseLiabilityShareEnd(Double nonrecourseLiabilityShareEnd) {
		this.nonrecourseLiabilityShareEnd = nonrecourseLiabilityShareEnd;
	}

	public Double getQualifiedLiabilityShareBegin() {
		return qualifiedLiabilityShareBegin;
	}

	public void setQualifiedLiabilityShareBegin(Double qualifiedLiabilityShareBegin) {
		this.qualifiedLiabilityShareBegin = qualifiedLiabilityShareBegin;
	}

	public Double getQualifiedLiabilityShareEnd() {
		return qualifiedLiabilityShareEnd;
	}

	public void setQualifiedLiabilityShareEnd(Double qualifiedLiabilityShareEnd) {
		this.qualifiedLiabilityShareEnd = qualifiedLiabilityShareEnd;
	}

	public Double getRecourseLiabilityShareBegin() {
		return recourseLiabilityShareBegin;
	}

	public void setRecourseLiabilityShareBegin(Double recourseLiabilityShareBegin) {
		this.recourseLiabilityShareBegin = recourseLiabilityShareBegin;
	}

	public Double getRecourseLiabilityShareEnd() {
		return recourseLiabilityShareEnd;
	}

	public void setRecourseLiabilityShareEnd(Double recourseLiabilityShareEnd) {
		this.recourseLiabilityShareEnd = recourseLiabilityShareEnd;
	}

	public Boolean getIncludesLowerTierLiability() {
		return includesLowerTierLiability;
	}

	public void setIncludesLowerTierLiability(Boolean includesLowerTierLiability) {
		this.includesLowerTierLiability = includesLowerTierLiability;
	}

	public Double getCapitalAccountBegin() {
		return capitalAccountBegin;
	}

	public void setCapitalAccountBegin(Double capitalAccountBegin) {
		this.capitalAccountBegin = capitalAccountBegin;
	}

	public Double getCapitalAccountContributions() {
		return capitalAccountContributions;
	}

	public void setCapitalAccountContributions(Double capitalAccountContributions) {
		this.capitalAccountContributions = capitalAccountContributions;
	}

	public Double getCapitalAccountIncrease() {
		return capitalAccountIncrease;
	}

	public void setCapitalAccountIncrease(Double capitalAccountIncrease) {
		this.capitalAccountIncrease = capitalAccountIncrease;
	}

	public Double getCapitalAccountOther() {
		return capitalAccountOther;
	}

	public void setCapitalAccountOther(Double capitalAccountOther) {
		this.capitalAccountOther = capitalAccountOther;
	}

	public Double getCapitalAccountWithdrawals() {
		return capitalAccountWithdrawals;
	}

	public void setCapitalAccountWithdrawals(Double capitalAccountWithdrawals) {
		this.capitalAccountWithdrawals = capitalAccountWithdrawals;
	}

	public Double getCapitalAccountEnd() {
		return capitalAccountEnd;
	}

	public void setCapitalAccountEnd(Double capitalAccountEnd) {
		this.capitalAccountEnd = capitalAccountEnd;
	}

	public Boolean getBookTax() {
		return bookTax;
	}

	public void setBookTax(Boolean bookTax) {
		this.bookTax = bookTax;
	}

	public Boolean getBookGaap() {
		return bookGaap;
	}

	public void setBookGaap(Boolean bookGaap) {
		this.bookGaap = bookGaap;
	}

	public Boolean getBook704b() {
		return book704b;
	}

	public void setBook704b(Boolean book704b) {
		this.book704b = book704b;
	}

	public Boolean getBookOther() {
		return bookOther;
	}

	public void setBookOther(Boolean bookOther) {
		this.bookOther = bookOther;
	}

	public String getBookOtherExplain() {
		return bookOtherExplain;
	}

	public void setBookOtherExplain(String bookOtherExplain) {
		this.bookOtherExplain = bookOtherExplain;
	}

	public Boolean getBuiltInGain() {
		return builtInGain;
	}

	public void setBuiltInGain(Boolean builtInGain) {
		this.builtInGain = builtInGain;
	}

	public Double getUnrecognizedSection704Begin() {
		return unrecognizedSection704Begin;
	}

	public void setUnrecognizedSection704Begin(Double unrecognizedSection704Begin) {
		this.unrecognizedSection704Begin = unrecognizedSection704Begin;
	}

	public Double getUnrecognizedSection704End() {
		return unrecognizedSection704End;
	}

	public void setUnrecognizedSection704End(Double unrecognizedSection704End) {
		this.unrecognizedSection704End = unrecognizedSection704End;
	}

	public Double getOrdinaryIncome() {
		return ordinaryIncome;
	}

	public void setOrdinaryIncome(Double ordinaryIncome) {
		this.ordinaryIncome = ordinaryIncome;
	}

	public Double getNetRentalRealEstateIncome() {
		return netRentalRealEstateIncome;
	}

	public void setNetRentalRealEstateIncome(Double netRentalRealEstateIncome) {
		this.netRentalRealEstateIncome = netRentalRealEstateIncome;
	}

	public Double getOtherRentalIncome() {
		return otherRentalIncome;
	}

	public void setOtherRentalIncome(Double otherRentalIncome) {
		this.otherRentalIncome = otherRentalIncome;
	}

	public Double getGuaranteedPaymentServices() {
		return guaranteedPaymentServices;
	}

	public void setGuaranteedPaymentServices(Double guaranteedPaymentServices) {
		this.guaranteedPaymentServices = guaranteedPaymentServices;
	}

	public Double getGuaranteedPaymentCapital() {
		return guaranteedPaymentCapital;
	}

	public void setGuaranteedPaymentCapital(Double guaranteedPaymentCapital) {
		this.guaranteedPaymentCapital = guaranteedPaymentCapital;
	}

	public Double getGuaranteedPayment() {
		return guaranteedPayment;
	}

	public void setGuaranteedPayment(Double guaranteedPayment) {
		this.guaranteedPayment = guaranteedPayment;
	}

	public Double getInterestIncome() {
		return interestIncome;
	}

	public void setInterestIncome(Double interestIncome) {
		this.interestIncome = interestIncome;
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

	public Double getDividendEquivalents() {
		return dividendEquivalents;
	}

	public void setDividendEquivalents(Double dividendEquivalents) {
		this.dividendEquivalents = dividendEquivalents;
	}

	public Double getRoyalties() {
		return royalties;
	}

	public void setRoyalties(Double royalties) {
		this.royalties = royalties;
	}

	public Double getNetShortTermGain() {
		return netShortTermGain;
	}

	public void setNetShortTermGain(Double netShortTermGain) {
		this.netShortTermGain = netShortTermGain;
	}

	public Double getNetLongTermGain() {
		return netLongTermGain;
	}

	public void setNetLongTermGain(Double netLongTermGain) {
		this.netLongTermGain = netLongTermGain;
	}

	public Double getCollectiblesGain() {
		return collectiblesGain;
	}

	public void setCollectiblesGain(Double collectiblesGain) {
		this.collectiblesGain = collectiblesGain;
	}

	public Double getUnrecaptured1250Gain() {
		return unrecaptured1250Gain;
	}

	public void setUnrecaptured1250Gain(Double unrecaptured1250Gain) {
		this.unrecaptured1250Gain = unrecaptured1250Gain;
	}

	public Double getNet1231Gain() {
		return net1231Gain;
	}

	public void setNet1231Gain(Double net1231Gain) {
		this.net1231Gain = net1231Gain;
	}

	public List<CodeAmount> getOtherIncome() {
		return otherIncome;
	}

	public void setOtherIncome(List<CodeAmount> otherIncome) {
		this.otherIncome = otherIncome;
	}

	public Double getSection179Deduction() {
		return section179Deduction;
	}

	public void setSection179Deduction(Double section179Deduction) {
		this.section179Deduction = section179Deduction;
	}

	public List<CodeAmount> getOtherDeductions() {
		return otherDeductions;
	}

	public void setOtherDeductions(List<CodeAmount> otherDeductions) {
		this.otherDeductions = otherDeductions;
	}

	public List<CodeAmount> getSelfEmployment() {
		return selfEmployment;
	}

	public void setSelfEmployment(List<CodeAmount> selfEmployment) {
		this.selfEmployment = selfEmployment;
	}

	public List<CodeAmount> getCredits() {
		return credits;
	}

	public void setCredits(List<CodeAmount> credits) {
		this.credits = credits;
	}

	public String getForeignCountry() {
		return foreignCountry;
	}

	public void setForeignCountry(String foreignCountry) {
		this.foreignCountry = foreignCountry;
	}

	public List<CodeAmount> getForeignTransactions() {
		return foreignTransactions;
	}

	public void setForeignTransactions(List<CodeAmount> foreignTransactions) {
		this.foreignTransactions = foreignTransactions;
	}

	public List<CodeAmount> getAmtItems() {
		return amtItems;
	}

	public void setAmtItems(List<CodeAmount> amtItems) {
		this.amtItems = amtItems;
	}

	public List<CodeAmount> getTaxExemptIncome() {
		return taxExemptIncome;
	}

	public void setTaxExemptIncome(List<CodeAmount> taxExemptIncome) {
		this.taxExemptIncome = taxExemptIncome;
	}

	public List<CodeAmount> getDistributions() {
		return distributions;
	}

	public void setDistributions(List<CodeAmount> distributions) {
		this.distributions = distributions;
	}

	public List<CodeAmount> getOtherInfo() {
		return otherInfo;
	}

	public void setOtherInfo(List<CodeAmount> otherInfo) {
		this.otherInfo = otherInfo;
	}

	public Boolean getMultipleAtRiskActivities() {
		return multipleAtRiskActivities;
	}

	public void setMultipleAtRiskActivities(Boolean multipleAtRiskActivities) {
		this.multipleAtRiskActivities = multipleAtRiskActivities;
	}

	public Boolean getMultiplePassiveActivities() {
		return multiplePassiveActivities;
	}

	public void setMultiplePassiveActivities(Boolean multiplePassiveActivities) {
		this.multiplePassiveActivities = multiplePassiveActivities;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((amendedK1 == null) ? 0 : amendedK1.hashCode());
		result = prime * result + ((amtItems == null) ? 0 : amtItems.hashCode());
		result = prime * result + ((book704b == null) ? 0 : book704b.hashCode());
		result = prime * result + ((bookGaap == null) ? 0 : bookGaap.hashCode());
		result = prime * result + ((bookOther == null) ? 0 : bookOther.hashCode());
		result = prime * result + ((bookOtherExplain == null) ? 0 : bookOtherExplain.hashCode());
		result = prime * result + ((bookTax == null) ? 0 : bookTax.hashCode());
		result = prime * result + ((builtInGain == null) ? 0 : builtInGain.hashCode());
		result = prime * result + ((capitalAccountBegin == null) ? 0 : capitalAccountBegin.hashCode());
		result = prime * result + ((capitalAccountContributions == null) ? 0 : capitalAccountContributions.hashCode());
		result = prime * result + ((capitalAccountEnd == null) ? 0 : capitalAccountEnd.hashCode());
		result = prime * result + ((capitalAccountIncrease == null) ? 0 : capitalAccountIncrease.hashCode());
		result = prime * result + ((capitalAccountOther == null) ? 0 : capitalAccountOther.hashCode());
		result = prime * result + ((capitalAccountWithdrawals == null) ? 0 : capitalAccountWithdrawals.hashCode());
		result = prime * result + ((capitalShareBegin == null) ? 0 : capitalShareBegin.hashCode());
		result = prime * result + ((capitalShareEnd == null) ? 0 : capitalShareEnd.hashCode());
		result = prime * result + ((collectiblesGain == null) ? 0 : collectiblesGain.hashCode());
		result = prime * result + ((credits == null) ? 0 : credits.hashCode());
		result = prime * result + ((decreaseDueToSaleOrExchange == null) ? 0 : decreaseDueToSaleOrExchange.hashCode());
		result = prime * result + ((disregardedEntity == null) ? 0 : disregardedEntity.hashCode());
		result = prime * result + ((disregardedEntityName == null) ? 0 : disregardedEntityName.hashCode());
		result = prime * result + ((disregardedEntityTin == null) ? 0 : disregardedEntityTin.hashCode());
		result = prime * result + ((distributions == null) ? 0 : distributions.hashCode());
		result = prime * result + ((dividendEquivalents == null) ? 0 : dividendEquivalents.hashCode());
		result = prime * result + ((domestic == null) ? 0 : domestic.hashCode());
		result = prime * result + ((entityType == null) ? 0 : entityType.hashCode());
		result = prime * result + ((finalK1 == null) ? 0 : finalK1.hashCode());
		result = prime * result + ((fiscalYearBegin == null) ? 0 : fiscalYearBegin.hashCode());
		result = prime * result + ((fiscalYearEnd == null) ? 0 : fiscalYearEnd.hashCode());
		result = prime * result + ((foreingpartner == null) ? 0 : foreingpartner.hashCode());
		result = prime * result + ((foreignCountry == null) ? 0 : foreignCountry.hashCode());
		result = prime * result + ((foreignTransactions == null) ? 0 : foreignTransactions.hashCode());
		result = prime * result + ((generalPartner == null) ? 0 : generalPartner.hashCode());
		result = prime * result + ((guaranteedPayment == null) ? 0 : guaranteedPayment.hashCode());
		result = prime * result + ((guaranteedPaymentCapital == null) ? 0 : guaranteedPaymentCapital.hashCode());
		result = prime * result + ((guaranteedPaymentServices == null) ? 0 : guaranteedPaymentServices.hashCode());
		result = prime * result + ((includesLowerTierLiability == null) ? 0 : includesLowerTierLiability.hashCode());
		result = prime * result + ((interestIncome == null) ? 0 : interestIncome.hashCode());
		result = prime * result + ((irsCenter == null) ? 0 : irsCenter.hashCode());
		result = prime * result + ((limitedPartner == null) ? 0 : limitedPartner.hashCode());
		result = prime * result + ((lossShareBegin == null) ? 0 : lossShareBegin.hashCode());
		result = prime * result + ((lossShareEnd == null) ? 0 : lossShareEnd.hashCode());
		result = prime * result + ((multipleAtRiskActivities == null) ? 0 : multipleAtRiskActivities.hashCode());
		result = prime * result + ((multiplePassiveActivities == null) ? 0 : multiplePassiveActivities.hashCode());
		result = prime * result + ((net1231Gain == null) ? 0 : net1231Gain.hashCode());
		result = prime * result + ((netLongTermGain == null) ? 0 : netLongTermGain.hashCode());
		result = prime * result + ((netRentalRealEstateIncome == null) ? 0 : netRentalRealEstateIncome.hashCode());
		result = prime * result + ((netShortTermGain == null) ? 0 : netShortTermGain.hashCode());
		result = prime * result
				+ ((nonrecourseLiabilityShareBegin == null) ? 0 : nonrecourseLiabilityShareBegin.hashCode());
		result = prime * result
				+ ((nonrecourseLiabilityShareEnd == null) ? 0 : nonrecourseLiabilityShareEnd.hashCode());
		result = prime * result + ((ordinaryDividends == null) ? 0 : ordinaryDividends.hashCode());
		result = prime * result + ((ordinaryIncome == null) ? 0 : ordinaryIncome.hashCode());
		result = prime * result + ((otherDeductions == null) ? 0 : otherDeductions.hashCode());
		result = prime * result + ((otherIncome == null) ? 0 : otherIncome.hashCode());
		result = prime * result + ((otherInfo == null) ? 0 : otherInfo.hashCode());
		result = prime * result + ((otherRentalIncome == null) ? 0 : otherRentalIncome.hashCode());
		result = prime * result + ((partnerNameAddress == null) ? 0 : partnerNameAddress.hashCode());
		result = prime * result + ((partnerTin == null) ? 0 : partnerTin.hashCode());
		result = prime * result + ((partnershipNameAddress == null) ? 0 : partnershipNameAddress.hashCode());
		result = prime * result + ((partnershipTin == null) ? 0 : partnershipTin.hashCode());
		result = prime * result + ((profitShareBegin == null) ? 0 : profitShareBegin.hashCode());
		result = prime * result + ((profitShareEnd == null) ? 0 : profitShareEnd.hashCode());
		result = prime * result + ((publiclyTraded == null) ? 0 : publiclyTraded.hashCode());
		result = prime * result + ((qualifiedDividends == null) ? 0 : qualifiedDividends.hashCode());
		result = prime * result
				+ ((qualifiedLiabilityShareBegin == null) ? 0 : qualifiedLiabilityShareBegin.hashCode());
		result = prime * result + ((qualifiedLiabilityShareEnd == null) ? 0 : qualifiedLiabilityShareEnd.hashCode());
		result = prime * result + ((recourseLiabilityShareBegin == null) ? 0 : recourseLiabilityShareBegin.hashCode());
		result = prime * result + ((recourseLiabilityShareEnd == null) ? 0 : recourseLiabilityShareEnd.hashCode());
		result = prime * result + ((retirementPlan == null) ? 0 : retirementPlan.hashCode());
		result = prime * result + ((royalties == null) ? 0 : royalties.hashCode());
		result = prime * result + ((section179Deduction == null) ? 0 : section179Deduction.hashCode());
		result = prime * result + ((selfEmployment == null) ? 0 : selfEmployment.hashCode());
		result = prime * result + ((tax == null) ? 0 : tax.hashCode());
		result = prime * result + ((taxExemptIncome == null) ? 0 : taxExemptIncome.hashCode());
		result = prime * result + ((unrecaptured1250Gain == null) ? 0 : unrecaptured1250Gain.hashCode());
		result = prime * result + ((unrecognizedSection704Begin == null) ? 0 : unrecognizedSection704Begin.hashCode());
		result = prime * result + ((unrecognizedSection704End == null) ? 0 : unrecognizedSection704End.hashCode());
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
		Tax1065K1 other = (Tax1065K1) obj;
		if (amendedK1 == null) {
			if (other.amendedK1 != null)
				return false;
		} else if (!amendedK1.equals(other.amendedK1))
			return false;
		if (amtItems == null) {
			if (other.amtItems != null)
				return false;
		} else if (!amtItems.equals(other.amtItems))
			return false;
		if (book704b == null) {
			if (other.book704b != null)
				return false;
		} else if (!book704b.equals(other.book704b))
			return false;
		if (bookGaap == null) {
			if (other.bookGaap != null)
				return false;
		} else if (!bookGaap.equals(other.bookGaap))
			return false;
		if (bookOther == null) {
			if (other.bookOther != null)
				return false;
		} else if (!bookOther.equals(other.bookOther))
			return false;
		if (bookOtherExplain == null) {
			if (other.bookOtherExplain != null)
				return false;
		} else if (!bookOtherExplain.equals(other.bookOtherExplain))
			return false;
		if (bookTax == null) {
			if (other.bookTax != null)
				return false;
		} else if (!bookTax.equals(other.bookTax))
			return false;
		if (builtInGain == null) {
			if (other.builtInGain != null)
				return false;
		} else if (!builtInGain.equals(other.builtInGain))
			return false;
		if (capitalAccountBegin == null) {
			if (other.capitalAccountBegin != null)
				return false;
		} else if (!capitalAccountBegin.equals(other.capitalAccountBegin))
			return false;
		if (capitalAccountContributions == null) {
			if (other.capitalAccountContributions != null)
				return false;
		} else if (!capitalAccountContributions.equals(other.capitalAccountContributions))
			return false;
		if (capitalAccountEnd == null) {
			if (other.capitalAccountEnd != null)
				return false;
		} else if (!capitalAccountEnd.equals(other.capitalAccountEnd))
			return false;
		if (capitalAccountIncrease == null) {
			if (other.capitalAccountIncrease != null)
				return false;
		} else if (!capitalAccountIncrease.equals(other.capitalAccountIncrease))
			return false;
		if (capitalAccountOther == null) {
			if (other.capitalAccountOther != null)
				return false;
		} else if (!capitalAccountOther.equals(other.capitalAccountOther))
			return false;
		if (capitalAccountWithdrawals == null) {
			if (other.capitalAccountWithdrawals != null)
				return false;
		} else if (!capitalAccountWithdrawals.equals(other.capitalAccountWithdrawals))
			return false;
		if (capitalShareBegin == null) {
			if (other.capitalShareBegin != null)
				return false;
		} else if (!capitalShareBegin.equals(other.capitalShareBegin))
			return false;
		if (capitalShareEnd == null) {
			if (other.capitalShareEnd != null)
				return false;
		} else if (!capitalShareEnd.equals(other.capitalShareEnd))
			return false;
		if (collectiblesGain == null) {
			if (other.collectiblesGain != null)
				return false;
		} else if (!collectiblesGain.equals(other.collectiblesGain))
			return false;
		if (credits == null) {
			if (other.credits != null)
				return false;
		} else if (!credits.equals(other.credits))
			return false;
		if (decreaseDueToSaleOrExchange == null) {
			if (other.decreaseDueToSaleOrExchange != null)
				return false;
		} else if (!decreaseDueToSaleOrExchange.equals(other.decreaseDueToSaleOrExchange))
			return false;
		if (disregardedEntity == null) {
			if (other.disregardedEntity != null)
				return false;
		} else if (!disregardedEntity.equals(other.disregardedEntity))
			return false;
		if (disregardedEntityName == null) {
			if (other.disregardedEntityName != null)
				return false;
		} else if (!disregardedEntityName.equals(other.disregardedEntityName))
			return false;
		if (disregardedEntityTin == null) {
			if (other.disregardedEntityTin != null)
				return false;
		} else if (!disregardedEntityTin.equals(other.disregardedEntityTin))
			return false;
		if (distributions == null) {
			if (other.distributions != null)
				return false;
		} else if (!distributions.equals(other.distributions))
			return false;
		if (dividendEquivalents == null) {
			if (other.dividendEquivalents != null)
				return false;
		} else if (!dividendEquivalents.equals(other.dividendEquivalents))
			return false;
		if (domestic == null) {
			if (other.domestic != null)
				return false;
		} else if (!domestic.equals(other.domestic))
			return false;
		if (entityType == null) {
			if (other.entityType != null)
				return false;
		} else if (!entityType.equals(other.entityType))
			return false;
		if (finalK1 == null) {
			if (other.finalK1 != null)
				return false;
		} else if (!finalK1.equals(other.finalK1))
			return false;
		if (fiscalYearBegin == null) {
			if (other.fiscalYearBegin != null)
				return false;
		} else if (!fiscalYearBegin.equals(other.fiscalYearBegin))
			return false;
		if (fiscalYearEnd == null) {
			if (other.fiscalYearEnd != null)
				return false;
		} else if (!fiscalYearEnd.equals(other.fiscalYearEnd))
			return false;
		if (foreingpartner == null) {
			if (other.foreingpartner != null)
				return false;
		} else if (!foreingpartner.equals(other.foreingpartner))
			return false;
		if (foreignCountry == null) {
			if (other.foreignCountry != null)
				return false;
		} else if (!foreignCountry.equals(other.foreignCountry))
			return false;
		if (foreignTransactions == null) {
			if (other.foreignTransactions != null)
				return false;
		} else if (!foreignTransactions.equals(other.foreignTransactions))
			return false;
		if (generalPartner == null) {
			if (other.generalPartner != null)
				return false;
		} else if (!generalPartner.equals(other.generalPartner))
			return false;
		if (guaranteedPayment == null) {
			if (other.guaranteedPayment != null)
				return false;
		} else if (!guaranteedPayment.equals(other.guaranteedPayment))
			return false;
		if (guaranteedPaymentCapital == null) {
			if (other.guaranteedPaymentCapital != null)
				return false;
		} else if (!guaranteedPaymentCapital.equals(other.guaranteedPaymentCapital))
			return false;
		if (guaranteedPaymentServices == null) {
			if (other.guaranteedPaymentServices != null)
				return false;
		} else if (!guaranteedPaymentServices.equals(other.guaranteedPaymentServices))
			return false;
		if (includesLowerTierLiability == null) {
			if (other.includesLowerTierLiability != null)
				return false;
		} else if (!includesLowerTierLiability.equals(other.includesLowerTierLiability))
			return false;
		if (interestIncome == null) {
			if (other.interestIncome != null)
				return false;
		} else if (!interestIncome.equals(other.interestIncome))
			return false;
		if (irsCenter == null) {
			if (other.irsCenter != null)
				return false;
		} else if (!irsCenter.equals(other.irsCenter))
			return false;
		if (limitedPartner == null) {
			if (other.limitedPartner != null)
				return false;
		} else if (!limitedPartner.equals(other.limitedPartner))
			return false;
		if (lossShareBegin == null) {
			if (other.lossShareBegin != null)
				return false;
		} else if (!lossShareBegin.equals(other.lossShareBegin))
			return false;
		if (lossShareEnd == null) {
			if (other.lossShareEnd != null)
				return false;
		} else if (!lossShareEnd.equals(other.lossShareEnd))
			return false;
		if (multipleAtRiskActivities == null) {
			if (other.multipleAtRiskActivities != null)
				return false;
		} else if (!multipleAtRiskActivities.equals(other.multipleAtRiskActivities))
			return false;
		if (multiplePassiveActivities == null) {
			if (other.multiplePassiveActivities != null)
				return false;
		} else if (!multiplePassiveActivities.equals(other.multiplePassiveActivities))
			return false;
		if (net1231Gain == null) {
			if (other.net1231Gain != null)
				return false;
		} else if (!net1231Gain.equals(other.net1231Gain))
			return false;
		if (netLongTermGain == null) {
			if (other.netLongTermGain != null)
				return false;
		} else if (!netLongTermGain.equals(other.netLongTermGain))
			return false;
		if (netRentalRealEstateIncome == null) {
			if (other.netRentalRealEstateIncome != null)
				return false;
		} else if (!netRentalRealEstateIncome.equals(other.netRentalRealEstateIncome))
			return false;
		if (netShortTermGain == null) {
			if (other.netShortTermGain != null)
				return false;
		} else if (!netShortTermGain.equals(other.netShortTermGain))
			return false;
		if (nonrecourseLiabilityShareBegin == null) {
			if (other.nonrecourseLiabilityShareBegin != null)
				return false;
		} else if (!nonrecourseLiabilityShareBegin.equals(other.nonrecourseLiabilityShareBegin))
			return false;
		if (nonrecourseLiabilityShareEnd == null) {
			if (other.nonrecourseLiabilityShareEnd != null)
				return false;
		} else if (!nonrecourseLiabilityShareEnd.equals(other.nonrecourseLiabilityShareEnd))
			return false;
		if (ordinaryDividends == null) {
			if (other.ordinaryDividends != null)
				return false;
		} else if (!ordinaryDividends.equals(other.ordinaryDividends))
			return false;
		if (ordinaryIncome == null) {
			if (other.ordinaryIncome != null)
				return false;
		} else if (!ordinaryIncome.equals(other.ordinaryIncome))
			return false;
		if (otherDeductions == null) {
			if (other.otherDeductions != null)
				return false;
		} else if (!otherDeductions.equals(other.otherDeductions))
			return false;
		if (otherIncome == null) {
			if (other.otherIncome != null)
				return false;
		} else if (!otherIncome.equals(other.otherIncome))
			return false;
		if (otherInfo == null) {
			if (other.otherInfo != null)
				return false;
		} else if (!otherInfo.equals(other.otherInfo))
			return false;
		if (otherRentalIncome == null) {
			if (other.otherRentalIncome != null)
				return false;
		} else if (!otherRentalIncome.equals(other.otherRentalIncome))
			return false;
		if (partnerNameAddress == null) {
			if (other.partnerNameAddress != null)
				return false;
		} else if (!partnerNameAddress.equals(other.partnerNameAddress))
			return false;
		if (partnerTin == null) {
			if (other.partnerTin != null)
				return false;
		} else if (!partnerTin.equals(other.partnerTin))
			return false;
		if (partnershipNameAddress == null) {
			if (other.partnershipNameAddress != null)
				return false;
		} else if (!partnershipNameAddress.equals(other.partnershipNameAddress))
			return false;
		if (partnershipTin == null) {
			if (other.partnershipTin != null)
				return false;
		} else if (!partnershipTin.equals(other.partnershipTin))
			return false;
		if (profitShareBegin == null) {
			if (other.profitShareBegin != null)
				return false;
		} else if (!profitShareBegin.equals(other.profitShareBegin))
			return false;
		if (profitShareEnd == null) {
			if (other.profitShareEnd != null)
				return false;
		} else if (!profitShareEnd.equals(other.profitShareEnd))
			return false;
		if (publiclyTraded == null) {
			if (other.publiclyTraded != null)
				return false;
		} else if (!publiclyTraded.equals(other.publiclyTraded))
			return false;
		if (qualifiedDividends == null) {
			if (other.qualifiedDividends != null)
				return false;
		} else if (!qualifiedDividends.equals(other.qualifiedDividends))
			return false;
		if (qualifiedLiabilityShareBegin == null) {
			if (other.qualifiedLiabilityShareBegin != null)
				return false;
		} else if (!qualifiedLiabilityShareBegin.equals(other.qualifiedLiabilityShareBegin))
			return false;
		if (qualifiedLiabilityShareEnd == null) {
			if (other.qualifiedLiabilityShareEnd != null)
				return false;
		} else if (!qualifiedLiabilityShareEnd.equals(other.qualifiedLiabilityShareEnd))
			return false;
		if (recourseLiabilityShareBegin == null) {
			if (other.recourseLiabilityShareBegin != null)
				return false;
		} else if (!recourseLiabilityShareBegin.equals(other.recourseLiabilityShareBegin))
			return false;
		if (recourseLiabilityShareEnd == null) {
			if (other.recourseLiabilityShareEnd != null)
				return false;
		} else if (!recourseLiabilityShareEnd.equals(other.recourseLiabilityShareEnd))
			return false;
		if (retirementPlan == null) {
			if (other.retirementPlan != null)
				return false;
		} else if (!retirementPlan.equals(other.retirementPlan))
			return false;
		if (royalties == null) {
			if (other.royalties != null)
				return false;
		} else if (!royalties.equals(other.royalties))
			return false;
		if (section179Deduction == null) {
			if (other.section179Deduction != null)
				return false;
		} else if (!section179Deduction.equals(other.section179Deduction))
			return false;
		if (selfEmployment == null) {
			if (other.selfEmployment != null)
				return false;
		} else if (!selfEmployment.equals(other.selfEmployment))
			return false;
		if (tax == null) {
			if (other.tax != null)
				return false;
		} else if (!tax.equals(other.tax))
			return false;
		if (taxExemptIncome == null) {
			if (other.taxExemptIncome != null)
				return false;
		} else if (!taxExemptIncome.equals(other.taxExemptIncome))
			return false;
		if (unrecaptured1250Gain == null) {
			if (other.unrecaptured1250Gain != null)
				return false;
		} else if (!unrecaptured1250Gain.equals(other.unrecaptured1250Gain))
			return false;
		if (unrecognizedSection704Begin == null) {
			if (other.unrecognizedSection704Begin != null)
				return false;
		} else if (!unrecognizedSection704Begin.equals(other.unrecognizedSection704Begin))
			return false;
		if (unrecognizedSection704End == null) {
			if (other.unrecognizedSection704End != null)
				return false;
		} else if (!unrecognizedSection704End.equals(other.unrecognizedSection704End))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tax1065K1 [tax=" + tax + ", fiscalYearBegin=" + fiscalYearBegin + ", fiscalYearEnd=" + fiscalYearEnd
				+ ", finalK1=" + finalK1 + ", amendedK1=" + amendedK1 + ", partnershipTin=" + partnershipTin
				+ ", partnershipNameAddress=" + partnershipNameAddress + ", irsCenter=" + irsCenter
				+ ", publiclyTraded=" + publiclyTraded + ", partnerTin=" + partnerTin + ", partnerNameAddress="
				+ partnerNameAddress + ", generalPartner=" + generalPartner + ", limitedPartner=" + limitedPartner
				+ ", domestic=" + domestic + ", foreingpartner=" + foreingpartner + ", disregardedEntity="
				+ disregardedEntity + ", disregardedEntityTin=" + disregardedEntityTin + ", disregardedEntityName="
				+ disregardedEntityName + ", entityType=" + entityType + ", retirementPlan=" + retirementPlan
				+ ", profitShareBegin=" + profitShareBegin + ", profitShareEnd=" + profitShareEnd + ", lossShareBegin="
				+ lossShareBegin + ", lossShareEnd=" + lossShareEnd + ", capitalShareBegin=" + capitalShareBegin
				+ ", capitalShareEnd=" + capitalShareEnd + ", decreaseDueToSaleOrExchange="
				+ decreaseDueToSaleOrExchange + ", nonrecourseLiabilityShareBegin=" + nonrecourseLiabilityShareBegin
				+ ", nonrecourseLiabilityShareEnd=" + nonrecourseLiabilityShareEnd + ", qualifiedLiabilityShareBegin="
				+ qualifiedLiabilityShareBegin + ", qualifiedLiabilityShareEnd=" + qualifiedLiabilityShareEnd
				+ ", recourseLiabilityShareBegin=" + recourseLiabilityShareBegin + ", recourseLiabilityShareEnd="
				+ recourseLiabilityShareEnd + ", includesLowerTierLiability=" + includesLowerTierLiability
				+ ", capitalAccountBegin=" + capitalAccountBegin + ", capitalAccountContributions="
				+ capitalAccountContributions + ", capitalAccountIncrease=" + capitalAccountIncrease
				+ ", capitalAccountOther=" + capitalAccountOther + ", capitalAccountWithdrawals="
				+ capitalAccountWithdrawals + ", capitalAccountEnd=" + capitalAccountEnd + ", bookTax=" + bookTax
				+ ", bookGaap=" + bookGaap + ", book704b=" + book704b + ", bookOther=" + bookOther
				+ ", bookOtherExplain=" + bookOtherExplain + ", builtInGain=" + builtInGain
				+ ", unrecognizedSection704Begin=" + unrecognizedSection704Begin + ", unrecognizedSection704End="
				+ unrecognizedSection704End + ", ordinaryIncome=" + ordinaryIncome + ", netRentalRealEstateIncome="
				+ netRentalRealEstateIncome + ", otherRentalIncome=" + otherRentalIncome
				+ ", guaranteedPaymentServices=" + guaranteedPaymentServices + ", guaranteedPaymentCapital="
				+ guaranteedPaymentCapital + ", guaranteedPayment=" + guaranteedPayment + ", interestIncome="
				+ interestIncome + ", ordinaryDividends=" + ordinaryDividends + ", qualifiedDividends="
				+ qualifiedDividends + ", dividendEquivalents=" + dividendEquivalents + ", royalties=" + royalties
				+ ", netShortTermGain=" + netShortTermGain + ", netLongTermGain=" + netLongTermGain
				+ ", collectiblesGain=" + collectiblesGain + ", unrecaptured1250Gain=" + unrecaptured1250Gain
				+ ", net1231Gain=" + net1231Gain + ", otherIncome=" + otherIncome + ", section179Deduction="
				+ section179Deduction + ", otherDeductions=" + otherDeductions + ", selfEmployment=" + selfEmployment
				+ ", credits=" + credits + ", foreignCountry=" + foreignCountry + ", foreignTransactions="
				+ foreignTransactions + ", amtItems=" + amtItems + ", taxExemptIncome=" + taxExemptIncome
				+ ", distributions=" + distributions + ", otherInfo=" + otherInfo + ", multipleAtRiskActivities="
				+ multipleAtRiskActivities + ", multiplePassiveActivities=" + multiplePassiveActivities + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(Tax1065K1.class);

	public Tax1065K1 getTax1065K1(int internalId) throws FDXException {
		try {
			
			template = ConnectionConfigApi46.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("internalId", internalId);

			Tax1065K1 tax1065K1 = template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".tax1065K1 where internalId in (:internalId)", parameters,
					new Tax1065K1RowMapper());

//			Credits Start
			List<CodeAmount> creditsListResponse = new ArrayList<>();
			if (tax1065K1.getCredits() != null) {
				List<CodeAmount> creditsList = tax1065K1.getCredits();
				for (CodeAmount creditsIterator : creditsList) {
					CodeAmount codeAmount = creditsIterator.getCodeAmount(creditsIterator.getCodeAmountId());
					creditsListResponse.add(codeAmount);
				}
				tax1065K1.setCredits(creditsListResponse);
			}
//			Credits End 

//			Distributions Start
			List<CodeAmount> distributionsListResponse = new ArrayList<>();
			if (tax1065K1.getDistributions() != null) {
				List<CodeAmount> distributionsList = tax1065K1.getDistributions();
				for (CodeAmount distributionsIterator : distributionsList) {
					CodeAmount codeAmount = distributionsIterator
							.getCodeAmount(distributionsIterator.getCodeAmountId());
					distributionsListResponse.add(codeAmount);
				}
				tax1065K1.setDistributions(distributionsListResponse);
			}
//			Distributions End	

//			ForeignTransactions Start
			List<CodeAmount> foreignTransactionsListResponse = new ArrayList<>();
			if (tax1065K1.getForeignTransactions() != null) {
				List<CodeAmount> foreignTransactionsList = tax1065K1.getForeignTransactions();
				for (CodeAmount foreignTransactionsListIterator : foreignTransactionsList) {
					CodeAmount codeAmount = foreignTransactionsListIterator
							.getCodeAmount(foreignTransactionsListIterator.getCodeAmountId());
					foreignTransactionsListResponse.add(codeAmount);
				}
				tax1065K1.setForeignTransactions(foreignTransactionsListResponse);
			}
//			ForeignTransactions End	

//			PartnerNameAddress Start
			NameAddress partnernameaddress = new NameAddress();
			if (tax1065K1.getPartnerNameAddress() != null) {
				partnernameaddress = partnernameaddress
						.getNameAddressDetails(tax1065K1.getPartnerNameAddress().getNameAddressId());
				tax1065K1.setPartnerNameAddress(partnernameaddress);
			}
//			PartnerNameAddress End

//			PartnerShipNameAddress Start
			NameAddress partnerShipNameaddress = new NameAddress();
			if (tax1065K1.getPartnershipNameAddress() != null) {
				partnerShipNameaddress = partnerShipNameaddress
						.getNameAddressDetails(tax1065K1.getPartnershipNameAddress().getNameAddressId());
				tax1065K1.setPartnershipNameAddress(partnerShipNameaddress);
			}
//			PartnerShipNameAddress End

//			OtherDeductions Start
			List<CodeAmount> otherDeductionsListResponse = new ArrayList<>();
			if (tax1065K1.getOtherDeductions() != null) {
				List<CodeAmount> otherDeductionsList = tax1065K1.getOtherDeductions();
				for (CodeAmount otherDeductionsIterator : otherDeductionsList) {
					CodeAmount codeAmount = otherDeductionsIterator
							.getCodeAmount(otherDeductionsIterator.getCodeAmountId());
					otherDeductionsListResponse.add(codeAmount);
				}
				tax1065K1.setOtherDeductions(otherDeductionsListResponse);
			}
//			OtherDeductions End

//			OtherIncome Start
			List<CodeAmount> otherIncomeListResponse = new ArrayList<>();
			if (tax1065K1.getOtherIncome() != null) {
				List<CodeAmount> otherIncomeList = tax1065K1.getOtherIncome();
				for (CodeAmount otherIncomeIterator : otherIncomeList) {
					CodeAmount codeAmount = otherIncomeIterator.getCodeAmount(otherIncomeIterator.getCodeAmountId());
					otherIncomeListResponse.add(codeAmount);
				}
				tax1065K1.setOtherIncome(otherIncomeListResponse);
			}
//			OtherIncome End

//			OtherInfo Start
			List<CodeAmount> otherInfoListResponse = new ArrayList<>();
			if (tax1065K1.getOtherInfo() != null) {
				List<CodeAmount> otherInfoList = tax1065K1.getOtherInfo();
				for (CodeAmount otherInfoIterator : otherInfoList) {
					CodeAmount codeAmount = otherInfoIterator.getCodeAmount(otherInfoIterator.getCodeAmountId());
					otherInfoListResponse.add(codeAmount);
				}
				tax1065K1.setOtherInfo(otherInfoListResponse);
			}
//			OtherInfo End

//			SelfEmployment Start
			List<CodeAmount> selfEmploymentListResponse = new ArrayList<>();
			if (tax1065K1.getSelfEmployment() != null) {
				List<CodeAmount> selfEmploymentList = tax1065K1.getSelfEmployment();
				for (CodeAmount selfEmploymentIterator : selfEmploymentList) {
					CodeAmount codeAmount = selfEmploymentIterator
							.getCodeAmount(selfEmploymentIterator.getCodeAmountId());
					selfEmploymentListResponse.add(codeAmount);
				}
				tax1065K1.setSelfEmployment(selfEmploymentListResponse);
			}
//			SelfEmployment End

//			TaxExemptIncome Start
			List<CodeAmount> taxExemptListResponse = new ArrayList<>();
			if (tax1065K1.getTaxExemptIncome() != null) {
				List<CodeAmount> taxExemptList = tax1065K1.getTaxExemptIncome();
				for (CodeAmount taxExemptIterator : taxExemptList) {
					CodeAmount codeAmount = taxExemptIterator.getCodeAmount(taxExemptIterator.getCodeAmountId());
					taxExemptListResponse.add(codeAmount);
				}
				tax1065K1.setTaxExemptIncome(taxExemptListResponse);
			}
//			TaxExemptIncome End

//			AmtItems Start
			List<CodeAmount> amtItemsListResponse = new ArrayList<>();
			if (tax1065K1.getAmtItems() != null) {
				List<CodeAmount> amtItemsList = tax1065K1.getAmtItems();
				for (CodeAmount amtItemsIterator : amtItemsList) {
					CodeAmount codeAmount = amtItemsIterator.getCodeAmount(amtItemsIterator.getCodeAmountId());
					amtItemsListResponse.add(codeAmount);
				}
				tax1065K1.setAmtItems(amtItemsListResponse);
			}
//			AmtItems End
			return tax1065K1;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Tax1065K1 : ", e);
			throw new FDXException(e,500);
		}
	}
}
