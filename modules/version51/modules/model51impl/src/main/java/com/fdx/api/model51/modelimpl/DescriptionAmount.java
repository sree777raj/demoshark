package com.fdx.api.model51.modelimpl;

import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import com.fdx.common.util.FdxConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fdx.api.model51.config.ConnectionConfigApi51;
import com.fdx.api.model51.mapper.DescriptionAmountRowMapper;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Description and amount pair used on IRS W-2, etc.
 */
@ApiModel(description = "Description and amount pair used on IRS W-2, etc.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class DescriptionAmount {

	NamedParameterJdbcTemplate template;

	@JsonIgnore
	private int descAmountId;

	@JsonProperty("description")
	private String description;

	@JsonProperty("amount")
	private Double amount;

	public DescriptionAmount description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Description
	 * 
	 * @return description
	 */
	@ApiModelProperty(value = "Description")

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public DescriptionAmount amount(Double amount) {
		this.amount = amount;
		return this;
	}

	/**
	 * Amount
	 * 
	 * @return amount
	 */
	@ApiModelProperty(value = "Amount")

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public int getDescAmountId() {
		return descAmountId;
	}

	public void setDescAmountId(int descAmountId) {
		this.descAmountId = descAmountId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((amount == null) ? 0 : amount.hashCode());
		result = prime * result + descAmountId;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
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
		DescriptionAmount other = (DescriptionAmount) obj;
		if (amount == null) {
			if (other.amount != null)
				return false;
		} else if (!amount.equals(other.amount))
			return false;
		if (descAmountId != other.descAmountId)
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DescriptionAmount [descAmountId=" + descAmountId + ", description=" + description + ", amount=" + amount
				+ "]";
	}

	private static final Logger log = LoggerFactory.getLogger(DescriptionAmount.class);

	public DescriptionAmount getDescriptionAmount(int descAmountId) throws FDXException {
		DescriptionAmount descriptionAmount;
		try {
			
			template = ConnectionConfigApi51.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("descAmountId", descAmountId);

			descriptionAmount = template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".descriptionamount where descAmountId in (:descAmountId)", parameters,
					new DescriptionAmountRowMapper());
		} catch (Exception e) {
			log.error("DescriptionAmount : ", e);
			throw new FDXException(e, FdxConstants.HTTP_ERROR_CODE_500);
		}
		return descriptionAmount;
	}

}
