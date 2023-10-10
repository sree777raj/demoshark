package com.fdx.api.model51.modelimpl;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.OptBoolean;
import com.fdx.common.exception.Errors;
import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import com.fdx.common.util.FdxConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fdx.api.model51.config.ConnectionConfigApi51;
import com.fdx.api.model51.mapper.PlannedAvailabilityRowMapper;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A Provider&#39;s planned time period for API availability
 */
@ApiModel(description = "A Provider's planned time period for API availability")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class PlannedAvailability {

	NamedParameterJdbcTemplate template;

	@JsonIgnore
	private int plannedStatusId;

	@JsonProperty("status")
	private String status;

	@JsonProperty("statusShortDesc")
	private String statusShortDesc;

	@JsonProperty("statusStartDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, lenient = OptBoolean.FALSE)
	private java.sql.Timestamp statusStartDate;

	@JsonProperty("statusEndDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, lenient = OptBoolean.FALSE)
	private java.sql.Timestamp statusEndDate;

	public PlannedAvailability status(String status) {
		this.status = status;
		return this;
	}

	/**
	 * API availability status for this time period
	 * 
	 * @return status
	 */
	@ApiModelProperty(value = "API availability status for this time period")

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public PlannedAvailability statusShortDesc(String statusShortDesc) {
		this.statusShortDesc = statusShortDesc;
		return this;
	}

	/**
	 * A short description of the API availability status
	 * 
	 * @return statusShortDesc
	 */
	@ApiModelProperty(value = "A short description of the API availability status")

	public String getStatusShortDesc() {
		return statusShortDesc;
	}

	public void setStatusShortDesc(String statusShortDesc) {
		this.statusShortDesc = statusShortDesc;
	}

	public PlannedAvailability statusStartDate(java.sql.Timestamp statusStartDate) {
		this.statusStartDate = statusStartDate;
		return this;
	}

	/**
	 * Get statusStartDate
	 * 
	 * @return statusStartDate
	 */
	@ApiModelProperty(value = "")

	@Valid

	public java.sql.Timestamp getStatusStartDate() {
		return statusStartDate;
	}

	public void setStatusStartDate(java.sql.Timestamp statusStartDate) {
		this.statusStartDate = statusStartDate;
	}

	public PlannedAvailability statusEndDate(java.sql.Timestamp statusEndDate) {
		this.statusEndDate = statusEndDate;
		return this;
	}

	/**
	 * Get statusEndDate
	 * 
	 * @return statusEndDate
	 */
	@ApiModelProperty(value = "")

	@Valid

	public java.sql.Timestamp getStatusEndDate() {
		return statusEndDate;
	}

	public void setStatusEndDate(java.sql.Timestamp statusEndDate) {
		this.statusEndDate = statusEndDate;
	}

	public int getPlannedStatusId() {
		return plannedStatusId;
	}

	public void setPlannedStatusId(int plannedStatusId) {
		this.plannedStatusId = plannedStatusId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PlannedAvailability plannedAvailability = (PlannedAvailability) o;
		return Objects.equals(this.status, plannedAvailability.status)
				&& Objects.equals(this.statusShortDesc, plannedAvailability.statusShortDesc)
				&& Objects.equals(this.statusStartDate, plannedAvailability.statusStartDate)
				&& Objects.equals(this.statusEndDate, plannedAvailability.statusEndDate);
	}

	@Override
	public int hashCode() {
		return Objects.hash(status, statusShortDesc, statusStartDate, statusEndDate);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PlannedAvailability {\n");

		sb.append("    status: ").append(toIndentedString(status)).append("\n");
		sb.append("    statusShortDesc: ").append(toIndentedString(statusShortDesc)).append("\n");
		sb.append("    statusStartDate: ").append(toIndentedString(statusStartDate)).append("\n");
		sb.append("    statusEndDate: ").append(toIndentedString(statusEndDate)).append("\n");
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

	private static final Logger log = LoggerFactory.getLogger(PlannedAvailability.class);

	public PlannedAvailability getPlannedAvailabilityResponse(PlannedAvailability plannedAvailability)
			throws FDXException {
		try {
			template = ConnectionConfigApi51.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("plannedStatusid",
					plannedAvailability.getPlannedStatusId());
			PlannedAvailability plannedAvailabilityResponse = template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".plannedavailability where plannedStatusid in (:plannedStatusid)",
					parameters, new PlannedAvailabilityRowMapper());
			return plannedAvailabilityResponse;
		} catch (EmptyResultDataAccessException e) {
			throw new FDXException(Errors.PLANNED_AVAILABILITY_NOT_FOUND, 0);
		} catch (Exception e) {
			log.error("PlannedAvailability : ", e);
			throw new FDXException(e, FdxConstants.HTTP_ERROR_CODE_500);
		}
	}
}
