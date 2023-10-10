package com.fdx.api.model51.modelimpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.OptBoolean;
import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
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
import com.fdx.api.model51.mapper.PaymentRowMapper;
import com.fdx.api.model51.model.Payment51;

import io.swagger.annotations.ApiModel;

/**
 * Represents a payment
 */
@ApiModel(description = "Represents a payment")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
@Repository("Payment51")
public class Payment implements Payment51<Payment> {

	NamedParameterJdbcTemplate template;

	@JsonUnwrapped
	private PaymentForUpdate paymentForUpdate;

	@JsonProperty("paymentId")
	private String paymentId;

	@JsonProperty("recurringPaymentId")
	private String recurringPaymentId;

	@JsonProperty("processedTimestamp")
	@JsonFormat(shape = JsonFormat.Shape.STRING, lenient = OptBoolean.FALSE)
	private java.sql.Timestamp processedTimestamp;

	@JsonProperty("failedTimestamp")
	@JsonFormat(shape = JsonFormat.Shape.STRING, lenient = OptBoolean.FALSE)
	private java.sql.Timestamp failedTimestamp;

	@JsonProperty("cancelledTimestamp")
	@JsonFormat(shape = JsonFormat.Shape.STRING, lenient = OptBoolean.FALSE)
	private java.sql.Timestamp cancelledTimestamp;

	@JsonProperty("startedProcessingTimestamp")
	@JsonFormat(shape = JsonFormat.Shape.STRING, lenient = OptBoolean.FALSE)
	private java.sql.Timestamp startedProcessingTimestamp;

	@JsonProperty("status")
	private PaymentStatus status;

	@JsonProperty("links")
	private PaymentLinks links;

	public PaymentForUpdate getPaymentForUpdate() {
		return paymentForUpdate;
	}

	public void setPaymentForUpdate(PaymentForUpdate paymentForUpdate) {
		this.paymentForUpdate = paymentForUpdate;
	}

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public String getRecurringPaymentId() {
		return recurringPaymentId;
	}

