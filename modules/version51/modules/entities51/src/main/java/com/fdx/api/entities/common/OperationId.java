package com.fdx.api.entities.common;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fdx.common.exception.FDXException;

/**
 * The operationIds for all FDX APIs
 */
public enum OperationId {

  CANCELPAYMENT("cancelPayment"),

  CANCELRECURRINGPAYMENT("cancelRecurringPayment"),

  CANCELTRANSFER("cancelTransfer"),

  CREATENOTIFICATIONSUBSCRIPTION("createNotificationSubscription"),

  CREATEPAYEE("createPayee"),

  CREATERECIPIENT("createRecipient"),

  CREATETAXFORM("createTaxForm"),

  DELETENOTIFICATIONSUBSCRIPTION("deleteNotificationSubscription"),

  DELETEPAYEE("deletePayee"),

  DELETERECIPIENT("deleteRecipient"),

  GETACCOUNT("getAccount"),

  GETACCOUNTCONTACT("getAccountContact"),

  GETACCOUNTPAYMENTNETWORKS("getAccountPaymentNetworks"),

  GETACCOUNTSTATEMENT("getAccountStatement"),

  GETACCOUNTTRANSACTIONIMAGES("getAccountTransactionImages"),

  GETAVAILABILITY("getAvailability"),

  GETCAPABILITY("getCapability"),

  GETCERTIFICATIONMETRICS("getCertificationMetrics"),

  GETCONSENTGRANT("getConsentGrant"),

  GETCONSENTREVOCATION("getConsentRevocation"),

  GETCUSTOMER("getCustomer"),

  GETCUSTOMERINFO("getCustomerInfo"),

  GETCUSTOMERS("getCustomers"),

  GETNOTIFICATIONSUBSCRIPTION("getNotificationSubscription"),

  GETPAYEE("getPayee"),

  GETPAYMENT("getPayment"),

  GETPAYMENTSFORRECURRINGPAYMENT("getPaymentsForRecurringPayment"),

  GETRECIPIENT("getRecipient"),

  GETRECIPIENTS("getRecipients"),

  GETRECURRINGPAYMENT("getRecurringPayment"),

  GETREWARDPROGRAM("getRewardProgram"),

  GETREWARDPROGRAMCATEGORIES("getRewardProgramCategories"),

  GETTAXFORM("getTaxForm"),

  GETTRANSFER("getTransfer"),

  GETTRANSFERSTATUS("getTransferStatus"),

  PUBLISHNOTIFICATION("publishNotification"),

  REPORTSUSPECTEDFRAUDINCIDENT("reportSuspectedFraudIncident"),

  REQUESTACCOUNTTRANSFER("requestAccountTransfer"),

  REVOKECONSENTGRANT("revokeConsentGrant"),

  SCHEDULEPAYMENT("schedulePayment"),

  SCHEDULERECURRINGPAYMENT("scheduleRecurringPayment"),

  SEARCHFORACCOUNTSTATEMENTS("searchForAccountStatements"),

  SEARCHFORACCOUNTTRANSACTIONS("searchForAccountTransactions"),

  SEARCHFORACCOUNTS("searchForAccounts"),

  SEARCHFORPAYEES("searchForPayees"),

  SEARCHFORPAYMENTS("searchForPayments"),

  SEARCHFORRECURRINGPAYMENTS("searchForRecurringPayments"),

  SEARCHFORTAXFORMS("searchForTaxForms"),

  SEARCHFORTRANSFERS("searchForTransfers"),

  SEARCHREWARDPROGRAMS("searchRewardPrograms"),

  UPDATEPAYEE("updatePayee"),

  UPDATEPAYMENT("updatePayment"),

  UPDATERECIPIENT("updateRecipient"),

  UPDATERECURRINGPAYMENT("updateRecurringPayment"),

  UPDATETAXFORM("updateTaxForm");

  private String value;

  OperationId(String value) {
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
  public static OperationId fromValue(String value) {
    for (OperationId b : OperationId.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'", 401));
  }
}
