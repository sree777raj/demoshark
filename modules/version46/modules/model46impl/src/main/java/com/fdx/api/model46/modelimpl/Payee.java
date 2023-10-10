package com.fdx.api.model46.modelimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fdx.common.exception.FDXException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fdx.api.model46.model.Payee46;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Payee to whom funds can be transferred. Can be extended to support additional
 * types of payees
 */
@ApiModel(description = "Payee to whom funds can be transferred. Can be extended to support additional types of payees")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
@Repository("Payee46")
public class Payee implements Payee46<Payee> {

	NamedParameterJdbcTemplate template;

	@JsonProperty("merchant")
	private Merchant merchant;

	public Payee merchant(Merchant merchant) {
		this.merchant = merchant;
		return this;
	}

	/**
	 * Get merchant
	 * 
	 * @return merchant
	 */
	@ApiModelProperty(required = true, value = "")
	@NotNull

	@Valid

	public Merchant getMerchant() {
		return merchant;
	}

	public void setMerchant(Merchant merchant) {
		this.merchant = merchant;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Payee payee = (Payee) o;
		return Objects.equals(this.merchant, payee.merchant);
	}

	@Override
	public int hashCode() {
		return Objects.hash(merchant);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Payee {\n");

		sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
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

	private static final Logger log = LoggerFactory.getLogger(Payee.class);

	public List<Merchant> getPayees(String updatedSince, int limit, String offset) throws FDXException {
		Merchant merchant = new Merchant();
		List<Merchant> merchantList = new ArrayList<>();
		try {
			merchantList = merchant.getMerchants(limit, updatedSince, offset);
			return merchantList;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Payee : ", e);
			throw new FDXException(e,500);
		}
	}

	public int getCount(String updatedSince) throws FDXException {
		Merchant merchant = new Merchant();
		try {
			return merchant.getMerchantsCount(updatedSince);
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Payee : ", e);
			throw new FDXException(e,500);
		}
	}

	@Override
	public Payee getPayeeById(String payeeId) throws FDXException {
		Merchant merchant = new Merchant();
		Payee payee = new Payee();
		try {
			merchant = merchant.getMerchant(payeeId);
			payee.setMerchant(merchant);
			return payee;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Payee : ", e);
			throw new FDXException(e,500);
		}
	}

	// TODO move to payee process
	@Override
	public Payee deletePayee(String payeeId) throws FDXException {
		Merchant merchant = new Merchant();
		Payee payee = new Payee();
		try {
			merchant = merchant.deleteMerchant(payeeId);
			payee.setMerchant(merchant);
			return payee;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Payee : ", e);
			throw new FDXException(e,500);
		}
	}
}
