package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.CallType;
import com.fdx.api.model46.modelimpl.CouponMatureFrequency;
import com.fdx.api.model46.modelimpl.DebtClass;
import com.fdx.api.model46.modelimpl.DebtSecurity;
import com.fdx.api.model46.modelimpl.DebtType;

public class DebtSecurityRowMapper implements RowMapper<DebtSecurity> {

	@Override
	public DebtSecurity mapRow(ResultSet rs, int rowNum) throws SQLException {
		DebtSecurity debtSecurity = new DebtSecurity();
		debtSecurity.setBondMaturityDate(rs.getTimestamp("bondMaturityDate"));
		debtSecurity.setCallDate(rs.getTimestamp("callDate"));
		debtSecurity.setCallPrice(rs.getBigDecimal("callPrice"));
		if (rs.getString("calltype") != null)
			debtSecurity.setCallType(CallType.valueOf(rs.getString("calltype")));
		debtSecurity.setCouponDate(rs.getTimestamp("couponDate"));
		if (rs.getString("couponMatureFrequency") != null)
			debtSecurity.setCouponMatureFrequency(CouponMatureFrequency.valueOf(rs.getString("couponMatureFrequency")));
		debtSecurity.setCouponRate(rs.getBigDecimal("couponRate"));
		if (rs.getString("debtClass") != null)
			debtSecurity.setDebtClass(DebtClass.valueOf(rs.getString("debtClass")));
		if (rs.getString("debtType") != null)
			debtSecurity.setDebtType(DebtType.valueOf(rs.getString("debtType")));
		debtSecurity.setParValue(rs.getBigDecimal("parValue"));
		debtSecurity.setYieldToCall(rs.getBigDecimal("yieldToCall"));
		debtSecurity.setYieldToMaturity(rs.getBigDecimal("yieldToMaturity"));

		return debtSecurity;
	}

}
