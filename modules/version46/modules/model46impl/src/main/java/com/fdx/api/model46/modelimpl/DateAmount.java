package com.fdx.api.model46.modelimpl;

import java.sql.Date;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.OptBoolean;
import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fdx.api.model46.config.ConnectionConfigApi46;
import com.fdx.api.model46.mapper.DateAmountRowMapper;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Date, description, and amount. When used in 1098-Q, description is optional
 */
@ApiModel(description = "Date, description, and amount. When used in 1098-Q, description is optional")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class DateAmount {

	NamedParameterJdbcTemplate template;

	@JsonProperty("date")

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private Date date;

	@JsonIgnore
	private int dateamountid;

	@JsonProperty("description")
	private String description;

	@JsonProperty("amount")
	private Double amount;

	public DateAmount date(Date date) {
		this.date = date;
		return this;
	}

	/**
	 * ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included
	 * according to [IETF RFC3339]
	 * (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)
	 * 
	 * @return date
	 */
	@ApiModelProperty(value = "ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included according to [IETF RFC3339] (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)")

	@Valid
	@Size(max = 10)
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public DateAmount description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Description of amount. When used in 1098-Q, may use MonthAbbreviation
	 * 
	 * @return description
	 */
	@ApiModelProperty(value = "Description of amount. When used in 1098-Q, may use MonthAbbreviation")

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public DateAmount amount(Double amount) {
		this.amount = amount;
		return this;
	}

	/**
	 * Amount of payment or receipt. When used in 1098-Q, monthly total
	 * 
	 * @return amount
	 */
	@ApiModelProperty(value = "Amount of payment or receipt. When used in 1098-Q, monthly total")

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public int getDateamountid() {
		return dateamountid;
	}

	public void setDateamountid(int dateamountid) {
		this.dateamountid = dateamountid;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((amount == null) ? 0 : amount.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + dateamountid;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
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
		DateAmount other = (DateAmount) obj;
		if (amount == null) {
			if (other.amount != null)
				return false;
		} else if (!amount.equals(other.amount))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (dateamountid != other.dateamountid)
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DateAmount [date=" + date + ", dateamountid=" + dateamountid + ", description=" + description
				+ ", amount=" + amount + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(DateAmount.class);

	public DateAmount getDateAmountDetails(int dateamountid) throws FDXException {
		try {
			
			template = ConnectionConfigApi46.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("dateamountid", dateamountid);

			DateAmount dateAmountResponse = template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".dateamount where dateamountid in (:dateamountid)", parameters,
					new DateAmountRowMapper());
			return dateAmountResponse;
		} catch (Exception e) {
			log.error("DateAmount : ", e);
			throw new FDXException(e,500);
		}
	}

}
