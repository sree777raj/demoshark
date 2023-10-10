package com.fdx.api.model46.modelimpl;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fdx.common.exception.FDXException;

public enum AccountEntityType {

	depositaccount("depositaccount"), investmentaccount("investmentaccount"), annuityaccount("annuityaccount"),
	locaccount("locaccount"), loanaccount("loanaccount"), insuranceaccount("insuranceaccount");

	private String value;

	AccountEntityType(String value) {
		this.value = value;
	}

	@JsonValue
	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}

	@JsonCreator
	public static AccountEntityType fromValue(String value) throws FDXException {
		for (AccountEntityType b : AccountEntityType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'",401));
	}
}
