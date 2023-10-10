package com.fdx.api.model46.modelimpl;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fdx.api.model46.config.ConnectionConfigApi46;
import com.fdx.api.model46.mapper.MerchantForUpdateRowMapper;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Merchant&#39;s fields to be updated. Describes the fields that can be updated
 * by the client. Supported fields could be server dependent
 */
@ApiModel(description = "Merchant's fields to be updated. Describes the fields that can be updated by the client. Supported fields could be server dependent")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class MerchantForUpdate {

	@JsonIgnore
	NamedParameterJdbcTemplate template;

	@JsonIgnore
	private String payeeId;

	@JsonIgnore
	private int nameId;

	@JsonIgnore
	private int addressId;

	@JsonIgnore
	private int phoneId;

	@JsonProperty("displayName")
	private String displayName;

	@JsonProperty("name")
	private CustomerName name;

	@JsonProperty("address")
	private DeliveryAddress address;

	@JsonProperty("phone")
	private TelephoneNumber phone;

	@JsonProperty("merchantAccountIds")
	@Valid
	private List<String> merchantAccountIds = null;

	public String getPayeeId() {
		return payeeId;
	}

	public void setPayeeId(String payeeId) {
		this.payeeId = payeeId;
	}

	public int getNameId() {
		return nameId;
	}

	public void setNameId(int nameId) {
		this.nameId = nameId;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public int getPhoneId() {
		return phoneId;
	}

	public void setPhoneId(int phoneId) {
		this.phoneId = phoneId;
	}

	public MerchantForUpdate displayName(String displayName) {
		this.displayName = displayName;
		return this;
	}

	/**
	 * User defined name for the payee. Used by the customer to identify the payee.
	 * Not used by the system to process payments
	 * 
	 * @return displayName
	 */
	@ApiModelProperty(value = "User defined name for the payee. Used by the customer to identify the payee. Not used by the system to process payments")

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public MerchantForUpdate name(CustomerName name) {
		this.name = name;
		return this;
	}

	/**
	 * Get name
	 * 
	 * @return name
	 */
	@ApiModelProperty(value = "")

	@Valid

	public CustomerName getName() {
		return name;
	}

	public void setName(CustomerName name) {
		this.name = name;
	}

	public MerchantForUpdate address(DeliveryAddress address) {
		this.address = address;
		return this;
	}

	/**
	 * Get address
	 * 
	 * @return address
	 */
	@ApiModelProperty(value = "")

	@Valid

	public DeliveryAddress getAddress() {
		return address;
	}

	public void setAddress(DeliveryAddress address) {
		this.address = address;
	}

	public MerchantForUpdate phone(TelephoneNumber phone) {
		this.phone = phone;
		return this;
	}

	/**
	 * Get phone
	 * 
	 * @return phone
	 */
	@ApiModelProperty(value = "")

	@Valid

	public TelephoneNumber getPhone() {
		return phone;
	}

	public void setPhone(TelephoneNumber phone) {
		this.phone = phone;
	}

	public MerchantForUpdate merchantAccountIds(List<String> merchantAccountIds) {
		this.merchantAccountIds = merchantAccountIds;
		return this;
	}

	public MerchantForUpdate addMerchantAccountIdsItem(String merchantAccountIdsItem) {
		if (this.merchantAccountIds == null) {
			this.merchantAccountIds = new ArrayList<>();
		}
		this.merchantAccountIds.add(merchantAccountIdsItem);
		return this;
	}

	/**
	 * Account identifier(s) the customer has with the payee
	 * 
	 * @return merchantAccountIds
	 */
	@ApiModelProperty(value = "Account identifier(s) the customer has with the payee")

	public List<String> getMerchantAccountIds() {
		return merchantAccountIds;
	}

	public void setMerchantAccountIds(List<String> merchantAccountIds) {
		this.merchantAccountIds = merchantAccountIds;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		MerchantForUpdate merchantForUpdate = (MerchantForUpdate) o;
		return Objects.equals(this.displayName, merchantForUpdate.displayName)
				&& Objects.equals(this.name, merchantForUpdate.name)
				&& Objects.equals(this.address, merchantForUpdate.address)
				&& Objects.equals(this.phone, merchantForUpdate.phone)
				&& Objects.equals(this.merchantAccountIds, merchantForUpdate.merchantAccountIds);
	}

	@Override
	public int hashCode() {
		return Objects.hash(displayName, name, address, phone, merchantAccountIds);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class MerchantForUpdate {\n");

		sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    address: ").append(toIndentedString(address)).append("\n");
		sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
		sb.append("    merchantAccountIds: ").append(toIndentedString(merchantAccountIds)).append("\n");
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

	private static final Logger log = LoggerFactory.getLogger(MerchantForUpdate.class);

	public MerchantForUpdate getMerchantForUpdateDetails(String payeeId) throws FDXException {
		MerchantForUpdate merchantForUpdate = new MerchantForUpdate();
		try {
			template = ConnectionConfigApi46.getTemplate();
			SqlParameterSource parameters = new MapSqlParameterSource("payeeId", payeeId);
			try {
				merchantForUpdate = template.queryForObject(
						"select * from "+ DeveloperContext.getDeveloperSchema() +".merchantForUpdate where payeeId in (:payeeId)", parameters,
						new MerchantForUpdateRowMapper());
			} catch (EmptyResultDataAccessException e) {
				throw new FDXException(800);
			}
//			DeliveryAddress 
			DeliveryAddress deliveryAddress = new DeliveryAddress();
			if (merchantForUpdate.getAddress() != null) {
				deliveryAddress = deliveryAddress
						.getDeliveryAddress(merchantForUpdate.getAddress().getDeliveryAddressId());
				merchantForUpdate.setAddress(deliveryAddress);
			}
//			Telephones
			TelephoneNumber telephoneNumber = new TelephoneNumber();
			if (merchantForUpdate.getPhone() != null) {
				telephoneNumber = telephoneNumber.getTelephoneNumber(merchantForUpdate.getPhone().getTelephoneId());
				merchantForUpdate.setPhone(telephoneNumber);
			}
//			CustomerName
			CustomerName customerName = new CustomerName();
			if (merchantForUpdate.getName() != null) {
				customerName = customerName.getCustomerName(merchantForUpdate.getName().getNameId());
				merchantForUpdate.setName(customerName);
			}
			return merchantForUpdate;
		} catch (EmptyResultDataAccessException e) {
			throw new FDXException(e,800);
		} catch (Exception e) {
			log.error("MerchantForUpdate : ", e);
			throw new FDXException(e,500);
		}
	}

	public Merchant updateMerchant(String payeeId, MerchantForUpdate merchantForUpdate) throws FDXException {
		try {
			template = ConnectionConfigApi46.getTemplate();
			DeliveryAddress deliveryAddress = new DeliveryAddress();
			TelephoneNumber telephoneNumber = new TelephoneNumber();
			CustomerName customerName = new CustomerName();

			Merchant merchant = new Merchant();
			merchant = merchant.getMerchant(payeeId);

			Payee payee = new Payee();
			if (merchantForUpdate.getPayeeId() != null) {
				payee = payee.getPayeeById(payeeId);
				if ((payee.getMerchant().getStatus().getValue().toString()).equals("DELETED"))
					throw new FDXException(801);
			}
			SqlParameterSource parameters = new MapSqlParameterSource("payeeId", payeeId);
			StringBuffer query = new StringBuffer();
			query.append("update "+ DeveloperContext.getDeveloperSchema() +".merchantforupdate set ");

			List<String> changedProperties = new ArrayList<>();
			for (Field field : merchantForUpdate.getClass().getDeclaredFields()) {
				field.setAccessible(true);
				Object value1 = field.get(merchantForUpdate);
				Object value2 = field.get(merchant.getMerchantForUpdate());
				if (!((field.getName()).equals("name") || (field.getName()).equals("address")
						|| (field.getName()).equals("phone") || (field.getName()).equals("merchantAccountIds")
						|| (field.getName()).equals("nameId") || (field.getName()).equals("addressId")
						|| (field.getName()).equals("phoneId"))) {
					if (value1 != null && value2 != null) {
						if (!Objects.equals(value1, value2)) {
							changedProperties.add(field.getName());
							query.append(field.getName() + "='" + value1 + "',");
						}
					}
				}

				if ((field.getName()).equals("name") && merchantForUpdate.getName() != null) {
					Map<String, Object> keys = customerName.updateCustomer(merchantForUpdate, merchant, field);
					if (keys != null) {
						changedProperties.add(field.getName());
						query.append("nameid=" + (int) keys.get("custemernameid") + ",");
					}
				}

				if ((field.getName()).equals("address") && merchantForUpdate.getAddress() != null) {
					Map<String, Object> keys = deliveryAddress.updateDeliveryAddress(merchantForUpdate, merchant,
							field);
					if (keys != null) {
						changedProperties.add(field.getName());
						query.append("addressId=" + (int) keys.get("deliveryaddressid") + ",");
					}
				}

				if ((field.getName()).equals("phone") && merchantForUpdate.getPhone() != null) {
					Map<String, Object> keys = telephoneNumber.updateTelephone(merchantForUpdate, merchant, field);
					if (keys != null) {
						changedProperties.add(field.getName());
						query.append("phone=" + (int) keys.get("telephoneid") + ",");
					}
				}

				List<String> merchantAccountIdsArray = null;
				if ((field.getName()).equals("merchantAccountIds")
						&& merchantForUpdate.getMerchantAccountIds() != null) {
					if (merchantForUpdate.getMerchantAccountIds() != null) {
						changedProperties.add(field.getName());
						String[] merchantAccountIdsArrayKeyList = new String[merchantForUpdate.getMerchantAccountIds()
								.size()];
						int i = 0;
						for (String merchantAccountIdsIterator : merchantForUpdate.getMerchantAccountIds()) {
							merchantAccountIdsArrayKeyList[i++] = "'" + merchantAccountIdsIterator + "'";
						}
						merchantAccountIdsArray = Arrays.asList(merchantAccountIdsArrayKeyList);
						query.append("merchantAccountIds =array" + merchantAccountIdsArray + ",");
					}
				}
			}
			StringBuffer queryNew = new StringBuffer(query.substring(0, query.length() - 1).toString());
			int count = 0;
			if (changedProperties.size() != 0) {
				queryNew.append(" where payeeid='" + payeeId + "'");
				count = template.update(queryNew.toString(), parameters);
				if (count != 1) {
					log.error("MerchantForUpdate failed for payeeId: " + payeeId);
					throw new FDXException(500);
				}
			}
			merchant = merchant.getMerchant(payeeId);
			return merchant;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("MerchantForUpdate : ", e);
			throw new FDXException(e,500);
		}
	}

	public MerchantForUpdate insertMerchantForUpdate(PayeeForUpdate payeeForUpdateNew) throws FDXException {
		try {
			template = ConnectionConfigApi46.getTemplate();
			Map<String, Object> keys = null;
			Merchant merchant = new Merchant();

			SqlParameterSource parameters = new MapSqlParameterSource("payeeId", null);
			MerchantForUpdate merchantForUpdate = new MerchantForUpdate();
			merchantForUpdate = payeeForUpdateNew.getMerchant();
			UpdatesMetadata updatesMetadata = new UpdatesMetadata();

//			UpdateMetadata Start
			String payeeId = updatesMetadata.assignNextSequenceId("Payees");
//			UpdateMetadata End

//			CustomerName Start
			int customerNameArrayKey = 0;
			if (merchantForUpdate.getName() != null) {
				keys = merchantForUpdate.getName().insertCustomerName();
				customerNameArrayKey = (int) keys.get("custemernameid");
			}
//			CustomerName End

//			DeliveryAddress Start
			int deliveryAddressNameArrayKey = 0;
			if (merchantForUpdate.getAddress() != null) {
				keys = merchantForUpdate.getAddress().insertDeliveryAddressName();
				deliveryAddressNameArrayKey = (int) keys.get("deliveryaddressid");
			}
//			DeliveryAddressEnd

//			TelephoneNumber Start
			int telephoneArrayKey = 0;
			if (merchantForUpdate.getPhone() != null) {
				keys = merchantForUpdate.getPhone().insertTelephone();
				telephoneArrayKey = (int) keys.get("telephoneid");
			}
//			TelephoneNumber End

//			MerchantAcocuntIds Start 
			List<String> merchantAccountIdsArray = null;
			if (merchantForUpdate.getMerchantAccountIds() != null) {
				String[] merchantAccountIdsArrayKeyList = new String[merchantForUpdate.getMerchantAccountIds().size()];
				int i = 0;
				for (String merchantAccountIdsIterator : merchantForUpdate.getMerchantAccountIds()) {
					merchantAccountIdsArrayKeyList[i++] = "'" + merchantAccountIdsIterator + "'";
				}
				merchantAccountIdsArray = Arrays.asList(merchantAccountIdsArrayKeyList);
			}
//			merchantAccountIds End

			int count = template.update(
					"insert into "+ DeveloperContext.getDeveloperSchema() +".merchantForUpdate (payeeid,displayname,nameid,addressid,phone,merchantaccountids) values ('"
							+ payeeId + "','" + merchantForUpdate.getDisplayName() + "',"
							+ ((merchantForUpdate.getName() != null) ? ("'" + customerNameArrayKey + "'") : null) + ","
							+ ((merchantForUpdate.getAddress() != null) ? ("'" + deliveryAddressNameArrayKey + "'")
									: null)
							+ "," + ((merchantForUpdate.getPhone() != null) ? ("'" + telephoneArrayKey + "'") : null)
							+ ","
							+ ((merchantForUpdate.getMerchantAccountIds() != null)
									? ("array" + merchantAccountIdsArray + "")
									: null)
							+ ")",
					parameters);

			if (count == 1)
				merchantForUpdate = merchantForUpdate.getMerchantForUpdateDetails(payeeId);

			return merchantForUpdate;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("MerchantForUpdate : ", e);
			throw new FDXException(e, 500);
		}
	}
}
