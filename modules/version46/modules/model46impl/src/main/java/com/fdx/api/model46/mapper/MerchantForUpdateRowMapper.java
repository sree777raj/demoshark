package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.CustomerName;
import com.fdx.api.model46.modelimpl.DeliveryAddress;
import com.fdx.api.model46.modelimpl.MerchantForUpdate;
import com.fdx.api.model46.modelimpl.TelephoneNumber;

public class MerchantForUpdateRowMapper implements RowMapper<MerchantForUpdate> {

	@Override
	public MerchantForUpdate mapRow(ResultSet rs, int rowNum) throws SQLException {
		MerchantForUpdate merchantForUpdate = new MerchantForUpdate();

		DeliveryAddress deliveryAddress = new DeliveryAddress();
		merchantForUpdate.setAddressId(rs.getInt("addressId"));
		merchantForUpdate.setPayeeId(rs.getString("payeeId"));

		if (rs.getInt("addressId") != 0) {
			deliveryAddress.setDeliveryAddressId(rs.getInt("addressId"));
			merchantForUpdate.setAddress(deliveryAddress);
		}

		merchantForUpdate.setDisplayName(rs.getString("displayName"));

		List<String> merchantAccountIdsList = new ArrayList<>();
		if ((rs.getArray("merchantaccountids")) != null) {
			List<String> merchantAccountIdsListResponse = Arrays
					.asList((String[]) rs.getArray("merchantaccountids").getArray());
			for (String listele : merchantAccountIdsListResponse) {
				merchantAccountIdsList.add(listele);
			}
			merchantForUpdate.setMerchantAccountIds(merchantAccountIdsList);
		}

		CustomerName customerName = new CustomerName();
		if (rs.getInt("nameId") != 0) {
			customerName.setNameId(rs.getInt("nameId"));
			merchantForUpdate.setNameId(rs.getInt("nameId"));
			merchantForUpdate.setName(customerName);
		}

		TelephoneNumber telephoneNumber = new TelephoneNumber();
		if (rs.getInt("phone") != 0) {
			telephoneNumber.setTelephoneId(rs.getInt("phone"));
			merchantForUpdate.setPhoneId(rs.getInt("phone"));
			merchantForUpdate.setPhone(telephoneNumber);
		}

		return merchantForUpdate;
	}

}
