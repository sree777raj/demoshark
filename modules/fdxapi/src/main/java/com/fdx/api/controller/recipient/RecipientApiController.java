package com.fdx.api.controller.recipient;

import com.fdx.api.adapter.service.ServiceAdapterApi;
import com.fdx.api.entities.recipient.RecipientRequest;
import com.fdx.api.factory.FdxApiFactory;
import com.fdx.common.util.ApiUtil;
import com.fdx.common.util.FdxConstants;
import com.fdx.common.util.FdxUtil;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.util.Optional;
import java.util.UUID;

/**
 * Financial Data Exchange Recipient API's
 */
@Validated
@Tag(name = "register", description = "Manage recipients")
@ComponentScan(basePackages = {"com.fdx.adapterfactory"})
@RestController
public class RecipientApiController {

  ServiceAdapterApi<?> schemaService;

  @Autowired
  FdxApiFactory schemaAdapter;

  private final NativeWebRequest request;

  @Autowired
  public RecipientApiController(NativeWebRequest request) {
    this.request = request;
  }

  public Optional<NativeWebRequest> getRequest() {
    return Optional.ofNullable(request);
  }

  /**
   * POST /register : Recipient Registration Request
   * Request to Register Recipient by Creating a Recipient Record
   *
   * @param recipientRequest (required)
   * @return Created (status code 201)
   */
  @Operation(
      operationId = "createRecipient",
      summary = "Recipient Registration Request",
      tags = {"Recipients"},
      responses = {
          @ApiResponse(responseCode = "201", description = "Created",
              content = {
                  @Content(mediaType = FdxConstants.APPLICATION_JSON)
              })
      }
  )
  @PostMapping(value = "/register", produces = {FdxConstants.APPLICATION_JSON},
      consumes = {FdxConstants.APPLICATION_JSON})
  public ResponseEntity<String> createRecipient(
      @Parameter(name = "RecipientRequest", description = "Create Recipient")
      @Valid @RequestBody(required = false) RecipientRequest recipientRequest
  ) {
    String version = FdxUtil.getVersion(request);
    if (version != null) {
      schemaService = schemaAdapter.getBean(version);
      if (recipientRequest.getClientId() == null) {
        recipientRequest.setClientId(UUID.randomUUID().toString());
        recipientRequest.setClientSecret(UUID.randomUUID().toString());
      }
      return schemaService.postRecipient(recipientRequest);
    }
    return ApiUtil.getDefaultResponse();
  }

  /**
   * GET /register/{clientId} : Get Recipient
   * Get a specific recipient data identified with clientId
   *
   * @param clientId Client Identifier. Uniquely identifies a Client (required)
   * @return OK (status code 200)
   */
  @Operation(
      operationId = "getRecipient",
      summary = "Get Recipient",
      tags = {"Recipients"},
      responses = {
          @ApiResponse(responseCode = "200", description = "OK", content = {
              @Content(mediaType = FdxConstants.APPLICATION_JSON)
          })
      }
  )
  @GetMapping(value = "/register/{clientId}", produces = {FdxConstants.APPLICATION_JSON})
  public ResponseEntity<String> getRecipient(
      @Size(max = 256) @Parameter(name = "clientId", description = "Client " +
          "Identifier. Uniquely identifies a Client", required = true)
      @PathVariable("clientId") String clientId
  ) {
    String version = FdxUtil.getVersion(request);
    if (version != null) {
      schemaService = schemaAdapter.getBean(version);
      return schemaService.getRecipient(clientId);
    }
    return ApiUtil.getDefaultResponse();
  }

  /**
   * DELETE /register/{clientId} : Delete Recipient
   * Delete data for a specific recipient identified with clientId
   *
   * @param clientId Client Identifier. Uniquely identifies a Client (required)
   * @return No Content (status code 204)
   */
  @Operation(
      operationId = "deleteRecipient",
      summary = "Delete Recipient",
      tags = {"Recipients"},
      responses = {
          @ApiResponse(responseCode = "204", description = "No Content")
      }
  )
  @DeleteMapping(value = "/register/{clientId}")
  public ResponseEntity<String> deleteRecipient(
      @Size(max = 256) @Parameter(name = "clientId", description = "Client " +
          "Identifier. Uniquely identifies a Client", required = true) @PathVariable("clientId") String clientId
  ) {
    String version = FdxUtil.getVersion(request);
    if (version != null) {
      schemaService = schemaAdapter.getBean(version);
      return schemaService.deleteRecipient(clientId);
    }
    return ApiUtil.getDefaultResponse();
  }

  /**
   * PUT /register/{clientId} : Update a Recipient
   * Update data for a specific recipient identified with clientId
   *
   * @param clientId         Client Identifier. Uniquely identifies a Client
   *                         (required)
   * @param recipientRequest (optional)
   * @return OK (status code 200)
   */
  @Operation(
      operationId = "updateRecipient",
      summary = "Update a Recipient",
      tags = {"Recipients"},
      responses = {
          @ApiResponse(responseCode = "200", description = "OK", content = {
              @Content(mediaType = FdxConstants.APPLICATION_JSON)
          })
      }
  )
  @PutMapping(value = "/register/{clientId}", produces = {FdxConstants.APPLICATION_JSON},
      consumes = {FdxConstants.APPLICATION_JSON})
  public ResponseEntity<String> updateRecipient(
      @Size(max = 256) @Parameter(name = "clientId", description = "Client " +
          "Identifier. Uniquely identifies a Client", required = true) @PathVariable("clientId") String clientId,
      @Parameter(name = "RecipientRequest", description = "RecipientRequest to be updated") @Valid @RequestBody(required = false) RecipientRequest recipientRequest
  ) {
    String version = FdxUtil.getVersion(request);
    if (version != null) {
      schemaService = schemaAdapter.getBean(version);
      return schemaService.updateRecipient(recipientRequest, clientId);
    }
    return ApiUtil.getDefaultResponse();
  }
}
