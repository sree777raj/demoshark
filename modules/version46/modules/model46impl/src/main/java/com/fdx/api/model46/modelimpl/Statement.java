package com.fdx.api.model46.modelimpl;

import java.net.InetAddress;
import java.net.URI;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.OptBoolean;
import com.fdx.api.model46.mapper.TransactionRowMapper;
import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fdx.api.model46.config.ConnectionConfigApi46;
import com.fdx.api.model46.mapper.StatementRowMapper;
import com.fdx.api.model46.model.Statement46;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * An account statement
 */
@ApiModel(description = "An account statement")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
@Repository("Statement46")
public class Statement implements Statement46<Statement> {

	NamedParameterJdbcTemplate template;

	@Value("${server.port}")
	private int appServerPort;

	@Autowired
	Environment environment;

	@JsonProperty("accountId")
	private String accountId;

	@JsonProperty("statementId")
	private String statementId;

	@JsonProperty("statementDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, lenient = OptBoolean.FALSE)
	private java.sql.Timestamp statementDate;

	@JsonProperty("description")
	private String description;

	@JsonProperty("links")
	@Valid
	private HateoasLink image = null;

	public HateoasLink getImage() {
		return image;
	}

	public void setImage(HateoasLink image) {
		this.image = image;
	}

	public Statement accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * Value for a unique identifier
	 * 
	 * @return accountId
	 */
	@ApiModelProperty(value = "Value for a unique identifier")

	@Size(max = 256)
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public Statement statementId(String statementId) {
		this.statementId = statementId;
		return this;
	}

	/**
	 * Value for a unique identifier
	 * 
	 * @return statementId
	 */
	@ApiModelProperty(value = "Value for a unique identifier")

	@Size(max = 256)
	public String getStatementId() {
		return statementId;
	}

	public void setStatementId(String statementId) {
		this.statementId = statementId;
	}

	public Statement statementDate(java.sql.Timestamp statementDate) {
		this.statementDate = statementDate;
		return this;
	}

	/**
	 * Get statementDate
	 * 
	 * @return statementDate
	 */
	@ApiModelProperty(value = "")

	@Valid

	public java.sql.Timestamp getStatementDate() {
		return statementDate;
	}

	public void setStatementDate(java.sql.Timestamp statementDate) {
		this.statementDate = statementDate;
	}

	public Statement description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Description of statement
	 * 
	 * @return description
	 */
	@ApiModelProperty(value = "Description of statement")

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Statement statement = (Statement) o;
		return Objects.equals(this.accountId, statement.accountId)
				&& Objects.equals(this.statementId, statement.statementId)
				&& Objects.equals(this.statementDate, statement.statementDate)
				&& Objects.equals(this.description, statement.description);
	}

	@Override
	public int hashCode() {
		return Objects.hash(accountId, statementId, statementDate, description);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Statement {\n");

		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    statementId: ").append(toIndentedString(statementId)).append("\n");
		sb.append("    statementDate: ").append(toIndentedString(statementDate)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

	private static final Logger log = LoggerFactory.getLogger(Statement.class);

	public List<Statement> getStatementDetails(String accountId, LocalDate startTime, LocalDate endTime, Integer limit,
			String offset) throws FDXException {
		try {
			template = ConnectionConfigApi46.getTemplate();
			StringBuffer statementQuery = new StringBuffer();
			statementQuery.append("select * from "+ DeveloperContext.getDeveloperSchema() +".statement where accountid in (:accountId)");
			if (startTime != null && endTime != null) {
				statementQuery.append(" and statementdate between (:startTime) and (:endTime)");
			}
			List<Statement> statementList = template
					.query(statementQuery.toString(),
							new MapSqlParameterSource().addValue("accountId", accountId)
									.addValue("startTime", startTime).addValue("endTime", endTime),
							new StatementRowMapper());
			return statementList;
		} catch (Exception e) {
			log.error("Statement : ", e);
			throw new FDXException(e,500);
		}
	}

	@Override
	public Object getStatementById(String accountId, String statementId) throws FDXException {
		try {
			template = ConnectionConfigApi46.getTemplate();
			Account account = new Account();
			// if account not found this will throw 701 fdx exception
			account.getAccount(accountId, "details");
			Statement statement;
			try {
				statement = template.queryForObject(
						"select * from "+ DeveloperContext.getDeveloperSchema() +".statement where accountid in (:accountId) and statementId in (:statementId)",
						new MapSqlParameterSource().addValue("accountId", accountId).addValue("statementId", statementId),
						new StatementRowMapper());
			} catch (EmptyResultDataAccessException e) {
				throw new FDXException(e, 1104);
			}
			Statements statements = new Statements();
			String href = statements.getImageById(statement.getStatementId());
			StringBuffer hrefString = new StringBuffer();
			final URI u = new URI(href);
			InetAddress inetAddress = InetAddress.getLocalHost();
			if (!u.isAbsolute()) {
				hrefString.append("http://" + inetAddress.getHostName() + ":" + appServerPort + "/" + href);
				return hrefString.toString();
			}
			return href;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Statement : ", e);
			throw new FDXException(e,500);
		}
	}
}
