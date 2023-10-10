package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.LocalTaxWithholding;
import com.fdx.api.model51.modelimpl.NameAddress;
import com.fdx.api.model51.modelimpl.NameAddressPhone;
import com.fdx.api.model51.modelimpl.StateTaxWithholding;
import com.fdx.api.model51.modelimpl.Tax1099R;

public class Tax1099RRowMapper implements RowMapper<Tax1099R> {

	@Override
	public Tax1099R mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tax1099R tax1099R = new Tax1099R();
		tax1099R.setAllocableToIRR(rs.getDouble("allocableToIRR"));
		tax1099R.setCapitalGain(rs.getDouble("allocableToIRR"));
		tax1099R.setDateOfPayment(rs.getDate("dateOfPayment"));
		tax1099R.setEmployeeContributions(rs.getDouble("employeeContributions"));
		tax1099R.setFederalTaxWithheld(rs.getDouble("federalTaxWithheld"));
		tax1099R.setFirstYearOfRoth(rs.getInt("firstYearOfRoth"));
		if (!(rs.getString("foreignAccountTaxCompliance") == null))
			tax1099R.setForeignAccountTaxCompliance(rs.getBoolean("foreignAccountTaxCompliance"));
		tax1099R.setGrossDistribution(rs.getDouble("grossDistribution"));
		if (!(rs.getString("iraSepSimple") == null))
			tax1099R.setIraSepSimple(rs.getBoolean("iraSepSimple"));
		tax1099R.setNetUnrealizedAppreciation(rs.getDouble("netUnrealizedAppreciation"));
		tax1099R.setOtherAmount(rs.getDouble("otherAmount"));
		tax1099R.setOtherPercent(rs.getDouble("otherPercent"));
		tax1099R.setPayerTin(rs.getString("payerTin"));
		tax1099R.setRecipientAccountNumber(rs.getString("recipientAccountNumber"));
		tax1099R.setRecipientTin(rs.getString("recipientTin"));
		tax1099R.setTaxableAmount(rs.getDouble("taxableAmount"));
		if (!(rs.getString("taxableAmountNotDetermined") == null))
			tax1099R.setTaxableAmountNotDetermined(rs.getBoolean("taxableAmountNotDetermined"));
		if (!(rs.getString("totalDistribution") == null))
			tax1099R.setTotalDistribution(rs.getBoolean("totalDistribution"));
		tax1099R.setTotalEmployeeContributions(rs.getDouble("totalEmployeeContributions"));
		tax1099R.setYourPercentOfTotal(rs.getDouble("yourPercentOfTotal"));

//		payeeNameAddress Start
		NameAddressPhone payerNameAddress = new NameAddressPhone();
		if (rs.getInt("payerNameAddress") != 0) {
			payerNameAddress.setNameAddressId(rs.getInt("payerNameAddress"));
			tax1099R.setPayerNameAddress(payerNameAddress);
		}
//		DonorNameAddress End

//		recipientNameAddress Start
		NameAddress recipientNameAddress = new NameAddress();
		if (rs.getInt("recipientNameAddress") != 0) {
			recipientNameAddress.setNameAddressId(rs.getInt("recipientNameAddress"));
			tax1099R.setRecipientNameAddress(recipientNameAddress);
		}
//		recipientNameAddress End

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
			tax1099R.setStateTaxWithholding(statetaxwithholdingResponseList);
		}
//		StateTaxWithholding End

//		localTaxWithholding Start
		List<LocalTaxWithholding> localTaxWithholdingResponseList = new ArrayList<>();
		if (rs.getArray("localTaxWithholding") != null) {
			List<Integer> localTaxWithholdingList = Arrays
					.asList((Integer[]) rs.getArray("localTaxWithholding").getArray());
			for (int localTaxWithholdingId : localTaxWithholdingList) {
				LocalTaxWithholding localTaxWithholding = new LocalTaxWithholding();
				localTaxWithholding.setLtwithheldid(localTaxWithholdingId);
				localTaxWithholdingResponseList.add(localTaxWithholding);
			}
			tax1099R.setLocalTaxWithholding(localTaxWithholdingResponseList);
		}
//		localTaxWithholding End

//		StateTaxWithholding Start
		List<String> distributionCodesResponseList = new ArrayList<>();
		if (rs.getArray("distributionCodes") != null) {
			List<String> distributionCodesList = Arrays.asList((String[]) rs.getArray("distributionCodes").getArray());
			for (String distributionCodesId : distributionCodesList) {
				distributionCodesResponseList.add(distributionCodesId);
			}
			tax1099R.setDistributionCodes(distributionCodesResponseList);
		}
//		StateTaxWithholding End

		return tax1099R;
	}

}
