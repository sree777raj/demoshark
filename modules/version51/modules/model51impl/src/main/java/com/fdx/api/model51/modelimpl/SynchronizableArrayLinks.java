package com.fdx.api.model51.modelimpl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;

import io.swagger.annotations.ApiModel;

/**
 * Resource URLs for retrieving changes, next or previous datasets
 */
@ApiModel(description = "Resource URLs for retrieving changes, next or previous datasets")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class SynchronizableArrayLinks {

	@JsonUnwrapped
	private PageMetadataLinks pageMetadataLinks;

	@JsonProperty("updates")
	private HateoasLink updates;

	public PageMetadataLinks getPageMetadataLinks() {
		return pageMetadataLinks;
	}

	public void setPageMetadataLinks(PageMetadataLinks pageMetadataLinks) {
		this.pageMetadataLinks = pageMetadataLinks;
	}

	public HateoasLink getUpdates() {
		return updates;
	}

	public void setUpdates(HateoasLink updates) {
		this.updates = updates;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pageMetadataLinks == null) ? 0 : pageMetadataLinks.hashCode());
		result = prime * result + ((updates == null) ? 0 : updates.hashCode());
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
		SynchronizableArrayLinks other = (SynchronizableArrayLinks) obj;
		if (pageMetadataLinks == null) {
			if (other.pageMetadataLinks != null)
				return false;
		} else if (!pageMetadataLinks.equals(other.pageMetadataLinks))
			return false;
		if (updates == null) {
			if (other.updates != null)
				return false;
		} else if (!updates.equals(other.updates))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SynchronizableArrayLinks [pageMetadataLinks=" + pageMetadataLinks + ", updates=" + updates + "]";
	}

}
