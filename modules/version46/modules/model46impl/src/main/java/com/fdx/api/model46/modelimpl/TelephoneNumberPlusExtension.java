package com.fdx.api.model46.modelimpl;

import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fdx.api.model46.config.ConnectionConfigApi46;
import com.fdx.api.model46.mapper.TelephoneNumberPlusExtensionRowMapper;

import io.swagger.annotations.ApiModel;

/**
 * A telephone number that can contain optional text for an arbitrary length
 * telephone extension number
 */
@ApiModel(description = "A telephone number that can contain optional text for an arbitrary length telephone extension number")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class TelephoneNumberPlusExtension {

	NamedParameterJdbcTemplate template;

	@JsonIgnore
	private int phoneId;

	@JsonUnwrapped
	private TelephoneNumber telephoneNumber;

	@JsonProperty("extension")
	private String extension;

	public TelephoneNumber getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(TelephoneNumber telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public int getPhoneId() {
		return phoneId;
	}

	public void setPhoneId(int phoneId) {
		this.phoneId = phoneId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((extension == null) ? 0 : extension.hashCode());
		result = prime * result + ((telephoneNumber == null) ? 0 : telephoneNumber.hashCode());
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
		TelephoneNumberPlusExtension other = (TelephoneNumberPlusExtension) obj;
		if (extension == null) {
			if (other.extension != null)
				return false;
		} else if (!extension.equals(other.extension))
			return false;
		if (telephoneNumber == null) {
			if (other.telephoneNumber != null)
				return false;
		} else if (!telephoneNumber.equals(other.telephoneNumber))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TelephoneNumberPlusExtension [telephoneNumber=" + telephoneNumber + ", extension=" + extension + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(TelephoneNumberPlusExtension.class);

	public TelephoneNumberPlusExtension getTelephoneNumberPlusExtension(int extensionid) throws FDXException {
		try {
			
			template = ConnectionConfigApi46.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("extensionid", extensionid);

			TelephoneNumberPlusExtension telephoneNumberPlusExtension = template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".telephoneNumberPlusExtension where extensionid in (:extensionid)",
					parameters, new TelephoneNumberPlusExtensionRowMapper());

			TelephoneNumber number = new TelephoneNumber();
			if (telephoneNumberPlusExtension.getTelephoneNumber() != null) {
				number = number.getTelephoneNumber(telephoneNumberPlusExtension.getTelephoneNumber().getTelephoneId());
				telephoneNumberPlusExtension.setTelephoneNumber(number);
			}

			return telephoneNumberPlusExtension;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("TelephoneNumberPlusExtension : ", e);
			throw new FDXException(e,500);
		}
	}

}
