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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import com.fdx.api.model51.config.ConnectionConfigApi51;
import com.fdx.api.model51.mapper.BillsRowMapper;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The payments due on an account
 */
@ApiModel(description = "The payments due on an account")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Bills {
	NamedParameterJdbcTemplate template;

	@JsonProperty(access = Access.WRITE_ONLY)
	private int billid;

	@JsonProperty("totalPaymentDue")
	private BigDecimal totalPaymentDue;

	@JsonProperty("minimumPaymentDue")
	private BigDecimal minimumPaymentDue;

	@JsonProperty("dueDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private Date dueDate;

	@JsonProperty("autoPayEnabled")
	@JsonInclude(Include.NON_NULL)
	private Boolean autoPayEnabled;

	@JsonProperty("autoPayAmount")
	private BigDecimal autoPayAmount;

	@JsonProperty("autoPayDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private Date autoPayDate;

	@JsonProperty("pastDueAmount")
	private BigDecimal pastDueAmount;

	@JsonProperty("lastPaymentAmount")
	private BigDecimal lastPaymentAmount;

	@JsonProperty("lastPaymentDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private Date lastPaymentDate;

	@JsonProperty("statementBalance")
	private BigDecimal statementBalance;

	@JsonProperty("statementDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private Date statementDate;

	public Bills totalPaymentDue(BigDecimal totalPaymentDue) {
		this.totalPaymentDue = totalPaymentDue;
		return this;
	}

	/**
	 * Total payment due or next payment due. Monthly payment due for loans
	 * 
	 * @return totalPaymentDue
	 */
	@ApiModelProperty(value = "Total payment due or next payment due.  Monthly payment due for loans")

	@Valid

	public BigDecimal getTotalPaymentDue() {
		return totalPaymentDue;
	}

	public void setTotalPaymentDue(BigDecimal totalPaymentDue) {
		this.totalPaymentDue = totalPaymentDue;
	}

	public Bills minimumPaymentDue(BigDecimal minimumPaymentDue) {
		this.minimumPaymentDue = minimumPaymentDue;
		return this;
	}

	/**
	 * The minimum amount which is due
	 * 
	 * @return minimumPaymentDue
	 */
	@ApiModelProperty(value = "The minimum amount which is due")

	@Valid

	public BigDecimal getMinimumPaymentDue() {
		return minimumPaymentDue;
	}

	public void setMinimumPaymentDue(BigDecimal minimumPaymentDue) {
		this.minimumPaymentDue = minimumPaymentDue;
	}

	public Bills dueDate(java.sql.Timestamp dueDate) {
		this.dueDate = dueDate;
		return this;
	}

	/**
	 * Get dueDate
	 * 
	 * @return dueDate
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Bills autoPayEnabled(Boolean autoPayEnabled) {
		this.autoPayEnabled = autoPayEnabled;
		return this;
	}

	/**
	 * Whether the user's bill is paid automatically
	 * 
	 * @return autoPayEnabled
	 */
	@ApiModelProperty(value = "Whether the user's bill is paid automatically")

	public Boolean getAutoPayEnabled() {
		return autoPayEnabled;
	}

	public void setAutoPayEnabled(Boolean autoPayEnabled) {
		this.autoPayEnabled = autoPayEnabled;
	}

	public Bills autoPayAmount(BigDecimal autoPayAmount) {
		this.autoPayAmount = autoPayAmount;
		return this;
	}

	/**
	 * The amount of money the user has set to autopay this bill
	 * 
	 * @return autoPayAmount
	 */
	@ApiModelProperty(value = "The amount of money the user has set to autopay this bill")

	@Valid

	public BigDecimal getAutoPayAmount() {
		return autoPayAmount;
	}

	public void setAutoPayAmount(BigDecimal autoPayAmount) {
		this.autoPayAmount = autoPayAmount;
	}

	public Bills autoPayDate(java.sql.Timestamp autoPayDate) {
		this.autoPayDate = autoPayDate;
		return this;
	}

	/**
	 * Get autoPayDate
	 * 
	 * @return autoPayDate
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Date getAutoPayDate() {
		return autoPayDate;
	}

	public void setAutoPayDate(Date autoPayDate) {
		this.autoPayDate = autoPayDate;
	}

	public Bills pastDueAmount(BigDecimal pastDueAmount) {
		this.pastDueAmount = pastDueAmount;
		return this;
	}

	/**
	 * The amount that the user should have already paid. The value is negative if
	 * user owes money
	 * 
	 * @return pastDueAmount
	 */
	@ApiModelProperty(value = "The amount that the user should have already paid. The value is negative if user owes money")

	@Valid

	public BigDecimal getPastDueAmount() {
		return pastDueAmount;
	}

	public void setPastDueAmount(BigDecimal pastDueAmount) {
		this.pastDueAmount = pastDueAmount;
	}

	public Bills lastPaymentAmount(BigDecimal lastPaymentAmount) {
		this.lastPaymentAmount = lastPaymentAmount;
		return this;
	}

	/**
	 * The amount of the most recent payment
	 * 
	 * @return lastPaymentAmount
	 */
	@ApiModelProperty(value = "The amount of the most recent payment")

	@Valid

	public BigDecimal getLastPaymentAmount() {
		return lastPaymentAmount;
	}

	public void setLastPaymentAmount(BigDecimal lastPaymentAmount) {
		this.lastPaymentAmount = lastPaymentAmount;
	}

	public Bills lastPaymentDate(java.sql.Timestamp lastPaymentDate) {
		this.lastPaymentDate = lastPaymentDate;
		return this;
	}

	/**
	 * Get lastPaymentDate
	 * 
	 * @return lastPaymentDate
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Date getLastPaymentDate() {
		return lastPaymentDate;
	}

	public void setLastPaymentDate(Date lastPaymentDate) {
		this.lastPaymentDate = lastPaymentDate;
	}

	public Bills statementBalance(BigDecimal statementBalance) {
		this.statementBalance = statementBalance;
		return this;
	}

	/**
	 * The amount of the last statement. The value is negative if the user owes
	 * money
	 * 
	 * @return statementBalance
	 */
	@ApiModelProperty(value = "The amount of the last statement.  The value is negative if the user owes money")

	@Valid

	public BigDecimal getStatementBalance() {
		return statementBalance;
	}

	public void setStatementBalance(BigDecimal statementBalance) {
		this.statementBalance = statementBalance;
	}

	public Bills statementDate(java.sql.Timestamp statementDate) {
		this.statementDate = statementDate;
		return this;
	}

	/**
	 * Get statementDate
	 * 
	 * @return statementDate
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Date getStatementDate() {
		return statementDate;
	}

	public void setStatementDate(Date statementDate) {
		this.statementDate = statementDate;
	}

	public int getBillid() {
		return billid;
	}

	public void setBillid(int billid) {
		this.billid = billid;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Bills bills = (Bills) o;
		return Objects.equals(this.totalPaymentDue, bills.totalPaymentDue)
				&& Objects.equals(this.minimumPaymentDue, bills.minimumPaymentDue)
				&& Objects.equals(this.dueDate, bills.dueDate)
				&& Objects.equals(this.autoPayEnabled, bills.autoPayEnabled)
				&& Objects.equals(this.autoPayAmount, bills.autoPayAmount)
				&& Objects.equals(this.autoPayDate, bills.autoPayDate)
				&& Objects.equals(this.pastDueAmount, bills.pastDueAmount)
				&& Objects.equals(this.lastPaymentAmount, bills.lastPaymentAmount)
				&& Objects.equals(this.lastPaymentDate, bills.lastPaymentDate)
				&& Objects.equals(this.statementBalance, bills.statementBalance)
				&& Objects.equals(this.statementDate, bills.statementDate);
	}

	@Override
	public int hashCode() {
		return Objects.hash(totalPaymentDue, minimumPaymentDue, dueDate, autoPayEnabled, autoPayAmount, autoPayDate,
				pastDueAmount, lastPaymentAmount, lastPaymentDate, statementBalance, statementDate);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Bills {\n");

		sb.append("    totalPaymentDue: ").append(toIndentedString(totalPaymentDue)).append("\n");
		sb.append("    minimumPaymentDue: ").append(toIndentedString(minimumPaymentDue)).append("\n");
		sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
		sb.append("    autoPayEnabled: ").append(toIndentedString(autoPayEnabled)).append("\n");
		sb.append("    autoPayAmount: ").append(toIndentedString(autoPayAmount)).append("\n");
		sb.append("    autoPayDate: ").append(toIndentedString(autoPayDate)).append("\n");
		sb.append("    pastDueAmount: ").append(toIndentedString(pastDueAmount)).append("\n");
		sb.append("    lastPaymentAmount: ").append(toIndentedString(lastPaymentAmount)).append("\n");
		sb.append("    lastPaymentDate: ").append(toIndentedString(lastPaymentDate)).append("\n");
		sb.append("    statementBalance: ").append(toIndentedString(statementBalance)).append("\n");
		sb.append("    statementDate: ").append(toIndentedString(statementDate)).append("\n");
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

	private static final Logger log = LoggerFactory.getLogger(Bills.class);

	public Bills getBills(int billId) throws FDXException {
		try {
			SqlParameterSource parameters = new MapSqlParameterSource("billId", billId);
			template = ConnectionConfigApi51.getTemplate();;
			return template.queryForObject("select * from "+ DeveloperContext.getDeveloperSchema() +".bills where billId in (:billId)", parameters,
					new BillsRowMapper());
		} catch (EmptyResultDataAccessException e) {
			throw new FDXException(Errors.BILLS_NOT_FOUND, 0);
		} catch (Exception e) {
			log.error("Bills : ", e);
			throw new FDXException(e,500);
		}
	}
}
