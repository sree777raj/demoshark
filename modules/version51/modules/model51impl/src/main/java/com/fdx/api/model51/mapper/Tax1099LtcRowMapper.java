package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.NameAddress;
import com.fdx.api.model51.modelimpl.NameAddressPhone;
import com.fdx.api.model51.modelimpl.Tax1099Ltc;

public class Tax1099LtcRowMapper implements RowMapper<Tax1099Ltc> {

	@Override
	public Tax1099Ltc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tax1099Ltc tax1099Ltc = new Tax1099Ltc();
		tax1099Ltc.setAccountNumber(rs.getString("accountNumber"));
		if (!(rs.getString("chronicallyIll") == null))
			tax1099Ltc.setChronicallyIll(rs.getBoolean("chronicallyIll"));
		tax1099Ltc.setDateCertified(rs.getDate("dateCertified"));
		tax1099Ltc.setDeathBenefits(rs.getDouble("deathBenefits"));
		tax1099Ltc.setInsuredId(rs.getString("insuredId"));
		tax1099Ltc.setLtcBenefits(rs.getDouble("ltcBenefits"));
		tax1099Ltc.setPayerTin(rs.getString("payerTin"));
		if (!(rs.getString("perDiem") == null))
			tax1099Ltc.setPerDiem(rs.getBoolean("perDiem"));
		tax1099Ltc.setPolicyholderTin(rs.getString("policyholderTin"));
		if (!(rs.getString("qualifiedContract") == null))
			tax1099Ltc.setQualifiedContract(rs.getBoolean("qualifiedContract"));
		if (!(rs.getString("reimbursedAmount") == null))
			tax1099Ltc.setReimbursedAmount(rs.getBoolean("reimbursedAmount"));
		if (!(rs.getString("terminallyIll") == null))
			tax1099Ltc.setTerminallyIll(rs.getBoolean("terminallyIll"));

//		insuredNameAddress Start
		NameAddress insuredNameAddress = new NameAddress();
		if (rs.getInt("insuredNameAddress") != 0) {
			insuredNameAddress.setNameAddressId(rs.getInt("insuredNameAddress"));
			tax1099Ltc.setInsuredNameAddress(insuredNameAddress);
		}
//		insuredNameAddress End

//		policyHolderNameAddress Start
		NameAddress policyHolderNameAddress = new NameAddress();
		if (rs.getInt("policyHolderNameAddress") != 0) {
			policyHolderNameAddress.setNameAddressId(rs.getInt("policyHolderNameAddress"));
			tax1099Ltc.setPolicyHolderNameAddress(policyHolderNameAddress);
		}
//		policyHolderNameAddress End

//		payerNameAddress Start
		NameAddressPhone payerNameAddress = new NameAddressPhone();
		if (rs.getInt("payerNameAddress") != 0) {
			payerNameAddress.setNameAddressId(rs.getInt("payerNameAddress"));
			tax1099Ltc.setPayerNameAddress(payerNameAddress);
		}
//		payerNameAddress End

		return tax1099Ltc;
	}

}
