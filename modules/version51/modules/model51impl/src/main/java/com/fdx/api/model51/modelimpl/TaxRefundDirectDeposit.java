package com.fdx.api.model51.modelimpl;

import java.util.Objects;

import com.fdx.common.exception.Errors;
import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import com.fdx.common.util.FdxConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fdx.api.model51.config.ConnectionConfigApi51;
import com.fdx.api.model51.mapper.TaxRefundDirectDepositRowMapper;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * IRS Form 8888 Direct Deposit Information
 */
@ApiModel(description = "IRS Form 8888 Direct Deposit Information")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class TaxRefundDirectDeposit {

	NamedParameterJdbcTemplate template;

	@JsonProperty("institutionName")
	private String institutionName;

	@JsonProperty("rtn")
	private String rtn;

	@JsonProperty("accountNumber")
	private String accountNumber;

	@JsonProperty("accountNickName")
	private String accountNickName;

	public TaxRefundDirectDeposit institutionName(String institutionName) {
		this.institutionName = institutionName;
		return this;
	}

	/**
	 * Name of institution
	 * 
	 * @return institutionName
	 */
	@ApiModelProperty(value = "Name of institution")

	public String getInstitutionName() {
		return institutionName;
	}

	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}

	public TaxRefundDirectDeposit rtn(String rtn) {
		this.rtn = rtn;
		return this;
	}

	/**
	 * Routing transit number
	 * 
	 * @return rtn
	 */
	@ApiModelProperty(value = "Routing transit number")

	public String getRtn() {
		return rtn;
	}

	public void setRtn(String rtn) {
		this.rtn = rtn;
	}

	public TaxRefundDirectDeposit accountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
		return this;
	}

	/**
	 * Account number
	 * 
	 * @return accountNumber
	 */
	@ApiModelProperty(value = "Account number")

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public TaxRefundDirectDeposit accountNickName(String accountNickName) {
		this.accountNickName = accountNickName;
		return this;
	}

	/**
	 * Account nickname
	 * 
	 * @return accountNickName
	 */
	@ApiModelProperty(value = "Account nickname")

	public String getAccountNickName() {
		return accountNickName;
	}

	public void setAccountNickName(String accountNickName) {
		this.accountNickName = accountNickName;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		TaxRefundDirectDeposit taxRefundDirectDeposit = (TaxRefundDirectDeposit) o;
		return Objects.equals(this.institutionName, taxRefundDirectDeposit.institutionName)
				&& Objects.equals(this.rtn, taxRefundDirectDeposit.rtn)
				&& Objects.equals(this.accountNumber, taxRefundDirectDeposit.accountNumber)
				&& Objects.equals(this.accountNickName, taxRefundDirectDeposit.accountNickName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(institutionName, rtn, accountNumber, accountNickName);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TaxRefundDirectDeposit {\n");

		sb.append("    institutionName: ").append(toIndentedString(institutionName)).append("\n");
		sb.append("    rtn: ").append(toIndentedString(rtn)).append("\n");
		sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
		sb.append("    accountNickName: ").append(toIndentedString(accountNickName)).append("\n");
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

	private static final Logger log = LoggerFactory.getLogger(TaxRefundDirectDeposit.class);

	@JsonIgnore
	public TaxRefundDirectDeposit getTaxRefundDetails() throws FDXException {
		try {
			SqlParameterSource parameters = new MapSqlParameterSource("loggedInAccountId", null);
			template = ConnectionConfigApi51.getTemplate();
			return template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".taxrefunddirectdeposit limit 1", parameters,
					new TaxRefundDirectDepositRowMapper());
		} catch (EmptyResultDataAccessException e) {
			throw new FDXException(Errors.TAX_REFUND_DIRECT_DEPOSIT_NOT_FOUND, 0);
		} catch (Exception e) {
			log.error("TaxRefundDirectDeposit : ", e);
			throw new FDXException(e, FdxConstants.HTTP_ERROR_CODE_500);
		}
	}

}
