package com.fdx.api.controller.fraud;

import com.fdx.api.adapter.service.ServiceAdapterApi;
import com.fdx.api.entities.fraud.SuspectedFraudIncidentRequest;
import com.fdx.api.factory.FdxApiFactory;
import com.fdx.common.util.ApiUtil;
import com.fdx.common.util.FdxConstants;
import com.fdx.common.util.FdxUtil;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.Valid;
import java.util.Optional;

@Validated
@Tag(name = "fraud", description = "Notify of suspected fraud")
@ComponentScan(basePackages = {"com.fdx.adapterfactory"})
@RestController
public class FraudApiController {

  ServiceAdapterApi<?> schemaService;

  @Autowired
  FdxApiFactory schemaAdapter;

  private final NativeWebRequest request;

  public FraudApiController(NativeWebRequest request) {
    this.request = request;
  }

  public Optional<NativeWebRequest> getRequest() {
    return Optional.ofNullable(request);
  }

  /**
   * POST /fraud/suspected-incident : Notify Data Provider of fraud
   * Notify Data Provider of suspected fraud
   *
   * @param suspectedFraudIncidentRequest (optional)
   * @return OK (status code 200)
   */
  @Operation(
      operationId = "reportSuspectedFraudIncident",
      summary = "Notify Data Provider of fraud",
      tags = {"Fraud Notification"},
      responses = {
          @ApiResponse(responseCode = "200", description = "OK")
      }
  )
  @PostMapping(value = "/fraud/suspected-incident", produces = {FdxConstants.APPLICATION_JSON},
      consumes = {FdxConstants.APPLICATION_JSON})
  public ResponseEntity<String> reportSuspectedFraudIncident(
      @Parameter(name = "SuspectedFraudIncidentRequest", description = "Notify Data Provider of suspected fraud")
      @Valid @RequestBody(required = false) SuspectedFraudIncidentRequest suspectedFraudIncidentRequest
  ) {
    String version = FdxUtil.getVersion(request);
    if (version != null) {
      schemaService = schemaAdapter.getBean(version);
      return schemaService.reportSuspectedFraudIncident(suspectedFraudIncidentRequest);
    }
    return ApiUtil.getDefaultResponse();
  }
}
