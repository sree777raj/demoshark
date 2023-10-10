package com.fdx.api.adapter.service;

import com.fdx.api.entities.moneymovement.PaymentStatus;
import org.springframework.http.ResponseEntity;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;

public interface ServiceAdapterApi<T> {

  T searchForAccounts(List<String> accountIds, int limit, String offset,
                      String resultType, String uriPath,
                      String startTime, String endTime, String query) throws Exception;

  T getAccount(String accountId) throws Exception;

  T getAccountContact(String accountId) throws Exception;

  T searchForAccountTransactions(String accountId, String startTime,
                                 String endTime, Integer limit, String offset,
                                 String uriPath, String query) throws Exception;

  T getAccountTransactionImages(String accountId, String imageId) throws Exception;

  T searchForAccountStatements(String accountId, String startTime,
                               String endTime, Integer limit, String offset,
                               String uriPath, String query) throws Exception;

  T getAccountStatement(String accountId, String statementId) throws Exception;

  T getErrorObject(String errorCode, String message) throws Exception;

  T getAvailability() throws Exception;

  T getCapability() throws Exception;

  T getCustomers(int limit, String offset, String uriPath, String query) throws Exception;

  T getCustomerById(String customerId) throws Exception;

  T getRewardProgramCategories(String rewardProgramId, int limit,
                               String offset, String uriPath) throws Exception;

  T getRewardProgram(String rewardProgramId) throws Exception;

  T getRewardPrograms(String uriPath) throws Exception;

  T getTaxForms(List<Integer> taxYears, List<String> taxForms,
                List<String> contentTypes, String uriPath,
                String resultType, String query) throws Exception;

  T getTaxFormByID(String taxFormId, String version, Object accept) throws Exception;

  T getPayees(String updatedSince, String offset, int limit, String uriPath,
              String query) throws Exception;

  T getPayeeById(String payeeId, String version) throws Exception;

  T updatePayee(String payeeId, Object payeeForUpdate, String version,
                String idempotencyKey) throws Exception;

  T deletePayee(String payeeId, String version) throws Exception;

  T getPayments(String updatedSince, String offset, Integer limit,
                String uriPath, String query) throws Exception;

  T getPaymentById(String paymentId, String version) throws Exception;

  T cancelPayment(String paymentId, String version) throws Exception;

  T updatePayment(String paymentId, Object paymentForUpdate, String version,
                  String idempotencyKey) throws Exception;

  T getRecurringPayments(String updatedSince, String offset, Integer limit,
                         String uriPath, String query) throws Exception;

  T getRecurringPaymentById(String recurringPaymentId, String version) throws Exception;

  T cancelRecurringPayment(String recurringPaymentId, String version) throws Exception;

  T updateRecurringPayment(String recurringPaymentId,
                           Object recurringPaymentForUpdate, String version,
                           String idempotencyKey) throws Exception;

  T postPayee(Object payeeForUpdate, String idempotencyKey) throws Exception;

  T postPayment(Object paymentForUpdate, String idempotencyKey) throws Exception;

  T postRecurringPayment(Object recurringPaymentForUpdate,
                         String idempotencyKey) throws Exception;

  T getPaymentsByRecurringPaymentId(String recurringPaymentId,
                                    String updatedSince, String offset,
                                    Integer limit, String uriPath,
                                    String query) throws Exception;

  T postTransfer(Object transfer, String idempotencyKey) throws Exception;

  T getTransferStatus(String transferId) throws Exception;

  T getAccountPaymentNetworks(String accountId, Integer limit, String offset,
                              String uriPath, String query) throws Exception;

  T getCurrentCustomerInfo() throws Exception;

  /**
   * Creates a Recipient Record.
   *
   * @param recipientRequest  data used for creation
   * @return created recipient data as json
   */
  ResponseEntity<String> postRecipient(Object recipientRequest);

  /**
   * Returns recipient data identified with clientId.
   *
   * @param clientId  used for search
   * @return recipient data as json
   */
  ResponseEntity<String> getRecipient(@Size(max = 256) String clientId);

  /**
   * Updates a Recipient Record.
   *
   * @param recipientRequest data to be updated
   * @param clientId  used for search
   * @return updated recipient data as json
   */
  ResponseEntity<String> updateRecipient(Object recipientRequest, @Size(max =
      256) String clientId);

  /**
   * Delete data for a specific recipient identified with clientId.
   *
   * @param clientId  used for search
   * @return No Content (status code 204) if deleted else return error.
   */
  ResponseEntity<String> deleteRecipient(@Size(max = 256) String clientId);

  /**
   * Returns consent grant data identified with consentId.
   *
   * @param consentId  used for search
   * @return consent grant data as json
   */
  ResponseEntity<String> getConsentGrant(@Size(max = 256) String consentId);

  /**
   * Revoke a Consent Grant.
   *
   * @param consentRevocationRequest details of request to revoke consent grant
   * @param consentId used for search
   * @return No Content (status code 204) if revoke success else error
   */
  ResponseEntity<String> revokeConsentGrant(Object consentRevocationRequest,
                                            @Size(max = 256) String consentId);

