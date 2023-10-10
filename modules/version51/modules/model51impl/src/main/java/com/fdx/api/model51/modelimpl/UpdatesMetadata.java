package com.fdx.api.model51.modelimpl;

import java.util.Objects;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
import com.fdx.api.model51.mapper.UpdatesMetadataRowMapper;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Change IDs for synchronizable result sets
 */
@ApiModel(description = "Change IDs for synchronizable result sets")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class UpdatesMetadata {

	NamedParameterJdbcTemplate template;

	@JsonProperty("nextUpdateId")
	private String nextUpdateId;

	//@JsonProperty("nextSequenceId")
	@JsonIgnore
	private String nextSequenceId;

	public String getNextSequenceId() {
		return nextSequenceId;
	}

	public void setNextSequenceId(String nextSequenceId) {
		this.nextSequenceId = nextSequenceId;
	}

	public UpdatesMetadata nextUpdateId(String nextUpdateId) {
		this.nextUpdateId = nextUpdateId;
		return this;
	}

	/**
	 * Value for a unique identifier
	 * 
	 * @return nextUpdateId
	 */
	@ApiModelProperty(value = "Value for a unique identifier")

	@Size(max = 256)
	public String getNextUpdateId() {
		return nextUpdateId;
	}

	public void setNextUpdateId(String nextUpdateId) {
		this.nextUpdateId = nextUpdateId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		UpdatesMetadata updatesMetadata = (UpdatesMetadata) o;
		return Objects.equals(this.nextUpdateId, updatesMetadata.nextUpdateId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(nextUpdateId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class UpdatesMetadata {\n");

		sb.append("    nextUpdateId: ").append(toIndentedString(nextUpdateId)).append("\n");
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

	private static final Logger log = LoggerFactory.getLogger(UpdatesMetadata.class);

	public UpdatesMetadata getNextUpdateIddetails(String updateentiy) throws FDXException {
		try {
			SqlParameterSource parameters = new MapSqlParameterSource("updateentiy", updateentiy);
			template = ConnectionConfigApi51.getTemplate();;
			UpdatesMetadata updatesMetadata = template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".updatesMetadata where updateentiy = '" + updateentiy + "'", parameters,
					new UpdatesMetadataRowMapper());
			boolean isUpdated = isSequenceUpdated(updatesMetadata);
			if (isUpdated)
				return updatesMetadata;
			else
				return null;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("UpdatesMetadata : ", e);
			throw new FDXException(e, FdxConstants.HTTP_ERROR_CODE_500);
		}
	}

	public void updateSequenceId(String updateEntity, UpdatesMetadata updatesMetadata) throws FDXException {
		try {
			template = ConnectionConfigApi51.getTemplate();;
			int count = template.update(
					"update "+ DeveloperContext.getDeveloperSchema() +".updatesMetadata set nextupdateid = (:value)  where updateentiy = '"
							+ updateEntity + "'",
					new MapSqlParameterSource().addValue("value", updatesMetadata.getNextSequenceId()));
			if (count != 1) {
				log.error("UpdatesMetadata : update "+ DeveloperContext.getDeveloperSchema() +".updatesMetadata failed for entity " + updateEntity);
				throw new FDXException(FdxConstants.HTTP_ERROR_CODE_500);
			}
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("UpdatesMetadata : ", e);
			throw new FDXException(e,FdxConstants.HTTP_ERROR_CODE_500);
		}
	}

	public boolean isSequenceUpdated(UpdatesMetadata updatesMetadata) throws FDXException {
		try {
			String[] nextSequenceArray = updatesMetadata.getNextSequenceId().split("-");
			String nextSequence = nextSequenceArray[1];

			String[] nextUpdateArray = updatesMetadata.getNextUpdateId().split("-");
			String nextUpdate = nextUpdateArray [1];

			if (!(nextUpdate.equals(nextSequence))) {
				return true;
			} else
				return false;
		} catch (Exception e) {
			log.error("UpdatesMetadata : ", e);
			throw new FDXException(e,FdxConstants.HTTP_ERROR_CODE_500);
		}
	}

	public String assignNextSequenceId(String updateEntity) throws FDXException {
		try {
			
			template = ConnectionConfigApi51.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("updateEntity", updateEntity);

			UpdatesMetadata updatesMetadata = template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".updatesMetadata where updateentiy ='" + updateEntity + "'", parameters,
					new UpdatesMetadataRowMapper());

			String[] nextSequenceArray = updatesMetadata.getNextSequenceId().split("-");
			int nextSequence = Integer.parseInt(nextSequenceArray[1]);

			StringBuffer nextSequenceIdNew = new StringBuffer();
			nextSequenceIdNew.append(nextSequenceArray[0]);
			nextSequenceIdNew.append("-");
			nextSequenceIdNew.append(++nextSequence);

			int count = template
					.update("update "+ DeveloperContext.getDeveloperSchema() +".updatesMetadata set nextsequenceId = (:value)  where updateentiy = '"
							+ updateEntity + "'", new MapSqlParameterSource().addValue("value", nextSequenceIdNew));
			if (count != 1) {
				log.error("UpdatesMetadata : update "+ DeveloperContext.getDeveloperSchema() +".updatesMetadata failed for entity " + updateEntity);
				throw new FDXException(FdxConstants.HTTP_ERROR_CODE_500);
			}
			return updatesMetadata.getNextSequenceId().toString();
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("UpdatesMetadata : ", e);
			throw new FDXException(e,FdxConstants.HTTP_ERROR_CODE_500);
		}
	}
}
