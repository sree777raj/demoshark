package com.fdx.api.model46.modelimpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fdx.api.model46.config.ConnectionConfigApi46;
import com.fdx.api.model46.mapper.TransactionsRowMapper;
import com.fdx.api.model46.model.Transactions46;

import io.swagger.annotations.ApiModel;

/**
 * Optionally paginated array of transactions
 */
@ApiModel(description = "Optionally paginated array of transactions")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
@Repository("Transactions46")
public class Transactions implements Transactions46<Transactions> {

	NamedParameterJdbcTemplate template;

	@JsonIgnore
	private String accountId;

	@JsonIgnore
	private String transactionId;

	@JsonIgnore
	private int transactionSeqId;

	@JsonIgnore
	private String transactionType;

	@JsonProperty("depositTransaction")
	private DepositTransaction depositTransaction;

	@JsonProperty("investmentTransaction")
	private InvestmentTransaction investmentTransaction;

	@JsonProperty("insuranceTransaction")
	private InsuranceTransaction insuranceTransaction;

	@JsonProperty("locTransaction")
	private LocTransaction locTransaction;

	@JsonProperty("loanTransaction")
	private LoanTransaction loanTransaction;

	@JsonUnwrapped
	private PaginatedArray paginatedArray;

	@JsonProperty("transactions")
	private List<Object> transactions = null;

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

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public int getTransactionSeqId() {
		return transactionSeqId;
	}

	public void setTransactionSeqId(int transactionSeqId) {
		this.transactionSeqId = transactionSeqId;
	}

	public PaginatedArray getPaginatedArray(String uriPath, int limit, String offset, int count,
			String query) throws Exception {
		PaginatedArray paginatedArray = new PaginatedArray();
		paginatedArray = paginatedArray.getPaginatedResult(query, uriPath, limit, offset, count);
		return paginatedArray;
	}

	public void setPaginatedArray(PaginatedArray paginatedArray) {
		this.paginatedArray = paginatedArray;
	}

