package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.NameAddress;

public class NameAddressRowMapper implements RowMapper<NameAddress> {

	@Override
	public NameAddress mapRow(ResultSet rs, int rowNum) throws SQLException {
		NameAddress nameAddress = new NameAddress();
		nameAddress.setName1(rs.getString("name1"));
		nameAddress.setName2(rs.getString("name2"));
		nameAddress.setAddressId(rs.getInt("addressId"));
		return nameAddress;
	}

}
