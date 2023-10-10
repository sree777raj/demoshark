package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.Statements;

public class StatementsRowMapper implements RowMapper<Statements> {

	@Override
	public Statements mapRow(ResultSet rs, int rowNum) throws SQLException {

		Statements statements = new Statements();
		statements.setStatementId(rs.getString("statementId"));
		statements.setHateoasLinkId(rs.getInt("statementlinksid"));
		return statements;
	}

}
