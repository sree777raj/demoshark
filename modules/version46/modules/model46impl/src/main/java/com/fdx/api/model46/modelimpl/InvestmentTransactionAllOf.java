package com.fdx.api.model46.modelimpl;

import com.fdx.common.exception.FDXException;
import java.math.BigDecimal;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModelProperty;

/**
 * InvestmentTransactionAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class InvestmentTransactionAllOf {
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
	private java.sql.Timestamp payrollDate;

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

	public InvestmentTransactionAllOf transactionType(InvestmentTransactionType transactionType) {
		this.transactionType = transactionType;
		return this;
	}

	/**
	 * Get transactionType
	 * 
	 * @return transactionType
	 */
	@ApiModelProperty(value = "")

	@Valid

	public InvestmentTransactionType getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(InvestmentTransactionType transactionType) {
		this.transactionType = transactionType;
	}

	public InvestmentTransactionAllOf shares(BigDecimal shares) {
		this.shares = shares;
		return this;
	}

	/**
	 * Required for stock, mutual funds. Number of shares (with decimals). Negative
	 * numbers indicate securities are being removed from the account
	 * 
	 * @return shares
	 */
	@ApiModelProperty(value = "Required for stock, mutual funds. Number of shares (with decimals). Negative numbers indicate securities are being removed from the account")

	@Valid

	public BigDecimal getShares() {
		return shares;
	}

	public void setShares(BigDecimal shares) {
		this.shares = shares;
	}

	public InvestmentTransactionAllOf faceValue(BigDecimal faceValue) {
		this.faceValue = faceValue;
		return this;
	}

	/**
	 * Cash value for bonds
	 * 
	 * @return faceValue
	 */
	@ApiModelProperty(value = "Cash value for bonds")

	@Valid

	public BigDecimal getFaceValue() {
		return faceValue;
	}

	public void setFaceValue(BigDecimal faceValue) {
		this.faceValue = faceValue;
	}

	public InvestmentTransactionAllOf price(BigDecimal price) {
		this.price = price;
		return this;
	}

	/**
	 * Unit purchase price
	 * 
	 * @return price
	 */
	@ApiModelProperty(value = "Unit purchase price")

	@Valid

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public InvestmentTransactionAllOf securityId(String securityId) {
		this.securityId = securityId;
		return this;
	}

	/**
	 * Unique identifier of security
	 * 
	 * @return securityId
	 */
	@ApiModelProperty(value = "Unique identifier of security")

	public String getSecurityId() {
		return securityId;
	}

	public void setSecurityId(String securityId) {
		this.securityId = securityId;
	}

	public InvestmentTransactionAllOf securityIdType(SecurityIdType securityIdType) {
		this.securityIdType = securityIdType;
		return this;
	}

	/**
	 * Get securityIdType
	 * 
	 * @return securityIdType
	 */
	@ApiModelProperty(value = "")

	@Valid

	public SecurityIdType getSecurityIdType() {
		return securityIdType;
	}

	public void setSecurityIdType(SecurityIdType securityIdType) {
		this.securityIdType = securityIdType;
	}

	public InvestmentTransactionAllOf securityType(SecurityType securityType) {
		this.securityType = securityType;
		return this;
	}

	/**
	 * Get securityType
	 * 
	 * @return securityType
	 */
	@ApiModelProperty(value = "")

	@Valid

	public SecurityType getSecurityType() {
		return securityType;
	}

	public void setSecurityType(SecurityType securityType) {
		this.securityType = securityType;
	}

	public InvestmentTransactionAllOf symbol(String symbol) {
		this.symbol = symbol;
		return this;
	}

	/**
	 * Ticker symbol
	 * 
	 * @return symbol
	 */
	@ApiModelProperty(value = "Ticker symbol")

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public InvestmentTransactionAllOf markup(BigDecimal markup) {
		this.markup = markup;
		return this;
	}

	/**
	 * Portion of unit price that is attributed to the dealer markup
	 * 
	 * @return markup
	 */
	@ApiModelProperty(value = "Portion of unit price that is attributed to the dealer markup")

	@Valid

	public BigDecimal getMarkup() {
		return markup;
	}

	public void setMarkup(BigDecimal markup) {
		this.markup = markup;
	}

	public InvestmentTransactionAllOf commission(BigDecimal commission) {
		this.commission = commission;
		return this;
	}

	/**
	 * Transaction commission
	 * 
	 * @return commission
	 */
	@ApiModelProperty(value = "Transaction commission")

	@Valid

	public BigDecimal getCommission() {
		return commission;
	}

	public void setCommission(BigDecimal commission) {
		this.commission = commission;
	}

	public InvestmentTransactionAllOf taxes(BigDecimal taxes) {
		this.taxes = taxes;
		return this;
	}

	/**
	 * Taxes on the trade
	 * 
	 * @return taxes
	 */
	@ApiModelProperty(value = "Taxes on the trade")

	@Valid

	public BigDecimal getTaxes() {
		return taxes;
	}

	public void setTaxes(BigDecimal taxes) {
		this.taxes = taxes;
	}

	public InvestmentTransactionAllOf fees(BigDecimal fees) {
		this.fees = fees;
		return this;
	}

	/**
	 * Fees applied to the trade
	 * 
	 * @return fees
	 */
	@ApiModelProperty(value = "Fees applied to the trade")

	@Valid

	public BigDecimal getFees() {
		return fees;
	}

	public void setFees(BigDecimal fees) {
		this.fees = fees;
	}

	public InvestmentTransactionAllOf load(BigDecimal load) {
		this.load = load;
		return this;
	}

	/**
	 * Load on the transaction
	 * 
	 * @return load
	 */
	@ApiModelProperty(value = "Load on the transaction")

	@Valid

	public BigDecimal getLoad() {
		return load;
	}

	public void setLoad(BigDecimal load) {
		this.load = load;
	}

	public InvestmentTransactionAllOf inv401kSource(Inv401kSourceType inv401kSource) {
		this.inv401kSource = inv401kSource;
		return this;
	}

	/**
	 * Get inv401kSource
	 * 
	 * @return inv401kSource
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Inv401kSourceType getInv401kSource() {
		return inv401kSource;
	}

	public void setInv401kSource(Inv401kSourceType inv401kSource) {
		this.inv401kSource = inv401kSource;
	}

	public InvestmentTransactionAllOf confirmationNumber(String confirmationNumber) {
		this.confirmationNumber = confirmationNumber;
		return this;
	}

	/**
	 * Confirmation number of the transaction
	 * 
	 * @return confirmationNumber
	 */
	@ApiModelProperty(value = "Confirmation number of the transaction")

	public String getConfirmationNumber() {
		return confirmationNumber;
	}

	public void setConfirmationNumber(String confirmationNumber) {
		this.confirmationNumber = confirmationNumber;
	}

	public InvestmentTransactionAllOf fractionalCash(BigDecimal fractionalCash) {
		this.fractionalCash = fractionalCash;
		return this;
	}

	/**
	 * Cash for fractional units (used for stock splits)
	 * 
	 * @return fractionalCash
	 */
	@ApiModelProperty(value = "Cash for fractional units (used for stock splits)")

	@Valid

	public BigDecimal getFractionalCash() {
		return fractionalCash;
	}

	public void setFractionalCash(BigDecimal fractionalCash) {
		this.fractionalCash = fractionalCash;
	}

	public InvestmentTransactionAllOf incomeType(IncomeType incomeType) {
		this.incomeType = incomeType;
		return this;
	}

	/**
	 * Get incomeType
	 * 
	 * @return incomeType
	 */
	@ApiModelProperty(value = "")

	@Valid

	public IncomeType getIncomeType() {
		return incomeType;
	}

	public void setIncomeType(IncomeType incomeType) {
		this.incomeType = incomeType;
	}

	public InvestmentTransactionAllOf oldUnits(BigDecimal oldUnits) {
		this.oldUnits = oldUnits;
		return this;
	}

	/**
	 * Number of shares before split
	 * 
	 * @return oldUnits
	 */
	@ApiModelProperty(value = "Number of shares before split")

	@Valid

	public BigDecimal getOldUnits() {
		return oldUnits;
	}

	public void setOldUnits(BigDecimal oldUnits) {
		this.oldUnits = oldUnits;
	}

	public InvestmentTransactionAllOf splitRatioNumerator(BigDecimal splitRatioNumerator) {
		this.splitRatioNumerator = splitRatioNumerator;
		return this;
	}

	/**
	 * Split ratio numerator
	 * 
	 * @return splitRatioNumerator
	 */
	@ApiModelProperty(value = "Split ratio numerator")

	@Valid

	public BigDecimal getSplitRatioNumerator() {
		return splitRatioNumerator;
	}

	public void setSplitRatioNumerator(BigDecimal splitRatioNumerator) {
		this.splitRatioNumerator = splitRatioNumerator;
	}

	public InvestmentTransactionAllOf splitRatioDenominator(BigDecimal splitRatioDenominator) {
		this.splitRatioDenominator = splitRatioDenominator;
		return this;
	}

	/**
	 * Split ratio denominator
	 * 
	 * @return splitRatioDenominator
	 */
	@ApiModelProperty(value = "Split ratio denominator")

	@Valid

	public BigDecimal getSplitRatioDenominator() {
		return splitRatioDenominator;
	}

	public void setSplitRatioDenominator(BigDecimal splitRatioDenominator) {
		this.splitRatioDenominator = splitRatioDenominator;
	}

	public InvestmentTransactionAllOf newUnits(BigDecimal newUnits) {
		this.newUnits = newUnits;
		return this;
	}

	/**
	 * Number of shares after split
	 * 
	 * @return newUnits
	 */
	@ApiModelProperty(value = "Number of shares after split")

	@Valid

	public BigDecimal getNewUnits() {
		return newUnits;
	}

	public void setNewUnits(BigDecimal newUnits) {
		this.newUnits = newUnits;
	}

	public InvestmentTransactionAllOf subAccountSec(SubAccountType subAccountSec) {
		this.subAccountSec = subAccountSec;
		return this;
	}

	/**
	 * Get subAccountSec
	 * 
	 * @return subAccountSec
	 */
	@ApiModelProperty(value = "")

	@Valid

	public SubAccountType getSubAccountSec() {
		return subAccountSec;
	}

	public void setSubAccountSec(SubAccountType subAccountSec) {
		this.subAccountSec = subAccountSec;
	}

	public InvestmentTransactionAllOf subAccountFund(SubAccountType subAccountFund) {
		this.subAccountFund = subAccountFund;
		return this;
	}

	/**
	 * Get subAccountFund
	 * 
	 * @return subAccountFund
	 */
	@ApiModelProperty(value = "")

	@Valid

	public SubAccountType getSubAccountFund() {
		return subAccountFund;
	}

	public void setSubAccountFund(SubAccountType subAccountFund) {
		this.subAccountFund = subAccountFund;
	}

	public InvestmentTransactionAllOf loanId(String loanId) {
		this.loanId = loanId;
		return this;
	}

	/**
	 * For 401k accounts only. This indicates the transaction was due to a loan or a
	 * loan repayment
	 * 
	 * @return loanId
	 */
	@ApiModelProperty(value = "For 401k accounts only. This indicates the transaction was due to a loan or a loan repayment")

	public String getLoanId() {
		return loanId;
	}

	public void setLoanId(String loanId) {
		this.loanId = loanId;
	}

	public InvestmentTransactionAllOf loanPrincipal(BigDecimal loanPrincipal) {
		this.loanPrincipal = loanPrincipal;
		return this;
	}

	/**
	 * How much loan pre-payment is principal
	 * 
	 * @return loanPrincipal
	 */
	@ApiModelProperty(value = "How much loan pre-payment is principal")

	@Valid

	public BigDecimal getLoanPrincipal() {
		return loanPrincipal;
	}

	public void setLoanPrincipal(BigDecimal loanPrincipal) {
		this.loanPrincipal = loanPrincipal;
	}

	public InvestmentTransactionAllOf loanInterest(BigDecimal loanInterest) {
		this.loanInterest = loanInterest;
		return this;
	}

	/**
	 * How much loan pre-payment is interest
	 * 
	 * @return loanInterest
	 */
	@ApiModelProperty(value = "How much loan pre-payment is interest")

	@Valid

	public BigDecimal getLoanInterest() {
		return loanInterest;
	}

	public void setLoanInterest(BigDecimal loanInterest) {
		this.loanInterest = loanInterest;
	}

	public InvestmentTransactionAllOf payrollDate(java.sql.Timestamp payrollDate) {
		this.payrollDate = payrollDate;
		return this;
	}

	/**
	 * Get payrollDate
	 * 
	 * @return payrollDate
	 */
	@ApiModelProperty(value = "")

	@Valid

	public java.sql.Timestamp getPayrollDate() {
		return payrollDate;
	}

	public void setPayrollDate(java.sql.Timestamp payrollDate) {
		this.payrollDate = payrollDate;
	}

	public InvestmentTransactionAllOf priorYearContrib(Boolean priorYearContrib) {
		this.priorYearContrib = priorYearContrib;
		return this;
	}

	/**
	 * Indicates this buy was made using prior year's contribution
	 * 
	 * @return priorYearContrib
	 */
	@ApiModelProperty(value = "Indicates this buy was made using prior year's contribution")

	public Boolean getPriorYearContrib() {
		return priorYearContrib;
	}

	public void setPriorYearContrib(Boolean priorYearContrib) {
		this.priorYearContrib = priorYearContrib;
	}

	public InvestmentTransactionAllOf withholding(BigDecimal withholding) {
		this.withholding = withholding;
		return this;
	}

	/**
	 * Federal tax withholding
	 * 
	 * @return withholding
	 */
	@ApiModelProperty(value = "Federal tax withholding")

	@Valid

	public BigDecimal getWithholding() {
		return withholding;
	}

	public void setWithholding(BigDecimal withholding) {
		this.withholding = withholding;
	}

	public InvestmentTransactionAllOf taxExempt(Boolean taxExempt) {
		this.taxExempt = taxExempt;
		return this;
	}

	/**
	 * Tax-exempt transaction
	 * 
	 * @return taxExempt
	 */
	@ApiModelProperty(value = "Tax-exempt transaction")

	public Boolean getTaxExempt() {
		return taxExempt;
	}

	public void setTaxExempt(Boolean taxExempt) {
		this.taxExempt = taxExempt;
	}

	public InvestmentTransactionAllOf gain(BigDecimal gain) {
		this.gain = gain;
		return this;
	}

	/**
	 * For sales
	 * 
	 * @return gain
	 */
	@ApiModelProperty(value = "For sales")

	@Valid

	public BigDecimal getGain() {
		return gain;
	}

	public void setGain(BigDecimal gain) {
		this.gain = gain;
	}

	public InvestmentTransactionAllOf stateWithholding(BigDecimal stateWithholding) {
		this.stateWithholding = stateWithholding;
		return this;
	}

	/**
	 * State tax withholding
	 * 
	 * @return stateWithholding
	 */
	@ApiModelProperty(value = "State tax withholding")

	@Valid

	public BigDecimal getStateWithholding() {
		return stateWithholding;
	}

	public void setStateWithholding(BigDecimal stateWithholding) {
		this.stateWithholding = stateWithholding;
	}

	public InvestmentTransactionAllOf penalty(BigDecimal penalty) {
		this.penalty = penalty;
		return this;
	}

	/**
	 * Indicates amount withheld due to a penalty
	 * 
	 * @return penalty
	 */
	@ApiModelProperty(value = "Indicates amount withheld due to a penalty")

	@Valid

	public BigDecimal getPenalty() {
		return penalty;
	}

	public void setPenalty(BigDecimal penalty) {
		this.penalty = penalty;
	}

	public InvestmentTransactionAllOf runningBalance(BigDecimal runningBalance) {
		this.runningBalance = runningBalance;
		return this;
	}

	/**
	 * Running balance of the position
	 * 
	 * @return runningBalance
	 */
	@ApiModelProperty(value = "Running balance of the position")

	@Valid

	public BigDecimal getRunningBalance() {
		return runningBalance;
	}

	public void setRunningBalance(BigDecimal runningBalance) {
		this.runningBalance = runningBalance;
	}

	public InvestmentTransactionAllOf unitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
		return this;
	}

	/**
	 * Price per commonly-quoted unit. Does not include markup/markdown, unitprice.
	 * Share price for stocks, mutual funds, and others. Percentage of par for
	 * bonds. Per share (not contract) for options
	 * 
	 * @return unitPrice
	 */
	@ApiModelProperty(value = "Price per commonly-quoted unit. Does not include markup/markdown, unitprice. Share price for stocks, mutual funds, and others. Percentage of par for bonds. Per share (not contract) for options")

	@Valid

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	public InvestmentTransactionAllOf units(BigDecimal units) {
		this.units = units;
		return this;
	}

	/**
	 * For security-based actions other than stock splits, quantity. Shares for
	 * stocks, mutual funds, and others. Face value for bonds. Contracts for options
	 * 
	 * @return units
	 */
	@ApiModelProperty(value = "For security-based actions other than stock splits, quantity. Shares for stocks, mutual funds, and others. Face value for bonds. Contracts for options")

	@Valid

	public BigDecimal getUnits() {
		return units;
	}

	public void setUnits(BigDecimal units) {
		this.units = units;
	}

	public InvestmentTransactionAllOf unitType(UnitType unitType) {
		this.unitType = unitType;
		return this;
	}

	/**
	 * Get unitType
	 * 
	 * @return unitType
	 */
	@ApiModelProperty(value = "")

	@Valid

	public UnitType getUnitType() {
		return unitType;
	}

	public void setUnitType(UnitType unitType) {
		this.unitType = unitType;
	}

	public InvestmentTransactionAllOf transactionReason(TransactionReason transactionReason) {
		this.transactionReason = transactionReason;
		return this;
	}

	/**
	 * Get transactionReason
	 * 
	 * @return transactionReason
	 */
	@ApiModelProperty(value = "")

	@Valid

	public TransactionReason getTransactionReason() {
		return transactionReason;
	}

	public void setTransactionReason(TransactionReason transactionReason) {
		this.transactionReason = transactionReason;
	}

	public InvestmentTransactionAllOf accruedInterest(BigDecimal accruedInterest) {
		this.accruedInterest = accruedInterest;
		return this;
	}

	/**
	 * Accrued interest
	 * 
	 * @return accruedInterest
	 */
	@ApiModelProperty(value = "Accrued interest")

	@Valid

	public BigDecimal getAccruedInterest() {
		return accruedInterest;
	}

	public void setAccruedInterest(BigDecimal accruedInterest) {
		this.accruedInterest = accruedInterest;
	}

	public InvestmentTransactionAllOf transferAction(TransferActionEnum transferAction) {
		this.transferAction = transferAction;
		return this;
	}

	/**
	 * Transfer direction
	 * 
	 * @return transferAction
	 */
	@ApiModelProperty(value = "Transfer direction")

	public TransferActionEnum getTransferAction() {
		return transferAction;
	}

	public void setTransferAction(TransferActionEnum transferAction) {
		this.transferAction = transferAction;
	}

	public InvestmentTransactionAllOf positionType(PositionType positionType) {
		this.positionType = positionType;
		return this;
	}

	/**
	 * Get positionType
	 * 
	 * @return positionType
	 */
	@ApiModelProperty(value = "")

	@Valid

	public PositionType getPositionType() {
		return positionType;
	}

	public void setPositionType(PositionType positionType) {
		this.positionType = positionType;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		InvestmentTransactionAllOf investmentTransactionAllOf = (InvestmentTransactionAllOf) o;
		return Objects.equals(this.transactionType, investmentTransactionAllOf.transactionType)
				&& Objects.equals(this.shares, investmentTransactionAllOf.shares)
				&& Objects.equals(this.faceValue, investmentTransactionAllOf.faceValue)
				&& Objects.equals(this.price, investmentTransactionAllOf.price)
				&& Objects.equals(this.securityId, investmentTransactionAllOf.securityId)
				&& Objects.equals(this.securityIdType, investmentTransactionAllOf.securityIdType)
				&& Objects.equals(this.securityType, investmentTransactionAllOf.securityType)
				&& Objects.equals(this.symbol, investmentTransactionAllOf.symbol)
				&& Objects.equals(this.markup, investmentTransactionAllOf.markup)
				&& Objects.equals(this.commission, investmentTransactionAllOf.commission)
				&& Objects.equals(this.taxes, investmentTransactionAllOf.taxes)
				&& Objects.equals(this.fees, investmentTransactionAllOf.fees)
				&& Objects.equals(this.load, investmentTransactionAllOf.load)
				&& Objects.equals(this.inv401kSource, investmentTransactionAllOf.inv401kSource)
				&& Objects.equals(this.confirmationNumber, investmentTransactionAllOf.confirmationNumber)
				&& Objects.equals(this.fractionalCash, investmentTransactionAllOf.fractionalCash)
				&& Objects.equals(this.incomeType, investmentTransactionAllOf.incomeType)
				&& Objects.equals(this.oldUnits, investmentTransactionAllOf.oldUnits)
				&& Objects.equals(this.splitRatioNumerator, investmentTransactionAllOf.splitRatioNumerator)
				&& Objects.equals(this.splitRatioDenominator, investmentTransactionAllOf.splitRatioDenominator)
				&& Objects.equals(this.newUnits, investmentTransactionAllOf.newUnits)
				&& Objects.equals(this.subAccountSec, investmentTransactionAllOf.subAccountSec)
				&& Objects.equals(this.subAccountFund, investmentTransactionAllOf.subAccountFund)
				&& Objects.equals(this.loanId, investmentTransactionAllOf.loanId)
				&& Objects.equals(this.loanPrincipal, investmentTransactionAllOf.loanPrincipal)
				&& Objects.equals(this.loanInterest, investmentTransactionAllOf.loanInterest)
				&& Objects.equals(this.payrollDate, investmentTransactionAllOf.payrollDate)
				&& Objects.equals(this.priorYearContrib, investmentTransactionAllOf.priorYearContrib)
				&& Objects.equals(this.withholding, investmentTransactionAllOf.withholding)
				&& Objects.equals(this.taxExempt, investmentTransactionAllOf.taxExempt)
				&& Objects.equals(this.gain, investmentTransactionAllOf.gain)
				&& Objects.equals(this.stateWithholding, investmentTransactionAllOf.stateWithholding)
				&& Objects.equals(this.penalty, investmentTransactionAllOf.penalty)
				&& Objects.equals(this.runningBalance, investmentTransactionAllOf.runningBalance)
				&& Objects.equals(this.unitPrice, investmentTransactionAllOf.unitPrice)
				&& Objects.equals(this.units, investmentTransactionAllOf.units)
				&& Objects.equals(this.unitType, investmentTransactionAllOf.unitType)
				&& Objects.equals(this.transactionReason, investmentTransactionAllOf.transactionReason)
				&& Objects.equals(this.accruedInterest, investmentTransactionAllOf.accruedInterest)
				&& Objects.equals(this.transferAction, investmentTransactionAllOf.transferAction)
				&& Objects.equals(this.positionType, investmentTransactionAllOf.positionType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(transactionType, shares, faceValue, price, securityId, securityIdType, securityType, symbol,
				markup, commission, taxes, fees, load, inv401kSource, confirmationNumber, fractionalCash, incomeType,
				oldUnits, splitRatioNumerator, splitRatioDenominator, newUnits, subAccountSec, subAccountFund, loanId,
				loanPrincipal, loanInterest, payrollDate, priorYearContrib, withholding, taxExempt, gain,
				stateWithholding, penalty, runningBalance, unitPrice, units, unitType, transactionReason,
				accruedInterest, transferAction, positionType);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class InvestmentTransactionAllOf {\n");

		sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
		sb.append("    shares: ").append(toIndentedString(shares)).append("\n");
		sb.append("    faceValue: ").append(toIndentedString(faceValue)).append("\n");
		sb.append("    price: ").append(toIndentedString(price)).append("\n");
		sb.append("    securityId: ").append(toIndentedString(securityId)).append("\n");
		sb.append("    securityIdType: ").append(toIndentedString(securityIdType)).append("\n");
		sb.append("    securityType: ").append(toIndentedString(securityType)).append("\n");
		sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
		sb.append("    markup: ").append(toIndentedString(markup)).append("\n");
		sb.append("    commission: ").append(toIndentedString(commission)).append("\n");
		sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
		sb.append("    fees: ").append(toIndentedString(fees)).append("\n");
		sb.append("    load: ").append(toIndentedString(load)).append("\n");
		sb.append("    inv401kSource: ").append(toIndentedString(inv401kSource)).append("\n");
		sb.append("    confirmationNumber: ").append(toIndentedString(confirmationNumber)).append("\n");
		sb.append("    fractionalCash: ").append(toIndentedString(fractionalCash)).append("\n");
		sb.append("    incomeType: ").append(toIndentedString(incomeType)).append("\n");
		sb.append("    oldUnits: ").append(toIndentedString(oldUnits)).append("\n");
		sb.append("    splitRatioNumerator: ").append(toIndentedString(splitRatioNumerator)).append("\n");
		sb.append("    splitRatioDenominator: ").append(toIndentedString(splitRatioDenominator)).append("\n");
		sb.append("    newUnits: ").append(toIndentedString(newUnits)).append("\n");
		sb.append("    subAccountSec: ").append(toIndentedString(subAccountSec)).append("\n");
		sb.append("    subAccountFund: ").append(toIndentedString(subAccountFund)).append("\n");
		sb.append("    loanId: ").append(toIndentedString(loanId)).append("\n");
		sb.append("    loanPrincipal: ").append(toIndentedString(loanPrincipal)).append("\n");
		sb.append("    loanInterest: ").append(toIndentedString(loanInterest)).append("\n");
		sb.append("    payrollDate: ").append(toIndentedString(payrollDate)).append("\n");
		sb.append("    priorYearContrib: ").append(toIndentedString(priorYearContrib)).append("\n");
		sb.append("    withholding: ").append(toIndentedString(withholding)).append("\n");
		sb.append("    taxExempt: ").append(toIndentedString(taxExempt)).append("\n");
		sb.append("    gain: ").append(toIndentedString(gain)).append("\n");
		sb.append("    stateWithholding: ").append(toIndentedString(stateWithholding)).append("\n");
		sb.append("    penalty: ").append(toIndentedString(penalty)).append("\n");
		sb.append("    runningBalance: ").append(toIndentedString(runningBalance)).append("\n");
		sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
		sb.append("    units: ").append(toIndentedString(units)).append("\n");
		sb.append("    unitType: ").append(toIndentedString(unitType)).append("\n");
		sb.append("    transactionReason: ").append(toIndentedString(transactionReason)).append("\n");
		sb.append("    accruedInterest: ").append(toIndentedString(accruedInterest)).append("\n");
		sb.append("    transferAction: ").append(toIndentedString(transferAction)).append("\n");
		sb.append("    positionType: ").append(toIndentedString(positionType)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
