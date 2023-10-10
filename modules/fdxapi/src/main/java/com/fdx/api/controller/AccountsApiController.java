package com.fdx.api.controller;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fdx.api.adapter.service.ServiceAdapterApi;
import com.fdx.api.factory.FdxApiFactory;
import com.fdx.common.util.ApiUtil;
import com.fdx.common.util.FdxConstants;
import com.fdx.common.util.FdxUtil;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.apache.commons.lang3.StringUtils;
import org.mapstruct.Context;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ResourceUtils;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
@RestController
@ComponentScan(basePackages = { "com.fdx.adapterfactory" })
public class AccountsApiController {

	ServiceAdapterApi<?> schemaService;

	@Autowired
	FdxApiFactory schemaAdapter;

	String errorResponse = null;

	private final NativeWebRequest request;

	@org.springframework.beans.factory.annotation.Autowired
	public AccountsApiController(NativeWebRequest request) {
		this.request = request;
	}

	public Optional<NativeWebRequest> getRequest() {
		return Optional.ofNullable(request);
	}

	private static final Logger logger = LoggerFactory.getLogger(AccountsApiController.class);


	@ApiOperation(value = "Search for accounts", nickname = "searchForAccounts", notes = "Query all information for a set of accounts provided in the payload", tags = {
			"Account Information",})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Array of accounts (DepositAccount, LoanAccount, LocAccount, InvestmentAccount, InsuranceAccount or AnnuityAccount)")})
	@GetMapping(value = "/accounts", produces = {"application/json"})
	public ResponseEntity<String> searchForAccounts(
			@ApiParam(value = "Comma separated list of account ids") @Valid @RequestParam(value = "accountIds", required = false) List<String> accountIds,
			@ApiParam(value = "Start time for use in retrieval of transactions") @RequestParam(value = "startTime", required = false) String startTime,
			@ApiParam(value = "End time for use in retrieval of transactions") @RequestParam(value = "endTime", required = false) String endTime,
			@ApiParam(value = "Flag to indicate if you want a lightweight array of descriptors or full account details. If set to 'lightweight', should only return the fields associated with the AccountDescriptor entity. This field is not required, but defaults to lightweight", allowableValues = "lightweight, details", defaultValue = "lightweight") @Valid @RequestParam(value = "resultType", required = false, defaultValue = "lightweight") String resultType,
			@ApiParam(value = "Opaque cursor used by the provider to send the next set of records") @Valid @RequestParam(value = "offset", required = false) String offset,
			@ApiParam(value = "Http Servlet request ") @Valid @Context HttpServletRequest httpServletRequest,
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

			// Get Accounts
			logger.info("In Controller: Get Accounts for accountIds: " + accountIds + " version:" + version);
			schemaService = schemaAdapter.getBean(version);
			return (ResponseEntity) schemaService.searchForAccounts(accountIds, limit, offset, resultType, uriPath,
					startTime, endTime, query);
		} else
			return ApiUtil.getDefaultResponse();
	}

	/**
	 * GET /accounts/{accountId} : Get an account Get a specific account
	 *
	 * @param accountId Account Identifier (required)
	 * @return This can be one of LoanAccount, DepositAccount, LocAccount,
	 *         InvestmentAccount, InsuranceAccount or AnnuityAccount (status code
	 *         200)
	 * @throws Exception
	 */
	@ApiOperation(value = "Get an account", nickname = "getAccount", notes = "Get a specific account", response = String.class, tags = {
			"Account Information", })
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "This can be one of LoanAccount, DepositAccount, LocAccount, InvestmentAccount, InsuranceAccount or AnnuityAccount", response = String.class) })
	@GetMapping(value = "/accounts/{accountId}", produces = { "application/json" })
	public ResponseEntity<String> getAccount(
			@ApiParam(value = "Account Identifier", required = true) @PathVariable("accountId") String accountId)
			throws Exception {
		String version = FdxUtil.getVersion(request);
		if (version != null) {
			schemaService = schemaAdapter.getBean(version);
			return (ResponseEntity) schemaService.getAccount(accountId);
		} else
			return ApiUtil.getDefaultResponse();
	}

	/**
	 * GET /accounts/{accountId}/contact : Get an account&#39;s contact information
	 * Get information on the account
	 *
	 * @param accountId Account Identifier (required)
	 * @return Details used to verify an account (status code 200)
	 * @throws Exception
	 */
	@ApiOperation(value = "Get an account's contact information", nickname = "getAccountContact", notes = "Get contact information on the account", response = String.class, tags = {
			"Personal Information", })
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Details used to verify an account", response = String.class) })
	@GetMapping(value = "/accounts/{accountId}/contact", produces = { "application/json" })
	public ResponseEntity<String> getAccountContact(
			@ApiParam(value = "Account Identifier", required = true) @PathVariable("accountId") String accountId)
			throws Exception {
		String version = FdxUtil.getVersion(request);
		if (version != null) {
			Object accountContact = null;
			schemaService = schemaAdapter.getBean(version);
			return (ResponseEntity) schemaService.getAccountContact(accountId);
		} else
			return ApiUtil.getDefaultResponse();
	}

	/**
	 * GET /accounts/{accountId}/transactions : Search for account transactions
	 * Search for account transactions. Example:
	 * /accounts/{accountId}/transactions?startTime&#x3D;value1&amp;endTime&#x3D;value2
	 *
	 * @param accountId Account Identifier (required)
	 * @param startTime Start time for use in retrieval of transactions (ISO 8601)
	 *                  (optional)
	 * @param endTime   End time for use in retrieval of transactions (ISO 8601)
	 *                  (optional)
	 * @param offset    Opaque cursor used by the provider to send the next set of
	 *                  records (optional)
	 * @param limit     Number of elements that the consumer wishes to receive.
	 *                  Providers should implement reasonable default and maximum
	 *                  values (optional)
	 * @return Paginated collection of transactions, which can be one of
	 *         DepositTransaction, LoanTransaction, LocTransaction,
	 *         InvestmentTransaction or InsuranceTransaction (status code 200)
	 * @throws Exception
	 */
	@ApiOperation(value = "Search for account transactions", nickname = "searchForAccountTransactions", notes = "Search for account transactions. Example: /accounts/{accountId}/transactions?startTime=value1&endTime=value2", response = String.class, tags = {
			"Account Transactions", })
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Paginated collection of transactions, which can be one of DepositTransaction, LoanTransaction, LocTransaction, InvestmentTransaction or InsuranceTransaction", response = String.class) })
	@GetMapping(value = "/accounts/{accountId}/transactions", produces = { "application/json" })
	public ResponseEntity<String> searchForAccountTransactions(
			@ApiParam(value = "Account Identifier", required = true) @PathVariable("accountId") String accountId,
			@ApiParam(value = "Start time for use in retrieval of transactions (ISO 8601)") @RequestParam(value = "startTime", required = false) String startTime,
			@ApiParam(value = "End time for use in retrieval of transactions (ISO 8601)") @RequestParam(value = "endTime", required = false) String endTime,
			@ApiParam(value = "Opaque cursor used by the provider to send the next set of records") @Valid @RequestParam(value = "offset", required = false) String offset,
			@ApiParam(value = "Http Servlet request ") @Valid @Context HttpServletRequest httpServletRequest,
			@ApiParam(value = "Number of elements that the consumer wishes to receive. Providers should implement reasonable default and maximum values") @Valid @RequestParam(value = "limit", required = false) Integer limit)
			throws Exception {
		String uriPath = httpServletRequest.getServletPath();
		String query = httpServletRequest.getQueryString();
		String version = FdxUtil.getVersion(request);
		if (version != null) {
			limit = FdxUtil.getLimit(limit);

			if (offset == null)
				offset = "0";
		}

//		Get Accounts
		Object transactions = null;
		if (FdxUtil.getImplementedVersions().contains(version)) {
			schemaService = schemaAdapter.getBean(version);
			return (ResponseEntity) schemaService.searchForAccountTransactions(accountId, startTime, endTime, limit, offset,
					uriPath, query);
		} else
			return ApiUtil.getDefaultResponse();
	}

	@ApiOperation(value = "Get account transaction image", nickname = "getAccountTransactionImages", notes = "Get account transaction image", response = org.springframework.core.io.Resource.class, tags = {
			"Account Transactions", })
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "An image of transaction (such as a scanned check)", response = org.springframework.core.io.Resource.class) })
	@GetMapping(value = "/accounts/{accountId}/transaction-images/{imageId}", produces = { "image/gif" })
	public <T> ResponseEntity<T> getAccountTransactionImages(
			@ApiParam(value = "Account Identifier", required = true) @PathVariable("accountId") String accountId,
			@ApiParam(value = "Image Identifier", required = true) @PathVariable("imageId") String imageId)
			throws Exception {
		String version = FdxUtil.getVersion(request);
		if (version != null) {
			schemaService = schemaAdapter.getBean(version);
			return (ResponseEntity) schemaService.getAccountTransactionImages(accountId, imageId);
		} else {
			HttpHeaders responseHeaders = new HttpHeaders();
			responseHeaders.setContentType(new MediaType("application", "json"));
			return new ResponseEntity(ApiUtil.getErrorObject("1106", FdxConstants.DEFAULT_RESPONSE), responseHeaders, HttpStatus.NOT_IMPLEMENTED);
		}
	}

	@ApiOperation(value = "Search for statements", nickname = "searchForAccountStatements", notes = "Get account statements. Example: GET /accounts/{accountId}/statements?startTime=value1&endTime=value2", response = String.class, tags = {
			"Account Statements", })
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Paginated list of available statements", response = String.class) })
	@GetMapping(value = "/accounts/{accountId}/statements", produces = { "application/json" })
	public <T> ResponseEntity<T> searchForAccountStatements(
			@ApiParam(value = "Account Identifier", required = true) @PathVariable("accountId") String accountId,
			@ApiParam(value = "Start time for use in retrieval of transactions (ISO 8601)") @Valid @RequestParam(value = "startTime", required = false) String startTime,
			@ApiParam(value = "End time for use in retrieval of transactions (ISO 8601)") @Valid @RequestParam(value = "endTime", required = false) String endTime,
			@ApiParam(value = "Opaque cursor used by the provider to send the next set of records") @Valid @RequestParam(value = "offset", required = false) String offset,
			@ApiParam(value = "Http Servlet request ") @Valid @Context HttpServletRequest httpServletRequest,
			@ApiParam(value = "Number of elements that the consumer wishes to receive. Providers should implement reasonable default and maximum values") @Valid @RequestParam(value = "limit", required = false) Integer limit)
			throws Exception {

		String uriPath = httpServletRequest.getServletPath();
		String query = httpServletRequest.getQueryString();
		String version = FdxUtil.getVersion(request);
		if (version != null) {
			limit = FdxUtil.getLimit(limit);

			if (offset == null)
				offset = "0";

			Object transactions = null;
			schemaService = schemaAdapter.getBean(version);
			return (ResponseEntity) schemaService.searchForAccountStatements(accountId, startTime, endTime, limit, offset,
					uriPath, query);
		} else {
			HttpHeaders responseHeaders = new HttpHeaders();
			responseHeaders.setContentType(new MediaType("application", "json"));
			return new ResponseEntity(ApiUtil.getErrorObject("1106", FdxConstants.DEFAULT_RESPONSE), responseHeaders, HttpStatus.NOT_IMPLEMENTED);
		}
	}

	@ApiOperation(value = "Search for statements", nickname = "searchForAccountStatements", notes = "Get account statements. Example: GET /accounts/{accountId}/statements?startTime=value1&endTime=value2", response = String.class, tags = {
			"Account Statements", })
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Paginated list of available statements", response = String.class) })
	@GetMapping(value = "/accounts/{accountId}/statements/{statementId}", produces = { "application/pdf", "image/gif",
			"image/jpeg", "image/tiff", "image/png", "application/json" })
	public <T> ResponseEntity<T> getAccountStatement(
			@ApiParam(value = "Account Identifier", required = true) @PathVariable("accountId") String accountId,
			@ApiParam(value = "Statement Identifier", required = true) @PathVariable("statementId") String statementId,
			@ApiParam(value = "Http Servlet request ") @Valid @Context HttpServletRequest httpServletRequest,
			@ApiParam(value = "Document format", required = true, allowableValues = "application/pdf, image/gif, image/jpeg, image/tiff, image/png, application/json") @RequestHeader(value = "Accept", required = true) Object accept)
			throws Exception {
		String uriPath = httpServletRequest.getServletPath();
		// Version
		String version = request.getHeader(FdxConstants.API_VERSION);
		if (StringUtils.isBlank(version)) {
			version = FdxUtil.getLatestVersion();
		}
		if (accept == null || accept.equals("*/*")) {
			String errorCode = "401";
			String message = " Invalid Input - content type is mandatory";
			Object obj = ApiUtil.getErrorObject(errorCode, message);
			HttpHeaders responseHeaders = new HttpHeaders();
			responseHeaders.setContentType(new MediaType("application", "json"));
			return new ResponseEntity<T>((T) obj.toString(), responseHeaders, HttpStatus.BAD_REQUEST);
		}
		if (accept.equals("application/json")) {
			String errorCode = "401";
			String message = "Document not available for 'Accept' header's content-type";
			Object obj = ApiUtil.getErrorObject(errorCode, message);
			HttpHeaders responseHeaders = new HttpHeaders();
			responseHeaders.setContentType(new MediaType("application", "json"));
			return new ResponseEntity<T>((T) obj.toString(), responseHeaders, HttpStatus.NOT_ACCEPTABLE);
		}
		if (FdxUtil.getImplementedVersions().contains(version)) {
			schemaService = schemaAdapter.getBean(version);
			return (ResponseEntity) schemaService.getAccountStatement(accountId, statementId);
		} else {
			HttpHeaders responseHeaders = new HttpHeaders();
			responseHeaders.setContentType(new MediaType("application", "json"));
			return new ResponseEntity(ApiUtil.getErrorObject("1106", FdxConstants.DEFAULT_RESPONSE), responseHeaders, HttpStatus.NOT_IMPLEMENTED);
		}
	}

	/**
	 * GET /accounts/{accountId}/payment-networks : Get payment networks supported
	 * by the account Get payment networks supported by the account
	 *
	 * @param accountId Account Identifier (required)
	 * @param offset    Opaque cursor used by the provider to send the next set of
	 *                  records (optional)
	 * @param limit     Number of elements that the consumer wishes to receive -
	 *                  Providers should implement reasonable defaults and maximum
	 *                  (optional)
	 * @return Information required to execute a payment transaction against this
	 *         account (status code 200)
	 * @throws Exception
	 */
	@ApiOperation(value = "Get payment networks supported by the account", nickname = "getAccountPaymentNetworks", notes = "Get payment networks supported by the account", response = String.class, tags = {
			"Money Movement", })
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Information required to execute a payment transaction against this account", response = String.class) })
	@GetMapping(value = "/accounts/{accountId}/payment-networks", produces = { "application/json" })
	public ResponseEntity<String> getAccountPaymentNetworks(
			@ApiParam(value = "Account Identifier", required = true) @PathVariable("accountId") String accountId,
			@ApiParam(value = "Http Servlet request ") @Valid @Context HttpServletRequest httpServletRequest,
			@ApiParam(value = "Opaque cursor used by the provider to send the next set of records") @Valid @RequestParam(value = "offset", required = false) String offset,
			@ApiParam(value = "Number of elements that the consumer wishes to receive - Providers should implement reasonable defaults and maximum") @Valid @RequestParam(value = "limit", required = false) Integer limit)
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
			return (ResponseEntity) schemaService.getAccountPaymentNetworks(accountId, limit, offset, uriPath,
					query);
		} else
			return ApiUtil.getDefaultResponse();
	}

	@GetMapping(value = "/utilityService/chequeImage", produces = { "application/json" })
	public ResponseEntity<byte[]> getChequeImage(
			@ApiParam(value = "Account Identifier") @RequestParam(value = "accountId", required = false) String accountId,
			@ApiParam(value = "Statement Identifier", required = false) @RequestParam(value = "statementId", required = false) String statementId) throws IOException {
		File f;

		byte[] imageBytes = null;
		try {
			f = ResourceUtils.getFile("classpath:/images/cheque.jpg");
			InputStream targetStream = new FileInputStream(f);
			imageBytes = StreamUtils.copyToByteArray(targetStream);
		} catch (IOException e) {
			logger.error("IOException occured in api /utilityService/chequeImage ", e.getMessage());
			throw e;
		}
		return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(imageBytes);
	}

	public String getSerializedObject(Object response) throws JsonProcessingException {
		ObjectMapper objectMapper = FdxUtil.getObjectMapper();
		objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		return objectMapper.writeValueAsString(response);
	}

	@Autowired
	private RequestMappingHandlerMapping requestMappingHandlerMapping;

	@GetMapping("/endpoints")
	public ResponseEntity<List<String>> getEndpoints() {
		return new ResponseEntity<>(requestMappingHandlerMapping.getHandlerMethods().keySet().stream()
				.map(RequestMappingInfo::toString).collect(Collectors.toList()), HttpStatus.OK);
	}
}
