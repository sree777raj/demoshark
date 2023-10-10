package com.fdx.api.model46.modelimpl;

import java.math.BigDecimal;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.Size;

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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import com.fdx.api.model46.config.ConnectionConfigApi46;
import com.fdx.api.model46.mapper.TransactionRewardRowMapper;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Rewards earned on a transaction
 */
@ApiModel(description = "Rewards earned on a transaction")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class TransactionReward {

	NamedParameterJdbcTemplate template;

	@JsonProperty(access = Access.WRITE_ONLY)
	private int rewardId;

	@JsonProperty("categoryId")
	private String categoryId;

	@JsonProperty("accrued")
	private BigDecimal accrued;

	@JsonProperty("adjusted")
	private BigDecimal adjusted;

	public int getRewardId() {
		return rewardId;
	}

	public void setRewardId(int rewardId) {
		this.rewardId = rewardId;
	}

	public TransactionReward categoryId(String categoryId) {
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

	public TransactionReward accrued(BigDecimal accrued) {
		this.accrued = accrued;
		return this;
	}

	/**
	 * Reward units accrued on this transaction
	 * 
	 * @return accrued
	 */
	@ApiModelProperty(value = "Reward units accrued on this transaction")

	@Valid

	public BigDecimal getAccrued() {
		return accrued;
	}

	public void setAccrued(BigDecimal accrued) {
		this.accrued = accrued;
	}

	public TransactionReward adjusted(BigDecimal adjusted) {
		this.adjusted = adjusted;
		return this;
	}

	/**
	 * Reward units adjusted on this transaction
	 * 
	 * @return adjusted
	 */
	@ApiModelProperty(value = "Reward units adjusted on this transaction")

	@Valid

	public BigDecimal getAdjusted() {
		return adjusted;
	}

	public void setAdjusted(BigDecimal adjusted) {
		this.adjusted = adjusted;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		TransactionReward transactionReward = (TransactionReward) o;
		return Objects.equals(this.categoryId, transactionReward.categoryId)
				&& Objects.equals(this.accrued, transactionReward.accrued)
				&& Objects.equals(this.adjusted, transactionReward.adjusted);
	}

	@Override
	public int hashCode() {
		return Objects.hash(categoryId, accrued, adjusted);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TransactionReward {\n");

		sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
		sb.append("    accrued: ").append(toIndentedString(accrued)).append("\n");
		sb.append("    adjusted: ").append(toIndentedString(adjusted)).append("\n");
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

	private static final Logger log = LoggerFactory.getLogger(TransactionReward.class);

	public TransactionReward getReward(int rewardId) throws FDXException {
		try {
		SqlParameterSource parametersReward = new MapSqlParameterSource("rewardId", rewardId);
		template = ConnectionConfigApi46.getTemplate();;
		TransactionReward transactionReward = template.queryForObject(
				"select * from "+ DeveloperContext.getDeveloperSchema() +".transactionreward where rewardid in (:rewardId)", parametersReward,
				new TransactionRewardRowMapper());
		return transactionReward;
		} catch (EmptyResultDataAccessException e) {
			throw new FDXException(Errors.TRANSACTION_REWARD_NOT_FOUND, 0);
		} catch (Exception e) {
			log.error("TransactionReward : ", e);
			throw new FDXException(e, FdxConstants.HTTP_ERROR_CODE_500);
		}
	}
}
