package com.fdx.api.model46.modelimpl;

import java.math.BigDecimal;
import java.util.Objects;

import javax.validation.Valid;

import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fdx.api.model46.config.ConnectionConfigApi46;
import com.fdx.api.model46.mapper.CurrencyRowMapper;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Represents an international currency
 */
@ApiModel(description = "Represents an international currency")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Currency {

	NamedParameterJdbcTemplate template;

	@JsonProperty("currencyRate")
	private BigDecimal currencyRate;

	@JsonProperty("currencyCode")
	private Iso4217Code currencyCode;

	@JsonProperty("originalCurrencyCode")
	private Iso4217Code originalCurrencyCode;

	public Currency currencyRate(BigDecimal currencyRate) {
		this.currencyRate = currencyRate;
		return this;
	}

	/**
	 * Currency rate between original and converted currency
	 * 
	 * @return currencyRate
	 */
	@ApiModelProperty(value = "Currency rate between original and converted currency")

	@Valid

	public BigDecimal getCurrencyRate() {
		return currencyRate;
	}

	public void setCurrencyRate(BigDecimal currencyRate) {
		this.currencyRate = currencyRate;
	}

	public Currency currencyCode(Iso4217Code currencyCode) {
		this.currencyCode = currencyCode;
		return this;
	}

	/**
	 * Get currencyCode
	 * 
	 * @return currencyCode
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Iso4217Code getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(Iso4217Code currencyCode) {
		this.currencyCode = currencyCode;
	}

	public Currency originalCurrencyCode(Iso4217Code originalCurrencyCode) {
		this.originalCurrencyCode = originalCurrencyCode;
		return this;
	}

	/**
	 * Get originalCurrencyCode
	 * 
	 * @return originalCurrencyCode
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Iso4217Code getOriginalCurrencyCode() {
		return originalCurrencyCode;
	}

	public void setOriginalCurrencyCode(Iso4217Code originalCurrencyCode) {
		this.originalCurrencyCode = originalCurrencyCode;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Currency currency = (Currency) o;
		return Objects.equals(this.currencyRate, currency.currencyRate)
				&& Objects.equals(this.currencyCode, currency.currencyCode)
				&& Objects.equals(this.originalCurrencyCode, currency.originalCurrencyCode);
	}

	@Override
	public int hashCode() {
		return Objects.hash(currencyRate, currencyCode, originalCurrencyCode);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Currency {\n");

		sb.append("    currencyRate: ").append(toIndentedString(currencyRate)).append("\n");
		sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
		sb.append("    originalCurrencyCode: ").append(toIndentedString(originalCurrencyCode)).append("\n");
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

	private static final Logger log = LoggerFactory.getLogger(Currency.class);

	public Currency getCurrency(String currencyCode) throws FDXException {
		try {
			template = ConnectionConfigApi46.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("currencyCode", currencyCode);
			return template.queryForObject("select * from "+ DeveloperContext.getDeveloperSchema() +".Currency where currencyCode in (:currencyCode)",
					new MapSqlParameterSource().addValue("currencyCode", currencyCode, java.sql.Types.OTHER),
					new CurrencyRowMapper());
		} catch (EmptyResultDataAccessException e) {
			throw new FDXException("Currency not found", 0);
		} catch (Exception e) {
			log.error("Currency : ", e);
			throw new FDXException(e,500);
		}
	}
}
