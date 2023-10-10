package com.fdx.api.model46.modelimpl;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Tax1042SAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1042SAllOf {
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

	public Tax1042SAllOf formId(String formId) {
		this.formId = formId;
		return this;
	}

	/**
	 * Unique form identifier
	 * 
	 * @return formId
	 */
	@ApiModelProperty(value = "Unique form identifier")

	public String getFormId() {
		return formId;
	}

	public void setFormId(String formId) {
		this.formId = formId;
	}

	public Tax1042SAllOf amended(Boolean amended) {
		this.amended = amended;
		return this;
	}

	/**
	 * Amended
	 * 
	 * @return amended
	 */
	@ApiModelProperty(value = "Amended")

	public Boolean getAmended() {
		return amended;
	}

	public void setAmended(Boolean amended) {
		this.amended = amended;
	}

	public Tax1042SAllOf amendmentNumber(Integer amendmentNumber) {
		this.amendmentNumber = amendmentNumber;
		return this;
	}

	/**
	 * Amendment number
	 * 
	 * @return amendmentNumber
	 */
	@ApiModelProperty(value = "Amendment number")

	public Integer getAmendmentNumber() {
		return amendmentNumber;
	}

	public void setAmendmentNumber(Integer amendmentNumber) {
		this.amendmentNumber = amendmentNumber;
	}

	public Tax1042SAllOf incomeTypeCode(String incomeTypeCode) {
		this.incomeTypeCode = incomeTypeCode;
		return this;
	}

	/**
	 * Box 1, Income code
	 * 
	 * @return incomeTypeCode
	 */
	@ApiModelProperty(value = "Box 1, Income code")

	public String getIncomeTypeCode() {
		return incomeTypeCode;
	}

	public void setIncomeTypeCode(String incomeTypeCode) {
		this.incomeTypeCode = incomeTypeCode;
	}

	public Tax1042SAllOf grossIncome(Double grossIncome) {
		this.grossIncome = grossIncome;
		return this;
	}

	/**
	 * Box 2, Gross income
	 * 
	 * @return grossIncome
	 */
	@ApiModelProperty(value = "Box 2, Gross income")

	public Double getGrossIncome() {
		return grossIncome;
	}

	public void setGrossIncome(Double grossIncome) {
		this.grossIncome = grossIncome;
	}

	public Tax1042SAllOf chapterIndicator(String chapterIndicator) {
		this.chapterIndicator = chapterIndicator;
		return this;
	}

	/**
	 * Box 3, Chapter indicator
	 * 
	 * @return chapterIndicator
	 */
	@ApiModelProperty(value = "Box 3, Chapter indicator")

	public String getChapterIndicator() {
		return chapterIndicator;
	}

	public void setChapterIndicator(String chapterIndicator) {
		this.chapterIndicator = chapterIndicator;
	}

	public Tax1042SAllOf ch3ExemptionCode(String ch3ExemptionCode) {
		this.ch3ExemptionCode = ch3ExemptionCode;
		return this;
	}

	/**
	 * Box 3a, Exemption code
	 * 
	 * @return ch3ExemptionCode
	 */
	@ApiModelProperty(value = "Box 3a, Exemption code")

	public String getCh3ExemptionCode() {
		return ch3ExemptionCode;
	}

	public void setCh3ExemptionCode(String ch3ExemptionCode) {
		this.ch3ExemptionCode = ch3ExemptionCode;
	}

	public Tax1042SAllOf ch3TaxRate(Double ch3TaxRate) {
		this.ch3TaxRate = ch3TaxRate;
		return this;
	}

	/**
	 * Box 3b, Tax rate
	 * 
	 * @return ch3TaxRate
	 */
	@ApiModelProperty(value = "Box 3b, Tax rate")

	public Double getCh3TaxRate() {
		return ch3TaxRate;
	}

	public void setCh3TaxRate(Double ch3TaxRate) {
		this.ch3TaxRate = ch3TaxRate;
	}

	public Tax1042SAllOf ch4ExemptionCode(String ch4ExemptionCode) {
		this.ch4ExemptionCode = ch4ExemptionCode;
		return this;
	}

	/**
	 * Box 4a, Exemption code
	 * 
	 * @return ch4ExemptionCode
	 */
	@ApiModelProperty(value = "Box 4a, Exemption code")

	public String getCh4ExemptionCode() {
		return ch4ExemptionCode;
	}

	public void setCh4ExemptionCode(String ch4ExemptionCode) {
		this.ch4ExemptionCode = ch4ExemptionCode;
	}

	public Tax1042SAllOf ch4TaxRate(Double ch4TaxRate) {
		this.ch4TaxRate = ch4TaxRate;
		return this;
	}

	/**
	 * Box 4b, Tax rate
	 * 
	 * @return ch4TaxRate
	 */
	@ApiModelProperty(value = "Box 4b, Tax rate")

	public Double getCh4TaxRate() {
		return ch4TaxRate;
	}

	public void setCh4TaxRate(Double ch4TaxRate) {
		this.ch4TaxRate = ch4TaxRate;
	}

	public Tax1042SAllOf withholdingAllowance(Double withholdingAllowance) {
		this.withholdingAllowance = withholdingAllowance;
		return this;
	}

	/**
	 * Box 5, Withholding allowance
	 * 
	 * @return withholdingAllowance
	 */
	@ApiModelProperty(value = "Box 5, Withholding allowance")

	public Double getWithholdingAllowance() {
		return withholdingAllowance;
	}

	public void setWithholdingAllowance(Double withholdingAllowance) {
		this.withholdingAllowance = withholdingAllowance;
	}

	public Tax1042SAllOf netIncome(Double netIncome) {
		this.netIncome = netIncome;
		return this;
	}

	/**
	 * Box 6, Net income
	 * 
	 * @return netIncome
	 */
	@ApiModelProperty(value = "Box 6, Net income")

	public Double getNetIncome() {
		return netIncome;
	}

	public void setNetIncome(Double netIncome) {
		this.netIncome = netIncome;
	}

	public Tax1042SAllOf federalTaxWithheld(Double federalTaxWithheld) {
		this.federalTaxWithheld = federalTaxWithheld;
		return this;
	}

	/**
	 * Box 7a, Federal tax withheld
	 * 
	 * @return federalTaxWithheld
	 */
	@ApiModelProperty(value = "Box 7a, Federal tax withheld")

	public Double getFederalTaxWithheld() {
		return federalTaxWithheld;
	}

	public void setFederalTaxWithheld(Double federalTaxWithheld) {
		this.federalTaxWithheld = federalTaxWithheld;
	}

	public Tax1042SAllOf escrowProceduresApplied(Boolean escrowProceduresApplied) {
		this.escrowProceduresApplied = escrowProceduresApplied;
		return this;
	}

	/**
	 * Box 7b, Check if federal tax withheld was not deposited with the IRS because
	 * escrow procedures were applied
	 * 
	 * @return escrowProceduresApplied
	 */
	@ApiModelProperty(value = "Box 7b, Check if federal tax withheld was not deposited with the IRS because escrow procedures were applied")

	public Boolean getEscrowProceduresApplied() {
		return escrowProceduresApplied;
	}

	public void setEscrowProceduresApplied(Boolean escrowProceduresApplied) {
		this.escrowProceduresApplied = escrowProceduresApplied;
	}

	public Tax1042SAllOf subsequentYear(Boolean subsequentYear) {
		this.subsequentYear = subsequentYear;
		return this;
	}

	/**
	 * Box 7c, Check if withholding occurred in subsequent year with respect to a
	 * partnership interest
	 * 
	 * @return subsequentYear
	 */
	@ApiModelProperty(value = "Box 7c, Check if withholding occurred in subsequent year with respect to a partnership interest")

	public Boolean getSubsequentYear() {
		return subsequentYear;
	}

	public void setSubsequentYear(Boolean subsequentYear) {
		this.subsequentYear = subsequentYear;
	}

	public Tax1042SAllOf otherAgentsTaxWithheld(Double otherAgentsTaxWithheld) {
		this.otherAgentsTaxWithheld = otherAgentsTaxWithheld;
		return this;
	}

	/**
	 * Box 8, Tax withheld by other agents
	 * 
	 * @return otherAgentsTaxWithheld
	 */
	@ApiModelProperty(value = "Box 8, Tax withheld by other agents")

	public Double getOtherAgentsTaxWithheld() {
		return otherAgentsTaxWithheld;
	}

	public void setOtherAgentsTaxWithheld(Double otherAgentsTaxWithheld) {
		this.otherAgentsTaxWithheld = otherAgentsTaxWithheld;
	}

	public Tax1042SAllOf recipientRepaidAmount(Double recipientRepaidAmount) {
		this.recipientRepaidAmount = recipientRepaidAmount;
		return this;
	}

	/**
	 * Box 9, Overwithheld tax repaid to recipient pursuant to adjustment procedures
	 * 
	 * @return recipientRepaidAmount
	 */
	@ApiModelProperty(value = "Box 9, Overwithheld tax repaid to recipient pursuant to adjustment procedures")

	public Double getRecipientRepaidAmount() {
		return recipientRepaidAmount;
	}

	public void setRecipientRepaidAmount(Double recipientRepaidAmount) {
		this.recipientRepaidAmount = recipientRepaidAmount;
	}

	public Tax1042SAllOf totalTaxWithholdingCredit(Double totalTaxWithholdingCredit) {
		this.totalTaxWithholdingCredit = totalTaxWithholdingCredit;
		return this;
	}

	/**
	 * Box 10, Total withholding credit
	 * 
	 * @return totalTaxWithholdingCredit
	 */
	@ApiModelProperty(value = "Box 10, Total withholding credit")

	public Double getTotalTaxWithholdingCredit() {
		return totalTaxWithholdingCredit;
	}

	public void setTotalTaxWithholdingCredit(Double totalTaxWithholdingCredit) {
		this.totalTaxWithholdingCredit = totalTaxWithholdingCredit;
	}

	public Tax1042SAllOf withholdingAgentTaxPaid(Double withholdingAgentTaxPaid) {
		this.withholdingAgentTaxPaid = withholdingAgentTaxPaid;
		return this;
	}

	/**
	 * Box 11, Tax paid by withholding agent (amounts not withheld)
	 * 
	 * @return withholdingAgentTaxPaid
	 */
	@ApiModelProperty(value = "Box 11, Tax paid by withholding agent (amounts not withheld)")

	public Double getWithholdingAgentTaxPaid() {
		return withholdingAgentTaxPaid;
	}

	public void setWithholdingAgentTaxPaid(Double withholdingAgentTaxPaid) {
		this.withholdingAgentTaxPaid = withholdingAgentTaxPaid;
	}

	public Tax1042SAllOf withholdingAgent(Form1042Agent withholdingAgent) {
		this.withholdingAgent = withholdingAgent;
		return this;
	}

	/**
	 * Get withholdingAgent
	 * 
	 * @return withholdingAgent
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Form1042Agent getWithholdingAgent() {
		return withholdingAgent;
	}

	public void setWithholdingAgent(Form1042Agent withholdingAgent) {
		this.withholdingAgent = withholdingAgent;
	}

	public Tax1042SAllOf recipient(Form1042Recipient recipient) {
		this.recipient = recipient;
		return this;
	}

	/**
	 * Get recipient
	 * 
	 * @return recipient
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Form1042Recipient getRecipient() {
		return recipient;
	}

	public void setRecipient(Form1042Recipient recipient) {
		this.recipient = recipient;
	}

	public Tax1042SAllOf accountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
		return this;
	}

	/**
	 * Box 13k, Recipient account number
	 * 
	 * @return accountNumber
	 */
	@ApiModelProperty(value = "Box 13k, Recipient account number")

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Tax1042SAllOf primary(Form1042Agent primary) {
		this.primary = primary;
		return this;
	}

	/**
	 * Get primary
	 * 
	 * @return primary
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Form1042Agent getPrimary() {
		return primary;
	}

	public void setPrimary(Form1042Agent primary) {
		this.primary = primary;
	}

	public Tax1042SAllOf prorataBasisReporting(Boolean prorataBasisReporting) {
		this.prorataBasisReporting = prorataBasisReporting;
		return this;
	}

	/**
	 * Box 15, Check if pro-rata basis reporting
	 * 
	 * @return prorataBasisReporting
	 */
	@ApiModelProperty(value = "Box 15, Check if pro-rata basis reporting")

	public Boolean getProrataBasisReporting() {
		return prorataBasisReporting;
	}

	public void setProrataBasisReporting(Boolean prorataBasisReporting) {
		this.prorataBasisReporting = prorataBasisReporting;
	}

	public Tax1042SAllOf intermediary(Form1042Agent intermediary) {
		this.intermediary = intermediary;
		return this;
	}

	/**
	 * Get intermediary
	 * 
	 * @return intermediary
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Form1042Agent getIntermediary() {
		return intermediary;
	}

	public void setIntermediary(Form1042Agent intermediary) {
		this.intermediary = intermediary;
	}

	public Tax1042SAllOf payer(Form1042Agent payer) {
		this.payer = payer;
		return this;
	}

	/**
	 * Get payer
	 * 
	 * @return payer
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Form1042Agent getPayer() {
		return payer;
	}

	public void setPayer(Form1042Agent payer) {
		this.payer = payer;
	}

	public Tax1042SAllOf stateTaxWithholding(StateTaxWithholding stateTaxWithholding) {
		this.stateTaxWithholding = stateTaxWithholding;
		return this;
	}

	/**
	 * Get stateTaxWithholding
	 * 
	 * @return stateTaxWithholding
	 */
	@ApiModelProperty(value = "")

	@Valid

	public StateTaxWithholding getStateTaxWithholding() {
		return stateTaxWithholding;
	}

	public void setStateTaxWithholding(StateTaxWithholding stateTaxWithholding) {
		this.stateTaxWithholding = stateTaxWithholding;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Tax1042SAllOf tax1042SAllOf = (Tax1042SAllOf) o;
		return Objects.equals(this.formId, tax1042SAllOf.formId) && Objects.equals(this.amended, tax1042SAllOf.amended)
				&& Objects.equals(this.amendmentNumber, tax1042SAllOf.amendmentNumber)
				&& Objects.equals(this.incomeTypeCode, tax1042SAllOf.incomeTypeCode)
				&& Objects.equals(this.grossIncome, tax1042SAllOf.grossIncome)
				&& Objects.equals(this.chapterIndicator, tax1042SAllOf.chapterIndicator)
				&& Objects.equals(this.ch3ExemptionCode, tax1042SAllOf.ch3ExemptionCode)
				&& Objects.equals(this.ch3TaxRate, tax1042SAllOf.ch3TaxRate)
				&& Objects.equals(this.ch4ExemptionCode, tax1042SAllOf.ch4ExemptionCode)
				&& Objects.equals(this.ch4TaxRate, tax1042SAllOf.ch4TaxRate)
				&& Objects.equals(this.withholdingAllowance, tax1042SAllOf.withholdingAllowance)
				&& Objects.equals(this.netIncome, tax1042SAllOf.netIncome)
				&& Objects.equals(this.federalTaxWithheld, tax1042SAllOf.federalTaxWithheld)
				&& Objects.equals(this.escrowProceduresApplied, tax1042SAllOf.escrowProceduresApplied)
				&& Objects.equals(this.subsequentYear, tax1042SAllOf.subsequentYear)
				&& Objects.equals(this.otherAgentsTaxWithheld, tax1042SAllOf.otherAgentsTaxWithheld)
				&& Objects.equals(this.recipientRepaidAmount, tax1042SAllOf.recipientRepaidAmount)
				&& Objects.equals(this.totalTaxWithholdingCredit, tax1042SAllOf.totalTaxWithholdingCredit)
				&& Objects.equals(this.withholdingAgentTaxPaid, tax1042SAllOf.withholdingAgentTaxPaid)
				&& Objects.equals(this.withholdingAgent, tax1042SAllOf.withholdingAgent)
				&& Objects.equals(this.recipient, tax1042SAllOf.recipient)
				&& Objects.equals(this.accountNumber, tax1042SAllOf.accountNumber)
				&& Objects.equals(this.primary, tax1042SAllOf.primary)
				&& Objects.equals(this.prorataBasisReporting, tax1042SAllOf.prorataBasisReporting)
				&& Objects.equals(this.intermediary, tax1042SAllOf.intermediary)
				&& Objects.equals(this.payer, tax1042SAllOf.payer)
				&& Objects.equals(this.stateTaxWithholding, tax1042SAllOf.stateTaxWithholding);
	}

	@Override
	public int hashCode() {
		return Objects.hash(formId, amended, amendmentNumber, incomeTypeCode, grossIncome, chapterIndicator,
				ch3ExemptionCode, ch3TaxRate, ch4ExemptionCode, ch4TaxRate, withholdingAllowance, netIncome,
				federalTaxWithheld, escrowProceduresApplied, subsequentYear, otherAgentsTaxWithheld,
				recipientRepaidAmount, totalTaxWithholdingCredit, withholdingAgentTaxPaid, withholdingAgent, recipient,
				accountNumber, primary, prorataBasisReporting, intermediary, payer, stateTaxWithholding);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Tax1042SAllOf {\n");

		sb.append("    formId: ").append(toIndentedString(formId)).append("\n");
		sb.append("    amended: ").append(toIndentedString(amended)).append("\n");
		sb.append("    amendmentNumber: ").append(toIndentedString(amendmentNumber)).append("\n");
		sb.append("    incomeTypeCode: ").append(toIndentedString(incomeTypeCode)).append("\n");
		sb.append("    grossIncome: ").append(toIndentedString(grossIncome)).append("\n");
		sb.append("    chapterIndicator: ").append(toIndentedString(chapterIndicator)).append("\n");
		sb.append("    ch3ExemptionCode: ").append(toIndentedString(ch3ExemptionCode)).append("\n");
		sb.append("    ch3TaxRate: ").append(toIndentedString(ch3TaxRate)).append("\n");
		sb.append("    ch4ExemptionCode: ").append(toIndentedString(ch4ExemptionCode)).append("\n");
		sb.append("    ch4TaxRate: ").append(toIndentedString(ch4TaxRate)).append("\n");
		sb.append("    withholdingAllowance: ").append(toIndentedString(withholdingAllowance)).append("\n");
		sb.append("    netIncome: ").append(toIndentedString(netIncome)).append("\n");
		sb.append("    federalTaxWithheld: ").append(toIndentedString(federalTaxWithheld)).append("\n");
		sb.append("    escrowProceduresApplied: ").append(toIndentedString(escrowProceduresApplied)).append("\n");
		sb.append("    subsequentYear: ").append(toIndentedString(subsequentYear)).append("\n");
		sb.append("    otherAgentsTaxWithheld: ").append(toIndentedString(otherAgentsTaxWithheld)).append("\n");
		sb.append("    recipientRepaidAmount: ").append(toIndentedString(recipientRepaidAmount)).append("\n");
		sb.append("    totalTaxWithholdingCredit: ").append(toIndentedString(totalTaxWithholdingCredit)).append("\n");
		sb.append("    withholdingAgentTaxPaid: ").append(toIndentedString(withholdingAgentTaxPaid)).append("\n");
		sb.append("    withholdingAgent: ").append(toIndentedString(withholdingAgent)).append("\n");
		sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
		sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
		sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
		sb.append("    prorataBasisReporting: ").append(toIndentedString(prorataBasisReporting)).append("\n");
		sb.append("    intermediary: ").append(toIndentedString(intermediary)).append("\n");
		sb.append("    payer: ").append(toIndentedString(payer)).append("\n");
		sb.append("    stateTaxWithholding: ").append(toIndentedString(stateTaxWithholding)).append("\n");
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
