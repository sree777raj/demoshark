package com.fdx.api.model46.modelimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fdx.api.model46.config.ConnectionConfigApi46;
import com.fdx.api.model46.mapper.AccountPaymentNetworkRowMapper;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * This provides details required to execute a transaction against the account
 * within the payment network
 */
@ApiModel(description = "This provides details required to execute a transaction against the account within the payment network")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class AccountPaymentNetwork {

	NamedParameterJdbcTemplate template;

	@JsonProperty("bankId")
	private String bankId;

	@JsonProperty("identifier")
	private String identifier;

	@JsonProperty("identifierType")
	private PaymentNetworkIdentifierType identifierType;

	@JsonProperty("type")
	private PaymentNetworkType type;

	@JsonProperty("transferIn")
	@JsonInclude(Include.NON_NULL)
	private Boolean transferIn;

	@JsonProperty("transferOut")
	@JsonInclude(Include.NON_NULL)
	private Boolean transferOut;

	public AccountPaymentNetwork bankId(String bankId) {
		this.bankId = bankId;
		return this;
	}

	/**
	 * Bank identifier used by the payment network ie. Routing Number
	 * 
	 * @return bankId
	 */
	@ApiModelProperty(value = "Bank identifier used by the payment network ie. Routing Number")

	public String getBankId() {
		return bankId;
	}

	public void setBankId(String bankId) {
		this.bankId = bankId;
	}

	public AccountPaymentNetwork identifier(String identifier) {
		this.identifier = identifier;
		return this;
	}

	/**
	 * The number used to identify the account within the payment network. If
	 * identifierType is ACCOUNT_NUMBER, this is the account number; if
	 * identifierType is TOKENIZED_ACCOUNT_NUMBER, this is a tokenized account
	 * number
	 * 
	 * @return identifier
	 */
	@ApiModelProperty(value = "The number used to identify the account within the payment network. If identifierType is ACCOUNT_NUMBER, this is the account number; if identifierType is TOKENIZED_ACCOUNT_NUMBER, this is a tokenized account number")

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public AccountPaymentNetwork identifierType(PaymentNetworkIdentifierType identifierType) {
		this.identifierType = identifierType;
		return this;
	}

	/**
	 * Get identifierType
	 * 
	 * @return identifierType
	 */
	@ApiModelProperty(value = "")

	@Valid

	public PaymentNetworkIdentifierType getIdentifierType() {
		return identifierType;
	}

	public void setIdentifierType(PaymentNetworkIdentifierType identifierType) {
		this.identifierType = identifierType;
	}

	public AccountPaymentNetwork type(PaymentNetworkType type) {
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

	public PaymentNetworkType getType() {
		return type;
	}

	public void setType(PaymentNetworkType type) {
		this.type = type;
	}

	public AccountPaymentNetwork transferIn(Boolean transferIn) {
		this.transferIn = transferIn;
		return this;
	}

	/**
	 * Can transfer funds to the account using this information
	 * 
	 * @return transferIn
	 */
	@ApiModelProperty(value = "Can transfer funds to the account using this information")

	public Boolean getTransferIn() {
		return transferIn;
	}

	public void setTransferIn(Boolean transferIn) {
		this.transferIn = transferIn;
	}

	public AccountPaymentNetwork transferOut(Boolean transferOut) {
		this.transferOut = transferOut;
		return this;
	}

	/**
	 * Can transfer funds from the account using this information
	 * 
	 * @return transferOut
	 */
	@ApiModelProperty(value = "Can transfer funds from the account using this information")

	public Boolean getTransferOut() {
		return transferOut;
	}

	public void setTransferOut(Boolean transferOut) {
		this.transferOut = transferOut;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AccountPaymentNetwork accountPaymentNetwork = (AccountPaymentNetwork) o;
		return Objects.equals(this.bankId, accountPaymentNetwork.bankId)
				&& Objects.equals(this.identifier, accountPaymentNetwork.identifier)
				&& Objects.equals(this.identifierType, accountPaymentNetwork.identifierType)
				&& Objects.equals(this.type, accountPaymentNetwork.type)
				&& Objects.equals(this.transferIn, accountPaymentNetwork.transferIn)
				&& Objects.equals(this.transferOut, accountPaymentNetwork.transferOut);
	}

	@Override
	public int hashCode() {
		return Objects.hash(bankId, identifier, identifierType, type, transferIn, transferOut);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AccountPaymentNetwork {\n");

		sb.append("    bankId: ").append(toIndentedString(bankId)).append("\n");
		sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
		sb.append("    identifierType: ").append(toIndentedString(identifierType)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    transferIn: ").append(toIndentedString(transferIn)).append("\n");
		sb.append("    transferOut: ").append(toIndentedString(transferOut)).append("\n");
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

	private static final Logger log = LoggerFactory.getLogger(AccountPaymentNetwork.class);

	public List<AccountPaymentNetwork> getAccountPaymentNetworkList(String accountId, String offset, Integer limit) throws Exception {
		try {
			List<AccountPaymentNetwork> accountPaymentNetworkList = new ArrayList<>();
			AccountPaymentNetwork accountPaymentNetwork = new AccountPaymentNetwork();

			SqlParameterSource parameters = new MapSqlParameterSource("accountId", accountId);
			template = ConnectionConfigApi46.getTemplate();

			accountPaymentNetworkList = template.query(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".accountPaymentNetwork  where accountId= (:accountId) limit " + limit + " offset " + offset, parameters,
					new AccountPaymentNetworkRowMapper());
			if (accountPaymentNetworkList.isEmpty())
				throw new FDXException(901);

			return accountPaymentNetworkList;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("AccountPaymentNetwork : ", e);
			throw new FDXException(e,500);
		}
	}

	public int getCount(String accountId) throws FDXException {

		int accountPaymentNetworkListCount;

		SqlParameterSource parameters = new MapSqlParameterSource("accountId", accountId);
		template = ConnectionConfigApi46.getTemplate();
		try {

			accountPaymentNetworkListCount = template.queryForObject(
					"select count(*) from "+ DeveloperContext.getDeveloperSchema() +".accountPaymentNetwork  where accountId= (:accountId)", parameters,
					Integer.class);

		} catch (Exception e) {
			log.error("AccountPaymentNetwork : ", e);
			throw new FDXException(e,500);
		}
		return accountPaymentNetworkListCount;
	}
}
