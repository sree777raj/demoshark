package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.FiAttribute;
import com.fdx.api.model51.modelimpl.RewardMembership;
import com.fdx.api.model51.modelimpl.RewardProgram;

public class RewardProgramRowMapper implements RowMapper<RewardProgram> {

	@Override
	public RewardProgram mapRow(ResultSet rs, int rowNum) throws SQLException {
		RewardProgram rewardProgram = new RewardProgram();
		rewardProgram.setProgramId(rs.getString("programId"));
		rewardProgram.setProgramName(rs.getString("programName"));
		rewardProgram.setProgramUrl(rs.getString("programUrl"));

		if (rs.getArray("fiattributes") != null) {
			List<FiAttribute> fiAttributeList = new ArrayList<>();
			List<Integer> fiattrlist = Arrays.asList((Integer[]) rs.getArray("fiattributes").getArray());
			for (Integer listele : fiattrlist) {
				FiAttribute fiAttribute = new FiAttribute();
				fiAttribute.setName(listele.toString());
				fiAttributeList.add(fiAttribute);
			}
			rewardProgram.setFiAttributes(fiAttributeList);
		}

		if (rs.getArray("memberships") != null) {
			List<RewardMembership> rewardMemberShipList = new ArrayList<>();
			List<Integer> rewardMemberShipListResponse = Arrays
					.asList((Integer[]) rs.getArray("memberships").getArray());
			for (int rewardMemberShipIterator : rewardMemberShipListResponse) {
				RewardMembership rewardMembership = new RewardMembership();
				rewardMembership.setMemberShipId(rewardMemberShipIterator);

				rewardMemberShipList.add(rewardMembership);
			}
			rewardProgram.setMemberships(rewardMemberShipList);
		}
		return rewardProgram;
	}

}
