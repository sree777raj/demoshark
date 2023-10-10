package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.LocalTaxWithholding;

public class LocaltaxwithholdingRowMapper implements RowMapper<LocalTaxWithholding> {

	@Override
	public LocalTaxWithholding mapRow(ResultSet rs, int rowNum) throws SQLException {
		LocalTaxWithholding localTaxWithholding = new LocalTaxWithholding();
		localTaxWithholding.setLocalIncome(rs.getDouble("localIncome"));
		localTaxWithholding.setLocalityName(rs.getString("localityName"));
		localTaxWithholding.setLocalTaxWithheld(rs.getDouble("localTaxWithheld"));
		localTaxWithholding.setState(rs.getString("state"));
		return localTaxWithholding;
	}

}
