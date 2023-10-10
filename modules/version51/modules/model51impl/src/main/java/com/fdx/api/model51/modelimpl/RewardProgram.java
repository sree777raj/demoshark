package com.fdx.api.model51.modelimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fdx.api.model51.config.ConnectionConfigApi51;
import com.fdx.api.model51.mapper.FiAttrRowMapper;
import com.fdx.api.model51.mapper.RewardProgramRowMapper;
import com.fdx.api.model51.model.RewardProgram51;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Reward program detail
 */
@ApiModel(description = "Reward program detail")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
@Repository("RewardProgram51")
public class RewardProgram implements RewardProgram51<RewardProgram> {

	NamedParameterJdbcTemplate template;

	@JsonProperty("programId")
	private String programId;

	@JsonProperty("programName")
	private String programName;

	@JsonProperty("programUrl")
	private String programUrl;

	@JsonProperty("memberships")
	@Valid
	private List<RewardMembership> memberships = null;

	@JsonProperty("fiAttributes")
	@Valid
	private List<FiAttribute> fiAttributes = null;

	public RewardProgram programId(String programId) {
		this.programId = programId;
		return this;
	}

	/**
	 * Value for a unique identifier
	 * 
	 * @return programId
	 */
	@ApiModelProperty(value = "Value for a unique identifier")

	@Size(max = 256)
	public String getProgramId() {
		return programId;
	}

	public void setProgramId(String programId) {
		this.programId = programId;
	}

	public RewardProgram programName(String programName) {
		this.programName = programName;
		return this;
	}

	/**
	 * Name of reward program
	 * 
	 * @return programName
	 */
	@ApiModelProperty(value = "Name of reward program")

	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

	public RewardProgram programUrl(String programUrl) {
		this.programUrl = programUrl;
		return this;
	}

	/**
	 * URL of reward program
	 * 
	 * @return programUrl
	 */
	@ApiModelProperty(value = "URL of reward program")

	public String getProgramUrl() {
		return programUrl;
	}

	public void setProgramUrl(String programUrl) {
		this.programUrl = programUrl;
	}

	public RewardProgram memberships(List<RewardMembership> memberships) {
		this.memberships = memberships;
		return this;
	}

	public RewardProgram addMembershipsItem(RewardMembership membershipsItem) {
		if (this.memberships == null) {
			this.memberships = new ArrayList<>();
		}
		this.memberships.add(membershipsItem);
		return this;
	}

	/**
	 * Array of reward memberships
	 * 
	 * @return memberships
	 */
	@ApiModelProperty(value = "Array of reward memberships")

	@Valid

	public List<RewardMembership> getMemberships() {
		return memberships;
	}

	public void setMemberships(List<RewardMembership> memberships) {
		this.memberships = memberships;
	}

	public RewardProgram fiAttributes(List<FiAttribute> fiAttributes) {
		this.fiAttributes = fiAttributes;
		return this;
	}

	public RewardProgram addFiAttributesItem(FiAttribute fiAttributesItem) {
		if (this.fiAttributes == null) {
			this.fiAttributes = new ArrayList<>();
		}
		this.fiAttributes.add(fiAttributesItem);
		return this;
	}

	/**
	 * Array of FI-specific attributes
	 * 
	 * @return fiAttributes
	 */
	@ApiModelProperty(value = "Array of FI-specific attributes")

	@Valid

	public List<FiAttribute> getFiAttributes() {
		return fiAttributes;
	}

	public void setFiAttributes(List<FiAttribute> fiAttributes) {
		this.fiAttributes = fiAttributes;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		RewardProgram rewardProgram = (RewardProgram) o;
		return Objects.equals(this.programId, rewardProgram.programId)
				&& Objects.equals(this.programName, rewardProgram.programName)
				&& Objects.equals(this.programUrl, rewardProgram.programUrl)
				&& Objects.equals(this.memberships, rewardProgram.memberships)
				&& Objects.equals(this.fiAttributes, rewardProgram.fiAttributes);
	}