  /**
   * Retrieve Consent Revocation record.
   *
   * @param consentId Consent Grant ID (required)
   * @return ConsentRevocation Ok (status code 200)
   */
  ResponseEntity<String> getConsentRevocation(@Size(max = 256) String consentId);

  /**
   * Post Consent Grant record.
   *
   * @param consentGrantRequest Consent Grant (required)
   * @return ConsentGrant Created (status code 201)
   */
  ResponseEntity<String> postConsentGrant(Object consentGrantRequest);

  /**
   * Get Consent Grant Id.
   *
   * @param registeredClientId value
   * @param principalName value
   * @return consentId Ok (status code 200)
   */
  ResponseEntity<String> getConsentGrantId(String registeredClientId, String principalName);

  /**
   * Publish a notification.
   *
   * @param notification object
   * @return notification object
   */
  ResponseEntity<String> publishNotification(Object notification);

  /**
   * Creates notification subscription entry on the server
   *
   * @param notificationSubscription (optional)
   * @return notificationSubscription created (status code 201)
   */
  ResponseEntity<String> createNotificationSubscription(Object notificationSubscription);

  /**
   * GET /notification-subscriptions/{subscriptionId} : Get a notification subscription
   *
   * @param subscriptionId ID of notification subscription (required)
   * @return OK (status code 200)
   */
  ResponseEntity<String> getNotificationSubscription(@Size(max = 256) String subscriptionId);

  /**
   * DELETE /notification-subscriptions/{subscriptionId} : Delete a notification subscription
   * Delete a notification subscription
   *
   * @param subscriptionId ID of notification subscription (required)
   * @return No Content (status code 204)
   */
  ResponseEntity<String> deleteNotificationSubscription(@Size(max = 256) String subscriptionId);

  /**
   * POST /fraud/suspected-incident : Notify Data Provider of fraud
   * Notify Data Provider of suspected fraud
   *
   * @param suspectedFraudIncidentRequest (optional)
   * @return OK (status code 200)
   */
  ResponseEntity<String> reportSuspectedFraudIncident(Object suspectedFraudIncidentRequest);

  /**
   * Returns registry recipient data identified with recipientId.
   *
   * @param recipientId  used for search
   * @return registry recipient data as json
   */
  ResponseEntity<String> getRegistryRecipient(@Size(max = 256) String recipientId);

  /**
   * GET /recipients : Get Registry Recipients
   *
   * @param offset value
   * @param limit value
   * @return recipients OK (status code 200)
   */
  ResponseEntity<String> getRegistryRecipients(Integer offset, Integer limit);

  /**
   * GET /transfers/{transferId} : Get a transfer
   * Get a transfer been accounts
   *
   * @param transferId Transfer identifier (required)
   * @return Ok (status code 200)
   */
  ResponseEntity<String> getTransfer(String transferId);

  /**
   * DELETE /transfers/{transferId} : Cancel transfer
   * Cancel a transfer between accounts
   *
   * @param transferId Transfer identifier (required)
   * @return Ok (status code 200)
   */
  ResponseEntity<String> cancelTransfer(String transferId);

  /**
   * GET /transfers : Search for transfers between accounts
   * Search for transfers
   *
   * @param updatedSince Return items that have been created or updated since the update id (optional)
   * @param searchStartTransferDate Start time for use in retrieval of transfers by transfer date (optional)
   * @param searchEndTransferDate End time for use in retrieval of transfers by transfer date (optional)
   * @param searchFromAccountIds Search for transfers by source account (optional)
   * @param searchToAccountIds Search for transfers by source account (optional)
   * @param searchStatuses Search for transfers by source account (optional)
   * @param searchTransferIds Search for transfers by id (optional)
   * @return Success (status code 200)
   *         or Start or end date value is not in the ISO 8601 format (status code 400)
   *         or Data not found for request parameters (status code 404)
   *         or Catch all exception where request was not processed due to an internal outage/issue. Consider other more specific errors before using this error (status code 500)
   *         or Error when FdxVersion in Header is not one of those implemented at backend (status code 501)
   *         or System is down for maintenance (status code 503)
   */
  ResponseEntity<String> searchForTransfers(@Valid String updatedSince, LocalDate searchStartTransferDate,
                                            LocalDate searchEndTransferDate, @Valid List<String> searchFromAccountIds,
                                            @Valid List<String> searchToAccountIds, @Valid List<PaymentStatus> searchStatuses,
                                            @Valid List<String> searchTransferIds);

  /**
   * GET /certification-metrics : Get certification performance metrics
   * Get certification performance metrics for this implementer's APIs
   *
   * @param operationId Specific operationId for which to get the metrics. Optional (optional)
   * @return Array of api's certification metrics (status code 200)
   */
  ResponseEntity<String> getCertificationMetrics(String operationId);
}