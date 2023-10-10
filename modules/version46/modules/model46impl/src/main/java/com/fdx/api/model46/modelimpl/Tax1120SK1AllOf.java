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
 * Tax1120SK1AllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1120SK1AllOf {
	@JsonProperty("finalK1")
	@JsonInclude(Include.NON_NULL)
	private Boolean finalK1;

	@JsonProperty("amendedK1")
	@JsonInclude(Include.NON_NULL)
	private Boolean amendedK1;

	@JsonProperty("fiscalYearBegin")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private LocalDate fiscalYearBegin;

	@JsonProperty("fiscalYearEnd")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private LocalDate fiscalYearEnd;

	@JsonProperty("corporationTin")
	private String corporationTin;

	@JsonProperty("corporationNameAddress")
	private NameAddress corporationNameAddress;

	@JsonProperty("irsCenter")
	private String irsCenter;

	@JsonProperty("shareholderTin")
	private String shareholderTin;

	@JsonProperty("shareholderNameAddress")
	private NameAddress shareholderNameAddress;

	@JsonProperty("percentOwnership")
	private Double percentOwnership;

	@JsonProperty("beginningShares")
	private Double beginningShares;

	@JsonProperty("endingShares")
	private Double endingShares;

	@JsonProperty("beginningLoans")
	private Double beginningLoans;

	@JsonProperty("endingLoans")
	private Double endingLoans;

	@JsonProperty("ordinaryIncome")
	private Double ordinaryIncome;

	@JsonProperty("netRentalRealEstateIncome")
	private Double netRentalRealEstateIncome;

	@JsonProperty("otherRentalIncome")
	private Double otherRentalIncome;

	@JsonProperty("interestIncome")
	private Double interestIncome;

	@JsonProperty("ordinaryDividends")
	private Double ordinaryDividends;

	@JsonProperty("qualifiedDividends")
	private Double qualifiedDividends;

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

	@JsonProperty("credits")
	@Valid
	private List<CodeAmount> credits = null;

	@JsonProperty("foreignTransactions")
	@Valid
	private List<CodeAmount> foreignTransactions = null;

	@JsonProperty("foreignCountry")
	private String foreignCountry;

	@JsonProperty("amtItems")
	@Valid
	private List<CodeAmount> amtItems = null;

	@JsonProperty("basisItems")
	@Valid
	private List<CodeAmount> basisItems = null;

	@JsonProperty("otherInfo")
	@Valid
	private List<CodeAmount> otherInfo = null;

	@JsonProperty("multipleAtRiskActivities")
	@JsonInclude(Include.NON_NULL)
	private Boolean multipleAtRiskActivities;

	@JsonProperty("multiplePassiveActivities")
	@JsonInclude(Include.NON_NULL)
	private Boolean multiplePassiveActivities;

	public Tax1120SK1AllOf finalK1(Boolean finalK1) {
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

	public Tax1120SK1AllOf amendedK1(Boolean amendedK1) {
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

	public Tax1120SK1AllOf fiscalYearBegin(LocalDate fiscalYearBegin) {
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

	public Tax1120SK1AllOf fiscalYearEnd(LocalDate fiscalYearEnd) {
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

	public Tax1120SK1AllOf corporationTin(String corporationTin) {
		this.corporationTin = corporationTin;
		return this;
	}

	/**
	 * Box A, Corporation's employer identification number
	 * 
	 * @return corporationTin
	 */
	@ApiModelProperty(value = "Box A, Corporation's employer identification number")

	public String getCorporationTin() {
		return corporationTin;
	}

	public void setCorporationTin(String corporationTin) {
		this.corporationTin = corporationTin;
	}

	public Tax1120SK1AllOf corporationNameAddress(NameAddress corporationNameAddress) {
		this.corporationNameAddress = corporationNameAddress;
		return this;
	}

	/**
	 * Get corporationNameAddress
	 * 
	 * @return corporationNameAddress
	 */
	@ApiModelProperty(value = "")

	@Valid

	public NameAddress getCorporationNameAddress() {
		return corporationNameAddress;
	}

	public void setCorporationNameAddress(NameAddress corporationNameAddress) {
		this.corporationNameAddress = corporationNameAddress;
	}

	public Tax1120SK1AllOf irsCenter(String irsCenter) {
		this.irsCenter = irsCenter;
		return this;
	}

	/**
	 * Box C, IRS Center where corporation filed return
	 * 
	 * @return irsCenter
	 */
	@ApiModelProperty(value = "Box C, IRS Center where corporation filed return")

	public String getIrsCenter() {
		return irsCenter;
	}

	public void setIrsCenter(String irsCenter) {
		this.irsCenter = irsCenter;
	}

	public Tax1120SK1AllOf shareholderTin(String shareholderTin) {
		this.shareholderTin = shareholderTin;
		return this;
	}

	/**
	 * Box D, Shareholder's identifying number
	 * 
	 * @return shareholderTin
	 */
	@ApiModelProperty(value = "Box D, Shareholder's identifying number")

	public String getShareholderTin() {
		return shareholderTin;
	}

	public void setShareholderTin(String shareholderTin) {
		this.shareholderTin = shareholderTin;
	}

	public Tax1120SK1AllOf shareholderNameAddress(NameAddress shareholderNameAddress) {
		this.shareholderNameAddress = shareholderNameAddress;
		return this;
	}

	/**
	 * Get shareholderNameAddress
	 * 
	 * @return shareholderNameAddress
	 */
	@ApiModelProperty(value = "")

	@Valid

	public NameAddress getShareholderNameAddress() {
		return shareholderNameAddress;
	}

	public void setShareholderNameAddress(NameAddress shareholderNameAddress) {
		this.shareholderNameAddress = shareholderNameAddress;
	}

	public Tax1120SK1AllOf percentOwnership(Double percentOwnership) {
		this.percentOwnership = percentOwnership;
		return this;
	}

	/**
	 * Box F, Current year allocation percentage
	 * 
	 * @return percentOwnership
	 */
	@ApiModelProperty(value = "Box F, Current year allocation percentage")

	public Double getPercentOwnership() {
		return percentOwnership;
	}

	public void setPercentOwnership(Double percentOwnership) {
		this.percentOwnership = percentOwnership;
	}

	public Tax1120SK1AllOf beginningShares(Double beginningShares) {
		this.beginningShares = beginningShares;
		return this;
	}

	/**
	 * Box G, Shareholder's number of shares, Beginning of tax year
	 * 
	 * @return beginningShares
	 */
	@ApiModelProperty(value = "Box G, Shareholder's number of shares, Beginning of tax year")

	public Double getBeginningShares() {
		return beginningShares;
	}

	public void setBeginningShares(Double beginningShares) {
		this.beginningShares = beginningShares;
	}

	public Tax1120SK1AllOf endingShares(Double endingShares) {
		this.endingShares = endingShares;
		return this;
	}

	/**
	 * Box G, Shareholder's number of shares, End of tax year
	 * 
	 * @return endingShares
	 */
	@ApiModelProperty(value = "Box G, Shareholder's number of shares, End of tax year")

	public Double getEndingShares() {
		return endingShares;
	}

	public void setEndingShares(Double endingShares) {
		this.endingShares = endingShares;
	}

	public Tax1120SK1AllOf beginningLoans(Double beginningLoans) {
		this.beginningLoans = beginningLoans;
		return this;
	}

	/**
	 * Box H, Loans from shareholder, Beginning of tax year
	 * 
	 * @return beginningLoans
	 */
	@ApiModelProperty(value = "Box H, Loans from shareholder, Beginning of tax year")

	public Double getBeginningLoans() {
		return beginningLoans;
	}

	public void setBeginningLoans(Double beginningLoans) {
		this.beginningLoans = beginningLoans;
	}

	public Tax1120SK1AllOf endingLoans(Double endingLoans) {
		this.endingLoans = endingLoans;
		return this;
	}

	/**
	 * Box H, Loans from shareholder, Ending of tax year
	 * 
	 * @return endingLoans
	 */
	@ApiModelProperty(value = "Box H, Loans from shareholder, Ending of tax year")

	public Double getEndingLoans() {
		return endingLoans;
	}

	public void setEndingLoans(Double endingLoans) {
		this.endingLoans = endingLoans;
	}

	public Tax1120SK1AllOf ordinaryIncome(Double ordinaryIncome) {
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

	public Tax1120SK1AllOf netRentalRealEstateIncome(Double netRentalRealEstateIncome) {
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

	public Tax1120SK1AllOf otherRentalIncome(Double otherRentalIncome) {
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

	public Tax1120SK1AllOf interestIncome(Double interestIncome) {
		this.interestIncome = interestIncome;
		return this;
	}

	/**
	 * Box 4, Interest income
	 * 
	 * @return interestIncome
	 */
	@ApiModelProperty(value = "Box 4, Interest income")

	public Double getInterestIncome() {
		return interestIncome;
	}

	public void setInterestIncome(Double interestIncome) {
		this.interestIncome = interestIncome;
	}

	public Tax1120SK1AllOf ordinaryDividends(Double ordinaryDividends) {
		this.ordinaryDividends = ordinaryDividends;
		return this;
	}

	/**
	 * Box 5a, Ordinary dividends
	 * 
	 * @return ordinaryDividends
	 */
	@ApiModelProperty(value = "Box 5a, Ordinary dividends")

	public Double getOrdinaryDividends() {
		return ordinaryDividends;
	}

	public void setOrdinaryDividends(Double ordinaryDividends) {
		this.ordinaryDividends = ordinaryDividends;
	}

	public Tax1120SK1AllOf qualifiedDividends(Double qualifiedDividends) {
		this.qualifiedDividends = qualifiedDividends;
		return this;
	}

	/**
	 * Box 5b, Qualified dividends
	 * 
	 * @return qualifiedDividends
	 */
	@ApiModelProperty(value = "Box 5b, Qualified dividends")

	public Double getQualifiedDividends() {
		return qualifiedDividends;
	}

	public void setQualifiedDividends(Double qualifiedDividends) {
		this.qualifiedDividends = qualifiedDividends;
	}

	public Tax1120SK1AllOf royalties(Double royalties) {
		this.royalties = royalties;
		return this;
	}

	/**
	 * Box 6, Royalties
	 * 
	 * @return royalties
	 */
	@ApiModelProperty(value = "Box 6, Royalties")

	public Double getRoyalties() {
		return royalties;
	}

	public void setRoyalties(Double royalties) {
		this.royalties = royalties;
	}

	public Tax1120SK1AllOf netShortTermGain(Double netShortTermGain) {
		this.netShortTermGain = netShortTermGain;
		return this;
	}

	/**
	 * Box 7, Net short-term capital gain (loss)
	 * 
	 * @return netShortTermGain
	 */
	@ApiModelProperty(value = "Box 7, Net short-term capital gain (loss)")

	public Double getNetShortTermGain() {
		return netShortTermGain;
	}

	public void setNetShortTermGain(Double netShortTermGain) {
		this.netShortTermGain = netShortTermGain;
	}

	public Tax1120SK1AllOf netLongTermGain(Double netLongTermGain) {
		this.netLongTermGain = netLongTermGain;
		return this;
	}

	/**
	 * Box 8a, Net long-term capital gain (loss)
	 * 
	 * @return netLongTermGain
	 */
	@ApiModelProperty(value = "Box 8a, Net long-term capital gain (loss)")

	public Double getNetLongTermGain() {
		return netLongTermGain;
	}

	public void setNetLongTermGain(Double netLongTermGain) {
		this.netLongTermGain = netLongTermGain;
	}

	public Tax1120SK1AllOf collectiblesGain(Double collectiblesGain) {
		this.collectiblesGain = collectiblesGain;
		return this;
	}

	/**
	 * Box 8b, Collectibles (28%) gain (loss)
	 * 
	 * @return collectiblesGain
	 */
	@ApiModelProperty(value = "Box 8b, Collectibles (28%) gain (loss)")

	public Double getCollectiblesGain() {
		return collectiblesGain;
	}

	public void setCollectiblesGain(Double collectiblesGain) {
		this.collectiblesGain = collectiblesGain;
	}

	public Tax1120SK1AllOf unrecaptured1250Gain(Double unrecaptured1250Gain) {
		this.unrecaptured1250Gain = unrecaptured1250Gain;
		return this;
	}

	/**
	 * Box 8c, Unrecaptured section 1250 gain
	 * 
	 * @return unrecaptured1250Gain
	 */
	@ApiModelProperty(value = "Box 8c, Unrecaptured section 1250 gain")

	public Double getUnrecaptured1250Gain() {
		return unrecaptured1250Gain;
	}

	public void setUnrecaptured1250Gain(Double unrecaptured1250Gain) {
		this.unrecaptured1250Gain = unrecaptured1250Gain;
	}

	public Tax1120SK1AllOf net1231Gain(Double net1231Gain) {
		this.net1231Gain = net1231Gain;
		return this;
	}

	/**
	 * Box 9, Net section 1231 gain (loss)
	 * 
	 * @return net1231Gain
	 */
	@ApiModelProperty(value = "Box 9, Net section 1231 gain (loss)")

	public Double getNet1231Gain() {
		return net1231Gain;
	}

	public void setNet1231Gain(Double net1231Gain) {
		this.net1231Gain = net1231Gain;
	}

	public Tax1120SK1AllOf otherIncome(List<CodeAmount> otherIncome) {
		this.otherIncome = otherIncome;
		return this;
	}

	public Tax1120SK1AllOf addOtherIncomeItem(CodeAmount otherIncomeItem) {
		if (this.otherIncome == null) {
			this.otherIncome = new ArrayList<>();
		}
		this.otherIncome.add(otherIncomeItem);
		return this;
	}

	/**
	 * Box 10, Other income (loss)
	 * 
	 * @return otherIncome
	 */
	@ApiModelProperty(value = "Box 10, Other income (loss)")

	@Valid

	public List<CodeAmount> getOtherIncome() {
		return otherIncome;
	}

	public void setOtherIncome(List<CodeAmount> otherIncome) {
		this.otherIncome = otherIncome;
	}

	public Tax1120SK1AllOf section179Deduction(Double section179Deduction) {
		this.section179Deduction = section179Deduction;
		return this;
	}

	/**
	 * Box 11, Section 179 deduction
	 * 
	 * @return section179Deduction
	 */
	@ApiModelProperty(value = "Box 11, Section 179 deduction")

	public Double getSection179Deduction() {
		return section179Deduction;
	}

	public void setSection179Deduction(Double section179Deduction) {
		this.section179Deduction = section179Deduction;
	}

	public Tax1120SK1AllOf otherDeductions(List<CodeAmount> otherDeductions) {
		this.otherDeductions = otherDeductions;
		return this;
	}

	public Tax1120SK1AllOf addOtherDeductionsItem(CodeAmount otherDeductionsItem) {
		if (this.otherDeductions == null) {
			this.otherDeductions = new ArrayList<>();
		}
		this.otherDeductions.add(otherDeductionsItem);
		return this;
	}

	/**
	 * Box 12, Other deductions
	 * 
	 * @return otherDeductions
	 */
	@ApiModelProperty(value = "Box 12, Other deductions")

	@Valid

	public List<CodeAmount> getOtherDeductions() {
		return otherDeductions;
	}

	public void setOtherDeductions(List<CodeAmount> otherDeductions) {
		this.otherDeductions = otherDeductions;
	}

	public Tax1120SK1AllOf credits(List<CodeAmount> credits) {
		this.credits = credits;
		return this;
	}

	public Tax1120SK1AllOf addCreditsItem(CodeAmount creditsItem) {
		if (this.credits == null) {
			this.credits = new ArrayList<>();
		}
		this.credits.add(creditsItem);
		return this;
	}

	/**
	 * Box 13, Credits
	 * 
	 * @return credits
	 */
	@ApiModelProperty(value = "Box 13, Credits")

	@Valid

	public List<CodeAmount> getCredits() {
		return credits;
	}

	public void setCredits(List<CodeAmount> credits) {
		this.credits = credits;
	}

	public Tax1120SK1AllOf foreignTransactions(List<CodeAmount> foreignTransactions) {
		this.foreignTransactions = foreignTransactions;
		return this;
	}

	public Tax1120SK1AllOf addForeignTransactionsItem(CodeAmount foreignTransactionsItem) {
		if (this.foreignTransactions == null) {
			this.foreignTransactions = new ArrayList<>();
		}
		this.foreignTransactions.add(foreignTransactionsItem);
		return this;
	}

	/**
	 * Box 14, Foreign transactions
	 * 
	 * @return foreignTransactions
	 */
	@ApiModelProperty(value = "Box 14, Foreign transactions")

	@Valid

	public List<CodeAmount> getForeignTransactions() {
		return foreignTransactions;
	}

	public void setForeignTransactions(List<CodeAmount> foreignTransactions) {
		this.foreignTransactions = foreignTransactions;
	}

	public Tax1120SK1AllOf foreignCountry(String foreignCountry) {
		this.foreignCountry = foreignCountry;
		return this;
	}

	/**
	 * Box 14, Foreign country
	 * 
	 * @return foreignCountry
	 */
	@ApiModelProperty(value = "Box 14, Foreign country")

	public String getForeignCountry() {
		return foreignCountry;
	}

	public void setForeignCountry(String foreignCountry) {
		this.foreignCountry = foreignCountry;
	}

	public Tax1120SK1AllOf amtItems(List<CodeAmount> amtItems) {
		this.amtItems = amtItems;
		return this;
	}

	public Tax1120SK1AllOf addAmtItemsItem(CodeAmount amtItemsItem) {
		if (this.amtItems == null) {
			this.amtItems = new ArrayList<>();
		}
		this.amtItems.add(amtItemsItem);
		return this;
	}

	/**
	 * Box 15, Alternative minimum tax (AMT) items
	 * 
	 * @return amtItems
	 */
	@ApiModelProperty(value = "Box 15, Alternative minimum tax (AMT) items")

	@Valid

	public List<CodeAmount> getAmtItems() {
		return amtItems;
	}

	public void setAmtItems(List<CodeAmount> amtItems) {
		this.amtItems = amtItems;
	}

	public Tax1120SK1AllOf basisItems(List<CodeAmount> basisItems) {
		this.basisItems = basisItems;
		return this;
	}

	public Tax1120SK1AllOf addBasisItemsItem(CodeAmount basisItemsItem) {
		if (this.basisItems == null) {
			this.basisItems = new ArrayList<>();
		}
		this.basisItems.add(basisItemsItem);
		return this;
	}

	/**
	 * Box 16, Items affecting shareholder basis
	 * 
	 * @return basisItems
	 */
	@ApiModelProperty(value = "Box 16, Items affecting shareholder basis")

	@Valid

	public List<CodeAmount> getBasisItems() {
		return basisItems;
	}

	public void setBasisItems(List<CodeAmount> basisItems) {
		this.basisItems = basisItems;
	}

	public Tax1120SK1AllOf otherInfo(List<CodeAmount> otherInfo) {
		this.otherInfo = otherInfo;
		return this;
	}

	public Tax1120SK1AllOf addOtherInfoItem(CodeAmount otherInfoItem) {
		if (this.otherInfo == null) {
			this.otherInfo = new ArrayList<>();
		}
		this.otherInfo.add(otherInfoItem);
		return this;
	}

	/**
	 * Box 17, Other information
	 * 
	 * @return otherInfo
	 */
	@ApiModelProperty(value = "Box 17, Other information")

	@Valid

	public List<CodeAmount> getOtherInfo() {
		return otherInfo;
	}

	public void setOtherInfo(List<CodeAmount> otherInfo) {
		this.otherInfo = otherInfo;
	}

	public Tax1120SK1AllOf multipleAtRiskActivities(Boolean multipleAtRiskActivities) {
		this.multipleAtRiskActivities = multipleAtRiskActivities;
		return this;
	}

	/**
	 * Box 18, More than one activity for at-risk purposes
	 * 
	 * @return multipleAtRiskActivities
	 */
	@ApiModelProperty(value = "Box 18, More than one activity for at-risk purposes")

	public Boolean getMultipleAtRiskActivities() {
		return multipleAtRiskActivities;
	}

	public void setMultipleAtRiskActivities(Boolean multipleAtRiskActivities) {
		this.multipleAtRiskActivities = multipleAtRiskActivities;
	}

	public Tax1120SK1AllOf multiplePassiveActivities(Boolean multiplePassiveActivities) {
		this.multiplePassiveActivities = multiplePassiveActivities;
		return this;
	}

	/**
	 * Box 19, More than one activity for passive activity purposes
	 * 
	 * @return multiplePassiveActivities
	 */
	@ApiModelProperty(value = "Box 19, More than one activity for passive activity purposes")

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
		Tax1120SK1AllOf tax1120SK1AllOf = (Tax1120SK1AllOf) o;
		return Objects.equals(this.finalK1, tax1120SK1AllOf.finalK1)
				&& Objects.equals(this.amendedK1, tax1120SK1AllOf.amendedK1)
				&& Objects.equals(this.fiscalYearBegin, tax1120SK1AllOf.fiscalYearBegin)
				&& Objects.equals(this.fiscalYearEnd, tax1120SK1AllOf.fiscalYearEnd)
				&& Objects.equals(this.corporationTin, tax1120SK1AllOf.corporationTin)
				&& Objects.equals(this.corporationNameAddress, tax1120SK1AllOf.corporationNameAddress)
				&& Objects.equals(this.irsCenter, tax1120SK1AllOf.irsCenter)
				&& Objects.equals(this.shareholderTin, tax1120SK1AllOf.shareholderTin)
				&& Objects.equals(this.shareholderNameAddress, tax1120SK1AllOf.shareholderNameAddress)
				&& Objects.equals(this.percentOwnership, tax1120SK1AllOf.percentOwnership)
				&& Objects.equals(this.beginningShares, tax1120SK1AllOf.beginningShares)
				&& Objects.equals(this.endingShares, tax1120SK1AllOf.endingShares)
				&& Objects.equals(this.beginningLoans, tax1120SK1AllOf.beginningLoans)
				&& Objects.equals(this.endingLoans, tax1120SK1AllOf.endingLoans)
				&& Objects.equals(this.ordinaryIncome, tax1120SK1AllOf.ordinaryIncome)
				&& Objects.equals(this.netRentalRealEstateIncome, tax1120SK1AllOf.netRentalRealEstateIncome)
				&& Objects.equals(this.otherRentalIncome, tax1120SK1AllOf.otherRentalIncome)
				&& Objects.equals(this.interestIncome, tax1120SK1AllOf.interestIncome)
				&& Objects.equals(this.ordinaryDividends, tax1120SK1AllOf.ordinaryDividends)
				&& Objects.equals(this.qualifiedDividends, tax1120SK1AllOf.qualifiedDividends)
				&& Objects.equals(this.royalties, tax1120SK1AllOf.royalties)
				&& Objects.equals(this.netShortTermGain, tax1120SK1AllOf.netShortTermGain)
				&& Objects.equals(this.netLongTermGain, tax1120SK1AllOf.netLongTermGain)
				&& Objects.equals(this.collectiblesGain, tax1120SK1AllOf.collectiblesGain)
				&& Objects.equals(this.unrecaptured1250Gain, tax1120SK1AllOf.unrecaptured1250Gain)
				&& Objects.equals(this.net1231Gain, tax1120SK1AllOf.net1231Gain)
				&& Objects.equals(this.otherIncome, tax1120SK1AllOf.otherIncome)
				&& Objects.equals(this.section179Deduction, tax1120SK1AllOf.section179Deduction)
				&& Objects.equals(this.otherDeductions, tax1120SK1AllOf.otherDeductions)
				&& Objects.equals(this.credits, tax1120SK1AllOf.credits)
				&& Objects.equals(this.foreignTransactions, tax1120SK1AllOf.foreignTransactions)
				&& Objects.equals(this.foreignCountry, tax1120SK1AllOf.foreignCountry)
				&& Objects.equals(this.amtItems, tax1120SK1AllOf.amtItems)
				&& Objects.equals(this.basisItems, tax1120SK1AllOf.basisItems)
				&& Objects.equals(this.otherInfo, tax1120SK1AllOf.otherInfo)
				&& Objects.equals(this.multipleAtRiskActivities, tax1120SK1AllOf.multipleAtRiskActivities)
				&& Objects.equals(this.multiplePassiveActivities, tax1120SK1AllOf.multiplePassiveActivities);
	}

	@Override
	public int hashCode() {
		return Objects.hash(finalK1, amendedK1, fiscalYearBegin, fiscalYearEnd, corporationTin, corporationNameAddress,
				irsCenter, shareholderTin, shareholderNameAddress, percentOwnership, beginningShares, endingShares,
				beginningLoans, endingLoans, ordinaryIncome, netRentalRealEstateIncome, otherRentalIncome,
				interestIncome, ordinaryDividends, qualifiedDividends, royalties, netShortTermGain, netLongTermGain,
				collectiblesGain, unrecaptured1250Gain, net1231Gain, otherIncome, section179Deduction, otherDeductions,
				credits, foreignTransactions, foreignCountry, amtItems, basisItems, otherInfo, multipleAtRiskActivities,
				multiplePassiveActivities);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Tax1120SK1AllOf {\n");

		sb.append("    finalK1: ").append(toIndentedString(finalK1)).append("\n");
		sb.append("    amendedK1: ").append(toIndentedString(amendedK1)).append("\n");
		sb.append("    fiscalYearBegin: ").append(toIndentedString(fiscalYearBegin)).append("\n");
		sb.append("    fiscalYearEnd: ").append(toIndentedString(fiscalYearEnd)).append("\n");
		sb.append("    corporationTin: ").append(toIndentedString(corporationTin)).append("\n");
		sb.append("    corporationNameAddress: ").append(toIndentedString(corporationNameAddress)).append("\n");
		sb.append("    irsCenter: ").append(toIndentedString(irsCenter)).append("\n");
		sb.append("    shareholderTin: ").append(toIndentedString(shareholderTin)).append("\n");
		sb.append("    shareholderNameAddress: ").append(toIndentedString(shareholderNameAddress)).append("\n");
		sb.append("    percentOwnership: ").append(toIndentedString(percentOwnership)).append("\n");
		sb.append("    beginningShares: ").append(toIndentedString(beginningShares)).append("\n");
		sb.append("    endingShares: ").append(toIndentedString(endingShares)).append("\n");
		sb.append("    beginningLoans: ").append(toIndentedString(beginningLoans)).append("\n");
		sb.append("    endingLoans: ").append(toIndentedString(endingLoans)).append("\n");
		sb.append("    ordinaryIncome: ").append(toIndentedString(ordinaryIncome)).append("\n");
		sb.append("    netRentalRealEstateIncome: ").append(toIndentedString(netRentalRealEstateIncome)).append("\n");
		sb.append("    otherRentalIncome: ").append(toIndentedString(otherRentalIncome)).append("\n");
		sb.append("    interestIncome: ").append(toIndentedString(interestIncome)).append("\n");
		sb.append("    ordinaryDividends: ").append(toIndentedString(ordinaryDividends)).append("\n");
		sb.append("    qualifiedDividends: ").append(toIndentedString(qualifiedDividends)).append("\n");
		sb.append("    royalties: ").append(toIndentedString(royalties)).append("\n");
		sb.append("    netShortTermGain: ").append(toIndentedString(netShortTermGain)).append("\n");
		sb.append("    netLongTermGain: ").append(toIndentedString(netLongTermGain)).append("\n");
		sb.append("    collectiblesGain: ").append(toIndentedString(collectiblesGain)).append("\n");
		sb.append("    unrecaptured1250Gain: ").append(toIndentedString(unrecaptured1250Gain)).append("\n");
		sb.append("    net1231Gain: ").append(toIndentedString(net1231Gain)).append("\n");
		sb.append("    otherIncome: ").append(toIndentedString(otherIncome)).append("\n");
		sb.append("    section179Deduction: ").append(toIndentedString(section179Deduction)).append("\n");
		sb.append("    otherDeductions: ").append(toIndentedString(otherDeductions)).append("\n");
		sb.append("    credits: ").append(toIndentedString(credits)).append("\n");
		sb.append("    foreignTransactions: ").append(toIndentedString(foreignTransactions)).append("\n");
		sb.append("    foreignCountry: ").append(toIndentedString(foreignCountry)).append("\n");
		sb.append("    amtItems: ").append(toIndentedString(amtItems)).append("\n");
		sb.append("    basisItems: ").append(toIndentedString(basisItems)).append("\n");
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
