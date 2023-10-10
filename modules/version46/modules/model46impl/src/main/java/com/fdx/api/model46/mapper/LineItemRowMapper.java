package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.LineItem;
import com.fdx.api.model46.modelimpl.LineItemLinks;

public class LineItemRowMapper implements RowMapper<LineItem> {

	@Override
	public LineItem mapRow(ResultSet rs, int rowNum) throws SQLException {

		LineItem lineItem = new LineItem();
		lineItem.setAmount(rs.getBigDecimal("amount"));
		lineItem.setCheckNumber(rs.getInt("checkNumber"));
		lineItem.setDescription(rs.getString("description"));

		if (rs.getArray("imageIds") != null) {
			List<String> imageIdsListNew = new ArrayList<>();
			List<String> imageIdsList = Arrays.asList((String[]) rs.getArray("imageIds").getArray());
			for (String listele : imageIdsList) {
				imageIdsListNew.add(listele);
			}
			lineItem.setImageIds(imageIdsListNew);
		}

		if (rs.getInt("links") != 0) {
			int links = rs.getInt("links");
			LineItemLinks lineItemLink = new LineItemLinks();
			lineItemLink.setLineItemLinkId(links);
			lineItem.setLinks(lineItemLink);
		}

		lineItem.setMemo(rs.getString("memo"));
		lineItem.setReference(rs.getString("reference"));

		return lineItem;
	}

}
