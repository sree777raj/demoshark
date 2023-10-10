package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.FiAttribute;

public class FiAttributeRowMapper implements RowMapper<FiAttribute> {

	@Override
	public FiAttribute mapRow(ResultSet rs, int rowNum) throws SQLException {
		FiAttribute fiAttribute = new FiAttribute();
		fiAttribute.setName(rs.getString("name"));
		fiAttribute.setValue(rs.getString("value"));
		return fiAttribute;
	}

}
