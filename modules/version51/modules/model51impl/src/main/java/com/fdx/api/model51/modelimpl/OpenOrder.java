package com.fdx.api.model51.modelimpl;

import java.math.BigDecimal;
import java.util.Date;
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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fdx.api.model51.config.ConnectionConfigApi51;
import com.fdx.api.model51.mapper.OpenOrderRowMapper;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * An open investment transaction order
 */
@ApiModel(description = "An open investment transaction order")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class OpenOrder {

	NamedParameterJdbcTemplate template;

	@JsonProperty("orderId")
	private String orderId;

	@JsonProperty("securityId")
	private String securityId;

	@JsonProperty("securityIdType")
	private SecurityIdType securityIdType;

	@JsonProperty("symbol")
	private String symbol;

	@JsonProperty("description")
	private String description;

	@JsonProperty("units")
	private BigDecimal units;

	@JsonProperty("orderType")
	private OrderType orderType;

	@JsonProperty("orderDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private Date orderDate;

	@JsonProperty("unitPrice")
	private BigDecimal unitPrice;

	@JsonProperty("unitType")
	private UnitType unitType;

	@JsonProperty("orderDuration")
	private OrderDuration orderDuration;

	@JsonProperty("subAccount")
	private SubAccountType subAccount;

	@JsonProperty("limitPrice")
	private BigDecimal limitPrice;

	@JsonProperty("stopPrice")
	private BigDecimal stopPrice;

	@JsonProperty("inv401kSource")
	private Inv401kSourceType inv401kSource;

	public OpenOrder orderId(String orderId) {
		this.orderId = orderId;
		return this;
	}

	/**
	 * Value for a unique identifier
	 * 
	 * @return orderId
	 */
	@ApiModelProperty(value = "Value for a unique identifier")

	@Size(max = 256)
	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public OpenOrder securityId(String securityId) {
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

	public OpenOrder securityIdType(SecurityIdType securityIdType) {
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

	public OpenOrder symbol(String symbol) {
		this.symbol = symbol;
		return this;
	}

	/**
	 * Market symbol
	 * 
	 * @return symbol
	 */
	@ApiModelProperty(value = "Market symbol")

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public OpenOrder description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Description of order
	 * 
	 * @return description
	 */
	@ApiModelProperty(value = "Description of order")

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public OpenOrder units(BigDecimal units) {
		this.units = units;
		return this;
	}

	/**
	 * Number of units (shares or bonds etc.)
	 * 
	 * @return units
	 */
	@ApiModelProperty(value = "Number of units (shares or bonds etc.)")

	@Valid

	public BigDecimal getUnits() {
		return units;
	}

	public void setUnits(BigDecimal units) {
		this.units = units;
	}

	public OpenOrder orderType(OrderType orderType) {
		this.orderType = orderType;
		return this;
	}

	/**
	 * Get orderType
	 * 
	 * @return orderType
	 */
	@ApiModelProperty(value = "")

	@Valid

	public OrderType getOrderType() {
		return orderType;
	}

	public void setOrderType(OrderType orderType) {
		this.orderType = orderType;
	}

	public OpenOrder orderDate(java.sql.Timestamp orderDate) {
		this.orderDate = orderDate;
		return this;
	}

	/**
	 * Get orderDate
	 * 
	 * @return orderDate
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public OpenOrder unitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
		return this;
	}

	/**
	 * Unit price
	 * 
	 * @return unitPrice
	 */
	@ApiModelProperty(value = "Unit price")

	@Valid

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	public OpenOrder unitType(UnitType unitType) {
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

	public OpenOrder orderDuration(OrderDuration orderDuration) {
		this.orderDuration = orderDuration;
		return this;
	}

	/**
	 * Get orderDuration
	 * 
	 * @return orderDuration
	 */
	@ApiModelProperty(value = "")

	@Valid

	public OrderDuration getOrderDuration() {
		return orderDuration;
	}

	public void setOrderDuration(OrderDuration orderDuration) {
		this.orderDuration = orderDuration;
	}

	public OpenOrder subAccount(SubAccountType subAccount) {
		this.subAccount = subAccount;
		return this;
	}

	/**
	 * Get subAccount
	 * 
	 * @return subAccount
	 */
	@ApiModelProperty(value = "")

	@Valid

	public SubAccountType getSubAccount() {
		return subAccount;
	}

	public void setSubAccount(SubAccountType subAccount) {
		this.subAccount = subAccount;
	}

	public OpenOrder limitPrice(BigDecimal limitPrice) {
		this.limitPrice = limitPrice;
		return this;
	}

	/**
	 * Limit price
	 * 
	 * @return limitPrice
	 */
	@ApiModelProperty(value = "Limit price")

	@Valid

	public BigDecimal getLimitPrice() {
		return limitPrice;
	}

	public void setLimitPrice(BigDecimal limitPrice) {
		this.limitPrice = limitPrice;
	}

	public OpenOrder stopPrice(BigDecimal stopPrice) {
		this.stopPrice = stopPrice;
		return this;
	}

	/**
	 * Stop price
	 * 
	 * @return stopPrice
	 */
	@ApiModelProperty(value = "Stop price")

	@Valid

	public BigDecimal getStopPrice() {
		return stopPrice;
	}

	public void setStopPrice(BigDecimal stopPrice) {
		this.stopPrice = stopPrice;
	}

	public OpenOrder inv401kSource(Inv401kSourceType inv401kSource) {
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

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		OpenOrder openOrder = (OpenOrder) o;
		return Objects.equals(this.orderId, openOrder.orderId) && Objects.equals(this.securityId, openOrder.securityId)
				&& Objects.equals(this.securityIdType, openOrder.securityIdType)
				&& Objects.equals(this.symbol, openOrder.symbol)
				&& Objects.equals(this.description, openOrder.description)
				&& Objects.equals(this.units, openOrder.units) && Objects.equals(this.orderType, openOrder.orderType)
				&& Objects.equals(this.orderDate, openOrder.orderDate)
				&& Objects.equals(this.unitPrice, openOrder.unitPrice)
				&& Objects.equals(this.unitType, openOrder.unitType)
				&& Objects.equals(this.orderDuration, openOrder.orderDuration)
				&& Objects.equals(this.subAccount, openOrder.subAccount)
				&& Objects.equals(this.limitPrice, openOrder.limitPrice)
				&& Objects.equals(this.stopPrice, openOrder.stopPrice)
				&& Objects.equals(this.inv401kSource, openOrder.inv401kSource);
	}

	@Override
	public int hashCode() {
		return Objects.hash(orderId, securityId, securityIdType, symbol, description, units, orderType, orderDate,
				unitPrice, unitType, orderDuration, subAccount, limitPrice, stopPrice, inv401kSource);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class OpenOrder {\n");

		sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
		sb.append("    securityId: ").append(toIndentedString(securityId)).append("\n");
		sb.append("    securityIdType: ").append(toIndentedString(securityIdType)).append("\n");
		sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    units: ").append(toIndentedString(units)).append("\n");
		sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
		sb.append("    orderDate: ").append(toIndentedString(orderDate)).append("\n");
		sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
		sb.append("    unitType: ").append(toIndentedString(unitType)).append("\n");
		sb.append("    orderDuration: ").append(toIndentedString(orderDuration)).append("\n");
		sb.append("    subAccount: ").append(toIndentedString(subAccount)).append("\n");
		sb.append("    limitPrice: ").append(toIndentedString(limitPrice)).append("\n");
		sb.append("    stopPrice: ").append(toIndentedString(stopPrice)).append("\n");
		sb.append("    inv401kSource: ").append(toIndentedString(inv401kSource)).append("\n");
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

	private static final Logger log = LoggerFactory.getLogger(OpenOrder.class);

	public OpenOrder getOpenOrders(String orderId) throws FDXException {
		try {
			SqlParameterSource parameters = new MapSqlParameterSource("orderId", orderId);
			template = ConnectionConfigApi51.getTemplate();;
			OpenOrder openOrder = template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".openOrder where orderId in (:orderId)", parameters,
					new OpenOrderRowMapper());
			return openOrder;
		} catch (Exception e) {
			log.error("OpenOrder : ", e);
			throw new FDXException(e,500);
		}
	}
}
