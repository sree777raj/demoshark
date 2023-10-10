package com.fdx.api.model51.modelimpl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.OptBoolean;
import com.fdx.common.exception.Errors;
import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import com.fdx.api.model51.config.ConnectionConfigApi51;
import com.fdx.api.model51.mapper.VestingDateRowMapper;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Represents the vesting of ownership of an investment account
 */
@ApiModel(description = "Represents the vesting of ownership of an investment account")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Vesting {

	NamedParameterJdbcTemplate template;

	@JsonProperty(access = Access.WRITE_ONLY)
	private int vestingId;

	@JsonProperty("vestingDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private Date vestingDate;

	@JsonProperty("symbol")
	private String symbol;

	@JsonProperty("strikePrice")
	private BigDecimal strikePrice;

	@JsonProperty("vestingPercentage")
	private BigDecimal vestingPercentage;

	@JsonProperty("otherVestAmount")
	private BigDecimal otherVestAmount;

	@JsonProperty("otherVestPercentage")
	private BigDecimal otherVestPercentage;

	@JsonProperty("vestedBalance")
	private BigDecimal vestedBalance;

	@JsonProperty("unVestedBalance")
	private BigDecimal unVestedBalance;

	@JsonProperty("vestedQuantity")
	private BigDecimal vestedQuantity;

	@JsonProperty("unVestedQuantity")
	private BigDecimal unVestedQuantity;

	public Vesting vestingDate(java.sql.Timestamp vestingDate) {
		this.vestingDate = vestingDate;
		return this;
	}

	/**
	 * Get vestingDate
	 * 
	 * @return vestingDate
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Date getVestingDate() {
		return vestingDate;
	}

	public void setVestingDate(Date vestingDate) {
		this.vestingDate = vestingDate;
	}

	public Vesting symbol(String symbol) {
		this.symbol = symbol;
		return this;
	}

	/**
	 * Security symbol
	 * 
	 * @return symbol
	 */
	@ApiModelProperty(value = "Security symbol")

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public Vesting strikePrice(BigDecimal strikePrice) {
		this.strikePrice = strikePrice;
		return this;
	}

	/**
	 * Strike price
	 * 
	 * @return strikePrice
	 */
	@ApiModelProperty(value = "Strike price")

	@Valid

	public BigDecimal getStrikePrice() {
		return strikePrice;
	}

	public void setStrikePrice(BigDecimal strikePrice) {
		this.strikePrice = strikePrice;
	}

	public Vesting vestingPercentage(BigDecimal vestingPercentage) {
		this.vestingPercentage = vestingPercentage;
		return this;
	}

	/**
	 * Vesting percentage
	 * 
	 * @return vestingPercentage
	 */
	@ApiModelProperty(value = "Vesting percentage")

	@Valid

	public BigDecimal getVestingPercentage() {
		return vestingPercentage;
	}

	public void setVestingPercentage(BigDecimal vestingPercentage) {
		this.vestingPercentage = vestingPercentage;
	}

	public Vesting otherVestAmount(BigDecimal otherVestAmount) {
		this.otherVestAmount = otherVestAmount;
		return this;
	}

	/**
	 * Other vested amount
	 * 
	 * @return otherVestAmount
	 */
	@ApiModelProperty(value = "Other vested amount")

	@Valid

	public BigDecimal getOtherVestAmount() {
		return otherVestAmount;
	}

	public void setOtherVestAmount(BigDecimal otherVestAmount) {
		this.otherVestAmount = otherVestAmount;
	}

	public Vesting otherVestPercentage(BigDecimal otherVestPercentage) {
		this.otherVestPercentage = otherVestPercentage;
		return this;
	}

	/**
	 * Other vested percentage
	 * 
	 * @return otherVestPercentage
	 */
	@ApiModelProperty(value = "Other vested percentage")

	@Valid

	public BigDecimal getOtherVestPercentage() {
		return otherVestPercentage;
	}

	public void setOtherVestPercentage(BigDecimal otherVestPercentage) {
		this.otherVestPercentage = otherVestPercentage;
	}

	public Vesting vestedBalance(BigDecimal vestedBalance) {
		this.vestedBalance = vestedBalance;
		return this;
	}

	/**
	 * Vested balance
	 * 
	 * @return vestedBalance
	 */
	@ApiModelProperty(value = "Vested balance")

	@Valid

	public BigDecimal getVestedBalance() {
		return vestedBalance;
	}

	public void setVestedBalance(BigDecimal vestedBalance) {
		this.vestedBalance = vestedBalance;
	}

	public Vesting unVestedBalance(BigDecimal unVestedBalance) {
		this.unVestedBalance = unVestedBalance;
		return this;
	}

	/**
	 * Unvested balance
	 * 
	 * @return unVestedBalance
	 */
	@ApiModelProperty(value = "Unvested balance")

	@Valid

	public BigDecimal getUnVestedBalance() {
		return unVestedBalance;
	}

	public void setUnVestedBalance(BigDecimal unVestedBalance) {
		this.unVestedBalance = unVestedBalance;
	}

	public Vesting vestedQuantity(BigDecimal vestedQuantity) {
		this.vestedQuantity = vestedQuantity;
		return this;
	}

	/**
	 * Vested quantity
	 * 
	 * @return vestedQuantity
	 */
	@ApiModelProperty(value = "Vested quantity")

	@Valid

	public BigDecimal getVestedQuantity() {
		return vestedQuantity;
	}

	public void setVestedQuantity(BigDecimal vestedQuantity) {
		this.vestedQuantity = vestedQuantity;
	}

	public Vesting unVestedQuantity(BigDecimal unVestedQuantity) {
		this.unVestedQuantity = unVestedQuantity;
		return this;
	}

	/**
	 * Unvested quantity
	 * 
	 * @return unVestedQuantity
	 */
	@ApiModelProperty(value = "Unvested quantity")

	@Valid

	public BigDecimal getUnVestedQuantity() {
		return unVestedQuantity;
	}

	public void setUnVestedQuantity(BigDecimal unVestedQuantity) {
		this.unVestedQuantity = unVestedQuantity;
	}

	public void setVestingId(int vestingId) {
		this.vestingId = vestingId;
	}

	public int getVestingId() {
		return vestingId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Vesting vesting = (Vesting) o;
		return Objects.equals(this.vestingDate, vesting.vestingDate) && Objects.equals(this.symbol, vesting.symbol)
				&& Objects.equals(this.strikePrice, vesting.strikePrice)
				&& Objects.equals(this.vestingPercentage, vesting.vestingPercentage)
				&& Objects.equals(this.otherVestAmount, vesting.otherVestAmount)
				&& Objects.equals(this.otherVestPercentage, vesting.otherVestPercentage)
				&& Objects.equals(this.vestedBalance, vesting.vestedBalance)
				&& Objects.equals(this.unVestedBalance, vesting.unVestedBalance)
				&& Objects.equals(this.vestedQuantity, vesting.vestedQuantity)
				&& Objects.equals(this.unVestedQuantity, vesting.unVestedQuantity);
	}

	@Override
	public int hashCode() {
		return Objects.hash(vestingDate, symbol, strikePrice, vestingPercentage, otherVestAmount, otherVestPercentage,
				vestedBalance, unVestedBalance, vestedQuantity, unVestedQuantity);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Vesting {\n");

		sb.append("    vestingDate: ").append(toIndentedString(vestingDate)).append("\n");
		sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
		sb.append("    strikePrice: ").append(toIndentedString(strikePrice)).append("\n");
		sb.append("    vestingPercentage: ").append(toIndentedString(vestingPercentage)).append("\n");
		sb.append("    otherVestAmount: ").append(toIndentedString(otherVestAmount)).append("\n");
		sb.append("    otherVestPercentage: ").append(toIndentedString(otherVestPercentage)).append("\n");
		sb.append("    vestedBalance: ").append(toIndentedString(vestedBalance)).append("\n");
		sb.append("    unVestedBalance: ").append(toIndentedString(unVestedBalance)).append("\n");
		sb.append("    vestedQuantity: ").append(toIndentedString(vestedQuantity)).append("\n");
		sb.append("    unVestedQuantity: ").append(toIndentedString(unVestedQuantity)).append("\n");
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

	private static final Logger log = LoggerFactory.getLogger(Vesting.class);

	public Vesting getVesting(int vestingId) throws FDXException {
		try {
			SqlParameterSource parameters = new MapSqlParameterSource("vestingId", vestingId);
			template = ConnectionConfigApi51.getTemplate();;
			return template.queryForObject("select * from "+ DeveloperContext.getDeveloperSchema() +".vesting where vestingId in (:vestingId)",
					parameters, new VestingDateRowMapper());
		} catch (EmptyResultDataAccessException e) {
			throw new FDXException(Errors.VESTING_NOT_FOUND, 0);
		} catch (Exception e) {
			log.error("Vesting : ", e);
			throw new FDXException(e,500);
		}
	}
}
