package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.IndividualName;

public class IndividualNameRowMapper implements RowMapper<IndividualName> {

	@Override
	public IndividualName mapRow(ResultSet rs, int rowNum) throws SQLException {
		IndividualName individualName= new IndividualName();
		
		individualName.setFirst(rs.getString("first"));
		individualName.setMiddle(rs.getString("middle"));
		individualName.setLast(rs.getString("last"));
		individualName.setSuffix(rs.getString("suffix"));
		
		return individualName;
	}

}