	@Override
	public int hashCode() {
		return Objects.hash(programId, programName, programUrl, memberships, fiAttributes);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RewardProgram {\n");

		sb.append("    programId: ").append(toIndentedString(programId)).append("\n");
		sb.append("    programName: ").append(toIndentedString(programName)).append("\n");
		sb.append("    programUrl: ").append(toIndentedString(programUrl)).append("\n");
		sb.append("    memberships: ").append(toIndentedString(memberships)).append("\n");
		sb.append("    fiAttributes: ").append(toIndentedString(fiAttributes)).append("\n");
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

	private static final Logger log = LoggerFactory.getLogger(RewardProgram.class);

	@Override
	@JsonIgnore
	public RewardProgram getRewardProgram(String programId) throws FDXException {
		try {
			template = ConnectionConfigApi51.getTemplate();
			SqlParameterSource parameters = new MapSqlParameterSource("programId", programId);
			RewardProgram rewardProgram = new RewardProgram();
			RewardProgram rewardProgramResponse;
			try {
				rewardProgramResponse = template.queryForObject(
						"select * from "+ DeveloperContext.getDeveloperSchema() +".rewardprogram where programId in (:programId)", parameters,
						new RewardProgramRowMapper());
			} catch (EmptyResultDataAccessException e) {
				throw new FDXException("Reward Program not found", 1101);
			}
			// FIAttributes start
			if (rewardProgramResponse.getFiAttributes() != null) {
				List<FiAttribute> fiAttrList = rewardProgramResponse.getFiAttributes();
				List<FiAttribute> fiAttrListNew = new ArrayList<>();
				for (FiAttribute fiAttribute : fiAttrList) {
					FiAttrEntity fiAttrEntity = new FiAttrEntity();
					FiAttribute fiAttributeNew = new FiAttribute();
					int name = Integer.valueOf(fiAttribute.getName()).intValue();
					parameters = new MapSqlParameterSource("fiAttributes", name);
					try {
						fiAttrEntity = (FiAttrEntity) template.queryForObject(
								"select * from "+ DeveloperContext.getDeveloperSchema() +".fiattribute where attrid in (:fiAttributes)", parameters,
								new FiAttrRowMapper());
					} catch (EmptyResultDataAccessException e) {
						throw new FDXException("Fi Attribute not found", 0);
					}
					fiAttributeNew.setName(fiAttrEntity.getName());
					fiAttributeNew.setValue(fiAttrEntity.getValue());
					fiAttrListNew.add(fiAttributeNew);
				}
				rewardProgramResponse.setFiAttributes(fiAttrListNew);
			}
			// FIAttributes End
//			MemberShip Start
			if (rewardProgramResponse.getMemberships() != null) {
				List<RewardMembership> rewardMemberShipList = rewardProgramResponse.getMemberships();
				List<RewardMembership> rewardMemberShipListNew = new ArrayList<>();
				for (RewardMembership rewardMemberShipIterator : rewardMemberShipList) {
					RewardMembership rewardMemberShipNew = new RewardMembership();
					rewardMemberShipNew = rewardMemberShipNew
							.getRewardMemberShip(rewardMemberShipIterator.getMemberShipId());
					rewardMemberShipListNew.add(rewardMemberShipNew);
				}
				rewardProgramResponse.setMemberships(rewardMemberShipListNew);
			}
//			MemberShip End
			return rewardProgramResponse;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("RewardProgram : ", e);
			throw new FDXException(e,500);
		}
	}

	@JsonIgnore
	public List<RewardProgram> getRewardProgramList() throws FDXException {
		try {
			template = ConnectionConfigApi51.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("programId", programId);
			RewardProgram rewardProgram = new RewardProgram();
			List<RewardProgram> rewardProgramResponseList = template.query("select * from "+ DeveloperContext.getDeveloperSchema() +".rewardprogram",
					parameters, new RewardProgramRowMapper());
			List<RewardProgram> rewardProgramList = new ArrayList<>();
			for (RewardProgram rewardProgramIterator : rewardProgramResponseList) {
				RewardProgram rewardProgramNew = getRewardProgram(rewardProgramIterator.getProgramId());
				rewardProgramList.add(rewardProgramNew);
			}
			return rewardProgramList;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("RewardProgram : ", e);
			throw new FDXException(e,500);
		}
	}

	@JsonIgnore
	public int getRewardProgramCount() throws FDXException {
		try {
			template = ConnectionConfigApi51.getTemplate();;
			String programId = "programId";
			SqlParameterSource parameters = new MapSqlParameterSource("programId", programId);
			int count = template.queryForObject("select count(*) from "+ DeveloperContext.getDeveloperSchema() +".rewardprogram", parameters,
					Integer.class);
			return count;
		} catch (Exception e) {
			log.error("RewardProgram : ", e);
			throw new FDXException(e,500);
		}
	}
}
