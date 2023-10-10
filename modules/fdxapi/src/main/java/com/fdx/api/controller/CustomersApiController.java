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
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.NativeWebRequest;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.Optional;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-08-04T15:51:27.597870500+05:30[Asia/Calcutta]")
@Controller
//@RequestMapping("${openapi.fDXV45ForCodeGen.base-path:/fdx/v4}")
public class CustomersApiController {


	ServiceAdapterApi<?> schemaService;

	@Autowired
	FdxApiFactory schemaAdapter;
	
	ApiUtil apiUtil;
	String errorResponse = null;

	private final NativeWebRequest request;

	@org.springframework.beans.factory.annotation.Autowired
	public CustomersApiController(NativeWebRequest request) {
		this.request = request;
	}

	public Optional<NativeWebRequest> getRequest() {
		return Optional.ofNullable(request);
	}

	private static final Logger logger = LoggerFactory.getLogger(AccountsApiController.class);

	@ApiOperation(value = "Retrieve customers", nickname = "getCustomers", notes = "Retrieve account holders related to consented accounts", tags = {
			"Personal Information", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Customers") })
	@GetMapping(value = "/customers", produces = { "application/json" })
	public ResponseEntity<String> getCustomers(
			@ApiParam(value = "Opaque cursor used by the provider to send the next set of records") @RequestParam(value = "offset", required = false) String offset,
			@ApiParam(value = "Number of elements that the consumer wishes to receive - Providers should implement reasonable defaults and maximum") @RequestParam(value = "limit", required = false) Integer limit,
			@ApiParam(value = "Http Servlet request ") @Valid @Context HttpServletRequest httpServletRequest)
			throws Exception {
		String uriPath = httpServletRequest.getServletPath();
		String query = httpServletRequest.getQueryString();
		String version = FdxUtil.getVersion(request);
		if (version != null) {
			limit = FdxUtil.getLimit(limit);

			if (offset == null)
				offset = "0";
			logger.info("In Customer Controller: Get Customers: for Version: " + version);
			schemaService = schemaAdapter.getBean(version);
			return (ResponseEntity) schemaService.getCustomers(limit, offset, uriPath, query);
		} else
			return ApiUtil.getDefaultResponse();
	}

	/**
	 * GET /customers/{customerId} : Customer by id Retrieve customer information by
	 * customer id
	 *
	 * @param customerId Customer Identifier (required)
	 * @return Customer (status code 200)
	 * @throws Exception
	 */
	@ApiOperation(value = "Customer by id", nickname = "getCustomer", notes = "Retrieve customer information by customer id", tags = {
			"Personal Information", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Customer") })
	@GetMapping(value = "/customers/{customerId}", produces = { "application/json" })
	public ResponseEntity<String> getCustomer(
			@ApiParam(value = "Customer Identifier", required = true) @PathVariable("customerId") String customerId)
			throws Exception {
		String version = FdxUtil.getVersion(request);
		if (version != null) {
			logger.info("In Customer Controller: Get Customers: for Version: " + version);
			schemaService = schemaAdapter.getBean(version);
			return (ResponseEntity) schemaService.getCustomerById(customerId);
		} else
			return ApiUtil.getDefaultResponse();
	}

	/**
	 * GET /customers/current : Get current authenticated customer information Get
	 * information about the customer within the authorization scope
	 *
	 * @return Data describing current authenticated customer (status code 200)
	 * @throws Exception
	 * @throws JsonProcessingException
	 */
	@ApiOperation(value = "Get current authenticated customer information", nickname = "getCustomerInfo", notes = "Get information about the customer within the authorization scope", response = String.class, tags = {
			"Personal Information", })
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Data describing current authenticated customer", response = String.class) })
	@GetMapping(value = "/customers/current", produces = { "application/json" })
	public ResponseEntity<String> getCustomerInfo() throws JsonProcessingException, Exception {
		String version = FdxUtil.getVersion(request);
		if (version != null) {
			logger.info("In Customer Controller: Get Customers: for Version: " + version);
			schemaService = schemaAdapter.getBean(version);
			return (ResponseEntity) schemaService.getCurrentCustomerInfo();
		} else
			return ApiUtil.getDefaultResponse();
	}
}
