package com.fdx.api.model46.modelimpl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.OptBoolean;
import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fdx.api.model46.config.ConnectionConfigApi46;
import com.fdx.api.model46.mapper.FiAttrRowMapper;
import com.fdx.api.model46.mapper.HoldingRowMapper;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A holding in an investment account
 */
@ApiModel(description = "A holding in an investment account")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Holding {

	NamedParameterJdbcTemplate template;

	@JsonProperty("holdingId")
	private String holdingId;

	@JsonProperty("securityId")
	private String securityId;

	@JsonProperty("securityIdType")
	private SecurityIdType securityIdType;

	@JsonProperty("holdingName")
	private String holdingName;

	@JsonProperty("holdingType")
	private HoldingType holdingType;

	@JsonProperty("holdingSubType")
	private HoldingSubType holdingSubType;

	@JsonProperty("positionType")
	private PositionType positionType;

	@JsonProperty("heldInAccount")
	private HeldInAccount heldInAccount;

	@JsonProperty("description")
	private String description;

	@JsonProperty("symbol")
	private String symbol;

	@JsonProperty("originalPurchaseDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, lenient = OptBoolean.FALSE)
	private java.sql.Timestamp originalPurchaseDate;

	@JsonProperty("purchasedPrice")
	private BigDecimal purchasedPrice;

	@JsonProperty("currentUnitPrice")
	private BigDecimal currentUnitPrice;

	@JsonProperty("changeInPrice")
	private BigDecimal changeInPrice;

	@JsonProperty("currentUnitPriceDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, lenient = OptBoolean.FALSE)
	private java.sql.Timestamp currentUnitPriceDate;

	@JsonProperty("units")
	private BigDecimal units;

	@JsonProperty("marketValue")
	private BigDecimal marketValue;

	@JsonProperty("faceValue")
	private BigDecimal faceValue;

	@JsonProperty("averageCost")
	@JsonInclude(Include.NON_NULL)
	private Boolean averageCost;

	@JsonProperty("cashAccount")
	@JsonInclude(Include.NON_NULL)
	private Boolean cashAccount;

	@JsonProperty("rate")
	private BigDecimal rate;

	@JsonProperty("expirationDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, lenient = OptBoolean.FALSE)
	private java.sql.Timestamp expirationDate;

	@JsonProperty("inv401kSurce")
	private Inv401kSourceType inv401kSurce;

	@JsonProperty("inv401kSource")
	private Inv401kSourceType inv401kSource;

	@JsonProperty("currency")
	private Currency currency;

	@JsonProperty("assetClasses")
	@Valid
	private List<Portion> assetClasses = null;

	@JsonProperty("fiAssetClasses")
	@Valid
	private List<FiPortion> fiAssetClasses = null;

	@JsonProperty("fiAttributes")
	@Valid
	private List<FiAttribute> fiAttributes = null;

	@JsonProperty("taxLots")
	@Valid
	private List<TaxLot> taxLots = null;

	@JsonProperty("mutualFundSecurity")
	private MutualFundSecurity mutualFundSecurity;

	@JsonProperty("optionSecurity")
	private OptionSecurity optionSecurity;

	@JsonProperty("otherSecurity")
	private OtherSecurity otherSecurity;

	@JsonProperty("stockSecurity")
	private StockSecurity stockSecurity;

	@JsonProperty("sweepSecurity")
	private SweepSecurity sweepSecurity;

	@JsonProperty("debtSecurity")
	private DebtSecurity debtSecurity;

	public Holding holdingId(String holdingId) {
		this.holdingId = holdingId;
		return this;
	}

	/**
	 * Value for a unique identifier
	 * 
	 * @return holdingId
	 */
	@ApiModelProperty(value = "Value for a unique identifier")

	@Size(max = 256)
	public String getHoldingId() {
		return holdingId;
	}

	public void setHoldingId(String holdingId) {
		this.holdingId = holdingId;
	}

	public Holding securityId(String securityId) {
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

	public Holding securityIdType(SecurityIdType securityIdType) {
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

	public Holding holdingName(String holdingName) {
		this.holdingName = holdingName;
		return this;
	}

	/**
	 * Holding name or security name
	 * 
	 * @return holdingName
	 */
	@ApiModelProperty(value = "Holding name or security name")

	public String getHoldingName() {
		return holdingName;
	}

	public void setHoldingName(String holdingName) {
		this.holdingName = holdingName;
	}

	public Holding holdingType(HoldingType holdingType) {
		this.holdingType = holdingType;
		return this;
	}

	/**
	 * Get holdingType
	 * 
	 * @return holdingType
	 */
	@ApiModelProperty(value = "")

	@Valid

	public HoldingType getHoldingType() {
		return holdingType;
	}

	public void setHoldingType(HoldingType holdingType) {
		this.holdingType = holdingType;
	}

	public Holding holdingSubType(HoldingSubType holdingSubType) {
		this.holdingSubType = holdingSubType;
		return this;
	}

	/**
	 * Get holdingSubType
	 * 
	 * @return holdingSubType
	 */
	@ApiModelProperty(value = "")

	@Valid

	public HoldingSubType getHoldingSubType() {
		return holdingSubType;
	}

	public void setHoldingSubType(HoldingSubType holdingSubType) {
		this.holdingSubType = holdingSubType;
	}

	public Holding positionType(PositionType positionType) {
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

	public Holding heldInAccount(HeldInAccount heldInAccount) {
		this.heldInAccount = heldInAccount;
		return this;
	}

	/**
	 * Get heldInAccount
	 * 
	 * @return heldInAccount
	 */
	@ApiModelProperty(value = "")

	@Valid

	public HeldInAccount getHeldInAccount() {
		return heldInAccount;
	}

	public void setHeldInAccount(HeldInAccount heldInAccount) {
		this.heldInAccount = heldInAccount;
	}

	public Holding description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * The description of the holding
	 * 
	 * @return description
	 */
	@ApiModelProperty(value = "The description of the holding")

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Holding symbol(String symbol) {
		this.symbol = symbol;
		return this;
	}

	/**
	 * Ticker / Market symbol
	 * 
	 * @return symbol
	 */
	@ApiModelProperty(value = "Ticker / Market symbol")

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public Holding originalPurchaseDate(java.sql.Timestamp originalPurchaseDate) {
		this.originalPurchaseDate = originalPurchaseDate;
		return this;
	}

	/**
	 * Get originalPurchaseDate
	 * 
	 * @return originalPurchaseDate
	 */
	@ApiModelProperty(value = "")

	@Valid

	public java.sql.Timestamp getOriginalPurchaseDate() {
		return originalPurchaseDate;
	}

	public void setOriginalPurchaseDate(java.sql.Timestamp originalPurchaseDate) {
		this.originalPurchaseDate = originalPurchaseDate;
	}

	public Holding purchasedPrice(BigDecimal purchasedPrice) {
		this.purchasedPrice = purchasedPrice;
		return this;
	}

	/**
	 * Price of holding at the time of purchase
	 * 
	 * @return purchasedPrice
	 */
	@ApiModelProperty(value = "Price of holding at the time of purchase")

	@Valid

	public BigDecimal getPurchasedPrice() {
		return purchasedPrice;
	}

	public void setPurchasedPrice(BigDecimal purchasedPrice) {
		this.purchasedPrice = purchasedPrice;
	}

	public Holding currentUnitPrice(BigDecimal currentUnitPrice) {
		this.currentUnitPrice = currentUnitPrice;
		return this;
	}

	/**
	 * Current unit price
	 * 
	 * @return currentUnitPrice
	 */
	@ApiModelProperty(value = "Current unit price")

	@Valid

	public BigDecimal getCurrentUnitPrice() {
		return currentUnitPrice;
	}

	public void setCurrentUnitPrice(BigDecimal currentUnitPrice) {
		this.currentUnitPrice = currentUnitPrice;
	}

	public Holding changeInPrice(BigDecimal changeInPrice) {
		this.changeInPrice = changeInPrice;
		return this;
	}

	/**
	 * Change in current price compared to previous day's close
	 * 
	 * @return changeInPrice
	 */
	@ApiModelProperty(value = "Change in current price compared to previous day's close")

	@Valid

	public BigDecimal getChangeInPrice() {
		return changeInPrice;
	}

	public void setChangeInPrice(BigDecimal changeInPrice) {
		this.changeInPrice = changeInPrice;
	}

	public Holding currentUnitPriceDate(java.sql.Timestamp currentUnitPriceDate) {
		this.currentUnitPriceDate = currentUnitPriceDate;
		return this;
	}

	/**
	 * Get currentUnitPriceDate
	 * 
	 * @return currentUnitPriceDate
	 */
	@ApiModelProperty(value = "")

	@Valid

	public java.sql.Timestamp getCurrentUnitPriceDate() {
		return currentUnitPriceDate;
	}

	public void setCurrentUnitPriceDate(java.sql.Timestamp currentUnitPriceDate) {
		this.currentUnitPriceDate = currentUnitPriceDate;
	}

	public Holding units(BigDecimal units) {
		this.units = units;
		return this;
	}

	/**
	 * Required for stock, mutual funds. Number of shares (with decimals)
	 * 
	 * @return units
	 */
	@ApiModelProperty(value = "Required for stock, mutual funds. Number of shares (with decimals)")

	@Valid

	public BigDecimal getUnits() {
		return units;
	}

	public void setUnits(BigDecimal units) {
		this.units = units;
	}

	public Holding marketValue(BigDecimal marketValue) {
		this.marketValue = marketValue;
		return this;
	}

	/**
	 * Market value at the time of data retrieved
	 * 
	 * @return marketValue
	 */
	@ApiModelProperty(value = "Market value at the time of data retrieved")

	@Valid

	public BigDecimal getMarketValue() {
		return marketValue;
	}

	public void setMarketValue(BigDecimal marketValue) {
		this.marketValue = marketValue;
	}

	public Holding faceValue(BigDecimal faceValue) {
		this.faceValue = faceValue;
		return this;
	}

	/**
	 * Required for bonds. Face value at the time of data retrieved
	 * 
	 * @return faceValue
	 */
	@ApiModelProperty(value = "Required for bonds. Face value at the time of data retrieved")

	@Valid

	public BigDecimal getFaceValue() {
		return faceValue;
	}

	public void setFaceValue(BigDecimal faceValue) {
		this.faceValue = faceValue;
	}

	public Holding averageCost(Boolean averageCost) {
		this.averageCost = averageCost;
		return this;
	}

	/**
	 * Cost is average of all purchases for holding
	 * 
	 * @return averageCost
	 */
	@ApiModelProperty(value = "Cost is average of all purchases for holding")

	public Boolean getAverageCost() {
		return averageCost;
	}

	public void setAverageCost(Boolean averageCost) {
		this.averageCost = averageCost;
	}

	public Holding cashAccount(Boolean cashAccount) {
		this.cashAccount = cashAccount;
		return this;
	}

	/**
	 * If true, indicates that this holding is used to maintain proceeds from sales,
	 * dividends, and other cash postings to the investment account
	 * 
	 * @return cashAccount
	 */
	@ApiModelProperty(value = "If true, indicates that this holding is used to maintain proceeds from sales, dividends, and other cash postings to the investment account")

	public Boolean getCashAccount() {
		return cashAccount;
	}

	public void setCashAccount(Boolean cashAccount) {
		this.cashAccount = cashAccount;
	}

	public Holding rate(BigDecimal rate) {
		this.rate = rate;
		return this;
	}

	/**
	 * For CDs, bonds, and other rate based holdings
	 * 
	 * @return rate
	 */
	@ApiModelProperty(value = "For CDs, bonds, and other rate based holdings")

	@Valid

	public BigDecimal getRate() {
		return rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	public Holding expirationDate(java.sql.Timestamp expirationDate) {
		this.expirationDate = expirationDate;
		return this;
	}

	/**
	 * Get expirationDate
	 * 
	 * @return expirationDate
	 */
	@ApiModelProperty(value = "")

	@Valid

	public java.sql.Timestamp getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(java.sql.Timestamp expirationDate) {
		this.expirationDate = expirationDate;
	}

	public Holding inv401kSurce(Inv401kSourceType inv401kSurce) {
		this.inv401kSurce = inv401kSurce;
		return this;
	}

	/**
	 * Get inv401kSurce
	 * 
	 * @return inv401kSurce
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Inv401kSourceType getInv401kSurce() {
		return inv401kSurce;
	}

	public void setInv401kSurce(Inv401kSourceType inv401kSurce) {
		this.inv401kSurce = inv401kSurce;
	}

	public Holding inv401kSource(Inv401kSourceType inv401kSource) {
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

	public Holding currency(Currency currency) {
		this.currency = currency;
		return this;
	}

	/**
	 * Get currency
	 * 
	 * @return currency
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public Holding assetClasses(List<Portion> assetClasses) {
		this.assetClasses = assetClasses;
		return this;
	}

	public Holding addAssetClassesItem(Portion assetClassesItem) {
		if (this.assetClasses == null) {
			this.assetClasses = new ArrayList<>();
		}
		this.assetClasses.add(assetClassesItem);
		return this;
	}

	/**
	 * Percent breakdown by asset class
	 * 
	 * @return assetClasses
	 */
	@ApiModelProperty(value = "Percent breakdown by asset class")

	@Valid

	public List<Portion> getAssetClasses() {
		return assetClasses;
	}

	public void setAssetClasses(List<Portion> assetClasses) {
		this.assetClasses = assetClasses;
	}

	public Holding fiAssetClasses(List<FiPortion> fiAssetClasses) {
		this.fiAssetClasses = fiAssetClasses;
		return this;
	}

	public Holding addFiAssetClassesItem(FiPortion fiAssetClassesItem) {
		if (this.fiAssetClasses == null) {
			this.fiAssetClasses = new ArrayList<>();
		}
		this.fiAssetClasses.add(fiAssetClassesItem);
		return this;
	}

	/**
	 * Percent breakdown by FI-specific asset class percentage breakdown
	 * 
	 * @return fiAssetClasses
	 */
	@ApiModelProperty(value = "Percent breakdown by FI-specific asset class percentage breakdown")

	@Valid

	public List<FiPortion> getFiAssetClasses() {
		return fiAssetClasses;
	}

	public void setFiAssetClasses(List<FiPortion> fiAssetClasses) {
		this.fiAssetClasses = fiAssetClasses;
	}

	public Holding fiAttributes(List<FiAttribute> fiAttributes) {
		this.fiAttributes = fiAttributes;
		return this;
	}

	public Holding addFiAttributesItem(FiAttribute fiAttributesItem) {
		if (this.fiAttributes == null) {
			this.fiAttributes = new ArrayList<>();
		}
		this.fiAttributes.add(fiAttributesItem);
		return this;
	}

	/**
	 * Array of FI-specific attributes
	 * 
	 * @return fiAttributes
	 */
	@ApiModelProperty(value = "Array of FI-specific attributes")

	@Valid

	public List<FiAttribute> getFiAttributes() {
		return fiAttributes;
	}

	public void setFiAttributes(List<FiAttribute> fiAttributes) {
		this.fiAttributes = fiAttributes;
	}

	public Holding taxLots(List<TaxLot> taxLots) {
		this.taxLots = taxLots;
		return this;
	}

	public Holding addTaxLotsItem(TaxLot taxLotsItem) {
		if (this.taxLots == null) {
			this.taxLots = new ArrayList<>();
		}
		this.taxLots.add(taxLotsItem);
		return this;
	}

	/**
	 * Breakdown by tax lot
	 * 
	 * @return taxLots
	 */
	@ApiModelProperty(value = "Breakdown by tax lot")

	@Valid

	public List<TaxLot> getTaxLots() {
		return taxLots;
	}

	public void setTaxLots(List<TaxLot> taxLots) {
		this.taxLots = taxLots;
	}

	public Holding mutualFundSecurity(MutualFundSecurity mutualFundSecurity) {
		this.mutualFundSecurity = mutualFundSecurity;
		return this;
	}

	/**
	 * Get mutualFundSecurity
	 * 
	 * @return mutualFundSecurity
	 */
	@ApiModelProperty(value = "")

	@Valid

	public MutualFundSecurity getMutualFundSecurity() {
		return mutualFundSecurity;
	}

	public void setMutualFundSecurity(MutualFundSecurity mutualFundSecurity) {
		this.mutualFundSecurity = mutualFundSecurity;
	}

	public Holding optionSecurity(OptionSecurity optionSecurity) {
		this.optionSecurity = optionSecurity;
		return this;
	}

	/**
	 * Get optionSecurity
	 * 
	 * @return optionSecurity
	 */
	@ApiModelProperty(value = "")

	@Valid

	public OptionSecurity getOptionSecurity() {
		return optionSecurity;
	}

	public void setOptionSecurity(OptionSecurity optionSecurity) {
		this.optionSecurity = optionSecurity;
	}

	public Holding otherSecurity(OtherSecurity otherSecurity) {
		this.otherSecurity = otherSecurity;
		return this;
	}

	/**
	 * Get otherSecurity
	 * 
	 * @return otherSecurity
	 */
	@ApiModelProperty(value = "")

	@Valid

	public OtherSecurity getOtherSecurity() {
		return otherSecurity;
	}

	public void setOtherSecurity(OtherSecurity otherSecurity) {
		this.otherSecurity = otherSecurity;
	}

	public Holding stockSecurity(StockSecurity stockSecurity) {
		this.stockSecurity = stockSecurity;
		return this;
	}

	/**
	 * Get stockSecurity
	 * 
	 * @return stockSecurity
	 */
	@ApiModelProperty(value = "")

	@Valid

	public StockSecurity getStockSecurity() {
		return stockSecurity;
	}

	public void setStockSecurity(StockSecurity stockSecurity) {
		this.stockSecurity = stockSecurity;
	}

	public Holding sweepSecurity(SweepSecurity sweepSecurity) {
		this.sweepSecurity = sweepSecurity;
		return this;
	}

	/**
	 * Get sweepSecurity
	 * 
	 * @return sweepSecurity
	 */
	@ApiModelProperty(value = "")

	@Valid

	public SweepSecurity getSweepSecurity() {
		return sweepSecurity;
	}

	public void setSweepSecurity(SweepSecurity sweepSecurity) {
		this.sweepSecurity = sweepSecurity;
	}

	public Holding debtSecurity(DebtSecurity debtSecurity) {
		this.debtSecurity = debtSecurity;
		return this;
	}

	/**
	 * Get debtSecurity
	 * 
	 * @return debtSecurity
	 */
	@ApiModelProperty(value = "")

	@Valid

	public DebtSecurity getDebtSecurity() {
		return debtSecurity;
	}

	public void setDebtSecurity(DebtSecurity debtSecurity) {
		this.debtSecurity = debtSecurity;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Holding holding = (Holding) o;
		return Objects.equals(this.holdingId, holding.holdingId) && Objects.equals(this.securityId, holding.securityId)
				&& Objects.equals(this.securityIdType, holding.securityIdType)
				&& Objects.equals(this.holdingName, holding.holdingName)
				&& Objects.equals(this.holdingType, holding.holdingType)
				&& Objects.equals(this.holdingSubType, holding.holdingSubType)
				&& Objects.equals(this.positionType, holding.positionType)
				&& Objects.equals(this.heldInAccount, holding.heldInAccount)
				&& Objects.equals(this.description, holding.description) && Objects.equals(this.symbol, holding.symbol)
				&& Objects.equals(this.originalPurchaseDate, holding.originalPurchaseDate)
				&& Objects.equals(this.purchasedPrice, holding.purchasedPrice)
				&& Objects.equals(this.currentUnitPrice, holding.currentUnitPrice)
				&& Objects.equals(this.changeInPrice, holding.changeInPrice)
				&& Objects.equals(this.currentUnitPriceDate, holding.currentUnitPriceDate)
				&& Objects.equals(this.units, holding.units) && Objects.equals(this.marketValue, holding.marketValue)
				&& Objects.equals(this.faceValue, holding.faceValue)
				&& Objects.equals(this.averageCost, holding.averageCost)
				&& Objects.equals(this.cashAccount, holding.cashAccount) && Objects.equals(this.rate, holding.rate)
				&& Objects.equals(this.expirationDate, holding.expirationDate)
				&& Objects.equals(this.inv401kSurce, holding.inv401kSurce)
				&& Objects.equals(this.inv401kSource, holding.inv401kSource)
				&& Objects.equals(this.currency, holding.currency)
				&& Objects.equals(this.assetClasses, holding.assetClasses)
				&& Objects.equals(this.fiAssetClasses, holding.fiAssetClasses)
				&& Objects.equals(this.fiAttributes, holding.fiAttributes)
				&& Objects.equals(this.taxLots, holding.taxLots)
				&& Objects.equals(this.mutualFundSecurity, holding.mutualFundSecurity)
				&& Objects.equals(this.optionSecurity, holding.optionSecurity)
				&& Objects.equals(this.otherSecurity, holding.otherSecurity)
				&& Objects.equals(this.stockSecurity, holding.stockSecurity)
				&& Objects.equals(this.sweepSecurity, holding.sweepSecurity)
				&& Objects.equals(this.debtSecurity, holding.debtSecurity);
	}

	@Override
	public int hashCode() {
		return Objects.hash(holdingId, securityId, securityIdType, holdingName, holdingType, holdingSubType,
				positionType, heldInAccount, description, symbol, originalPurchaseDate, purchasedPrice,
				currentUnitPrice, changeInPrice, currentUnitPriceDate, units, marketValue, faceValue, averageCost,
				cashAccount, rate, expirationDate, inv401kSurce, inv401kSource, currency, assetClasses, fiAssetClasses,
				fiAttributes, taxLots, mutualFundSecurity, optionSecurity, otherSecurity, stockSecurity, sweepSecurity,
				debtSecurity);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Holding {\n");

		sb.append("    holdingId: ").append(toIndentedString(holdingId)).append("\n");
		sb.append("    securityId: ").append(toIndentedString(securityId)).append("\n");
		sb.append("    securityIdType: ").append(toIndentedString(securityIdType)).append("\n");
		sb.append("    holdingName: ").append(toIndentedString(holdingName)).append("\n");
		sb.append("    holdingType: ").append(toIndentedString(holdingType)).append("\n");
		sb.append("    holdingSubType: ").append(toIndentedString(holdingSubType)).append("\n");
		sb.append("    positionType: ").append(toIndentedString(positionType)).append("\n");
		sb.append("    heldInAccount: ").append(toIndentedString(heldInAccount)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
		sb.append("    originalPurchaseDate: ").append(toIndentedString(originalPurchaseDate)).append("\n");
		sb.append("    purchasedPrice: ").append(toIndentedString(purchasedPrice)).append("\n");
		sb.append("    currentUnitPrice: ").append(toIndentedString(currentUnitPrice)).append("\n");
		sb.append("    changeInPrice: ").append(toIndentedString(changeInPrice)).append("\n");
		sb.append("    currentUnitPriceDate: ").append(toIndentedString(currentUnitPriceDate)).append("\n");
		sb.append("    units: ").append(toIndentedString(units)).append("\n");
		sb.append("    marketValue: ").append(toIndentedString(marketValue)).append("\n");
		sb.append("    faceValue: ").append(toIndentedString(faceValue)).append("\n");
		sb.append("    averageCost: ").append(toIndentedString(averageCost)).append("\n");
		sb.append("    cashAccount: ").append(toIndentedString(cashAccount)).append("\n");
		sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
		sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
		sb.append("    inv401kSurce: ").append(toIndentedString(inv401kSurce)).append("\n");
		sb.append("    inv401kSource: ").append(toIndentedString(inv401kSource)).append("\n");
		sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
		sb.append("    assetClasses: ").append(toIndentedString(assetClasses)).append("\n");
		sb.append("    fiAssetClasses: ").append(toIndentedString(fiAssetClasses)).append("\n");
		sb.append("    fiAttributes: ").append(toIndentedString(fiAttributes)).append("\n");
		sb.append("    taxLots: ").append(toIndentedString(taxLots)).append("\n");
		sb.append("    mutualFundSecurity: ").append(toIndentedString(mutualFundSecurity)).append("\n");
		sb.append("    optionSecurity: ").append(toIndentedString(optionSecurity)).append("\n");
		sb.append("    otherSecurity: ").append(toIndentedString(otherSecurity)).append("\n");
		sb.append("    stockSecurity: ").append(toIndentedString(stockSecurity)).append("\n");
		sb.append("    sweepSecurity: ").append(toIndentedString(sweepSecurity)).append("\n");
		sb.append("    debtSecurity: ").append(toIndentedString(debtSecurity)).append("\n");
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

	private static final Logger log = LoggerFactory.getLogger(Holding.class);

	public Holding getHoldings(String holdingId) throws FDXException {
		
		template = ConnectionConfigApi46.getTemplate();;
		Currency currency = new Currency();
		SqlParameterSource parameters = new MapSqlParameterSource("holdingId", holdingId);
		Holding holding = new Holding();
		try {
			holding = template.queryForObject("select * from "+ DeveloperContext.getDeveloperSchema() +".holding where holdingId in (:holdingId)",
					parameters, new HoldingRowMapper());

//		Portion starts		
			if (holding.getAssetClasses() != null) {
				List<Portion> portionList = holding.getAssetClasses();
				List<Portion> portionListNew = new ArrayList<>();
				for (Portion portion : portionList) {
					Portion portionNew = new Portion();
					portionNew = portion.getPortionDetails(portion.getPortionId());
					portionListNew.add(portionNew);
				}
				holding.setAssetClasses(portionListNew);
			}
//		Portion ends
			if (holding.getCurrency() != null)
				holding.setCurrency(currency.getCurrency(holding.getCurrency().getCurrencyCode().toString()));

			if (holding.getDebtSecurity() != null) {
				debtSecurity = holding.getDebtSecurity();
				holding.setDebtSecurity(debtSecurity.getDebtSecurity(holding.getDebtSecurity().getDebtSecurityId()));
			}
//		FiPortion starts		
			if (holding.getFiAssetClasses() != null) {
				List<FiPortion> fiPortionList = holding.getFiAssetClasses();
				List<FiPortion> fiPortionListNew = new ArrayList<>();
				for (FiPortion fiPortion : fiPortionList) {
					FiPortion fiPortionNew = new FiPortion();
					fiPortionNew = fiPortion.getPortionDetails(fiPortion.getPortionId());
					fiPortionListNew.add(fiPortionNew);
				}
				holding.setFiAssetClasses(fiPortionListNew);
			}
//		FiPortion ends

//		FiAttributes Starts
			if (holding.getFiAttributes() != null) {
				List<FiAttribute> fiAttrList = holding.getFiAttributes();
				List<FiAttribute> fiAttrListNew = new ArrayList<>();

				if (fiAttrList != null) {
					for (FiAttribute fiAttribute : fiAttrList) {
						FiAttrEntity fiAttrEntity = new FiAttrEntity();
						FiAttribute fiAttributeNew = new FiAttribute();

						int name = Integer.valueOf(fiAttribute.getName()).intValue();
						parameters = new MapSqlParameterSource("fiAttributes", name);
						fiAttrEntity = (FiAttrEntity) template.queryForObject(
								"select * from "+ DeveloperContext.getDeveloperSchema() +".fiattribute where attrid in (:fiAttributes)", parameters,
								new FiAttrRowMapper());

						fiAttributeNew.setName(fiAttrEntity.getName());
						fiAttributeNew.setValue(fiAttrEntity.getValue());
						fiAttrListNew.add(fiAttributeNew);
					}
					holding.setFiAttributes(fiAttrListNew);
				}
			}
//		FiAttributes Ends

//		MutualFundSecurity starts
			if (holding.getMutualFundSecurity() != null) {
				mutualFundSecurity = holding.getMutualFundSecurity();
				holding.setMutualFundSecurity(
						mutualFundSecurity.getMutualFunds(mutualFundSecurity.getMutualfundsecurityid()));
			}
//		MutualFundSecurity Ends

//		OptionFundSecurity starts
			if (holding.getOptionSecurity() != null) {
				optionSecurity = holding.getOptionSecurity();
				optionSecurity = optionSecurity.getOptionSecurity(optionSecurity.getOptionSecurityId());
				holding.setOptionSecurity(optionSecurity);
			}
//		OptionSecurity Ends

//		StockFundSecurity starts
			if (holding.getStockSecurity() != null) {
				stockSecurity = holding.getStockSecurity();
				stockSecurity = stockSecurity.getStockSecurity(stockSecurity.getStockSecurityId());
				holding.setStockSecurity(stockSecurity);
			}
//		StockSecurity Ends

//		SweepSecurity starts
			if (holding.getSweepSecurity() != null) {
				sweepSecurity = holding.getSweepSecurity();
				sweepSecurity = sweepSecurity.getSweepSecurity(sweepSecurity.getSweepSecurityId());
				holding.setSweepSecurity(sweepSecurity);
			}
//		SweepSecurity Ends

//		OtherSecurity starts
			if (holding.getOtherSecurity() != null) {
				otherSecurity = holding.getOtherSecurity();
				otherSecurity = otherSecurity.getOtherSecurity(otherSecurity.getOtherSecurityId());
				holding.setOtherSecurity(otherSecurity);
			}
//		OtherSecurity Ends

//		TaxLot start
			if (holding.getTaxLots() != null) {
				List<TaxLot> taxLots = holding.getTaxLots();
				List<TaxLot> taxLotNew = new ArrayList<>();
				for (TaxLot taxLotsIterator : taxLots) {
					TaxLot taxLot = new TaxLot();
					int taxLotId = taxLotsIterator.getTaxLotId();

					taxLot = taxLot.getTaxLots(taxLotId);
					taxLotNew.add(taxLot);
				}
				holding.setTaxLots(taxLotNew);
			}
//		TaxLot Ends
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Holding : ", e);
			throw new FDXException(e,500);
		}
		return holding;
	}
}
