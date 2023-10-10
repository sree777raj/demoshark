package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.NameAddress;
import com.fdx.api.model46.modelimpl.NameAddressPhone;
import com.fdx.api.model46.modelimpl.Tax5498;

public class Tax5498StatementRowMapper implements RowMapper<Tax5498> {

	@Override
	public Tax5498 mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tax5498 tax5498 = new Tax5498();
		tax5498.setAccountNumber(rs.getString("accountNumber"));
		tax5498.setFairMarketValue(rs.getDouble("fairMarketValue"));
		tax5498.setFmvSpecifiedAssets(rs.getDouble("fmvSpecifiedAssets"));
		if (!(rs.getString("ira") == null))
			tax5498.setIra(rs.getBoolean("ira"));
		tax5498.setIraContributions(rs.getDouble("iraContributions"));
		tax5498.setIssuerTin(rs.getString("issuerTin"));
		tax5498.setLifeInsuranceCost(rs.getDouble("lifeInsuranceCost"));
		tax5498.setParticipantTin(rs.getString("participantTin"));
		tax5498.setPostponedCode(rs.getString("postponedCode"));
		tax5498.setPostponedContribution(rs.getDouble("postponedContribution"));
		tax5498.setPostponedYear(rs.getInt("postponedYear"));
		tax5498.setRecharacterizedContributions(rs.getDouble("recharacterizedContributions"));
		tax5498.setRepayCode(rs.getString("repayCode"));
		tax5498.setRepayments(rs.getDouble("repayments"));
		tax5498.setRmdAmount(rs.getDouble("rmdAmount"));
		tax5498.setRmdDate(rs.getDate("rmdDate"));
		if (!(rs.getString("rmdNextYear") == null))
			tax5498.setRmdNextYear(rs.getBoolean("rmdNextYear"));
		tax5498.setRolloverContributions(rs.getDouble("rolloverContributions"));
		if (!(rs.getString("rothIra") == null))
			tax5498.setRothIra(rs.getBoolean("rothIra"));
		tax5498.setRothIraContributions(rs.getDouble("rothIraContributions"));
		tax5498.setRothIraConversion(rs.getDouble("rothIraConversion"));

//		IssuerNameAddress Start
		NameAddressPhone nameAddressPhone = new NameAddressPhone();
		if (rs.getInt("issuerNameAddress") != 0) {
			nameAddressPhone.setNameAddressId(rs.getInt("issuerNameAddress"));
			tax5498.setIssuerNameAddress(nameAddressPhone);
		}
//		IssuerNameAddress End

//		ParticipantNameAddress Start
		NameAddress nameAddress = new NameAddress();
		if (rs.getInt("participantNameAddress") != 0) {
			nameAddress.setNameAddressId(rs.getInt("participantNameAddress"));
			tax5498.setParticipantNameAddress(nameAddress);
		}
//		ParticipantNameAddress End

		return tax5498;
	}

}
