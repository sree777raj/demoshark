package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.Bills;

public class BillsRowMapper implements RowMapper<Bills> {

	@Override
	public Bills mapRow(ResultSet rs, int rowNum) throws SQLException {
		Bills bills = new Bills();
		bills.setAutoPayAmount(rs.getBigDecimal("autoPayAmount"));
		bills.setAutoPayDate(rs.getTimestamp("autoPayDate"));
		if (!(rs.getString("autoPayEnabled") == null))
			bills.setAutoPayEnabled(Boolean.valueOf(rs.getBoolean("autoPayEnabled")));
		bills.setDueDate(rs.getTimestamp("dueDate"));
		bills.setLastPaymentAmount(rs.getBigDecimal("lastPaymentAmount"));
		bills.setLastPaymentDate(rs.getTimestamp("lastPaymentDate"));
		bills.setMinimumPaymentDue(rs.getBigDecimal("minimumPaymentDue"));
		bills.setPastDueAmount(rs.getBigDecimal("pastDueAmount"));
		bills.setStatementBalance(rs.getBigDecimal("statementBalance"));
		bills.setStatementDate(rs.getTimestamp("statementDate"));
		bills.setTotalPaymentDue(rs.getBigDecimal("totalPaymentDue"));

		return bills;
	}

}
