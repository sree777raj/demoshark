package com.fdx.api.controller;

import com.fdx.api.adapter.service.ServiceAdapterApi;
import com.fdx.api.entities.moneymovement.PaymentStatus;
import com.fdx.api.factory.FdxApiFactory;
import com.fdx.common.util.ApiUtil;
import com.fdx.common.util.FdxConstants;
import com.fdx.common.util.FdxUtil;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.apache.commons.lang3.StringUtils;
import org.mapstruct.Context;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.NativeWebRequest;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Validated
@Tag(name = "transfers", description = "Manage internal transfers")
@Controller
public class TransferApiController {

	ServiceAdapterApi<?> schemaService;

	@Autowired
	FdxApiFactory schemaAdapter;

	private final NativeWebRequest request;

	@org.springframework.beans.factory.annotation.Autowired
	public TransferApiController(NativeWebRequest request) {
		this.request = request;
	}

	public Optional<NativeWebRequest> getRequest() {
		return Optional.ofNullable(request);
	}

	/**
	 * GET /transfers/{transferId}/status : Get transfer status Get status of
	 * transfer between accounts
	 *
	 * @param transferId Transfer identifier (required)
	 * @return Current status of the requested transfer (status code 200)
	 * @throws Exception
	 */
	@ApiOperation(value = "Get transfer status", nickname = "getTransferStatus", notes = "Get status of transfer between accounts", response = String.class, tags = {
			"Internal Transfers", })
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Current status of the requested transfer", response = String.class) })
	@GetMapping(value = "/transfers/{transferId}/status", produces = { "application/json" })
	public ResponseEntity<String> getTransferStatus(
			@ApiParam(value = "Transfer identifier", required = true) @PathVariable("transferId") String transferId,
			@ApiParam(value = "Http Servlet request ") @Valid @Context HttpServletRequest httpServletRequest)
			throws Exception {
		httpServletRequest.setCharacterEncoding("UTF-8");
		String version = FdxUtil.getVersion(request);
		if (version != null) {
			schemaService = schemaAdapter.getBean(version);
			return (ResponseEntity) schemaService.getTransferStatus(transferId);
		} else
			return ApiUtil.getDefaultResponse();
	}

	/**
	 * POST /transfers : Request account transfer Create a transfer between accounts
	 *
	 * @param transfer Data of the transfer request (optional)
	 * @return Initial status of the requested transfer (status code 200)
	 */
	@ApiOperation(value = "Request account transfer", nickname = "requestAccountTransfer", notes = "Create a transfer between accounts", response = String.class, tags = {
			"Internal Transfers", })
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Initial status of the requested transfer", response = String.class) })
	@PostMapping(value = "/transfers", produces = { "application/json" }, consumes = { "application/json" })
	public ResponseEntity<String> requestAccountTransfer(
			@ApiParam(value = "Used to de-duplicate requests") @RequestHeader(value = "idempotency-key", required = false) String idempotencyKey,
			@ApiParam(value = "Data of the transfer request") @Valid @RequestBody(required = false) Object transfer,
			@ApiParam(value = "Http Servlet request") @Valid @Context HttpServletRequest httpServletRequest)
			throws Exception {
		httpServletRequest.setCharacterEncoding("UTF-8");
		String version = FdxUtil.getVersion(request);
		if (version != null) {
			if (!version.equals(FdxConstants.API_VERSION_46) && StringUtils.isBlank(idempotencyKey)) {
				return ApiUtil.getInvalidInputResponse();
			}
			schemaService = schemaAdapter.getBean(version);
			return (ResponseEntity) schemaService.postTransfer(transfer, idempotencyKey);
		} else
			return ApiUtil.getDefaultResponse();
	}

