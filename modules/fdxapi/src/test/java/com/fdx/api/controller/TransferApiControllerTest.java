package com.fdx.api.controller;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fdx.api.model51.model.Idempotency51;
import com.fdx.service.transfer.TransferService;
import org.junit.jupiter.api.BeforeEach;
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
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Junit Test for TransferApiController Class
 */
@SpringBootTest
@AutoConfigureMockMvc
class TransferApiControllerTest {

  @Autowired
  private TransferApiController transferApiController;

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private TransferService transferService;

  @MockBean
  private Idempotency51<?> idempotency51;

  private String getTransferStatusJson, requestAccountTransferInputJson,
      requestAccountTransferOutputJson, getTransferJson,
      searchForTransfersJson, cancelTransferJson;

  /**
   * Executes Before each method
   */
  @BeforeEach
  void setUp() throws IOException {
    File getTransferStatusFile = ResourceUtils.getFile("classpath" +
        ":transferapicontroller/gettransferstatus.json");
    getTransferStatusJson =
        new String(Files.readAllBytes(getTransferStatusFile.toPath()));

    File requestAccountTransferInputFile = ResourceUtils.getFile("classpath" +
        ":transferapicontroller/requestaccounttransferinput.json");
    requestAccountTransferInputJson =
        new String(Files.readAllBytes(requestAccountTransferInputFile.toPath()));

    File requestAccountTransferOutputFile = ResourceUtils.getFile("classpath" +
        ":transferapicontroller/requestaccounttransferoutput.json");
    requestAccountTransferOutputJson =
        new String(Files.readAllBytes(requestAccountTransferOutputFile.toPath()));

    File getTransferFile = ResourceUtils.getFile("classpath" +
        ":transferapicontroller/gettransfer.json");
    getTransferJson = new String(Files.readAllBytes(getTransferFile.toPath()));

    File searchForTransfersFile = ResourceUtils.getFile("classpath" +
        ":transferapicontroller/searchfortransfers.json");
    searchForTransfersJson =
        new String(Files.readAllBytes(searchForTransfersFile.toPath()));

    File cancelTransferFile = ResourceUtils.getFile("classpath" +
        ":transferapicontroller/canceltransfer.json");
    cancelTransferJson =
        new String(Files.readAllBytes(cancelTransferFile.toPath()));
  }

  /**
   * Test for request is not null
   */
  @Test
  void testGetRequest() {
    Optional<NativeWebRequest> request = transferApiController.getRequest();
    assertNotNull(request);
  }

  /**
   * Test for GET /transfers/{transferId}/status api, GetTransferStatus's
   * status must be 200
   */
  @Test
  void testGetTransferStatus() throws Exception {
    String transferId = "transferId1";
    ObjectMapper mapper = new ObjectMapper();
    JsonFactory factory = mapper.getFactory();
    JsonParser jsonParser = factory.createParser(getTransferStatusJson);
    JsonNode node = mapper.readTree(jsonParser);
    Mockito.when(transferService.getTransferStatusDetails(Mockito.anyString())).thenReturn(getTransferStatusJson);

    mockMvc.perform(get("/transfers/{transferId}/status", transferId).contentType(MediaType.APPLICATION_JSON)
            .header("Api-version", "5.1")
            .param("transferId", transferId)
            .requestAttr("httpServletRequest", HttpServletRequest.class)
            .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk());
  }

  /**
   * Test for GET /transfers/{transferId}/status api, GetTransferStatus's
   * status must be 501
   */
  @Test
  void testGetTransferStatusIf() throws Exception {
    String transferId = "transferId1";
    mockMvc.perform(get("/transfers/{transferId}/status", transferId).contentType(MediaType.APPLICATION_JSON)
            .header("Api-version", "null")
            .param("transferId", transferId)
            .requestAttr("httpServletRequest", HttpServletRequest.class)
            .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().is5xxServerError());
  }

  /**
   * Test for POST /transfers api, RequestAccountTransfer's status must be 200
   */
  @Test
  void testRequestAccountTransfer() throws Exception {
    Mockito.when(idempotency51.ifExists(Mockito.anyString(),
        Mockito.anyString())).thenReturn(false);
    Mockito.when(transferService.postTransfer(Mockito.any())).thenReturn(requestAccountTransferOutputJson);

    mockMvc.perform(post("/transfers").contentType(MediaType.APPLICATION_JSON)
            .content(requestAccountTransferInputJson)
            .header("Api-version", "5.1")
            .header("idempotency-key", "requestAccountTransfer1")
            .requestAttr("httpServletRequest", HttpServletRequest.class)
            .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk());
  }

