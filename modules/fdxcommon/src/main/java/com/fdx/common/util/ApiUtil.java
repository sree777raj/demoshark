package com.fdx.common.util;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

/**
 * Util class
 */
public class ApiUtil {

	public static String getErrorObject(String code, String message) {
		StringBuilder sb = new StringBuilder();
		sb.append("{\n");

		sb.append("    \"code\" : ").append("\"").append(toIndentedString(code)).append("\",").append("\n");
		sb.append("    \"message\" : ").append("\"").append(toIndentedString(message)).append("\"").append("\n");
		sb.append("}");
		return sb.toString();
	}

	private static String toIndentedString(Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

	public static ResponseEntity<String> getDefaultResponse() {
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.setContentType(new MediaType("application", "json"));
		return new ResponseEntity<>(getErrorObject("1106", FdxConstants.DEFAULT_RESPONSE), responseHeaders, HttpStatus.NOT_IMPLEMENTED);
	}

	public static ResponseEntity getInvalidInputResponse() {
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.setContentType(new MediaType("application", "json"));
		return new ResponseEntity<>(getErrorObject("401", "Invalid Input"), responseHeaders, HttpStatus.BAD_REQUEST);
	}

	public ApiUtil() {
	}
}
