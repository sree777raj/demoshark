package com.fdx.api.controller;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fdx.api.model51.model.Payments51;
import com.fdx.api.model51.model.RecurringPayment51;
import com.fdx.api.model51.model.RecurringPayments51;
import com.fdx.process51.RecurringPaymentProcess;
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
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Junit Test for RecurringPaymentsApiController Class
 */
@SpringBootTest
@AutoConfigureMockMvc
class RecurringPaymentsApiControllerTest<T> {

  @Autowired
  private RecurringPaymentsApiController recurringPaymentsApiController;

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private RecurringPayments51<T> recurringPayementsDao;

  @MockBean
  private RecurringPayment51<T> recurringPaymentDao51;

  @MockBean
  private Payments51<T> paymentsDao;

  @MockBean
  private RecurringPaymentProcess recurringPaymentProcess;

  private String searchForRecurringPaymentsJson, getRecurringPaymentJson,
      updateRecurringPaymentInputJson, updateRecurringPaymentOutputJson,
      cancelRecurringPaymentJson, scheduleRecurringPaymentInputJson,
      scheduleRecurringPaymentOutputJson, getRecurringPaymentByPaymentIdJson;

  /**
   * Executes Before each method
   */
  @BeforeEach
  void setUp() throws IOException {
    File searchForRecurringPaymentsFile = ResourceUtils.getFile("classpath" +
        ":recurringpaymentsapicontroller/searchforrecurringpayments.json");
    searchForRecurringPaymentsJson =
        new String(Files.readAllBytes(searchForRecurringPaymentsFile.toPath()));

    File getRecurringPaymentFile = ResourceUtils.getFile("classpath" +
        ":recurringpaymentsapicontroller/getrecurringpayment.json");
    getRecurringPaymentJson =
        new String(Files.readAllBytes(getRecurringPaymentFile.toPath()));

    File updateRecurringPaymentInputFile = ResourceUtils.getFile("classpath" +
        ":recurringpaymentsapicontroller/updaterecurringpaymentinput.json");
    updateRecurringPaymentInputJson =
        new String(Files.readAllBytes(updateRecurringPaymentInputFile.toPath()));

    File updateRecurringPaymentOutputFile = ResourceUtils.getFile("classpath" +
        ":recurringpaymentsapicontroller/updaterecurringpaymentoutput.json");
    updateRecurringPaymentOutputJson =
        new String(Files.readAllBytes(updateRecurringPaymentOutputFile.toPath()));

    File cancelRecurringPaymentFile = ResourceUtils.getFile("classpath" +
        ":recurringpaymentsapicontroller/cancelrecurringpayment.json");
    cancelRecurringPaymentJson =
        new String(Files.readAllBytes(cancelRecurringPaymentFile.toPath()));

    File scheduleRecurringPaymentInputFile = ResourceUtils.getFile("classpath" +
        ":recurringpaymentsapicontroller/schedulerecurringpaymentinput.json");
    scheduleRecurringPaymentInputJson =
        new String(Files.readAllBytes(scheduleRecurringPaymentInputFile.toPath()));

    File scheduleRecurringPaymentOutputFile = ResourceUtils.getFile(
        "classpath:recurringpaymentsapicontroller" +
            "/schedulerecurringpaymentoutput.json");
    scheduleRecurringPaymentOutputJson =
        new String(Files.readAllBytes(scheduleRecurringPaymentOutputFile.toPath()));

    File getRecurringPaymentByPaymentIdFile = ResourceUtils.getFile(
        "classpath:recurringpaymentsapicontroller" +
            "/getrecurringpaymentbypaymentId.json");
    getRecurringPaymentByPaymentIdJson =
        new String(Files.readAllBytes(getRecurringPaymentByPaymentIdFile.toPath()));
  }

  /**
   * Test for request is not null
   */
  @Test
  void testGetRequest() {
    Optional<NativeWebRequest> request =
        recurringPaymentsApiController.getRequest();
    assertNotNull(request);
  }

  /**
   * Test for GET /recurring-payments api, SearchForRecurringPayments's
   * status must be 200
   */
  @Test
  void testSearchForRecurringPayments() throws Exception {
    ObjectMapper mapper = new ObjectMapper();
    JsonFactory factory = mapper.getFactory();
    JsonParser jsonParser =
        factory.createParser(searchForRecurringPaymentsJson);
    JsonNode node = mapper.readTree(jsonParser);

    Mockito.when(recurringPayementsDao.getRecurringPaymentsList(Mockito.anyString(), Mockito.anyString(), Mockito.anyInt(),
        Mockito.anyString(), Mockito.anyString())).thenReturn((T) node);

    mockMvc.perform(get("/recurring-payments").contentType(MediaType.APPLICATION_JSON)
            .header("Api-version", "5.1")
            .param("updatedSince", "RECURRINGPAYMENT-1")
            .requestAttr("httpServletRequest", HttpServletRequest.class)
            .param("offset", (String) null)
            .param("limit", "10")
            .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk());
  }

