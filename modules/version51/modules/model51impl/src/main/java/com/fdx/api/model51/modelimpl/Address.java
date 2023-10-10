package com.fdx.api.model51.modelimpl;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.Size;

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
import com.fdx.api.model51.mapper.AddressRowMapper;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fdx.common.exception.FDXException;

/**
 * Postal address
 */
@ApiModel(description = "Postal address")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Address {

	private static final Logger log = LoggerFactory.getLogger(Address.class);

	NamedParameterJdbcTemplate template;

	@JsonIgnore
	private int addressId;

	@JsonProperty("line1")
	private String line1;

	@JsonProperty("line2")
	private String line2;

	@JsonProperty("line3")
	private String line3;

	@JsonProperty("city")
	private String city;

	@JsonProperty("state")
	private String state;

	@JsonProperty("postalCode")
	private String postalCode;

	@JsonProperty("country")
	private Iso3166CountryCode country;

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public Address line1(String line1) {
		this.line1 = line1;
		return this;
	}

	/**
	 * String of maximum length 64
	 * 
	 * @return line1
	 */
	@ApiModelProperty(value = "String of maximum length 64")

	@Size(max = 64)
	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public Address line2(String line2) {
		this.line2 = line2;
		return this;
	}

	/**
	 * String of maximum length 64
	 * 
	 * @return line2
	 */
	@ApiModelProperty(value = "String of maximum length 64")

	@Size(max = 64)
	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public Address line3(String line3) {
		this.line3 = line3;
		return this;
	}

	/**
	 * String of maximum length 64
	 * 
	 * @return line3
	 */
	@ApiModelProperty(value = "String of maximum length 64")

	@Size(max = 64)
	public String getLine3() {
		return line3;
	}

	public void setLine3(String line3) {
		this.line3 = line3;
	}

	public Address city(String city) {
		this.city = city;
		return this;
	}

	/**
	 * String of maximum length 64
	 * 
	 * @return city
	 */
	@ApiModelProperty(value = "String of maximum length 64")

	@Size(max = 64)
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Address state(String state) {
		this.state = state;
		return this;
	}

	/**
	 * String of maximum length 64
	 * 
	 * @return state
	 */
	@ApiModelProperty(value = "String of maximum length 64")

	@Size(max = 64)
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Address postalCode(String postalCode) {
		this.postalCode = postalCode;
		return this;
	}

	/**
	 * Postal code
	 * 
	 * @return postalCode
	 */
	@ApiModelProperty(value = "Postal code")

	@Size(max = 10)
	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public Address country(Iso3166CountryCode country) {
		this.country = country;
		return this;
	}

	/**
	 * Get country
	 * 
	 * @return country
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Iso3166CountryCode getCountry() {
		return country;
	}

	public void setCountry(Iso3166CountryCode country) {
		this.country = country;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + addressId;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((line1 == null) ? 0 : line1.hashCode());
		result = prime * result + ((line2 == null) ? 0 : line2.hashCode());
		result = prime * result + ((line3 == null) ? 0 : line3.hashCode());
		result = prime * result + ((postalCode == null) ? 0 : postalCode.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
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
		Address other = (Address) obj;
		if (addressId != other.addressId)
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (country != other.country)
			return false;
		if (line1 == null) {
			if (other.line1 != null)
				return false;
		} else if (!line1.equals(other.line1))
			return false;
		if (line2 == null) {
			if (other.line2 != null)
				return false;
		} else if (!line2.equals(other.line2))
			return false;
		if (line3 == null) {
			if (other.line3 != null)
				return false;
		} else if (!line3.equals(other.line3))
			return false;
		if (postalCode == null) {
			if (other.postalCode != null)
				return false;
		} else if (!postalCode.equals(other.postalCode))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", line1=" + line1 + ", line2=" + line2 + ", line3=" + line3
				+ ", city=" + city + ", state=" + state + ", postalCode=" + postalCode + ", country=" + country + "]";
	}

	public Address getAddress(int addressId) throws FDXException {
		try {
			template = ConnectionConfigApi51.getTemplate();
			SqlParameterSource parameters = new MapSqlParameterSource("addressId", addressId);
			Address addressResponse = template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".address where addressId in (:addressId)", parameters,
					new AddressRowMapper());
			return addressResponse;
		} catch (EmptyResultDataAccessException e) {
			throw new FDXException("Address not found", 0);
		} catch (Exception e) {
			log.error("Address : ", e);
			throw new FDXException(e,500);
		}
	}

	public Map<String, Object> updateAddress(MerchantForUpdate merchantForUpdate, Merchant merchant, Field field) throws FDXException {
		try {
			template = ConnectionConfigApi51.getTemplate();
			Address address = new Address();
			int addressId = 0;
			field.setAccessible(true);
			SqlParameterSource parameters = new MapSqlParameterSource("payeeId", null);
			StringBuffer addressQuery = new StringBuffer();
			addressQuery.append("update "+ DeveloperContext.getDeveloperSchema() +".address set ");
			List<String> changedPropertiesAddress = new ArrayList<>();
			for (Field addressField : merchantForUpdate.getAddress().getAddress().getClass().getDeclaredFields()) {
				addressField.setAccessible(true);
				if (merchant.getMerchantForUpdate().getAddress().getAddressId() == 0) {
					Map<String, Object> keys = merchantForUpdate.getAddress().getAddress().insertAddress();
					return keys;
				}
				Object name1 = addressField.get(merchantForUpdate.getAddress().getAddress());
				Object name2 = addressField.get(merchant.getMerchantForUpdate().getAddress().getAddress());
				if ((addressField.getName()).equals("addressId"))
					addressId = (int) merchant.getMerchantForUpdate().getAddress().getAddress().getAddressId();
				if (name1 != null && name2 != null) {
					if (!Objects.equals(name1, name2) && addressField.getName() != "addressId") {
						changedPropertiesAddress.add(addressField.getName());
						addressQuery.append(addressField.getName() + "='" + name1 + "',");
					}
				}
			}
			int countAddress = 0;
			StringBuffer addressNewQuery = new StringBuffer(addressQuery.substring(0, addressQuery.length() - 1));
			if (changedPropertiesAddress.size() != 0) {
				addressNewQuery.append(" where addressId='" + addressId + "'");
				countAddress = template.update(addressNewQuery.toString(), parameters);
			}
			return null;
		} catch (Exception e) {
			log.error("Address : ", e);
			throw new FDXException(e,500);
		}
	}

	public Map<String, Object> insertAddress() throws FDXException {
		KeyHolder keyHolder = new GeneratedKeyHolder();
		try {
			template = ConnectionConfigApi51.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("payeeId", null);
			template.update(
					"insert into "+ DeveloperContext.getDeveloperSchema() +".address (line1,line2,line3,city, state, country, postalcode) values ("
							+ ((line1 != null) ? ("'" + line1 + "'") : null) + ","
							+ ((line2 != null) ? ("'" + line2 + "'") : null) + ","
							+ ((line3 != null) ? ("'" + line3 + "'") : null) + ","
							+ ((city != null) ? ("'" + city + "'") : null) + ","
							+ ((state != null) ? ("'" + state + "'") : null) + ","
							+ ((country != null) ? ("'" + country + "'") : null) + ","
							+ ((postalCode != null) ? ("'" + postalCode + "'") : null) + ")",
					parameters, keyHolder);
			return keyHolder.getKeys();
		} catch (Exception e) {
			log.error("Address : ", e);
			throw new FDXException(e,500);
		}
	}
}
