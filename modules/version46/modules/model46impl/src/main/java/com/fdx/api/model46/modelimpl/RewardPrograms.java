package com.fdx.api.model46.modelimpl;

import java.util.List;

import com.fdx.common.exception.FDXException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fdx.api.model46.config.ConnectionConfigApi46;
import com.fdx.api.model46.model.RewardPrograms46;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * An optionally paginated array of reward programs
 */
@ApiModel(description = "An optionally paginated array of reward programs")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
@Repository("RewardPrograms46")
public class RewardPrograms implements RewardPrograms46<RewardPrograms> {

	NamedParameterJdbcTemplate template;

	@JsonUnwrapped
	private PaginatedArray paginatedArray;

	@JsonProperty("rewardPrograms")
	private List<RewardProgram> rewardPrograms = null;

	/**
	 * Array of reward programs
	 * 
	 * @return rewardPrograms
	 */
	@ApiModelProperty(value = "Array of reward programs")

	public List<RewardProgram> getRewardPrograms() {
		return rewardPrograms;
	}

	public void setRewardPrograms(List<RewardProgram> rewardPrograms) {
		this.rewardPrograms = rewardPrograms;
	}

	public PaginatedArray getPaginatedArray(String resultType, String uriPath, int limit, String offset, int count) throws Exception {
		PaginatedArray paginatedArray = new PaginatedArray();
		paginatedArray = paginatedArray.getPaginatedResult(resultType, uriPath, limit, offset, count);
		return paginatedArray;
	}

	public void setPaginatedArray(PaginatedArray paginatedArray) {
		this.paginatedArray = paginatedArray;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((paginatedArray == null) ? 0 : paginatedArray.hashCode());
		result = prime * result + ((rewardPrograms == null) ? 0 : rewardPrograms.hashCode());
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
		RewardPrograms other = (RewardPrograms) obj;
		if (paginatedArray == null) {
			if (other.paginatedArray != null)
				return false;
		} else if (!paginatedArray.equals(other.paginatedArray))
			return false;
		if (rewardPrograms == null) {
			if (other.rewardPrograms != null)
				return false;
		} else if (!rewardPrograms.equals(other.rewardPrograms))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RewardPrograms [paginatedArray=" + paginatedArray + ", rewardPrograms=" + rewardPrograms + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(RewardPrograms.class);

	@Override
	public RewardPrograms getRewardPrograms(String uriPath) throws FDXException {
		try {
			
			template = ConnectionConfigApi46.getTemplate();;
			RewardProgram rewardProgram = new RewardProgram();
			RewardPrograms rewardPrograms = new RewardPrograms();

			List<RewardProgram> rewardProgramList = rewardProgram.getRewardProgramList();
			int count = rewardProgram.getRewardProgramCount();

			rewardPrograms.setRewardPrograms(rewardProgramList);

			PaginatedArray paginatedArray = new PaginatedArray();
			PageMetadata page = new PageMetadata();
			page.setTotalElements(rewardProgramList.size());
			paginatedArray.setPage(page);

			rewardPrograms.setPaginatedArray(paginatedArray);
			return rewardPrograms;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("RewardPrograms : ", e);
			throw new FDXException(e,500);
		}
	}
}
