package com.fdx.api.model51.modelimpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.OptBoolean;
import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import com.fdx.common.util.FdxConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fdx.api.model51.config.ConnectionConfigApi51;
import com.fdx.api.model51.mapper.RecurringPaymentRowMapper;
import com.fdx.api.model51.model.RecurringPayment51;

import io.swagger.annotations.ApiModel;

/**
 * A recurring payment. Financial institution is free to adjust the payment date
 * to accommodate weekends and holidays
 */
@ApiModel(description = "A recurring payment. Financial institution is free to adjust the payment date to accommodate weekends and holidays")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
@Repository("RecurringPayment51")
public class RecurringPayment implements RecurringPayment51<RecurringPayment> {

	NamedParameterJdbcTemplate template;

	@JsonUnwrapped
	private RecurringPaymentForUpdate recurringPaymentForUpdate;

	@JsonProperty("recurringPaymentId")
	private String recurringPaymentId;

	@JsonProperty("cancelledTimestamp")
	@JsonFormat(shape = JsonFormat.Shape.STRING, lenient = OptBoolean.FALSE)
	private java.sql.Timestamp cancelledTimestamp;

	@JsonProperty("processedTimestamp")
	@JsonFormat(shape = JsonFormat.Shape.STRING, lenient = OptBoolean.FALSE)
	private java.sql.Timestamp processedTimestamp;

	@JsonProperty("failedTimestamp")
	@JsonFormat(shape = JsonFormat.Shape.STRING, lenient = OptBoolean.FALSE)
	private java.sql.Timestamp failedTimestamp;

	@JsonProperty("status")
	private PaymentStatus status;

	public RecurringPaymentForUpdate getRecurringPaymentForUpdate() {
		return recurringPaymentForUpdate;
	}

	public void setRecurringPaymentForUpdate(RecurringPaymentForUpdate recurringPaymentForUpdate) {
		this.recurringPaymentForUpdate = recurringPaymentForUpdate;
	}

	public String getRecurringPaymentId() {
		return recurringPaymentId;
	}

	public void setRecurringPaymentId(String recurringPaymentId) {
		this.recurringPaymentId = recurringPaymentId;
	}

	public java.sql.Timestamp getCancelledTimestamp() {
		return cancelledTimestamp;
	}

	public void setCancelledTimestamp(java.sql.Timestamp cancelledTimestamp) {
		this.cancelledTimestamp = cancelledTimestamp;
	}

	public java.sql.Timestamp getProcessedTimestamp() {
		return processedTimestamp;
	}

	public void setProcessedTimestamp(java.sql.Timestamp processedTimestamp) {
		this.processedTimestamp = processedTimestamp;
	}

	public java.sql.Timestamp getFailedTimestamp() {
		return failedTimestamp;
	}

	public void setFailedTimestamp(java.sql.Timestamp failedTimestamp) {
		this.failedTimestamp = failedTimestamp;
	}

	public PaymentStatus getStatus() {
		return status;
	}

