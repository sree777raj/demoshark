package com.fdx.api.model46.modelimpl;

import java.math.BigDecimal;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.OptBoolean;
import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import com.fdx.common.util.FdxConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fdx.api.model46.config.ConnectionConfigApi46;
import com.fdx.api.model46.mapper.PensionSourceRowMapper;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The source of pension funds
 */
@ApiModel(description = "The source of pension funds")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class PensionSource {

	NamedParameterJdbcTemplate template;

	@JsonProperty("displayName")
	private String displayName;

	@JsonProperty("amount")
	private BigDecimal amount;

	@JsonProperty("paymentOption")
	private String paymentOption;

	@JsonProperty("asOfDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, lenient = OptBoolean.FALSE)
	private java.sql.Timestamp asOfDate;

	@JsonProperty("frequency")
	private PaymentFrequency frequency;

	@JsonProperty("startDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, lenient = OptBoolean.FALSE)
	private java.sql.Timestamp startDate;

	public PensionSource displayName(String displayName) {
		this.displayName = displayName;
		return this;
	}

	/**
	 * Name of the source
	 * 
	 * @return displayName
	 */
	@ApiModelProperty(value = "Name of the source")

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public PensionSource amount(BigDecimal amount) {
		this.amount = amount;
		return this;
	}

	/**
	 * Benefit Amount
	 * 
	 * @return amount
	 */
	@ApiModelProperty(value = "Benefit Amount")

	@Valid

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public PensionSource paymentOption(String paymentOption) {
		this.paymentOption = paymentOption;
		return this;
	}

	/**
	 * Form of payment
	 * 
	 * @return paymentOption
	 */
	@ApiModelProperty(value = "Form of payment")

	public String getPaymentOption() {
		return paymentOption;
	}

	public void setPaymentOption(String paymentOption) {
		this.paymentOption = paymentOption;
	}

	public PensionSource asOfDate(java.sql.Timestamp asOfDate) {
		this.asOfDate = asOfDate;
		return this;
	}

	/**
	 * Get asOfDate
	 * 
	 * @return asOfDate
	 */
	@ApiModelProperty(value = "")

	@Valid

	public java.sql.Timestamp getAsOfDate() {
		return asOfDate;
	}

	public void setAsOfDate(java.sql.Timestamp asOfDate) {
		this.asOfDate = asOfDate;
	}

	public PensionSource frequency(PaymentFrequency frequency) {
		this.frequency = frequency;
		return this;
	}

	/**
	 * Get frequency
	 * 
	 * @return frequency
	 */
	@ApiModelProperty(value = "")

	@Valid

	public PaymentFrequency getFrequency() {
		return frequency;
	}

	public void setFrequency(PaymentFrequency frequency) {
		this.frequency = frequency;
	}

	public PensionSource startDate(java.sql.Timestamp startDate) {
		this.startDate = startDate;
		return this;
	}

	/**
	 * Get startDate
	 * 
	 * @return startDate
	 */
	@ApiModelProperty(value = "")

	@Valid

	public java.sql.Timestamp getStartDate() {
		return startDate;
	}

	public void setStartDate(java.sql.Timestamp startDate) {
		this.startDate = startDate;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PensionSource pensionSource = (PensionSource) o;
		return Objects.equals(this.displayName, pensionSource.displayName)
				&& Objects.equals(this.amount, pensionSource.amount)
				&& Objects.equals(this.paymentOption, pensionSource.paymentOption)
				&& Objects.equals(this.asOfDate, pensionSource.asOfDate)
				&& Objects.equals(this.frequency, pensionSource.frequency)
				&& Objects.equals(this.startDate, pensionSource.startDate);
	}

	@Override
	public int hashCode() {
		return Objects.hash(displayName, amount, paymentOption, asOfDate, frequency, startDate);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PensionSource {\n");

		sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
		sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
		sb.append("    paymentOption: ").append(toIndentedString(paymentOption)).append("\n");
		sb.append("    asOfDate: ").append(toIndentedString(asOfDate)).append("\n");
		sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
		sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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

	private static final Logger log = LoggerFactory.getLogger(PensionSource.class);

	public PensionSource getPensionSource(String displayName) throws FDXException {
		try {
			SqlParameterSource parameters = new MapSqlParameterSource("displayName", displayName);
			template = ConnectionConfigApi46.getTemplate();;
			PensionSource pensionSource = template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".pensionSource where displayName in (:displayName)", parameters,
					new PensionSourceRowMapper());
			return pensionSource;
		} catch (EmptyResultDataAccessException e) {
			throw new FDXException("Pension Source not found", 0);
		} catch (Exception e) {
			log.error("PensionSource : ", e);
			throw new FDXException(e, FdxConstants.HTTP_ERROR_CODE_500);
		}
	}
}
