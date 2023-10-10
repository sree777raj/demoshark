package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.NameAddress;
import com.fdx.api.model51.modelimpl.NameAddressPhone;
import com.fdx.api.model51.modelimpl.Tax5498Sa;

public class Tax5498SaStatementRowMapper implements RowMapper<Tax5498Sa> {

	@Override
	public Tax5498Sa mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tax5498Sa tax5498Sa = new Tax5498Sa();
		tax5498Sa.setAccountNumber(rs.getString("accountNumber"));
		if (!(rs.getString("archer") == null))
			tax5498Sa.setArcher(rs.getBoolean("archer"));
		tax5498Sa.setFairMarketValue(rs.getDouble("fairMarketValue"));
		if (!(rs.getString("hsa") == null))
			tax5498Sa.setHsa(rs.getBoolean("hsa"));
		if (!(rs.getString("maMsa") == null))
			tax5498Sa.setMaMsa(rs.getBoolean("maMsa"));
		tax5498Sa.setMsaContributions(rs.getDouble("msaContributions"));
		tax5498Sa.setParticipantTin(rs.getString("participantTin"));
		tax5498Sa.setRolloverContributions(rs.getDouble("rolloverContributions"));
		tax5498Sa.setTotalContributions(rs.getDouble("totalContributions"));
		tax5498Sa.setTotalPostYearEnd(rs.getDouble("totalPostYearEnd"));
		tax5498Sa.setTrusteeTin(rs.getString("trusteeTin"));

//		ParticipantNameAddress Start
		NameAddress nameAddress = new NameAddress();
		if (rs.getInt("participantNameAddress") != 0) {
			nameAddress.setNameAddressId(rs.getInt("participantNameAddress"));
			tax5498Sa.setParticipantNameAddress(nameAddress);
		}
//		ParticipantNameAddress End

//		TrusteeNameAddress Start
		NameAddressPhone nameAddressTrustee = new NameAddressPhone();
		if (rs.getInt("trusteeNameAddress") != 0) {
			nameAddressTrustee.setNameAddressId(rs.getInt("trusteeNameAddress"));
			tax5498Sa.setTrusteeNameAddress(nameAddressTrustee);
		}
//		TrusteeNameAddress End

		return tax5498Sa;
	}

}
