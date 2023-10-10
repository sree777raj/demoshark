package com.fdx.api.model46.modelimpl;

import com.fasterxml.jackson.annotation.*;
import com.fdx.common.exception.FDXException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import com.fdx.common.exception.FDXException;

import com.fdx.common.util.DeveloperContext;
import com.fdx.common.util.FdxConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.fdx.api.model46.config.ConnectionConfigApi46;
import com.fdx.api.model46.mapper.InsuranceAccountsRowMapper;

import io.swagger.annotations.ApiModel;

/**
 * An insurance account type and properties such as category, premium, and
 * payment term information
 */
@ApiModel(description = "An insurance account type and properties such as category, premium, and payment term information")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class InsuranceAccount {

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

	public enum AccountCategoryEnum {
		DEPOSIT_ACCOUNT("DEPOSIT_ACCOUNT"),

		INVESTMENT_ACCOUNT("INVESTMENT_ACCOUNT"),

		LOAN_ACCOUNT("LOAN_ACCOUNT"),

		LOC_ACCOUNT("LOC_ACCOUNT"),

		INSURANCE_ACCOUNT("INSURANCE_ACCOUNT");

		private String value;

		AccountCategoryEnum(String value) {
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
		public static AccountCategoryEnum fromValue(String value) {
			for (AccountCategoryEnum b : AccountCategoryEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'",401));
		}
	}

	@JsonProperty("accountCategory")
	private AccountCategoryEnum accountCategory;

	@JsonProperty("policyPremium")
	private BigDecimal policyPremium;

	/**
	 * The payment term for the premium
	 */
	public enum PolicyPremiumTermEnum {
		MONTHLY("MONTHLY"),

		ANNUAL("ANNUAL");

		private String value;

		PolicyPremiumTermEnum(String value) {
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
		public static PolicyPremiumTermEnum fromValue(String value) {
			for (PolicyPremiumTermEnum b : PolicyPremiumTermEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'",401));
		}
	}

	@JsonProperty("policyPremiumTerm")
	private PolicyPremiumTermEnum policyPremiumTerm;

	@JsonProperty("policyStartDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, lenient = OptBoolean.FALSE)
	private java.sql.Timestamp policyStartDate;

	@JsonProperty("policyEndDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, lenient = OptBoolean.FALSE)
	private java.sql.Timestamp policyEndDate;

	@JsonProperty("policyCoverageAmount")
	private BigDecimal policyCoverageAmount;

	@JsonProperty("transactions")
	@Valid
	private List<InsuranceTransaction> transactions = null;

	@JsonProperty("bills")
	@Valid
	private List<Bills> bills = null;

	public InsuranceAccount accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public AccountCategoryEnum getAccountCategory() {
		return accountCategory;
	}

	public void setAccountCategory(AccountCategoryEnum accountCategory) {
		this.accountCategory = accountCategory;
	}

	public BigDecimal getPolicyPremium() {
		return policyPremium;
	}

	public void setPolicyPremium(BigDecimal policyPremium) {
		this.policyPremium = policyPremium;
	}

	public PolicyPremiumTermEnum getPolicyPremiumTerm() {
		return policyPremiumTerm;
	}

	public void setPolicyPremiumTerm(PolicyPremiumTermEnum policyPremiumTerm) {
		this.policyPremiumTerm = policyPremiumTerm;
	}

	public java.sql.Timestamp getPolicyStartDate() {
		return policyStartDate;
	}

	public void setPolicyStartDate(java.sql.Timestamp policyStartDate) {
		this.policyStartDate = policyStartDate;
	}

	public java.sql.Timestamp getPolicyEndDate() {
		return policyEndDate;
	}

	public void setPolicyEndDate(java.sql.Timestamp policyEndDate) {
		this.policyEndDate = policyEndDate;
	}

	public BigDecimal getPolicyCoverageAmount() {
		return policyCoverageAmount;
	}

	public void setPolicyCoverageAmount(BigDecimal policyCoverageAmount) {
		this.policyCoverageAmount = policyCoverageAmount;
	}

	public List<InsuranceTransaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<InsuranceTransaction> transactions) {
		this.transactions = transactions;
	}

	public List<Bills> getBills() {
		return bills;
	}

	public void setBills(List<Bills> bills) {
		this.bills = bills;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((account == null) ? 0 : account.hashCode());
		result = prime * result + ((accountCategory == null) ? 0 : accountCategory.hashCode());
		result = prime * result + ((accountId == null) ? 0 : accountId.hashCode());
		result = prime * result + ((bills == null) ? 0 : bills.hashCode());
		result = prime * result + ((policyCoverageAmount == null) ? 0 : policyCoverageAmount.hashCode());
		result = prime * result + ((policyEndDate == null) ? 0 : policyEndDate.hashCode());
		result = prime * result + ((policyPremium == null) ? 0 : policyPremium.hashCode());
		result = prime * result + ((policyPremiumTerm == null) ? 0 : policyPremiumTerm.hashCode());
		result = prime * result + ((policyStartDate == null) ? 0 : policyStartDate.hashCode());
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
		InsuranceAccount other = (InsuranceAccount) obj;
		if (account == null) {
			if (other.account != null)
				return false;
		} else if (!account.equals(other.account))
			return false;
		if (accountCategory != other.accountCategory)
			return false;
		if (accountId == null) {
			if (other.accountId != null)
				return false;
		} else if (!accountId.equals(other.accountId))
			return false;
		if (bills == null) {
			if (other.bills != null)
				return false;
		} else if (!bills.equals(other.bills))
			return false;
		if (policyCoverageAmount == null) {
			if (other.policyCoverageAmount != null)
				return false;
		} else if (!policyCoverageAmount.equals(other.policyCoverageAmount))
			return false;
		if (policyEndDate == null) {
			if (other.policyEndDate != null)
				return false;
		} else if (!policyEndDate.equals(other.policyEndDate))
			return false;
		if (policyPremium == null) {
			if (other.policyPremium != null)
				return false;
		} else if (!policyPremium.equals(other.policyPremium))
			return false;
		if (policyPremiumTerm != other.policyPremiumTerm)
			return false;
		if (policyStartDate == null) {
			if (other.policyStartDate != null)
				return false;
		} else if (!policyStartDate.equals(other.policyStartDate))
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
		return "InsuranceAccount [accountId=" + accountId + ", account=" + account + ", accountCategory="
				+ accountCategory + ", policyPremium=" + policyPremium + ", policyPremiumTerm=" + policyPremiumTerm
				+ ", policyStartDate=" + policyStartDate + ", policyEndDate=" + policyEndDate
				+ ", policyCoverageAmount=" + policyCoverageAmount + ", transactions=" + transactions + ", bills="
				+ bills + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(InsuranceAccount.class);

	public InsuranceAccount getInsuranceAccount(String accountId, LocalDate startTime, LocalDate endTime)
			throws FDXException {
		try {
			template = ConnectionConfigApi46.getTemplate();
			SqlParameterSource parameters = new MapSqlParameterSource("accountId", accountId);
			Account account = new Account();
			InsuranceAccount insuranceAccount;
			try {
				insuranceAccount = template.queryForObject(
						"select * from "+ DeveloperContext.getDeveloperSchema() +".insuranceaccount where accountid in (:accountId)", parameters,
						new InsuranceAccountsRowMapper());
			} catch (EmptyResultDataAccessException e) {
				throw new FDXException("Insurance Account not found", 0);
			}
			List<InsuranceTransaction> insuranceTransactionListNew = insuranceAccount.getTransactions();
			List<InsuranceTransaction> insuranceTransactionList = new ArrayList<>();
			InsuranceTransaction insuranceTransaction = new InsuranceTransaction();
			account = (Account) account.getAccount(accountId, "details");

//		TransactionList Starts
			if (insuranceTransactionListNew != null) {
				try {
					for (InsuranceTransaction insuranceTransactionIterator : insuranceTransactionListNew) {
						insuranceTransaction = insuranceTransaction.getInsuranceTransactions(
								insuranceAccount.getAccountId(),
								insuranceTransactionIterator.getInsuranceTransactionsId(), startTime, endTime);
						insuranceTransactionList.add(insuranceTransaction);
					}
				} catch (EmptyResultDataAccessException | FDXException e) {
					// Ignore if no insurance transactions found
					log.warn("Insurance Transaction details not found for accountid: " + account.getAccountId(), e.getMessage());
				}
			}
			insuranceAccount.setTransactions(insuranceTransactionList);
//		TransactionList Ends

//		Bill Start
			List<Bills> billList = insuranceAccount.getBills();
			List<Bills> billListNew = new ArrayList<>();
			Bills bills = new Bills();
			if (billList != null) {
				for (Bills billsIterator : billList) {
					bills = bills.getBills(billsIterator.getBillid());
					billListNew.add(bills);
				}
				insuranceAccount.setBills(billListNew);
			}
//		Bill End 
			insuranceAccount.setAccount(account);
			return insuranceAccount;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("InsuranceAccount : ", e);
			throw new FDXException(e, FdxConstants.HTTP_ERROR_CODE_500);
		}
	}

	public InsuranceAccount getInsuranceAccount(String accountId, LocalDate startTime, LocalDate endTime,
			String resultType) throws FDXException {
		try {
			Account account = new Account();
			if (resultType.equals("details")) {
				return getInsuranceAccount(accountId, startTime, endTime);
			} else {
				InsuranceAccount insuranceAccount = new InsuranceAccount();
				insuranceAccount.account = (Account) account.getAccount(accountId, resultType);
				return insuranceAccount;
			}
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("InsuranceAccount : ", e);
			throw new FDXException(FdxConstants.HTTP_ERROR_CODE_500);
		}
	}
}