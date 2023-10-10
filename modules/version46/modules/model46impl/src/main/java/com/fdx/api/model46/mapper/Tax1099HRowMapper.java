package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.MonthAmount;
import com.fdx.api.model46.modelimpl.NameAddress;
import com.fdx.api.model46.modelimpl.NameAddressPhone;
import com.fdx.api.model46.modelimpl.Tax1099H;

public class Tax1099HRowMapper implements RowMapper<Tax1099H> {

	@Override
	public Tax1099H mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tax1099H tax1099h = new Tax1099H();
		tax1099h.setAdvancePayments(rs.getDouble("advancePayments"));
		tax1099h.setIssuerTin(rs.getString("issuerTin"));
		tax1099h.setNumberOfMonths(rs.getInt("numberOfMonths"));
		tax1099h.setRecipientTin(rs.getString("recipientTin"));

//		Security Start
		List<MonthAmount> monthAmountListNew = new ArrayList<>();
		if (rs.getArray("payments") != null) {
			List<Integer> monthAmountList = Arrays.asList((Integer[]) rs.getArray("payments").getArray());
			for (int monthAmountId : monthAmountList) {
				MonthAmount monthAmount = new MonthAmount();
				monthAmount.setMonthamountid(monthAmountId);
				monthAmountListNew.add(monthAmount);
			}
			tax1099h.setPayments(monthAmountListNew);
		}
//		Security End

//		recipientNameAddress Start
		NameAddress recipientNameAddress = new NameAddress();
		if (rs.getInt("recipientNameAddress") != 0) {
			recipientNameAddress.setNameAddressId(rs.getInt("recipientNameAddress"));
			tax1099h.setRecipientNameAddress(recipientNameAddress);
		}
//		DonorNameAddress End

//		issuerNameAddress Start
		NameAddressPhone issuerNameAddress = new NameAddressPhone();
		if (rs.getInt("issuerNameAddress") != 0) {
			issuerNameAddress.setNameAddressId(rs.getInt("issuerNameAddress"));
			tax1099h.setIssuerNameAddress(issuerNameAddress);
		}
//		DoneeNameAddress End

		return tax1099h;
	}

}
