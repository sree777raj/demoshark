package com.fdx.api.model46.modelimpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fdx.api.model46.config.ConnectionConfigApi46;
import com.fdx.api.model46.mapper.StatementsRowMapper;
import com.fdx.api.model46.model.Statements46;

import io.swagger.annotations.ApiModel;

/**
 * A paginated array of account statements
 */
@ApiModel(description = "A paginated array of account statements")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
@Repository("Statements46")
public class Statements implements Statements46<Statements> {

	NamedParameterJdbcTemplate template;

	@JsonUnwrapped
	private PaginatedArray paginatedArray;

	@JsonIgnore
	private int hateoasLinkId;

	@JsonIgnore
	private String statementId;

	@JsonProperty("statements")
	@Valid
	private List<Statement> statements = null;

	public List<Statement> getStatements() {
		return statements;
	}

	public void setStatements(List<Statement> statements) {
		this.statements = statements;
	}

	public PaginatedArray getPaginatedArray() {
		return paginatedArray;
	}

	public void setPaginatedArray(PaginatedArray paginatedArray) {
		this.paginatedArray = paginatedArray;
	}

	public PaginatedArray getPaginatedArray(String resultType, String uriPath, int limit, String offset, int count,
			String query) throws Exception {
		PaginatedArray paginatedArray = new PaginatedArray();
		paginatedArray = paginatedArray.getPaginatedResult(query, uriPath, limit, offset, count);
		return paginatedArray;
	}

	public int getHateoasLinkId() {
		return hateoasLinkId;
	}

	public void setHateoasLinkId(int hateoasLinkId) {
		this.hateoasLinkId = hateoasLinkId;
	}

	public String getStatementId() {
		return statementId;
	}

	public void setStatementId(String statementId) {
		this.statementId = statementId;
	}

	@Override
	public String toString() {
		return "Statements [paginatedArray=" + paginatedArray + ", hateoasLinkId=" + hateoasLinkId + ", statementId="
				+ statementId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hateoasLinkId;
		result = prime * result + ((paginatedArray == null) ? 0 : paginatedArray.hashCode());
		result = prime * result + ((statementId == null) ? 0 : statementId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Statements other = (Statements) obj;
		if (hateoasLinkId != other.hateoasLinkId)
			return false;
		if (paginatedArray == null) {
			if (other.paginatedArray != null)
				return false;
		} else if (!paginatedArray.equals(other.paginatedArray))
			return false;
		if (statementId == null) {
			if (other.statementId != null)
				return false;
		} else if (!statementId.equals(other.statementId))
			return false;
		return true;
	}

	private static final Logger log = LoggerFactory.getLogger(Statements.class);

	@Override
	public Statements getStatementsList(String accountId, LocalDate startTime, LocalDate endTime, Integer limit,
			String offset, String uriPath, String query) throws FDXException {
		Statements statements = new Statements();
		try {
			Account account = new Account();
			// if account not found this will throw 701 fdx exception
			account.getAccount(accountId, "details");
			template = ConnectionConfigApi46.getTemplate();;
			Statement statement = new Statement();
			List<Statement> statementList = statement.getStatementDetails(accountId, startTime, endTime, limit, offset);
			List<Statement> statementListNew = new ArrayList<Statement>();
			if(statementList.isEmpty())
				throw new FDXException(1108);
			for (Statement statementListIterator : statementList) {
				SqlParameterSource parameters = new MapSqlParameterSource("statementId",
						statementListIterator.getStatementId());
				Statements statementsResponse;
				try {
					statementsResponse = template.queryForObject(
							"select * from "+ DeveloperContext.getDeveloperSchema() +".statements where statementId in (:statementId)",
							new MapSqlParameterSource().addValue("statementId", statementListIterator.getStatementId()),
							new StatementsRowMapper());
				} catch (EmptyResultDataAccessException e) {
					throw new FDXException(1108);
				}
				if (statementsResponse.getHateoasLinkId() != 0) {
					HateoasLink hateoasLink = new HateoasLink();
					statementListIterator.setImage(hateoasLink.getHateoasLinks(statementsResponse.getHateoasLinkId()));
					statementListNew.add(statementListIterator);
				}
			}
			String resultType = null;
			PaginatedArray paginatedArray = getPaginatedArray(resultType, uriPath, limit, offset,
					statementListNew.size(), query);
			statements.setStatements(statementListNew);
			statements.setPaginatedArray(paginatedArray);
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Statements : ", e);
			throw new FDXException(e,500);
		}
		return statements;
	}

	public String getImageById(String statementId) throws FDXException {
		try {
			
			template = ConnectionConfigApi46.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("statementId", statementId);
			Statements statements = template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".statements where statementId in (:statementId)", parameters,
					new StatementsRowMapper());

			HateoasLink hateoasLink = new HateoasLink();
			hateoasLink = hateoasLink.getHateoasLinks(statements.getHateoasLinkId());
			return hateoasLink.getHref();
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Statements : ", e);
			throw new FDXException(e,500);
		}
	}
}
