package com.fdx.api.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fdx.api.model51.model.Account51;
import com.fdx.api.model51.model.AccountPaymentNetworkList51;
import com.fdx.api.model51.model.AccountWithDetails51;
import com.fdx.api.model51.model.Accounts51;
import com.fdx.api.model51.model.Statement51;
import com.fdx.api.model51.model.Statements51;
import com.fdx.api.model51.model.Transaction51;
import com.fdx.api.model51.model.Transactions51;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.util.ResourceUtils;
import org.springframework.web.context.request.NativeWebRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.LocalDate;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Junit Test for AccountsApiController Class
 */
@SpringBootTest
@AutoConfigureMockMvc
class AccountsApiControllerTest<T> {

  @Autowired
  private AccountsApiController accountsApiController;

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private Accounts51<T> accountsDao;

  @MockBean
  private AccountWithDetails51<T> accountWithDetailsDao;

  @MockBean
  private Account51<T> accountDao;

  @MockBean
  private Transactions51<T> transactionsDao;

  @MockBean
  private Transaction51<T> transactionDao;

  @MockBean
  private Statements51<T> statementsDao;

  @MockBean
  private Statement51<T> statementDao;

  @MockBean
  private AccountPaymentNetworkList51<T> accountPaymentNetworkList51;

  private String searchForAccountsJson, getAccountJson, getAccountContactJson
      , searchForAccountTransactionsJson,
      getAccountTransactionImages, searchForAccountStatementsJson,
      getAccountPaymentNetworksJson;

  /**
   * Executes Before each method
   */
  @BeforeEach
  void setUp() throws IOException {
    File searchForAccountsFile = ResourceUtils.getFile("classpath" +
        ":accountsapicontroller/searchforaccounts.json");
    searchForAccountsJson =
        new String(Files.readAllBytes(searchForAccountsFile.toPath()));

    File getAccountFile = ResourceUtils.getFile("classpath" +
        ":accountsapicontroller/getaccount.json");
    getAccountJson = new String(Files.readAllBytes(getAccountFile.toPath()));

    File getAccountContactFile = ResourceUtils.getFile("classpath" +
        ":accountsapicontroller/getaccountcontact.json");
    getAccountContactJson =
        new String(Files.readAllBytes(getAccountContactFile.toPath()));

    File searchForAccountTransactionsFile = ResourceUtils.getFile("classpath" +
        ":accountsapicontroller/searchforaccounttransactions.json");
    searchForAccountTransactionsJson =
        new String(Files.readAllBytes(searchForAccountTransactionsFile.toPath()));

    String getAccountTransactionImagesPath = "src/test/resources" +
        "/accountsapicontroller/images/35.png";
    File getAccountTransactionImagesFile =
        new File(getAccountTransactionImagesPath);
    getAccountTransactionImages =
        "file:\\" + getAccountTransactionImagesFile.getAbsolutePath();

    File searchForAccountStatementsFile = ResourceUtils.getFile("classpath" +
        ":accountsapicontroller/searchforaccountstatements.json");
    searchForAccountStatementsJson =
        new String(Files.readAllBytes(searchForAccountStatementsFile.toPath()));

    File getAccountPaymentNetworksFile = ResourceUtils.getFile("classpath" +
        ":accountsapicontroller/getaccountpaymentnetworks.json");
    getAccountPaymentNetworksJson =
        new String(Files.readAllBytes(getAccountPaymentNetworksFile.toPath()));
  }

  /**
   * Test for request is not null
   */
  @Test
  void testGetRequest() {
    Optional<NativeWebRequest> request = accountsApiController.getRequest();
    assertNotNull(request);
  }

