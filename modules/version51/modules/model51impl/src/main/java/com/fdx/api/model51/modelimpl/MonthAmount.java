package com.fdx.api.model51.modelimpl;

import java.util.Objects;

import javax.validation.Valid;

import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fdx.api.model51.config.ConnectionConfigApi51;
import com.fdx.api.model51.mapper.MonthAmountRowMapper;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Month and amount pair used on IRS Form 1099-K, etc.
 */
@ApiModel(description = "Month and amount pair used on IRS Form 1099-K, etc.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class MonthAmount {

	NamedParameterJdbcTemplate template;

	@JsonIgnore
	private int monthamountid;

	@JsonProperty("month")
	private MonthAbbreviation month;

	@JsonProperty("amount")
	private Double amount;

	public MonthAmount month(MonthAbbreviation month) {
		this.month = month;
		return this;
	}

	/**
	 * Get month
	 * 
	 * @return month
	 */
	@ApiModelProperty(value = "")

	@Valid

	public MonthAbbreviation getMonth() {
		return month;
	}

	public void setMonth(MonthAbbreviation month) {
		this.month = month;
	}

	public MonthAmount amount(Double amount) {
		this.amount = amount;
		return this;
	}

	/**
	 * Amount
	 * 
	 * @return amount
	 */
	@ApiModelProperty(value = "Amount")

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public int getMonthamountid() {
		return monthamountid;
	}

	public void setMonthamountid(int monthamountid) {
		this.monthamountid = monthamountid;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		MonthAmount monthAmount = (MonthAmount) o;
		return Objects.equals(this.month, monthAmount.month) && Objects.equals(this.amount, monthAmount.amount);
	}

	@Override
	public int hashCode() {
		return Objects.hash(month, amount);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class MonthAmount {\n");

		sb.append("    month: ").append(toIndentedString(month)).append("\n");
		sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

	private static final Logger log = LoggerFactory.getLogger(MonthAmount.class);

	public MonthAmount getMonthAmountDetails(int monthamountid) throws FDXException {
		try {
			template = ConnectionConfigApi51.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("monthamountid", monthamountid);

			MonthAmount monthAmount = template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".monthamount where monthamountid in (:monthamountid)", parameters,
					new MonthAmountRowMapper());
			return monthAmount;
		} catch (Exception e) {
			log.error("MonthAmount : ", e);
			throw new FDXException(e,500);
		}
	}
}
