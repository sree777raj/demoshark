package com.fdx.api.model51.modelimpl;

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
import com.fdx.api.model51.config.ConnectionConfigApi51;
import com.fdx.api.model51.mapper.Tax1120SK1RowMapper;

import io.swagger.annotations.ApiModel;

/**
 * Shareholder&#39;s Share of Income, Deductions, Credits, etc.
 */
@ApiModel(description = "Shareholder's Share of Income, Deductions, Credits, etc.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1120SK1 {

	NamedParameterJdbcTemplate template;

	@JsonUnwrapped
	private Tax tax;

	@JsonProperty("finalK1")
	@JsonInclude(Include.NON_NULL)
	private Boolean finalK1;

	@JsonProperty("amendedK1")
	@JsonInclude(Include.NON_NULL)
	private Boolean amendedK1;

	@JsonProperty("fiscalYearBegin")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private Date fiscalYearBegin;

	@JsonProperty("fiscalYearEnd")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private Date fiscalYearEnd;

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

	public Tax getTax() {
		return tax;
	}

	public void setTax(Tax tax) {
		this.tax = tax;
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

	public String getCorporationTin() {
		return corporationTin;
	}

	public void setCorporationTin(String corporationTin) {
		this.corporationTin = corporationTin;
	}

	public NameAddress getCorporationNameAddress() {
		return corporationNameAddress;
	}

	public void setCorporationNameAddress(NameAddress corporationNameAddress) {
		this.corporationNameAddress = corporationNameAddress;
	}

	public String getIrsCenter() {
		return irsCenter;
	}

	public void setIrsCenter(String irsCenter) {
		this.irsCenter = irsCenter;
	}

	public String getShareholderTin() {
		return shareholderTin;
	}

	public void setShareholderTin(String shareholderTin) {
		this.shareholderTin = shareholderTin;
	}

	public NameAddress getShareholderNameAddress() {
		return shareholderNameAddress;
	}

	public void setShareholderNameAddress(NameAddress shareholderNameAddress) {
		this.shareholderNameAddress = shareholderNameAddress;
	}

	public Double getPercentOwnership() {
		return percentOwnership;
	}

	public void setPercentOwnership(Double percentOwnership) {
		this.percentOwnership = percentOwnership;
	}

	public Double getBeginningShares() {
		return beginningShares;
	}

	public void setBeginningShares(Double beginningShares) {
		this.beginningShares = beginningShares;
	}

	public Double getEndingShares() {
		return endingShares;
	}

	public void setEndingShares(Double endingShares) {
		this.endingShares = endingShares;
	}

	public Double getBeginningLoans() {
		return beginningLoans;
	}

	public void setBeginningLoans(Double beginningLoans) {
		this.beginningLoans = beginningLoans;
	}

	public Double getEndingLoans() {
		return endingLoans;
	}

	public void setEndingLoans(Double endingLoans) {
		this.endingLoans = endingLoans;
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

	public List<CodeAmount> getCredits() {
		return credits;
	}

	public void setCredits(List<CodeAmount> credits) {
		this.credits = credits;
	}

	public List<CodeAmount> getForeignTransactions() {
		return foreignTransactions;
	}

	public void setForeignTransactions(List<CodeAmount> foreignTransactions) {
		this.foreignTransactions = foreignTransactions;
	}

	public String getForeignCountry() {
		return foreignCountry;
	}

	public void setForeignCountry(String foreignCountry) {
		this.foreignCountry = foreignCountry;
	}

	public List<CodeAmount> getAmtItems() {
		return amtItems;
	}

	public void setAmtItems(List<CodeAmount> amtItems) {
		this.amtItems = amtItems;
	}

	public List<CodeAmount> getBasisItems() {
		return basisItems;
	}

	public void setBasisItems(List<CodeAmount> basisItems) {
		this.basisItems = basisItems;
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
		result = prime * result + ((basisItems == null) ? 0 : basisItems.hashCode());
		result = prime * result + ((beginningLoans == null) ? 0 : beginningLoans.hashCode());
		result = prime * result + ((beginningShares == null) ? 0 : beginningShares.hashCode());
		result = prime * result + ((collectiblesGain == null) ? 0 : collectiblesGain.hashCode());
		result = prime * result + ((corporationNameAddress == null) ? 0 : corporationNameAddress.hashCode());
		result = prime * result + ((corporationTin == null) ? 0 : corporationTin.hashCode());
		result = prime * result + ((credits == null) ? 0 : credits.hashCode());
		result = prime * result + ((endingLoans == null) ? 0 : endingLoans.hashCode());
		result = prime * result + ((endingShares == null) ? 0 : endingShares.hashCode());
		result = prime * result + ((finalK1 == null) ? 0 : finalK1.hashCode());
		result = prime * result + ((fiscalYearBegin == null) ? 0 : fiscalYearBegin.hashCode());
		result = prime * result + ((fiscalYearEnd == null) ? 0 : fiscalYearEnd.hashCode());
		result = prime * result + ((foreignCountry == null) ? 0 : foreignCountry.hashCode());
		result = prime * result + ((foreignTransactions == null) ? 0 : foreignTransactions.hashCode());
		result = prime * result + ((interestIncome == null) ? 0 : interestIncome.hashCode());
		result = prime * result + ((irsCenter == null) ? 0 : irsCenter.hashCode());
		result = prime * result + ((multipleAtRiskActivities == null) ? 0 : multipleAtRiskActivities.hashCode());
		result = prime * result + ((multiplePassiveActivities == null) ? 0 : multiplePassiveActivities.hashCode());
		result = prime * result + ((net1231Gain == null) ? 0 : net1231Gain.hashCode());
		result = prime * result + ((netLongTermGain == null) ? 0 : netLongTermGain.hashCode());
		result = prime * result + ((netRentalRealEstateIncome == null) ? 0 : netRentalRealEstateIncome.hashCode());
		result = prime * result + ((netShortTermGain == null) ? 0 : netShortTermGain.hashCode());
		result = prime * result + ((ordinaryDividends == null) ? 0 : ordinaryDividends.hashCode());
		result = prime * result + ((ordinaryIncome == null) ? 0 : ordinaryIncome.hashCode());
		result = prime * result + ((otherDeductions == null) ? 0 : otherDeductions.hashCode());
		result = prime * result + ((otherIncome == null) ? 0 : otherIncome.hashCode());
		result = prime * result + ((otherInfo == null) ? 0 : otherInfo.hashCode());
		result = prime * result + ((otherRentalIncome == null) ? 0 : otherRentalIncome.hashCode());
		result = prime * result + ((percentOwnership == null) ? 0 : percentOwnership.hashCode());
		result = prime * result + ((qualifiedDividends == null) ? 0 : qualifiedDividends.hashCode());
		result = prime * result + ((royalties == null) ? 0 : royalties.hashCode());
		result = prime * result + ((section179Deduction == null) ? 0 : section179Deduction.hashCode());
		result = prime * result + ((shareholderNameAddress == null) ? 0 : shareholderNameAddress.hashCode());
		result = prime * result + ((shareholderTin == null) ? 0 : shareholderTin.hashCode());
		result = prime * result + ((tax == null) ? 0 : tax.hashCode());
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
		Tax1120SK1 other = (Tax1120SK1) obj;
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
		if (basisItems == null) {
			if (other.basisItems != null)
				return false;
		} else if (!basisItems.equals(other.basisItems))
			return false;
		if (beginningLoans == null) {
			if (other.beginningLoans != null)
				return false;
		} else if (!beginningLoans.equals(other.beginningLoans))
			return false;
		if (beginningShares == null) {
			if (other.beginningShares != null)
				return false;
		} else if (!beginningShares.equals(other.beginningShares))
			return false;
		if (collectiblesGain == null) {
			if (other.collectiblesGain != null)
				return false;
		} else if (!collectiblesGain.equals(other.collectiblesGain))
			return false;
		if (corporationNameAddress == null) {
			if (other.corporationNameAddress != null)
				return false;
		} else if (!corporationNameAddress.equals(other.corporationNameAddress))
			return false;
		if (corporationTin == null) {
			if (other.corporationTin != null)
				return false;
		} else if (!corporationTin.equals(other.corporationTin))
			return false;
		if (credits == null) {
			if (other.credits != null)
				return false;
		} else if (!credits.equals(other.credits))
			return false;
		if (endingLoans == null) {
			if (other.endingLoans != null)
				return false;
		} else if (!endingLoans.equals(other.endingLoans))
			return false;
		if (endingShares == null) {
			if (other.endingShares != null)
				return false;
		} else if (!endingShares.equals(other.endingShares))
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
		if (percentOwnership == null) {
			if (other.percentOwnership != null)
				return false;
		} else if (!percentOwnership.equals(other.percentOwnership))
			return false;
		if (qualifiedDividends == null) {
			if (other.qualifiedDividends != null)
				return false;
		} else if (!qualifiedDividends.equals(other.qualifiedDividends))
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
		if (shareholderNameAddress == null) {
			if (other.shareholderNameAddress != null)
				return false;
		} else if (!shareholderNameAddress.equals(other.shareholderNameAddress))
			return false;
		if (shareholderTin == null) {
			if (other.shareholderTin != null)
				return false;
		} else if (!shareholderTin.equals(other.shareholderTin))
			return false;
		if (tax == null) {
			if (other.tax != null)
				return false;
		} else if (!tax.equals(other.tax))
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
		return "Tax1120SK1 [tax=" + tax + ", finalK1=" + finalK1 + ", amendedK1=" + amendedK1 + ", fiscalYearBegin="
				+ fiscalYearBegin + ", fiscalYearEnd=" + fiscalYearEnd + ", corporationTin=" + corporationTin
				+ ", corporationNameAddress=" + corporationNameAddress + ", irsCenter=" + irsCenter
				+ ", shareholderTin=" + shareholderTin + ", shareholderNameAddress=" + shareholderNameAddress
				+ ", percentOwnership=" + percentOwnership + ", beginningShares=" + beginningShares + ", endingShares="
				+ endingShares + ", beginningLoans=" + beginningLoans + ", endingLoans=" + endingLoans
				+ ", ordinaryIncome=" + ordinaryIncome + ", netRentalRealEstateIncome=" + netRentalRealEstateIncome
				+ ", otherRentalIncome=" + otherRentalIncome + ", interestIncome=" + interestIncome
				+ ", ordinaryDividends=" + ordinaryDividends + ", qualifiedDividends=" + qualifiedDividends
				+ ", royalties=" + royalties + ", netShortTermGain=" + netShortTermGain + ", netLongTermGain="
				+ netLongTermGain + ", collectiblesGain=" + collectiblesGain + ", unrecaptured1250Gain="
				+ unrecaptured1250Gain + ", net1231Gain=" + net1231Gain + ", otherIncome=" + otherIncome
				+ ", section179Deduction=" + section179Deduction + ", otherDeductions=" + otherDeductions + ", credits="
				+ credits + ", foreignTransactions=" + foreignTransactions + ", foreignCountry=" + foreignCountry
				+ ", amtItems=" + amtItems + ", basisItems=" + basisItems + ", otherInfo=" + otherInfo
				+ ", multipleAtRiskActivities=" + multipleAtRiskActivities + ", multiplePassiveActivities="
				+ multiplePassiveActivities + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(Tax1120SK1.class);

	public Tax1120SK1 getTax1120SK1(int internalId) throws FDXException {
		try {
			
			template = ConnectionConfigApi51.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("internalId", internalId);

			Tax1120SK1 tax1120SK1 = template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".Tax1120SK1 where internalId in (:internalId)", parameters,
					new Tax1120SK1RowMapper());

//			corporationNameAddress Start
			NameAddress corporationNameAddress = new NameAddress();
			if (tax1120SK1.getCorporationNameAddress() != null) {
				corporationNameAddress = corporationNameAddress
						.getNameAddressDetails(tax1120SK1.getCorporationNameAddress().getNameAddressId());
				tax1120SK1.setCorporationNameAddress(corporationNameAddress);
			}
//			corporationNameAddress End

//			shareholderNameAddress Start
			NameAddress shareholderNameAddress = new NameAddress();
			if (tax1120SK1.getShareholderNameAddress() != null) {
				shareholderNameAddress = shareholderNameAddress
						.getNameAddressDetails(tax1120SK1.getShareholderNameAddress().getNameAddressId());
				tax1120SK1.setShareholderNameAddress(shareholderNameAddress);
			}
//			shareholderNameAddress End

//			AmtItems Start
			List<CodeAmount> amtItemsListResponse = new ArrayList<>();
			if (tax1120SK1.getAmtItems() != null) {
				List<CodeAmount> amtItemsList = tax1120SK1.getAmtItems();
				for (CodeAmount amtItemsIterator : amtItemsList) {
					CodeAmount codeAmount = amtItemsIterator.getCodeAmount(amtItemsIterator.getCodeAmountId());
					amtItemsListResponse.add(codeAmount);
				}
				tax1120SK1.setAmtItems(amtItemsListResponse);
			}
//			AmtItems End

//			BasisItems Start
			List<CodeAmount> basisItemsListResponse = new ArrayList<>();
			if (tax1120SK1.getBasisItems() != null) {
				List<CodeAmount> basisItemsList = tax1120SK1.getBasisItems();
				for (CodeAmount basisItemsIterator : basisItemsList) {
					CodeAmount codeAmount = basisItemsIterator.getCodeAmount(basisItemsIterator.getCodeAmountId());
					basisItemsListResponse.add(codeAmount);
				}
				tax1120SK1.setBasisItems(basisItemsListResponse);
			}
//			BasisItems End

//			Credits Start
			List<CodeAmount> creditsListResponse = new ArrayList<>();
			if (tax1120SK1.getCredits() != null) {
				List<CodeAmount> creditsList = tax1120SK1.getCredits();
				for (CodeAmount creditsIterator : creditsList) {
					CodeAmount codeAmount = creditsIterator.getCodeAmount(creditsIterator.getCodeAmountId());
					creditsListResponse.add(codeAmount);
				}
				tax1120SK1.setCredits(creditsListResponse);
			}
//			Credits End

//			ForeignTransactions Start
			List<CodeAmount> foreignTransactionsListResponse = new ArrayList<>();
			if (tax1120SK1.getForeignTransactions() != null) {
				List<CodeAmount> foreignTransactionsList = tax1120SK1.getForeignTransactions();
				for (CodeAmount foreignTransactionsIterator : foreignTransactionsList) {
					CodeAmount codeAmount = foreignTransactionsIterator
							.getCodeAmount(foreignTransactionsIterator.getCodeAmountId());
					foreignTransactionsListResponse.add(codeAmount);
				}
				tax1120SK1.setForeignTransactions(foreignTransactionsListResponse);
			}
//			ForeignTransactions End

//			OtherDeductions Start
			List<CodeAmount> otherDeductionsListResponse = new ArrayList<>();
			if (tax1120SK1.getOtherDeductions() != null) {
				List<CodeAmount> otherDeductionsList = tax1120SK1.getOtherDeductions();
				for (CodeAmount otherDeductionsIterator : otherDeductionsList) {
					CodeAmount codeAmount = otherDeductionsIterator
							.getCodeAmount(otherDeductionsIterator.getCodeAmountId());
					otherDeductionsListResponse.add(codeAmount);
				}
				tax1120SK1.setOtherDeductions(otherDeductionsListResponse);
			}
//			OtherDeductions End

//			OtherIncome Start
			List<CodeAmount> otherIncomeListResponse = new ArrayList<>();
			if (tax1120SK1.getOtherIncome() != null) {
				List<CodeAmount> otherIncomeList = tax1120SK1.getOtherIncome();
				for (CodeAmount otherIncomeIterator : otherIncomeList) {
					CodeAmount codeAmount = otherIncomeIterator.getCodeAmount(otherIncomeIterator.getCodeAmountId());
					otherIncomeListResponse.add(codeAmount);
				}
				tax1120SK1.setOtherIncome(otherIncomeListResponse);
			}
//			OtherIncome End

//			OtherInfo Start
			List<CodeAmount> otherInfoListResponse = new ArrayList<>();
			if (tax1120SK1.getOtherInfo() != null) {
				List<CodeAmount> otherInfoList = tax1120SK1.getOtherInfo();
				for (CodeAmount otherInfoIterator : otherInfoList) {
					CodeAmount codeAmount = otherInfoIterator.getCodeAmount(otherInfoIterator.getCodeAmountId());
					otherInfoListResponse.add(codeAmount);
				}
				tax1120SK1.setOtherInfo(otherInfoListResponse);
			}
//			OtherInfo End

			return tax1120SK1;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Tax1120SK1 : ", e);
			throw new FDXException(e,500);
		}
	}

}
