package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.NameAddress;
import com.fdx.api.model46.modelimpl.NameAddressPhone;
import com.fdx.api.model46.modelimpl.TelephoneNumberPlusExtension;

public class NameAddressPhoneRowMapper implements RowMapper<NameAddressPhone> {

	@Override
	public NameAddressPhone mapRow(ResultSet rs, int rowNum) throws SQLException {
		NameAddressPhone nameAddressPhone = new NameAddressPhone();

		if (rs.getInt("nameaddressid") != 0) {
			NameAddress nameAddress = new NameAddress();
			nameAddress.setNameAddressId(rs.getInt("nameaddressid"));
			nameAddressPhone.setNameAddress(nameAddress);
		}

		if (rs.getInt("phone") != 0) {
			TelephoneNumberPlusExtension telephoneNumberPlusExtension = new TelephoneNumberPlusExtension();
			telephoneNumberPlusExtension.setPhoneId(rs.getInt("phone"));
			nameAddressPhone.setPhone(telephoneNumberPlusExtension);
		}

		return nameAddressPhone;
	}

}
