package com.fdx.api.model51.modelimpl;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

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
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fdx.api.model51.config.ConnectionConfigApi51;
import com.fdx.api.model51.mapper.TelephoneNumberRowMapper;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Standard for international phone numbers
 */
@ApiModel(description = "Standard for international phone numbers")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class TelephoneNumber {

	NamedParameterJdbcTemplate template;

	@JsonIgnore
	private int telephoneId;

	@JsonProperty("type")
	private TelephoneNumberType type;

	@JsonProperty("country")
	private String country;

	@JsonProperty("number")
	private String number;

	public TelephoneNumber type(TelephoneNumberType type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 */
	@ApiModelProperty(value = "")

	@Valid

	public TelephoneNumberType getType() {
		return type;
	}

	public void setType(TelephoneNumberType type) {
		this.type = type;
	}

	public TelephoneNumber country(String country) {
		this.country = country;
		return this;
	}

	/**
	 * Country calling codes defined by ITU-T recommendations E.123 and E.164
	 * 
	 * @return country
	 */
	@ApiModelProperty(value = "Country calling codes defined by ITU-T recommendations E.123 and E.164")

	@Size(max = 3)
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public TelephoneNumber number(String number) {
		this.number = number;
		return this;
	}

	/**
	 * Telephone subscriber number defined by ITU-T recommendation E.164
	 * 
	 * @return number
	 */
	@ApiModelProperty(value = "Telephone subscriber number defined by ITU-T recommendation E.164")

	@Pattern(regexp = "\\d+")
	@Size(max = 15)
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getTelephoneId() {
		return telephoneId;
	}

	public void setTelephoneId(int telephoneId) {
		this.telephoneId = telephoneId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		result = prime * result + telephoneId;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		TelephoneNumber other = (TelephoneNumber) obj;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		if (telephoneId != other.telephoneId)
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TelephoneNumber [telephoneId=" + telephoneId + ", type=" + type + ", country=" + country + ", number="
				+ number + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(TelephoneNumber.class);

	public TelephoneNumber getTelephoneNumber(int telephoneId) throws FDXException {
		try {
			template = ConnectionConfigApi51.getTemplate();
			SqlParameterSource parameters = new MapSqlParameterSource("telephoneId", telephoneId);
			TelephoneNumber telephoneNumber = new TelephoneNumber();
			TelephoneNumber telephoneNumberResponse = template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".telephonenumber where telephoneId in (:telephoneId)", parameters,
					new TelephoneNumberRowMapper());
			telephoneNumber.setCountry(telephoneNumberResponse.getCountry());
			telephoneNumber.setNumber(telephoneNumberResponse.getNumber());
			telephoneNumber.setType(telephoneNumberResponse.getType());
			return telephoneNumber;
		} catch (EmptyResultDataAccessException e) {
			throw new FDXException(Errors.TELEPHONE_NUMBER_NOT_FOUND, 0);
		} catch (Exception e) {
			log.error("TelephoneNumber : ", e);
			throw new FDXException(e, FdxConstants.HTTP_ERROR_CODE_500);
		}
	}

	public Map<String, Object> updateTelephone(MerchantForUpdate merchantForUpdate, Merchant merchant, Field field)
			throws FDXException {
		try {
			template = ConnectionConfigApi51.getTemplate();
			int phoneId = 0;
			field.setAccessible(true);
			SqlParameterSource parameters = new MapSqlParameterSource("payeeId", null);
			number = merchantForUpdate.getPhone().getNumber();
			if (number == null || !number.matches("[0-9]+")) {
				log.error("Telephone number is invalid : " + number);
				throw new FDXException(401);
			}
			StringBuffer phoneQuery = new StringBuffer();
			phoneQuery.append("update "+ DeveloperContext.getDeveloperSchema() +".TelephoneNumber set ");
			List<String> changedPropertiesPhone = new ArrayList<>();
			for (Field nameField : merchantForUpdate.getPhone().getClass().getDeclaredFields()) {
				nameField.setAccessible(true);
				Object name1 = nameField.get(merchantForUpdate.getPhone());
				if (merchant.getMerchantForUpdate().getPhone() == null) {
					Map<String, Object> keys = merchantForUpdate.getPhone().insertTelephone();
					return keys;
				}
				Object name2 = nameField.get(merchant.getMerchantForUpdate().getPhone());
				if ((nameField.getName()).equals("telephoneId"))
					phoneId = (int) merchant.getMerchantForUpdate().getPhoneId();
				if (name1 != null && name2 != null) {
					if (!Objects.equals(name1, name2)) {
						changedPropertiesPhone.add(nameField.getName());
						phoneQuery.append(nameField.getName() + "='" + name1 + "',");
					}
				}
			}
			int countName = 0;
			String nameQuery1 = phoneQuery.substring(0, phoneQuery.length() - 1);
			StringBuffer newQuery = new StringBuffer();
			newQuery.append(nameQuery1);
			if (changedPropertiesPhone.size() != 0) {
				newQuery.append(" where telephoneId='" + phoneId + "'");
				countName = template.update(newQuery.toString(), parameters);
			}
			return null;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("TelephoneNumber : ", e);
			throw new FDXException(e,FdxConstants.HTTP_ERROR_CODE_500);
		}
	}

	public Map<String, Object> insertTelephone() throws FDXException {
		KeyHolder keyHolder = new GeneratedKeyHolder();
		try {
			template = ConnectionConfigApi51.getTemplate();
			SqlParameterSource parameters = new MapSqlParameterSource("payeeId", null);
			if (number == null || !number.matches("[0-9]+")) {
				log.error("Telephone number is invalid : " + number);
				throw new FDXException(401);
			}
			int count = template.update("insert into "+ DeveloperContext.getDeveloperSchema() +".telephonenumber (type,country,number) values ("
					+ ((type != null) ? ("'" + type + "'") : null) + ","
					+ ((country != null) ? ("'" + country + "'") : null) + ","
					+ ((number != null) ? ("'" + number + "'") : null) + ")", parameters, keyHolder);
			return keyHolder.getKeys();
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("TelephoneNumber : ", e);
			throw new FDXException(e,FdxConstants.HTTP_ERROR_CODE_500);
		}
	}
}
