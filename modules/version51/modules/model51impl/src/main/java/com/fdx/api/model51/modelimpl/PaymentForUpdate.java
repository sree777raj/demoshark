package com.fdx.api.model51.modelimpl;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.OptBoolean;
import com.fdx.api.model51.config.ConnectionConfigApi51;
import com.fdx.api.model51.mapper.PaymentForUpdateRowMapper;
import com.fdx.api.model51.model.PaymentForUpdate51;
import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import com.fdx.common.util.FdxConstants;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

/**
 * Payment entity used for creation and update of a payment
 */
@ApiModel(description = "Payment entity used for creation and update of a payment")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
@Repository("PaymentForUpdate51")
public class PaymentForUpdate implements PaymentForUpdate51<Payment> {

	NamedParameterJdbcTemplate template;

	@JsonProperty("paymentId")
	private String paymentId;

	@JsonProperty("fromAccountId")
	private String fromAccountId;

	@JsonProperty("toPayeeId")
	private String toPayeeId;

	@JsonProperty("amount")
	private BigDecimal amount;

	@JsonProperty("merchantAccountId")
	private String merchantAccountId;

	@JsonProperty("dueDate")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private Date dueDate;

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	/**
	 * Value for a unique identifier
	 * 
	 * @return fromAccountId
	 */
	@ApiModelProperty(required = true, value = "Value for a unique identifier")
	@NotNull

	@Size(max = 256)
	public String getFromAccountId() {
		return fromAccountId;
	}

	public void setFromAccountId(String fromAccountId) {
		this.fromAccountId = fromAccountId;
	}

	/**
	 * Value for a unique identifier
	 * 
	 * @return toPayeeId
	 */
	@ApiModelProperty(required = true, value = "Value for a unique identifier")
	@NotNull

	@Size(max = 256)
	public String getToPayeeId() {
		return toPayeeId;
	}

	public void setToPayeeId(String toPayeeId) {
		this.toPayeeId = toPayeeId;
	}

	/**
	 * Amount for the payment. Must be positive minimum: 0
	 * 
	 * @return amount
	 */
	@ApiModelProperty(required = true, value = "Amount for the payment. Must be positive")
	@NotNull

	@Valid
	@DecimalMin("0")
	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	/**
	 * User's account identifier with the payee
	 * 
	 * @return merchantAccountId
	 */
	@ApiModelProperty(value = "User's account identifier with the payee")

	public String getMerchantAccountId() {
		return merchantAccountId;
	}

	public void setMerchantAccountId(String merchantAccountId) {
		this.merchantAccountId = merchantAccountId;
	}

	/**
	 * ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included
	 * according to [IETF RFC3339]
	 * (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)
	 * 
	 * @return dueDate
	 */
	@ApiModelProperty(required = true, value = "ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included according to [IETF RFC3339] (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)")
	@NotNull

	@Valid
	@Size(max = 10)
	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public PaymentForUpdate() {}

	public PaymentForUpdate(String toPayeeId, String fromAccountId,
													BigDecimal amount, String merchantAccountId,
													Date dueDate) {
		this.fromAccountId = fromAccountId;
		this.toPayeeId = toPayeeId;
		this.amount = amount;
		this.merchantAccountId = merchantAccountId;
		this.dueDate = dueDate;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PaymentForUpdate paymentForUpdate = (PaymentForUpdate) o;
		return Objects.equals(this.fromAccountId, paymentForUpdate.fromAccountId)
				&& Objects.equals(this.toPayeeId, paymentForUpdate.toPayeeId)
				&& Objects.equals(this.amount, paymentForUpdate.amount)
				&& Objects.equals(this.merchantAccountId, paymentForUpdate.merchantAccountId)
				&& Objects.equals(this.dueDate, paymentForUpdate.dueDate);
	}

