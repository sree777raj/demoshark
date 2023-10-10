package com.fdx.api.model46.modelimpl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;

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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fdx.api.model46.config.ConnectionConfigApi46;
import com.fdx.api.model46.mapper.FiAttrRowMapper;
import com.fdx.api.model46.mapper.RewardBalanceRowMapper;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Reward program balance
 */
@ApiModel(description = "Reward program balance")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class RewardBalance {

	NamedParameterJdbcTemplate template;

	@JsonIgnore
	private int balanceId;

	@JsonProperty("name")
	private String name;

	@JsonProperty("type")
	private RewardType type;

	@JsonProperty("balance")
	private BigDecimal balance;

	@JsonProperty("accruedYtd")
	private BigDecimal accruedYtd;

	@JsonProperty("redeemedYtd")
	private BigDecimal redeemedYtd;

	@JsonProperty("qualifying")
	@JsonInclude(Include.NON_NULL)
	private Boolean qualifying = false;

	@JsonProperty("fiAttributes")
	@Valid
	private List<FiAttribute> fiAttributes = null;

	public int getBalanceId() {
		return balanceId;
	}

	public void setBalanceId(int balanceId) {
		this.balanceId = balanceId;
	}

	public RewardBalance name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Name used to denominate the balance
	 * 
	 * @return name
	 */
	@ApiModelProperty(value = "Name used to denominate the balance")

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public RewardBalance type(RewardType type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 */
	@ApiModelProperty(value = "")

	@Valid

	public RewardType getType() {
		return type;
	}

	public void setType(RewardType type) {
		this.type = type;
	}

	public RewardBalance balance(BigDecimal balance) {
		this.balance = balance;
		return this;
	}

	/**
	 * Total units available for redemption at time of download
	 * 
	 * @return balance
	 */
	@ApiModelProperty(value = "Total units available for redemption at time of download")

	@Valid

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public RewardBalance accruedYtd(BigDecimal accruedYtd) {
		this.accruedYtd = accruedYtd;
		return this;
	}

	/**
	 * Total units accrued in the current program year at time of download minimum:
	 * 0
	 * 
	 * @return accruedYtd
	 */
	@ApiModelProperty(value = "Total units accrued in the current program year at time of download")

	@Valid
	@DecimalMin("0")
	public BigDecimal getAccruedYtd() {
		return accruedYtd;
	}

	public void setAccruedYtd(BigDecimal accruedYtd) {
		this.accruedYtd = accruedYtd;
	}

	public RewardBalance redeemedYtd(BigDecimal redeemedYtd) {
		this.redeemedYtd = redeemedYtd;
		return this;
	}

	/**
	 * Total units redeemed in the current program year at time of download minimum:
	 * 0
	 * 
	 * @return redeemedYtd
	 */
	@ApiModelProperty(value = "Total units redeemed in the current program year at time of download")

	@Valid
	@DecimalMin("0")
	public BigDecimal getRedeemedYtd() {
		return redeemedYtd;
	}

	public void setRedeemedYtd(BigDecimal redeemedYtd) {
		this.redeemedYtd = redeemedYtd;
	}

	public RewardBalance qualifying(Boolean qualifying) {
		this.qualifying = qualifying;
		return this;
	}

	/**
	 * Balance used for qualifying purposes
	 * 
	 * @return qualifying
	 */
	@ApiModelProperty(value = "Balance used for qualifying purposes")

	public Boolean getQualifying() {
		return qualifying;
	}

	public void setQualifying(Boolean qualifying) {
		this.qualifying = qualifying;
	}

	public RewardBalance fiAttributes(List<FiAttribute> fiAttributes) {
		this.fiAttributes = fiAttributes;
		return this;
	}

	public RewardBalance addFiAttributesItem(FiAttribute fiAttributesItem) {
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
		RewardBalance rewardBalance = (RewardBalance) o;
		return Objects.equals(this.name, rewardBalance.name) && Objects.equals(this.type, rewardBalance.type)
				&& Objects.equals(this.balance, rewardBalance.balance)
				&& Objects.equals(this.accruedYtd, rewardBalance.accruedYtd)
				&& Objects.equals(this.redeemedYtd, rewardBalance.redeemedYtd)
				&& Objects.equals(this.qualifying, rewardBalance.qualifying)
				&& Objects.equals(this.fiAttributes, rewardBalance.fiAttributes);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, type, balance, accruedYtd, redeemedYtd, qualifying, fiAttributes);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RewardBalance {\n");

		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
		sb.append("    accruedYtd: ").append(toIndentedString(accruedYtd)).append("\n");
		sb.append("    redeemedYtd: ").append(toIndentedString(redeemedYtd)).append("\n");
		sb.append("    qualifying: ").append(toIndentedString(qualifying)).append("\n");
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

	private static final Logger log = LoggerFactory.getLogger(RewardBalance.class);

	public RewardBalance getRewardBalance(int balanceId) throws FDXException {
		try {
			template = ConnectionConfigApi46.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("balanceId", balanceId);
			RewardBalance rewardBalanceResponse;
			try {
				rewardBalanceResponse = template.queryForObject(
						"select * from "+ DeveloperContext.getDeveloperSchema() +".rewardbalance where balanceId in (:balanceId)", parameters,
						new RewardBalanceRowMapper());
			} catch (EmptyResultDataAccessException e) {
				throw new FDXException("Reward Balance not found", 0);
			}
			// FIAttributes start
			if (rewardBalanceResponse.getFiAttributes() != null) {
				List<FiAttribute> fiAttrList = rewardBalanceResponse.getFiAttributes();
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
				rewardBalanceResponse.setFiAttributes(fiAttrListNew);
			}
			return rewardBalanceResponse;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("RewardBalance : ", e);
			throw new FDXException(e, FdxConstants.HTTP_ERROR_CODE_500);
		}
	}
}