	public void setStatus(PaymentStatus status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cancelledTimestamp == null) ? 0 : cancelledTimestamp.hashCode());
		result = prime * result + ((failedTimestamp == null) ? 0 : failedTimestamp.hashCode());
		result = prime * result + ((processedTimestamp == null) ? 0 : processedTimestamp.hashCode());
		result = prime * result + ((recurringPaymentForUpdate == null) ? 0 : recurringPaymentForUpdate.hashCode());
		result = prime * result + ((recurringPaymentId == null) ? 0 : recurringPaymentId.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		RecurringPayment other = (RecurringPayment) obj;
		if (cancelledTimestamp == null) {
			if (other.cancelledTimestamp != null)
				return false;
		} else if (!cancelledTimestamp.equals(other.cancelledTimestamp))
			return false;
		if (failedTimestamp == null) {
			if (other.failedTimestamp != null)
				return false;
		} else if (!failedTimestamp.equals(other.failedTimestamp))
			return false;
		if (processedTimestamp == null) {
			if (other.processedTimestamp != null)
				return false;
		} else if (!processedTimestamp.equals(other.processedTimestamp))
			return false;
		if (recurringPaymentForUpdate == null) {
			if (other.recurringPaymentForUpdate != null)
				return false;
		} else if (!recurringPaymentForUpdate.equals(other.recurringPaymentForUpdate))
			return false;
		if (recurringPaymentId == null) {
			if (other.recurringPaymentId != null)
				return false;
		} else if (!recurringPaymentId.equals(other.recurringPaymentId))
			return false;
		if (status != other.status)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RecurringPayment [recurringPaymentForUpdate=" + recurringPaymentForUpdate + ", recurringPaymentId="
				+ recurringPaymentId + ", cancelledTimestamp=" + cancelledTimestamp + ", processedTimestamp="
				+ processedTimestamp + ", failedTimestamp=" + failedTimestamp + ", status=" + status + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(RecurringPayment.class);

	public List<RecurringPayment> getRecurringPayment(String updatedSince, Integer limit, String offset)
			throws FDXException {
		RecurringPayment recurringPayment = new RecurringPayment();
		List<RecurringPayment> recurringPaymentList = new ArrayList<>();
		try {
			template = ConnectionConfigApi51.getTemplate();
			SqlParameterSource parameters = new MapSqlParameterSource("updatedSince", updatedSince);
			if (updatedSince != null)
				recurringPayment = recurringPayment.getRecurringPaymentById(updatedSince);
			StringBuffer query = new StringBuffer("select * from "+ DeveloperContext.getDeveloperSchema() +".recurringpayment ");
			if (updatedSince != null) {
				query.append(" where recurringpaymentid >= '" + updatedSince + "'");
			}
			query.append(" order by recurringpaymentid limit " + limit + " offset " + offset);
			List<RecurringPayment> recurringPaymentResponseList = template.query(query.toString(), parameters,
					new RecurringPaymentRowMapper());
			for (RecurringPayment recurringPaymentIterator : recurringPaymentResponseList) {
				RecurringPaymentForUpdate recurringPaymentForUpdate = new RecurringPaymentForUpdate();
				recurringPaymentForUpdate = recurringPaymentForUpdate.getRecurringPaymentForUpdateDetails(
						recurringPaymentIterator.getRecurringPaymentForUpdate().getRecurringPaymentId());
				RecurringPayment recurringPaymentNew = new RecurringPayment();
				recurringPaymentNew.setRecurringPaymentForUpdate(recurringPaymentForUpdate);
				recurringPaymentNew.setCancelledTimestamp(recurringPaymentIterator.getCancelledTimestamp());
				recurringPaymentNew.setFailedTimestamp(recurringPaymentIterator.getFailedTimestamp());
				recurringPaymentNew.setProcessedTimestamp(recurringPaymentIterator.getProcessedTimestamp());
				recurringPaymentNew.setRecurringPaymentId(recurringPaymentIterator.getRecurringPaymentId());
				recurringPaymentNew.setStatus(recurringPaymentIterator.getStatus());
				recurringPaymentList.add(recurringPaymentNew);
			}
			return recurringPaymentList;
		} catch (EmptyResultDataAccessException e) {
			throw new FDXException(e, 806);
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("RecurringPayment : ", e);
			throw new FDXException(e, FdxConstants.HTTP_ERROR_CODE_500);
		}
	}

	public int getCount(String updatedSince) throws FDXException {
		try {
			template = ConnectionConfigApi51.getTemplate();
			SqlParameterSource parameters = new MapSqlParameterSource("updatedSince", updatedSince);
			int count = 0;
			if (updatedSince != null)
				count = template.queryForObject(
						"select count(*) from "+ DeveloperContext.getDeveloperSchema() +".recurringpayment  where recurringpaymentid >=  '" + updatedSince
								+ "'",
						parameters, Integer.class);
			else
				count = template.queryForObject("select count(*) from "+ DeveloperContext.getDeveloperSchema() +".recurringpayment", parameters,
						Integer.class);

			return count;
		} catch (Exception e) {
			log.error("RecurringPayment : ", e);
			throw new FDXException(e, FdxConstants.HTTP_ERROR_CODE_500);
		}
	}

	@Override
	public RecurringPayment getRecurringPaymentById(String recurringPaymentId) throws FDXException {
		try {
			RecurringPaymentForUpdate recurringPaymentForUpdate = new RecurringPaymentForUpdate();
			template = ConnectionConfigApi51.getTemplate();
			SqlParameterSource parameters = new MapSqlParameterSource("recurringPaymentId", recurringPaymentId);
			RecurringPayment recurringPayment = template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".recurringpayment where recurringPaymentId in (:recurringPaymentId)",
					parameters, new RecurringPaymentRowMapper());
			RecurringPaymentForUpdate recurringPaymentForUpdateResponse = recurringPaymentForUpdate
					.getRecurringPaymentForUpdateDetails(
							recurringPayment.getRecurringPaymentForUpdate().getRecurringPaymentId());
			recurringPayment.setRecurringPaymentForUpdate(recurringPaymentForUpdateResponse);
			return recurringPayment;
		} catch (EmptyResultDataAccessException e) {
			throw new FDXException(e, 806);
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("RecurringPayment : ", e);
			throw new FDXException(e, FdxConstants.HTTP_ERROR_CODE_500);
		}
	}

	@Override
	public RecurringPayment cancelRecurringPaymentById(String recurringPaymentId) throws FDXException {
		try {
			template = ConnectionConfigApi51.getTemplate();
			RecurringPayment recurringPayment = new RecurringPayment();
			recurringPayment = recurringPayment.getRecurringPaymentById(recurringPaymentId);
			if ((recurringPayment.getStatus()).equals(PaymentStatus.PROCESSED))
				throw new FDXException(808);
			// Cancel all payments of this recurring payment
			Payment payment = new Payment();
			List<Payment> paymentResponseList = payment.getPaymentsByRecurringPaymentId(recurringPaymentId);
			for (Payment paymentResponse : paymentResponseList) {
				payment.deletePayment(paymentResponse.getPaymentId());
			}
			SqlParameterSource parameters = new MapSqlParameterSource("recurringPaymentId", recurringPaymentId);
			int count = template.update(
					"update "+ DeveloperContext.getDeveloperSchema() +".recurringpayment set status ='CANCELLED' where recurringPaymentId in (:recurringPaymentId)",
					parameters);
			if (count != 1) {
				log.error("RecurringPayment : Update count not 1 for recurringPaymentId " + recurringPaymentId);
				throw new FDXException(FdxConstants.HTTP_ERROR_CODE_500);
			}
			return recurringPayment.getRecurringPaymentById(recurringPaymentId);
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("RecurringPayment : ", e);
			throw new FDXException(e, FdxConstants.HTTP_ERROR_CODE_500);
		}
	}

	public RecurringPayment insertRecurringPayment(String recurringPaymentId) throws FDXException {
		try {
			template = ConnectionConfigApi51.getTemplate();
			RecurringPayment recurringPayment = new RecurringPayment();
			SqlParameterSource parameters = new MapSqlParameterSource("recurringPaymentId", recurringPaymentId);
			int count = template.update(
					"insert into "+ DeveloperContext.getDeveloperSchema() +".recurringpayment (recurringPaymentId,cancelledTimestamp,processedTimestamp,failedTimestamp,status) values ('"
							+ recurringPaymentId + "',"
							+ ((cancelledTimestamp != null) ? ("'" + cancelledTimestamp + "'") : null) + ","
							+ ((processedTimestamp != null) ? ("'" + processedTimestamp + "'") : null) + ","
							+ ((failedTimestamp != null) ? ("'" + failedTimestamp + "'") : null) + ",'SCHEDULED')",
					parameters);
			if (count == 1)
				recurringPayment = recurringPayment.getRecurringPaymentById(recurringPaymentId);
			return recurringPayment;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("RecurringPayment : ", e);
			throw new FDXException(e, FdxConstants.HTTP_ERROR_CODE_500);
		}
	}

	public void updateFailedTimestamp(String recurringPaymentId) throws FDXException {
		template = ConnectionConfigApi51.getTemplate();
		Date currentDate = new java.util.Date();
		SqlParameterSource parameters = new MapSqlParameterSource("payeeId", null);
		int updated = template.update("update "+ DeveloperContext.getDeveloperSchema() +".recurringPayment set failedTimestamp='" + currentDate
				+ "', status ='" + status.FAILED + "' where recurringpaymentid ='"
				+ recurringPaymentId + "'", parameters);
		if (updated != 1) {
			log.error("Payment : Update count not 1 for recurringPayment.getRecurringPaymentId() " + recurringPaymentId);
			throw new FDXException(FdxConstants.HTTP_ERROR_CODE_500);
		}
	}

	@Override
	@JsonIgnore
	public void updatePaymentProcessed(String recurringPaymentId) throws FDXException {
		try {
			template = ConnectionConfigApi51.getTemplate();
			Date currentDate = new java.util.Date();
			SqlParameterSource parameters = new MapSqlParameterSource("payeeId", null);
			int updated = template.update("update "+ DeveloperContext.getDeveloperSchema() +".recurringPayment set processedtimestamp='" + currentDate
					+ "',status='" + PaymentStatus.PROCESSED + "' where recurringpaymentid ='"
					+ recurringPaymentId + "'", parameters);
			if (updated != 1) {
				log.error("Payment : Update count not 1 for recurringPayment.getRecurringPaymentId() " + recurringPaymentId);
				throw new FDXException(FdxConstants.HTTP_ERROR_CODE_500);
			}
		} catch (Exception e) {
			log.error("RecurringPayment : ", e);
			throw new FDXException(e, FdxConstants.HTTP_ERROR_CODE_500);
		}
	}

	@Override
	public void setRecurringPaymentStatus(String recurringPaymentId, String status) throws FDXException {
		try {
			SqlParameterSource parameters = new MapSqlParameterSource("payeeId", null);
			template = ConnectionConfigApi51.getTemplate();
			Date currentDate = new java.util.Date();
			switch (status) {
				case "FAILED":
					template.update("update "+ DeveloperContext.getDeveloperSchema() +".recurringPayment set failedTimestamp='" + currentDate
							+ "', status ='" + PaymentStatus.FAILED + "' where recurringpaymentid ='"
							+ recurringPaymentId + "'", parameters);
					break;
				case "PROCESSED":
					template.update("update "+ DeveloperContext.getDeveloperSchema() +".recurringPayment set processedtimestamp='"
							+ currentDate + "',status='" + PaymentStatus.PROCESSED + "' where recurringpaymentid ='"
							+ recurringPaymentId + "'", parameters);
					break;
			}
		} catch (Exception e) {
			log.error("RecurringPayment : ", e);
			throw new FDXException(e, FdxConstants.HTTP_ERROR_CODE_500);
		}
	}
}
