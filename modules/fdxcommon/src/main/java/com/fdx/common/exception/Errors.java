package com.fdx.common.exception;

public class Errors {

  private Errors() {
    throw new IllegalStateException("Common Errors");
  }
  public static final String BILLS_NOT_FOUND = "Bills not found";
  public static final String CAPABILITY_NOT_FOUND = "Capability not found";
  public static final String CODE_AMOUNT_NOT_FOUND = "Code Amount not found";
  public static final String HATEOAS_LINK_NOT_FOUND = "Hateoas Link not found";
  public static final String HEALTH_INSURANCE_COVERAGE_NOT_FOUND = "Health Insurance Coverage not found";
  public static final String INVESTMENT_LOAN_NOT_FOUND = "Investment Loan not found";
  public static final String MUTUAL_FUND_SECURITY_NOT_FOUND = "Mutual Fund Security not found";
  public static final String OFFER_OF_HEALTH_INSURANCE_COVERAGE_NOT_FOUND = "Offer Of Health Insurance Coverage not found";
  public static final String PLANNED_AVAILABILITY_NOT_FOUND = "Planned Availability not found";
  public static final String TAX_REFUND_DIRECT_DEPOSIT_NOT_FOUND = "Tax Refund Direct Deposit not found";
  public static final String TELEPHONE_NUMBER_NOT_FOUND = "Telephone Number not found";
  public static final String TRANSACTION_REWARD_NOT_FOUND = "Transaction Reward not found";
  public static final String VESTING_NOT_FOUND = "Vesting not found";
}
