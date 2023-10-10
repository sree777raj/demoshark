package com.fdx.api.controller.registry;

import com.fdx.api.adapter.service.ServiceAdapterApi;
import com.fdx.api.entities.registry.recipient.RegistryRecipientDTO;
import com.fdx.api.entities.registry.recipient.RegistryRecipientsDTO;
import com.fdx.api.factory.FdxApiFactory;
import com.fdx.common.util.ApiUtil;
import com.fdx.common.util.FdxConstants;
import com.fdx.common.util.FdxUtil;
import io.swagger.annotations.ApiParam;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.util.Optional;

/**
 * Manage registry recipients
 */
@Validated
@Tag(name = "recipients", description = "Manage recipients")
@ComponentScan(basePackages = {"com.fdx.adapterfactory"})
@RestController
public class RegistryRecipientApiController {

  ServiceAdapterApi<?> schemaService;

  @Autowired
  FdxApiFactory schemaAdapter;

  private final NativeWebRequest request;

  @Autowired
  public RegistryRecipientApiController(NativeWebRequest request) {
    this.request = request;
  }

  public Optional<NativeWebRequest> getRequest() {
    return Optional.ofNullable(request);
  }

  /**
   * GET /recipients/{recipientId} : Get Recipient by Id
   * Get a specific recipient
   *
   * @param recipientId Recipient Identifier. Uniquely identifies a Recipient (required)
   * @return OK (status code 200)
   */
  @Operation(
      operationId = "getRecipient",
      summary = "Get Recipient by Id",
      tags = {"Recipients"},
      responses = {
          @ApiResponse(responseCode = "200", description = "OK", content = {
              @Content(mediaType = FdxConstants.APPLICATION_JSON, schema = @Schema(implementation = RegistryRecipientDTO.class))
          })
      }
  )
  @GetMapping(value = "/recipients/{recipientId}", produces = {FdxConstants.APPLICATION_JSON})
  public ResponseEntity<String> getRegistryRecipient(
      @Size(max = 256) @Parameter(name = "recipientId", description = "Recipient Identifier. Uniquely identifies a Recipient",
          required = true) @PathVariable("recipientId") String recipientId
  ) {
    String version = FdxUtil.getVersion(request);
    if (version != null) {
      schemaService = schemaAdapter.getBean(version);
      return schemaService.getRegistryRecipient(recipientId);
    }
    return ApiUtil.getDefaultResponse();
  }

  /**
   * GET /recipients : Get Registry Recipients
   * Get recipients
   *
   * @return OK (status code 200)
   */
  @Operation(
      operationId = "getRecipients",
      summary = "Get Recipients",
      tags = {"Recipients"},
      responses = {
          @ApiResponse(responseCode = "200", description = "OK", content = {
              @Content(mediaType = "application/json", schema = @Schema(implementation = RegistryRecipientsDTO.class))
          })
      }
  )
  @GetMapping(value = "/recipients", produces = {FdxConstants.APPLICATION_JSON})
  public ResponseEntity<String> getRegistryRecipients(
      @ApiParam(value = "Opaque cursor used by the provider to send the next set of records") @Valid @RequestParam(value = "offset", required = false) Integer offset,
      @ApiParam(value = "Number of elements that the consumer wishes to receive. Providers should implement reasonable default and maximum values") @Valid @RequestParam(value = "limit", required = false) Integer limit
  ) {
    String version = FdxUtil.getVersion(request);
    if (version != null) {
      limit = FdxUtil.getLimit(limit);
      if (offset == null) {
        offset = 0;
      }
      schemaService = schemaAdapter.getBean(version);
      return schemaService.getRegistryRecipients(offset, limit);
    }
    return ApiUtil.getDefaultResponse();
  }
}
