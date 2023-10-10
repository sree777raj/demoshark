package com.fdx.api.model46.modelimpl;

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
import com.fdx.api.model46.config.ConnectionConfigApi46;
import com.fdx.api.model46.mapper.CodeAmountRowMapper;

import io.swagger.annotations.ApiModel;

/**
 * Code and amount pair used on IRS W-2, K-1, etc.
 */
@ApiModel(description = "Code and amount pair used on IRS W-2, K-1, etc.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class CodeAmount {

	NamedParameterJdbcTemplate template;

	@JsonIgnore
	private int codeAmountId;

	@JsonProperty("code")
	private String code;

	@JsonProperty("amount")
	private Double amount;

	public int getCodeAmountId() {
		return codeAmountId;
	}

	public void setCodeAmountId(int codeAmountId) {
		this.codeAmountId = codeAmountId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((amount == null) ? 0 : amount.hashCode());
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + codeAmountId;
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
		CodeAmount other = (CodeAmount) obj;
		if (amount == null) {
			if (other.amount != null)
				return false;
		} else if (!amount.equals(other.amount))
			return false;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (codeAmountId != other.codeAmountId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CodeAmount [codeAmountId=" + codeAmountId + ", code=" + code + ", amount=" + amount + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(CodeAmount.class);

	public CodeAmount getCodeAmount(int codeAmountId) throws FDXException {
		try {
			template = ConnectionConfigApi46.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("codeAmountId", codeAmountId);
			return template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".codeAmount where codeAmountId in (:codeAmountId)", parameters,
					new CodeAmountRowMapper());
		} catch (EmptyResultDataAccessException e) {
			throw new FDXException(Errors.CODE_AMOUNT_NOT_FOUND, 0);
		} catch (Exception e) {
			log.error("CodeAmount : ", e);
			throw new FDXException(e, FdxConstants.HTTP_ERROR_CODE_500);
		}
	}
}
