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
import com.fdx.api.model46.mapper.NameAddressRowMapper;

import io.swagger.annotations.ApiModel;

/**
 * Individual or business name with address
 */
@ApiModel(description = "Individual or business name with address")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class NameAddress {

	NamedParameterJdbcTemplate template;

	@JsonIgnore
	private int nameAddressId;

	@JsonIgnore
	private int addressId;

	@JsonUnwrapped
	private Address address;

	@JsonProperty("name1")
	private String name1;

	@JsonProperty("name2")
	private String name2;

	public int getNameAddressId() {
		return nameAddressId;
	}

	public void setNameAddressId(int nameAddressId) {
		this.nameAddressId = nameAddressId;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((name1 == null) ? 0 : name1.hashCode());
		result = prime * result + ((name2 == null) ? 0 : name2.hashCode());
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
		NameAddress other = (NameAddress) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (name1 == null) {
			if (other.name1 != null)
				return false;
		} else if (!name1.equals(other.name1))
			return false;
		if (name2 == null) {
			if (other.name2 != null)
				return false;
		} else if (!name2.equals(other.name2))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "NameAddress [address=" + address + ", name1=" + name1 + ", name2=" + name2 + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(NameAddress.class);

	public NameAddress getNameAddressDetails(int nameAddressId) throws FDXException {
		try {
			Address address = new Address();
			
			template = ConnectionConfigApi46.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("nameAddressId", nameAddressId);

			NameAddress nameAddress = template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".nameAddress where nameAddressId in (:nameAddressId)", parameters,
					new NameAddressRowMapper());

			Address addressResponse = address.getAddress(nameAddress.getAddressId());
			nameAddress.setAddress(addressResponse);

			return nameAddress;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("NameAddress : ", e);
			throw new FDXException(e,500);
		}
	}

}
