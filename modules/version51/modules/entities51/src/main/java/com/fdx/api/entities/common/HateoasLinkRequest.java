package com.fdx.api.entities.common;


import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * REST application constraint (Hypermedia As The Engine Of Application State)
 */

@Schema(name = "HateoasLinkRequest", description = "REST application constraint (Hypermedia As The Engine Of Application State)")
public class HateoasLinkRequest {

  @JsonProperty("href")
  private String href;

  @JsonProperty("action")
  private Action action;

  @JsonProperty("rel")
  private String rel;

  @JsonProperty("types")
  @Valid
  private List<ContentTypes> types = null;

  public HateoasLinkRequest href(String href) {
    this.href = href;
    return this;
  }

  public HateoasLinkRequest() {
  }

  public HateoasLinkRequest(String href, Action action) {
    this.href = href;
    this.action = action;
  }

  /**
   * URL to invoke the action on the resource
   * @return href
  */
  @NotNull 
  @Schema(name = "href", example = "https://api.fi.com/fdx/v4/accounts/12345", description = "URL to invoke the action on the resource", required = true)
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public HateoasLinkRequest action(Action action) {
    this.action = action;
    return this;
  }

  /**
   * HTTP Method to use for the request
   * @return action
  */
  
  @Schema(name = "action", description = "HTTP Method to use for the request", required = false)
  public Action getAction() {
    return action;
  }

  public void setAction(Action action) {
    this.action = action;
  }

  public HateoasLinkRequest rel(String rel) {
    this.rel = rel;
    return this;
  }

  /**
   * Relation of this link to its containing entity, as defined by and with many example relation values at [IETF RFC5988](https://datatracker.ietf.org/doc/html/rfc5988)
   * @return rel
  */
  
  @Schema(name = "rel", description = "Relation of this link to its containing entity, as defined by and with many example relation values at [IETF RFC5988](https://datatracker.ietf.org/doc/html/rfc5988)", required = false)
  public String getRel() {
    return rel;
  }

  public void setRel(String rel) {
    this.rel = rel;
  }

  public HateoasLinkRequest types(List<ContentTypes> types) {
    this.types = types;
    return this;
  }

  public HateoasLinkRequest addTypesItem(ContentTypes typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<>();
    }
    this.types.add(typesItem);
    return this;
  }

  /**
   * Content-types that can be used in the Accept header
   * @return types
  */
  @Valid 
  @Schema(name = "types", description = "Content-types that can be used in the Accept header", required = false)
  public List<ContentTypes> getTypes() {
    return types;
  }

  public void setTypes(List<ContentTypes> types) {
    this.types = types;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HateoasLinkRequest hateoasLinkRequest = (HateoasLinkRequest) o;
    return Objects.equals(this.href, hateoasLinkRequest.href) &&
        Objects.equals(this.action, hateoasLinkRequest.action) &&
        Objects.equals(this.rel, hateoasLinkRequest.rel) &&
        Objects.equals(this.types, hateoasLinkRequest.types);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, action, rel, types);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HateoasLinkRequest {\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    rel: ").append(toIndentedString(rel)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
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

