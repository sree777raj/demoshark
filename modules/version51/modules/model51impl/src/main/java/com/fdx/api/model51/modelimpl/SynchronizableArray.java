package com.fdx.api.model51.modelimpl;

import java.util.Objects;

import javax.validation.Valid;

import com.fdx.common.exception.FDXException;
import com.fdx.common.util.FdxConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fdx.api.model51.modelimpl.HateoasLink.ActionEnum;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Base class for results that can be synchronized over time. A synchronizable
 * array is also paginated
 */
@ApiModel(description = "Base class for results that can be synchronized over time. A synchronizable array is also paginated")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class SynchronizableArray {

	@JsonProperty("page")
	private PageMetadata page;

	@JsonProperty("updates")
	private UpdatesMetadata updates;

	@JsonProperty("links")
	private SynchronizableArrayLinks links;

	public SynchronizableArray page(PageMetadata page) {
		this.page = page;
		return this;
	}

	/**
	 * Get page
	 * 
	 * @return page
	 */
	@ApiModelProperty(value = "")

	@Valid

	public PageMetadata getPage() {
		return page;
	}

	public void setPage(PageMetadata page) {
		this.page = page;
	}

	public SynchronizableArray updates(UpdatesMetadata updates) {
		this.updates = updates;
		return this;
	}

	/**
	 * Get updates
	 * 
	 * @return updates
	 */
	@ApiModelProperty(value = "")

	@Valid

	public UpdatesMetadata getUpdates() {
		return updates;
	}

	public void setUpdates(UpdatesMetadata updates) {
		this.updates = updates;
	}

	public SynchronizableArray links(SynchronizableArrayLinks links) {
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

	public SynchronizableArrayLinks getLinks() {
		return links;
	}

	public void setLinks(SynchronizableArrayLinks links) {
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
		SynchronizableArray synchronizableArray = (SynchronizableArray) o;
		return Objects.equals(this.page, synchronizableArray.page)
				&& Objects.equals(this.updates, synchronizableArray.updates)
				&& Objects.equals(this.links, synchronizableArray.links);
	}

	@Override
	public int hashCode() {
		return Objects.hash(page, updates, links);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SynchronizableArray {\n");

		sb.append("    page: ").append(toIndentedString(page)).append("\n");
		sb.append("    updates: ").append(toIndentedString(updates)).append("\n");
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

	private static final Logger log = LoggerFactory.getLogger(SynchronizableArray.class);

	public SynchronizableArray getSynchronizablePaginatedResult(String updateEntity, String query, String uriPath,
			int limit, String offset, int count) throws FDXException {

		SynchronizableArray synchronizableArray = new SynchronizableArray();
		PageMetadata pageMetadata = new PageMetadata();
		PageMetadataLinks pageMetadataLinks = new PageMetadataLinks();
		SynchronizableArrayLinks synchronizableArrayLinks = new SynchronizableArrayLinks();
		synchronizableArrayLinks.setPageMetadataLinks(pageMetadataLinks);

		synchronizableArray.setPage(pageMetadata);
		synchronizableArray.setLinks(synchronizableArrayLinks);
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

					synchronizableArrayLinks.getPageMetadataLinks().setNext(hateoasLinkNext);

					HateoasLink hateoasLinkPrev = new HateoasLink();
					hateoasLinkPrev.setAction(ActionEnum.GET);
					if (offsetInt > 0) {
						if (query != null)
							hateoasLinkPrev.setHref(uriPath + "?" + query + "limit=" + limit + "&offset=" + prevOffset);
						else
							hateoasLinkPrev
									.setHref(uriPath + "?limit=" + limit + "&offset=" + pageMetadata.getNextOffset());
						synchronizableArrayLinks.getPageMetadataLinks().setPrev(hateoasLinkPrev);
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
					synchronizableArrayLinks.getPageMetadataLinks().setPrev(hateoasLinkPrev);

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
					synchronizableArrayLinks.getPageMetadataLinks().setPrev(hateoasLinkPrev);

					HateoasLink hateoasLinkNext = new HateoasLink();
					hateoasLinkNext.setAction(ActionEnum.GET);
					if (query != null)
						hateoasLinkNext.setHref(
								uriPath + "?" + query + "limit=" + limit + "&offset=" + pageMetadata.getNextOffset());
					else
						hateoasLinkNext
								.setHref(uriPath + "?limit=" + limit + "&offset=" + pageMetadata.getPrevOffset());

					synchronizableArrayLinks.getPageMetadataLinks().setNext(hateoasLinkNext);
				}
			}
			UpdatesMetadata updatesMetadata = new UpdatesMetadata();
			updatesMetadata = updatesMetadata.getNextUpdateIddetails(updateEntity);

			if (updatesMetadata != null) {
				HateoasLink hateoasLink = new HateoasLink();
				hateoasLink.setHref(uriPath + "?" + "updatedSince=" + updatesMetadata.getNextUpdateId());
				synchronizableArrayLinks.setUpdates(hateoasLink);
				synchronizableArray.setUpdates(updatesMetadata);
				updatesMetadata.updateSequenceId(updateEntity, updatesMetadata);
			}

		pageMetadata.setTotalElements(count);
		synchronizableArray.setPage(pageMetadata);
		synchronizableArray.setLinks(synchronizableArrayLinks);

		return synchronizableArray;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("SynchronizableArray : ", e);
			throw new FDXException(e, FdxConstants.HTTP_ERROR_CODE_500);
		}
	}

}
