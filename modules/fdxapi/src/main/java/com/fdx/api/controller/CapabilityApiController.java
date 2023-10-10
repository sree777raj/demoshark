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
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
@Controller
@ComponentScan(basePackages = { "com.fdx.adapterfactory" })
//@RequestMapping("${openapi.fDXV46.base-path:/fdx/v4}")
public class CapabilityApiController {

	ServiceAdapterApi<?> schemaService;

	@Autowired
	FdxApiFactory schemaAdapter;

	ApiUtil apiUtil;
	String errorResponse = null;
	private final NativeWebRequest request;

	@org.springframework.beans.factory.annotation.Autowired
	public CapabilityApiController(NativeWebRequest request) {
		this.request = request;
	}

	public Optional<NativeWebRequest> getRequest() {
		return Optional.ofNullable(request);
	}

	private static final Logger logger = LoggerFactory.getLogger(CapabilityApiController.class);

	@ApiOperation(value = "Get API capability", nickname = "getCapability", notes = "Get information about this API's capability", tags = {
			"Meta", })
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "API's capability for connections, cutoff times and product types") })
	@GetMapping(value = "/capability", produces = { "application/json" })
	public ResponseEntity<String> getCapability() throws Exception {
		{
			String version = FdxUtil.getVersion(request);
			if (version != null) {
//				Get Capability
				String accounts = null;
				schemaService = schemaAdapter.getBean(version);
				return (ResponseEntity) schemaService.getCapability();
			} else
				return ApiUtil.getDefaultResponse();
		}
	}
}
