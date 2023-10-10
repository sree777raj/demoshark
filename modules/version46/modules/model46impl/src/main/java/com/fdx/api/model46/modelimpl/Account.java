package com.fdx.api.model46.modelimpl;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.*;
import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import com.fdx.common.util.FdxConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fdx.api.model46.config.ConnectionConfigApi46;
import com.fdx.api.model46.mapper.AccountRowMapper;
import com.fdx.api.model46.model.Account46;

import io.swagger.annotations.ApiModel;

/**
 * An abstract account entity that concrete account entities extend
 */
@ApiModel(description = "An abstract account entity that concrete account entities extend")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
@Repository("Account46")
public class Account<T> implements Account46<T> {

	NamedParameterJdbcTemplate template;

	public Account() {

	}

	@JsonIgnore
	private String accountId;

	@JsonIgnore
	private int contactId;

	@JsonUnwrapped
	private AccountDescriptor accountDescriptor;

	@JsonProperty("parentAccountId")
	private String parentAccountId;

	@JsonProperty("lineOfBusiness")
	private String lineOfBusiness;

	@JsonProperty("routingTransitNumber")
	private String routingTransitNumber;

	@JsonProperty("balanceType")
	private BalanceType balanceType;

	@JsonProperty("contact")
	private AccountContact contact;

	@JsonProperty("interestRate")
	private BigDecimal interestRate;

	@JsonProperty("interestRateType")
	private InterestRateType interestRateType;

	@JsonProperty("interestRateAsOf")
	@JsonFormat(shape = JsonFormat.Shape.STRING, lenient = OptBoolean.FALSE)
	private java.sql.Timestamp interestRateAsOf;

	@JsonProperty("priorInterestRate")
	private BigDecimal priorInterestRate;

	@JsonProperty("transferIn")
	@JsonInclude(Include.NON_NULL)
	private Boolean transferIn;

	@JsonProperty("transferOut")
	@JsonInclude(Include.NON_NULL)
	private Boolean transferOut;

	@JsonProperty("billPayStatus")
	private AccountBillPayStatus billPayStatus;

	@JsonProperty("micrNumber")
	private String micrNumber;

