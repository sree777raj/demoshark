package com.fdx.api.model51.modelimpl;

import java.math.BigDecimal;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.OptBoolean;
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
import com.fdx.api.model51.mapper.SweepSecurityRowMapper;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A sweep security
 */
@ApiModel(description = "A sweep security")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class SweepSecurity {
	NamedParameterJdbcTemplate template;

	@JsonProperty(access = Access.WRITE_ONLY)
	private int sweepSecurityId;

	@JsonProperty("currentBalance")
	private BigDecimal currentBalance;

	@JsonProperty("availableBalance")
	private BigDecimal availableBalance;

	@JsonProperty("balanceAsOf")
	@JsonFormat(shape = JsonFormat.Shape.STRING, lenient = OptBoolean.FALSE)
	private java.sql.Timestamp balanceAsOf;

	@JsonProperty("checks")
	@JsonInclude(Include.NON_NULL)
	private Boolean checks;

	public SweepSecurity currentBalance(BigDecimal currentBalance) {
		this.currentBalance = currentBalance;
		return this;
	}

	/**
	 * Balance of funds in account
	 * 
	 * @return currentBalance
	 */
	@ApiModelProperty(value = "Balance of funds in account")

	@Valid

	public BigDecimal getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(BigDecimal currentBalance) {
		this.currentBalance = currentBalance;
	}

	public SweepSecurity availableBalance(BigDecimal availableBalance) {
		this.availableBalance = availableBalance;
		return this;
	}

	/**
	 * Balance of funds available for use
	 * 
	 * @return availableBalance
	 */
	@ApiModelProperty(value = "Balance of funds available for use")

	@Valid

	public BigDecimal getAvailableBalance() {
		return availableBalance;
	}

	public void setAvailableBalance(BigDecimal availableBalance) {
		this.availableBalance = availableBalance;
	}

	public SweepSecurity balanceAsOf(java.sql.Timestamp balanceAsOf) {
		this.balanceAsOf = balanceAsOf;
		return this;
	}

	/**
	 * Get balanceAsOf
	 * 
	 * @return balanceAsOf
	 */
	@ApiModelProperty(value = "")

	@Valid

	public java.sql.Timestamp getBalanceAsOf() {
		return balanceAsOf;
	}

	public void setBalanceAsOf(java.sql.Timestamp balanceAsOf) {
		this.balanceAsOf = balanceAsOf;
	}

	public SweepSecurity checks(Boolean checks) {
		this.checks = checks;
		return this;
	}

	/**
	 * Whether or not checks can be written on the account
	 * 
	 * @return checks
	 */
	@ApiModelProperty(value = "Whether or not checks can be written on the account")

	public Boolean getChecks() {
		return checks;
	}

	public void setChecks(Boolean checks) {
		this.checks = checks;
	}

	public int getSweepSecurityId() {
		return sweepSecurityId;
	}

	public void setSweepSecurityId(int sweepSecurityId) {
		this.sweepSecurityId = sweepSecurityId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		SweepSecurity sweepSecurity = (SweepSecurity) o;
		return Objects.equals(this.currentBalance, sweepSecurity.currentBalance)
				&& Objects.equals(this.availableBalance, sweepSecurity.availableBalance)
				&& Objects.equals(this.balanceAsOf, sweepSecurity.balanceAsOf)
				&& Objects.equals(this.checks, sweepSecurity.checks);
	}

	@Override
	public int hashCode() {
		return Objects.hash(currentBalance, availableBalance, balanceAsOf, checks);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SweepSecurity {\n");

		sb.append("    currentBalance: ").append(toIndentedString(currentBalance)).append("\n");
		sb.append("    availableBalance: ").append(toIndentedString(availableBalance)).append("\n");
		sb.append("    balanceAsOf: ").append(toIndentedString(balanceAsOf)).append("\n");
		sb.append("    checks: ").append(toIndentedString(checks)).append("\n");
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

	private static final Logger log = LoggerFactory.getLogger(SweepSecurity.class);

	public SweepSecurity getSweepSecurity(int sweepSecurityId) throws FDXException {
		try {
			SqlParameterSource parameters = new MapSqlParameterSource("sweepSecurityId", sweepSecurityId);
			template = ConnectionConfigApi51.getTemplate();
			SweepSecurity sweepSecurity = template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".SweepSecurity where sweepSecurityId in (:sweepSecurityId)", parameters,
					new SweepSecurityRowMapper());
			return sweepSecurity;
		} catch (EmptyResultDataAccessException e) {
			throw new FDXException("Sweep Security not found", 0);
		} catch (Exception e) {
			log.error("SweepSecurity : ", e);
			throw new FDXException(e, 500);
		}
	}
}
