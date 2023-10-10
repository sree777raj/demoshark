package com.fdx.api.model51.modelimpl;

import java.util.Set;

import javax.validation.Valid;

import com.fdx.common.exception.FDXException;
import com.fdx.common.util.FdxConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fdx.api.model51.config.ConnectionConfigApi51;
import com.fdx.api.model51.model.RewardCategories51;

import io.swagger.annotations.ApiModel;

/**
 * An optionally paginated array of reward categories
 */
@ApiModel(description = "An optionally paginated array of reward categories")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
@Repository("RewardCategories51")
public class RewardCategories implements RewardCategories51<RewardCategories> {

	NamedParameterJdbcTemplate template;

	@JsonUnwrapped
	private PaginatedArray paginatedArray;

	@JsonProperty("rewardCategories")
	@Valid
	private Set<RewardCategory> rewardCategories = null;

	public PaginatedArray getPaginatedArray(String resultType, String uriPath, int limit, String offset, int count)
			throws Exception {
		PaginatedArray paginatedArray = new PaginatedArray();
		paginatedArray = paginatedArray.getPaginatedResult(resultType, uriPath, limit, offset, count);
		return paginatedArray;
	}

	public void setPaginatedArray(PaginatedArray paginatedArray) {
		this.paginatedArray = paginatedArray;
	}

	public Set<RewardCategory> getRewardCategories() {
		return rewardCategories;
	}

	public void setRewardCategories(Set<RewardCategory> rewardCategories) {
		this.rewardCategories = rewardCategories;
	}

	public PaginatedArray getPaginatedArray() {
		return paginatedArray;
	}

	@Override
	public String toString() {
		return "RewardCategories [paginatedArray=" + paginatedArray + ", rewardCategories=" + rewardCategories + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((paginatedArray == null) ? 0 : paginatedArray.hashCode());
		result = prime * result + ((rewardCategories == null) ? 0 : rewardCategories.hashCode());
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
		RewardCategories other = (RewardCategories) obj;
		if (paginatedArray == null) {
			if (other.paginatedArray != null)
				return false;
		} else if (!paginatedArray.equals(other.paginatedArray))
			return false;
		if (rewardCategories == null) {
			if (other.rewardCategories != null)
				return false;
		} else if (!rewardCategories.equals(other.rewardCategories))
			return false;
		return true;
	}

	private static final Logger log = LoggerFactory.getLogger(RewardCategories.class);

	@Override
	public RewardCategories getRewardProgramCategories(String rewardProgramId, int limit, String offset, String uriPath)
			throws FDXException {
		try {
			RewardCategory rewardCategory = new RewardCategory();
			Set<RewardCategory> rewardCategoryList = rewardCategory.getRewardCategory(rewardProgramId, limit, offset);
			if(!rewardCategoryList.isEmpty()) {
				template = ConnectionConfigApi51.getTemplate();;
				SqlParameterSource parameters = new MapSqlParameterSource("rewardProgramId", rewardProgramId);
				RewardCategories rewardCategories = new RewardCategories();
				rewardCategories.setRewardCategories(rewardCategoryList);
				int count = rewardCategory.getCount(rewardProgramId);
				PaginatedArray paginatedArray = new PaginatedArray();
				paginatedArray = paginatedArray.getPaginatedResult(null, uriPath, limit, offset, count);
				rewardCategories.setPaginatedArray(paginatedArray);
				return rewardCategories;
			} else{
				throw new FDXException(1102);
			}
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (EmptyResultDataAccessException e) {
			throw new FDXException(e,1102);
		} catch (Exception e) {
			log.error("RewardCategories : ", e);
			throw new FDXException(e, FdxConstants.HTTP_ERROR_CODE_500);
		}
	}
}
