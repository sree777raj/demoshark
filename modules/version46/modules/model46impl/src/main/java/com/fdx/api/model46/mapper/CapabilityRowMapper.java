package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.Capability;
import com.fdx.api.model46.modelimpl.MessageFormat;

public class CapabilityRowMapper implements RowMapper<Capability> {

	@Override
	public Capability mapRow(ResultSet rs, int rowNum) throws SQLException {
		Capability capability = new Capability();
		capability.setActiveConnections(rs.getInt("activeConnections"));
		capability.setAllowedConnections(rs.getInt("allowedConnections"));
		capability.setAllowedConnections(rs.getInt("allowedConnections"));
		if (!(rs.getString("supportsCustomer") == null))
			capability.setSupportsCustomer(rs.getBoolean("supportsCustomer"));
		if (!(rs.getString("supportsAccounts") == null))
			capability.setSupportsAccounts(rs.getBoolean("supportsAccounts"));
		if (!(rs.getString("supportsTransactions") == null))
			capability.setSupportsTransactions(rs.getBoolean("supportsTransactions"));
		if (!(rs.getString("supportsStatements") == null))
			capability.setSupportsStatements(rs.getBoolean("supportsStatements"));
		if (!(rs.getString("supportsImage") == null))
			capability.setSupportsImage(rs.getBoolean("supportsImage"));
		if (!(rs.getString("supportsBillPay") == null))
			capability.setSupportsBillPay(rs.getBoolean("supportsBillPay"));
		if (!(rs.getString("supportsTransfer") == null))
			capability.setSupportsTransfer(rs.getBoolean("supportsTransfer"));
		if (rs.getString("messageFormat") != null)
			capability.setMessageFormat(MessageFormat.valueOf(rs.getString("messageFormat").toString()));
		if (rs.getTimestamp("billPayCutOffTime") != null)
			capability.setBillPayCutOffTime(rs.getTimestamp("billPayCutOffTime"));
		if (rs.getTimestamp("transferCutOffTime") != null)
			capability.setTransferCutOffTime(rs.getTimestamp("transferCutOffTime"));

		return capability;
	}

}
