package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.TelephoneNumber;
import com.fdx.api.model46.modelimpl.TelephoneNumberPlusExtension;

public class TelephoneNumberPlusExtensionRowMapper implements RowMapper<TelephoneNumberPlusExtension> {

	@Override
	public TelephoneNumberPlusExtension mapRow(ResultSet rs, int rowNum) throws SQLException {
		TelephoneNumberPlusExtension telephoneNumberPlusExtension = new TelephoneNumberPlusExtension();
		telephoneNumberPlusExtension.setExtension(rs.getString("extension"));

		TelephoneNumber telephoneNumber = new TelephoneNumber();
		if (rs.getInt("telephoneid") != 0) {
			telephoneNumber.setTelephoneId(rs.getInt("telephoneid"));
			telephoneNumberPlusExtension.setTelephoneNumber(telephoneNumber);
		}
		return telephoneNumberPlusExtension;
	}

}
