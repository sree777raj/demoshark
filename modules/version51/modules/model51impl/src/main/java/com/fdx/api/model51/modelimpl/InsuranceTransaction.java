package com.fdx.api.model51.modelimpl;

import com.fdx.common.exception.FDXException;
import java.time.LocalDate;

import com.fdx.common.exception.FDXException;

import com.fdx.common.util.DeveloperContext;
import com.fdx.common.util.FdxConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fdx.api.model51.config.ConnectionConfigApi51;
import com.fdx.api.model51.mapper.InsuranceTransactionRowMapper;

import io.swagger.annotations.ApiModel;

/**
 * An insurance transaction type
 */
@ApiModel(description = "An insurance transaction type")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class InsuranceTransaction {

	NamedParameterJdbcTemplate template;

	@JsonIgnore
	private int insuranceTransactionsId;

	@JsonIgnore
	private String accountId;

	@JsonIgnore
	private String transactionId;

	@JsonUnwrapped
	private Transaction transaction;

	/**
	 * Type of insurance transaction
	 */
	public enum TransactionTypeEnum {
		PAYMENT("PAYMENT"),

		FEE("FEE"),

		ADJUSTMENT("ADJUSTMENT"),

		INTEREST("INTEREST");

		private String value;

		TransactionTypeEnum(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static TransactionTypeEnum fromValue(String value) {
			for (TransactionTypeEnum b : TransactionTypeEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'",401));
		}
	}

	@JsonProperty("transactionType")
	private TransactionTypeEnum transactionType;

	public InsuranceTransaction accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	public int getInsuranceTransactionsId() {
		return insuranceTransactionsId;
	}

	public void setInsuranceTransactionsId(int insuranceTransactionsId) {
		this.insuranceTransactionsId = insuranceTransactionsId;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	public TransactionTypeEnum getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(TransactionTypeEnum transactionType) {
		this.transactionType = transactionType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((transaction == null) ? 0 : transaction.hashCode());
		result = prime * result + ((accountId == null) ? 0 : accountId.hashCode());
		result = prime * result + ((transactionId == null) ? 0 : transactionId.hashCode());
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
		InsuranceTransaction other = (InsuranceTransaction) obj;
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
		if (transactionId == null) {
			if (other.transactionId != null)
				return false;
		} else if (!transactionId.equals(other.transactionId))
			return false;
		if (transactionType != other.transactionType)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "InsuranceTransaction [insuranceTransactionsId=" + insuranceTransactionsId + ", accountId=" + accountId
				+ ", transactionId=" + transactionId + ", Transaction=" + transaction + ", transactionType="
				+ transactionType + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(InsuranceTransaction.class);

	public InsuranceTransaction getInsuranceTransactions(String accountId, int transactionId, LocalDate startTime,
			LocalDate endTime) throws FDXException {
		try {
			
			template = ConnectionConfigApi51.getTemplate();;
			Transaction transaction = new Transaction();
			InsuranceTransaction insuranceTransaction = new InsuranceTransaction();

			insuranceTransaction = template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".insuranceTransaction where accountid in (:accountId) and insurancetransactionsid in (:insurancetransactionsid)",
					new MapSqlParameterSource().addValue("accountId", accountId).addValue("insurancetransactionsid",
							transactionId),
					new InsuranceTransactionRowMapper());

			InsuranceTransaction insuranceTransactionNew = new InsuranceTransaction();
			transaction = transaction.getTransaction(String.valueOf(insuranceTransaction.getTransactionId()), accountId,
					startTime, endTime);
			insuranceTransactionNew.setTransaction(transaction);
			insuranceTransactionNew.setTransactionType(insuranceTransaction.getTransactionType());

			return insuranceTransactionNew;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("InsuranceTransaction : ", e);
			throw new FDXException(e, FdxConstants.HTTP_ERROR_CODE_500);
		}
	}

}
