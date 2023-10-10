package com.fdx.api.controller;

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
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.NativeWebRequest;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.Optional;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-08-25T15:53:23.152659800+05:30[Asia/Calcutta]")
@Controller
//@RequestMapping("${openapi.fDXV46.base-path:/fdx/v4}")
public class TaxFormsApiController {

	ServiceAdapterApi<?> schemaService;

	@Autowired
	FdxApiFactory schemaAdapter;

	String errorResponse = null;
	ApiUtil apiUtil;
	private final NativeWebRequest request;

	@org.springframework.beans.factory.annotation.Autowired
	public TaxFormsApiController(NativeWebRequest request) {
		this.request = request;
	}

	public Optional<NativeWebRequest> getRequest() {
		return Optional.ofNullable(request);
	}

	/**
	 * GET /tax-forms : Search tax forms Get the full lists of tax data and tax form
	 * images available for a specific year for the current authorized customer
	 *
	 * @param taxYears     One or more tax years in which to search for tax forms.
	 *                     Comma separated (optional)
	 * @param taxForms     One or more tax form enums for the specific forms being
	 *                     requested. Comma separated (optional)
	 * @param contentTypes One or more content-types to request from the search.
	 *                     Comma separated (optional)
	 * @param resultType   Flag to indicate if you want a lightweight array of Tax
	 *                     entities or the full tax form details. If set to
	 *                     &#39;lightweight&#39;, should only return the fields
	 *                     associated with the Tax entity. This field is not
	 *                     required, but defaults to lightweight (optional, default
	 *                     to lightweight)
	 * @return Array of metadata for all the tax data and tax form images available
	 *         for the customer matching search criteria (status code 200) or
	 *         Partial Content success searching for customer Tax Data forms, some
	 *         errors are being returned (status code 206)
	 */

	private static final Logger logger = LoggerFactory.getLogger(TaxFormsApiController.class);

