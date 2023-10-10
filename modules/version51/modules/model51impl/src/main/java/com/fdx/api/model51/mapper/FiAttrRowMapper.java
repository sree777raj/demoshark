package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.FiAttrEntity;

public class FiAttrRowMapper implements RowMapper<FiAttrEntity> {

	@Override
	public FiAttrEntity mapRow(ResultSet rs, int arg1) throws SQLException {
		FiAttrEntity fiAttrEntity= new FiAttrEntity();
		fiAttrEntity.setName(rs.getString("name"));
		fiAttrEntity.setValue(rs.getString("value"));
		
		return fiAttrEntity;
	}

}
