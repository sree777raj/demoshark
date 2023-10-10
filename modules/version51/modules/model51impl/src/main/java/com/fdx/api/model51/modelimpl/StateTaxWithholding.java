package com.fdx.api.model51.modelimpl;

import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import com.fdx.common.util.FdxConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fdx.api.model51.config.ConnectionConfigApi51;
import com.fdx.api.model51.mapper.StatetaxwithholdingRowMapper;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Income in a state and its tax withholding
 */
@ApiModel(description = "Income in a state and its tax withholding")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class StateTaxWithholding {

	NamedParameterJdbcTemplate template;

	@JsonIgnore
	private int stwithheldid;

	@JsonProperty("stateTaxWithheld")
	private Double stateTaxWithheld;

	@JsonProperty("state")
	private String state;

	@JsonProperty("stateTaxId")
	private String stateTaxId;

	@JsonProperty("stateIncome")
	private Double stateIncome;

	public StateTaxWithholding stateTaxWithheld(Double stateTaxWithheld) {
		this.stateTaxWithheld = stateTaxWithheld;
		return this;
	}

	/**
	 * Amount of state income tax withheld
	 * 
	 * @return stateTaxWithheld
	 */
	@ApiModelProperty(value = "Amount of state income tax withheld")

	public Double getStateTaxWithheld() {
		return stateTaxWithheld;
	}

	public void setStateTaxWithheld(Double stateTaxWithheld) {
		this.stateTaxWithheld = stateTaxWithheld;
	}

	public StateTaxWithholding state(String state) {
		this.state = state;
		return this;
	}

	/**
	 * State two-digit code
	 * 
	 * @return state
	 */
	@ApiModelProperty(value = "State two-digit code")

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public StateTaxWithholding stateTaxId(String stateTaxId) {
		this.stateTaxId = stateTaxId;
		return this;
	}

	/**
	 * Tax id of company withholding state income tax
	 * 
	 * @return stateTaxId
	 */
	@ApiModelProperty(value = "Tax id of company withholding state income tax")

	public String getStateTaxId() {
		return stateTaxId;
	}

	public void setStateTaxId(String stateTaxId) {
		this.stateTaxId = stateTaxId;
	}

	public StateTaxWithholding stateIncome(Double stateIncome) {
		this.stateIncome = stateIncome;
		return this;
	}

	/**
	 * Income amount for state tax purposes
	 * 
	 * @return stateIncome
	 */
	@ApiModelProperty(value = "Income amount for state tax purposes")

	public Double getStateIncome() {
		return stateIncome;
	}

	public void setStateIncome(Double stateIncome) {
		this.stateIncome = stateIncome;
	}

	public int getStwithheldid() {
		return stwithheldid;
	}

	public void setStwithheldid(int stwithheldid) {
		this.stwithheldid = stwithheldid;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((stateIncome == null) ? 0 : stateIncome.hashCode());
		result = prime * result + ((stateTaxId == null) ? 0 : stateTaxId.hashCode());
		result = prime * result + ((stateTaxWithheld == null) ? 0 : stateTaxWithheld.hashCode());
		result = prime * result + stwithheldid;
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
		StateTaxWithholding other = (StateTaxWithholding) obj;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (stateIncome == null) {
			if (other.stateIncome != null)
				return false;
		} else if (!stateIncome.equals(other.stateIncome))
			return false;
		if (stateTaxId == null) {
			if (other.stateTaxId != null)
				return false;
		} else if (!stateTaxId.equals(other.stateTaxId))
			return false;
		if (stateTaxWithheld == null) {
			if (other.stateTaxWithheld != null)
				return false;
		} else if (!stateTaxWithheld.equals(other.stateTaxWithheld))
			return false;
		if (stwithheldid != other.stwithheldid)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "StateTaxWithholding [stwithheldid=" + stwithheldid + ", stateTaxWithheld=" + stateTaxWithheld
				+ ", state=" + state + ", stateTaxId=" + stateTaxId + ", stateIncome=" + stateIncome + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(StateTaxWithholding.class);

	public StateTaxWithholding getStateTaxWIthHolding(int stwithheldid) throws FDXException {
		try {
			
			template = ConnectionConfigApi51.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("stwithheldid", stwithheldid);

			StateTaxWithholding stateTaxWithholding = template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".statetaxwithholding where stwithheldid in (:stwithheldid)", parameters,
					new StatetaxwithholdingRowMapper());

			return stateTaxWithholding;

		} catch (Exception e) {
			log.error("StateTaxWithholding : ", e);
			throw new FDXException(e, FdxConstants.HTTP_ERROR_CODE_500);
		}
	}

}
