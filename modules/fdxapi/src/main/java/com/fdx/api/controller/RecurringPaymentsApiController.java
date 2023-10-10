package com.fdx.api.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fdx.api.adapter.service.ServiceAdapterApi;
import com.fdx.api.factory.FdxApiFactory;
import com.fdx.common.util.ApiUtil;
import com.fdx.common.util.FdxUtil;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.mapstruct.Context;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.util.Optional;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
@RestController
@ComponentScan(basePackages = { "com.fdx.adapterfactory" })
//@RequestMapping("${openapi.fDXV46.base-path:/fdx/v4}")
public class RecurringPaymentsApiController {

	ServiceAdapterApi<?> schemaService;

	@Autowired
	FdxApiFactory schemaAdapter;

	ApiUtil apiUtil;
	
	String errorResponse = null;
	private final NativeWebRequest request;

	@org.springframework.beans.factory.annotation.Autowired
	public RecurringPaymentsApiController(NativeWebRequest request) {
		this.request = request;
	}

	public Optional<NativeWebRequest> getRequest() {
		return Optional.ofNullable(request);
	}

	private static final Logger logger = LoggerFactory.getLogger(CapabilityApiController.class);

	/**
	 * GET /recurring-payments : Search for recurring payments Search for recurring
	 * payments
	 *
	 * @param updatedSince Return recurring payments that have been created or
	 *                     updated since the update id (optional)
	 * @param offset       Opaque cursor used by the provider to send the next set
	 *                     of records (optional)
	 * @param limit        Number of elements that the consumer wishes to receive.
	 *                     Providers should implement reasonable default and maximum
	 *                     values (optional)
	 * @return Ok (status code 200)
	 */
	@ApiOperation(value = "Search for recurring payments", nickname = "searchForRecurringPayments", notes = "Search for recurring payments", response = String.class, tags = {
			"Recurring Payments", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Ok", response = String.class) })
	@GetMapping(value = "/recurring-payments", produces = { "application/json" })
	public ResponseEntity<String> searchForRecurringPayments(
			@ApiParam(value = "Return recurring payments that have been created or updated since the update id") @Valid @RequestParam(value = "updatedSince", required = false) String updatedSince,
			@ApiParam(value = "Http Servlet request ") @Valid @Context HttpServletRequest httpServletRequest,
			@ApiParam(value = "Opaque cursor used by the provider to send the next set of records") @Valid @RequestParam(value = "offset", required = false) String offset,
			@ApiParam(value = "Number of elements that the consumer wishes to receive. Providers should implement reasonable default and maximum values") @Valid @RequestParam(value = "limit", required = false) Integer limit)
			throws Exception {
		httpServletRequest.setCharacterEncoding("UTF-8");
		String uriPath = httpServletRequest.getServletPath();
		String query = httpServletRequest.getQueryString();
		String version = FdxUtil.getVersion(request);
		if (version != null) {
			limit = FdxUtil.getLimit(limit);

			if (offset == null)
				offset = "0";

			schemaService = schemaAdapter.getBean(version);
			return (ResponseEntity) schemaService.getRecurringPayments(updatedSince, offset, limit, uriPath,
					query);
		} else
			return ApiUtil.getDefaultResponse();
	}

	/**
	 * GET /recurring-payments/{recurringPaymentId} : Get a recurring payment Get a
	 * recurring payment
	 *
	 * @param recurringPaymentId Recurring Payment Identifier. Uniquely identifies a
	 *                           recurring payment (required)
	 * @return Ok (status code 200)
	 */
	@ApiOperation(value = "Get a recurring payment", nickname = "getRecurringPayment", notes = "Get a recurring payment", response = String.class, tags = {
			"Recurring Payments", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Ok", response = String.class) })
	@GetMapping(value = "/recurring-payments/{recurringPaymentId}", produces = { "application/json" })
	public ResponseEntity<String> getRecurringPayment(
			@Size(max = 256) @ApiParam(value = "Recurring Payment Identifier. Uniquely identifies a recurring payment", required = true) @PathVariable("recurringPaymentId") String recurringPaymentId)
			throws JsonProcessingException, Exception {
		String version = FdxUtil.getVersion(request);
		if (version != null) {
			schemaService = schemaAdapter.getBean(version);
			return (ResponseEntity) schemaService.getRecurringPaymentById(recurringPaymentId, version);
		} else
			return ApiUtil.getDefaultResponse();
	}

	/**
	 * PATCH /recurring-payments/{recurringPaymentId} : Update a recurring payment
	 * Update a recurring payment
	 *
	 * @param recurringPaymentId        Recurring Payment Identifier. Uniquely
	 *                                  identifies a recurring payment (required)
	 * @param idempotencyKey            Used to de-duplicate requests (optional)
	 * @param recurringPaymentForUpdate (optional)
	 * @return Ok (status code 200) or Duplicate Request (status code 409)
	 */
	@ApiOperation(value = "Update a recurring payment", nickname = "updateRecurringPayment", notes = "Update a recurring payment", response = String.class, tags = {
			"Recurring Payments", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Ok", response = String.class),
			@ApiResponse(code = 409, message = "Duplicate Request", response = String.class) })
	@PatchMapping(value = "/recurring-payments/{recurringPaymentId}", produces = { "application/json" }, consumes = {
			"application/json" })
	public ResponseEntity<String> updateRecurringPayment(
			@Size(max = 256) @ApiParam(value = "Recurring Payment Identifier. Uniquely identifies a recurring payment", required = true) @PathVariable("recurringPaymentId") String recurringPaymentId,
			@ApiParam(value = "Used to de-duplicate requests") @RequestHeader(value = "idempotency-key", required = false) String idempotencyKey,
			@ApiParam(value = "") @Valid @RequestBody(required = false) Object recurringPaymentForUpdate)
			throws Exception {
		String version = FdxUtil.getVersion(request);
		if (version != null) {
			schemaService = schemaAdapter.getBean(version);
			return (ResponseEntity) schemaService.updateRecurringPayment(recurringPaymentId, recurringPaymentForUpdate, version, idempotencyKey);
		} else
			return ApiUtil.getDefaultResponse();
	}

	/**
	 * DELETE /recurring-payments/{recurringPaymentId} : Cancel a recurring payment
	 * Cancel a recurring payment
	 *
	 * @param recurringPaymentId Recurring Payment Identifier. Uniquely identifies a
	 *                           recurring payment (required)
	 * @return Ok (status code 200)
	 */
	@ApiOperation(value = "Cancel a recurring payment", nickname = "cancelRecurringPayment", notes = "Cancel a recurring payment", response = String.class, tags = {
			"Recurring Payments", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Ok", response = String.class) })
	@DeleteMapping(value = "/recurring-payments/{recurringPaymentId}", produces = { "application/json" })
	public ResponseEntity<String> cancelRecurringPayment(
			@Size(max = 256) @ApiParam(value = "Recurring Payment Identifier. Uniquely identifies a recurring payment", required = true) @PathVariable("recurringPaymentId") String recurringPaymentId)
			throws JsonProcessingException, Exception {
		String version = FdxUtil.getVersion(request);
		if (version != null) {
			schemaService = schemaAdapter.getBean(version);
			return (ResponseEntity) schemaService.cancelRecurringPayment(recurringPaymentId, version);
		} else
			return ApiUtil.getDefaultResponse();
	}

	/**
	 * POST /recurring-payments : Schedule recurring payments Schedule a recurring
	 * payment
	 *
	 * @param idempotencyKey            Used to de-duplicate requests (optional)
	 * @param recurringPaymentForUpdate (optional)
	 * @return Duplicate Recurring Payment (status code 200) or Created (status code
	 *         201) or Duplicate Request (status code 409)
	 * @throws Exception
	 */
	@ApiOperation(value = "Schedule recurring payments", nickname = "scheduleRecurringPayment", notes = "Schedule a recurring payment", response = String.class, tags = {
			"Recurring Payments", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Duplicate Recurring Payment", response = String.class),
			@ApiResponse(code = 201, message = "Created", response = String.class),
			@ApiResponse(code = 409, message = "Duplicate Request", response = String.class) })
	@PostMapping(value = "/recurring-payments", produces = { "application/json" }, consumes = { "application/json" })
	public ResponseEntity<String> scheduleRecurringPayment(
			@ApiParam(value = "Used to de-duplicate requests") @RequestHeader(value = "idempotency-key", required = false) String idempotencyKey,
			@ApiParam(value = "Http Servlet request ") @Valid @Context HttpServletRequest httpServletRequest,
			@ApiParam(value = "") @Valid @RequestBody(required = false) Object recurringPaymentForUpdate)
			throws Exception {
		httpServletRequest.setCharacterEncoding("UTF-8");
		String version = FdxUtil.getVersion(request);
		if (version != null) {
			schemaService = schemaAdapter.getBean(version);
			return (ResponseEntity) schemaService.postRecurringPayment(recurringPaymentForUpdate, idempotencyKey);
		} else
			return ApiUtil.getDefaultResponse();
	}

	/**
	 * GET /recurring-payments/{recurringPaymentId}/payments : Get a recurring
	 * payment Get a recurring payment
	 *
	 * @param recurringPaymentId Recurring Payment Identifier. Uniquely identifies a
	 *                           recurring payment (required)
	 * @return Ok (status code 200)
	 */
	@ApiOperation(value = "Get a recurring payment", nickname = "getRecurringPayment", notes = "Get a recurring payment", response = String.class, tags = {
			"Recurring Payments", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Ok", response = String.class) })
	@GetMapping(value = "/recurring-payments/{recurringPaymentId}/payments", produces = { "application/json" })
	public ResponseEntity<String> getRecurringPaymentByPaymentId(
			@Size(max = 256) @ApiParam(value = "Recurring Payment Identifier. Uniquely identifies a recurring payment", required = true) @PathVariable("recurringPaymentId") String recurringPaymentId,
			@ApiParam(value = "Return recurring payments that have been created or updated since the update id") @Valid @RequestParam(value = "updatedSince", required = false) String updatedSince,
			@ApiParam(value = "Http Servlet request ") @Valid @Context HttpServletRequest httpServletRequest,
			@ApiParam(value = "Opaque cursor used by the provider to send the next set of records") @Valid @RequestParam(value = "offset", required = false) String offset,
			@ApiParam(value = "Number of elements that the consumer wishes to receive. Providers should implement reasonable default and maximum values") @Valid @RequestParam(value = "limit", required = false) Integer limit)
			throws JsonProcessingException, Exception {
		httpServletRequest.setCharacterEncoding("UTF-8");
		String uriPath = httpServletRequest.getServletPath();
		String query = httpServletRequest.getQueryString();
		String version = FdxUtil.getVersion(request);
		if (version != null) {
			limit = FdxUtil.getLimit(limit);

			if (offset == null)
				offset = "0";

			schemaService = schemaAdapter.getBean(version);
			return (ResponseEntity) schemaService.getPaymentsByRecurringPaymentId(recurringPaymentId,
					updatedSince, offset, limit, uriPath, query);
		} else
			return ApiUtil.getDefaultResponse();
	}
}
