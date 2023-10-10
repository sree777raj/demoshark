package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.CodeAmount;
import com.fdx.api.model51.modelimpl.SaleProceedsType;
import com.fdx.api.model51.modelimpl.SaleTermType;
import com.fdx.api.model51.modelimpl.SecurityDetail;
import com.fdx.api.model51.modelimpl.StateTaxWithholding;

public class SecurityDetailRowMapper implements RowMapper<SecurityDetail> {

	@Override
	public SecurityDetail mapRow(ResultSet rs, int rowNum) throws SQLException {
		SecurityDetail securityDetail = new SecurityDetail();
		securityDetail.setAccruedMarketDiscount(rs.getDouble("accruedMarketDiscount"));
		if (!(rs.getString("basisReported") == null))
			securityDetail.setBasisReported(rs.getBoolean("basisReported"));
		securityDetail.setCheckboxOnForm8949(rs.getString("checkboxOnForm8949"));
		if (!(rs.getString("collectible") == null))
			securityDetail.setCollectible(rs.getBoolean("collectible"));
		securityDetail.setCostBasis(rs.getDouble("costBasis"));
		securityDetail.setCusip(rs.getString("cusip"));
		securityDetail.setDateAcquired(rs.getDate("dateAcquired"));
		securityDetail.setDateOfSale(rs.getDate("dateOfSale"));
		securityDetail.setFederalTaxWithheld(rs.getDouble("federalTaxWithheld"));
		if (!(rs.getString("foreignAccountTaxCompliance") == null))
			securityDetail.setForeignAccountTaxCompliance(rs.getBoolean("foreignAccountTaxCompliance"));
		if (rs.getString("grossOrNet") != null)
			securityDetail.setGrossOrNet(SaleProceedsType.valueOf(rs.getString("grossOrNet").toString()));
		securityDetail.setLongOrShort(SaleTermType.valueOf(rs.getString("longOrShort").toString()));
		if (!(rs.getString("lossNotAllowed") == null))
			securityDetail.setLossNotAllowed(rs.getBoolean("lossNotAllowed"));
		if (!(rs.getString("noncoveredSecurity") == null))
			securityDetail.setNoncoveredSecurity(rs.getBoolean("noncoveredSecurity"));
		securityDetail.setNumberOfShares(rs.getDouble("numberOfShares"));
		if (!(rs.getString("ordinary") == null))
			securityDetail.setOrdinary(rs.getBoolean("ordinary"));
		if (!(rs.getString("qof") == null))
			securityDetail.setQof(rs.getBoolean("qof"));
		securityDetail.setSaleDescription(rs.getString("saleDescription"));
		securityDetail.setSalesPrice(rs.getDouble("salesPrice"));
		securityDetail.setSecurityName(rs.getString("securityName"));
		if (!(rs.getString("variousDatesAcquired") == null))
			securityDetail.setVariousDatesAcquired(rs.getBoolean("variousDatesAcquired"));
		securityDetail.setWashSaleLossDisallowed(rs.getDouble("washSaleLossDisallowed"));

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
			securityDetail.setStateTaxWithholding(statetaxwithholdingResponseList);
		}
//		StateTaxWithholding End 

//		adjustmentCodes Start
		List<CodeAmount> adjustmentCodesResponseList = new ArrayList<>();
		if (rs.getArray("adjustmentCodes") != null) {
			List<Integer> adjustmentCodesList = Arrays.asList((Integer[]) rs.getArray("adjustmentCodes").getArray());
			for (int codeAmountId : adjustmentCodesList) {
				CodeAmount codeAmount = new CodeAmount();
				codeAmount.setCodeAmountId(codeAmountId);
				adjustmentCodesResponseList.add(codeAmount);
			}
			securityDetail.setAdjustmentCodes(adjustmentCodesResponseList);
		}
//		adjustmentCodes End 

		return securityDetail;
	}

}
