package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.Statement;

public class StatementRowMapper implements RowMapper<Statement> {

	@Override
	public Statement mapRow(ResultSet rs, int rowNum) throws SQLException {
		Statement statement = new Statement();
		statement.setAccountId(rs.getString("accountId"));
		statement.setDescription(rs.getString("description"));
		statement.setStatementDate(rs.getTimestamp("statementDate"));
		statement.setStatementId(rs.getString("statementId"));
		return statement;
	}

}
