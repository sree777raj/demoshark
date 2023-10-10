package com.fdx.api.model51.mapper;

import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.ContentTypes;
import com.fdx.api.model51.modelimpl.HateoasLink;
import com.fdx.api.model51.modelimpl.HateoasLink.ActionEnum;

public class HateoasLinkRowMapper implements RowMapper<HateoasLink> {

	@Override
	public HateoasLink mapRow(ResultSet rs, int rowNum) throws SQLException {
		HateoasLink hateoasLink = new HateoasLink();
		try {
			hateoasLink.setHref(rs.getString("href"));
			if (rs.getString("action") != null)
				hateoasLink.setAction(ActionEnum.valueOf(rs.getString("action").toString()));
			ContentTypes contentTypesNew;

			List<ContentTypes> contentTypesResponse = new ArrayList<>();
			if (rs.getArray("types") != null) {
				Array listarray = rs.getArray("types");
				Object[] type = (Object[]) listarray.getArray();

				for (Object contentTypeIterator : type) {
					contentTypesNew = ContentTypes.fromValue(contentTypeIterator.toString());
					contentTypesResponse.add(contentTypesNew);
				}
				hateoasLink.setTypes(contentTypesResponse);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return hateoasLink;
	}

}
