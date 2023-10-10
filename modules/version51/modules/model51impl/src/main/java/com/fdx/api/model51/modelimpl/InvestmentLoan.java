package com.fdx.api.model51.modelimpl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.OptBoolean;
import com.fdx.common.exception.Errors;
import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fdx.api.model51.config.ConnectionConfigApi51;
import com.fdx.api.model51.mapper.InvestmentLoanRowMapper;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Any loan information against an investment account
 */
@ApiModel(description = "Any loan information against an investment account")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class InvestmentLoan {

	NamedParameterJdbcTemplate template;

	/*
	 * public InvestmentLoanDaoImpl_4_5(NamedParameterJdbcTemplate template) {
	 * this.template = template; }
	 */

	@JsonProperty("loanId")
	private String loanId;

	@JsonProperty("loanDescription")
	private String loanDescription;

	@JsonProperty("initialLoanBalance")
	private BigDecimal initialLoanBalance;

	@JsonProperty("loanStartDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private Date loanStartDate;

	@JsonProperty("currentLoanBalance")
	private BigDecimal currentLoanBalance;

	@JsonProperty("dateAsOf")
	@JsonFormat(shape = JsonFormat.Shape.STRING, lenient = OptBoolean.FALSE)
	private java.sql.Timestamp dateAsOf;

	@JsonProperty("loanRate")
	private BigDecimal loanRate;

	@JsonProperty("loanPaymentAmount")
	private BigDecimal loanPaymentAmount;

	@JsonProperty("loanPaymentFrequency")
	private LoanPaymentFrequency loanPaymentFrequency;

	@JsonProperty("loanPaymentInitial")
	private BigDecimal loanPaymentInitial;

	@JsonProperty("loanPaymentsRemaining")
	private Integer loanPaymentsRemaining;

	@JsonProperty("loanMaturityDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private Date loanMaturityDate;

	@JsonProperty("loanInterestToDate")
	private BigDecimal loanInterestToDate;

	@JsonProperty("loanTotalProjectedInterest")
	private BigDecimal loanTotalProjectedInterest;

	@JsonProperty("loanNextPaymentDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private Date loanNextPaymentDate;

	public InvestmentLoan loanId(String loanId) {
		this.loanId = loanId;
		return this;
	}

	/**
	 * Unique identifier for this loan
	 * 
	 * @return loanId
	 */
	@ApiModelProperty(value = "Unique identifier for this loan")

	public String getLoanId() {
		return loanId;
	}

	public void setLoanId(String loanId) {
		this.loanId = loanId;
	}

	public InvestmentLoan loanDescription(String loanDescription) {
		this.loanDescription = loanDescription;
		return this;
	}

	/**
	 * Description of loan
	 * 
	 * @return loanDescription
	 */
	@ApiModelProperty(value = "Description of loan")

	public String getLoanDescription() {
		return loanDescription;
	}

	public void setLoanDescription(String loanDescription) {
		this.loanDescription = loanDescription;
	}

	public InvestmentLoan initialLoanBalance(BigDecimal initialLoanBalance) {
		this.initialLoanBalance = initialLoanBalance;
		return this;
	}

	/**
	 * Initial loan balance amount
	 * 
	 * @return initialLoanBalance
	 */
	@ApiModelProperty(value = "Initial loan balance amount")

	@Valid

	public BigDecimal getInitialLoanBalance() {
		return initialLoanBalance;
	}

	public void setInitialLoanBalance(BigDecimal initialLoanBalance) {
		this.initialLoanBalance = initialLoanBalance;
	}

	public InvestmentLoan loanStartDate(java.sql.Timestamp loanStartDate) {
		this.loanStartDate = loanStartDate;
		return this;
	}

	/**
	 * Get loanStartDate
	 * 
	 * @return loanStartDate
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Date getLoanStartDate() {
		return loanStartDate;
	}

	public void setLoanStartDate(Date loanStartDate) {
		this.loanStartDate = loanStartDate;
	}

	public InvestmentLoan currentLoanBalance(BigDecimal currentLoanBalance) {
		this.currentLoanBalance = currentLoanBalance;
		return this;
	}

	/**
	 * Current loan principal balance amount
	 * 
	 * @return currentLoanBalance
	 */
	@ApiModelProperty(value = "Current loan principal balance amount")

	@Valid

	public BigDecimal getCurrentLoanBalance() {
		return currentLoanBalance;
	}

	public void setCurrentLoanBalance(BigDecimal currentLoanBalance) {
		this.currentLoanBalance = currentLoanBalance;
	}

	public InvestmentLoan dateAsOf(java.sql.Timestamp dateAsOf) {
		this.dateAsOf = dateAsOf;
		return this;
	}

	/**
	 * Get dateAsOf
	 * 
	 * @return dateAsOf
	 */
	@ApiModelProperty(value = "")

	@Valid

	public java.sql.Timestamp getDateAsOf() {
		return dateAsOf;
	}

	public void setDateAsOf(java.sql.Timestamp dateAsOf) {
		this.dateAsOf = dateAsOf;
	}

	public InvestmentLoan loanRate(BigDecimal loanRate) {
		this.loanRate = loanRate;
		return this;
	}

	/**
	 * Loan annual interest rate for the loan
	 * 
	 * @return loanRate
	 */
	@ApiModelProperty(value = "Loan annual interest rate for the loan")

	@Valid

	public BigDecimal getLoanRate() {
		return loanRate;
	}

	public void setLoanRate(BigDecimal loanRate) {
		this.loanRate = loanRate;
	}

	public InvestmentLoan loanPaymentAmount(BigDecimal loanPaymentAmount) {
		this.loanPaymentAmount = loanPaymentAmount;
		return this;
	}

	/**
	 * Loan payment amount
	 * 
	 * @return loanPaymentAmount
	 */
	@ApiModelProperty(value = "Loan payment amount")

	@Valid

	public BigDecimal getLoanPaymentAmount() {
		return loanPaymentAmount;
	}

	public void setLoanPaymentAmount(BigDecimal loanPaymentAmount) {
		this.loanPaymentAmount = loanPaymentAmount;
	}

	public InvestmentLoan loanPaymentFrequency(LoanPaymentFrequency loanPaymentFrequency) {
		this.loanPaymentFrequency = loanPaymentFrequency;
		return this;
	}

	/**
	 * Get loanPaymentFrequency
	 * 
	 * @return loanPaymentFrequency
	 */
	@ApiModelProperty(value = "")

	@Valid

	public LoanPaymentFrequency getLoanPaymentFrequency() {
		return loanPaymentFrequency;
	}

	public void setLoanPaymentFrequency(LoanPaymentFrequency loanPaymentFrequency) {
		this.loanPaymentFrequency = loanPaymentFrequency;
	}

	public InvestmentLoan loanPaymentInitial(BigDecimal loanPaymentInitial) {
		this.loanPaymentInitial = loanPaymentInitial;
		return this;
	}

	/**
	 * Initial number of loan payments
	 * 
	 * @return loanPaymentInitial
	 */
	@ApiModelProperty(value = "Initial number of loan payments")

	@Valid

	public BigDecimal getLoanPaymentInitial() {
		return loanPaymentInitial;
	}

	public void setLoanPaymentInitial(BigDecimal loanPaymentInitial) {
		this.loanPaymentInitial = loanPaymentInitial;
	}

	public InvestmentLoan loanPaymentsRemaining(Integer loanPaymentsRemaining) {
		this.loanPaymentsRemaining = loanPaymentsRemaining;
		return this;
	}

	/**
	 * Remaining number of loan payments
	 * 
	 * @return loanPaymentsRemaining
	 */
	@ApiModelProperty(value = "Remaining number of loan payments")

	public Integer getLoanPaymentsRemaining() {
		return loanPaymentsRemaining;
	}

	public void setLoanPaymentsRemaining(Integer loanPaymentsRemaining) {
		this.loanPaymentsRemaining = loanPaymentsRemaining;
	}

	public InvestmentLoan loanMaturityDate(java.sql.Timestamp loanMaturityDate) {
		this.loanMaturityDate = loanMaturityDate;
		return this;
	}

	/**
	 * Get loanMaturityDate
	 * 
	 * @return loanMaturityDate
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Date getLoanMaturityDate() {
		return loanMaturityDate;
	}

	public void setLoanMaturityDate(Date loanMaturityDate) {
		this.loanMaturityDate = loanMaturityDate;
	}

	public InvestmentLoan loanInterestToDate(BigDecimal loanInterestToDate) {
		this.loanInterestToDate = loanInterestToDate;
		return this;
	}

	/**
	 * Total interest paid to date on this loan
	 * 
	 * @return loanInterestToDate
	 */
	@ApiModelProperty(value = "Total interest paid to date on this loan")

	@Valid

	public BigDecimal getLoanInterestToDate() {
		return loanInterestToDate;
	}

	public void setLoanInterestToDate(BigDecimal loanInterestToDate) {
		this.loanInterestToDate = loanInterestToDate;
	}

	public InvestmentLoan loanTotalProjectedInterest(BigDecimal loanTotalProjectedInterest) {
		this.loanTotalProjectedInterest = loanTotalProjectedInterest;
		return this;
	}

	/**
	 * Total projected interest to be paid on this loan
	 * 
	 * @return loanTotalProjectedInterest
	 */
	@ApiModelProperty(value = "Total projected interest to be paid on this loan")

	@Valid

	public BigDecimal getLoanTotalProjectedInterest() {
		return loanTotalProjectedInterest;
	}

	public void setLoanTotalProjectedInterest(BigDecimal loanTotalProjectedInterest) {
		this.loanTotalProjectedInterest = loanTotalProjectedInterest;
	}

	public InvestmentLoan loanNextPaymentDate(java.sql.Timestamp loanNextPaymentDate) {
		this.loanNextPaymentDate = loanNextPaymentDate;
		return this;
	}

	/**
	 * Get loanNextPaymentDate
	 * 
	 * @return loanNextPaymentDate
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Date getLoanNextPaymentDate() {
		return loanNextPaymentDate;
	}

	public void setLoanNextPaymentDate(Date loanNextPaymentDate) {
		this.loanNextPaymentDate = loanNextPaymentDate;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		InvestmentLoan investmentLoan = (InvestmentLoan) o;
		return Objects.equals(this.loanId, investmentLoan.loanId)
				&& Objects.equals(this.loanDescription, investmentLoan.loanDescription)
				&& Objects.equals(this.initialLoanBalance, investmentLoan.initialLoanBalance)
				&& Objects.equals(this.loanStartDate, investmentLoan.loanStartDate)
				&& Objects.equals(this.currentLoanBalance, investmentLoan.currentLoanBalance)
				&& Objects.equals(this.dateAsOf, investmentLoan.dateAsOf)
				&& Objects.equals(this.loanRate, investmentLoan.loanRate)
				&& Objects.equals(this.loanPaymentAmount, investmentLoan.loanPaymentAmount)
				&& Objects.equals(this.loanPaymentFrequency, investmentLoan.loanPaymentFrequency)
				&& Objects.equals(this.loanPaymentInitial, investmentLoan.loanPaymentInitial)
				&& Objects.equals(this.loanPaymentsRemaining, investmentLoan.loanPaymentsRemaining)
				&& Objects.equals(this.loanMaturityDate, investmentLoan.loanMaturityDate)
				&& Objects.equals(this.loanInterestToDate, investmentLoan.loanInterestToDate)
				&& Objects.equals(this.loanTotalProjectedInterest, investmentLoan.loanTotalProjectedInterest)
				&& Objects.equals(this.loanNextPaymentDate, investmentLoan.loanNextPaymentDate);
	}

	@Override
	public int hashCode() {
		return Objects.hash(loanId, loanDescription, initialLoanBalance, loanStartDate, currentLoanBalance, dateAsOf,
				loanRate, loanPaymentAmount, loanPaymentFrequency, loanPaymentInitial, loanPaymentsRemaining,
				loanMaturityDate, loanInterestToDate, loanTotalProjectedInterest, loanNextPaymentDate);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class InvestmentLoan {\n");

		sb.append("    loanId: ").append(toIndentedString(loanId)).append("\n");
		sb.append("    loanDescription: ").append(toIndentedString(loanDescription)).append("\n");
		sb.append("    initialLoanBalance: ").append(toIndentedString(initialLoanBalance)).append("\n");
		sb.append("    loanStartDate: ").append(toIndentedString(loanStartDate)).append("\n");
		sb.append("    currentLoanBalance: ").append(toIndentedString(currentLoanBalance)).append("\n");
		sb.append("    dateAsOf: ").append(toIndentedString(dateAsOf)).append("\n");
		sb.append("    loanRate: ").append(toIndentedString(loanRate)).append("\n");
		sb.append("    loanPaymentAmount: ").append(toIndentedString(loanPaymentAmount)).append("\n");
		sb.append("    loanPaymentFrequency: ").append(toIndentedString(loanPaymentFrequency)).append("\n");
		sb.append("    loanPaymentInitial: ").append(toIndentedString(loanPaymentInitial)).append("\n");
		sb.append("    loanPaymentsRemaining: ").append(toIndentedString(loanPaymentsRemaining)).append("\n");
		sb.append("    loanMaturityDate: ").append(toIndentedString(loanMaturityDate)).append("\n");
		sb.append("    loanInterestToDate: ").append(toIndentedString(loanInterestToDate)).append("\n");
		sb.append("    loanTotalProjectedInterest: ").append(toIndentedString(loanTotalProjectedInterest)).append("\n");
		sb.append("    loanNextPaymentDate: ").append(toIndentedString(loanNextPaymentDate)).append("\n");
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

	private static final Logger log = LoggerFactory.getLogger(InvestmentLoan.class);

	public InvestmentLoan getInvestmentLoan(String loanId) throws FDXException {
		try {
			SqlParameterSource parameters = new MapSqlParameterSource("loanId", loanId);
			template = ConnectionConfigApi51.getTemplate();
			return template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".investmentLoan where loanId in (:loanId)", parameters,
					new InvestmentLoanRowMapper());
		} catch (EmptyResultDataAccessException e) {
			throw new FDXException(Errors.INVESTMENT_LOAN_NOT_FOUND, 0);
		} catch (Exception e) {
			log.error("InvestmentLoan : ", e);
			throw new FDXException(e,500);
		}
	}
}
