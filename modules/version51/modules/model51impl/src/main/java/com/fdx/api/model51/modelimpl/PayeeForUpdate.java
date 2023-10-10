package com.fdx.api.model51.modelimpl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fdx.api.model51.model.PayeeForUpdate51;
import com.fdx.common.exception.FDXException;
import com.fdx.common.util.FdxUtil;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Payee&#39;s fields to be updated
 */
@ApiModel(description = "Payee's fields to be updated")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
@Repository("PayeeForUpdate51")
public class PayeeForUpdate implements PayeeForUpdate51<Payee> {

	NamedParameterJdbcTemplate template;

	@JsonProperty("merchant")
	private MerchantForUpdate merchant;

	public PayeeForUpdate merchant(MerchantForUpdate merchant) {
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

	public MerchantForUpdate getMerchant() {
		return merchant;
	}

	public void setMerchant(MerchantForUpdate merchant) {
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
		PayeeForUpdate payeeForUpdate = (PayeeForUpdate) o;
		return Objects.equals(this.merchant, payeeForUpdate.merchant);
	}

	@Override
	public int hashCode() {
		return Objects.hash(merchant);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PayeeForUpdate {\n");
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

	private static final Logger log = LoggerFactory.getLogger(Transfer.class);

	//TODO move to payee process
	@Override
	public Payee updatePayee(String payeeId, Object payeeForUpdate) throws FDXException {
		ObjectMapper mapper = FdxUtil.getObjectMapper();
		PayeeForUpdate payeeForUpdateNew = mapper.convertValue(payeeForUpdate, new TypeReference<PayeeForUpdate>() {
		});
		Payee payee = new Payee();
		try {
			MerchantForUpdate merchantForUpdate = new MerchantForUpdate();
			Merchant merchant = merchantForUpdate.updateMerchant(payeeId, payeeForUpdateNew.getMerchant());
			payee.setMerchant(merchant);
			return payee;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (IllegalArgumentException e) {
			throw new FDXException(e,401);
		} catch (Exception e) {
			log.error("PayeeForUpdate : ", e);
			throw new FDXException(e,500);
		}
	}

	@Override
	public Payee postPayee(Object payeeForUpdate) throws FDXException {
		PayeeForUpdate payeeForUpdateNew = new PayeeForUpdate();
		try {
			ObjectMapper mapper = FdxUtil.getObjectMapper();
			payeeForUpdateNew = mapper.convertValue(payeeForUpdate, new TypeReference<PayeeForUpdate>() {});
			MerchantForUpdate merchantForUpdate = new MerchantForUpdate();
			Merchant merchant = new Merchant();
			Payee payee = new Payee();
		
			MerchantForUpdate merchantForUpdateResponse = merchantForUpdate.insertMerchantForUpdate(payeeForUpdateNew);
			merchant = merchant.insertMerchant(merchantForUpdateResponse.getPayeeId());
			merchant.setMerchantForUpdate(merchantForUpdateResponse);
			payee.setMerchant(merchant);
			
			return payee;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (IllegalArgumentException e) {
			throw new FDXException(e,401);
		} catch (Exception e) {
			log.error("PayeeForUpdate : ", e);
			throw new FDXException(e,500);
		}
	}

}
