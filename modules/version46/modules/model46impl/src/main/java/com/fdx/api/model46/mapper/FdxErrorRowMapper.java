package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.FdxError;

public class FdxErrorRowMapper implements RowMapper<FdxError> {

	@Override
	public FdxError mapRow(ResultSet rs, int arg1) throws SQLException {
		FdxError fdxError = new FdxError();
		fdxError.setCode(rs.getString("errorCode"));
		fdxError.setMessage(rs.getString("errorMessage"));
		fdxError.setHttpStatusCode(rs.getInt("httpStatusCode"));
		if (rs.getString("realm") != null)
			fdxError.setRealm(FdxError.ApplicationRealm.valueOf(rs.getString("realm")));
		return fdxError;
	}

}
