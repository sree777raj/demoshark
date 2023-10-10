package com.fdx.api.model51.modelimpl;

import java.util.ArrayList;
import java.util.List;

import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fdx.api.model51.config.ConnectionConfigApi51;
import com.fdx.api.model51.mapper.AvailabilityRowMapper;
import com.fdx.api.model51.model.Availability51;

import io.swagger.annotations.ApiModel;

/**
 * The response object for the API /availability request
 */
@ApiModel(description = "The response object for the API /availability request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
@Repository("Availability51")
public class Availability implements Availability51<Availability> {

	NamedParameterJdbcTemplate template;

	@JsonProperty("currentStatus")
	private String currentStatus;

	@JsonProperty("currentStatusDesc")
	private String currentStatusDesc;

	@JsonProperty("plannedAvailability")
	private List<PlannedAvailability> plannedAvailability = null;

	public String getCurrentStatus() {
		return currentStatus;
	}

	public void setCurrentStatus(String currentStatus) {
		this.currentStatus = currentStatus;
	}

	public String getCurrentStatusDesc() {
		return currentStatusDesc;
	}

	public void setCurrentStatusDesc(String currentStatusDesc) {
		this.currentStatusDesc = currentStatusDesc;
	}

	public List<PlannedAvailability> getPlannedAvailability() {
		return plannedAvailability;
	}

	public void setPlannedAvailability(List<PlannedAvailability> plannedAvailability) {
		this.plannedAvailability = plannedAvailability;
	}

	@Override
	public String toString() {
		return "Availability [currentStatus=" + currentStatus + ", currentStatusDesc=" + currentStatusDesc
				+ ", plannedAvailability=" + plannedAvailability + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((currentStatus == null) ? 0 : currentStatus.hashCode());
		result = prime * result + ((currentStatusDesc == null) ? 0 : currentStatusDesc.hashCode());
		result = prime * result + ((plannedAvailability == null) ? 0 : plannedAvailability.hashCode());
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
		Availability other = (Availability) obj;
		if (currentStatus == null) {
			if (other.currentStatus != null)
				return false;
		} else if (!currentStatus.equals(other.currentStatus))
			return false;
		if (currentStatusDesc == null) {
			if (other.currentStatusDesc != null)
				return false;
		} else if (!currentStatusDesc.equals(other.currentStatusDesc))
			return false;
		if (plannedAvailability == null) {
			if (other.plannedAvailability != null)
				return false;
		} else if (!plannedAvailability.equals(other.plannedAvailability))
			return false;
		return true;
	}

	private static final Logger log = LoggerFactory.getLogger(Availability.class);

	@Override
	@JsonIgnore
	public Availability getAvailability() throws FDXException {
		try {
			template = ConnectionConfigApi51.getTemplate();;
			String currencyCode = "currencyCode";

			SqlParameterSource parameters = new MapSqlParameterSource("currencycode", currencyCode);
			Availability availability = template.queryForObject("select * from "+ DeveloperContext.getDeveloperSchema() +".availability", parameters,
					new AvailabilityRowMapper());

			List<PlannedAvailability> plannedAvailabilityList = new ArrayList<>();

			if (availability.getPlannedAvailability() != null) {
				for (PlannedAvailability plannedAvailabilityIterator : availability.getPlannedAvailability()) {
					PlannedAvailability plannedAvailability = new PlannedAvailability();
					plannedAvailability = plannedAvailability
							.getPlannedAvailabilityResponse(plannedAvailabilityIterator);
					plannedAvailabilityList.add(plannedAvailability);
				}
			}
			availability.setPlannedAvailability(plannedAvailabilityList);
			return availability;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Availability : ", e);
			throw new FDXException(e,500);
		}
	}
}
