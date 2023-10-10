package com.fdx.api.model51.modelimpl;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fdx.api.model51.config.ConnectionConfigApi51;
import com.fdx.api.model51.mapper.AccountsDescRowMapper;
import com.fdx.api.model51.mapper.FiAttrRowMapper;
import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import com.fdx.common.util.FdxConstants;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * This descriptor provides minimal information about the account for use in
 * lightweight arrays
 */
@ApiModel(description = "This descriptor provides minimal information about the account for use in lightweight arrays")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
@Component("AccountDescriptor51")
public class AccountDescriptor {

	NamedParameterJdbcTemplate template;

	public AccountDescriptor() {
	}

	@JsonProperty("accountId")
	private String accountId;

	@JsonProperty("error")
	private Error error;

	@JsonProperty("accountType")
	private AccountType accountType;

	@JsonProperty("accountNumber")
	private String accountNumber;

	@JsonProperty("accountNumberDisplay")
	private String accountNumberDisplay;

	@JsonProperty("productName")
	private String productName;

	@JsonProperty("nickname")
	private String nickname;

	@JsonProperty("accountCategory")
	private AccountCategory accountCategory;

	/**
	 * Account status
	 */
	public enum StatusEnum {
		OPEN("OPEN"),

		CLOSED("CLOSED"),

		PENDINGOPEN("PENDINGOPEN"),

		PENDINGCLOSE("PENDINGCLOSE"),

		DELINQUENT("DELINQUENT"),

		PAID("PAID"),

		NEGATIVECURRENTBALANCE("NEGATIVECURRENTBALANCE"),

		RESTRICTED("RESTRICTED");

		private String value;

