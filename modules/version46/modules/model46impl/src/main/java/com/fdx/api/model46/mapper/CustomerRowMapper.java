package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.Customer;
import com.fdx.api.model46.modelimpl.CustomerToAccountRelationship;
import com.fdx.api.model46.modelimpl.DeliveryAddress;
import com.fdx.api.model46.modelimpl.TelephoneNumber;

public class CustomerRowMapper implements RowMapper<Customer> {

	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		Customer customer = new Customer();
		customer.setCustomerId(rs.getString("customerid"));
		customer.setCustomerNameId(rs.getInt("custemernameid"));
		customer.setDateOfBirth(rs.getTimestamp("dateofbirth"));
		customer.setTaxId(rs.getString("taxid"));
		customer.setGovernmentId(rs.getString("governmentId"));

		if (rs.getArray("email") != null) {
			List<String> emailList = new ArrayList<>();
			List<String> emailListResponse = Arrays.asList((String[]) rs.getArray("email").getArray());
			for (String listele : emailListResponse) {
				emailList.add(listele);
			}
			customer.setEmail(emailList);
		}

		if (rs.getArray("deliveryaddressid") != null) {
			List<DeliveryAddress> deliveryAddressList = new ArrayList<>();
			List<Integer> deliveryAddressResponseList = Arrays
					.asList((Integer[]) rs.getArray("deliveryaddressid").getArray());

			for (Integer deliveryAddressIterator : deliveryAddressResponseList) {
				DeliveryAddress deliveryAddress = new DeliveryAddress();
				deliveryAddress.setDeliveryAddressId(deliveryAddressIterator);
				deliveryAddressList.add(deliveryAddress);
			}
			customer.setAddresses(deliveryAddressList);
		}

		if (rs.getArray("telephoneid") != null) {
			List<TelephoneNumber> telephoneNumberList = new ArrayList<>();
			List<Integer> telephoneNumberResponseList = Arrays
					.asList((Integer[]) rs.getArray("telephoneid").getArray());

			for (Integer telephoneNumberIterator : telephoneNumberResponseList) {
				TelephoneNumber telephoneNumber = new TelephoneNumber();
				telephoneNumber.setTelephoneId(telephoneNumberIterator);
				telephoneNumberList.add(telephoneNumber);
			}
			customer.setTelephones(telephoneNumberList);
		}

		if (rs.getArray("accountsid") != null) {
			List<CustomerToAccountRelationship> customerToAccountRelationshipList = new ArrayList<>();
			List<Integer> customerToAccountResponseList = Arrays
					.asList((Integer[]) rs.getArray("accountsid").getArray());

			for (Integer customerToAccountRelationshipIterator : customerToAccountResponseList) {
				CustomerToAccountRelationship customerToAccountRelationship = new CustomerToAccountRelationship();
				customerToAccountRelationship.setAccountSequenceId(customerToAccountRelationshipIterator);
				customerToAccountRelationshipList.add(customerToAccountRelationship);
			}
			customer.setAccounts(customerToAccountRelationshipList);
		}
		
		return customer;
	}

}
