package com.fdx.api.model51.modelimpl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

import javax.validation.Valid;

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
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import com.fdx.api.model51.config.ConnectionConfigApi51;
import com.fdx.api.model51.mapper.TaxLotRowMapper;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Block of securities receiving the same tax treatment
 */
@ApiModel(description = "Block of securities receiving the same tax treatment")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class TaxLot {

	NamedParameterJdbcTemplate template;

	@JsonProperty(access = Access.WRITE_ONLY)
	private int taxLotId;

	@JsonProperty("originalPurchaseDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private Date originalPurchaseDate;

	@JsonProperty("quantity")
	private BigDecimal quantity;

	@JsonProperty("purchasedPrice")
	private BigDecimal purchasedPrice;

	@JsonProperty("costBasis")
	private BigDecimal costBasis;

	@JsonProperty("currentValue")
	private BigDecimal currentValue;

	@JsonProperty("postionType")
	private PositionType postionType;

	@JsonProperty("positionType")
	private PositionType positionType;

	public TaxLot originalPurchaseDate(java.sql.Timestamp originalPurchaseDate) {
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

	public Date getOriginalPurchaseDate() {
		return originalPurchaseDate;
	}

	public void setOriginalPurchaseDate(Date originalPurchaseDate) {
		this.originalPurchaseDate = originalPurchaseDate;
	}

	public TaxLot quantity(BigDecimal quantity) {
		this.quantity = quantity;
		return this;
	}

	/**
	 * Lot quantity
	 * 
	 * @return quantity
	 */
	@ApiModelProperty(value = "Lot quantity")

	@Valid

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public TaxLot purchasedPrice(BigDecimal purchasedPrice) {
		this.purchasedPrice = purchasedPrice;
		return this;
	}

	/**
	 * Original purchase price
	 * 
	 * @return purchasedPrice
	 */
	@ApiModelProperty(value = "Original purchase price")

	@Valid

	public BigDecimal getPurchasedPrice() {
		return purchasedPrice;
	}

	public void setPurchasedPrice(BigDecimal purchasedPrice) {
		this.purchasedPrice = purchasedPrice;
	}

	public TaxLot costBasis(BigDecimal costBasis) {
		this.costBasis = costBasis;
		return this;
	}

	/**
	 * Total amount of money spent acquiring this lot including any fees or
	 * commission expenses incurred
	 * 
	 * @return costBasis
	 */
	@ApiModelProperty(value = "Total amount of money spent acquiring this lot including any fees or commission expenses incurred")

	@Valid

	public BigDecimal getCostBasis() {
		return costBasis;
	}

	public void setCostBasis(BigDecimal costBasis) {
		this.costBasis = costBasis;
	}

	public TaxLot currentValue(BigDecimal currentValue) {
		this.currentValue = currentValue;
		return this;
	}

	/**
	 * Lot market value
	 * 
	 * @return currentValue
	 */
	@ApiModelProperty(value = "Lot market value")

	@Valid

	public BigDecimal getCurrentValue() {
		return currentValue;
	}

	public void setCurrentValue(BigDecimal currentValue) {
		this.currentValue = currentValue;
	}

	public TaxLot postionType(PositionType postionType) {
		this.postionType = postionType;
		return this;
	}

	/**
	 * Get postionType
	 * 
	 * @return postionType
	 */
	@ApiModelProperty(value = "")

	@Valid

	public PositionType getPostionType() {
		return postionType;
	}

	public void setPostionType(PositionType postionType) {
		this.postionType = postionType;
	}

	public TaxLot positionType(PositionType positionType) {
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

	public int getTaxLotId() {
		return taxLotId;
	}

	public void setTaxLotId(int taxLotId) {
		this.taxLotId = taxLotId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		TaxLot taxLot = (TaxLot) o;
		return Objects.equals(this.originalPurchaseDate, taxLot.originalPurchaseDate)
				&& Objects.equals(this.quantity, taxLot.quantity)
				&& Objects.equals(this.purchasedPrice, taxLot.purchasedPrice)
				&& Objects.equals(this.costBasis, taxLot.costBasis)
				&& Objects.equals(this.currentValue, taxLot.currentValue)
				&& Objects.equals(this.postionType, taxLot.postionType)
				&& Objects.equals(this.positionType, taxLot.positionType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(originalPurchaseDate, quantity, purchasedPrice, costBasis, currentValue, postionType,
				positionType);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TaxLot {\n");

		sb.append("    originalPurchaseDate: ").append(toIndentedString(originalPurchaseDate)).append("\n");
		sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
		sb.append("    purchasedPrice: ").append(toIndentedString(purchasedPrice)).append("\n");
		sb.append("    costBasis: ").append(toIndentedString(costBasis)).append("\n");
		sb.append("    currentValue: ").append(toIndentedString(currentValue)).append("\n");
		sb.append("    postionType: ").append(toIndentedString(postionType)).append("\n");
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

	private static final Logger log = LoggerFactory.getLogger(TaxLot.class);

	public TaxLot getTaxLots(int taxLotId) throws FDXException {
		try {
			SqlParameterSource parameters = new MapSqlParameterSource("taxLotId", taxLotId);
			
			template = ConnectionConfigApi51.getTemplate();;

			TaxLot taxLot = template.queryForObject("select * from "+ DeveloperContext.getDeveloperSchema() +".taxLot where taxLotId in (:taxLotId)",
					parameters, new TaxLotRowMapper());

			return taxLot;
		} catch (Exception e) {
			log.error("TaxLot : ", e);
			throw new FDXException(e,500);
		}
	}
}
