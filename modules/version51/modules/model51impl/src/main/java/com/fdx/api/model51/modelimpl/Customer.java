package com.fdx.api.model51.modelimpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.OptBoolean;
import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fdx.api.model51.config.ConnectionConfigApi51;
import com.fdx.api.model51.mapper.CustomerRowMapper;
import com.fdx.api.model51.model.Customer51;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Represents a customer
 */
@ApiModel(description = "Represents a customer")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
@Repository("Customer51")
public class Customer implements Customer51<Customer> {

	NamedParameterJdbcTemplate template;

	@JsonProperty("customerId")
	private String customerId;

	@JsonIgnore
	private int customerNameId;

	@JsonProperty("name")
	private CustomerName customerName;

	@JsonProperty("dateOfBirth")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private Date dateOfBirth;

	@JsonProperty("taxId")
	private String taxId;

	@JsonProperty("governmentId")
	private String governmentId;

	@JsonProperty("email")
	@Valid
	private List<String> email = null;

	@JsonProperty("addresses")
	@Valid
	private List<DeliveryAddress> addresses = null;

	@JsonProperty("telephones")
	@Valid
	private List<TelephoneNumber> telephones = null;

	@JsonProperty("accounts")
	@Valid
	private List<CustomerToAccountRelationship> accounts = null;

	public Customer customerId(String customerId) {
		this.customerId = customerId;
		return this;
	}

	/**
	 * Value for a unique identifier
	 * 
	 * @return customerId
	 */
	@ApiModelProperty(value = "Value for a unique identifier")

	@Size(max = 256)
	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public int getCustomerNameId() {
		return customerNameId;
	}

	public void setCustomerNameId(int customerNameId) {
		this.customerNameId = customerNameId;
	}

	public CustomerName getCustomerName() {
		return customerName;
	}

	public void setCustomerName(CustomerName customerName) {
		this.customerName = customerName;
	}

