package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.TaxRefundDirectDeposit;

public class TaxRefundDirectDepositRowMapper implements RowMapper<TaxRefundDirectDeposit> {

	@Override
	public TaxRefundDirectDeposit mapRow(ResultSet rs, int rowNum) throws SQLException {
		TaxRefundDirectDeposit taxRefundDirectDeposit = new TaxRefundDirectDeposit();
		taxRefundDirectDeposit.setAccountNickName(rs.getString("accountNickName"));
		taxRefundDirectDeposit.setAccountNumber(rs.getString("accountNumber"));
		taxRefundDirectDeposit.setInstitutionName(rs.getString("institutionName"));
		taxRefundDirectDeposit.setRtn(rs.getString("rtn"));

		return taxRefundDirectDeposit;
	}

}
