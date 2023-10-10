package com.fdx.api.model46.modelimpl;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fdx.api.model46.config.ConnectionConfigApi46;
import com.fdx.api.model46.mapper.AccountContactRowMapper;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Contact information for the account
 */
@ApiModel(description = "Contact information for the account")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
@Repository("AccountContact46")
public class AccountContact {

	NamedParameterJdbcTemplate template;

	@JsonIgnore
	private int contactId;

	@JsonProperty("holders")
	@Valid
	private List<AccountHolder> holders = null;

	@JsonProperty("emails")
	@Valid
	private List<String> emails = null;

	@JsonProperty("addresses")
	@Valid
	private List<DeliveryAddress> addresses = null;

	@JsonProperty("telephones")
	@Valid
	private List<TelephoneNumber> telephones = null;

	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public AccountContact holders(List<AccountHolder> holders) {
		this.holders = holders;
		return this;
	}

	public AccountContact addHoldersItem(AccountHolder holdersItem) {
		if (this.holders == null) {
			this.holders = new ArrayList<>();
		}
		this.holders.add(holdersItem);
		return this;
	}

	/**
	 * Owners of the acount
	 * 
	 * @return holders
	 */
	@ApiModelProperty(value = "Owners of the acount")

	@Valid

	public List<AccountHolder> getHolders() {
		return holders;
	}

	public void setHolders(List<AccountHolder> holders) {
		this.holders = holders;
	}

	public AccountContact emails(List<String> emails) {
		this.emails = emails;
		return this;
	}

	public AccountContact addEmailsItem(String emailsItem) {
		if (this.emails == null) {
			this.emails = new ArrayList<>();
		}
		this.emails.add(emailsItem);
		return this;
	}

	/**
	 * Email addresses associated with the account
	 * 
	 * @return emails
	 */
	@ApiModelProperty(value = "Email addresses associated with the account")

	public List<String> getEmails() {
		return emails;
	}

	public void setEmails(List<String> emails) {
		this.emails = emails;
	}

	public AccountContact addresses(List<DeliveryAddress> addresses) {
		this.addresses = addresses;
		return this;
	}

	public AccountContact addAddressesItem(DeliveryAddress addressesItem) {
		if (this.addresses == null) {
			this.addresses = new ArrayList<>();
		}
		this.addresses.add(addressesItem);
		return this;
	}

	/**
	 * Physical mail addresses associated with the account
	 * 
	 * @return addresses
	 */
	@ApiModelProperty(value = "Physical mail addresses associated with the account")

	@Valid

	public List<DeliveryAddress> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<DeliveryAddress> addresses) {
		this.addresses = addresses;
	}

	public AccountContact telephones(List<TelephoneNumber> telephones) {
		this.telephones = telephones;
		return this;
	}

	public AccountContact addTelephonesItem(TelephoneNumber telephonesItem) {
		if (this.telephones == null) {
			this.telephones = new ArrayList<>();
		}
		this.telephones.add(telephonesItem);
		return this;
	}

	/**
	 * Telephone numbers associated with the account
	 * 
	 * @return telephones
	 */
	@ApiModelProperty(value = "Telephone numbers associated with the account")

	@Valid

	public List<TelephoneNumber> getTelephones() {
		return telephones;
	}

	public void setTelephones(List<TelephoneNumber> telephones) {
		this.telephones = telephones;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addresses == null) ? 0 : addresses.hashCode());
		result = prime * result + contactId;
		result = prime * result + ((emails == null) ? 0 : emails.hashCode());
		result = prime * result + ((holders == null) ? 0 : holders.hashCode());
		result = prime * result + ((telephones == null) ? 0 : telephones.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AccountContact other = (AccountContact) obj;
		if (addresses == null) {
			if (other.addresses != null)
				return false;
		} else if (!addresses.equals(other.addresses))
			return false;
		if (contactId != other.contactId)
			return false;
		if (emails == null) {
			if (other.emails != null)
				return false;
		} else if (!emails.equals(other.emails))
			return false;
		if (holders == null) {
			if (other.holders != null)
				return false;
		} else if (!holders.equals(other.holders))
			return false;
		if (telephones == null) {
			if (other.telephones != null)
				return false;
		} else if (!telephones.equals(other.telephones))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AccountContact [template=" + template + ", contactId=" + contactId + ", holders=" + holders
				+ ", emails=" + emails + ", addresses=" + addresses + ", telephones=" + telephones + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(AccountContact.class);

	public AccountContact getAccountContact(int contactId) throws FDXException {
		try {
			template = ConnectionConfigApi46.getTemplate();

			AccountContact accountContactResponse = new AccountContact();
			AccountContact accountContact = new AccountContact();

			SqlParameterSource parameters = new MapSqlParameterSource("contactId", contactId);

			if (contactId != 0) {
				accountContactResponse = template.queryForObject(
						"select * from "+ DeveloperContext.getDeveloperSchema() +".accountcontact where contactId in (:contactId)", parameters,
						new AccountContactRowMapper());
			}
//			Holder
			List<AccountHolder> accountHolderList = new ArrayList<>();
			List<AccountHolder> accountHolderListNew = accountContactResponse.getHolders();
			if (accountHolderListNew != null) {
				for (AccountHolder accountHolderIterator : accountHolderListNew) {
						AccountHolder accountHolderNew = accountHolderIterator
								.getAccountHoldersList(accountHolderIterator.getHolderId());
						accountHolderList.add(accountHolderNew);
				}
				accountContact.setHolders(accountHolderList);
			}

//			Email
			accountContact.setEmails(accountContactResponse.getEmails());

//			DeliveryAddress 
			List<DeliveryAddress> deliveryAddressList = new ArrayList<>();
			List<DeliveryAddress> deliveryAddressResponseList = accountContactResponse.getAddresses();
			if (deliveryAddressResponseList != null) {
				for (DeliveryAddress deliveryAddressIterator : deliveryAddressResponseList) {
					DeliveryAddress deliveryAddress = new DeliveryAddress();
						deliveryAddress = deliveryAddressIterator
								.getDeliveryAddress(deliveryAddressIterator.getDeliveryAddressId());
						deliveryAddressList.add(deliveryAddress);
				}
				accountContact.setAddresses(deliveryAddressList);
			}
//			Telephones
			List<TelephoneNumber> telephoneNumberList = new ArrayList<>();
			List<TelephoneNumber> telephoneNumberResponseList = accountContactResponse.getTelephones();
			if (telephoneNumberResponseList != null) {
				for (TelephoneNumber telephoneNumberIterator : telephoneNumberResponseList) {
					TelephoneNumber telephoneNumber = new TelephoneNumber();
						telephoneNumber = telephoneNumberIterator
								.getTelephoneNumber(telephoneNumberIterator.getTelephoneId());
						telephoneNumberList.add(telephoneNumber);
				}
				accountContact.setTelephones(telephoneNumberList);
			}
			return accountContact;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("AccountContact : ", e);
			throw new FDXException(e,500);
		}
	}
}
