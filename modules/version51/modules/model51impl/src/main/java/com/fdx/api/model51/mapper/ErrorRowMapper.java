package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.Error;

public class ErrorRowMapper implements RowMapper<Error>  {

	@Override
	public Error mapRow(ResultSet rs, int arg1) throws SQLException {
		Error error = new Error();
		error.setCode(rs.getString("code"));
		error.setMessage(rs.getString("message"));
		
		return error;
	}

}
