package com.fdx.api.model51.modelimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

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
import com.fdx.api.model51.mapper.LineItemsLinkRowMapper;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Links (unique to Transaction) used to retrieve images of checks or
 * transaction receipts
 */
@ApiModel(description = "Links (unique to Transaction) used to retrieve images of checks or transaction receipts")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class LineItemLinks {

	NamedParameterJdbcTemplate template;

	@JsonProperty(access = Access.WRITE_ONLY)
	private int lineItemLinkId;

	@JsonProperty("image")
	@Valid
	private List<HateoasLink> image = null;

	public LineItemLinks image(List<HateoasLink> image) {
		this.image = image;
		return this;
	}

	public LineItemLinks addImageItem(HateoasLink imageItem) {
		if (this.image == null) {
			this.image = new ArrayList<>();
		}
		this.image.add(imageItem);
		return this;
	}

	/**
	 * Array of HATEOAS links (unique to transaction) used to retrieve images of
	 * checks or transaction receipts
	 * 
	 * @return image
	 */
	@ApiModelProperty(value = "Array of HATEOAS links (unique to transaction) used to retrieve images of checks or transaction receipts")

	@Valid

	public List<HateoasLink> getImage() {
		return image;
	}

	public void setImage(List<HateoasLink> image) {
		this.image = image;
	}

	public int getLineItemLinkId() {
		return lineItemLinkId;
	}

	public void setLineItemLinkId(int lineItemLinkId) {
		this.lineItemLinkId = lineItemLinkId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		LineItemLinks lineItemLinks = (LineItemLinks) o;
		return Objects.equals(this.image, lineItemLinks.image);
	}

	@Override
	public int hashCode() {
		return Objects.hash(image);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class LineItemLinks {\n");

		sb.append("    image: ").append(toIndentedString(image)).append("\n");
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

	private static final Logger log = LoggerFactory.getLogger(LineItemLinks.class);

	public LineItemLinks getLineItemLinks(int lineItemsLinksId) throws FDXException {
		LineItemLinks lineItemLinks = new LineItemLinks();
		try {
			SqlParameterSource parameters = new MapSqlParameterSource("lineItemsLinksId", lineItemsLinksId);
			template = ConnectionConfigApi51.getTemplate();;
			try {
				lineItemLinks = template.queryForObject(
						"select * from "+ DeveloperContext.getDeveloperSchema() +".lineitemlinks where lineItemsLinksId in (:lineItemsLinksId)", parameters,
						new LineItemsLinkRowMapper());
			} catch (EmptyResultDataAccessException e) {
				throw new FDXException("Line Item Links not found", 0);
			}
			List<HateoasLink> hateoasLinksListNew = new ArrayList<>();
			List<HateoasLink> hateoasLinksList = lineItemLinks.getImage();
			for (HateoasLink hateoasLinkIterator : hateoasLinksList) {
				HateoasLink hateoasLinkNew = hateoasLinkIterator
						.getHateoasLinks(hateoasLinkIterator.getHateoasLinkId());
				hateoasLinksListNew.add(hateoasLinkNew);
			}
			lineItemLinks.setImage(hateoasLinksListNew);
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("LineItemLinks : ", e);
			throw new FDXException(e,500);
		}
		return lineItemLinks;
	}
}
