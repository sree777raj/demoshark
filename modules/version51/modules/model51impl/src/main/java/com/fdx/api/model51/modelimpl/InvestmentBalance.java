package com.fdx.api.model51.modelimpl;

import java.math.BigDecimal;
import java.util.Date;

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
import com.fdx.api.model51.config.ConnectionConfigApi51;
import com.fdx.api.model51.mapper.InvestmentBalanceRowMapper;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A point-in-time balance of the investment account
 */
@ApiModel(description = "A point-in-time balance of the investment account")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class InvestmentBalance {

	NamedParameterJdbcTemplate template;

	@JsonProperty("balanceName")
	private String balanceName;

	@JsonProperty("balanceDescription")
	private String balanceDescription;

	@JsonProperty("balanceType")
	private InvestmentBalanceType balanceType;

	@JsonProperty("balanceValue")
	private BigDecimal balanceValue;

	@JsonProperty("balanceDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private Date balanceDate;

	@JsonProperty("currency")
	private Currency currency;

	public InvestmentBalance balanceName(String balanceName) {
		this.balanceName = balanceName;
		return this;
	}

	/**
	 * Name of the balance
	 * 
	 * @return balanceName
	 */
	@ApiModelProperty(value = "Name of the balance")

	public String getBalanceName() {
		return balanceName;
	}

	public void setBalanceName(String balanceName) {
		this.balanceName = balanceName;
	}

	public InvestmentBalance balanceDescription(String balanceDescription) {
		this.balanceDescription = balanceDescription;
		return this;
	}

	/**
	 * Description of balance
	 * 
	 * @return balanceDescription
	 */
	@ApiModelProperty(value = "Description of balance")

	public String getBalanceDescription() {
		return balanceDescription;
	}

	public void setBalanceDescription(String balanceDescription) {
		this.balanceDescription = balanceDescription;
	}

	public InvestmentBalance balanceType(InvestmentBalanceType balanceType) {
		this.balanceType = balanceType;
		return this;
	}

	/**
	 * Get balanceType
	 * 
	 * @return balanceType
	 */
	@ApiModelProperty(value = "")

	@Valid

	public InvestmentBalanceType getBalanceType() {
		return balanceType;
	}

	public void setBalanceType(InvestmentBalanceType balanceType) {
		this.balanceType = balanceType;
	}

	public InvestmentBalance balanceValue(BigDecimal balanceValue) {
		this.balanceValue = balanceValue;
		return this;
	}

	/**
	 * Value of named balance
	 * 
	 * @return balanceValue
	 */
	@ApiModelProperty(value = "Value of named balance")

	@Valid

	public InvestmentBalance balanceDate(java.sql.Timestamp balanceDate) {
		this.balanceDate = balanceDate;
		return this;
	}

	public BigDecimal getBalanceValue() {
		return balanceValue;
	}

	public void setBalanceValue(BigDecimal balanceValue) {
		this.balanceValue = balanceValue;
	}

	/**
	 * Get balanceDate
	 * 
	 * @return balanceDate
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Date getBalanceDate() {
		return balanceDate;
	}

	public void setBalanceDate(Date balanceDate) {
		this.balanceDate = balanceDate;
	}

	public InvestmentBalance currency(Currency currency) {
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

	@Override
	public String toString() {
		return "InvestmentBalance [balanceName=" + balanceName + ", balanceDescription=" + balanceDescription
				+ ", balanceType=" + balanceType + ", balanceValue=" + balanceValue + ", balanceDate=" + balanceDate
				+ ", currency=" + currency + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((balanceDate == null) ? 0 : balanceDate.hashCode());
		result = prime * result + ((balanceDescription == null) ? 0 : balanceDescription.hashCode());
		result = prime * result + ((balanceName == null) ? 0 : balanceName.hashCode());
		result = prime * result + ((balanceType == null) ? 0 : balanceType.hashCode());
		result = prime * result + ((balanceValue == null) ? 0 : balanceValue.hashCode());
		result = prime * result + ((currency == null) ? 0 : currency.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InvestmentBalance other = (InvestmentBalance) obj;
		if (balanceDate == null) {
			if (other.balanceDate != null)
				return false;
		} else if (!balanceDate.equals(other.balanceDate))
			return false;
		if (balanceDescription == null) {
			if (other.balanceDescription != null)
				return false;
		} else if (!balanceDescription.equals(other.balanceDescription))
			return false;
		if (balanceName == null) {
			if (other.balanceName != null)
				return false;
		} else if (!balanceName.equals(other.balanceName))
			return false;
		if (balanceType != other.balanceType)
			return false;
		if (balanceValue == null) {
			if (other.balanceValue != null)
				return false;
		} else if (!balanceValue.equals(other.balanceValue))
			return false;
		if (currency == null) {
			if (other.currency != null)
				return false;
		} else if (!currency.equals(other.currency))
			return false;
		return true;
	}

	private static final Logger log = LoggerFactory.getLogger(InvestmentBalance.class);

	public InvestmentBalance getInvestmentBalance(String balanceName) throws FDXException {
		try {
			SqlParameterSource parameters = new MapSqlParameterSource("balanceName", balanceName);
			template = ConnectionConfigApi51.getTemplate();
			Currency currency = new Currency();
			InvestmentBalance investmentBalance = template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".investmentBalance where balanceName in (:balanceName)", parameters,
					new InvestmentBalanceRowMapper());
			investmentBalance
					.setCurrency(currency.getCurrency(investmentBalance.getCurrency().getCurrencyCode().toString()));
			return investmentBalance;
		} catch (EmptyResultDataAccessException e) {
			throw new FDXException("Investment Balance not found", 0);
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("InvestmentBalance : ", e);
			throw new FDXException(e, FdxConstants.HTTP_ERROR_CODE_500);
		}
	}
}
