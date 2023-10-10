package com.fdx.api.controller.certificationmetrics;

import com.fdx.api.adapter.service.ServiceAdapterApi;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.Valid;
import java.util.Optional;

@Validated
@Tag(name = "certification-metrics", description = "API management and metrics")
@ComponentScan(basePackages = {"com.fdx.adapterfactory"})
@RestController
public class CertificationMetricsApiController {

  ServiceAdapterApi<?> schemaService;

  @Autowired
  FdxApiFactory schemaAdapter;

  private final NativeWebRequest request;

  public CertificationMetricsApiController(NativeWebRequest request) {
    this.request = request;
  }

  public Optional<NativeWebRequest> getRequest() {
    return Optional.ofNullable(request);
  }

  /**
   * GET /certification-metrics : Get certification performance metrics
   * Get certification performance metrics for this implementer&#39;s APIs
   *
   * @param operationId Specific operationId for which to get the metrics. Optional (optional)
   * @return Array of API&#39;s certification metrics (status code 200)
   */
  @Operation(
      operationId = "getCertificationMetrics",
      summary = "Get certification performance metrics",
      tags = {"Meta"},
      responses = {
          @ApiResponse(responseCode = "200", description = "Array of API's certification metrics", content = {
              @Content(mediaType = FdxConstants.APPLICATION_JSON)
          })
      }
  )
  @GetMapping(value = "/certification-metrics", produces = {FdxConstants.APPLICATION_JSON})
  public ResponseEntity<String> getCertificationMetrics(
      @Parameter(name = "operationId", description = "Specific operationId for which to get the metrics. Optional")
      @Valid @RequestParam(value = "operationId", required = false) String operationId
  ) {
    String version = FdxUtil.getVersion(request);
    if (version != null) {
      schemaService = schemaAdapter.getBean(version);
      return schemaService.getCertificationMetrics(operationId);
    }
    return ApiUtil.getDefaultResponse();
  }
}