	@ApiOperation(value = "Search tax forms", nickname = "searchForTaxForms", notes = "Get the full lists of tax data and tax form images available for a specific year for the current authorized customer", response = String.class, tags = {
			"Tax Forms", })
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Array of metadata for all the tax data and tax form images available for the customer matching search criteria", response = String.class),
			@ApiResponse(code = 206, message = "Partial Content success searching for customer Tax Data forms, some errors are being returned", response = String.class) })
	@GetMapping(value = "/tax-forms", produces = { "application/json" })
	public ResponseEntity<String> searchForTaxForms(
			@ApiParam(value = "One or more tax years in which to search for tax forms. Comma separated") @Valid @RequestParam(value = "taxYears", required = false) List<Integer> taxYears,
			@ApiParam(value = "One or more tax form enums for the specific forms being requested. Comma separated") @Valid @RequestParam(value = "taxForms", required = false) List<String> taxForms,
			@ApiParam(value = "One or more content-types to request from the search. Comma separated") @Valid @RequestParam(value = "contentTypes", required = false) List<String> contentTypes,
			@ApiParam(value = "Http Servlet request ") @Valid @Context HttpServletRequest httpServletRequest,
			@ApiParam(value = "Flag to indicate if you want a lightweight array of Tax entities or the full tax form details. If set to 'lightweight', should only return the fields associated with the Tax entity. This field is not required, but defaults to lightweight", allowableValues = "lightweight, details", defaultValue = "lightweight") @Valid @RequestParam(value = "resultType", required = false, defaultValue = "lightweight") String resultType)
			throws Exception {
			String uriPath = httpServletRequest.getServletPath();
			String query = httpServletRequest.getQueryString();
			String version = FdxUtil.getVersion(request);
			if (version != null) {
				logger.info(
						"In Controller: searchForTaxForms for taxyears: " + taxYears + ", taxForms:" + taxForms);
				schemaService = schemaAdapter.getBean(version);
				return (ResponseEntity) schemaService.getTaxForms(taxYears, taxForms, contentTypes, uriPath,
						resultType, query);
			} else
				return ApiUtil.getDefaultResponse();
	}

    /**
     * POST /tax-forms : Create tax form
     * Submit the data for a specific tax form
     *
     * @param taxData  (optional)
     * @return Created form for the tax data submitted (status code 201)
     *         or Partial Content success creating customer Tax Data forms, some errors are being returned (status code 206)
     */
    @ApiOperation(value = "Create tax form", nickname = "createTaxForm", notes = "Submit the data for a specific tax form", response = String.class, tags={ "Submit Tax Forms", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created form for the tax data submitted", response = String.class),
        @ApiResponse(code = 206, message = "Partial Content success creating customer Tax Data forms, some errors are being returned", response = String.class)})
    @PostMapping(
        value = "/tax-forms",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    public ResponseEntity<String> createTaxForm(
			@ApiParam(value = "Http Servlet request ") @Valid @Context HttpServletRequest httpServletRequest,
			@ApiParam(value = ""  )  @Valid @RequestBody(required = false) List<Object> taxData) 
			throws Exception {
				return ApiUtil.getDefaultResponse();	
    }


	/**
	 * GET /tax-forms/{taxFormId} : Retrieve tax form Get the form image or TaxData
	 * as json for a single tax form for the customer
	 * 
	 * @param <T>
	 * 
	 * @param <T>
	 *
	 * @param taxFormId The unique ID for this tax form (required)
	 * @param accept    Document format (required)
	 * @return
	 * @return The form image or Tax Data as json for a single tax form for the
	 *         customer (status code 200) or Partial Content success retrieving
	 *         customer Tax Data forms, some errors are being returned (status code
	 *         206) or Document not available for &#39;Accept&#39; header&#39;s
	 *         content-type (status code 406)
	 * @throws Exception
	 */
	@ApiOperation(value = "Retrieve tax form", nickname = "getTaxForm", notes = "Get the form image or TaxData as json for a single tax form for the customer", response = org.springframework.core.io.Resource.class, tags = {
			"Tax Forms", })
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "The form image or Tax Data as json for a single tax form for the customer", response = org.springframework.core.io.Resource.class),
			@ApiResponse(code = 206, message = "Partial Content success retrieving customer Tax Data forms, some errors are being returned", response = Object.class, responseContainer = "List"),
			@ApiResponse(code = 406, message = "Document not available for 'Accept' header's content-type", response = Error.class) })
	@GetMapping(value = "/tax-forms/{taxFormId}", produces = { "application/pdf", "image/gif", "image/jpeg",
			"image/tiff", "image/png", "application/json" })
	public ResponseEntity<String> getTaxForm(
			@Size(max = 256) @ApiParam(value = "The unique ID for this tax form", required = true) @PathVariable("taxFormId") String taxFormId,
			@ApiParam(value = "Document format", required = true, allowableValues = "application/pdf, image/gif, image/jpeg, image/tiff, image/png, application/json") @RequestHeader(value = "Accept", required = true) Object accept)
			throws Exception {
		String version = FdxUtil.getVersion(request);
		if (accept == null || accept.equals("*/*")) {
			String errorCode = "401";
			String message = " Invalid Input - content type is mandatory";
			errorResponse = ApiUtil.getErrorObject(errorCode, message);
			HttpHeaders responseHeaders = new HttpHeaders();
			responseHeaders.setContentType(new MediaType("application", "json"));
			return new ResponseEntity<>(errorResponse, responseHeaders, HttpStatus.BAD_REQUEST);
		}
		if (version != null) {
			schemaService = schemaAdapter.getBean(version);
			return (ResponseEntity) schemaService.getTaxFormByID(taxFormId, version, accept);
		} else
			return ApiUtil.getDefaultResponse();
	}

    /**
     * PUT /tax-forms/{taxFormId} : Update tax form
     * Update tax document. Allows you to upload and replace binaries or json document
     *
     * @param taxFormId form ID (required)
     * @param taxData  (optional)
     * @return Ok (status code 200)
     *         or Partial Content success updating customer Tax Data forms, some errors are being returned (status code 206)
     *         or Server does not support the content type uploaded (status code 415)
     */
    @ApiOperation(value = "Update tax form", nickname = "updateTaxForm", notes = "Update tax document. Allows you to upload and replace binaries or json document", tags={ "Submit Tax Forms", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok"),
        @ApiResponse(code = 206, message = "Partial Content success updating customer Tax Data forms, some errors are being returned", response = String.class),
        @ApiResponse(code = 415, message = "Server does not support the content type uploaded", response = String.class) })
    @PutMapping(
        value = "/tax-forms/{taxFormId}",
        produces = { "application/json" },
        consumes = { "application/json", "application/pdf", "image/gif", "image/jpeg", "image/tiff", "image/png" }
    )
    public ResponseEntity<String> updateTaxForm(
		@Size(max=256) @ApiParam(value = "form ID",required=true) @PathVariable("taxFormId") String taxFormId,
		@ApiParam(value = ""  )  @Valid @RequestBody(required = false) List<Object> taxData) {
        return ApiUtil.getDefaultResponse();
    }
}