  /**
   * Test for GET /accounts api, SearchForAccounts's status must be 200
   */
  @Test
  void testSearchForAccounts() throws Exception {
    when(accountsDao.getAccounts(Mockito.anyList(), Mockito.anyInt(),
        Mockito.anyString(), Mockito.anyString(),
        Mockito.anyString(), Mockito.any(LocalDate.class),
        Mockito.any(LocalDate.class), Mockito.anyString(),
        Mockito.anyBoolean())).thenReturn((T) searchForAccountsJson);

    mockMvc.perform(get("/accounts").contentType(MediaType.APPLICATION_JSON)
            .header("Api-version", "5.1")
            .param("accountIds", "002")
            .param("accountIds", "123-te-01")
            .param("accountIds", "211")
            .param("accountIds", "211A")
            .param("startTime", "0001-01-01")
            .param("endTime", "9999-12-31")
            .param("resultType", "lightweight")
            .param("offset", (String) null)
            .requestAttr("httpServletRequest", HttpServletRequest.class)
            .characterEncoding("UTF-8")
            .servletPath("/accounts")
            .param("limit", "10")
            .param("query", "null")
            .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk());
  }

  /**
   * Test for GET /accounts/{accountId} api, GetAccount's status must be 200
   */
  @Test
  void testGetAccount() throws Exception {
    String accountId = "002";
    when(accountWithDetailsDao.getAccount(Mockito.anyString())).thenReturn((T) getAccountJson);

    mockMvc.perform(get("/accounts/{accountId}", accountId).contentType(MediaType.APPLICATION_JSON)
            .header("Api-version", "5.1")
            .param("accountId", accountId)
            .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk());
  }

  /**
   * Test for GET /accounts/{accountId}/contact api, GetAccountContact's
   * status must be 200
   */
  @Test
  void testGetAccountContact() throws Exception {
    String accountId = "002";
    when(accountDao.getAccountContact(accountId)).thenReturn((T) getAccountContactJson);

    mockMvc.perform(get("/accounts/{accountId}/contact", accountId).contentType(MediaType.APPLICATION_JSON)
            .header("Api-version", "5.1")
            .param("accountId", accountId)
            .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk());
  }

  /**
   * Test for GET /accounts/{accountId}/transactions api,
   * SearchForAccountTransactions's status must be 200
   */
  @Test
  void testSearchForAccountTransactions() throws Exception {
    String accountId = "002";
    when(transactionsDao.getTransactions(Mockito.anyString(),
        Mockito.any(LocalDate.class), Mockito.any(LocalDate.class),
        Mockito.anyInt(), Mockito.anyString(), Mockito.anyString(),
        Mockito.anyString()))
        .thenReturn(searchForAccountTransactionsJson);

    mockMvc.perform(get("/accounts/{accountId}/transactions", accountId).contentType(MediaType.APPLICATION_JSON)
            .header("Api-version", "5.1")
            .param("accountId", accountId)
            .param("startTime", "0001-01-01")
            .param("endTime", "9999-12-31")
            .param("offset", (String) null)
            .requestAttr("httpServletRequest", HttpServletRequest.class)
            .param("limit", "10")
            .servletPath("/accounts/002/transactions")
            .param("query", "null")
            .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk());
  }

  /**
   * Test for GET /accounts/{accountId}/transaction-images/{imageId} api,
   * GetAccountTransactionImages's status must be 200
   */
  @Test
  @Disabled("")
  void testGetAccountTransactionImages() throws Exception {
    String accountId = "002";
    String imageId = "35";
    when(transactionDao.getTransactionImage(Mockito.anyString(),
        Mockito.anyString()))
        .thenReturn((T) getAccountTransactionImages);

    mockMvc.perform(get("/accounts/{accountId}/transaction-images/{imageId}",
            accountId, imageId)
            .contentType(MediaType.ALL_VALUE)
            .header("Api-version", "5.1")
            .param("accountId", accountId)
            .param("imageId", imageId)
            .accept(MediaType.ALL_VALUE))
        .andExpect(status().isOk());
  }

  /**
   * Test for GET /accounts/{accountId}/transaction-images/{imageId} api,
   * GetAccountTransactionImagesWithNullVersion's status must be 501
   */
  @Test
  void testGetAccountTransactionImagesWithNullVersion() throws Exception {
    String accountId = "002";
    String imageId = "35";

    mockMvc.perform(get("/accounts/{accountId}/transaction-images/{imageId}",
            accountId, imageId)
            .contentType(MediaType.ALL_VALUE)
            .header("Api-version", "null")
            .param("accountId", accountId)
            .param("imageId", imageId)
            .accept(MediaType.ALL_VALUE))
        .andExpect(status().isNotImplemented());
  }

