package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.DateAmount;
import com.fdx.api.model46.modelimpl.NameAddress;
import com.fdx.api.model46.modelimpl.NameAddressPhone;
import com.fdx.api.model46.modelimpl.Tax1098Q;

public class Tax1098QRowMapper implements RowMapper<Tax1098Q> {

	@Override
	public Tax1098Q mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tax1098Q tax1098Q = new Tax1098Q();
		tax1098Q.setAccountNumber(rs.getString("accountNumber"));
		tax1098Q.setAnnuityAmount(rs.getDouble("annuityAmount"));
		if (!(rs.getString("canBeAccelerated") == null))
			tax1098Q.setCanBeAccelerated(rs.getBoolean("canBeAccelerated"));
		tax1098Q.setFairMarketValue(rs.getDouble("fairMarketValue"));
		tax1098Q.setIssuerTin(rs.getString("issuerTin"));
		tax1098Q.setParticipantTin(rs.getString("participantTin"));
		tax1098Q.setPlanName(rs.getString("planName"));
		tax1098Q.setPlanNumber(rs.getString("planNumber"));
		tax1098Q.setPlanSponsorId(rs.getString("planSponsorId"));
		tax1098Q.setStartDate(rs.getDate("startDate"));
		tax1098Q.setTotalPremiums(rs.getDouble("totalPremiums"));

//		participantNameAddress Start
		NameAddress participantNameAddress = new NameAddress();
		if (rs.getInt("participantNameAddress") != 0) {
			participantNameAddress.setNameAddressId(rs.getInt("participantNameAddress"));
			tax1098Q.setParticipantNameAddress(participantNameAddress);
		}
//		participantNameAddress End

//		issuerNameAddress Start
		NameAddressPhone issuerNameAddress = new NameAddressPhone();
		if (rs.getInt("issuerNameAddress") != 0) {
			issuerNameAddress.setNameAddressId(rs.getInt("issuerNameAddress"));
			tax1098Q.setIssuerNameAddress(issuerNameAddress);
		}
//		issuerNameAddress End	

//		Premiums Start
		List<DateAmount> dateAmountList = new ArrayList<>();
		if (rs.getArray("premiums") != null) {
			List<Integer> dateAmountResponseList = Arrays.asList((Integer[]) rs.getArray("premiums").getArray());
			for (Integer dateAmountIterator : dateAmountResponseList) {
				DateAmount dateAmount = new DateAmount();
				dateAmount.setDateamountid(dateAmountIterator);
				dateAmountList.add(dateAmount);
			}
			tax1098Q.setPremiums(dateAmountList);
		}
//		Premiums End
		return tax1098Q;
	}

}
