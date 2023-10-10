package com.fdx.api.model51.modelimpl;

import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fdx.api.model51.config.ConnectionConfigApi51;
import com.fdx.api.model51.mapper.AccountHolderRowMapper;

import io.swagger.annotations.ApiModel;

/**
 * Extends &#x60;Customer&#x60; and adds a &#x60;relationship&#x60; field to
 * define the customer&#39;s relationship with an account
 */
@ApiModel(description = "Extends `Customer` and adds a `relationship` field to define the customer's relationship with an account")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class AccountHolder {

	NamedParameterJdbcTemplate template;

	@JsonIgnore
	private String customerId;

	@JsonUnwrapped
	private Customer customer;

	@JsonIgnore
	private int holderId;

	@JsonProperty("relationship")
	private AccountHolderRelationship relationship;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public int getHolderId() {
		return holderId;
	}

	public void setHolderId(int holderId) {
		this.holderId = holderId;
	}

	public AccountHolderRelationship getRelationship() {
		return relationship;
	}

	public void setRelationship(AccountHolderRelationship relationship) {
		this.relationship = relationship;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customer == null) ? 0 : customer.hashCode());
		result = prime * result + ((customerId == null) ? 0 : customerId.hashCode());
		result = prime * result + holderId;
		result = prime * result + ((relationship == null) ? 0 : relationship.hashCode());
		result = prime * result + ((template == null) ? 0 : template.hashCode());
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
		AccountHolder other = (AccountHolder) obj;
		if (customer == null) {
			if (other.customer != null)
				return false;
		} else if (!customer.equals(other.customer))
			return false;
		if (customerId == null) {
			if (other.customerId != null)
				return false;
		} else if (!customerId.equals(other.customerId))
			return false;
		if (holderId != other.holderId)
			return false;
		if (relationship != other.relationship)
			return false;
		if (template == null) {
			if (other.template != null)
				return false;
		} else if (!template.equals(other.template))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AccountHolder [template=" + template + ", customerId=" + customerId + ", customer=" + customer
				+ ", holderId=" + holderId + ", relationship=" + relationship + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(AccountHolder.class);

	public AccountHolder getAccountHoldersList(int holderId) throws Exception {
		try {
			template = ConnectionConfigApi51.getTemplate();
			SqlParameterSource parameters = new MapSqlParameterSource("holderId", holderId);
			AccountHolder accountHolder = new AccountHolder();
			AccountHolder accountHolderResponse;
			try {
				accountHolderResponse = template.queryForObject(
						"select * from "+ DeveloperContext.getDeveloperSchema() +".accountHolder where holderId in (:holderId)", parameters,
						new AccountHolderRowMapper());
			} catch (EmptyResultDataAccessException e) {
				throw new FDXException("Account Holder not found", 0);
			}
			Customer customer = new Customer();
			if (accountHolderResponse.getCustomer() != null) {
				customer = customer.getCustomerDetails(accountHolderResponse.getCustomer().getCustomerId());
				accountHolder.setCustomer(customer);
			}
			accountHolder.setRelationship(accountHolderResponse.getRelationship());
			return accountHolder;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("AccountHolder : ", e);
			throw new FDXException(e,500);
		}
	}
}
