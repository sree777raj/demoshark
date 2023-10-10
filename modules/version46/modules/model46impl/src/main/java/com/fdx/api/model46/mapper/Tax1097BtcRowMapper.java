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
import com.fdx.api.model46.modelimpl.Tax1097Btc;

public class Tax1097BtcRowMapper implements RowMapper<Tax1097Btc> {

	@Override
	public Tax1097Btc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tax1097Btc tax1097Btc = new Tax1097Btc();

		if (!(rs.getString("asNominee") == null))
			tax1097Btc.setAsNominee(rs.getBoolean("asNominee"));
		tax1097Btc.setBondCode(rs.getString("bondCode"));
		tax1097Btc.setBondType(rs.getString("bondType"));
		tax1097Btc.setComments(rs.getString("comments"));
		if (!(rs.getString("filingForCredit") == null))
			tax1097Btc.setFilingForCredit(rs.getBoolean("filingForCredit"));
		tax1097Btc.setIssuerTin(rs.getString("issuerTin"));
		tax1097Btc.setRecipientTin(rs.getString("recipientTin"));
		tax1097Btc.setTotal(rs.getDouble("total"));
		tax1097Btc.setUniqueId(rs.getString("uniqueId"));

//		RecipientNameAddress Start
		NameAddress empNameAddress = new NameAddress();
		if (rs.getInt("recipientNameAddress") != 0) {
			empNameAddress.setNameAddressId(rs.getInt("recipientNameAddress"));
			tax1097Btc.setRecipientNameAddress(empNameAddress);
		}
//		RecipientNameAddress End

//		Issuernameaddress Start
		NameAddressPhone nameAddressPhone = new NameAddressPhone();
		if (rs.getInt("issuernameaddress") != 0) {
			nameAddressPhone.setNameAddressId(rs.getInt("issuernameaddress"));
			tax1097Btc.setIssuerNameAddress(nameAddressPhone);
		}
//		Issuernameaddress End

//		MonthAmount Start
		List<MonthAmount> monthAmountList = new ArrayList<>();
		if (rs.getArray("amounts") != null) {
			List<Integer> monthAmountListResponse = Arrays.asList((Integer[]) rs.getArray("amounts").getArray());
			for (int monthAmountId : monthAmountListResponse) {
				MonthAmount monthAmount = new MonthAmount();
				monthAmount.setMonthamountid(monthAmountId);
				monthAmountList.add(monthAmount);
			}
			tax1097Btc.setAmounts(monthAmountList);
		}
//		MonthAmount End 
		return tax1097Btc;
	}

}
