package com.fdx.api.model51.modelimpl;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fdx.api.model51.config.ConnectionConfigApi51;
import com.fdx.api.model51.mapper.IndividualNameRowMapper;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * First name, middle initial, last name, suffix fields
 */
@ApiModel(description = "First name, middle initial, last name, suffix fields")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class IndividualName {

	NamedParameterJdbcTemplate template;

	@JsonIgnore
	private int nameid;

	@JsonProperty("first")
	private String first;

	@JsonProperty("middle")
	private String middle;

	@JsonProperty("last")
	private String last;

	@JsonProperty("suffix")
	private String suffix;

	public IndividualName first(String first) {
		this.first = first;
		return this;
	}

	/**
	 * First name
	 * 
	 * @return first
	 */
	@ApiModelProperty(value = "First name")

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public IndividualName middle(String middle) {
		this.middle = middle;
		return this;
	}

	/**
	 * Middle initial
	 * 
	 * @return middle
	 */
	@ApiModelProperty(value = "Middle initial")

	public String getMiddle() {
		return middle;
	}

	public void setMiddle(String middle) {
		this.middle = middle;
	}

	public IndividualName last(String last) {
		this.last = last;
		return this;
	}

	/**
	 * Last name
	 * 
	 * @return last
	 */
	@ApiModelProperty(value = "Last name")

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public IndividualName suffix(String suffix) {
		this.suffix = suffix;
		return this;
	}

	/**
	 * Generational or academic suffix
	 * 
	 * @return suffix
	 */
	@ApiModelProperty(value = "Generational or academic suffix")

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public int getNameid() {
		return nameid;
	}

	public void setNameid(int nameid) {
		this.nameid = nameid;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		IndividualName individualName = (IndividualName) o;
		return Objects.equals(this.first, individualName.first) && Objects.equals(this.middle, individualName.middle)
				&& Objects.equals(this.last, individualName.last) && Objects.equals(this.suffix, individualName.suffix);
	}

	@Override
	public int hashCode() {
		return Objects.hash(first, middle, last, suffix);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class IndividualName {\n");

		sb.append("    first: ").append(toIndentedString(first)).append("\n");
		sb.append("    middle: ").append(toIndentedString(middle)).append("\n");
		sb.append("    last: ").append(toIndentedString(last)).append("\n");
		sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
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

	private static final Logger log = LoggerFactory.getLogger(IndividualName.class);

	public IndividualName getIndividualName(int nameId) throws FDXException {
		try {
			template = ConnectionConfigApi51.getTemplate();
			SqlParameterSource parameters = new MapSqlParameterSource("nameId", nameId);
			return template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".individualName where nameId in (:nameId)", parameters,
					new IndividualNameRowMapper());
		} catch (EmptyResultDataAccessException e) {
			throw new FDXException("Individual Name not found", 0);
		} catch (Exception e) {
			log.error("IndividualName : ", e);
			throw new FDXException(e,500);
		}
	}

	public Map<String, Object> updateIndividualName(MerchantForUpdate merchantForUpdate, Merchant merchant, Field field)
			throws FDXException {
		try {
			template = ConnectionConfigApi51.getTemplate();
			int nameId = 0;
			field.setAccessible(true);
			SqlParameterSource parameters = new MapSqlParameterSource("payeeId", null);
			StringBuffer nameQuery = new StringBuffer();
			nameQuery.append("update "+ DeveloperContext.getDeveloperSchema() +".individualname set ");
			List<String> changedPropertiesName = new ArrayList<>();
			for (Field nameField : merchantForUpdate.getName().getIndividualName().getClass().getDeclaredFields()) {
				nameField.setAccessible(true);
				Object name1 = nameField.get(merchantForUpdate.getName().getIndividualName());
				/*
				 * if (merchant.getMerchantForUpdate().getName().getIndividualName() == null) {
				 * Map<String, Object> keys =
				 * merchantForUpdate.getName().getIndividualName().insertIndividualName();
				 * return keys; // }
				 */ Object name2 = nameField.get(merchant.getMerchantForUpdate().getName().getIndividualName());
				if ((nameField.getName()).equals("nameid"))
					nameId = (int) merchant.getMerchantForUpdate().getName().getNameId();
				if (name1 != null && name2 != null) {
					if (!(name1.toString().contains("Template")) && !Objects.equals(name1, name2)) {
						changedPropertiesName.add(nameField.getName());
						nameQuery.append(nameField.getName() + "='" + name1 + "',");
					}
				}
			}
			int countName = 0;
			String nameQuery1 = nameQuery.substring(0, nameQuery.length() - 1);
			StringBuffer newQuery = new StringBuffer();
			newQuery.append(nameQuery1);
			if (changedPropertiesName.size() != 0) {
				newQuery.append(" where nameid='" + nameId + "'");
				countName = template.update(newQuery.toString(), parameters);
			}
		} catch (Exception e) {
			log.error("IndividualName : ", e);
			throw new FDXException(e,500);
		}
		return null;
	}

	public Map<String, Object> insertIndividualName() throws FDXException {
		KeyHolder keyHolder = new GeneratedKeyHolder();
		try {

			template = ConnectionConfigApi51.getTemplate();
			;
			SqlParameterSource parameters = new MapSqlParameterSource("payeeId", null);

			int count = template.update("insert into "+ DeveloperContext.getDeveloperSchema() +".individualname (first, middle, last, suffix) values ("
					+ ((first != null) ? ("'" + first + "'") : null) + ","
					+ ((middle != null) ? ("'" + middle + "'") : null) + ","
					+ ((last != null) ? ("'" + last + "'") : null) + ","
					+ ((suffix != null) ? ("'" + suffix + "'") : null) + ")", parameters, keyHolder);
		} catch (Exception e) {
			log.error("IndividualName : ", e);
			throw new FDXException(e,500);
		}
		return keyHolder.getKeys();

	}
}
