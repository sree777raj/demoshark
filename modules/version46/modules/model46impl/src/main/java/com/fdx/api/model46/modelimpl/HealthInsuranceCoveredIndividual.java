package com.fdx.api.model46.modelimpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.*;
import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import com.fdx.common.util.FdxConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fdx.api.model46.config.ConnectionConfigApi46;
import com.fdx.api.model46.mapper.HealthInsuranceCoveredIndividualRowMapper;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Used on Form 1095-B Part IV and Form 1095-C Part III
 */
@ApiModel(description = "Used on Form 1095-B Part IV and Form 1095-C Part III")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class HealthInsuranceCoveredIndividual {

	NamedParameterJdbcTemplate template;

	@JsonIgnore
	private int hiciid;

	@JsonProperty("name")
	private IndividualName name;

	@JsonProperty("tin")
	private String tin;

	@JsonProperty("dateOfBirth")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private Date dateOfBirth;

	@JsonProperty("coveredAt12Months")
	@JsonInclude(Include.NON_NULL)
	private Boolean coveredAt12Months;

	@JsonProperty("coveredAll12Months")
	@JsonInclude(Include.NON_NULL)
	private Boolean coveredAll12Months;

	@JsonProperty("coveredMonths")
	@Valid
	private List<MonthAbbreviation> coveredMonths = null;

	public HealthInsuranceCoveredIndividual name(IndividualName name) {
		this.name = name;
		return this;
	}

	/**
	 * Get name
	 * 
	 * @return name
	 */
	@ApiModelProperty(value = "")

	@Valid

	public IndividualName getName() {
		return name;
	}

	public void setName(IndividualName name) {
		this.name = name;
	}

	public HealthInsuranceCoveredIndividual tin(String tin) {
		this.tin = tin;
		return this;
	}

	/**
	 * Social security number or other TIN
	 * 
	 * @return tin
	 */
	@ApiModelProperty(value = "Social security number or other TIN")

	public String getTin() {
		return tin;
	}

	public void setTin(String tin) {
		this.tin = tin;
	}

	public HealthInsuranceCoveredIndividual dateOfBirth(Date dateOfBirth) {
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

	public HealthInsuranceCoveredIndividual coveredAt12Months(Boolean coveredAt12Months) {
		this.coveredAt12Months = coveredAt12Months;
		return this;
	}

	/**
	 * Covered all 12 months (deprecated for rename to coveredAll12Months, removing
	 * in FDX v5.0)
	 * 
	 * @return coveredAt12Months
	 */
	@ApiModelProperty(value = "Covered all 12 months (deprecated for rename to coveredAll12Months, removing in FDX v5.0)")

	public Boolean getCoveredAt12Months() {
		return coveredAt12Months;
	}

	public void setCoveredAt12Months(Boolean coveredAt12Months) {
		this.coveredAt12Months = coveredAt12Months;
	}

	public HealthInsuranceCoveredIndividual coveredAll12Months(Boolean coveredAll12Months) {
		this.coveredAll12Months = coveredAll12Months;
		return this;
	}

	/**
	 * Covered all 12 months
	 * 
	 * @return coveredAll12Months
	 */
	@ApiModelProperty(value = "Covered all 12 months")

	public Boolean getCoveredAll12Months() {
		return coveredAll12Months;
	}

	public void setCoveredAll12Months(Boolean coveredAll12Months) {
		this.coveredAll12Months = coveredAll12Months;
	}

	public HealthInsuranceCoveredIndividual coveredMonths(List<MonthAbbreviation> coveredMonths) {
		this.coveredMonths = coveredMonths;
		return this;
	}

	public HealthInsuranceCoveredIndividual addCoveredMonthsItem(MonthAbbreviation coveredMonthsItem) {
		if (this.coveredMonths == null) {
			this.coveredMonths = new ArrayList<>();
		}
		this.coveredMonths.add(coveredMonthsItem);
		return this;
	}

	/**
	 * Months covered
	 * 
	 * @return coveredMonths
	 */
	@ApiModelProperty(value = "Months covered")

	@Valid

	public List<MonthAbbreviation> getCoveredMonths() {
		return coveredMonths;
	}

	public void setCoveredMonths(List<MonthAbbreviation> coveredMonths) {
		this.coveredMonths = coveredMonths;
	}

	public int getHiciid() {
		return hiciid;
	}

	public void setHiciid(int hiciid) {
		this.hiciid = hiciid;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		HealthInsuranceCoveredIndividual healthInsuranceCoveredIndividual = (HealthInsuranceCoveredIndividual) o;
		return Objects.equals(this.name, healthInsuranceCoveredIndividual.name)
				&& Objects.equals(this.tin, healthInsuranceCoveredIndividual.tin)
				&& Objects.equals(this.dateOfBirth, healthInsuranceCoveredIndividual.dateOfBirth)
				&& Objects.equals(this.coveredAt12Months, healthInsuranceCoveredIndividual.coveredAt12Months)
				&& Objects.equals(this.coveredAll12Months, healthInsuranceCoveredIndividual.coveredAll12Months)
				&& Objects.equals(this.coveredMonths, healthInsuranceCoveredIndividual.coveredMonths);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, tin, dateOfBirth, coveredAt12Months, coveredAll12Months, coveredMonths);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class HealthInsuranceCoveredIndividual {\n");

		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    tin: ").append(toIndentedString(tin)).append("\n");
		sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
		sb.append("    coveredAt12Months: ").append(toIndentedString(coveredAt12Months)).append("\n");
		sb.append("    coveredAll12Months: ").append(toIndentedString(coveredAll12Months)).append("\n");
		sb.append("    coveredMonths: ").append(toIndentedString(coveredMonths)).append("\n");
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

	private static final Logger log = LoggerFactory.getLogger(HealthInsuranceCoveredIndividual.class);

	public HealthInsuranceCoveredIndividual getHiCidDetails(int hiciid) throws FDXException {
		try {
			IndividualName individualName = new IndividualName();
			template = ConnectionConfigApi46.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("hiciid", hiciid);
			HealthInsuranceCoveredIndividual healthInsuranceCoveredIndividual;
			try {
				healthInsuranceCoveredIndividual = template.queryForObject(
						"select * from "+ DeveloperContext.getDeveloperSchema() +".healthInsuranceCoveredIndividual where hiciid in (:hiciid)", parameters,
						new HealthInsuranceCoveredIndividualRowMapper());
			} catch (EmptyResultDataAccessException e) {
				throw new FDXException("Health Insurance Covered Individual not found", 0);
			}
			if (healthInsuranceCoveredIndividual.getName() != null) {
				individualName = individualName
						.getIndividualName(healthInsuranceCoveredIndividual.getName().getNameid());
				healthInsuranceCoveredIndividual.setName(individualName);
			}
			return healthInsuranceCoveredIndividual;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("HealthInsuranceCoveredIndividual : ", e);
			throw new FDXException(e, FdxConstants.HTTP_ERROR_CODE_500);
		}
	}
}
