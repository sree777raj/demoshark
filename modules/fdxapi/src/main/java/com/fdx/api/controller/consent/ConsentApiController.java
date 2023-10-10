package com.fdx.api.controller.consent;

import com.fdx.api.adapter.service.ServiceAdapterApi;
import com.fdx.api.entities.consent.ConsentGrantRequest;
import com.fdx.api.entities.consent.ConsentRevocationRequest;
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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.util.Optional;

/**
 * Financial Data Exchange Consent API's.
 */
@Validated
@Tag(name = "consents", description = "Manage customer consent grants")
@ComponentScan(basePackages = {"com.fdx.adapterfactory"})
@RestController
public class ConsentApiController {

  ServiceAdapterApi<?> schemaService;

  @Autowired
  FdxApiFactory schemaAdapter;

  private final NativeWebRequest request;

  @Autowired
  public ConsentApiController(NativeWebRequest request) {
    this.request = request;
  }

  public Optional<NativeWebRequest> getRequest() {
    return Optional.ofNullable(request);
  }

  /**
   * POST /consents : Consent Grant Request to Register Consent Grant by
   * Creating a Consent Grant Record
   *
   * @param consentGrantRequest (required)
   * @return Created (status code 201)
   */
  @Operation(
      operationId = "createConsentGrant",
      summary = "Consent Grant Request",
      tags = {"User Consent"},
      responses = {
          @ApiResponse(responseCode = "201", description = "Created",
              content = {
                  @Content(mediaType = FdxConstants.APPLICATION_JSON)
              })
      }
  )
  @PostMapping(value = "/consents", produces = {FdxConstants.APPLICATION_JSON},
      consumes = {FdxConstants.APPLICATION_JSON})
  public ResponseEntity<String> createConsentGrant(
      @Parameter(name = "ConsentGrantRequest", description = "Create ConsentGrant")
      @Valid @RequestBody(required = false) ConsentGrantRequest consentGrantRequest
  ) {
    String version = FdxUtil.getVersion(request);
    if (version != null) {
      schemaService = schemaAdapter.getBean(version);
      return schemaService.postConsentGrant(consentGrantRequest);
    }
    return ApiUtil.getDefaultResponse();
  }

  /**
   * GET /consents/{consentId} : Get Consent Grant
   * Get a Consent Grant
   *
   * @param consentId Consent Grant ID (required)
   * @return Ok (status code 200)
   */
  @Operation(
      operationId = "getConsentGrant",
      summary = "Get Consent Grant",
      tags = {"User Consent"},
      responses = {
          @ApiResponse(responseCode = "200", description = "Ok", content = {
              @Content(mediaType = "application/json")
          })
      }
  )
  @GetMapping(value = "/consents/{consentId}", produces = {"application/json"})
  public ResponseEntity<String> getConsentGrant(
      @Size(max = 256) @Parameter(name = "consentId", description = "Consent " +
          "Grant ID", required = true) @PathVariable("consentId") String consentId
  ) {
    String version = FdxUtil.getVersion(request);
    if (version != null) {
      schemaService = schemaAdapter.getBean(version);
      return schemaService.getConsentGrant(consentId);
    }
    return ApiUtil.getDefaultResponse();
  }

  /**
   * GET /consents/{consentId}/revocation : Retrieve Consent Revocation record
   * Retrieve Consent Revocation record
   *
   * @param consentId Consent Grant ID (required)
   * @return Ok (status code 200)
   */
  @Operation(
      operationId = "getConsentRevocation",
      summary = "Retrieve Consent Revocation record",
      tags = {"User Consent"},
      responses = {
          @ApiResponse(responseCode = "200", description = "Ok", content = {
              @Content(mediaType = "application/json")
          })
      }
  )
  @GetMapping(value = "/consents/{consentId}/revocation", produces = {
      "application/json"})
  public ResponseEntity<String> getConsentRevocation(
      @Size(max = 256) @Parameter(name = "consentId", description = "Consent " +
          "Grant ID", required = true) @PathVariable("consentId") String consentId
  ) {
    String version = FdxUtil.getVersion(request);
    if (version != null) {
      schemaService = schemaAdapter.getBean(version);
      return schemaService.getConsentRevocation(consentId);
    }
    return ApiUtil.getDefaultResponse();
  }

  /**
   * PUT /consents/{consentId}/revocation : Revoke a Consent Grant
   * Revoke a Consent Grant
   *
   * @param consentId                Consent Grant ID (required)
   * @param consentRevocationRequest Reason and initiator of revocation
   *                                 (required)
   * @return No Content (status code 204)
   */
  @Operation(
      operationId = "revokeConsentGrant",
      summary = "Revoke a Consent Grant",
      tags = {"User Consent"},
      responses = {
          @ApiResponse(responseCode = "204", description = "No Content")
      }
  )
  @PutMapping(value = "/consents/{consentId}/revocation", produces = {
      "application/json"}, consumes = {"application/json"})
  public ResponseEntity<String> revokeConsentGrant(
      @Size(max = 256) @Parameter(name = "consentId", description = "Consent " +
          "Grant ID", required = true) @PathVariable("consentId") String consentId,
      @Parameter(name = "ConsentRevocationRequest", description = "Reason and" +
          " initiator of revocation", required = true) @Valid @RequestBody ConsentRevocationRequest consentRevocationRequest
  ) {
    String version = FdxUtil.getVersion(request);
    if (version != null) {
      schemaService = schemaAdapter.getBean(version);
      return schemaService.revokeConsentGrant(consentRevocationRequest, consentId);
    }
    return ApiUtil.getDefaultResponse();
  }

  /**
   * GET /consents : Get Consent Grant Id
   * Get a Consent Grant Id
   *
   * @param registeredClientId value
   * @param principalName value
   * @return consentId Ok (status code 200)
   */
  @Operation(
      operationId = "getConsentGrantId",
      summary = "Get Consent Grant Id",
      tags = {"User Consent"},
      responses = {
          @ApiResponse(responseCode = "200", description = "Ok", content = {
              @Content(mediaType = "application/json")
          })
      }
  )
  @GetMapping(value = "/consents", produces = {"application/json"})
  public ResponseEntity<String> getConsentGrantId(
      @Parameter(name = "registeredClientId", description = "Registered Client Id", required = true)
      @RequestParam String registeredClientId,
      @Parameter(name = "principalName", description = "Principal Name", required = true)
      @RequestParam String principalName
  ) {
    String version = FdxUtil.getVersion(request);
    if (version != null) {
      schemaService = schemaAdapter.getBean(version);
      return schemaService.getConsentGrantId(registeredClientId, principalName);
    }
    return ApiUtil.getDefaultResponse();
  }

}