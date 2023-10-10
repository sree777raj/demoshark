package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.TelephoneNumber;
import com.fdx.api.model51.modelimpl.TelephoneNumberType;

public class TelephoneNumberRowMapper implements RowMapper<TelephoneNumber> {

	@Override
	public TelephoneNumber mapRow(ResultSet rs, int rowNum) throws SQLException {
		TelephoneNumber telephoneNumber = new TelephoneNumber();

		telephoneNumber.setCountry(rs.getString("country"));
		if (rs.getString("type") != null)
			telephoneNumber.setType(TelephoneNumberType.valueOf(rs.getString("type").toString()));
		telephoneNumber.setNumber(rs.getString("number"));
		return telephoneNumber;
	}

}
