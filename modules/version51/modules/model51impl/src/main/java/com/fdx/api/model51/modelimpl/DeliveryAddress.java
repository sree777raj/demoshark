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
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fdx.api.model51.config.ConnectionConfigApi51;
import com.fdx.api.model51.mapper.DeliveryAddressRowMapper;

import io.swagger.annotations.ApiModel;

/**
 * A delivery address and its location type
 */
@ApiModel(description = "A delivery address and its location type")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class DeliveryAddress {

	private static final Logger log = LoggerFactory.getLogger(DeliveryAddress.class);

	NamedParameterJdbcTemplate template;

	@JsonIgnore
	private int deliveryAddressId;

	@JsonIgnore
	private int addressId;

	@JsonUnwrapped
	private Address address;

	@JsonProperty("type")
	private DeliveryAddressType type;

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public int getDeliveryAddressId() {
		return deliveryAddressId;
	}

	public void setDeliveryAddressId(int deliveryAddressId) {
		this.deliveryAddressId = deliveryAddressId;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public DeliveryAddressType getType() {
		return type;
	}

	public void setType(DeliveryAddressType type) {
		this.type = type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + deliveryAddressId;
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
		DeliveryAddress other = (DeliveryAddress) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (deliveryAddressId != other.deliveryAddressId)
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DeliveryAddress [deliveryAddressId=" + deliveryAddressId + ", address=" + address + ", type=" + type
				+ "]";
	}

	public DeliveryAddress getDeliveryAddress(int deliveryAddressId) throws FDXException {
		try {
			template = ConnectionConfigApi51.getTemplate();
			SqlParameterSource parameters = new MapSqlParameterSource("deliveryAddressId", deliveryAddressId);
			DeliveryAddress deliveryAddress = new DeliveryAddress();
			DeliveryAddress deliveryAddressResponse = template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".deliveryAddress where deliveryAddressId in (:deliveryAddressId)",
					parameters, new DeliveryAddressRowMapper());
			Address address = new Address();
			if (deliveryAddressResponse.getAddress().getAddressId() != 0) {
				address = address.getAddress(deliveryAddressResponse.getAddress().getAddressId());
				address.setAddressId(deliveryAddressResponse.getAddress().getAddressId());
				deliveryAddress.setAddress(address);
			}
			deliveryAddress.setDeliveryAddressId(deliveryAddressResponse.getDeliveryAddressId());
			deliveryAddress.setType(deliveryAddressResponse.getType());
			return deliveryAddress;
		} catch (Exception e) {
			log.error("DeliveryAddress : ", e);
			throw new FDXException(e,500);
		}
	}

	public Map<String, Object> updateDeliveryAddress(MerchantForUpdate merchantForUpdate, Merchant merchant,
			Field field) throws FDXException {
		try {
			template = ConnectionConfigApi51.getTemplate();
			Address address = new Address();
			int addressId = 0;
			field.setAccessible(true);
			SqlParameterSource parameters = new MapSqlParameterSource("payeeId", null);
			StringBuffer addressQuery = new StringBuffer();
			addressQuery.append("update "+ DeveloperContext.getDeveloperSchema() +".deliveryaddress set ");
			List<String> changedPropertiesAddress = new ArrayList<>();
			for (Field addressField : merchantForUpdate.getAddress().getClass().getDeclaredFields()) {
				addressField.setAccessible(true);
				Object name1 = addressField.get(merchantForUpdate.getAddress());
				if (merchant.getMerchantForUpdate().getAddress() == null) {
					Map<String, Object> keys = merchantForUpdate.getAddress().insertDeliveryAddressName();
					return keys;
				}
				Object name2 = addressField.get(merchant.getMerchantForUpdate().getAddress());
				if ((addressField.getName()).equals("addressId"))
					addressId = (int) merchant.getMerchantForUpdate().getAddressId();
				if (!((addressField.getName()).equals("address") || (addressField.getName()).equals("deliveryAddressId")
						|| (addressField.getName()).equals("addressId"))) {
					if (name1 != null && name2 != null) {
						if (!Objects.equals(name1, name2) && addressField.getName() != "address") {
							changedPropertiesAddress.add(addressField.getName());
							addressQuery.append(addressField.getName() + "='" + name1 + "',");
						}
					}
				}
				if ((addressField.getName()).equals("address") && merchantForUpdate.getAddress().getAddress() != null) {
					Map<String, Object> keys = address.updateAddress(merchantForUpdate, merchant, field);
					if (keys != null) {
						changedPropertiesAddress.add(field.getName());
						addressQuery.append("addressId=" + (int) keys.get("addressid") + ",");
					}
				}
			}
			int countAddress = 0;
			StringBuffer adrressQueryNew = new StringBuffer(addressQuery.substring(0, addressQuery.length() - 1));
			if (changedPropertiesAddress.size() != 0) {
				adrressQueryNew.append(" where deliveryaddressId=" + addressId + "");
				KeyHolder keyHolder = new GeneratedKeyHolder();
				countAddress = template.update(adrressQueryNew.toString(), parameters, keyHolder);
				return keyHolder.getKeys();
			}
			return null;
		} catch (Exception e) {
			log.error("DeliveryAddress : ", e);
			throw new FDXException(e,500);
		}
	}

	public Map<String, Object> insertDeliveryAddressName() throws FDXException {
		KeyHolder keyHolder = new GeneratedKeyHolder();
		try {
			template = ConnectionConfigApi51.getTemplate();
			Map<String, Object> keys = null;
			SqlParameterSource parameters = new MapSqlParameterSource("payeeId", null);

//			Address Start
			int addressArrayKey = 0;
			if (type != null && (address.getCity() != null || address.getCountry() != null || address.getLine1() != null
					|| address.getLine2() != null || address.getLine3() != null || address.getPostalCode() != null
					|| address.getState() != null)) {
				keys = address.insertAddress();
				addressArrayKey = (int) keys.get("addressid");
			}
//			Address End

			int count = template.update(
					"insert into "+ DeveloperContext.getDeveloperSchema() +".deliveryaddress (type,addressid) values ("
							+ ((type != null) ? ("'" + type + "'") : null) + ","
							+ ((addressArrayKey != 0) ? ("'" + addressArrayKey + "'") : null) + ")",
					parameters, keyHolder);
			return keyHolder.getKeys();
		} catch (Exception e) {
			log.error("DeliveryAddress : ", e);
			throw new FDXException(e,500);
		}
	}
}
