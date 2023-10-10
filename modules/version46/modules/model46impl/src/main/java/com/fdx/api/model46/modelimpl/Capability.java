package com.fdx.api.model46.modelimpl;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.*;
import com.fdx.common.exception.Errors;
import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import com.fdx.common.util.FdxConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fdx.api.model46.config.ConnectionConfigApi46;
import com.fdx.api.model46.mapper.CapabilityRowMapper;
import com.fdx.api.model46.model.Capability46;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The response object for the API /capability request
 */
@ApiModel(description = "The response object for the API /capability request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
@Repository("Capability46")
public class Capability implements Capability46<Capability> {

	NamedParameterJdbcTemplate template;

	@JsonProperty("allowedConnections")
	private Integer allowedConnections;

	@JsonProperty("activeConnections")
	private Integer activeConnections;

	@JsonProperty("supportsCustomer")
	@JsonInclude(Include.NON_NULL)
	private Boolean supportsCustomer;

	@JsonProperty("supportsAccounts")
	@JsonInclude(Include.NON_NULL)
	private Boolean supportsAccounts;

	@JsonProperty("supportsTransactions")
	@JsonInclude(Include.NON_NULL)
	private Boolean supportsTransactions;

	@JsonProperty("supportsStatements")
	@JsonInclude(Include.NON_NULL)
	private Boolean supportsStatements;

	@JsonProperty("supportsImage")
	@JsonInclude(Include.NON_NULL)
	private Boolean supportsImage;

	@JsonProperty("supportsBillPay")
	@JsonInclude(Include.NON_NULL)
	private Boolean supportsBillPay;

	@JsonProperty("supportsTransfer")
	@JsonInclude(Include.NON_NULL)
	private Boolean supportsTransfer;

	@JsonProperty("messageFormat")
	private MessageFormat messageFormat;

	@JsonProperty("transferCutOffTime")
	@JsonFormat(shape = JsonFormat.Shape.STRING, lenient = OptBoolean.FALSE)
	private java.sql.Timestamp transferCutOffTime;

	@JsonProperty("billPayCutOffTime")
	@JsonFormat(shape = JsonFormat.Shape.STRING, lenient = OptBoolean.FALSE)
	private java.sql.Timestamp billPayCutOffTime;

	public Capability allowedConnections(Integer allowedConnections) {
		this.allowedConnections = allowedConnections;
		return this;
	}

	/**
	 * The number of concurrent connections allowed for this client
	 * 
	 * @return allowedConnections
	 */
	@ApiModelProperty(value = "The number of concurrent connections allowed for this client")

	public Integer getAllowedConnections() {
		return allowedConnections;
	}

	public void setAllowedConnections(Integer allowedConnections) {
		this.allowedConnections = allowedConnections;
	}

	public Capability activeConnections(Integer activeConnections) {
		this.activeConnections = activeConnections;
		return this;
	}

	/**
	 * The current number of active connections for this client
	 * 
	 * @return activeConnections
	 */
	@ApiModelProperty(value = "The current number of active connections for this client")

	public Integer getActiveConnections() {
		return activeConnections;
	}

	public void setActiveConnections(Integer activeConnections) {
		this.activeConnections = activeConnections;
	}

	public Capability supportsCustomer(Boolean supportsCustomer) {
		this.supportsCustomer = supportsCustomer;
		return this;
	}

	/**
	 * Capable of responding to customer queries. Defaults to false
	 * 
	 * @return supportsCustomer
	 */
	@ApiModelProperty(value = "Capable of responding to customer queries. Defaults to false")

	public Boolean getSupportsCustomer() {
		return supportsCustomer;
	}

	public void setSupportsCustomer(Boolean supportsCustomer) {
		this.supportsCustomer = supportsCustomer;
	}

	public Capability supportsAccounts(Boolean supportsAccounts) {
		this.supportsAccounts = supportsAccounts;
		return this;
	}

	/**
	 * Capable of responding to accounts and account queries. Defaults to false
	 * 
	 * @return supportsAccounts
	 */
	@ApiModelProperty(value = "Capable of responding to accounts and account queries. Defaults to false")

	public Boolean getSupportsAccounts() {
		return supportsAccounts;
	}

	public void setSupportsAccounts(Boolean supportsAccounts) {
		this.supportsAccounts = supportsAccounts;
	}

	public Capability supportsTransactions(Boolean supportsTransactions) {
		this.supportsTransactions = supportsTransactions;
		return this;
	}

	/**
	 * Capable of responding to transaction queries. Defaults to false
	 * 
	 * @return supportsTransactions
	 */
	@ApiModelProperty(value = "Capable of responding to transaction queries. Defaults to false")

	public Boolean getSupportsTransactions() {
		return supportsTransactions;
	}

	public void setSupportsTransactions(Boolean supportsTransactions) {
		this.supportsTransactions = supportsTransactions;
	}

	public Capability supportsStatements(Boolean supportsStatements) {
		this.supportsStatements = supportsStatements;
		return this;
	}

	/**
	 * Capable of responding to statements and statement queries. Defaults to false
	 * 
	 * @return supportsStatements
	 */
	@ApiModelProperty(value = "Capable of responding to statements and statement queries. Defaults to false")

	public Boolean getSupportsStatements() {
		return supportsStatements;
	}

	public void setSupportsStatements(Boolean supportsStatements) {
		this.supportsStatements = supportsStatements;
	}

	public Capability supportsImage(Boolean supportsImage) {
		this.supportsImage = supportsImage;
		return this;
	}

	/**
	 * Capable of responding to image queries. Defaults to false
	 * 
	 * @return supportsImage
	 */
	@ApiModelProperty(value = "Capable of responding to image queries. Defaults to false")

	public Boolean getSupportsImage() {
		return supportsImage;
	}

	public void setSupportsImage(Boolean supportsImage) {
		this.supportsImage = supportsImage;
	}

	public Capability supportsBillPay(Boolean supportsBillPay) {
		this.supportsBillPay = supportsBillPay;
		return this;
	}

	/**
	 * Capable of supporting a bill payment request. Defaults to false
	 * 
	 * @return supportsBillPay
	 */
	@ApiModelProperty(value = "Capable of supporting a bill payment request. Defaults to false")

	public Boolean getSupportsBillPay() {
		return supportsBillPay;
	}

	public void setSupportsBillPay(Boolean supportsBillPay) {
		this.supportsBillPay = supportsBillPay;
	}

	public Capability supportsTransfer(Boolean supportsTransfer) {
		this.supportsTransfer = supportsTransfer;
		return this;
	}

	/**
	 * Capable of supporting a transfer request. Defaults to false
	 * 
	 * @return supportsTransfer
	 */
	@ApiModelProperty(value = "Capable of supporting a transfer request. Defaults to false")

	public Boolean getSupportsTransfer() {
		return supportsTransfer;
	}

	public void setSupportsTransfer(Boolean supportsTransfer) {
		this.supportsTransfer = supportsTransfer;
	}

	public Capability messageFormat(MessageFormat messageFormat) {
		this.messageFormat = messageFormat;
		return this;
	}

	/**
	 * Get messageFormat
	 * 
	 * @return messageFormat
	 */
	@ApiModelProperty(value = "")

	@Valid

	public MessageFormat getMessageFormat() {
		return messageFormat;
	}

	public void setMessageFormat(MessageFormat messageFormat) {
		this.messageFormat = messageFormat;
	}

	public Capability transferCutOffTime(java.sql.Timestamp transferCutOffTime) {
		this.transferCutOffTime = transferCutOffTime;
		return this;
	}

	/**
	 * Get transferCutOffTime
	 * 
	 * @return transferCutOffTime
	 */
	@ApiModelProperty(value = "")

	@Valid

	public java.sql.Timestamp getTransferCutOffTime() {
		return transferCutOffTime;
	}

	public void setTransferCutOffTime(java.sql.Timestamp transferCutOffTime) {
		this.transferCutOffTime = transferCutOffTime;
	}

	public Capability billPayCutOffTime(java.sql.Timestamp billPayCutOffTime) {
		this.billPayCutOffTime = billPayCutOffTime;
		return this;
	}

	/**
	 * Get billPayCutOffTime
	 * 
	 * @return billPayCutOffTime
	 */
	@ApiModelProperty(value = "")

	@Valid

	public java.sql.Timestamp getBillPayCutOffTime() {
		return billPayCutOffTime;
	}

	public void setBillPayCutOffTime(java.sql.Timestamp billPayCutOffTime) {
		this.billPayCutOffTime = billPayCutOffTime;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Capability capability = (Capability) o;
		return Objects.equals(this.allowedConnections, capability.allowedConnections)
				&& Objects.equals(this.activeConnections, capability.activeConnections)
				&& Objects.equals(this.supportsCustomer, capability.supportsCustomer)
				&& Objects.equals(this.supportsAccounts, capability.supportsAccounts)
				&& Objects.equals(this.supportsTransactions, capability.supportsTransactions)
				&& Objects.equals(this.supportsStatements, capability.supportsStatements)
				&& Objects.equals(this.supportsImage, capability.supportsImage)
				&& Objects.equals(this.supportsBillPay, capability.supportsBillPay)
				&& Objects.equals(this.supportsTransfer, capability.supportsTransfer)
				&& Objects.equals(this.messageFormat, capability.messageFormat)
				&& Objects.equals(this.transferCutOffTime, capability.transferCutOffTime)
				&& Objects.equals(this.billPayCutOffTime, capability.billPayCutOffTime);
	}

	@Override
	public int hashCode() {
		return Objects.hash(allowedConnections, activeConnections, supportsCustomer, supportsAccounts,
				supportsTransactions, supportsStatements, supportsImage, supportsBillPay, supportsTransfer,
				messageFormat, transferCutOffTime, billPayCutOffTime);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Capability {\n");

		sb.append("    allowedConnections: ").append(toIndentedString(allowedConnections)).append("\n");
		sb.append("    activeConnections: ").append(toIndentedString(activeConnections)).append("\n");
		sb.append("    supportsCustomer: ").append(toIndentedString(supportsCustomer)).append("\n");
		sb.append("    supportsAccounts: ").append(toIndentedString(supportsAccounts)).append("\n");
		sb.append("    supportsTransactions: ").append(toIndentedString(supportsTransactions)).append("\n");
		sb.append("    supportsStatements: ").append(toIndentedString(supportsStatements)).append("\n");
		sb.append("    supportsImage: ").append(toIndentedString(supportsImage)).append("\n");
		sb.append("    supportsBillPay: ").append(toIndentedString(supportsBillPay)).append("\n");
		sb.append("    supportsTransfer: ").append(toIndentedString(supportsTransfer)).append("\n");
		sb.append("    messageFormat: ").append(toIndentedString(messageFormat)).append("\n");
		sb.append("    transferCutOffTime: ").append(toIndentedString(transferCutOffTime)).append("\n");
		sb.append("    billPayCutOffTime: ").append(toIndentedString(billPayCutOffTime)).append("\n");
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

	private static final Logger log = LoggerFactory.getLogger(Capability.class);

	@Override
	@JsonIgnore
	public Capability getCapability() throws FDXException {
		try {
			template = ConnectionConfigApi46.getTemplate();;
			String currencyCode = "currencyCode";
			SqlParameterSource parameters = new MapSqlParameterSource("currencycode", currencyCode);
			return template.queryForObject("select * from "+ DeveloperContext.getDeveloperSchema() +".capability", parameters,
					new CapabilityRowMapper());
		} catch (EmptyResultDataAccessException e) {
			throw new FDXException(Errors.CAPABILITY_NOT_FOUND, 0);
		} catch (Exception e) {
			log.error("Capability : ", e);
			throw new FDXException(e, FdxConstants.HTTP_ERROR_CODE_500);
		}
	}
}
