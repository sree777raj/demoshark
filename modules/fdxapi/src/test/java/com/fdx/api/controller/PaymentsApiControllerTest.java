package com.fdx.api.controller;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fdx.api.model51.model.Payment51;
import com.fdx.api.model51.model.Payments51;
import com.fdx.process51.PaymentProcess;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
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
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.patch;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Junit Test for PaymentsApiController Class
 */
@SpringBootTest
@AutoConfigureMockMvc
class PaymentsApiControllerTest<T> {

  @Autowired
  private PaymentsApiController paymentsApiController;

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private Payments51<T> paymentsDao;

  @MockBean
  private Payment51<T> paymentDao;

  @MockBean
  private PaymentProcess paymentProcess;

  private String searchForPaymentsJson, getPaymentJson,
      updatePaymentInputJson, updatePaymentOutputJson,
      cancelPaymentJson, schedulePaymentInputJson, schedulePaymentOutputJson;

  /**
   * Executes Before each method
   */
  @BeforeEach
  void setUp() throws IOException {
    File searchForPaymentsFile = ResourceUtils.getFile("classpath" +
        ":paymentsapicontroller/searchforpayments.json");
    searchForPaymentsJson =
        new String(Files.readAllBytes(searchForPaymentsFile.toPath()));

    File getPaymentFile = ResourceUtils.getFile("classpath" +
        ":paymentsapicontroller/getpayment.json");
    getPaymentJson = new String(Files.readAllBytes(getPaymentFile.toPath()));

    File updatePaymentInputFile = ResourceUtils.getFile("classpath" +
        ":paymentsapicontroller/updatepaymentinput.json");
    updatePaymentInputJson =
        new String(Files.readAllBytes(updatePaymentInputFile.toPath()));

    File updatePaymentOutputFile = ResourceUtils.getFile("classpath" +
        ":paymentsapicontroller/updatepaymentoutput.json");
    updatePaymentOutputJson =
        new String(Files.readAllBytes(updatePaymentOutputFile.toPath()));

    File cancelPaymentFile = ResourceUtils.getFile("classpath" +
        ":paymentsapicontroller/cancelpayment.json");
    cancelPaymentJson =
        new String(Files.readAllBytes(cancelPaymentFile.toPath()));

    File schedulePaymentInputFile = ResourceUtils.getFile("classpath" +
        ":paymentsapicontroller/schedulepaymentinput.json");
    schedulePaymentInputJson =
        new String(Files.readAllBytes(schedulePaymentInputFile.toPath()));

    File schedulePaymentOutputFile = ResourceUtils.getFile("classpath" +
        ":paymentsapicontroller/schedulepaymentoutput.json");
    schedulePaymentOutputJson =
        new String(Files.readAllBytes(schedulePaymentOutputFile.toPath()));
  }

  /**
   * Test for request is not null
   */
  @Test
  void testGetRequest() {
    Optional<NativeWebRequest> request = paymentsApiController.getRequest();
    assertNotNull(request);
  }

  /**
   * Test for GET /payments api, SearchForPayments's status must be 200 and
   * expected value is same actual value
   */
  @Test
  void testSearchForPayments() throws Exception {
    ObjectMapper mapper = new ObjectMapper();
    JsonFactory factory = mapper.getFactory();
    JsonParser jsonParser = factory.createParser(searchForPaymentsJson);
    JsonNode node = mapper.readTree(jsonParser);

    Mockito.when(paymentsDao.getPaymentsList(Mockito.anyString(),
        Mockito.anyString(), Mockito.anyInt(),
        Mockito.anyString(), Mockito.anyString())).thenReturn((T) node);

    mockMvc.perform(get("/payments").contentType(MediaType.APPLICATION_JSON)
            .header("Api-version", "5.1")
            .param("updatedSince", "PAYMENT-1")
            .requestAttr("httpServletRequest", HttpServletRequest.class)
            .param("offset", (String) null)
            .param("limit", "10")
            .servletPath("/payments")
            .param("query", "null")
            .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.payments[0].paymentId").value("PAYMENT-1"));
  }

  /**
   * Test for GET /payments/{paymentId} api, GetPayment's status must be 200
   * and expected value is same actual value
   */
  @Test
  void testGetPayment() throws Exception {
    String paymentId = "PAYMENT-1";

    ObjectMapper mapper = new ObjectMapper();
    JsonFactory factory = mapper.getFactory();
    JsonParser jsonParser = factory.createParser(getPaymentJson);
    JsonNode node = mapper.readTree(jsonParser);

    Mockito.when(paymentDao.getPaymentById(Mockito.anyString())).thenReturn((T) node);

    mockMvc.perform(get("/payments/{paymentId}", paymentId).contentType(MediaType.APPLICATION_JSON)
            .header("Api-version", "5.1")
            .param("paymentId", paymentId)
            .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.topayeeid").value("PAYEE-1"));
  }

  /**
   * Test for PATCH /payments/{paymentId} api, UpdatePayment's status must be
   * 200 and expected value is same actual value
   */
  @Test
  @Disabled("")
  void testUpdatePayment() throws Exception {
    String paymentId = "PAYMENT-1";

    ObjectMapper mapper = new ObjectMapper();
    JsonFactory factory = mapper.getFactory();
    JsonParser jsonParser = factory.createParser(updatePaymentOutputJson);
    JsonNode node = mapper.readTree(jsonParser);

    Mockito.when((T) paymentProcess.updatePayment(Mockito.anyString(),
        Mockito.any())).thenReturn((T) node);

    mockMvc.perform(patch("/payments/{paymentId}", paymentId).contentType(MediaType.APPLICATION_JSON)
            .header("Api-version", "5.1")
            .param("paymentId", paymentId)
            .param("idempotencyKey", "TestPatchpayee900")
            .content(updatePaymentInputJson)
            .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.topayeeid").value("PAYEE-2"));
  }

  /**
   * Test for DELETE /payments/{paymentId} api, CancelPayment's status must
   * be 200 and expected value is same actual value
   */
  @Test
  void testCancelPayment() throws Exception {
    String paymentId = "PAYMENT-6";

    ObjectMapper mapper = new ObjectMapper();
    JsonFactory factory = mapper.getFactory();
    JsonParser jsonParser = factory.createParser(cancelPaymentJson);
    JsonNode node = mapper.readTree(jsonParser);

    Mockito.when(paymentDao.deletePayment(Mockito.anyString())).thenReturn((T) node);

    mockMvc.perform(delete("/payments/{paymentId}", paymentId).contentType(MediaType.APPLICATION_JSON)
            .header("Api-version", "5.1")
            .param("paymentId", paymentId)
            .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.status").value("CANCELLED"));
  }

  /**
   * Test for POST /payments api, SchedulePayment's status must be 201 and
   * expected value is same actual value
   */
  @Test
  @Disabled("")
  void testSchedulePayment() throws Exception {
    ObjectMapper mapper = new ObjectMapper();
    JsonFactory factory = mapper.getFactory();
    JsonParser jsonParser = factory.createParser(schedulePaymentOutputJson);
    JsonNode node = mapper.readTree(jsonParser);

    Mockito.when(paymentProcess.postPayment(Mockito.any())).thenReturn((Payment51) node);

    mockMvc.perform(post("/payments").contentType(MediaType.APPLICATION_JSON)
            .header("Api-version", "5.1")
            .param("idempotencyKey", "createpayment6")
            .content(schedulePaymentInputJson)
            .requestAttr("httpServletRequest", HttpServletRequest.class)
            .param("paymentForUpdate", "")
            .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isCreated())
        .andExpect(jsonPath("$.paymentid").value("PAYMENT-9"));
  }
}