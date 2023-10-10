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
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fdx.api.model46.config.ConnectionConfigApi46;
import com.fdx.api.model46.mapper.Tax5227K1StatementRowMapper;

import io.swagger.annotations.ApiModel;

/**
 * Split-Interest Trust Beneficiary&#39;s schedule K-1, uses Tax1041K1 entity
 */
@ApiModel(description = "Split-Interest Trust Beneficiary's schedule K-1, uses Tax1041K1 entity")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax5227K1 {

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

	@JsonProperty("trustTin")
	private String trustTin;

	@JsonProperty("trustName")
	private String trustName;

	@JsonProperty("form1041T")
	@JsonInclude(Include.NON_NULL)
	private Boolean form1041T;

	@JsonProperty("date1041T")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private Date date1041T;

	@JsonProperty("final1041")
	@JsonInclude(Include.NON_NULL)
	private Boolean final1041;

	@JsonProperty("beneficiaryTin")
	private String beneficiaryTin;

	@JsonProperty("domestic")
	@JsonInclude(Include.NON_NULL)
	private Boolean domestic;

	@JsonProperty("foreignbeneficiary")
	@JsonInclude(Include.NON_NULL)
	private Boolean foreignbeneficiary;

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

	public String getTrustTin() {
		return trustTin;
	}

	public void setTrustTin(String trustTin) {
		this.trustTin = trustTin;
	}

	public String getTrustName() {
		return trustName;
	}

	public void setTrustName(String trustName) {
		this.trustName = trustName;
	}

	public Boolean getForm1041T() {
		return form1041T;
	}

	public void setForm1041T(Boolean form1041t) {
		form1041T = form1041t;
	}

	public Date getDate1041T() {
		return date1041T;
	}

	public void setDate1041T(Date date1041t) {
		date1041T = date1041t;
	}

	public Boolean getFinal1041() {
		return final1041;
	}

	public void setFinal1041(Boolean final1041) {
		this.final1041 = final1041;
	}

	public String getBeneficiaryTin() {
		return beneficiaryTin;
	}

	public void setBeneficiaryTin(String beneficiaryTin) {
		this.beneficiaryTin = beneficiaryTin;
	}

	public Boolean getDomestic() {
		return domestic;
	}

	public void setDomestic(Boolean domestic) {
		this.domestic = domestic;
	}

	public Boolean getForeignBeneficiary() {
		return foreignbeneficiary;
	}

	public void setForeignBeneficiary(Boolean foreignbeneficiary) {
		this.foreignbeneficiary = foreignbeneficiary;
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

	public Double getGain28Rate() {
		return gain28Rate;
	}

	public void setGain28Rate(Double gain28Rate) {
		this.gain28Rate = gain28Rate;
	}

	public Double getUnrecaptured1250Gain() {
		return unrecaptured1250Gain;
	}

	public void setUnrecaptured1250Gain(Double unrecaptured1250Gain) {
		this.unrecaptured1250Gain = unrecaptured1250Gain;
	}

	public Double getOtherPortfolioIncome() {
		return otherPortfolioIncome;
	}

	public void setOtherPortfolioIncome(Double otherPortfolioIncome) {
		this.otherPortfolioIncome = otherPortfolioIncome;
	}

	public Double getOrdinaryBusinessIncome() {
		return ordinaryBusinessIncome;
	}

	public void setOrdinaryBusinessIncome(Double ordinaryBusinessIncome) {
		this.ordinaryBusinessIncome = ordinaryBusinessIncome;
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

	public List<CodeAmount> getDirectlyApportionedDeductions() {
		return directlyApportionedDeductions;
	}

	public void setDirectlyApportionedDeductions(List<CodeAmount> directlyApportionedDeductions) {
		this.directlyApportionedDeductions = directlyApportionedDeductions;
	}

	public Double getEstateTaxDeduction() {
		return estateTaxDeduction;
	}

	public void setEstateTaxDeduction(Double estateTaxDeduction) {
		this.estateTaxDeduction = estateTaxDeduction;
	}

	public List<CodeAmount> getFinalYearDeductions() {
		return finalYearDeductions;
	}

	public void setFinalYearDeductions(List<CodeAmount> finalYearDeductions) {
		this.finalYearDeductions = finalYearDeductions;
	}

	public NameAddress getFiduciaryNameAddress() {
		return fiduciaryNameAddress;
	}

	public void setFiduciaryNameAddress(NameAddress fiduciaryNameAddress) {
		this.fiduciaryNameAddress = fiduciaryNameAddress;
	}

	public List<CodeAmount> getAmtAdjustments() {
		return amtAdjustments;
	}

	public void setAmtAdjustments(List<CodeAmount> amtAdjustments) {
		this.amtAdjustments = amtAdjustments;
	}

	public NameAddress getBeneficiaryNameAddress() {
		return beneficiaryNameAddress;
	}

	public void setBeneficiaryNameAddress(NameAddress beneficiaryNameAddress) {
		this.beneficiaryNameAddress = beneficiaryNameAddress;
	}

	public List<CodeAmount> getCredits() {
		return credits;
	}

	public void setCredits(List<CodeAmount> credits) {
		this.credits = credits;
	}

	public List<CodeAmount> getOtherInfo() {
		return otherInfo;
	}

	public void setOtherInfo(List<CodeAmount> otherInfo) {
		this.otherInfo = otherInfo;
	}

	@Override
	public String toString() {
		return "Tax5227K1 [tax=" + tax + ", finalK1=" + finalK1 + ", amendedK1=" + amendedK1 + ", fiscalYearBegin="
				+ fiscalYearBegin + ", fiscalYearEnd=" + fiscalYearEnd + ", trustTin=" + trustTin + ", trustName="
				+ trustName + ", form1041T=" + form1041T + ", date1041T=" + date1041T + ", final1041=" + final1041
				+ ", beneficiaryTin=" + beneficiaryTin + ", domestic=" + domestic + ", foreignbeneficiary="
				+ foreignbeneficiary + ", interestIncome=" + interestIncome + ", ordinaryDividends=" + ordinaryDividends
				+ ", qualifiedDividends=" + qualifiedDividends + ", netShortTermGain=" + netShortTermGain
				+ ", netLongTermGain=" + netLongTermGain + ", gain28Rate=" + gain28Rate + ", unrecaptured1250Gain="
				+ unrecaptured1250Gain + ", otherPortfolioIncome=" + otherPortfolioIncome + ", ordinaryBusinessIncome="
				+ ordinaryBusinessIncome + ", netRentalRealEstateIncome=" + netRentalRealEstateIncome
				+ ", otherRentalIncome=" + otherRentalIncome + ", directlyApportionedDeductions="
				+ directlyApportionedDeductions + ", estateTaxDeduction=" + estateTaxDeduction
				+ ", finalYearDeductions=" + finalYearDeductions + ", fiduciaryNameAddress=" + fiduciaryNameAddress
				+ ", amtAdjustments=" + amtAdjustments + ", beneficiaryNameAddress=" + beneficiaryNameAddress
				+ ", credits=" + credits + ", otherInfo=" + otherInfo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((amendedK1 == null) ? 0 : amendedK1.hashCode());
		result = prime * result + ((amtAdjustments == null) ? 0 : amtAdjustments.hashCode());
		result = prime * result + ((beneficiaryNameAddress == null) ? 0 : beneficiaryNameAddress.hashCode());
		result = prime * result + ((beneficiaryTin == null) ? 0 : beneficiaryTin.hashCode());
		result = prime * result + ((credits == null) ? 0 : credits.hashCode());
		result = prime * result + ((date1041T == null) ? 0 : date1041T.hashCode());
		result = prime * result
				+ ((directlyApportionedDeductions == null) ? 0 : directlyApportionedDeductions.hashCode());
		result = prime * result + ((domestic == null) ? 0 : domestic.hashCode());
		result = prime * result + ((estateTaxDeduction == null) ? 0 : estateTaxDeduction.hashCode());
		result = prime * result + ((fiduciaryNameAddress == null) ? 0 : fiduciaryNameAddress.hashCode());
		result = prime * result + ((final1041 == null) ? 0 : final1041.hashCode());
		result = prime * result + ((finalK1 == null) ? 0 : finalK1.hashCode());
		result = prime * result + ((finalYearDeductions == null) ? 0 : finalYearDeductions.hashCode());
		result = prime * result + ((fiscalYearBegin == null) ? 0 : fiscalYearBegin.hashCode());
		result = prime * result + ((fiscalYearEnd == null) ? 0 : fiscalYearEnd.hashCode());
		result = prime * result + ((foreignbeneficiary == null) ? 0 : foreignbeneficiary.hashCode());
		result = prime * result + ((form1041T == null) ? 0 : form1041T.hashCode());
		result = prime * result + ((gain28Rate == null) ? 0 : gain28Rate.hashCode());
		result = prime * result + ((interestIncome == null) ? 0 : interestIncome.hashCode());
		result = prime * result + ((netLongTermGain == null) ? 0 : netLongTermGain.hashCode());
		result = prime * result + ((netRentalRealEstateIncome == null) ? 0 : netRentalRealEstateIncome.hashCode());
		result = prime * result + ((netShortTermGain == null) ? 0 : netShortTermGain.hashCode());
		result = prime * result + ((ordinaryBusinessIncome == null) ? 0 : ordinaryBusinessIncome.hashCode());
		result = prime * result + ((ordinaryDividends == null) ? 0 : ordinaryDividends.hashCode());
		result = prime * result + ((otherInfo == null) ? 0 : otherInfo.hashCode());
		result = prime * result + ((otherPortfolioIncome == null) ? 0 : otherPortfolioIncome.hashCode());
		result = prime * result + ((otherRentalIncome == null) ? 0 : otherRentalIncome.hashCode());
		result = prime * result + ((qualifiedDividends == null) ? 0 : qualifiedDividends.hashCode());
		result = prime * result + ((tax == null) ? 0 : tax.hashCode());
		result = prime * result + ((trustName == null) ? 0 : trustName.hashCode());
		result = prime * result + ((trustTin == null) ? 0 : trustTin.hashCode());
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
		Tax5227K1 other = (Tax5227K1) obj;
		if (amendedK1 == null) {
			if (other.amendedK1 != null)
				return false;
		} else if (!amendedK1.equals(other.amendedK1))
			return false;
		if (amtAdjustments == null) {
			if (other.amtAdjustments != null)
				return false;
		} else if (!amtAdjustments.equals(other.amtAdjustments))
			return false;
		if (beneficiaryNameAddress == null) {
			if (other.beneficiaryNameAddress != null)
				return false;
		} else if (!beneficiaryNameAddress.equals(other.beneficiaryNameAddress))
			return false;
		if (beneficiaryTin == null) {
			if (other.beneficiaryTin != null)
				return false;
		} else if (!beneficiaryTin.equals(other.beneficiaryTin))
			return false;
		if (credits == null) {
			if (other.credits != null)
				return false;
		} else if (!credits.equals(other.credits))
			return false;
		if (date1041T == null) {
			if (other.date1041T != null)
				return false;
		} else if (!date1041T.equals(other.date1041T))
			return false;
		if (directlyApportionedDeductions == null) {
			if (other.directlyApportionedDeductions != null)
				return false;
		} else if (!directlyApportionedDeductions.equals(other.directlyApportionedDeductions))
			return false;
		if (domestic == null) {
			if (other.domestic != null)
				return false;
		} else if (!domestic.equals(other.domestic))
			return false;
		if (estateTaxDeduction == null) {
			if (other.estateTaxDeduction != null)
				return false;
		} else if (!estateTaxDeduction.equals(other.estateTaxDeduction))
			return false;
		if (fiduciaryNameAddress == null) {
			if (other.fiduciaryNameAddress != null)
				return false;
		} else if (!fiduciaryNameAddress.equals(other.fiduciaryNameAddress))
			return false;
		if (final1041 == null) {
			if (other.final1041 != null)
				return false;
		} else if (!final1041.equals(other.final1041))
			return false;
		if (finalK1 == null) {
			if (other.finalK1 != null)
				return false;
		} else if (!finalK1.equals(other.finalK1))
			return false;
		if (finalYearDeductions == null) {
			if (other.finalYearDeductions != null)
				return false;
		} else if (!finalYearDeductions.equals(other.finalYearDeductions))
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
		if (foreignbeneficiary == null) {
			if (other.foreignbeneficiary != null)
				return false;
		} else if (!foreignbeneficiary.equals(other.foreignbeneficiary))
			return false;
		if (form1041T == null) {
			if (other.form1041T != null)
				return false;
		} else if (!form1041T.equals(other.form1041T))
			return false;
		if (gain28Rate == null) {
			if (other.gain28Rate != null)
				return false;
		} else if (!gain28Rate.equals(other.gain28Rate))
			return false;
		if (interestIncome == null) {
			if (other.interestIncome != null)
				return false;
		} else if (!interestIncome.equals(other.interestIncome))
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
		if (ordinaryBusinessIncome == null) {
			if (other.ordinaryBusinessIncome != null)
				return false;
		} else if (!ordinaryBusinessIncome.equals(other.ordinaryBusinessIncome))
			return false;
		if (ordinaryDividends == null) {
			if (other.ordinaryDividends != null)
				return false;
		} else if (!ordinaryDividends.equals(other.ordinaryDividends))
			return false;
		if (otherInfo == null) {
			if (other.otherInfo != null)
				return false;
		} else if (!otherInfo.equals(other.otherInfo))
			return false;
		if (otherPortfolioIncome == null) {
			if (other.otherPortfolioIncome != null)
				return false;
		} else if (!otherPortfolioIncome.equals(other.otherPortfolioIncome))
			return false;
		if (otherRentalIncome == null) {
			if (other.otherRentalIncome != null)
				return false;
		} else if (!otherRentalIncome.equals(other.otherRentalIncome))
			return false;
		if (qualifiedDividends == null) {
			if (other.qualifiedDividends != null)
				return false;
		} else if (!qualifiedDividends.equals(other.qualifiedDividends))
			return false;
		if (tax == null) {
			if (other.tax != null)
				return false;
		} else if (!tax.equals(other.tax))
			return false;
		if (trustName == null) {
			if (other.trustName != null)
				return false;
		} else if (!trustName.equals(other.trustName))
			return false;
		if (trustTin == null) {
			if (other.trustTin != null)
				return false;
		} else if (!trustTin.equals(other.trustTin))
			return false;
		if (unrecaptured1250Gain == null) {
			if (other.unrecaptured1250Gain != null)
				return false;
		} else if (!unrecaptured1250Gain.equals(other.unrecaptured1250Gain))
			return false;
		return true;
	}

	private static final Logger log = LoggerFactory.getLogger(Tax5227K1.class);

	public Tax5227K1 getTax5227K1(int internalId) throws FDXException {
		try {
			template = ConnectionConfigApi46.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("internalId", internalId);
			Tax5227K1 tax5227K1;
			try {
				tax5227K1 = template.queryForObject(
						"select * from "+ DeveloperContext.getDeveloperSchema() +".tax5227K1 where internalId in (:internalId)", parameters,
						new Tax5227K1StatementRowMapper());
			} catch (EmptyResultDataAccessException e) {
				throw new FDXException("Tax5227K1 not found", 0);
			}
//			OtherInfo Start
			List<CodeAmount> otherInfoListResponse = new ArrayList<>();
			if (tax5227K1.getOtherInfo() != null) {
				List<CodeAmount> otherInfoList = tax5227K1.getOtherInfo();
				for (CodeAmount otherInfoIterator : otherInfoList) {
					CodeAmount codeAmount = otherInfoIterator.getCodeAmount(otherInfoIterator.getCodeAmountId());
					otherInfoListResponse.add(codeAmount);
				}
				tax5227K1.setOtherInfo(otherInfoListResponse);
			}
//			OtherInfo End

//			Credits Start
			List<CodeAmount> creditsListResponse = new ArrayList<>();
			if (tax5227K1.getCredits() != null) {
				List<CodeAmount> creditsList = tax5227K1.getCredits();
				for (CodeAmount creditsIterator : creditsList) {
					CodeAmount codeAmount = creditsIterator.getCodeAmount(creditsIterator.getCodeAmountId());
					creditsListResponse.add(codeAmount);
				}
				tax5227K1.setCredits(creditsListResponse);
			}
//			Credits End

//			AmtAdjustments Start
			List<CodeAmount> amtAdjustmentsListResponse = new ArrayList<>();
			if (tax5227K1.getAmtAdjustments() != null) {
				List<CodeAmount> amtAdjustmentsList = tax5227K1.getAmtAdjustments();
				for (CodeAmount amtAdjustmentsIterator : amtAdjustmentsList) {
					CodeAmount codeAmount = amtAdjustmentsIterator
							.getCodeAmount(amtAdjustmentsIterator.getCodeAmountId());
					amtAdjustmentsListResponse.add(codeAmount);
				}
				tax5227K1.setAmtAdjustments(amtAdjustmentsListResponse);
			}
//			AmtAdjustments End

//			FinalYearDeductions Start
			List<CodeAmount> finalYearDeductionsListResponse = new ArrayList<>();
			if (tax5227K1.getFinalYearDeductions() != null) {
				List<CodeAmount> finalYearDeductionsList = tax5227K1.getFinalYearDeductions();
				for (CodeAmount finalYearDeductionsIterator : finalYearDeductionsList) {
					CodeAmount codeAmount = finalYearDeductionsIterator
							.getCodeAmount(finalYearDeductionsIterator.getCodeAmountId());
					finalYearDeductionsListResponse.add(codeAmount);
				}
				tax5227K1.setFinalYearDeductions(finalYearDeductionsListResponse);
			}
//			FinalYearDeductions End

//			directlyApportionedDeductions Start
			List<CodeAmount> directlyApportionedDeductionsListResponse = new ArrayList<>();
			if (tax5227K1.getDirectlyApportionedDeductions() != null) {
				List<CodeAmount> directlyApportionedDeductionsList = tax5227K1.getDirectlyApportionedDeductions();
				for (CodeAmount directlyApportionedDeductionsIterator : directlyApportionedDeductionsList) {
					CodeAmount codeAmount = directlyApportionedDeductionsIterator
							.getCodeAmount(directlyApportionedDeductionsIterator.getCodeAmountId());
					directlyApportionedDeductionsListResponse.add(codeAmount);
				}
				tax5227K1.setDirectlyApportionedDeductions(directlyApportionedDeductionsListResponse);
			}
//			directlyApportionedDeductions End

//			BeneficiaryNameAddress Start
			NameAddress nameAddress = new NameAddress();
			if (tax5227K1.getBeneficiaryNameAddress() != null) {
				nameAddress = nameAddress
						.getNameAddressDetails(tax5227K1.getBeneficiaryNameAddress().getNameAddressId());
				tax5227K1.setBeneficiaryNameAddress(nameAddress);
			}
//			BeneficiaryNameAddress End

//			fiduciaryNameAddress Start
			NameAddress nameAddressFiduciary = new NameAddress();
			if (tax5227K1.getFiduciaryNameAddress() != null) {
				nameAddressFiduciary = nameAddressFiduciary
						.getNameAddressDetails(tax5227K1.getFiduciaryNameAddress().getNameAddressId());
				tax5227K1.setFiduciaryNameAddress(nameAddressFiduciary);
			}
//			fiduciaryNameAddress End

			return tax5227K1;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Tax5227K1 : ", e);
			throw new FDXException(e,500);
		}
	}

}
