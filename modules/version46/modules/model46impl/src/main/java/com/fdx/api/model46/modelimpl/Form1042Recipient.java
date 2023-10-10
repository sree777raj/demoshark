package com.fdx.api.model46.modelimpl;

import java.util.Date;

import com.fasterxml.jackson.annotation.*;
import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.fdx.api.model46.config.ConnectionConfigApi46;
import com.fdx.api.model46.mapper.Form1042RecipientRowMapper;

import io.swagger.annotations.ApiModel;

/**
 * Information about recipient of Form 1042-S
 */
@ApiModel(description = "Information about recipient of Form 1042-S")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Form1042Recipient {

	NamedParameterJdbcTemplate template;

	@JsonIgnore
	private int recipientid;

	@JsonIgnore
	private int agentId;

	@JsonUnwrapped
	private Form1042Agent form1042Agent;

	@JsonProperty("lobCode")
	private String lobCode;

	@JsonProperty("dateOfBirth")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private Date dateOfBirth;

	public Form1042Agent getForm1042Agent() {
		return form1042Agent;
	}

	public void setForm1042Agent(Form1042Agent form1042Agent) {
		this.form1042Agent = form1042Agent;
	}

	public String getLobCode() {
		return lobCode;
	}

	public void setLobCode(String lobCode) {
		this.lobCode = lobCode;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getRecipientid() {
		return recipientid;
	}

	public void setRecipientid(int recipientid) {
		this.recipientid = recipientid;
	}

	public int getAgentId() {
		return agentId;
	}

	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
		result = prime * result + ((form1042Agent == null) ? 0 : form1042Agent.hashCode());
		result = prime * result + ((lobCode == null) ? 0 : lobCode.hashCode());
		result = prime * result + recipientid;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Form1042Recipient other = (Form1042Recipient) obj;
		if (dateOfBirth == null) {
			if (other.dateOfBirth != null)
				return false;
		} else if (!dateOfBirth.equals(other.dateOfBirth))
			return false;
		if (form1042Agent == null) {
			if (other.form1042Agent != null)
				return false;
		} else if (!form1042Agent.equals(other.form1042Agent))
			return false;
		if (lobCode == null) {
			if (other.lobCode != null)
				return false;
		} else if (!lobCode.equals(other.lobCode))
			return false;
		if (recipientid != other.recipientid)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Form1042Recipient [recipientid=" + recipientid + ", form1042Agent=" + form1042Agent + ", lobCode="
				+ lobCode + ", dateOfBirth=" + dateOfBirth + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(Form1042Recipient.class);

	public Form1042Recipient getForm1042Recipient(int recipientid) throws FDXException {
		try {
			template = ConnectionConfigApi46.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("recipientid", recipientid);
			Form1042Recipient form1042Recipient;
			try {
				form1042Recipient = template.queryForObject(
						"select * from "+ DeveloperContext.getDeveloperSchema() +".form1042Recipient where recipientid in (:recipientid)", parameters,
						new Form1042RecipientRowMapper());
			} catch (EmptyResultDataAccessException e) {
				throw new FDXException("Form 1042 Recipient not found", 0);
			}
			if (form1042Recipient.getForm1042Agent() != null) {
				Form1042Agent agent = new Form1042Agent();
				agent = agent.getForm1042Agent(form1042Recipient.getForm1042Agent().getAgentId());
				form1042Recipient.setForm1042Agent(agent);
			}
			return form1042Recipient;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Form1042Recipient : ", e);
			throw new FDXException(e,500);
		}
	}
}
