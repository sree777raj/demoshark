package com.fdx.api.model51.modelimpl;

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
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fdx.api.model51.config.ConnectionConfigApi51;
import com.fdx.api.model51.mapper.TaxFormAttributeRowMapper;

import io.swagger.annotations.ApiModel;

/**
 * An additional tax form attribute for use when a defined field is not
 * available
 */
@ApiModel(description = "An additional tax form attribute for use when a defined field is not available")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class TaxFormAttribute {

	NamedParameterJdbcTemplate template;

	@JsonIgnore
	private int taxAttrId;

	@JsonUnwrapped
	private FiAttribute fiAttribute;

	@JsonProperty("boxNumber")
	private String boxNumber;

	@JsonProperty("code")
	private String code;

	@JsonProperty("name")
	private String name;

	@JsonProperty("value")
	private String value;

	public int getTaxAttrId() {
		return taxAttrId;
	}

	public void setTaxAttrId(int taxAttrId) {
		this.taxAttrId = taxAttrId;
	}

	public FiAttribute getFiAttribute() {
		return fiAttribute;
	}

	public void setFiAttribute(FiAttribute fiAttribute) {
		this.fiAttribute = fiAttribute;
	}

	public String getBoxNumber() {
		return boxNumber;
	}

	public void setBoxNumber(String boxNumber) {
		this.boxNumber = boxNumber;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((boxNumber == null) ? 0 : boxNumber.hashCode());
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
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
		TaxFormAttribute other = (TaxFormAttribute) obj;
		if (boxNumber == null) {
			if (other.boxNumber != null)
				return false;
		} else if (!boxNumber.equals(other.boxNumber))
			return false;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TaxFormAttribute [boxNumber=" + boxNumber + ", code=" + code + ", name=" + name + ", value=" + value
				+ "]";
	}

	private static final Logger log = LoggerFactory.getLogger(TaxFormAttribute.class);

	public TaxFormAttribute getTaxFormAttribute(int taxAttrId) throws FDXException {
		try {
			template = ConnectionConfigApi51.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("taxAttrId", taxAttrId);
			return template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".taxFormAttribute where taxAttrId in (:taxAttrId)", parameters,
					new TaxFormAttributeRowMapper());
		} catch (EmptyResultDataAccessException e) {
			throw new FDXException("Tax Form Attribute not found", 0);
		} catch (Exception e) {
			log.error("TaxFormAttribute : ", e);
			throw new FDXException(e, FdxConstants.HTTP_ERROR_CODE_500);
		}
	}
}
