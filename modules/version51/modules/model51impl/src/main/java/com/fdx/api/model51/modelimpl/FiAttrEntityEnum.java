package com.fdx.api.model51.modelimpl;

import com.fdx.common.exception.FDXException;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The type of an account.<br/> <br/> | Value | Description |<br/> |-----|-----|<br/> | 401A | An employer-sponsored money-purchase retirement plan that allows dollar or percentage-based contributions from the employer, the employee, or both |<br/> | 401K | An employer-sponsored defined-contribution pension account defined in subsection 401(k) of the Internal Revenue Code |<br/> | 403B | A U.S. tax-advantaged retirement savings plan available for public education organizations, some non-profit employers (only Internal Revenue Code 511(c)(3) organizations), cooperative hospital service organizations, and self-employed ministers in the United States |<br/> | '529' | A tax-advantaged savings plan designed to help pay for education |<br/> | ANNUITY | A form of insurance or investment entitling the investor to a series of annual sums |<br/> | AUTOLOAN | A type of loan used to finance a car purchase |<br/> | BROKERAGEPRODUCT | Investment management offered by a licensed brokerage firm that places trades on behalf of the customer, utilizing any number of investment options |<br/> | CD | A certificate of deposit (CD) is a product offered by banks and credit unions that provides an interest rate premium in exchange for the customer agreeing to leave a lump-sum deposit untouched for a predetermined period of time |<br/> | CHARGE | An account to which goods and services may be charged on credit |<br/> | CHECKING | A deposit account held at a financial institution that allows withdrawals and deposits |<br/> | COMMERCIALDEPOSIT | Deposit Account for Commercial Customers e.g. Business Trust Account |<br/> | COMMERCIALINVESTMENT | Investment Account for Commercial Customers. e.g. Commercial Brokerage Account |<br/> | COMMERCIALINEOFCREDIT | A preset borrowing limit that can be used at any time |<br/> | COMMERCIALLOAN | A preset borrowing limit that can be used at any time |<br/> | COVERDELL | A trust or custodial account set up in the United States solely for paying qualified education expenses for the designated beneficiary of the account |<br/> | CREDITCARD | Allows cardholders to borrow funds with which to pay for goods and services with merchants that accept cards for payment |<br/> | DEFINEDBENEFIT | An employer-sponsored retirement plan where employee benefits are computed using a formula that considers several factors, such as length of employment and salary history |<br/> | ESCROW | A contractual arrangement in which a third party (the stakeholder or escrow agent) receives and disburses money or property for the primary transacting parties, with the disbursement dependent on conditions agreed to by the transacting parties |<br/> | ESOP | An employee stock ownership plan (ESOP) is an employee benefit plan that gives workers ownership interest in the company |<br/> | FIXEDANNUITY | A type of insurance contract that promises to pay the buyer a specific, guaranteed interest rate on their contributions to the account |<br/> | GUARDIAN | An account of a child in the parent's name, with legal title to the assets in the account, as well as all capital gains and tax liabilities produced from the account belonging to the parent |<br/> | HOMEEQUITYLOAN | A type of loan in which the borrower uses the equity of his or her home as collateral |<br/> | HOMELINEOFCREDIT | A loan in which the lender agrees to lend a maximum amount within an agreed period, where the collateral is the borrower's equity in their house |<br/> | INSTALLMENT | A type of agreement or contract involving a loan that is repaid over time with a set number of scheduled payments |<br/> | INSTITUTIONALTRUST | |<br/> | IRA | An individual retirement account (IRA) is a tax-advantaged account that individuals use to save and invest for retirement |<br/> | KEOGH | A tax-deferred pension plan available to self-employed individuals or unincorporated businesses for retirement purposes |<br/> | LINEOFCREDIT | A credit facility extended by a bank or other financial institution to a government, business or individual customer that enables the customer to draw on the facility when the customer needs funds |<br/> | LOAN | The lending of money by one or more individuals, organizations, or other entities to other individuals, organizations etc |<br/> | LONGTERMDISABILITY | Insurance that replaces a portion of the policyholder's income due to a disability for an extended period of time, usually more than a year |<br/> | MILITARYLOAN | |<br/> | MONEYMARKET | A deposit account that pays interest based on current interest rates in the money markets |<br/> | MORTGAGE | A type of loan you can use to buy or refinance a home |<br/> | NONQUALIFEDPLAN | A type of tax-deferred employer-sponsored retirement plan that falls outside of ERISA guidelines |<br/> | OTHERDEPOSIT | Use when none of the listed enums apply |<br/> | OTHERINVESTMENT | Use when none of the listed enums apply |<br/> | PERSONALLOAN | A type of debt that is not protected by a guarantor, or collateralized by a lien on specific assets of the borrower |<br/> | ROLLOVER | |<br/> | ROTH | An individual retirement account that offers tax-free growth and tax-free withdrawals in retirement |<br/> | SARSEP | A simplified employee pension (SEP) plan set up before 1997 that includes a salary reduction arrangement |<br/> | SAVINGS | An interest-bearing deposit account held at a bank or other financial institution |<br/> | SMBLOAN | |<br/> | SHORTTERMDISABILITY | Insurance that replaces a portion of the policyholder's income due to a disability for a short period of time, usually less than a year |<br/> | STUDENTLOAN | A type of loan designed to help students pay for post-secondary education and the associated fees, such as tuition, books and supplies, and living expenses |<br/> | TAXABLE | |<br/> | TDA | |<br/> | TERM | Life insurance that provides coverage at a fixed rate of payments for a limited period of time |<br/> | TRUST | A type of financial account that is opened by an individual and managed by a designated trustee for the benefit of a third party in accordance with agreed-upon terms |<br/> | UGMA | |<br/> | UNIVERSALLIFE | A type of a cash value life insurance where the excess of premium payments above the current cost of insurance is credited to the cash value of the policy, which in turn is credited each month with interest |<br/> | UTMA | |<br/> | VARIABLEANNUITY | A type of insurance contract that promises to pay back the buyer based on the performance of an underlying portfolio of mutual funds selected by the buyer |<br/> | WHOLELIFE | Life insurance which is guaranteed to remain in force for the insured's entire lifetime, provided required premiums are paid, or to the maturity date |
 */
public enum FiAttrEntityEnum {
  
   AccountDescriptor("AccountDescriptor"),
   
   Holding("Holding"),
	
	RewardBalance("RewardBalance"),
	
	RewardCategory("RewardCategory"),
	
	RewardProgram("RewardProgram");
	

	private String value;

	FiAttrEntityEnum(String value) {
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
  public static FiAttrEntityEnum fromValue(String value) {
    for (FiAttrEntityEnum b : FiAttrEntityEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'",401));
  }
}

