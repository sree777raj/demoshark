package com.fdx.api.model46.modelimpl;

import java.util.Objects;

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
import com.fdx.api.model46.mapper.OtherSecurityRowMapper;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Any other kind of security
 */
@ApiModel(description = "Any other kind of security")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class OtherSecurity {

	NamedParameterJdbcTemplate template;

	@JsonProperty(access = Access.WRITE_ONLY)
	private int otherSecurityId;

	@JsonProperty("typeDescription")
	private String typeDescription;

	public OtherSecurity typeDescription(String typeDescription) {
		this.typeDescription = typeDescription;
		return this;
	}

	/**
	 * Description of other security
	 * 
	 * @return typeDescription
	 */
	@ApiModelProperty(value = "Description of other security")

	public String getTypeDescription() {
		return typeDescription;
	}

	public void setTypeDescription(String typeDescription) {
		this.typeDescription = typeDescription;
	}

	public int getOtherSecurityId() {
		return otherSecurityId;
	}

	public void setOtherSecurityId(int otherSecurityId) {
		this.otherSecurityId = otherSecurityId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		OtherSecurity otherSecurity = (OtherSecurity) o;
		return Objects.equals(this.typeDescription, otherSecurity.typeDescription);
	}

	@Override
	public int hashCode() {
		return Objects.hash(typeDescription);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class OtherSecurity {\n");

		sb.append("    typeDescription: ").append(toIndentedString(typeDescription)).append("\n");
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

	private static final Logger log = LoggerFactory.getLogger(OtherSecurity.class);

	public OtherSecurity getOtherSecurity(int otherSecurityId) throws FDXException {
		try {
			SqlParameterSource parameters = new MapSqlParameterSource("otherSecurityId", otherSecurityId);
			template = ConnectionConfigApi46.getTemplate();;
			return template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".otherSecurity where otherSecurityId in (:otherSecurityId)", parameters,
					new OtherSecurityRowMapper());
		} catch (EmptyResultDataAccessException e) {
			throw new FDXException("Other Security not found", 0);
		} catch (Exception e) {
			log.error("OtherSecurity : ", e);
			throw new FDXException(e,500);
		}
	}
}
