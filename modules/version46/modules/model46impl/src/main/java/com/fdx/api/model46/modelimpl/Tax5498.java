package com.fdx.api.model46.modelimpl;

import java.util.Date;

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
import com.fdx.api.model46.mapper.Tax5498StatementRowMapper;

import io.swagger.annotations.ApiModel;

/**
 * IRA Contribution Information
 */
@ApiModel(description = "IRA Contribution Information")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax5498 {

	NamedParameterJdbcTemplate template;

	@JsonUnwrapped
	private Tax tax;

	@JsonProperty("issuerNameAddress")
	private NameAddressPhone issuerNameAddress;

	@JsonProperty("issuerTin")
	private String issuerTin;

	@JsonProperty("participantTin")
	private String participantTin;

	@JsonProperty("participantNameAddress")
	private NameAddress participantNameAddress;

	@JsonProperty("accountNumber")
	private String accountNumber;

	@JsonProperty("iraContributions")
	private Double iraContributions;

	@JsonProperty("rolloverContributions")
	private Double rolloverContributions;

	@JsonProperty("rothIraConversion")
	private Double rothIraConversion;

	@JsonProperty("recharacterizedContributions")
	private Double recharacterizedContributions;

	@JsonProperty("fairMarketValue")
	private Double fairMarketValue;

	@JsonProperty("lifeInsuranceCost")
	private Double lifeInsuranceCost;

	@JsonProperty("ira")
	@JsonInclude(Include.NON_NULL)
	private Boolean ira;

	@JsonProperty("sep")
	@JsonInclude(Include.NON_NULL)
	private Boolean sep;

	@JsonProperty("simple")
	@JsonInclude(Include.NON_NULL)
	private Boolean simple;

	@JsonProperty("rothIra")
	@JsonInclude(Include.NON_NULL)
	private Boolean rothIra;

	@JsonProperty("sepContributions")
	private Double sepContributions;

	@JsonProperty("simpleContributions")
	private Double simpleContributions;

	@JsonProperty("rothIraContributions")
	private Double rothIraContributions;

	@JsonProperty("rmdNextYear")
	@JsonInclude(Include.NON_NULL)
	private Boolean rmdNextYear;

	@JsonProperty("rmdDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private Date rmdDate;

	@JsonProperty("rmdAmount")
	private Double rmdAmount;

	@JsonProperty("postponedContribution")
	private Double postponedContribution;

	@JsonProperty("postponedYear")
	private Integer postponedYear;

	@JsonProperty("postponedCode")
	private String postponedCode;

	@JsonProperty("repayments")
	private Double repayments;

	@JsonProperty("repayCode")
	private String repayCode;

	@JsonProperty("fmvSpecifiedAssets")
	private Double fmvSpecifiedAssets;

	@JsonProperty("specifiedCodes")
	private String specifiedCodes;

	public Tax getTax() {
		return tax;
	}

	public void setTax(Tax tax) {
		this.tax = tax;
	}

	public NameAddressPhone getIssuerNameAddress() {
		return issuerNameAddress;
	}

	public void setIssuerNameAddress(NameAddressPhone issuerNameAddress) {
		this.issuerNameAddress = issuerNameAddress;
	}

	public String getIssuerTin() {
		return issuerTin;
	}

	public void setIssuerTin(String issuerTin) {
		this.issuerTin = issuerTin;
	}

	public String getParticipantTin() {
		return participantTin;
	}

	public void setParticipantTin(String participantTin) {
		this.participantTin = participantTin;
	}

	public NameAddress getParticipantNameAddress() {
		return participantNameAddress;
	}

	public void setParticipantNameAddress(NameAddress participantNameAddress) {
		this.participantNameAddress = participantNameAddress;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Double getIraContributions() {
		return iraContributions;
	}

	public void setIraContributions(Double iraContributions) {
		this.iraContributions = iraContributions;
	}

	public Double getRolloverContributions() {
		return rolloverContributions;
	}

	public void setRolloverContributions(Double rolloverContributions) {
		this.rolloverContributions = rolloverContributions;
	}

	public Double getRothIraConversion() {
		return rothIraConversion;
	}

	public void setRothIraConversion(Double rothIraConversion) {
		this.rothIraConversion = rothIraConversion;
	}

	public Double getRecharacterizedContributions() {
		return recharacterizedContributions;
	}

	public void setRecharacterizedContributions(Double recharacterizedContributions) {
		this.recharacterizedContributions = recharacterizedContributions;
	}

	public Double getFairMarketValue() {
		return fairMarketValue;
	}

	public void setFairMarketValue(Double fairMarketValue) {
		this.fairMarketValue = fairMarketValue;
	}

	public Double getLifeInsuranceCost() {
		return lifeInsuranceCost;
	}

	public void setLifeInsuranceCost(Double lifeInsuranceCost) {
		this.lifeInsuranceCost = lifeInsuranceCost;
	}

	public Boolean getIra() {
		return ira;
	}

	public void setIra(Boolean ira) {
		this.ira = ira;
	}

	public Boolean getSep() {
		return sep;
	}

	public void setSep(Boolean sep) {
		this.sep = sep;
	}

	public Boolean getSimple() {
		return simple;
	}

	public void setSimple(Boolean simple) {
		this.simple = simple;
	}

	public Boolean getRothIra() {
		return rothIra;
	}

	public void setRothIra(Boolean rothIra) {
		this.rothIra = rothIra;
	}

	public Double getSepContributions() {
		return sepContributions;
	}

	public void setSepContributions(Double sepContributions) {
		this.sepContributions = sepContributions;
	}

	public Double getSimpleContributions() {
		return simpleContributions;
	}

	public void setSimpleContributions(Double simpleContributions) {
		this.simpleContributions = simpleContributions;
	}

	public Double getRothIraContributions() {
		return rothIraContributions;
	}

	public void setRothIraContributions(Double rothIraContributions) {
		this.rothIraContributions = rothIraContributions;
	}

	public Boolean getRmdNextYear() {
		return rmdNextYear;
	}

	public void setRmdNextYear(Boolean rmdNextYear) {
		this.rmdNextYear = rmdNextYear;
	}

	public Date getRmdDate() {
		return rmdDate;
	}

	public void setRmdDate(Date rmdDate) {
		this.rmdDate = rmdDate;
	}

	public Double getRmdAmount() {
		return rmdAmount;
	}

	public void setRmdAmount(Double rmdAmount) {
		this.rmdAmount = rmdAmount;
	}

	public Double getPostponedContribution() {
		return postponedContribution;
	}

	public void setPostponedContribution(Double postponedContribution) {
		this.postponedContribution = postponedContribution;
	}

	public Integer getPostponedYear() {
		return postponedYear;
	}

	public void setPostponedYear(Integer postponedYear) {
		this.postponedYear = postponedYear;
	}

	public String getPostponedCode() {
		return postponedCode;
	}

	public void setPostponedCode(String postponedCode) {
		this.postponedCode = postponedCode;
	}

	public Double getRepayments() {
		return repayments;
	}

	public void setRepayments(Double repayments) {
		this.repayments = repayments;
	}

	public String getRepayCode() {
		return repayCode;
	}

	public void setRepayCode(String repayCode) {
		this.repayCode = repayCode;
	}

	public Double getFmvSpecifiedAssets() {
		return fmvSpecifiedAssets;
	}

	public void setFmvSpecifiedAssets(Double fmvSpecifiedAssets) {
		this.fmvSpecifiedAssets = fmvSpecifiedAssets;
	}

	public String getSpecifiedCodes() {
		return specifiedCodes;
	}

	public void setSpecifiedCodes(String specifiedCodes) {
		this.specifiedCodes = specifiedCodes;
	}

	@Override
	public String toString() {
		return "Tax5498 [tax=" + tax + ", issuerNameAddress=" + issuerNameAddress + ", issuerTin=" + issuerTin
				+ ", participantTin=" + participantTin + ", participantNameAddress=" + participantNameAddress
				+ ", accountNumber=" + accountNumber + ", iraContributions=" + iraContributions
				+ ", rolloverContributions=" + rolloverContributions + ", rothIraConversion=" + rothIraConversion
				+ ", recharacterizedContributions=" + recharacterizedContributions + ", fairMarketValue="
				+ fairMarketValue + ", lifeInsuranceCost=" + lifeInsuranceCost + ", ira=" + ira + ", sep=" + sep
				+ ", simple=" + simple + ", rothIra=" + rothIra + ", sepContributions=" + sepContributions
				+ ", simpleContributions=" + simpleContributions + ", rothIraContributions=" + rothIraContributions
				+ ", rmdNextYear=" + rmdNextYear + ", rmdDate=" + rmdDate + ", rmdAmount=" + rmdAmount
				+ ", postponedContribution=" + postponedContribution + ", postponedYear=" + postponedYear
				+ ", postponedCode=" + postponedCode + ", repayments=" + repayments + ", repayCode=" + repayCode
				+ ", fmvSpecifiedAssets=" + fmvSpecifiedAssets + ", specifiedCodes=" + specifiedCodes + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountNumber == null) ? 0 : accountNumber.hashCode());
		result = prime * result + ((fairMarketValue == null) ? 0 : fairMarketValue.hashCode());
		result = prime * result + ((fmvSpecifiedAssets == null) ? 0 : fmvSpecifiedAssets.hashCode());
		result = prime * result + ((ira == null) ? 0 : ira.hashCode());
		result = prime * result + ((iraContributions == null) ? 0 : iraContributions.hashCode());
		result = prime * result + ((issuerNameAddress == null) ? 0 : issuerNameAddress.hashCode());
		result = prime * result + ((issuerTin == null) ? 0 : issuerTin.hashCode());
		result = prime * result + ((lifeInsuranceCost == null) ? 0 : lifeInsuranceCost.hashCode());
		result = prime * result + ((participantNameAddress == null) ? 0 : participantNameAddress.hashCode());
		result = prime * result + ((participantTin == null) ? 0 : participantTin.hashCode());
		result = prime * result + ((postponedCode == null) ? 0 : postponedCode.hashCode());
		result = prime * result + ((postponedContribution == null) ? 0 : postponedContribution.hashCode());
		result = prime * result + ((postponedYear == null) ? 0 : postponedYear.hashCode());
		result = prime * result
				+ ((recharacterizedContributions == null) ? 0 : recharacterizedContributions.hashCode());
		result = prime * result + ((repayCode == null) ? 0 : repayCode.hashCode());
		result = prime * result + ((repayments == null) ? 0 : repayments.hashCode());
		result = prime * result + ((rmdAmount == null) ? 0 : rmdAmount.hashCode());
		result = prime * result + ((rmdDate == null) ? 0 : rmdDate.hashCode());
		result = prime * result + ((rmdNextYear == null) ? 0 : rmdNextYear.hashCode());
		result = prime * result + ((rolloverContributions == null) ? 0 : rolloverContributions.hashCode());
		result = prime * result + ((rothIra == null) ? 0 : rothIra.hashCode());
		result = prime * result + ((rothIraContributions == null) ? 0 : rothIraContributions.hashCode());
		result = prime * result + ((rothIraConversion == null) ? 0 : rothIraConversion.hashCode());
		result = prime * result + ((sep == null) ? 0 : sep.hashCode());
		result = prime * result + ((sepContributions == null) ? 0 : sepContributions.hashCode());
		result = prime * result + ((simple == null) ? 0 : simple.hashCode());
		result = prime * result + ((simpleContributions == null) ? 0 : simpleContributions.hashCode());
		result = prime * result + ((specifiedCodes == null) ? 0 : specifiedCodes.hashCode());
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
		Tax5498 other = (Tax5498) obj;
		if (accountNumber == null) {
			if (other.accountNumber != null)
				return false;
		} else if (!accountNumber.equals(other.accountNumber))
			return false;
		if (fairMarketValue == null) {
			if (other.fairMarketValue != null)
				return false;
		} else if (!fairMarketValue.equals(other.fairMarketValue))
			return false;
		if (fmvSpecifiedAssets == null) {
			if (other.fmvSpecifiedAssets != null)
				return false;
		} else if (!fmvSpecifiedAssets.equals(other.fmvSpecifiedAssets))
			return false;
		if (ira == null) {
			if (other.ira != null)
				return false;
		} else if (!ira.equals(other.ira))
			return false;
		if (iraContributions == null) {
			if (other.iraContributions != null)
				return false;
		} else if (!iraContributions.equals(other.iraContributions))
			return false;
		if (issuerNameAddress == null) {
			if (other.issuerNameAddress != null)
				return false;
		} else if (!issuerNameAddress.equals(other.issuerNameAddress))
			return false;
		if (issuerTin == null) {
			if (other.issuerTin != null)
				return false;
		} else if (!issuerTin.equals(other.issuerTin))
			return false;
		if (lifeInsuranceCost == null) {
			if (other.lifeInsuranceCost != null)
				return false;
		} else if (!lifeInsuranceCost.equals(other.lifeInsuranceCost))
			return false;
		if (participantNameAddress == null) {
			if (other.participantNameAddress != null)
				return false;
		} else if (!participantNameAddress.equals(other.participantNameAddress))
			return false;
		if (participantTin == null) {
			if (other.participantTin != null)
				return false;
		} else if (!participantTin.equals(other.participantTin))
			return false;
		if (postponedCode == null) {
			if (other.postponedCode != null)
				return false;
		} else if (!postponedCode.equals(other.postponedCode))
			return false;
		if (postponedContribution == null) {
			if (other.postponedContribution != null)
				return false;
		} else if (!postponedContribution.equals(other.postponedContribution))
			return false;
		if (postponedYear == null) {
			if (other.postponedYear != null)
				return false;
		} else if (!postponedYear.equals(other.postponedYear))
			return false;
		if (recharacterizedContributions == null) {
			if (other.recharacterizedContributions != null)
				return false;
		} else if (!recharacterizedContributions.equals(other.recharacterizedContributions))
			return false;
		if (repayCode == null) {
			if (other.repayCode != null)
				return false;
		} else if (!repayCode.equals(other.repayCode))
			return false;
		if (repayments == null) {
			if (other.repayments != null)
				return false;
		} else if (!repayments.equals(other.repayments))
			return false;
		if (rmdAmount == null) {
			if (other.rmdAmount != null)
				return false;
		} else if (!rmdAmount.equals(other.rmdAmount))
			return false;
		if (rmdDate == null) {
			if (other.rmdDate != null)
				return false;
		} else if (!rmdDate.equals(other.rmdDate))
			return false;
		if (rmdNextYear == null) {
			if (other.rmdNextYear != null)
				return false;
		} else if (!rmdNextYear.equals(other.rmdNextYear))
			return false;
		if (rolloverContributions == null) {
			if (other.rolloverContributions != null)
				return false;
		} else if (!rolloverContributions.equals(other.rolloverContributions))
			return false;
		if (rothIra == null) {
			if (other.rothIra != null)
				return false;
		} else if (!rothIra.equals(other.rothIra))
			return false;
		if (rothIraContributions == null) {
			if (other.rothIraContributions != null)
				return false;
		} else if (!rothIraContributions.equals(other.rothIraContributions))
			return false;
		if (rothIraConversion == null) {
			if (other.rothIraConversion != null)
				return false;
		} else if (!rothIraConversion.equals(other.rothIraConversion))
			return false;
		if (sep == null) {
			if (other.sep != null)
				return false;
		} else if (!sep.equals(other.sep))
			return false;
		if (sepContributions == null) {
			if (other.sepContributions != null)
				return false;
		} else if (!sepContributions.equals(other.sepContributions))
			return false;
		if (simple == null) {
			if (other.simple != null)
				return false;
		} else if (!simple.equals(other.simple))
			return false;
		if (simpleContributions == null) {
			if (other.simpleContributions != null)
				return false;
		} else if (!simpleContributions.equals(other.simpleContributions))
			return false;
		if (specifiedCodes == null) {
			if (other.specifiedCodes != null)
				return false;
		} else if (!specifiedCodes.equals(other.specifiedCodes))
			return false;
		if (tax == null) {
			if (other.tax != null)
				return false;
		} else if (!tax.equals(other.tax))
			return false;
		return true;
	}

	private static final Logger log = LoggerFactory.getLogger(Tax5498.class);

	public Tax5498 getTax5498(int internalId) throws FDXException {
		try {
			
			template = ConnectionConfigApi46.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("internalId", internalId);

			Tax5498 tax5498 = template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".tax5498 where internalId in (:internalId)", parameters,
					new Tax5498StatementRowMapper());

//			IssuerNameAddress Start
			NameAddressPhone nameAddress = new NameAddressPhone();
			if (tax5498.getIssuerNameAddress() != null) {
				nameAddress = nameAddress.getNameAddressPhoneDetails(tax5498.getIssuerNameAddress().getNameAddressId());
				tax5498.setIssuerNameAddress(nameAddress);
			}
//			IssuerNameAddress End

//			ParticipantNameAddress Start
			NameAddress nameAddressParticipant = new NameAddress();
			if (tax5498.getParticipantNameAddress() != null) {
				nameAddressParticipant = nameAddressParticipant
						.getNameAddressDetails(tax5498.getParticipantNameAddress().getNameAddressId());
				tax5498.setParticipantNameAddress(nameAddressParticipant);
			}
//			ParticipantNameAddress End

			return tax5498;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Tax5498 : ", e);
			throw new FDXException(e,500);
		}
	}

}
