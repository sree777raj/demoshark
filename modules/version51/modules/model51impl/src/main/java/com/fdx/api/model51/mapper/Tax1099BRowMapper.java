package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.NameAddress;
import com.fdx.api.model51.modelimpl.NameAddressPhone;
import com.fdx.api.model51.modelimpl.SecurityDetail;
import com.fdx.api.model51.modelimpl.StateTaxWithholding;
import com.fdx.api.model51.modelimpl.Tax1099B;

public class Tax1099BRowMapper implements RowMapper<Tax1099B> {

	@Override
	public Tax1099B mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tax1099B tax1099B = new Tax1099B();
		tax1099B.setAccountNumber(rs.getString("accountNumber"));
		tax1099B.setAggregateProfitOnContracts(rs.getDouble("aggregateProfitOnContracts"));
		tax1099B.setBartering(rs.getDouble("bartering"));
		tax1099B.setFederalTaxWithheld(rs.getDouble("federalTaxWithheld"));
		tax1099B.setPayerTin(rs.getString("payerTin"));
		tax1099B.setProfitOnClosedContracts(rs.getDouble("profitOnClosedContracts"));
		tax1099B.setRecipientTin(rs.getString("recipientTin"));
		if (!(rs.getString("secondTinNotice") == null))
			tax1099B.setSecondTinNotice(rs.getBoolean("secondTinNotice"));
		tax1099B.setUnrealizedProfitOpenContractsBegin(rs.getDouble("unrealizedProfitOpenContractsBegin"));
		tax1099B.setUnrealizedProfitOpenContractsEnd(rs.getDouble("unrealizedProfitOpenContractsEnd"));

//		recipientNameAddress Start
		NameAddress recipientNameAddress = new NameAddress();
		if (rs.getInt("recipientNameAddress") != 0) {
			recipientNameAddress.setNameAddressId(rs.getInt("recipientNameAddress"));
			tax1099B.setRecipientNameAddress(recipientNameAddress);
		}
//		recipientNameAddress End

//		payerNameAddress Start
		NameAddressPhone payerNameAddress = new NameAddressPhone();
		if (rs.getInt("payerNameAddress") != 0) {
			payerNameAddress.setNameAddressId(rs.getInt("payerNameAddress"));
			tax1099B.setPayerNameAddress(payerNameAddress);
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
			tax1099B.setStateTaxWithholding(statetaxwithholdingResponseList);
		}
//		StateTaxWithholding End 

//		Security Start
		List<SecurityDetail> securityDetailsResponseList = new ArrayList<>();
		if (rs.getArray("securityDetails") != null) {
			List<Integer> securityDetailsList = Arrays.asList((Integer[]) rs.getArray("securityDetails").getArray());
			for (int securityDetailsId : securityDetailsList) {
				SecurityDetail securityDetail = new SecurityDetail();
				securityDetail.setSecuritydetailid(securityDetailsId);
				securityDetailsResponseList.add(securityDetail);
			}
			tax1099B.setSecurityDetails(securityDetailsResponseList);
		}
//		Security End
		return tax1099B;
	}

}
