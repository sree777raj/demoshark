package com.fdx.api.model51.modelimpl;

import java.util.Objects;

import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import com.fdx.common.util.FdxConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fdx.api.model51.config.ConnectionConfigApi51;
import com.fdx.api.model51.mapper.LocaltaxwithholdingRowMapper;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Income in a locality and its tax withholding
 */
@ApiModel(description = "Income in a locality and its tax withholding")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class LocalTaxWithholding {

	NamedParameterJdbcTemplate template;

	@JsonProperty("ltwithheldid")
	private int ltwithheldid;

	@JsonProperty("localTaxWithheld")
	private Double localTaxWithheld;

	@JsonProperty("localityName")
	private String localityName;

	@JsonProperty("state")
	private String state;

	@JsonProperty("localIncome")
	private Double localIncome;

	public int getLtwithheldid() {
		return ltwithheldid;
	}

	public void setLtwithheldid(int ltwithheldid) {
		this.ltwithheldid = ltwithheldid;
	}

	public LocalTaxWithholding localTaxWithheld(Double localTaxWithheld) {
		this.localTaxWithheld = localTaxWithheld;
		return this;
	}

	/**
	 * Amount of local income tax withheld
	 * 
	 * @return localTaxWithheld
	 */
	@ApiModelProperty(value = "Amount of local income tax withheld")

	public Double getLocalTaxWithheld() {
		return localTaxWithheld;
	}

	public void setLocalTaxWithheld(Double localTaxWithheld) {
		this.localTaxWithheld = localTaxWithheld;
	}

	public LocalTaxWithholding localityName(String localityName) {
		this.localityName = localityName;
		return this;
	}

	/**
	 * Locality name
	 * 
	 * @return localityName
	 */
	@ApiModelProperty(value = "Locality name")

	public String getLocalityName() {
		return localityName;
	}

	public void setLocalityName(String localityName) {
		this.localityName = localityName;
	}

	public LocalTaxWithholding state(String state) {
		this.state = state;
		return this;
	}

	/**
	 * State code of state in which locality exists
	 * 
	 * @return state
	 */
	@ApiModelProperty(value = "State code of state in which locality exists")

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public LocalTaxWithholding localIncome(Double localIncome) {
		this.localIncome = localIncome;
		return this;
	}

	/**
	 * Income amount for local tax purposes
	 * 
	 * @return localIncome
	 */
	@ApiModelProperty(value = "Income amount for local tax purposes")

	public Double getLocalIncome() {
		return localIncome;
	}

	public void setLocalIncome(Double localIncome) {
		this.localIncome = localIncome;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		LocalTaxWithholding localTaxWithholding = (LocalTaxWithholding) o;
		return Objects.equals(this.localTaxWithheld, localTaxWithholding.localTaxWithheld)
				&& Objects.equals(this.localityName, localTaxWithholding.localityName)
				&& Objects.equals(this.state, localTaxWithholding.state)
				&& Objects.equals(this.localIncome, localTaxWithholding.localIncome);
	}

	@Override
	public int hashCode() {
		return Objects.hash(localTaxWithheld, localityName, state, localIncome);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class LocalTaxWithholding {\n");

		sb.append("    localTaxWithheld: ").append(toIndentedString(localTaxWithheld)).append("\n");
		sb.append("    localityName: ").append(toIndentedString(localityName)).append("\n");
		sb.append("    state: ").append(toIndentedString(state)).append("\n");
		sb.append("    localIncome: ").append(toIndentedString(localIncome)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

	private static final Logger log = LoggerFactory.getLogger(LocalTaxWithholding.class);

	public LocalTaxWithholding getLocalTaxWIthHolding(int ltwithheldid) throws FDXException {
		try {
			template = ConnectionConfigApi51.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("ltwithheldid", ltwithheldid);
			LocalTaxWithholding localTaxWithholding = template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".localtaxwithholding where ltwithheldid in (:ltwithheldid)", parameters,
					new LocaltaxwithholdingRowMapper());
			return localTaxWithholding;
		} catch (Exception e) {
			log.error("LocalTaxWithholding : ", e);
			throw new FDXException(e, FdxConstants.HTTP_ERROR_CODE_500);
		}
	}
}
