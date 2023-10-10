package com.fdx.api.model46.modelimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Links (unique to this transaction) used to retrieve images of checks or
 * transaction receipts
 */
@ApiModel(description = "Links (unique to this transaction) used to retrieve images of checks or transaction receipts")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class TransactionLinks {

	@JsonProperty("linkId")
	private String linkId;

	@JsonProperty("image")
	@Valid
	private List<HateoasLink> image = null;

	public TransactionLinks image(List<HateoasLink> image) {
		this.image = image;
		return this;
	}

	public TransactionLinks addImageItem(HateoasLink imageItem) {
		if (this.image == null) {
			this.image = new ArrayList<>();
		}
		this.image.add(imageItem);
		return this;
	}

	/**
	 * Array of HATEOAS links used to retrieve images of checks or transaction
	 * receipts
	 * 
	 * @return image
	 */

	public String getLinkId() {
		return linkId;
	}

	public void setLinkId(String linkId) {
		this.linkId = linkId;
	}

	@ApiModelProperty(value = "Array of HATEOAS links used to retrieve images of checks or transaction receipts")

	@Valid

	public List<HateoasLink> getImage() {
		return image;
	}

	public void setImage(List<HateoasLink> image) {
		this.image = image;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		TransactionLinks transactionLinks = (TransactionLinks) o;
		return Objects.equals(this.image, transactionLinks.image);
	}

	@Override
	public int hashCode() {
		return Objects.hash(image);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TransactionLinks {\n");

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

	public HateoasLink getLinks(HateoasLink hateoasLink) throws Exception {
		HateoasLink hateoasLinkResponse = hateoasLink.getHateoasLinks(hateoasLink.getHateoasLinkId());

		return hateoasLinkResponse;
	}
}
