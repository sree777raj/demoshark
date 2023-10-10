package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.FiAttribute;
import com.fdx.api.model51.modelimpl.RewardBalance;
import com.fdx.api.model51.modelimpl.RewardType;

public class RewardBalanceRowMapper implements RowMapper<RewardBalance> {

	@Override
	public RewardBalance mapRow(ResultSet rs, int rowNum) throws SQLException {
		RewardBalance rewardBalance = new RewardBalance();

		rewardBalance.setAccruedYtd(rs.getBigDecimal("accruedytd"));
		rewardBalance.setBalance(rs.getBigDecimal("balance"));
		rewardBalance.setName(rs.getString("name"));
		if (!(rs.getString("qualifying") == null))
			rewardBalance.setQualifying(rs.getBoolean("qualifying"));
		rewardBalance.setRedeemedYtd(rs.getBigDecimal("redeemedYtd"));
		if (rs.getString("type") != null)
			rewardBalance.setType(RewardType.valueOf(rs.getString("type").toString()));

		if (rs.getArray("fiattributes") != null) {
			List<FiAttribute> fiAttributeList = new ArrayList<>();
			List<Integer> fiattrlist = Arrays.asList((Integer[]) rs.getArray("fiattributes").getArray());
			for (Integer listele : fiattrlist) {
				FiAttribute fiAttribute = new FiAttribute();
				fiAttribute.setName(listele.toString());
				fiAttributeList.add(fiAttribute);
			}
			rewardBalance.setFiAttributes(fiAttributeList);
		}
		return rewardBalance;
	}

}
