package com.fdx.api.controller.notification.subscriptions;

import com.fdx.api.adapter.service.ServiceAdapterApi;
import com.fdx.api.entities.notification.subscriptions.NotificationSubscriptionRequest;
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
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.util.Optional;

@Validated
@Tag(name = "notification-subscriptions", description = "Manage Event Notifications")
@ComponentScan(basePackages = {"com.fdx.adapterfactory"})
@RestController
public class NotificationSubscriptionsApiController {

  ServiceAdapterApi<?> schemaService;

  @Autowired
  FdxApiFactory schemaAdapter;

  private final NativeWebRequest request;

  public NotificationSubscriptionsApiController(NativeWebRequest request) {
    this.request = request;
  }

  public Optional<NativeWebRequest> getRequest() {
    return Optional.ofNullable(request);
  }

  /**
   * POST /notification-subscriptions : Create a notification subscriptions
   * Creates notification subscription entry on the server
   *
   * @param notificationSubscription (optional)
   * @return Created (status code 201)
   * or Input sent by client does not satisfy API specification (status code 400)
   * or Unauthorized to create a notification subscriptions (status code 401)
   * or Method Not Allowed (status code 405)
   * or Too Many Requests (status code 429)
   * or Catch all exception where request was not processed due to an internal outage/issue. Consider other more specific errors before using this error (status code 500)
   * or Error when FdxVersion in Header is not one of those implemented at backend (status code 501)
   * or System is down for maintenance (status code 503)
   */
  @Operation(
      operationId = "createNotificationSubscription",
      summary = "Create a notification subscriptions",
      tags = {"Event Notifications"},
      responses = {
          @ApiResponse(responseCode = "201", description = "Created", content = {
              @Content(mediaType = "application/json", schema = @Schema(implementation = NotificationSubscriptionRequest.class))
          }),
          @ApiResponse(responseCode = "400", description = "Input sent by client does not satisfy API specification", content = {
              @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
          }),
          @ApiResponse(responseCode = "401", description = "Unauthorized to create a notification subscriptions", content = {
              @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
          }),
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
  @PostMapping(value = "/notification-subscriptions", produces = {FdxConstants.APPLICATION_JSON},
      consumes = {FdxConstants.APPLICATION_JSON})
  public ResponseEntity<String> createNotificationSubscription(
      @Parameter(name = "NotificationSubscription", description = "Notification subscriptions")
      @Valid @RequestBody(required = false) NotificationSubscriptionRequest notificationSubscription
  ) {
    String version = FdxUtil.getVersion(request);
    if (version != null) {
      schemaService = schemaAdapter.getBean(version);
      return schemaService.createNotificationSubscription(notificationSubscription);
    }
    return ApiUtil.getDefaultResponse();
  }

  /**
   * GET /notification-subscriptions/{subscriptionId} : Get a notification subscription
   *
   * @param subscriptionId ID of notification subscription (required)
   * @return OK (status code 200)
   * or Input sent by client does not satisfy API specification (status code 400)
   * or Unauthorized to create a notification subscription (status code 401)
   * or Method Not Allowed (status code 405)
   * or Too Many Requests (status code 429)
   * or Catch all exception where request was not processed due to an internal outage/issue. Consider other more specific errors before using this error (status code 500)
   * or Error when FdxVersion in Header is not one of those implemented at backend (status code 501)
   * or System is down for maintenance (status code 503)
   */
  @Operation(
      operationId = "getNotificationSubscription",
      summary = "Get a notification subscription",
      tags = {"Event Notifications"},
      responses = {
          @ApiResponse(responseCode = "200", description = "OK", content = {
              @Content(mediaType = "application/json", schema = @Schema(implementation = NotificationSubscriptionRequest.class))
          }),
          @ApiResponse(responseCode = "400", description = "Input sent by client does not satisfy API specification", content = {
              @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
          }),
          @ApiResponse(responseCode = "401", description = "Unauthorized to create a notification subscription", content = {
              @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
          }),
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
  @GetMapping(value = "/notification-subscriptions/{subscriptionId}", produces = {FdxConstants.APPLICATION_JSON})
  public ResponseEntity<String> getNotificationSubscription(
      @Size(max = 256) @Parameter(name = "subscriptionId", description =
          "ID of notification subscription", required = true)
      @PathVariable("subscriptionId") String subscriptionId
  ) {
    String version = FdxUtil.getVersion(request);
    if (version != null) {
      schemaService = schemaAdapter.getBean(version);
      return schemaService.getNotificationSubscription(subscriptionId);
    }
    return ApiUtil.getDefaultResponse();
  }


  /**
   * DELETE /notification-subscriptions/{subscriptionId} : Delete a notification subscription
   *
   * @param subscriptionId ID of notification subscription (required)
   * @return No Content (status code 204)
   *         or Bad Request (status code 400)
   *         or Unauthorized to create a notification subscription (status code 401)
   *         or Method Not Allowed (status code 405)
   *         or Too Many Requests (status code 429)
   *         or Catch all exception where request was not processed due to an internal outage/issue. Consider other more specific errors before using this error (status code 500)
   *         or Error when FdxVersion in Header is not one of those implemented at backend (status code 501)
   *         or System is down for maintenance (status code 503)
   */
  @Operation(
      operationId = "deleteNotificationSubscription",
      summary = "Delete a notification subscription",
      tags = { "Event Notifications" },
      responses = {
          @ApiResponse(responseCode = "204", description = "No Content"),
          @ApiResponse(responseCode = "400", description = "Bad Request", content = {
              @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
          }),
          @ApiResponse(responseCode = "401", description = "Unauthorized to create a notification subscription", content = {
              @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
          }),
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
  @DeleteMapping(value = "/notification-subscriptions/{subscriptionId}")
  public ResponseEntity<String> deleteNotificationSubscription(
      @Size(max = 256) @Parameter(name = "subscriptionId", description =
          "ID of notification subscription", required = true) @PathVariable("subscriptionId") String subscriptionId
  ) {
    String version = FdxUtil.getVersion(request);
    if (version != null) {
      schemaService = schemaAdapter.getBean(version);
      return schemaService.deleteNotificationSubscription(subscriptionId);
    }
    return ApiUtil.getDefaultResponse();
  }
}