	@Override
	public int hashCode() {
		return Objects.hash(fromAccountId, toPayeeId, amount, merchantAccountId, dueDate);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PaymentForUpdate {\n");
		sb.append("    fromAccountId: ").append(toIndentedString(fromAccountId)).append("\n");
		sb.append("    toPayeeId: ").append(toIndentedString(toPayeeId)).append("\n");
		sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
		sb.append("    merchantAccountId: ").append(toIndentedString(merchantAccountId)).append("\n");
		sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
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

	@Override
	@JsonIgnore
	public com.fasterxml.jackson.core.type.TypeReference getTypeRef() {
		return new com.fasterxml.jackson.core.type.TypeReference<PaymentForUpdate>() {
		};
	}

	private static final Logger log = LoggerFactory.getLogger(PaymentForUpdate.class);

	public PaymentForUpdate getPaymentForUpdateDetails(String paymentId) throws FDXException {
		PaymentForUpdate paymentForUpdate = new PaymentForUpdate();
		try {
			template = ConnectionConfigApi51.getTemplate();
			SqlParameterSource parameters = new MapSqlParameterSource("paymentId", paymentId);
			paymentForUpdate = template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".paymentForUpdate where paymentId in (:paymentId)", parameters,
					new PaymentForUpdateRowMapper());
			return paymentForUpdate;
		} catch (EmptyResultDataAccessException e) {
			throw new FDXException(802);
		} catch (Exception e) {
			log.error("PaymentForUpdate : ", e);
			throw new FDXException(e, FdxConstants.HTTP_ERROR_CODE_500);
		}
	}

	@JsonIgnore
	public void updatePayment(String paymentId, PaymentForUpdate51 paymentForUpdateIn) throws FDXException {
		PaymentForUpdate paymentForUpdate = (PaymentForUpdate)paymentForUpdateIn;
		int count = 0;
		try {
			template = ConnectionConfigApi51.getTemplate();
			SqlParameterSource parameters = new MapSqlParameterSource("paymentId", paymentId);
			StringBuffer query = new StringBuffer();
			query.append("update "+ DeveloperContext.getDeveloperSchema() +".paymentForUpdate set ");

			if (paymentForUpdate.getFromAccountId() != null)
				query.append("fromaccountid='" + paymentForUpdate.getFromAccountId() + "',");

			if (paymentForUpdate.getToPayeeId() != null)
				query.append("toPayeeId='" + paymentForUpdate.getToPayeeId() + "',");

			if (paymentForUpdate.getAmount() != null)
				query.append("amount='" + paymentForUpdate.getAmount() + "',");

			if (paymentForUpdate.getMerchantAccountId() != null)
				query.append("merchantAccountId='" + paymentForUpdate.getMerchantAccountId() + "',");

			if (paymentForUpdate.getDueDate() != null)
				query.append("dueDate='" + paymentForUpdate.getDueDate() + "',");

			int size = query.length();
			String queryString = query.substring(0, size - 1);

			count = template.update(queryString +" where paymentId ='" + paymentId + "'", parameters);
			if (count != 1) {
					log.error("PaymentForUpdate : Update count not 1 for paymentId " + paymentId);
					throw new FDXException(FdxConstants.HTTP_ERROR_CODE_500);
			}
			paymentForUpdate = paymentForUpdate.getPaymentForUpdateDetails(paymentId);
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("PaymentForUpdate : ", e);
			throw new FDXException(e,FdxConstants.HTTP_ERROR_CODE_500);
		}
	}

	@Override
	public Payment postPaymentForUpdate(PaymentForUpdate51 paymentForUpdate, String recurringPaymentId) throws FDXException {
		try {
			Payment paymentRepository = new Payment();
			UpdatesMetadata updatesMetadata = new UpdatesMetadata();
			template = ConnectionConfigApi51.getTemplate();
			SqlParameterSource parameters = new MapSqlParameterSource("paymentId", null);

			//	UpdateMetadata Start
			String paymentId = updatesMetadata.assignNextSequenceId("Payments");
			//	UpdateMetadata End

			int count = template.update(
					"insert into "+ DeveloperContext.getDeveloperSchema() +".paymentforupdate (paymentid,fromaccountid,topayeeid,amount,merchantaccountid,duedate) values ('"
							+ paymentId + "','" + paymentForUpdate.getFromAccountId() + "','"
							+ paymentForUpdate.getToPayeeId() + "','" + paymentForUpdate.getAmount() + "',"
							+ ((paymentForUpdate.getMerchantAccountId() != null)
									? "'" + paymentForUpdate.getMerchantAccountId() + "'"
									: null)
							+ ",'" + paymentForUpdate.getDueDate() + "')",
					parameters);

			if (count != 1) {
				log.error("PaymentForUpdate : Insert failed for paymentId " + paymentId);
				throw new FDXException(FdxConstants.HTTP_ERROR_CODE_500);
			}
			return paymentRepository.insertpayment(paymentId, recurringPaymentId);
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("PaymentForUpdate : ", e);
			throw new FDXException(e,FdxConstants.HTTP_ERROR_CODE_500);
		}
	}
}
