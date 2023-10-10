package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.AccountPaymentNetwork;
import com.fdx.api.model46.modelimpl.PaymentNetworkIdentifierType;
import com.fdx.api.model46.modelimpl.PaymentNetworkType;

public class AccountPaymentNetworkRowMapper implements RowMapper<AccountPaymentNetwork> {

	@Override
	public AccountPaymentNetwork mapRow(ResultSet rs, int rowNum) throws SQLException {
		AccountPaymentNetwork accountPaymentNetwork = new AccountPaymentNetwork();
		accountPaymentNetwork.setBankId(rs.getString("bankId"));
		accountPaymentNetwork.setIdentifier(rs.getString("identifier"));
		if (rs.getString("identifierType") != null)
			accountPaymentNetwork
					.setIdentifierType(PaymentNetworkIdentifierType.valueOf(rs.getString("identifierType")));
		if (!(rs.getString("transferIn") == null))
			accountPaymentNetwork.setTransferIn(rs.getBoolean("transferIn"));
		if (!(rs.getString("transferOut") == null))
			accountPaymentNetwork.setTransferOut(rs.getBoolean("transferOut"));
		if (rs.getString("type") != null)
			accountPaymentNetwork.setType(PaymentNetworkType.valueOf(rs.getString("type")));
		return accountPaymentNetwork;
	}

}
