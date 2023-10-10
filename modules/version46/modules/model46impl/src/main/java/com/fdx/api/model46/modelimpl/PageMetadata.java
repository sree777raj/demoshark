package com.fdx.api.model46.modelimpl;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Offset IDs for paginated result sets
 */
@ApiModel(description = "Offset IDs for paginated result sets")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
//@Component
public class PageMetadata   {
  @JsonProperty("nextOffset")
  private String nextOffset;

  @JsonProperty("prevOffset")
  private String prevOffset;

  @JsonProperty("totalElements")
  private Integer totalElements;

  public PageMetadata nextOffset(String nextOffset) {
    this.nextOffset = nextOffset;
    return this;
  }

  /**
   * Opaque identifier. Does not need to be numeric or have any specific pattern. Implementation specific
   * @return nextOffset
  */
  @ApiModelProperty(example = "2", value = "Opaque identifier. Does not need to be numeric or have any specific pattern. Implementation specific")


  public String getNextOffset() {
    return nextOffset;
  }

  public void setNextOffset(String nextOffset) {
    this.nextOffset = nextOffset;
  }

  public PageMetadata prevOffset(String prevOffset) {
    this.prevOffset = prevOffset;
    return this;
  }

  /**
   * Opaque identifier. Does not need to be numeric or have any specific pattern. Implementation specific
   * @return prevOffset
  */
  @ApiModelProperty(example = "1", value = "Opaque identifier. Does not need to be numeric or have any specific pattern. Implementation specific")


  public String getPrevOffset() {
    return prevOffset;
  }

  public void setPrevOffset(String prevOffset) {
    this.prevOffset = prevOffset;
  }

  public PageMetadata totalElements(Integer totalElements) {
    this.totalElements = totalElements;
    return this;
  }

  /**
   * Total number of elements
   * @return totalElements
  */
  @ApiModelProperty(example = "3", value = "Total number of elements")


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
    PageMetadata pageMetadata = (PageMetadata) o;
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

