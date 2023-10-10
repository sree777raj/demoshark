package com.fdx.api.model51.modelimpl;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Objects;

import javax.validation.Valid;

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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import com.fdx.api.model51.config.ConnectionConfigApi51;
import com.fdx.api.model51.mapper.PaymentDetailsAccountsRowMapper;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Details of this payment
 */
@ApiModel(description = "Details of this payment")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class PaymentDetails {
	NamedParameterJdbcTemplate template;

	@JsonProperty(access = Access.WRITE_ONLY)
	private int paymentdetailsid;

	@JsonProperty("principalAmount")
	private BigDecimal principalAmount;

	@JsonProperty("interestAmount")
	private BigDecimal interestAmount;

	@JsonProperty("insuranceAmount")
	private BigDecimal insuranceAmount;

	@JsonProperty("escrowAmount")
	private BigDecimal escrowAmount;

	@JsonProperty("pmiAmount")
	private BigDecimal pmiAmount;

	@JsonProperty("feesAmount")
	private BigDecimal feesAmount;

	public PaymentDetails principalAmount(BigDecimal principalAmount) {
		this.principalAmount = principalAmount;
		return this;
	}

	/**
	 * The amount of payment applied to principal
	 * 
	 * @return principalAmount
	 */
	@ApiModelProperty(value = "The amount of payment applied to principal")

	@Valid

	public BigDecimal getPrincipalAmount() {
		return principalAmount;
	}

	public void setPrincipalAmount(BigDecimal principalAmount) {
		this.principalAmount = principalAmount;
	}

	public PaymentDetails interestAmount(BigDecimal interestAmount) {
		this.interestAmount = interestAmount;
		return this;
	}

	/**
	 * The amount of payment applied to interest
	 * 
	 * @return interestAmount
	 */
	@ApiModelProperty(value = "The amount of payment applied to interest")

	@Valid

	public BigDecimal getInterestAmount() {
		return interestAmount;
	}

	public void setInterestAmount(BigDecimal interestAmount) {
		this.interestAmount = interestAmount;
	}

	public PaymentDetails insuranceAmount(BigDecimal insuranceAmount) {
		this.insuranceAmount = insuranceAmount;
		return this;
	}

	/**
	 * The amount of payment applied to life/health/accident insurance on the loan
	 * 
	 * @return insuranceAmount
	 */
	@ApiModelProperty(value = "The amount of payment applied to life/health/accident insurance on the loan")

	@Valid

	public BigDecimal getInsuranceAmount() {
		return insuranceAmount;
	}

	public void setInsuranceAmount(BigDecimal insuranceAmount) {
		this.insuranceAmount = insuranceAmount;
	}

	public PaymentDetails escrowAmount(BigDecimal escrowAmount) {
		this.escrowAmount = escrowAmount;
		return this;
	}

	/**
	 * The amount of payment applied to escrow
	 * 
	 * @return escrowAmount
	 */
	@ApiModelProperty(value = "The amount of payment applied to escrow")

	@Valid

	public BigDecimal getEscrowAmount() {
		return escrowAmount;
	}

	public void setEscrowAmount(BigDecimal escrowAmount) {
		this.escrowAmount = escrowAmount;
	}

	public PaymentDetails pmiAmount(BigDecimal pmiAmount) {
		this.pmiAmount = pmiAmount;
		return this;
	}

	/**
	 * The amount of payment applied to PMI
	 * 
	 * @return pmiAmount
	 */
	@ApiModelProperty(value = "The amount of payment applied to PMI")

	@Valid

	public BigDecimal getPmiAmount() {
		return pmiAmount;
	}

	public void setPmiAmount(BigDecimal pmiAmount) {
		this.pmiAmount = pmiAmount;
	}

	public PaymentDetails feesAmount(BigDecimal feesAmount) {
		this.feesAmount = feesAmount;
		return this;
	}

	/**
	 * The amount of payment applied to fees
	 * 
	 * @return feesAmount
	 */
	@ApiModelProperty(value = "The amount of payment applied to fees")

	@Valid

	public BigDecimal getFeesAmount() {
		return feesAmount;
	}

	public void setFeesAmount(BigDecimal feesAmount) {
		this.feesAmount = feesAmount;
	}

	public int getPaymentdetailsid() {
		return paymentdetailsid;
	}

	public void setPaymentdetailsid(int paymentdetailsid) {
		this.paymentdetailsid = paymentdetailsid;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PaymentDetails paymentDetails = (PaymentDetails) o;
		return Objects.equals(this.principalAmount, paymentDetails.principalAmount)
				&& Objects.equals(this.interestAmount, paymentDetails.interestAmount)
				&& Objects.equals(this.insuranceAmount, paymentDetails.insuranceAmount)
				&& Objects.equals(this.escrowAmount, paymentDetails.escrowAmount)
				&& Objects.equals(this.pmiAmount, paymentDetails.pmiAmount)
				&& Objects.equals(this.feesAmount, paymentDetails.feesAmount);
	}

	@Override
	public int hashCode() {
		return Objects.hash(principalAmount, interestAmount, insuranceAmount, escrowAmount, pmiAmount, feesAmount);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PaymentDetails {\n");

		sb.append("    principalAmount: ").append(toIndentedString(principalAmount)).append("\n");
		sb.append("    interestAmount: ").append(toIndentedString(interestAmount)).append("\n");
		sb.append("    insuranceAmount: ").append(toIndentedString(insuranceAmount)).append("\n");
		sb.append("    escrowAmount: ").append(toIndentedString(escrowAmount)).append("\n");
		sb.append("    pmiAmount: ").append(toIndentedString(pmiAmount)).append("\n");
		sb.append("    feesAmount: ").append(toIndentedString(feesAmount)).append("\n");
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

	private static final Logger log = LoggerFactory.getLogger(PaymentDetails.class);

	public PaymentDetails getPaymentDetails(int paymentdetailsid) throws FDXException {
		try {
			SqlParameterSource parameters = new MapSqlParameterSource("paymentdetailsid", paymentdetailsid);
			template = ConnectionConfigApi51.getTemplate();;
			PaymentDetails paymentDetails = template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".paymentdetails where paymentdetailsid in (:paymentdetailsid)", parameters,
					new PaymentDetailsAccountsRowMapper());
			return paymentDetails;
		} catch (EmptyResultDataAccessException e) {
			throw new FDXException("Payment Details not found", 0);
		} catch (Exception e) {
			log.error("PaymentDetails : ", e);
			throw new FDXException(e,500);
		}
	}

	public Map<String, Object> postPaymentDetails() throws FDXException {
		KeyHolder keyHolder = new GeneratedKeyHolder();

		SqlParameterSource parameters = new MapSqlParameterSource("paymentdetailsid", paymentdetailsid);
		
		template = ConnectionConfigApi51.getTemplate();;
		try {
			int paymentDetailsCount = template.update(
					"insert into "+ DeveloperContext.getDeveloperSchema() +".paymentdetails (principalAmount,interestAmount,insuranceAmount,escrowAmount,pmiAmount,feesAmount) values ("
							+ ((principalAmount != null) ? principalAmount : null) + ","
							+ ((interestAmount != null) ? interestAmount : null) + ","
							+ ((insuranceAmount != null) ? insuranceAmount : null) + ","
							+ ((escrowAmount != null) ? escrowAmount : null) + ","
							+ ((pmiAmount != null) ? pmiAmount : null) + ","
							+ ((feesAmount != null) ? feesAmount : null) + ")",
					parameters, keyHolder);

		} catch (Exception e) {
			log.error("PaymentDetails : ", e);
			throw new FDXException(e,500);
		}
		return keyHolder.getKeys();
	}
}
