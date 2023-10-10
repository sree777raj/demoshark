package com.fdx.api.model51.modelimpl;

import java.math.BigDecimal;
import java.util.Date;
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
import com.fdx.api.model51.mapper.StockSecurityRowMapper;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A stock security
 */
@ApiModel(description = "A stock security")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class StockSecurity {

	NamedParameterJdbcTemplate template;

	@JsonProperty(access = Access.WRITE_ONLY)
	private int stockSecurityId;

	@JsonProperty("unitsStreet")
	private BigDecimal unitsStreet;

	@JsonProperty("unitsUser")
	private BigDecimal unitsUser;

	@JsonProperty("reinvestDividends")
	@JsonInclude(Include.NON_NULL)
	private Boolean reinvestDividends;

	@JsonProperty("stockType")
	private StockType stockType;

	@JsonProperty("yield")
	private BigDecimal yield;

	@JsonProperty("yieldAsOfDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private Date yieldAsOfDate;

	public StockSecurity unitsStreet(BigDecimal unitsStreet) {
		this.unitsStreet = unitsStreet;
		return this;
	}

	/**
	 * The units in the FI's street name as a positive quantity
	 * 
	 * @return unitsStreet
	 */
	@ApiModelProperty(value = "The units in the FI's street name as a positive quantity")

	@Valid

	public BigDecimal getUnitsStreet() {
		return unitsStreet;
	}

	public void setUnitsStreet(BigDecimal unitsStreet) {
		this.unitsStreet = unitsStreet;
	}

	public StockSecurity unitsUser(BigDecimal unitsUser) {
		this.unitsUser = unitsUser;
		return this;
	}

	/**
	 * The units in user's name directly as a positive quantity
	 * 
	 * @return unitsUser
	 */
	@ApiModelProperty(value = "The units in user's name directly as a positive quantity")

	@Valid

	public BigDecimal getUnitsUser() {
		return unitsUser;
	}

	public void setUnitsUser(BigDecimal unitsUser) {
		this.unitsUser = unitsUser;
	}

	public StockSecurity reinvestDividends(Boolean reinvestDividends) {
		this.reinvestDividends = reinvestDividends;
		return this;
	}

	/**
	 * Selection to reinvest dividends
	 * 
	 * @return reinvestDividends
	 */
	@ApiModelProperty(value = "Selection to reinvest dividends")

	public Boolean getReinvestDividends() {
		return reinvestDividends;
	}

	public void setReinvestDividends(Boolean reinvestDividends) {
		this.reinvestDividends = reinvestDividends;
	}

	public StockSecurity stockType(StockType stockType) {
		this.stockType = stockType;
		return this;
	}

	/**
	 * Get stockType
	 * 
	 * @return stockType
	 */
	@ApiModelProperty(value = "")

	@Valid

	public StockType getStockType() {
		return stockType;
	}

	public void setStockType(StockType stockType) {
		this.stockType = stockType;
	}

	public StockSecurity yield(BigDecimal yield) {
		this.yield = yield;
		return this;
	}

	/**
	 * The current yield
	 * 
	 * @return yield
	 */
	@ApiModelProperty(value = "The current yield")

	@Valid

	public BigDecimal getYield() {
		return yield;
	}

	public void setYield(BigDecimal yield) {
		this.yield = yield;
	}

	public StockSecurity yieldAsOfDate(java.sql.Timestamp yieldAsOfDate) {
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

	public int getStockSecurityId() {
		return stockSecurityId;
	}

	public void setStockSecurityId(int stockSecurityId) {
		this.stockSecurityId = stockSecurityId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		StockSecurity stockSecurity = (StockSecurity) o;
		return Objects.equals(this.unitsStreet, stockSecurity.unitsStreet)
				&& Objects.equals(this.unitsUser, stockSecurity.unitsUser)
				&& Objects.equals(this.reinvestDividends, stockSecurity.reinvestDividends)
				&& Objects.equals(this.stockType, stockSecurity.stockType)
				&& Objects.equals(this.yield, stockSecurity.yield)
				&& Objects.equals(this.yieldAsOfDate, stockSecurity.yieldAsOfDate);
	}

	@Override
	public int hashCode() {
		return Objects.hash(unitsStreet, unitsUser, reinvestDividends, stockType, yield, yieldAsOfDate);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class StockSecurity {\n");

		sb.append("    unitsStreet: ").append(toIndentedString(unitsStreet)).append("\n");
		sb.append("    unitsUser: ").append(toIndentedString(unitsUser)).append("\n");
		sb.append("    reinvestDividends: ").append(toIndentedString(reinvestDividends)).append("\n");
		sb.append("    stockType: ").append(toIndentedString(stockType)).append("\n");
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

	private static final Logger log = LoggerFactory.getLogger(StockSecurity.class);

	public StockSecurity getStockSecurity(int stockSecurityId) throws FDXException {
		try {
			SqlParameterSource parameters = new MapSqlParameterSource("stockSecurityId", stockSecurityId);
			template = ConnectionConfigApi51.getTemplate();
			StockSecurity stockSecurity = template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".stockSecurity  where stockSecurityId in (:stockSecurityId)", parameters,
					new StockSecurityRowMapper());
			return stockSecurity;
		} catch (EmptyResultDataAccessException e) {
			throw new FDXException("Stock Security not found", 0);
		} catch (Exception e) {
			log.error("StockSecurity : ", e);
			throw new FDXException(e, 500);
		}
	}
}
