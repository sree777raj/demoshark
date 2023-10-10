package com.fdx.api.model46.modelimpl;

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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fdx.api.model46.config.ConnectionConfigApi46;
import com.fdx.api.model46.mapper.CustomerToAccountRelationshipRowMapper;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Describes an account related to a customer
 */
@ApiModel(description = "Describes an account related to a customer")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class CustomerToAccountRelationship {

	NamedParameterJdbcTemplate template;

	@JsonIgnore
	private int accountSequenceId;

	@JsonIgnore
	public int getAccountSequenceId() {
		return accountSequenceId;
	}

	@JsonIgnore
	public void setAccountSequenceId(int accountSequenceId) {
		this.accountSequenceId = accountSequenceId;
	}

	@JsonProperty("accountId")
	private String accountId;

	@JsonIgnore
	private int linksId;

	@JsonProperty("links")
	private CustomerToAccountRelationshipLinks links;

	@JsonProperty("relationship")
	private AccountHolderRelationship relationship;

	public CustomerToAccountRelationship accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	public int getLinksId() {
		return linksId;
	}

	public void setLinksId(int linksId) {
		this.linksId = linksId;
	}

	/**
	 * Value for a unique identifier
	 * 
	 * @return accountId
	 */
	@ApiModelProperty(value = "Value for a unique identifier")

	@Size(max = 256)
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public CustomerToAccountRelationship links(CustomerToAccountRelationshipLinks links) {
		this.links = links;
		return this;
	}

	/**
	 * Get links
	 * 
	 * @return links
	 */
	@ApiModelProperty(value = "")

	@Valid

	public CustomerToAccountRelationshipLinks getLinks() {
		return links;
	}

	public void setLinks(CustomerToAccountRelationshipLinks links) {
		this.links = links;
	}

	public CustomerToAccountRelationship relationship(AccountHolderRelationship relationship) {
		this.relationship = relationship;
		return this;
	}

	/**
	 * Get relationship
	 * 
	 * @return relationship
	 */
	@ApiModelProperty(value = "")

	@Valid

	public AccountHolderRelationship getRelationship() {
		return relationship;
	}

	public void setRelationship(AccountHolderRelationship relationship) {
		this.relationship = relationship;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CustomerToAccountRelationship customerToAccountRelationship = (CustomerToAccountRelationship) o;
		return Objects.equals(this.accountId, customerToAccountRelationship.accountId)
				&& Objects.equals(this.links, customerToAccountRelationship.links)
				&& Objects.equals(this.relationship, customerToAccountRelationship.relationship);
	}

	@Override
	public int hashCode() {
		return Objects.hash(accountId, links, relationship);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CustomerToAccountRelationship {\n");

		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    links: ").append(toIndentedString(links)).append("\n");
		sb.append("    relationship: ").append(toIndentedString(relationship)).append("\n");
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

	private static final Logger log = LoggerFactory.getLogger(CustomerToAccountRelationship.class);

	public CustomerToAccountRelationship getCustomerToAccountRelationShip(int accountSequenceId) throws FDXException {
		try {
			template = ConnectionConfigApi46.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("accountSequenceId", accountSequenceId);
			CustomerToAccountRelationship customerToAccountRelationship = new CustomerToAccountRelationship();
			CustomerToAccountRelationship customerToAccountRelationshipResponse;
			try {
				customerToAccountRelationshipResponse = template.queryForObject(
						"select * from "+ DeveloperContext.getDeveloperSchema() +".customertoaccountrelationship where accountsequenceid in (:accountSequenceId	)",
						parameters, new CustomerToAccountRelationshipRowMapper());
			} catch (EmptyResultDataAccessException e) {
				throw new FDXException("Customer To Account Relationship not found", 0);
			}
			CustomerToAccountRelationshipLinks customerToAccountRelationshipLinks = new CustomerToAccountRelationshipLinks();
			customerToAccountRelationship.setAccountId(customerToAccountRelationshipResponse.getAccountId());
			customerToAccountRelationship.setRelationship(customerToAccountRelationshipResponse.getRelationship());
			if (customerToAccountRelationshipResponse.getLinksId() != 0) {
				customerToAccountRelationshipLinks = customerToAccountRelationshipLinks
						.getLinks(customerToAccountRelationshipResponse.getLinksId());
				customerToAccountRelationship.setLinks(customerToAccountRelationshipLinks);
			}
			return customerToAccountRelationship;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("CustomerToAccountRelationship : ", e);
			throw new FDXException(e,500);
		}
	}
}
