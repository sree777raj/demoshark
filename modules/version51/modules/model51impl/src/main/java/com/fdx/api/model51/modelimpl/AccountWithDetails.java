package com.fdx.api.model51.modelimpl;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fdx.common.exception.FDXException;
import com.fdx.common.util.FdxConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fdx.api.model51.model.AccountWithDetails51;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * This provides an instance of an account with full details
 */
@ApiModel(description = "This provides an instance of an account with full details")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
@Repository("AccountWithDetails51")
@JsonIgnoreProperties({"targetClass", "targetSource", "targetObject", "advisors", "frozen", "advisorCount","exposeProxy", "preFiltered", "proxiedInterfaces", "proxyTargetClass"}) 
public class AccountWithDetails implements AccountWithDetails51<AccountWithDetails> {

	NamedParameterJdbcTemplate template;

	@Autowired
	AccountDescriptor accountDescriptor;

//	@Autowired
	@JsonProperty("depositAccount")
	private DepositAccount depositAccount;

	@JsonProperty("loanAccount")
	private LoanAccount loanAccount;

	@JsonProperty("locAccount")
	private LocAccount locAccount;

	@JsonProperty("investmentAccount")
	private InvestmentAccount investmentAccount;

	@JsonProperty("insuranceAccount")
	private InsuranceAccount insuranceAccount;

	@JsonProperty("annuityAccount")
	private AnnuityAccount annuityAccount;

	private static final Logger logger = LoggerFactory.getLogger(AccountWithDetails.class);

	public AccountWithDetails depositAccount(DepositAccount depositAccount) {
		this.depositAccount = depositAccount;
		return this;
	}

	/**
	 * Get depositAccount
	 * 
	 * @return depositAccount
	 */
	@ApiModelProperty(value = "")

	@Valid

	public DepositAccount getDepositAccount() {
		return depositAccount;
	}

	public void setDepositAccount(DepositAccount depositAccount) {
		this.depositAccount = depositAccount;
	}

	public AccountWithDetails loanAccount(LoanAccount loanAccount) {
		this.loanAccount = loanAccount;
		return this;
	}

	/**
	 * Get loanAccount
	 * 
	 * @return loanAccount
	 */
	@ApiModelProperty(value = "")

	@Valid

	public LoanAccount getLoanAccount() {
		return loanAccount;
	}

	public void setLoanAccount(LoanAccount loanAccount) {
		this.loanAccount = loanAccount;
	}

	public AccountWithDetails locAccount(LocAccount locAccount) {
		this.locAccount = locAccount;
		return this;
	}

	/**
	 * Get locAccount
	 * 
	 * @return locAccount
	 */
	@ApiModelProperty(value = "")

	@Valid

	public LocAccount getLocAccount() {
		return locAccount;
	}

	public void setLocAccount(LocAccount locAccount) {
		this.locAccount = locAccount;
	}

	public AccountWithDetails investmentAccount(InvestmentAccount investmentAccount) {
		this.investmentAccount = investmentAccount;
		return this;
	}

	/**
	 * Get investmentAccount
	 * 
	 * @return investmentAccount
	 */
	@ApiModelProperty(value = "")

	@Valid

	public InvestmentAccount getInvestmentAccount() {
		return investmentAccount;
	}

	public void setInvestmentAccount(InvestmentAccount investmentAccount) {
		this.investmentAccount = investmentAccount;
	}

	public AccountWithDetails insuranceAccount(InsuranceAccount insuranceAccount) {
		this.insuranceAccount = insuranceAccount;
		return this;
	}

	/**
	 * Get insuranceAccount
	 * 
	 * @return insuranceAccount
	 */
	@ApiModelProperty(value = "")

	@Valid

	public InsuranceAccount getInsuranceAccount() {
		return insuranceAccount;
	}

	public void setInsuranceAccount(InsuranceAccount insuranceAccount) {
		this.insuranceAccount = insuranceAccount;
	}

	public AccountWithDetails annuityAccount(AnnuityAccount annuityAccount) {
		this.annuityAccount = annuityAccount;
		return this;
	}

