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
public class PaymentsApiController {

	ServiceAdapterApi<?> schemaService;

	@Autowired
	FdxApiFactory schemaAdapter;

	ApiUtil apiUtil;
	String errorResponse = null;
	private final NativeWebRequest request;

	@org.springframework.beans.factory.annotation.Autowired
	public PaymentsApiController(NativeWebRequest request) {
		this.request = request;
	}

	public Optional<NativeWebRequest> getRequest() {
		return Optional.ofNullable(request);
	}

	private static final Logger logger = LoggerFactory.getLogger(CapabilityApiController.class);

	/**
	 * GET /payments : Search for payments Search for payments
	 *
	 * @param updatedSince Return payments that have been created or updated since
	 *                     the update id (optional)
	 * @param offset       Opaque cursor used by the provider to send the next set
	 *                     of records (optional)
	 * @param limit        Number of elements that the consumer wishes to receive.
	 *                     Providers should implement reasonable default and maximum
	 *                     values (optional)
	 * @return Ok (status code 200)
	 */
	@ApiOperation(value = "Search for payments", nickname = "searchForPayments", notes = "Search for payments", response = String.class, tags = {
			"Payments", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Ok", response = String.class) })
	@GetMapping(value = "/payments", produces = { "application/json" })
	public ResponseEntity<String> searchForPayments(
			@ApiParam(value = "Return payments that have been created or updated since the update id") @Valid @RequestParam(value = "updatedSince", required = false) String updatedSince,
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

//			Get Payments
			schemaService = schemaAdapter.getBean(version);
			return (ResponseEntity) schemaService.getPayments(updatedSince, offset, limit, uriPath, query);
		} else
			return ApiUtil.getDefaultResponse();
	}

	/**
	 * GET /payments/{paymentId} : Get payment Get a payment
	 *
	 * @param paymentId Payment Identifier. Uniquely identifies a payment (required)
	 * @return Ok (status code 200)
	 */
	@ApiOperation(value = "Get payment", nickname = "getPayment", notes = "Get a payment", response = String.class, tags = {
			"Payments", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Ok", response = String.class) })
	@GetMapping(value = "/payments/{paymentId}", produces = { "application/json" })
	public ResponseEntity<String> getPayment(
			@Size(max = 256) @ApiParam(value = "Payment Identifier. Uniquely identifies a payment", required = true) @PathVariable("paymentId") String paymentId)
			throws JsonProcessingException, Exception {
		String version = FdxUtil.getVersion(request);
		if (version != null) {
			schemaService = schemaAdapter.getBean(version);
			return (ResponseEntity) schemaService.getPaymentById(paymentId, version);
		} else
			return ApiUtil.getDefaultResponse();
	}

	/**
	 * PATCH /payments/{paymentId} : Update a payment Update a payment
	 *
	 * @param paymentId        Payment Identifier. Uniquely identifies a payment
	 *                         (required)
	 * @param idempotencyKey   Used to de-duplicate requests (optional)
	 * @param paymentForUpdate (optional)
	 * @return Ok (status code 200) or Duplicate Request (status code 409)
	 */
	@ApiOperation(value = "Update a payment", nickname = "updatePayment", notes = "Update a payment", response = String.class, tags = {
			"Payments", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Ok", response = String.class),
			@ApiResponse(code = 409, message = "Duplicate Request", response = String.class) })
	@PatchMapping(value = "/payments/{paymentId}", produces = { "application/json" }, consumes = { "application/json" })
	public ResponseEntity<String> updatePayment(
			@Size(max = 256) @ApiParam(value = "Payment Identifier. Uniquely identifies a payment", required = true) @PathVariable("paymentId") String paymentId,
			@ApiParam(value = "Used to de-duplicate requests") @RequestHeader(value = "idempotency-key", required = false) String idempotencyKey,
			@ApiParam(value = "") @Valid @RequestBody(required = false) Object paymentForUpdate) throws Exception {
		String version = FdxUtil.getVersion(request);
		if (version != null) {
			schemaService = schemaAdapter.getBean(version);
			return (ResponseEntity) schemaService.updatePayment(paymentId, paymentForUpdate, version, idempotencyKey);
		} else
			return ApiUtil.getDefaultResponse();
	}

	/**
	 * DELETE /payments/{paymentId} : Cancel payment Cancel a payment
	 *
	 * @param paymentId Payment Identifier. Uniquely identifies a payment (required)
	 * @return Ok (status code 200)
	 */
	@ApiOperation(value = "Cancel payment", nickname = "cancelPayment", notes = "Cancel a payment", response = String.class, tags = {
			"Payments", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Ok", response = String.class) })
	@DeleteMapping(value = "/payments/{paymentId}", produces = { "application/json" })
	public ResponseEntity<String> cancelPayment(
			@Size(max = 256) @ApiParam(value = "Payment Identifier. Uniquely identifies a payment", required = true) @PathVariable("paymentId") String paymentId)
			throws JsonProcessingException, Exception {
		String version = FdxUtil.getVersion(request);
		if (version != null) {
			schemaService = schemaAdapter.getBean(version);
			return (ResponseEntity) schemaService.cancelPayment(paymentId, version);
		} else
			return ApiUtil.getDefaultResponse();
	}

	/**
	 * POST /payments : Schedule payment Schedule a payment
	 *
	 * @param idempotencyKey   Used to de-duplicate requests (optional)
	 * @param paymentForUpdate (optional)
	 * @return Duplicate Payment (status code 200) or Created (status code 201) or
	 *         Duplicate Request (status code 409)
	 * @throws Exception
	 * @throws JsonProcessingException
	 */
	@ApiOperation(value = "Schedule payment", nickname = "schedulePayment", notes = "Schedule a payment", response = String.class, tags = {
			"Payments", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Duplicate Payment", response = String.class),
			@ApiResponse(code = 201, message = "Created", response = String.class),
			@ApiResponse(code = 409, message = "Duplicate Request", response = String.class) })
	@PostMapping(value = "/payments", produces = { "application/json" }, consumes = { "application/json" })
	public ResponseEntity<String> schedulePayment(
			@ApiParam(value = "Used to de-duplicate requests") @RequestHeader(value = "idempotency-key", required = false) String idempotencyKey,
			@ApiParam(value = "Http Servlet request ") @Valid @Context HttpServletRequest httpServletRequest,
			@ApiParam(value = "") @Valid @RequestBody(required = false) Object paymentForUpdate)
			throws JsonProcessingException, Exception {
		httpServletRequest.setCharacterEncoding("UTF-8");
		String version = FdxUtil.getVersion(request);
		if (version != null) {
//			Post Payees
			schemaService = schemaAdapter.getBean(version);
			return (ResponseEntity) schemaService.postPayment(paymentForUpdate, idempotencyKey);
		} else
			return ApiUtil.getDefaultResponse();
	}
}
