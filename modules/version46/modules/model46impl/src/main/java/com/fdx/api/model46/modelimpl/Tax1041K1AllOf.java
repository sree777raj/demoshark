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
 * Tax1041K1AllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1041K1AllOf {
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

	@JsonProperty("trustTin")
	private String trustTin;

	@JsonProperty("trustName")
	private String trustName;

	@JsonProperty("form1041T")
	@JsonInclude(Include.NON_NULL)
	private Boolean form1041T;

	@JsonProperty("date1041T")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private LocalDate date1041T;

	@JsonProperty("final1041")
	@JsonInclude(Include.NON_NULL)
	private Boolean final1041;

	@JsonProperty("beneficiaryTin")
	private String beneficiaryTin;

	@JsonProperty("domestic")
	@JsonInclude(Include.NON_NULL)
	private Boolean domestic;

	@JsonProperty("foreign")
	@JsonInclude(Include.NON_NULL)
	private Boolean foreign;

	@JsonProperty("interestIncome")
	private Double interestIncome;

	@JsonProperty("ordinaryDividends")
	private Double ordinaryDividends;

	@JsonProperty("qualifiedDividends")
	private Double qualifiedDividends;

	@JsonProperty("netShortTermGain")
	private Double netShortTermGain;

	@JsonProperty("netLongTermGain")
	private Double netLongTermGain;

	@JsonProperty("gain28Rate")
	private Double gain28Rate;

	@JsonProperty("unrecaptured1250Gain")
	private Double unrecaptured1250Gain;

	@JsonProperty("otherPortfolioIncome")
	private Double otherPortfolioIncome;

	@JsonProperty("ordinaryBusinessIncome")
	private Double ordinaryBusinessIncome;

	@JsonProperty("netRentalRealEstateIncome")
	private Double netRentalRealEstateIncome;

	@JsonProperty("otherRentalIncome")
	private Double otherRentalIncome;

	@JsonProperty("directlyApportionedDeductions")
	@Valid
	private List<CodeAmount> directlyApportionedDeductions = null;

	@JsonProperty("estateTaxDeduction")
	private Double estateTaxDeduction;

	@JsonProperty("finalYearDeductions")
	@Valid
	private List<CodeAmount> finalYearDeductions = null;

	@JsonProperty("fiduciaryNameAddress")
	private NameAddress fiduciaryNameAddress;

	@JsonProperty("amtAdjustments")
	@Valid
	private List<CodeAmount> amtAdjustments = null;

	@JsonProperty("beneficiaryNameAddress")
	private NameAddress beneficiaryNameAddress;

	@JsonProperty("credits")
	@Valid
	private List<CodeAmount> credits = null;

	@JsonProperty("otherInfo")
	@Valid
	private List<CodeAmount> otherInfo = null;

	public Tax1041K1AllOf finalK1(Boolean finalK1) {
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

	public Tax1041K1AllOf amendedK1(Boolean amendedK1) {
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

	public Tax1041K1AllOf fiscalYearBegin(LocalDate fiscalYearBegin) {
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

	public Tax1041K1AllOf fiscalYearEnd(LocalDate fiscalYearEnd) {
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

	public Tax1041K1AllOf trustTin(String trustTin) {
		this.trustTin = trustTin;
		return this;
	}

	/**
	 * Box A, Estate's or trust's employer identification number
	 * 
	 * @return trustTin
	 */
	@ApiModelProperty(value = "Box A, Estate's or trust's employer identification number")

	public String getTrustTin() {
		return trustTin;
	}

	public void setTrustTin(String trustTin) {
		this.trustTin = trustTin;
	}

	public Tax1041K1AllOf trustName(String trustName) {
		this.trustName = trustName;
		return this;
	}

	/**
	 * Box B, Estate's or trust's name
	 * 
	 * @return trustName
	 */
	@ApiModelProperty(value = "Box B, Estate's or trust's name")

	public String getTrustName() {
		return trustName;
	}

	public void setTrustName(String trustName) {
		this.trustName = trustName;
	}

	public Tax1041K1AllOf form1041T(Boolean form1041T) {
		this.form1041T = form1041T;
		return this;
	}

	/**
	 * Box D, Check if Form 1041-T was filed
	 * 
	 * @return form1041T
	 */
	@ApiModelProperty(value = "Box D, Check if Form 1041-T was filed")

	public Boolean getForm1041T() {
		return form1041T;
	}

	public void setForm1041T(Boolean form1041T) {
		this.form1041T = form1041T;
	}

	public Tax1041K1AllOf date1041T(LocalDate date1041T) {
		this.date1041T = date1041T;
		return this;
	}

	/**
	 * ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included
	 * according to [IETF RFC3339]
	 * (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)
	 * 
	 * @return date1041T
	 */
	@ApiModelProperty(value = "ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included according to [IETF RFC3339] (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)")

	@Valid
	@Size(max = 10)
	public LocalDate getDate1041T() {
		return date1041T;
	}

	public void setDate1041T(LocalDate date1041T) {
		this.date1041T = date1041T;
	}

	public Tax1041K1AllOf final1041(Boolean final1041) {
		this.final1041 = final1041;
		return this;
	}

	/**
	 * Box E, Check if this is the final Form 1041 for the estate or trust
	 * 
	 * @return final1041
	 */
	@ApiModelProperty(value = "Box E, Check if this is the final Form 1041 for the estate or trust")

	public Boolean getFinal1041() {
		return final1041;
	}

	public void setFinal1041(Boolean final1041) {
		this.final1041 = final1041;
	}

	public Tax1041K1AllOf beneficiaryTin(String beneficiaryTin) {
		this.beneficiaryTin = beneficiaryTin;
		return this;
	}

	/**
	 * Box F, Beneficiary's identifying number
	 * 
	 * @return beneficiaryTin
	 */
	@ApiModelProperty(value = "Box F, Beneficiary's identifying number")

	public String getBeneficiaryTin() {
		return beneficiaryTin;
	}

	public void setBeneficiaryTin(String beneficiaryTin) {
		this.beneficiaryTin = beneficiaryTin;
	}

	public Tax1041K1AllOf domestic(Boolean domestic) {
		this.domestic = domestic;
		return this;
	}

	/**
	 * Box H, Domestic beneficiary
	 * 
	 * @return domestic
	 */
	@ApiModelProperty(value = "Box H, Domestic beneficiary")

	public Boolean getDomestic() {
		return domestic;
	}

	public void setDomestic(Boolean domestic) {
		this.domestic = domestic;
	}

	public Tax1041K1AllOf foreign(Boolean foreign) {
		this.foreign = foreign;
		return this;
	}

	/**
	 * Box H, Foreign beneficiary
	 * 
	 * @return foreign
	 */
	@ApiModelProperty(value = "Box H, Foreign beneficiary")

	public Boolean getForeign() {
		return foreign;
	}

	public void setForeign(Boolean foreign) {
		this.foreign = foreign;
	}

	public Tax1041K1AllOf interestIncome(Double interestIncome) {
		this.interestIncome = interestIncome;
		return this;
	}

	/**
	 * Box 1, Interest income
	 * 
	 * @return interestIncome
	 */
	@ApiModelProperty(value = "Box 1, Interest income")

	public Double getInterestIncome() {
		return interestIncome;
	}

	public void setInterestIncome(Double interestIncome) {
		this.interestIncome = interestIncome;
	}

	public Tax1041K1AllOf ordinaryDividends(Double ordinaryDividends) {
		this.ordinaryDividends = ordinaryDividends;
		return this;
	}

	/**
	 * Box 2a, Ordinary dividends
	 * 
	 * @return ordinaryDividends
	 */
	@ApiModelProperty(value = "Box 2a, Ordinary dividends")

	public Double getOrdinaryDividends() {
		return ordinaryDividends;
	}

	public void setOrdinaryDividends(Double ordinaryDividends) {
		this.ordinaryDividends = ordinaryDividends;
	}

	public Tax1041K1AllOf qualifiedDividends(Double qualifiedDividends) {
		this.qualifiedDividends = qualifiedDividends;
		return this;
	}

	/**
	 * Box 2b, Qualified dividends
	 * 
	 * @return qualifiedDividends
	 */
	@ApiModelProperty(value = "Box 2b, Qualified dividends")

	public Double getQualifiedDividends() {
		return qualifiedDividends;
	}

	public void setQualifiedDividends(Double qualifiedDividends) {
		this.qualifiedDividends = qualifiedDividends;
	}

	public Tax1041K1AllOf netShortTermGain(Double netShortTermGain) {
		this.netShortTermGain = netShortTermGain;
		return this;
	}

	/**
	 * Box 3, Net short-term capital gain
	 * 
	 * @return netShortTermGain
	 */
	@ApiModelProperty(value = "Box 3, Net short-term capital gain")

	public Double getNetShortTermGain() {
		return netShortTermGain;
	}

	public void setNetShortTermGain(Double netShortTermGain) {
		this.netShortTermGain = netShortTermGain;
	}

	public Tax1041K1AllOf netLongTermGain(Double netLongTermGain) {
		this.netLongTermGain = netLongTermGain;
		return this;
	}

	/**
	 * Box 4a, Net long-term capital gain
	 * 
	 * @return netLongTermGain
	 */
	@ApiModelProperty(value = "Box 4a, Net long-term capital gain")

	public Double getNetLongTermGain() {
		return netLongTermGain;
	}

	public void setNetLongTermGain(Double netLongTermGain) {
		this.netLongTermGain = netLongTermGain;
	}

	public Tax1041K1AllOf gain28Rate(Double gain28Rate) {
		this.gain28Rate = gain28Rate;
		return this;
	}

	/**
	 * Box 4b, 28% rate gain
	 * 
	 * @return gain28Rate
	 */
	@ApiModelProperty(value = "Box 4b, 28% rate gain")

	public Double getGain28Rate() {
		return gain28Rate;
	}

	public void setGain28Rate(Double gain28Rate) {
		this.gain28Rate = gain28Rate;
	}

	public Tax1041K1AllOf unrecaptured1250Gain(Double unrecaptured1250Gain) {
		this.unrecaptured1250Gain = unrecaptured1250Gain;
		return this;
	}

	/**
	 * Box 4c, Unrecaptured section 1250 gain
	 * 
	 * @return unrecaptured1250Gain
	 */
	@ApiModelProperty(value = "Box 4c, Unrecaptured section 1250 gain")

	public Double getUnrecaptured1250Gain() {
		return unrecaptured1250Gain;
	}

	public void setUnrecaptured1250Gain(Double unrecaptured1250Gain) {
		this.unrecaptured1250Gain = unrecaptured1250Gain;
	}

	public Tax1041K1AllOf otherPortfolioIncome(Double otherPortfolioIncome) {
		this.otherPortfolioIncome = otherPortfolioIncome;
		return this;
	}

	/**
	 * Box 5, Other portfolio and nonbusiness income
	 * 
	 * @return otherPortfolioIncome
	 */
	@ApiModelProperty(value = "Box 5, Other portfolio and nonbusiness income")

	public Double getOtherPortfolioIncome() {
		return otherPortfolioIncome;
	}

	public void setOtherPortfolioIncome(Double otherPortfolioIncome) {
		this.otherPortfolioIncome = otherPortfolioIncome;
	}

	public Tax1041K1AllOf ordinaryBusinessIncome(Double ordinaryBusinessIncome) {
		this.ordinaryBusinessIncome = ordinaryBusinessIncome;
		return this;
	}

	/**
	 * Box 6, Ordinary business income
	 * 
	 * @return ordinaryBusinessIncome
	 */
	@ApiModelProperty(value = "Box 6, Ordinary business income")

	public Double getOrdinaryBusinessIncome() {
		return ordinaryBusinessIncome;
	}

	public void setOrdinaryBusinessIncome(Double ordinaryBusinessIncome) {
		this.ordinaryBusinessIncome = ordinaryBusinessIncome;
	}

	public Tax1041K1AllOf netRentalRealEstateIncome(Double netRentalRealEstateIncome) {
		this.netRentalRealEstateIncome = netRentalRealEstateIncome;
		return this;
	}

	/**
	 * Box 7, Net rental real estate income
	 * 
	 * @return netRentalRealEstateIncome
	 */
	@ApiModelProperty(value = "Box 7, Net rental real estate income")

	public Double getNetRentalRealEstateIncome() {
		return netRentalRealEstateIncome;
	}

	public void setNetRentalRealEstateIncome(Double netRentalRealEstateIncome) {
		this.netRentalRealEstateIncome = netRentalRealEstateIncome;
	}

	public Tax1041K1AllOf otherRentalIncome(Double otherRentalIncome) {
		this.otherRentalIncome = otherRentalIncome;
		return this;
	}

	/**
	 * Box 8, Other rental income
	 * 
	 * @return otherRentalIncome
	 */
	@ApiModelProperty(value = "Box 8, Other rental income")

	public Double getOtherRentalIncome() {
		return otherRentalIncome;
	}

	public void setOtherRentalIncome(Double otherRentalIncome) {
		this.otherRentalIncome = otherRentalIncome;
	}

	public Tax1041K1AllOf directlyApportionedDeductions(List<CodeAmount> directlyApportionedDeductions) {
		this.directlyApportionedDeductions = directlyApportionedDeductions;
		return this;
	}

	public Tax1041K1AllOf addDirectlyApportionedDeductionsItem(CodeAmount directlyApportionedDeductionsItem) {
		if (this.directlyApportionedDeductions == null) {
			this.directlyApportionedDeductions = new ArrayList<>();
		}
		this.directlyApportionedDeductions.add(directlyApportionedDeductionsItem);
		return this;
	}

	/**
	 * Box 9, Directly apportioned deductions
	 * 
	 * @return directlyApportionedDeductions
	 */
	@ApiModelProperty(value = "Box 9, Directly apportioned deductions")

	@Valid

	public List<CodeAmount> getDirectlyApportionedDeductions() {
		return directlyApportionedDeductions;
	}

	public void setDirectlyApportionedDeductions(List<CodeAmount> directlyApportionedDeductions) {
		this.directlyApportionedDeductions = directlyApportionedDeductions;
	}

	public Tax1041K1AllOf estateTaxDeduction(Double estateTaxDeduction) {
		this.estateTaxDeduction = estateTaxDeduction;
		return this;
	}

	/**
	 * Box 10, Estate tax deduction
	 * 
	 * @return estateTaxDeduction
	 */
	@ApiModelProperty(value = "Box 10, Estate tax deduction")

	public Double getEstateTaxDeduction() {
		return estateTaxDeduction;
	}

	public void setEstateTaxDeduction(Double estateTaxDeduction) {
		this.estateTaxDeduction = estateTaxDeduction;
	}

	public Tax1041K1AllOf finalYearDeductions(List<CodeAmount> finalYearDeductions) {
		this.finalYearDeductions = finalYearDeductions;
		return this;
	}

	public Tax1041K1AllOf addFinalYearDeductionsItem(CodeAmount finalYearDeductionsItem) {
		if (this.finalYearDeductions == null) {
			this.finalYearDeductions = new ArrayList<>();
		}
		this.finalYearDeductions.add(finalYearDeductionsItem);
		return this;
	}

	/**
	 * Box 11, Final year deductions
	 * 
	 * @return finalYearDeductions
	 */
	@ApiModelProperty(value = "Box 11, Final year deductions")

	@Valid

	public List<CodeAmount> getFinalYearDeductions() {
		return finalYearDeductions;
	}

	public void setFinalYearDeductions(List<CodeAmount> finalYearDeductions) {
		this.finalYearDeductions = finalYearDeductions;
	}

	public Tax1041K1AllOf fiduciaryNameAddress(NameAddress fiduciaryNameAddress) {
		this.fiduciaryNameAddress = fiduciaryNameAddress;
		return this;
	}

	/**
	 * Get fiduciaryNameAddress
	 * 
	 * @return fiduciaryNameAddress
	 */
	@ApiModelProperty(value = "")

	@Valid

	public NameAddress getFiduciaryNameAddress() {
		return fiduciaryNameAddress;
	}

	public void setFiduciaryNameAddress(NameAddress fiduciaryNameAddress) {
		this.fiduciaryNameAddress = fiduciaryNameAddress;
	}

	public Tax1041K1AllOf amtAdjustments(List<CodeAmount> amtAdjustments) {
		this.amtAdjustments = amtAdjustments;
		return this;
	}

	public Tax1041K1AllOf addAmtAdjustmentsItem(CodeAmount amtAdjustmentsItem) {
		if (this.amtAdjustments == null) {
			this.amtAdjustments = new ArrayList<>();
		}
		this.amtAdjustments.add(amtAdjustmentsItem);
		return this;
	}

	/**
	 * Box 12, Alternative minimum tax adjustment
	 * 
	 * @return amtAdjustments
	 */
	@ApiModelProperty(value = "Box 12, Alternative minimum tax adjustment")

	@Valid

	public List<CodeAmount> getAmtAdjustments() {
		return amtAdjustments;
	}

	public void setAmtAdjustments(List<CodeAmount> amtAdjustments) {
		this.amtAdjustments = amtAdjustments;
	}

	public Tax1041K1AllOf beneficiaryNameAddress(NameAddress beneficiaryNameAddress) {
		this.beneficiaryNameAddress = beneficiaryNameAddress;
		return this;
	}

	/**
	 * Get beneficiaryNameAddress
	 * 
	 * @return beneficiaryNameAddress
	 */
	@ApiModelProperty(value = "")

	@Valid

	public NameAddress getBeneficiaryNameAddress() {
		return beneficiaryNameAddress;
	}

	public void setBeneficiaryNameAddress(NameAddress beneficiaryNameAddress) {
		this.beneficiaryNameAddress = beneficiaryNameAddress;
	}

	public Tax1041K1AllOf credits(List<CodeAmount> credits) {
		this.credits = credits;
		return this;
	}

	public Tax1041K1AllOf addCreditsItem(CodeAmount creditsItem) {
		if (this.credits == null) {
			this.credits = new ArrayList<>();
		}
		this.credits.add(creditsItem);
		return this;
	}

	/**
	 * Box 13, Credits and credit recapture
	 * 
	 * @return credits
	 */
	@ApiModelProperty(value = "Box 13, Credits and credit recapture")

	@Valid

	public List<CodeAmount> getCredits() {
		return credits;
	}

	public void setCredits(List<CodeAmount> credits) {
		this.credits = credits;
	}

	public Tax1041K1AllOf otherInfo(List<CodeAmount> otherInfo) {
		this.otherInfo = otherInfo;
		return this;
	}

	public Tax1041K1AllOf addOtherInfoItem(CodeAmount otherInfoItem) {
		if (this.otherInfo == null) {
			this.otherInfo = new ArrayList<>();
		}
		this.otherInfo.add(otherInfoItem);
		return this;
	}

	/**
	 * Box 14, Other information
	 * 
	 * @return otherInfo
	 */
	@ApiModelProperty(value = "Box 14, Other information")

	@Valid

	public List<CodeAmount> getOtherInfo() {
		return otherInfo;
	}

	public void setOtherInfo(List<CodeAmount> otherInfo) {
		this.otherInfo = otherInfo;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Tax1041K1AllOf tax1041K1AllOf = (Tax1041K1AllOf) o;
		return Objects.equals(this.finalK1, tax1041K1AllOf.finalK1)
				&& Objects.equals(this.amendedK1, tax1041K1AllOf.amendedK1)
				&& Objects.equals(this.fiscalYearBegin, tax1041K1AllOf.fiscalYearBegin)
				&& Objects.equals(this.fiscalYearEnd, tax1041K1AllOf.fiscalYearEnd)
				&& Objects.equals(this.trustTin, tax1041K1AllOf.trustTin)
				&& Objects.equals(this.trustName, tax1041K1AllOf.trustName)
				&& Objects.equals(this.form1041T, tax1041K1AllOf.form1041T)
				&& Objects.equals(this.date1041T, tax1041K1AllOf.date1041T)
				&& Objects.equals(this.final1041, tax1041K1AllOf.final1041)
				&& Objects.equals(this.beneficiaryTin, tax1041K1AllOf.beneficiaryTin)
				&& Objects.equals(this.domestic, tax1041K1AllOf.domestic)
				&& Objects.equals(this.foreign, tax1041K1AllOf.foreign)
				&& Objects.equals(this.interestIncome, tax1041K1AllOf.interestIncome)
				&& Objects.equals(this.ordinaryDividends, tax1041K1AllOf.ordinaryDividends)
				&& Objects.equals(this.qualifiedDividends, tax1041K1AllOf.qualifiedDividends)
				&& Objects.equals(this.netShortTermGain, tax1041K1AllOf.netShortTermGain)
				&& Objects.equals(this.netLongTermGain, tax1041K1AllOf.netLongTermGain)
				&& Objects.equals(this.gain28Rate, tax1041K1AllOf.gain28Rate)
				&& Objects.equals(this.unrecaptured1250Gain, tax1041K1AllOf.unrecaptured1250Gain)
				&& Objects.equals(this.otherPortfolioIncome, tax1041K1AllOf.otherPortfolioIncome)
				&& Objects.equals(this.ordinaryBusinessIncome, tax1041K1AllOf.ordinaryBusinessIncome)
				&& Objects.equals(this.netRentalRealEstateIncome, tax1041K1AllOf.netRentalRealEstateIncome)
				&& Objects.equals(this.otherRentalIncome, tax1041K1AllOf.otherRentalIncome)
				&& Objects.equals(this.directlyApportionedDeductions, tax1041K1AllOf.directlyApportionedDeductions)
				&& Objects.equals(this.estateTaxDeduction, tax1041K1AllOf.estateTaxDeduction)
				&& Objects.equals(this.finalYearDeductions, tax1041K1AllOf.finalYearDeductions)
				&& Objects.equals(this.fiduciaryNameAddress, tax1041K1AllOf.fiduciaryNameAddress)
				&& Objects.equals(this.amtAdjustments, tax1041K1AllOf.amtAdjustments)
				&& Objects.equals(this.beneficiaryNameAddress, tax1041K1AllOf.beneficiaryNameAddress)
				&& Objects.equals(this.credits, tax1041K1AllOf.credits)
				&& Objects.equals(this.otherInfo, tax1041K1AllOf.otherInfo);
	}

	@Override
	public int hashCode() {
		return Objects.hash(finalK1, amendedK1, fiscalYearBegin, fiscalYearEnd, trustTin, trustName, form1041T,
				date1041T, final1041, beneficiaryTin, domestic, foreign, interestIncome, ordinaryDividends,
				qualifiedDividends, netShortTermGain, netLongTermGain, gain28Rate, unrecaptured1250Gain,
				otherPortfolioIncome, ordinaryBusinessIncome, netRentalRealEstateIncome, otherRentalIncome,
				directlyApportionedDeductions, estateTaxDeduction, finalYearDeductions, fiduciaryNameAddress,
				amtAdjustments, beneficiaryNameAddress, credits, otherInfo);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Tax1041K1AllOf {\n");

		sb.append("    finalK1: ").append(toIndentedString(finalK1)).append("\n");
		sb.append("    amendedK1: ").append(toIndentedString(amendedK1)).append("\n");
		sb.append("    fiscalYearBegin: ").append(toIndentedString(fiscalYearBegin)).append("\n");
		sb.append("    fiscalYearEnd: ").append(toIndentedString(fiscalYearEnd)).append("\n");
		sb.append("    trustTin: ").append(toIndentedString(trustTin)).append("\n");
		sb.append("    trustName: ").append(toIndentedString(trustName)).append("\n");
		sb.append("    form1041T: ").append(toIndentedString(form1041T)).append("\n");
		sb.append("    date1041T: ").append(toIndentedString(date1041T)).append("\n");
		sb.append("    final1041: ").append(toIndentedString(final1041)).append("\n");
		sb.append("    beneficiaryTin: ").append(toIndentedString(beneficiaryTin)).append("\n");
		sb.append("    domestic: ").append(toIndentedString(domestic)).append("\n");
		sb.append("    foreign: ").append(toIndentedString(foreign)).append("\n");
		sb.append("    interestIncome: ").append(toIndentedString(interestIncome)).append("\n");
		sb.append("    ordinaryDividends: ").append(toIndentedString(ordinaryDividends)).append("\n");
		sb.append("    qualifiedDividends: ").append(toIndentedString(qualifiedDividends)).append("\n");
		sb.append("    netShortTermGain: ").append(toIndentedString(netShortTermGain)).append("\n");
		sb.append("    netLongTermGain: ").append(toIndentedString(netLongTermGain)).append("\n");
		sb.append("    gain28Rate: ").append(toIndentedString(gain28Rate)).append("\n");
		sb.append("    unrecaptured1250Gain: ").append(toIndentedString(unrecaptured1250Gain)).append("\n");
		sb.append("    otherPortfolioIncome: ").append(toIndentedString(otherPortfolioIncome)).append("\n");
		sb.append("    ordinaryBusinessIncome: ").append(toIndentedString(ordinaryBusinessIncome)).append("\n");
		sb.append("    netRentalRealEstateIncome: ").append(toIndentedString(netRentalRealEstateIncome)).append("\n");
		sb.append("    otherRentalIncome: ").append(toIndentedString(otherRentalIncome)).append("\n");
		sb.append("    directlyApportionedDeductions: ").append(toIndentedString(directlyApportionedDeductions))
				.append("\n");
		sb.append("    estateTaxDeduction: ").append(toIndentedString(estateTaxDeduction)).append("\n");
		sb.append("    finalYearDeductions: ").append(toIndentedString(finalYearDeductions)).append("\n");
		sb.append("    fiduciaryNameAddress: ").append(toIndentedString(fiduciaryNameAddress)).append("\n");
		sb.append("    amtAdjustments: ").append(toIndentedString(amtAdjustments)).append("\n");
		sb.append("    beneficiaryNameAddress: ").append(toIndentedString(beneficiaryNameAddress)).append("\n");
		sb.append("    credits: ").append(toIndentedString(credits)).append("\n");
		sb.append("    otherInfo: ").append(toIndentedString(otherInfo)).append("\n");
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
