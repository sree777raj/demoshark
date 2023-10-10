package com.fdx.api.model46.modelimpl;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.*;
import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import com.fdx.api.model46.config.ConnectionConfigApi46;
import com.fdx.api.model46.mapper.DepositAccountsRowMapper;

import io.swagger.annotations.ApiModel;

/**
 * Information for a deposit account type
 */
@ApiModel(description = "Information for a deposit account type")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
@JsonIgnoreProperties(ignoreUnknown = true)
//@Component
public class DepositAccount {

	NamedParameterJdbcTemplate template;

	@JsonIgnore
	private String accountId;

	@JsonIgnore
	private List<Integer> depositTransactionId;

	@JsonUnwrapped
	@Autowired
	private Account account;

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	@JsonProperty("balanceAsOf")
	@JsonFormat(shape = JsonFormat.Shape.STRING, lenient = OptBoolean.FALSE)
	private java.sql.Timestamp balanceAsOf;

	@JsonProperty("currentBalance")
	private BigDecimal currentBalance;

	@JsonProperty("openingDayBalance")
	private BigDecimal openingDayBalance;

	@JsonProperty("availableBalance")
	private BigDecimal availableBalance;

	@JsonProperty("annualPercentageYield")
	private BigDecimal annualPercentageYield;

	@JsonProperty("interestYtd")
	private BigDecimal interestYtd;

	@JsonProperty("term")
	private Integer term;

