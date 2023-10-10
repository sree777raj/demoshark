package com.fdx.api.model46.modelimpl;

import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fdx.api.model46.config.ConnectionConfigApi46;
import com.fdx.api.model46.mapper.Form1042AgentRowMapper;

import io.swagger.annotations.ApiModel;

/**
 * One of various persons or businesses involved in Form 1042-S reporting
 */
@ApiModel(description = "One of various persons or businesses involved in Form 1042-S reporting")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Form1042Agent {

	NamedParameterJdbcTemplate template;

	@JsonIgnore
	private int agentId;

	@JsonIgnore
	private int nameAddressId;

	@JsonUnwrapped
	private NameAddress nameAddress;

	@JsonProperty("agentTin")
	private String agentTin;

	@JsonProperty("ch3StatusCode")
	private String ch3StatusCode;

	@JsonProperty("ch4StatusCode")
	private String ch4StatusCode;

	@JsonProperty("giin")
	private String giin;

	@JsonProperty("countryCode")
	private String countryCode;

	@JsonProperty("foreignTin")
	private String foreignTin;

	public int getAgentId() {
		return agentId;
	}

	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}

	public NameAddress getNameAddress() {
		return nameAddress;
	}

	public void setNameAddress(NameAddress nameAddress) {
		this.nameAddress = nameAddress;
	}

	public String getAgentTin() {
		return agentTin;
	}

	public void setAgentTin(String agentTin) {
		this.agentTin = agentTin;
	}

	public String getCh3StatusCode() {
		return ch3StatusCode;
	}

	public void setCh3StatusCode(String ch3StatusCode) {
		this.ch3StatusCode = ch3StatusCode;
	}

	public String getCh4StatusCode() {
		return ch4StatusCode;
	}

	public void setCh4StatusCode(String ch4StatusCode) {
		this.ch4StatusCode = ch4StatusCode;
	}

	public String getGiin() {
		return giin;
	}

	public void setGiin(String giin) {
		this.giin = giin;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getForeignTin() {
		return foreignTin;
	}

	public void setForeignTin(String foreignTin) {
		this.foreignTin = foreignTin;
	}

	public int getNameAddressId() {
		return nameAddressId;
	}

	public void setNameAddressId(int nameAddressId) {
		this.nameAddressId = nameAddressId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((agentTin == null) ? 0 : agentTin.hashCode());
		result = prime * result + ((ch3StatusCode == null) ? 0 : ch3StatusCode.hashCode());
		result = prime * result + ((ch4StatusCode == null) ? 0 : ch4StatusCode.hashCode());
		result = prime * result + ((countryCode == null) ? 0 : countryCode.hashCode());
		result = prime * result + ((foreignTin == null) ? 0 : foreignTin.hashCode());
		result = prime * result + ((giin == null) ? 0 : giin.hashCode());
		result = prime * result + ((nameAddress == null) ? 0 : nameAddress.hashCode());
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
		Form1042Agent other = (Form1042Agent) obj;
		if (agentTin == null) {
			if (other.agentTin != null)
				return false;
		} else if (!agentTin.equals(other.agentTin))
			return false;
		if (ch3StatusCode == null) {
			if (other.ch3StatusCode != null)
				return false;
		} else if (!ch3StatusCode.equals(other.ch3StatusCode))
			return false;
		if (ch4StatusCode == null) {
			if (other.ch4StatusCode != null)
				return false;
		} else if (!ch4StatusCode.equals(other.ch4StatusCode))
			return false;
		if (countryCode == null) {
			if (other.countryCode != null)
				return false;
		} else if (!countryCode.equals(other.countryCode))
			return false;
		if (foreignTin == null) {
			if (other.foreignTin != null)
				return false;
		} else if (!foreignTin.equals(other.foreignTin))
			return false;
		if (giin == null) {
			if (other.giin != null)
				return false;
		} else if (!giin.equals(other.giin))
			return false;
		if (nameAddress == null) {
			if (other.nameAddress != null)
				return false;
		} else if (!nameAddress.equals(other.nameAddress))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Form1042Agent [ nameAddress=" + nameAddress + ", agentTin=" + agentTin + ", ch3StatusCode="
				+ ch3StatusCode + ", ch4StatusCode=" + ch4StatusCode + ", giin=" + giin + ", countryCode=" + countryCode
				+ ", foreignTin=" + foreignTin + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(Form1042Agent.class);

	public Form1042Agent getForm1042Agent(int agentId) throws FDXException {
		try {
			template = ConnectionConfigApi46.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("agentId", agentId);
			Form1042Agent form1042Agent;
			try {
				form1042Agent = template.queryForObject(
						"select * from "+ DeveloperContext.getDeveloperSchema() +".form1042Agent where agentId in (:agentId)", parameters,
						new Form1042AgentRowMapper());
			} catch (EmptyResultDataAccessException e) {
				throw new FDXException("Form 1042 Agent not found", 0);
			}
			NameAddress nameAddress = new NameAddress();
			if (form1042Agent.getNameAddress() != null) {
				nameAddress = nameAddress.getNameAddressDetails(form1042Agent.getNameAddress().getNameAddressId());
				form1042Agent.setNameAddress(nameAddress);
			}
			return form1042Agent;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Form1042Agent : ", e);
			throw new FDXException(e,500);
		}
	}
}
