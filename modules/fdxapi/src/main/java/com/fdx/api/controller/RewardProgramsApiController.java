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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-08-25T15:53:23.152659800+05:30[Asia/Calcutta]")
@Controller
//@RequestMapping("${openapi.fDXV46.base-path:/fdx/v4}")
public class RewardProgramsApiController {

	ServiceAdapterApi<?> schemaService;

	@Autowired
	FdxApiFactory schemaAdapter;
	
	String errorResponse = null;
	ApiUtil apiUtil;
	
	private final NativeWebRequest request;

	@org.springframework.beans.factory.annotation.Autowired
	public RewardProgramsApiController(NativeWebRequest request) {
		this.request = request;
	}

	public Optional<NativeWebRequest> getRequest() {
		return Optional.ofNullable(request);
	}

	private static final Logger logger = LoggerFactory.getLogger(AccountsApiController.class);

	/**
	 * GET /reward-programs/{rewardProgramId}/categories : Get reward categories Get
	 * reward categories
	 *
	 * @param rewardProgramId Reward Program Identifier (required)
	 * @return Data describing a reward program&#39;s categories (status code 200)
	 * @throws Exception
	 * @throws JsonProcessingException
	 */
	@ApiOperation(value = "Get reward categories", nickname = "getRewardProgramCategories", notes = "Get reward categories", response = String.class, tags = {
			"Reward Program Categories", })
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Data describing a reward program's categories", response = String.class) })
	@GetMapping(value = "/reward-programs/{rewardProgramId}/categories", produces = { "application/json" })
	public ResponseEntity<String> getRewardProgramCategories(
			@ApiParam(value = "Reward Program Identifier", required = true) @PathVariable("rewardProgramId") String rewardProgramId,
			@ApiParam(value = "Opaque cursor used by the provider to send the next set of records") @Valid @RequestParam(value = "offset", required = false) String offset,
			@ApiParam(value = "Http Servlet request ") @Valid @Context HttpServletRequest httpServletRequest,
			@ApiParam(value = "Number of elements that the consumer wishes to receive. Providers should implement reasonable default and maximum values") @Valid @RequestParam(value = "limit", required = false) Integer limit)
			throws JsonProcessingException, Exception {
			String uriPath = httpServletRequest.getServletPath();
			String query = httpServletRequest.getQueryString();
		String version = FdxUtil.getVersion(request);
		if (version != null) {
			limit = FdxUtil.getLimit(limit);

				if (offset == null)
					offset = "0";

				logger.info("In RewardProgramsApiController: getRewardProgramCategories: for Version: " + version);
				schemaService = schemaAdapter.getBean(version);
				return (ResponseEntity) schemaService.getRewardProgramCategories(rewardProgramId, limit, offset,
						uriPath);
			} else
				return ApiUtil.getDefaultResponse();
	}

	/**
	 * GET /reward-programs/{rewardProgramId} : Get reward program Get a specific
	 * reward program
	 *
	 * @param rewardProgramId Reward Program Identifier (required)
	 * @return Data describing reward programs associated with accounts (status code
	 *         200)
	 * @throws Exception
	 * @throws JsonProcessingException
	 */
	@ApiOperation(value = "Get reward program", nickname = "getRewardProgram", notes = "Get a specific reward program", response = String.class, tags = {
			"Reward Program Information", })
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Data describing reward programs associated with accounts", response = String.class) })
	@GetMapping(value = "/reward-programs/{rewardProgramId}", produces = { "application/json" })
	public ResponseEntity<String> getRewardProgram(
			@ApiParam(value = "Reward Program Identifier", required = true) @PathVariable("rewardProgramId") String rewardProgramId,
			@ApiParam(value = "Http Servlet request ") @Valid @Context HttpServletRequest httpServletRequest)
			throws JsonProcessingException, Exception {
			String query = httpServletRequest.getQueryString();
		String version = FdxUtil.getVersion(request);
		if (version != null) {
				schemaService = schemaAdapter.getBean(version);
				return (ResponseEntity) schemaService.getRewardProgram(rewardProgramId);
			} else
				return ApiUtil.getDefaultResponse();
	}

	/**
	 * GET /reward-programs : Search reward programs Query all reward programs
	 *
	 * @return Data describing reward programs associated with accounts (status code
	 *         200)
	 * @throws Exception
	 * @throws JsonProcessingException
	 */
	@ApiOperation(value = "Search reward programs", nickname = "searchRewardPrograms", notes = "Query all reward programs", response = String.class, tags = {
			"Reward Program Information", })
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Data describing reward programs associated with accounts", response = String.class) })
	@GetMapping(value = "/reward-programs", produces = { "application/json" })
	public ResponseEntity<String> searchRewardPrograms(
			@ApiParam(value = "Http Servlet request ") @Valid @Context HttpServletRequest httpServletRequest)
			throws Exception {
			String uriPath = httpServletRequest.getServletPath();
			String query = httpServletRequest.getQueryString();
			String version = FdxUtil.getVersion(request);
			if (version != null) {
//				Get Accounts
				logger.info("In Customer Controller: Get Customers: for Version: " + version);
				schemaService = schemaAdapter.getBean(version);
				return (ResponseEntity<String>) schemaService.getRewardPrograms(uriPath);
			} else
				return ApiUtil.getDefaultResponse();
	}
}
