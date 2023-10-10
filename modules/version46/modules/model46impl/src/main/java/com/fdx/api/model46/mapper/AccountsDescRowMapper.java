package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.AccountDescriptor;
import com.fdx.api.model46.modelimpl.AccountType;
import com.fdx.api.model46.modelimpl.Currency;
import com.fdx.api.model46.modelimpl.Error;
import com.fdx.api.model46.modelimpl.FiAttribute;
import com.fdx.api.model46.modelimpl.Iso4217Code;

public class AccountsDescRowMapper implements RowMapper<AccountDescriptor> {

	@Override
	public AccountDescriptor mapRow(ResultSet rs, int arg1) throws SQLException {
		AccountDescriptor account = new AccountDescriptor();
		account.setAccountId(rs.getString("accountId"));

		Error error = new Error();
		if (rs.getString("errorcode") != null) {
			error.setCode(rs.getString("errorcode"));
			account.setError(error);
		} else
			account.setError(null);

		if (rs.getString("accountType") != null)
			account.setAccountType(AccountType.fromValue(rs.getString("accountType")));
		account.setAccountNumber(rs.getString("accountNumber"));
		account.setAccountNumberDisplay(rs.getString("accountNumberDisplay"));
		account.setProductName(rs.getString("productname"));
		account.setNickname(rs.getString("nickname"));
		if (rs.getString("status") != null)
			account.setStatus(AccountDescriptor.StatusEnum.fromValue(rs.getString("status")));
		account.setDescription(rs.getString("description"));

		Currency currency = new Currency();
		if (rs.getString("currencyCode") != null) {
			currency.setCurrencyCode(Iso4217Code.fromValue(rs.getString("currencycode")));
			account.setCurrency(currency);
		} else
			currency.setCurrencyCode(null);

		List<FiAttribute> fiAttributeList = new ArrayList<>();
		if (rs.getArray("fiattributes") != null) {
			List<Integer> fiattrlist = Arrays.asList((Integer[]) rs.getArray("fiattributes").getArray());
			for (Integer listele : fiattrlist) {
				FiAttribute fiAttribute = new FiAttribute();
				fiAttribute.setName(listele.toString());
				fiAttributeList.add(fiAttribute);
			}
			account.setFiAttributes(fiAttributeList);
		}
		return account;
	}

}
