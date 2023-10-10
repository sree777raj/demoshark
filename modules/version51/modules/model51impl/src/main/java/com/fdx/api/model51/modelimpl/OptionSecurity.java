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
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import com.fdx.api.model51.config.ConnectionConfigApi51;
import com.fdx.api.model51.mapper.OptionSecurityRowMapper;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * An option
 */
@ApiModel(description = "An option")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class OptionSecurity {
	NamedParameterJdbcTemplate template;

	@JsonProperty(access = Access.WRITE_ONLY)
	private int optionSecurityId;

	@JsonProperty("secured")
	private Secured secured;

	@JsonProperty("optionType")
	private OptionType optionType;

	@JsonProperty("strikePrice")
	private BigDecimal strikePrice;

	@JsonProperty("expireDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private Date expireDate;

	@JsonProperty("sharesPerContract")
	private BigDecimal sharesPerContract;

	public OptionSecurity secured(Secured secured) {
		this.secured = secured;
		return this;
	}

	/**
	 * Get secured
	 * 
	 * @return secured
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Secured getSecured() {
		return secured;
	}

	public void setSecured(Secured secured) {
		this.secured = secured;
	}

	public OptionSecurity optionType(OptionType optionType) {
		this.optionType = optionType;
		return this;
	}

	/**
	 * Get optionType
	 * 
	 * @return optionType
	 */
	@ApiModelProperty(value = "")

	@Valid

	public OptionType getOptionType() {
		return optionType;
	}

	public void setOptionType(OptionType optionType) {
		this.optionType = optionType;
	}

	public OptionSecurity strikePrice(BigDecimal strikePrice) {
		this.strikePrice = strikePrice;
		return this;
	}

	/**
	 * Strike price / Unit price
	 * 
	 * @return strikePrice
	 */
	@ApiModelProperty(value = "Strike price / Unit price")

	@Valid

	public BigDecimal getStrikePrice() {
		return strikePrice;
	}

	public void setStrikePrice(BigDecimal strikePrice) {
		this.strikePrice = strikePrice;
	}

	public OptionSecurity expireDate(java.sql.Timestamp expireDate) {
		this.expireDate = expireDate;
		return this;
	}

	/**
	 * Get expireDate
	 * 
	 * @return expireDate
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Date getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	public OptionSecurity sharesPerContract(BigDecimal sharesPerContract) {
		this.sharesPerContract = sharesPerContract;
		return this;
	}

	/**
	 * Shares per contract
	 * 
	 * @return sharesPerContract
	 */
	@ApiModelProperty(value = "Shares per contract")

	@Valid

	public BigDecimal getSharesPerContract() {
		return sharesPerContract;
	}

	public void setSharesPerContract(BigDecimal sharesPerContract) {
		this.sharesPerContract = sharesPerContract;
	}

	public int getOptionSecurityId() {
		return optionSecurityId;
	}

	public void setOptionSecurityId(int optionSecurityId) {
		this.optionSecurityId = optionSecurityId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		OptionSecurity optionSecurity = (OptionSecurity) o;
		return Objects.equals(this.secured, optionSecurity.secured)
				&& Objects.equals(this.optionType, optionSecurity.optionType)
				&& Objects.equals(this.strikePrice, optionSecurity.strikePrice)
				&& Objects.equals(this.expireDate, optionSecurity.expireDate)
				&& Objects.equals(this.sharesPerContract, optionSecurity.sharesPerContract);
	}

	@Override
	public int hashCode() {
		return Objects.hash(secured, optionType, strikePrice, expireDate, sharesPerContract);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class OptionSecurity {\n");

		sb.append("    secured: ").append(toIndentedString(secured)).append("\n");
		sb.append("    optionType: ").append(toIndentedString(optionType)).append("\n");
		sb.append("    strikePrice: ").append(toIndentedString(strikePrice)).append("\n");
		sb.append("    expireDate: ").append(toIndentedString(expireDate)).append("\n");
		sb.append("    sharesPerContract: ").append(toIndentedString(sharesPerContract)).append("\n");
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

	private static final Logger log = LoggerFactory.getLogger(OptionSecurity.class);

	public OptionSecurity getOptionSecurity(int optionSecurityId) throws FDXException {
		try {
			SqlParameterSource parameters = new MapSqlParameterSource("optionSecurityId", optionSecurityId);
			template = ConnectionConfigApi51.getTemplate();;
			OptionSecurity optionSecurity = template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".OptionSecurity where optionSecurityId in (:optionSecurityId)", parameters,
					new OptionSecurityRowMapper());
			return optionSecurity;
		} catch (EmptyResultDataAccessException e) {
			throw new FDXException("Option Security not found", 0);
		} catch (Exception e) {
			log.error("OptionSecurity : ", e);
			throw new FDXException(e,500);
		}
	}
}
