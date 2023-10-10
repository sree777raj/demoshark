package com.fdx.api.model51.mapper;

import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.HealthInsuranceCoveredIndividual;
import com.fdx.api.model51.modelimpl.IndividualName;
import com.fdx.api.model51.modelimpl.MonthAbbreviation;

public class HealthInsuranceCoveredIndividualRowMapper implements RowMapper<HealthInsuranceCoveredIndividual> {

	@Override
	public HealthInsuranceCoveredIndividual mapRow(ResultSet rs, int rowNum) throws SQLException {
		HealthInsuranceCoveredIndividual healthInsuranceCoveredIndividual = new HealthInsuranceCoveredIndividual();
		if (!(rs.getString("coveredAll12Months") == null))
			healthInsuranceCoveredIndividual.setCoveredAll12Months(rs.getBoolean("coveredAll12Months"));
		if (!(rs.getString("coveredAt12Months") == null))
			healthInsuranceCoveredIndividual.setCoveredAt12Months(rs.getBoolean("coveredAt12Months"));
		healthInsuranceCoveredIndividual.setDateOfBirth(rs.getDate("dateOfBirth"));

		if (rs.getInt("name") != 0) {
			IndividualName individualName = new IndividualName();
			individualName.setNameid(rs.getInt("name"));
			healthInsuranceCoveredIndividual.setName(individualName);
		}

		healthInsuranceCoveredIndividual.setTin(rs.getString("tin"));

		if (rs.getArray("coveredmonths") != null) {
			List<MonthAbbreviation> monthsAbbreviationResponse = new ArrayList<>();
			MonthAbbreviation monthAbbreviationNew;
			Array coveredMonthsarray = rs.getArray("coveredmonths");
			Object[] coveredMonths = (Object[]) coveredMonthsarray.getArray();

			for (Object coveredMonthsIterator : coveredMonths) {
				monthAbbreviationNew = MonthAbbreviation.fromValue(coveredMonthsIterator.toString());
				monthsAbbreviationResponse.add(monthAbbreviationNew);
			}
			healthInsuranceCoveredIndividual.setCoveredMonths(monthsAbbreviationResponse);
		}

		return healthInsuranceCoveredIndividual;
	}

}
