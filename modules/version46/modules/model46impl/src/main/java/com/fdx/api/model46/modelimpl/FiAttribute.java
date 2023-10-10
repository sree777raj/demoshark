package com.fdx.api.model46.modelimpl;

import java.util.Objects;

import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fdx.api.model46.config.ConnectionConfigApi46;
import com.fdx.api.model46.mapper.FiAttributeRowMapper;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Financial Institution provider-specific attribute
 */
@ApiModel(description = "Financial Institution provider-specific attribute")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class FiAttribute {

	NamedParameterJdbcTemplate template;

	@JsonProperty("name")
	private String name;

	@JsonProperty("value")
	private String value;

	public FiAttribute name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Name of attribute
	 * 
	 * @return name
	 */
	@ApiModelProperty(value = "Name of attribute")

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public FiAttribute value(String value) {
		this.value = value;
		return this;
	}

	/**
	 * Value of attribute
	 * 
	 * @return value
	 */
	@ApiModelProperty(value = "Value of attribute")

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		FiAttribute fiAttribute = (FiAttribute) o;
		return Objects.equals(this.name, fiAttribute.name) && Objects.equals(this.value, fiAttribute.value);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, value);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class FiAttribute {\n");

		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

	private static final Logger log = LoggerFactory.getLogger(FiAttribute.class);

	public FiAttribute getFiAttribute(int taxAttrId) throws FDXException {
		FiAttribute fiAttribute = new FiAttribute();
		try {
			
			template = ConnectionConfigApi46.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("taxAttrId", taxAttrId);
			fiAttribute = template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".FiAttribute where taxAttrId in (:taxAttrId)", parameters,
					new FiAttributeRowMapper());
		} catch (Exception e) {
			log.error("FiAttribute : ", e);
			throw new FDXException(e,500);
		}
		return fiAttribute;
	}

}
