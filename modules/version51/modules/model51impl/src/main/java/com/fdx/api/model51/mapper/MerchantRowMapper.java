package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.Merchant;
import com.fdx.api.model51.modelimpl.MerchantForUpdate;
import com.fdx.api.model51.modelimpl.PayeeStatus;

public class MerchantRowMapper implements RowMapper<Merchant> {

	@Override
	public Merchant mapRow(ResultSet rs, int rowNum) throws SQLException {

		Merchant merchant = new Merchant();
		merchant.setPayeeId(rs.getString("payeeId"));

		MerchantForUpdate merchantForUpdate = new MerchantForUpdate();
		merchantForUpdate.setPayeeId(rs.getString("payeeId"));
		merchant.setMerchantForUpdate(merchantForUpdate);

		merchant.setExpiresTimestamp(rs.getTimestamp("expiresTimestamp"));
		if (rs.getString("status") != null)
			merchant.setStatus(PayeeStatus.valueOf(rs.getString("status").toString()));
		return merchant;
	}

}
