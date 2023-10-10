package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.Form1042Agent;
import com.fdx.api.model51.modelimpl.Form1042Recipient;

public class Form1042RecipientRowMapper implements RowMapper<Form1042Recipient> {

	@Override
	public Form1042Recipient mapRow(ResultSet rs, int rowNum) throws SQLException {
		Form1042Recipient form1042Recipient = new Form1042Recipient();
		form1042Recipient.setDateOfBirth(rs.getDate("dateOfBirth"));
		form1042Recipient.setLobCode(rs.getString("lobCode"));

		Form1042Agent agent = new Form1042Agent();
		if (rs.getInt("agentId") != 0) {
			agent.setAgentId(rs.getInt("agentId"));
			form1042Recipient.setForm1042Agent(agent);
		}

		return form1042Recipient;
	}

}
