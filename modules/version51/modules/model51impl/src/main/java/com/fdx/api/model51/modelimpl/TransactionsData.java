package com.fdx.api.model51.modelimpl;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;

/**
 * Optionally paginated array of transactions
 */
@ApiModel(description = "Optionally paginated array of transactions")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class TransactionsData {

	NamedParameterJdbcTemplate template;

	@JsonProperty("depositTransaction")
	private DepositTransaction depositTransaction;

	@JsonProperty("investmentTransaction")
	private InvestmentTransaction investmentTransaction;

	@JsonProperty("insuranceTransaction")
	private InsuranceTransaction insuranceTransaction;

	@JsonProperty("locTransaction")
	private LocTransaction locTransaction;

	@JsonProperty("loanTransaction")
	private LoanTransaction loanTransaction;

	public DepositTransaction getDepositTransaction() {
		return depositTransaction;
	}

	public void setDepositTransaction(DepositTransaction depositTransaction) {
		this.depositTransaction = depositTransaction;
	}

	public InvestmentTransaction getInvestmentTransaction() {
		return investmentTransaction;
	}

	public void setInvestmentTransaction(InvestmentTransaction investmentTransaction) {
		this.investmentTransaction = investmentTransaction;
	}

	public InsuranceTransaction getInsuranceTransaction() {
		return insuranceTransaction;
	}

	public void setInsuranceTransaction(InsuranceTransaction insuranceTransaction) {
		this.insuranceTransaction = insuranceTransaction;
	}

	public LocTransaction getLocTransaction() {
		return locTransaction;
	}

	public void setLocTransaction(LocTransaction locTransaction) {
		this.locTransaction = locTransaction;
	}

	public LoanTransaction getLoanTransaction() {
		return loanTransaction;
	}

	public void setLoanTransaction(LoanTransaction loanTransaction) {
		this.loanTransaction = loanTransaction;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((depositTransaction == null) ? 0 : depositTransaction.hashCode());
		result = prime * result + ((insuranceTransaction == null) ? 0 : insuranceTransaction.hashCode());
		result = prime * result + ((investmentTransaction == null) ? 0 : investmentTransaction.hashCode());
		result = prime * result + ((loanTransaction == null) ? 0 : loanTransaction.hashCode());
		result = prime * result + ((locTransaction == null) ? 0 : locTransaction.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TransactionsData other = (TransactionsData) obj;
		if (depositTransaction == null) {
			if (other.depositTransaction != null)
				return false;
		} else if (!depositTransaction.equals(other.depositTransaction))
			return false;
		if (insuranceTransaction == null) {
			if (other.insuranceTransaction != null)
				return false;
		} else if (!insuranceTransaction.equals(other.insuranceTransaction))
			return false;
		if (investmentTransaction == null) {
			if (other.investmentTransaction != null)
				return false;
		} else if (!investmentTransaction.equals(other.investmentTransaction))
			return false;
		if (loanTransaction == null) {
			if (other.loanTransaction != null)
				return false;
		} else if (!loanTransaction.equals(other.loanTransaction))
			return false;
		if (locTransaction == null) {
			if (other.locTransaction != null)
				return false;
		} else if (!locTransaction.equals(other.locTransaction))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TransactionsData [depositTransaction=" + depositTransaction + ", investmentTransaction="
				+ investmentTransaction + ", insuranceTransaction=" + insuranceTransaction + ", locTransaction="
				+ locTransaction + ", loanTransaction=" + loanTransaction + "]";
	}

}
