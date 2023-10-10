package com.fdx.api.model46.modelimpl;

import java.util.Objects;

import javax.validation.Valid;

import com.fdx.common.exception.FDXException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Link to the account
 */
@ApiModel(description = "Link to the account")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class CustomerToAccountRelationshipLinks {

	NamedParameterJdbcTemplate template;

	@JsonProperty("account")
	private HateoasLink account;

	public CustomerToAccountRelationshipLinks account(HateoasLink account) {
		this.account = account;
		return this;
	}

	/**
	 * Get account
	 * 
	 * @return account
	 */
	@ApiModelProperty(value = "")

	@Valid

	public HateoasLink getAccount() {
		return account;
	}

	public void setAccount(HateoasLink account) {
		this.account = account;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CustomerToAccountRelationshipLinks customerToAccountRelationshipLinks = (CustomerToAccountRelationshipLinks) o;
		return Objects.equals(this.account, customerToAccountRelationshipLinks.account);
	}

	@Override
	public int hashCode() {
		return Objects.hash(account);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CustomerToAccountRelationshipLinks {\n");

		sb.append("    account: ").append(toIndentedString(account)).append("\n");
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

	private static final Logger log = LoggerFactory.getLogger(CustomerToAccountRelationshipLinks.class);

	public CustomerToAccountRelationshipLinks getLinks(int linksId) throws FDXException {
		CustomerToAccountRelationshipLinks customerToAccountRelationshipLinks = new CustomerToAccountRelationshipLinks();
		try {
			HateoasLink hateoasLink = new HateoasLink();
			hateoasLink = hateoasLink.getHateoasLinks(linksId);
			customerToAccountRelationshipLinks.setAccount(hateoasLink);
			return customerToAccountRelationshipLinks;
		} catch (Exception e) {
			log.error("CustomerToAccountRelationshipLinks : ", e);
			throw new FDXException(e,500);
		}
	}
}
