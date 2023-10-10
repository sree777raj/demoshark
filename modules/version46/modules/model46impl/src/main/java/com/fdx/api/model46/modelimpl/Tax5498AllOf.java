package com.fdx.api.model46.modelimpl;

import java.time.LocalDate;
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
 * Tax5498AllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax5498AllOf {
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
	private LocalDate rmdDate;

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

	public Tax5498AllOf issuerNameAddress(NameAddressPhone issuerNameAddress) {
		this.issuerNameAddress = issuerNameAddress;
		return this;
	}

	/**
	 * Get issuerNameAddress
	 * 
	 * @return issuerNameAddress
	 */
	@ApiModelProperty(value = "")

	@Valid

	public NameAddressPhone getIssuerNameAddress() {
		return issuerNameAddress;
	}

	public void setIssuerNameAddress(NameAddressPhone issuerNameAddress) {
		this.issuerNameAddress = issuerNameAddress;
	}

	public Tax5498AllOf issuerTin(String issuerTin) {
		this.issuerTin = issuerTin;
		return this;
	}

	/**
	 * TRUSTEE'S or ISSUER'S TIN
	 * 
	 * @return issuerTin
	 */
	@ApiModelProperty(value = "TRUSTEE'S or ISSUER'S TIN")

	public String getIssuerTin() {
		return issuerTin;
	}

	public void setIssuerTin(String issuerTin) {
		this.issuerTin = issuerTin;
	}

	public Tax5498AllOf participantTin(String participantTin) {
		this.participantTin = participantTin;
		return this;
	}

	/**
	 * PARTICIPANT'S TIN
	 * 
	 * @return participantTin
	 */
	@ApiModelProperty(value = "PARTICIPANT'S TIN")

	public String getParticipantTin() {
		return participantTin;
	}

	public void setParticipantTin(String participantTin) {
		this.participantTin = participantTin;
	}

	public Tax5498AllOf participantNameAddress(NameAddress participantNameAddress) {
		this.participantNameAddress = participantNameAddress;
		return this;
	}

	/**
	 * Get participantNameAddress
	 * 
	 * @return participantNameAddress
	 */
	@ApiModelProperty(value = "")

	@Valid

	public NameAddress getParticipantNameAddress() {
		return participantNameAddress;
	}

	public void setParticipantNameAddress(NameAddress participantNameAddress) {
		this.participantNameAddress = participantNameAddress;
	}

	public Tax5498AllOf accountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
		return this;
	}

	/**
	 * Account number
	 * 
	 * @return accountNumber
	 */
	@ApiModelProperty(value = "Account number")

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Tax5498AllOf iraContributions(Double iraContributions) {
		this.iraContributions = iraContributions;
		return this;
	}

	/**
	 * Box 1, IRA contributions
	 * 
	 * @return iraContributions
	 */
	@ApiModelProperty(value = "Box 1, IRA contributions")

	public Double getIraContributions() {
		return iraContributions;
	}

	public void setIraContributions(Double iraContributions) {
		this.iraContributions = iraContributions;
	}

	public Tax5498AllOf rolloverContributions(Double rolloverContributions) {
		this.rolloverContributions = rolloverContributions;
		return this;
	}

	/**
	 * Box 2, Rollover contributions
	 * 
	 * @return rolloverContributions
	 */
	@ApiModelProperty(value = "Box 2, Rollover contributions")

	public Double getRolloverContributions() {
		return rolloverContributions;
	}

	public void setRolloverContributions(Double rolloverContributions) {
		this.rolloverContributions = rolloverContributions;
	}

	public Tax5498AllOf rothIraConversion(Double rothIraConversion) {
		this.rothIraConversion = rothIraConversion;
		return this;
	}

	/**
	 * Box 3, Roth IRA conversion amount
	 * 
	 * @return rothIraConversion
	 */
	@ApiModelProperty(value = "Box 3, Roth IRA conversion amount")

	public Double getRothIraConversion() {
		return rothIraConversion;
	}

	public void setRothIraConversion(Double rothIraConversion) {
		this.rothIraConversion = rothIraConversion;
	}

	public Tax5498AllOf recharacterizedContributions(Double recharacterizedContributions) {
		this.recharacterizedContributions = recharacterizedContributions;
		return this;
	}

	/**
	 * Box 4, Recharacterized contributions
	 * 
	 * @return recharacterizedContributions
	 */
	@ApiModelProperty(value = "Box 4, Recharacterized contributions")

	public Double getRecharacterizedContributions() {
		return recharacterizedContributions;
	}

	public void setRecharacterizedContributions(Double recharacterizedContributions) {
		this.recharacterizedContributions = recharacterizedContributions;
	}

	public Tax5498AllOf fairMarketValue(Double fairMarketValue) {
		this.fairMarketValue = fairMarketValue;
		return this;
	}

	/**
	 * Box 5, Fair market value of account
	 * 
	 * @return fairMarketValue
	 */
	@ApiModelProperty(value = "Box 5, Fair market value of account")

	public Double getFairMarketValue() {
		return fairMarketValue;
	}

	public void setFairMarketValue(Double fairMarketValue) {
		this.fairMarketValue = fairMarketValue;
	}

	public Tax5498AllOf lifeInsuranceCost(Double lifeInsuranceCost) {
		this.lifeInsuranceCost = lifeInsuranceCost;
		return this;
	}

	/**
	 * Box 6, Life insurance cost included in box 1
	 * 
	 * @return lifeInsuranceCost
	 */
	@ApiModelProperty(value = "Box 6, Life insurance cost included in box 1")

	public Double getLifeInsuranceCost() {
		return lifeInsuranceCost;
	}

	public void setLifeInsuranceCost(Double lifeInsuranceCost) {
		this.lifeInsuranceCost = lifeInsuranceCost;
	}

	public Tax5498AllOf ira(Boolean ira) {
		this.ira = ira;
		return this;
	}

	/**
	 * Box 7a, IRA
	 * 
	 * @return ira
	 */
	@ApiModelProperty(value = "Box 7a, IRA")

	public Boolean getIra() {
		return ira;
	}

	public void setIra(Boolean ira) {
		this.ira = ira;
	}

	public Tax5498AllOf sep(Boolean sep) {
		this.sep = sep;
		return this;
	}

	/**
	 * Box 7b, SEP
	 * 
	 * @return sep
	 */
	@ApiModelProperty(value = "Box 7b, SEP")

	public Boolean getSep() {
		return sep;
	}

	public void setSep(Boolean sep) {
		this.sep = sep;
	}

	public Tax5498AllOf simple(Boolean simple) {
		this.simple = simple;
		return this;
	}

	/**
	 * Box 7c, SIMPLE
	 * 
	 * @return simple
	 */
	@ApiModelProperty(value = "Box 7c, SIMPLE")

	public Boolean getSimple() {
		return simple;
	}

	public void setSimple(Boolean simple) {
		this.simple = simple;
	}

	public Tax5498AllOf rothIra(Boolean rothIra) {
		this.rothIra = rothIra;
		return this;
	}

	/**
	 * Box 7d, ROTHIRA
	 * 
	 * @return rothIra
	 */
	@ApiModelProperty(value = "Box 7d, ROTHIRA")

	public Boolean getRothIra() {
		return rothIra;
	}

	public void setRothIra(Boolean rothIra) {
		this.rothIra = rothIra;
	}

	public Tax5498AllOf sepContributions(Double sepContributions) {
		this.sepContributions = sepContributions;
		return this;
	}

	/**
	 * Box 8, SEP contributions
	 * 
	 * @return sepContributions
	 */
	@ApiModelProperty(value = "Box 8, SEP contributions")

	public Double getSepContributions() {
		return sepContributions;
	}

	public void setSepContributions(Double sepContributions) {
		this.sepContributions = sepContributions;
	}

	public Tax5498AllOf simpleContributions(Double simpleContributions) {
		this.simpleContributions = simpleContributions;
		return this;
	}

	/**
	 * Box 9, SIMPLE contributions
	 * 
	 * @return simpleContributions
	 */
	@ApiModelProperty(value = "Box 9, SIMPLE contributions")

	public Double getSimpleContributions() {
		return simpleContributions;
	}

	public void setSimpleContributions(Double simpleContributions) {
		this.simpleContributions = simpleContributions;
	}

	public Tax5498AllOf rothIraContributions(Double rothIraContributions) {
		this.rothIraContributions = rothIraContributions;
		return this;
	}

	/**
	 * Box 10, Roth IRA contributions
	 * 
	 * @return rothIraContributions
	 */
	@ApiModelProperty(value = "Box 10, Roth IRA contributions")

	public Double getRothIraContributions() {
		return rothIraContributions;
	}

	public void setRothIraContributions(Double rothIraContributions) {
		this.rothIraContributions = rothIraContributions;
	}

	public Tax5498AllOf rmdNextYear(Boolean rmdNextYear) {
		this.rmdNextYear = rmdNextYear;
		return this;
	}

	/**
	 * Box 11, If checked, required minimum distribution for next year
	 * 
	 * @return rmdNextYear
	 */
	@ApiModelProperty(value = "Box 11, If checked, required minimum distribution for next year")

	public Boolean getRmdNextYear() {
		return rmdNextYear;
	}

	public void setRmdNextYear(Boolean rmdNextYear) {
		this.rmdNextYear = rmdNextYear;
	}

	public Tax5498AllOf rmdDate(LocalDate rmdDate) {
		this.rmdDate = rmdDate;
		return this;
	}

	/**
	 * ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included
	 * according to [IETF RFC3339]
	 * (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)
	 * 
	 * @return rmdDate
	 */
	@ApiModelProperty(value = "ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included according to [IETF RFC3339] (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)")

	@Valid
	@Size(max = 10)
	public LocalDate getRmdDate() {
		return rmdDate;
	}

	public void setRmdDate(LocalDate rmdDate) {
		this.rmdDate = rmdDate;
	}

	public Tax5498AllOf rmdAmount(Double rmdAmount) {
		this.rmdAmount = rmdAmount;
		return this;
	}

	/**
	 * Box 12b, RMD amount
	 * 
	 * @return rmdAmount
	 */
	@ApiModelProperty(value = "Box 12b, RMD amount")

	public Double getRmdAmount() {
		return rmdAmount;
	}

	public void setRmdAmount(Double rmdAmount) {
		this.rmdAmount = rmdAmount;
	}

	public Tax5498AllOf postponedContribution(Double postponedContribution) {
		this.postponedContribution = postponedContribution;
		return this;
	}

	/**
	 * Box 13a, Postponed contribution
	 * 
	 * @return postponedContribution
	 */
	@ApiModelProperty(value = "Box 13a, Postponed contribution")

	public Double getPostponedContribution() {
		return postponedContribution;
	}

	public void setPostponedContribution(Double postponedContribution) {
		this.postponedContribution = postponedContribution;
	}

	public Tax5498AllOf postponedYear(Integer postponedYear) {
		this.postponedYear = postponedYear;
		return this;
	}

	/**
	 * Box 13b, Year
	 * 
	 * @return postponedYear
	 */
	@ApiModelProperty(value = "Box 13b, Year")

	public Integer getPostponedYear() {
		return postponedYear;
	}

	public void setPostponedYear(Integer postponedYear) {
		this.postponedYear = postponedYear;
	}

	public Tax5498AllOf postponedCode(String postponedCode) {
		this.postponedCode = postponedCode;
		return this;
	}

	/**
	 * Box 13c, Code
	 * 
	 * @return postponedCode
	 */
	@ApiModelProperty(value = "Box 13c, Code")

	public String getPostponedCode() {
		return postponedCode;
	}

	public void setPostponedCode(String postponedCode) {
		this.postponedCode = postponedCode;
	}

	public Tax5498AllOf repayments(Double repayments) {
		this.repayments = repayments;
		return this;
	}

	/**
	 * Box 14a, Repayments
	 * 
	 * @return repayments
	 */
	@ApiModelProperty(value = "Box 14a, Repayments")

	public Double getRepayments() {
		return repayments;
	}

	public void setRepayments(Double repayments) {
		this.repayments = repayments;
	}

	public Tax5498AllOf repayCode(String repayCode) {
		this.repayCode = repayCode;
		return this;
	}

	/**
	 * Box 14b, Code
	 * 
	 * @return repayCode
	 */
	@ApiModelProperty(value = "Box 14b, Code")

	public String getRepayCode() {
		return repayCode;
	}

	public void setRepayCode(String repayCode) {
		this.repayCode = repayCode;
	}

	public Tax5498AllOf fmvSpecifiedAssets(Double fmvSpecifiedAssets) {
		this.fmvSpecifiedAssets = fmvSpecifiedAssets;
		return this;
	}

	/**
	 * Box 15a, FMV of certain specified assets
	 * 
	 * @return fmvSpecifiedAssets
	 */
	@ApiModelProperty(value = "Box 15a, FMV of certain specified assets")

	public Double getFmvSpecifiedAssets() {
		return fmvSpecifiedAssets;
	}

	public void setFmvSpecifiedAssets(Double fmvSpecifiedAssets) {
		this.fmvSpecifiedAssets = fmvSpecifiedAssets;
	}

	public Tax5498AllOf specifiedCodes(String specifiedCodes) {
		this.specifiedCodes = specifiedCodes;
		return this;
	}

	/**
	 * Box 15b, Code(s)
	 * 
	 * @return specifiedCodes
	 */
	@ApiModelProperty(value = "Box 15b, Code(s)")

	public String getSpecifiedCodes() {
		return specifiedCodes;
	}

	public void setSpecifiedCodes(String specifiedCodes) {
		this.specifiedCodes = specifiedCodes;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Tax5498AllOf tax5498AllOf = (Tax5498AllOf) o;
		return Objects.equals(this.issuerNameAddress, tax5498AllOf.issuerNameAddress)
				&& Objects.equals(this.issuerTin, tax5498AllOf.issuerTin)
				&& Objects.equals(this.participantTin, tax5498AllOf.participantTin)
				&& Objects.equals(this.participantNameAddress, tax5498AllOf.participantNameAddress)
				&& Objects.equals(this.accountNumber, tax5498AllOf.accountNumber)
				&& Objects.equals(this.iraContributions, tax5498AllOf.iraContributions)
				&& Objects.equals(this.rolloverContributions, tax5498AllOf.rolloverContributions)
				&& Objects.equals(this.rothIraConversion, tax5498AllOf.rothIraConversion)
				&& Objects.equals(this.recharacterizedContributions, tax5498AllOf.recharacterizedContributions)
				&& Objects.equals(this.fairMarketValue, tax5498AllOf.fairMarketValue)
				&& Objects.equals(this.lifeInsuranceCost, tax5498AllOf.lifeInsuranceCost)
				&& Objects.equals(this.ira, tax5498AllOf.ira) && Objects.equals(this.sep, tax5498AllOf.sep)
				&& Objects.equals(this.simple, tax5498AllOf.simple)
				&& Objects.equals(this.rothIra, tax5498AllOf.rothIra)
				&& Objects.equals(this.sepContributions, tax5498AllOf.sepContributions)
				&& Objects.equals(this.simpleContributions, tax5498AllOf.simpleContributions)
				&& Objects.equals(this.rothIraContributions, tax5498AllOf.rothIraContributions)
				&& Objects.equals(this.rmdNextYear, tax5498AllOf.rmdNextYear)
				&& Objects.equals(this.rmdDate, tax5498AllOf.rmdDate)
				&& Objects.equals(this.rmdAmount, tax5498AllOf.rmdAmount)
				&& Objects.equals(this.postponedContribution, tax5498AllOf.postponedContribution)
				&& Objects.equals(this.postponedYear, tax5498AllOf.postponedYear)
				&& Objects.equals(this.postponedCode, tax5498AllOf.postponedCode)
				&& Objects.equals(this.repayments, tax5498AllOf.repayments)
				&& Objects.equals(this.repayCode, tax5498AllOf.repayCode)
				&& Objects.equals(this.fmvSpecifiedAssets, tax5498AllOf.fmvSpecifiedAssets)
				&& Objects.equals(this.specifiedCodes, tax5498AllOf.specifiedCodes);
	}

	@Override
	public int hashCode() {
		return Objects.hash(issuerNameAddress, issuerTin, participantTin, participantNameAddress, accountNumber,
				iraContributions, rolloverContributions, rothIraConversion, recharacterizedContributions,
				fairMarketValue, lifeInsuranceCost, ira, sep, simple, rothIra, sepContributions, simpleContributions,
				rothIraContributions, rmdNextYear, rmdDate, rmdAmount, postponedContribution, postponedYear,
				postponedCode, repayments, repayCode, fmvSpecifiedAssets, specifiedCodes);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Tax5498AllOf {\n");

		sb.append("    issuerNameAddress: ").append(toIndentedString(issuerNameAddress)).append("\n");
		sb.append("    issuerTin: ").append(toIndentedString(issuerTin)).append("\n");
		sb.append("    participantTin: ").append(toIndentedString(participantTin)).append("\n");
		sb.append("    participantNameAddress: ").append(toIndentedString(participantNameAddress)).append("\n");
		sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
		sb.append("    iraContributions: ").append(toIndentedString(iraContributions)).append("\n");
		sb.append("    rolloverContributions: ").append(toIndentedString(rolloverContributions)).append("\n");
		sb.append("    rothIraConversion: ").append(toIndentedString(rothIraConversion)).append("\n");
		sb.append("    recharacterizedContributions: ").append(toIndentedString(recharacterizedContributions))
				.append("\n");
		sb.append("    fairMarketValue: ").append(toIndentedString(fairMarketValue)).append("\n");
		sb.append("    lifeInsuranceCost: ").append(toIndentedString(lifeInsuranceCost)).append("\n");
		sb.append("    ira: ").append(toIndentedString(ira)).append("\n");
		sb.append("    sep: ").append(toIndentedString(sep)).append("\n");
		sb.append("    simple: ").append(toIndentedString(simple)).append("\n");
		sb.append("    rothIra: ").append(toIndentedString(rothIra)).append("\n");
		sb.append("    sepContributions: ").append(toIndentedString(sepContributions)).append("\n");
		sb.append("    simpleContributions: ").append(toIndentedString(simpleContributions)).append("\n");
		sb.append("    rothIraContributions: ").append(toIndentedString(rothIraContributions)).append("\n");
		sb.append("    rmdNextYear: ").append(toIndentedString(rmdNextYear)).append("\n");
		sb.append("    rmdDate: ").append(toIndentedString(rmdDate)).append("\n");
		sb.append("    rmdAmount: ").append(toIndentedString(rmdAmount)).append("\n");
		sb.append("    postponedContribution: ").append(toIndentedString(postponedContribution)).append("\n");
		sb.append("    postponedYear: ").append(toIndentedString(postponedYear)).append("\n");
		sb.append("    postponedCode: ").append(toIndentedString(postponedCode)).append("\n");
		sb.append("    repayments: ").append(toIndentedString(repayments)).append("\n");
		sb.append("    repayCode: ").append(toIndentedString(repayCode)).append("\n");
		sb.append("    fmvSpecifiedAssets: ").append(toIndentedString(fmvSpecifiedAssets)).append("\n");
		sb.append("    specifiedCodes: ").append(toIndentedString(specifiedCodes)).append("\n");
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
