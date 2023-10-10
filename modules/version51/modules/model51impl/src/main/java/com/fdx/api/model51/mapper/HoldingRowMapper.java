package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.Currency;
import com.fdx.api.model51.modelimpl.DebtSecurity;
import com.fdx.api.model51.modelimpl.FiAttribute;
import com.fdx.api.model51.modelimpl.FiPortion;
import com.fdx.api.model51.modelimpl.HeldInAccount;
import com.fdx.api.model51.modelimpl.Holding;
import com.fdx.api.model51.modelimpl.HoldingSubType;
import com.fdx.api.model51.modelimpl.HoldingType;
import com.fdx.api.model51.modelimpl.Inv401kSourceType;
import com.fdx.api.model51.modelimpl.Iso4217Code;
import com.fdx.api.model51.modelimpl.MutualFundSecurity;
import com.fdx.api.model51.modelimpl.OptionSecurity;
import com.fdx.api.model51.modelimpl.OtherSecurity;
import com.fdx.api.model51.modelimpl.Portion;
import com.fdx.api.model51.modelimpl.PositionType;
import com.fdx.api.model51.modelimpl.SecurityIdType;
import com.fdx.api.model51.modelimpl.StockSecurity;
import com.fdx.api.model51.modelimpl.SweepSecurity;
import com.fdx.api.model51.modelimpl.TaxLot;

public class HoldingRowMapper implements RowMapper<Holding> {

	@Override
	public Holding mapRow(ResultSet rs, int rowNum) throws SQLException {
		Holding holding = new Holding();

		List<Portion> portionList = new ArrayList<>();

		if (rs.getArray("assetClassportionid") != null) {
			List<Integer> portionResponseList = Arrays
					.asList((Integer[]) rs.getArray("assetClassportionid").getArray());

			for (int listele : portionResponseList) {
				Portion portion = new Portion();
				portion.setPortionId(listele);
				portionList.add(portion);
			}
			holding.setAssetClasses(portionList);
		}

		if (!(rs.getString("averageCost") == null))
			holding.setAverageCost(rs.getBoolean("averageCost"));
		if (!(rs.getString("cashAccount") == null))
			holding.setCashAccount(rs.getBoolean("cashAccount"));
		holding.setChangeInPrice(rs.getBigDecimal("changeInPrice"));

		Currency currency = new Currency();
		if (rs.getString("currencycode") != null) {
			currency.setCurrencyCode(Iso4217Code.valueOf(rs.getString("currencycode").toString()));
			holding.setCurrency(currency);
		}

		holding.setCurrentUnitPrice(rs.getBigDecimal("currentUnitPrice"));
		holding.setCurrentUnitPriceDate(rs.getTimestamp("currentUnitPriceDate"));

		holding.setDescription(rs.getString("description"));
		holding.setExpirationDate(rs.getTimestamp("expirationDate"));
		holding.setFaceValue(rs.getBigDecimal("faceValue"));

		if (rs.getArray("fiAssetClassportionid") != null) {
			List<FiPortion> fiPortionList = new ArrayList<>();
			List<Integer> fiPortionResponseList = Arrays
					.asList((Integer[]) rs.getArray("fiAssetClassportionid").getArray());

			for (Integer listele : fiPortionResponseList) {
				FiPortion fiPortion = new FiPortion();
				fiPortion.setPortionId(listele);
				fiPortionList.add(fiPortion);
			}
			holding.setFiAssetClasses(fiPortionList);
		}

		if (rs.getArray("fiattributes") != null) {
			List<FiAttribute> fiAttributeList = new ArrayList<>();
			List<Integer> fiattrlist = Arrays.asList((Integer[]) rs.getArray("fiattributes").getArray());
			for (Integer listele : fiattrlist) {
				FiAttribute fiAttribute = new FiAttribute();
				fiAttribute.setName(listele.toString());
				fiAttributeList.add(fiAttribute);
			}
			holding.setFiAttributes(fiAttributeList);
		}

		if (rs.getString("heldInAccount") != null)
			holding.setHeldInAccount(HeldInAccount.valueOf(rs.getString("heldInAccount")));
		holding.setHoldingId(rs.getString("holdingId"));
		holding.setHoldingName(rs.getString("holdingName"));
		if (rs.getString("holdingSubType") != null)
			holding.setHoldingSubType(HoldingSubType.valueOf(rs.getString("holdingSubType")));
		if (rs.getString("holdingType") != null)
			holding.setHoldingType(HoldingType.valueOf(rs.getString("holdingType")));
		if (rs.getString("inv401kSource") != null)
			holding.setInv401kSource(Inv401kSourceType.valueOf(rs.getString("inv401kSource")));
		holding.setMarketValue(rs.getBigDecimal("marketValue"));

		if (rs.getString("mutualfundsecurity") != null) {
			MutualFundSecurity mutualFundSecurity = new MutualFundSecurity();
			mutualFundSecurity.setMutualfundsecurityid(rs.getInt("mutualfundsecurity"));
			holding.setMutualFundSecurity(mutualFundSecurity);
		}

		if (rs.getString("optionsecurity") != null) {
			OptionSecurity optionSecurity = new OptionSecurity();
			optionSecurity.setOptionSecurityId(rs.getInt("optionsecurity"));
			holding.setOptionSecurity(optionSecurity);
		}

		holding.setOriginalPurchaseDate(rs.getTimestamp("originalpurchasedate"));

		if (rs.getString("othersecurity") != null) {
			OtherSecurity otherSecurity = new OtherSecurity();
			otherSecurity.setOtherSecurityId(rs.getInt("othersecurity"));
			holding.setOtherSecurity(otherSecurity);
		}

		if (rs.getString("debtsecurity") != null) {
			DebtSecurity debtsecurity = new DebtSecurity();
			debtsecurity.setDebtSecurityId(rs.getInt("debtsecurity"));
			holding.setDebtSecurity(debtsecurity);
		}

		if (rs.getString("positionType") != null)
			holding.setPositionType(PositionType.valueOf(rs.getString("positionType")));
		holding.setPurchasedPrice(rs.getBigDecimal("purchasedprice"));
		holding.setRate(rs.getBigDecimal("rate"));
		holding.setSecurityId(rs.getString("securityid"));

		if (rs.getString("securityidtype") != null)
			holding.setSecurityIdType(SecurityIdType.valueOf(rs.getString("securityidtype")));

		if (rs.getString("stocksecurity") != null) {
			StockSecurity stockSecurity = new StockSecurity();
			stockSecurity.setStockSecurityId(rs.getInt("stocksecurity"));
			holding.setStockSecurity(stockSecurity);
		}

		if (rs.getString("sweepsecurity") != null) {
			SweepSecurity sweepSecurity = new SweepSecurity();
			sweepSecurity.setSweepSecurityId(rs.getInt("sweepsecurity"));
			holding.setSweepSecurity(sweepSecurity);
		}

		holding.setSymbol(rs.getString("symbol"));
		holding.setUnits(rs.getBigDecimal("units"));

		if (rs.getArray("sweepsecurity") != null) {

			List<TaxLot> taxLotsList = new ArrayList<>();
			if (rs.getArray("taxlots") != null) {
				List<Integer> taxLots = Arrays.asList((Integer[]) rs.getArray("taxlots").getArray());
				for (Integer taxLot : taxLots) {
					TaxLot taxLotNew = new TaxLot();
					taxLotNew.setTaxLotId(taxLot);
					taxLotsList.add(taxLotNew);
				}
				holding.setTaxLots(taxLotsList);
			}
		}
		return holding;
	}

}
