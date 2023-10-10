
package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.Accounts;

public class AccountsRowMapper implements RowMapper<Accounts> {

	@Override
	public Accounts mapRow(ResultSet rs, int arg1) throws SQLException {
		Accounts accounts = new Accounts();
		accounts.setAccountid(rs.getString("accountid"));
		accounts.setAccounttype(rs.getString("accountentitytype"));
		return accounts;
	}
}