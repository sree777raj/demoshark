package com.fdx.api.model46.modelimpl;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.*;
import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.fdx.api.model46.config.ConnectionConfigApi46;
import com.fdx.api.model46.mapper.AnnuityAccountsRowMapper;

import io.swagger.annotations.ApiModel;

/**
 * An annuity account type
 */
@ApiModel(description = "An annuity account type")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
//@Component
public class AnnuityAccount {

	NamedParameterJdbcTemplate template;

	public AnnuityAccount() {
	}

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

	@JsonProperty("annuityProductType")
	private AnnuityProductType annuityProductType;

	@JsonProperty("annuityValueBasis")
	private AnnuityValueBasis annuityValueBasis;

	@JsonProperty("paymentAmount")
	private BigDecimal paymentAmount;

	@JsonProperty("paymentFrequency")
	private PaymentFrequency paymentFrequency;

	@JsonProperty("paymentStartDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, lenient = OptBoolean.FALSE)
	private java.sql.Timestamp paymentStartDate;

	@JsonProperty("paymentEndDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, lenient = OptBoolean.FALSE)
	private java.sql.Timestamp paymentEndDate;

	@JsonProperty("totalPaymentCount")
	private BigDecimal totalPaymentCount;

	@JsonProperty("netPresentValue")
	private BigDecimal netPresentValue;

	@JsonProperty("annualIncrease")
	private BigDecimal annualIncrease;

	@JsonProperty("annualIncreaseType")
	private AnnualIncreaseType annualIncreaseType;

	@JsonProperty("periodCertainGuarantee")
	private PeriodCertainGuarantee periodCertainGuarantee;

	public AnnuityAccount accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public AnnuityProductType getAnnuityProductType() {
		return annuityProductType;
	}

	public void setAnnuityProductType(AnnuityProductType annuityProductType) {
		this.annuityProductType = annuityProductType;
	}

	public AnnuityValueBasis getAnnuityValueBasis() {
		return annuityValueBasis;
	}

	public void setAnnuityValueBasis(AnnuityValueBasis annuityValueBasis) {
		this.annuityValueBasis = annuityValueBasis;
	}

	public BigDecimal getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(BigDecimal paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public PaymentFrequency getPaymentFrequency() {
		return paymentFrequency;
	}

	public void setPaymentFrequency(PaymentFrequency paymentFrequency) {
		this.paymentFrequency = paymentFrequency;
	}

	public java.sql.Timestamp getPaymentStartDate() {
		return paymentStartDate;
	}

	public void setPaymentStartDate(java.sql.Timestamp paymentStartDate) {
		this.paymentStartDate = paymentStartDate;
	}

	public java.sql.Timestamp getPaymentEndDate() {
		return paymentEndDate;
	}

	public void setPaymentEndDate(java.sql.Timestamp paymentEndDate) {
		this.paymentEndDate = paymentEndDate;
	}

	public BigDecimal getTotalPaymentCount() {
		return totalPaymentCount;
	}

	public void setTotalPaymentCount(BigDecimal totalPaymentCount) {
		this.totalPaymentCount = totalPaymentCount;
	}

	public BigDecimal getNetPresentValue() {
		return netPresentValue;
	}

	public void setNetPresentValue(BigDecimal netPresentValue) {
		this.netPresentValue = netPresentValue;
	}

	public BigDecimal getAnnualIncrease() {
		return annualIncrease;
	}

	public void setAnnualIncrease(BigDecimal annualIncrease) {
		this.annualIncrease = annualIncrease;
	}

	public AnnualIncreaseType getAnnualIncreaseType() {
		return annualIncreaseType;
	}

	public void setAnnualIncreaseType(AnnualIncreaseType annualIncreaseType) {
		this.annualIncreaseType = annualIncreaseType;
	}

	public PeriodCertainGuarantee getPeriodCertainGuarantee() {
		return periodCertainGuarantee;
	}

	public void setPeriodCertainGuarantee(PeriodCertainGuarantee periodCertainGuarantee) {
		this.periodCertainGuarantee = periodCertainGuarantee;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((account == null) ? 0 : account.hashCode());
		result = prime * result + ((accountId == null) ? 0 : accountId.hashCode());
		result = prime * result + ((annualIncrease == null) ? 0 : annualIncrease.hashCode());
		result = prime * result + ((annualIncreaseType == null) ? 0 : annualIncreaseType.hashCode());
		result = prime * result + ((annuityProductType == null) ? 0 : annuityProductType.hashCode());
		result = prime * result + ((annuityValueBasis == null) ? 0 : annuityValueBasis.hashCode());
		result = prime * result + ((netPresentValue == null) ? 0 : netPresentValue.hashCode());
		result = prime * result + ((paymentAmount == null) ? 0 : paymentAmount.hashCode());
		result = prime * result + ((paymentEndDate == null) ? 0 : paymentEndDate.hashCode());
		result = prime * result + ((paymentFrequency == null) ? 0 : paymentFrequency.hashCode());
		result = prime * result + ((paymentStartDate == null) ? 0 : paymentStartDate.hashCode());
		result = prime * result + ((periodCertainGuarantee == null) ? 0 : periodCertainGuarantee.hashCode());
		result = prime * result + ((totalPaymentCount == null) ? 0 : totalPaymentCount.hashCode());
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
		AnnuityAccount other = (AnnuityAccount) obj;
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
		if (annualIncrease == null) {
			if (other.annualIncrease != null)
				return false;
		} else if (!annualIncrease.equals(other.annualIncrease))
			return false;
		if (annualIncreaseType != other.annualIncreaseType)
			return false;
		if (annuityProductType != other.annuityProductType)
			return false;
		if (annuityValueBasis != other.annuityValueBasis)
			return false;
		if (netPresentValue == null) {
			if (other.netPresentValue != null)
				return false;
		} else if (!netPresentValue.equals(other.netPresentValue))
			return false;
		if (paymentAmount == null) {
			if (other.paymentAmount != null)
				return false;
		} else if (!paymentAmount.equals(other.paymentAmount))
			return false;
		if (paymentEndDate == null) {
			if (other.paymentEndDate != null)
				return false;
		} else if (!paymentEndDate.equals(other.paymentEndDate))
			return false;
		if (paymentFrequency != other.paymentFrequency)
			return false;
		if (paymentStartDate == null) {
			if (other.paymentStartDate != null)
				return false;
		} else if (!paymentStartDate.equals(other.paymentStartDate))
			return false;
		if (periodCertainGuarantee != other.periodCertainGuarantee)
			return false;
		if (totalPaymentCount == null) {
			if (other.totalPaymentCount != null)
				return false;
		} else if (!totalPaymentCount.equals(other.totalPaymentCount))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AnnuityAccount [accountId=" + accountId + ", account=" + account + ", annuityProductType="
				+ annuityProductType + ", annuityValueBasis=" + annuityValueBasis + ", paymentAmount=" + paymentAmount
				+ ", paymentFrequency=" + paymentFrequency + ", paymentStartDate=" + paymentStartDate
				+ ", paymentEndDate=" + paymentEndDate + ", totalPaymentCount=" + totalPaymentCount
				+ ", netPresentValue=" + netPresentValue + ", annualIncrease=" + annualIncrease
				+ ", annualIncreaseType=" + annualIncreaseType + ", periodCertainGuarantee=" + periodCertainGuarantee
				+ "]";
	}

	private static final Logger log = LoggerFactory.getLogger(AnnuityAccount.class);

	public AnnuityAccount getAnnuityAccounts(String accountIds) throws FDXException {
		try {
			SqlParameterSource parameters = new MapSqlParameterSource("accountIds", accountIds);
			template = ConnectionConfigApi46.getTemplate();
			Account account = new Account();
			AnnuityAccount annuityAccount = template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".annuityaccount where accountid in (:accountIds)", parameters,
					new AnnuityAccountsRowMapper());
			account = (Account) account.getAccount(accountIds, "details");
			annuityAccount.setAccount(account);
			return annuityAccount;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("AnnuityAccount : ", e);
			throw new FDXException(e,500);
		}
	}

	public AnnuityAccount getAnnuityAccount(String accountId, LocalDate startTime, LocalDate endTime, String resultType)
			throws FDXException {
		Account account = new Account();
		if (resultType.equals("details")) {
			return getAnnuityAccounts(accountId);
		} else {
			//TODO the singleton mapping adding objects for each call so aviod this usage for now
			AnnuityAccount annuityAccount = new AnnuityAccount();
			annuityAccount.account = (Account) account.getAccount(accountId, resultType);
			return annuityAccount;
		}
	}
}
