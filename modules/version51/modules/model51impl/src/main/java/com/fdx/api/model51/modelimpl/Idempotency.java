package com.fdx.api.model51.modelimpl;

import com.fdx.common.util.DeveloperContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fdx.api.model51.config.ConnectionConfigApi51;
import com.fdx.api.model51.model.Idempotency51;
import com.fdx.common.exception.FDXException;

@Repository("Idempotency51")
public class Idempotency implements Idempotency51<Idempotency> {

	NamedParameterJdbcTemplate template;

	@JsonProperty("idempotencykey")
	private String idempotencykey;

	@JsonProperty("apiname")
	private String apiname;

	@JsonProperty("httpstatuscode")
	private int httpstatuscode;

	@JsonProperty("apiresponse")
	private String apiresponse;

	public String getIdempotencykey() {
		return idempotencykey;
	}

	public void setIdempotencykey(String idempotencykey) {
		this.idempotencykey = idempotencykey;
	}

	public String getApiname() {
		return apiname;
	}

	public void setApiname(String apiname) {
		this.apiname = apiname;
	}

	public int getHttpstatuscode() {
		return httpstatuscode;
	}

	public void setHttpstatuscode(int httpstatuscode) {
		this.httpstatuscode = httpstatuscode;
	}

	public String getApiresponse() {
		return apiresponse;
	}

	public void setApiresponse(String apiresponse) {
		this.apiresponse = apiresponse;
	}

	private static final Logger log = LoggerFactory.getLogger(Idempotency.class);

	@Override
	public Boolean ifExists(String idempotencyKey, String apiName) throws FDXException {
		try {
			template = ConnectionConfigApi51.getTemplate();
			int count = template.queryForObject(
					"select count(*) from "+ DeveloperContext.getDeveloperSchema() +".idempotency where idempotencyKey = (:idempotencyKey) and apiname = '"
							+ apiName + "'",
					new MapSqlParameterSource().addValue("idempotencyKey", idempotencyKey).addValue("apiname", apiname),
					Integer.class);
			if (count == 1)
				return true;
			else
				return false;
		} catch (Exception e) {
			log.error("Idempotency : ", e);
			throw new FDXException(e,500);
		}
	}

	@Override
	public void insertIdempotency(String apiResponse, String idempotencyKey, String apiName, int httpStatusCode)
			throws FDXException {
		try {
			template = ConnectionConfigApi51.getTemplate();
			SqlParameterSource parameters = new MapSqlParameterSource("payeeId", null);
			template.update(
					"insert into "+ DeveloperContext.getDeveloperSchema() +".idempotency (idempotencykey,apiname,httpstatuscode,apiresponse) values ('"
							+ idempotencyKey + "','" + apiName + "','" + httpStatusCode + "','"
							+ apiResponse
							+ "') ON CONFLICT(idempotencykey) DO UPDATE SET idempotencykey= EXCLUDED.idempotencykey,apiname=EXCLUDED.apiname,httpstatuscode=EXCLUDED.httpstatuscode,apiresponse=EXCLUDED.apiresponse",
					parameters);
		} catch (Exception e) {
			log.error("Idempotency : ", e);
			throw new FDXException(e,500);
		}
	}

	@Override
	public String getApiResponse(String idempotencyKey, String apiName) throws FDXException {
		try {
			String apiResponse = template.queryForObject(
					"select apiResponse from "+ DeveloperContext.getDeveloperSchema() +".idempotency where idempotencyKey ='" + idempotencyKey
							+ "' and apiname ='" + apiName + "'",
					new MapSqlParameterSource().addValue("idempotencyKey", idempotencyKey).addValue("apiname", apiName),
					String.class);
			return apiResponse;
		} catch (Exception e) {
			log.error("Idempotency : ", e);
			throw new FDXException(e,500);
		}
	}

}
