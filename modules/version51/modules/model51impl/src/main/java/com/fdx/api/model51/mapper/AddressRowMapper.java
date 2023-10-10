package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.Address;
import com.fdx.api.model51.modelimpl.Iso3166CountryCode;

public class AddressRowMapper implements RowMapper<Address> {

	@Override
	public Address mapRow(ResultSet rs, int rowNum) throws SQLException {
		Address address = new Address();

		address.setLine1(rs.getString("line1"));
		address.setLine2(rs.getString("line2"));
		address.setLine3(rs.getString("line3"));
		address.setCity(rs.getString("city"));
		address.setState(rs.getString("state"));
		address.setPostalCode(rs.getString("postalcode"));
		if (rs.getString("country") != null)
			address.setCountry(Iso3166CountryCode.valueOf(rs.getString("country").toString()));
		return address;
	}

}
