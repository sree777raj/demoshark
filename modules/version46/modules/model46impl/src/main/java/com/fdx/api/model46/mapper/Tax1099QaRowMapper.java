package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.NameAddress;
import com.fdx.api.model46.modelimpl.NameAddressPhone;
import com.fdx.api.model46.modelimpl.Tax1099Qa;

public class Tax1099QaRowMapper implements RowMapper<Tax1099Qa> {

	@Override
	public Tax1099Qa mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tax1099Qa tax1099Qa = new Tax1099Qa();
		tax1099Qa.setAccountNumber(rs.getString("accountNumber"));
		tax1099Qa.setBasis(rs.getDouble("basis"));
		tax1099Qa.setEarnings(rs.getDouble("earnings"));
		tax1099Qa.setGrossDistribution(rs.getDouble("grossDistribution"));
		if (!(rs.getString("notBeneficiary") == null))
			tax1099Qa.setNotBeneficiary(rs.getBoolean("notBeneficiary"));
		tax1099Qa.setPayerTin(rs.getString("payerTin"));
		if (!(rs.getString("programTransfer") == null))
			tax1099Qa.setProgramTransfer(rs.getBoolean("programTransfer"));
		tax1099Qa.setRecipientTin(rs.getString("recipientTin"));
		if (!(rs.getString("terminated") == null))
			tax1099Qa.setTerminated(rs.getBoolean("terminated"));

//		payeeNameAddress Start
		NameAddressPhone payerNameAddress = new NameAddressPhone();
		if (rs.getInt("payerNameAddress") != 0) {
			payerNameAddress.setNameAddressId(rs.getInt("payerNameAddress"));
			tax1099Qa.setPayerNameAddress(payerNameAddress);
		}
//		DonorNameAddress End

//		recipientNameAddress Start
		NameAddress recipientNameAddress = new NameAddress();
		if (rs.getInt("recipientNameAddress") != 0) {
			recipientNameAddress.setNameAddressId(rs.getInt("recipientNameAddress"));
			tax1099Qa.setRecipientNameAddress(recipientNameAddress);
		}
//		recipientNameAddress End

		return tax1099Qa;
	}

}
