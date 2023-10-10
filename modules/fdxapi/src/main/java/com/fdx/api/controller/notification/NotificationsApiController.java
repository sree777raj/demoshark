package com.fdx.api.controller.notification;

import com.fdx.api.adapter.service.ServiceAdapterApi;
import com.fdx.api.entities.notification.NotificationRequest;
import com.fdx.api.factory.FdxApiFactory;
import com.fdx.common.util.ApiUtil;
import com.fdx.common.util.FdxConstants;
import com.fdx.common.util.FdxUtil;
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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.Valid;
import java.util.Optional;

@Validated
@Tag(name = "notifications", description = "Manage Event Notifications")
@ComponentScan(basePackages = {"com.fdx.adapterfactory"})
@RestController
public class NotificationsApiController {

  ServiceAdapterApi<?> schemaService;

  @Autowired
  FdxApiFactory schemaAdapter;

  private final NativeWebRequest request;

  public NotificationsApiController(NativeWebRequest request) {
    this.request = request;
  }

  public Optional<NativeWebRequest> getRequest() {
    return Optional.ofNullable(request);
  }

  /**
   * POST /notifications : Publish a notification
   * Publish Notification
   *
   * @param notification (optional)
   * @return No Content (status code 204)
   * or Method Not Allowed (status code 405)
   * or Too Many Requests (status code 429)
   * or Catch all exception where request was not processed due to an internal outage/issue. Consider other more specific errors before using this error (status code 500)
   * or Error when FdxVersion in Header is not one of those implemented at backend (status code 501)
   * or System is down for maintenance (status code 503)
   */
  @Operation(
      operationId = "publishNotification",
      summary = "Publish a notification",
      tags = {"Event Notifications"},
      responses = {
          @ApiResponse(responseCode = "204", description = "No Content"),
          @ApiResponse(responseCode = "405", description = "Method Not Allowed", content = {
              @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
          }),
          @ApiResponse(responseCode = "429", description = "Too Many Requests", content = {
              @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
          }),
          @ApiResponse(responseCode = "500", description = "Catch all exception where request was not processed due to an internal outage/issue. Consider other more specific errors before using this error", content = {
              @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
          }),
          @ApiResponse(responseCode = "501", description = "Error when FdxVersion in Header is not one of those implemented at backend", content = {
              @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
          }),
          @ApiResponse(responseCode = "503", description = "System is down for maintenance", content = {
              @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
          })
      }
  )
  @PostMapping(value = "/notifications", produces = {FdxConstants.APPLICATION_JSON},
      consumes = {FdxConstants.APPLICATION_JSON})
  public ResponseEntity<String> publishNotification(
      @Parameter(name = "Notification", description = "Create Notification")
      @Valid @RequestBody(required = false) NotificationRequest notification
  ) {
    String version = FdxUtil.getVersion(request);
    if (version != null) {
      schemaService = schemaAdapter.getBean(version);
      return schemaService.publishNotification(notification);
    }
    return ApiUtil.getDefaultResponse();
  }
}