	public Customer dateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
		return this;
	}

	/**
	 * Get dateOfBirth
	 * 
	 * @return dateOfBirth
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Customer taxId(String taxId) {
		this.taxId = taxId;
		return this;
	}

	/**
	 * The SSN or TIN associated with this customer
	 * 
	 * @return taxId
	 */
	@ApiModelProperty(value = "The SSN or TIN associated with this customer")

	public String getTaxId() {
		return taxId;
	}

	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}

	public Customer governmentId(String governmentId) {
		this.governmentId = governmentId;
		return this;
	}

	/**
	 * A federal (such as passport) or state (such as driver's license) issued
	 * identifier
	 * 
	 * @return governmentId
	 */
	@ApiModelProperty(value = "A federal (such as passport) or state (such as driver's license) issued identifier")

	public String getGovernmentId() {
		return governmentId;
	}

	public void setGovernmentId(String governmentId) {
		this.governmentId = governmentId;
	}

	public Customer email(List<String> email) {
		this.email = email;
		return this;
	}

	public Customer addEmailItem(String emailItem) {
		if (this.email == null) {
			this.email = new ArrayList<>();
		}
		this.email.add(emailItem);
		return this;
	}

	/**
	 * An array of the customer's electronic mail addresses
	 * 
	 * @return email
	 */
	@ApiModelProperty(value = "An array of the customer's electronic mail addresses")

	public List<String> getEmail() {
		return email;
	}

	public void setEmail(List<String> email) {
		this.email = email;
	}

	public Customer addresses(List<DeliveryAddress> addresses) {
		this.addresses = addresses;
		return this;
	}

	public Customer addAddressesItem(DeliveryAddress addressesItem) {
		if (this.addresses == null) {
			this.addresses = new ArrayList<>();
		}
		this.addresses.add(addressesItem);
		return this;
	}

	/**
	 * An array of the customer's physical mail addresses
	 * 
	 * @return addresses
	 */
	@ApiModelProperty(value = "An array of the customer's physical mail addresses")

	@Valid

	public List<DeliveryAddress> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<DeliveryAddress> addresses) {
		this.addresses = addresses;
	}

	public Customer telephones(List<TelephoneNumber> telephones) {
		this.telephones = telephones;
		return this;
	}

	public Customer addTelephonesItem(TelephoneNumber telephonesItem) {
		if (this.telephones == null) {
			this.telephones = new ArrayList<>();
		}
		this.telephones.add(telephonesItem);
		return this;
	}

	/**
	 * An array of the customer's telephone numbers
	 * 
	 * @return telephones
	 */
	@ApiModelProperty(value = "An array of the customer's telephone numbers")

	@Valid

	public List<TelephoneNumber> getTelephones() {
		return telephones;
	}

	public void setTelephones(List<TelephoneNumber> telephones) {
		this.telephones = telephones;
	}

	public Customer accounts(List<CustomerToAccountRelationship> accounts) {
		this.accounts = accounts;
		return this;
	}

	public Customer addAccountsItem(CustomerToAccountRelationship accountsItem) {
		if (this.accounts == null) {
			this.accounts = new ArrayList<>();
		}
		this.accounts.add(accountsItem);
		return this;
	}

	/**
	 * List of accounts related to this customer
	 * 
	 * @return accounts
	 */
	@ApiModelProperty(value = "List of accounts related to this customer")

	@Valid

	public List<CustomerToAccountRelationship> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<CustomerToAccountRelationship> accounts) {
		this.accounts = accounts;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerNameId=" + customerNameId + ", customerName="
				+ customerName + ", dateOfBirth=" + dateOfBirth + ", taxId=" + taxId + ", governmentId=" + governmentId
				+ ", email=" + email + ", addresses=" + addresses + ", telephones=" + telephones + ", accounts="
				+ accounts + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accounts == null) ? 0 : accounts.hashCode());
		result = prime * result + ((addresses == null) ? 0 : addresses.hashCode());
		result = prime * result + ((customerId == null) ? 0 : customerId.hashCode());
		result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
		result = prime * result + customerNameId;
		result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((governmentId == null) ? 0 : governmentId.hashCode());
		result = prime * result + ((taxId == null) ? 0 : taxId.hashCode());
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
		Customer other = (Customer) obj;
		if (accounts == null) {
			if (other.accounts != null)
				return false;
		} else if (!accounts.equals(other.accounts))
			return false;
		if (addresses == null) {
			if (other.addresses != null)
				return false;
		} else if (!addresses.equals(other.addresses))
			return false;
		if (customerId == null) {
			if (other.customerId != null)
				return false;
		} else if (!customerId.equals(other.customerId))
			return false;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		if (customerNameId != other.customerNameId)
			return false;
		if (dateOfBirth == null) {
			if (other.dateOfBirth != null)
				return false;
		} else if (!dateOfBirth.equals(other.dateOfBirth))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (governmentId == null) {
			if (other.governmentId != null)
				return false;
		} else if (!governmentId.equals(other.governmentId))
			return false;
		if (taxId == null) {
			if (other.taxId != null)
				return false;
		} else if (!taxId.equals(other.taxId))
			return false;
		if (telephones == null) {
			if (other.telephones != null)
				return false;
		} else if (!telephones.equals(other.telephones))
			return false;
		return true;
	}

	private static final Logger log = LoggerFactory.getLogger(Customer.class);

	@Override
	public Customer getCustomerDetails(String customerId) throws FDXException {
		try {
			template = ConnectionConfigApi51.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("customerId", customerId);
			try {
				Customer customerResponse = template.queryForObject(
						"select * from "+ DeveloperContext.getDeveloperSchema() +".customer where customerId in (:customerId)", parameters,
						new CustomerRowMapper());
				return getCustomer(customerResponse);
			} catch (EmptyResultDataAccessException e) {
				throw new FDXException(e, 601);
			}
		} catch (FDXException e) {
			throw e;
		} catch (Exception e) {
			log.error("Customer : ", e);
			throw new FDXException(e,500);
		}
	}

	private Customer getCustomer(Customer customerResponse) throws FDXException {
		Customer customer = new Customer();
		customer.setCustomerId(customerResponse.getCustomerId());
		// CustomerName
		CustomerName customerName = new CustomerName();
		customerName = customerName.getCustomerName(customerResponse.getCustomerNameId());
		customer.setCustomerName(customerName);
		customer.setDateOfBirth(customerResponse.getDateOfBirth());
		customer.setTaxId(customerResponse.getTaxId());
		customer.setGovernmentId(customerResponse.getGovernmentId());
		customer.setEmail(customerResponse.getEmail());
		// DeliveryAddress
		List<DeliveryAddress> deliveryAddressList = new ArrayList<>();
		if (customerResponse.getAddresses() != null) {
			List<DeliveryAddress> deliveryAddressResponseList = customerResponse.getAddresses();
			for (DeliveryAddress deliveryAddressIterator : deliveryAddressResponseList) {
				DeliveryAddress deliveryAddress = new DeliveryAddress();
				deliveryAddress = deliveryAddressIterator
						.getDeliveryAddress(deliveryAddressIterator.getDeliveryAddressId());
				deliveryAddressList.add(deliveryAddress);
			}
			customer.setAddresses(deliveryAddressList);
		}
		// Telephones
		List<TelephoneNumber> telephoneNumberList = new ArrayList<>();
		if (customerResponse.getTelephones() != null) {
			List<TelephoneNumber> telephoneNumberResponseList = customerResponse.getTelephones();
			for (TelephoneNumber telephoneNumberIterator : telephoneNumberResponseList) {
				TelephoneNumber telephoneNumber = new TelephoneNumber();
				telephoneNumber = telephoneNumberIterator
						.getTelephoneNumber(telephoneNumberIterator.getTelephoneId());
				telephoneNumberList.add(telephoneNumber);
			}
			customer.setTelephones(telephoneNumberList);
		}
		// AccountsRelationShip
		List<CustomerToAccountRelationship> customerToAccountRelationshipList = new ArrayList<>();
		if (customerResponse.getAccounts() != null) {
			List<CustomerToAccountRelationship> customerToAccountRelationshipResponseList = customerResponse
					.getAccounts();
			for (CustomerToAccountRelationship customerToAccountRelationShipIterator : customerToAccountRelationshipResponseList) {
				CustomerToAccountRelationship customerToAccountRelationship = new CustomerToAccountRelationship();
				customerToAccountRelationship = customerToAccountRelationShipIterator
						.getCustomerToAccountRelationShip(customerToAccountRelationShipIterator.getAccountSequenceId());
				customerToAccountRelationshipList.add(customerToAccountRelationship);
			}
			customer.setAccounts(customerToAccountRelationshipList);
		}
		return customer;
	}

	public List<Customer> getCustomers(int limit, String offset, String uriPath) throws FDXException {
		try {
			template = ConnectionConfigApi51.getTemplate();;
			String customerId = "customerId";
			SqlParameterSource parameters = new MapSqlParameterSource("customerId", customerId);
			Customer customer = new Customer();
			List<Customer> customerListNew = new ArrayList<>();
			List<Customer> customerResponseList = template.query(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".customer order by customerid limit " + limit + " offset " + offset,
					parameters, new CustomerRowMapper());
			if (customerResponseList != null && customerResponseList.size() != 0) {
				for (Customer customerResponseItaretor : customerResponseList) {
					Customer customerNew = new Customer();
					customerNew = customer.getCustomerDetails(customerResponseItaretor.getCustomerId());
					customerListNew.add(customerNew);
				}
			}
			return customerListNew;
		} catch (FDXException e) {
			throw e;
		} catch (Exception e) {
			log.error("Customer : ", e);
			throw new FDXException(e,500);
		}
	}

	@JsonIgnore
	public int getCustomerCount() throws FDXException {
		try {
			template = ConnectionConfigApi51.getTemplate();;
			String customerId = "customerId";
			SqlParameterSource parameters = new MapSqlParameterSource("customerId", customerId);
			return template.queryForObject("select count(*) from "+ DeveloperContext.getDeveloperSchema() +".customer", parameters, Integer.class);
		} catch (Exception e) {
			log.error("Customer : ", e);
			throw new FDXException(e,500);
		}
	}

	@Override
	@JsonIgnore
	public Customer getCurrentCustomerInfo() throws FDXException {
		template = ConnectionConfigApi51.getTemplate();
		SqlParameterSource parameters = new MapSqlParameterSource("customerId", null);
		try {
			Customer customerResponse = template.queryForObject("select * from "+ DeveloperContext.getDeveloperSchema() +".customer limit 1", parameters,
					new CustomerRowMapper());
			return getCustomer(customerResponse);
		} catch (EmptyResultDataAccessException e) {
			throw new FDXException(e, 601);
		}
	}
}