	@JsonProperty("maturityDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, lenient = OptBoolean.FALSE)
	private java.sql.Timestamp maturityDate;

	@JsonProperty("transactions")
	@Valid
	private List<DepositTransaction> depositTransaction = null;

	public List<Integer> getDepositTransactionId() {
		return depositTransactionId;
	}

	public void setDepositTransactionId(List<Integer> depositTransactionId) {
		this.depositTransactionId = depositTransactionId;
	}

	public java.sql.Timestamp getBalanceAsOf() {
		return balanceAsOf;
	}

	public void setBalanceAsOf(java.sql.Timestamp balanceAsOf) {
		this.balanceAsOf = balanceAsOf;
	}

	public BigDecimal getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(BigDecimal currentBalance) {
		this.currentBalance = currentBalance;
	}

	public BigDecimal getOpeningDayBalance() {
		return openingDayBalance;
	}

	public void setOpeningDayBalance(BigDecimal openingDayBalance) {
		this.openingDayBalance = openingDayBalance;
	}

	public BigDecimal getAvailableBalance() {
		return availableBalance;
	}

	public void setAvailableBalance(BigDecimal availableBalance) {
		this.availableBalance = availableBalance;
	}

	public BigDecimal getAnnualPercentageYield() {
		return annualPercentageYield;
	}

	public void setAnnualPercentageYield(BigDecimal annualPercentageYield) {
		this.annualPercentageYield = annualPercentageYield;
	}

	public BigDecimal getInterestYtd() {
		return interestYtd;
	}

	public void setInterestYtd(BigDecimal interestYtd) {
		this.interestYtd = interestYtd;
	}

	public Integer getTerm() {
		return term;
	}

	public void setTerm(Integer term) {
		this.term = term;
	}

	public java.sql.Timestamp getMaturityDate() {
		return maturityDate;
	}

	public void setMaturityDate(java.sql.Timestamp maturityDate) {
		this.maturityDate = maturityDate;
	}

	public List<DepositTransaction> getDepositTransaction() {
		return depositTransaction;
	}

	public void setDepositTransaction(List<DepositTransaction> depositTransaction) {
		this.depositTransaction = depositTransaction;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((account == null) ? 0 : account.hashCode());
		//result = prime * result + ((accountId == null) ? 0 : accountId.hashCode());
		result = prime * result + ((annualPercentageYield == null) ? 0 : annualPercentageYield.hashCode());
		result = prime * result + ((availableBalance == null) ? 0 : availableBalance.hashCode());
		result = prime * result + ((balanceAsOf == null) ? 0 : balanceAsOf.hashCode());
		result = prime * result + ((currentBalance == null) ? 0 : currentBalance.hashCode());
		result = prime * result + ((depositTransaction == null) ? 0 : depositTransaction.hashCode());
		result = prime * result + ((interestYtd == null) ? 0 : interestYtd.hashCode());
		result = prime * result + ((maturityDate == null) ? 0 : maturityDate.hashCode());
		result = prime * result + ((openingDayBalance == null) ? 0 : openingDayBalance.hashCode());
		result = prime * result + ((term == null) ? 0 : term.hashCode());
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
		DepositAccount other = (DepositAccount) obj;
		if (account == null) {
			if (other.account != null)
				return false;
		} else if (!account.equals(other.account))
			return false;
/*		if (accountId == null) {
			if (other.accountId != null)
				return false;
		} else if (!accountId.equals(other.accountId))
			return false;*/
		if (annualPercentageYield == null) {
			if (other.annualPercentageYield != null)
				return false;
		} else if (!annualPercentageYield.equals(other.annualPercentageYield))
			return false;
		if (availableBalance == null) {
			if (other.availableBalance != null)
				return false;
		} else if (!availableBalance.equals(other.availableBalance))
			return false;
		if (balanceAsOf == null) {
			if (other.balanceAsOf != null)
				return false;
		} else if (!balanceAsOf.equals(other.balanceAsOf))
			return false;
		if (currentBalance == null) {
			if (other.currentBalance != null)
				return false;
		} else if (!currentBalance.equals(other.currentBalance))
			return false;
		if (depositTransaction == null) {
			if (other.depositTransaction != null)
				return false;
		} else if (!depositTransaction.equals(other.depositTransaction))
			return false;
		if (interestYtd == null) {
			if (other.interestYtd != null)
				return false;
		} else if (!interestYtd.equals(other.interestYtd))
			return false;
		if (maturityDate == null) {
			if (other.maturityDate != null)
				return false;
		} else if (!maturityDate.equals(other.maturityDate))
			return false;
		if (openingDayBalance == null) {
			if (other.openingDayBalance != null)
				return false;
		} else if (!openingDayBalance.equals(other.openingDayBalance))
			return false;
		if (term == null) {
			if (other.term != null)
				return false;
		} else if (!term.equals(other.term))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DepositAccount [account=" + account + ", balanceAsOf=" + balanceAsOf
				+ ", currentBalance=" + currentBalance + ", openingDayBalance=" + openingDayBalance
				+ ", availableBalance=" + availableBalance + ", annualPercentageYield=" + annualPercentageYield
				+ ", interestYtd=" + interestYtd + ", term=" + term + ", maturityDate=" + maturityDate
				+ ", depositTransaction=" + depositTransaction + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(DepositAccount.class);

	public DepositAccount getDepositAccount(String accountId) throws Exception {
		SqlParameterSource parameters = new MapSqlParameterSource("accountId", accountId);
		DepositAccount depositAccount = new DepositAccount();
		try {
			template = ConnectionConfigApi46.getTemplate();

			depositAccount = template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".depositaccount where accountid in (:accountId)", parameters,
					new DepositAccountsRowMapper());
			return depositAccount;
		} catch (Exception e) {
			if (!(e instanceof FDXException))
				log.error("DepositAccount : ", e);
			throw new FDXException(e,"DepositAccount :: " + e.getMessage());
		}
	}

	public DepositAccount getDepositAccount(String accountId, LocalDate startTime, LocalDate endTime) throws FDXException {
		SqlParameterSource parameters = new MapSqlParameterSource("accountId", accountId);
		Account account = new Account();
		DepositAccount depositAccount = new DepositAccount();
		try {
			template = ConnectionConfigApi46.getTemplate();
			depositAccount = template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".depositaccount where accountid in (:accountId)", parameters,
					new DepositAccountsRowMapper());
			List<DepositTransaction> depositTransactionListNew = depositAccount.getDepositTransaction();
			List<DepositTransaction> depositTransactionList = new ArrayList<>();
			DepositTransaction depositTransaction = new DepositTransaction();
			account = (Account) account.getAccount(accountId, "details");
			if (depositTransactionListNew != null) {
				try {
					for (DepositTransaction depositTransactionIterator : depositTransactionListNew) {
						depositTransaction = depositTransaction.getDepositTransactions(accountId, depositTransactionIterator.getDepositTransactionId(), startTime, endTime);
						depositTransactionList.add(depositTransaction);
					}
				} catch (EmptyResultDataAccessException | FDXException e) {
					// Ignore if no deposit transactions found
					log.warn("deposit transactions details not found for accountid: "+ accountId, e.getMessage());
				}
			}
			depositAccount.setDepositTransaction(depositTransactionList);
			depositAccount.setAccount(account);
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("DepositAccount : ", e);
			throw new FDXException(e,500);
		}
		return depositAccount;
	}

	public Map<String, Object> updateDepositAccount(String accountId) throws FDXException {
		KeyHolder keyHolder = new GeneratedKeyHolder();
		try {
			template = ConnectionConfigApi46.getTemplate();
			List<Integer> depositTransactionArray = null;
			Integer[] depositTransactionArrayKeyList = new Integer[depositTransactionId.size()];
			int i = 0;
			for (Integer depositTransactionIterator : depositTransactionId) {
				depositTransactionArrayKeyList[i++] = depositTransactionIterator;

			}
			depositTransactionArray = Arrays.asList(depositTransactionArrayKeyList);
			SqlParameterSource parameters = new MapSqlParameterSource("paymentId", null);
			int count = template.update(
					"update "+ DeveloperContext.getDeveloperSchema() +".depositaccount set balanceAsOf='" + balanceAsOf + "',deposittransactionsid="
							+ "array" + depositTransactionArray + ", currentBalance =" + currentBalance
							+ ", availablebalance =" + availableBalance + " where accountid='" + accountId + "'",
					parameters, keyHolder);
		} catch (Exception e) {
			log.error("DepositAccount : ", e);
			throw new FDXException(e,500);
		}
		return keyHolder.getKeys();
	}

	public DepositAccount getDepositAccount(String accountId, LocalDate startTime, LocalDate endTime,
			String resultType) throws Exception {
		Account account = new Account();
		if (resultType.equals("details")) {
			return getDepositAccount(accountId, startTime, endTime);
		} else {
			DepositAccount depositAccount = new DepositAccount();
			depositAccount.account = (Account) account.getAccount(accountId, resultType);
			return depositAccount;
		}
	}
}
