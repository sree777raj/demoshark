package com.fdx.api.model46.modelimpl;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * SynchronizableArrayLinksAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class SynchronizableArrayLinksAllOf   {
  @JsonProperty("updates")
  private HateoasLink updates;

  public SynchronizableArrayLinksAllOf updates(HateoasLink updates) {
    this.updates = updates;
    return this;
  }

  /**
   * Get updates
   * @return updates
  */
  @ApiModelProperty(value = "")

  @Valid

  public HateoasLink getUpdates() {
    return updates;
  }

  public void setUpdates(HateoasLink updates) {
    this.updates = updates;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SynchronizableArrayLinksAllOf synchronizableArrayLinksAllOf = (SynchronizableArrayLinksAllOf) o;
    return Objects.equals(this.updates, synchronizableArrayLinksAllOf.updates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SynchronizableArrayLinksAllOf {\n");
    
    sb.append("    updates: ").append(toIndentedString(updates)).append("\n");
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

