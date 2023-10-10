package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.AccountContact;
import com.fdx.api.model51.modelimpl.AccountHolder;
import com.fdx.api.model51.modelimpl.DeliveryAddress;
import com.fdx.api.model51.modelimpl.TelephoneNumber;

public class AccountContactRowMapper implements RowMapper<AccountContact> {

	@Override
	public AccountContact mapRow(ResultSet rs, int rowNum) throws SQLException {
		AccountContact accountContact = new AccountContact();

		if (rs.getArray("holderid") != null) {
			List<AccountHolder> holderList = new ArrayList<>();
			List<Integer> holderIdList = Arrays.asList((Integer[]) rs.getArray("holderid").getArray());
			for (int holderId : holderIdList) {
				AccountHolder accountHolder = new AccountHolder();

				accountHolder.setHolderId(holderId);
				holderList.add(accountHolder);
			}
			accountContact.setHolders(holderList);
		}

		if (rs.getArray("emails") != null) {
			List<String> emails = Arrays.asList((String[]) rs.getArray("emails").getArray());
			accountContact.setEmails(emails);
		}
		
		if(rs.getArray("deliveryaddressid")!=null) {
			List<DeliveryAddress> deliveryAddressList = new ArrayList<>();
			List<Integer> deliveryAddressResponseList = Arrays
					.asList((Integer[]) rs.getArray("deliveryaddressid").getArray());

			for (Integer deliveryAddressIterator : deliveryAddressResponseList) {
				DeliveryAddress deliveryAddress = new DeliveryAddress();
				deliveryAddress.setDeliveryAddressId(deliveryAddressIterator);
				deliveryAddressList.add(deliveryAddress);
			}
			accountContact.setAddresses(deliveryAddressList);
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
			accountContact.setTelephones(telephoneNumberList);
		}

		return accountContact;
	}

}
