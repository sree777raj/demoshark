package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.StateTaxWithholding;

public class StatetaxwithholdingRowMapper implements RowMapper<StateTaxWithholding> {

	@Override
	public StateTaxWithholding mapRow(ResultSet rs, int rowNum) throws SQLException {
		StateTaxWithholding stateTaxWithholding = new StateTaxWithholding();
		stateTaxWithholding.setState(rs.getString("state"));
		stateTaxWithholding.setStateIncome(rs.getDouble("stateIncome"));
		stateTaxWithholding.setStateTaxId(rs.getString("stateTaxId"));
		stateTaxWithholding.setStateTaxWithheld(rs.getDouble("stateTaxWithheld"));
		return stateTaxWithholding;
	}

}
