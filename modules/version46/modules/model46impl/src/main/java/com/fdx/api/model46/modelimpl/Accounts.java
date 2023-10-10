package com.fdx.api.model46.modelimpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

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
import com.fdx.api.model46.config.ConnectionConfigApi46;
import com.fdx.api.model46.mapper.AccountsRowMapper;
import com.fdx.api.model46.model.Accounts46;

import io.swagger.annotations.ApiModel;

/**
 * An optionally paginated array of accounts
 */
@ApiModel(description = "An optionally paginated array of accounts")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
@Repository("Accounts46")
public class Accounts<T> implements Accounts46<T> {

	NamedParameterJdbcTemplate template;

	@JsonProperty("accountid")
	private String accountid;

	@JsonProperty("accounttype")
	private String accounttype;

	@JsonUnwrapped
	private PaginatedArray paginatedArray;

	private static final Logger logger = LoggerFactory.getLogger(Accounts.class);

	public PaginatedArray getPaginatedArray(String query, String resultType, String uriPath, int limit, String offset,
			int count) throws Exception {
		PaginatedArray paginatedArray = new PaginatedArray();
		paginatedArray = paginatedArray.getPaginatedResult(query, uriPath, limit, offset, count);
		return paginatedArray;
	}

	public void setPaginatedArray(PaginatedArray paginatedArray) {
		this.paginatedArray = paginatedArray;
	}

	public List<AccountWithDetails> getAccountWithDetails() {
		return accountWithDetails;
	}

	public void setAccountWithDetails(List<AccountWithDetails> accountWithDetails) {
		this.accountWithDetails = accountWithDetails;
	}

	@JsonProperty("accounts")
	@Valid
	private List<AccountWithDetails> accountWithDetails = null;

	public String getAccountid() {
		return accountid;
	}

	public void setAccountid(String accountid) {
		this.accountid = accountid;
	}

	public String getAccounttype() {
		return accounttype;
	}

	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}

	public Accounts accounts(List<AccountWithDetails> accounts) {
		this.accountWithDetails = accounts;
		return this;
	}

	public Accounts addAccountsItem(AccountWithDetails accountsItem) {
		if (this.accountWithDetails == null) {
			this.accountWithDetails = new ArrayList<>();
		}
		this.accountWithDetails.add(accountsItem);
		return this;
	}

	public void setAccounts(List<AccountWithDetails> accounts) {
		this.accountWithDetails = accounts;
	}

	public Accounts() {

	}

	private String toIndentedString(Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((paginatedArray == null) ? 0 : paginatedArray.hashCode());
		result = prime * result + ((accountWithDetails == null) ? 0 : accountWithDetails.hashCode());
		result = prime * result + ((accountid == null) ? 0 : accountid.hashCode());
		result = prime * result + ((accounttype == null) ? 0 : accounttype.hashCode());
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
		Accounts other = (Accounts) obj;
		if (paginatedArray == null) {
			if (other.paginatedArray != null)
				return false;
		} else if (!paginatedArray.equals(other.paginatedArray))
			return false;
		if (accountWithDetails == null) {
			if (other.accountWithDetails != null)
				return false;
		} else if (!accountWithDetails.equals(other.accountWithDetails))
			return false;
		if (accountid == null) {
			if (other.accountid != null)
				return false;
		} else if (!accountid.equals(other.accountid))
			return false;
		if (accounttype == null) {
			if (other.accounttype != null)
				return false;
		} else if (!accounttype.equals(other.accounttype))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Accounts [accountid=" + accountid + ", accounttype=" + accounttype + ", paginatedArray="
				+ paginatedArray + ", accountWithDetails=" + accountWithDetails + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(Accounts.class);

	@Override
	public T getAccounts(List<String> accountIds, int limit, String offset, String resultType, String uriPath,
			LocalDate startTime, LocalDate endTime, String query, boolean isDateParamPassed) throws FDXException {
		try {
			Accounts accounts = new Accounts();
			Transaction transaction = new Transaction();
			logger.debug("Get Accounts for limit: " + limit + " offset: " + offset);
			template = ConnectionConfigApi46.getTemplate();
			List<String> accountIdList = null;
			// search for transactions with account ids with date
			if (isDateParamPassed) {
				accountIdList = transaction.getUniqueAccountIdsFromTransaction(accountIds, startTime, endTime, limit, offset);
			} else
				accountIdList = getAccountIdsFromAccounts(accountIds, limit, offset);
			if (accountIdList.isEmpty())
				throw new FDXException(1107);
			List<AccountWithDetails> accountWithdetailslist = new ArrayList<AccountWithDetails>();
			int count = getAccountsCount(accountIds);
			logger.debug("Total count of accounts: " + count);
			for (String accountId : accountIdList) {
				AccountWithDetails accountWithDetails = new AccountWithDetails();
				accountWithDetails = accountWithDetails.getAccount(accountId, resultType, startTime, endTime);
				accountWithdetailslist.add(accountWithDetails);
			}
			accounts.setAccountWithDetails(accountWithdetailslist);
			PaginatedArray paginatedArray = accounts.getPaginatedArray(query, resultType, uriPath, limit, offset, count);
			accounts.setPaginatedArray(paginatedArray);
			return (T) accounts;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Accounts : ", e);
			throw new FDXException(e,500);
		}
	}

	public List<String> getAccountIdsFromAccounts(List<String> accountIds, int limit, String offset) {
		template = ConnectionConfigApi46.getTemplate();
		if (accountIds != null)
			return template.queryForList(
					"select accountid from "+ DeveloperContext.getDeveloperSchema() +".accounts where accountid in (:accountId) order by accountid limit " + limit + " offset " + offset,
					new MapSqlParameterSource().addValue("accountId", accountIds), String.class);
		else
			return template.queryForList(
					"select accountid from "+ DeveloperContext.getDeveloperSchema() +".accounts order by accountid limit " + limit + " offset " + offset,
					new MapSqlParameterSource(), String.class);
	}

	public int getAccountsCount(List<String> accountIds) throws FDXException {
		SqlParameterSource parameters = new MapSqlParameterSource("accountIds", accountIds);
		int count = 0;
		try {
			if (accountIds != null) {
				count = template.queryForObject(
						"select count(*) from "+ DeveloperContext.getDeveloperSchema() +".accounts where accountid in (:accountIds)", parameters,
						Integer.class);
			} else
				count = template.queryForObject("select count(*) from "+ DeveloperContext.getDeveloperSchema() +".accounts", parameters, Integer.class);
		} catch (Exception e) {
			log.error("Accounts : ", e);
			throw new FDXException(e,500);
		}
		return count;
	}

	public String getAccountsType(String accountId) throws FDXException {
		try {
		template = ConnectionConfigApi46.getTemplate();
		SqlParameterSource parameters = new MapSqlParameterSource("accountId", accountId);
		return template.queryForObject("select accountentitytype from "+ DeveloperContext.getDeveloperSchema() +".accounts where accountId in (:accountId)",
				new MapSqlParameterSource().addValue("accountId", accountId), String.class);
		} catch (EmptyResultDataAccessException e) {
			throw new FDXException(e, 701);
		} catch (Exception e) {
			log.error("Accounts : ", e);
			throw new FDXException(e, 500);
		}
	}
}
