package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.UpdatesMetadata;

public class UpdatesMetadataRowMapper implements RowMapper<UpdatesMetadata> {

	@Override
	public UpdatesMetadata mapRow(ResultSet rs, int rowNum) throws SQLException {
		UpdatesMetadata updatesMetadata = new UpdatesMetadata();
		
		updatesMetadata.setNextUpdateId(rs.getString("nextupdateid"));
		updatesMetadata.setNextSequenceId(rs.getString("nextsequenceid"));
		
		return updatesMetadata;
	}
}