	public void setRecurringPaymentId(String recurringPaymentId) {
		this.recurringPaymentId = recurringPaymentId;
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

	public java.sql.Timestamp getCancelledTimestamp() {
		return cancelledTimestamp;
	}

	public void setCancelledTimestamp(java.sql.Timestamp cancelledTimestamp) {
		this.cancelledTimestamp = cancelledTimestamp;
	}

	public java.sql.Timestamp getStartedProcessingTimestamp() {
		return startedProcessingTimestamp;
	}

	public void setStartedProcessingTimestamp(java.sql.Timestamp startedProcessingTimestamp) {
		this.startedProcessingTimestamp = startedProcessingTimestamp;
	}

	public PaymentStatus getStatus() {
		return status;
	}

	public void setStatus(PaymentStatus status) {
		this.status = status;
	}

	public PaymentLinks getLinks() {
		return links;
	}

	public void setLinks(PaymentLinks links) {
		this.links = links;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cancelledTimestamp == null) ? 0 : cancelledTimestamp.hashCode());
		result = prime * result + ((failedTimestamp == null) ? 0 : failedTimestamp.hashCode());
		result = prime * result + ((links == null) ? 0 : links.hashCode());
		result = prime * result + ((paymentForUpdate == null) ? 0 : paymentForUpdate.hashCode());
		result = prime * result + ((paymentId == null) ? 0 : paymentId.hashCode());
		result = prime * result + ((processedTimestamp == null) ? 0 : processedTimestamp.hashCode());
		result = prime * result + ((recurringPaymentId == null) ? 0 : recurringPaymentId.hashCode());
		result = prime * result + ((startedProcessingTimestamp == null) ? 0 : startedProcessingTimestamp.hashCode());
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
		Payment other = (Payment) obj;
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
		if (links == null) {
			if (other.links != null)
				return false;
		} else if (!links.equals(other.links))
			return false;
		if (paymentForUpdate == null) {
			if (other.paymentForUpdate != null)
				return false;
		} else if (!paymentForUpdate.equals(other.paymentForUpdate))
			return false;
		if (paymentId == null) {
			if (other.paymentId != null)
				return false;
		} else if (!paymentId.equals(other.paymentId))
			return false;
		if (processedTimestamp == null) {
			if (other.processedTimestamp != null)
				return false;
		} else if (!processedTimestamp.equals(other.processedTimestamp))
			return false;
		if (recurringPaymentId == null) {
			if (other.recurringPaymentId != null)
				return false;
		} else if (!recurringPaymentId.equals(other.recurringPaymentId))
			return false;
		if (startedProcessingTimestamp == null) {
			if (other.startedProcessingTimestamp != null)
				return false;
		} else if (!startedProcessingTimestamp.equals(other.startedProcessingTimestamp))
			return false;
		if (status != other.status)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Payment [paymentForUpdate=" + paymentForUpdate + ", paymentId=" + paymentId + ", recurringPaymentId="
				+ recurringPaymentId + ", processedTimestamp=" + processedTimestamp + ", failedTimestamp="
				+ failedTimestamp + ", cancelledTimestamp=" + cancelledTimestamp + ", startedProcessingTimestamp="
				+ startedProcessingTimestamp + ", status=" + status + ", links=" + links + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(Payment.class);

	@Override
	public String getActivePaymentForRecurringPayment(String recurringPaymentId) {
		//"select * from "+ DeveloperContext.getDeveloperSchema() +".payment where recurringPaymentId in (:recurringPaymentId) and status='SCHEDULED'";
		return null;
	}

	@Override
	public Payment okToUpdatePayment(String paymentId) throws FDXException {
		Payment payment =  getPaymentById(paymentId);
		if ((payment.getStatus()).equals(PaymentStatus.PROCESSED) || (payment.getStatus()).equals(PaymentStatus.CANCELLED))
			throw new FDXException(805);
		return payment;
	}

	public List<Payment> getPayment(String updatedSince, Integer limit, String offset) throws FDXException {
		List<Payment> paymentList = new ArrayList<>();
		try {
			template = ConnectionConfigApi51.getTemplate();
			SqlParameterSource parameters = new MapSqlParameterSource("updatedSince", updatedSince);
			PaymentLinks paymentLinks = new PaymentLinks();
			StringBuffer query = new StringBuffer("select * from "+ DeveloperContext.getDeveloperSchema() +".payment ");
			if (updatedSince != null) {
				query.append(" where paymentid >= '" + updatedSince + "'");
			}
			query.append(" order by paymentid limit " + limit + " offset " + offset);
			List<Payment> paymentResponseList = template.query(query.toString(), parameters, new PaymentRowMapper());
			for (Payment paymentIterator : paymentResponseList) {
				PaymentForUpdate paymentForUpdate = new PaymentForUpdate();
				Payment payment = new Payment();
				paymentForUpdate = paymentForUpdate
						.getPaymentForUpdateDetails(paymentIterator.getPaymentForUpdate().getPaymentId());
				payment.setPaymentForUpdate(paymentForUpdate);
				if (paymentIterator.getLinks() != null) {
					paymentLinks = paymentLinks.getLinks(paymentIterator.getLinks().getPaymentLinkId());
					payment.setLinks(paymentLinks);
				}
				payment.setCancelledTimestamp(paymentIterator.getCancelledTimestamp());
				payment.setFailedTimestamp(paymentIterator.getFailedTimestamp());
				payment.setProcessedTimestamp(paymentIterator.getProcessedTimestamp());
				payment.setStartedProcessingTimestamp(paymentIterator.getStartedProcessingTimestamp());
				payment.setRecurringPaymentId(paymentIterator.getRecurringPaymentId());
				payment.setStatus(paymentIterator.getStatus());
				paymentList.add(payment);
			}
			return paymentList;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Payment : ", e);
			throw new FDXException(e,500);
		}
	}

	public int getCount(String updatedSince, String recurringPaymentId) throws FDXException {
		try {
			template = ConnectionConfigApi51.getTemplate();
			SqlParameterSource parameters = new MapSqlParameterSource("updatedSince", updatedSince);
			int count = 0;
			if (updatedSince != null)
				count = template.queryForObject(
						"select count(*) from "+ DeveloperContext.getDeveloperSchema() +".payment  where paymentid >=  '" + updatedSince + "'",
						parameters, Integer.class);
			else if (recurringPaymentId != null)
				count = template.queryForObject(
						"select count(*) from "+ DeveloperContext.getDeveloperSchema() +".payment where recurringPaymentId ='" + recurringPaymentId + "'",
						parameters, Integer.class);
			else
				count = template.queryForObject("select count(*) from "+ DeveloperContext.getDeveloperSchema() +".payment", parameters, Integer.class);
			return count;
		} catch (Exception e) {
			log.error("Payment : ", e);
			throw new FDXException(e,500);
		}
	}

	@Override
	public Payment getPaymentById(String paymentId) throws FDXException {
		try {
			template = ConnectionConfigApi51.getTemplate();
			SqlParameterSource parameters = new MapSqlParameterSource("paymentId", paymentId);
			Payment payment = template.queryForObject("select * from "+ DeveloperContext.getDeveloperSchema() +".payment where paymentId in (:paymentId)",
					parameters, new PaymentRowMapper());
			PaymentLinks paymentLinks = new PaymentLinks();
			PaymentForUpdate paymentForUpdate = new PaymentForUpdate();
			paymentForUpdate = paymentForUpdate
					.getPaymentForUpdateDetails(payment.getPaymentForUpdate().getPaymentId());
			payment.setPaymentForUpdate(paymentForUpdate);
			if (payment.getLinks() != null) {
				paymentLinks = paymentLinks.getLinks(payment.getLinks().getPaymentLinkId());
				payment.setLinks(paymentLinks);
			}
			return payment;
		} catch (EmptyResultDataAccessException e) {
			throw new FDXException(e,802);
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Payment : ", e);
			throw new FDXException(e,500);
		}
	}

	@Override
	public Payment deletePayment(String paymentId) throws FDXException {
		try {
			template = ConnectionConfigApi51.getTemplate();
			Payment payment = new Payment();
			payment = payment.getPaymentById(paymentId);
			if ((payment.getStatus()).equals(PaymentStatus.PROCESSED))
				throw new FDXException(805);
			SqlParameterSource parameters = new MapSqlParameterSource("paymentId", paymentId);
			Date currentDate = new java.util.Date();
			int updated = template.update(
					"update "+ DeveloperContext.getDeveloperSchema() +".payment set cancelledTimestamp='" + currentDate + "',status='"
							+ PaymentStatus.CANCELLED + "' where paymentId in (:paymentId)",
					parameters);
			if (updated != 1) {
				log.error("Payment : Update count not 1 for paymentId " + paymentId);
				throw new FDXException(500);
			}
			return payment.getPaymentById(paymentId);
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Payment : ", e);
			throw new FDXException(e,500);
		}
	}

	@Override
	public Payment insertpayment(String paymentId, String recurringPaymentId) throws FDXException {
		try {
			template = ConnectionConfigApi51.getTemplate();
			int linksId = 0;
			Map<String, Object> keys = null;
			if (links != null) {
				PaymentLinks links = new PaymentLinks();
				keys = links.addPaymentLinks();
				linksId = (int) keys.get("paymentlinkid");
			}
			SqlParameterSource parameters = new MapSqlParameterSource("paymentId", paymentId);
			int count = template.update(
					"insert into "+ DeveloperContext.getDeveloperSchema() +".payment (paymentId,recurringPaymentId,processedTimestamp,failedTimestamp,cancelledTimestamp,startedProcessingTimestamp,status,links) values ('"
							+ paymentId + "',"
							+ ((recurringPaymentId != null) ? ("'" + recurringPaymentId + "'") : null) + "," + null
							+ "," + null + "," + null + "," + null + ",'SCHEDULED',"
							+ ((links != null) ? ("'" + linksId + "'") : null) + ")",
					parameters);
			if (count != 1) {
				log.error("Payment : Insert failed for paymentId " + paymentId);
				throw new FDXException(500);
			}
			return getPaymentById(paymentId);
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Payment : ", e);
			throw new FDXException(e,500);
		}
	}

	public List<Payment> getPaymentByRecurringPaymentId(String recurringPaymentId, String updatedSince, Integer limit,
			String offset) throws FDXException {
		List<Payment> paymentList = new ArrayList<>();
		try {
			template = ConnectionConfigApi51.getTemplate();
			PaymentLinks paymentLinks = new PaymentLinks();
			StringBuffer query = new StringBuffer("select * from "+ DeveloperContext.getDeveloperSchema() +".payment where");
			if (updatedSince != null) {
				query.append(" recurringPaymentId >= '" + updatedSince + "' and ");
			}
			query.append(" recurringPaymentId = '" + recurringPaymentId + "' order by recurringpaymentid limit " + limit
					+ " offset " + offset);
			List<Payment> paymentResponseList = template.query(query.toString(), new MapSqlParameterSource()
					.addValue("updatedSince", updatedSince).addValue("recurringPaymentId", recurringPaymentId),
					new PaymentRowMapper());
			if (paymentResponseList.isEmpty())
				throw new FDXException(806);
			for (Payment paymentIterator : paymentResponseList) {
				PaymentForUpdate paymentForUpdate = new PaymentForUpdate();
				paymentForUpdate = paymentForUpdate
						.getPaymentForUpdateDetails(paymentIterator.getPaymentForUpdate().getPaymentId());
				Payment payment = new Payment();
				payment.setPaymentForUpdate(paymentForUpdate);
				if (paymentIterator.getLinks() != null)
					paymentLinks = paymentLinks.getLinks(paymentIterator.getLinks().getPaymentLinkId());
				payment.setCancelledTimestamp(paymentIterator.getCancelledTimestamp());
				payment.setFailedTimestamp(paymentIterator.getFailedTimestamp());
				payment.setProcessedTimestamp(paymentIterator.getProcessedTimestamp());
				payment.setStartedProcessingTimestamp(paymentIterator.getStartedProcessingTimestamp());
				payment.setRecurringPaymentId(paymentIterator.getRecurringPaymentId());
				payment.setStatus(paymentIterator.getStatus());
				payment.setLinks(paymentLinks);
				payment.setPaymentId(paymentIterator.getPaymentId());
				paymentList.add(payment);
			}
			return paymentList;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Payment : ", e);
			throw new FDXException(e,500);
		}
	}

	public List<Payment> getPaymentsByRecurringPaymentId(String recurringPaymentId) throws FDXException {
		try {
			template = ConnectionConfigApi51.getTemplate();
			StringBuffer query = new StringBuffer("select * from "+ DeveloperContext.getDeveloperSchema() +".payment where");
			query.append(" recurringPaymentId = '" + recurringPaymentId + "'");
			return template.query(query.toString(), new MapSqlParameterSource()
							.addValue("recurringPaymentId", recurringPaymentId),
					new PaymentRowMapper());
		} catch (Exception e) {
			log.error("Payment : ", e);
			throw new FDXException(e,500);
		}
	}

	@Override
	@JsonIgnore
	public void updatePaymentStatusProcessing(String paymentId) throws FDXException {
		template = ConnectionConfigApi51.getTemplate();
		Date currentDate = new java.util.Date();
		SqlParameterSource parameters = new MapSqlParameterSource("payeeId", null);
		int updated = template.update(
				"update "+ DeveloperContext.getDeveloperSchema() +".payment set startedProcessingTimestamp='" + currentDate + "',status='"
						+ PaymentStatus.PROCESSING + "' where paymentId ='" + paymentId + "'",
				parameters);
		if (updated != 1) {
			log.error("Payment : Update count not 1 for recurringPayment.getRecurringPaymentId() " + recurringPaymentId);
			throw new FDXException(500);
		}
	}

	@Override
	@JsonIgnore
	public void updatePaymentStatusProcessed(String paymentId) throws FDXException {
		template = ConnectionConfigApi51.getTemplate();
		Date currentDate = new java.util.Date();
		SqlParameterSource parameters = new MapSqlParameterSource("payeeId", null);
		int updated = template.update(
				"update "+ DeveloperContext.getDeveloperSchema() +".payment set processedTimestamp='" + currentDate + "',status='"
						+ PaymentStatus.PROCESSED + "' where paymentId ='" + paymentId + "'",
				parameters);
		if (updated != 1) {
			log.error("Payment : Update count not 1 for recurringPayment.getRecurringPaymentId() " + recurringPaymentId);
			throw new FDXException(500);
		}
	}

	@Override
	@JsonIgnore
	public void updatePaymentStatusFailed(String paymentId) throws FDXException {
		template = ConnectionConfigApi51.getTemplate();
		Date currentDate = new java.util.Date();
		SqlParameterSource parameters = new MapSqlParameterSource("payeeId", null);
		int updated = template.update("update "+ DeveloperContext.getDeveloperSchema() +".payment set failedTimestamp='" + currentDate
						+ "',status='" + PaymentStatus.FAILED + "' where paymentId ='" + paymentId + "'",
				parameters);
		if (updated != 1) {
			log.error("Payment : Update count not 1 for recurringPayment.getRecurringPaymentId() " + recurringPaymentId);
			throw new FDXException(500);
		}
	}
}