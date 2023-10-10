package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.CodeAmount;

public class CodeAmountRowMapper implements RowMapper<CodeAmount> {

	@Override
	public CodeAmount mapRow(ResultSet rs, int rowNum) throws SQLException {
		CodeAmount codeAmount = new CodeAmount();
		codeAmount.setAmount(rs.getDouble("amount"));
		codeAmount.setCode(rs.getString("code"));
		return codeAmount;
	}

}