  /**
   * Test for GET /recurring-payments/{recurringPaymentId} api,
   * GetRecurringPayment's status must be 200
   */
  @Test
  void testGetRecurringPayment() throws Exception {
    String recurringPaymentId = "RECURRINGPAYMENT-2";
    ObjectMapper mapper = new ObjectMapper();
    JsonFactory factory = mapper.getFactory();
    JsonParser jsonParser = factory.createParser(getRecurringPaymentJson);
    JsonNode node = mapper.readTree(jsonParser);

    Mockito.when(recurringPaymentDao51.getRecurringPaymentById(Mockito.anyString())).thenReturn((T) node);

    mockMvc.perform(get("/recurring-payments/{recurringPaymentId}",
            recurringPaymentId).contentType(MediaType.APPLICATION_JSON)
            .header("Api-version", "5.1")
            .param("updatedSince", "RECURRINGPAYMENT-2")
            .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk());
  }

  /**
   * Test for PATCH /recurring-payments/{recurringPaymentId} api,
   * UpdateRecurringPayment's status must be 200
   */
  @Test
  @Disabled("")
  void testUpdateRecurringPayment() throws Exception {
    String recurringPaymentId = "RECURRINGPAYMENT-1";

    ObjectMapper mapper = new ObjectMapper();
    JsonFactory factory = mapper.getFactory();
    JsonParser jsonParser =
        factory.createParser(updateRecurringPaymentOutputJson);
    JsonNode node = mapper.readTree(jsonParser);

    Mockito.when(recurringPaymentProcess.updateRecurringPaymentById(Mockito.anyString(), Mockito.any()))
        .thenReturn((RecurringPayment51) node);

    mockMvc.perform(patch("/recurring-payments/{recurringPaymentId}",
            recurringPaymentId).contentType(MediaType.APPLICATION_JSON)
            .header("Api-version", "5.1")
            .param("recurringPaymentId", recurringPaymentId)
            .param("idempotencyKey", "patchpayment0022")
            .content(updateRecurringPaymentInputJson)
            .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk());
  }

  /**
   * Test for DELETE /recurring-payments/{recurringPaymentId} api,
   * CancelRecurringPayment's status must be 200
   */
  @Test
  @Disabled("")
  void testCancelRecurringPayment() throws Exception {
    String recurringPaymentId = "RECURRINGPAYMENT-1";

    ObjectMapper mapper = new ObjectMapper();
    JsonFactory factory = mapper.getFactory();
    JsonParser jsonParser = factory.createParser(cancelRecurringPaymentJson);
    JsonNode node = mapper.readTree(jsonParser);

    Mockito.when(recurringPaymentProcess.cancelRecurringPaymentById(Mockito.anyString()))
        .thenReturn((RecurringPayment51) node);

    mockMvc.perform(delete("/recurring-payments/{recurringPaymentId}",
            recurringPaymentId).contentType(MediaType.APPLICATION_JSON)
            .header("Api-version", "5.1")
            .param("recurringPaymentId", recurringPaymentId)
            .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk());
  }

  /**
   * Test for POST /recurring-payments api, ScheduleRecurringPayment's
   * status must be 201
   */
  @Test
  @Disabled("")
  void testScheduleRecurringPayment() throws Exception {
    ObjectMapper mapper = new ObjectMapper();
    JsonFactory factory = mapper.getFactory();
    JsonParser jsonParser =
        factory.createParser(scheduleRecurringPaymentOutputJson);
    JsonNode node = mapper.readTree(jsonParser);

    Mockito.when(recurringPaymentProcess.postRecurringPayment(Mockito.any())).thenReturn((RecurringPayment51) node);

    mockMvc.perform(post("/recurring-payments").contentType(MediaType.APPLICATION_JSON)
            .header("Api-version", "5.1")
            .param("idempotencyKey", "patchpayment0022")
            .requestAttr("httpServletRequest", HttpServletRequest.class)
            .content(scheduleRecurringPaymentInputJson)
            .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isCreated());
  }

  /**
   * Test for GET /recurring-payments/{recurringPaymentId}/payments api,
   * GetRecurringPaymentByPaymentId's status must be 200
   */
  @Test
  void testGetRecurringPaymentByPaymentId() throws Exception {
    String recurringPaymentId = "RECURRINGPAYMENT-2";

    ObjectMapper mapper = new ObjectMapper();
    JsonFactory factory = mapper.getFactory();
    JsonParser jsonParser =
        factory.createParser(getRecurringPaymentByPaymentIdJson);
    JsonNode node = mapper.readTree(jsonParser);

    Mockito.when(paymentsDao.getPaymentsByRecurringPaymentId(Mockito.anyString(), Mockito.anyString(), Mockito.anyString(),
        Mockito.anyInt(), Mockito.anyString(), Mockito.anyString())).thenReturn((T) node);

    mockMvc.perform(get("/recurring-payments/{recurringPaymentId}/payments",
            recurringPaymentId).contentType(MediaType.APPLICATION_JSON)
            .header("Api-version", "5.1")
            .param("recurringPaymentId", "RECURRINGPAYMENT-2")
            .param("updatedSince", "RECURRINGPAYMENT-2")
            .requestAttr("httpServletRequest", HttpServletRequest.class)
            .param("offset", (String) null)
            .param("limit", "10")
            .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk());
  }
}