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
import com.fdx.common.util.FdxConstants;
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
import com.fdx.api.model51.mapper.MutualFundTypeRowMapper;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A mutual fund
 */
@ApiModel(description = "A mutual fund")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class MutualFundSecurity {
	NamedParameterJdbcTemplate template;

	@JsonProperty(access = Access.WRITE_ONLY)
	private int mutualfundsecurityid;

	@JsonProperty("mutualFundType")
	private MutualFundType mutualFundType;

	@JsonProperty("unitsStreet")
	private BigDecimal unitsStreet;

	@JsonProperty("unitsUser")
	private BigDecimal unitsUser;

	@JsonProperty("reinvestDividends")
	@JsonInclude(Include.NON_NULL)
	private Boolean reinvestDividends;

	@JsonProperty("reinvestCapitalGains")
	@JsonInclude(Include.NON_NULL)
	private Boolean reinvestCapitalGains;

	@JsonProperty("yield")
	private BigDecimal yield;

	@JsonProperty("yieldAsOfDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private Date yieldAsOfDate;

	public MutualFundSecurity mutualFundType(MutualFundType mutualFundType) {
		this.mutualFundType = mutualFundType;
		return this;
	}

	/**
	 * Get mutualFundType
	 * 
	 * @return mutualFundType
	 */
	@ApiModelProperty(value = "")

	@Valid

	public MutualFundType getMutualFundType() {
		return mutualFundType;
	}

	public void setMutualFundType(MutualFundType mutualFundType) {
		this.mutualFundType = mutualFundType;
	}

	public MutualFundSecurity unitsStreet(BigDecimal unitsStreet) {
		this.unitsStreet = unitsStreet;
		return this;
	}

	/**
	 * Units in the FI's street name, positive quantity
	 * 
	 * @return unitsStreet
	 */
	@ApiModelProperty(value = "Units in the FI's street name, positive quantity")

	@Valid

	public BigDecimal getUnitsStreet() {
		return unitsStreet;
	}

	public void setUnitsStreet(BigDecimal unitsStreet) {
		this.unitsStreet = unitsStreet;
	}

	public MutualFundSecurity unitsUser(BigDecimal unitsUser) {
		this.unitsUser = unitsUser;
		return this;
	}

	/**
	 * Units in user's name directly, positive quantity
	 * 
	 * @return unitsUser
	 */
	@ApiModelProperty(value = "Units in user's name directly, positive  quantity")

	@Valid

	public BigDecimal getUnitsUser() {
		return unitsUser;
	}

	public void setUnitsUser(BigDecimal unitsUser) {
		this.unitsUser = unitsUser;
	}

	public MutualFundSecurity reinvestDividends(Boolean reinvestDividends) {
		this.reinvestDividends = reinvestDividends;
		return this;
	}

	/**
	 * Reinvest dividends
	 * 
	 * @return reinvestDividends
	 */
	@ApiModelProperty(value = "Reinvest dividends")

	public Boolean getReinvestDividends() {
		return reinvestDividends;
	}

	public void setReinvestDividends(Boolean reinvestDividends) {
		this.reinvestDividends = reinvestDividends;
	}

	public MutualFundSecurity reinvestCapitalGains(Boolean reinvestCapitalGains) {
		this.reinvestCapitalGains = reinvestCapitalGains;
		return this;
	}

	/**
	 * Reinvest capital gains
	 * 
	 * @return reinvestCapitalGains
	 */
	@ApiModelProperty(value = "Reinvest capital gains")

	public Boolean getReinvestCapitalGains() {
		return reinvestCapitalGains;
	}

	public void setReinvestCapitalGains(Boolean reinvestCapitalGains) {
		this.reinvestCapitalGains = reinvestCapitalGains;
	}

	public MutualFundSecurity yield(BigDecimal yield) {
		this.yield = yield;
		return this;
	}

	/**
	 * Current yield reported as portion of the fund's assets
	 * 
	 * @return yield
	 */
	@ApiModelProperty(value = "Current yield reported as portion of the fund's assets")

	@Valid

	public BigDecimal getYield() {
		return yield;
	}

	public void setYield(BigDecimal yield) {
		this.yield = yield;
	}

	public MutualFundSecurity yieldAsOfDate(java.sql.Timestamp yieldAsOfDate) {
		this.yieldAsOfDate = yieldAsOfDate;
		return this;
	}

	/**
	 * Get yieldAsOfDate
	 * 
	 * @return yieldAsOfDate
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Date getYieldAsOfDate() {
		return yieldAsOfDate;
	}

	public void setYieldAsOfDate(Date yieldAsOfDate) {
		this.yieldAsOfDate = yieldAsOfDate;
	}

	public int getMutualfundsecurityid() {
		return mutualfundsecurityid;
	}

	public void setMutualfundsecurityid(int mutualfundsecurityid) {
		this.mutualfundsecurityid = mutualfundsecurityid;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		MutualFundSecurity mutualFundSecurity = (MutualFundSecurity) o;
		return Objects.equals(this.mutualFundType, mutualFundSecurity.mutualFundType)
				&& Objects.equals(this.unitsStreet, mutualFundSecurity.unitsStreet)
				&& Objects.equals(this.unitsUser, mutualFundSecurity.unitsUser)
				&& Objects.equals(this.reinvestDividends, mutualFundSecurity.reinvestDividends)
				&& Objects.equals(this.reinvestCapitalGains, mutualFundSecurity.reinvestCapitalGains)
				&& Objects.equals(this.yield, mutualFundSecurity.yield)
				&& Objects.equals(this.yieldAsOfDate, mutualFundSecurity.yieldAsOfDate);
	}

	@Override
	public int hashCode() {
		return Objects.hash(mutualFundType, unitsStreet, unitsUser, reinvestDividends, reinvestCapitalGains, yield,
				yieldAsOfDate);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class MutualFundSecurity {\n");

		sb.append("    mutualFundType: ").append(toIndentedString(mutualFundType)).append("\n");
		sb.append("    unitsStreet: ").append(toIndentedString(unitsStreet)).append("\n");
		sb.append("    unitsUser: ").append(toIndentedString(unitsUser)).append("\n");
		sb.append("    reinvestDividends: ").append(toIndentedString(reinvestDividends)).append("\n");
		sb.append("    reinvestCapitalGains: ").append(toIndentedString(reinvestCapitalGains)).append("\n");
		sb.append("    yield: ").append(toIndentedString(yield)).append("\n");
		sb.append("    yieldAsOfDate: ").append(toIndentedString(yieldAsOfDate)).append("\n");
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

	private static final Logger log = LoggerFactory.getLogger(MutualFundSecurity.class);

	public MutualFundSecurity getMutualFunds(@Valid int mutualfundsecurityid) throws FDXException {
		try {
			template = ConnectionConfigApi51.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("mutualfundsecurityid", mutualfundsecurityid);
			return template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".mutualfundsecurity where mutualfundsecurityid in (:mutualfundsecurityid)",
					parameters, new MutualFundTypeRowMapper());
		} catch (EmptyResultDataAccessException e) {
			throw new FDXException(Errors.MUTUAL_FUND_SECURITY_NOT_FOUND, 0);
		} catch (Exception e) {
			log.error("MutualFundSecurity : ", e);
			throw new FDXException(e, FdxConstants.HTTP_ERROR_CODE_500);
		}
	}
}
