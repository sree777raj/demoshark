package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.Error;
import com.fdx.api.model51.modelimpl.HateoasLink;
import com.fdx.api.model51.modelimpl.Tax;
import com.fdx.api.model51.modelimpl.TaxFormAttribute;
import com.fdx.api.model51.modelimpl.TaxFormType;
import com.fdx.api.model51.modelimpl.TaxLinks;

public class TaxRowMapper implements RowMapper<Tax> {

	@Override
	public Tax mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tax tax = new Tax();

		tax.setInternalId(rs.getInt("internalId"));
		tax.setAccountId(rs.getString("accountId"));
		tax.setAdditionalInformation(rs.getString("additionalInformation"));

		if (rs.getArray("attributes") != null) {
			List<TaxFormAttribute> taxFormAttributeList = new ArrayList<>();
			List<Integer> taxFormAttrList = Arrays.asList((Integer[]) rs.getArray("attributes").getArray());

			for (Integer taxAttrId : taxFormAttrList) {
				TaxFormAttribute taxFormAttribute = new TaxFormAttribute();
				taxFormAttribute.setTaxAttrId(taxAttrId);
				taxFormAttributeList.add(taxFormAttribute);
			}
			tax.setAttributes(taxFormAttributeList);
		}

		if (!(rs.getString("corrected") == null))
			tax.setCorrected(rs.getBoolean("corrected"));
		tax.setDescription(rs.getString("description"));
		tax.setTaxFormDate(rs.getDate("taxFormDate"));

		if (rs.getString("errorcode") != null) {
			Error error = new Error();
			error.setCode(rs.getString("errorcode"));
			tax.setError(error);
		}

		TaxLinks taxLinks = new TaxLinks();
		HateoasLink hateoasLink = new HateoasLink();
		if (rs.getInt("linksid") != 0) {
			hateoasLink.setHateoasLinkId(rs.getInt("linksid"));
			taxLinks.setSelf(hateoasLink);
			tax.setLinks(taxLinks);
		}

//		tax.setTaxFormDate(rs.getDate("taxFormDate").toLocalDate());
		tax.setTaxFormId(rs.getString("taxFormId"));
		if (rs.getString("taxFormType") != null)
			tax.setTaxFormType(TaxFormType.fromValue(rs.getString("taxFormType").toString()));
		tax.setTaxYear(rs.getInt("taxYear"));

		return tax;
	}

}