	/**
	 * Get annuityAccount
	 * 
	 * @return annuityAccount
	 */
	@ApiModelProperty(value = "")

	@Valid

	public AnnuityAccount getAnnuityAccount() {
		return annuityAccount;
	}

	public void setAnnuityAccount(AnnuityAccount annuityAccount) {
		this.annuityAccount = annuityAccount;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AccountWithDetails accountWithDetails = (AccountWithDetails) o;
		return Objects.equals(this.depositAccount, accountWithDetails.depositAccount)
				&& Objects.equals(this.loanAccount, accountWithDetails.loanAccount)
				&& Objects.equals(this.locAccount, accountWithDetails.locAccount)
				&& Objects.equals(this.investmentAccount, accountWithDetails.investmentAccount)
				&& Objects.equals(this.insuranceAccount, accountWithDetails.insuranceAccount)
				&& Objects.equals(this.annuityAccount, accountWithDetails.annuityAccount);
	}

	@Override
	public int hashCode() {
		return Objects.hash(depositAccount, loanAccount, locAccount, investmentAccount, insuranceAccount,
				annuityAccount);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AccountWithDetails {\n");

		sb.append("    depositAccount: ").append(toIndentedString(depositAccount)).append("\n");
		sb.append("    loanAccount: ").append(toIndentedString(loanAccount)).append("\n");
		sb.append("    locAccount: ").append(toIndentedString(locAccount)).append("\n");
		sb.append("    investmentAccount: ").append(toIndentedString(investmentAccount)).append("\n");
		sb.append("    insuranceAccount: ").append(toIndentedString(insuranceAccount)).append("\n");
		sb.append("    annuityAccount: ").append(toIndentedString(annuityAccount)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

	private static final Logger log = LoggerFactory.getLogger(AccountWithDetails.class);

	@Override
	public AccountWithDetails getAccount(String accountId) throws FDXException {
		try {
			return getAccount(accountId, "details", null, null);
		} catch (FDXException fdxException) {
			if (fdxException.getErrorCode() == 1107)
				throw new FDXException(701);
			throw fdxException;
		}
	}

	public AccountWithDetails getAccount(String accountId, String resultType, LocalDate startTime,
										 LocalDate endTime) throws FDXException {
		try {
			Accounts accounts = new Accounts();
			return getAccountWithDetails(accountId, resultType, startTime, endTime, accounts.getAccountsType(accountId));
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("AccountWithDetails : ", e);
			throw new FDXException(e, FdxConstants.HTTP_ERROR_CODE_500);
		}
	}

	private AccountWithDetails getAccountWithDetails(String accountId, String resultType, LocalDate startTime, LocalDate endTime,String accountType) throws Exception {
		AccountWithDetails accountWithDetails = new AccountWithDetails();
		DepositAccount depositAccount = new DepositAccount();
		LoanAccount loanAccount = new LoanAccount();
		LocAccount locAccount = new LocAccount();
		InvestmentAccount investmentAccount = new InvestmentAccount();
		InsuranceAccount insuranceAccount = new InsuranceAccount();
		AnnuityAccount annuityAccount = new AnnuityAccount();
			switch (accountType) {
				case "depositaccount":
					accountWithDetails.depositAccount = depositAccount.getDepositAccount(accountId, startTime, endTime, resultType);
					break;
				case "loanaccount":
					accountWithDetails.loanAccount = loanAccount.getLoanAccount(accountId, startTime, endTime, resultType);
					break;
				case "locaccount":
					accountWithDetails.locAccount = locAccount.getLocAccount(accountId, startTime, endTime, resultType);
					break;
				case "investmentaccount":
					accountWithDetails.investmentAccount = investmentAccount.getInvestmentAccount(accountId, startTime, endTime,
							resultType);
					break;
				case "insuranceaccount":
					accountWithDetails.insuranceAccount = insuranceAccount.getInsuranceAccount(accountId, startTime, endTime,
							resultType);
					break;
				case "annuityaccount":
					accountWithDetails.annuityAccount = annuityAccount.getAnnuityAccount(accountId, startTime, endTime, resultType);
					break;
			}
		return accountWithDetails;
	}
}
