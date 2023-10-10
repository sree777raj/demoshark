package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.Address;
import com.fdx.api.model51.modelimpl.DeliveryAddress;
import com.fdx.api.model51.modelimpl.DeliveryAddressType;

public class DeliveryAddressRowMapper implements RowMapper<DeliveryAddress> {

	@Override
	public DeliveryAddress mapRow(ResultSet rs, int rowNum) throws SQLException {
		DeliveryAddress deliveryAddress = new DeliveryAddress();

		Address address = new Address();
		address.setAddressId(rs.getInt("addressId"));
		deliveryAddress.setAddressId(rs.getInt("addressId"));
		deliveryAddress.setDeliveryAddressId(rs.getInt("deliveryAddressId"));
		deliveryAddress.setAddress(address);
		if (rs.getString("type") != null)
			deliveryAddress.setType(DeliveryAddressType.valueOf(rs.getString("type").toString()));
		return deliveryAddress;
	}

}