  /**
   * Test for GET /accounts/{accountId}/statements api,
   * SearchForAccountStatements's status must be 200
   */
  @Test
  void testSearchForAccountStatements() throws Exception {
    String accountId = "211";
    when(statementsDao.getStatementsList(Mockito.anyString(),
        Mockito.any(LocalDate.class), Mockito.any(LocalDate.class),
        Mockito.anyInt(), Mockito.anyString(), Mockito.anyString(),
        Mockito.anyString()))
        .thenReturn((T) searchForAccountStatementsJson);

    mockMvc.perform(get("/accounts/{accountId}/statements", accountId).contentType(MediaType.APPLICATION_JSON)
            .header("Api-version", "5.1")
            .param("accountId", accountId)
            .param("startTime", "0001-01-01")
            .param("endTime", "9999-12-31")
            .param("offset", (String) null)
            .requestAttr("httpServletRequest", HttpServletRequest.class)
            .param("limit", "10")
            .servletPath("/accounts/211/statements")
            .param("query", "null")
            .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk());
  }

  /**
   * Test for GET /accounts/{accountId}/statements api,
   * SearchForAccountStatementsWithNullVersion's status must be 501
   */
  @Test
  void testSearchForAccountStatementsWithNullVersion() throws Exception {
    String accountId = "211";

    mockMvc.perform(get("/accounts/{accountId}/statements", accountId).contentType(MediaType.APPLICATION_JSON)
            .header("Api-version", "null")
            .param("accountId", accountId)
            .param("startTime", "0001-01-01")
            .param("endTime", "9999-12-31")
            .param("offset", (String) null)
            .requestAttr("httpServletRequest", HttpServletRequest.class)
            .param("limit", "10")
            .servletPath("/accounts/211/statements")
            .param("query", "null")
            .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isNotImplemented());
  }

  /**
   * Test for GET /accounts/{accountId}/statements/{statementId} api,
   * GetAccountStatement's status must be 200
   */
  @Test
  @Disabled("")
  void testGetAccountStatement() throws Exception {
    String accountId = "211";
    String statementId = "50";

    when(statementDao.getStatementById(Mockito.anyString(),
        Mockito.anyString())).thenReturn(getAccountTransactionImages);

    mockMvc.perform(get("/accounts/{accountId}/statements/{statementId}",
            accountId, statementId)
            .contentType(MediaType.APPLICATION_JSON)
            .header("Api-version", "5.1")
            .param("accountId", accountId)
            .param("statementId", statementId)
            .accept(MediaType.APPLICATION_PDF, MediaType.IMAGE_PNG,
                MediaType.IMAGE_JPEG, MediaType.IMAGE_GIF))
        .andExpect(status().isOk());
  }

  /**
   * Test for GET /accounts/{accountId}/statements/{statementId} api,
   * GetAccountStatementWithNullVersion's status must be 501
   */
  @Test
  void testGetAccountStatementWithNullVersion() throws Exception {
    String accountId = "211";
    String statementId = "50";

    mockMvc.perform(get("/accounts/{accountId}/statements/{statementId}",
            accountId, statementId)
            .contentType(MediaType.APPLICATION_JSON)
            .header("Api-version", "null")
            .param("accountId", accountId)
            .param("statementId", statementId)
            .accept(MediaType.APPLICATION_PDF, MediaType.IMAGE_PNG,
                MediaType.IMAGE_JPEG, MediaType.IMAGE_GIF))
        .andExpect(status().isNotImplemented());
  }

