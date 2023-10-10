package com.fdx.api.model51.modelimpl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import com.fdx.api.model51.config.ConnectionConfigApi51;
import com.fdx.api.model51.mapper.LineItemRowMapper;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A line item within a transaction
 */
@ApiModel(description = "A line item within a transaction")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class LineItem {

	NamedParameterJdbcTemplate template;

	@JsonProperty(access = Access.WRITE_ONLY)
	private int lineItemId;

	@JsonProperty("description")
	private String description;

	@JsonProperty("amount")
	private BigDecimal amount;

	@JsonProperty("checkNumber")
	private Integer checkNumber;

	@JsonProperty("memo")
	private String memo;

	@JsonProperty("reference")
	private String reference;

	@JsonProperty("imageIds")
	@Valid
	private List<String> imageIds = null;

	@JsonProperty("links")
	private LineItemLinks links;

	public LineItem description(String description) {
		this.description = description;
		return this;
	}

	public int getLineItemId() {
		return lineItemId;
	}

	public void setLineItemId(int lineItemId) {
		this.lineItemId = lineItemId;
	}

	/**
	 * The description of the line item
	 * 
	 * @return description
	 */
	@ApiModelProperty(value = "The description of the line item")

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LineItem amount(BigDecimal amount) {
		this.amount = amount;
		return this;
	}

	/**
	 * The amount of money attributable to this line item
	 * 
	 * @return amount
	 */
	@ApiModelProperty(value = "The amount of money attributable to this line item")

	@Valid

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public LineItem checkNumber(Integer checkNumber) {
		this.checkNumber = checkNumber;
		return this;
	}

	/**
	 * Check number
	 * 
	 * @return checkNumber
	 */
	@ApiModelProperty(value = "Check number")

	public Integer getCheckNumber() {
		return checkNumber;
	}

	public void setCheckNumber(Integer checkNumber) {
		this.checkNumber = checkNumber;
	}

	public LineItem memo(String memo) {
		this.memo = memo;
		return this;
	}

	/**
	 * String of maximum length 255
	 * 
	 * @return memo
	 */
	@ApiModelProperty(value = "String of maximum length 255")

	@Size(max = 255)
	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public LineItem reference(String reference) {
		this.reference = reference;
		return this;
	}

	/**
	 * A reference number
	 * 
	 * @return reference
	 */
	@ApiModelProperty(value = "A reference number")

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public LineItem imageIds(List<String> imageIds) {
		this.imageIds = imageIds;
		return this;
	}

	public LineItem addImageIdsItem(String imageIdsItem) {
		if (this.imageIds == null) {
			this.imageIds = new ArrayList<>();
		}
		this.imageIds.add(imageIdsItem);
		return this;
	}

	/**
	 * Array of image identifiers (unique to transaction) used to retrieve images of
	 * check or transaction receipt
	 * 
	 * @return imageIds
	 */
	@ApiModelProperty(value = "Array of image identifiers (unique to transaction) used to retrieve images of check or transaction receipt")

	public List<String> getImageIds() {
		return imageIds;
	}

	public void setImageIds(List<String> imageIds) {
		this.imageIds = imageIds;
	}

	public LineItem links(LineItemLinks links) {
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

	public LineItemLinks getLinks() {
		return links;
	}

	public void setLinks(LineItemLinks links) {
		this.links = links;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		LineItem lineItem = (LineItem) o;
		return Objects.equals(this.description, lineItem.description) && Objects.equals(this.amount, lineItem.amount)
				&& Objects.equals(this.checkNumber, lineItem.checkNumber) && Objects.equals(this.memo, lineItem.memo)
				&& Objects.equals(this.reference, lineItem.reference)
				&& Objects.equals(this.imageIds, lineItem.imageIds) && Objects.equals(this.links, lineItem.links);
	}

	@Override
	public int hashCode() {
		return Objects.hash(description, amount, checkNumber, memo, reference, imageIds, links);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class LineItem {\n");

		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
		sb.append("    checkNumber: ").append(toIndentedString(checkNumber)).append("\n");
		sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
		sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
		sb.append("    imageIds: ").append(toIndentedString(imageIds)).append("\n");
		sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

	private static final Logger log = LoggerFactory.getLogger(LineItem.class);

	public LineItem getLineItem(int lineitemsid) throws FDXException {
		try {
			template = ConnectionConfigApi51.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("lineitemsid", lineitemsid);
			LineItem lineItem;
			try {
				lineItem = template.queryForObject(
						"select * from "+ DeveloperContext.getDeveloperSchema() +".lineitem where lineitemsid in (:lineitemsid)", parameters,
						new LineItemRowMapper());
			} catch (EmptyResultDataAccessException e) {
				throw new FDXException("Line Item not found", 0);
			}
			LineItemLinks lineItemLinks = lineItem.getLinks();
			LineItemLinks lineItemLinksNew = lineItemLinks.getLineItemLinks(lineItemLinks.getLineItemLinkId());
			lineItem.setLinks(lineItemLinksNew);
			return lineItem;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("LineItem : ", e);
			throw new FDXException(e,500);
		}
	}

}
