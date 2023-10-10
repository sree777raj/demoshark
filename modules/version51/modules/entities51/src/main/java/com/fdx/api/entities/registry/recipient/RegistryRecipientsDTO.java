package com.fdx.api.entities.registry.recipient;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fdx.api.entities.common.PageMetadataDTO;
import com.fdx.api.entities.common.PageMetadataLinksDTO;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Record of Registry Recipients at the Ecosystem Registry in snake case to match IETF RFC 7591 naming formats
 */

@Schema(name = "Recipients", description = "Record of Registry Recipients at the Ecosystem Registry in snake case to match IETF RFC 7591 naming formats")
public class RegistryRecipientsDTO {
  @JsonProperty("page")
  private PageMetadataDTO page;

  @JsonProperty("links")
  private PageMetadataLinksDTO links;

  @JsonProperty("recipients")
  @Valid
  private List<RegistryRecipientDTO> recipients = new ArrayList<>();

  public RegistryRecipientsDTO page(PageMetadataDTO page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   *
   * @return page
   */
  @Valid
  @Schema(name = "page", required = false)
  public PageMetadataDTO getPage() {
    return page;
  }

  public void setPage(PageMetadataDTO page) {
    this.page = page;
  }

  public RegistryRecipientsDTO links(PageMetadataLinksDTO links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   *
   * @return links
   */
  @Valid
  @Schema(name = "links", required = false)
  public PageMetadataLinksDTO getLinks() {
    return links;
  }

  public void setLinks(PageMetadataLinksDTO links) {
    this.links = links;
  }

  public RegistryRecipientsDTO recipients(List<RegistryRecipientDTO> recipients) {
    this.recipients = recipients;
    return this;
  }

  public RegistryRecipientsDTO addRecipientsItem(RegistryRecipientDTO recipientsItem) {
    this.recipients.add(recipientsItem);
    return this;
  }

  /**
   * Recipients retrieved by the operation
   *
   * @return recipients
   */
  @NotNull
  @Valid
  @Schema(name = "recipients", description = "Recipients retrieved by the operation", required = true)
  public List<RegistryRecipientDTO> getRecipients() {
    return recipients;
  }

  public void setRecipients(List<RegistryRecipientDTO> recipients) {
    this.recipients = recipients;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegistryRecipientsDTO recipientsDTO = (RegistryRecipientsDTO) o;
    return Objects.equals(this.page, recipientsDTO.page) &&
        Objects.equals(this.links, recipientsDTO.links) &&
        Objects.equals(this.recipients, recipientsDTO.recipients);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, links, recipients);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Recipients {\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
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
