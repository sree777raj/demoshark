package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.NameAddress;
import com.fdx.api.model46.modelimpl.NameAddressPhone;
import com.fdx.api.model46.modelimpl.Tax1099Sa;

public class Tax1099SaRowMapper implements RowMapper<Tax1099Sa> {

	@Override
	public Tax1099Sa mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tax1099Sa tax1099Sa = new Tax1099Sa();
		tax1099Sa.setAccountNumber(rs.getString("accountNumber"));
		if (!(rs.getString("archerAccount") == null))
			tax1099Sa.setArcherAccount(rs.getBoolean("archerAccount"));
		tax1099Sa.setDistributionCode(rs.getString("distributionCode"));
		tax1099Sa.setEarnings(rs.getDouble("earnings"));
		tax1099Sa.setFairMarketValue(rs.getDouble("fairMarketValue"));
		tax1099Sa.setGrossDistribution(rs.getDouble("grossDistribution"));
		if (!(rs.getString("hsa") == null))
			tax1099Sa.setHsa(rs.getBoolean("hsa"));
		if (!(rs.getString("medicalSavingsAccount") == null))
			tax1099Sa.setMedicalSavingsAccount(rs.getBoolean("medicalSavingsAccount"));
		tax1099Sa.setPayerTin(rs.getString("payerTin"));
		tax1099Sa.setRecipientTin(rs.getString("recipientTin"));

//		payerNameAddress Start
		NameAddressPhone payerNameAddress = new NameAddressPhone();
		if (rs.getInt("payerNameAddress") != 0) {
			payerNameAddress.setNameAddressId(rs.getInt("payerNameAddress"));
			tax1099Sa.setPayerNameAddress(payerNameAddress);
		}
//		payerNameAddress End

//		recipientNameAddress Start
		NameAddress recipientNameAddress = new NameAddress();
		if (rs.getInt("recipientNameAddress") != 0) {
			recipientNameAddress.setNameAddressId(rs.getInt("recipientNameAddress"));
			tax1099Sa.setRecipientNameAddress(recipientNameAddress);
		}
//		recipientNameAddress End

		return tax1099Sa;
	}

}
