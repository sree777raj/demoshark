package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.AccountHolderRelationship;
import com.fdx.api.model51.modelimpl.CustomerToAccountRelationship;

public class CustomerToAccountRelationshipRowMapper implements RowMapper<CustomerToAccountRelationship> {

	@Override
	public CustomerToAccountRelationship mapRow(ResultSet rs, int rowNum) throws SQLException {
		CustomerToAccountRelationship customerToAccountRelationship = new CustomerToAccountRelationship();

		customerToAccountRelationship.setLinksId(rs.getInt("accountlinksid"));
		customerToAccountRelationship.setAccountId(rs.getString("accountId"));
		
		if(rs.getString("relationship")!=null)
			customerToAccountRelationship
				.setRelationship(AccountHolderRelationship.valueOf(rs.getString("relationship").toString()));

		return customerToAccountRelationship;
	}

}
