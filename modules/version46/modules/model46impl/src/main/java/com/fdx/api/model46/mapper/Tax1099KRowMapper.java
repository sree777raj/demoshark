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
import com.fdx.api.model46.modelimpl.StateTaxWithholding;
import com.fdx.api.model46.modelimpl.Tax1099K;
import com.fdx.api.model46.modelimpl.TelephoneNumberPlusExtension;

public class Tax1099KRowMapper implements RowMapper<Tax1099K> {

	@Override
	public Tax1099K mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tax1099K tax1099K = new Tax1099K();
		tax1099K.setAccountNumber(rs.getString("accountNumber"));
		tax1099K.setCardNotPresent(rs.getDouble("cardNotPresent"));
		if (!(rs.getString("electronicPaymentFacilitator") == null))
			tax1099K.setElectronicPaymentFacilitator(rs.getBoolean("electronicPaymentFacilitator"));
		tax1099K.setFederalTaxWithheld(rs.getDouble("federalTaxWithheld"));
		tax1099K.setFilerTin(rs.getString("filerTin"));
		tax1099K.setGrossAmount(rs.getDouble("grossAmount"));
		tax1099K.setMerchantCategoryCode(rs.getString("merchantCategoryCode"));
		tax1099K.setNumberOfTransactions(rs.getDouble("numberOfTransactions"));
		tax1099K.setPayeeFederalId(rs.getString("payeeFederalId"));
		tax1099K.setPayeeTin(rs.getString("payeeTin"));
		if (!(rs.getString("paymentCard") == null))
			tax1099K.setPaymentCard(rs.getBoolean("paymentCard"));
		if (!(rs.getString("paymentSettlementEntity") == null))
			tax1099K.setPaymentSettlementEntity(rs.getBoolean("paymentSettlementEntity"));
		tax1099K.setPseName(rs.getString("pseName"));
		if (!(rs.getString("secondTinNotice") == null))
			tax1099K.setSecondTinNotice(rs.getBoolean("secondTinNotice"));
		if (!(rs.getString("thirdPartyNetwork") == null))
			tax1099K.setThirdPartyNetwork(rs.getBoolean("thirdPartyNetwork"));

//		payeeNameAddress Start
		NameAddress payeeNameAddress = new NameAddress();
		if (rs.getInt("payeeNameAddress") != 0) {
			payeeNameAddress.setNameAddressId(rs.getInt("payeeNameAddress"));
			tax1099K.setPayeeNameAddress(payeeNameAddress);
		}
//		DonorNameAddress End

//		filerNameAddress Start
		NameAddressPhone filerNameAddress = new NameAddressPhone();
		if (rs.getInt("filerNameAddress") != 0) {
			filerNameAddress.setNameAddressId(rs.getInt("filerNameAddress"));
			tax1099K.setFilerNameAddress(filerNameAddress);
		}
//		filerNameAddress End

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
			tax1099K.setStateTaxWithholding(statetaxwithholdingResponseList);
		}
//		StateTaxWithholding End 

//		MonthAmount Start
		List<MonthAmount> monthAmountsResponseList = new ArrayList<>();
		if (rs.getArray("monthAmounts") != null) {
			List<Integer> monthAmountsList = Arrays.asList((Integer[]) rs.getArray("monthAmounts").getArray());
			for (int monthAmountsId : monthAmountsList) {
				MonthAmount monthAmount = new MonthAmount();
				monthAmount.setMonthamountid(monthAmountsId);
				monthAmountsResponseList.add(monthAmount);
			}
			tax1099K.setMonthAmounts(monthAmountsResponseList);
		}
//		MonthAmount End 

//		filerNameAddress Start
		TelephoneNumberPlusExtension psePhone = new TelephoneNumberPlusExtension();
		if (rs.getInt("psePhone") != 0) {
			psePhone.setPhoneId(rs.getInt("psePhone"));
			tax1099K.setPsePhone(psePhone);
		}
//		filerNameAddress End

		return tax1099K;
	}

}
