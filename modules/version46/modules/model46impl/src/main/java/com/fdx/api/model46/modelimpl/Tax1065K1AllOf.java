package com.fdx.api.model46.modelimpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.fasterxml.jackson.annotation.OptBoolean;
import io.swagger.annotations.ApiModelProperty;

/**
 * Tax1065K1AllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1065K1AllOf {
	@JsonProperty("fiscalYearBegin")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private LocalDate fiscalYearBegin;

	@JsonProperty("fiscalYearEnd")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private LocalDate fiscalYearEnd;

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

	@JsonProperty("foreign")
	@JsonInclude(Include.NON_NULL)
	private Boolean foreign;

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

	public Tax1065K1AllOf fiscalYearBegin(LocalDate fiscalYearBegin) {
		this.fiscalYearBegin = fiscalYearBegin;
		return this;
	}

	/**
	 * ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included
	 * according to [IETF RFC3339]
	 * (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)
	 * 
	 * @return fiscalYearBegin
	 */
	@ApiModelProperty(value = "ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included according to [IETF RFC3339] (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)")

	@Valid
	@Size(max = 10)
	public LocalDate getFiscalYearBegin() {
		return fiscalYearBegin;
	}

	public void setFiscalYearBegin(LocalDate fiscalYearBegin) {
		this.fiscalYearBegin = fiscalYearBegin;
	}

	public Tax1065K1AllOf fiscalYearEnd(LocalDate fiscalYearEnd) {
		this.fiscalYearEnd = fiscalYearEnd;
		return this;
	}

	/**
	 * ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included
	 * according to [IETF RFC3339]
	 * (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)
	 * 
	 * @return fiscalYearEnd
	 */
	@ApiModelProperty(value = "ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included according to [IETF RFC3339] (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)")

	@Valid
	@Size(max = 10)
	public LocalDate getFiscalYearEnd() {
		return fiscalYearEnd;
	}

	public void setFiscalYearEnd(LocalDate fiscalYearEnd) {
		this.fiscalYearEnd = fiscalYearEnd;
	}

	public Tax1065K1AllOf finalK1(Boolean finalK1) {
		this.finalK1 = finalK1;
		return this;
	}

	/**
	 * Final K-1
	 * 
	 * @return finalK1
	 */
	@ApiModelProperty(value = "Final K-1")

	public Boolean getFinalK1() {
		return finalK1;
	}

	public void setFinalK1(Boolean finalK1) {
		this.finalK1 = finalK1;
	}

	public Tax1065K1AllOf amendedK1(Boolean amendedK1) {
		this.amendedK1 = amendedK1;
		return this;
	}

	/**
	 * Amended K-1
	 * 
	 * @return amendedK1
	 */
	@ApiModelProperty(value = "Amended K-1")

	public Boolean getAmendedK1() {
		return amendedK1;
	}

	public void setAmendedK1(Boolean amendedK1) {
		this.amendedK1 = amendedK1;
	}

	public Tax1065K1AllOf partnershipTin(String partnershipTin) {
		this.partnershipTin = partnershipTin;
		return this;
	}

	/**
	 * Box A, Partnership's employer identification number
	 * 
	 * @return partnershipTin
	 */
	@ApiModelProperty(value = "Box A, Partnership's employer identification number")

	public String getPartnershipTin() {
		return partnershipTin;
	}

	public void setPartnershipTin(String partnershipTin) {
		this.partnershipTin = partnershipTin;
	}

	public Tax1065K1AllOf partnershipNameAddress(NameAddress partnershipNameAddress) {
		this.partnershipNameAddress = partnershipNameAddress;
		return this;
	}

	/**
	 * Get partnershipNameAddress
	 * 
	 * @return partnershipNameAddress
	 */
	@ApiModelProperty(value = "")

	@Valid

	public NameAddress getPartnershipNameAddress() {
		return partnershipNameAddress;
	}

	public void setPartnershipNameAddress(NameAddress partnershipNameAddress) {
		this.partnershipNameAddress = partnershipNameAddress;
	}

	public Tax1065K1AllOf irsCenter(String irsCenter) {
		this.irsCenter = irsCenter;
		return this;
	}

	/**
	 * Box C, IRS Center where partnership filed return
	 * 
	 * @return irsCenter
	 */
	@ApiModelProperty(value = "Box C, IRS Center where partnership filed return")

	public String getIrsCenter() {
		return irsCenter;
	}

	public void setIrsCenter(String irsCenter) {
		this.irsCenter = irsCenter;
	}

	public Tax1065K1AllOf publiclyTraded(Boolean publiclyTraded) {
		this.publiclyTraded = publiclyTraded;
		return this;
	}

	/**
	 * Box D, Check if this is a publicly traded partnership (PTP)
	 * 
	 * @return publiclyTraded
	 */
	@ApiModelProperty(value = "Box D, Check if this is a publicly traded partnership (PTP)")

	public Boolean getPubliclyTraded() {
		return publiclyTraded;
	}

	public void setPubliclyTraded(Boolean publiclyTraded) {
		this.publiclyTraded = publiclyTraded;
	}

	public Tax1065K1AllOf partnerTin(String partnerTin) {
		this.partnerTin = partnerTin;
		return this;
	}

	/**
	 * Box E, Partner's SSN or TIN
	 * 
	 * @return partnerTin
	 */
	@ApiModelProperty(value = "Box E, Partner's SSN or TIN")

	public String getPartnerTin() {
		return partnerTin;
	}

	public void setPartnerTin(String partnerTin) {
		this.partnerTin = partnerTin;
	}

	public Tax1065K1AllOf partnerNameAddress(NameAddress partnerNameAddress) {
		this.partnerNameAddress = partnerNameAddress;
		return this;
	}

	/**
	 * Get partnerNameAddress
	 * 
	 * @return partnerNameAddress
	 */
	@ApiModelProperty(value = "")

	@Valid

	public NameAddress getPartnerNameAddress() {
		return partnerNameAddress;
	}

	public void setPartnerNameAddress(NameAddress partnerNameAddress) {
		this.partnerNameAddress = partnerNameAddress;
	}

	public Tax1065K1AllOf generalPartner(Boolean generalPartner) {
		this.generalPartner = generalPartner;
		return this;
	}

	/**
	 * Box G, General partner or LLC member-manager
	 * 
	 * @return generalPartner
	 */
	@ApiModelProperty(value = "Box G, General partner or LLC member-manager")

	public Boolean getGeneralPartner() {
		return generalPartner;
	}

	public void setGeneralPartner(Boolean generalPartner) {
		this.generalPartner = generalPartner;
	}

	public Tax1065K1AllOf limitedPartner(Boolean limitedPartner) {
		this.limitedPartner = limitedPartner;
		return this;
	}

	/**
	 * Box G, Limited partner or other LLC member
	 * 
	 * @return limitedPartner
	 */
	@ApiModelProperty(value = "Box G, Limited partner or other LLC member")

	public Boolean getLimitedPartner() {
		return limitedPartner;
	}

	public void setLimitedPartner(Boolean limitedPartner) {
		this.limitedPartner = limitedPartner;
	}

	public Tax1065K1AllOf domestic(Boolean domestic) {
		this.domestic = domestic;
		return this;
	}

	/**
	 * Box H1, Domestic partner
	 * 
	 * @return domestic
	 */
	@ApiModelProperty(value = "Box H1, Domestic partner")

	public Boolean getDomestic() {
		return domestic;
	}

	public void setDomestic(Boolean domestic) {
		this.domestic = domestic;
	}

	public Tax1065K1AllOf foreign(Boolean foreign) {
		this.foreign = foreign;
		return this;
	}

	/**
	 * Box H1, Foreign partner
	 * 
	 * @return foreign
	 */
	@ApiModelProperty(value = "Box H1, Foreign partner")

	public Boolean getForeign() {
		return foreign;
	}

	public void setForeign(Boolean foreign) {
		this.foreign = foreign;
	}

	public Tax1065K1AllOf disregardedEntity(Boolean disregardedEntity) {
		this.disregardedEntity = disregardedEntity;
		return this;
	}

	/**
	 * Box H2, Check if the partner is a disregarded entity (DE), and enter the
	 * partner's TIN and Name
	 * 
	 * @return disregardedEntity
	 */
	@ApiModelProperty(value = "Box H2, Check if the partner is a disregarded entity (DE), and enter the partner's TIN and Name")

	public Boolean getDisregardedEntity() {
		return disregardedEntity;
	}

	public void setDisregardedEntity(Boolean disregardedEntity) {
		this.disregardedEntity = disregardedEntity;
	}

	public Tax1065K1AllOf disregardedEntityTin(String disregardedEntityTin) {
		this.disregardedEntityTin = disregardedEntityTin;
		return this;
	}

	/**
	 * Box H2, Disregarded entity partner's TIN
	 * 
	 * @return disregardedEntityTin
	 */
	@ApiModelProperty(value = "Box H2, Disregarded entity partner's TIN")

	public String getDisregardedEntityTin() {
		return disregardedEntityTin;
	}

	public void setDisregardedEntityTin(String disregardedEntityTin) {
		this.disregardedEntityTin = disregardedEntityTin;
	}

	public Tax1065K1AllOf disregardedEntityName(String disregardedEntityName) {
		this.disregardedEntityName = disregardedEntityName;
		return this;
	}

	/**
	 * Box H2, Disregarded entity partner's Name
	 * 
	 * @return disregardedEntityName
	 */
	@ApiModelProperty(value = "Box H2, Disregarded entity partner's Name")

	public String getDisregardedEntityName() {
		return disregardedEntityName;
	}

	public void setDisregardedEntityName(String disregardedEntityName) {
		this.disregardedEntityName = disregardedEntityName;
	}

	public Tax1065K1AllOf entityType(String entityType) {
		this.entityType = entityType;
		return this;
	}

	/**
	 * Box I1, What type of entity is this partner?
	 * 
	 * @return entityType
	 */
	@ApiModelProperty(value = "Box I1, What type of entity is this partner?")

	public String getEntityType() {
		return entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public Tax1065K1AllOf retirementPlan(Boolean retirementPlan) {
		this.retirementPlan = retirementPlan;
		return this;
	}

	/**
	 * Box I2, If this partner is a retirement plan (IRA/SEP/Keogh/etc.), check here
	 * 
	 * @return retirementPlan
	 */
	@ApiModelProperty(value = "Box I2, If this partner is a retirement plan (IRA/SEP/Keogh/etc.), check here")

	public Boolean getRetirementPlan() {
		return retirementPlan;
	}

	public void setRetirementPlan(Boolean retirementPlan) {
		this.retirementPlan = retirementPlan;
	}

	public Tax1065K1AllOf profitShareBegin(Double profitShareBegin) {
		this.profitShareBegin = profitShareBegin;
		return this;
	}

	/**
	 * Box J, Partner's share of profit - beginning
	 * 
	 * @return profitShareBegin
	 */
	@ApiModelProperty(value = "Box J, Partner's share of profit - beginning")

	public Double getProfitShareBegin() {
		return profitShareBegin;
	}

	public void setProfitShareBegin(Double profitShareBegin) {
		this.profitShareBegin = profitShareBegin;
	}

	public Tax1065K1AllOf profitShareEnd(Double profitShareEnd) {
		this.profitShareEnd = profitShareEnd;
		return this;
	}

	/**
	 * Box J, Partner's share of profit - ending
	 * 
	 * @return profitShareEnd
	 */
	@ApiModelProperty(value = "Box J, Partner's share of profit - ending")

	public Double getProfitShareEnd() {
		return profitShareEnd;
	}

	public void setProfitShareEnd(Double profitShareEnd) {
		this.profitShareEnd = profitShareEnd;
	}

	public Tax1065K1AllOf lossShareBegin(Double lossShareBegin) {
		this.lossShareBegin = lossShareBegin;
		return this;
	}

	/**
	 * Box J, Partner's share of loss - beginning
	 * 
	 * @return lossShareBegin
	 */
	@ApiModelProperty(value = "Box J, Partner's share of loss - beginning")

	public Double getLossShareBegin() {
		return lossShareBegin;
	}

	public void setLossShareBegin(Double lossShareBegin) {
		this.lossShareBegin = lossShareBegin;
	}

	public Tax1065K1AllOf lossShareEnd(Double lossShareEnd) {
		this.lossShareEnd = lossShareEnd;
		return this;
	}

	/**
	 * Box J, Partner's share of loss - ending
	 * 
	 * @return lossShareEnd
	 */
	@ApiModelProperty(value = "Box J, Partner's share of loss - ending")

	public Double getLossShareEnd() {
		return lossShareEnd;
	}

	public void setLossShareEnd(Double lossShareEnd) {
		this.lossShareEnd = lossShareEnd;
	}

	public Tax1065K1AllOf capitalShareBegin(Double capitalShareBegin) {
		this.capitalShareBegin = capitalShareBegin;
		return this;
	}

	/**
	 * Box J, Partner's share of capital - beginning
	 * 
	 * @return capitalShareBegin
	 */
	@ApiModelProperty(value = "Box J, Partner's share of capital - beginning")

	public Double getCapitalShareBegin() {
		return capitalShareBegin;
	}

	public void setCapitalShareBegin(Double capitalShareBegin) {
		this.capitalShareBegin = capitalShareBegin;
	}

	public Tax1065K1AllOf capitalShareEnd(Double capitalShareEnd) {
		this.capitalShareEnd = capitalShareEnd;
		return this;
	}

	/**
	 * Box J, Partner's share of capital - ending
	 * 
	 * @return capitalShareEnd
	 */
	@ApiModelProperty(value = "Box J, Partner's share of capital - ending")

	public Double getCapitalShareEnd() {
		return capitalShareEnd;
	}

	public void setCapitalShareEnd(Double capitalShareEnd) {
		this.capitalShareEnd = capitalShareEnd;
	}

	public Tax1065K1AllOf decreaseDueToSaleOrExchange(Boolean decreaseDueToSaleOrExchange) {
		this.decreaseDueToSaleOrExchange = decreaseDueToSaleOrExchange;
		return this;
	}

	/**
	 * Box J, Check if decrease is due to sale or exchange of partnership interest
	 * 
	 * @return decreaseDueToSaleOrExchange
	 */
	@ApiModelProperty(value = "Box J, Check if decrease is due to sale or exchange of partnership interest")

	public Boolean getDecreaseDueToSaleOrExchange() {
		return decreaseDueToSaleOrExchange;
	}

	public void setDecreaseDueToSaleOrExchange(Boolean decreaseDueToSaleOrExchange) {
		this.decreaseDueToSaleOrExchange = decreaseDueToSaleOrExchange;
	}

	public Tax1065K1AllOf nonrecourseLiabilityShareBegin(Double nonrecourseLiabilityShareBegin) {
		this.nonrecourseLiabilityShareBegin = nonrecourseLiabilityShareBegin;
		return this;
	}

	/**
	 * Box K, Partner's share of liabilities - beginning - nonrecourse
	 * 
	 * @return nonrecourseLiabilityShareBegin
	 */
	@ApiModelProperty(value = "Box K, Partner's share of liabilities - beginning - nonrecourse")

	public Double getNonrecourseLiabilityShareBegin() {
		return nonrecourseLiabilityShareBegin;
	}

	public void setNonrecourseLiabilityShareBegin(Double nonrecourseLiabilityShareBegin) {
		this.nonrecourseLiabilityShareBegin = nonrecourseLiabilityShareBegin;
	}

	public Tax1065K1AllOf nonrecourseLiabilityShareEnd(Double nonrecourseLiabilityShareEnd) {
		this.nonrecourseLiabilityShareEnd = nonrecourseLiabilityShareEnd;
		return this;
	}

	/**
	 * Box K, Partner's share of liabilities - ending - nonrecourse
	 * 
	 * @return nonrecourseLiabilityShareEnd
	 */
	@ApiModelProperty(value = "Box K, Partner's share of liabilities - ending - nonrecourse")

	public Double getNonrecourseLiabilityShareEnd() {
		return nonrecourseLiabilityShareEnd;
	}

	public void setNonrecourseLiabilityShareEnd(Double nonrecourseLiabilityShareEnd) {
		this.nonrecourseLiabilityShareEnd = nonrecourseLiabilityShareEnd;
	}

	public Tax1065K1AllOf qualifiedLiabilityShareBegin(Double qualifiedLiabilityShareBegin) {
		this.qualifiedLiabilityShareBegin = qualifiedLiabilityShareBegin;
		return this;
	}

	/**
	 * Box K, Partner's share of liabilities - beginning - qualified nonrecourse
	 * financing
	 * 
	 * @return qualifiedLiabilityShareBegin
	 */
	@ApiModelProperty(value = "Box K, Partner's share of liabilities - beginning - qualified nonrecourse financing")

	public Double getQualifiedLiabilityShareBegin() {
		return qualifiedLiabilityShareBegin;
	}

	public void setQualifiedLiabilityShareBegin(Double qualifiedLiabilityShareBegin) {
		this.qualifiedLiabilityShareBegin = qualifiedLiabilityShareBegin;
	}

	public Tax1065K1AllOf qualifiedLiabilityShareEnd(Double qualifiedLiabilityShareEnd) {
		this.qualifiedLiabilityShareEnd = qualifiedLiabilityShareEnd;
		return this;
	}

	/**
	 * Box K, Partner's share of liabilities - ending - qualified nonrecourse
	 * financing
	 * 
	 * @return qualifiedLiabilityShareEnd
	 */
	@ApiModelProperty(value = "Box K, Partner's share of liabilities - ending - qualified nonrecourse financing")

	public Double getQualifiedLiabilityShareEnd() {
		return qualifiedLiabilityShareEnd;
	}

	public void setQualifiedLiabilityShareEnd(Double qualifiedLiabilityShareEnd) {
		this.qualifiedLiabilityShareEnd = qualifiedLiabilityShareEnd;
	}

	public Tax1065K1AllOf recourseLiabilityShareBegin(Double recourseLiabilityShareBegin) {
		this.recourseLiabilityShareBegin = recourseLiabilityShareBegin;
		return this;
	}

	/**
	 * Box K, Partner's share of liabilities - beginning - recourse
	 * 
	 * @return recourseLiabilityShareBegin
	 */
	@ApiModelProperty(value = "Box K, Partner's share of liabilities - beginning - recourse")

	public Double getRecourseLiabilityShareBegin() {
		return recourseLiabilityShareBegin;
	}

	public void setRecourseLiabilityShareBegin(Double recourseLiabilityShareBegin) {
		this.recourseLiabilityShareBegin = recourseLiabilityShareBegin;
	}

	public Tax1065K1AllOf recourseLiabilityShareEnd(Double recourseLiabilityShareEnd) {
		this.recourseLiabilityShareEnd = recourseLiabilityShareEnd;
		return this;
	}

	/**
	 * Box K, Partner's share of liabilities - ending - recourse
	 * 
	 * @return recourseLiabilityShareEnd
	 */
	@ApiModelProperty(value = "Box K, Partner's share of liabilities - ending - recourse")

	public Double getRecourseLiabilityShareEnd() {
		return recourseLiabilityShareEnd;
	}

	public void setRecourseLiabilityShareEnd(Double recourseLiabilityShareEnd) {
		this.recourseLiabilityShareEnd = recourseLiabilityShareEnd;
	}

	public Tax1065K1AllOf includesLowerTierLiability(Boolean includesLowerTierLiability) {
		this.includesLowerTierLiability = includesLowerTierLiability;
		return this;
	}

	/**
	 * Box K, Check this box if item K includes liability amounts from lower tier
	 * partnerships
	 * 
	 * @return includesLowerTierLiability
	 */
	@ApiModelProperty(value = "Box K, Check this box if item K includes liability amounts from lower tier partnerships")

	public Boolean getIncludesLowerTierLiability() {
		return includesLowerTierLiability;
	}

	public void setIncludesLowerTierLiability(Boolean includesLowerTierLiability) {
		this.includesLowerTierLiability = includesLowerTierLiability;
	}

	public Tax1065K1AllOf capitalAccountBegin(Double capitalAccountBegin) {
		this.capitalAccountBegin = capitalAccountBegin;
		return this;
	}

	/**
	 * Box L, Partner's capital account analysis - Beginning capital account
	 * 
	 * @return capitalAccountBegin
	 */
	@ApiModelProperty(value = "Box L, Partner's capital account analysis - Beginning capital account")

	public Double getCapitalAccountBegin() {
		return capitalAccountBegin;
	}

	public void setCapitalAccountBegin(Double capitalAccountBegin) {
		this.capitalAccountBegin = capitalAccountBegin;
	}

	public Tax1065K1AllOf capitalAccountContributions(Double capitalAccountContributions) {
		this.capitalAccountContributions = capitalAccountContributions;
		return this;
	}

	/**
	 * Box L, Partner's capital account analysis - Capital contributed during the
	 * year
	 * 
	 * @return capitalAccountContributions
	 */
	@ApiModelProperty(value = "Box L, Partner's capital account analysis - Capital contributed during the year")

	public Double getCapitalAccountContributions() {
		return capitalAccountContributions;
	}

	public void setCapitalAccountContributions(Double capitalAccountContributions) {
		this.capitalAccountContributions = capitalAccountContributions;
	}

	public Tax1065K1AllOf capitalAccountIncrease(Double capitalAccountIncrease) {
		this.capitalAccountIncrease = capitalAccountIncrease;
		return this;
	}

	/**
	 * Box L, Partner's capital account analysis - Current year net income (loss)
	 * 
	 * @return capitalAccountIncrease
	 */
	@ApiModelProperty(value = "Box L, Partner's capital account analysis - Current year net income (loss)")

	public Double getCapitalAccountIncrease() {
		return capitalAccountIncrease;
	}

	public void setCapitalAccountIncrease(Double capitalAccountIncrease) {
		this.capitalAccountIncrease = capitalAccountIncrease;
	}

	public Tax1065K1AllOf capitalAccountOther(Double capitalAccountOther) {
		this.capitalAccountOther = capitalAccountOther;
		return this;
	}

	/**
	 * Box L, Partner's capital account analysis - Other increase (decrease)
	 * 
	 * @return capitalAccountOther
	 */
	@ApiModelProperty(value = "Box L, Partner's capital account analysis - Other increase (decrease)")

	public Double getCapitalAccountOther() {
		return capitalAccountOther;
	}

	public void setCapitalAccountOther(Double capitalAccountOther) {
		this.capitalAccountOther = capitalAccountOther;
	}

	public Tax1065K1AllOf capitalAccountWithdrawals(Double capitalAccountWithdrawals) {
		this.capitalAccountWithdrawals = capitalAccountWithdrawals;
		return this;
	}

	/**
	 * Box L, Partner's capital account analysis - Withdrawals & distributions
	 * 
	 * @return capitalAccountWithdrawals
	 */
	@ApiModelProperty(value = "Box L, Partner's capital account analysis - Withdrawals & distributions")

	public Double getCapitalAccountWithdrawals() {
		return capitalAccountWithdrawals;
	}

	public void setCapitalAccountWithdrawals(Double capitalAccountWithdrawals) {
		this.capitalAccountWithdrawals = capitalAccountWithdrawals;
	}

	public Tax1065K1AllOf capitalAccountEnd(Double capitalAccountEnd) {
		this.capitalAccountEnd = capitalAccountEnd;
		return this;
	}

	/**
	 * Box L, Partner's capital account analysis - Ending capital account
	 * 
	 * @return capitalAccountEnd
	 */
	@ApiModelProperty(value = "Box L, Partner's capital account analysis - Ending capital account")

	public Double getCapitalAccountEnd() {
		return capitalAccountEnd;
	}

	public void setCapitalAccountEnd(Double capitalAccountEnd) {
		this.capitalAccountEnd = capitalAccountEnd;
	}

	public Tax1065K1AllOf bookTax(Boolean bookTax) {
		this.bookTax = bookTax;
		return this;
	}

	/**
	 * 2018 Box L, Tax basis (IRS removed 2019)
	 * 
	 * @return bookTax
	 */
	@ApiModelProperty(value = "2018 Box L, Tax basis (IRS removed 2019)")

	public Boolean getBookTax() {
		return bookTax;
	}

	public void setBookTax(Boolean bookTax) {
		this.bookTax = bookTax;
	}

	public Tax1065K1AllOf bookGaap(Boolean bookGaap) {
		this.bookGaap = bookGaap;
		return this;
	}

	/**
	 * 2018 Box L, GAAP (IRS removed 2019)
	 * 
	 * @return bookGaap
	 */
	@ApiModelProperty(value = "2018 Box L, GAAP (IRS removed 2019)")

	public Boolean getBookGaap() {
		return bookGaap;
	}

	public void setBookGaap(Boolean bookGaap) {
		this.bookGaap = bookGaap;
	}

	public Tax1065K1AllOf book704b(Boolean book704b) {
		this.book704b = book704b;
		return this;
	}

	/**
	 * 2018 Box L, Section 704(b) book (IRS removed 2019)
	 * 
	 * @return book704b
	 */
	@ApiModelProperty(value = "2018 Box L, Section 704(b) book (IRS removed 2019)")

	public Boolean getBook704b() {
		return book704b;
	}

	public void setBook704b(Boolean book704b) {
		this.book704b = book704b;
	}

	public Tax1065K1AllOf bookOther(Boolean bookOther) {
		this.bookOther = bookOther;
		return this;
	}

	/**
	 * 2018 Box L, Other (explain) (IRS removed 2019)
	 * 
	 * @return bookOther
	 */
	@ApiModelProperty(value = "2018 Box L, Other (explain) (IRS removed 2019)")

	public Boolean getBookOther() {
		return bookOther;
	}

	public void setBookOther(Boolean bookOther) {
		this.bookOther = bookOther;
	}

	public Tax1065K1AllOf bookOtherExplain(String bookOtherExplain) {
		this.bookOtherExplain = bookOtherExplain;
		return this;
	}

	/**
	 * 2018 Box L, Other (explain) (IRS removed 2019)
	 * 
	 * @return bookOtherExplain
	 */
	@ApiModelProperty(value = "2018 Box L, Other (explain) (IRS removed 2019)")

	public String getBookOtherExplain() {
		return bookOtherExplain;
	}

	public void setBookOtherExplain(String bookOtherExplain) {
		this.bookOtherExplain = bookOtherExplain;
	}

	public Tax1065K1AllOf builtInGain(Boolean builtInGain) {
		this.builtInGain = builtInGain;
		return this;
	}

	/**
	 * Box M, Did the partner contribute property with a built-in gain or loss? -
	 * Yes
	 * 
	 * @return builtInGain
	 */
	@ApiModelProperty(value = "Box M, Did the partner contribute property with a built-in gain or loss? - Yes")

	public Boolean getBuiltInGain() {
		return builtInGain;
	}

	public void setBuiltInGain(Boolean builtInGain) {
		this.builtInGain = builtInGain;
	}

	public Tax1065K1AllOf unrecognizedSection704Begin(Double unrecognizedSection704Begin) {
		this.unrecognizedSection704Begin = unrecognizedSection704Begin;
		return this;
	}

	/**
	 * Box N, Partner's Share of Net Unrecognized Section 704(c) Gain or (Loss) -
	 * beginning
	 * 
	 * @return unrecognizedSection704Begin
	 */
	@ApiModelProperty(value = "Box N, Partner's Share of Net Unrecognized Section 704(c) Gain or (Loss) - beginning")

	public Double getUnrecognizedSection704Begin() {
		return unrecognizedSection704Begin;
	}

	public void setUnrecognizedSection704Begin(Double unrecognizedSection704Begin) {
		this.unrecognizedSection704Begin = unrecognizedSection704Begin;
	}

	public Tax1065K1AllOf unrecognizedSection704End(Double unrecognizedSection704End) {
		this.unrecognizedSection704End = unrecognizedSection704End;
		return this;
	}

	/**
	 * Box N, Partner's Share of Net Unrecognized Section 704(c) Gain or (Loss) -
	 * ending
	 * 
	 * @return unrecognizedSection704End
	 */
	@ApiModelProperty(value = "Box N, Partner's Share of Net Unrecognized Section 704(c) Gain or (Loss) - ending")

	public Double getUnrecognizedSection704End() {
		return unrecognizedSection704End;
	}

	public void setUnrecognizedSection704End(Double unrecognizedSection704End) {
		this.unrecognizedSection704End = unrecognizedSection704End;
	}

	public Tax1065K1AllOf ordinaryIncome(Double ordinaryIncome) {
		this.ordinaryIncome = ordinaryIncome;
		return this;
	}

	/**
	 * Box 1, Ordinary business income (loss)
	 * 
	 * @return ordinaryIncome
	 */
	@ApiModelProperty(value = "Box 1, Ordinary business income (loss)")

	public Double getOrdinaryIncome() {
		return ordinaryIncome;
	}

	public void setOrdinaryIncome(Double ordinaryIncome) {
		this.ordinaryIncome = ordinaryIncome;
	}

	public Tax1065K1AllOf netRentalRealEstateIncome(Double netRentalRealEstateIncome) {
		this.netRentalRealEstateIncome = netRentalRealEstateIncome;
		return this;
	}

	/**
	 * Box 2, Net rental real estate income (loss)
	 * 
	 * @return netRentalRealEstateIncome
	 */
	@ApiModelProperty(value = "Box 2, Net rental real estate income (loss)")

	public Double getNetRentalRealEstateIncome() {
		return netRentalRealEstateIncome;
	}

	public void setNetRentalRealEstateIncome(Double netRentalRealEstateIncome) {
		this.netRentalRealEstateIncome = netRentalRealEstateIncome;
	}

	public Tax1065K1AllOf otherRentalIncome(Double otherRentalIncome) {
		this.otherRentalIncome = otherRentalIncome;
		return this;
	}

	/**
	 * Box 3, Other net rental income (loss)
	 * 
	 * @return otherRentalIncome
	 */
	@ApiModelProperty(value = "Box 3, Other net rental income (loss)")

	public Double getOtherRentalIncome() {
		return otherRentalIncome;
	}

	public void setOtherRentalIncome(Double otherRentalIncome) {
		this.otherRentalIncome = otherRentalIncome;
	}

	public Tax1065K1AllOf guaranteedPaymentServices(Double guaranteedPaymentServices) {
		this.guaranteedPaymentServices = guaranteedPaymentServices;
		return this;
	}

	/**
	 * Box 4a, Guaranteed payments for services
	 * 
	 * @return guaranteedPaymentServices
	 */
	@ApiModelProperty(value = "Box 4a, Guaranteed payments for services")

	public Double getGuaranteedPaymentServices() {
		return guaranteedPaymentServices;
	}

	public void setGuaranteedPaymentServices(Double guaranteedPaymentServices) {
		this.guaranteedPaymentServices = guaranteedPaymentServices;
	}

	public Tax1065K1AllOf guaranteedPaymentCapital(Double guaranteedPaymentCapital) {
		this.guaranteedPaymentCapital = guaranteedPaymentCapital;
		return this;
	}

	/**
	 * Box 4b, Guaranteed payments for capital
	 * 
	 * @return guaranteedPaymentCapital
	 */
	@ApiModelProperty(value = "Box 4b, Guaranteed payments for capital")

	public Double getGuaranteedPaymentCapital() {
		return guaranteedPaymentCapital;
	}

	public void setGuaranteedPaymentCapital(Double guaranteedPaymentCapital) {
		this.guaranteedPaymentCapital = guaranteedPaymentCapital;
	}

	public Tax1065K1AllOf guaranteedPayment(Double guaranteedPayment) {
		this.guaranteedPayment = guaranteedPayment;
		return this;
	}

	/**
	 * Box 4c, Total guaranteed payments
	 * 
	 * @return guaranteedPayment
	 */
	@ApiModelProperty(value = "Box 4c, Total guaranteed payments")

	public Double getGuaranteedPayment() {
		return guaranteedPayment;
	}

	public void setGuaranteedPayment(Double guaranteedPayment) {
		this.guaranteedPayment = guaranteedPayment;
	}

	public Tax1065K1AllOf interestIncome(Double interestIncome) {
		this.interestIncome = interestIncome;
		return this;
	}

	/**
	 * Box 5, Interest income
	 * 
	 * @return interestIncome
	 */
	@ApiModelProperty(value = "Box 5, Interest income")

	public Double getInterestIncome() {
		return interestIncome;
	}

	public void setInterestIncome(Double interestIncome) {
		this.interestIncome = interestIncome;
	}

	public Tax1065K1AllOf ordinaryDividends(Double ordinaryDividends) {
		this.ordinaryDividends = ordinaryDividends;
		return this;
	}

	/**
	 * Box 6a, Ordinary dividends
	 * 
	 * @return ordinaryDividends
	 */
	@ApiModelProperty(value = "Box 6a, Ordinary dividends")

	public Double getOrdinaryDividends() {
		return ordinaryDividends;
	}

	public void setOrdinaryDividends(Double ordinaryDividends) {
		this.ordinaryDividends = ordinaryDividends;
	}

	public Tax1065K1AllOf qualifiedDividends(Double qualifiedDividends) {
		this.qualifiedDividends = qualifiedDividends;
		return this;
	}

	/**
	 * Box 6b, Qualified dividends
	 * 
	 * @return qualifiedDividends
	 */
	@ApiModelProperty(value = "Box 6b, Qualified dividends")

	public Double getQualifiedDividends() {
		return qualifiedDividends;
	}

	public void setQualifiedDividends(Double qualifiedDividends) {
		this.qualifiedDividends = qualifiedDividends;
	}

	public Tax1065K1AllOf dividendEquivalents(Double dividendEquivalents) {
		this.dividendEquivalents = dividendEquivalents;
		return this;
	}

	/**
	 * Box 6c, Dividend equivalents
	 * 
	 * @return dividendEquivalents
	 */
	@ApiModelProperty(value = "Box 6c, Dividend equivalents")

	public Double getDividendEquivalents() {
		return dividendEquivalents;
	}

	public void setDividendEquivalents(Double dividendEquivalents) {
		this.dividendEquivalents = dividendEquivalents;
	}

	public Tax1065K1AllOf royalties(Double royalties) {
		this.royalties = royalties;
		return this;
	}

	/**
	 * Box 7, Royalties
	 * 
	 * @return royalties
	 */
	@ApiModelProperty(value = "Box 7, Royalties")

	public Double getRoyalties() {
		return royalties;
	}

	public void setRoyalties(Double royalties) {
		this.royalties = royalties;
	}

	public Tax1065K1AllOf netShortTermGain(Double netShortTermGain) {
		this.netShortTermGain = netShortTermGain;
		return this;
	}

	/**
	 * Box 8, Net short-term capital gain (loss)
	 * 
	 * @return netShortTermGain
	 */
	@ApiModelProperty(value = "Box 8, Net short-term capital gain (loss)")

	public Double getNetShortTermGain() {
		return netShortTermGain;
	}

	public void setNetShortTermGain(Double netShortTermGain) {
		this.netShortTermGain = netShortTermGain;
	}

	public Tax1065K1AllOf netLongTermGain(Double netLongTermGain) {
		this.netLongTermGain = netLongTermGain;
		return this;
	}

	/**
	 * Box 9a, Net long-term capital gain (loss)
	 * 
	 * @return netLongTermGain
	 */
	@ApiModelProperty(value = "Box 9a, Net long-term capital gain (loss)")

	public Double getNetLongTermGain() {
		return netLongTermGain;
	}

	public void setNetLongTermGain(Double netLongTermGain) {
		this.netLongTermGain = netLongTermGain;
	}

	public Tax1065K1AllOf collectiblesGain(Double collectiblesGain) {
		this.collectiblesGain = collectiblesGain;
		return this;
	}

	/**
	 * Box 9b, Collectibles (28%) gain (loss)
	 * 
	 * @return collectiblesGain
	 */
	@ApiModelProperty(value = "Box 9b, Collectibles (28%) gain (loss)")

	public Double getCollectiblesGain() {
		return collectiblesGain;
	}

	public void setCollectiblesGain(Double collectiblesGain) {
		this.collectiblesGain = collectiblesGain;
	}

	public Tax1065K1AllOf unrecaptured1250Gain(Double unrecaptured1250Gain) {
		this.unrecaptured1250Gain = unrecaptured1250Gain;
		return this;
	}

	/**
	 * Box 9c, Unrecaptured section 1250 gain
	 * 
	 * @return unrecaptured1250Gain
	 */
	@ApiModelProperty(value = "Box 9c, Unrecaptured section 1250 gain")

	public Double getUnrecaptured1250Gain() {
		return unrecaptured1250Gain;
	}

	public void setUnrecaptured1250Gain(Double unrecaptured1250Gain) {
		this.unrecaptured1250Gain = unrecaptured1250Gain;
	}

	public Tax1065K1AllOf net1231Gain(Double net1231Gain) {
		this.net1231Gain = net1231Gain;
		return this;
	}

	/**
	 * Box 10, Net section 1231 gain (loss)
	 * 
	 * @return net1231Gain
	 */
	@ApiModelProperty(value = "Box 10, Net section 1231 gain (loss)")

	public Double getNet1231Gain() {
		return net1231Gain;
	}

	public void setNet1231Gain(Double net1231Gain) {
		this.net1231Gain = net1231Gain;
	}

	public Tax1065K1AllOf otherIncome(List<CodeAmount> otherIncome) {
		this.otherIncome = otherIncome;
		return this;
	}

	public Tax1065K1AllOf addOtherIncomeItem(CodeAmount otherIncomeItem) {
		if (this.otherIncome == null) {
			this.otherIncome = new ArrayList<>();
		}
		this.otherIncome.add(otherIncomeItem);
		return this;
	}

	/**
	 * Box 11, Other income
	 * 
	 * @return otherIncome
	 */
	@ApiModelProperty(value = "Box 11, Other income")

	@Valid

	public List<CodeAmount> getOtherIncome() {
		return otherIncome;
	}

	public void setOtherIncome(List<CodeAmount> otherIncome) {
		this.otherIncome = otherIncome;
	}

	public Tax1065K1AllOf section179Deduction(Double section179Deduction) {
		this.section179Deduction = section179Deduction;
		return this;
	}

	/**
	 * Box 12, Section 179 deduction
	 * 
	 * @return section179Deduction
	 */
	@ApiModelProperty(value = "Box 12, Section 179 deduction")

	public Double getSection179Deduction() {
		return section179Deduction;
	}

	public void setSection179Deduction(Double section179Deduction) {
		this.section179Deduction = section179Deduction;
	}

	public Tax1065K1AllOf otherDeductions(List<CodeAmount> otherDeductions) {
		this.otherDeductions = otherDeductions;
		return this;
	}

	public Tax1065K1AllOf addOtherDeductionsItem(CodeAmount otherDeductionsItem) {
		if (this.otherDeductions == null) {
			this.otherDeductions = new ArrayList<>();
		}
		this.otherDeductions.add(otherDeductionsItem);
		return this;
	}

	/**
	 * Box 13, Other deductions
	 * 
	 * @return otherDeductions
	 */
	@ApiModelProperty(value = "Box 13, Other deductions")

	@Valid

	public List<CodeAmount> getOtherDeductions() {
		return otherDeductions;
	}

	public void setOtherDeductions(List<CodeAmount> otherDeductions) {
		this.otherDeductions = otherDeductions;
	}

	public Tax1065K1AllOf selfEmployment(List<CodeAmount> selfEmployment) {
		this.selfEmployment = selfEmployment;
		return this;
	}

	public Tax1065K1AllOf addSelfEmploymentItem(CodeAmount selfEmploymentItem) {
		if (this.selfEmployment == null) {
			this.selfEmployment = new ArrayList<>();
		}
		this.selfEmployment.add(selfEmploymentItem);
		return this;
	}

	/**
	 * Box 14, Self-employment earnings (loss)
	 * 
	 * @return selfEmployment
	 */
	@ApiModelProperty(value = "Box 14, Self-employment earnings (loss)")

	@Valid

	public List<CodeAmount> getSelfEmployment() {
		return selfEmployment;
	}

	public void setSelfEmployment(List<CodeAmount> selfEmployment) {
		this.selfEmployment = selfEmployment;
	}

	public Tax1065K1AllOf credits(List<CodeAmount> credits) {
		this.credits = credits;
		return this;
	}

	public Tax1065K1AllOf addCreditsItem(CodeAmount creditsItem) {
		if (this.credits == null) {
			this.credits = new ArrayList<>();
		}
		this.credits.add(creditsItem);
		return this;
	}

	/**
	 * Box 15, Credits
	 * 
	 * @return credits
	 */
	@ApiModelProperty(value = "Box 15, Credits")

	@Valid

	public List<CodeAmount> getCredits() {
		return credits;
	}

	public void setCredits(List<CodeAmount> credits) {
		this.credits = credits;
	}

	public Tax1065K1AllOf foreignCountry(String foreignCountry) {
		this.foreignCountry = foreignCountry;
		return this;
	}

	/**
	 * Box 16, Foreign country
	 * 
	 * @return foreignCountry
	 */
	@ApiModelProperty(value = "Box 16, Foreign country")

	public String getForeignCountry() {
		return foreignCountry;
	}

	public void setForeignCountry(String foreignCountry) {
		this.foreignCountry = foreignCountry;
	}

	public Tax1065K1AllOf foreignTransactions(List<CodeAmount> foreignTransactions) {
		this.foreignTransactions = foreignTransactions;
		return this;
	}

	public Tax1065K1AllOf addForeignTransactionsItem(CodeAmount foreignTransactionsItem) {
		if (this.foreignTransactions == null) {
			this.foreignTransactions = new ArrayList<>();
		}
		this.foreignTransactions.add(foreignTransactionsItem);
		return this;
	}

	/**
	 * Box 16, Foreign transactions
	 * 
	 * @return foreignTransactions
	 */
	@ApiModelProperty(value = "Box 16, Foreign transactions")

	@Valid

	public List<CodeAmount> getForeignTransactions() {
		return foreignTransactions;
	}

	public void setForeignTransactions(List<CodeAmount> foreignTransactions) {
		this.foreignTransactions = foreignTransactions;
	}

	public Tax1065K1AllOf amtItems(List<CodeAmount> amtItems) {
		this.amtItems = amtItems;
		return this;
	}

	public Tax1065K1AllOf addAmtItemsItem(CodeAmount amtItemsItem) {
		if (this.amtItems == null) {
			this.amtItems = new ArrayList<>();
		}
		this.amtItems.add(amtItemsItem);
		return this;
	}

	/**
	 * Box 17, Alternative minimum tax (AMT) items
	 * 
	 * @return amtItems
	 */
	@ApiModelProperty(value = "Box 17, Alternative minimum tax (AMT) items")

	@Valid

	public List<CodeAmount> getAmtItems() {
		return amtItems;
	}

	public void setAmtItems(List<CodeAmount> amtItems) {
		this.amtItems = amtItems;
	}

	public Tax1065K1AllOf taxExemptIncome(List<CodeAmount> taxExemptIncome) {
		this.taxExemptIncome = taxExemptIncome;
		return this;
	}

	public Tax1065K1AllOf addTaxExemptIncomeItem(CodeAmount taxExemptIncomeItem) {
		if (this.taxExemptIncome == null) {
			this.taxExemptIncome = new ArrayList<>();
		}
		this.taxExemptIncome.add(taxExemptIncomeItem);
		return this;
	}

	/**
	 * Box 18, Tax-exempt income and nondeductible expenses
	 * 
	 * @return taxExemptIncome
	 */
	@ApiModelProperty(value = "Box 18, Tax-exempt income and nondeductible expenses")

	@Valid

	public List<CodeAmount> getTaxExemptIncome() {
		return taxExemptIncome;
	}

	public void setTaxExemptIncome(List<CodeAmount> taxExemptIncome) {
		this.taxExemptIncome = taxExemptIncome;
	}

	public Tax1065K1AllOf distributions(List<CodeAmount> distributions) {
		this.distributions = distributions;
		return this;
	}

	public Tax1065K1AllOf addDistributionsItem(CodeAmount distributionsItem) {
		if (this.distributions == null) {
			this.distributions = new ArrayList<>();
		}
		this.distributions.add(distributionsItem);
		return this;
	}

	/**
	 * Box 19, Distributions
	 * 
	 * @return distributions
	 */
	@ApiModelProperty(value = "Box 19, Distributions")

	@Valid

	public List<CodeAmount> getDistributions() {
		return distributions;
	}

	public void setDistributions(List<CodeAmount> distributions) {
		this.distributions = distributions;
	}

	public Tax1065K1AllOf otherInfo(List<CodeAmount> otherInfo) {
		this.otherInfo = otherInfo;
		return this;
	}

	public Tax1065K1AllOf addOtherInfoItem(CodeAmount otherInfoItem) {
		if (this.otherInfo == null) {
			this.otherInfo = new ArrayList<>();
		}
		this.otherInfo.add(otherInfoItem);
		return this;
	}

	/**
	 * Box 20, Other information
	 * 
	 * @return otherInfo
	 */
	@ApiModelProperty(value = "Box 20, Other information")

	@Valid

	public List<CodeAmount> getOtherInfo() {
		return otherInfo;
	}

	public void setOtherInfo(List<CodeAmount> otherInfo) {
		this.otherInfo = otherInfo;
	}

	public Tax1065K1AllOf multipleAtRiskActivities(Boolean multipleAtRiskActivities) {
		this.multipleAtRiskActivities = multipleAtRiskActivities;
		return this;
	}

	/**
	 * Box 21, More than one activity for at-risk purposes
	 * 
	 * @return multipleAtRiskActivities
	 */
	@ApiModelProperty(value = "Box 21, More than one activity for at-risk purposes")

	public Boolean getMultipleAtRiskActivities() {
		return multipleAtRiskActivities;
	}

	public void setMultipleAtRiskActivities(Boolean multipleAtRiskActivities) {
		this.multipleAtRiskActivities = multipleAtRiskActivities;
	}

	public Tax1065K1AllOf multiplePassiveActivities(Boolean multiplePassiveActivities) {
		this.multiplePassiveActivities = multiplePassiveActivities;
		return this;
	}

	/**
	 * Box 22, More than one activity for passive activity purposes
	 * 
	 * @return multiplePassiveActivities
	 */
	@ApiModelProperty(value = "Box 22, More than one activity for passive activity purposes")

	public Boolean getMultiplePassiveActivities() {
		return multiplePassiveActivities;
	}

	public void setMultiplePassiveActivities(Boolean multiplePassiveActivities) {
		this.multiplePassiveActivities = multiplePassiveActivities;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Tax1065K1AllOf tax1065K1AllOf = (Tax1065K1AllOf) o;
		return Objects.equals(this.fiscalYearBegin, tax1065K1AllOf.fiscalYearBegin)
				&& Objects.equals(this.fiscalYearEnd, tax1065K1AllOf.fiscalYearEnd)
				&& Objects.equals(this.finalK1, tax1065K1AllOf.finalK1)
				&& Objects.equals(this.amendedK1, tax1065K1AllOf.amendedK1)
				&& Objects.equals(this.partnershipTin, tax1065K1AllOf.partnershipTin)
				&& Objects.equals(this.partnershipNameAddress, tax1065K1AllOf.partnershipNameAddress)
				&& Objects.equals(this.irsCenter, tax1065K1AllOf.irsCenter)
				&& Objects.equals(this.publiclyTraded, tax1065K1AllOf.publiclyTraded)
				&& Objects.equals(this.partnerTin, tax1065K1AllOf.partnerTin)
				&& Objects.equals(this.partnerNameAddress, tax1065K1AllOf.partnerNameAddress)
				&& Objects.equals(this.generalPartner, tax1065K1AllOf.generalPartner)
				&& Objects.equals(this.limitedPartner, tax1065K1AllOf.limitedPartner)
				&& Objects.equals(this.domestic, tax1065K1AllOf.domestic)
				&& Objects.equals(this.foreign, tax1065K1AllOf.foreign)
				&& Objects.equals(this.disregardedEntity, tax1065K1AllOf.disregardedEntity)
				&& Objects.equals(this.disregardedEntityTin, tax1065K1AllOf.disregardedEntityTin)
				&& Objects.equals(this.disregardedEntityName, tax1065K1AllOf.disregardedEntityName)
				&& Objects.equals(this.entityType, tax1065K1AllOf.entityType)
				&& Objects.equals(this.retirementPlan, tax1065K1AllOf.retirementPlan)
				&& Objects.equals(this.profitShareBegin, tax1065K1AllOf.profitShareBegin)
				&& Objects.equals(this.profitShareEnd, tax1065K1AllOf.profitShareEnd)
				&& Objects.equals(this.lossShareBegin, tax1065K1AllOf.lossShareBegin)
				&& Objects.equals(this.lossShareEnd, tax1065K1AllOf.lossShareEnd)
				&& Objects.equals(this.capitalShareBegin, tax1065K1AllOf.capitalShareBegin)
				&& Objects.equals(this.capitalShareEnd, tax1065K1AllOf.capitalShareEnd)
				&& Objects.equals(this.decreaseDueToSaleOrExchange, tax1065K1AllOf.decreaseDueToSaleOrExchange)
				&& Objects.equals(this.nonrecourseLiabilityShareBegin, tax1065K1AllOf.nonrecourseLiabilityShareBegin)
				&& Objects.equals(this.nonrecourseLiabilityShareEnd, tax1065K1AllOf.nonrecourseLiabilityShareEnd)
				&& Objects.equals(this.qualifiedLiabilityShareBegin, tax1065K1AllOf.qualifiedLiabilityShareBegin)
				&& Objects.equals(this.qualifiedLiabilityShareEnd, tax1065K1AllOf.qualifiedLiabilityShareEnd)
				&& Objects.equals(this.recourseLiabilityShareBegin, tax1065K1AllOf.recourseLiabilityShareBegin)
				&& Objects.equals(this.recourseLiabilityShareEnd, tax1065K1AllOf.recourseLiabilityShareEnd)
				&& Objects.equals(this.includesLowerTierLiability, tax1065K1AllOf.includesLowerTierLiability)
				&& Objects.equals(this.capitalAccountBegin, tax1065K1AllOf.capitalAccountBegin)
				&& Objects.equals(this.capitalAccountContributions, tax1065K1AllOf.capitalAccountContributions)
				&& Objects.equals(this.capitalAccountIncrease, tax1065K1AllOf.capitalAccountIncrease)
				&& Objects.equals(this.capitalAccountOther, tax1065K1AllOf.capitalAccountOther)
				&& Objects.equals(this.capitalAccountWithdrawals, tax1065K1AllOf.capitalAccountWithdrawals)
				&& Objects.equals(this.capitalAccountEnd, tax1065K1AllOf.capitalAccountEnd)
				&& Objects.equals(this.bookTax, tax1065K1AllOf.bookTax)
				&& Objects.equals(this.bookGaap, tax1065K1AllOf.bookGaap)
				&& Objects.equals(this.book704b, tax1065K1AllOf.book704b)
				&& Objects.equals(this.bookOther, tax1065K1AllOf.bookOther)
				&& Objects.equals(this.bookOtherExplain, tax1065K1AllOf.bookOtherExplain)
				&& Objects.equals(this.builtInGain, tax1065K1AllOf.builtInGain)
				&& Objects.equals(this.unrecognizedSection704Begin, tax1065K1AllOf.unrecognizedSection704Begin)
				&& Objects.equals(this.unrecognizedSection704End, tax1065K1AllOf.unrecognizedSection704End)
				&& Objects.equals(this.ordinaryIncome, tax1065K1AllOf.ordinaryIncome)
				&& Objects.equals(this.netRentalRealEstateIncome, tax1065K1AllOf.netRentalRealEstateIncome)
				&& Objects.equals(this.otherRentalIncome, tax1065K1AllOf.otherRentalIncome)
				&& Objects.equals(this.guaranteedPaymentServices, tax1065K1AllOf.guaranteedPaymentServices)
				&& Objects.equals(this.guaranteedPaymentCapital, tax1065K1AllOf.guaranteedPaymentCapital)
				&& Objects.equals(this.guaranteedPayment, tax1065K1AllOf.guaranteedPayment)
				&& Objects.equals(this.interestIncome, tax1065K1AllOf.interestIncome)
				&& Objects.equals(this.ordinaryDividends, tax1065K1AllOf.ordinaryDividends)
				&& Objects.equals(this.qualifiedDividends, tax1065K1AllOf.qualifiedDividends)
				&& Objects.equals(this.dividendEquivalents, tax1065K1AllOf.dividendEquivalents)
				&& Objects.equals(this.royalties, tax1065K1AllOf.royalties)
				&& Objects.equals(this.netShortTermGain, tax1065K1AllOf.netShortTermGain)
				&& Objects.equals(this.netLongTermGain, tax1065K1AllOf.netLongTermGain)
				&& Objects.equals(this.collectiblesGain, tax1065K1AllOf.collectiblesGain)
				&& Objects.equals(this.unrecaptured1250Gain, tax1065K1AllOf.unrecaptured1250Gain)
				&& Objects.equals(this.net1231Gain, tax1065K1AllOf.net1231Gain)
				&& Objects.equals(this.otherIncome, tax1065K1AllOf.otherIncome)
				&& Objects.equals(this.section179Deduction, tax1065K1AllOf.section179Deduction)
				&& Objects.equals(this.otherDeductions, tax1065K1AllOf.otherDeductions)
				&& Objects.equals(this.selfEmployment, tax1065K1AllOf.selfEmployment)
				&& Objects.equals(this.credits, tax1065K1AllOf.credits)
				&& Objects.equals(this.foreignCountry, tax1065K1AllOf.foreignCountry)
				&& Objects.equals(this.foreignTransactions, tax1065K1AllOf.foreignTransactions)
				&& Objects.equals(this.amtItems, tax1065K1AllOf.amtItems)
				&& Objects.equals(this.taxExemptIncome, tax1065K1AllOf.taxExemptIncome)
				&& Objects.equals(this.distributions, tax1065K1AllOf.distributions)
				&& Objects.equals(this.otherInfo, tax1065K1AllOf.otherInfo)
				&& Objects.equals(this.multipleAtRiskActivities, tax1065K1AllOf.multipleAtRiskActivities)
				&& Objects.equals(this.multiplePassiveActivities, tax1065K1AllOf.multiplePassiveActivities);
	}

	@Override
	public int hashCode() {
		return Objects.hash(fiscalYearBegin, fiscalYearEnd, finalK1, amendedK1, partnershipTin, partnershipNameAddress,
				irsCenter, publiclyTraded, partnerTin, partnerNameAddress, generalPartner, limitedPartner, domestic,
				foreign, disregardedEntity, disregardedEntityTin, disregardedEntityName, entityType, retirementPlan,
				profitShareBegin, profitShareEnd, lossShareBegin, lossShareEnd, capitalShareBegin, capitalShareEnd,
				decreaseDueToSaleOrExchange, nonrecourseLiabilityShareBegin, nonrecourseLiabilityShareEnd,
				qualifiedLiabilityShareBegin, qualifiedLiabilityShareEnd, recourseLiabilityShareBegin,
				recourseLiabilityShareEnd, includesLowerTierLiability, capitalAccountBegin, capitalAccountContributions,
				capitalAccountIncrease, capitalAccountOther, capitalAccountWithdrawals, capitalAccountEnd, bookTax,
				bookGaap, book704b, bookOther, bookOtherExplain, builtInGain, unrecognizedSection704Begin,
				unrecognizedSection704End, ordinaryIncome, netRentalRealEstateIncome, otherRentalIncome,
				guaranteedPaymentServices, guaranteedPaymentCapital, guaranteedPayment, interestIncome,
				ordinaryDividends, qualifiedDividends, dividendEquivalents, royalties, netShortTermGain,
				netLongTermGain, collectiblesGain, unrecaptured1250Gain, net1231Gain, otherIncome, section179Deduction,
				otherDeductions, selfEmployment, credits, foreignCountry, foreignTransactions, amtItems,
				taxExemptIncome, distributions, otherInfo, multipleAtRiskActivities, multiplePassiveActivities);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Tax1065K1AllOf {\n");

		sb.append("    fiscalYearBegin: ").append(toIndentedString(fiscalYearBegin)).append("\n");
		sb.append("    fiscalYearEnd: ").append(toIndentedString(fiscalYearEnd)).append("\n");
		sb.append("    finalK1: ").append(toIndentedString(finalK1)).append("\n");
		sb.append("    amendedK1: ").append(toIndentedString(amendedK1)).append("\n");
		sb.append("    partnershipTin: ").append(toIndentedString(partnershipTin)).append("\n");
		sb.append("    partnershipNameAddress: ").append(toIndentedString(partnershipNameAddress)).append("\n");
		sb.append("    irsCenter: ").append(toIndentedString(irsCenter)).append("\n");
		sb.append("    publiclyTraded: ").append(toIndentedString(publiclyTraded)).append("\n");
		sb.append("    partnerTin: ").append(toIndentedString(partnerTin)).append("\n");
		sb.append("    partnerNameAddress: ").append(toIndentedString(partnerNameAddress)).append("\n");
		sb.append("    generalPartner: ").append(toIndentedString(generalPartner)).append("\n");
		sb.append("    limitedPartner: ").append(toIndentedString(limitedPartner)).append("\n");
		sb.append("    domestic: ").append(toIndentedString(domestic)).append("\n");
		sb.append("    foreign: ").append(toIndentedString(foreign)).append("\n");
		sb.append("    disregardedEntity: ").append(toIndentedString(disregardedEntity)).append("\n");
		sb.append("    disregardedEntityTin: ").append(toIndentedString(disregardedEntityTin)).append("\n");
		sb.append("    disregardedEntityName: ").append(toIndentedString(disregardedEntityName)).append("\n");
		sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
		sb.append("    retirementPlan: ").append(toIndentedString(retirementPlan)).append("\n");
		sb.append("    profitShareBegin: ").append(toIndentedString(profitShareBegin)).append("\n");
		sb.append("    profitShareEnd: ").append(toIndentedString(profitShareEnd)).append("\n");
		sb.append("    lossShareBegin: ").append(toIndentedString(lossShareBegin)).append("\n");
		sb.append("    lossShareEnd: ").append(toIndentedString(lossShareEnd)).append("\n");
		sb.append("    capitalShareBegin: ").append(toIndentedString(capitalShareBegin)).append("\n");
		sb.append("    capitalShareEnd: ").append(toIndentedString(capitalShareEnd)).append("\n");
		sb.append("    decreaseDueToSaleOrExchange: ").append(toIndentedString(decreaseDueToSaleOrExchange))
				.append("\n");
		sb.append("    nonrecourseLiabilityShareBegin: ").append(toIndentedString(nonrecourseLiabilityShareBegin))
				.append("\n");
		sb.append("    nonrecourseLiabilityShareEnd: ").append(toIndentedString(nonrecourseLiabilityShareEnd))
				.append("\n");
		sb.append("    qualifiedLiabilityShareBegin: ").append(toIndentedString(qualifiedLiabilityShareBegin))
				.append("\n");
		sb.append("    qualifiedLiabilityShareEnd: ").append(toIndentedString(qualifiedLiabilityShareEnd)).append("\n");
		sb.append("    recourseLiabilityShareBegin: ").append(toIndentedString(recourseLiabilityShareBegin))
				.append("\n");
		sb.append("    recourseLiabilityShareEnd: ").append(toIndentedString(recourseLiabilityShareEnd)).append("\n");
		sb.append("    includesLowerTierLiability: ").append(toIndentedString(includesLowerTierLiability)).append("\n");
		sb.append("    capitalAccountBegin: ").append(toIndentedString(capitalAccountBegin)).append("\n");
		sb.append("    capitalAccountContributions: ").append(toIndentedString(capitalAccountContributions))
				.append("\n");
		sb.append("    capitalAccountIncrease: ").append(toIndentedString(capitalAccountIncrease)).append("\n");
		sb.append("    capitalAccountOther: ").append(toIndentedString(capitalAccountOther)).append("\n");
		sb.append("    capitalAccountWithdrawals: ").append(toIndentedString(capitalAccountWithdrawals)).append("\n");
		sb.append("    capitalAccountEnd: ").append(toIndentedString(capitalAccountEnd)).append("\n");
		sb.append("    bookTax: ").append(toIndentedString(bookTax)).append("\n");
		sb.append("    bookGaap: ").append(toIndentedString(bookGaap)).append("\n");
		sb.append("    book704b: ").append(toIndentedString(book704b)).append("\n");
		sb.append("    bookOther: ").append(toIndentedString(bookOther)).append("\n");
		sb.append("    bookOtherExplain: ").append(toIndentedString(bookOtherExplain)).append("\n");
		sb.append("    builtInGain: ").append(toIndentedString(builtInGain)).append("\n");
		sb.append("    unrecognizedSection704Begin: ").append(toIndentedString(unrecognizedSection704Begin))
				.append("\n");
		sb.append("    unrecognizedSection704End: ").append(toIndentedString(unrecognizedSection704End)).append("\n");
		sb.append("    ordinaryIncome: ").append(toIndentedString(ordinaryIncome)).append("\n");
		sb.append("    netRentalRealEstateIncome: ").append(toIndentedString(netRentalRealEstateIncome)).append("\n");
		sb.append("    otherRentalIncome: ").append(toIndentedString(otherRentalIncome)).append("\n");
		sb.append("    guaranteedPaymentServices: ").append(toIndentedString(guaranteedPaymentServices)).append("\n");
		sb.append("    guaranteedPaymentCapital: ").append(toIndentedString(guaranteedPaymentCapital)).append("\n");
		sb.append("    guaranteedPayment: ").append(toIndentedString(guaranteedPayment)).append("\n");
		sb.append("    interestIncome: ").append(toIndentedString(interestIncome)).append("\n");
		sb.append("    ordinaryDividends: ").append(toIndentedString(ordinaryDividends)).append("\n");
		sb.append("    qualifiedDividends: ").append(toIndentedString(qualifiedDividends)).append("\n");
		sb.append("    dividendEquivalents: ").append(toIndentedString(dividendEquivalents)).append("\n");
		sb.append("    royalties: ").append(toIndentedString(royalties)).append("\n");
		sb.append("    netShortTermGain: ").append(toIndentedString(netShortTermGain)).append("\n");
		sb.append("    netLongTermGain: ").append(toIndentedString(netLongTermGain)).append("\n");
		sb.append("    collectiblesGain: ").append(toIndentedString(collectiblesGain)).append("\n");
		sb.append("    unrecaptured1250Gain: ").append(toIndentedString(unrecaptured1250Gain)).append("\n");
		sb.append("    net1231Gain: ").append(toIndentedString(net1231Gain)).append("\n");
		sb.append("    otherIncome: ").append(toIndentedString(otherIncome)).append("\n");
		sb.append("    section179Deduction: ").append(toIndentedString(section179Deduction)).append("\n");
		sb.append("    otherDeductions: ").append(toIndentedString(otherDeductions)).append("\n");
		sb.append("    selfEmployment: ").append(toIndentedString(selfEmployment)).append("\n");
		sb.append("    credits: ").append(toIndentedString(credits)).append("\n");
		sb.append("    foreignCountry: ").append(toIndentedString(foreignCountry)).append("\n");
		sb.append("    foreignTransactions: ").append(toIndentedString(foreignTransactions)).append("\n");
		sb.append("    amtItems: ").append(toIndentedString(amtItems)).append("\n");
		sb.append("    taxExemptIncome: ").append(toIndentedString(taxExemptIncome)).append("\n");
		sb.append("    distributions: ").append(toIndentedString(distributions)).append("\n");
		sb.append("    otherInfo: ").append(toIndentedString(otherInfo)).append("\n");
		sb.append("    multipleAtRiskActivities: ").append(toIndentedString(multipleAtRiskActivities)).append("\n");
		sb.append("    multiplePassiveActivities: ").append(toIndentedString(multiplePassiveActivities)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
