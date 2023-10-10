package com.fdx.api.model51.modelimpl;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import javax.validation.Valid;
import javax.validation.constraints.Size;

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
import com.fdx.api.model51.mapper.RewardMemberShipRowMapper;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Details of a single membership in a reward programs
 */
@ApiModel(description = "Details of a single membership in a reward programs")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class RewardMembership {

	NamedParameterJdbcTemplate template;

	@JsonProperty("accountIds")
	@Valid
	private Set<String> accountIds = null;

	@JsonProperty("customerId")
	private String customerId;

	@JsonProperty("memberId")
	private String memberId;

	@JsonIgnore
	private int memberShipId;

	@JsonProperty("memberNumber")
	private String memberNumber;

	@JsonProperty("memberTier")
	private String memberTier;

	@JsonProperty("businessOrConsumer")
	private BusinessOrConsumer businessOrConsumer;

	@JsonProperty("balances")
	@Valid
	private List<RewardBalance> balances = null;

	public RewardMembership accountIds(Set<String> accountIds) {
		this.accountIds = accountIds;
		return this;
	}

	public int getMemberShipId() {
		return memberShipId;
	}

	public void setMemberShipId(int memberShipId) {
		this.memberShipId = memberShipId;
	}

	public RewardMembership addAccountIdsItem(String accountIdsItem) {
		if (this.accountIds == null) {
			this.accountIds = new LinkedHashSet<>();
		}
		this.accountIds.add(accountIdsItem);
		return this;
	}

	/**
	 * accountIds associated to the reward program
	 * 
	 * @return accountIds
	 */
	@ApiModelProperty(value = "accountIds associated to the reward program")

	public Set<String> getAccountIds() {
		return accountIds;
	}

	public void setAccountIds(Set<String> accountIds) {
		this.accountIds = accountIds;
	}

	public RewardMembership customerId(String customerId) {
		this.customerId = customerId;
		return this;
	}

	/**
	 * Value for a unique identifier
	 * 
	 * @return customerId
	 */
	@ApiModelProperty(value = "Value for a unique identifier")

	@Size(max = 256)
	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public RewardMembership memberId(String memberId) {
		this.memberId = memberId;
		return this;
	}

	/**
	 * Value for a unique identifier
	 * 
	 * @return memberId
	 */
	@ApiModelProperty(value = "Value for a unique identifier")

	@Size(max = 256)
	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public RewardMembership memberNumber(String memberNumber) {
		this.memberNumber = memberNumber;
		return this;
	}

	/**
	 * Reward program membership number
	 * 
	 * @return memberNumber
	 */
	@ApiModelProperty(value = "Reward program membership number")

	public String getMemberNumber() {
		return memberNumber;
	}

	public void setMemberNumber(String memberNumber) {
		this.memberNumber = memberNumber;
	}

	public RewardMembership memberTier(String memberTier) {
		this.memberTier = memberTier;
		return this;
	}

	/**
	 * If the reward program is tiered, member's current tier
	 * 
	 * @return memberTier
	 */
	@ApiModelProperty(value = "If the reward program is tiered, member's current tier")

	public String getMemberTier() {
		return memberTier;
	}

	public void setMemberTier(String memberTier) {
		this.memberTier = memberTier;
	}

	public RewardMembership businessOrConsumer(BusinessOrConsumer businessOrConsumer) {
		this.businessOrConsumer = businessOrConsumer;
		return this;
	}

	/**
	 * Get businessOrConsumer
	 * 
	 * @return businessOrConsumer
	 */
	@ApiModelProperty(value = "")

	@Valid

	public BusinessOrConsumer getBusinessOrConsumer() {
		return businessOrConsumer;
	}

	public void setBusinessOrConsumer(BusinessOrConsumer businessOrConsumer) {
		this.businessOrConsumer = businessOrConsumer;
	}

	public RewardMembership balances(List<RewardBalance> balances) {
		this.balances = balances;
		return this;
	}

	public RewardMembership addBalancesItem(RewardBalance balancesItem) {
		if (this.balances == null) {
			this.balances = new ArrayList<>();
		}
		this.balances.add(balancesItem);
		return this;
	}

	public void setBalances(List<RewardBalance> balances) {
		this.balances = balances;
	}

	/**
	 * Array of balances
	 * 
	 * @return balances
	 */
	@ApiModelProperty(value = "Array of balances")

	@Valid
	@Size(min = 1)
	public List<RewardBalance> getBalances() {
		return balances;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		RewardMembership rewardMembership = (RewardMembership) o;
		return Objects.equals(this.accountIds, rewardMembership.accountIds)
				&& Objects.equals(this.customerId, rewardMembership.customerId)
				&& Objects.equals(this.memberId, rewardMembership.memberId)
				&& Objects.equals(this.memberNumber, rewardMembership.memberNumber)
				&& Objects.equals(this.memberTier, rewardMembership.memberTier)
				&& Objects.equals(this.businessOrConsumer, rewardMembership.businessOrConsumer)
				&& Objects.equals(this.balances, rewardMembership.balances);
	}

	@Override
	public int hashCode() {
		return Objects.hash(accountIds, customerId, memberId, memberNumber, memberTier, businessOrConsumer, balances);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RewardMembership {\n");

		sb.append("    accountIds: ").append(toIndentedString(accountIds)).append("\n");
		sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
		sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
		sb.append("    memberNumber: ").append(toIndentedString(memberNumber)).append("\n");
		sb.append("    memberTier: ").append(toIndentedString(memberTier)).append("\n");
		sb.append("    businessOrConsumer: ").append(toIndentedString(businessOrConsumer)).append("\n");
		sb.append("    balances: ").append(toIndentedString(balances)).append("\n");
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

	private static final Logger log = LoggerFactory.getLogger(RewardMembership.class);

	public RewardMembership getRewardMemberShip(int memberShipId) throws FDXException {
		try {
			
			template = ConnectionConfigApi51.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("memberShipId", memberShipId);

			RewardMembership rewardMembershipResponse = template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".rewardmembership where memberShipId in (:memberShipId)", parameters,
					new RewardMemberShipRowMapper());

//			MemberShip Start
			if (rewardMembershipResponse.getBalances() != null) {
				List<RewardBalance> rewardBalanceList = rewardMembershipResponse.getBalances();
				List<RewardBalance> rewardBalanceListNew = new ArrayList<>();

				for (RewardBalance rewardBalanceIterator : rewardBalanceList) {
					RewardBalance rewardBalanceNew = new RewardBalance();
					rewardBalanceNew = rewardBalanceNew.getRewardBalance(rewardBalanceIterator.getBalanceId());
					rewardBalanceListNew.add(rewardBalanceNew);
				}
				rewardMembershipResponse.setBalances(rewardBalanceListNew);
			}
//			MemberShip End

			return rewardMembershipResponse;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("RewardMembership : ", e);
			throw new FDXException(e, FdxConstants.HTTP_ERROR_CODE_500);
		}
	}
}
