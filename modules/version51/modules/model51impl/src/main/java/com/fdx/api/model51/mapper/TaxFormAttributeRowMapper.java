package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.TaxFormAttribute;

public class TaxFormAttributeRowMapper implements RowMapper<TaxFormAttribute> {

	@Override
	public TaxFormAttribute mapRow(ResultSet rs, int rowNum) throws SQLException {
		TaxFormAttribute taxFormAttribute = new TaxFormAttribute();
		taxFormAttribute.setBoxNumber(rs.getString("boxNumber"));
		taxFormAttribute.setValue(rs.getString("value"));
		taxFormAttribute.setName(rs.getString("name"));
		taxFormAttribute.setCode(rs.getString("code"));
		return taxFormAttribute;
	}

}
