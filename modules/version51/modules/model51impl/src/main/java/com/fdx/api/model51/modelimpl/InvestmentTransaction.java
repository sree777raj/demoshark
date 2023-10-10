package com.fdx.api.model51.modelimpl;

import com.fasterxml.jackson.annotation.*;
import com.fdx.common.exception.FDXException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.Map;

import javax.validation.constraints.Size;

import com.fdx.common.exception.FDXException;

import com.fdx.common.util.DeveloperContext;
import com.fdx.common.util.FdxConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fdx.api.model51.config.ConnectionConfigApi51;
import com.fdx.api.model51.mapper.InvestmentTransactionRowMapper;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Specific transaction information
 */
@ApiModel(description = "Specific transaction information")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class InvestmentTransaction {

	NamedParameterJdbcTemplate template;

	@JsonIgnore
	private int investmentTransactionId;

	@JsonIgnore
	private String accountId;

	@JsonIgnore
	private String transactionId;

	@JsonUnwrapped
	private Transaction transaction;

	@JsonProperty("transactionType")
	private InvestmentTransactionType transactionType;

	@JsonProperty("shares")
	private BigDecimal shares;

	@JsonProperty("faceValue")
	private BigDecimal faceValue;

	@JsonProperty("price")
	private BigDecimal price;

	@JsonProperty("securityId")
	private String securityId;

	@JsonProperty("securityIdType")
	private SecurityIdType securityIdType;

	@JsonProperty("securityType")
	private SecurityType securityType;

	@JsonProperty("symbol")
	private String symbol;

	@JsonProperty("markup")
	private BigDecimal markup;

	@JsonProperty("commission")
	private BigDecimal commission;

	@JsonProperty("taxes")
	private BigDecimal taxes;

	@JsonProperty("fees")
	private BigDecimal fees;

	@JsonProperty("load")
	private BigDecimal load;

	@JsonProperty("inv401kSource")
	private Inv401kSourceType inv401kSource;

	@JsonProperty("confirmationNumber")
	private String confirmationNumber;

	@JsonProperty("fractionalCash")
	private BigDecimal fractionalCash;

	@JsonProperty("incomeType")
	private IncomeType incomeType;

	@JsonProperty("oldUnits")
	private BigDecimal oldUnits;

	@JsonProperty("splitRatioNumerator")
	private BigDecimal splitRatioNumerator;

	@JsonProperty("splitRatioDenominator")
	private BigDecimal splitRatioDenominator;

	@JsonProperty("newUnits")
	private BigDecimal newUnits;

	@JsonProperty("subAccountSec")
	private SubAccountType subAccountSec;

	@JsonProperty("subAccountFund")
	private SubAccountType subAccountFund;

	@JsonProperty("loanId")
	private String loanId;

	@JsonProperty("loanPrincipal")
	private BigDecimal loanPrincipal;

	@JsonProperty("loanInterest")
	private BigDecimal loanInterest;

	@JsonProperty("payrollDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private Date payrollDate;

	@JsonProperty("priorYearContrib")
	@JsonInclude(Include.NON_NULL)
	private Boolean priorYearContrib;

	@JsonProperty("withholding")
	private BigDecimal withholding;

	@JsonProperty("taxExempt")
	@JsonInclude(Include.NON_NULL)
	private Boolean taxExempt;

	@JsonProperty("gain")
	private BigDecimal gain;

	@JsonProperty("stateWithholding")
	private BigDecimal stateWithholding;

	@JsonProperty("penalty")
	private BigDecimal penalty;

	@JsonProperty("runningBalance")
	private BigDecimal runningBalance;

	@JsonProperty("unitPrice")
	private BigDecimal unitPrice;

	@JsonProperty("units")
	private BigDecimal units;

	@JsonProperty("unitType")
	private UnitType unitType;

	@JsonProperty("transactionReason")
	private TransactionReason transactionReason;

	@JsonProperty("accruedInterest")
	private BigDecimal accruedInterest;

	/**
	 * Transfer direction
	 */
	public enum TransferActionEnum {
		IN("IN"),

		OUT("OUT");

		private String value;

		TransferActionEnum(String value) {
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
		public static TransferActionEnum fromValue(String value) {
			for (TransferActionEnum b : TransferActionEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'",401));
		}
	}

	@JsonProperty("transferAction")
	private TransferActionEnum transferAction;

	@JsonProperty("positionType")
	private PositionType positionType;

	public InvestmentTransaction accountId(String accountId) {
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

	public InvestmentTransaction transactionId(String transactionId) {
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

	public InvestmentTransactionType getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(InvestmentTransactionType transactionType) {
		this.transactionType = transactionType;
	}

	public BigDecimal getShares() {
		return shares;
	}

	public void setShares(BigDecimal shares) {
		this.shares = shares;
	}

	public BigDecimal getFaceValue() {
		return faceValue;
	}

	public void setFaceValue(BigDecimal faceValue) {
		this.faceValue = faceValue;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getSecurityId() {
		return securityId;
	}

	public void setSecurityId(String securityId) {
		this.securityId = securityId;
	}

	public SecurityIdType getSecurityIdType() {
		return securityIdType;
	}

	public void setSecurityIdType(SecurityIdType securityIdType) {
		this.securityIdType = securityIdType;
	}

	public SecurityType getSecurityType() {
		return securityType;
	}

	public void setSecurityType(SecurityType securityType) {
		this.securityType = securityType;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public BigDecimal getMarkup() {
		return markup;
	}

	public void setMarkup(BigDecimal markup) {
		this.markup = markup;
	}

	public BigDecimal getCommission() {
		return commission;
	}

	public void setCommission(BigDecimal commission) {
		this.commission = commission;
	}

	public BigDecimal getTaxes() {
		return taxes;
	}

	public void setTaxes(BigDecimal taxes) {
		this.taxes = taxes;
	}

	public BigDecimal getFees() {
		return fees;
	}

	public void setFees(BigDecimal fees) {
		this.fees = fees;
	}

	public BigDecimal getLoad() {
		return load;
	}

	public void setLoad(BigDecimal load) {
		this.load = load;
	}

	public Inv401kSourceType getInv401kSource() {
		return inv401kSource;
	}

	public void setInv401kSource(Inv401kSourceType inv401kSource) {
		this.inv401kSource = inv401kSource;
	}

	public String getConfirmationNumber() {
		return confirmationNumber;
	}

	public void setConfirmationNumber(String confirmationNumber) {
		this.confirmationNumber = confirmationNumber;
	}

	public BigDecimal getFractionalCash() {
		return fractionalCash;
	}

	public void setFractionalCash(BigDecimal fractionalCash) {
		this.fractionalCash = fractionalCash;
	}

	public IncomeType getIncomeType() {
		return incomeType;
	}

	public void setIncomeType(IncomeType incomeType) {
		this.incomeType = incomeType;
	}

	public BigDecimal getOldUnits() {
		return oldUnits;
	}

	public void setOldUnits(BigDecimal oldUnits) {
		this.oldUnits = oldUnits;
	}

	public BigDecimal getSplitRatioNumerator() {
		return splitRatioNumerator;
	}

	public void setSplitRatioNumerator(BigDecimal splitRatioNumerator) {
		this.splitRatioNumerator = splitRatioNumerator;
	}

	public BigDecimal getSplitRatioDenominator() {
		return splitRatioDenominator;
	}

	public void setSplitRatioDenominator(BigDecimal splitRatioDenominator) {
		this.splitRatioDenominator = splitRatioDenominator;
	}

	public BigDecimal getNewUnits() {
		return newUnits;
	}

	public void setNewUnits(BigDecimal newUnits) {
		this.newUnits = newUnits;
	}

	public SubAccountType getSubAccountSec() {
		return subAccountSec;
	}

	public void setSubAccountSec(SubAccountType subAccountSec) {
		this.subAccountSec = subAccountSec;
	}

	public SubAccountType getSubAccountFund() {
		return subAccountFund;
	}

	public void setSubAccountFund(SubAccountType subAccountFund) {
		this.subAccountFund = subAccountFund;
	}

	public String getLoanId() {
		return loanId;
	}

	public void setLoanId(String loanId) {
		this.loanId = loanId;
	}

	public BigDecimal getLoanPrincipal() {
		return loanPrincipal;
	}

	public void setLoanPrincipal(BigDecimal loanPrincipal) {
		this.loanPrincipal = loanPrincipal;
	}

	public BigDecimal getLoanInterest() {
		return loanInterest;
	}

	public void setLoanInterest(BigDecimal loanInterest) {
		this.loanInterest = loanInterest;
	}

	public Date getPayrollDate() {
		return payrollDate;
	}

	public void setPayrollDate(Date payrollDate) {
		this.payrollDate = payrollDate;
	}

	public Boolean getPriorYearContrib() {
		return priorYearContrib;
	}

	public void setPriorYearContrib(Boolean priorYearContrib) {
		this.priorYearContrib = priorYearContrib;
	}

	public BigDecimal getWithholding() {
		return withholding;
	}

	public void setWithholding(BigDecimal withholding) {
		this.withholding = withholding;
	}

	public Boolean getTaxExempt() {
		return taxExempt;
	}

	public void setTaxExempt(Boolean taxExempt) {
		this.taxExempt = taxExempt;
	}

	public BigDecimal getGain() {
		return gain;
	}

	public void setGain(BigDecimal gain) {
		this.gain = gain;
	}

	public BigDecimal getStateWithholding() {
		return stateWithholding;
	}

	public void setStateWithholding(BigDecimal stateWithholding) {
		this.stateWithholding = stateWithholding;
	}

	public BigDecimal getPenalty() {
		return penalty;
	}

	public void setPenalty(BigDecimal penalty) {
		this.penalty = penalty;
	}

	public BigDecimal getRunningBalance() {
		return runningBalance;
	}

	public void setRunningBalance(BigDecimal runningBalance) {
		this.runningBalance = runningBalance;
	}

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	public BigDecimal getUnits() {
		return units;
	}

	public void setUnits(BigDecimal units) {
		this.units = units;
	}

	public UnitType getUnitType() {
		return unitType;
	}

	public void setUnitType(UnitType unitType) {
		this.unitType = unitType;
	}

	public TransactionReason getTransactionReason() {
		return transactionReason;
	}

	public void setTransactionReason(TransactionReason transactionReason) {
		this.transactionReason = transactionReason;
	}

	public BigDecimal getAccruedInterest() {
		return accruedInterest;
	}

	public void setAccruedInterest(BigDecimal accruedInterest) {
		this.accruedInterest = accruedInterest;
	}

	public TransferActionEnum getTransferAction() {
		return transferAction;
	}

	public void setTransferAction(TransferActionEnum transferAction) {
		this.transferAction = transferAction;
	}

	public PositionType getPositionType() {
		return positionType;
	}

	public void setPositionType(PositionType positionType) {
		this.positionType = positionType;
	}

	public int getInvestmentTransactionId() {
		return investmentTransactionId;
	}

	public void setInvestmentTransactionId(int investmentTransactionId) {
		this.investmentTransactionId = investmentTransactionId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((transaction == null) ? 0 : transaction.hashCode());
		//result = prime * result + ((accountId == null) ? 0 : accountId.hashCode());
		result = prime * result + ((accruedInterest == null) ? 0 : accruedInterest.hashCode());
		result = prime * result + ((commission == null) ? 0 : commission.hashCode());
		result = prime * result + ((confirmationNumber == null) ? 0 : confirmationNumber.hashCode());
		result = prime * result + ((faceValue == null) ? 0 : faceValue.hashCode());
		result = prime * result + ((fees == null) ? 0 : fees.hashCode());
		result = prime * result + ((fractionalCash == null) ? 0 : fractionalCash.hashCode());
		result = prime * result + ((gain == null) ? 0 : gain.hashCode());
		result = prime * result + ((incomeType == null) ? 0 : incomeType.hashCode());
		result = prime * result + ((inv401kSource == null) ? 0 : inv401kSource.hashCode());
		result = prime * result + ((load == null) ? 0 : load.hashCode());
		result = prime * result + ((loanId == null) ? 0 : loanId.hashCode());
		result = prime * result + ((loanInterest == null) ? 0 : loanInterest.hashCode());
		result = prime * result + ((loanPrincipal == null) ? 0 : loanPrincipal.hashCode());
		result = prime * result + ((markup == null) ? 0 : markup.hashCode());
		result = prime * result + ((newUnits == null) ? 0 : newUnits.hashCode());
		result = prime * result + ((oldUnits == null) ? 0 : oldUnits.hashCode());
		result = prime * result + ((payrollDate == null) ? 0 : payrollDate.hashCode());
		result = prime * result + ((penalty == null) ? 0 : penalty.hashCode());
		result = prime * result + ((positionType == null) ? 0 : positionType.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((priorYearContrib == null) ? 0 : priorYearContrib.hashCode());
		result = prime * result + ((runningBalance == null) ? 0 : runningBalance.hashCode());
		result = prime * result + ((securityId == null) ? 0 : securityId.hashCode());
		result = prime * result + ((securityIdType == null) ? 0 : securityIdType.hashCode());
		result = prime * result + ((securityType == null) ? 0 : securityType.hashCode());
		result = prime * result + ((shares == null) ? 0 : shares.hashCode());
		result = prime * result + ((splitRatioDenominator == null) ? 0 : splitRatioDenominator.hashCode());
		result = prime * result + ((splitRatioNumerator == null) ? 0 : splitRatioNumerator.hashCode());
		result = prime * result + ((stateWithholding == null) ? 0 : stateWithholding.hashCode());
		result = prime * result + ((subAccountFund == null) ? 0 : subAccountFund.hashCode());
		result = prime * result + ((subAccountSec == null) ? 0 : subAccountSec.hashCode());
		result = prime * result + ((symbol == null) ? 0 : symbol.hashCode());
		result = prime * result + ((taxExempt == null) ? 0 : taxExempt.hashCode());
		result = prime * result + ((taxes == null) ? 0 : taxes.hashCode());
		result = prime * result + ((transactionId == null) ? 0 : transactionId.hashCode());
		result = prime * result + ((transactionReason == null) ? 0 : transactionReason.hashCode());
		result = prime * result + ((transactionType == null) ? 0 : transactionType.hashCode());
		result = prime * result + ((transferAction == null) ? 0 : transferAction.hashCode());
		result = prime * result + ((unitPrice == null) ? 0 : unitPrice.hashCode());
		result = prime * result + ((unitType == null) ? 0 : unitType.hashCode());
		result = prime * result + ((units == null) ? 0 : units.hashCode());
		result = prime * result + ((withholding == null) ? 0 : withholding.hashCode());
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
		InvestmentTransaction other = (InvestmentTransaction) obj;
		if (transaction == null) {
			if (other.transaction != null)
				return false;
		} else if (!transaction.equals(other.transaction))
			return false;
/*		if (accountId == null) {
			if (other.accountId != null)
				return false;
		} else if (!accountId.equals(other.accountId))
			return false;*/
		if (accruedInterest == null) {
			if (other.accruedInterest != null)
				return false;
		} else if (!accruedInterest.equals(other.accruedInterest))
			return false;
		if (commission == null) {
			if (other.commission != null)
				return false;
		} else if (!commission.equals(other.commission))
			return false;
		if (confirmationNumber == null) {
			if (other.confirmationNumber != null)
				return false;
		} else if (!confirmationNumber.equals(other.confirmationNumber))
			return false;
		if (faceValue == null) {
			if (other.faceValue != null)
				return false;
		} else if (!faceValue.equals(other.faceValue))
			return false;
		if (fees == null) {
			if (other.fees != null)
				return false;
		} else if (!fees.equals(other.fees))
			return false;
		if (fractionalCash == null) {
			if (other.fractionalCash != null)
				return false;
		} else if (!fractionalCash.equals(other.fractionalCash))
			return false;
		if (gain == null) {
			if (other.gain != null)
				return false;
		} else if (!gain.equals(other.gain))
			return false;
		if (incomeType != other.incomeType)
			return false;
		if (inv401kSource != other.inv401kSource)
			return false;
		if (load == null) {
			if (other.load != null)
				return false;
		} else if (!load.equals(other.load))
			return false;
		if (loanId == null) {
			if (other.loanId != null)
				return false;
		} else if (!loanId.equals(other.loanId))
			return false;
		if (loanInterest == null) {
			if (other.loanInterest != null)
				return false;
		} else if (!loanInterest.equals(other.loanInterest))
			return false;
		if (loanPrincipal == null) {
			if (other.loanPrincipal != null)
				return false;
		} else if (!loanPrincipal.equals(other.loanPrincipal))
			return false;
		if (markup == null) {
			if (other.markup != null)
				return false;
		} else if (!markup.equals(other.markup))
			return false;
		if (newUnits == null) {
			if (other.newUnits != null)
				return false;
		} else if (!newUnits.equals(other.newUnits))
			return false;
		if (oldUnits == null) {
			if (other.oldUnits != null)
				return false;
		} else if (!oldUnits.equals(other.oldUnits))
			return false;
		if (payrollDate == null) {
			if (other.payrollDate != null)
				return false;
		} else if (!payrollDate.equals(other.payrollDate))
			return false;
		if (penalty == null) {
			if (other.penalty != null)
				return false;
		} else if (!penalty.equals(other.penalty))
			return false;
		if (positionType != other.positionType)
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (priorYearContrib == null) {
			if (other.priorYearContrib != null)
				return false;
		} else if (!priorYearContrib.equals(other.priorYearContrib))
			return false;
		if (runningBalance == null) {
			if (other.runningBalance != null)
				return false;
		} else if (!runningBalance.equals(other.runningBalance))
			return false;
		if (securityId == null) {
			if (other.securityId != null)
				return false;
		} else if (!securityId.equals(other.securityId))
			return false;
		if (securityIdType != other.securityIdType)
			return false;
		if (securityType != other.securityType)
			return false;
		if (shares == null) {
			if (other.shares != null)
				return false;
		} else if (!shares.equals(other.shares))
			return false;
		if (splitRatioDenominator == null) {
			if (other.splitRatioDenominator != null)
				return false;
		} else if (!splitRatioDenominator.equals(other.splitRatioDenominator))
			return false;
		if (splitRatioNumerator == null) {
			if (other.splitRatioNumerator != null)
				return false;
		} else if (!splitRatioNumerator.equals(other.splitRatioNumerator))
			return false;
		if (stateWithholding == null) {
			if (other.stateWithholding != null)
				return false;
		} else if (!stateWithholding.equals(other.stateWithholding))
			return false;
		if (subAccountFund != other.subAccountFund)
			return false;
		if (subAccountSec != other.subAccountSec)
			return false;
		if (symbol == null) {
			if (other.symbol != null)
				return false;
		} else if (!symbol.equals(other.symbol))
			return false;
		if (taxExempt == null) {
			if (other.taxExempt != null)
				return false;
		} else if (!taxExempt.equals(other.taxExempt))
			return false;
		if (taxes == null) {
			if (other.taxes != null)
				return false;
		} else if (!taxes.equals(other.taxes))
			return false;
		if (transactionId == null) {
			if (other.transactionId != null)
				return false;
		} else if (!transactionId.equals(other.transactionId))
			return false;
		if (transactionReason != other.transactionReason)
			return false;
		if (transactionType != other.transactionType)
			return false;
		if (transferAction != other.transferAction)
			return false;
		if (unitPrice == null) {
			if (other.unitPrice != null)
				return false;
		} else if (!unitPrice.equals(other.unitPrice))
			return false;
		if (unitType != other.unitType)
			return false;
		if (units == null) {
			if (other.units != null)
				return false;
		} else if (!units.equals(other.units))
			return false;
		if (withholding == null) {
			if (other.withholding != null)
				return false;
		} else if (!withholding.equals(other.withholding))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "InvestmentTransaction [Transaction="
				+ transaction + ", transactionType=" + transactionType + ", shares=" + shares + ", faceValue="
				+ faceValue + ", price=" + price + ", securityId=" + securityId + ", securityIdType=" + securityIdType
				+ ", securityType=" + securityType + ", symbol=" + symbol + ", markup=" + markup + ", commission="
				+ commission + ", taxes=" + taxes + ", fees=" + fees + ", load=" + load + ", inv401kSource="
				+ inv401kSource + ", confirmationNumber=" + confirmationNumber + ", fractionalCash=" + fractionalCash
				+ ", incomeType=" + incomeType + ", oldUnits=" + oldUnits + ", splitRatioNumerator="
				+ splitRatioNumerator + ", splitRatioDenominator=" + splitRatioDenominator + ", newUnits=" + newUnits
				+ ", subAccountSec=" + subAccountSec + ", subAccountFund=" + subAccountFund + ", loanId=" + loanId
				+ ", loanPrincipal=" + loanPrincipal + ", loanInterest=" + loanInterest + ", payrollDate=" + payrollDate
				+ ", priorYearContrib=" + priorYearContrib + ", withholding=" + withholding + ", taxExempt=" + taxExempt
				+ ", gain=" + gain + ", stateWithholding=" + stateWithholding + ", penalty=" + penalty
				+ ", runningBalance=" + runningBalance + ", unitPrice=" + unitPrice + ", units=" + units + ", unitType="
				+ unitType + ", transactionReason=" + transactionReason + ", accruedInterest=" + accruedInterest
				+ ", transferAction=" + transferAction + ", positionType=" + positionType + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(InvestmentTransaction.class);

	public InvestmentTransaction getInvestmentTransactions(String accountId, int transactionId, LocalDate startTime,
			LocalDate endTime) throws FDXException {
		try {
			template = ConnectionConfigApi51.getTemplate();
			Transaction transaction = new Transaction();
			InvestmentTransaction investmentTransaction;
			try {
				investmentTransaction = template.queryForObject(
						"select * from "+ DeveloperContext.getDeveloperSchema() +".investmentTransaction where accountid in (:accountId) and investmenttransactionid in (:investmenttransactionid)",
						new MapSqlParameterSource().addValue("accountId", accountId).addValue("investmenttransactionid",
								transactionId),
						new InvestmentTransactionRowMapper());
			} catch (EmptyResultDataAccessException e) {
				throw new FDXException("Investment Transaction not found", 0);
			}
			InvestmentTransaction investmentTransactionNew = new InvestmentTransaction();
			transaction = transaction.getTransaction(String.valueOf(investmentTransaction.getTransactionId()),
					accountId, startTime, endTime);
			investmentTransactionNew.setTransaction(transaction);
			investmentTransactionNew.setTransactionType(investmentTransaction.getTransactionType());
			investmentTransactionNew.setShares(investmentTransaction.getShares());
			investmentTransactionNew.setFaceValue(investmentTransaction.getFaceValue());
			investmentTransactionNew.setPrice(investmentTransaction.getPrice());
			investmentTransactionNew.setSecurityId(investmentTransaction.getSecurityId());
			investmentTransactionNew.setSecurityIdType(investmentTransaction.getSecurityIdType());
			investmentTransactionNew.setSecurityType(investmentTransaction.getSecurityType());
			investmentTransactionNew.setSymbol(investmentTransaction.getSymbol());
			investmentTransactionNew.setMarkup(investmentTransaction.getMarkup());
			investmentTransactionNew.setCommission(investmentTransaction.getCommission());
			investmentTransactionNew.setTaxes(investmentTransaction.getTaxes());
			investmentTransactionNew.setFees(investmentTransaction.getFees());
			investmentTransactionNew.setLoad(investmentTransaction.getLoad());
			investmentTransactionNew.setInv401kSource(investmentTransaction.getInv401kSource());
			investmentTransactionNew.setConfirmationNumber(investmentTransaction.getConfirmationNumber());
			investmentTransactionNew.setFractionalCash(investmentTransaction.getFractionalCash());
			investmentTransactionNew.setIncomeType(investmentTransaction.getIncomeType());
			investmentTransactionNew.setOldUnits(investmentTransaction.getOldUnits());
			investmentTransactionNew.setSplitRatioNumerator(investmentTransaction.getSplitRatioNumerator());
			investmentTransactionNew.setSplitRatioDenominator(investmentTransaction.getSplitRatioDenominator());
			investmentTransactionNew.setNewUnits(investmentTransaction.getNewUnits());
			investmentTransactionNew.setSubAccountSec(investmentTransaction.getSubAccountSec());
			investmentTransactionNew.setSubAccountFund(investmentTransaction.getSubAccountFund());
			investmentTransactionNew.setLoanId(investmentTransaction.getLoanId());
			investmentTransactionNew.setLoanPrincipal(investmentTransaction.getLoanPrincipal());
			investmentTransactionNew.setLoanInterest(investmentTransaction.getLoanInterest());
			investmentTransactionNew.setPayrollDate(investmentTransaction.getPayrollDate());
			investmentTransactionNew.setPriorYearContrib(investmentTransaction.getPriorYearContrib());
			investmentTransactionNew.setWithholding(investmentTransaction.getWithholding());
			investmentTransactionNew.setTaxExempt(investmentTransaction.getTaxExempt());
			investmentTransactionNew.setGain(investmentTransaction.getGain());
			investmentTransactionNew.setStateWithholding(investmentTransaction.getStateWithholding());
			investmentTransactionNew.setPenalty(investmentTransaction.getPenalty());
			investmentTransactionNew.setRunningBalance(investmentTransaction.getRunningBalance());
			investmentTransactionNew.setUnitPrice(investmentTransaction.getUnitPrice());
			investmentTransactionNew.setUnits(investmentTransaction.getUnits());
			investmentTransactionNew.setUnitType(investmentTransaction.getUnitType());
			investmentTransactionNew.setTransactionReason(investmentTransaction.getTransactionReason());
			investmentTransactionNew.setAccruedInterest(investmentTransaction.getAccruedInterest());
			investmentTransactionNew.setTransferAction(investmentTransaction.getTransferAction());
			investmentTransactionNew.setPositionType(investmentTransaction.getPositionType());
			return investmentTransactionNew;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("InvestmentTransaction : ", e);
			throw new FDXException(e, FdxConstants.HTTP_ERROR_CODE_500);
		}
	}

	public Map<String, Object> postInvestmentTransaction(String accountId, String transactionId) throws FDXException {
		KeyHolder keyHolder = new GeneratedKeyHolder();
		try {
			template = ConnectionConfigApi51.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("paymentId", null);
			int count = template.update(
					"insert into "+ DeveloperContext.getDeveloperSchema() +".investmentTransaction (transactionId, accountId, transferaction, transactionreason) values ("
							+ ((transactionId != null) ? ("'" + transactionId + "'") : null) + ","
							+ ((accountId != null) ? ("'" + accountId + "'") : null) + ","
							+ ((transferAction != null) ? ("'" + transferAction + "'") : null) + ","
							+ ((transactionReason != null) ? ("'" + transactionReason + "'") : null) + ")",
					parameters, keyHolder);
		} catch (Exception e) {
			log.error("InvestmentTransaction : ", e);
			throw new FDXException(e,FdxConstants.HTTP_ERROR_CODE_500);
		}
		return keyHolder.getKeys();
	}
}
