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
public class PayeesApiController {

	ServiceAdapterApi<?> schemaService;

	@Autowired
	FdxApiFactory schemaAdapter;

	ApiUtil apiUtil;
	String errorResponse = null;
	private final NativeWebRequest request;

	@org.springframework.beans.factory.annotation.Autowired
	public PayeesApiController(NativeWebRequest request) {
		this.request = request;
	}

	public Optional<NativeWebRequest> getRequest() {
		return Optional.ofNullable(request);
	}

	private static final Logger logger = LoggerFactory.getLogger(CapabilityApiController.class);

	/**
	 * GET /payees : Search for payees Search for payees
	 *
	 * @param updatedSince Return payees that have been created or updated since the
	 *                     update id (optional)
	 * @param offset       Opaque cursor used by the provider to send the next set
	 *                     of records (optional)
	 * @param limit        Number of elements that the consumer wishes to receive.
	 *                     Providers should implement reasonable default and maximum
	 *                     values (optional)
	 * @return Ok (status code 200)
	 * @throws Exception
	 */
	@ApiOperation(value = "Search for payees", nickname = "searchForPayees", notes = "Search for payees", response = String.class, tags = {
			"Payee Management", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Ok", response = String.class) })
	@GetMapping(value = "/payees", produces = { "application/json" })
	public ResponseEntity<String> searchForPayees(
			@ApiParam(value = "Return payees that have been created or updated since the update id") @Valid @RequestParam(value = "updatedSince", required = false) String updatedSince,
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
			return (ResponseEntity) schemaService.getPayees(updatedSince, offset, limit, uriPath, query);
		} else
			return ApiUtil.getDefaultResponse();
	}

	/**
	 * GET /payees/{payeeId} : Get a payee Get a payee
	 *
	 * @param payeeId Payee Identifier. Uniquely identifies a payee (required)
	 * @return Ok (status code 200)
	 * @throws Exception
	 * @throws JsonProcessingException
	 */
	@ApiOperation(value = "Get a payee", nickname = "getPayee", notes = "Get a payee", response = String.class, tags = {
			"Payee Management", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Ok", response = String.class) })
	@GetMapping(value = "/payees/{payeeId}", produces = { "application/json" })
	public ResponseEntity<String> getPayee(
			@ApiParam(value = "Payee Identifier. Uniquely identifies a payee", required = true) @PathVariable("payeeId") String payeeId)
			throws JsonProcessingException, Exception {
		String version = FdxUtil.getVersion(request);
		if (version != null) {
			schemaService = schemaAdapter.getBean(version);
			return (ResponseEntity) schemaService.getPayeeById(payeeId, version);
		} else
			return ApiUtil.getDefaultResponse();
	}

	/**
	 * PATCH /payees/{payeeId} : Update a payee Used to update an existing payee.
	 * The payee type must match the existing payee. This call updates the
	 * payee&#39;s fields to the values provided. If a field is not provided, the
	 * payee&#39;s field is not updated
	 *
	 * @param payeeId Payee Identifier. Uniquely identifies a payee
	 *                (required) @param idempotencyKey Used to de-duplicate requests
	 *                (optional) @param payeeForUpdate (optional) @return Ok (status
	 *                code 200) or Duplicate Request (status code 409) @throws
	 *                Exception @throws
	 */
	@ApiOperation(value = "Update a payee", nickname = "updatePayee", notes = "Used to update an existing payee. The payee type must match the existing payee. This call updates the payee's fields to the values provided. If a field is not provided, the payee's field is not updated", response = String.class, tags = {
			"Payee Management", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Ok", response = String.class),
			@ApiResponse(code = 409, message = "Duplicate Request", response = String.class) })
	@PatchMapping(value = "/payees/{payeeId}", produces = { "application/json" }, consumes = { "application/json" })
	public ResponseEntity<String> updatePayee(
			@Size(max = 256) @ApiParam(value = "Payee Identifier. Uniquely identifies a payee", required = true) @PathVariable("payeeId") String payeeId,
			@ApiParam(value = "Used to de-duplicate requests") @RequestHeader(value = "idempotency-key", required = false) String idempotencyKey,
			@ApiParam(value = "") @Valid @RequestBody(required = false) Object payeeForUpdate) throws Exception {
		String version = FdxUtil.getVersion(request);
		if (version != null) {
			schemaService = schemaAdapter.getBean(version);
			return (ResponseEntity) schemaService.updatePayee(payeeId, payeeForUpdate, version, idempotencyKey);
		} else
			return ApiUtil.getDefaultResponse();
	}

	/**
	 * DELETE /payees/{payeeId} : Delete a payee Delete a payee
	 *
	 * @param payeeId Payee Identifier. Uniquely identifies a payee (required)
	 * @return Ok (status code 200)
	 * @throws Exception
	 * @throws JsonProcessingException
	 */
	@ApiOperation(value = "Delete a payee", nickname = "deletePayee", notes = "Delete a payee", response = String.class, tags = {
			"Payee Management", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Ok", response = String.class) })
	@DeleteMapping(value = "/payees/{payeeId}", produces = { "application/json" })
	public ResponseEntity<String> deletePayee(
			@Size(max = 256) @ApiParam(value = "Payee Identifier. Uniquely identifies a payee", required = true) @PathVariable("payeeId") String payeeId)
			throws JsonProcessingException, Exception {
		String version = FdxUtil.getVersion(request);
		if (version != null) {
			schemaService = schemaAdapter.getBean(version);
			return (ResponseEntity) schemaService.deletePayee(payeeId, version);
		} else
			return ApiUtil.getDefaultResponse();
	}

	/**
	 * POST /payees : Create a payee Create a payee
	 *
	 * @param idempotencyKey Used to de-duplicate requests (optional)
	 * @param payeeForUpdate (optional)
	 * @return Payee Exists (status code 200) or Created (status code 201) or
	 *         Duplicate Request (status code 409)
	 * @throws Exception
	 * @throws JsonProcessingException
	 */
	@ApiOperation(value = "Create a payee", nickname = "createPayee", notes = "Create a payee", response = String.class, tags = {
			"Payee Management", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Payee Exists", response = String.class),
			@ApiResponse(code = 201, message = "Created", response = String.class),
			@ApiResponse(code = 409, message = "Duplicate Request", response = String.class) })
	@PostMapping(value = "/payees", produces = { "application/json" }, consumes = { "application/json" })
	public ResponseEntity<String> createPayee(
			@ApiParam(value = "Used to de-duplicate requests") @RequestHeader(value = "idempotency-key", required = false) String idempotencyKey,
			@ApiParam(value = "Http Servlet request ") @Valid @Context HttpServletRequest httpServletRequest,
			@ApiParam(value = "") @Valid @RequestBody(required = false) Object payeeForUpdate)
			throws JsonProcessingException, Exception {
		httpServletRequest.setCharacterEncoding("UTF-8");
		String version = FdxUtil.getVersion(request);
		if (version != null) {
//			Post Payees
			schemaService = schemaAdapter.getBean(version);
			return (ResponseEntity) schemaService.postPayee(payeeForUpdate, idempotencyKey);
		} else
			return ApiUtil.getDefaultResponse();
	}
}
