package com.fdx.api.entities.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.Valid;
import java.util.Objects;

/**
 * Resource URLs for retrieving next or previous datasets
 */

@Schema(name = "PageMetadataLinks", description = "Resource URLs for retrieving next or previous datasets")
public class PageMetadataLinksDTO {

  @JsonProperty("next")
  private HateoasLinkRequest next;

  @JsonProperty("prev")
  private HateoasLinkRequest prev;

  public PageMetadataLinksDTO next(HateoasLinkRequest next) {
    this.next = next;
    return this;
  }

  /**
   * Get next
   *
   * @return next
   */
  @Valid
  @Schema(name = "next", required = false)
  public HateoasLinkRequest getNext() {
    return next;
  }

  public void setNext(HateoasLinkRequest next) {
    this.next = next;
  }

  public PageMetadataLinksDTO prev(HateoasLinkRequest prev) {
    this.prev = prev;
    return this;
  }

  /**
   * Get prev
   *
   * @return prev
   */
  @Valid
  @Schema(name = "prev", required = false)
  public HateoasLinkRequest getPrev() {
    return prev;
  }

  public void setPrev(HateoasLinkRequest prev) {
    this.prev = prev;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageMetadataLinksDTO pageMetadataLinks = (PageMetadataLinksDTO) o;
    return Objects.equals(this.next, pageMetadataLinks.next) &&
        Objects.equals(this.prev, pageMetadataLinks.prev);
  }

  @Override
  public int hashCode() {
    return Objects.hash(next, prev);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageMetadataLinks {\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    prev: ").append(toIndentedString(prev)).append("\n");
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
}
