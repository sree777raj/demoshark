package com.fdx.api.model46.modelimpl;

import java.time.LocalDate;
import java.util.Map;

import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fdx.api.model46.config.ConnectionConfigApi46;
import com.fdx.api.model46.mapper.DepositTransactionRowMapper;

import io.swagger.annotations.ApiModel;

/**
 * A transaction on a deposit account type
 */
@ApiModel(description = "A transaction on a deposit account type")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class DepositTransaction {

	NamedParameterJdbcTemplate template;

	@JsonIgnore
	private int depositTransactionId;

	@JsonIgnore
	private String accountId;

	@JsonIgnore
	private String transactionId;

	@JsonUnwrapped
	private Transaction transaction;

	@JsonProperty("transactionType")
	private DepositTransactionType transactionType;

	@JsonProperty("payee")
	private String payee;

	@JsonProperty("checkNumber")
	private Integer checkNumber;

	public DepositTransaction accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	public DepositTransactionType getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(DepositTransactionType transactionType) {
		this.transactionType = transactionType;
	}

	public String getPayee() {
		return payee;
	}

	public void setPayee(String payee) {
		this.payee = payee;
	}

	public Integer getCheckNumber() {
		return checkNumber;
	}

	public void setCheckNumber(Integer checkNumber) {
		this.checkNumber = checkNumber;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public int getDepositTransactionId() {
		return depositTransactionId;
	}

	public void setDepositTransactionId(int depositTransactionId) {
		this.depositTransactionId = depositTransactionId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((transaction == null) ? 0 : transaction.hashCode());
		result = prime * result + ((accountId == null) ? 0 : accountId.hashCode());
		result = prime * result + ((checkNumber == null) ? 0 : checkNumber.hashCode());
		result = prime * result + ((payee == null) ? 0 : payee.hashCode());
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
		DepositTransaction other = (DepositTransaction) obj;
		if (transaction == null) {
			if (other.transaction != null)
				return false;
		} else if (!transaction.equals(other.transaction))
			return false;
		if (accountId == null) {
			if (other.accountId != null)
				return false;
		} else if (!accountId.equals(other.accountId))
			return false;
		if (checkNumber == null) {
			if (other.checkNumber != null)
				return false;
		} else if (!checkNumber.equals(other.checkNumber))
			return false;
		if (payee == null) {
			if (other.payee != null)
				return false;
		} else if (!payee.equals(other.payee))
			return false;
		if (transactionType != other.transactionType)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DepositTransaction [accountId=" + accountId + ", Transaction=" + transaction + ", transactionType="
				+ transactionType + ", payee=" + payee + ", checkNumber=" + checkNumber + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(DepositTransaction.class);

	public DepositTransaction getDepositTransactions(String accountId, int transactionId, LocalDate startTime,
			LocalDate endTime) throws FDXException {
		DepositTransaction depositTransactionNew = new DepositTransaction();
		try {
			
			template = ConnectionConfigApi46.getTemplate();;
			Transaction transaction = new Transaction();
			DepositTransaction depositTransaction = new DepositTransaction();

			depositTransaction = template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".depositTransaction where accountid in (:accountId) and deposittransactionsid in (:deposittransactionsid)",
					new MapSqlParameterSource().addValue("accountId", accountId).addValue("deposittransactionsid",
							transactionId),
					new DepositTransactionRowMapper());

			transaction = transaction.getTransaction(String.valueOf(depositTransaction.getTransactionId()), accountId,
					startTime, endTime);

			depositTransactionNew.setTransaction(transaction);
			depositTransactionNew.setTransactionType(depositTransaction.getTransactionType());
			depositTransactionNew.setPayee(depositTransaction.getPayee());
			depositTransactionNew.setCheckNumber(depositTransaction.getCheckNumber());
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("DepositTransaction : ", e);
			throw new FDXException(e,500);
		}
		return depositTransactionNew;
	}

	public Map<String, Object> postDepositTransaction(String accountId, String transactionId) throws FDXException {
		KeyHolder keyHolder = new GeneratedKeyHolder();
		try {
			template = ConnectionConfigApi46.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("paymentId", null);
			int count = template
					.update("insert into "+ DeveloperContext.getDeveloperSchema() +".depositTransaction (transactionId, accountId, payee) values ("
							+ ((transactionId != null) ? ("'" + transactionId + "'") : null) + ","
							+ ((accountId != null) ? ("'" + accountId + "'") : null) + ","
							+ ((payee != null) ? ("'" + payee + "'") : null) + ")", parameters, keyHolder);

		} catch (Exception e) {
			log.error("DepositTransaction : ", e);
			throw new FDXException(e,500);
		}
		return keyHolder.getKeys();

	}

}
