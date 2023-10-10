package com.fdx.api.model46.modelimpl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Size;

import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import com.fdx.common.util.FdxConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fdx.api.model46.config.ConnectionConfigApi46;
import com.fdx.api.model46.mapper.FiAttrRowMapper;
import com.fdx.api.model46.mapper.RewardCategoryRowMapper;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Reward category used to calculate rewards on a transaction
 */
@ApiModel(description = "Reward category used to calculate rewards on a transaction")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class RewardCategory {

	NamedParameterJdbcTemplate template;

	@JsonProperty("categoryName")
	private String categoryName;

	@JsonProperty("programId")
	private String programId;

	@JsonProperty("categoryId")
	private String categoryId;

	@JsonProperty("multiplier")
	private BigDecimal multiplier;

	@JsonProperty("description")
	private String description;

	@JsonProperty("fiAttributes")
	@Valid
	private List<FiAttribute> fiAttributes = null;

	public RewardCategory categoryName(String categoryName) {
		this.categoryName = categoryName;
		return this;
	}

	/**
	 * Reward category name
	 * 
	 * @return categoryName
	 */
	@ApiModelProperty(value = "Reward category name")

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public RewardCategory categoryId(String categoryId) {
		this.categoryId = categoryId;
		return this;
	}

	/**
	 * Value for a unique identifier
	 * 
	 * @return categoryId
	 */
	@ApiModelProperty(value = "Value for a unique identifier")

	@Size(max = 256)
	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public RewardCategory multiplier(BigDecimal multiplier) {
		this.multiplier = multiplier;
		return this;
	}

	/**
	 * Factor used to calculate rewards accrued minimum: 0
	 * 
	 * @return multiplier
	 */
	@ApiModelProperty(value = "Factor used to calculate rewards accrued")

	@Valid
	@DecimalMin("0")
	public BigDecimal getMultiplier() {
		return multiplier;
	}

	public void setMultiplier(BigDecimal multiplier) {
		this.multiplier = multiplier;
	}

	public RewardCategory description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Description of the reward category
	 * 
	 * @return description
	 */
	@ApiModelProperty(value = "Description of the reward category")

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public RewardCategory fiAttributes(List<FiAttribute> fiAttributes) {
		this.fiAttributes = fiAttributes;
		return this;
	}

	public RewardCategory addFiAttributesItem(FiAttribute fiAttributesItem) {
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

	public String getProgramId() {
		return programId;
	}

	public void setProgramId(String programId) {
		this.programId = programId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categoryId == null) ? 0 : categoryId.hashCode());
		result = prime * result + ((categoryName == null) ? 0 : categoryName.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((fiAttributes == null) ? 0 : fiAttributes.hashCode());
		result = prime * result + ((multiplier == null) ? 0 : multiplier.hashCode());
		result = prime * result + ((programId == null) ? 0 : programId.hashCode());
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
		RewardCategory other = (RewardCategory) obj;
		if (categoryId == null) {
			if (other.categoryId != null)
				return false;
		} else if (!categoryId.equals(other.categoryId))
			return false;
		if (categoryName == null) {
			if (other.categoryName != null)
				return false;
		} else if (!categoryName.equals(other.categoryName))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (fiAttributes == null) {
			if (other.fiAttributes != null)
				return false;
		} else if (!fiAttributes.equals(other.fiAttributes))
			return false;
		if (multiplier == null) {
			if (other.multiplier != null)
				return false;
		} else if (!multiplier.equals(other.multiplier))
			return false;
		if (programId == null) {
			if (other.programId != null)
				return false;
		} else if (!programId.equals(other.programId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RewardCategory [categoryName=" + categoryName + ", programId=" + programId + ", categoryId="
				+ categoryId + ", multiplier=" + multiplier + ", description=" + description + ", fiAttributes="
				+ fiAttributes + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(RewardCategory.class);

	public Set<RewardCategory> getRewardCategory(String rewardProgramId, int limit, String offset) throws FDXException {
		try {
			template = ConnectionConfigApi46.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("rewardProgramId", rewardProgramId);
			RewardCategory rewardCategory = new RewardCategory();
			Set<RewardCategory> rewardCategoryListNew = new HashSet<>();
			List<RewardCategory> rewardCategoryResponseList = template.query(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".rewardCategory where programId in (:rewardProgramId) order by categoryId limit "
							+ limit + " offset " + offset,
					parameters, new RewardCategoryRowMapper());
			for (RewardCategory rewardCategoryIterator : rewardCategoryResponseList) {
				RewardCategory rewardCategoryNew = new RewardCategory();
				// FIAttributes start
				if (rewardCategoryIterator.getFiAttributes() != null) {
					List<FiAttribute> fiAttrList = rewardCategoryIterator.getFiAttributes();
					List<FiAttribute> fiAttrListNew = new ArrayList<>();
					for (FiAttribute fiAttribute : fiAttrList) {
						FiAttrEntity fiAttrEntity = new FiAttrEntity();
						FiAttribute fiAttributeNew = new FiAttribute();
						int name = Integer.valueOf(fiAttribute.getName()).intValue();
						parameters = new MapSqlParameterSource("fiAttributes", name);
						fiAttrEntity = (FiAttrEntity) template.queryForObject(
								"select * from "+ DeveloperContext.getDeveloperSchema() +".fiattribute where attrid in (:fiAttributes)", parameters,
								new FiAttrRowMapper());
						fiAttributeNew.setName(fiAttrEntity.getName());
						fiAttributeNew.setValue(fiAttrEntity.getValue());
						fiAttrListNew.add(fiAttributeNew);
					}
					rewardCategoryIterator.setFiAttributes(fiAttrListNew);
				}
				rewardCategoryListNew.add(rewardCategoryIterator);
			}
			return rewardCategoryListNew;
		} catch (EmptyResultDataAccessException e) {
			throw new FDXException(e,1102);
		} catch (Exception e) {
			log.error("RewardCategory : ", e);
			throw new FDXException(e, FdxConstants.HTTP_ERROR_CODE_500);
		}
	}

	public int getCount(String rewardProgramId) throws FDXException {
		try {
			template = ConnectionConfigApi46.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("rewardProgramId", rewardProgramId);
			int count = template.queryForObject(
					"select count(*) from "+ DeveloperContext.getDeveloperSchema() +".rewardCategory where programId in (:rewardProgramId)", parameters,
					Integer.class);
			return count;
		} catch (Exception e) {
			log.error("RewardCategories : ", e);
			throw new FDXException(e,FdxConstants.HTTP_ERROR_CODE_500);
		}
	}
}