	/**
	 * GET /transfers/{transferId} : Get a transfer
	 * Get a transfer been accounts
	 *
	 * @param transferId Transfer identifier (required)
	 * @return Ok (status code 200)
	 */
	@Operation(
			operationId = "getTransfer",
			summary = "Get a transfer",
			tags = { "Internal Transfers" },
			responses = {
					@io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "200", description = "Ok", content = {
							@Content(mediaType = "application/json")
					})
			}
	)
	@GetMapping(value = "/transfers/{transferId}", produces = { "application/json" })
	public ResponseEntity<String> getTransfer(
			@Parameter(name = "transferId", description = "Transfer identifier", required = true) @PathVariable("transferId") String transferId) {
		String version = FdxUtil.getVersion(request);
		if (version != null) {
			schemaService = schemaAdapter.getBean(version);
			return schemaService.getTransfer(transferId);
		} else
			return ApiUtil.getDefaultResponse();
	}

	/**
	 * DELETE /transfers/{transferId} : Cancel transfer
	 * Cancel a transfer between accounts
	 *
	 * @param transferId Transfer identifier (required)
	 * @return Ok (status code 200)
	 */
	@Operation(
			operationId = "cancelTransfer",
			summary = "Cancel transfer",
			tags = { "Internal Transfers" },
			responses = {
					@io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "200", description = "Ok", content = {
							@Content(mediaType = "application/json")
					})
			}
	)
	@DeleteMapping(value = "/transfers/{transferId}", produces = { "application/json" })
	public ResponseEntity<String> cancelTransfer(
			@Parameter(name = "transferId", description = "Transfer identifier", required = true) @PathVariable("transferId") String transferId
	) {
		String version = FdxUtil.getVersion(request);
		if (version != null) {
			schemaService = schemaAdapter.getBean(version);
			return schemaService.cancelTransfer(transferId);
		}
		return ApiUtil.getDefaultResponse();
	}

	/**
	 * GET /transfers : Search for transfers between accounts
	 * Search for transfers
	 *
	 * @param updatedSince Return items that have been created or updated since the update id (optional)
	 * @param searchStartTransferDate Start time for use in retrieval of transfers by transfer date (optional)
	 * @param searchEndTransferDate End time for use in retrieval of transfers by transfer date (optional)
	 * @param searchFromAccountIds Search for transfers by source account (optional)
	 * @param searchToAccountIds Search for transfers by source account (optional)
	 * @param searchStatuses Search for transfers by source account (optional)
	 * @param searchTransferIds Search for transfers by id (optional)
	 * @return Success (status code 200)
	 *         or Start or end date value is not in the ISO 8601 format (status code 400)
	 *         or Data not found for request parameters (status code 404)
	 *         or Catch all exception where request was not processed due to an internal outage/issue. Consider other more specific errors before using this error (status code 500)
	 *         or Error when FdxVersion in Header is not one of those implemented at backend (status code 501)
	 *         or System is down for maintenance (status code 503)
	 */
	@Operation(
			operationId = "searchForTransfers",
			summary = "Search for transfers between accounts",
			tags = { "Internal Transfers" },
			responses = {
					@io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "200", description = "Success", content = {
							@Content(mediaType = "application/json")
					}),
					@io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "400", description = "Start or end date value is not in the ISO 8601 format", content = {
							@Content(mediaType = "application/json")
					}),
					@io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "404", description = "Data not found for request parameters", content = {
							@Content(mediaType = "application/json")
					}),
					@io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "500", description = "Catch all exception where request was not processed due to an internal outage/issue. Consider other more specific errors before using this error", content = {
							@Content(mediaType = "application/json")
					}),
					@io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "501", description = "Error when FdxVersion in Header is not one of those implemented at backend", content = {
							@Content(mediaType = "application/json")
					}),
					@io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "503", description = "System is down for maintenance", content = {
							@Content(mediaType = "application/json")
					})
			}
	)
  @GetMapping(value = "/transfers", produces = {"application/json"})
  public ResponseEntity<String> searchForTransfers(
      @Parameter(name = "updatedSince", description = "Return items that have been created or updated since the update id") @Valid @RequestParam(value = "updatedSince", required = false) String updatedSince,
      @Size(max = 10) @Parameter(name = "searchStartTransferDate", description = "Start time for use in retrieval of transfers by transfer date") @Valid @RequestParam(value = "searchStartTransferDate", required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate searchStartTransferDate,
      @Size(max = 10) @Parameter(name = "searchEndTransferDate", description = "End time for use in retrieval of transfers by transfer date") @Valid @RequestParam(value = "searchEndTransferDate", required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate searchEndTransferDate,
      @Parameter(name = "searchFromAccountIds", description = "Search for transfers by source account") @Valid @RequestParam(value = "searchFromAccountIds", required = false) List<String> searchFromAccountIds,
      @Parameter(name = "searchToAccountIds", description = "Search for transfers by source account") @Valid @RequestParam(value = "searchToAccountIds", required = false) List<String> searchToAccountIds,
      @Parameter(name = "searchStatuses", description = "Search for transfers by source account") @Valid @RequestParam(value = "searchStatuses", required = false) List<PaymentStatus> searchStatuses,
      @Parameter(name = "searchTransferIds", description = "Search for transfers by id") @Valid @RequestParam(value = "searchTransferIds", required = false) List<String> searchTransferIds
  ) {
    String version = FdxUtil.getVersion(request);
    if (version != null) {
      schemaService = schemaAdapter.getBean(version);
      return schemaService.searchForTransfers(updatedSince, searchStartTransferDate,
					searchEndTransferDate, searchFromAccountIds, searchToAccountIds, searchStatuses, searchTransferIds);
    }
    return ApiUtil.getDefaultResponse();
  }
}
