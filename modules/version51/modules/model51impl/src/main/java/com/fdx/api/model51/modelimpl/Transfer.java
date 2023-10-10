package com.fdx.api.model51.modelimpl;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fdx.api.model51.config.ConnectionConfigApi51;
import com.fdx.api.model51.model.Transfer51;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A transfer of money
 */
@ApiModel(description = "A transfer of money")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
@Repository("Transfer51")
public class Transfer implements Transfer51<TransferStatus> {

	NamedParameterJdbcTemplate template;

	@JsonProperty("transferId")
	private String transferId;

	@JsonProperty("fromAccountId")
	private String fromAccountId;

	@JsonProperty("toAccountId")
	private String toAccountId;

	@JsonProperty("amount")
	private BigDecimal amount;

	@JsonProperty("memo")
	private String memo;

	@JsonProperty("paymentDetails")
	private PaymentDetails paymentDetails;

	public Transfer transferId(String transferId) {
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

	/**
	 * Value for a unique identifier
	 * 
	 * @return fromAccountId
	 */
	@ApiModelProperty(value = "Value for a unique identifier")

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
	 * @return toAccountId
	 */
	@ApiModelProperty(value = "Value for a unique identifier")

	@Size(max = 256)
	public String getToAccountId() {
		return toAccountId;
	}

	public void setToAccountId(String toAccountId) {
		this.toAccountId = toAccountId;
	}

	/**
	 * Positive amount of money to be transferred
	 * 
	 * @return amount
	 */
	@ApiModelProperty(value = "Positive amount of money to be transferred")

	@Valid

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	/**
	 * String of maximum length 255
	 * 
	 * @return memo
	 */
	@ApiModelProperty(value = "String of maximum length 255")

	@Size(max = 255)
	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Transfer paymentDetails(PaymentDetails paymentDetails) {
		this.paymentDetails = paymentDetails;
		return this;
	}

	/**
	 * Get paymentDetails
	 * 
	 * @return paymentDetails
	 */
	@ApiModelProperty(value = "")

	@Valid

	public PaymentDetails getPaymentDetails() {
		return paymentDetails;
	}

	public void setPaymentDetails(PaymentDetails paymentDetails) {
		this.paymentDetails = paymentDetails;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Transfer transfer = (Transfer) o;
		return Objects.equals(this.transferId, transfer.transferId)
				&& Objects.equals(this.fromAccountId, transfer.fromAccountId)
				&& Objects.equals(this.toAccountId, transfer.toAccountId)
				&& Objects.equals(this.amount, transfer.amount) && Objects.equals(this.memo, transfer.memo)
				&& Objects.equals(this.paymentDetails, transfer.paymentDetails);
	}

	@Override
	public int hashCode() {
		return Objects.hash(transferId, fromAccountId, toAccountId, amount, memo, paymentDetails);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Transfer {\n");

		sb.append("    transferId: ").append(toIndentedString(transferId)).append("\n");
		sb.append("    fromAccountId: ").append(toIndentedString(fromAccountId)).append("\n");
		sb.append("    toAccountId: ").append(toIndentedString(toAccountId)).append("\n");
		sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
		sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
		sb.append("    paymentDetails: ").append(toIndentedString(paymentDetails)).append("\n");
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

	private static final Logger log = LoggerFactory.getLogger(Transfer.class);

	@Override
	public TransferStatus postTransfer(Transfer51 transferIn) throws FDXException {
		String transferId = null;
		try {
			template = ConnectionConfigApi51.getTemplate();
			Transfer transfer = (Transfer) transferIn;
			transferId = transfer.getTransferId();

			PaymentDetails paymentDetails = new PaymentDetails();
			Map<String, Object> keys = null;
			SqlParameterSource parameters = new MapSqlParameterSource("payeeId", null);

//			PaymentDetails Start
			int paymentArrayKey = 0;
			if (paymentDetails != null) {
				keys = paymentDetails.postPaymentDetails();
				paymentArrayKey = (int) keys.get("paymentdetailsid");
			}
//			PaymentDetails End

			int count = template.update(
					"insert into "+ DeveloperContext.getDeveloperSchema() +".transfer (transferId,fromAccountId,toAccountId,amount,memo,paymentdetails) values ("
							+ ((transfer.getTransferId() != null) ? ("'" + transfer.getTransferId() + "'") : null) + ","
							+ ((transfer.getFromAccountId() != null) ? ("'" + transfer.getFromAccountId() + "'") : null)
							+ ","
							+ ((transfer.getToAccountId() != null) ? ("'" + transfer.getToAccountId() + "'") : null)
							+ "," + ((transfer.getAmount() != null) ? ("'" + transfer.getAmount() + "'") : null) + ","
							+ ((transfer.getMemo() != null) ? ("'" + transfer.getMemo() + "'") : null) + ","
							+ ((paymentDetails != null) ? ("'" + paymentArrayKey + "'") : null)
							+ ") ON CONFLICT (transferID) DO UPDATE set transferId= EXCLUDED.transferId,fromAccountId =EXCLUDED.fromAccountId,toAccountId=EXCLUDED.toAccountId,amount=EXCLUDED.amount, memo=EXCLUDED.memo, paymentdetails=EXCLUDED.paymentdetails",
					parameters);
			if (count != 1) {
				log.error("Transfer : Update count not 1 for transfer.getTransferId() " + transfer.getTransferId());
				throw new FDXException(500);
			}
			TransferStatus transferStatus = new TransferStatus(); // TODO use repository
			return transferStatus.postTransferStatus(transfer.getTransferId());
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Transfer : ", e);
			throw new FDXException(e, 500);
		}
	}

	public Boolean checkTransferIdIfExists(@Size(max = 256) String transferId) {
		template = ConnectionConfigApi51.getTemplate();
		int count = template.queryForObject("select count(*) from "+ DeveloperContext.getDeveloperSchema() +".transfer where transferId in (:transferId)",
				new MapSqlParameterSource().addValue("transferId", transferId), Integer.class);
		if (count == 0)
			return false;
		else
			return true;
	}
}
