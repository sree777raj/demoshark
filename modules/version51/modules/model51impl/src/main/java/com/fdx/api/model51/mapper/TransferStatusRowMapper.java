package com.fdx.api.model51.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model51.modelimpl.TransferStatus;
import com.fdx.api.model51.modelimpl.TransferStatusStatus;

public class TransferStatusRowMapper implements RowMapper<TransferStatus> {

	@Override
	public TransferStatus mapRow(ResultSet rs, int rowNum) throws SQLException {
		TransferStatus transferStatus = new TransferStatus();
		transferStatus.setReferenceId(rs.getString("referenceId"));
		if (rs.getString("status") != null)
			transferStatus.setStatus(TransferStatusStatus.valueOf(rs.getString("status")));
		transferStatus.setTransferDate(rs.getTimestamp("transferDate"));
		transferStatus.setTransferId(rs.getString("transferId"));
		return transferStatus;
	}

}
