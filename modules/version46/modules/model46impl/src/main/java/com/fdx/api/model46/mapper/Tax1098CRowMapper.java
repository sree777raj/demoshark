package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.NameAddress;
import com.fdx.api.model46.modelimpl.NameAddressPhone;
import com.fdx.api.model46.modelimpl.Tax1098C;

public class Tax1098CRowMapper implements RowMapper<Tax1098C> {

	@Override
	public Tax1098C mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tax1098C tax1098C = new Tax1098C();
		if (!(rs.getString("armsLengthTransaction") == null))
			tax1098C.setArmsLengthTransaction(rs.getBoolean("armsLengthTransaction"));
		tax1098C.setCarYear(rs.getInt("carYear"));
		tax1098C.setDateOfContribution(rs.getDate("dateOfContribution"));
		tax1098C.setDateOfSale(rs.getDate("dateOfSale"));
		tax1098C.setDescriptionOfGoods(rs.getString("descriptionOfGoods"));
		tax1098C.setDescriptionOfImprovements(rs.getString("descriptionOfImprovements"));
		tax1098C.setDoneeTin(rs.getString("doneeTin"));
		tax1098C.setDonorTin(rs.getString("donorTin"));
		if (!(rs.getString("goodsInExchange") == null))
			tax1098C.setGoodsInExchange(rs.getBoolean("goodsInExchange"));
		tax1098C.setGrossProceeds(rs.getDouble("grossProceeds"));
		if (!(rs.getString("intangibleReligious") == null))
			tax1098C.setIntangibleReligious(rs.getBoolean("intangibleReligious"));
		tax1098C.setMake(rs.getString("make"));
		if (!(rs.getString("maxDeductionApplies") == null))
			tax1098C.setMaxDeductionApplies(rs.getBoolean("maxDeductionApplies"));
		tax1098C.setModel(rs.getString("model"));
		if (!(rs.getString("needyIndividual") == null))
			tax1098C.setNeedyIndividual(rs.getBoolean("needyIndividual"));
		if (!(rs.getString("notTransferredBefore") == null))
			tax1098C.setNotTransferredBefore(rs.getBoolean("notTransferredBefore"));
		tax1098C.setOdometerMileage(rs.getInt("odometerMileage"));
		tax1098C.setValueOfExchange(rs.getDouble("valueOfExchange"));
		tax1098C.setVin(rs.getString("vin"));

//		DonorNameAddress Start
		NameAddress donorNameAddress = new NameAddress();
		if (rs.getInt("donorNameAddress") != 0) {
			donorNameAddress.setNameAddressId(rs.getInt("donorNameAddress"));
			tax1098C.setDonorNameAddress(donorNameAddress);
		}
//		DonorNameAddress End

//		DoneeNameAddress Start
		NameAddressPhone doneeNameAddress = new NameAddressPhone();
		if (rs.getInt("doneeNameAddress") != 0) {
			doneeNameAddress.setNameAddressId(rs.getInt("doneeNameAddress"));
			tax1098C.setDoneeNameAddress(doneeNameAddress);
		}
//		DoneeNameAddress End

		return tax1098C;
	}

}
