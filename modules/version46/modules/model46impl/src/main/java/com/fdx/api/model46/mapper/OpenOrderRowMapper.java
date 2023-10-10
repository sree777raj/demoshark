package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.Inv401kSourceType;
import com.fdx.api.model46.modelimpl.OpenOrder;
import com.fdx.api.model46.modelimpl.OrderDuration;
import com.fdx.api.model46.modelimpl.OrderType;
import com.fdx.api.model46.modelimpl.SecurityIdType;
import com.fdx.api.model46.modelimpl.SubAccountType;
import com.fdx.api.model46.modelimpl.UnitType;

public class OpenOrderRowMapper implements RowMapper<OpenOrder> {

	@Override
	public OpenOrder mapRow(ResultSet rs, int rowNum) throws SQLException {
		OpenOrder openOrder = new OpenOrder();

		openOrder.setOrderId(rs.getString("orderId"));
		openOrder.setDescription(rs.getString("description"));
		if (rs.getString("inv401kSource") != null)
			openOrder.setInv401kSource(Inv401kSourceType.valueOf(rs.getString("inv401kSource")));
		openOrder.setLimitPrice(rs.getBigDecimal("limitPrice"));
		openOrder.setOrderDate(rs.getTimestamp("orderDate"));
		if (rs.getString("orderDuration") != null)
			openOrder.setOrderDuration(OrderDuration.valueOf(rs.getString("orderDuration")));
		openOrder.setOrderId(rs.getString("orderId"));
		if (rs.getString("orderType") != null)
			openOrder.setOrderType(OrderType.valueOf(rs.getString("orderType")));
		openOrder.setSecurityId(rs.getString("securityId"));
		if (rs.getString("SecurityIdType") != null)
			openOrder.setSecurityIdType(SecurityIdType.valueOf(rs.getString("SecurityIdType")));
		openOrder.setStopPrice(rs.getBigDecimal("stopPrice"));
		if (rs.getString("subAccount") != null)
			openOrder.setSubAccount(SubAccountType.valueOf(rs.getString("subAccount")));
		openOrder.setSymbol(rs.getString("symbol"));
		openOrder.setUnitPrice(rs.getBigDecimal("unitPrice"));
		openOrder.setUnits(rs.getBigDecimal("units"));
		if (rs.getString("unitType") != null)
			openOrder.setUnitType(UnitType.valueOf(rs.getString("unitType")));

		return openOrder;
	}

}
