package com.fdx.api.model51.modelimpl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fdx.api.model51.model.RecurringPaymentForUpdate51;
import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import com.fdx.common.util.FdxConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fdx.api.model51.config.ConnectionConfigApi51;
import com.fdx.api.model51.mapper.RecurringPaymentForUpdateRowMapper;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Used to create or update a recurring payment. Financial institution is free
 * to adjust the payment date to accommodate weekends and holidays
 */
@ApiModel(description = "Used to create or update a recurring payment. Financial institution is free to adjust the payment date to accommodate weekends and holidays")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class RecurringPaymentForUpdate implements RecurringPaymentForUpdate51<RecurringPayment> {

	NamedParameterJdbcTemplate template;

	@JsonProperty("recurringPaymentId")
	private String recurringPaymentId;

	@JsonIgnore
	private int durationId;

	@JsonProperty("frequency")
	private RecurringPaymentFrequency frequency;

	@JsonProperty("duration")
	private RecurringPaymentDuration duration;

	@JsonProperty("fromAccountId")
	private String fromAccountId;

	@JsonProperty("toPayeeId")
	private String toPayeeId;

	@JsonProperty("amount")
	private BigDecimal amount;

	@JsonProperty("merchantAccountId")
	private String merchantAccountId;

	@JsonProperty("dueDate")
	private Date dueDate;

	public String getRecurringPaymentId() {
		return recurringPaymentId;
	}

	public void setRecurringPaymentId(String recurringPaymentId) {
		this.recurringPaymentId = recurringPaymentId;
	}

	@JsonIgnore
	public int getDurationId() {
		return durationId;
	}

	@JsonIgnore
	public void setDurationId(int durationId) {
		this.durationId = durationId;
	}

	public RecurringPaymentForUpdate frequency(RecurringPaymentFrequency frequency) {
		this.frequency = frequency;
		return this;
	}

	/**
	 * Get frequency
	 * 
	 * @return frequency
	 */
	@ApiModelProperty(required = true, value = "")
	@NotNull

	@Valid

	public RecurringPaymentFrequency getFrequency() {
		return frequency;
	}

	public void setFrequency(RecurringPaymentFrequency frequency) {
		this.frequency = frequency;
	}

	public RecurringPaymentForUpdate duration(RecurringPaymentDuration duration) {
		this.duration = duration;
		return this;
	}

	/**
	 * Get duration
	 * 
	 * @return duration
	 */
	@ApiModelProperty(value = "")

	@Valid

	public RecurringPaymentDuration getDuration() {
		return duration;
	}

	public void setDuration(RecurringPaymentDuration duration) {
		this.duration = duration;
	}

/*	public RecurringPaymentForUpdate fromAccountId(String fromAccountId) {
		this.fromAccountId = fromAccountId;
		return this;
	}*/

	/**
	 * Value for a unique identifier
	 * 
	 * @return fromAccountId
	 */
	@ApiModelProperty(required = true, value = "Value for a unique identifier")
	@NotNull

	@Size(max = 256)
	public String getFromAccountId() {
		return fromAccountId;
	}

	public void setFromAccountId(String fromAccountId) {
		this.fromAccountId = fromAccountId;
	}

/*	public RecurringPaymentForUpdate toPayeeId(String toPayeeId) {
		this.toPayeeId = toPayeeId;
		return this;
	}*/

	/**
	 * Value for a unique identifier
	 * 
	 * @return toPayeeId
	 */
	@ApiModelProperty(required = true, value = "Value for a unique identifier")
	@NotNull

	@Size(max = 256)
	public String getToPayeeId() {
		return toPayeeId;
	}

	public void setToPayeeId(String toPayeeId) {
		this.toPayeeId = toPayeeId;
	}

/*	public RecurringPaymentForUpdate amount(BigDecimal amount) {
		this.amount = amount;
		return this;
	}*/

	/**
	 * Amount for the payment. Must be positive minimum: 0
	 * 
	 * @return amount
	 */
	@ApiModelProperty(required = true, value = "Amount for the payment. Must be positive")
	@NotNull

	@Valid
	@DecimalMin("0")
	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

/*	public RecurringPaymentForUpdate merchantAccountId(String merchantAccountId) {
		this.merchantAccountId = merchantAccountId;
		return this;
	}*/

	/**
	 * User's account identifier with the payee
	 * 
	 * @return merchantAccountId
	 */
	@ApiModelProperty(value = "User's account identifier with the payee")

	public String getMerchantAccountId() {
		return merchantAccountId;
	}

	public void setMerchantAccountId(String merchantAccountId) {
		this.merchantAccountId = merchantAccountId;
	}

/*	public RecurringPaymentForUpdate dueDate(Date dueDate) {
		this.dueDate = dueDate;
		return this;
	}*/

	/**
	 * ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included
	 * according to [IETF RFC3339]
	 * (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)
	 * 
	 * @return dueDate
	 */
	@ApiModelProperty(required = true, value = "ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included according to [IETF RFC3339] (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)")
	@NotNull

	@Valid
	@Size(max = 10)
	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		RecurringPaymentForUpdate recurringPaymentForUpdate = (RecurringPaymentForUpdate) o;
		return Objects.equals(this.frequency, recurringPaymentForUpdate.frequency)
				&& Objects.equals(this.duration, recurringPaymentForUpdate.duration)
				&& Objects.equals(this.fromAccountId, recurringPaymentForUpdate.fromAccountId)
				&& Objects.equals(this.toPayeeId, recurringPaymentForUpdate.toPayeeId)
				&& Objects.equals(this.amount, recurringPaymentForUpdate.amount)
				&& Objects.equals(this.merchantAccountId, recurringPaymentForUpdate.merchantAccountId)
				&& Objects.equals(this.dueDate, recurringPaymentForUpdate.dueDate);
	}

	@Override
	public int hashCode() {
		return Objects.hash(frequency, duration, fromAccountId, toPayeeId, amount, merchantAccountId, dueDate);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RecurringPaymentForUpdate {\n");

		sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
		sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
		sb.append("    fromAccountId: ").append(toIndentedString(fromAccountId)).append("\n");
		sb.append("    toPayeeId: ").append(toIndentedString(toPayeeId)).append("\n");
		sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
		sb.append("    merchantAccountId: ").append(toIndentedString(merchantAccountId)).append("\n");
		sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
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

	private static final Logger log = LoggerFactory.getLogger(RecurringPaymentForUpdate.class);

	public RecurringPaymentForUpdate getRecurringPaymentForUpdateDetails(String recurringPaymentId) throws FDXException {
		RecurringPaymentForUpdate recurringPaymentForUpdate = new RecurringPaymentForUpdate();
		try {
			template = ConnectionConfigApi51.getTemplate();
			SqlParameterSource parameters = new MapSqlParameterSource("recurringPaymentId", recurringPaymentId);
			recurringPaymentForUpdate = template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".recurringpaymentForUpdate where recurringPaymentId in (:recurringPaymentId)",
					parameters, new RecurringPaymentForUpdateRowMapper());
			if (recurringPaymentForUpdate.getDuration().getDurationId() != 0) {
				RecurringPaymentDuration recurringPaymentDuration = new RecurringPaymentDuration();
				recurringPaymentDuration = recurringPaymentDuration
						.getRecurringPaymentDuration(recurringPaymentForUpdate.getDuration().getDurationId());
				recurringPaymentForUpdate.setDuration(recurringPaymentDuration);
			} else
				recurringPaymentForUpdate.duration = null;
			return recurringPaymentForUpdate;
		} catch (EmptyResultDataAccessException e) {
			throw new FDXException(e,806);
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("RecurringPaymentForUpdate : ", e);
			throw new FDXException(e, FdxConstants.HTTP_ERROR_CODE_500);
		}
	}

	public RecurringPayment updateRecurringPayment(String recurringPaymentId, RecurringPaymentForUpdate51 recurringPaymentForUpdateIn)
			throws FDXException {
		int count = 0;
		try {
			RecurringPaymentForUpdate recurringPaymentForUpdate = (RecurringPaymentForUpdate)recurringPaymentForUpdateIn;
			template = ConnectionConfigApi51.getTemplate();
			Map<String, Object> keys = null;
			SqlParameterSource parameters = new MapSqlParameterSource("recurringPaymentId", recurringPaymentId);
			StringBuffer query = new StringBuffer();
			query.append("update "+ DeveloperContext.getDeveloperSchema() +".recurringpaymentForUpdate set ");
			if (recurringPaymentForUpdate.getFrequency() != null)
				query.append("frequency='" + recurringPaymentForUpdate.getFrequency() + "',");
			if (recurringPaymentForUpdate.getFromAccountId() != null)
				query.append("fromAccountId='" + recurringPaymentForUpdate.getFromAccountId() + "',");
			if (recurringPaymentForUpdate.getToPayeeId() != null)
				query.append("toPayeeId='" + recurringPaymentForUpdate.getToPayeeId() + "',");
			if (recurringPaymentForUpdate.getAmount() != null)
				query.append("amount='" + recurringPaymentForUpdate.getAmount() + "',");
			if (recurringPaymentForUpdate.getMerchantAccountId() != null)
				query.append("merchantAccountId='" + recurringPaymentForUpdate.getMerchantAccountId() + "',");
			if (recurringPaymentForUpdate.getDueDate() != null)
				query.append("dueDate='" + recurringPaymentForUpdate.getDueDate() + "',");
			if (recurringPaymentForUpdate.getDuration() != null) {
				RecurringPaymentDuration recurringPaymentDuration = recurringPaymentForUpdate.getDuration();
				recurringPaymentForUpdate = recurringPaymentForUpdate
						.getRecurringPaymentForUpdateDetails(recurringPaymentId);
				int durationArrayKey = 0;
				if (recurringPaymentForUpdate.getDuration() == null) {
					keys = recurringPaymentDuration.insertRecurringPaymentDuration();
					durationArrayKey = (int) keys.get("durationid");
					query.append("duration='" + durationArrayKey + "',");
				} else
					recurringPaymentForUpdate.getDuration()
							.updateRecurringPaymentDuration(recurringPaymentForUpdate.getDuration().getDurationId(),duration);
			}
			int size = query.length();
			String queryString = query.substring(0, size - 1);
			StringBuffer queryNew = new StringBuffer();
			queryNew.append(queryString);
			queryNew.append(" where recurringPaymentId ='" + recurringPaymentId + "'");
			count = template.update(queryNew.toString(), parameters);
			if (count != 1) {
				log.error("RecurringPaymentForUpdate : Update count not 1 for recurringPaymentId " + recurringPaymentId);
				throw new FDXException(FdxConstants.HTTP_ERROR_CODE_500);
			}
			RecurringPayment recurringPayment = new RecurringPayment();
			return recurringPayment.getRecurringPaymentById(recurringPaymentId);
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("RecurringPaymentForUpdate : ", e);
			throw new FDXException(e,FdxConstants.HTTP_ERROR_CODE_500);
		}
	}

	@Override
	public RecurringPayment postRecurringPayment(RecurringPaymentForUpdate51 recurringPaymentForUpdateIn)
			throws InputMismatchException, FDXException {
		try {
			RecurringPayment recurringPayment = new RecurringPayment();
			template = ConnectionConfigApi51.getTemplate();
			Map<String, Object> keys = null;
			UpdatesMetadata updatesMetadata = new UpdatesMetadata();
			String recurringPaymentId = updatesMetadata.assignNextSequenceId("RecurringPayments");
			int durationArrayKey = 0;
			RecurringPaymentForUpdate recurringPaymentForUpdate = (RecurringPaymentForUpdate)recurringPaymentForUpdateIn;
			if (recurringPaymentForUpdate.getDuration() != null) {
				keys = recurringPaymentForUpdate.getDuration().insertRecurringPaymentDuration();
				durationArrayKey = (int) keys.get("durationid");
			}
			SqlParameterSource parameters = new MapSqlParameterSource("payeeId", null);
			int count = template.update(
					"insert into "+ DeveloperContext.getDeveloperSchema() +".recurringPaymentForUpdate (recurringpaymentid,frequency,duration,fromAccountId,toPayeeId,amount,merchantAccountId,dueDate) values ('"
							+ recurringPaymentId + "','" + recurringPaymentForUpdate.getFrequency() + "',"
							+ ((recurringPaymentForUpdate.getDuration() != null) ? durationArrayKey : null) + ",'"
							+ recurringPaymentForUpdate.getFromAccountId() + "','"
							+ recurringPaymentForUpdate.getToPayeeId() + "','" + recurringPaymentForUpdate.getAmount()
							+ "',"
							+ ((recurringPaymentForUpdate.getMerchantAccountId() != null)
									? "'"+recurringPaymentForUpdate.getMerchantAccountId()+"'"
									: null)
							+ ",'" + recurringPaymentForUpdate.getDueDate() + "')",
					parameters);
			if (count != 1) {
				log.error("RecurringPaymentForUpdate : Update count not 1 for recurringPaymentId " + recurringPaymentId);
				throw new FDXException(FdxConstants.HTTP_ERROR_CODE_500);
			}
			return recurringPayment.insertRecurringPayment(recurringPaymentId);
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("RecurringPaymentForUpdate : ", e);
			throw new FDXException(e,FdxConstants.HTTP_ERROR_CODE_500);
		}
	}
}
