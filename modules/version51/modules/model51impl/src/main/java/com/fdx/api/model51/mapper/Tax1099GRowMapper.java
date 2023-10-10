package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.NameAddress;
import com.fdx.api.model51.modelimpl.NameAddressPhone;
import com.fdx.api.model51.modelimpl.StateTaxWithholding;
import com.fdx.api.model51.modelimpl.Tax1099G;

public class Tax1099GRowMapper implements RowMapper<Tax1099G> {

	@Override
	public Tax1099G mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tax1099G tax1099G = new Tax1099G();
		tax1099G.setAccountNumber(rs.getString("accountNumber"));
		tax1099G.setAgriculturePayments(rs.getDouble("agriculturePayments"));
		if (!(rs.getString("businessIncome") == null))
			tax1099G.setBusinessIncome(rs.getBoolean("businessIncome"));
		tax1099G.setFederalTaxWithheld(rs.getDouble("federalTaxWithheld"));
		tax1099G.setGrants(rs.getDouble("grants"));
		tax1099G.setMarketGain(rs.getDouble("marketGain"));
		tax1099G.setPayerTin(rs.getString("payerTin"));
		tax1099G.setRecipientTin(rs.getString("recipientTin"));
		tax1099G.setRefundYear(rs.getInt("refundYear"));
		tax1099G.setRtaaPayments(rs.getDouble("rtaaPayments"));
		if (!(rs.getString("secondTinNotice") == null))
			tax1099G.setSecondTinNotice(rs.getBoolean("secondTinNotice"));
		tax1099G.setTaxRefund(rs.getDouble("taxRefund"));
		tax1099G.setUnemploymentCompensation(rs.getDouble("unemploymentCompensation"));

//		recipientNameAddress Start
		NameAddress recipientNameAddress = new NameAddress();
		if (rs.getInt("recipientNameAddress") != 0) {
			recipientNameAddress.setNameAddressId(rs.getInt("recipientNameAddress"));
			tax1099G.setRecipientNameAddress(recipientNameAddress);
		}
//		recipientNameAddress End

//		payerNameAddress Start
		NameAddressPhone payerNameAddress = new NameAddressPhone();
		if (rs.getInt("payerNameAddress") != 0) {
			payerNameAddress.setNameAddressId(rs.getInt("payerNameAddress"));
			tax1099G.setPayerNameAddress(payerNameAddress);
		}
//		payerNameAddress End

//		StateTaxWithholding Start
		List<StateTaxWithholding> statetaxwithholdingResponseList = new ArrayList<>();
		if (rs.getArray("statetaxwithholding") != null) {
			List<Integer> statetaxwithholdingList = Arrays
					.asList((Integer[]) rs.getArray("statetaxwithholding").getArray());
			for (int statetaxwithholdingId : statetaxwithholdingList) {
				StateTaxWithholding stateTaxWithholding = new StateTaxWithholding();
				stateTaxWithholding.setStwithheldid(statetaxwithholdingId);
				statetaxwithholdingResponseList.add(stateTaxWithholding);
			}
			tax1099G.setStateTaxWithholding(statetaxwithholdingResponseList);
		}
//		StateTaxWithholding End 

		return tax1099G;
	}

}
