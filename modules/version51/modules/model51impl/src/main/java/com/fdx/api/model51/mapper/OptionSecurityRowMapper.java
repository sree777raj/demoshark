package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.OptionSecurity;
import com.fdx.api.model51.modelimpl.OptionType;
import com.fdx.api.model51.modelimpl.Secured;

public class OptionSecurityRowMapper implements RowMapper<OptionSecurity> {

	@Override
	public OptionSecurity mapRow(ResultSet rs, int rowNum) throws SQLException {
		OptionSecurity optionSecurity = new OptionSecurity();
		optionSecurity.setExpireDate(rs.getTimestamp("expireDate"));
		if (rs.getString("optionType") != null)
			optionSecurity.setOptionType(OptionType.valueOf(rs.getString("optionType")));
		optionSecurity.setSecured(Secured.valueOf(rs.getString("secured")));
		optionSecurity.setSharesPerContract(rs.getBigDecimal("sharesPerContract"));
		optionSecurity.setStrikePrice(rs.getBigDecimal("strikePrice"));

		return optionSecurity;
	}

}
