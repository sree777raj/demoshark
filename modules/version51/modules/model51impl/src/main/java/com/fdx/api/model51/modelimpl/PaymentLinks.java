package com.fdx.api.model51.modelimpl;

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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fdx.api.model51.config.ConnectionConfigApi51;
import com.fdx.api.model51.mapper.PaymentLinksRowMapper;
import com.fdx.api.model51.modelimpl.HateoasLink.ActionEnum;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Links associated with a payment
 */
@ApiModel(description = "Links associated with a payment")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class PaymentLinks {

	NamedParameterJdbcTemplate template;

	@JsonIgnore
	private int paymentLinkId;

	@JsonProperty("recurringPayment")
	private HateoasLink recurringPayment;

	public PaymentLinks recurringPayment(HateoasLink recurringPayment) {
		this.recurringPayment = recurringPayment;
		return this;
	}

	public int getPaymentLinkId() {
		return paymentLinkId;
	}

	public void setPaymentLinkId(int paymentLinkId) {
		this.paymentLinkId = paymentLinkId;
	}

	/**
	 * Get recurringPayment
	 * 
	 * @return recurringPayment
	 */
	@ApiModelProperty(value = "")

	@Valid

	public HateoasLink getRecurringPayment() {
		return recurringPayment;
	}

	public void setRecurringPayment(HateoasLink recurringPayment) {
		this.recurringPayment = recurringPayment;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PaymentLinks paymentLinks = (PaymentLinks) o;
		return Objects.equals(this.recurringPayment, paymentLinks.recurringPayment);
	}

	@Override
	public int hashCode() {
		return Objects.hash(recurringPayment);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PaymentLinks {\n");

		sb.append("    recurringPayment: ").append(toIndentedString(recurringPayment)).append("\n");
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

	private static final Logger log = LoggerFactory.getLogger(PaymentLinks.class);

	public PaymentLinks getLinks(int paymentLinkId) throws FDXException {
		try {
			template = ConnectionConfigApi51.getTemplate();
			SqlParameterSource parameters = new MapSqlParameterSource("paymentLinkId", paymentLinkId);
			PaymentLinks paymentLinks = template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".paymentLinks where paymentLinkId in (:paymentLinkId)", parameters,
					new PaymentLinksRowMapper());
			HateoasLink hateoaslink = new HateoasLink();
			hateoaslink = hateoaslink.getHateoasLinks(paymentLinks.getRecurringPayment().getHateoasLinkId());
			paymentLinks.setRecurringPayment(hateoaslink);
			return paymentLinks;
		} catch (EmptyResultDataAccessException e) {
			throw new FDXException("Payment Links not found", 0);
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("PaymentLinks : ", e);
			throw new FDXException(e,500);
		}
	}

	public Map<String, Object> addPaymentLinks() throws FDXException {
		KeyHolder keyHolder = new GeneratedKeyHolder();
		Map<String, Object> keys = null;
		try {
			HateoasLink recurringPayment = new HateoasLink();
			recurringPayment.setAction(ActionEnum.valueOf("GET"));
			recurringPayment.setHref("https://consumerdatastandardsaustralia.github.io/standards/images/logo.png");
			int paymentLinksArrayKey = 0;
			keys = recurringPayment.addImages();
			paymentLinksArrayKey = (int) keys.get("linkid");
			SqlParameterSource parameters = new MapSqlParameterSource("hateoasLinkId", recurringPayment);
			int count = template.update(
					"insert into "+ DeveloperContext.getDeveloperSchema() +".paymentlinks (recurringPayment) values ("
							+ ((recurringPayment != null) ? (paymentLinksArrayKey) : null) + ") ",
					parameters, keyHolder);
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("PaymentLinks : ", e);
			throw new FDXException(e,500);
		}
		return keyHolder.getKeys();
	}
}
