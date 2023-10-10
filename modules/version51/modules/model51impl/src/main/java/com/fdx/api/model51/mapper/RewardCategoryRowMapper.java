package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.FiAttribute;
import com.fdx.api.model51.modelimpl.RewardCategory;

public class RewardCategoryRowMapper implements RowMapper<RewardCategory> {

	@Override
	public RewardCategory mapRow(ResultSet rs, int rowNum) throws SQLException {
		RewardCategory rewardCategory = new RewardCategory();
		rewardCategory.setProgramId(rs.getString("programId"));
		rewardCategory.setCategoryId(rs.getString("categoryId"));
		rewardCategory.setCategoryName(rs.getString("categoryName"));
		rewardCategory.setDescription(rs.getString("description"));
		rewardCategory.setMultiplier(rs.getBigDecimal("multiplier"));

		if (rs.getArray("fiattributes") != null) {
			List<FiAttribute> fiAttributeList = new ArrayList<>();
			List<Integer> fiattrlist = Arrays.asList((Integer[]) rs.getArray("fiattributes").getArray());
			for (Integer listele : fiattrlist) {
				FiAttribute fiAttribute = new FiAttribute();
				fiAttribute.setName(listele.toString());
				fiAttributeList.add(fiAttribute);
			}
			rewardCategory.setFiAttributes(fiAttributeList);
		}
		return rewardCategory;
	}

}
