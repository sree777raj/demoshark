package com.fdx.api.model51.modelimpl;

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.OptBoolean;
import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fdx.api.model51.config.ConnectionConfigApi51;
import com.fdx.api.model51.mapper.TransferStatusRowMapper;
import com.fdx.api.model51.model.TransferStatus51;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The status of a transfer of money
 */
@ApiModel(description = "The status of a transfer of money")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
@Repository("TransferStatus51")
public class TransferStatus implements TransferStatus51<TransferStatus> {

	NamedParameterJdbcTemplate template;

	@JsonProperty("transferId")
	private String transferId;

	@JsonProperty("referenceId")
	private String referenceId;

	@JsonProperty("status")
	private TransferStatusStatus status;

	@JsonProperty("transferDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, lenient = OptBoolean.FALSE)
	private java.sql.Timestamp transferDate;

	public TransferStatus transferId(String transferId) {
		this.transferId = transferId;
		return this;
	}

	/**
	 * Value for a unique identifier
	 * 
	 * @return transferId
	 */
	@ApiModelProperty(value = "Value for a unique identifier")

	@Size(max = 256)
	public String getTransferId() {
		return transferId;
	}

	public void setTransferId(String transferId) {
		this.transferId = transferId;
	}

	public TransferStatus referenceId(String referenceId) {
		this.referenceId = referenceId;
		return this;
	}

	/**
	 * Value for a unique identifier
	 * 
	 * @return referenceId
	 */
	@ApiModelProperty(value = "Value for a unique identifier")

	@Size(max = 256)
	public String getReferenceId() {
		return referenceId;
	}

	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}

	public TransferStatus status(TransferStatusStatus status) {
		this.status = status;
		return this;
	}

	/**
	 * Get status
	 * 
	 * @return status
	 */
	@ApiModelProperty(value = "")

	@Valid

	public TransferStatusStatus getStatus() {
		return status;
	}

	public void setStatus(TransferStatusStatus status) {
		this.status = status;
	}

	public TransferStatus transferDate(java.sql.Timestamp transferDate) {
		this.transferDate = transferDate;
		return this;
	}

	/**
	 * Get transferDate
	 * 
	 * @return transferDate
	 */
	@ApiModelProperty(value = "")

	@Valid

	public java.sql.Timestamp getTransferDate() {
		return transferDate;
	}

	public void setTransferDate(java.sql.Timestamp transferDate) {
		this.transferDate = transferDate;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		TransferStatus transferStatus = (TransferStatus) o;
		return Objects.equals(this.transferId, transferStatus.transferId)
				&& Objects.equals(this.referenceId, transferStatus.referenceId)
				&& Objects.equals(this.status, transferStatus.status)
				&& Objects.equals(this.transferDate, transferStatus.transferDate);
	}

	@Override
	public int hashCode() {
		return Objects.hash(transferId, referenceId, status, transferDate);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TransferStatus {\n");

		sb.append("    transferId: ").append(toIndentedString(transferId)).append("\n");
		sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
		sb.append("    status: ").append(toIndentedString(status)).append("\n");
		sb.append("    transferDate: ").append(toIndentedString(transferDate)).append("\n");
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

	private static final Logger log = LoggerFactory.getLogger(TransferStatus.class);

	public TransferStatus postTransferStatus(String transferId) throws FDXException {
		KeyHolder keyHolder = new GeneratedKeyHolder();
		SqlParameterSource parameters = new MapSqlParameterSource("transferId", transferId);
		template = ConnectionConfigApi51.getTemplate();
		try {
			java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
			int transferStatusCount = template.update(
					"insert into "+ DeveloperContext.getDeveloperSchema() +".transferStatus (transferid,referenceid,status,transferdate) values ('"
							+ transferId + "','TRANSFER-"+System.currentTimeMillis()+"','PENDING','" + date
							+ "') ON CONFLICT(transferid) DO UPDATE set transferid=EXCLUDED.transferId,referenceid= EXCLUDED.referenceid,status=EXCLUDED.status,transferDate=EXCLUDED.transferDate",
					parameters, keyHolder);
			if (transferStatusCount != 1) {
				log.error("postTransferStatus : Update count not 1 for transferId " + transferId);
				throw new FDXException(500);
			}
			return getTransferStatusDetails(transferId);
		} catch (Exception e) {
			log.error("TransferStatus : ", e);
			throw new FDXException(e,500);
		}
	}

	public TransferStatus getTransferStatusDetails(String transferId) throws FDXException {
		try {
			SqlParameterSource parameters = new MapSqlParameterSource("transferId", transferId);
			template = ConnectionConfigApi51.getTemplate();
			return template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".transferStatus  where transferId= (:transferId)", parameters,
					new TransferStatusRowMapper());
		} catch (EmptyResultDataAccessException e) {
			throw new FDXException(e, 950);
		} catch (Exception e) {
			log.error("TransferStatus : ", e);
			throw new FDXException(e, 500);
		}
	}

	public void updateTransferStatus(String transferId, String status) throws FDXException {
		KeyHolder keyHolder = new GeneratedKeyHolder();
		SqlParameterSource parameters = new MapSqlParameterSource("transferId", transferId);
		template = ConnectionConfigApi51.getTemplate();;
		try {
			int transferStatusCount = template.update("update "+ DeveloperContext.getDeveloperSchema() +".transferStatus set status ='"
					+ status + "' where transferId ='" + transferId + "'", parameters, keyHolder);
			if (transferStatusCount != 1) {
				log.error("updateTransferStatus : Update count not 1 for paymentId " + transferId);
				throw new FDXException(500);
			}
		} catch (Exception e) {
			log.error("TransferStatus : ", e);
			throw new FDXException(e,500);
		}
	}
}
