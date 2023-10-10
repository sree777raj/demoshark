package com.fdx.api.entities.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Offset IDs for paginated result sets
 */

@Schema(name = "PageMetadata", description = "Offset IDs for paginated result sets")
public class PageMetadataDTO {

  @JsonProperty("nextOffset")
  private String nextOffset;

  @JsonProperty("prevOffset")
  private String prevOffset;

  @JsonProperty("totalElements")
  private Integer totalElements;

  public PageMetadataDTO nextOffset(String nextOffset) {
    this.nextOffset = nextOffset;
    return this;
  }

  /**
   * Opaque identifier. Does not need to be numeric or have any specific pattern. Implementation specific
   *
   * @return nextOffset
   */

  @Schema(name = "nextOffset", example = "2", description = "Opaque identifier. Does not need to be numeric or have any specific pattern. Implementation specific", required = false)
  public String getNextOffset() {
    return nextOffset;
  }

  public void setNextOffset(String nextOffset) {
    this.nextOffset = nextOffset;
  }

  public PageMetadataDTO prevOffset(String prevOffset) {
    this.prevOffset = prevOffset;
    return this;
  }

  /**
   * Opaque identifier. Does not need to be numeric or have any specific pattern. Implementation specific
   *
   * @return prevOffset
   */

  @Schema(name = "prevOffset", example = "1", description = "Opaque identifier. Does not need to be numeric or have any specific pattern. Implementation specific", required = false)
  public String getPrevOffset() {
    return prevOffset;
  }

  public void setPrevOffset(String prevOffset) {
    this.prevOffset = prevOffset;
  }

  public PageMetadataDTO totalElements(Integer totalElements) {
    this.totalElements = totalElements;
    return this;
  }

  /**
   * Total number of elements
   *
   * @return totalElements
   */

  @Schema(name = "totalElements", example = "3", description = "Total number of elements", required = false)
  public Integer getTotalElements() {
    return totalElements;
  }

  public void setTotalElements(Integer totalElements) {
    this.totalElements = totalElements;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageMetadataDTO pageMetadata = (PageMetadataDTO) o;
    return Objects.equals(this.nextOffset, pageMetadata.nextOffset) &&
        Objects.equals(this.prevOffset, pageMetadata.prevOffset) &&
        Objects.equals(this.totalElements, pageMetadata.totalElements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextOffset, prevOffset, totalElements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageMetadata {\n");
    sb.append("    nextOffset: ").append(toIndentedString(nextOffset)).append("\n");
    sb.append("    prevOffset: ").append(toIndentedString(prevOffset)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
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