	@JsonProperty("lastActivityDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, lenient = OptBoolean.FALSE)
	private java.sql.Timestamp lastActivityDate;

	@JsonProperty("rewardProgramId")
	private String rewardProgramId;

	@JsonProperty("transactionsIncluded")
	@JsonInclude(Include.NON_NULL)
	private Boolean transactionsIncluded;

	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public AccountDescriptor getAccountDescriptor() {
		return accountDescriptor;
	}

	public void setAccountDescriptor(AccountDescriptor accountDescriptor) {
		this.accountDescriptor = accountDescriptor;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getParentAccountId() {
		return parentAccountId;
	}

	public void setParentAccountId(String parentAccountId) {
		this.parentAccountId = parentAccountId;
	}

	public String getLineOfBusiness() {
		return lineOfBusiness;
	}

	public void setLineOfBusiness(String lineOfBusiness) {
		this.lineOfBusiness = lineOfBusiness;
	}

	public String getRoutingTransitNumber() {
		return routingTransitNumber;
	}

	public void setRoutingTransitNumber(String routingTransitNumber) {
		this.routingTransitNumber = routingTransitNumber;
	}

	public BalanceType getBalanceType() {
		return balanceType;
	}

	public void setBalanceType(BalanceType balanceType) {
		this.balanceType = balanceType;
	}

	public AccountContact getContact() {
		return contact;
	}

	public void setContact(AccountContact contact) {
		this.contact = contact;
	}

	public BigDecimal getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(BigDecimal interestRate) {
		this.interestRate = interestRate;
	}

	public InterestRateType getInterestRateType() {
		return interestRateType;
	}

	public void setInterestRateType(InterestRateType interestRateType) {
		this.interestRateType = interestRateType;
	}

	public java.sql.Timestamp getInterestRateAsOf() {
		return interestRateAsOf;
	}

	public void setInterestRateAsOf(java.sql.Timestamp interestRateAsOf) {
		this.interestRateAsOf = interestRateAsOf;
	}

	public BigDecimal getPriorInterestRate() {
		return priorInterestRate;
	}

	public void setPriorInterestRate(BigDecimal priorInterestRate) {
		this.priorInterestRate = priorInterestRate;
	}

	public Boolean getTransferIn() {
		return transferIn;
	}

	public void setTransferIn(Boolean transferIn) {
		this.transferIn = transferIn;
	}

	public Boolean getTransferOut() {
		return transferOut;
	}

	public void setTransferOut(Boolean transferOut) {
		this.transferOut = transferOut;
	}

	public String getMicrNumber() {
		return micrNumber;
	}

	public void setMicrNumber(String micrNumber) {
		this.micrNumber = micrNumber;
	}

	public java.sql.Timestamp getLastActivityDate() {
		return lastActivityDate;
	}

	public void setLastActivityDate(java.sql.Timestamp lastActivityDate) {
		this.lastActivityDate = lastActivityDate;
	}

	public Boolean getTransactionsIncluded() {
		return transactionsIncluded;
	}

	public void setTransactionsIncluded(Boolean transactionsIncluded) {
		this.transactionsIncluded = transactionsIncluded;
	}

	public AccountBillPayStatus getBillPayStatus() {
		return billPayStatus;
	}

	public void setBillPayStatus(AccountBillPayStatus billPayStatus) {
		this.billPayStatus = billPayStatus;
	}

	public String getRewardProgramId() {
		return rewardProgramId;
	}

	public void setRewardProgramId(String rewardProgramId) {
		this.rewardProgramId = rewardProgramId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountDescriptor == null) ? 0 : accountDescriptor.hashCode());
		result = prime * result + ((accountId == null) ? 0 : accountId.hashCode());
		result = prime * result + ((balanceType == null) ? 0 : balanceType.hashCode());
		result = prime * result + ((billPayStatus == null) ? 0 : billPayStatus.hashCode());
		result = prime * result + ((contact == null) ? 0 : contact.hashCode());
		result = prime * result + ((interestRate == null) ? 0 : interestRate.hashCode());
		result = prime * result + ((interestRateAsOf == null) ? 0 : interestRateAsOf.hashCode());
		result = prime * result + ((interestRateType == null) ? 0 : interestRateType.hashCode());
		result = prime * result + ((lastActivityDate == null) ? 0 : lastActivityDate.hashCode());
		result = prime * result + ((lineOfBusiness == null) ? 0 : lineOfBusiness.hashCode());
		result = prime * result + ((micrNumber == null) ? 0 : micrNumber.hashCode());
		result = prime * result + ((parentAccountId == null) ? 0 : parentAccountId.hashCode());
		result = prime * result + ((priorInterestRate == null) ? 0 : priorInterestRate.hashCode());
		result = prime * result + ((rewardProgramId == null) ? 0 : rewardProgramId.hashCode());
		result = prime * result + ((routingTransitNumber == null) ? 0 : routingTransitNumber.hashCode());
		result = prime * result + ((transactionsIncluded == null) ? 0 : transactionsIncluded.hashCode());
		result = prime * result + ((transferIn == null) ? 0 : transferIn.hashCode());
		result = prime * result + ((transferOut == null) ? 0 : transferOut.hashCode());
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
		Account other = (Account) obj;
		if (accountDescriptor == null) {
			if (other.accountDescriptor != null)
				return false;
		} else if (!accountDescriptor.equals(other.accountDescriptor))
			return false;
		if (accountId == null) {
			if (other.accountId != null)
				return false;
		} else if (!accountId.equals(other.accountId))
			return false;
		if (balanceType != other.balanceType)
			return false;
		if (billPayStatus != other.billPayStatus)
			return false;
		if (contact == null) {
			if (other.contact != null)
				return false;
		} else if (!contact.equals(other.contact))
			return false;
		if (interestRate == null) {
			if (other.interestRate != null)
				return false;
		} else if (!interestRate.equals(other.interestRate))
			return false;
		if (interestRateAsOf == null) {
			if (other.interestRateAsOf != null)
				return false;
		} else if (!interestRateAsOf.equals(other.interestRateAsOf))
			return false;
		if (interestRateType != other.interestRateType)
			return false;
		if (lastActivityDate == null) {
			if (other.lastActivityDate != null)
				return false;
		} else if (!lastActivityDate.equals(other.lastActivityDate))
			return false;
		if (lineOfBusiness == null) {
			if (other.lineOfBusiness != null)
				return false;
		} else if (!lineOfBusiness.equals(other.lineOfBusiness))
			return false;
		if (micrNumber == null) {
			if (other.micrNumber != null)
				return false;
		} else if (!micrNumber.equals(other.micrNumber))
			return false;
		if (parentAccountId == null) {
			if (other.parentAccountId != null)
				return false;
		} else if (!parentAccountId.equals(other.parentAccountId))
			return false;
		if (priorInterestRate == null) {
			if (other.priorInterestRate != null)
				return false;
		} else if (!priorInterestRate.equals(other.priorInterestRate))
			return false;
		if (rewardProgramId == null) {
			if (other.rewardProgramId != null)
				return false;
		} else if (!rewardProgramId.equals(other.rewardProgramId))
			return false;
		if (routingTransitNumber == null) {
			if (other.routingTransitNumber != null)
				return false;
		} else if (!routingTransitNumber.equals(other.routingTransitNumber))
			return false;
		if (transactionsIncluded == null) {
			if (other.transactionsIncluded != null)
				return false;
		} else if (!transactionsIncluded.equals(other.transactionsIncluded))
			return false;
		if (transferIn == null) {
			if (other.transferIn != null)
				return false;
		} else if (!transferIn.equals(other.transferIn))
			return false;
		if (transferOut == null) {
			if (other.transferOut != null)
				return false;
		} else if (!transferOut.equals(other.transferOut))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", accountDescriptor=" + accountDescriptor + ", parentAccountId="
				+ parentAccountId + ", lineOfBusiness=" + lineOfBusiness + ", routingTransitNumber="
				+ routingTransitNumber + ", balanceType=" + balanceType + ", contact=" + contact + ", interestRate="
				+ interestRate + ", interestRateType=" + interestRateType + ", interestRateAsOf=" + interestRateAsOf
				+ ", priorInterestRate=" + priorInterestRate + ", transferIn=" + transferIn + ", transferOut="
				+ transferOut + ", billPayStatus=" + billPayStatus + ", micrNumber=" + micrNumber
				+ ", lastActivityDate=" + lastActivityDate + ", rewardProgramId=" + rewardProgramId
				+ ", transactionsIncluded=" + transactionsIncluded + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(Account.class);

	public T getAccount(String accountid, String resultType) throws FDXException {
		try {
			template = ConnectionConfigApi46.getTemplate();
			Account account = new Account();
			AccountDescriptor accountDescriptor = new AccountDescriptor();
			SqlParameterSource parameters = new MapSqlParameterSource("accountId", accountid);
			if (resultType.equals("details")) {
				try {
					if (accountid != null) {
						account = template.queryForObject("select * from "+ DeveloperContext.getDeveloperSchema() +".account where accountid in (:accountId)",
								parameters, new AccountRowMapper());
					}
				} catch (EmptyResultDataAccessException e) {
					throw new FDXException(e,701);
				}
				accountDescriptor = accountDescriptor.getAccountDescriptor(accountid);
				account.setContact((AccountContact) getAccountContact(accountid));
				account.setAccountDescriptor(accountDescriptor);
			} else {
				accountDescriptor = accountDescriptor.getAccountDescriptor(accountid);
				account.setAccountDescriptor(accountDescriptor);
			}
			return (T) account;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Account : ", e);
			throw new FDXException(e, FdxConstants.HTTP_ERROR_CODE_500);
		}
	}

	@Override
	public T getAccountContact(String accountid) throws FDXException {
		try {
			template = ConnectionConfigApi46.getTemplate();
			Account account = new Account();
			AccountContact accountContact = new AccountContact();
			SqlParameterSource parameters = new MapSqlParameterSource("accountId", accountid);
			if (accountid != null) {
				try {
					account = template.queryForObject("select * from "+ DeveloperContext.getDeveloperSchema() +".account where accountid in (:accountId)",
							parameters, new AccountRowMapper());
				} catch (EmptyResultDataAccessException e) {
					throw new FDXException(e,701);
				}
			}
			accountContact = accountContact.getAccountContact(account.getContactId());
			return (T) accountContact;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Account : ", e);
			throw new FDXException(e,FdxConstants.HTTP_ERROR_CODE_500);
		}
	}
}
