package com.fdx.api.model46.modelimpl;

import java.math.BigDecimal;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.OptBoolean;
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
import com.fdx.api.model46.config.ConnectionConfigApi46;
import com.fdx.api.model46.mapper.DebtSecurityRowMapper;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * An investment in a debt security
 */
@ApiModel(description = "An investment in a debt security")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class DebtSecurity {

	NamedParameterJdbcTemplate template;

	@JsonProperty(access = Access.WRITE_ONLY)
	private int debtSecurityId;

	@JsonProperty("parValue")
	private BigDecimal parValue;

	@JsonProperty("debtType")
	private DebtType debtType;

	@JsonProperty("debtClass")
	private DebtClass debtClass;

	@JsonProperty("couponRate")
	private BigDecimal couponRate;

	@JsonProperty("couponDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, lenient = OptBoolean.FALSE)
	private java.sql.Timestamp couponDate;

	@JsonProperty("couponMatureFrequency")
	private CouponMatureFrequency couponMatureFrequency;

	@JsonProperty("callPrice")
	private BigDecimal callPrice;

	@JsonProperty("yieldToCall")
	private BigDecimal yieldToCall;

	@JsonProperty("callDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, lenient = OptBoolean.FALSE)
	private java.sql.Timestamp callDate;

	@JsonProperty("callType")
	private CallType callType;

	@JsonProperty("yieldToMaturity")
	private BigDecimal yieldToMaturity;

	@JsonProperty("bondMaturityDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, lenient = OptBoolean.FALSE)
	private java.sql.Timestamp bondMaturityDate;

	public DebtSecurity parValue(BigDecimal parValue) {
		this.parValue = parValue;
		return this;
	}

	/**
	 * Par value amount
	 * 
	 * @return parValue
	 */
	@ApiModelProperty(value = "Par value amount")

	@Valid

	public BigDecimal getParValue() {
		return parValue;
	}

	public void setParValue(BigDecimal parValue) {
		this.parValue = parValue;
	}

	public DebtSecurity debtType(DebtType debtType) {
		this.debtType = debtType;
		return this;
	}

	/**
	 * Get debtType
	 * 
	 * @return debtType
	 */
	@ApiModelProperty(value = "")

	@Valid

	public DebtType getDebtType() {
		return debtType;
	}

	public void setDebtType(DebtType debtType) {
		this.debtType = debtType;
	}

	public DebtSecurity debtClass(DebtClass debtClass) {
		this.debtClass = debtClass;
		return this;
	}

	/**
	 * Get debtClass
	 * 
	 * @return debtClass
	 */
	@ApiModelProperty(value = "")

	@Valid

	public DebtClass getDebtClass() {
		return debtClass;
	}

	public void setDebtClass(DebtClass debtClass) {
		this.debtClass = debtClass;
	}

	public DebtSecurity couponRate(BigDecimal couponRate) {
		this.couponRate = couponRate;
		return this;
	}

	/**
	 * Bond coupon rate for next closest call date
	 * 
	 * @return couponRate
	 */
	@ApiModelProperty(value = "Bond coupon rate for next closest call date")

	@Valid

	public BigDecimal getCouponRate() {
		return couponRate;
	}

	public void setCouponRate(BigDecimal couponRate) {
		this.couponRate = couponRate;
	}

	public DebtSecurity couponDate(java.sql.Timestamp couponDate) {
		this.couponDate = couponDate;
		return this;
	}

	/**
	 * Get couponDate
	 * 
	 * @return couponDate
	 */
	@ApiModelProperty(value = "")

	@Valid

	public java.sql.Timestamp getCouponDate() {
		return couponDate;
	}

	public void setCouponDate(java.sql.Timestamp couponDate) {
		this.couponDate = couponDate;
	}

	public DebtSecurity couponMatureFrequency(CouponMatureFrequency couponMatureFrequency) {
		this.couponMatureFrequency = couponMatureFrequency;
		return this;
	}

	/**
	 * Get couponMatureFrequency
	 * 
	 * @return couponMatureFrequency
	 */
	@ApiModelProperty(value = "")

	@Valid

	public CouponMatureFrequency getCouponMatureFrequency() {
		return couponMatureFrequency;
	}

	public void setCouponMatureFrequency(CouponMatureFrequency couponMatureFrequency) {
		this.couponMatureFrequency = couponMatureFrequency;
	}

	public DebtSecurity callPrice(BigDecimal callPrice) {
		this.callPrice = callPrice;
		return this;
	}

	/**
	 * Bond call price
	 * 
	 * @return callPrice
	 */
	@ApiModelProperty(value = "Bond call price")

	@Valid

	public BigDecimal getCallPrice() {
		return callPrice;
	}

	public void setCallPrice(BigDecimal callPrice) {
		this.callPrice = callPrice;
	}

	public DebtSecurity yieldToCall(BigDecimal yieldToCall) {
		this.yieldToCall = yieldToCall;
		return this;
	}

	/**
	 * Yield to next call
	 * 
	 * @return yieldToCall
	 */
	@ApiModelProperty(value = "Yield to next call")

	@Valid

	public BigDecimal getYieldToCall() {
		return yieldToCall;
	}

	public void setYieldToCall(BigDecimal yieldToCall) {
		this.yieldToCall = yieldToCall;
	}

	public DebtSecurity callDate(java.sql.Timestamp callDate) {
		this.callDate = callDate;
		return this;
	}

	/**
	 * Get callDate
	 * 
	 * @return callDate
	 */
	@ApiModelProperty(value = "")

	@Valid

	public java.sql.Timestamp getCallDate() {
		return callDate;
	}

	public void setCallDate(java.sql.Timestamp callDate) {
		this.callDate = callDate;
	}

	public DebtSecurity callType(CallType callType) {
		this.callType = callType;
		return this;
	}

	/**
	 * Get callType
	 * 
	 * @return callType
	 */
	@ApiModelProperty(value = "")

	@Valid

	public CallType getCallType() {
		return callType;
	}

	public void setCallType(CallType callType) {
		this.callType = callType;
	}

	public DebtSecurity yieldToMaturity(BigDecimal yieldToMaturity) {
		this.yieldToMaturity = yieldToMaturity;
		return this;
	}

	/**
	 * Yield to maturity
	 * 
	 * @return yieldToMaturity
	 */
	@ApiModelProperty(value = "Yield to maturity")

	@Valid

	public BigDecimal getYieldToMaturity() {
		return yieldToMaturity;
	}

	public void setYieldToMaturity(BigDecimal yieldToMaturity) {
		this.yieldToMaturity = yieldToMaturity;
	}

	public DebtSecurity bondMaturityDate(java.sql.Timestamp bondMaturityDate) {
		this.bondMaturityDate = bondMaturityDate;
		return this;
	}

	/**
	 * Get bondMaturityDate
	 * 
	 * @return bondMaturityDate
	 */
	@ApiModelProperty(value = "")

	@Valid

	public java.sql.Timestamp getBondMaturityDate() {
		return bondMaturityDate;
	}

	public void setBondMaturityDate(java.sql.Timestamp bondMaturityDate) {
		this.bondMaturityDate = bondMaturityDate;
	}

	public int getDebtSecurityId() {
		return debtSecurityId;
	}

	public void setDebtSecurityId(int debtSecurityId) {
		this.debtSecurityId = debtSecurityId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DebtSecurity debtSecurity = (DebtSecurity) o;
		return Objects.equals(this.parValue, debtSecurity.parValue)
				&& Objects.equals(this.debtType, debtSecurity.debtType)
				&& Objects.equals(this.debtClass, debtSecurity.debtClass)
				&& Objects.equals(this.couponRate, debtSecurity.couponRate)
				&& Objects.equals(this.couponDate, debtSecurity.couponDate)
				&& Objects.equals(this.couponMatureFrequency, debtSecurity.couponMatureFrequency)
				&& Objects.equals(this.callPrice, debtSecurity.callPrice)
				&& Objects.equals(this.yieldToCall, debtSecurity.yieldToCall)
				&& Objects.equals(this.callDate, debtSecurity.callDate)
				&& Objects.equals(this.callType, debtSecurity.callType)
				&& Objects.equals(this.yieldToMaturity, debtSecurity.yieldToMaturity)
				&& Objects.equals(this.bondMaturityDate, debtSecurity.bondMaturityDate);
	}

	@Override
	public int hashCode() {
		return Objects.hash(parValue, debtType, debtClass, couponRate, couponDate, couponMatureFrequency, callPrice,
				yieldToCall, callDate, callType, yieldToMaturity, bondMaturityDate);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DebtSecurity {\n");

		sb.append("    parValue: ").append(toIndentedString(parValue)).append("\n");
		sb.append("    debtType: ").append(toIndentedString(debtType)).append("\n");
		sb.append("    debtClass: ").append(toIndentedString(debtClass)).append("\n");
		sb.append("    couponRate: ").append(toIndentedString(couponRate)).append("\n");
		sb.append("    couponDate: ").append(toIndentedString(couponDate)).append("\n");
		sb.append("    couponMatureFrequency: ").append(toIndentedString(couponMatureFrequency)).append("\n");
		sb.append("    callPrice: ").append(toIndentedString(callPrice)).append("\n");
		sb.append("    yieldToCall: ").append(toIndentedString(yieldToCall)).append("\n");
		sb.append("    callDate: ").append(toIndentedString(callDate)).append("\n");
		sb.append("    callType: ").append(toIndentedString(callType)).append("\n");
		sb.append("    yieldToMaturity: ").append(toIndentedString(yieldToMaturity)).append("\n");
		sb.append("    bondMaturityDate: ").append(toIndentedString(bondMaturityDate)).append("\n");
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

	private static final Logger log = LoggerFactory.getLogger(DebtSecurity.class);

	public DebtSecurity getDebtSecurity(@Valid int debtSecurityId) throws FDXException {
		try {
			template = ConnectionConfigApi46.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("debtSecurityId", debtSecurityId);
			return template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".debtsecurity where debtsecurityid in (:debtSecurityId)", parameters,
					new DebtSecurityRowMapper());
		} catch (EmptyResultDataAccessException e) {
			throw new FDXException("Debt Security not found", 0);
		} catch (Exception e) {
			log.error("DebtSecurity : ", e);
			throw new FDXException(e,500);
		}
	}
}
