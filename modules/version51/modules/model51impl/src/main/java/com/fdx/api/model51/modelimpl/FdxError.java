package com.fdx.api.model51.modelimpl;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fdx.api.model51.config.ConnectionConfigApi51;
import com.fdx.api.model51.mapper.FdxErrorRowMapper;
import com.fdx.api.model51.model.FdxError51;
import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * An error entity which can be used at the API level for error responses or at
 * the account level to indicate a problem specific to a particular account
 */
@ApiModel(description = "An error entity which can be used at the API level for error responses or at the account level to indicate a problem specific to a particular account")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
@Repository("FdxError51")
public class FdxError implements FdxError51<FdxError> {

	NamedParameterJdbcTemplate template;

	/**
	 * Application Realm Enum
	 */
	public enum ApplicationRealm {
		TDM("TDM"),

		API("API");

		private String value;

		ApplicationRealm(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static FdxError.ApplicationRealm fromValue(String value) {
			for (FdxError.ApplicationRealm b : FdxError.ApplicationRealm.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected ApplicationRealm value '" + value + "'");
		}
	}

	@JsonProperty("code")
	private String code;

	@JsonProperty("message")
	private String message;

	@JsonProperty("realm")
	private ApplicationRealm realm;

	@JsonProperty("httpStatusCode")
	private int httpStatusCode;

	public FdxError code(String code) {
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

	public FdxError message(String message) {
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

	public ApplicationRealm getRealm() {
		return realm;
	}

	public void setRealm(ApplicationRealm realm) {
		this.realm = realm;
	}

	public int getHttpStatusCode() {
		return httpStatusCode;
	}

	public void setHttpStatusCode(int httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + httpStatusCode;
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		result = prime * result + ((realm == null) ? 0 : realm.hashCode());
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
		FdxError other = (FdxError) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (httpStatusCode != other.httpStatusCode)
				return false;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		if (realm == null) {
			if (other.realm != null)
				return false;
		} else if (!realm.equals(other.realm))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FdxError [code=" + code + ", message=" + message + ", realm=" + realm + ", httpStatusCode="
				+ httpStatusCode + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(FdxError.class);

	@Override
	public FdxError getFdxError(int errorCode, String realm) throws FDXException {
		template = ConnectionConfigApi51.getTemplate();
		try {
			return template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".fdxerror where errorCode in (:errorCode) and realm in (:realm)",
					new MapSqlParameterSource().addValue("errorCode", errorCode).addValue("realm", realm, java.sql.Types.OTHER),
					new FdxErrorRowMapper());
		} catch (Exception e) {
			log.error("FdxError : ", e);
			throw new FDXException(e,500);
		}
	}
}
