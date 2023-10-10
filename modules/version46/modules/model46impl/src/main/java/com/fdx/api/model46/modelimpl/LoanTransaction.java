package com.fdx.api.model46.modelimpl;

import java.time.LocalDate;

import javax.validation.constraints.Size;

import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fdx.api.model46.config.ConnectionConfigApi46;
import com.fdx.api.model46.mapper.LoanTransactionRowMapper;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A transaction on a loan account
 */
@ApiModel(description = "A transaction on a loan account")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class LoanTransaction {

	NamedParameterJdbcTemplate template;

	@JsonIgnore
	private int loantransactionid;

	@JsonIgnore
	private String accountId;

	@JsonIgnore
	private String transactionId;

	@JsonUnwrapped
	private Transaction transaction;

	@JsonProperty("transactionType")
	private LoanTransactionType transactionType;

	@JsonProperty("paymentDetails")
	private PaymentDetails paymentDetails;

	public LoanTransaction accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * Value for a unique identifier
	 * 
	 * @return accountId
	 */
	@ApiModelProperty(value = "Value for a unique identifier")

	@Size(max = 256)
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public LoanTransaction transactionId(String transactionId) {
		this.transactionId = transactionId;
		return this;
	}

	/**
	 * Value for a unique identifier
	 * 
	 * @return transactionId
	 */
	@ApiModelProperty(value = "Value for a unique identifier")

	@Size(max = 256)
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

	public LoanTransactionType getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(LoanTransactionType transactionType) {
		this.transactionType = transactionType;
	}

	public PaymentDetails getPaymentDetails() {
		return paymentDetails;
	}

	public void setPaymentDetails(PaymentDetails paymentDetails) {
		this.paymentDetails = paymentDetails;
	}

	public int getLoantransactionid() {
		return loantransactionid;
	}

	public void setLoantransactionid(int loantransactionid) {
		this.loantransactionid = loantransactionid;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((transaction == null) ? 0 : transaction.hashCode());
		result = prime * result + ((accountId == null) ? 0 : accountId.hashCode());
		result = prime * result + ((paymentDetails == null) ? 0 : paymentDetails.hashCode());
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
		LoanTransaction other = (LoanTransaction) obj;
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
		if (paymentDetails == null) {
			if (other.paymentDetails != null)
				return false;
		} else if (!paymentDetails.equals(other.paymentDetails))
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
		return "LoanTransaction [accountId=" + accountId + ", transactionId=" + transactionId + ", Transaction="
				+ transaction + ", transactionType=" + transactionType + ", paymentDetails=" + paymentDetails + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(LoanTransaction.class);

	public LoanTransaction getLoanTransactions(String accountId, int transactionId, LocalDate startTime,
			LocalDate endTime) throws FDXException {
		try {
			
			template = ConnectionConfigApi46.getTemplate();;
			Transaction transaction = new Transaction();
			LoanTransaction loanTransaction = new LoanTransaction();

			loanTransaction = template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".loanTransaction where accountid in (:accountId) and loantransactionid in (:loantransactionid)",
					new MapSqlParameterSource().addValue("accountId", accountId).addValue("loantransactionid",
							transactionId),
					new LoanTransactionRowMapper());

			LoanTransaction loanTransactionNew = new LoanTransaction();
			transaction = transaction.getTransaction(String.valueOf(loanTransaction.getTransactionId()), accountId,
					startTime, endTime);
			loanTransactionNew.setTransaction(transaction);
			loanTransactionNew.setTransactionType(loanTransaction.getTransactionType());

			PaymentDetails paymentDetails = new PaymentDetails();
			paymentDetails = paymentDetails
					.getPaymentDetails(loanTransaction.getPaymentDetails().getPaymentdetailsid());
			loanTransactionNew.setPaymentDetails(paymentDetails);

			return loanTransactionNew;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("LoanTransaction : ", e);
			throw new FDXException(e,500);
		}
	}
}
