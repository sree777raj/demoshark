package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.Address;
import com.fdx.api.model46.modelimpl.NameAddress;
import com.fdx.api.model46.modelimpl.NameAddressPhone;
import com.fdx.api.model46.modelimpl.Tax1098;

public class Tax1098RowMapper implements RowMapper<Tax1098> {

	@Override
	public Tax1098 mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tax1098 tax1098 = new Tax1098();
		tax1098.setAccountNumber(rs.getString("accountNumber"));
		tax1098.setAcquisitionDate(rs.getDate("acquisitionDate"));
		tax1098.setBorrowerTin(rs.getString("borrowerTin"));
		if (!(rs.getString("isPropertyAddressSameAsBorrowerAddress") == null))
			tax1098.setIsPropertyAddressSameAsBorrowerAddress(rs.getBoolean("isPropertyAddressSameAsBorrowerAddress"));
		tax1098.setLenderTin(rs.getString("lenderTin"));
		tax1098.setMortgagedProperties(rs.getInt("mortgagedProperties"));
		tax1098.setMortgageInsurance(rs.getDouble("mortgageInsurance"));
		tax1098.setMortgageInterest(rs.getDouble("mortgageInterest"));
		tax1098.setOriginationDate(rs.getDate("originationDate"));
		tax1098.setOtherInformation(rs.getString("otherInformation"));
		tax1098.setOutstandingPrincipal(rs.getDouble("outstandingPrincipal"));
		tax1098.setOverpaidRefund(rs.getDouble("overpaidRefund"));
		tax1098.setPointsPaid(rs.getDouble("pointsPaid"));
		tax1098.setPropertyDescription(rs.getString("propertyDescription"));
		tax1098.setPropertyTax(rs.getDouble("propertyTax"));

//		PropertyAddress Start
		Address propertyAddress = new Address();
		if (rs.getInt("propertyAddress") != 0) {
			propertyAddress.setAddressId(rs.getInt("propertyAddress"));
			tax1098.setPropertyAddress(propertyAddress);
		}
//		PropertyAddress End

//		BorrowerNameAddress Start
		NameAddress borrowerNameAddress = new NameAddress();
		if (rs.getInt("borrowerNameAddress") != 0) {
			borrowerNameAddress.setNameAddressId(rs.getInt("borrowerNameAddress"));
			tax1098.setBorrowerNameAddress(borrowerNameAddress);
		}
//		BorrowerNameAddress End

//		BorrowerNameAddress Start
		NameAddressPhone lendernameaddressPhone = new NameAddressPhone();
		if (rs.getInt("lendernameaddress") != 0) {
			lendernameaddressPhone.setNameAddressId(rs.getInt("lendernameaddress"));
			tax1098.setLenderNameAddress(lendernameaddressPhone);
		}
//		BorrowerNameAddress End

		return tax1098;
	}

}
