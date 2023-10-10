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
import com.fdx.api.model46.mapper.NameAddressPhoneRowMapper;

import io.swagger.annotations.ApiModel;

/**
 * Contact phone number with name and address
 */
@ApiModel(description = "Contact phone number with name and address")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class NameAddressPhone {

	NamedParameterJdbcTemplate template;

	@JsonIgnore
	private int nameAddressId;

	@JsonUnwrapped
	private NameAddress nameAddress;

	@JsonProperty("phone")
	private TelephoneNumberPlusExtension phone;

	public NameAddress getNameAddress() {
		return nameAddress;
	}

	public void setNameAddress(NameAddress nameAddress) {
		this.nameAddress = nameAddress;
	}

	public TelephoneNumberPlusExtension getPhone() {
		return phone;
	}

	public void setPhone(TelephoneNumberPlusExtension phone) {
		this.phone = phone;
	}

	public int getNameAddressId() {
		return nameAddressId;
	}

	public void setNameAddressId(int nameAddressId) {
		this.nameAddressId = nameAddressId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nameAddress == null) ? 0 : nameAddress.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
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
		NameAddressPhone other = (NameAddressPhone) obj;
		if (nameAddress == null) {
			if (other.nameAddress != null)
				return false;
		} else if (!nameAddress.equals(other.nameAddress))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "NameAddressPhone [nameAddress=" + nameAddress + ", phone=" + phone + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(NameAddressPhone.class);

	public NameAddressPhone getNameAddressPhoneDetails(int nameAddressPhoneId) throws FDXException {
		try {
			NameAddress nameAddress = new NameAddress();
			TelephoneNumberPlusExtension telephoneNumberPlusExtension = new TelephoneNumberPlusExtension();

			
			template = ConnectionConfigApi46.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("nameAddressPhoneId", nameAddressPhoneId);

			NameAddressPhone nameAddressPhone = template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".nameAddressPhone where nameAddressPhoneId in (:nameAddressPhoneId)",
					parameters, new NameAddressPhoneRowMapper());

			if (nameAddressPhone.getNameAddress() != null) {
				nameAddress = nameAddress.getNameAddressDetails(nameAddressPhone.getNameAddress().getNameAddressId());
				nameAddressPhone.setNameAddress(nameAddress);
			}

			if (nameAddressPhone.getPhone() != null) {
				telephoneNumberPlusExtension = telephoneNumberPlusExtension
						.getTelephoneNumberPlusExtension(nameAddressPhone.getPhone().getPhoneId());
				nameAddressPhone.setPhone(telephoneNumberPlusExtension);
			}

			return nameAddressPhone;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("NameAddressPhone : ", e);
			throw new FDXException(e,500);
		}
	}

}
