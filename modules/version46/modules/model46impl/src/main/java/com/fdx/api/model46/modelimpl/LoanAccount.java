package com.fdx.api.model46.modelimpl;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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

import com.fdx.api.model46.config.ConnectionConfigApi46;
import com.fdx.api.model46.mapper.LoanAccountsRowMapper;

import io.swagger.annotations.ApiModel;

/**
 * A loan account type
 */
@ApiModel(description = "A loan account type")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class LoanAccount {

	NamedParameterJdbcTemplate template;

	@JsonIgnore
	private String accountId;

	@JsonUnwrapped
	private Account account;

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@JsonProperty("balanceAsOf")
	@JsonFormat(shape = JsonFormat.Shape.STRING, lenient = OptBoolean.FALSE)
	private java.sql.Timestamp balanceAsOf;

	@JsonProperty("principalBalance")
	private BigDecimal principalBalance;

	@JsonProperty("escrowBalance")
	private BigDecimal escrowBalance;

	@JsonProperty("originalPrincipal")
	private BigDecimal originalPrincipal;

	@JsonProperty("originatingDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, lenient = OptBoolean.FALSE)
	private java.sql.Timestamp originatingDate;

	@JsonProperty("loanTerm")
	private Integer loanTerm;

	@JsonProperty("totalNumberOfPayments")
	private Integer totalNumberOfPayments;

	@JsonProperty("nextPaymentAmount")
	private BigDecimal nextPaymentAmount;

	@JsonProperty("nextPaymentDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, lenient = OptBoolean.FALSE)
	private java.sql.Timestamp nextPaymentDate;

	@JsonProperty("paymentFrequency")
	private PaymentFrequency paymentFrequency;

	@JsonProperty("compoundingPeriod")
	private CompoundingPeriod compoundingPeriod;

	@JsonProperty("payOffAmount")
	private BigDecimal payOffAmount;

	@JsonProperty("lastPaymentAmount")
	private BigDecimal lastPaymentAmount;

	@JsonProperty("lastPaymentDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, lenient = OptBoolean.FALSE)
	private java.sql.Timestamp lastPaymentDate;

	@JsonProperty("maturityDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, lenient = OptBoolean.FALSE)
	private java.sql.Timestamp maturityDate;

	@JsonProperty("interestPaidYearToDate")
	private BigDecimal interestPaidYearToDate;

	@JsonProperty("transactions")
	@Valid
	private List<LoanTransaction> transactions = null;

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

	public BigDecimal getPrincipalBalance() {
		return principalBalance;
	}

	public void setPrincipalBalance(BigDecimal principalBalance) {
		this.principalBalance = principalBalance;
	}

	public BigDecimal getEscrowBalance() {
		return escrowBalance;
	}

	public void setEscrowBalance(BigDecimal escrowBalance) {
		this.escrowBalance = escrowBalance;
	}

	public BigDecimal getOriginalPrincipal() {
		return originalPrincipal;
	}

	public void setOriginalPrincipal(BigDecimal originalPrincipal) {
		this.originalPrincipal = originalPrincipal;
	}

	public java.sql.Timestamp getOriginatingDate() {
		return originatingDate;
	}

	public void setOriginatingDate(java.sql.Timestamp originatingDate) {
		this.originatingDate = originatingDate;
	}

	public Integer getLoanTerm() {
		return loanTerm;
	}

	public void setLoanTerm(Integer loanTerm) {
		this.loanTerm = loanTerm;
	}

	public Integer getTotalNumberOfPayments() {
		return totalNumberOfPayments;
	}

	public void setTotalNumberOfPayments(Integer totalNumberOfPayments) {
		this.totalNumberOfPayments = totalNumberOfPayments;
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

	public PaymentFrequency getPaymentFrequency() {
		return paymentFrequency;
	}

	public void setPaymentFrequency(PaymentFrequency paymentFrequency) {
		this.paymentFrequency = paymentFrequency;
	}

	public CompoundingPeriod getCompoundingPeriod() {
		return compoundingPeriod;
	}

	public void setCompoundingPeriod(CompoundingPeriod compoundingPeriod) {
		this.compoundingPeriod = compoundingPeriod;
	}

	public BigDecimal getPayOffAmount() {
		return payOffAmount;
	}

	public void setPayOffAmount(BigDecimal payOffAmount) {
		this.payOffAmount = payOffAmount;
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

	public java.sql.Timestamp getMaturityDate() {
		return maturityDate;
	}

	public void setMaturityDate(java.sql.Timestamp maturityDate) {
		this.maturityDate = maturityDate;
	}

	public BigDecimal getInterestPaidYearToDate() {
		return interestPaidYearToDate;
	}

	public void setInterestPaidYearToDate(BigDecimal interestPaidYearToDate) {
		this.interestPaidYearToDate = interestPaidYearToDate;
	}

	public List<LoanTransaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<LoanTransaction> transactions) {
		this.transactions = transactions;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((account == null) ? 0 : account.hashCode());
		result = prime * result + ((accountId == null) ? 0 : accountId.hashCode());
		result = prime * result + ((balanceAsOf == null) ? 0 : balanceAsOf.hashCode());
		result = prime * result + ((compoundingPeriod == null) ? 0 : compoundingPeriod.hashCode());
		result = prime * result + ((escrowBalance == null) ? 0 : escrowBalance.hashCode());
		result = prime * result + ((interestPaidYearToDate == null) ? 0 : interestPaidYearToDate.hashCode());
		result = prime * result + ((lastPaymentAmount == null) ? 0 : lastPaymentAmount.hashCode());
		result = prime * result + ((lastPaymentDate == null) ? 0 : lastPaymentDate.hashCode());
		result = prime * result + ((loanTerm == null) ? 0 : loanTerm.hashCode());
		result = prime * result + ((maturityDate == null) ? 0 : maturityDate.hashCode());
		result = prime * result + ((nextPaymentAmount == null) ? 0 : nextPaymentAmount.hashCode());
		result = prime * result + ((nextPaymentDate == null) ? 0 : nextPaymentDate.hashCode());
		result = prime * result + ((originalPrincipal == null) ? 0 : originalPrincipal.hashCode());
		result = prime * result + ((originatingDate == null) ? 0 : originatingDate.hashCode());
		result = prime * result + ((payOffAmount == null) ? 0 : payOffAmount.hashCode());
		result = prime * result + ((paymentFrequency == null) ? 0 : paymentFrequency.hashCode());
		result = prime * result + ((principalBalance == null) ? 0 : principalBalance.hashCode());
		result = prime * result + ((totalNumberOfPayments == null) ? 0 : totalNumberOfPayments.hashCode());
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
		LoanAccount other = (LoanAccount) obj;
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
		if (balanceAsOf == null) {
			if (other.balanceAsOf != null)
				return false;
		} else if (!balanceAsOf.equals(other.balanceAsOf))
			return false;
		if (compoundingPeriod != other.compoundingPeriod)
			return false;
		if (escrowBalance == null) {
			if (other.escrowBalance != null)
				return false;
		} else if (!escrowBalance.equals(other.escrowBalance))
			return false;
		if (interestPaidYearToDate == null) {
			if (other.interestPaidYearToDate != null)
				return false;
		} else if (!interestPaidYearToDate.equals(other.interestPaidYearToDate))
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
		if (loanTerm == null) {
			if (other.loanTerm != null)
				return false;
		} else if (!loanTerm.equals(other.loanTerm))
			return false;
		if (maturityDate == null) {
			if (other.maturityDate != null)
				return false;
		} else if (!maturityDate.equals(other.maturityDate))
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
		if (originalPrincipal == null) {
			if (other.originalPrincipal != null)
				return false;
		} else if (!originalPrincipal.equals(other.originalPrincipal))
			return false;
		if (originatingDate == null) {
			if (other.originatingDate != null)
				return false;
		} else if (!originatingDate.equals(other.originatingDate))
			return false;
		if (payOffAmount == null) {
			if (other.payOffAmount != null)
				return false;
		} else if (!payOffAmount.equals(other.payOffAmount))
			return false;
		if (paymentFrequency != other.paymentFrequency)
			return false;
		if (principalBalance == null) {
			if (other.principalBalance != null)
				return false;
		} else if (!principalBalance.equals(other.principalBalance))
			return false;
		if (totalNumberOfPayments == null) {
			if (other.totalNumberOfPayments != null)
				return false;
		} else if (!totalNumberOfPayments.equals(other.totalNumberOfPayments))
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
		return "LoanAccount [accountId=" + accountId + ", account=" + account + ", balanceAsOf=" + balanceAsOf
				+ ", principalBalance=" + principalBalance + ", escrowBalance=" + escrowBalance + ", originalPrincipal="
				+ originalPrincipal + ", originatingDate=" + originatingDate + ", loanTerm=" + loanTerm
				+ ", totalNumberOfPayments=" + totalNumberOfPayments + ", nextPaymentAmount=" + nextPaymentAmount
				+ ", nextPaymentDate=" + nextPaymentDate + ", paymentFrequency=" + paymentFrequency
				+ ", compoundingPeriod=" + compoundingPeriod + ", payOffAmount=" + payOffAmount + ", lastPaymentAmount="
				+ lastPaymentAmount + ", lastPaymentDate=" + lastPaymentDate + ", maturityDate=" + maturityDate
				+ ", interestPaidYearToDate=" + interestPaidYearToDate + ", transactions=" + transactions + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(LoanAccount.class);

	public LoanAccount getLoanAccount(String accountId, LocalDate startTime, LocalDate endTime) throws FDXException {
		try {
			template = ConnectionConfigApi46.getTemplate();
			SqlParameterSource parameters = new MapSqlParameterSource("accountId", accountId);
			Account account = new Account();
			LoanAccount loanAccount;
			try {
				loanAccount = template.queryForObject(
						"select * from "+ DeveloperContext.getDeveloperSchema() +".loanaccount where accountid in (:accountId)", parameters,
						new LoanAccountsRowMapper());
			} catch (EmptyResultDataAccessException e) {
				throw new FDXException("Loan Account not found", 0);
			}
			List<LoanTransaction> loanTransactionListNew = loanAccount.getTransactions();
			List<LoanTransaction> loanTransactionList = new ArrayList<>();
			LoanTransaction loanTransaction = new LoanTransaction();
			account = (Account) account.getAccount(accountId,"details");
//		TransactionList Starts
			if (loanTransactionListNew != null) {
				try {
					for (LoanTransaction loanTransactionIterator : loanTransactionListNew) {
						loanTransaction = loanTransaction.getLoanTransactions(loanAccount.getAccountId(),
								loanTransactionIterator.getLoantransactionid(), startTime, endTime);
						loanTransactionList.add(loanTransaction);

					}
				} catch (EmptyResultDataAccessException | FDXException e) {
					// Ignore if no loan transactions found
					log.warn("LoanTransaction details not found for accountid: " + loanAccount.getAccountId(), e.getMessage());
				}
			}
			loanAccount.setTransactions(loanTransactionList);
//		TransactionList Ends
			loanAccount.setAccount(account);
			return loanAccount;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("LoanAccount : ", e);
			throw new FDXException(e,500);
		}
	}

	public LoanAccount getLoanAccount(String accountId, LocalDate startTime, LocalDate endTime, String resultType) throws FDXException {
		Account account = new Account();
		if (resultType.equals("details")) {
			return getLoanAccount(accountId, startTime, endTime);
		} else {
			LoanAccount loanAccount = new LoanAccount();
			loanAccount.account = (Account) account.getAccount(accountId, resultType);
			return loanAccount;
		}
	}
}
