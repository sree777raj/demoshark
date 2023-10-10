package com.fdx.api.model46.modelimpl;

import java.util.Date;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.OptBoolean;
import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fdx.api.model46.config.ConnectionConfigApi46;
import com.fdx.api.model46.mapper.HealthIMpCIRowMapper;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Used on Form 1095-A Part II
 */
@ApiModel(description = "Used on Form 1095-A Part II")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class HealthInsuranceMarketplaceCoveredIndividual {

	NamedParameterJdbcTemplate template;

	@JsonIgnore
	private int himciid;

	@JsonProperty("name")
	private String name;

	@JsonProperty("tin")
	private String tin;

	@JsonProperty("dateOfBirth")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private Date dateOfBirth;

	@JsonProperty("policyStartDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private Date policyStartDate;

	@JsonProperty("policyTerminationDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private Date policyTerminationDate;

	public int getHimciid() {
		return himciid;
	}

	public void setHimciid(int himciid) {
		this.himciid = himciid;
	}

	public HealthInsuranceMarketplaceCoveredIndividual name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Covered individual name
	 * 
	 * @return name
	 */
	@ApiModelProperty(value = "Covered individual name")

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public HealthInsuranceMarketplaceCoveredIndividual tin(String tin) {
		this.tin = tin;
		return this;
	}

	/**
	 * Covered individual SSN
	 * 
	 * @return tin
	 */
	@ApiModelProperty(value = "Covered individual SSN")

	public String getTin() {
		return tin;
	}

	public void setTin(String tin) {
		this.tin = tin;
	}

	public HealthInsuranceMarketplaceCoveredIndividual dateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
		return this;
	}

	/**
	 * ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included
	 * according to [IETF RFC3339]
	 * (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)
	 * 
	 * @return dateOfBirth
	 */
	@ApiModelProperty(value = "ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included according to [IETF RFC3339] (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)")

	@Valid
	@Size(max = 10)
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public HealthInsuranceMarketplaceCoveredIndividual policyStartDate(Date policyStartDate) {
		this.policyStartDate = policyStartDate;
		return this;
	}

	/**
	 * ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included
	 * according to [IETF RFC3339]
	 * (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)
	 * 
	 * @return policyStartDate
	 */
	@ApiModelProperty(value = "ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included according to [IETF RFC3339] (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)")

	@Valid
	@Size(max = 10)
	public Date getPolicyStartDate() {
		return policyStartDate;
	}

	public void setPolicyStartDate(Date policyStartDate) {
		this.policyStartDate = policyStartDate;
	}

	public HealthInsuranceMarketplaceCoveredIndividual policyTerminationDate(Date policyTerminationDate) {
		this.policyTerminationDate = policyTerminationDate;
		return this;
	}

	/**
	 * ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included
	 * according to [IETF RFC3339]
	 * (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)
	 * 
	 * @return policyTerminationDate
	 */
	@ApiModelProperty(value = "ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included according to [IETF RFC3339] (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)")

	@Valid
	@Size(max = 10)
	public Date getPolicyTerminationDate() {
		return policyTerminationDate;
	}

	public void setPolicyTerminationDate(Date policyTerminationDate) {
		this.policyTerminationDate = policyTerminationDate;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		HealthInsuranceMarketplaceCoveredIndividual healthInsuranceMarketplaceCoveredIndividual = (HealthInsuranceMarketplaceCoveredIndividual) o;
		return Objects.equals(this.name, healthInsuranceMarketplaceCoveredIndividual.name)
				&& Objects.equals(this.tin, healthInsuranceMarketplaceCoveredIndividual.tin)
				&& Objects.equals(this.dateOfBirth, healthInsuranceMarketplaceCoveredIndividual.dateOfBirth)
				&& Objects.equals(this.policyStartDate, healthInsuranceMarketplaceCoveredIndividual.policyStartDate)
				&& Objects.equals(this.policyTerminationDate,
						healthInsuranceMarketplaceCoveredIndividual.policyTerminationDate);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, tin, dateOfBirth, policyStartDate, policyTerminationDate);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class HealthInsuranceMarketplaceCoveredIndividual {\n");

		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    tin: ").append(toIndentedString(tin)).append("\n");
		sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
		sb.append("    policyStartDate: ").append(toIndentedString(policyStartDate)).append("\n");
		sb.append("    policyTerminationDate: ").append(toIndentedString(policyTerminationDate)).append("\n");
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

	private static final Logger log = LoggerFactory.getLogger(HealthInsuranceMarketplaceCoveredIndividual.class);

	public HealthInsuranceMarketplaceCoveredIndividual getHiMpCidDetails(int himciid) throws FDXException {
		try {
			
			template = ConnectionConfigApi46.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("himciid", himciid);

			HealthInsuranceMarketplaceCoveredIndividual healthInsuranceMarketplaceCoveredIndividual = template
					.queryForObject(
							"select * from "+ DeveloperContext.getDeveloperSchema() +".healthinsurancemarketplacecoveredindividual where himciid in (:himciid)",
							parameters, new HealthIMpCIRowMapper());

			return healthInsuranceMarketplaceCoveredIndividual;
		} catch (Exception e) {
			log.error("HealthInsuranceMarketplaceCoveredIndividual : ", e);
			throw new FDXException(e,500);
		}
	}
}
