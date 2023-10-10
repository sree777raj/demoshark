package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.NameAddress;
import com.fdx.api.model46.modelimpl.NameAddressPhone;
import com.fdx.api.model46.modelimpl.TaxW2G;

public class TaxW2GStatementRowMapper implements RowMapper<TaxW2G> {

	@Override
	public TaxW2G mapRow(ResultSet rs, int rowNum) throws SQLException {
		TaxW2G taxW2G = new TaxW2G();
		taxW2G.setCashier(rs.getString("cashier"));
		taxW2G.setDateWon(rs.getDate("dateWon"));
		taxW2G.setFederalTaxWithheld(rs.getDouble("federalTaxWithheld"));
		taxW2G.setFirstId(rs.getString("firstId"));
		taxW2G.setIdenticalWinnings(rs.getDouble("identicalWinnings"));
		taxW2G.setLocalityName(rs.getString("localityName"));
		taxW2G.setLocalTaxWithheld(rs.getDouble("localTaxWithheld"));
		taxW2G.setLocalWinnings(rs.getDouble("localWinnings"));
		taxW2G.setPayerState(rs.getString("payerState"));
		taxW2G.setPayerStateId(rs.getString("payerStateId"));
		taxW2G.setPayerTin(rs.getString("payerTin"));
		taxW2G.setRace(rs.getString("race"));
		taxW2G.setSecondId(rs.getString("secondId"));
		taxW2G.setStateTaxWithheld(rs.getDouble("stateTaxWithheld"));
		taxW2G.setStateWinnings(rs.getDouble("stateWinnings"));
		taxW2G.setTransaction(rs.getString("transaction"));
		taxW2G.setTypeOfWager(rs.getString("typeOfWager"));
		taxW2G.setBettingWindow(rs.getString("bettingwindow"));
		taxW2G.setWinnerTin(rs.getString("winnerTin"));
		taxW2G.setWinnings(rs.getDouble("winnings"));

//		PayerNameAddress Start
		NameAddressPhone payerNameAddress = new NameAddressPhone();
		if (rs.getInt("payerNameAddress") != 0) {
			payerNameAddress.setNameAddressId(rs.getInt("payerNameAddress"));
			taxW2G.setPayerNameAddress(payerNameAddress);
		}
//		PayerNameAddress End

//		WinnerNameAddress Start
		NameAddress winnerNameAddress = new NameAddress();
		if (rs.getInt("winnerNameAddress") != 0) {
			winnerNameAddress.setNameAddressId(rs.getInt("winnerNameAddress"));
			taxW2G.setWinnerNameAddress(winnerNameAddress);
		}
//		WinnerNameAddress End

		return taxW2G;
	}

}
