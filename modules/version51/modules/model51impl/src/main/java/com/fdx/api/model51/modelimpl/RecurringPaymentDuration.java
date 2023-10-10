package com.fdx.api.model51.modelimpl;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import com.fdx.common.util.FdxConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fdx.api.model51.config.ConnectionConfigApi51;
import com.fdx.api.model51.mapper.RecurringPaymentDurationRowMapper;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Describes a payment&#39;s duration
 */
@ApiModel(description = "Describes a payment's duration")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class RecurringPaymentDuration {

	NamedParameterJdbcTemplate template;

	@JsonIgnore
	private int durationId;;

	@JsonProperty("type")
	private RecurringPaymentDurationType type;

	@JsonProperty("numberOfTimes")
	private BigDecimal numberOfTimes;

	public RecurringPaymentDuration type(RecurringPaymentDurationType type) {
		this.type = type;
		return this;
	}

	public int getDurationId() {
		return durationId;
	}

	public void setDurationId(int durationId) {
		this.durationId = durationId;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 */
	@ApiModelProperty(required = true, value = "")
	@NotNull

	@Valid

	public RecurringPaymentDurationType getType() {
		return type;
	}

	public void setType(RecurringPaymentDurationType type) {
		this.type = type;
	}

	public RecurringPaymentDuration numberOfTimes(BigDecimal numberOfTimes) {
		this.numberOfTimes = numberOfTimes;
		return this;
	}

	/**
	 * Maximum number of times a payment is to be sent. Required if type is set to
	 * NUMBEROFTIMES
	 * 
	 * @return numberOfTimes
	 */
	@ApiModelProperty(value = "Maximum number of times a payment is to be sent. Required if type is set to NUMBEROFTIMES")

	@Valid

	public BigDecimal getNumberOfTimes() {
		return numberOfTimes;
	}

	public void setNumberOfTimes(BigDecimal numberOfTimes) {
		this.numberOfTimes = numberOfTimes;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		RecurringPaymentDuration recurringPaymentDuration = (RecurringPaymentDuration) o;
		return Objects.equals(this.type, recurringPaymentDuration.type)
				&& Objects.equals(this.numberOfTimes, recurringPaymentDuration.numberOfTimes);
	}

	@Override
	public int hashCode() {
		return Objects.hash(type, numberOfTimes);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RecurringPaymentDuration {\n");

		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    numberOfTimes: ").append(toIndentedString(numberOfTimes)).append("\n");
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

	private static final Logger log = LoggerFactory.getLogger(RecurringPaymentDuration.class);

	public RecurringPaymentDuration getRecurringPaymentDuration(int durationId) throws FDXException {
		RecurringPaymentDuration recurringPaymentDuration = new RecurringPaymentDuration();
		try {
			template = ConnectionConfigApi51.getTemplate();
			SqlParameterSource parameters = new MapSqlParameterSource("durationId", durationId);
			recurringPaymentDuration = template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".recurringpaymentDuration where durationid in (:durationId)", parameters,
					new RecurringPaymentDurationRowMapper());
			return recurringPaymentDuration;
		} catch (Exception e) {
			log.error("RecurringPaymentDuration : ", e);
			throw new FDXException(e, FdxConstants.HTTP_ERROR_CODE_500);
		}
	}

	public int updateRecurringPaymentDuration(int durationId, RecurringPaymentDuration duration) throws FDXException {
		int count = 0;
		try {
			template = ConnectionConfigApi51.getTemplate();
			SqlParameterSource parameters = new MapSqlParameterSource("durationId", durationId);
			StringBuffer query = new StringBuffer();
			query.append("update "+ DeveloperContext.getDeveloperSchema() +".recurringPaymentDuration set ");

			if (duration.getType() != null)
				query.append("type='" + duration.getType() + "',");

			if (duration.getNumberOfTimes() != null)
				query.append("numberOfTimes='" + duration.getNumberOfTimes() + "',");

			int size = query.length();
			String queryString = query.substring(0, size - 1);
			StringBuffer queryNew = new StringBuffer();
			queryNew.append(queryString);
			queryNew.append(" where durationid ='" + durationId + "'");

			count = template.update(queryNew.toString(), parameters);
		} catch (Exception e) {
			log.error("RecurringPaymentDuration : ", e);
			throw new FDXException(e,FdxConstants.HTTP_ERROR_CODE_500);
		}
		return count;
	}

	public Map<String, Object> insertRecurringPaymentDuration() throws FDXException {
		KeyHolder keyHolder = new GeneratedKeyHolder();
		try {
			template = ConnectionConfigApi51.getTemplate();
			Map<String, Object> keys = null;
			SqlParameterSource parameters = new MapSqlParameterSource("recurringPaymentId", null);
			int count = template.update("insert into "+ DeveloperContext.getDeveloperSchema() +".RecurringPaymentDuration (type, numberOfTimes) values ("
					+ ((type != null) ? "'" + type + "'" : null) + ","
					+ ((numberOfTimes != null) ? numberOfTimes : null) + ")", parameters, keyHolder);
		} catch (Exception e) {
			log.error("RecurringPaymentDuration : ", e);
			throw new FDXException(e,FdxConstants.HTTP_ERROR_CODE_500);
		}
		return keyHolder.getKeys();
	}
}
