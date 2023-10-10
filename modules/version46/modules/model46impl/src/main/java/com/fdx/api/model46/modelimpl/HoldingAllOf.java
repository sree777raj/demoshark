package com.fdx.api.model46.modelimpl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * HoldingAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class HoldingAllOf {
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
	private java.sql.Timestamp originalPurchaseDate;

	@JsonProperty("purchasedPrice")
	private BigDecimal purchasedPrice;

	@JsonProperty("currentUnitPrice")
	private BigDecimal currentUnitPrice;

	@JsonProperty("changeInPrice")
	private BigDecimal changeInPrice;

	@JsonProperty("currentUnitPriceDate")
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

	public HoldingAllOf holdingId(String holdingId) {
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

	public HoldingAllOf securityId(String securityId) {
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

	public HoldingAllOf securityIdType(SecurityIdType securityIdType) {
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

	public HoldingAllOf holdingName(String holdingName) {
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

	public HoldingAllOf holdingType(HoldingType holdingType) {
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

	public HoldingAllOf holdingSubType(HoldingSubType holdingSubType) {
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

	public HoldingAllOf positionType(PositionType positionType) {
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

	public HoldingAllOf heldInAccount(HeldInAccount heldInAccount) {
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

	public HoldingAllOf description(String description) {
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

	public HoldingAllOf symbol(String symbol) {
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

	public HoldingAllOf originalPurchaseDate(java.sql.Timestamp originalPurchaseDate) {
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

	public HoldingAllOf purchasedPrice(BigDecimal purchasedPrice) {
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

	public HoldingAllOf currentUnitPrice(BigDecimal currentUnitPrice) {
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

	public HoldingAllOf changeInPrice(BigDecimal changeInPrice) {
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

	public HoldingAllOf currentUnitPriceDate(java.sql.Timestamp currentUnitPriceDate) {
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

	public HoldingAllOf units(BigDecimal units) {
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

	public HoldingAllOf marketValue(BigDecimal marketValue) {
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

	public HoldingAllOf faceValue(BigDecimal faceValue) {
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

	public HoldingAllOf averageCost(Boolean averageCost) {
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

	public HoldingAllOf cashAccount(Boolean cashAccount) {
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

	public HoldingAllOf rate(BigDecimal rate) {
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

	public HoldingAllOf expirationDate(java.sql.Timestamp expirationDate) {
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

	public HoldingAllOf inv401kSurce(Inv401kSourceType inv401kSurce) {
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

	public HoldingAllOf inv401kSource(Inv401kSourceType inv401kSource) {
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

	public HoldingAllOf currency(Currency currency) {
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

	public HoldingAllOf assetClasses(List<Portion> assetClasses) {
		this.assetClasses = assetClasses;
		return this;
	}

	public HoldingAllOf addAssetClassesItem(Portion assetClassesItem) {
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

	public HoldingAllOf fiAssetClasses(List<FiPortion> fiAssetClasses) {
		this.fiAssetClasses = fiAssetClasses;
		return this;
	}

	public HoldingAllOf addFiAssetClassesItem(FiPortion fiAssetClassesItem) {
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

	public HoldingAllOf fiAttributes(List<FiAttribute> fiAttributes) {
		this.fiAttributes = fiAttributes;
		return this;
	}

	public HoldingAllOf addFiAttributesItem(FiAttribute fiAttributesItem) {
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

	public HoldingAllOf taxLots(List<TaxLot> taxLots) {
		this.taxLots = taxLots;
		return this;
	}

	public HoldingAllOf addTaxLotsItem(TaxLot taxLotsItem) {
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

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		HoldingAllOf holdingAllOf = (HoldingAllOf) o;
		return Objects.equals(this.holdingId, holdingAllOf.holdingId)
				&& Objects.equals(this.securityId, holdingAllOf.securityId)
				&& Objects.equals(this.securityIdType, holdingAllOf.securityIdType)
				&& Objects.equals(this.holdingName, holdingAllOf.holdingName)
				&& Objects.equals(this.holdingType, holdingAllOf.holdingType)
				&& Objects.equals(this.holdingSubType, holdingAllOf.holdingSubType)
				&& Objects.equals(this.positionType, holdingAllOf.positionType)
				&& Objects.equals(this.heldInAccount, holdingAllOf.heldInAccount)
				&& Objects.equals(this.description, holdingAllOf.description)
				&& Objects.equals(this.symbol, holdingAllOf.symbol)
				&& Objects.equals(this.originalPurchaseDate, holdingAllOf.originalPurchaseDate)
				&& Objects.equals(this.purchasedPrice, holdingAllOf.purchasedPrice)
				&& Objects.equals(this.currentUnitPrice, holdingAllOf.currentUnitPrice)
				&& Objects.equals(this.changeInPrice, holdingAllOf.changeInPrice)
				&& Objects.equals(this.currentUnitPriceDate, holdingAllOf.currentUnitPriceDate)
				&& Objects.equals(this.units, holdingAllOf.units)
				&& Objects.equals(this.marketValue, holdingAllOf.marketValue)
				&& Objects.equals(this.faceValue, holdingAllOf.faceValue)
				&& Objects.equals(this.averageCost, holdingAllOf.averageCost)
				&& Objects.equals(this.cashAccount, holdingAllOf.cashAccount)
				&& Objects.equals(this.rate, holdingAllOf.rate)
				&& Objects.equals(this.expirationDate, holdingAllOf.expirationDate)
				&& Objects.equals(this.inv401kSurce, holdingAllOf.inv401kSurce)
				&& Objects.equals(this.inv401kSource, holdingAllOf.inv401kSource)
				&& Objects.equals(this.currency, holdingAllOf.currency)
				&& Objects.equals(this.assetClasses, holdingAllOf.assetClasses)
				&& Objects.equals(this.fiAssetClasses, holdingAllOf.fiAssetClasses)
				&& Objects.equals(this.fiAttributes, holdingAllOf.fiAttributes)
				&& Objects.equals(this.taxLots, holdingAllOf.taxLots);
	}

	@Override
	public int hashCode() {
		return Objects.hash(holdingId, securityId, securityIdType, holdingName, holdingType, holdingSubType,
				positionType, heldInAccount, description, symbol, originalPurchaseDate, purchasedPrice,
				currentUnitPrice, changeInPrice, currentUnitPriceDate, units, marketValue, faceValue, averageCost,
				cashAccount, rate, expirationDate, inv401kSurce, inv401kSource, currency, assetClasses, fiAssetClasses,
				fiAttributes, taxLots);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class HoldingAllOf {\n");

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
