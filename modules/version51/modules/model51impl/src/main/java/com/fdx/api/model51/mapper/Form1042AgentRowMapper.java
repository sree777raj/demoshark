package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.Form1042Agent;
import com.fdx.api.model51.modelimpl.NameAddress;

public class Form1042AgentRowMapper implements RowMapper<Form1042Agent> {

	@Override
	public Form1042Agent mapRow(ResultSet rs, int rowNum) throws SQLException {
		Form1042Agent form1042Agent = new Form1042Agent();
		form1042Agent.setAgentTin(rs.getString("agentTin"));
		form1042Agent.setCh3StatusCode(rs.getString("ch3StatusCode"));
		form1042Agent.setCh4StatusCode(rs.getString("ch4StatusCode"));
		form1042Agent.setCountryCode(rs.getString("countryCode"));
		form1042Agent.setForeignTin(rs.getString("foreignTin"));
		form1042Agent.setGiin(rs.getString("giin"));

		NameAddress nameAddress = new NameAddress();
		if (rs.getInt("nameaddressid") != 0) {
			nameAddress.setNameAddressId(rs.getInt("nameaddressid"));
			form1042Agent.setNameAddress(nameAddress);
		}

		return form1042Agent;
	}

}