  /**
   * Test for GET /accounts/{accountId}/statements/{statementId} api,
   * GetAccountStatementWithAcceptAllValue's status must be 400
   */
  @Test
  void testGetAccountStatementWithAcceptAllValue() throws Exception {
    String accountId = "211";
    String statementId = "50";

    mockMvc.perform(get("/accounts/{accountId}/statements/{statementId}",
            accountId, statementId)
            .contentType(MediaType.APPLICATION_JSON)
            .header("Api-version", "5.1")
            .param("accountId", accountId)
            .param("statementId", statementId)
            .accept(MediaType.ALL_VALUE))
        .andExpect(status().isBadRequest());
  }

  /**
   * Test for GET /accounts/{accountId}/statements/{statementId} api,
   * GetAccountStatementWithAcceptEqualsApplicationJson's status must be 406
   */
  @Test
  void testGetAccountStatementWithAcceptEqualsApplicationJson() throws Exception {
    String accountId = "211";
    String statementId = "50";

    mockMvc.perform(get("/accounts/{accountId}/statements/{statementId}",
            accountId, statementId)
            .contentType(MediaType.APPLICATION_JSON)
            .header("Api-version", "5.1")
            .param("accountId", accountId)
            .param("statementId", statementId)
            .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isNotAcceptable());
  }

  /**
   * Test for GET /accounts/{accountId}/payment-networks api,
   * GetAccountPaymentNetworks's status must be 200
   */
  @Test
  void testGetAccountPaymentNetworks() throws Exception {
    String accountId = "002";
    when(accountPaymentNetworkList51.getAccountPaymentNetwork(Mockito.anyString(), Mockito.anyInt(), Mockito.anyString(),
        Mockito.anyString(), Mockito.anyString().trim())).thenReturn((T) getAccountPaymentNetworksJson);

    mockMvc.perform(get("/accounts/{accountId}/payment-networks", accountId).contentType(MediaType.APPLICATION_JSON)
            .header("Api-version", "5.1")
            .param("accountId", accountId)
            .requestAttr("httpServletRequest", HttpServletRequest.class)
            .param("offset", (String) null)
            .param("limit", "10")
            .servletPath("/accounts/002/payment-networks")
            .param("query", "null")
            .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk());
  }

  /**
   * Test for GET /utilityService/chequeImage api, GetChequeImage's status
   * must be 200
   */
  @Test
  @Disabled("")
  void testGetChequeImage() throws Exception {
    File file = ResourceUtils.getFile("classpath:accountsapicontroller/images" +
        "/cheque.jpg");
    try (MockedStatic<ResourceUtils> resourceUtilsMockedStatic =
             Mockito.mockStatic(ResourceUtils.class)) {
      resourceUtilsMockedStatic.when(() -> ResourceUtils.getFile(anyString())).thenReturn(file);

      String accountId = "251";
      String statementId = "st01";

      mockMvc.perform(get("/utilityService/chequeImage").contentType(MediaType.APPLICATION_JSON)
              .header("Api-version", "5.1")
              .param("accountId", accountId)
              .param("statementId", statementId)
              .accept(MediaType.APPLICATION_JSON))
          .andExpect(status().isOk());
    }
  }

  /**
   * Test for GET /utilityService/chequeImage api,
   * GetChequeImageWithException's status must be 500
   */
  @Test
  void testGetChequeImageWithException() throws Exception {
    String accountId = "251";
    String statementId = "st01";

    mockMvc.perform(get("/utilityService/chequeImage").contentType(MediaType.APPLICATION_JSON)
            .header("Api-version", "5.1")
            .param("accountId", accountId)
            .param("statementId", statementId)
            .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().is5xxServerError());
  }

  /**
   * Test for GetSerializedObject method, serializedObject should not be null
   */
  @Test
  void testGetSerializedObject() throws JsonProcessingException {
    String serializedObject = accountsApiController.getSerializedObject(null);
    assertNotNull(serializedObject);
    assertEquals("null", serializedObject);
  }

  /**
   * Test for GET /endpoints api, GetEndpoints's status must be 200
   */
  @Test
  void testGetEndpoints() throws Exception {
    mockMvc.perform(get("/endpoints").contentType(MediaType.APPLICATION_JSON)
            .header("Api-version", "5.1")
            .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk());
  }
}