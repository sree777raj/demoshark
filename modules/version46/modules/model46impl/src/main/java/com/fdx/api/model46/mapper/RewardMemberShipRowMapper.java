package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.BusinessOrConsumer;
import com.fdx.api.model46.modelimpl.RewardBalance;
import com.fdx.api.model46.modelimpl.RewardMembership;

public class RewardMemberShipRowMapper implements RowMapper<RewardMembership> {

	@Override
	public RewardMembership mapRow(ResultSet rs, int rowNum) throws SQLException {
		RewardMembership rewardMembership = new RewardMembership();

		Set<String> accountIdsSet = new HashSet<String>();

		if (rs.getArray("accountids") != null) {
			List<String> accountIdsList = Arrays.asList((String[]) rs.getArray("accountids").getArray());
			for (String accountIdIterator : accountIdsList) {
				accountIdsSet.add(accountIdIterator);
			}
			rewardMembership.setAccountIds(accountIdsSet);
		}

		List<RewardBalance> rewardBalanceList = new ArrayList<>();
		if (rs.getArray("balances") != null) {
			List<Integer> rewardBalanceListNew = Arrays.asList((Integer[]) rs.getArray("balances").getArray());
			for (int rewardBalanceListIterator : rewardBalanceListNew) {
				RewardBalance rewardBalance = new RewardBalance();
				rewardBalance.setBalanceId(rewardBalanceListIterator);
				rewardBalanceList.add(rewardBalance);
			}
			rewardMembership.setBalances(rewardBalanceList);
		}

		if (rs.getString("businessorconsumer") != null)
			rewardMembership.setBusinessOrConsumer(BusinessOrConsumer.valueOf(rs.getString("businessorconsumer")));
		rewardMembership.setCustomerId(rs.getString("customerid"));
		rewardMembership.setMemberId(rs.getString("memberid"));
		rewardMembership.setMemberNumber(rs.getString("membernumber"));
		rewardMembership.setMemberTier(rs.getString("membertier"));

		return rewardMembership;
	}

}
