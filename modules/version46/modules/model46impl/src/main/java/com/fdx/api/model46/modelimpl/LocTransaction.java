package com.fdx.api.model46.modelimpl;

import java.time.LocalDate;
import java.util.Map;

import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import com.fdx.common.util.FdxConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fdx.api.model46.config.ConnectionConfigApi46;
import com.fdx.api.model46.mapper.LocTransactionRowMapper;

import io.swagger.annotations.ApiModel;

/**
 * A line-of-credit transaction
 */
@ApiModel(description = "A line-of-credit transaction")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class LocTransaction {

	NamedParameterJdbcTemplate template;

	@JsonIgnore
	private int locTransactionId;

	@JsonUnwrapped
	private Transaction transaction;

	@JsonIgnore
	private String transactionId;

	@JsonProperty("transactionType")
	private LocTransactionType transactionType;

	@JsonProperty("checkNumber")
	private Integer checkNumber;

	@JsonProperty("paymentDetails")
	private PaymentDetails paymentDetails;

	public int getLocTransactionId() {
		return locTransactionId;
	}

	public void setLocTransactionId(int locTransactionId) {
		this.locTransactionId = locTransactionId;
	}

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	public LocTransactionType getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(LocTransactionType transactionType) {
		this.transactionType = transactionType;
	}

	public Integer getCheckNumber() {
		return checkNumber;
	}

	public void setCheckNumber(Integer checkNumber) {
		this.checkNumber = checkNumber;
	}

	public PaymentDetails getPaymentDetails() {
		return paymentDetails;
	}

	public void setPaymentDetails(PaymentDetails paymentDetails) {
		this.paymentDetails = paymentDetails;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((transaction == null) ? 0 : transaction.hashCode());
		result = prime * result + ((checkNumber == null) ? 0 : checkNumber.hashCode());
		result = prime * result + locTransactionId;
		result = prime * result + ((paymentDetails == null) ? 0 : paymentDetails.hashCode());
		result = prime * result + ((transactionType == null) ? 0 : transactionType.hashCode());
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
		LocTransaction other = (LocTransaction) obj;
		if (transaction == null) {
			if (other.transaction != null)
				return false;
		} else if (!transaction.equals(other.transaction))
			return false;
		if (checkNumber == null) {
			if (other.checkNumber != null)
				return false;
		} else if (!checkNumber.equals(other.checkNumber))
			return false;
		if (locTransactionId != other.locTransactionId)
			return false;
		if (paymentDetails == null) {
			if (other.paymentDetails != null)
				return false;
		} else if (!paymentDetails.equals(other.paymentDetails))
			return false;
		if (transactionType != other.transactionType)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "LocTransaction [locTransactionId=" + locTransactionId + ", Transaction=" + transaction
				+ ", transactionType=" + transactionType + ", checkNumber=" + checkNumber + ", paymentDetails="
				+ paymentDetails + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(LocTransaction.class);

	public LocTransaction getLocTransactions(String accountId, int transactionId, LocalDate startTime,
			LocalDate endTime) throws FDXException {
		try {
			template = ConnectionConfigApi46.getTemplate();;
			Transaction transaction = new Transaction();
			LocTransaction locTransaction = new LocTransaction();
			try {
				locTransaction = template.queryForObject(
						"select * from "+ DeveloperContext.getDeveloperSchema() +".locTransaction where accountid in (:accountId) and loctransactionid in (:loctransactionid)",
						new MapSqlParameterSource().addValue("accountId", accountId).addValue("loctransactionid",
								transactionId),
						new LocTransactionRowMapper());
			} catch (EmptyResultDataAccessException e) {
				throw new FDXException("Loc Transaction not found", 0);
			}
			LocTransaction locTransactionNew = new LocTransaction();
			transaction = transaction.getTransaction(String.valueOf(locTransaction.getTransactionId()), accountId,
					startTime, endTime);
			locTransactionNew.setTransaction(transaction);
			locTransactionNew.setTransactionType(locTransaction.getTransactionType());
			locTransactionNew.setCheckNumber(locTransaction.getCheckNumber());
			PaymentDetails paymentDetails = new PaymentDetails();
			if (locTransaction.getPaymentDetails() != null) {
				paymentDetails = paymentDetails
						.getPaymentDetails(locTransaction.getPaymentDetails().getPaymentdetailsid());
				locTransactionNew.setPaymentDetails(paymentDetails);
			}
			return locTransactionNew;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("LocTransaction : ", e);
			throw new FDXException(e, FdxConstants.HTTP_ERROR_CODE_500);
		}
	}

	public Map<String, Object> postLocTransaction(String accountId, String transactionId) throws FDXException {
		try {
			KeyHolder keyHolder = new GeneratedKeyHolder();
			template = ConnectionConfigApi46.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("paymentId", null);
			int count = template.update(
					"insert into "+ DeveloperContext.getDeveloperSchema() +".locTransaction (transactionId, accountId, transactiontype) values ("
							+ ((transactionId != null) ? ("'" + transactionId + "'") : null) + ","
							+ ((accountId != null) ? ("'" + accountId + "'") : null) + ","
							+ ((transactionType != null) ? ("'" + transactionType + "'") : null) + ")",
					parameters, keyHolder);
			return keyHolder.getKeys();
		} catch (Exception e) {
			log.error("LocTransaction : ", e);
			throw new FDXException(e,FdxConstants.HTTP_ERROR_CODE_500);
		}
	}
}
