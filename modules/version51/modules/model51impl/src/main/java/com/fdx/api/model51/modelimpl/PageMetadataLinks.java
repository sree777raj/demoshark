package com.fdx.api.model51.modelimpl;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Resource URLs for retrieving next or previous datasets
 */
@ApiModel(description = "Resource URLs for retrieving next or previous datasets")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
//@Component
public class PageMetadataLinks   {
  @JsonProperty("next")
  private HateoasLink next;

  @JsonProperty("prev")
  private HateoasLink prev;

  public PageMetadataLinks next(HateoasLink next) {
    this.next = next;
    return this;
  }

  /**
   * Get next
   * @return next
  */
  @ApiModelProperty(value = "")

  @Valid

  public HateoasLink getNext() {
    return next;
  }

  public void setNext(HateoasLink next) {
    this.next = next;
  }

  public PageMetadataLinks prev(HateoasLink prev) {
    this.prev = prev;
    return this;
  }

  /**
   * Get prev
   * @return prev
  */
  @ApiModelProperty(value = "")

  @Valid

  public HateoasLink getPrev() {
    return prev;
  }

  public void setPrev(HateoasLink prev) {
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
    PageMetadataLinks pageMetadataLinks = (PageMetadataLinks) o;
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