  /**
   * Test for POST /transfers api, RequestAccountTransfer's status must be 501
   */
  @Test
  void testRequestAccountTransferIf() throws Exception {
    mockMvc.perform(post("/transfers").contentType(MediaType.APPLICATION_JSON)
            .content(requestAccountTransferInputJson)
            .header("Api-version", "null")
            .header("idempotency-key", "requestAccountTransfer1")
            .requestAttr("httpServletRequest", HttpServletRequest.class)
            .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().is5xxServerError());
  }

  /**
   * Test for GET /transfers/{transferId} api, GetTransfer's status must be 200
   */
  @Test
  void testGetTransfer() throws Exception {
    String transferId = "transfer77";
    Mockito.when(transferService.getTransfer(Mockito.anyString())).thenReturn(getTransferJson);

    mockMvc.perform(get("/transfers/{transferId}", transferId).contentType(MediaType.APPLICATION_JSON)
            .header("Api-version", "5.1")
            .param("transferId", transferId)
            .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk());
  }

  /**
   * Test for GET /transfers/{transferId} api, GetTransfer's status must be 501
   */
  @Test
  void testGetTransferIf() throws Exception {
    String transferId = "transfer77";
    mockMvc.perform(get("/transfers/{transferId}", transferId).contentType(MediaType.APPLICATION_JSON)
            .header("Api-version", "null")
            .param("transferId", transferId)
            .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().is5xxServerError());
  }

  /**
   * Test for DELETE /transfers/{transferId} api, CancelTransfer's status
   * must be 200
   */
  @Test
  void testCancelTransfer() throws Exception {
    String transferId = "transfer77";
    Mockito.when(transferService.cancelTransfer(Mockito.anyString())).thenReturn(cancelTransferJson);

    mockMvc.perform(delete("/transfers/{transferId}", transferId).contentType(MediaType.APPLICATION_JSON)
            .header("Api-version", "5.1")
            .param("transferId", transferId)
            .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk());
  }

  /**
   * Test for DELETE /transfers/{transferId} api, CancelTransfer's status
   * must be 501
   */
  @Test
  void testCancelTransferIf() throws Exception {
    String transferId = "transfer77";
    mockMvc.perform(delete("/transfers/{transferId}", transferId).contentType(MediaType.APPLICATION_JSON)
            .header("Api-version", "null")
            .param("transferId", transferId)
            .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().is5xxServerError());
  }

  /**
   * Test for GET /transfers api, SearchForTransfers's status must be 200
   */
  @Test
  void testSearchForTransfers() throws Exception {
    Mockito.when(transferService.searchForTransfers(Mockito.anyString(),
        Mockito.any(), Mockito.any(), Mockito.anyList(), Mockito.anyList(),
        Mockito.anyList(), Mockito.anyList())).thenReturn(searchForTransfersJson);

    mockMvc.perform(get("/transfers").contentType(MediaType.APPLICATION_JSON)
            .header("Api-version", "5.1")
            .param("updatedSince", "transfer77")
            .param("searchStartTransferDate", "2023-01-10")
            .param("searchEndTransferDate", "2023-01-10")
            .param("searchFromAccountIds", "349")
            .param("searchToAccountIds", "350")
            .param("searchStatuses", "PROCESSED")
            .param("searchTransferIds", "transfer77")
            .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk());
  }

  /**
   * Test for GET /transfers api, SearchForTransfers's status must be 501
   */
  @Test
  void testSearchForTransfersIf() throws Exception {
    mockMvc.perform(get("/transfers").contentType(MediaType.APPLICATION_JSON)
            .header("Api-version", "null")
            .param("updatedSince", "transfer77")
            .param("searchStartTransferDate", "2023-01-10")
            .param("searchEndTransferDate", "2023-01-10")
            .param("searchFromAccountIds", "349")
            .param("searchToAccountIds", "350")
            .param("searchStatuses", "PROCESSED")
            .param("searchTransferIds", "transfer77")
            .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().is5xxServerError());
  }
}