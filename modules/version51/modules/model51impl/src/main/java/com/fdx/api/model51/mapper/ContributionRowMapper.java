package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.Contribution;
import com.fdx.api.model51.modelimpl.SecurityIdType;

public class ContributionRowMapper implements RowMapper<Contribution> {

	@Override
	public Contribution mapRow(ResultSet rs, int rowNum) throws SQLException {
		Contribution contribution = new Contribution();

		contribution.setEmployeeAfterTaxAmount(rs.getBigDecimal("employeeAfterTaxAmount"));
		contribution.setEmployeeAfterTaxPercentage(rs.getBigDecimal("employeeAfterTaxPercentage"));
		contribution.setEmployeeDeferPreTaxAmount(rs.getBigDecimal("employeeDeferPreTaxAmount"));
		contribution.setEmployeeDeferPreTaxPercentage(rs.getBigDecimal("employeeDeferPreTaxPercentage"));
		contribution.setEmployeePreTaxAmount(rs.getBigDecimal("employeePreTaxAmount"));
		contribution.setEmployeePreTaxPercentage(rs.getBigDecimal("employeePreTaxPercentage"));
		contribution.setEmployeeYearToDate(rs.getBigDecimal("employeeYearToDate"));
		contribution.setEmployerMatchAmount(rs.getBigDecimal("employerMatchAmount"));
		contribution.setEmployerMatchPercentage(rs.getBigDecimal("employerMatchPercentage"));
		contribution.setEmployerYearToDate(rs.getBigDecimal("employerYearToDate"));
		contribution.setRolloverContributionAmount(rs.getBigDecimal("rolloverContributionAmount"));
		contribution.setRolloverContributionPercentage(rs.getBigDecimal("rolloverContributionPercentage"));
		contribution.setSecurityId(rs.getString("securityId"));
		if (rs.getString("securityIdType") != null)
			contribution.setSecurityIdType(SecurityIdType.valueOf(rs.getString("securityIdType").toString()));

		return contribution;
	}

}
