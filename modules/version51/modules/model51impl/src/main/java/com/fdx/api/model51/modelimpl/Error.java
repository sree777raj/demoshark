package com.fdx.api.model51.modelimpl;

import java.util.Objects;

import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fdx.api.model51.config.ConnectionConfigApi51;
import com.fdx.api.model51.mapper.ErrorRowMapper;
import com.fdx.api.model51.model.Error51;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * An error entity which can be used at the API level for error responses or at
 * the account level to indicate a problem specific to a particular account
 */
@ApiModel(description = "An error entity which can be used at the API level for error responses or at the account level to indicate a problem specific to a particular account")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
@Repository("Error51")
public class Error implements Error51<Error> {

	NamedParameterJdbcTemplate template;

	@JsonProperty("code")
	private String code;

	@JsonProperty("message")
	private String message;

	public Error code(String code) {
		this.code = code;
		return this;
	}

	/**
	 * Long term persistent identifier which can be used to trace error condition
	 * back to log information
	 * 
	 * @return code
	 */
	@ApiModelProperty(value = "Long term persistent identifier which can be used to trace error condition back to log information")

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Error message(String message) {
		this.message = message;
		return this;
	}

	/**
	 * End user displayable information which might help the customer diagnose an
	 * error
	 * 
	 * @return message
	 */
	@ApiModelProperty(value = "End user displayable information which might help the customer diagnose an error")

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Error error = (Error) o;
		return Objects.equals(this.code, error.code) && Objects.equals(this.message, error.message);
	}

	@Override
	public int hashCode() {
		return Objects.hash(code, message);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Error {\n");

		sb.append("    code: ").append(toIndentedString(code)).append("\n");
		sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

	private static final Logger log = LoggerFactory.getLogger(Error.class);

	public Error getError(String code) throws FDXException {
		Error error = new Error();
		try {
			
			template = ConnectionConfigApi51.getTemplate();;

			SqlParameterSource parameters = new MapSqlParameterSource("code", code);
			error = template.queryForObject("select * from "+ DeveloperContext.getDeveloperSchema() +".Error where code in (:code)", parameters,
					new ErrorRowMapper());
		} catch (Exception e) {
			log.error("Error : ", e);
			throw new FDXException(e,500);
		}
		return error;
	}

	@Override
	public Error getErrorObject(String errorCode, String message) {
		Error error = new Error();
		error.setCode(errorCode);
		error.setMessage(message);
		return error;
	}

}
