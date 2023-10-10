package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.CustomerName;

public class CustomerNameRowMapper implements RowMapper<CustomerName> {

	@Override
	public CustomerName mapRow(ResultSet rs, int rowNum) throws SQLException {
		CustomerName customerName = new CustomerName();
		customerName.setNameId(rs.getInt("nameId"));
		customerName.setPrefix(rs.getString("prefix"));
		customerName.setCompany(rs.getString("company"));
		
		return customerName;
	}

}