		StatusEnum(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static StatusEnum fromValue(String value) {
			for (StatusEnum b : StatusEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'",401));
		}
	}

	@JsonProperty("accountStatus")
	private StatusEnum status;

	@JsonProperty("description")
	private String description;

	@JsonProperty("currency")
	private Currency currency;

	@JsonProperty("fiAttributes")
	@Valid
	private List<FiAttribute> fiAttributes = null;

	public AccountDescriptor accountId(String accountId) {
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

	public AccountDescriptor error(Error error) {
		this.error = error;
		return this;
	}

	/**
	 * Get error
	 * 
	 * @return error
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Error getError() {
		return error;
	}

	public void setError(Error error) {
		this.error = error;
	}

	public AccountDescriptor accountType(AccountType accountType) {
		this.accountType = accountType;
		return this;
	}

	/**
	 * Get accountType
	 * 
	 * @return accountType
	 */
	@ApiModelProperty(value = "")

	@Valid

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public AccountDescriptor accountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
		return this;
	}

	/**
	 * Full account number for the end user's handle for the account at the owning
	 * institution
	 * 
	 * @return accountNumber
	 */
	@ApiModelProperty(value = "Full account number for the end user's handle for the account at the owning institution")

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public AccountDescriptor accountNumberDisplay(String accountNumberDisplay) {
		this.accountNumberDisplay = accountNumberDisplay;
		return this;
	}

	/**
	 * Account display number for the end user's handle at the owning institution.
	 * This is to be displayed by the Interface Provider
	 * 
	 * @return accountNumberDisplay
	 */
	@ApiModelProperty(value = "Account display number for the end user's handle at the owning institution. This is to be displayed by the Interface Provider")

	public String getAccountNumberDisplay() {
		return accountNumberDisplay;
	}

	public void setAccountNumberDisplay(String accountNumberDisplay) {
		this.accountNumberDisplay = accountNumberDisplay;
	}

	public AccountDescriptor productName(String productName) {
		this.productName = productName;
		return this;
	}

	/**
	 * Marketed product name for this account. Used in UIs to assist in account
	 * selection
	 * 
	 * @return productName
	 */
	@ApiModelProperty(value = "Marketed product name for this account. Used in UIs to assist in account selection")

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public AccountDescriptor nickname(String nickname) {
		this.nickname = nickname;
		return this;
	}

	/**
	 * Name given by the user. Used in UIs to assist in account selection
	 * 
	 * @return nickname
	 */
	@ApiModelProperty(value = "Name given by the user. Used in UIs to assist in account selection")

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public AccountDescriptor status(StatusEnum status) {
		this.status = status;
		return this;
	}

	/**
	 * Account status
	 * 
	 * @return status
	 */
	@ApiModelProperty(value = "Account status")

	public StatusEnum getStatus() {
		return status;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}

	public AccountDescriptor description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Description of account
	 * 
	 * @return description
	 */
	@ApiModelProperty(value = "Description of account")

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public AccountDescriptor currency(Currency currency) {
		this.currency = currency;
		return this;
	}

	/**
	 * Get currency
	 * 
	 * @return currency
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public AccountCategory getAccountCategory() {
		return accountCategory;
	}

	public void setAccountCategory(AccountCategory accountCategory) {
		this.accountCategory = accountCategory;
	}

	public AccountDescriptor fiAttributes(List<FiAttribute> fiAttributes) {
		this.fiAttributes = fiAttributes;
		return this;
	}

	public AccountDescriptor addFiAttributesItem(FiAttribute fiAttributesItem) {
		if (this.fiAttributes == null) {
			this.fiAttributes = new ArrayList<>();
		}
		this.fiAttributes.add(fiAttributesItem);
		return this;
	}

	/**
	 * Array of Financial institution-specific attributes
	 * 
	 * @return fiAttributes
	 */
	@ApiModelProperty(value = "Array of Financial institution-specific attributes")

	@Valid

	public List<FiAttribute> getFiAttributes() {
		return fiAttributes;
	}

	public void setFiAttributes(List<FiAttribute> fiAttributes) {
		this.fiAttributes = fiAttributes;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AccountDescriptor accountDescriptor = (AccountDescriptor) o;
		return Objects.equals(this.accountId, accountDescriptor.accountId)
				&& Objects.equals(this.error, accountDescriptor.error)
				&& Objects.equals(this.accountType, accountDescriptor.accountType)
				&& Objects.equals(this.accountNumber, accountDescriptor.accountNumber)
				&& Objects.equals(this.accountNumberDisplay, accountDescriptor.accountNumberDisplay)
				&& Objects.equals(this.productName, accountDescriptor.productName)
				&& Objects.equals(this.nickname, accountDescriptor.nickname)
				&& Objects.equals(this.status, accountDescriptor.status)
				&& Objects.equals(this.description, accountDescriptor.description)
				&& Objects.equals(this.currency, accountDescriptor.currency)
				&& Objects.equals(this.accountCategory, accountDescriptor.accountCategory)
				&& Objects.equals(this.fiAttributes, accountDescriptor.fiAttributes);
	}

	@Override
	public int hashCode() {
		return Objects.hash(accountId, error, accountType, accountNumber, accountNumberDisplay, productName, nickname,
				status, description, currency, accountCategory, fiAttributes);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AccountDescriptor {\n");

		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    error: ").append(toIndentedString(error)).append("\n");
		sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
		sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
		sb.append("    accountNumberDisplay: ").append(toIndentedString(accountNumberDisplay)).append("\n");
		sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
		sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
		sb.append("    status: ").append(toIndentedString(status)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
		sb.append("    accountCategory: ").append(toIndentedString(accountCategory)).append("\n");
		sb.append("    fiAttributes: ").append(toIndentedString(fiAttributes)).append("\n");
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

	private static final Logger log = LoggerFactory.getLogger(AccountDescriptor.class);

	public AccountDescriptor getAccountDescriptor(String accountId) throws FDXException {
		AccountDescriptor accountDescriptor = new AccountDescriptor();
		try {
			template = ConnectionConfigApi51.getTemplate();
			SqlParameterSource parameters = new MapSqlParameterSource("accountId", accountId);
			if (accountId != null) {
				accountDescriptor = template.queryForObject(
						"select * from "+ DeveloperContext.getDeveloperSchema() +".accountDescriptor where accountid in (:accountId)", parameters,
						new AccountsDescRowMapper());
			}
			accountDescriptor = processDescriptorResponse(accountDescriptor);
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("AccountDescriptor : ", e);
			throw new FDXException(e, FdxConstants.HTTP_ERROR_CODE_500);
		}
		return accountDescriptor;
	}

	private AccountDescriptor processDescriptorResponse(AccountDescriptor accountDescriptor) throws FDXException {
		SqlParameterSource parameters = new MapSqlParameterSource("accountIds", accountDescriptor.getAccountId());
		try {
			template = ConnectionConfigApi51.getTemplate();
			Error error = new Error();
			Currency currency = new Currency();
			if (accountDescriptor.getError() != null) {
					error = error.getError(accountDescriptor.getError().getCode());
				accountDescriptor.setError(error);
			} else
				accountDescriptor.setError(null);

			if (accountDescriptor.getCurrency() != null) {
					currency = currency.getCurrency(accountDescriptor.getCurrency().getCurrencyCode().toString());
				accountDescriptor.setCurrency(currency);
			} else
				accountDescriptor.setCurrency(null);

			// FIAttributes start
			if (accountDescriptor.getFiAttributes() != null) {
				List<FiAttribute> fiAttrList = accountDescriptor.getFiAttributes();
				List<FiAttribute> fiAttrListNew = new ArrayList<>();
				if (fiAttrList != null) {
					for (FiAttribute fiAttribute : fiAttrList) {
						FiAttrEntity fiAttrEntity = new FiAttrEntity();
						FiAttribute fiAttributeNew = new FiAttribute();
						int name = Integer.valueOf(fiAttribute.getName()).intValue();
						parameters = new MapSqlParameterSource("fiAttributes", name);
							fiAttrEntity = (FiAttrEntity) template.queryForObject(
									"select * from "+ DeveloperContext.getDeveloperSchema() +".fiattribute where attrid in (:fiAttributes)", parameters,
									new FiAttrRowMapper());
						fiAttributeNew.setName(fiAttrEntity.getName());
						fiAttributeNew.setValue(fiAttrEntity.getValue());
						fiAttrListNew.add(fiAttributeNew);
					}
					accountDescriptor.setFiAttributes(fiAttrListNew);
				}
			}
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("AccountDescriptor : ", e);
			throw new FDXException(e,FdxConstants.HTTP_ERROR_CODE_500);
		}
		return accountDescriptor;
	}

}
