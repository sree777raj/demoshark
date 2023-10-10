package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.NameAddress;
import com.fdx.api.model51.modelimpl.NameAddressPhone;
import com.fdx.api.model51.modelimpl.Tax1099Patr;

public class Tax1099PatrRowMapper implements RowMapper<Tax1099Patr> {

	@Override
	public Tax1099Patr mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tax1099Patr tax1099Patr = new Tax1099Patr();
		tax1099Patr.setAccountNumber(rs.getString("accountNumber"));
		tax1099Patr.setDpaDeduction(rs.getDouble("dpaDeduction"));
		tax1099Patr.setFederalTaxWithheld(rs.getDouble("federalTaxWithheld"));
		tax1099Patr.setInvestmentCredit(rs.getDouble("investmentCredit"));
		tax1099Patr.setNonpatronageDistributions(rs.getDouble("nonpatronageDistributions"));
		tax1099Patr.setOtherCreditsAndDeductions(rs.getDouble("otherCreditsAndDeductions"));
		tax1099Patr.setPatronageDividends(rs.getDouble("patronageDividends"));
		tax1099Patr.setPatronsAmtAdjustment(rs.getDouble("patronsAmtAdjustment"));
		tax1099Patr.setPatronsAmtAdjustment(rs.getDouble("patronsAmtAdjustment"));
		tax1099Patr.setPayerTin(rs.getString("payerTin"));
		tax1099Patr.setPerUnitRetainAllocations(rs.getDouble("perUnitRetainAllocations"));
		tax1099Patr.setQualifiedPayments(rs.getDouble("qualifiedPayments"));
		tax1099Patr.setRecipientTin(rs.getString("recipientTin"));
		tax1099Patr.setRedemption(rs.getDouble("redemption"));
		if (!(rs.getString("secondTinNotice") == null))
			tax1099Patr.setSecondTinNotice(rs.getBoolean("secondTinNotice"));
		tax1099Patr.setSection199Deduction(rs.getDouble("section199Deduction"));
		tax1099Patr.setSection199QualifiedItems(rs.getDouble("section199QualifiedItems"));
		tax1099Patr.setSection199SstbItems(rs.getDouble("section199SstbItems"));
		if (!(rs.getString("specifiedCoop") == null))
			tax1099Patr.setSpecifiedCoop(rs.getBoolean("specifiedCoop"));
		tax1099Patr.setWorkOpportunityCredit(rs.getDouble("workOpportunityCredit"));

//		payeeNameAddress Start
		NameAddressPhone payerNameAddress = new NameAddressPhone();
		if (rs.getInt("payerNameAddress") != 0) {
			payerNameAddress.setNameAddressId(rs.getInt("payerNameAddress"));
			tax1099Patr.setPayerNameAddress(payerNameAddress);
		}
//		DonorNameAddress End

//		recipientNameAddress Start
		NameAddress recipientNameAddress = new NameAddress();
		if (rs.getInt("recipientNameAddress") != 0) {
			recipientNameAddress.setNameAddressId(rs.getInt("recipientNameAddress"));
			tax1099Patr.setRecipientNameAddress(recipientNameAddress);
		}
//		recipientNameAddress End

		return tax1099Patr;
	}

}
