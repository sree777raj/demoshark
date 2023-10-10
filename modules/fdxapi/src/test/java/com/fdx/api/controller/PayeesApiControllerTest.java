package com.fdx.api.controller;

import com.fdx.api.model51.model.Idempotency51;
import com.fdx.api.model51.model.Payee51;
import com.fdx.api.model51.model.PayeeForUpdate51;
import com.fdx.api.model51.model.Payees51;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
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
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.patch;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Junit Test for PayeesApiController Class
 */
@SpringBootTest
@AutoConfigureMockMvc
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class PayeesApiControllerTest<T> {

  @Autowired
  private PayeesApiController payeesApiController;

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private Payees51<T> payeesDao;

  @MockBean
  private Payee51<T> payeeDao;

  @MockBean
  private PayeeForUpdate51<T> payeeForUpdateDao;

  @MockBean
  Idempotency51<?> idempotency51;

  private String searchForPayeesJson, getPayeeJson, updatePayeeInputJson,
      updatePayeeOutputJson,
      deletePayeeJson, createPayeeInputJson, createPayeeOutputJson;

  /**
   * Executes Before each method
   */
  @BeforeEach
  void setUp() throws IOException {
    File searchForPayeesFile = ResourceUtils.getFile("classpath" +
        ":payeesapicontroller/searchforpayees.json");
    searchForPayeesJson =
        new String(Files.readAllBytes(searchForPayeesFile.toPath()));

    File getPayeeFile = ResourceUtils.getFile("classpath:payeesapicontroller" +
        "/getpayee.json");
    getPayeeJson = new String(Files.readAllBytes(getPayeeFile.toPath()));

    File updatePayeeInputFile = ResourceUtils.getFile("classpath" +
        ":payeesapicontroller/updatepayeeinput.json");
    updatePayeeInputJson =
        new String(Files.readAllBytes(updatePayeeInputFile.toPath()));

    File updatePayeeOutputFile = ResourceUtils.getFile("classpath" +
        ":payeesapicontroller/updatepayeeoutput.json");
    updatePayeeOutputJson =
        new String(Files.readAllBytes(updatePayeeOutputFile.toPath()));

    File deletePayeeFile = ResourceUtils.getFile("classpath" +
        ":payeesapicontroller/deletepayeeoutput.json");
    deletePayeeJson = new String(Files.readAllBytes(deletePayeeFile.toPath()));

    File createPayeeInputFile = ResourceUtils.getFile("classpath" +
        ":payeesapicontroller/createpayeeinput.json");
    createPayeeInputJson =
        new String(Files.readAllBytes(createPayeeInputFile.toPath()));

    File createPayeeOutputFile = ResourceUtils.getFile("classpath" +
        ":payeesapicontroller/createpayeeoutput.json");
    createPayeeOutputJson =
        new String(Files.readAllBytes(createPayeeOutputFile.toPath()));
  }

  /**
   * Test for request is not null
   */
  @Test
  @Order(1)
  void testGetRequest() {
    Optional<NativeWebRequest> request = payeesApiController.getRequest();
    assertNotNull(request);
  }

  /**
   * Test for GET /payees api, SearchForPayees's status must be 200
   */
  @Test
  @Order(2)
  void testSearchForPayees() throws Exception {
    when(payeesDao.getPayeesList(Mockito.anyString(), Mockito.anyString(),
        Mockito.anyInt(), Mockito.anyString(),
        Mockito.anyString())).thenReturn((T) searchForPayeesJson);

    mockMvc.perform(get("/payees").contentType(MediaType.APPLICATION_JSON)
            .header("Api-version", "5.1")
            .param("updatedSince", "PAYEE-1")
            .requestAttr("httpServletRequest", HttpServletRequest.class)
            .param("offset", (String) null)
            .param("limit", "10")
            .servletPath("/payees")
            .param("query", "null")
            .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk());
  }

  /**
   * Test for POST /payees api, CreatePayee's status must be 201
   */
  @Test
  @Order(3)
  void testCreatePayee() throws Exception {
    Mockito.when(idempotency51.ifExists(Mockito.anyString(),Mockito.anyString())).thenReturn(false);
    Mockito.when(payeeForUpdateDao.postPayee(Mockito.any(Object.class))).thenReturn((T) createPayeeOutputJson);

    mockMvc.perform(post("/payees").contentType(MediaType.APPLICATION_JSON)
            .header("Api-version", "5.1")
            .content(createPayeeInputJson)
            .param("idempotencyKey", "createpayeetest114")
            .requestAttr("httpServletRequest", HttpServletRequest.class)
            .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isCreated());
  }

  /**
   * Test for GET /payees/{payeeId} api, GetPayee's status must be 200
   */
  @Test
  @Order(4)
  void testGetPayee() throws Exception {
    String payeeId = "PAYEE-1";
    when(payeeDao.getPayeeById(Mockito.anyString())).thenReturn((T) getPayeeJson);

    mockMvc.perform(get("/payees/{payeeId}", payeeId).contentType(MediaType.APPLICATION_JSON)
            .header("Api-version", "5.1")
            .param("payeeId", payeeId)
            .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk());
  }

  /**
   * Test for PATCH /payees/{payeeId} api, UpdatePayee's status must be 200
   */
  @Test
  @Order(5)
  void testUpdatePayee() throws Exception {
    String payeeId = "PAYEE-1";
    Mockito.when(idempotency51.ifExists(Mockito.anyString(),Mockito.anyString())).thenReturn(false);
    Mockito.when(payeeForUpdateDao.updatePayee(Mockito.anyString(),
            Mockito.any(Object.class)))
        .thenReturn((T) updatePayeeOutputJson);

    mockMvc.perform(patch("/payees/{payeeId}", payeeId).contentType(MediaType.APPLICATION_JSON)
            .header("Api-version", "5.1")
            .content(updatePayeeInputJson)
            .param("payeeId", payeeId)
            .param("idempotencyKey", "TestPatchpayee900")
            .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk());
  }

  /**
   * Test for DELETE /payees/{payeeId} api, DeletePayee's status must be 200
   */
  @Test
  @Order(6)
  void testDeletePayee() throws Exception {
    String payeeId = "PAYEE-4";
    Mockito.when(payeeDao.deletePayee(payeeId)).thenReturn((T) deletePayeeJson);

    mockMvc.perform(delete("/payees/{payeeId}", payeeId).contentType(MediaType.APPLICATION_JSON)
            .header("Api-version", "5.1")
            .param("payeeId", payeeId)
            .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk());
  }
}