	public List<Object> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Object> transactions) {
		this.transactions = transactions;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountId == null) ? 0 : accountId.hashCode());
		result = prime * result + ((paginatedArray == null) ? 0 : paginatedArray.hashCode());
		result = prime * result + ((transactionId == null) ? 0 : transactionId.hashCode());
		result = prime * result + ((transactionType == null) ? 0 : transactionType.hashCode());
		result = prime * result + ((transactions == null) ? 0 : transactions.hashCode());
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
		Transactions other = (Transactions) obj;
		if (accountId == null) {
			if (other.accountId != null)
				return false;
		} else if (!accountId.equals(other.accountId))
			return false;
		if (paginatedArray == null) {
			if (other.paginatedArray != null)
				return false;
		} else if (!paginatedArray.equals(other.paginatedArray))
			return false;
		if (transactionId != other.transactionId)
			return false;
		if (transactionType == null) {
			if (other.transactionType != null)
				return false;
		} else if (!transactionType.equals(other.transactionType))
			return false;
		if (transactions == null) {
			if (other.transactions != null)
				return false;
		} else if (!transactions.equals(other.transactions))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Transactions [accountId=" + accountId + ", transactionId=" + transactionId + ", transactionType="
				+ transactionType + ", paginatedArray=" + paginatedArray + ", transactions=" + transactions + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(Transactions.class);

	@Override
	public Transactions getTransactions(String accountId, LocalDate startTime, LocalDate endTime, Integer limit,
			String offset, String uriPath, String query) throws FDXException {
		Transactions transactionsNew = new Transactions();
		try {
			Account account = new Account();
			Transaction transaction = new Transaction();
			// getAccount will throw acount not found exception if it does not exist
			account.getAccount(accountId,"details");
			// get the count from transaction model with date parameters
			int count = transaction.getTransactionCount(accountId, startTime, endTime);
			if (count > 0) {
				List<Object> transactionsListNew = new ArrayList<>();
				DepositTransaction depositTransaction = new DepositTransaction();
				InsuranceTransaction insuranceTransaction = new InsuranceTransaction();
				InvestmentTransaction investmentTransaction = new InvestmentTransaction();
				LoanTransaction loanTransaction = new LoanTransaction();
				LocTransaction locTransaction = new LocTransaction();
				template = ConnectionConfigApi46.getTemplate();
				SqlParameterSource parameters = new MapSqlParameterSource("accountId", accountId);
				List<Transactions> transactionsList = template.query(
						"select * from "+ DeveloperContext.getDeveloperSchema() +".transactions where accountid in (:accountId) limit "
								+ limit + " offset " + offset,
						parameters, new TransactionsRowMapper());
				for (Transactions transactionsListIterator : transactionsList) {
					String transactionType = transactionsListIterator.getTransactionType();
					if (transactionType.equals("deposittransaction")) {
						depositTransaction = depositTransaction.getDepositTransactions(accountId,
								transactionsListIterator.getTransactionSeqId(), startTime, endTime);
						TransactionsData transactionsData = new TransactionsData();
						transactionsData.setDepositTransaction(depositTransaction);
						transactionsListNew.add(transactionsData);
					} else if (transactionType.equals("insurancetransaction")) {
						insuranceTransaction = insuranceTransaction.getInsuranceTransactions(accountId,
								transactionsListIterator.getTransactionSeqId(), startTime, endTime);
						TransactionsData transactionsData = new TransactionsData();
						transactionsData.setInsuranceTransaction(insuranceTransaction);
						transactionsListNew.add(transactionsData);
					} else if (transactionType.equals("investmenttransaction")) {
						investmentTransaction = investmentTransaction.getInvestmentTransactions(accountId,
								transactionsListIterator.getTransactionSeqId(), startTime, endTime);
						TransactionsData transactionsData = new TransactionsData();
						transactionsData.setInvestmentTransaction(investmentTransaction);
						transactionsListNew.add(transactionsData);
					} else if (transactionType.equals("loantransaction")) {
						loanTransaction = loanTransaction.getLoanTransactions(accountId,
								transactionsListIterator.getTransactionSeqId(), startTime, endTime);
						TransactionsData transactionsData = new TransactionsData();
						transactionsData.setLoanTransaction(loanTransaction);
						transactionsListNew.add(transactionsData);
					} else if (transactionType.equals("loctransaction")) {
						locTransaction = locTransaction.getLocTransactions(accountId,
								transactionsListIterator.getTransactionSeqId(), startTime, endTime);
						TransactionsData transactionsData = new TransactionsData();
						transactionsData.setLocTransaction(locTransaction);
						transactionsListNew.add(transactionsData);
					}
					PaginatedArray paginatedArray = transactionsNew.getPaginatedArray(uriPath, limit, offset,
							count, query);
					transactionsNew.setTransactions(transactionsListNew);
					transactionsNew.setPaginatedArray(paginatedArray);
				}
				return transactionsNew;
			} else {
				throw new FDXException(1107);
			}
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (EmptyResultDataAccessException e) {
			throw new FDXException(e,701);
		} catch (Exception e) {
			log.error("Transactions : ", e);
			throw new FDXException(e,500);
		}
	}

	public void addTransactions(String accountId, String transactionId, String transactionsequenceid,
			String accountEntityType) throws FDXException {
		Map<String, Object> keys;
		try {
			NamedParameterJdbcTemplate template;
			template = ConnectionConfigApi46.getTemplate();
			KeyHolder keyHolder = new GeneratedKeyHolder();
			SqlParameterSource parameters = new MapSqlParameterSource("hateoasLinkId", null);

			String sql = "Insert into "+ DeveloperContext.getDeveloperSchema() +".transactions (accountId, transactionid,transactionsequenceid, transactionsentitytype)"
					+ " values (" + ((accountId != null) ? ("'" + accountId + "'") : null) + ","
					+ ((transactionId != null) ? ("'" + transactionId + "'") : null) + ","
					+ ((transactionsequenceid != null) ? ("'" + transactionsequenceid + "'") : null) + ","
					+ ((accountEntityType != null) ? ("'" + accountEntityType + "'") : null) + ")";

			log.info("SQL query: " + sql);
			int count = template.update(
					"Insert into "+ DeveloperContext.getDeveloperSchema() +".transactions (accountId, transactionid,transactionsequenceid, transactionsentitytype)"
							+ " values (" + ((accountId != null) ? ("'" + accountId + "'") : null) + ","
							+ ((transactionId != null) ? ("'" + transactionId + "'") : null) + ","
							+ ((transactionsequenceid != null) ? ("'" + transactionsequenceid + "'") : null) + ","
							+ ((accountEntityType != null) ? ("'" + accountEntityType + "'") : null)
							+ ") ON CONFLICT(transactionid,accountid) DO UPDATE set accountId=EXCLUDED.accountId, transactionid= EXCLUDED.transactionid,transactionsequenceid=EXCLUDED.transactionsequenceid,transactionsentitytype=EXCLUDED.transactionsentitytype",
					parameters, keyHolder);
			keys = keyHolder.getKeys();
		} catch (Exception e) {
			log.error("Transactions : ", e);
			throw new FDXException(e,500);
		}
	}

}
