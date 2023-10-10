package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.HateoasLink;
import com.fdx.api.model46.modelimpl.TransactionLinks;

public class TransactionLinksRowMapper implements RowMapper<TransactionLinks> {

	@Override
	public TransactionLinks mapRow(ResultSet rs, int rowNum) throws SQLException {
		TransactionLinks transactionLinks = new TransactionLinks();

		if (rs.getArray("links") != null) {
			List<HateoasLink> hateoasLinkList = new ArrayList<>();
			List<Integer> linksList = Arrays.asList((Integer[]) rs.getArray("links").getArray());
			for (int listele : linksList) {
				HateoasLink hateoasLinks = new HateoasLink();
				hateoasLinks.setHateoasLinkId(listele);
				hateoasLinkList.add(hateoasLinks);
			}
			transactionLinks.setImage(hateoasLinkList);
		}

		return transactionLinks;
	}

}
