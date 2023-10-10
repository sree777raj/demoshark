package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.AccountHolder;
import com.fdx.api.model51.modelimpl.AccountHolderRelationship;
import com.fdx.api.model51.modelimpl.Customer;

public class AccountHolderRowMapper implements RowMapper<AccountHolder> {

	@Override
	public AccountHolder mapRow(ResultSet rs, int arg1) throws SQLException {

		AccountHolder accountHolder = new AccountHolder();
		accountHolder.setCustomerId(rs.getString("customerId"));
		Customer customer = new Customer();
		customer.setCustomerId(rs.getString("customerId"));

		accountHolder.setCustomer(customer);
		if (rs.getString("relationship") != null)
			accountHolder.setRelationship(AccountHolderRelationship.valueOf(rs.getString("relationship").toString()));
		return accountHolder;
	}

}
