package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.OtherSecurity;

public class OtherSecurityRowMapper implements RowMapper<OtherSecurity> {

	@Override
	public OtherSecurity mapRow(ResultSet rs, int rowNum) throws SQLException {
		OtherSecurity otherSecurity = new OtherSecurity();
		
		otherSecurity.setTypeDescription(rs.getString("typeDescription"));
		return otherSecurity;
	}

}
