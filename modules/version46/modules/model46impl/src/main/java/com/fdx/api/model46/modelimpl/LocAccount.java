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
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import com.fdx.api.model46.config.ConnectionConfigApi46;
import com.fdx.api.model46.mapper.LocAccountsRowMapper;

import io.swagger.annotations.ApiModel;

/**
 * A line-of-credit account
 */
@ApiModel(description = "A line-of-credit account")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class LocAccount {

	NamedParameterJdbcTemplate template;

	@JsonIgnore
	private String accountId;

	@JsonUnwrapped
	private Account account;

	@JsonIgnore
	private List<Integer> locTransactionId;

	public List<Integer> getLocTransactionId() {
		return locTransactionId;
	}

	public void setLocTransactionId(List<Integer> locTransactionId) {
		this.locTransactionId = locTransactionId;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@JsonProperty("balanceAsOf")
	@JsonFormat(shape = JsonFormat.Shape.STRING, lenient = OptBoolean.FALSE)
	private java.sql.Timestamp balanceAsOf;

	@JsonProperty("creditLine")
	private BigDecimal creditLine;

	@JsonProperty("availableCredit")
	private BigDecimal availableCredit;

	@JsonProperty("nextPaymentAmount")
	private BigDecimal nextPaymentAmount;

	@JsonProperty("nextPaymentDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, lenient = OptBoolean.FALSE)
	private java.sql.Timestamp nextPaymentDate;

	@JsonProperty("principalBalance")
	private BigDecimal principalBalance;

	@JsonProperty("currentBalance")
	private BigDecimal currentBalance;

	@JsonProperty("minimumPaymentAmount")
	private BigDecimal minimumPaymentAmount;

	@JsonProperty("lastPaymentAmount")
	private BigDecimal lastPaymentAmount;

	@JsonProperty("lastPaymentDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, lenient = OptBoolean.FALSE)
	private java.sql.Timestamp lastPaymentDate;

	@JsonProperty("pastDueAmount")
	private BigDecimal pastDueAmount;

	@JsonProperty("lastStmtBalance")
	private BigDecimal lastStmtBalance;

	@JsonProperty("lastStmtDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, lenient = OptBoolean.FALSE)
	private java.sql.Timestamp lastStmtDate;

	@JsonProperty("pointsAccrued")
	private BigDecimal pointsAccrued;

	@JsonProperty("currentRewardsBalance")
	private BigDecimal currentRewardsBalance;

	@JsonProperty("pointsRedeemed")
	private BigDecimal pointsRedeemed;

	@JsonProperty("purchasesApr")
	private BigDecimal purchasesApr;

	@JsonProperty("advancesApr")
	private BigDecimal advancesApr;

	@JsonProperty("cashAdvanceLimit")
	private BigDecimal cashAdvanceLimit;

	@JsonProperty("availableCash")
	private BigDecimal availableCash;

	@JsonProperty("financeCharges")
	private BigDecimal financeCharges;

	@JsonProperty("transactions")
	@Valid
	private List<LocTransaction> transactions = null;

	public LocAccount accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public java.sql.Timestamp getBalanceAsOf() {
		return balanceAsOf;
	}

	public void setBalanceAsOf(java.sql.Timestamp balanceAsOf) {
		this.balanceAsOf = balanceAsOf;
	}

	public BigDecimal getCreditLine() {
		return creditLine;
	}

	public void setCreditLine(BigDecimal creditLine) {
		this.creditLine = creditLine;
	}

	public BigDecimal getAvailableCredit() {
		return availableCredit;
	}

	public void setAvailableCredit(BigDecimal availableCredit) {
		this.availableCredit = availableCredit;
	}

	public BigDecimal getNextPaymentAmount() {
		return nextPaymentAmount;
	}

	public void setNextPaymentAmount(BigDecimal nextPaymentAmount) {
		this.nextPaymentAmount = nextPaymentAmount;
	}

	public java.sql.Timestamp getNextPaymentDate() {
		return nextPaymentDate;
	}

	public void setNextPaymentDate(java.sql.Timestamp nextPaymentDate) {
		this.nextPaymentDate = nextPaymentDate;
	}

	public BigDecimal getPrincipalBalance() {
		return principalBalance;
	}

	public void setPrincipalBalance(BigDecimal principalBalance) {
		this.principalBalance = principalBalance;
	}

	public BigDecimal getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(BigDecimal currentBalance) {
		this.currentBalance = currentBalance;
	}

	public BigDecimal getMinimumPaymentAmount() {
		return minimumPaymentAmount;
	}

	public void setMinimumPaymentAmount(BigDecimal minimumPaymentAmount) {
		this.minimumPaymentAmount = minimumPaymentAmount;
	}

	public BigDecimal getLastPaymentAmount() {
		return lastPaymentAmount;
	}

	public void setLastPaymentAmount(BigDecimal lastPaymentAmount) {
		this.lastPaymentAmount = lastPaymentAmount;
	}

	public java.sql.Timestamp getLastPaymentDate() {
		return lastPaymentDate;
	}

	public void setLastPaymentDate(java.sql.Timestamp lastPaymentDate) {
		this.lastPaymentDate = lastPaymentDate;
	}

	public BigDecimal getPastDueAmount() {
		return pastDueAmount;
	}

	public void setPastDueAmount(BigDecimal pastDueAmount) {
		this.pastDueAmount = pastDueAmount;
	}

	public BigDecimal getLastStmtBalance() {
		return lastStmtBalance;
	}

	public void setLastStmtBalance(BigDecimal lastStmtBalance) {
		this.lastStmtBalance = lastStmtBalance;
	}

	public java.sql.Timestamp getLastStmtDate() {
		return lastStmtDate;
	}

	public void setLastStmtDate(java.sql.Timestamp lastStmtDate) {
		this.lastStmtDate = lastStmtDate;
	}

	public BigDecimal getPointsAccrued() {
		return pointsAccrued;
	}

	public void setPointsAccrued(BigDecimal pointsAccrued) {
		this.pointsAccrued = pointsAccrued;
	}

	public BigDecimal getCurrentRewardsBalance() {
		return currentRewardsBalance;
	}

	public void setCurrentRewardsBalance(BigDecimal currentRewardsBalance) {
		this.currentRewardsBalance = currentRewardsBalance;
	}

	public BigDecimal getPointsRedeemed() {
		return pointsRedeemed;
	}

	public void setPointsRedeemed(BigDecimal pointsRedeemed) {
		this.pointsRedeemed = pointsRedeemed;
	}

	public BigDecimal getPurchasesApr() {
		return purchasesApr;
	}

	public void setPurchasesApr(BigDecimal purchasesApr) {
		this.purchasesApr = purchasesApr;
	}

	public BigDecimal getAdvancesApr() {
		return advancesApr;
	}

	public void setAdvancesApr(BigDecimal advancesApr) {
		this.advancesApr = advancesApr;
	}

	public BigDecimal getCashAdvanceLimit() {
		return cashAdvanceLimit;
	}

	public void setCashAdvanceLimit(BigDecimal cashAdvanceLimit) {
		this.cashAdvanceLimit = cashAdvanceLimit;
	}

	public BigDecimal getAvailableCash() {
		return availableCash;
	}

	public void setAvailableCash(BigDecimal availableCash) {
		this.availableCash = availableCash;
	}

	public BigDecimal getFinanceCharges() {
		return financeCharges;
	}

	public void setFinanceCharges(BigDecimal financeCharges) {
		this.financeCharges = financeCharges;
	}

	public List<LocTransaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<LocTransaction> transactions) {
		this.transactions = transactions;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((account == null) ? 0 : account.hashCode());
		result = prime * result + ((accountId == null) ? 0 : accountId.hashCode());
		result = prime * result + ((advancesApr == null) ? 0 : advancesApr.hashCode());
		result = prime * result + ((availableCash == null) ? 0 : availableCash.hashCode());
		result = prime * result + ((availableCredit == null) ? 0 : availableCredit.hashCode());
		result = prime * result + ((balanceAsOf == null) ? 0 : balanceAsOf.hashCode());
		result = prime * result + ((cashAdvanceLimit == null) ? 0 : cashAdvanceLimit.hashCode());
		result = prime * result + ((creditLine == null) ? 0 : creditLine.hashCode());
		result = prime * result + ((currentBalance == null) ? 0 : currentBalance.hashCode());
		result = prime * result + ((currentRewardsBalance == null) ? 0 : currentRewardsBalance.hashCode());
		result = prime * result + ((financeCharges == null) ? 0 : financeCharges.hashCode());
		result = prime * result + ((lastPaymentAmount == null) ? 0 : lastPaymentAmount.hashCode());
		result = prime * result + ((lastPaymentDate == null) ? 0 : lastPaymentDate.hashCode());
		result = prime * result + ((lastStmtBalance == null) ? 0 : lastStmtBalance.hashCode());
		result = prime * result + ((lastStmtDate == null) ? 0 : lastStmtDate.hashCode());
		result = prime * result + ((minimumPaymentAmount == null) ? 0 : minimumPaymentAmount.hashCode());
		result = prime * result + ((nextPaymentAmount == null) ? 0 : nextPaymentAmount.hashCode());
		result = prime * result + ((nextPaymentDate == null) ? 0 : nextPaymentDate.hashCode());
		result = prime * result + ((pastDueAmount == null) ? 0 : pastDueAmount.hashCode());
		result = prime * result + ((pointsAccrued == null) ? 0 : pointsAccrued.hashCode());
		result = prime * result + ((pointsRedeemed == null) ? 0 : pointsRedeemed.hashCode());
		result = prime * result + ((principalBalance == null) ? 0 : principalBalance.hashCode());
		result = prime * result + ((purchasesApr == null) ? 0 : purchasesApr.hashCode());
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
		LocAccount other = (LocAccount) obj;
		if (account == null) {
			if (other.account != null)
				return false;
		} else if (!account.equals(other.account))
			return false;
		if (accountId == null) {
			if (other.accountId != null)
				return false;
		} else if (!accountId.equals(other.accountId))
			return false;
		if (advancesApr == null) {
			if (other.advancesApr != null)
				return false;
		} else if (!advancesApr.equals(other.advancesApr))
			return false;
		if (availableCash == null) {
			if (other.availableCash != null)
				return false;
		} else if (!availableCash.equals(other.availableCash))
			return false;
		if (availableCredit == null) {
			if (other.availableCredit != null)
				return false;
		} else if (!availableCredit.equals(other.availableCredit))
			return false;
		if (balanceAsOf == null) {
			if (other.balanceAsOf != null)
				return false;
		} else if (!balanceAsOf.equals(other.balanceAsOf))
			return false;
		if (cashAdvanceLimit == null) {
			if (other.cashAdvanceLimit != null)
				return false;
		} else if (!cashAdvanceLimit.equals(other.cashAdvanceLimit))
			return false;
		if (creditLine == null) {
			if (other.creditLine != null)
				return false;
		} else if (!creditLine.equals(other.creditLine))
			return false;
		if (currentBalance == null) {
			if (other.currentBalance != null)
				return false;
		} else if (!currentBalance.equals(other.currentBalance))
			return false;
		if (currentRewardsBalance == null) {
			if (other.currentRewardsBalance != null)
				return false;
		} else if (!currentRewardsBalance.equals(other.currentRewardsBalance))
			return false;
		if (financeCharges == null) {
			if (other.financeCharges != null)
				return false;
		} else if (!financeCharges.equals(other.financeCharges))
			return false;
		if (lastPaymentAmount == null) {
			if (other.lastPaymentAmount != null)
				return false;
		} else if (!lastPaymentAmount.equals(other.lastPaymentAmount))
			return false;
		if (lastPaymentDate == null) {
			if (other.lastPaymentDate != null)
				return false;
		} else if (!lastPaymentDate.equals(other.lastPaymentDate))
			return false;
		if (lastStmtBalance == null) {
			if (other.lastStmtBalance != null)
				return false;
		} else if (!lastStmtBalance.equals(other.lastStmtBalance))
			return false;
		if (lastStmtDate == null) {
			if (other.lastStmtDate != null)
				return false;
		} else if (!lastStmtDate.equals(other.lastStmtDate))
			return false;
		if (minimumPaymentAmount == null) {
			if (other.minimumPaymentAmount != null)
				return false;
		} else if (!minimumPaymentAmount.equals(other.minimumPaymentAmount))
			return false;
		if (nextPaymentAmount == null) {
			if (other.nextPaymentAmount != null)
				return false;
		} else if (!nextPaymentAmount.equals(other.nextPaymentAmount))
			return false;
		if (nextPaymentDate == null) {
			if (other.nextPaymentDate != null)
				return false;
		} else if (!nextPaymentDate.equals(other.nextPaymentDate))
			return false;
		if (pastDueAmount == null) {
			if (other.pastDueAmount != null)
				return false;
		} else if (!pastDueAmount.equals(other.pastDueAmount))
			return false;
		if (pointsAccrued == null) {
			if (other.pointsAccrued != null)
				return false;
		} else if (!pointsAccrued.equals(other.pointsAccrued))
			return false;
		if (pointsRedeemed == null) {
			if (other.pointsRedeemed != null)
				return false;
		} else if (!pointsRedeemed.equals(other.pointsRedeemed))
			return false;
		if (principalBalance == null) {
			if (other.principalBalance != null)
				return false;
		} else if (!principalBalance.equals(other.principalBalance))
			return false;
		if (purchasesApr == null) {
			if (other.purchasesApr != null)
				return false;
		} else if (!purchasesApr.equals(other.purchasesApr))
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
		return "LocAccount [accountId=" + accountId + ", account=" + account + ", balanceAsOf=" + balanceAsOf
				+ ", creditLine=" + creditLine + ", availableCredit=" + availableCredit + ", nextPaymentAmount="
				+ nextPaymentAmount + ", nextPaymentDate=" + nextPaymentDate + ", principalBalance=" + principalBalance
				+ ", currentBalance=" + currentBalance + ", minimumPaymentAmount=" + minimumPaymentAmount
				+ ", lastPaymentAmount=" + lastPaymentAmount + ", lastPaymentDate=" + lastPaymentDate
				+ ", pastDueAmount=" + pastDueAmount + ", lastStmtBalance=" + lastStmtBalance + ", lastStmtDate="
				+ lastStmtDate + ", pointsAccrued=" + pointsAccrued + ", currentRewardsBalance=" + currentRewardsBalance
				+ ", pointsRedeemed=" + pointsRedeemed + ", purchasesApr=" + purchasesApr + ", advancesApr="
				+ advancesApr + ", cashAdvanceLimit=" + cashAdvanceLimit + ", availableCash=" + availableCash
				+ ", financeCharges=" + financeCharges + ", transactions=" + transactions + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(LocAccount.class);

	public LocAccount getLocAccount(String accountId, LocalDate startTime, LocalDate endTime) throws FDXException {
		try {
			template = ConnectionConfigApi46.getTemplate();
			SqlParameterSource parameters = new MapSqlParameterSource("accountId", accountId);
			Account account = new Account();
			LocAccount locAccount = template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".locaccount where accountid in (:accountId)", parameters,
					new LocAccountsRowMapper());
			List<LocTransaction> locTransactionListNew = locAccount.getTransactions();
			List<LocTransaction> locTransactionList = new ArrayList<>();
			LocTransaction locTransaction = new LocTransaction();
			account = (Account) account.getAccount(accountId, "details");
//		TransactionList Starts
			if (locTransactionListNew != null) {
				try {
					for (LocTransaction locTransactionIterator : locTransactionListNew) {
						locTransaction = locTransaction.getLocTransactions(locAccount.getAccountId(),
								locTransactionIterator.getLocTransactionId(), startTime, endTime);
						locTransactionList.add(locTransaction);
					}
				} catch (EmptyResultDataAccessException | FDXException e) {
					// Ignore if no loc transactions found
					log.warn("LocTransaction details not found for accountid: " + locAccount.getAccountId()
							+ "and transactionId: " + locAccount.getTransactions(), e.getMessage());
				}
			}
			locAccount.setTransactions(locTransactionList);
//		TransactionList Ends
			locAccount.setAccount(account);
			return locAccount;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("LocAccount : ", e);
			throw new FDXException(e,500);
		}
	}

	public Map<String, Object> postLocAccount(String accountId) throws FDXException {
		KeyHolder keyHolder = new GeneratedKeyHolder();
		try {
			template = ConnectionConfigApi46.getTemplate();
			List<Integer> locTransactionArray = null;
			Integer[] locTransactionArrayKeyList = new Integer[locTransactionId.size()];
			int i = 0;
			for (Integer locTransactionIterator : locTransactionId) {
				locTransactionArrayKeyList[i++] = locTransactionIterator;
			}
			locTransactionArray = Arrays.asList(locTransactionArrayKeyList);
			SqlParameterSource parameters = new MapSqlParameterSource("paymentId", null);
			int count = template.update("update "+ DeveloperContext.getDeveloperSchema() +".LocAccount set balanceAsOf='" + balanceAsOf
					+ "',currentBalance=" + currentBalance + ",locTransactionId=array" + locTransactionArray
					+ ",availablecash=" + availableCash + " where accountId ='" + accountId + "'", parameters,
					keyHolder);
		} catch (Exception e) {
			log.error("LocAccount : ", e);
			throw new FDXException(e,500);
		}
		return keyHolder.getKeys();
	}

	public LocAccount getLocAmount(String accountId, LocalDate startTime, LocalDate endTime) throws FDXException {
		try {

			template = ConnectionConfigApi46.getTemplate();

			SqlParameterSource parameters = new MapSqlParameterSource("accountId", accountId);
			Account account = new Account();
			LocAccount locAccount = template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".locaccount where accountid in (:accountId)", parameters,
					new LocAccountsRowMapper());

			return locAccount;
		} catch (Exception e) {
			log.error("LocAccount : ", e);
			throw new FDXException(e,500);
		}

	}

	public LocAccount getLocAccount(String accountId) throws Exception {
		try {
			SqlParameterSource parameters = new MapSqlParameterSource("accountIds", accountId);
			template = ConnectionConfigApi46.getTemplate();
			Account account = new Account();
			LocAccount locAccount = template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".locAccount where accountid in (:accountIds)", parameters,
					new LocAccountsRowMapper());
			return locAccount;
		} catch (Exception e) {
			if (!(e instanceof FDXException))
				log.error("LocAccount : ", e);
			throw new FDXException(e,"LocAccount :: " + e.getMessage());
		}
	}

	public LocAccount getLocAccount(String accountId, LocalDate startTime, LocalDate endTime, String resultType)
			throws FDXException {
		Account account = new Account();
		if (resultType.equals("details")) {
			return getLocAccount(accountId, startTime, endTime);
		} else {
			LocAccount locAccount = new LocAccount();
			locAccount.account = (Account) account.getAccount(accountId, resultType);
			return locAccount;
		}
	}
}
