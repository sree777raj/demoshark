package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.NameAddress;
import com.fdx.api.model46.modelimpl.NameAddressPhone;
import com.fdx.api.model46.modelimpl.Tax1099Q;

public class Tax1099QRowMapper implements RowMapper<Tax1099Q> {

	@Override
	public Tax1099Q mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tax1099Q tax1099Q = new Tax1099Q();
		tax1099Q.setAccountNumber(rs.getString("accountNumber"));
		tax1099Q.setBasis(rs.getDouble("basis"));
		if (!(rs.getString("coverdellEsa") == null))
			tax1099Q.setCoverdellEsa(rs.getBoolean("coverdellEsa"));
		tax1099Q.setEarnings(rs.getDouble("earnings"));
		tax1099Q.setGrossDistribution(rs.getDouble("grossDistribution"));
		tax1099Q.setPayerTin(rs.getString("payerTin"));
		if (!(rs.getString("recipientIsNotBeneficiary") == null))
			tax1099Q.setRecipientIsNotBeneficiary(rs.getBoolean("recipientIsNotBeneficiary"));
		tax1099Q.setRecipientTin(rs.getString("recipientTin"));
		if (!(rs.getString("trusteeToTrustee") == null))
			tax1099Q.setTrusteeToTrustee(rs.getBoolean("trusteeToTrustee"));
		if (!(rs.getString("tuitionPlanPrivate") == null))
			tax1099Q.setTuitionPlanPrivate(rs.getBoolean("tuitionPlanPrivate"));
		if (!(rs.getString("tuitionPlanPublic") == null))
			tax1099Q.setTuitionPlanPublic(rs.getBoolean("tuitionPlanPublic"));

//		payeeNameAddress Start
		NameAddressPhone payerNameAddress = new NameAddressPhone();
		if (rs.getInt("payerNameAddress") != 0) {
			payerNameAddress.setNameAddressId(rs.getInt("payerNameAddress"));
			tax1099Q.setPayerNameAddress(payerNameAddress);
		}
//		DonorNameAddress End

//		recipientNameAddress Start
		NameAddress recipientNameAddress = new NameAddress();
		if (rs.getInt("recipientNameAddress") != 0) {
			recipientNameAddress.setNameAddressId(rs.getInt("recipientNameAddress"));
			tax1099Q.setRecipientNameAddress(recipientNameAddress);
		}
//		recipientNameAddress End

		return tax1099Q;
	}

}
