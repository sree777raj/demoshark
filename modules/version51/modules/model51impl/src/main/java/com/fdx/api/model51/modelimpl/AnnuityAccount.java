package com.fdx.api.model51.modelimpl;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Date;

import com.fasterxml.jackson.annotation.*;
import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.fdx.api.model51.config.ConnectionConfigApi51;
import com.fdx.api.model51.mapper.AnnuityAccountsRowMapper;

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

	@JsonProperty("payoutStartDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private Date payoutStartDate;

	@JsonProperty("payoutEndDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private Date payoutEndDate;

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

	@JsonProperty("numberModalPayouts")
	private Integer numberModalPayouts;

	@JsonProperty("payoutAmount")
	private BigDecimal payoutAmount;

	@JsonProperty("payoutChangeAmount")
	private BigDecimal payoutChangeAmount;

	@JsonProperty("payoutChangePercentage")
	private BigDecimal payoutChangePercentage;

	@JsonProperty("payoutMode")
	private PayoutMode payoutMode;

	@JsonProperty("payoutType")
	private PayoutType payoutType;

	@JsonProperty("periodCertainType")
	private PeriodCertainType periodCertainType;

	@JsonProperty("policyProductType")
	private PolicyProductType policyProductType;

	@JsonProperty("surrenderValue")
	private BigDecimal surrenderValue;

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

	public Timestamp getPaymentStartDate() {
		return paymentStartDate;
	}

	public void setPaymentStartDate(Timestamp paymentStartDate) {
		this.paymentStartDate = paymentStartDate;
	}

	public Timestamp getPaymentEndDate() {
		return paymentEndDate;
	}

	public void setPaymentEndDate(Timestamp paymentEndDate) {
		this.paymentEndDate = paymentEndDate;
	}

	public Date getPayoutStartDate() {
		return payoutStartDate;
	}

	public void setPayoutStartDate(Date payoutStartDate) {
		this.payoutStartDate = payoutStartDate;
	}

	public Date getPayoutEndDate() {
		return payoutEndDate;
	}

	public void setPayoutEndDate(Date payoutEndDate) {
		this.payoutEndDate = payoutEndDate;
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

	public Integer getNumberModalPayouts() {
		return numberModalPayouts;
	}

	public void setNumberModalPayouts(Integer numberModalPayouts) {
		this.numberModalPayouts = numberModalPayouts;
	}

	public BigDecimal getPayoutAmount() {
		return payoutAmount;
	}

	public void setPayoutAmount(BigDecimal payoutAmount) {
		this.payoutAmount = payoutAmount;
	}

	public BigDecimal getPayoutChangeAmount() {
		return payoutChangeAmount;
	}

	public void setPayoutChangeAmount(BigDecimal payoutChangeAmount) {
		this.payoutChangeAmount = payoutChangeAmount;
	}

	public BigDecimal getPayoutChangePercentage() {
		return payoutChangePercentage;
	}

	public void setPayoutChangePercentage(BigDecimal payoutChangePercentage) {
		this.payoutChangePercentage = payoutChangePercentage;
	}

	public BigDecimal getSurrenderValue() {
		return surrenderValue;
	}

	public PayoutMode getPayoutMode() {
		return payoutMode;
	}

	public void setPayoutMode(PayoutMode payoutMode) {
		this.payoutMode = payoutMode;
	}

	public PayoutType getPayoutType() {
		return payoutType;
	}

	public void setPayoutType(PayoutType payoutType) {
		this.payoutType = payoutType;
	}

	public PeriodCertainType getPeriodCertainType() {
		return periodCertainType;
	}

	public void setPeriodCertainType(PeriodCertainType periodCertainType) {
		this.periodCertainType = periodCertainType;
	}

	public PolicyProductType getPolicyProductType() {
		return policyProductType;
	}

	public void setPolicyProductType(PolicyProductType policyProductType) {
		this.policyProductType = policyProductType;
	}

	public void setSurrenderValue(BigDecimal surrenderValue) {
		this.surrenderValue = surrenderValue;
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
		result = prime * result + ((paymentFrequency == null) ? 0 : paymentFrequency.hashCode());
		result = prime * result + ((paymentStartDate == null) ? 0 : paymentStartDate.hashCode());
		result = prime * result + ((paymentEndDate == null) ? 0 : paymentEndDate.hashCode());
		result = prime * result + ((payoutStartDate == null) ? 0 : payoutStartDate.hashCode());
		result = prime * result + ((payoutEndDate == null) ? 0 : payoutEndDate.hashCode());
		result = prime * result + ((periodCertainGuarantee == null) ? 0 : periodCertainGuarantee.hashCode());
		result = prime * result + ((totalPaymentCount == null) ? 0 : totalPaymentCount.hashCode());
		result = prime * result + ((numberModalPayouts == null) ? 0 : numberModalPayouts.hashCode());
		result = prime * result + ((payoutAmount == null) ? 0 : payoutAmount.hashCode());
		result = prime * result + ((payoutChangeAmount == null) ? 0 : payoutChangeAmount.hashCode());
		result = prime * result + ((payoutChangePercentage == null) ? 0 : payoutChangePercentage.hashCode());
		result = prime * result + ((payoutMode == null) ? 0 : payoutMode.hashCode());
		result = prime * result + ((payoutType == null) ? 0 : payoutType.hashCode());
		result = prime * result + ((periodCertainType == null) ? 0 : periodCertainType.hashCode());
		result = prime * result + ((policyProductType == null) ? 0 : policyProductType.hashCode());
		result = prime * result + ((surrenderValue == null) ? 0 : surrenderValue.hashCode());
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
		if (payoutEndDate == null) {
			if (other.payoutEndDate != null)
				return false;
		} else if (!payoutEndDate.equals(other.payoutEndDate))
			return false;
		if (paymentFrequency != other.paymentFrequency)
			return false;
		if (paymentStartDate == null) {
			if (other.paymentStartDate != null)
				return false;
		} else if (!paymentStartDate.equals(other.paymentStartDate))
			return false;
		if (paymentEndDate == null) {
			if (other.paymentEndDate != null)
				return false;
		} else if (!paymentEndDate.equals(other.paymentEndDate))
			return false;
		if (payoutStartDate == null) {
			if (other.payoutStartDate != null)
				return false;
		} else if (!payoutStartDate.equals(other.payoutStartDate))
			return false;
		if (periodCertainGuarantee != other.periodCertainGuarantee)
			return false;
		if (totalPaymentCount == null) {
			if (other.totalPaymentCount != null)
				return false;
		} else if (!totalPaymentCount.equals(other.totalPaymentCount))
			return false;
		if (numberModalPayouts != other.numberModalPayouts)
			return false;
		if (payoutAmount != other.payoutAmount)
			return false;
		if (payoutChangeAmount != other.payoutChangeAmount)
			return false;
		if (payoutChangePercentage != other.payoutChangePercentage)
			return false;
		if (payoutMode != other.payoutMode)
			return false;
		if (payoutType != other.payoutType)
			return false;
		if (periodCertainType != other.periodCertainType)
			return false;
		if (policyProductType != other.policyProductType)
			return false;
		if (surrenderValue != other.surrenderValue)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AnnuityAccount [accountId=" + accountId + ", account=" + account + ", annuityProductType="
				+ annuityProductType + ", annuityValueBasis=" + annuityValueBasis + ", paymentAmount=" + paymentAmount
				+ ", paymentFrequency=" + paymentFrequency + ", payoutStartDate=" + payoutStartDate
				+ ", payoutEndDate=" + payoutEndDate + ", totalPaymentCount=" + totalPaymentCount
				+ ", netPresentValue=" + netPresentValue + ", annualIncrease=" + annualIncrease
				+ ", annualIncreaseType=" + annualIncreaseType + ", periodCertainGuarantee=" + periodCertainGuarantee
				+ ", numberModalPayouts=" + numberModalPayouts + ", payoutAmount=" + payoutAmount
				+ ", payoutChangeAmount=" + payoutChangeAmount + ", payoutChangePercentage=" + payoutChangePercentage
				+ ", paymentStartDate=" + paymentStartDate + ", paymentEndDate=" + paymentEndDate
				+ ", payoutMode=" + payoutMode + ", payoutType=" + payoutType
				+ ", periodCertainType=" + periodCertainType + ", policyProductType=" + policyProductType
				+ ", surrenderValue=" + surrenderValue
				+ "]";
	}

	private static final Logger log = LoggerFactory.getLogger(AnnuityAccount.class);

	public AnnuityAccount getAnnuityAccounts(String accountIds) throws FDXException {
		try {
			SqlParameterSource parameters = new MapSqlParameterSource("accountIds", accountIds);
			template = ConnectionConfigApi51.getTemplate();
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
