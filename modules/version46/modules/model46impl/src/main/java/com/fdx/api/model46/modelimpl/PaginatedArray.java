package com.fdx.api.model46.modelimpl;

import java.util.Objects;

import javax.validation.Valid;

import com.fdx.common.exception.FDXException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fdx.api.model46.modelimpl.HateoasLink.ActionEnum;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Base class for results that may be paginated
 */
@ApiModel(description = "Base class for results that may be paginated")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class PaginatedArray {
	@JsonProperty("page")
	private PageMetadata page;

	@JsonProperty("links")
	private PageMetadataLinks links;

	public PaginatedArray page(PageMetadata page) {
		this.page = page;
		return this;
	}

	/**
	 * Get page
	 * 
	 * @return page
	 * @throws Exception 
	 */
	@ApiModelProperty(value = "")

	@Valid

	public PageMetadata getPage(String resultType, String uriPath, int limit, String offset, int count) throws Exception {
		return getPaginatedResult(resultType, uriPath, limit, offset, count).page;
	}

	public void setPage(PageMetadata page) {
		this.page = page;
	}

	public PaginatedArray links(PageMetadataLinks links) {
		this.links = links;
		return this;
	}

	/**
	 * Get links
	 * 
	 * @return links
	 * @throws Exception 
	 */
	@ApiModelProperty(value = "")

	@Valid

	public PageMetadataLinks getLinks(String resultType, String uriPath, int limit, String offset, int count) throws Exception {
		return getPaginatedResult(resultType, uriPath, limit, offset, count).links;
	}

	public void setLinks(PageMetadataLinks links) {
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
		PaginatedArray paginatedArray = (PaginatedArray) o;
		return Objects.equals(this.page, paginatedArray.page) && Objects.equals(this.links, paginatedArray.links);
	}

	@Override
	public int hashCode() {
		return Objects.hash(page, links);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PaginatedArray {\n");

		sb.append("    page: ").append(toIndentedString(page)).append("\n");
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

	private static final Logger log = LoggerFactory.getLogger(PaginatedArray.class);

	public PaginatedArray getPaginatedResult(String query, String uriPath, int limit, String offset, int count) throws FDXException {

		PaginatedArray paginatedArray = new PaginatedArray();
		PageMetadata pageMetadata = new PageMetadata();
		PageMetadataLinks pageMetadataLinks = new PageMetadataLinks();

		paginatedArray.setPage(pageMetadata);
		paginatedArray.setLinks(pageMetadataLinks);
		try {
			int offsetInt = Integer.parseInt(offset);
			if (!(count < limit)) {
				if (offsetInt == 0 || offsetInt - limit < 0) {
					int nextOffSet = offsetInt + limit;
					int prevOffset = 0;

					pageMetadata.setNextOffset(String.valueOf(nextOffSet));
					if (offsetInt > 0)
						pageMetadata.setPrevOffset(String.valueOf(prevOffset));
					else if (nextOffSet < count && offsetInt > 0)
						pageMetadata.setPrevOffset(String.valueOf(offsetInt));
					HateoasLink hateoasLinkNext = new HateoasLink();
					hateoasLinkNext.setAction(ActionEnum.GET);
					if (query != null && query != "")
						hateoasLinkNext.setHref(
								uriPath + "?" + query + "limit=" + limit + "&offset=" + pageMetadata.getNextOffset());
					else
						hateoasLinkNext
								.setHref(uriPath + "?limit=" + limit + "&offset=" + pageMetadata.getNextOffset());

					pageMetadataLinks.setNext(hateoasLinkNext);

					HateoasLink hateoasLinkPrev = new HateoasLink();
					hateoasLinkPrev.setAction(ActionEnum.GET);
					if (offsetInt > 0) {
						if (query != null)
							hateoasLinkPrev.setHref(uriPath + "?" + query + "limit=" + limit + "&offset=" + prevOffset);
						else
							hateoasLinkPrev
									.setHref(uriPath + "?limit=" + limit + "&offset=" + pageMetadata.getNextOffset());
						pageMetadataLinks.setPrev(hateoasLinkPrev);
					}
				} else if (offsetInt + limit >= count) {
					int prevOffSet = Integer.parseInt(offset) - limit;
					pageMetadata.setPrevOffset(String.valueOf(prevOffSet));

					HateoasLink hateoasLinkPrev = new HateoasLink();
					hateoasLinkPrev.setAction(ActionEnum.GET);
					if (query != null)
						hateoasLinkPrev.setHref(
								uriPath + "?" + query + "limit=" + limit + "&offset=" + pageMetadata.getPrevOffset());
					else
						hateoasLinkPrev
								.setHref(uriPath + "?limit=" + limit + "&offset=" + pageMetadata.getPrevOffset());
					pageMetadataLinks.setPrev(hateoasLinkPrev);

				} else {
					int prevOffSet = Integer.parseInt(offset) - limit;
					pageMetadata.setPrevOffset(String.valueOf(prevOffSet));
					int nextOffSet = Integer.parseInt(offset) + limit;
					pageMetadata.setNextOffset(String.valueOf(nextOffSet));

					HateoasLink hateoasLinkPrev = new HateoasLink();
					hateoasLinkPrev.setAction(ActionEnum.GET);
					if (query != null)
						hateoasLinkPrev.setHref(
								uriPath + "?" + query + "limit=" + limit + "&offset=" + pageMetadata.getPrevOffset());
					else
						hateoasLinkPrev
								.setHref(uriPath + "?limit=" + limit + "&offset=" + pageMetadata.getPrevOffset());
					pageMetadataLinks.setPrev(hateoasLinkPrev);

					HateoasLink hateoasLinkNext = new HateoasLink();
					hateoasLinkNext.setAction(ActionEnum.GET);
					if (query != null)
						hateoasLinkNext.setHref(
								uriPath + "?" + query + "limit=" + limit + "&offset=" + pageMetadata.getNextOffset());
					else
						hateoasLinkNext
								.setHref(uriPath + "?limit=" + limit + "&offset=" + pageMetadata.getPrevOffset());

					pageMetadataLinks.setNext(hateoasLinkNext);
				}
			}
			pageMetadata.setTotalElements(count);
			paginatedArray.setPage(pageMetadata);
			paginatedArray.setLinks(pageMetadataLinks);
			return paginatedArray;
		} catch (Exception e) {
			log.error("PaginatedArray : ", e);
			throw new FDXException(e,500);
		}
	}
}
