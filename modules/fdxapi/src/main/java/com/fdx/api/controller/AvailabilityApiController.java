package com.fdx.api.controller;

import com.fdx.api.adapter.service.ServiceAdapterApi;
import com.fdx.api.factory.FdxApiFactory;
import com.fdx.common.util.ApiUtil;
import com.fdx.common.util.FdxUtil;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-08-04T15:51:27.597870500+05:30[Asia/Calcutta]")
@Controller
//@RequestMapping("${openapi.fDXV45ForCodeGen.base-path:/fdx/v4}")
public class AvailabilityApiController {

	ServiceAdapterApi<?> schemaService;

	@Autowired
	FdxApiFactory schemaAdapter;

	ApiUtil apiUtil;
	String errorResponse = null;
	private final NativeWebRequest request;

	@org.springframework.beans.factory.annotation.Autowired
	public AvailabilityApiController(NativeWebRequest request) {
		this.request = request;
	}

	public Optional<NativeWebRequest> getRequest() {
		return Optional.ofNullable(request);
	}

	private static final Logger logger = LoggerFactory.getLogger(AvailabilityApiController.class);

	/**
	 * GET /availability : Get API availability Get information about this API&#39;s
	 * availability
	 *
	 * @return Status and planned times of API availability (status code 200)
	 * @throws Exception
	 */
	@ApiOperation(value = "Get API availability", nickname = "getAvailability", notes = "Get information about this API's availability", response = String.class, tags = {
			"Meta", })
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Status and planned times of API availability", response = String.class) })
	@GetMapping(value = "/availability", produces = { "application/json" })
	public ResponseEntity<String> getAvailability() throws Exception {
		String version = FdxUtil.getVersion(request);
		ResponseEntity entity;
		if (version != null) {
//		Get Accounts
			Object availability = null;
			logger.info("Get Availability");
			schemaService = schemaAdapter.getBean(version);
			entity = (ResponseEntity) schemaService.getAvailability();
//			Response
			return entity;
		} else
			return ApiUtil.getDefaultResponse();
	}
}
