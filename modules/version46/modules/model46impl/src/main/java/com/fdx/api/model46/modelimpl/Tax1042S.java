package com.fdx.api.model46.modelimpl;

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
import com.fdx.api.model46.mapper.Tax1042SRowMapper;

import io.swagger.annotations.ApiModel;

/**
 * Foreign Person&#39;s U.S. Source Income Subject to Withholding
 */
@ApiModel(description = "Foreign Person's U.S. Source Income Subject to Withholding")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1042S {

	NamedParameterJdbcTemplate template;

	@JsonUnwrapped
	private Tax tax;

	@JsonProperty("formId")
	private String formId;

	@JsonProperty("amended")
	@JsonInclude(Include.NON_NULL)
	private Boolean amended;

	@JsonProperty("amendmentNumber")
	private Integer amendmentNumber;

	@JsonProperty("incomeTypeCode")
	private String incomeTypeCode;

	@JsonProperty("grossIncome")
	private Double grossIncome;

	@JsonProperty("chapterIndicator")
	private String chapterIndicator;

	@JsonProperty("ch3ExemptionCode")
	private String ch3ExemptionCode;

	@JsonProperty("ch3TaxRate")
	private Double ch3TaxRate;

	@JsonProperty("ch4ExemptionCode")
	private String ch4ExemptionCode;

	@JsonProperty("ch4TaxRate")
	private Double ch4TaxRate;

	@JsonProperty("withholdingAllowance")
	private Double withholdingAllowance;

	@JsonProperty("netIncome")
	private Double netIncome;

	@JsonProperty("federalTaxWithheld")
	private Double federalTaxWithheld;

	@JsonProperty("escrowProceduresApplied")
	@JsonInclude(Include.NON_NULL)
	private Boolean escrowProceduresApplied;

	@JsonProperty("subsequentYear")
	@JsonInclude(Include.NON_NULL)
	private Boolean subsequentYear;

	@JsonProperty("otherAgentsTaxWithheld")
	private Double otherAgentsTaxWithheld;

	@JsonProperty("recipientRepaidAmount")
	private Double recipientRepaidAmount;

	@JsonProperty("totalTaxWithholdingCredit")
	private Double totalTaxWithholdingCredit;

	@JsonProperty("withholdingAgentTaxPaid")
	private Double withholdingAgentTaxPaid;

	@JsonProperty("withholdingAgent")
	private Form1042Agent withholdingAgent;

	@JsonProperty("recipient")
	private Form1042Recipient recipient;

	@JsonProperty("accountNumber")
	private String accountNumber;

	@JsonProperty("primary")
	private Form1042Agent primary;

	@JsonProperty("prorataBasisReporting")
	@JsonInclude(Include.NON_NULL)
	private Boolean prorataBasisReporting;

	@JsonProperty("intermediary")
	private Form1042Agent intermediary;

	@JsonProperty("payer")
	private Form1042Agent payer;

	@JsonProperty("stateTaxWithholding")
	private StateTaxWithholding stateTaxWithholding;

	public Tax getTax() {
		return tax;
	}

	public void setTax(Tax tax) {
		this.tax = tax;
	}

	public String getFormId() {
		return formId;
	}

	public void setFormId(String formId) {
		this.formId = formId;
	}

	public Boolean getAmended() {
		return amended;
	}

	public void setAmended(Boolean amended) {
		this.amended = amended;
	}

	public Integer getAmendmentNumber() {
		return amendmentNumber;
	}

	public void setAmendmentNumber(Integer amendmentNumber) {
		this.amendmentNumber = amendmentNumber;
	}

	public String getIncomeTypeCode() {
		return incomeTypeCode;
	}

	public void setIncomeTypeCode(String incomeTypeCode) {
		this.incomeTypeCode = incomeTypeCode;
	}

	public Double getGrossIncome() {
		return grossIncome;
	}

	public void setGrossIncome(Double grossIncome) {
		this.grossIncome = grossIncome;
	}

	public String getChapterIndicator() {
		return chapterIndicator;
	}

	public void setChapterIndicator(String chapterIndicator) {
		this.chapterIndicator = chapterIndicator;
	}

	public String getCh3ExemptionCode() {
		return ch3ExemptionCode;
	}

	public void setCh3ExemptionCode(String ch3ExemptionCode) {
		this.ch3ExemptionCode = ch3ExemptionCode;
	}

	public Double getCh3TaxRate() {
		return ch3TaxRate;
	}

	public void setCh3TaxRate(Double ch3TaxRate) {
		this.ch3TaxRate = ch3TaxRate;
	}

	public String getCh4ExemptionCode() {
		return ch4ExemptionCode;
	}

	public void setCh4ExemptionCode(String ch4ExemptionCode) {
		this.ch4ExemptionCode = ch4ExemptionCode;
	}

	public Double getCh4TaxRate() {
		return ch4TaxRate;
	}

	public void setCh4TaxRate(Double ch4TaxRate) {
		this.ch4TaxRate = ch4TaxRate;
	}

	public Double getWithholdingAllowance() {
		return withholdingAllowance;
	}

	public void setWithholdingAllowance(Double withholdingAllowance) {
		this.withholdingAllowance = withholdingAllowance;
	}

	public Double getNetIncome() {
		return netIncome;
	}

	public void setNetIncome(Double netIncome) {
		this.netIncome = netIncome;
	}

	public Double getFederalTaxWithheld() {
		return federalTaxWithheld;
	}

	public void setFederalTaxWithheld(Double federalTaxWithheld) {
		this.federalTaxWithheld = federalTaxWithheld;
	}

	public Boolean getEscrowProceduresApplied() {
		return escrowProceduresApplied;
	}

	public void setEscrowProceduresApplied(Boolean escrowProceduresApplied) {
		this.escrowProceduresApplied = escrowProceduresApplied;
	}

	public Boolean getSubsequentYear() {
		return subsequentYear;
	}

	public void setSubsequentYear(Boolean subsequentYear) {
		this.subsequentYear = subsequentYear;
	}

	public Double getOtherAgentsTaxWithheld() {
		return otherAgentsTaxWithheld;
	}

	public void setOtherAgentsTaxWithheld(Double otherAgentsTaxWithheld) {
		this.otherAgentsTaxWithheld = otherAgentsTaxWithheld;
	}

	public Double getRecipientRepaidAmount() {
		return recipientRepaidAmount;
	}

	public void setRecipientRepaidAmount(Double recipientRepaidAmount) {
		this.recipientRepaidAmount = recipientRepaidAmount;
	}

	public Double getTotalTaxWithholdingCredit() {
		return totalTaxWithholdingCredit;
	}

	public void setTotalTaxWithholdingCredit(Double totalTaxWithholdingCredit) {
		this.totalTaxWithholdingCredit = totalTaxWithholdingCredit;
	}

	public Double getWithholdingAgentTaxPaid() {
		return withholdingAgentTaxPaid;
	}

	public void setWithholdingAgentTaxPaid(Double withholdingAgentTaxPaid) {
		this.withholdingAgentTaxPaid = withholdingAgentTaxPaid;
	}

	public Form1042Agent getWithholdingAgent() {
		return withholdingAgent;
	}

	public void setWithholdingAgent(Form1042Agent withholdingAgent) {
		this.withholdingAgent = withholdingAgent;
	}

	public Form1042Recipient getRecipient() {
		return recipient;
	}

	public void setRecipient(Form1042Recipient recipient) {
		this.recipient = recipient;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Form1042Agent getPrimary() {
		return primary;
	}

	public void setPrimary(Form1042Agent primary) {
		this.primary = primary;
	}

	public Boolean getProrataBasisReporting() {
		return prorataBasisReporting;
	}

	public void setProrataBasisReporting(Boolean prorataBasisReporting) {
		this.prorataBasisReporting = prorataBasisReporting;
	}

	public Form1042Agent getIntermediary() {
		return intermediary;
	}

	public void setIntermediary(Form1042Agent intermediary) {
		this.intermediary = intermediary;
	}

	public Form1042Agent getPayer() {
		return payer;
	}

	public void setPayer(Form1042Agent payer) {
		this.payer = payer;
	}

	public StateTaxWithholding getStateTaxWithholding() {
		return stateTaxWithholding;
	}

	public void setStateTaxWithholding(StateTaxWithholding stateTaxWithholding) {
		this.stateTaxWithholding = stateTaxWithholding;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountNumber == null) ? 0 : accountNumber.hashCode());
		result = prime * result + ((amended == null) ? 0 : amended.hashCode());
		result = prime * result + ((amendmentNumber == null) ? 0 : amendmentNumber.hashCode());
		result = prime * result + ((ch3ExemptionCode == null) ? 0 : ch3ExemptionCode.hashCode());
		result = prime * result + ((ch3TaxRate == null) ? 0 : ch3TaxRate.hashCode());
		result = prime * result + ((ch4ExemptionCode == null) ? 0 : ch4ExemptionCode.hashCode());
		result = prime * result + ((ch4TaxRate == null) ? 0 : ch4TaxRate.hashCode());
		result = prime * result + ((chapterIndicator == null) ? 0 : chapterIndicator.hashCode());
		result = prime * result + ((escrowProceduresApplied == null) ? 0 : escrowProceduresApplied.hashCode());
		result = prime * result + ((federalTaxWithheld == null) ? 0 : federalTaxWithheld.hashCode());
		result = prime * result + ((formId == null) ? 0 : formId.hashCode());
		result = prime * result + ((grossIncome == null) ? 0 : grossIncome.hashCode());
		result = prime * result + ((incomeTypeCode == null) ? 0 : incomeTypeCode.hashCode());
		result = prime * result + ((intermediary == null) ? 0 : intermediary.hashCode());
		result = prime * result + ((netIncome == null) ? 0 : netIncome.hashCode());
		result = prime * result + ((otherAgentsTaxWithheld == null) ? 0 : otherAgentsTaxWithheld.hashCode());
		result = prime * result + ((payer == null) ? 0 : payer.hashCode());
		result = prime * result + ((primary == null) ? 0 : primary.hashCode());
		result = prime * result + ((prorataBasisReporting == null) ? 0 : prorataBasisReporting.hashCode());
		result = prime * result + ((recipient == null) ? 0 : recipient.hashCode());
		result = prime * result + ((recipientRepaidAmount == null) ? 0 : recipientRepaidAmount.hashCode());
		result = prime * result + ((stateTaxWithholding == null) ? 0 : stateTaxWithholding.hashCode());
		result = prime * result + ((subsequentYear == null) ? 0 : subsequentYear.hashCode());
		result = prime * result + ((tax == null) ? 0 : tax.hashCode());
		result = prime * result + ((totalTaxWithholdingCredit == null) ? 0 : totalTaxWithholdingCredit.hashCode());
		result = prime * result + ((withholdingAgent == null) ? 0 : withholdingAgent.hashCode());
		result = prime * result + ((withholdingAgentTaxPaid == null) ? 0 : withholdingAgentTaxPaid.hashCode());
		result = prime * result + ((withholdingAllowance == null) ? 0 : withholdingAllowance.hashCode());
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
		Tax1042S other = (Tax1042S) obj;
		if (accountNumber == null) {
			if (other.accountNumber != null)
				return false;
		} else if (!accountNumber.equals(other.accountNumber))
			return false;
		if (amended == null) {
			if (other.amended != null)
				return false;
		} else if (!amended.equals(other.amended))
			return false;
		if (amendmentNumber == null) {
			if (other.amendmentNumber != null)
				return false;
		} else if (!amendmentNumber.equals(other.amendmentNumber))
			return false;
		if (ch3ExemptionCode == null) {
			if (other.ch3ExemptionCode != null)
				return false;
		} else if (!ch3ExemptionCode.equals(other.ch3ExemptionCode))
			return false;
		if (ch3TaxRate == null) {
			if (other.ch3TaxRate != null)
				return false;
		} else if (!ch3TaxRate.equals(other.ch3TaxRate))
			return false;
		if (ch4ExemptionCode == null) {
			if (other.ch4ExemptionCode != null)
				return false;
		} else if (!ch4ExemptionCode.equals(other.ch4ExemptionCode))
			return false;
		if (ch4TaxRate == null) {
			if (other.ch4TaxRate != null)
				return false;
		} else if (!ch4TaxRate.equals(other.ch4TaxRate))
			return false;
		if (chapterIndicator == null) {
			if (other.chapterIndicator != null)
				return false;
		} else if (!chapterIndicator.equals(other.chapterIndicator))
			return false;
		if (escrowProceduresApplied == null) {
			if (other.escrowProceduresApplied != null)
				return false;
		} else if (!escrowProceduresApplied.equals(other.escrowProceduresApplied))
			return false;
		if (federalTaxWithheld == null) {
			if (other.federalTaxWithheld != null)
				return false;
		} else if (!federalTaxWithheld.equals(other.federalTaxWithheld))
			return false;
		if (formId == null) {
			if (other.formId != null)
				return false;
		} else if (!formId.equals(other.formId))
			return false;
		if (grossIncome == null) {
			if (other.grossIncome != null)
				return false;
		} else if (!grossIncome.equals(other.grossIncome))
			return false;
		if (incomeTypeCode == null) {
			if (other.incomeTypeCode != null)
				return false;
		} else if (!incomeTypeCode.equals(other.incomeTypeCode))
			return false;
		if (intermediary == null) {
			if (other.intermediary != null)
				return false;
		} else if (!intermediary.equals(other.intermediary))
			return false;
		if (netIncome == null) {
			if (other.netIncome != null)
				return false;
		} else if (!netIncome.equals(other.netIncome))
			return false;
		if (otherAgentsTaxWithheld == null) {
			if (other.otherAgentsTaxWithheld != null)
				return false;
		} else if (!otherAgentsTaxWithheld.equals(other.otherAgentsTaxWithheld))
			return false;
		if (payer == null) {
			if (other.payer != null)
				return false;
		} else if (!payer.equals(other.payer))
			return false;
		if (primary == null) {
			if (other.primary != null)
				return false;
		} else if (!primary.equals(other.primary))
			return false;
		if (prorataBasisReporting == null) {
			if (other.prorataBasisReporting != null)
				return false;
		} else if (!prorataBasisReporting.equals(other.prorataBasisReporting))
			return false;
		if (recipient == null) {
			if (other.recipient != null)
				return false;
		} else if (!recipient.equals(other.recipient))
			return false;
		if (recipientRepaidAmount == null) {
			if (other.recipientRepaidAmount != null)
				return false;
		} else if (!recipientRepaidAmount.equals(other.recipientRepaidAmount))
			return false;
		if (stateTaxWithholding == null) {
			if (other.stateTaxWithholding != null)
				return false;
		} else if (!stateTaxWithholding.equals(other.stateTaxWithholding))
			return false;
		if (subsequentYear == null) {
			if (other.subsequentYear != null)
				return false;
		} else if (!subsequentYear.equals(other.subsequentYear))
			return false;
		if (tax == null) {
			if (other.tax != null)
				return false;
		} else if (!tax.equals(other.tax))
			return false;
		if (totalTaxWithholdingCredit == null) {
			if (other.totalTaxWithholdingCredit != null)
				return false;
		} else if (!totalTaxWithholdingCredit.equals(other.totalTaxWithholdingCredit))
			return false;
		if (withholdingAgent == null) {
			if (other.withholdingAgent != null)
				return false;
		} else if (!withholdingAgent.equals(other.withholdingAgent))
			return false;
		if (withholdingAgentTaxPaid == null) {
			if (other.withholdingAgentTaxPaid != null)
				return false;
		} else if (!withholdingAgentTaxPaid.equals(other.withholdingAgentTaxPaid))
			return false;
		if (withholdingAllowance == null) {
			if (other.withholdingAllowance != null)
				return false;
		} else if (!withholdingAllowance.equals(other.withholdingAllowance))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tax1042S [tax=" + tax + ", formId=" + formId + ", amended=" + amended + ", amendmentNumber="
				+ amendmentNumber + ", incomeTypeCode=" + incomeTypeCode + ", grossIncome=" + grossIncome
				+ ", chapterIndicator=" + chapterIndicator + ", ch3ExemptionCode=" + ch3ExemptionCode + ", ch3TaxRate="
				+ ch3TaxRate + ", ch4ExemptionCode=" + ch4ExemptionCode + ", ch4TaxRate=" + ch4TaxRate
				+ ", withholdingAllowance=" + withholdingAllowance + ", netIncome=" + netIncome
				+ ", federalTaxWithheld=" + federalTaxWithheld + ", escrowProceduresApplied=" + escrowProceduresApplied
				+ ", subsequentYear=" + subsequentYear + ", otherAgentsTaxWithheld=" + otherAgentsTaxWithheld
				+ ", recipientRepaidAmount=" + recipientRepaidAmount + ", totalTaxWithholdingCredit="
				+ totalTaxWithholdingCredit + ", withholdingAgentTaxPaid=" + withholdingAgentTaxPaid
				+ ", withholdingAgent=" + withholdingAgent + ", recipient=" + recipient + ", accountNumber="
				+ accountNumber + ", primary=" + primary + ", prorataBasisReporting=" + prorataBasisReporting
				+ ", intermediary=" + intermediary + ", payer=" + payer + ", stateTaxWithholding=" + stateTaxWithholding
				+ "]";
	}

	private static final Logger log = LoggerFactory.getLogger(Tax1042S.class);

	public Tax1042S getTax1042S(int internalId) throws FDXException {
		try {
			
			template = ConnectionConfigApi46.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("internalId", internalId);

			Tax1042S tax1042S = template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".tax1042S where internalId in (:internalId)", parameters,
					new Tax1042SRowMapper());

//			StateTaxWithholding Start
			StateTaxWithholding stateTaxWithholding = new StateTaxWithholding();
			if (tax1042S.getStateTaxWithholding() != null) {
				stateTaxWithholding = stateTaxWithholding
						.getStateTaxWIthHolding(tax1042S.getStateTaxWithholding().getStwithheldid());
				tax1042S.setStateTaxWithholding(stateTaxWithholding);
			}
//			StateTaxWithholding End

//			WithholdingAgent Start
			Form1042Agent withholdingagent = new Form1042Agent();
			if (tax1042S.getWithholdingAgent() != null) {
				withholdingagent = withholdingagent.getForm1042Agent(tax1042S.getWithholdingAgent().getAgentId());
				tax1042S.setWithholdingAgent(withholdingagent);
			}
//			WithholdingAgent End

//			Recipient Start
			Form1042Recipient recipient = new Form1042Recipient();
			if (tax1042S.getRecipient() != null) {
				recipient = recipient.getForm1042Recipient(tax1042S.getRecipient().getRecipientid());
				tax1042S.setRecipient(recipient);
			}
//			Recipient End

//			Primary Start
			Form1042Agent primaryagent = new Form1042Agent();
			if (tax1042S.getPrimary() != null) {
				primaryagent = primaryagent.getForm1042Agent(tax1042S.getPrimary().getAgentId());
				tax1042S.setPrimary(primaryagent);
			}
//			Primary End	

//			Payer Start
			Form1042Agent payer = new Form1042Agent();
			if (tax1042S.getPayer() != null) {
				payer = payer.getForm1042Agent(tax1042S.getPayer().getAgentId());
				tax1042S.setPayer(payer);
			}
//			Payer End

//			intermediary Start
			Form1042Agent intermediary = new Form1042Agent();
			if (tax1042S.getIntermediary() != null) {
				intermediary = intermediary.getForm1042Agent(tax1042S.getIntermediary().getAgentId());
				tax1042S.setIntermediary(intermediary);
			}
//			intermediary End

			return tax1042S;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Tax1042S : ", e);
			throw new FDXException(e,500);
		}
	}

}
